package com.tencent.smtt.sdk;

import android.content.Intent;
import android.webkit.WebChromeClient;
import com.tencent.smtt.sdk.WebChromeClient;

/* renamed from: com.tencent.smtt.sdk.z */
/* loaded from: classes4.dex */
class C6841z extends WebChromeClient.FileChooserParams {

    /* renamed from: a */
    final /* synthetic */ WebChromeClient.FileChooserParams f6940a;

    /* renamed from: b */
    final /* synthetic */ SystemWebChromeClient f6941b;

    public C6841z(SystemWebChromeClient systemWebChromeClient, WebChromeClient.FileChooserParams fileChooserParams) {
        this.f6941b = systemWebChromeClient;
        this.f6940a = fileChooserParams;
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
    public Intent createIntent() {
        return this.f6940a.createIntent();
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
    public String[] getAcceptTypes() {
        return this.f6940a.getAcceptTypes();
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
    public String getFilenameHint() {
        return this.f6940a.getFilenameHint();
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
    public int getMode() {
        return this.f6940a.getMode();
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
    public CharSequence getTitle() {
        return this.f6940a.getTitle();
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
    public boolean isCaptureEnabled() {
        return this.f6940a.isCaptureEnabled();
    }
}
