package com.liulishuo.okdownload.core.exception;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class FileBusyAfterRunException extends IOException {

    /* renamed from: a */
    public static final FileBusyAfterRunException f5332a = new FileBusyAfterRunException() { // from class: com.liulishuo.okdownload.core.exception.FileBusyAfterRunException.1
    };

    private FileBusyAfterRunException() {
        super("File busy after run");
    }
}
