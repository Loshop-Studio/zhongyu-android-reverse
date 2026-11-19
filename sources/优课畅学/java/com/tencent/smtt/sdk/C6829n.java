package com.tencent.smtt.sdk;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.QuotaUpdater;
import com.tencent.smtt.export.external.proxy.X5ProxyWebChromeClient;
import com.tencent.smtt.sdk.WebStorage;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebView.WebViewTransport;

/* renamed from: com.tencent.smtt.sdk.n */
/* loaded from: classes4.dex */
class C6829n extends X5ProxyWebChromeClient {

    /* renamed from: a */
    private WebView f6912a;

    /* renamed from: b */
    private WebChromeClient f6913b;

    /* renamed from: com.tencent.smtt.sdk.n$a */
    public class a implements WebStorage.QuotaUpdater {

        /* renamed from: a */
        QuotaUpdater f6914a;

        public a(QuotaUpdater quotaUpdater) {
            this.f6914a = quotaUpdater;
        }

        @Override // com.tencent.smtt.sdk.WebStorage.QuotaUpdater
        public void updateQuota(long j10) {
            this.f6914a.updateQuota(j10);
        }
    }

    public C6829n(IX5WebChromeClient iX5WebChromeClient, WebView webView, WebChromeClient webChromeClient) {
        super(iX5WebChromeClient);
        this.f6912a = webView;
        this.f6913b = webChromeClient;
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return this.f6913b.getDefaultVideoPoster();
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void getVisitedHistory(android.webkit.ValueCallback<String[]> valueCallback) {
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onCloseWindow(IX5WebViewBase iX5WebViewBase) {
        this.f6912a.m5968a(iX5WebViewBase);
        this.f6913b.onCloseWindow(this.f6912a);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onConsoleMessage(String str, int i10, String str2) {
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onCreateWindow(IX5WebViewBase iX5WebViewBase, boolean z10, boolean z11, Message message) {
        WebView webView = this.f6912a;
        webView.getClass();
        WebView.WebViewTransport webViewTransport = webView.new WebViewTransport();
        Message messageObtain = Message.obtain(message.getTarget(), new RunnableC6830o(this, webViewTransport, message));
        messageObtain.obj = webViewTransport;
        return this.f6913b.onCreateWindow(this.f6912a, z10, z11, messageObtain);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, QuotaUpdater quotaUpdater) {
        this.f6913b.onExceededDatabaseQuota(str, str2, j10, j11, j12, new a(quotaUpdater));
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        this.f6913b.onGeolocationPermissionsHidePrompt();
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissionsCallback geolocationPermissionsCallback) {
        this.f6913b.onGeolocationPermissionsShowPrompt(str, geolocationPermissionsCallback);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onHideCustomView() {
        this.f6913b.onHideCustomView();
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onJsAlert(IX5WebViewBase iX5WebViewBase, String str, String str2, JsResult jsResult) {
        this.f6912a.m5968a(iX5WebViewBase);
        return this.f6913b.onJsAlert(this.f6912a, str, str2, jsResult);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onJsBeforeUnload(IX5WebViewBase iX5WebViewBase, String str, String str2, JsResult jsResult) {
        this.f6912a.m5968a(iX5WebViewBase);
        return this.f6913b.onJsBeforeUnload(this.f6912a, str, str2, jsResult);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onJsConfirm(IX5WebViewBase iX5WebViewBase, String str, String str2, JsResult jsResult) {
        this.f6912a.m5968a(iX5WebViewBase);
        return this.f6913b.onJsConfirm(this.f6912a, str, str2, jsResult);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onJsPrompt(IX5WebViewBase iX5WebViewBase, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        this.f6912a.m5968a(iX5WebViewBase);
        return this.f6913b.onJsPrompt(this.f6912a, str, str2, str3, jsPromptResult);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onJsTimeout() {
        return this.f6913b.onJsTimeout();
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onProgressChanged(IX5WebViewBase iX5WebViewBase, int i10) {
        this.f6912a.m5968a(iX5WebViewBase);
        this.f6913b.onProgressChanged(this.f6912a, i10);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onReachedMaxAppCacheSize(long j10, long j11, QuotaUpdater quotaUpdater) {
        this.f6913b.onReachedMaxAppCacheSize(j10, j11, new a(quotaUpdater));
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onReceivedIcon(IX5WebViewBase iX5WebViewBase, Bitmap bitmap) {
        this.f6912a.m5968a(iX5WebViewBase);
        this.f6913b.onReceivedIcon(this.f6912a, bitmap);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onReceivedTitle(IX5WebViewBase iX5WebViewBase, String str) {
        this.f6912a.m5968a(iX5WebViewBase);
        this.f6913b.onReceivedTitle(this.f6912a, str);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onReceivedTouchIconUrl(IX5WebViewBase iX5WebViewBase, String str, boolean z10) {
        this.f6912a.m5968a(iX5WebViewBase);
        this.f6913b.onReceivedTouchIconUrl(this.f6912a, str, z10);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onRequestFocus(IX5WebViewBase iX5WebViewBase) {
        this.f6912a.m5968a(iX5WebViewBase);
        this.f6913b.onRequestFocus(this.f6912a);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onShowCustomView(View view, int i10, IX5WebChromeClient.CustomViewCallback customViewCallback) {
        this.f6913b.onShowCustomView(view, i10, customViewCallback);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onShowFileChooser(IX5WebViewBase iX5WebViewBase, android.webkit.ValueCallback<Uri[]> valueCallback, IX5WebChromeClient.FileChooserParams fileChooserParams) {
        C6832q c6832q = new C6832q(this, valueCallback);
        C6833r c6833r = new C6833r(this, fileChooserParams);
        this.f6912a.m5968a(iX5WebViewBase);
        return this.f6913b.onShowFileChooser(this.f6912a, c6832q, c6833r);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void openFileChooser(android.webkit.ValueCallback<Uri[]> valueCallback, String str, String str2, boolean z10) {
        this.f6913b.openFileChooser(new C6831p(this, valueCallback), str, str2);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return this.f6913b.onConsoleMessage(consoleMessage);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebChromeClient, com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
    public void onShowCustomView(View view, IX5WebChromeClient.CustomViewCallback customViewCallback) {
        this.f6913b.onShowCustomView(view, customViewCallback);
    }
}
