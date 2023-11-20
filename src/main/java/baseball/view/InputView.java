package baseball.view;

import baseball.constant.Input;
import baseball.constant.Output;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String inputNumber(){
        System.out.print(Input.NUMBER_MESSAGE);
        return Console.readLine();
    }

    public static String inputRetryNumber(){
        System.out.print(Input.RETRY_MESSAGE);
        return Console.readLine();
    }
}
