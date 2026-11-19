package com.p068uc.crashsdk.p069a;

import anet.channel.strategy.dispatch.DispatchConstants;
import anetwork.channel.util.RequestConstant;
import com.p068uc.crashsdk.C1814a;
import com.p068uc.crashsdk.C1823b;
import com.p068uc.crashsdk.C1826e;
import com.p068uc.crashsdk.C1828g;
import com.taobao.accs.common.Constants;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* renamed from: com.uc.crashsdk.a.d */
/* loaded from: classes.dex */
public class C1818d {

    /* renamed from: a */
    static final /* synthetic */ boolean f7932a = true;

    /* renamed from: b */
    private static boolean f7933b = true;

    /* renamed from: d */
    private static boolean f7935d = false;

    /* renamed from: e */
    private static String f7936e = "hsdk";

    /* renamed from: f */
    private static String f7937f = "alid ";

    /* renamed from: g */
    private static String f7938g;

    /* renamed from: i */
    private static String f7940i;

    /* renamed from: c */
    private static final Object f7934c = new Object();

    /* renamed from: h */
    private static final Object f7939h = new Object();

    /* renamed from: a */
    public static void m6266a() {
        C1820f.m6280a(0, new RunnableC1819e(500), C1823b.m6372E() ? 900000L : 90000L);
    }

    /* renamed from: b */
    public static String m6269b() {
        try {
            return "inv" + f7937f + "cras" + f7936e;
        } catch (Throwable th) {
            C1821g.m6302b(th);
            return "";
        }
    }

    /* renamed from: c */
    static byte[] m6270c() {
        return new byte[]{6, 0, 23, 8};
    }

    /* renamed from: d */
    public static boolean m6271d() {
        if (!C1826e.m6452E() && !C1823b.m6376I()) {
            m6268a(true);
            return f7933b;
        }
        return true;
    }

    /* renamed from: e */
    private static String m6272e() {
        if (C1821g.m6298a(f7940i)) {
            synchronized (f7939h) {
                f7940i = C1821g.m6286a(C1823b.m6416g(), (C1828g.m6631P() ? "https://errlogos.umeng.com" : "https://errlog.umeng.com") + "/api/crashsdk/validate", true);
            }
        }
        return f7940i;
    }

    /* renamed from: f */
    private static String m6273f() {
        byte[] bArrM6261a;
        String strM6272e;
        byte[] bArrM6258a;
        byte[] bArrM6261a2;
        StringBuilder sb = new StringBuilder();
        m6265a(sb, DispatchConstants.PLATFORM, C1828g.m6654e());
        m6265a(sb, "pkgname", C1814a.f7901a);
        m6265a(sb, UMModuleRegister.PROCESS, C1826e.m6547h());
        m6265a(sb, Constants.SP_KEY_VERSION, C1814a.m6209a());
        m6265a(sb, "cver", "3.2.0.4");
        m6265a(sb, "ctag", "release");
        m6265a(sb, "inter", C1828g.m6631P() ? RequestConstant.TRUE : RequestConstant.FALSE);
        m6265a(sb, "os", DispatchConstants.ANDROID);
        String string = sb.toString();
        byte[] bArr = new byte[16];
        C1817c.m6253a(bArr, 0, C1822h.m6354j());
        C1817c.m6253a(bArr, 4, C1817c.m6256a());
        C1817c.m6253a(bArr, 8, m6270c());
        C1817c.m6253a(bArr, 12, C1814a.m6230f());
        try {
            bArrM6261a = C1817c.m6261a(string.getBytes(), bArr, true);
        } catch (Throwable th) {
            C1821g.m6293a(th);
            bArrM6261a = null;
        }
        if (bArrM6261a == null || (strM6272e = m6272e()) == null || (bArrM6258a = C1817c.m6258a(strM6272e, bArrM6261a)) == null) {
            return null;
        }
        try {
            bArrM6261a2 = C1817c.m6261a(bArrM6258a, bArr, false);
        } catch (Throwable th2) {
            C1821g.m6293a(th2);
            bArrM6261a2 = null;
        }
        if (bArrM6261a2 != null) {
            return new String(bArrM6261a2);
        }
        return null;
    }

    /* renamed from: a */
    public static void m6267a(int i4) {
        if (i4 != 500) {
            if (!f7932a) {
                throw new AssertionError();
            }
            return;
        }
        synchronized (f7934c) {
            f7938g = null;
            m6268a(!C1823b.m6370C());
            if (C1821g.m6303b(f7938g)) {
                C1822h.m6328a(f7938g);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m6268a(boolean r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.p069a.C1818d.m6268a(boolean):boolean");
    }

    /* renamed from: a */
    private static StringBuilder m6265a(StringBuilder sb, String str, String str2) {
        if (sb.length() > 0) {
            sb.append("`");
        }
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb;
    }
}
