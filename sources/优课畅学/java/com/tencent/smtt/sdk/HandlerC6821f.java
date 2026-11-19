package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.utils.TbsLog;

/* renamed from: com.tencent.smtt.sdk.f */
/* loaded from: classes4.dex */
final class HandlerC6821f extends Handler {

    /* renamed from: a */
    final /* synthetic */ QbSdk.PreInitCallback f6892a;

    /* renamed from: b */
    final /* synthetic */ Context f6893b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6821f(Looper looper, QbSdk.PreInitCallback preInitCallback, Context context) {
        super(looper);
        this.f6892a = preInitCallback;
        this.f6893b = context;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        QbSdk.PreInitCallback preInitCallback;
        int i10 = message.what;
        if (i10 == 1) {
            C6817bp c6817bpM6158d = C6816bo.m6152b().m6158d();
            if (c6817bpM6158d != null) {
                c6817bpM6158d.m6161a(this.f6893b);
            }
            QbSdk.PreInitCallback preInitCallback2 = this.f6892a;
            if (preInitCallback2 != null) {
                preInitCallback2.onViewInitFinished(true);
            }
            TbsLog.writeLogToDisk();
            return;
        }
        if (i10 != 2) {
            if (i10 == 3 && (preInitCallback = this.f6892a) != null) {
                preInitCallback.onCoreInitFinished();
                return;
            }
            return;
        }
        QbSdk.PreInitCallback preInitCallback3 = this.f6892a;
        if (preInitCallback3 != null) {
            preInitCallback3.onViewInitFinished(false);
        }
        TbsLog.writeLogToDisk();
    }
}
