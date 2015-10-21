package levelUp;

/**
 * Created by shtativ on 02.10.15.
 */
public class Contact {
    //состояние - поля класса
    public static final int CONST = 10; //неизменяемая переменная(константа)
    public static int count = 0;
    private String name;
    private String phone;
    private String email;

    //перегрузка метода

    //конструктор-метод, вызывающийся только при создании объекта
    //имя как у класса
    //Ничего не возвращает
    // 1) по количеству параметров
    // 2) по типу параметров

    public Contact() {
        count++;
    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
        count++;
    }

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        count++;
    }

    //метод с аргументами
    public void print() {
        System.out.println(string());
    }

    public String string() {
        String s = name + " " + phone + " " + email;
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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