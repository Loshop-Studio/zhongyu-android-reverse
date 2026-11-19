package com.tencent.smtt.utils;

import android.widget.Toast;

/* renamed from: com.tencent.smtt.utils.i */
/* loaded from: classes4.dex */
class RunnableC6852i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C6849f f6980a;

    public RunnableC6852i(C6849f c6849f) {
        this.f6980a = c6849f;
    }

    @Override // java.lang.Runnable
    public void run() {
        Toast.makeText(this.f6980a.f6972b, "下载失败，请检查网络", 0).show();
    }
}
