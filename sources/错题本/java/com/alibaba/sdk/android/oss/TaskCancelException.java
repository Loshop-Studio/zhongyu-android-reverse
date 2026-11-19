package com.alibaba.sdk.android.oss;

import android.support.v4.media.AbstractC0037f;

/* loaded from: classes2.dex */
public class TaskCancelException extends Exception {
    public TaskCancelException() {
    }

    public TaskCancelException(String str) {
        super(AbstractC0037f.m85j("[ErrorMessage]: ", str));
    }

    public TaskCancelException(Throwable th) {
        super(th);
    }
}
