package com.liulishuo.okdownload.core.exception;

import java.io.IOException;

/* loaded from: classes4.dex */
public class PreAllocateException extends IOException {

    /* renamed from: a */
    public final long f4726a;

    /* renamed from: b */
    public final long f4727b;

    public PreAllocateException(long j10, long j11) {
        super("There is Free space less than Require space: " + j11 + " < " + j10);
        this.f4726a = j10;
        this.f4727b = j11;
    }
}
