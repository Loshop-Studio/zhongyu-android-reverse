package com.taobao.accs.messenger;

import android.content.Intent;

/* renamed from: com.taobao.accs.messenger.c */
/* loaded from: classes.dex */
class RunnableC1739c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f7636a;

    /* renamed from: b */
    final /* synthetic */ HandlerC1738b f7637b;

    RunnableC1739c(HandlerC1738b handlerC1738b, Intent intent) {
        this.f7637b = handlerC1738b;
        this.f7636a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        MessengerService.m5973a();
    }
}
