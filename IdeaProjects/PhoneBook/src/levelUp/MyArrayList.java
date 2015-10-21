package levelUp;

/**
 * Created by shtativ on 06.10.15.
 */
public class MyArrayList {
    Contact[] object;
    int size = 0;

    // добавление в конец
    public void add(Contact c) {
        // Создание массива размером size + 1
        Contact[] temp = new Contact[size + 1];
        // копирование из старого массива в новый
        for (int i = 0; i < size; i++) {
            temp[i] = object[i];
        }
        // добавление контакта в новый массив в конец
        temp[size] = c;
        // object = новый массив
        object = temp;
        size++; //
    }

    //Метод size()  - получение размера
    public int size() {
        return size;
    }

    //Метод get(i)  - получение элемента по индексу
    public Contact get(int index) {
        return object[index];
    }

    //Удаление по индексу remove(i)
    public void remove(int index) {
        // Создание масиива размером size-1
        Contact[] temp = new Contact[size - 1];
        //копирование всех эл-ов из старого в новый массив, кроме i-го
        // 1 2 3 4 5
        // 1 2 3 4
        for (int i = 0; i < index; i++) {
            temp[i] = object[i];
        }
        for (int i = index + 1; i < size; i++) {
            temp[i - 1] = object[i];
        }
        object = temp;
        size--;

      //  public void clear
    }
}
//===================================================


/*
1) ЧЕМ ОТЛИЧАЕТСЯ size++ от ++size
MyArrayList:
2) Добавить метод  clear()
3) Удалить по индексу в один цикл
4) Вставка по индексу insert(index, c);
5) Обработать ошибки во всех методах коллекции
System.err.println("Error!");

PhoneBook:
1) Удаление по имени (по имени опаределить индекс контакта в book, затем вызвать remove с этим индексом)
2) Ошибка при неверном вводе int input
3) Поиск контакта по имени и вывод его на экран
 Теория
 1) //-//-//-//-//
 2) Сокращенные орифметичейские операции += *= /=  -=
 3) Тернарные операторы
 if( a < b ){
    c = 0
    }else
    c = 1;

    a > b : c = 0 ? c = 1;
*/