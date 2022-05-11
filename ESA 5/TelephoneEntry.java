/*
 * TelephoneEntry.java
 *
 * Copyright (c) 2020
 * All Rights Reserved.
 *
 * @version 1.00 - 15 Apr 2020 - HS - initial version
 */

/**
 * A class for describing a telephone entry.
 * <br><code><b>[OMI-GP2-EA2a]</b></code>
 * 
 * @version 1.00 - 15 Apr 2020 - HS - initial version
 * @author   Hendrik Schlange (mail@hendrikschlange.de)
 */
public class TelephoneEntry {

    /** The string representing the name of the entry. */
    private String name;
    /**
     * The string representing the phone number of the entry.
     * "String" is used in order to support international phone numbers,
     * as well as dividers between area code and number.
     */
    private String number;

    /**
     * Constructor for new entries.
     * @param name the name of the phone entry
     * @param number the number of the phone entry.
     */
    public TelephoneEntry(String name, String number) {
        this.name = name;
        this.number = number;
    }

    /**
     * Getter-function to retrieve the name of an entry.
     * @return the name of the entry
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter-function to retrieve the number of an entry.
     * @return the number of the entry
     */
    public String getNumber() {
        return this.number;
    }


    /**
     * Returns a textual representation of the telephone entry.
     * @return a textual representation of the object
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Name: " + name + ", Number: " + number;
    }
}
