/*****************************************************************
 * Gridnine AB http://www.gridnine.com
 * Project: BOF VIP-Service
 *
 * $Id: SimpleFileType.java 2018-03-19 9:58 paramonov $
 *****************************************************************/
package com.simple;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class SimpleFileType extends LanguageFileType {
    public static final SimpleFileType INSTANCE = new SimpleFileType();

    private SimpleFileType() {
        super(SimpleLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Simple file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Simple language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "simple";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SimpleIcons.FILE;
    }
}
