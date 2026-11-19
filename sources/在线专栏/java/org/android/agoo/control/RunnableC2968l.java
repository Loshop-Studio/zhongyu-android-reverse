package org.android.agoo.control;

import android.content.Intent;

/* renamed from: org.android.agoo.control.l */
/* loaded from: classes.dex */
class RunnableC2968l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f11453a;

    /* renamed from: b */
    final /* synthetic */ BaseIntentService f11454b;

    RunnableC2968l(BaseIntentService baseIntentService, Intent intent) {
        this.f11454b = baseIntentService;
        this.f11453a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f11454b.onHandleIntent(this.f11453a);
    }
}
