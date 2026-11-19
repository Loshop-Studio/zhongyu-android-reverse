package com.tencent.smtt.sdk;

import android.R;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.sdk.WebStorage;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebView.WebViewTransport;

/* loaded from: classes4.dex */
class SystemWebChromeClient extends android.webkit.WebChromeClient {

    /* renamed from: a */
    private WebView f6598a;

    /* renamed from: b */
    private WebChromeClient f6599b;

    /* renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$a */
    public static class C6760a implements ConsoleMessage {

        /* renamed from: a */
        private ConsoleMessage.MessageLevel f6600a;

        /* renamed from: b */
        private String f6601b;

        /* renamed from: c */
        private String f6602c;

        /* renamed from: d */
        private int f6603d;

        public C6760a(android.webkit.ConsoleMessage consoleMessage) {
            this.f6600a = ConsoleMessage.MessageLevel.valueOf(consoleMessage.messageLevel().name());
            this.f6601b = consoleMessage.message();
            this.f6602c = consoleMessage.sourceId();
            this.f6603d = consoleMessage.lineNumber();
        }

        @Override // com.tencent.smtt.export.external.interfaces.ConsoleMessage
        public int lineNumber() {
            return this.f6603d;
        }

        @Override // com.tencent.smtt.export.external.interfaces.ConsoleMessage
        public String message() {
            return this.f6601b;
        }

        @Override // com.tencent.smtt.export.external.interfaces.ConsoleMessage
        public ConsoleMessage.MessageLevel messageLevel() {
            return this.f6600a;
        }

        @Override // com.tencent.smtt.export.external.interfaces.ConsoleMessage
        public String sourceId() {
            return this.f6602c;
        }

        public C6760a(String str, String str2, int i10) {
            this.f6600a = ConsoleMessage.MessageLevel.LOG;
            this.f6601b = str;
            this.f6602c = str2;
            this.f6603d = i10;
        }
    }

    /* renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$b */
    public class C6761b implements IX5WebChromeClient.CustomViewCallback {

        /* renamed from: a */
        WebChromeClient.CustomViewCallback f6604a;

        public C6761b(WebChromeClient.CustomViewCallback customViewCallback) {
            this.f6604a = customViewCallback;
        }

        @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback
        public void onCustomViewHidden() {
            this.f6604a.onCustomViewHidden();
        }
    }

    /* renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$c */
    public class C6762c implements GeolocationPermissionsCallback {

        /* renamed from: a */
        GeolocationPermissions.Callback f6606a;

        public C6762c(GeolocationPermissions.Callback callback) {
            this.f6606a = callback;
        }

        @Override // com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback
        public void invoke(String str, boolean z10, boolean z11) {
            this.f6606a.invoke(str, z10, z11);
        }
    }

    /* renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$d */
    public class C6763d implements JsPromptResult {

        /* renamed from: a */
        android.webkit.JsPromptResult f6608a;

        public C6763d(android.webkit.JsPromptResult jsPromptResult) {
            this.f6608a = jsPromptResult;
        }

        @Override // com.tencent.smtt.export.external.interfaces.JsResult
        public void cancel() {
            this.f6608a.cancel();
        }

        @Override // com.tencent.smtt.export.external.interfaces.JsResult
        public void confirm() {
            this.f6608a.confirm();
        }

        @Override // com.tencent.smtt.export.external.interfaces.JsPromptResult
        public void confirm(String str) {
            this.f6608a.confirm(str);
        }
    }

    /* renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$e */
    public class C6764e implements JsResult {

        /* renamed from: a */
        android.webkit.JsResult f6610a;

        public C6764e(android.webkit.JsResult jsResult) {
            this.f6610a = jsResult;
        }

        @Override // com.tencent.smtt.export.external.interfaces.JsResult
        public void cancel() {
            this.f6610a.cancel();
        }

        @Override // com.tencent.smtt.export.external.interfaces.JsResult
        public void confirm() {
            this.f6610a.confirm();
        }
    }

    /* renamed from: com.tencent.smtt.sdk.SystemWebChromeClient$f */
    public class C6765f implements WebStorage.QuotaUpdater {

        /* renamed from: a */
        WebStorage.QuotaUpdater f6612a;

        public C6765f(WebStorage.QuotaUpdater quotaUpdater) {
            this.f6612a = quotaUpdater;
        }

        @Override // com.tencent.smtt.sdk.WebStorage.QuotaUpdater
        public void updateQuota(long j10) {
            this.f6612a.updateQuota(j10);
        }
    }

