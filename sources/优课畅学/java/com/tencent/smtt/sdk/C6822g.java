package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Handler;

/* renamed from: com.tencent.smtt.sdk.g */
/* loaded from: classes4.dex */
final class C6822g extends Thread {

    /* renamed from: a */
    final /* synthetic */ Context f6894a;

    /* renamed from: b */
    final /* synthetic */ Handler f6895b;

    public C6822g(Context context, Handler handler) {
        this.f6894a = context;
        this.f6895b = handler;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (C6785ak.m6068a().m6093a(true, this.f6894a) == 0) {
            C6785ak.m6068a().m6107b(this.f6894a, true);
        }
        C6827l.m6214a(true).m6220a(this.f6894a, false, false, null);
        C6816bo c6816boM6152b = C6816bo.m6152b();
        c6816boM6152b.m6156a(this.f6894a, null);
        boolean zM6157c = c6816boM6152b.m6157c();
        this.f6895b.sendEmptyMessage(3);
        if (zM6157c) {
            this.f6895b.sendEmptyMessage(1);
        } else {
            this.f6895b.sendEmptyMessage(2);
        }
    }
}
