package day30collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> names=new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        /*
           Retrieves, but does not remove, first element of this list.
            Returns: the first element of this list, or "null" if this list is empty

            hem gormek hem silmek istersek .pop() kullaniriz
         */
        String firstEl=names.peek();
        System.out.println(firstEl);//Chris
        System.out.println(names);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        LinkedList<String> myList=new LinkedList<>();
        String first=myList.peek();
        System.out.println(first);//bos listte null verdi. exception vermedi

        /*
             Retrieves and removes the head (first element) of this list.
             Returns: the head of this list, or null if this list is empty(list bosken hata versin istersen pop kullan)
         */
        String firstElement=names.poll();
        System.out.println(firstElement);//Chris
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]

        /*
            Retrieves, but does not remove, the head (first element) of this list.
            Throws: NoSuchElementException - if this list is empty (peek'ten farki)
         */
        String f=names.element();
        System.out.println(f);//Alexandre
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]

        //Example 1: "A" ile baslayan tum isimleri "*****" e ceviriniz.
        LinkedList<String> students=new LinkedList<>();
        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");

        System.out.println(students);
        for (String w :students){
            if (w.startsWith("A")){
                students.set(students.indexOf(w),"*****");
            }
        }
        System.out.println(students);

        //Example 2: List'deki 4 harften cok harf iceren isimleri siliniz

        for (int i=0; i<students.size(); i++){
            if (students.get(i).length()>4){
                students.remove(students.get(i));
                i--;
            }
        }
        System.out.println(students);
        //eleman sayisini azaltacagimiz icin i ye ihtiyacimiz var ,o yuzden for-each loop degil for loop kullaniyoruz.


    }
}
