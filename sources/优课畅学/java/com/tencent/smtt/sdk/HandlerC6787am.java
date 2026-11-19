package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.smtt.utils.TbsLog;

/* renamed from: com.tencent.smtt.sdk.am */
/* loaded from: classes4.dex */
class HandlerC6787am extends Handler {

    /* renamed from: a */
    final /* synthetic */ C6785ak f6825a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6787am(C6785ak c6785ak, Looper looper) {
        super(looper);
        this.f6825a = c6785ak;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws Throwable {
        QbSdk.setTBSInstallingStatus(true);
        int i10 = message.what;
        if (i10 == 1) {
            TbsLog.m6248i("TbsInstaller", "TbsInstaller--handleMessage--MSG_INSTALL_TBS_CORE");
            Object[] objArr = (Object[]) message.obj;
            this.f6825a.m6076b((Context) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue());
        } else if (i10 == 2) {
            TbsLog.m6248i("TbsInstaller", "TbsInstaller--handleMessage--MSG_COPY_TBS_CORE");
            Object[] objArr2 = (Object[]) message.obj;
            this.f6825a.m6071a((Context) objArr2[0], (Context) objArr2[1], ((Integer) objArr2[2]).intValue());
        } else if (i10 == 3) {
            TbsLog.m6248i("TbsInstaller", "TbsInstaller--handleMessage--MSG_INSTALL_TBS_CORE_EX");
            Object[] objArr3 = (Object[]) message.obj;
            this.f6825a.m6106b((Context) objArr3[0], (Bundle) objArr3[1]);
        }
        QbSdk.setTBSInstallingStatus(false);
        super.handleMessage(message);
    }
}
