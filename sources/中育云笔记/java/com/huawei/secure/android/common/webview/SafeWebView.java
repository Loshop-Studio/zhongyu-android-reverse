package com.huawei.secure.android.common.webview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Arrays;
import java.util.Map;
import p130e6.AbstractC9107b;
import p145f6.AbstractC9197a;
import p145f6.AbstractC9200d;
import p145f6.InterfaceC9201e;

/* loaded from: classes5.dex */
public class SafeWebView extends WebView {

    /* renamed from: c */
    public String f11888c;

    /* renamed from: d */
    public String[] f11889d;

    /* renamed from: e */
    public String[] f11890e;

    /* renamed from: f */
    public String[] f11891f;

    /* renamed from: com.huawei.secure.android.common.webview.SafeWebView$b */
    public final class C7364b extends WebViewClient {

        /* renamed from: a */
        public WebViewClient f11892a;

        /* renamed from: b */
        public boolean f11893b;

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.doUpdateVisitedHistory(webView, str, z10);
            } else {
                super.doUpdateVisitedHistory(webView, str, z10);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            } else {
                super.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.onPageCommitVisible(webView, str);
            } else {
                super.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            } else {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null && !this.f11893b) {
                webViewClient.onPageStarted(webView, str, bitmap);
            } else if (SafeWebView.this.m8835c(str)) {
                super.onPageStarted(webView, str, bitmap);
            } else {
                SafeWebView.this.m8836d(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, i10, str, str2);
            } else {
                super.onReceivedError(webView, i10, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            } else {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            } else {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewClient webViewClient = this.f11892a;
            return webViewClient != null ? webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i10, safeBrowsingResponse);
            } else {
                super.onSafeBrowsingHit(webView, webResourceRequest, i10, safeBrowsingResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f10, float f11) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.onScaleChanged(webView, f10, f11);
            } else {
                super.onScaleChanged(webView, f10, f11);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onTooManyRedirects(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.onTooManyRedirects(webView, message, message2);
            } else {
                super.onTooManyRedirects(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            } else {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f11892a;
            return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, webResourceRequest) : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f11892a;
            return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null && !this.f11893b) {
                return webViewClient.shouldOverrideUrlLoading(webView, str);
            }
            if (SafeWebView.this.m8835c(str)) {
                WebViewClient webViewClient2 = this.f11892a;
                return webViewClient2 != null ? webViewClient2.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
            }
            SafeWebView.this.m8836d(webView, str);
            return false;
        }

        public C7364b(WebViewClient webViewClient, boolean z10) {
            this.f11892a = webViewClient;
            this.f11893b = z10;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            } else {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView, str);
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f11892a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public SafeWebView(Context context) {
        super(context);
        m8833a();
    }

    /* renamed from: a */
    public final void m8833a() {
        AbstractC9197a.m18083f(this);
        setWebViewClient(null);
    }

    /* renamed from: b */
    public final boolean m8834b(String str) {
        return URLUtil.isHttpUrl(str);
    }

    /* renamed from: c */
    public boolean m8835c(String str) {
        if (TextUtils.isEmpty(str)) {
            AbstractC9107b.m17903d("SafeWebView", "url is null");
            return false;
        }
        if (!URLUtil.isNetworkUrl(str)) {
            return true;
        }
        String[] whitelistWithPath = getWhitelistWithPath();
        String[] whitelistNotMatchSubDomain = getWhitelistNotMatchSubDomain();
        String[] whitelist = getWhitelist();
        boolean z10 = whitelistWithPath == null || whitelistWithPath.length == 0;
        boolean z11 = whitelistNotMatchSubDomain == null || whitelistNotMatchSubDomain.length == 0;
        boolean z12 = whitelist == null || whitelist.length == 0;
        if (z10 && z11 && z12) {
            return true;
        }
        return (whitelistWithPath == null || whitelistWithPath.length == 0) ? (whitelistNotMatchSubDomain == null || whitelistNotMatchSubDomain.length == 0) ? AbstractC9200d.m18091e(str, whitelist) : AbstractC9200d.m18094h(str, whitelistNotMatchSubDomain) : AbstractC9200d.m18089c(str, whitelistWithPath);
    }

    /* renamed from: d */
    public final void m8836d(WebView webView, String str) {
        AbstractC9107b.m17904e("SafeWebView", "onCheckError url is not in white list ", str);
        webView.stopLoading();
        String defaultErrorPage = getDefaultErrorPage();
        if (TextUtils.isEmpty(defaultErrorPage)) {
            getWebViewLoadCallBack();
        } else {
            webView.loadUrl(defaultErrorPage);
        }
    }

    public String getDefaultErrorPage() {
        return this.f11888c;
    }

    public InterfaceC9201e getWebViewLoadCallBack() {
        return null;
    }

    @TargetApi(9)
    @Deprecated
    public String[] getWhitelist() {
        String[] strArr = this.f11889d;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public String[] getWhitelistNotMatchSubDomain() {
        String[] strArr = this.f11890e;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public String[] getWhitelistNotMathcSubDomain() {
        String[] strArr = this.f11890e;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public String[] getWhitelistWithPath() {
        String[] strArr = this.f11891f;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!m8834b(str)) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            return;
        }
        Log.e("SafeWebView", "loadDataWithBaseURL: http url , not safe");
        if (TextUtils.isEmpty(this.f11888c)) {
            getWebViewLoadCallBack();
        } else {
            super.loadDataWithBaseURL(this.f11888c, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (m8835c(str) && !m8834b(str)) {
            super.loadUrl(str);
            return;
        }
        Log.e("SafeWebView", "loadUrl: url is not in white list or http url not safe");
        if (TextUtils.isEmpty(this.f11888c)) {
            getWebViewLoadCallBack();
        } else {
            super.loadUrl(this.f11888c);
        }
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        if (m8835c(str) && !m8834b(str)) {
            super.postUrl(str, bArr);
            return;
        }
        Log.e("SafeWebView", "postUrl: url is not in white list or http url not safe");
        if (TextUtils.isEmpty(this.f11888c)) {
            getWebViewLoadCallBack();
        } else {
            super.postUrl(this.f11888c, bArr);
        }
    }

    public void setDefaultErrorPage(String str) {
        this.f11888c = str;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new C7364b(webViewClient, true));
    }

    @TargetApi(9)
    @Deprecated
    public void setWhitelist(String[] strArr) {
        this.f11889d = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void setWhitelistNotMatchSubDomain(String[] strArr) {
        this.f11890e = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public void setWhitelistNotMathcSubDomain(String[] strArr) {
        this.f11890e = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public void setWhitelistWithPath(String[] strArr) {
        this.f11891f = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public SafeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8833a();
    }

    public SafeWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m8833a();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map map) {
        if (m8835c(str) && !m8834b(str)) {
            super.loadUrl(str, map);
            return;
        }
        Log.e("SafeWebView", "loadUrl: url is not in white list or http url not safe");
        if (!TextUtils.isEmpty(this.f11888c)) {
            super.loadUrl(this.f11888c, map);
        } else {
            getWebViewLoadCallBack();
        }
    }

    public void setWebViewLoadCallBack(InterfaceC9201e interfaceC9201e) {
    }
}
