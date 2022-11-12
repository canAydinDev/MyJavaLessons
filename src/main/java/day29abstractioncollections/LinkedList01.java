package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {
    //Araylist'ler index kullanir ama index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybettirir.
    //cunku bir cok elemanin re-index edilmesi gerekir.
    //Java bu problemi cozmek icin yeni bir yapi olsuturmus.
    //Bu yeni yapiya "Linkedlist" demis

    /*
       LinkedList eleman ekleme ve eleman silmede cok basarilidir.
       Bu yuzden eleman ekleme ve eleman silme islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.

       Linkedlist'de Node(Data-Pointer) var. Tail(Data-Null) var. Head(pointer) var.

       ArrayList eleman bulma islemlerinde cik basarilidir(Search).
       LinkedList ise eleman bulma(Search) islemlerinde basarisizdir.
     */

    /*
       1)LinkedList'deki her eleman iki bolumden olusur. 1)sdata ii)pointer
       2)LinkedList'deki her bir eleman "Node"olarak adlandirilir.
       3)LinkedList'ler eleman ekleme ve eleman silme islemlerinde cok basarilidirlar.
       4)LinkedListler eleman arama islemlerinde basarisizdirlar.
       5) 3. ve 4. maddelerden dolayi eleman ekleme silme islemlerinin cok yapilacagi durumlarda LinkedList kullanilmalidir
       6)ArrayListler index kullanir,LinkedList'ler kullanmaz.
       7)index kullanmak eleman bulma islemlerinde cok basarilidir. Bu yuzden eleman bulma islemleri yapacaksaniz ArrayList kullanmalisiniz
     */

    public static void main(String[] args) {

        LinkedList <String> visiters=new LinkedList<>();
        visiters.add("Tom");
        visiters.add("Hanks");
        visiters.add("Tom Hanks");
        visiters.add("Brad");
        visiters.add("Pitt");
        visiters.add("Brad Pitt");
        visiters.add(2, "Angelina Julie");
        visiters.add("Brad Pitt");
        visiters.add("Tom Hanks");

        System.out.println(visiters);
        visiters.addFirst("cumeyt arkinm");
        visiters.addLast("ajda pekkan");

        visiters.removeLast();//sonuncuyu siler
        visiters.removeFirst();//ilkini siler
        visiters.removeFirstOccurrence("Tom Hanks");//ilk gorunumunu siler
        visiters.removeLastOccurrence("Brad Pitt");//son gorunumu siler

        visiters.get(3);//index kullanmaz ama java arkada anlar senin hangisine dedigini



        /*
            Pops an element from the stack represented by this deque. In other words, removes and returns the first element of this deque.
            This method is equivalent to removeFirst().
            Returns:
            the element at the front of this deque (which is the top of the stack represented by this deque)
            Throws:
            NoSuchElementException – if this deque is empty
         */
        String firstEl=visiters.pop();//ilk elemani verir ve siler ---Cut+Paste==>Ctrl+x
        System.out.println(firstEl);// ilk elemani verir
        System.out.println(visiters);//ilk elemani silerek yazar

        //bos listte pop exception verir
        LinkedList<String> myList=new LinkedList<>();
        myList.pop();//NoSuchElementException atti cunku LinkedList bos


    }
}
