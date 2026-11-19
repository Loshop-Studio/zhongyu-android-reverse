package com.tencent.smtt.sdk;

import com.tencent.smtt.utils.C6857n;
import com.tencent.smtt.utils.TbsLog;

/* renamed from: com.tencent.smtt.sdk.ah */
/* loaded from: classes4.dex */
final class C6782ah implements C6857n.a {

    /* renamed from: a */
    final /* synthetic */ boolean f6806a;

    /* renamed from: b */
    final /* synthetic */ TbsDownloadConfig f6807b;

    public C6782ah(boolean z10, TbsDownloadConfig tbsDownloadConfig) {
        this.f6806a = z10;
        this.f6807b = tbsDownloadConfig;
    }

    @Override // com.tencent.smtt.utils.C6857n.a
    /* renamed from: a */
    public void mo6060a(int i10) {
        TbsDownloadConfig tbsDownloadConfig;
        int i11;
        TbsLog.m6248i(TbsDownloader.LOGTAG, "[TbsDownloader.sendRequest] httpResponseCode=" + i10);
        if (i10 >= 300) {
            if (this.f6806a) {
                tbsDownloadConfig = this.f6807b;
                i11 = -107;
            } else {
                tbsDownloadConfig = this.f6807b;
                i11 = -207;
            }
            tbsDownloadConfig.setDownloadInterruptCode(i11);
        }
    }
}
