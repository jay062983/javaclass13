package Stringmethod;

public class stringreplace02 {
    public static void main(String[] args) {
        String str="jkASDASFDFDGjie;##joi@4345lf$%^%$^234235**SA()(;r";
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[a-z]"," @"));
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));
        System.out.println(str.replaceAll("[0-9]","#"));
        /* replaceAll String method specific characters will be replaced,
        ex: from A to Z  or A to D or numbers 0-9 can be replaced with symbols
        ^ this is not symbol*/
    }
}
