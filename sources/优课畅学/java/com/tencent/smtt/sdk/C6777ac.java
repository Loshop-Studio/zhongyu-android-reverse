package com.tencent.smtt.sdk;

import com.tencent.smtt.export.external.interfaces.WebResourceError;

/* renamed from: com.tencent.smtt.sdk.ac */
/* loaded from: classes4.dex */
class C6777ac extends WebResourceError {

    /* renamed from: a */
    final /* synthetic */ android.webkit.WebResourceError f6772a;

    /* renamed from: b */
    final /* synthetic */ C6775aa f6773b;

    public C6777ac(C6775aa c6775aa, android.webkit.WebResourceError webResourceError) {
        this.f6773b = c6775aa;
        this.f6772a = webResourceError;
    }

    @Override // com.tencent.smtt.export.external.interfaces.WebResourceError
    public CharSequence getDescription() {
        return this.f6772a.getDescription();
    }

    @Override // com.tencent.smtt.export.external.interfaces.WebResourceError
    public int getErrorCode() {
        return this.f6772a.getErrorCode();
    }
}
