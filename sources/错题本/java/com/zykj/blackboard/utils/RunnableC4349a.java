package com.zykj.blackboard.utils;

import io.objectbox.BoxStore;

/* renamed from: com.zykj.blackboard.utils.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4349a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5333a;

    /* renamed from: b */
    public final /* synthetic */ String f5334b;

    public /* synthetic */ RunnableC4349a(String str, int i) {
        this.f5333a = i;
        this.f5334b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5333a) {
            case 0:
                BoardBox.m13813clearLocalData$lambda8(this.f5334b);
                break;
            default:
                BoxStore.m5015g(this.f5334b, true);
                BoxStore.f8896u = null;
                break;
        }
    }
}
