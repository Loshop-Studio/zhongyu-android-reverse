package com.aliyun.ams.emas.push;

import android.app.Notification;

/* renamed from: com.aliyun.ams.emas.push.h */
/* loaded from: classes.dex */
class RunnableC1200h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Notification f6928a;

    /* renamed from: b */
    final /* synthetic */ Notification f6929b;

    /* renamed from: c */
    final /* synthetic */ RunnableC1199g f6930c;

    RunnableC1200h(RunnableC1199g runnableC1199g, Notification notification, Notification notification2) {
        this.f6930c = runnableC1199g;
        this.f6928a = notification;
        this.f6929b = notification2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6930c.f6927g.mo5383a(this.f6928a, this.f6929b);
    }
}
