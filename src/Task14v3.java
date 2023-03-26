import java.sql.SQLOutput;
import java.util.Scanner;

public class Task14v3 {
    private static final String FIO_REGEX = "(([А-я]+\\-[А-я]+|[А-я]+)\\s){2}([А-я]+\\-[А-я]+|[А-я]+)";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

         if(input.matches(FIO_REGEX)){
             String[] words = input.split(" ");
             System.out.printf("Фамилия " + words[0] + "\n" + "Имя "+words[1] + "\n"+"Отчество "+words[2]);
        }else{
             System.out.println("Введенная строка не является ФИО");
         }
    }
}
