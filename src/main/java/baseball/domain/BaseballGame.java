package baseball.domain;

import baseball.constant.MyNumber;
import baseball.utils.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseballGame {
    private List<Integer> answer;

    public BaseballGame(){
        this.setAnswer();
    }

    private void setAnswer(){
        this.answer = RandomNumberGenerator.generate();
    }

    public String calculateScore(String input){
        Integer strike = 0, ball = 0;
        List <String> guessNumber = Arrays.asList(input.split(""));

        for(int i = 0; i < MyNumber.LENGTH; i++){
            if(guessNumber.get(i).equals(String.valueOf(this.answer.get(i)))){
                strike++;
            }
        }
        for(int i = 0; i < MyNumber.LENGTH; i++){
            for(int j = 0; j < MyNumber.LENGTH; j++)
            {;
                if(i != j && guessNumber.get(j).equals(String.valueOf(this.answer.get(i)))){
                    ball++;
                }
            }
        }

        String strikeScore = strike > 0 ? strike + "스트라이크" : "";
        String ballScore = ball > 0 ? ball + "볼" : "";
        String score = (strikeScore + ballScore).equals("") ? "낫싱" : strikeScore + ballScore;

        return score;
    }
}
