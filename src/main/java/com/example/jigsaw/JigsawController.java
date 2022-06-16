package com.example.jigsaw;

import com.example.jigsaw.figures.Figure;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.*;
import java.io.BufferedInputStream;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * The Jigsaw controller: here's all the logic.
 */
public class JigsawController {
    /**
     * The whole game.
     */
    public AnchorPane game;
    /**
     * The field.
     */
    static Field field;
    /**
     * The constant x-position of field.
     */
    final static int FIELD_X = 540;
    /**
     * The constant y-position of field.
     */
    final static int FIELD_Y = 160;
    /**
     * The constant FIGURES_NUMBER which shows number of figures we can choose.
     */
    public final static int FIGURES_NUMBER = 3;
    /**
     * The restart button.
     */
    public Button NewGame;
    /**
     * The exit button.
     */
    public Button Exit;
    /**
     * The Kris character.
     */
    public ImageView Kris;
    /**
     * The Susie character.
     */
    public ImageView Susie;
    /**
     * The Ralsei character.
     */
    public ImageView Ralsei;
    /**
     * The Jevil character.
     */
    public ImageView Jevil;
    /**
     * The current time.
     */
    LocalTime currentTime;
    /**
     * The timeline.
     */
    Timeline timeline;
    /**
     * The time info text box.
     */
    Text timeInfo;
    /**
     * The number of moves.
     */
    static int numberOfMoves;
    /**
     * The Figures.
     */
    Figure[] figures;
    /**
     * The Figure choices.
     */
    FigureChoice[] figureChoices;
    /**
     * The Colors.
     */
    Color[] colors = {
            Color.CYAN,
            Color.HOTPINK,
            Color.GREEN,
    };
    /**
     * The characters' names.
     */
    public final static String[] CHARACTERS_NAMES = {
            "kris",
            "susie",
            "ralsei",
    };
    /**
     * The Phrases.
     */
    public final static String[] PHRASES = {
            "anything.wav",
            "chaoschaos.wav",
    };
    /**
     * The Has.
     */
    public final static String[] HAS = {
            "ha0.wav",
            "ha1.wav",
    };
    /**
     * The Laughs.
     */
    public final static String[] LAUGHS = {
            "laugh0.wav",
            "laugh1.wav",
    };
    /**
     * The Attacks.
     */
    public final static String[] ATTACKS = {
            "bump.wav",
            "bomb.wav",
    };

    /**
     * Initialize.
     */
    public void initialize() {
        timeInfo = new Text();
        createTimer();
        timeline.play();
        playSound("theWorldRevolving.wav", 0.5f, true);
        numberOfMoves = 0;
        field = new Field(FIELD_X, FIELD_Y);
        for (int i = 0; i < Field.MATRIX_SIDE; ++i) {
            for (int j = 0; j < Field.MATRIX_SIDE; ++j) {
                game.getChildren().add(field.matrix[i][j].rect);
            }
        }

        figures = new Figure[FIGURES_NUMBER];
        figureChoices = new FigureChoice[FIGURES_NUMBER];
        for (int i = 0; i < FIGURES_NUMBER; ++i) {
            figures[i] = (new Figure(colors[i])).getRandomFigure();
            int x = 320;
            int y = 100 + 240 * i;
            figureChoices[i] = new FigureChoice(x, y, figures[i]);
            game.getChildren().add(figureChoices[i]);
        }
        game.getChildren().add(timeInfo);
        setMouseOptions();
    }

    private void createTimer() {
        timeInfo.setX(560.0);
        timeInfo.setY(64.0);
        timeInfo.setFill(Paint.valueOf("#fff600"));
        timeInfo.setStyle("-fx-font: 40 arial;");
        currentTime = LocalTime.parse("00:00:00");
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), act -> {
            incrementTime();
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
    }

    private void incrementTime() {
        currentTime = currentTime.plusSeconds(1);
        timeInfo.setText("Time elapsed: %s".formatted(
                currentTime.format(
                        DateTimeFormatter.ofPattern("HH:mm:ss")
                )
        ));
    }

    /**
     * Change behaviour.
     *
     * @param i         the
     * @param behaviour the behaviour
     */
    void changeBehaviour(int i, String behaviour) {
        if (i == 0) {
            Kris.setImage(
                    new Image(
                            Objects.requireNonNull(
                                    getClass().getResourceAsStream("images/" + CHARACTERS_NAMES[i] + behaviour)
                            )
                    )
            );
        } else if (i == 1) {
            Susie.setImage(
                    new Image(
                            Objects.requireNonNull(
                                    getClass().getResourceAsStream("images/" + CHARACTERS_NAMES[i] + behaviour)
                            )
                    )
            );
        } else if (i == 2) {
            Ralsei.setImage(
                    new Image(
                            Objects.requireNonNull(
                                    getClass().getResourceAsStream("images/" + CHARACTERS_NAMES[i] + behaviour)
                            )
                    )
            );
        } else {
            Jevil.setImage(
                    new Image(
                            Objects.requireNonNull(
                                    getClass().getResourceAsStream("images/jevil" + behaviour)
                            )
                    )
            );
        }
    }


