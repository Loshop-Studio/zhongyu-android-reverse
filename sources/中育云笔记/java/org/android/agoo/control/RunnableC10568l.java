package org.android.agoo.control;

import android.content.Intent;

/* renamed from: org.android.agoo.control.l */
/* loaded from: classes6.dex */
class RunnableC10568l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f25335a;

    /* renamed from: b */
    final /* synthetic */ BaseIntentService f25336b;

    public RunnableC10568l(BaseIntentService baseIntentService, Intent intent) {
        this.f25336b = baseIntentService;
        this.f25335a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f25336b.onHandleIntent(this.f25335a);
    }
}
