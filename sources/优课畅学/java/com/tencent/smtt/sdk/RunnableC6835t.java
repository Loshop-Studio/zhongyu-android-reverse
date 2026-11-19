package com.tencent.smtt.sdk;

/* renamed from: com.tencent.smtt.sdk.t */
/* loaded from: classes4.dex */
class RunnableC6835t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C6834s f6928a;

    public RunnableC6835t(C6834s c6834s) {
        this.f6928a = c6834s;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (TbsShareManager.forceLoadX5FromTBSDemo(this.f6928a.f6927b.getContext()) || !TbsDownloader.needDownload(this.f6928a.f6927b.getContext(), false)) {
            return;
        }
        TbsDownloader.startDownload(this.f6928a.f6927b.getContext());
    }
}
