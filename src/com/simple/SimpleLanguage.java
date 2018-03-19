/*****************************************************************
 * Gridnine AB http://www.gridnine.com
 * Project: BOF VIP-Service
 *
 * $Id: SimpleLanguage.java 2018-03-19 9:45 paramonov $
 *****************************************************************/
package com.simple;

import com.intellij.lang.Language;

public class SimpleLanguage extends Language {
    public static final SimpleLanguage INSTANCE = new SimpleLanguage();

    private SimpleLanguage() {
        super("Simple");
    }
}