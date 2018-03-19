/*****************************************************************
 * Gridnine AB http://www.gridnine.com
 * Project: BOF VIP-Service
 *
 * $Id: SimpleFileTypeFactory.java 2018-03-19 10:00 paramonov $
 *****************************************************************/
package com.simple;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class SimpleFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(SimpleFileType.INSTANCE);
    }
}