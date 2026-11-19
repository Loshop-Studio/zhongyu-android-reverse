package com.blankj.utilcode.util;

import java.lang.Thread;

/* renamed from: com.blankj.utilcode.util.o */
/* loaded from: classes2.dex */
public final class C3395o implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        System.out.println(th);
    }
}
