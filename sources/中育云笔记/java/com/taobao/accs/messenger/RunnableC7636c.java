package com.taobao.accs.messenger;

import android.content.Intent;

/* renamed from: com.taobao.accs.messenger.c */
/* loaded from: classes5.dex */
class RunnableC7636c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f13034a;

    /* renamed from: b */
    final /* synthetic */ HandlerC7635b f13035b;

    public RunnableC7636c(HandlerC7635b handlerC7635b, Intent intent) {
        this.f13035b = handlerC7635b;
        this.f13034a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        MessengerService.m9999a();
    }
}
