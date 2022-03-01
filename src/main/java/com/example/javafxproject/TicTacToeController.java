package com.example.javafxproject;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.*;

public class TicTacToeController implements Initializable {

    @FXML private Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    @FXML private Text winnerText, whoWon, gameCount, humanWins, computerWins, draws, rules;

    ArrayList<Button> board;

    static int gameCounter = 0;
    static HashMap<Integer, String> scores = new HashMap<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        board = new ArrayList<>(Arrays.asList(button1, button2, button3, button4, button5, button6, button7, button8, button9));

        playerToStart();
    }

    Font font = new Font(16);

    @FXML void clickB11(MouseEvent event) { button1.setFont(font); button1.setOpacity(0.6);}
    @FXML void clickB12(MouseEvent event) { button2.setFont(font); button2.setOpacity(0.6);}
    @FXML void clickB13(MouseEvent event) { button3.setFont(font); button3.setOpacity(0.6);}
    @FXML void clickB21(MouseEvent event) { button4.setFont(font); button4.setOpacity(0.6);}
    @FXML void clickB22(MouseEvent event) { button5.setFont(font); button5.setOpacity(0.6);}
    @FXML void clickB23(MouseEvent event) { button6.setFont(font); button6.setOpacity(0.6);}
    @FXML void clickB31(MouseEvent event) { button7.setFont(font); button7.setOpacity(0.6);}
    @FXML void clickB32(MouseEvent event) { button8.setFont(font); button8.setOpacity(0.6);}
    @FXML void clickB33(MouseEvent event) { button9.setFont(font); button9.setOpacity(0.6);}

    String checkWinner() {

        int gameCounter = 0;

        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = button1.getText() + button5.getText() + button9.getText();
                    break;
                case 1:
                    line = button3.getText() + button5.getText() + button7.getText();
                    break;
                case 2:
                    line = button2.getText() + button5.getText() + button8.getText();
                    break;
                case 3:
                    line = button1.getText() + button4.getText() + button7.getText();
                    break;
                case 4:
                    line = button3.getText() + button6.getText() + button9.getText();
                    break;
                case 5:
                    line = button1.getText() + button2.getText() + button3.getText();
                    break;
                case 6:
                    line = button4.getText() + button5.getText() + button6.getText();
                    break;
                case 7:
                    line = button7.getText() + button8.getText() + button9.getText();
                    break;
            }

            if (line.equals("XXX")) {
                whoWon.setText("HUMAN HAS WON!");
                return "X";

            } else if (line.equals("OOO")) {
                whoWon.setText("COMPUTER HAS WON!");
                return "O";
            }
        }

        if (!button1.getText().isEmpty() && !button2.getText().isEmpty() && !button3.getText().isEmpty() &&
                !button4.getText().isEmpty() && !button5.getText().isEmpty() && !button6.getText().isEmpty() &&
                !button7.getText().isEmpty() && !button8.getText().isEmpty() && !button9.getText().isEmpty()) {

            whoWon.setText("DRAW");
            return "DRAW";
        }

        return null;
    }

    @FXML
    void playerToStart() {
        winnerText.setText("TIC TAC TOE");
        board.forEach(this::resetButton);

        gameCounter++;
        gameCount.setText(String.valueOf("Game no. " + gameCounter));

        score();


        Random random1 = new Random();

        if ((random1.nextInt(2) + 1) == 1) {

            board.forEach(this::resetButton);
            gameHumanBegins();

        } else {

            board.forEach(this::resetButton);
            gameComputerBegins();
        }
    }

    @FXML
    void gameHumanBegins() {

        board.get(0).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                button1.setText("X");
                button1.setDisable(true);
                if (checkWinner() == "X") {

                    scores.put(gameCounter, "HUMAN");
                    playerToStart();
                } else if (checkWinner() == ("DRAW")) {

                    scores.put(gameCounter, "DRAW");
                    playerToStart();
                } else {
                    gameComputerBegins();
                }
            }
        });

        board.get(1).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                button2.setText("X");
                button2.setDisable(true);
                if (checkWinner() == "X") {

                    scores.put(gameCounter, "HUMAN");
                    playerToStart();
                } else if (checkWinner() == ("DRAW")) {

                    scores.put(gameCounter, "DRAW");
                    playerToStart();
                } else {
                    gameComputerBegins();
                }
            }
        });
        board.get(2).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                button3.setText("X");
                button3.setDisable(true);
                if (checkWinner() == "X") {

                    scores.put(gameCounter, "HUMAN");
                    playerToStart();
                } else if (checkWinner() == ("DRAW")) {

                    scores.put(gameCounter, "DRAW");
                    playerToStart();
                } else {
                    gameComputerBegins();
                }
            }
        });
        board.get(3).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                button4.setText("X");
                button4.setDisable(true);
                if (checkWinner() == "X") {

                    scores.put(gameCounter, "HUMAN");
                    playerToStart();
                } else if (checkWinner() == ("DRAW")) {

                    scores.put(gameCounter, "DRAW");
                    playerToStart();
                } else {
                    gameComputerBegins();
                }
            }
        });
        board.get(4).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                button5.setText("X");
                button5.setDisable(true);
                if (checkWinner() == "X") {

                    scores.put(gameCounter, "HUMAN");
                    playerToStart();
                } else if (checkWinner() == ("DRAW")) {

                    scores.put(gameCounter, "DRAW");
                    playerToStart();
                } else {
                    gameComputerBegins();
                }
            }
        });
        board.get(5).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                button6.setText("X");
                button6.setDisable(true);
                if (checkWinner() == "X") {

                    scores.put(gameCounter, "HUMAN");
                    playerToStart();
                } else if (checkWinner() == ("DRAW")) {

                    scores.put(gameCounter, "DRAW");
                    playerToStart();
                } else {
                    gameComputerBegins();
                }
            }
        });
        board.get(6).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                button7.setText("X");
                button7.setDisable(true);
                if (checkWinner() == "X") {

                    scores.put(gameCounter, "HUMAN");
                    playerToStart();
                } else if (checkWinner() == ("DRAW")) {

                    scores.put(gameCounter, "DRAW");
                    playerToStart();
                } else {
                    gameComputerBegins();
                }
            }
        });
        board.get(7).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                button8.setText("X");
                button8.setDisable(true);
                if (checkWinner() == "X") {

                    scores.put(gameCounter, "HUMAN");
                    playerToStart();
                } else if (checkWinner() == ("DRAW")) {

                    scores.put(gameCounter, "DRAW");
                    playerToStart();
                } else {
                    gameComputerBegins();
                }
            }
        });
        board.get(8).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                button9.setText("X");
                button9.setDisable(true);
                if (checkWinner() == "X") {

                    scores.put(gameCounter, "HUMAN");
                    playerToStart();
                } else if (checkWinner() == ("DRAW")) {

                    scores.put(gameCounter, "DRAW");
                    playerToStart();
                } else {
                    gameComputerBegins();
                }
            }
        });
    }

    @FXML
    void gameComputerBegins() {

        Random random = new Random();

        boolean computerInputIsCorrect = false;

        while (!computerInputIsCorrect) {

            int los = random.nextInt(9);


            if (board.get(los).getText().equals("X") || board.get(los).getText().equals("O")) {

            } else {
                computerInputIsCorrect = true;

                board.get(los).setText("O");
                board.get(los).setFont(font);
                board.get(los).setOpacity(0.6);
                board.get(los).setDisable(true);

                if (checkWinner() == "O") {

                    scores.put(gameCounter, "COMPUTER");

                    playerToStart();
                } else if (checkWinner() == "DRAW") {

                    scores.put(gameCounter, "DRAW");

                    playerToStart();
                } else {

                    gameHumanBegins();
                }
            }

        }
    }

    @FXML
    void quit() {

        System.exit(0);
    }

    @FXML
    void restart() {

        scores.clear();

        gameCounter = 0;
        playerToStart();
    }

    @FXML
    void restartHuman() {

        scores.clear();
        gameCounter = 0;
        gameCount.setText("0");
        humanWins.setText("0");
        computerWins.setText("0");
        draws.setText("0");
        board.forEach(this::resetButton);
        gameHumanBegins();
    }

    @FXML
    void restartComputer() {

        scores.clear();
        gameCounter = 0;
        gameCount.setText("0");
        humanWins.setText("0");
        computerWins.setText("0");
        draws.setText("0");
        board.forEach(this::resetButton);
        gameComputerBegins();
    }

    @FXML
    long score() {

        long countHumanWins = scores.values().stream().filter(v -> v == "HUMAN").count();
        long countComputerWins = scores.values().stream().filter(v -> v == "COMPUTER").count();
        long countDraws = scores.values().stream().filter(v -> v == "DRAW").count();
        long countGames = countHumanWins + countComputerWins + countDraws;

        humanWins.setText(String.valueOf(countHumanWins));
        computerWins.setText(String.valueOf(countComputerWins));
        draws.setText(String.valueOf(countDraws));

        return countGames;
    }

    @FXML
    void restartGame(ActionEvent event) {
        board.forEach(this::resetButton);
        winnerText.setText("Tic-Tac-Toe");
    }

    @FXML
    public void resetButton(Button button) {

        button.setDisable(false);
        button.setText("");

    }

    @FXML
    public void showInstruction() {

                rules.setText("How to Play the Game :\n" +
                "•\tHuman player plays a X symbol and Computer plays a O symbol on a 3x3 cell grid. " +
                "The game starts with a random choice of a starting party to make the first move. " +
                "Human player points and clicks a chosen cell and the computer chooses subsequent cell automatically " +
                "Now, both O and X play subsequently until any one of the two wins. " +
                "Winning criteria: Whenever any of the two players has fully filled one row or one column or one diagonal with his symbol, he wins and the game ends. " +
                "If neither of the two players wins, the game is said to have ended in a draw. " +
                "The scores are counted unless the human player chooses to play reset the game and begin a new one. This time the human player may choose who starts the game.");
    }

    @FXML
    public void closeInstruction() {
        rules.setText("");
    }
}
