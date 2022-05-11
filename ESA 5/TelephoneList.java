/*
 * TelephoneList.java
 *
 * Copyright (c) 2020
 * All Rights Reserved.
 *
 * @version 1.00 - 15 Apr 2020 - HS - initial version
 */

/**
 * A class for describing a telephone list
 * <br><code><b>[OMI-GP2-EA2a]</b></code>
 * 
 * @version 1.00 - 15 Apr 2020 - HS - initial version
 * @author   Hendrik Schlange (mail@hendrikschlange.de)
 */

import java.util.ArrayList;

/**
 * A class to manage TelephoneEntry objects in an ArrayList
 * as defined in TelephoneListSped.
 */
public class TelephoneList implements TelephoneListSpec {

    /** The telephone list to manage. */
    ArrayList<TelephoneEntry> teList = new ArrayList<TelephoneEntry>();

    /**
     * Function to create an entry and add it to the list.
     * @param name the name of the entry
     * @param number the number of the entry
     */
    public void add(String name, String number) {
        add(new TelephoneEntry(name, number));
    }

    /**
     * Function to create an existing entry to the list.
     * @param phoneEntry the phoneEntry to add
     */
    public void add(TelephoneEntry phoneEntry) {
        teList.add(phoneEntry);
    }

    /**
     * Function to search through entries of the telephone list by name.
     * @param seekName the name to search for
     */
    public void seek(String seekName) {
        for (int i = 0; i < teList.size(); i++) {
            if (teList.get(i).getName().equals(seekName)) {
                System.out.println("Entry found at index " + i + ":");
                System.out.println(teList.get(i));
            } else {
                continue;
            }
        }
    }

    /**
     * Function to search through entries of the telephone list by number.
     * @param seekNumber the number to search for
     */
    public void identify(String seekNumber) {
        for (int i = 0; i < teList.size(); i++) {
            if (teList.get(i).getNumber().equals(seekNumber)) {
                System.out.println("Entry found at index " + i + ":");
                System.out.println(teList.get(i));
            } else {
                continue;
            }
        }
    }


    /**
     * Removes an entry from the telephone list.
     * @param phoneEntry the entry to remove
     */
    public void remove(TelephoneEntry phoneEntry) {
        if (teList.contains(phoneEntry)) {
            teList.remove(phoneEntry);
        } else {
            System.out.println("Entry not found: " + System.lineSeparator() + phoneEntry);
        }
    }



    /**
     * Returns a textual representation of the object.
     * 
     * @return a textual representation of the object
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder rs = new StringBuilder();
        if (teList.size() > 0) {
            for (int i = 0; i < teList.size(); i++) {
                if (i > 0) {
                    rs.append(", ");
                }
                rs.append(teList.get(i));
            }
        }
        return rs.toString();
    }
}
