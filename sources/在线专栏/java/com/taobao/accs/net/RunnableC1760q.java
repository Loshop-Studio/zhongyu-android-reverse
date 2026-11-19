package com.taobao.accs.net;

import android.text.TextUtils;

/* renamed from: com.taobao.accs.net.q */
/* loaded from: classes.dex */
class RunnableC1760q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1753j f7723a;

    RunnableC1760q(C1753j c1753j) {
        this.f7723a = c1753j;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C1753j c1753j = this.f7723a;
            if (c1753j.f7657d == null || TextUtils.isEmpty(c1753j.m6010i())) {
                return;
            }
            this.f7723a.f7695t.mo5088i("mTryStartServiceRunnable bindApp");
            C1753j c1753j2 = this.f7723a;
            c1753j2.m6001b(c1753j2.f7657d);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
