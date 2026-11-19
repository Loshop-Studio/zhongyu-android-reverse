package p059f5;

import android.net.Uri;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.zykj.message.client.MessageClient;
import com.zykj.mistake.feature.notebook.detail.C4916z4;
import com.zykj.mistake.widget.StemWebView;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5840a;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import okhttp3.C6289c0;
import okhttp3.C6301i0;
import okhttp3.C6329q;
import okhttp3.C6330r;
import okhttp3.C6338z;
import p139p7.AbstractC6396c;
import p152r6.InterfaceC6469a;

/* renamed from: f5.e */
/* loaded from: classes3.dex */
public final class C5531e extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ StemWebView f8566a;

    public C5531e(StemWebView stemWebView) {
        this.f8566a = stemWebView;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        final StemWebView stemWebView = this.f8566a;
        String strM5407A = AbstractC5862w.m5407A("(function() {\n    var toolBar = document.querySelector('.toolBar');\n    var body = document.body;\n    var html = document.documentElement;\n    if (toolBar) toolBar.style.display = 'none';\n    if (body) body.style.paddingBottom = '0';\n    if (html) html.style.paddingBottom = '0';\n    if (removeTopSpacing) {\n        if (body) body.style.paddingTop = '0';\n        if (html) html.style.paddingTop = '0';\n        function removeBoundaryWhitespaceTextNodes(element) {\n            if (!element) return;\n            while (element.firstChild &&\n                element.firstChild.nodeType === Node.TEXT_NODE &&\n                element.firstChild.nodeValue.trim().length === 0) {\n                element.removeChild(element.firstChild);\n            }\n            while (element.lastChild &&\n                element.lastChild.nodeType === Node.TEXT_NODE &&\n                element.lastChild.nodeValue.trim().length === 0) {\n                element.removeChild(element.lastChild);\n            }\n        }\n        document.querySelectorAll('.qststem').forEach(function(element) {\n            removeBoundaryWhitespaceTextNodes(element);\n        });\n        var stem = document.querySelector('.qststem');\n        var hasText = stem && stem.textContent.trim().length > 0;\n        var hasMedia = stem && stem.querySelector('img, video, audio, canvas, svg, iframe, object, embed, table');\n        if (stem && !hasText && !hasMedia) {\n            stem.style.display = 'none';\n            var answers = document.querySelector('.answers');\n            if (answers) answers.style.marginTop = '0';\n        }\n    }\n})();", "removeTopSpacing", stemWebView.f8102i ? "true" : "false");
        if (webView != null) {
            webView.evaluateJavascript(strM5407A, new ValueCallback() { // from class: f5.d
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    InterfaceC6469a pageFinishListener = stemWebView.getPageFinishListener();
                    if (pageFinishListener != null) {
                        pageFinishListener.invoke();
                    }
                }
            });
        } else {
            InterfaceC6469a pageFinishListener = stemWebView.getPageFinishListener();
            if (pageFinishListener != null) {
                pageFinishListener.invoke();
            }
        }
        if (str != null) {
            MessageClient.INSTANCES.checkUrl(str, "错题本", "com.zykj.mistake");
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (i != -8 && i != -6 && i != -2) {
            if (i == -1 && webView != null) {
                webView.loadUrl("file:///android_asset/error.html?code=网络未连接");
                return;
            }
            return;
        }
        if (webView != null) {
            webView.loadUrl("file:///android_asset/error.html?code=" + i);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) throws EOFException {
        Object url;
        Uri url2;
        String string;
        Map mapUnmodifiableMap;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
            url = "";
        }
        Log.i("webView", "shouldInterceptRequest url -> " + url);
        if (webResourceRequest != null && (url2 = webResourceRequest.getUrl()) != null && (string = url2.toString()) != null) {
            StemWebView stemWebView = this.f8566a;
            String method = webResourceRequest.getMethod();
            AbstractC5830k.m5329f(method, "getMethod(...)");
            String lowerCase = method.toLowerCase(Locale.ROOT);
            AbstractC5830k.m5329f(lowerCase, "toLowerCase(...)");
            if ("get".equals(lowerCase)) {
                if (AbstractC5862w.m5409C(string, "https", false)) {
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
                C6330r c6330rM4285a = null;
                try {
                    C4916z4 c4916z4 = new C4916z4();
                    c4916z4.m4288d(null, string);
                    c6330rM4285a = c4916z4.m4285a();
                } catch (IllegalArgumentException unused) {
                }
                C6330r c6330r = c6330rM4285a;
                if (c6330r != null) {
                    try {
                        C6338z c6338z = stemWebView.f8096c;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C6329q c6329q = new C6329q((String[]) new ArrayList(20).toArray(new String[0]));
                        byte[] bArr = AbstractC6396c.f10486a;
                        if (linkedHashMap.isEmpty()) {
                            mapUnmodifiableMap = AbstractC5785e0.m5147A();
                        } else {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                            AbstractC5830k.m5329f(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
                        }
                        String strM5898a = C6301i0.m5898a(HttpHeaders.CONTENT_TYPE, c6338z.m5983c(new C6289c0(c6330r, "GET", c6329q, null, mapUnmodifiableMap)).m5914h());
                        if (strM5898a == null) {
                            strM5898a = "";
                        }
                        if (AbstractC5855p.m5372F(strM5898a, "text/html", false) && !AbstractC5855p.m5372F(string, stemWebView.f8095b, false)) {
                            byte[] bytes = "".getBytes(AbstractC5840a.f9235a);
                            AbstractC5830k.m5329f(bytes, "getBytes(...)");
                            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(bytes));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str != null) {
            return AbstractC5855p.m5372F(str, this.f8566a.f8095b, false);
        }
        return true;
    }
}
