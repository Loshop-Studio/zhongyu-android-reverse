package com.taobao.accs.internal;

import android.content.Context;
import com.taobao.accs.ACCSClient;

/* renamed from: com.taobao.accs.internal.a */
/* loaded from: classes.dex */
class RunnableC1733a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f7621a;

    /* renamed from: b */
    final /* synthetic */ Context f7622b;

    /* renamed from: c */
    final /* synthetic */ ACCSManagerImpl f7623c;

    RunnableC1733a(ACCSManagerImpl aCCSManagerImpl, String str, Context context) {
        this.f7623c = aCCSManagerImpl;
        this.f7621a = str;
        this.f7622b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ACCSClient.getAccsClient(this.f7621a).addConnectionListener(new C1734b(this));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
