package com.company;

public class StringBuild {
    public StringBuild() {
        //default constructor
    }

    public static String maskify(String str) {
        if (str.length() > 5) {
            StringBuilder strr = new StringBuilder();
            strr.append(str);
            for (int i = 0; i < str.length() - 4; i++) {
                strr.setCharAt(i, '#');
            }
            return strr.toString();
        }
        return str;
    }
}
