package com.tencent.smtt.sdk;

import android.net.Uri;

/* renamed from: com.tencent.smtt.sdk.p */
/* loaded from: classes4.dex */
class C6831p implements ValueCallback<Uri> {

    /* renamed from: a */
    final /* synthetic */ android.webkit.ValueCallback f6919a;

    /* renamed from: b */
    final /* synthetic */ C6829n f6920b;

    public C6831p(C6829n c6829n, android.webkit.ValueCallback valueCallback) {
        this.f6920b = c6829n;
        this.f6919a = valueCallback;
    }

    @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onReceiveValue(Uri uri) {
        this.f6919a.onReceiveValue(new Uri[]{uri});
    }
}
