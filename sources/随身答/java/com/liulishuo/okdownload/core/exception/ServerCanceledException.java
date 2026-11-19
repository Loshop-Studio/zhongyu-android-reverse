package com.liulishuo.okdownload.core.exception;

import java.io.IOException;

/* loaded from: classes4.dex */
public class ServerCanceledException extends IOException {

    /* renamed from: a */
    public final int f5337a;

    public ServerCanceledException(int i9, long j9) {
        super("Response code can't handled on internal " + i9 + " with current offset " + j9);
        this.f5337a = i9;
    }
}
