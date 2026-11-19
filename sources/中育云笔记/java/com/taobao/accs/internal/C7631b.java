package com.taobao.accs.internal;

import android.content.Context;
import com.taobao.accs.ConnectionListener;
import com.taobao.accs.net.AbstractC7642b;

/* renamed from: com.taobao.accs.internal.b */
/* loaded from: classes5.dex */
class C7631b implements ConnectionListener {

    /* renamed from: a */
    final /* synthetic */ RunnableC7630a f13022a;

    public C7631b(RunnableC7630a runnableC7630a) {
        this.f13022a = runnableC7630a;
    }

    @Override // com.taobao.accs.ConnectionListener
    public void onConnect() {
        if (this.f13022a.f13021c.f13010a.m10037j().m9874e(this.f13022a.f13020b.getPackageName()) && this.f13022a.f13021c.f13012c) {
            RunnableC7630a runnableC7630a = this.f13022a;
            ACCSManagerImpl aCCSManagerImpl = runnableC7630a.f13021c;
            Context context = runnableC7630a.f13020b;
            AbstractC7642b abstractC7642b = aCCSManagerImpl.f13010a;
            aCCSManagerImpl.m9980a(context, abstractC7642b.f13053b, abstractC7642b.f13052a);
        }
    }

    @Override // com.taobao.accs.ConnectionListener
    public void onDisconnect(int i10, String str) {
    }
}
