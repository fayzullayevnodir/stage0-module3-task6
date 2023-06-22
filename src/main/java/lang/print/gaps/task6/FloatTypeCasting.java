package lang.print.gaps.task6;

import java.sql.SQLOutput;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        if (numberToBeRounded%10>=9.5){
            System.out.println((int)numberToBeRounded+1);
        }else{

        System.out.println((int)numberToBeRounded);}
    }
}
