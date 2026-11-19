package com.tencent.smtt.utils;

/* renamed from: com.tencent.smtt.utils.h */
/* loaded from: classes4.dex */
class RunnableC6851h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f6978a;

    /* renamed from: b */
    final /* synthetic */ C6849f f6979b;

    public RunnableC6851h(C6849f c6849f, int i10) {
        this.f6979b = c6849f;
        this.f6978a = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6979b.f6975e.setText("已下载" + this.f6978a + "%");
    }
}
