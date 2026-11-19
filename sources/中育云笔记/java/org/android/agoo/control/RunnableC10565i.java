package org.android.agoo.control;

import android.content.Intent;

/* renamed from: org.android.agoo.control.i */
/* loaded from: classes6.dex */
class RunnableC10565i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f25331a;

    /* renamed from: b */
    final /* synthetic */ HandlerC10564h f25332b;

    public RunnableC10565i(HandlerC10564h handlerC10564h, Intent intent) {
        this.f25332b = handlerC10564h;
        this.f25331a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f25332b.f25330a.onHandleIntent(this.f25331a);
    }
}
