package com.taobao.accs.net;

import android.text.TextUtils;

/* renamed from: com.taobao.accs.net.q */
/* loaded from: classes5.dex */
class RunnableC7657q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7650j f13121a;

    public RunnableC7657q(C7650j c7650j) {
        this.f13121a = c7650j;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C7650j c7650j = this.f13121a;
            if (c7650j.f13055d == null || TextUtils.isEmpty(c7650j.m10036i())) {
                return;
            }
            this.f13121a.f13093t.mo3538i("mTryStartServiceRunnable bindApp");
            C7650j c7650j2 = this.f13121a;
            c7650j2.m10027b(c7650j2.f13055d);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
