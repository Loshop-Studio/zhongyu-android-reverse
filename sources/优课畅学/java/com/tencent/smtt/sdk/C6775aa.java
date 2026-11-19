package com.tencent.smtt.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebResourceError;
import com.tencent.smtt.export.external.interfaces.ClientCertRequest;
import com.tencent.smtt.export.external.interfaces.HttpAuthHandler;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.utils.C6862s;
import com.tencent.smtt.utils.C6868y;
import com.tencent.smtt.utils.TbsLog;
import java.io.InputStream;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Map;

@SuppressLint({"NewApi", "Override"})
/* renamed from: com.tencent.smtt.sdk.aa */
/* loaded from: classes4.dex */
class C6775aa extends android.webkit.WebViewClient {

    /* renamed from: c */
    private static String f6756c;

    /* renamed from: a */
    private WebViewClient f6757a;

    /* renamed from: b */
    private WebView f6758b;

    /* renamed from: com.tencent.smtt.sdk.aa$a */
    public static class a extends ClientCertRequest {

        /* renamed from: a */
        private android.webkit.ClientCertRequest f6759a;

        public a(android.webkit.ClientCertRequest clientCertRequest) {
            this.f6759a = clientCertRequest;
        }

        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public void cancel() {
            this.f6759a.cancel();
        }

        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public String getHost() {
            return this.f6759a.getHost();
        }

        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public String[] getKeyTypes() {
            return this.f6759a.getKeyTypes();
        }

        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public int getPort() {
            return this.f6759a.getPort();
        }

        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public Principal[] getPrincipals() {
            return this.f6759a.getPrincipals();
        }

        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public void ignore() {
            this.f6759a.ignore();
        }

        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public void proceed(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
            this.f6759a.proceed(privateKey, x509CertificateArr);
        }
    }

    /* renamed from: com.tencent.smtt.sdk.aa$b */
    public static class b implements HttpAuthHandler {

        /* renamed from: a */
        private android.webkit.HttpAuthHandler f6760a;

        public b(android.webkit.HttpAuthHandler httpAuthHandler) {
            this.f6760a = httpAuthHandler;
        }

        @Override // com.tencent.smtt.export.external.interfaces.HttpAuthHandler
        public void cancel() {
            this.f6760a.cancel();
        }

        @Override // com.tencent.smtt.export.external.interfaces.HttpAuthHandler
        public void proceed(String str, String str2) {
            this.f6760a.proceed(str, str2);
        }

        @Override // com.tencent.smtt.export.external.interfaces.HttpAuthHandler
        public boolean useHttpAuthUsernamePassword() {
            return this.f6760a.useHttpAuthUsernamePassword();
        }
    }

    /* renamed from: com.tencent.smtt.sdk.aa$c */
    public static class c implements SslErrorHandler {

        /* renamed from: a */
        android.webkit.SslErrorHandler f6761a;

        public c(android.webkit.SslErrorHandler sslErrorHandler) {
            this.f6761a = sslErrorHandler;
        }

        @Override // com.tencent.smtt.export.external.interfaces.SslErrorHandler
        public void cancel() {
            this.f6761a.cancel();
        }

        @Override // com.tencent.smtt.export.external.interfaces.SslErrorHandler
        public void proceed() {
            this.f6761a.proceed();
        }
    }

    /* renamed from: com.tencent.smtt.sdk.aa$d */
    public static class d implements SslError {

        /* renamed from: a */
        android.net.http.SslError f6762a;

        public d(android.net.http.SslError sslError) {
            this.f6762a = sslError;
        }

        @Override // com.tencent.smtt.export.external.interfaces.SslError
        public boolean addError(int i10) {
            return this.f6762a.addError(i10);
        }

        @Override // com.tencent.smtt.export.external.interfaces.SslError
        public SslCertificate getCertificate() {
            return this.f6762a.getCertificate();
        }

        @Override // com.tencent.smtt.export.external.interfaces.SslError
        public int getPrimaryError() {
            return this.f6762a.getPrimaryError();
        }

        @Override // com.tencent.smtt.export.external.interfaces.SslError
        public boolean hasError(int i10) {
            return this.f6762a.hasError(i10);
        }
    }

    /* renamed from: com.tencent.smtt.sdk.aa$e */
    public class e implements WebResourceRequest {

        /* renamed from: b */
        private String f6764b;

        /* renamed from: c */
        private boolean f6765c;

