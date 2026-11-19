package com.tencent.smtt.sdk;

import android.os.Message;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.smtt.sdk.o */
/* loaded from: classes4.dex */
class RunnableC6830o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WebView.WebViewTransport f6916a;

    /* renamed from: b */
    final /* synthetic */ Message f6917b;

    /* renamed from: c */
    final /* synthetic */ C6829n f6918c;

    public RunnableC6830o(C6829n c6829n, WebView.WebViewTransport webViewTransport, Message message) {
        this.f6918c = c6829n;
        this.f6916a = webViewTransport;
        this.f6917b = message;
    }

    @Override // java.lang.Runnable
    public void run() {
        WebView webView = this.f6916a.getWebView();
        if (webView != null) {
            ((IX5WebViewBase.WebViewTransport) this.f6917b.obj).setWebView(webView.m5969b());
        }
        this.f6917b.sendToTarget();
    }
}
