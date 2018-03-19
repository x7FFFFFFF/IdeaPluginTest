/*****************************************************************
 * Gridnine AB http://www.gridnine.com
 * Project: BOF VIP-Service
 *
 * $Id: SimpleElementType.java 2018-03-19 10:14 paramonov $
 *****************************************************************/
package com.simple.psi;

import com.intellij.psi.tree.IElementType;
import com.simple.SimpleLanguage;
import org.jetbrains.annotations.*;

public class SimpleElementType extends IElementType {
    public SimpleElementType(@NotNull @NonNls String debugName) {
        super(debugName, SimpleLanguage.INSTANCE);
    }
}