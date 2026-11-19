package com.tencent.smtt.sdk;

import android.content.Intent;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.sdk.WebChromeClient;

/* renamed from: com.tencent.smtt.sdk.r */
/* loaded from: classes4.dex */
class C6833r extends WebChromeClient.FileChooserParams {

    /* renamed from: a */
    final /* synthetic */ IX5WebChromeClient.FileChooserParams f6923a;

    /* renamed from: b */
    final /* synthetic */ C6829n f6924b;

    public C6833r(C6829n c6829n, IX5WebChromeClient.FileChooserParams fileChooserParams) {
        this.f6924b = c6829n;
        this.f6923a = fileChooserParams;
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
    public Intent createIntent() {
        return this.f6923a.createIntent();
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
    public String[] getAcceptTypes() {
        return this.f6923a.getAcceptTypes();
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
    public String getFilenameHint() {
        return this.f6923a.getFilenameHint();
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
    public int getMode() {
        return this.f6923a.getMode();
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
    public CharSequence getTitle() {
        return this.f6923a.getTitle();
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
    public boolean isCaptureEnabled() {
        return this.f6923a.isCaptureEnabled();
    }
}
