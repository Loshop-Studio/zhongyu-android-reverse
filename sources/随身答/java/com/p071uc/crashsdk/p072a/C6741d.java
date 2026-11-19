package com.p071uc.crashsdk.p072a;

import androidx.work.PeriodicWorkRequest;
import com.p071uc.crashsdk.C6737a;
import com.p071uc.crashsdk.C6746b;
import com.p071uc.crashsdk.C6749e;
import com.p071uc.crashsdk.C6751g;

/* renamed from: com.uc.crashsdk.a.d */
/* loaded from: classes4.dex */
public class C6741d {

    /* renamed from: a */
    static final /* synthetic */ boolean f6338a = true;

    /* renamed from: b */
    private static boolean f6339b = true;

    /* renamed from: d */
    private static boolean f6341d = false;

    /* renamed from: e */
    private static String f6342e = "hsdk";

    /* renamed from: f */
    private static String f6343f = "alid ";

    /* renamed from: g */
    private static String f6344g;

    /* renamed from: i */
    private static String f6346i;

    /* renamed from: c */
    private static final Object f6340c = new Object();

    /* renamed from: h */
    private static final Object f6345h = new Object();

    /* renamed from: a */
    public static void m5587a() {
        C6743f.m5601a(0, new RunnableC6742e(500), C6746b.m5693E() ? PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS : 90000L);
    }

    /* renamed from: b */
    public static String m5590b() {
        try {
            return "inv" + f6343f + "cras" + f6342e;
        } catch (Throwable th) {
            C6744g.m5623b(th);
            return "";
        }
    }

    /* renamed from: c */
    public static byte[] m5591c() {
        return new byte[]{6, 0, 23, 8};
    }

    /* renamed from: d */
    public static boolean m5592d() {
        if (!C6749e.m5773E() && !C6746b.m5697I()) {
            m5589a(true);
            return f6339b;
        }
        return true;
    }

    /* renamed from: e */
    private static String m5593e() {
        if (C6744g.m5619a(f6346i)) {
            synchronized (f6345h) {
                try {
                    f6346i = C6744g.m5607a(C6746b.m5737g(), (C6751g.m5952P() ? "https://errlogos.umeng.com" : "https://errlog.umeng.com") + "/api/crashsdk/validate", true);
                } finally {
                }
            }
        }
        return f6346i;
    }

    /* renamed from: f */
    private static String m5594f() {
        byte[] bArrM5582a;
        String strM5593e;
        byte[] bArrM5579a;
        byte[] bArrM5582a2;
        StringBuilder sb = new StringBuilder();
        m5586a(sb, "platform", C6751g.m5975e());
        m5586a(sb, "pkgname", C6737a.f6307a);
        m5586a(sb, "process", C6749e.m5868h());
        m5586a(sb, "version", C6737a.m5530a());
        m5586a(sb, "cver", "3.2.0.4");
        m5586a(sb, "ctag", "release");
        m5586a(sb, "inter", C6751g.m5952P() ? "true" : "false");
        m5586a(sb, "os", "android");
        String string = sb.toString();
        byte[] bArr = new byte[16];
        C6740c.m5574a(bArr, 0, C6745h.m5675j());
        C6740c.m5574a(bArr, 4, C6740c.m5577a());
        C6740c.m5574a(bArr, 8, m5591c());
        C6740c.m5574a(bArr, 12, C6737a.m5551f());
        try {
            bArrM5582a = C6740c.m5582a(string.getBytes(), bArr, true);
        } catch (Throwable th) {
            C6744g.m5614a(th);
            bArrM5582a = null;
        }
        if (bArrM5582a == null || (strM5593e = m5593e()) == null || (bArrM5579a = C6740c.m5579a(strM5593e, bArrM5582a)) == null) {
            return null;
        }
        try {
            bArrM5582a2 = C6740c.m5582a(bArrM5579a, bArr, false);
        } catch (Throwable th2) {
            C6744g.m5614a(th2);
            bArrM5582a2 = null;
        }
        if (bArrM5582a2 != null) {
            return new String(bArrM5582a2);
        }
        return null;
    }

    /* renamed from: a */
    public static void m5588a(int i9) {
        if (i9 != 500) {
            if (!f6338a) {
                throw new AssertionError();
            }
            return;
        }
        synchronized (f6340c) {
            try {
                f6344g = null;
                m5589a(!C6746b.m5691C());
                if (C6744g.m5624b(f6344g)) {
                    C6745h.m5649a(f6344g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m5589a(boolean r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.p072a.C6741d.m5589a(boolean):boolean");
    }

    /* renamed from: a */
    private static StringBuilder m5586a(StringBuilder sb, String str, String str2) {
        if (sb.length() > 0) {
            sb.append("`");
        }
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb;
    }
}
