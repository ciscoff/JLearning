/**
 * https://www.youtube.com/watch?v=PZa7LEY_7LM
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /**
         * Короче, System.in (инстанс класса InputStream) привязывается к консоли, выделенной системой данному приложению. Как только пользователь
         * нажимает ENTER, то система извещает наш System.in о наличии доступных данных. Теперь мы можем ПОБАЙТОВО получить от системы введенные данные
         * с помощью метода System.in.read(); Итак, данные ввел пользователь, они у системы, мы их ПОБАЙТОВО читаем у системы методом read().
         * 
         * Если обернуть System.in в InputStreamReader, то его метод read() будет считывать через System.in.read() необходимое количество байтов,
         * чтобы сформировать из них код ОДНОГО символа, а мы получаем возможность читать посимвольно.
         * 
         * И наконец обернув InputStreamReader в BufferedReader мы поручаем последнему прочитать сразу весь ввод (который завершается нажатим ENTER),
         * а потом выдавать нам либо порциями через read(), либо сразу строкой через readLine();
         * 
         */

       
        System.out.println("Working with System.in");        
        System.out.println("Type any characters and press [ENTER]:");

        int av = System.in.available();
        System.out.println("Available bytes in System.in buffer before typing: " + av);

        int ch = System.in.read();
        System.out.printf("Typed: 0x%04X -> \'%s\'\n", ch, (char)ch);                    

        av = System.in.available();
        System.out.println("\nBytes remain in System.in buffer: " + av);

        System.out.println("Here they are:");
        for(int i = 0; i < av; i++) {
            ch = System.in.read();
            if(ch == 0x0A | ch == 0x0D )
                System.out.printf("Typed: 0x%04X\n", ch);                                
            else 
                System.out.printf("Typed: 0x%04X -> \'%s\'\n", ch, (char)ch);                                
        }

        /**
         * BufferedReader получает
         */
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
    }



}

