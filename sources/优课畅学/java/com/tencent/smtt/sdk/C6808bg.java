package com.tencent.smtt.sdk;

import android.graphics.Bitmap;
import android.webkit.WebIconDatabase;
import com.tencent.smtt.sdk.WebIconDatabase;

/* renamed from: com.tencent.smtt.sdk.bg */
/* loaded from: classes4.dex */
class C6808bg implements WebIconDatabase.IconListener {

    /* renamed from: a */
    final /* synthetic */ WebIconDatabase.InterfaceC6767a f6863a;

    /* renamed from: b */
    final /* synthetic */ WebIconDatabase f6864b;

    public C6808bg(WebIconDatabase webIconDatabase, WebIconDatabase.InterfaceC6767a interfaceC6767a) {
        this.f6864b = webIconDatabase;
        this.f6863a = interfaceC6767a;
    }

    @Override // android.webkit.WebIconDatabase.IconListener
    public void onReceivedIcon(String str, Bitmap bitmap) {
        this.f6863a.m5947a(str, bitmap);
    }
}
