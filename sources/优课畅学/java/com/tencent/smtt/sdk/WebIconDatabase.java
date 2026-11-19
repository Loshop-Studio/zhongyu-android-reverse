package com.tencent.smtt.sdk;

import android.content.ContentResolver;
import android.graphics.Bitmap;

@Deprecated
/* loaded from: classes4.dex */
public class WebIconDatabase {

    /* renamed from: a */
    private static WebIconDatabase f6689a;

    @Deprecated
    /* renamed from: com.tencent.smtt.sdk.WebIconDatabase$a */
    public interface InterfaceC6767a {
        /* renamed from: a */
        void m5947a(String str, Bitmap bitmap);
    }

    private WebIconDatabase() {
    }

    /* renamed from: a */
    private static synchronized WebIconDatabase m5946a() {
        try {
            if (f6689a == null) {
                f6689a = new WebIconDatabase();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6689a;
    }

    public static WebIconDatabase getInstance() {
        return m5946a();
    }

    public void bulkRequestIconForPageUrl(ContentResolver contentResolver, String str, InterfaceC6767a interfaceC6767a) {
    }

    public void close() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.WebIconDatabase.getInstance().close();
        } else {
            c6816boM6152b.m6158d().m6195m();
        }
    }

    public void open(String str) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.WebIconDatabase.getInstance().open(str);
        } else {
            c6816boM6152b.m6158d().m6174b(str);
        }
    }

    public void releaseIconForPageUrl(String str) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.WebIconDatabase.getInstance().releaseIconForPageUrl(str);
        } else {
            c6816boM6152b.m6158d().m6180d(str);
        }
    }

    public void removeAllIcons() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.WebIconDatabase.getInstance().removeAllIcons();
        } else {
            c6816boM6152b.m6158d().m6194l();
        }
    }

    public void requestIconForPageUrl(String str, InterfaceC6767a interfaceC6767a) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.WebIconDatabase.getInstance().requestIconForPageUrl(str, new C6808bg(this, interfaceC6767a));
        } else {
            c6816boM6152b.m6158d().m6168a(str, new C6807bf(this, interfaceC6767a));
        }
    }

    public void retainIconForPageUrl(String str) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.WebIconDatabase.getInstance().retainIconForPageUrl(str);
        } else {
            c6816boM6152b.m6158d().m6179c(str);
        }
    }
}
