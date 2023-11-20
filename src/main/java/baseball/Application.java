package baseball;

import baseball.controller.BaseballGameController;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        BaseballGameController baseballGame = new BaseballGameController();
        baseballGame.start();
    }
}
