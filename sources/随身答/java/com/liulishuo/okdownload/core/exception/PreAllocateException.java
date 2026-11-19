package com.liulishuo.okdownload.core.exception;

import java.io.IOException;

/* loaded from: classes4.dex */
public class PreAllocateException extends IOException {

    /* renamed from: a */
    public final long f5334a;

    /* renamed from: b */
    public final long f5335b;

    public PreAllocateException(long j9, long j10) {
        super("There is Free space less than Require space: " + j10 + " < " + j9);
        this.f5334a = j9;
        this.f5335b = j10;
    }
}
