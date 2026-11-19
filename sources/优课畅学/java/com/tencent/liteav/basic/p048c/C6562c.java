package com.tencent.liteav.basic.p048c;

import java.io.IOException;

/* renamed from: com.tencent.liteav.basic.c.c */
/* loaded from: classes4.dex */
public class C6562c extends IOException {
    private static final long serialVersionUID = 2723743254380545567L;
    private final int mErrorCode;
    private final String mErrorMessage;

    public C6562c(int i10) {
        this(i10, null);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.mErrorMessage == null) {
            return "EGL error code: " + this.mErrorCode;
        }
        return "EGL error code: " + this.mErrorCode + this.mErrorMessage;
    }

    public C6562c(int i10, String str) {
        this.mErrorCode = i10;
        this.mErrorMessage = str;
    }
}