    public SystemWebChromeClient(WebView webView, WebChromeClient webChromeClient) {
        this.f6598a = webView;
        this.f6599b = webChromeClient;
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = this.f6599b.getDefaultVideoPoster();
        if (defaultVideoPoster != null) {
            return defaultVideoPoster;
        }
        try {
            return BitmapFactory.decodeResource(this.f6598a.getResources(), R.drawable.ic_media_play);
        } catch (Exception unused) {
            return defaultVideoPoster;
        }
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public View getVideoLoadingProgressView() {
        return this.f6599b.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(android.webkit.ValueCallback<String[]> valueCallback) {
        this.f6599b.getVisitedHistory(new C6837v(this, valueCallback));
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(android.webkit.WebView webView) {
        this.f6598a.m5967a(webView);
        this.f6599b.onCloseWindow(this.f6598a);
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i10, String str2) {
        this.f6599b.onConsoleMessage(new C6760a(str, str2, i10));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(android.webkit.WebView webView, boolean z10, boolean z11, Message message) {
        WebView webView2 = this.f6598a;
        webView2.getClass();
        WebView.WebViewTransport webViewTransport = webView2.new WebViewTransport();
        Message messageObtain = Message.obtain(message.getTarget(), new RunnableC6838w(this, webViewTransport, message));
        messageObtain.obj = webViewTransport;
        return this.f6599b.onCreateWindow(this.f6598a, z10, z11, messageObtain);
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(5)
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        this.f6599b.onExceededDatabaseQuota(str, str2, j10, j11, j12, new C6765f(quotaUpdater));
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(5)
    public void onGeolocationPermissionsHidePrompt() {
        this.f6599b.onGeolocationPermissionsHidePrompt();
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(5)
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        this.f6599b.onGeolocationPermissionsShowPrompt(str, new C6762c(callback));
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public void onHideCustomView() {
        this.f6599b.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(android.webkit.WebView webView, String str, String str2, android.webkit.JsResult jsResult) {
        this.f6598a.m5967a(webView);
        return this.f6599b.onJsAlert(this.f6598a, str, str2, new C6764e(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(android.webkit.WebView webView, String str, String str2, android.webkit.JsResult jsResult) {
        this.f6598a.m5967a(webView);
        return this.f6599b.onJsBeforeUnload(this.f6598a, str, str2, new C6764e(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(android.webkit.WebView webView, String str, String str2, android.webkit.JsResult jsResult) {
        this.f6598a.m5967a(webView);
        return this.f6599b.onJsConfirm(this.f6598a, str, str2, new C6764e(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(android.webkit.WebView webView, String str, String str2, String str3, android.webkit.JsPromptResult jsPromptResult) {
        this.f6598a.m5967a(webView);
        return this.f6599b.onJsPrompt(this.f6598a, str, str2, str3, new C6763d(jsPromptResult));
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public boolean onJsTimeout() {
        return this.f6599b.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(android.webkit.WebView webView, int i10) {
        this.f6598a.m5967a(webView);
        this.f6599b.onProgressChanged(this.f6598a, i10);
    }

    @TargetApi(7)
    @Deprecated
    public void onReachedMaxAppCacheSize(long j10, long j11, WebStorage.QuotaUpdater quotaUpdater) {
        this.f6599b.onReachedMaxAppCacheSize(j10, j11, new C6765f(quotaUpdater));
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(android.webkit.WebView webView, Bitmap bitmap) {
        this.f6598a.m5967a(webView);
        this.f6599b.onReceivedIcon(this.f6598a, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(android.webkit.WebView webView, String str) {
        this.f6598a.m5967a(webView);
        this.f6599b.onReceivedTitle(this.f6598a, str);
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public void onReceivedTouchIconUrl(android.webkit.WebView webView, String str, boolean z10) {
        this.f6598a.m5967a(webView);
        this.f6599b.onReceivedTouchIconUrl(this.f6598a, str, z10);
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(android.webkit.WebView webView) {
        this.f6598a.m5967a(webView);
        this.f6599b.onRequestFocus(this.f6598a);
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(14)
    @Deprecated
    public void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f6599b.onShowCustomView(view, i10, new C6761b(customViewCallback));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(android.webkit.WebView webView, android.webkit.ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        C6840y c6840y = new C6840y(this, valueCallback);
        C6841z c6841z = new C6841z(this, fileChooserParams);
        this.f6598a.m5967a(webView);
        return this.f6599b.onShowFileChooser(this.f6598a, c6840y, c6841z);
    }

    public void openFileChooser(android.webkit.ValueCallback<Uri> valueCallback) {
        openFileChooser(valueCallback, null, null);
    }

    public void setupAutoFill(Message message) {
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        return this.f6599b.onConsoleMessage(new C6760a(consoleMessage));
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f6599b.onShowCustomView(view, new C6761b(customViewCallback));
    }

    public void openFileChooser(android.webkit.ValueCallback<Uri> valueCallback, String str) {
        openFileChooser(valueCallback, str, null);
    }

    public void openFileChooser(android.webkit.ValueCallback<Uri> valueCallback, String str, String str2) {
        this.f6599b.openFileChooser(new C6839x(this, valueCallback), str, str2);
    }
}
