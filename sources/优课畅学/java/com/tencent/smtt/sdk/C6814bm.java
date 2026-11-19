package com.tencent.smtt.sdk;

import android.graphics.Picture;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.smtt.sdk.bm */
/* loaded from: classes4.dex */
class C6814bm implements IX5WebViewBase.PictureListener {

    /* renamed from: a */
    final /* synthetic */ WebView.PictureListener f6874a;

    /* renamed from: b */
    final /* synthetic */ WebView f6875b;

    public C6814bm(WebView webView, WebView.PictureListener pictureListener) {
        this.f6875b = webView;
        this.f6874a = pictureListener;
    }

    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewBase.PictureListener
    public void onNewPicture(IX5WebViewBase iX5WebViewBase, Picture picture, boolean z10) {
        this.f6875b.m5968a(iX5WebViewBase);
        this.f6874a.onNewPicture(this.f6875b, picture);
    }

    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewBase.PictureListener
    public void onNewPictureIfHaveContent(IX5WebViewBase iX5WebViewBase, Picture picture) {
    }
}
