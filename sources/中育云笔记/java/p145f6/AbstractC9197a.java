package p145f6;

import android.webkit.WebSettings;
import android.webkit.WebView;

/* renamed from: f6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9197a {
    /* renamed from: a */
    public static void m18078a(WebSettings webSettings) {
        webSettings.setAllowContentAccess(false);
    }

    /* renamed from: b */
    public static void m18079b(WebSettings webSettings) {
        webSettings.setAllowFileAccess(false);
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
    }

    /* renamed from: c */
    public static void m18080c(WebSettings webSettings) {
        webSettings.setGeolocationEnabled(false);
    }

    /* renamed from: d */
    public static void m18081d(WebSettings webSettings) {
        webSettings.setMixedContentMode(1);
    }

    /* renamed from: f */
    public static void m18083f(WebView webView) {
        WebSettings settings = webView.getSettings();
        m18079b(settings);
        m18084g(webView);
        m18082e(settings);
        m18080c(settings);
        m18081d(settings);
        m18078a(settings);
    }

    /* renamed from: g */
    public static void m18084g(WebView webView) {
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
    }

    /* renamed from: e */
    public static void m18082e(WebSettings webSettings) {
    }
}
