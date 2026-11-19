package com.tencent.smtt.sdk;

import android.content.Context;

/* loaded from: classes4.dex */
public class WebViewDatabase {

    /* renamed from: a */
    private static WebViewDatabase f6729a;

    /* renamed from: b */
    private Context f6730b;

    public WebViewDatabase(Context context) {
        this.f6730b = context;
    }

    /* renamed from: a */
    private static synchronized WebViewDatabase m5977a(Context context) {
        try {
            if (f6729a == null) {
                f6729a = new WebViewDatabase(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6729a;
    }

    public static WebViewDatabase getInstance(Context context) {
        return m5977a(context);
    }

    public void clearFormData() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.WebViewDatabase.getInstance(this.f6730b).clearFormData();
        } else {
            c6816boM6152b.m6158d().m6189g(this.f6730b);
        }
    }

    public void clearHttpAuthUsernamePassword() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.WebViewDatabase.getInstance(this.f6730b).clearHttpAuthUsernamePassword();
        } else {
            c6816boM6152b.m6158d().m6184e(this.f6730b);
        }
    }

    @Deprecated
    public void clearUsernamePassword() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.WebViewDatabase.getInstance(this.f6730b).clearUsernamePassword();
        } else {
            c6816boM6152b.m6158d().m6178c(this.f6730b);
        }
    }

    public boolean hasFormData() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        return (c6816boM6152b == null || !c6816boM6152b.m6157c()) ? android.webkit.WebViewDatabase.getInstance(this.f6730b).hasFormData() : c6816boM6152b.m6158d().m6187f(this.f6730b);
    }

    public boolean hasHttpAuthUsernamePassword() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        return (c6816boM6152b == null || !c6816boM6152b.m6157c()) ? android.webkit.WebViewDatabase.getInstance(this.f6730b).hasHttpAuthUsernamePassword() : c6816boM6152b.m6158d().m6182d(this.f6730b);
    }

    @Deprecated
    public boolean hasUsernamePassword() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        return (c6816boM6152b == null || !c6816boM6152b.m6157c()) ? android.webkit.WebViewDatabase.getInstance(this.f6730b).hasUsernamePassword() : c6816boM6152b.m6158d().m6176b(this.f6730b);
    }
}
