package com.tencent.smtt.sdk;

import android.webkit.WebView;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;

/* renamed from: com.tencent.smtt.sdk.bj */
/* loaded from: classes4.dex */
class C6811bj implements WebView.FindListener {

    /* renamed from: a */
    final /* synthetic */ IX5WebViewBase.FindListener f6868a;

    /* renamed from: b */
    final /* synthetic */ WebView f6869b;

    public C6811bj(WebView webView, IX5WebViewBase.FindListener findListener) {
        this.f6869b = webView;
        this.f6868a = findListener;
    }

    @Override // android.webkit.WebView.FindListener
    public void onFindResultReceived(int i10, int i11, boolean z10) {
        this.f6868a.onFindResultReceived(i10, i11, z10);
    }
}
