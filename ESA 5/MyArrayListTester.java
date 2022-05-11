/*
 * MyArrayListTester.java
 *
 * Copyright (c) 2020
 * All Rights Reserved.
 *
 * @version 1.00 - 21 Apr 2020 - HS - initial version
 */

/**
 * Tester class for MyArrayList.
 * <br><code><b>[OMI-GP2-EA2b]</b></code>
 *
 * @version 1.00 - 21 Apr 2020 - HS - initial version
 * @author   Hendrik Schlange (mail@hendrikschlange.de)
 */

public class MyArrayListTester {

    /**
     * Method to test MyArrayList.
     * @param args not used
     */
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        System.out.println("Creating a new MyArrayList. Default capacity.");

        //Testing creation of the MyArrayList
        MyArrayList<TelephoneEntry> test1 = new MyArrayList<TelephoneEntry>(0, 0);
        System.out.println("Getting capacity. Should be '10'");
        System.out.println(test1.getCapacity());
        System.out.println("Getting increment. Should be '1'");
        System.out.println(test1.getIncrement());
        System.out.println("Getting internal length. Should be '10'");
        System.out.println(test1.getInternalLength());

        System.out.println("Constructing TelephoneEntry objects");
        TelephoneEntry teTest1 = new TelephoneEntry("Name1", "Number1");
        System.out.println(teTest1);
        TelephoneEntry teTest2 = new TelephoneEntry("Name2", "Number2");
        System.out.println(teTest2);
        TelephoneEntry teTest3 = new TelephoneEntry("Name3", "Number3");
        System.out.println(teTest3);
        TelephoneEntry teTest4 = new TelephoneEntry("Name4", "Number4");
        System.out.println(teTest4);
        TelephoneEntry teTest5 = new TelephoneEntry("Name5", "Number5");
        System.out.println(teTest5);
        TelephoneEntry teTest6 = new TelephoneEntry("Name6", "Number6");
        System.out.println(teTest6);
        TelephoneEntry teTest7 = new TelephoneEntry("Name7", "Number7");
        System.out.println(teTest7);
        TelephoneEntry teTest8 = new TelephoneEntry("Name8", "Number8");
        System.out.println(teTest8);
        TelephoneEntry teTest9 = new TelephoneEntry("Name9", "Number9");
        System.out.println(teTest9);
        TelephoneEntry teTest10 = new TelephoneEntry("Name10", "Number10");
        TelephoneEntry teTest11 = new TelephoneEntry("Name11", "Number11");
        TelephoneEntry teTest12 = new TelephoneEntry("Name12", "Number12");
        TelephoneEntry teTest13 = new TelephoneEntry("Name13", "Number13");
        TelephoneEntry teTest14 = new TelephoneEntry("Name14", "Number14");
        TelephoneEntry teTest15 = new TelephoneEntry("Name15", "Number15");

        System.out.println("Adding teTest1 to teTest10 to fill up the MyArrayList.");
        test1.add(teTest1);
        test1.add(teTest2);
        test1.add(teTest3);
        test1.add(teTest4);
        test1.add(teTest5);
        test1.add(teTest6);
        test1.add(teTest7);
        test1.add(teTest8);
        test1.add(teTest9);
        test1.add(teTest10);
        System.out.println("Added 10 elements to the MyArrayList.");
        System.out.println("Printing MyArrayList.");
        System.out.println(test1.toString());
        System.out.println("Getting capacity. Should be 10.");
        System.out.println(test1.getCapacity());
        System.out.println("Getting internal length. Should be 10.");
        System.out.println(test1.getInternalLength());
        System.out.println("Getting size. Should be 10.");
        System.out.println(test1.getSize());

        System.out.println("Adding one more item to test auto-increment.");
        test1.add(teTest11);
        System.out.println(test1.get(10));
        System.out.println("Getting capacity. Should be 11.");
        System.out.println(test1.getCapacity());
        System.out.println("Getting internal length. Should be 11.");
        System.out.println(test1.getInternalLength());
        System.out.println("Getting size. Should be 11.");
        System.out.println(test1.getSize());
        System.out.println("Printing MyArrayList.");
        System.out.println(test1.toString());

        // Testing remove() for index != 0
        System.out.println("Element at index 5 (should be Name6):");
        System.out.println(test1.get(5));
        System.out.println("Removing element at index 5");
        test1.remove(5);
        System.out.println("Element at index 5 (should be Name7):");
        System.out.println(test1.get(5));
        System.out.println("Printing MyArrayList.");
        System.out.println(test1.toString());

        System.out.println("Getting capacity. Should be 10.");
        System.out.println(test1.getCapacity());
        System.out.println("Getting internal length. Should be 10.");
        System.out.println(test1.getInternalLength());
        System.out.println("Getting size. Should be 10.");
        System.out.println(test1.getSize());

        //Testing remove() for index == 0
        System.out.println("Element at index 0 (should be Name1):");
        System.out.println(test1.get(0));
        System.out.println("Removing element at index 0");
        test1.remove(0);
        System.out.println("Element at index 0 (should be Name2):");
        System.out.println(test1.get(0));
        System.out.println("Printing MyArrayList.");

        System.out.println("Getting capacity. Should be 9.");
        System.out.println(test1.getCapacity());
        System.out.println("Getting internal length. Should be 9.");
        System.out.println(test1.getInternalLength());
        System.out.println("Getting size. Should be 9.");
        System.out.println(test1.getSize());

        //Testing clear()
        System.out.println("Clearing the MyArrayList.");
        test1.clear();
        System.out.println("Getting capacity. Should be 10 (initial size):");
        System.out.println(test1.getCapacity());
        System.out.println("Getting size. Should be 0 (empty):");
        System.out.println(test1.getSize());
        System.out.println("Getting internal length. Should be 10 (initial size):");
        System.out.println(test1.getInternalLength());

    }

}
