package com.tencent.smtt.sdk;

import com.tencent.smtt.utils.C6857n;
import com.tencent.smtt.utils.TbsLog;

/* renamed from: com.tencent.smtt.sdk.ax */
/* loaded from: classes4.dex */
class C6798ax implements C6857n.a {

    /* renamed from: a */
    final /* synthetic */ TbsLogReport f6838a;

    public C6798ax(TbsLogReport tbsLogReport) {
        this.f6838a = tbsLogReport;
    }

    @Override // com.tencent.smtt.utils.C6857n.a
    /* renamed from: a */
    public void mo6060a(int i10) {
        TbsLog.m6248i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat] onHttpResponseCode:" + i10);
        if (i10 < 300) {
            this.f6838a.m5889h();
        }
    }
}
