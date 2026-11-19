package com.liulishuo.okdownload.core.exception;

import java.io.IOException;

/* loaded from: classes4.dex */
public class ServerCanceledException extends IOException {

    /* renamed from: a */
    public final int f4729a;

    public ServerCanceledException(int i10, long j10) {
        super("Response code can't handled on internal " + i10 + " with current offset " + j10);
        this.f4729a = i10;
    }
}
