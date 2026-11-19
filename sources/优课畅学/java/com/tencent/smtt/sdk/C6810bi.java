package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.smtt.utils.Apn;

/* renamed from: com.tencent.smtt.sdk.bi */
/* loaded from: classes4.dex */
class C6810bi extends Thread {

    /* renamed from: a */
    final /* synthetic */ Context f6866a;

    /* renamed from: b */
    final /* synthetic */ WebView f6867b;

    public C6810bi(WebView webView, Context context) {
        this.f6867b = webView;
        this.f6866a = context;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            QbSdk.f6576e = Apn.getApnType(this.f6866a) == 3;
            QbSdk.f6577f = System.currentTimeMillis();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.f6866a.getApplicationContext().registerReceiver(WebView.f6698n, intentFilter);
        } catch (Throwable unused) {
        }
    }
}
