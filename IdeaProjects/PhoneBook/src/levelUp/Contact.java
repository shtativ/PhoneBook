package levelUp;

/**
 * Created by shtativ on 02.10.15.
 */
public class Contact {
    //состояние - поля класса
    String name;
    String phone;
    String email;

    //метод с аргументами
    public void print(){
        System.out.println(name + " " + phone + " " + email);
    }
    //newName и др. - другие параметры
    //поведение - методы()
//   public void init(String newName, String newPhone, String newEmail){
//
//        name = newName;
//        phone = newPhone;
//        email = newEmail;
//    }
    public void init(String name, String phone, String email){

        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // поведение
}
