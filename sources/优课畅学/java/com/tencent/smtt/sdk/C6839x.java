package com.tencent.smtt.sdk;

import android.net.Uri;

/* renamed from: com.tencent.smtt.sdk.x */
/* loaded from: classes4.dex */
class C6839x implements ValueCallback<Uri> {

    /* renamed from: a */
    final /* synthetic */ android.webkit.ValueCallback f6936a;

    /* renamed from: b */
    final /* synthetic */ SystemWebChromeClient f6937b;

    public C6839x(SystemWebChromeClient systemWebChromeClient, android.webkit.ValueCallback valueCallback) {
        this.f6937b = systemWebChromeClient;
        this.f6936a = valueCallback;
    }

    @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onReceiveValue(Uri uri) {
        this.f6936a.onReceiveValue(uri);
    }
}
