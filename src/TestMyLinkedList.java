public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> stringList = new MyLinkedList<>();
        stringList.add("Hello");
        stringList.add("Goodbye");
        stringList.add("Hey Girl");

//        System.out.println(stringList.indexOf("Ok"));
//        System.out.println(stringList.indexOf("Hello"));
//        System.out.println(stringList.indexOf("Hey Girl"));

//        stringList.addFirt("No");
//        stringList.addFirt("Yes");
//
//        stringList.addLast("Boss");
//        stringList.addLast("Hugo");

        stringList.add(2,"Alo");
        stringList.remove("Alo");

        System.out.println(stringList.get(2));

//        MyLinkedList<String> newStringList;
//        newStringList = stringList.clone();
//
//        stringList.addFirt("Ok");
//        stringList.add(2,"No");
//        stringList.remove(2);
//
//        System.out.println(newStringList.head.getData());
//        System.out.println(newStringList.head.next.getData());
//        System.out.println(newStringList.head.next.next.getData());
//        System.out.println(newStringList.tail.getData());
//        System.out.println(newStringList.tail.previous.getData());

//        stringList.clear();
//        System.out.println(stringList.head.getData());
    }
}
