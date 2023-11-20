package baseball.domain;

import baseball.utils.RandomNumberGenerator;

import java.util.List;

public class BaseballGame {
    private List<Integer> answer;
    public BaseballGame(){
        this.setAnswer();
    }

    private void setAnswer(){
        this.answer = RandomNumberGenerator.generate();
        System.out.println(this.answer);
    }
}
