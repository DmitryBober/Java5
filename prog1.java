/*
Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class prog1{
    
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivan Egorov", 777, bookPhone);
        addNumber("Ivan Egorov", 113, bookPhone);
        addNumber("Dmitry Petrov", 8800, bookPhone);
        addNumber("Vasily Sidorov", 22222, bookPhone);
        addNumber("Ivan Ivanov", 911, bookPhone);
        addNumber("Dmitry Petrov", 5553535, bookPhone);
        printBook(bookPhone);
       }
}