        /* renamed from: d */
        private boolean f6766d;

        /* renamed from: e */
        private String f6767e;

        /* renamed from: f */
        private Map<String, String> f6768f;

        public e(String str, boolean z10, boolean z11, String str2, Map<String, String> map) {
            this.f6764b = str;
            this.f6765c = z10;
            this.f6766d = z11;
            this.f6767e = str2;
            this.f6768f = map;
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public String getMethod() {
            return this.f6767e;
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public Map<String, String> getRequestHeaders() {
            return this.f6768f;
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public Uri getUrl() {
            return Uri.parse(this.f6764b);
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean hasGesture() {
            return this.f6766d;
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean isForMainFrame() {
            return this.f6765c;
        }
    }

    /* renamed from: com.tencent.smtt.sdk.aa$f */
    public static class f implements WebResourceRequest {

        /* renamed from: a */
        android.webkit.WebResourceRequest f6769a;

        public f(android.webkit.WebResourceRequest webResourceRequest) {
            this.f6769a = webResourceRequest;
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public String getMethod() {
            return this.f6769a.getMethod();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public Map<String, String> getRequestHeaders() {
            return this.f6769a.getRequestHeaders();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public Uri getUrl() {
            return this.f6769a.getUrl();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean hasGesture() {
            return this.f6769a.hasGesture();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean isForMainFrame() {
            return this.f6769a.isForMainFrame();
        }
    }

    /* renamed from: com.tencent.smtt.sdk.aa$g */
    public static class g extends WebResourceResponse {

        /* renamed from: a */
        android.webkit.WebResourceResponse f6770a;

        public g(android.webkit.WebResourceResponse webResourceResponse) {
            this.f6770a = webResourceResponse;
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public InputStream getData() {
            return this.f6770a.getData();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public String getEncoding() {
            return this.f6770a.getEncoding();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public String getMimeType() {
            return this.f6770a.getMimeType();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public String getReasonPhrase() {
            return this.f6770a.getReasonPhrase();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public Map<String, String> getResponseHeaders() {
            return this.f6770a.getResponseHeaders();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public int getStatusCode() {
            return this.f6770a.getStatusCode();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public void setData(InputStream inputStream) {
            this.f6770a.setData(inputStream);
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public void setEncoding(String str) {
            this.f6770a.setEncoding(str);
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public void setMimeType(String str) {
            this.f6770a.setMimeType(str);
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public void setResponseHeaders(Map<String, String> map) {
            this.f6770a.setResponseHeaders(map);
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public void setStatusCodeAndReasonPhrase(int i10, String str) {
            this.f6770a.setStatusCodeAndReasonPhrase(i10, str);
        }
    }

    public C6775aa(WebView webView, WebViewClient webViewClient) {
        this.f6758b = webView;
        this.f6757a = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(android.webkit.WebView webView, String str, boolean z10) {
        this.f6758b.m5967a(webView);
        this.f6757a.doUpdateVisitedHistory(this.f6758b, str, z10);
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(android.webkit.WebView webView, Message message, Message message2) {
        this.f6758b.m5967a(webView);
        this.f6757a.onFormResubmission(this.f6758b, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, String str) {
        this.f6758b.m5967a(webView);
        this.f6757a.onLoadResource(this.f6758b, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, String str) throws Throwable {
        C6868y c6868yM6396a;
        if (f6756c == null && (c6868yM6396a = C6868y.m6396a()) != null) {
            c6868yM6396a.m6399a(true);
            f6756c = Boolean.toString(true);
        }
        this.f6758b.m5967a(webView);
        WebView webView2 = this.f6758b;
        webView2.f6706a++;
        this.f6757a.onPageFinished(webView2, str);
        if (TbsConfig.APP_QZONE.equals(webView.getContext().getApplicationInfo().packageName)) {
            this.f6758b.m5966a(webView.getContext());
        }
        TbsLog.app_extra("SystemWebViewClient", webView.getContext());
        WebView.m5956c();
        if (!TbsShareManager.mHasQueryed && this.f6758b.getContext() != null && TbsShareManager.isThirdPartyApp(this.f6758b.getContext())) {
            TbsShareManager.mHasQueryed = true;
            new Thread(new RunnableC6776ab(this)).start();
        }
        if (this.f6758b.getContext() == null || TbsLogReport.m5877a(this.f6758b.getContext()).m5902e()) {
            return;
        }
        TbsLogReport.m5877a(this.f6758b.getContext()).m5896a(true);
        TbsLogReport.m5877a(this.f6758b.getContext()).m5897b();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, String str, Bitmap bitmap) {
        this.f6758b.m5967a(webView);
        this.f6757a.onPageStarted(this.f6758b, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(android.webkit.WebView webView, android.webkit.ClientCertRequest clientCertRequest) {
        this.f6758b.m5967a(webView);
        this.f6757a.onReceivedClientCertRequest(this.f6758b, new a(clientCertRequest));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, int i10, String str, String str2) {
        this.f6758b.m5967a(webView);
        this.f6757a.onReceivedError(this.f6758b, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f6758b.m5967a(webView);
        this.f6757a.onReceivedHttpAuthRequest(this.f6758b, new b(httpAuthHandler), str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        this.f6758b.m5967a(webView);
        this.f6757a.onReceivedHttpError(this.f6758b, new f(webResourceRequest), new g(webResourceResponse));
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(12)
    public void onReceivedLoginRequest(android.webkit.WebView webView, String str, String str2, String str3) {
        this.f6758b.m5967a(webView);
        this.f6757a.onReceivedLoginRequest(this.f6758b, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(8)
    public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        this.f6758b.m5967a(webView);
        this.f6757a.onReceivedSslError(this.f6758b, new c(sslErrorHandler), new d(sslError));
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(android.webkit.WebView webView, float f10, float f11) {
        this.f6758b.m5967a(webView);
        this.f6757a.onScaleChanged(this.f6758b, f10, f11);
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(android.webkit.WebView webView, Message message, Message message2) {
        this.f6758b.m5967a(webView);
        this.f6757a.onTooManyRedirects(this.f6758b, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(android.webkit.WebView webView, KeyEvent keyEvent) {
        this.f6758b.m5967a(webView);
        this.f6757a.onUnhandledKeyEvent(this.f6758b, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null) {
            return null;
        }
        WebResourceResponse webResourceResponseShouldInterceptRequest = this.f6757a.shouldInterceptRequest(this.f6758b, new e(webResourceRequest.getUrl().toString(), webResourceRequest.isForMainFrame(), webResourceRequest.hasGesture(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders()));
        if (webResourceResponseShouldInterceptRequest == null) {
            return null;
        }
        android.webkit.WebResourceResponse webResourceResponse = new android.webkit.WebResourceResponse(webResourceResponseShouldInterceptRequest.getMimeType(), webResourceResponseShouldInterceptRequest.getEncoding(), webResourceResponseShouldInterceptRequest.getData());
        webResourceResponse.setResponseHeaders(webResourceResponseShouldInterceptRequest.getResponseHeaders());
        int statusCode = webResourceResponseShouldInterceptRequest.getStatusCode();
        String reasonPhrase = webResourceResponseShouldInterceptRequest.getReasonPhrase();
        if (statusCode == webResourceResponse.getStatusCode() && (reasonPhrase == null || reasonPhrase.equals(webResourceResponse.getReasonPhrase()))) {
            return webResourceResponse;
        }
        webResourceResponse.setStatusCodeAndReasonPhrase(statusCode, reasonPhrase);
        return webResourceResponse;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(android.webkit.WebView webView, KeyEvent keyEvent) {
        this.f6758b.m5967a(webView);
        return this.f6757a.shouldOverrideKeyEvent(this.f6758b, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, String str) {
        if (str == null || this.f6758b.showDebugView(str)) {
            return true;
        }
        this.f6758b.m5967a(webView);
        if (C6862s.m6355a().m6368a(this.f6758b.getContext().getApplicationContext(), str)) {
            return true;
        }
        return this.f6757a.shouldOverrideUrlLoading(this.f6758b, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f6758b.m5967a(webView);
        this.f6757a.onReceivedError(this.f6758b, webResourceRequest != null ? new f(webResourceRequest) : null, webResourceError != null ? new C6777ac(this, webResourceError) : null);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, String str) {
        WebResourceResponse webResourceResponseShouldInterceptRequest = this.f6757a.shouldInterceptRequest(this.f6758b, str);
        if (webResourceResponseShouldInterceptRequest == null) {
            return null;
        }
        return new android.webkit.WebResourceResponse(webResourceResponseShouldInterceptRequest.getMimeType(), webResourceResponseShouldInterceptRequest.getEncoding(), webResourceResponseShouldInterceptRequest.getData());
    }
}
