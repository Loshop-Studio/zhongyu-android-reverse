package com.tencent.smtt.sdk;

import android.graphics.Bitmap;
import com.tencent.smtt.export.external.interfaces.IconListener;
import com.tencent.smtt.sdk.WebIconDatabase;

/* renamed from: com.tencent.smtt.sdk.bf */
/* loaded from: classes4.dex */
class C6807bf implements IconListener {

    /* renamed from: a */
    final /* synthetic */ WebIconDatabase.InterfaceC6767a f6861a;

    /* renamed from: b */
    final /* synthetic */ WebIconDatabase f6862b;

    public C6807bf(WebIconDatabase webIconDatabase, WebIconDatabase.InterfaceC6767a interfaceC6767a) {
        this.f6862b = webIconDatabase;
        this.f6861a = interfaceC6767a;
    }

    @Override // com.tencent.smtt.export.external.interfaces.IconListener
    public void onReceivedIcon(String str, Bitmap bitmap) {
        this.f6861a.m5947a(str, bitmap);
    }
}
