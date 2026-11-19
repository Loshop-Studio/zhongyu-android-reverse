package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import com.taobao.accs.net.AbstractC1745b;

/* renamed from: com.taobao.accs.data.h */
/* loaded from: classes.dex */
final class RunnableC1730h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f7604a;

    /* renamed from: b */
    final /* synthetic */ AbstractC1745b f7605b;

    /* renamed from: c */
    final /* synthetic */ Intent f7606c;

    RunnableC1730h(Context context, AbstractC1745b abstractC1745b, Intent intent) {
        this.f7604a = context;
        this.f7605b = abstractC1745b;
        this.f7606c = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1729g.m5934a().m5940b(this.f7604a, this.f7605b, this.f7606c);
    }
}
