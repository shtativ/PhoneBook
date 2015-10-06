package levelUp;

/**
 * Created by shtativ on 02.10.15.
 */
public class Contact {
    //состояние - поля класса
    String name;
    String phone;
    String email;

    //перегрузка метода

    public Contact(String name, String phone, int age){
        this.name = name;
        this.phone = phone;
    }
    //конструктор-метод, вызывающийся только при создании объекта
    //имя как у класса
    //Ничего не возвращает
    // 1) по количеству параметров
    // 2) по типу параметров
    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    //метод с аргументами
    public void print() {
        System.out.println(name + " " + phone + " " + email);
    }

    //    public void init(String name, String phone, String email) {
//        this.name = name;
//        this.phone = phone;
//        this.email = email;
//    }
    public String string() {
        String s = name + " " + phone + " " + email;
        return s;
    }
}


//newName и др. - другие параметры
//поведение - методы()
//   public void init(String newName, String newPhone, String newEmail){
//
//        name = newName;
//        phone = newPhone;
//        email = newEmail;
//    }