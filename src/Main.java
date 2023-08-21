import java.util.*;

public class Main {
    public static void main(String[] args)  throws  InterruptedException {

        // Iterable -> collection -> List -> AbstractList ->ArrayList
//        ArrayList <Integer> listOfAges = new ArrayList<>();
//        listOfAges.add(12);
//        listOfAges.add(112);
//        listOfAges.add(1112);
//        listOfAges.add(11112);
//        listOfAges.add(1,222);
//        System.out.println("Before Sort");
//        for (Integer listOfAge : listOfAges) {
//            System.out.println(listOfAge);
//        }
////        listOfAges.clear();
//        System.out.println("After Sort");
//        Collections.sort(listOfAges);
//        for (Integer listOfAge : listOfAges) {
//            System.out.println(listOfAge);
//        }

        //Traversing from last to first
//        ListIterator<Integer> li = listOfAges.listIterator(listOfAges.size());
//        while (li.hasPrevious())
//        {
//            System.out.println(li.previous());
//        }


//        listOfAges.forEach(System.out::println);


//        Student s1 = new Student("Raj1",23);
//        Student s2 = new Student("Raj2",33);
//        Student s3 = new Student("Raj3",43);
//
//        ArrayList<Student> studentsList = new ArrayList<>();
//        studentsList.add(s1);
//        studentsList.add(s2);
//        studentsList.add(s3);
//        studentsList.forEach(student-> System.out.println(student.name));
//
//        studentsList.removeIf(stud->stud.name.contains("1"));
//
//        studentsList.forEach(student-> System.out.println(student.name));





        //LinkedList
//        Iterable -> Collection -> (List -> AbstractSequentialList ) & (Queue -> Deque) -> LinkedList

//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.add(12);
//        ll.add(13);
//        ll.add(14);
//        ll.add(15);
//        ll.forEach(System.out::println);


//        RunnableInterface t1 = new RunnableInterface();
//        Thread t = new Thread(t1,"My thread");
//        t.start();
//
//        String threadName = t.getName();
//        System.out.println(threadName);

//            ThreadClass t1 = new ThreadClass();
//            t1.start();
////            t1.join();
//        try{
//            for(int i=0;i<5;i++){
//                t1.join();
//                System.out.println("Main Thread" + i);
//                Thread.sleep(2000);
//            }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }


//        Medical m = new Medical("Medical Thread");
//        TestDrive t = new TestDrive();
//        OfficerSign o = new OfficerSign();
//        t.setPriority(10);
//        m.start();
////        m.setPriority(10);
////        System.out.println(m.getName());
////        System.out.println(m.getPriority());
//
//        m.join();
//
//        t.start();
//
//        t.join();
//
//        o.start();


//        WithoutSynchronization w1 = new WithoutSynchronization();
//        Thread1 t1 = new Thread1(w1);
//        Thread2 t2 = new Thread2(w1);
//
//        t1.start();
//        t2.start();


//        SyncBlock s1 = new SyncBlock();
//        Thread1 t1 = new Thread1(s1);
//        Thread2 t2 = new Thread2(s1);
//
//        t1.start();
//        t2.start();
//
//
//        SyncBlock s2 = new SyncBlock();
//        Thread1 t3 = new Thread1(s2);
//        Thread2 t4 = new Thread2(s2);
//
//        t3.start();
//        t4.start();


        WithoutSynchronization w1 = new WithoutSynchronization();
        Thread1 t1 = new Thread1(w1);
        Thread2 t2 = new Thread2(w1);

        t1.start();
        t2.start();


        WithoutSynchronization w2 = new WithoutSynchronization();
        Thread1 t3 = new Thread1(w2);
        Thread2 t4 = new Thread2(w2);

        t3.start();
        t4.start();













    }
}