package com.tencent.smtt.sdk;

import android.net.Uri;

/* renamed from: com.tencent.smtt.sdk.q */
/* loaded from: classes4.dex */
class C6832q implements ValueCallback<Uri[]> {

    /* renamed from: a */
    final /* synthetic */ android.webkit.ValueCallback f6921a;

    /* renamed from: b */
    final /* synthetic */ C6829n f6922b;

    public C6832q(C6829n c6829n, android.webkit.ValueCallback valueCallback) {
        this.f6922b = c6829n;
        this.f6921a = valueCallback;
    }

    @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onReceiveValue(Uri[] uriArr) {
        this.f6921a.onReceiveValue(uriArr);
    }
}
