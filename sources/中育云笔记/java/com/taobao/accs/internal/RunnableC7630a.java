package com.taobao.accs.internal;

import android.content.Context;
import com.taobao.accs.ACCSClient;

/* renamed from: com.taobao.accs.internal.a */
/* loaded from: classes5.dex */
class RunnableC7630a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f13019a;

    /* renamed from: b */
    final /* synthetic */ Context f13020b;

    /* renamed from: c */
    final /* synthetic */ ACCSManagerImpl f13021c;

    public RunnableC7630a(ACCSManagerImpl aCCSManagerImpl, String str, Context context) {
        this.f13021c = aCCSManagerImpl;
        this.f13019a = str;
        this.f13020b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ACCSClient.getAccsClient(this.f13019a).addConnectionListener(new C7631b(this));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
