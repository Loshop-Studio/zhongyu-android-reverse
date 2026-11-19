package com.liulishuo.okdownload.core.exception;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class InterruptException extends IOException {

    /* renamed from: a */
    public static final InterruptException f5333a = new InterruptException() { // from class: com.liulishuo.okdownload.core.exception.InterruptException.1
        @Override // java.lang.Throwable
        public void printStackTrace() {
            throw new IllegalAccessError("Stack is ignored for signal");
        }
    };

    private InterruptException() {
        super("Interrupted");
    }
}
