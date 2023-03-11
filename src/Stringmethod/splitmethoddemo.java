package Stringmethod;

public class splitmethoddemo {
    public static void main(String[] args) {
        String str="I am at home.I have a Java class tonight.This class is for 3 hours";
        String[]strArr=str.split("[.]"); // splits where . or ? or !
        System.out.println(strArr.length);
        System.out.println(strArr[2]);
        // wherever we are working with arrays we use the length and whenever we are working with strings
        //we use the length()
    }
}
