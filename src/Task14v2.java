/*Задание №2
        Что нужно сделать
        Реализовать статический метод, который принимает в качестве аргумента строку, содержащую английский текст (не менее 100 слов).
        Текст можно внести в сам код, или вводить в ручную(на твое усмотрение).
        Метод должен разделить текст на слова и вернуть строку, состоящую из полученных слов, каждое слово на отдельной строке.
        Знаки препинания и числа не являются словами.
    Рекомендации
        1. Очистить текст от лишних символов(., ).
        2. Вам могут пригодиться спецсимволы отступа на новую строчку(\n)*/
public class Task14v2 {

    public static void main(String[] args) {
        String text = new String("My name is Yunir, i am from Bashkortostan, i have been studying programming for 5 years, i have plans to get a job in an IT company. Now I work as a taxi driver");
       // String text2[] = clearing(text);
        //System.out.println(Arrays.toString(text2));
      //  for(int i = 0;i< text2.length;i++){
      //      System.out.println(text2[i]);
      //  }
        System.out.println(clearing(text));
    }
   public static String clearing(String text){
        return text =  text.replaceAll("[.?,!]", "").replaceAll("[ ]","\n");
         //return text.replaceAll(" ","\n");
       //String [] string = text.split("\\s+");
     // return String.join("\n", string);

       // return string;
       //String string1 = String.copyValueOf(string);
      // return text.replaceAll("[.?,!]", "").split("\\s+");
   }
}
