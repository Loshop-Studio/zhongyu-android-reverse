package org.android.agoo.control;

import android.content.Intent;

/* renamed from: org.android.agoo.control.i */
/* loaded from: classes.dex */
class RunnableC2965i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f11449a;

    /* renamed from: b */
    final /* synthetic */ HandlerC2964h f11450b;

    RunnableC2965i(HandlerC2964h handlerC2964h, Intent intent) {
        this.f11450b = handlerC2964h;
        this.f11449a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f11450b.f11448a.onHandleIntent(this.f11449a);
    }
}
