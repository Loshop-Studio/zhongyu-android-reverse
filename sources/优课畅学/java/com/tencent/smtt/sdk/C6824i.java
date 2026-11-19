package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsDownloader;

/* renamed from: com.tencent.smtt.sdk.i */
/* loaded from: classes4.dex */
final class C6824i implements TbsDownloader.TbsDownloaderCallback {

    /* renamed from: a */
    final /* synthetic */ Context f6898a;

    /* renamed from: b */
    final /* synthetic */ QbSdk.PreInitCallback f6899b;

    public C6824i(Context context, QbSdk.PreInitCallback preInitCallback) {
        this.f6898a = context;
        this.f6899b = preInitCallback;
    }

    @Override // com.tencent.smtt.sdk.TbsDownloader.TbsDownloaderCallback
    public void onNeedDownloadFinish(boolean z10, int i10) {
        if (TbsShareManager.findCoreForThirdPartyApp(this.f6898a) != 0 || TbsShareManager.getCoreDisabled()) {
            if (QbSdk.f6580i && TbsShareManager.isThirdPartyApp(this.f6898a)) {
                TbsExtensionFunctionManager.getInstance().initTbsBuglyIfNeed(this.f6898a);
            }
            QbSdk.preInit(this.f6898a, this.f6899b);
            return;
        }
        TbsShareManager.forceToLoadX5ForThirdApp(this.f6898a, false);
        if (QbSdk.f6580i && TbsShareManager.isThirdPartyApp(this.f6898a)) {
            TbsExtensionFunctionManager.getInstance().initTbsBuglyIfNeed(this.f6898a);
        }
    }
}
