/*
 * TelephoneTester.java
 *
 * Copyright (c) 2020
 * All Rights Reserved.
 *
 * @version 1.00 - 15 Apr 2020 - HS - initial version
 */

/**
 * Tester class for TelephoneList.
 * <br><code><b>[OMI-GP2-EA2a]</b></code>
 *
 * @version 1.00 - 15 Apr 2020 - HS - initial version
 * @author   Hendrik Schlange (mail@hendrikschlange.de)
 */
public class TelephoneTester {
    /**
     * Method to test TelephoneEntry and TelephoneList.
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("-------------Start test of TelephoneEntry-------------");
        telephoneEntryTester();
        System.out.println("");
        System.out.println("");
        System.out.println("-------------Start test of TelephoneList-------------");
        telephoneListTester();
    }

    /** Method to test TelephoneEntry. */
    private static void telephoneEntryTester() {
        System.out.println("Creating one entry:");
        TelephoneEntry phoneEntry1 = new TelephoneEntry("Name1", "Number1");
        System.out.println("Print phoneEntry1 (result should "
                + "be 'Name: Name1, Number: Number1'):");
        System.out.println(phoneEntry1);
        System.out.println("");

        System.out.println("Print name of phoneEntry1 (result should be 'Name1'):");
        System.out.println(phoneEntry1.getName());
        System.out.println("");

        System.out.println("Print number of phoneEntry1 (result should be 'Number1'):");
        System.out.println(phoneEntry1.getNumber());
        System.out.println("");
    }

    /** Method to test TelephoneList. */
    private static void telephoneListTester() {
        System.out.println("Create new list");
        TelephoneList phoneList = new TelephoneList();
        System.out.println(phoneList.toString());
        System.out.println("");

        System.out.println("Add new entry to list by name and number");
        phoneList.add("Name1", "Number1");
        System.out.println("Print the list (result should be 'Name: Name1, Number: Number1'):");
        System.out.println(phoneList);
        System.out.println("");

        System.out.println("Creating phoneEntry2 (Name2, Number2)");
        TelephoneEntry phoneEntry2 = new TelephoneEntry("Name2", "Number2");
        System.out.println("");

        System.out.println("Add phoneEntry2 to list by it as an object");
        phoneList.add(phoneEntry2);
        System.out.println("Print list again (result should be 'Name: Name1, Number: Number1,"
                + " Name: Name2, Number: Number2')");
        System.out.println(phoneList);
        System.out.println("");

        System.out.println("Seek by name 'Name1'. Result should be: 'index0, Name1, Number1'");
        phoneList.seek("Name1");
        System.out.println("");

        System.out.println("Identify by number 'Number2'. "
                + "Result should be: 'index1, Name2, Number2'");
        phoneList.identify("Number2");
        System.out.println("");

        System.out.println("Removing phoneEntry2");
        phoneList.remove(phoneEntry2);
        System.out.println("Print list again (result should be 'Name: Name1, Number: Number1'");
        System.out.println(phoneList);
    }
}

