package com.tencent.smtt.sdk;

/* renamed from: com.tencent.smtt.sdk.ab */
/* loaded from: classes4.dex */
class RunnableC6776ab implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C6775aa f6771a;

    public RunnableC6776ab(C6775aa c6775aa) {
        this.f6771a = c6775aa;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (TbsShareManager.forceLoadX5FromTBSDemo(this.f6771a.f6758b.getContext()) || !TbsDownloader.needDownload(this.f6771a.f6758b.getContext(), false)) {
            return;
        }
        TbsDownloader.startDownload(this.f6771a.f6758b.getContext());
    }
}
