package com.tencent.smtt.sdk;

import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;
import com.tencent.smtt.export.external.extension.proxy.X5ProxyWebViewClientExtension;

/* renamed from: com.tencent.smtt.sdk.bh */
/* loaded from: classes4.dex */
class C6809bh extends X5ProxyWebViewClientExtension {

    /* renamed from: a */
    final /* synthetic */ WebView f6865a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6809bh(WebView webView, IX5WebViewClientExtension iX5WebViewClientExtension) {
        super(iX5WebViewClientExtension);
        this.f6865a = webView;
    }

    @Override // com.tencent.smtt.export.external.extension.proxy.ProxyWebViewClientExtension, com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void invalidate() {
    }

    @Override // com.tencent.smtt.export.external.extension.proxy.ProxyWebViewClientExtension, com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        this.f6865a.onScrollChanged(i12, i13, i10, i11);
    }
}
