package levelUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by shtativ on 02.10.15.
 * PhoneBook
 */

public class PhoneBook {
    public static void main(String[] args) throws IOException {

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
            System.out.println(menu0 + "\n" + menu1 + "\n" + menu2 + "\n" + menu3 + "\n" + menu4 + "\n" +
                    menu5 + "\n" + menu6 + "\n" + menu7 + "\n");
            System.out.println("Введите номер соответствующего пункта меню: ");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(reader.readLine());

            MyArrayList book = new MyArrayList();

            if (input == 1) {



                System.out.println(menu1);
                System.out.println("Введите имя нового контакта: ");
                BufferedReader addNameContact = new BufferedReader(new InputStreamReader(System.in));
                String name = reader.readLine();
                System.out.println("Введите номер телефона нового контакта: ");
                BufferedReader addPhoneContact = new BufferedReader(new InputStreamReader(System.in));
                String phone = reader.readLine();
                System.out.println("Введите e-mail нового контакта: ");
                BufferedReader addEmailContact = new BufferedReader(new InputStreamReader(System.in));
                String email = reader.readLine();

              //реализоваться добавление нового контакта
                Contact contact_1 = new Contact(name, phone, email);
                book.add(contact_1);

            } else {
                if (input == 2) {
                } else {
                    if (input == 3) {
                        //         book.print();

                        //System.out.println(book);
                        for (int i = 0; i < book.size(); i++) {
                            System.out.println(book.get[i].print());
                        }
                    } else {
                        if (input == 4) {
                        } else {
                            if (input == 5) {
                            } else {
                                if (input == 6) {
                                    System.exit(0);
                                } else {
                                    System.out.println("\nRetype!\n");
                                    System.out.println(menu0 + "\n" + menu1 + "\n" + menu2 + "\n" + menu3 +
                                            "\n" + menu4 + "\n" + menu5 + "\n" + menu6 + "\n" + menu7 + "\n");
                                }
                            }
                        }
                    }
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
* */
/*
 */
}