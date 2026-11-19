package com.tencent.smtt.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.smtt.sdk.TbsLogReport;

/* renamed from: com.tencent.smtt.sdk.av */
/* loaded from: classes4.dex */
class HandlerC6796av extends Handler {

    /* renamed from: a */
    final /* synthetic */ TbsLogReport f6836a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6796av(TbsLogReport tbsLogReport, Looper looper) {
        super(looper);
        this.f6836a = tbsLogReport;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 600) {
            if (i10 == 601) {
                this.f6836a.m5888g();
            }
        } else {
            Object obj = message.obj;
            if (obj instanceof TbsLogReport.TbsLogInfo) {
                int i11 = message.arg1;
                this.f6836a.m5881a(i11, (TbsLogReport.TbsLogInfo) obj);
            }
        }
    }
}
