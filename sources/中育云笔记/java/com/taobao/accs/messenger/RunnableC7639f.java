package com.taobao.accs.messenger;

import android.content.Intent;

/* renamed from: com.taobao.accs.messenger.f */
/* loaded from: classes5.dex */
class RunnableC7639f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f13045a;

    /* renamed from: b */
    final /* synthetic */ Intent f13046b;

    /* renamed from: c */
    final /* synthetic */ C7638e f13047c;

    public RunnableC7639f(C7638e c7638e, String str, Intent intent) {
        this.f13047c = c7638e;
        this.f13045a = str;
        this.f13046b = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f13047c.m10010b(this.f13045a, this.f13046b);
    }
}
