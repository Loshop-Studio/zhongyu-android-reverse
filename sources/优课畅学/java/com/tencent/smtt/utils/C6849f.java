package com.tencent.smtt.utils;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.utils.C6848e;

/* renamed from: com.tencent.smtt.utils.f */
/* loaded from: classes4.dex */
class C6849f implements C6848e.a {

    /* renamed from: a */
    final /* synthetic */ WebView f6971a;

    /* renamed from: b */
    final /* synthetic */ Context f6972b;

    /* renamed from: c */
    final /* synthetic */ RelativeLayout f6973c;

    /* renamed from: d */
    final /* synthetic */ String f6974d;

    /* renamed from: e */
    final /* synthetic */ TextView f6975e;

    /* renamed from: f */
    final /* synthetic */ C6848e f6976f;

    public C6849f(C6848e c6848e, WebView webView, Context context, RelativeLayout relativeLayout, String str, TextView textView) {
        this.f6976f = c6848e;
        this.f6971a = webView;
        this.f6972b = context;
        this.f6973c = relativeLayout;
        this.f6974d = str;
        this.f6975e = textView;
    }

    @Override // com.tencent.smtt.utils.C6848e.a
    /* renamed from: a */
    public void mo6291a() {
        this.f6971a.post(new RunnableC6850g(this));
    }

    @Override // com.tencent.smtt.utils.C6848e.a
    /* renamed from: a */
    public void mo6292a(int i10) {
        this.f6971a.post(new RunnableC6851h(this, i10));
    }

    @Override // com.tencent.smtt.utils.C6848e.a
    /* renamed from: a */
    public void mo6293a(Throwable th) {
        this.f6971a.post(new RunnableC6852i(this));
    }
}
