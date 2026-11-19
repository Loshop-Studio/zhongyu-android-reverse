package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.tencent.smtt.sdk.d */
/* loaded from: classes4.dex */
final class C6819d extends Thread {

    /* renamed from: a */
    final /* synthetic */ Context f6887a;

    /* renamed from: b */
    final /* synthetic */ String f6888b;

    /* renamed from: c */
    final /* synthetic */ ValueCallback f6889c;

    public C6819d(Context context, String str, ValueCallback valueCallback) {
        this.f6887a = context;
        this.f6888b = str;
        this.f6889c = valueCallback;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        c6816boM6152b.m6156a(this.f6887a, null);
        new Handler(Looper.getMainLooper()).post(new RunnableC6820e(this, c6816boM6152b.m6157c() ? c6816boM6152b.m6158d().m6170a(this.f6887a, this.f6888b) : false));
    }
}
