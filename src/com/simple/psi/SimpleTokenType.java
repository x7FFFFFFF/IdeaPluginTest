/*****************************************************************
 * Gridnine AB http://www.gridnine.com
 * Project: BOF VIP-Service
 *
 * $Id: SimpleTokenType.java 2018-03-19 10:12 paramonov $
 *****************************************************************/
package com.simple.psi;

import com.intellij.psi.tree.IElementType;
import com.simple.SimpleLanguage;
import org.jetbrains.annotations.*;

public class SimpleTokenType extends IElementType {
    public SimpleTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SimpleLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SimpleTokenType." + super.toString();
    }
}