package com.tencent.smtt.sdk;

import android.graphics.Picture;
import android.webkit.WebView;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.smtt.sdk.bl */
/* loaded from: classes4.dex */
class C6813bl implements WebView.PictureListener {

    /* renamed from: a */
    final /* synthetic */ WebView.PictureListener f6872a;

    /* renamed from: b */
    final /* synthetic */ WebView f6873b;

    public C6813bl(WebView webView, WebView.PictureListener pictureListener) {
        this.f6873b = webView;
        this.f6872a = pictureListener;
    }

    @Override // android.webkit.WebView.PictureListener
    public void onNewPicture(android.webkit.WebView webView, Picture picture) {
        this.f6873b.m5967a(webView);
        this.f6872a.onNewPicture(this.f6873b, picture);
    }
}
