package com.efs.sdk.p051pa;

/* loaded from: classes.dex */
public interface PATraceListener {
    void onAnrTrace();

    void onCheck(boolean z3);

    void onUnexcept(Object obj);
}
