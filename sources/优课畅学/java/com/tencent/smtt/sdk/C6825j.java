package com.tencent.smtt.sdk;

import com.tencent.smtt.utils.TbsLog;

/* renamed from: com.tencent.smtt.sdk.j */
/* loaded from: classes4.dex */
final class C6825j implements TbsListener {
    @Override // com.tencent.smtt.sdk.TbsListener
    public void onDownloadFinish(int i10) {
        if (TbsDownloader.needDownloadDecoupleCore()) {
            TbsLog.m6249i("QbSdk", "onDownloadFinish needDownloadDecoupleCore is true", true);
            TbsDownloader.f6627a = true;
            return;
        }
        TbsLog.m6249i("QbSdk", "onDownloadFinish needDownloadDecoupleCore is false", true);
        TbsDownloader.f6627a = false;
        if (QbSdk.f6597z != null) {
            QbSdk.f6597z.onDownloadFinish(i10);
        }
        if (QbSdk.f6569A != null) {
            QbSdk.f6569A.onDownloadFinish(i10);
        }
    }

    @Override // com.tencent.smtt.sdk.TbsListener
    public void onDownloadProgress(int i10) {
        if (QbSdk.f6569A != null) {
            QbSdk.f6569A.onDownloadProgress(i10);
        }
        if (QbSdk.f6597z != null) {
            QbSdk.f6597z.onDownloadProgress(i10);
        }
    }

    @Override // com.tencent.smtt.sdk.TbsListener
    public void onInstallFinish(int i10) {
        if (i10 != 200) {
        }
        QbSdk.setTBSInstallingStatus(false);
        TbsDownloader.f6627a = false;
        TbsDownloader.f6627a = TbsDownloader.startDecoupleCoreIfNeeded();
        if (QbSdk.f6597z != null) {
            QbSdk.f6597z.onInstallFinish(i10);
        }
        if (QbSdk.f6569A != null) {
            QbSdk.f6569A.onInstallFinish(i10);
        }
    }
}
