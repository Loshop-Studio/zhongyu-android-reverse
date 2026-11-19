package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.sdk.QbSdk;

/* renamed from: com.tencent.smtt.sdk.h */
/* loaded from: classes4.dex */
final class C6823h implements TbsListener {

    /* renamed from: a */
    final /* synthetic */ Context f6896a;

    /* renamed from: b */
    final /* synthetic */ QbSdk.PreInitCallback f6897b;

    public C6823h(Context context, QbSdk.PreInitCallback preInitCallback) {
        this.f6896a = context;
        this.f6897b = preInitCallback;
    }

    @Override // com.tencent.smtt.sdk.TbsListener
    public void onDownloadFinish(int i10) {
    }

    @Override // com.tencent.smtt.sdk.TbsListener
    public void onDownloadProgress(int i10) {
    }

    @Override // com.tencent.smtt.sdk.TbsListener
    public void onInstallFinish(int i10) {
        QbSdk.preInit(this.f6896a, this.f6897b);
    }
}
