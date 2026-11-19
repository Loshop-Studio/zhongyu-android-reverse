package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.smtt.utils.C6865v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class CookieManager {
    public static String LOGTAG = "CookieManager";

    /* renamed from: d */
    private static CookieManager f6551d;

    /* renamed from: a */
    ArrayList<C6759b> f6552a;

    /* renamed from: b */
    String f6553b;

    /* renamed from: c */
    EnumC6758a f6554c = EnumC6758a.MODE_NONE;

    /* renamed from: e */
    private boolean f6555e = false;

    /* renamed from: f */
    private boolean f6556f = false;

    /* renamed from: com.tencent.smtt.sdk.CookieManager$a */
    public enum EnumC6758a {
        MODE_NONE,
        MODE_KEYS,
        MODE_ALL
    }

    /* renamed from: com.tencent.smtt.sdk.CookieManager$b */
    public class C6759b {

        /* renamed from: a */
        int f6561a;

        /* renamed from: b */
        String f6562b;

        /* renamed from: c */
        String f6563c;

        /* renamed from: d */
        ValueCallback<Boolean> f6564d;

        public C6759b() {
        }
    }

    private CookieManager() {
    }

    public static CookieManager getInstance() {
        if (f6551d == null) {
            synchronized (CookieManager.class) {
                try {
                    if (f6551d == null) {
                        f6551d = new CookieManager();
                    }
                } finally {
                }
            }
        }
        return f6551d;
    }

    public static int getROMCookieDBVersion(Context context) {
        return context.getSharedPreferences("cookiedb_info", 4).getInt("db_version", -1);
    }

    public static void setROMCookieDBVersion(Context context, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("cookiedb_info", 4).edit();
        editorEdit.putInt("db_version", i10);
        editorEdit.commit();
    }

    /* renamed from: a */
    public synchronized void m5834a() {
        try {
            this.f6556f = true;
            ArrayList<C6759b> arrayList = this.f6552a;
            if (arrayList != null && arrayList.size() != 0) {
                C6816bo c6816boM6152b = C6816bo.m6152b();
                if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
                    Iterator<C6759b> it = this.f6552a.iterator();
                    while (it.hasNext()) {
                        C6759b next = it.next();
                        int i10 = next.f6561a;
                        if (i10 == 1) {
                            C6865v.m6375a(android.webkit.CookieManager.getInstance(), "setCookie", (Class<?>[]) new Class[]{String.class, String.class, android.webkit.ValueCallback.class}, next.f6562b, next.f6563c, next.f6564d);
                        } else if (i10 == 2) {
                            android.webkit.CookieManager.getInstance().setCookie(next.f6562b, next.f6563c);
                        }
                    }
                } else {
                    Iterator<C6759b> it2 = this.f6552a.iterator();
                    while (it2.hasNext()) {
                        C6759b next2 = it2.next();
                        int i11 = next2.f6561a;
                        if (i11 == 1) {
                            setCookie(next2.f6562b, next2.f6563c, next2.f6564d);
                        } else if (i11 == 2) {
                            setCookie(next2.f6562b, next2.f6563c);
                        }
                    }
                }
                this.f6552a.clear();
            }
        } finally {
        }
    }

    public boolean acceptCookie() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        return (c6816boM6152b == null || !c6816boM6152b.m6157c()) ? android.webkit.CookieManager.getInstance().acceptCookie() : c6816boM6152b.m6158d().m6181d();
    }

    public synchronized boolean acceptThirdPartyCookies(WebView webView) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            Object objM6375a = C6865v.m6375a(android.webkit.CookieManager.getInstance(), "acceptThirdPartyCookies", (Class<?>[]) new Class[]{android.webkit.WebView.class}, webView.getView());
            if (objM6375a == null) {
                return false;
            }
            return ((Boolean) objM6375a).booleanValue();
        }
        Object objInvokeStaticMethod = c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_acceptThirdPartyCookies", new Class[]{Object.class}, webView.getView());
        if (objInvokeStaticMethod == null) {
            return true;
        }
        return ((Boolean) objInvokeStaticMethod).booleanValue();
    }

    public void flush() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            C6865v.m6375a(android.webkit.CookieManager.getInstance(), "flush", (Class<?>[]) new Class[0], new Object[0]);
        } else {
            c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_flush", new Class[0], new Object[0]);
        }
    }

    public String getCookie(String str) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b != null && c6816boM6152b.m6157c()) {
            return c6816boM6152b.m6158d().m6163a(str);
        }
        try {
            return android.webkit.CookieManager.getInstance().getCookie(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public boolean hasCookies() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        return (c6816boM6152b == null || !c6816boM6152b.m6157c()) ? android.webkit.CookieManager.getInstance().hasCookies() : c6816boM6152b.m6158d().m6190h();
    }

    public void removeAllCookie() {
        ArrayList<C6759b> arrayList = this.f6552a;
        if (arrayList != null) {
            arrayList.clear();
        }
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.CookieManager.getInstance().removeAllCookie();
        } else {
            c6816boM6152b.m6158d().m6183e();
        }
    }

    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        ArrayList<C6759b> arrayList = this.f6552a;
        if (arrayList != null) {
            arrayList.clear();
        }
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            C6865v.m6375a(android.webkit.CookieManager.getInstance(), "removeAllCookies", (Class<?>[]) new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        } else {
            c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeAllCookies", new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        }
    }

    public void removeExpiredCookie() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.CookieManager.getInstance().removeExpiredCookie();
        } else {
            c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeExpiredCookie", new Class[0], new Object[0]);
        }
    }

    public void removeSessionCookie() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.CookieManager.getInstance().removeSessionCookie();
        } else {
            c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeSessionCookie", new Class[0], new Object[0]);
        }
    }

    public void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            C6865v.m6375a(android.webkit.CookieManager.getInstance(), "removeSessionCookies", (Class<?>[]) new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        } else {
            c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeSessionCookies", new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        }
    }

    public synchronized void setAcceptCookie(boolean z10) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            try {
                android.webkit.CookieManager.getInstance().setAcceptCookie(z10);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setAcceptCookie", new Class[]{Boolean.TYPE}, Boolean.valueOf(z10));
        }
    }

    public synchronized void setAcceptThirdPartyCookies(WebView webView, boolean z10) {
        try {
            C6816bo c6816boM6152b = C6816bo.m6152b();
            if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
                C6865v.m6375a(android.webkit.CookieManager.getInstance(), "setAcceptThirdPartyCookies", (Class<?>[]) new Class[]{android.webkit.WebView.class, Boolean.TYPE}, webView.getView(), Boolean.valueOf(z10));
            } else {
                c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setAcceptThirdPartyCookies", new Class[]{Object.class, Boolean.TYPE}, webView.getView(), Boolean.valueOf(z10));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setCookie(String str, String str2) {
        setCookie(str, str2, false);
    }

    public boolean setCookieCompatialbeMode(Context context, EnumC6758a enumC6758a, String str, boolean z10) {
        System.currentTimeMillis();
        if (context == null || !TbsExtensionFunctionManager.getInstance().canUseFunction(context, TbsExtensionFunctionManager.COOKIE_SWITCH_FILE_NAME)) {
            return false;
        }
        this.f6554c = enumC6758a;
        if (str != null) {
            this.f6553b = str;
        }
        if (enumC6758a == EnumC6758a.MODE_NONE || !z10 || C6816bo.m6152b().m6159e()) {
            return true;
        }
        C6816bo.m6152b().m6156a(context, null);
        return true;
    }

    public void setCookies(Map<String, String[]> map) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if ((c6816boM6152b == null || !c6816boM6152b.m6157c()) ? false : c6816boM6152b.m6158d().m6171a(map)) {
            return;
        }
        for (String str : map.keySet()) {
            for (String str2 : map.get(str)) {
                setCookie(str, str2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3 A[PHI: r4
      0x00d3: PHI (r4v10 int) = (r4v9 int), (r4v9 int), (r4v9 int), (r4v12 int) binds: [B:49:0x00d9, B:51:0x00e9, B:70:0x00d3, B:43:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fd A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x0015, B:11:0x001b, B:13:0x003f, B:15:0x0045, B:18:0x004a, B:23:0x0057, B:25:0x005e, B:28:0x0063, B:32:0x0098, B:34:0x00aa, B:36:0x00b4, B:42:0x00c5, B:44:0x00cb, B:57:0x00f7, B:63:0x011c, B:59:0x00fd, B:61:0x0104, B:48:0x00d5, B:50:0x00db, B:52:0x00eb, B:62:0x0116), top: B:71:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104 A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x0015, B:11:0x001b, B:13:0x003f, B:15:0x0045, B:18:0x004a, B:23:0x0057, B:25:0x005e, B:28:0x0063, B:32:0x0098, B:34:0x00aa, B:36:0x00b4, B:42:0x00c5, B:44:0x00cb, B:57:0x00f7, B:63:0x011c, B:59:0x00fd, B:61:0x0104, B:48:0x00d5, B:50:0x00db, B:52:0x00eb, B:62:0x0116), top: B:71:0x0001 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void m5835a(android.content.Context r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.CookieManager.m5835a(android.content.Context, boolean, boolean):void");
    }

    public synchronized void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        try {
            C6816bo c6816boM6152b = C6816bo.m6152b();
            if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
                if (!C6816bo.m6152b().m6159e()) {
                    C6759b c6759b = new C6759b();
                    c6759b.f6561a = 1;
                    c6759b.f6562b = str;
                    c6759b.f6563c = str2;
                    c6759b.f6564d = valueCallback;
                    if (this.f6552a == null) {
                        this.f6552a = new ArrayList<>();
                    }
                    this.f6552a.add(c6759b);
                }
                if (this.f6556f) {
                    C6865v.m6375a(android.webkit.CookieManager.getInstance(), "setCookie", (Class<?>[]) new Class[]{String.class, String.class, android.webkit.ValueCallback.class}, str, str2, valueCallback);
                }
            } else {
                c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setCookie", new Class[]{String.class, String.class, android.webkit.ValueCallback.class}, str, str2, valueCallback);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setCookie(String str, String str2, boolean z10) {
        try {
            C6816bo c6816boM6152b = C6816bo.m6152b();
            if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
                if (this.f6556f || z10) {
                    android.webkit.CookieManager.getInstance().setCookie(str, str2);
                }
                if (!C6816bo.m6152b().m6159e()) {
                    C6759b c6759b = new C6759b();
                    c6759b.f6561a = 2;
                    c6759b.f6562b = str;
                    c6759b.f6563c = str2;
                    c6759b.f6564d = null;
                    if (this.f6552a == null) {
                        this.f6552a = new ArrayList<>();
                    }
                    this.f6552a.add(c6759b);
                }
            } else {
                c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setCookie", new Class[]{String.class, String.class}, str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
