package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.C6854k;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;

/* renamed from: com.tencent.smtt.sdk.an */
/* loaded from: classes4.dex */
class C6788an extends Thread {

    /* renamed from: a */
    final /* synthetic */ Context f6826a;

    /* renamed from: b */
    final /* synthetic */ Context f6827b;

    /* renamed from: c */
    final /* synthetic */ C6785ak f6828c;

    public C6788an(C6785ak c6785ak, Context context, Context context2) {
        this.f6828c = c6785ak;
        this.f6826a = context;
        this.f6827b = context2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        TbsLog.m6248i("TbsInstaller", "TbsInstaller--quickDexOptForThirdPartyApp thread start");
        try {
            Context context = this.f6826a;
            C6854k.m6308a(context == null ? new File(TbsShareManager.getHostCorePathAppDefined()) : this.f6828c.m6121n(context), this.f6828c.m6121n(this.f6827b), new C6790ap(this));
            TbsLog.m6248i("TbsInstaller", "TbsInstaller--quickDexOptForThirdPartyApp thread done");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
