package com.p040uc.crashsdk.p041a;

import com.p040uc.crashsdk.C3298a;
import com.p040uc.crashsdk.C3307b;
import com.p040uc.crashsdk.C3310e;
import com.p040uc.crashsdk.C3312g;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* renamed from: com.uc.crashsdk.a.d */
/* loaded from: classes2.dex */
public class C3302d {

    /* renamed from: a */
    static final /* synthetic */ boolean f1340a = true;

    /* renamed from: b */
    private static boolean f1341b = true;

    /* renamed from: d */
    private static boolean f1343d = false;

    /* renamed from: e */
    private static String f1344e = "hsdk";

    /* renamed from: f */
    private static String f1345f = "alid ";

    /* renamed from: g */
    private static String f1346g;

    /* renamed from: i */
    private static String f1348i;

    /* renamed from: c */
    private static final Object f1342c = new Object();

    /* renamed from: h */
    private static final Object f1347h = new Object();

    /* renamed from: a */
    public static void m2343a() {
        C3304f.m2357a(0, new RunnableC3303e(500), C3307b.m2449E() ? 900000L : 90000L);
    }

    /* renamed from: b */
    public static String m2346b() {
        try {
            return "inv" + f1345f + "cras" + f1344e;
        } catch (Throwable th) {
            C3305g.m2379b(th);
            return "";
        }
    }

    /* renamed from: c */
    public static byte[] m2347c() {
        return new byte[]{6, 0, 23, 8};
    }

    /* renamed from: d */
    public static boolean m2348d() {
        if (!C3310e.m2529E() && !C3307b.m2453I()) {
            m2345a(true);
            return f1341b;
        }
        return true;
    }

    /* renamed from: e */
    private static String m2349e() {
        if (C3305g.m2375a(f1348i)) {
            synchronized (f1347h) {
                f1348i = C3305g.m2363a(C3307b.m2493g(), (C3312g.m2708P() ? "https://errlogos.umeng.com" : "https://errlog.umeng.com") + "/api/crashsdk/validate", true);
            }
        }
        return f1348i;
    }

    /* renamed from: f */
    private static String m2350f() {
        byte[] bArrM2338a;
        String strM2349e;
        byte[] bArrM2335a;
        byte[] bArrM2338a2;
        StringBuilder sb = new StringBuilder();
        m2342a(sb, "platform", C3312g.m2731e());
        m2342a(sb, "pkgname", C3298a.f1309a);
        m2342a(sb, UMModuleRegister.PROCESS, C3310e.m2624h());
        m2342a(sb, "version", C3298a.m2286a());
        m2342a(sb, "cver", "3.2.0.4");
        m2342a(sb, "ctag", "release");
        m2342a(sb, "inter", C3312g.m2708P() ? "true" : "false");
        m2342a(sb, C3335ai.f1744x, "android");
        String string = sb.toString();
        byte[] bArr = new byte[16];
        C3301c.m2330a(bArr, 0, C3306h.m2431j());
        C3301c.m2330a(bArr, 4, C3301c.m2333a());
        C3301c.m2330a(bArr, 8, m2347c());
        C3301c.m2330a(bArr, 12, C3298a.m2307f());
        try {
            bArrM2338a = C3301c.m2338a(string.getBytes(), bArr, true);
        } catch (Throwable th) {
            C3305g.m2370a(th);
            bArrM2338a = null;
        }
        if (bArrM2338a == null || (strM2349e = m2349e()) == null || (bArrM2335a = C3301c.m2335a(strM2349e, bArrM2338a)) == null) {
            return null;
        }
        try {
            bArrM2338a2 = C3301c.m2338a(bArrM2335a, bArr, false);
        } catch (Throwable th2) {
            C3305g.m2370a(th2);
            bArrM2338a2 = null;
        }
        if (bArrM2338a2 != null) {
            return new String(bArrM2338a2);
        }
        return null;
    }

    /* renamed from: a */
    public static void m2344a(int i4) {
        if (i4 != 500) {
            if (!f1340a) {
                throw new AssertionError();
            }
            return;
        }
        synchronized (f1342c) {
            f1346g = null;
            m2345a(!C3307b.m2447C());
            if (C3305g.m2380b(f1346g)) {
                C3306h.m2405a(f1346g);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m2345a(boolean r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.p041a.C3302d.m2345a(boolean):boolean");
    }

    /* renamed from: a */
    private static StringBuilder m2342a(StringBuilder sb, String str, String str2) {
        if (sb.length() > 0) {
            sb.append("`");
        }
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb;
    }
}
