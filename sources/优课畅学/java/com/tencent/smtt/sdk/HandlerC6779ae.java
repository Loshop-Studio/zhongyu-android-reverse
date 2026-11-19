package com.tencent.smtt.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.tencent.smtt.sdk.ae */
/* loaded from: classes4.dex */
class HandlerC6779ae extends Handler {

    /* renamed from: a */
    final /* synthetic */ C6778ad f6803a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6779ae(C6778ad c6778ad, Looper looper) {
        super(looper);
        this.f6803a = c6778ad;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 150) {
            this.f6803a.m6031n();
        }
    }
}
