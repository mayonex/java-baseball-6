package baseball.controller;

import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGameController {
    public void start(){
        this.showStartMessage();
    }

    private void showStartMessage(){
        OutputView.printStartMessage();
    }
}
