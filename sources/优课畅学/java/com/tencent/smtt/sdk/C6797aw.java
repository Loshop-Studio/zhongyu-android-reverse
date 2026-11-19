package com.tencent.smtt.sdk;

import com.tencent.smtt.utils.C6857n;
import com.tencent.smtt.utils.TbsLog;

/* renamed from: com.tencent.smtt.sdk.aw */
/* loaded from: classes4.dex */
class C6797aw implements C6857n.a {

    /* renamed from: a */
    final /* synthetic */ TbsLogReport f6837a;

    public C6797aw(TbsLogReport tbsLogReport) {
        this.f6837a = tbsLogReport;
    }

    @Override // com.tencent.smtt.utils.C6857n.a
    /* renamed from: a */
    public void mo6060a(int i10) {
        TbsLog.m6248i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportTbsLog] httpResponseCode=" + i10);
    }
}
