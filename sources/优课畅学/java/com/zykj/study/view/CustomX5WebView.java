package com.zykj.study.view;

// RE note 本类字节码直接引用的读写或显示接口包括WebView。

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.camera.video.AudioStats;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.zykj.study.view.CustomX5WebView;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.InterfaceC9129q;
import org.slf4j.Marker;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p113g8.C8660c;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class CustomX5WebView extends WebView {

    /* renamed from: a */
    public boolean f13749a;

    /* renamed from: b */
    public int f13750b;

    /* renamed from: c */
    public final MutableLiveData f13751c;

    /* renamed from: d */
    public final List f13752d;

    /* renamed from: com.zykj.study.view.CustomX5WebView$a */
    public static final class C8136a extends WebViewClient {
        public C8136a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webResourceError == null) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                return;
            }
            int errorCode = webResourceError.getErrorCode();
            if (errorCode == -1) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                return;
            }
            if (errorCode != -8 && errorCode != -6 && errorCode != -2) {
                if (webView != null) {
                    webView.loadUrl("file:///android_asset/error.html?code=打开失败");
                }
            } else if (webView != null) {
                webView.loadUrl("file:///android_asset/error.html?code=" + errorCode);
            }
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            String host;
            Uri url2;
            String scheme;
            if (webResourceRequest != null && (url2 = webResourceRequest.getUrl()) != null && (scheme = url2.getScheme()) != null && AbstractC9133u.m16128b(scheme, "data")) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (host = url.getHost()) != null && CustomX5WebView.this.m11898h(host)) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            byte[] bytes = "<div style=\"font-size: 3em;color: #B81414;text-align: center;\">No access to illegal links<div>".getBytes(C8660c.f16206b);
            AbstractC9133u.m16132f(bytes, "getBytes(...)");
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(bytes));
        }
    }

    /* renamed from: com.zykj.study.view.CustomX5WebView$b */
    public static final class C8137b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Log.e("WebChromeClient", String.valueOf(consoleMessage != null ? consoleMessage.message() : null));
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            if (i10 != 100 || webView == null) {
                return;
            }
            webView.loadUrl("javascript:App.resize(document.documentElement.clientWidth, document.documentElement.scrollHeight)");
        }
    }

    /* renamed from: com.zykj.study.view.CustomX5WebView$c */
    public static final class C8138c implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f13754a;

        public C8138c(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f13754a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f13754a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13754a.invoke(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomX5WebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9133u.m16133g(context, "context");
    }

    /* renamed from: j */
    public static final boolean m11891j(View view) {
        return true;
    }

    /* renamed from: k */
    public static final void m11892k(View view) {
    }

    /* renamed from: l */
    public static final void m11893l(final CustomX5WebView customX5WebView) {
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(customX5WebView);
        if (lifecycleOwner != null) {
            customX5WebView.f13751c.observe(lifecycleOwner, new C8138c(new InterfaceC10570l() { // from class: f5.f
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return CustomX5WebView.m11894m(this.f16025a, (RectF) obj);
                }
            }));
        }
    }

    /* renamed from: m */
    public static final C8736p m11894m(CustomX5WebView customX5WebView, RectF rectF) {
        if (rectF == null) {
            return C8736p.f16368a;
        }
        if (customX5WebView.getVisibility() == 0 && customX5WebView.f13749a) {
            int iHeight = (int) (rectF.height() * (customX5WebView.getWidth() / rectF.width()));
            int i10 = customX5WebView.f13750b;
            if (1 <= i10 && i10 < iHeight) {
                iHeight = i10;
            }
            customX5WebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, iHeight));
        }
        return C8736p.f16368a;
    }

    /* renamed from: n */
    public static final void m11895n(CustomX5WebView customX5WebView) {
        customX5WebView.loadUrl("javascript:App.resize(document.documentElement.clientWidth, document.documentElement.scrollHeight)");
    }

    /* renamed from: o */
    public static final boolean m11896o(CustomX5WebView customX5WebView, View view, MotionEvent motionEvent) {
        customX5WebView.requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* renamed from: g */
    public final void m11897g(List hostList) {
        AbstractC9133u.m16133g(hostList, "hostList");
        this.f13752d.addAll(hostList);
    }

    /* renamed from: h */
    public final boolean m11898h(String hostUrl) {
        Object obj;
        AbstractC9133u.m16133g(hostUrl, "hostUrl");
        Iterator it = this.f13752d.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) next;
            if ((AbstractC8687z.m14105M(str, Marker.ANY_MARKER, false, 2, null) && AbstractC8687z.m14111z(str, Marker.ANY_MARKER, false, 2, null)) ? AbstractC8661c0.m13973S(hostUrl, AbstractC8687z.m14101I(str, Marker.ANY_MARKER, "", false, 4, null), false, 2, null) : AbstractC8687z.m14105M(str, Marker.ANY_MARKER, false, 2, null) ? AbstractC8687z.m14111z(hostUrl, AbstractC8687z.m14101I(str, Marker.ANY_MARKER, "", false, 4, null), false, 2, null) : AbstractC8687z.m14111z(str, Marker.ANY_MARKER, false, 2, null) ? AbstractC8687z.m14105M(hostUrl, AbstractC8687z.m14101I(str, Marker.ANY_MARKER, "", false, 4, null), false, 2, null) : AbstractC9133u.m16128b(hostUrl, str)) {
                obj = next;
                break;
            }
        }
        return ((String) obj) != null;
    }

    /* renamed from: i */
    public final void m11899i() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setCacheMode(2);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setSupportMultipleWindows(false);
        settings.setMixedContentMode(0);
        addJavascriptInterface(this, "App");
        setOnLongClickListener(new View.OnLongClickListener() { // from class: f5.c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return CustomX5WebView.m11891j(view);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: f5.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomX5WebView.m11892k(view);
            }
        });
        post(new Runnable() { // from class: f5.e
            @Override // java.lang.Runnable
            public final void run() {
                CustomX5WebView.m11893l(this.f16024a);
            }
        });
        WebView.setWebContentsDebuggingEnabled(false);
        setWebViewClient(new C8136a());
        setWebChromeClient(new C8137b());
    }

    @Override // android.webkit.WebView, android.view.View
    public void onVisibilityChanged(View p02, int i10) {
        AbstractC9133u.m16133g(p02, "p0");
        super.onVisibilityChanged(p02, i10);
        if (i10 == 0) {
            p02.post(new Runnable() { // from class: f5.b
                @Override // java.lang.Runnable
                public final void run() {
                    CustomX5WebView.m11895n(this.f16023a);
                }
            });
        }
    }

    @JavascriptInterface
    public final void resize(float f10, float f11) {
        if (f10 > AudioStats.AUDIO_AMPLITUDE_NONE) {
            this.f13751c.postValue(new RectF(0.0f, 0.0f, f10, f11));
        }
    }

    public final void setAutoHeight(boolean z10) {
        this.f13749a = z10;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setMaxHeight(int i10) {
        this.f13750b = i10;
        setOnTouchListener(new View.OnTouchListener() { // from class: f5.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return CustomX5WebView.m11896o(this.f16022a, view, motionEvent);
            }
        });
    }

    public final void setWhiteHostList(List<String> hostList) {
        AbstractC9133u.m16133g(hostList, "hostList");
        this.f13752d.clear();
        this.f13752d.addAll(hostList);
    }

    public /* synthetic */ CustomX5WebView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomX5WebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9133u.m16133g(context, "context");
        m11899i();
        this.f13750b = -1;
        this.f13751c = new MutableLiveData();
        this.f13752d = new ArrayList();
    }
}
