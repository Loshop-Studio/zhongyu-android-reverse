package com.tencent.bugly.crashreport;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.crash.p033h5.H5JavaScriptInterface;

/* renamed from: com.tencent.bugly.crashreport.a */
/* loaded from: classes3.dex */
public final class C4035a implements CrashReport.InterfaceC4034a {

    /* renamed from: a */
    public final /* synthetic */ WebView f3246a;

    public C4035a(WebView webView) {
        this.f3246a = webView;
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC4034a
    /* renamed from: a */
    public final String mo2856a() {
        return this.f3246a.getUrl();
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC4034a
    /* renamed from: b */
    public final void mo2859b() {
        WebSettings settings = this.f3246a.getSettings();
        if (settings.getJavaScriptEnabled()) {
            return;
        }
        settings.setJavaScriptEnabled(true);
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC4034a
    /* renamed from: c */
    public final CharSequence mo2860c() {
        return this.f3246a.getContentDescription();
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC4034a
    /* renamed from: a */
    public final void mo2858a(String str) {
        this.f3246a.loadUrl(str);
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.InterfaceC4034a
    /* renamed from: a */
    public final void mo2857a(H5JavaScriptInterface h5JavaScriptInterface, String str) {
        this.f3246a.addJavascriptInterface(h5JavaScriptInterface, str);
    }
}
