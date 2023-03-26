import java.util.Scanner;
public class Task14v4 {
   private static final String NUM_REGEX = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
       num = num.replaceAll("\\D","");
       if(num.length()==11){
           num = num.substring(1);
           num = num.replaceAll(NUM_REGEX,"+7 ($1) $2 $3-$4");
           System.out.println(num);
       }else if ((num.length()==10)){
           num = num.replaceAll(NUM_REGEX,"+7 ($1) $2 $3-$4");
           System.out.println(num);
       }else{
           System.out.println("Формат не верный");
       }
    }
}
