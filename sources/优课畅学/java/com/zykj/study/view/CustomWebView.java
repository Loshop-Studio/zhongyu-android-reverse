package com.zykj.study.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class CustomWebView extends WebView {

    /* renamed from: a */
    public final List f13748a;

    /* renamed from: com.zykj.study.view.CustomWebView$a */
    public static final class C8135a extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        this.f13748a = new ArrayList();
        m11884b();
    }

    /* renamed from: a */
    public final void m11883a(List hostList) {
        AbstractC9133u.m16133g(hostList, "hostList");
        this.f13748a.addAll(hostList);
    }

    /* renamed from: b */
    public final void m11884b() {
        setWebViewClient(new C8135a());
    }

    public final void setWhiteHostList(List<String> hostList) {
        AbstractC9133u.m16133g(hostList, "hostList");
        this.f13748a.clear();
        this.f13748a.addAll(hostList);
    }
}
