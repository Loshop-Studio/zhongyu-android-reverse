package com.tencent.smtt.sdk;

import android.os.Message;
import android.webkit.WebView;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.smtt.sdk.w */
/* loaded from: classes4.dex */
class RunnableC6838w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WebView.WebViewTransport f6933a;

    /* renamed from: b */
    final /* synthetic */ Message f6934b;

    /* renamed from: c */
    final /* synthetic */ SystemWebChromeClient f6935c;

    public RunnableC6838w(SystemWebChromeClient systemWebChromeClient, WebView.WebViewTransport webViewTransport, Message message) {
        this.f6935c = systemWebChromeClient;
        this.f6933a = webViewTransport;
        this.f6934b = message;
    }

    @Override // java.lang.Runnable
    public void run() {
        WebView webView = this.f6933a.getWebView();
        if (webView != null) {
            ((WebView.WebViewTransport) this.f6934b.obj).setWebView(webView.m5965a());
        }
        this.f6934b.sendToTarget();
    }
}
