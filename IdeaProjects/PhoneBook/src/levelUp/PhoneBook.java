package levelUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by shtativ on 02.10.15.
 *PhoneBook
 */

public class PhoneBook {
    public static void main(String[] args) throws IOException {

        //меню
        String menu0 = "======   Menu   ======";
        String menu1 = "1 - Add contact";
        String menu2 = "2 - Delete contact";
        String menu3 = "3 - Show all contacts";
        String menu4 = "4 - Find by name";
        String menu5 = "5 - Edit contact";
        String menu6 = "6 - Quit";
        String menu7 = "======================";

        Contact firstContact = new Contact();
        Contact secondContact = new Contact();

        Contact[] contacts = new Contact[10];
        contacts[0] = firstContact;
        contacts[1] = secondContact;

        firstContact.init("Steve", "123456", "vasya@email.com");
        secondContact.init("Maria", "1234567", "maria@email.com");


        // display the Menu
        System.out.println(menu0 + "\n" + menu1 + "\n" + menu2 + "\n" + menu3 + "\n" + menu4 + "\n" + menu5 + "\n" + menu6 + "\n" + menu7 + "\n");
        System.out.println("Введите номер соответствующего пункта меню: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        do {
            if (input == 1) {
                //add contact
                int countContacts = 0;
                Contact contact_1 = new Contact();

                System.out.println(menu1);
                System.out.println("Введите имя нового контакта: ");
                BufferedReader addNameContact = new BufferedReader(new InputStreamReader(System.in));
                String nameContact = reader.readLine();
                contact_1.name = nameContact;
                System.out.println("Введите номер телефона нового контакта: ");
                BufferedReader addPhoneContact = new BufferedReader(new InputStreamReader(System.in));
                String phoneContact = reader.readLine();
                contact_1.phone = phoneContact;
                System.out.println("Введите e-mail нового контакта: ");
                BufferedReader addEmailContact = new BufferedReader(new InputStreamReader(System.in));
                String emailContact = reader.readLine();
                contact_1.email = emailContact;
                //реализоваться добавление нового контакта
                contact_1.init(contact_1.name, contact_1.phone, contact_1.email);

                countContacts++;
                contact_1.print();

            } else{
                    if (input == 2) {
                        //delete contact
                        System.out.println(menu2);

                    } else {
                        if (input == 3) {
                            //show all contact
                            System.out.println(menu3);
                        } else {
                            if (input == 4) {
                                // find by name
                                System.out.println(menu4);
                            } else {
                                if (input == 5) {
                                    //edit contact
                                    System.out.println(menu5);
                                } else {
                                    if (input == 6) {
                                        //quit
                                        System.out.println(menu6);
                                    } else {
                                        System.out.println("\nRetype!\n");
                                        System.out.println(menu0 + "\n" + menu1 + "\n" + menu2 + "\n" + menu3 + "\n" + menu4 + "\n" + menu5 + "\n" + menu6 + "\n" + menu7 + "\n");
                                    }
                                }
                            }
                        }
                    }

                }
            } while(false);


//

//        System.out.println(contacts[0].name);
//        System.out.println(contacts[1].phone);
       // firstContact.print();

//        ArrayList<Contact> book = new ArrayList<Contact>();
//
//        book.add(firstContact);
//        book.add(secondContact);
//
//        //System.out.println(book.get(0).name);
//        //Contact c = book.get(0);
//        //System.out.println(c);
//        int size = book.size();  //size = 2;


    }
}

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
