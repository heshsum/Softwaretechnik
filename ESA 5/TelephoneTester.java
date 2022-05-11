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
        TelephoneList tl = new TelephoneList();
        System.out.println(tl);

        TelephoneEntry te1 = new TelephoneEntry("Eins", "1");
        tl.add(te1);
        System.out.println(tl);

        TelephoneEntry te2 = new TelephoneEntry("Zwei", "2");
        tl.add(te2);
        System.out.println(tl);
    }
}

