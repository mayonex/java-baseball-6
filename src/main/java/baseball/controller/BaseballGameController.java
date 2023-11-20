package baseball.controller;

import baseball.domain.BaseballGame;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGameController {

    private BaseballGame baseballGame;
    public void start(){
        this.showStartMessage();
    }

    private void showStartMessage(){
        OutputView.printStartMessage();
        this.baseballGame = new BaseballGame();
        this.readUserGuessNumber();
    }

    private void readUserGuessNumber(){
        System.out.println(this.baseballGame.calculateScore(InputView.inputNumber()));
    }

}
