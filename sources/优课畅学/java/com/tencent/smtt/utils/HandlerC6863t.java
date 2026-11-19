package com.tencent.smtt.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.tencent.smtt.utils.t */
/* loaded from: classes4.dex */
class HandlerC6863t extends Handler {

    /* renamed from: a */
    final /* synthetic */ C6862s f7003a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6863t(C6862s c6862s, Looper looper) {
        super(looper);
        this.f7003a = c6862s;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            int i10 = message.what;
            if (i10 == 0) {
                Object[] objArr = (Object[]) message.obj;
                C6862s.m6360b((Context) objArr[0], (String) objArr[1]);
            } else if (i10 == 1) {
                this.f7003a.m6361c((Context) ((Object[]) message.obj)[0]);
            } else if (i10 == 2) {
                Object[] objArr2 = (Object[]) message.obj;
                this.f7003a.m6366e((Context) objArr2[0], (String) objArr2[1]);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.handleMessage(message);
    }
}
