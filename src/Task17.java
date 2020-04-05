import java.io.*;

public class Task17 {
    public static void main(String[] args){
            String str;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Признак конца ввода данных в файл - строка 'стоп'");
            try (FileWriter fw = new FileWriter("src/test.txt")){
                do {
                    System.out.print("(введите 'стоп' для остановки записи в файл): ");
                    str = br.readLine();
                    if (str.compareTo("стоп")==0) {
                        break;
                    }
                    str +="\r\n";
                    fw.write(str);
                } while (str.compareTo("стоп") != 0);
            } catch (IOException ex) {
                System.out.println("Ошибка ввода-вывода: " + ex);
            }
    }
}
