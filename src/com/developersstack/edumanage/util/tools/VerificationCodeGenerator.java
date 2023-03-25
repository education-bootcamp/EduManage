package com.developersstack.edumanage.util.tools;

import java.util.Random;

public class VerificationCodeGenerator {
    private final String NUMBERS = "0123456789";
    public int getCode(int length){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char selectedNumber = NUMBERS.charAt(new Random().nextInt(10));
            if (i==0 && (48==(int)selectedNumber)){
                selectedNumber= NUMBERS.charAt(new Random().nextInt(10-1+1)+1);
            }
            sb.append(selectedNumber); // 0-9
        }
        return Integer.parseInt(sb.toString());
    }
}
