package com.taobao.accs.messenger;

import android.content.Intent;

/* renamed from: com.taobao.accs.messenger.f */
/* loaded from: classes.dex */
class RunnableC1742f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f7647a;

    /* renamed from: b */
    final /* synthetic */ Intent f7648b;

    /* renamed from: c */
    final /* synthetic */ C1741e f7649c;

    RunnableC1742f(C1741e c1741e, String str, Intent intent) {
        this.f7649c = c1741e;
        this.f7647a = str;
        this.f7648b = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7649c.m5984b(this.f7647a, this.f7648b);
    }
}
