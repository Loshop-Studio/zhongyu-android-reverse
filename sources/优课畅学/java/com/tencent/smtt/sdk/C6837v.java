package com.tencent.smtt.sdk;

/* renamed from: com.tencent.smtt.sdk.v */
/* loaded from: classes4.dex */
class C6837v implements ValueCallback<String[]> {

    /* renamed from: a */
    final /* synthetic */ android.webkit.ValueCallback f6931a;

    /* renamed from: b */
    final /* synthetic */ SystemWebChromeClient f6932b;

    public C6837v(SystemWebChromeClient systemWebChromeClient, android.webkit.ValueCallback valueCallback) {
        this.f6932b = systemWebChromeClient;
        this.f6931a = valueCallback;
    }

    @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onReceiveValue(String[] strArr) {
        this.f6931a.onReceiveValue(strArr);
    }
}
