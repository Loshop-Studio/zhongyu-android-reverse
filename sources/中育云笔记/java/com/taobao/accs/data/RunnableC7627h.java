package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import com.taobao.accs.net.AbstractC7642b;

/* renamed from: com.taobao.accs.data.h */
/* loaded from: classes5.dex */
final class RunnableC7627h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f13002a;

    /* renamed from: b */
    final /* synthetic */ AbstractC7642b f13003b;

    /* renamed from: c */
    final /* synthetic */ Intent f13004c;

    public RunnableC7627h(Context context, AbstractC7642b abstractC7642b, Intent intent) {
        this.f13002a = context;
        this.f13003b = abstractC7642b;
        this.f13004c = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        C7626g.m9960a().m9966b(this.f13002a, this.f13003b, this.f13004c);
    }
}
