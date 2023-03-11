package Stringmethod;

public class homeworktask {
    public static void main(String[] args) {
/* 3) Write a program that reads two people's first
    names and if they expecting boy or girl?Based on the input suggests a name for a baby:
Example Output: Mom’s first name? Mary Dad’s first name? Daniel
Boy or Girl? boy Suggested baby name: DANRY
Example Output:
Mom’s first name? Mary, Dad’s first name? DanielBoy or Girl? girlSuggested baby name: MAIEL

     */

   String dadsname="Daniel";
   String momsname="Mary";
   String expectation="Boy";
        String firsthalf="";
        String secondhalf="";
   if(expectation.equalsIgnoreCase("boy")){
        firsthalf=dadsname.substring(0,dadsname.length()/2);
       secondhalf=momsname.substring(momsname.length()/2);
   }else {
       firsthalf=momsname.substring(0,momsname.length()/2);
       secondhalf=dadsname.substring(dadsname.length()/2);

    }
           System.out.println(firsthalf+secondhalf);

}
}



