package levelUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by shtativ on 02.10.15.
 * PhoneBook
 */

public class PhoneBook {
    public static void main(String[] args){
        MyArrayList book = new MyArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //меню
            String menu0 = "======   Menu   ======";
            String menu1 = "1 - Add contact";
            String menu2 = "2 - Delete contact";
            String menu3 = "3 - Show all contacts";
            String menu4 = "4 - Find by name";
            String menu5 = "5 - Edit contact";
            String menu6 = "6 - Quit";
            String menu7 = "======================";

            // display the Menu
            System.out.println(menu0 + "\n" + menu1 + "\n" +
                    menu2 + "\n" + menu3 + "\n" + menu4 + "\n" +
                    menu5 + "\n" + menu6 + "\n" + menu7 + "\n");
            System.out.println("Введите номер соответствующего пункта меню: ");

            int input = scanner.nextInt();

            if (input == 1) {

                System.out.println("Введите имя нового контакта: ");
                String name = scanner.next();
                System.out.println("Введите номер телефона нового контакта: ");
                String phone = scanner.next();
                System.out.println("Введите e-mail нового контакта: ");
                String email = scanner.next();

                //добавление нового контакта
                Contact c = new Contact(name, phone, email);
                book.add(c);

            } else if (input == 2) {
                //Deleting contact
                //по имени определяете индекс контакта в book
            } else if (input == 3) {
                //Showing all
                for (int i = 0; i < book.size(); i++) {
                    book.get(i).print();
                }
            } else if (input == 4) {
                //Finding by name
            } else if (input == 5) {
                //Editing by name
            } else if (input == 6) {
                //Quit
                System.exit(0);
            } else {
               System.out.println("\nRetype!\n");
            }
        }
    }
}


//           } while ( keyPressed != "\u0020" );
//
//
//        System.out.println(contacts[0].name);
//        System.out.println(contacts[1].phone);
//             firstContact.print();
//
//        ArrayList<Contact> book = new ArrayList<Contact>();
//
//        book.add(firstContact);
//        book.add(secondContact);
//
//        //System.out.println(book.get(0).name);
//        //Contact c = book.get(0);
//        //System.out.println(c);
//        int size = book.size();  //size = 2;






/*
* 1 - Вывод МЕНЮ на экран
* 2 - Считать выбор пользователя
* 3 - Реализовать добавление, если выбран соответствующий пункт, (Введите имя, телефон, алала)
*     Введите имя ...
*     Contact c = new Contact();
*     c.init(...);
*     book.add(c);
*     вывод всех контактов на экран
* 4 - Если другая операция, то сообщение "Coming soon.."
* 5 - Вывод всех контактов
* 6 - Найти как выйти из меню
*/