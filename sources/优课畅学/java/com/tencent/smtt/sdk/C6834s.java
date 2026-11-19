package com.tencent.smtt.sdk;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import com.tencent.smtt.export.external.interfaces.ClientCertRequest;
import com.tencent.smtt.export.external.interfaces.HttpAuthHandler;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewClient;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceError;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.export.external.proxy.X5ProxyWebViewClient;
import com.tencent.smtt.utils.C6862s;
import com.tencent.smtt.utils.C6868y;
import com.tencent.smtt.utils.TbsLog;

/* renamed from: com.tencent.smtt.sdk.s */
/* loaded from: classes4.dex */
class C6834s extends X5ProxyWebViewClient {

    /* renamed from: c */
    private static String f6925c;

    /* renamed from: a */
    private WebViewClient f6926a;

    /* renamed from: b */
    private WebView f6927b;

    public C6834s(IX5WebViewClient iX5WebViewClient, WebView webView, WebViewClient webViewClient) {
        super(iX5WebViewClient);
        this.f6927b = webView;
        this.f6926a = webViewClient;
        webViewClient.f6728a = this;
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient
    public void countPVContentCacheCallBack(String str) {
        this.f6927b.f6706a++;
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void doUpdateVisitedHistory(IX5WebViewBase iX5WebViewBase, String str, boolean z10) {
        this.f6927b.m5968a(iX5WebViewBase);
        this.f6926a.doUpdateVisitedHistory(this.f6927b, str, z10);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onDetectedBlankScreen(IX5WebViewBase iX5WebViewBase, String str, int i10) {
        this.f6927b.m5968a(iX5WebViewBase);
        this.f6926a.onDetectedBlankScreen(str, i10);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onFormResubmission(IX5WebViewBase iX5WebViewBase, Message message, Message message2) {
        this.f6927b.m5968a(iX5WebViewBase);
        this.f6926a.onFormResubmission(this.f6927b, message, message2);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onLoadResource(IX5WebViewBase iX5WebViewBase, String str) {
        this.f6927b.m5968a(iX5WebViewBase);
        this.f6926a.onLoadResource(this.f6927b, str);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageFinished(IX5WebViewBase iX5WebViewBase, int i10, int i11, String str) throws Throwable {
        C6868y c6868yM6396a;
        if (f6925c == null && (c6868yM6396a = C6868y.m6396a()) != null) {
            c6868yM6396a.m6399a(false);
            f6925c = Boolean.toString(false);
        }
        this.f6927b.m5968a(iX5WebViewBase);
        WebView webView = this.f6927b;
        webView.f6706a++;
        this.f6926a.onPageFinished(webView, str);
        if (TbsConfig.APP_QZONE.equals(iX5WebViewBase.getView().getContext().getApplicationInfo().packageName)) {
            this.f6927b.m5966a(iX5WebViewBase.getView().getContext());
        }
        TbsLog.app_extra("SmttWebViewClient", iX5WebViewBase.getView().getContext());
        try {
            super.onPageFinished(iX5WebViewBase, i10, i11, str);
        } catch (Exception unused) {
        }
        WebView.m5956c();
        if (!TbsShareManager.mHasQueryed && this.f6927b.getContext() != null && TbsShareManager.isThirdPartyApp(this.f6927b.getContext())) {
            TbsShareManager.mHasQueryed = true;
            new Thread(new RunnableC6835t(this)).start();
        }
        if (this.f6927b.getContext() == null || TbsLogReport.m5877a(this.f6927b.getContext()).m5902e()) {
            return;
        }
        TbsLogReport.m5877a(this.f6927b.getContext()).m5896a(true);
        TbsLogReport.m5877a(this.f6927b.getContext()).m5897b();
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageStarted(IX5WebViewBase iX5WebViewBase, int i10, int i11, String str, Bitmap bitmap) {
        this.f6927b.m5968a(iX5WebViewBase);
        this.f6926a.onPageStarted(this.f6927b, str, bitmap);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedClientCertRequest(IX5WebViewBase iX5WebViewBase, ClientCertRequest clientCertRequest) {
        this.f6927b.m5968a(iX5WebViewBase);
        this.f6926a.onReceivedClientCertRequest(this.f6927b, clientCertRequest);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedError(IX5WebViewBase iX5WebViewBase, int i10, String str, String str2) {
        if (i10 < -15) {
            if (i10 != -17) {
                return;
            } else {
                i10 = -1;
            }
        }
        this.f6927b.m5968a(iX5WebViewBase);
        this.f6926a.onReceivedError(this.f6927b, i10, str, str2);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedHttpAuthRequest(IX5WebViewBase iX5WebViewBase, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f6927b.m5968a(iX5WebViewBase);
        this.f6926a.onReceivedHttpAuthRequest(this.f6927b, httpAuthHandler, str, str2);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedHttpError(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f6927b.m5968a(iX5WebViewBase);
        this.f6926a.onReceivedHttpError(this.f6927b, webResourceRequest, webResourceResponse);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedLoginRequest(IX5WebViewBase iX5WebViewBase, String str, String str2, String str3) {
        this.f6927b.m5968a(iX5WebViewBase);
        this.f6926a.onReceivedLoginRequest(this.f6927b, str, str2, str3);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedSslError(IX5WebViewBase iX5WebViewBase, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f6927b.m5968a(iX5WebViewBase);
        this.f6926a.onReceivedSslError(this.f6927b, sslErrorHandler, sslError);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onScaleChanged(IX5WebViewBase iX5WebViewBase, float f10, float f11) {
        this.f6927b.m5968a(iX5WebViewBase);
        this.f6926a.onScaleChanged(this.f6927b, f10, f11);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onTooManyRedirects(IX5WebViewBase iX5WebViewBase, Message message, Message message2) {
        this.f6927b.m5968a(iX5WebViewBase);
        this.f6926a.onTooManyRedirects(this.f6927b, message, message2);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onUnhandledKeyEvent(IX5WebViewBase iX5WebViewBase, KeyEvent keyEvent) {
        this.f6927b.m5968a(iX5WebViewBase);
        this.f6926a.onUnhandledKeyEvent(this.f6927b, keyEvent);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public WebResourceResponse shouldInterceptRequest(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest) {
        this.f6927b.m5968a(iX5WebViewBase);
        return this.f6926a.shouldInterceptRequest(this.f6927b, webResourceRequest);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean shouldOverrideKeyEvent(IX5WebViewBase iX5WebViewBase, KeyEvent keyEvent) {
        this.f6927b.m5968a(iX5WebViewBase);
        return this.f6926a.shouldOverrideKeyEvent(this.f6927b, keyEvent);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean shouldOverrideUrlLoading(IX5WebViewBase iX5WebViewBase, String str) {
        if (str == null || this.f6927b.showDebugView(str)) {
            return true;
        }
        this.f6927b.m5968a(iX5WebViewBase);
        if (C6862s.m6355a().m6368a(this.f6927b.getContext().getApplicationContext(), str)) {
            return true;
        }
        boolean zShouldOverrideUrlLoading = this.f6926a.shouldOverrideUrlLoading(this.f6927b, str);
        if (!zShouldOverrideUrlLoading) {
            if (str.startsWith("wtai://wp/mc;")) {
                this.f6927b.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(WebView.SCHEME_TEL + str.substring(13))));
                return true;
            }
            if (str.startsWith(WebView.SCHEME_TEL)) {
                m6233a(str);
                return true;
            }
        }
        return zShouldOverrideUrlLoading;
    }

    /* renamed from: a */
    public void m6232a(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(this.f6927b.m5969b(), 0, 0, str, bitmap);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageFinished(IX5WebViewBase iX5WebViewBase, String str) throws Throwable {
        onPageFinished(iX5WebViewBase, 0, 0, str);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageStarted(IX5WebViewBase iX5WebViewBase, String str, Bitmap bitmap) {
        onPageStarted(iX5WebViewBase, 0, 0, str, bitmap);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedError(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f6927b.m5968a(iX5WebViewBase);
        this.f6926a.onReceivedError(this.f6927b, webResourceRequest, webResourceError);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public WebResourceResponse shouldInterceptRequest(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest, Bundle bundle) {
        this.f6927b.m5968a(iX5WebViewBase);
        return this.f6926a.shouldInterceptRequest(this.f6927b, webResourceRequest, bundle);
    }

    /* renamed from: a */
    public void m6233a(String str) {
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(str));
        intent.addFlags(268435456);
        try {
            if (this.f6927b.getContext() != null) {
                this.f6927b.getContext().startActivity(intent);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public WebResourceResponse shouldInterceptRequest(IX5WebViewBase iX5WebViewBase, String str) {
        this.f6927b.m5968a(iX5WebViewBase);
        return this.f6926a.shouldInterceptRequest(this.f6927b, str);
    }
}
