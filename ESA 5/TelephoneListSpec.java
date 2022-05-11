/*
 * TelephoneListSpec.java
 *
 * Copyright (c) 2020
 * All Rights Reserved.
 *
 * @version 1.00 - 15 Apr 2020 - HS - initial version
 */

/**
 * An interface class for describing telephone lists.
 * <br><code><b>[OMI-GP2-EA2a]</b></code>
 * 
 * @version 1.00 - 15 Apr 2020 - HS - initial version
 * @author   Hendrik Schlange (mail@hendrikschlange.de)
 */
public interface TelephoneListSpec {


    /**
     * Adds a new entry to the telephone list.
     * @param phoneEntry the entry to add
     */
    void add(TelephoneEntry phoneEntry);


    /**
     * Searches for a telephone list entry by name.
     * @param seekName the name to search for
     */
    void seek(String seekName);

    /**
     * Searches for a telephone list entry by number.
     * @param seekNumber the number to search for
     */
    void identify(String seekNumber);

    /**
     * Removes an entry from the telephone list.
     * @param phoneEntry the entry to remove
     */
    void remove(TelephoneEntry phoneEntry);


}
