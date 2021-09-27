

public class MyArrayListDemo {

    public static void main(String[] args) {

        MyArrayList myAL = new MyArrayList();

        // add elements to the List
        myAL.add("A");
        myAL.add("B");
        myAL.add("C");
        System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size

        myAL.add(1, "D");
        myAL.add(2, "E");
        System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size

        myAL.add(5, "F");
        System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size

        for (int i = 0; i < 10; i++) {
            myAL.add(i);
        }
        System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size

        // Lets check the remove operations
        // remove the object
        myAL.remove("F");
        System.out.println("After removing \"F\": ");
        System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size

        // remove the object at index
        myAL.remove(5);
        System.out.println("After removing element at index 5: ");
        System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size

        // remove element which is not in the ArrayList
        myAL.remove("F");
        System.out.println("After removing \"F\": ");
        System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size


        // remove last element in the ArrayList
        myAL.remove(Integer.valueOf(9));
        System.out.println("After removing \"9\": ");
        System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size

        try {
            myAL.add(40, "Z"); //this will throw an exception
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException raised.");
        }

    }

}