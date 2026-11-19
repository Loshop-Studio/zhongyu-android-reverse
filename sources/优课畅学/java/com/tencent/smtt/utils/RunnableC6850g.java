package com.tencent.smtt.utils;

import android.widget.Toast;

/* renamed from: com.tencent.smtt.utils.g */
/* loaded from: classes4.dex */
class RunnableC6850g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C6849f f6977a;

    public RunnableC6850g(C6849f c6849f) {
        this.f6977a = c6849f;
    }

    @Override // java.lang.Runnable
    public void run() {
        Toast.makeText(this.f6977a.f6972b, "下载成功", 0).show();
        this.f6977a.f6973c.setVisibility(4);
        C6849f c6849f = this.f6977a;
        c6849f.f6976f.m6290a(c6849f.f6974d, c6849f.f6971a, c6849f.f6972b, C6848e.f6968c);
    }
}
