package davlatbek.soft.calculator.models.numbers;

import java.util.ArrayList;

public class RomanNumbers<String> extends ArrayList<java.lang.String> {
    public RomanNumbers() {
            for (int i = 0; i < 10; i++) {
                StringBuffer addingX = new StringBuffer("");

                if (i == 0) addingX.append("");
                if (i == 1) addingX.append("X");
                if (i == 2) addingX.append("XX");
                if (i == 3) addingX.append("XXX");
                if (i == 4) addingX.append("XL");
                if (i == 5) addingX.append("L");
                if (i == 6) addingX.append("LX");
                if (i == 7) addingX.append("LXX");
                if (i == 8) addingX.append("LXXX");
                if (i == 9) addingX.append("XC");

                for (int j = 0; j < 10; j++) {
                    StringBuffer addingI = new StringBuffer("");
                    if (j == 0) addingI.append("");
                    if (j == 1) addingI.append("I");
                    if (j == 2) addingI.append("II");
                    if (j == 3) addingI.append("III");
                    if (j == 4) addingI.append("IV");
                    if (j == 5) addingI.append("V");
                    if (j == 6) addingI.append("VI");
                    if (j == 7) addingI.append("VII");
                    if (j == 8) addingI.append("VIII");
                    if (j == 9) addingI.append("IX");
                    this.add(addingX.toString() + addingI.toString());
                }
            }
        this.add("D");
    }

    @Override
    public java.lang.String toString() {
        java.lang.String result = "";
        for (java.lang.String output : this) {
            result += output + ", ";
        }
        return result;
    }
}
