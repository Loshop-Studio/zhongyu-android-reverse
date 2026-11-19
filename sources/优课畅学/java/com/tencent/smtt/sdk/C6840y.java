package com.tencent.smtt.sdk;

import android.net.Uri;

/* renamed from: com.tencent.smtt.sdk.y */
/* loaded from: classes4.dex */
class C6840y implements ValueCallback<Uri[]> {

    /* renamed from: a */
    final /* synthetic */ android.webkit.ValueCallback f6938a;

    /* renamed from: b */
    final /* synthetic */ SystemWebChromeClient f6939b;

    public C6840y(SystemWebChromeClient systemWebChromeClient, android.webkit.ValueCallback valueCallback) {
        this.f6939b = systemWebChromeClient;
        this.f6938a = valueCallback;
    }

    @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onReceiveValue(Uri[] uriArr) {
        this.f6938a.onReceiveValue(uriArr);
    }
}
