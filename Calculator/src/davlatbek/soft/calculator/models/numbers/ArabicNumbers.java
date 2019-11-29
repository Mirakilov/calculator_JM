package davlatbek.soft.calculator.models.numbers;

import java.util.*;

public class ArabicNumbers<String> extends ArrayList<java.lang.String>{

        public ArabicNumbers() {
            for (int i = 0; i < 101; i++){
                this.add(java.lang.String.valueOf(i));
            }
        }
    @Override
    public java.lang.String toString() {
        java.lang.String result = "";
        for(java.lang.String output : this){
            result += output + ", ";
        }
        return result;
    }
}