    /**
     * Sets mouse options.
     */
    void setMouseOptions() {
        for (int i = 0; i < FIGURES_NUMBER; ++i) {
            int finalI = i;
            figureChoices[i].setOnMousePressed(mouseEvent -> {
                changeBehaviour(finalI, "Attack.gif");
            });
            figureChoices[i].setOnMouseDragged(mouseEvent -> {
                figureChoices[finalI].setLayoutX(mouseEvent.getX() + figureChoices[finalI].getLayoutX());
                figureChoices[finalI].setLayoutY(mouseEvent.getY() + figureChoices[finalI].getLayoutY());
            });
            figureChoices[finalI].setOnMouseReleased(mouseEvent -> {
                changeBehaviour(finalI, "Stand.gif");
                Random gen = new Random();
                if (JigsawController.isPossibleToPlace(figureChoices[finalI])) {
                    changeBehaviour(3, "Laugh.png");
                    figureChoices[finalI].figure = figureChoices[finalI].figure.getRandomFigure();
                    figureChoices[finalI].getChildren().clear();
                    figureChoices[finalI].rects.clear();
                    figureChoices[finalI].initializeShape();
                    JigsawController.playSound(
                            JigsawController.ATTACKS[gen.nextInt(JigsawController.ATTACKS.length)
                                    % JigsawController.ATTACKS.length],
                            0.8f,
                            false
                    );
                    JigsawController.playSound(
                            JigsawController.HAS[gen.nextInt(JigsawController.HAS.length)
                                    % JigsawController.HAS.length],
                            0.8f,
                            false
                    );
                } else {
                    final String[] speak;
                    if (gen.nextInt(1000) % 2 == 0) {
                        speak = JigsawController.LAUGHS;
                    } else {
                        speak = JigsawController.PHRASES;
                    }
                    JigsawController.playSound(
                            speak[gen.nextInt(speak.length)
                                    % speak.length],
                            0.8f,
                            false
                    );
                }
                figureChoices[finalI].setLayoutX(figureChoices[finalI].x);
                figureChoices[finalI].setLayoutY(figureChoices[finalI].y);
                changeBehaviour(3, "Spin.gif");
            });
        }
    }

    /**
     * Play sound.
     *
     * @param path   the path
     * @param volume the volume
     * @param loop   the loop
     */
    public static synchronized void playSound(final String path, float volume, boolean loop) {
        new Thread(() -> {
            try {
                Clip clip = AudioSystem.getClip();
                AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                        new BufferedInputStream(
                                Objects.requireNonNull(JigsawController.class.getResourceAsStream(
                                                "sounds/" + path
                                        )
                                )
                        )
                );
                clip.open(inputStream);
                FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                float range = gainControl.getMaximum() - gainControl.getMinimum();
                float gain = (range * volume) + gainControl.getMinimum();
                gainControl.setValue(gain);
                if (loop) {
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                }
                clip.start();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }).start();
    }

    /**
     * Is possible to place boolean.
     *
     * @param figureChoice the figure choice
     * @return the boolean
     */
    public static boolean isPossibleToPlace(FigureChoice figureChoice) {
        ArrayList<Integer> listAxisX = new ArrayList<Integer>();
        ArrayList<Integer> listAxisY = new ArrayList<Integer>();
        for (Rectangle rect : figureChoice.getRects()) {
            double columns = (figureChoice.getLayoutX() - field.x + rect.getX() - 1) / (Cell.SIDE + 1);
            double rows = (figureChoice.getLayoutY() - field.y + rect.getY() - 1) / (Cell.SIDE + 1);
            System.out.println("--------------");
            System.out.println(columns);
            System.out.println(rows);
            System.out.println("--------------");
            int nearX = (int) Math.round(columns);
            int nearY = (int) Math.round(rows);

            listAxisX.add(nearX + (((nearX >= 0) && (nearX + 0.4 <= columns)) ? 1 : 0));
            listAxisY.add(nearY + (((nearY >= 0) && (nearY + 0.4 <= rows)) ? 1 : 0));
        }
        int i = -1;
        while (++i < listAxisX.size()) {
            System.out.println(listAxisX.get(i));
            System.out.println(listAxisY.get(i));

            if ((listAxisX.get(i) < 0)
                    || (listAxisX.get(i) >= Field.MATRIX_SIDE)
                    || (listAxisY.get(i) < 0)
                    || (listAxisY.get(i) >= Field.MATRIX_SIDE)) {
                System.out.println("OK");
                return false;
            }

            if (field.getMatrix()[listAxisX.get(i)][listAxisY.get(i)].getBackground() != Color.TRANSPARENT) {
                return false;
            }
        }
        for (int j = 0; j < listAxisX.size(); ++j) {
            field.getMatrix()[listAxisX.get(j)][listAxisY.get(j)]
                    .setBackground((Color) figureChoice.getRects().get(0).getFill());
        }
        ++numberOfMoves;
        return true;
    }

    /**
     * New game.
     */
    public void newGame() {
        numberOfMoves = 0;
        createTimer();

        for (int i = 0; i < Field.MATRIX_SIDE; ++i) {
            for (int j = 0; j < Field.MATRIX_SIDE; ++j) {
                field.getMatrix()[i][j].setBackground(Color.TRANSPARENT);
            }
        }

        for (int i = 0; i < FIGURES_NUMBER; ++i) {
            figureChoices[i].updateFigure();
        }
    }

    /**
     * Exit.
     *
     * @param actionEvent the action event
     */
    public void exit(ActionEvent actionEvent) {
        playSound("byebye.wav", 0.8f, false);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("ByeBye!");
        alert.setHeaderText(timeInfo.getText());
        alert.setContentText("Number of moves: " + numberOfMoves);
        alert.showAndWait();

        ((Stage) ((Node) actionEvent.getSource())
                .getScene()
                .getWindow())
                .close();
    }
}
