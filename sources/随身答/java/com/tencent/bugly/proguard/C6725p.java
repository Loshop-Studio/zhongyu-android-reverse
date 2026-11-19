package com.tencent.bugly.proguard;

import android.content.Context;
import android.util.Log;
import com.tencent.bugly.BuglyStrategy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.p */
/* loaded from: classes4.dex */
public final class C6725p {

    /* renamed from: a */
    public static boolean f6211a = true;

    /* renamed from: b */
    public static List<AbstractC6724o> f6212b = new ArrayList();

    /* renamed from: c */
    public static boolean f6213c;

    /* renamed from: d */
    private static C6732w f6214d;

    /* renamed from: e */
    private static boolean f6215e;

    /* renamed from: a */
    private static boolean m5413a(C6663aa c6663aa) {
        List<String> list = c6663aa.f5790v;
        return list != null && list.contains("bugly");
    }

    /* renamed from: a */
    public static synchronized void m5409a(Context context) {
        m5410a(context, null);
    }

    /* renamed from: a */
    public static synchronized void m5410a(Context context, BuglyStrategy buglyStrategy) {
        if (f6215e) {
            C6674al.m5107d("[init] initial Multi-times, ignore this.", new Object[0]);
            return;
        }
        if (context == null) {
            Log.w(C6674al.f5867b, "[init] context of init() is null, check it.");
            return;
        }
        C6663aa c6663aaM4967a = C6663aa.m4967a(context);
        if (m5413a(c6663aaM4967a)) {
            f6211a = false;
            return;
        }
        String strM4982e = c6663aaM4967a.m4982e();
        if (strM4982e == null) {
            Log.e(C6674al.f5867b, "[init] meta data of BUGLY_APPID in AndroidManifest.xml should be set.");
        } else {
            m5411a(context, strM4982e, c6663aaM4967a.f5723D, buglyStrategy);
        }
    }

    /* renamed from: a */
    public static synchronized void m5412a(AbstractC6724o abstractC6724o) {
        if (!f6212b.contains(abstractC6724o)) {
            f6212b.add(abstractC6724o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0201 A[Catch: all -> 0x0017, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000e, B:12:0x001c, B:16:0x0027, B:20:0x0031, B:22:0x0035, B:23:0x0071, B:25:0x00b2, B:28:0x00b6, B:30:0x00c8, B:32:0x00d2, B:34:0x00d8, B:35:0x00e6, B:36:0x00f5, B:38:0x00fd, B:40:0x0107, B:42:0x010d, B:45:0x011e, B:51:0x0146, B:56:0x0159, B:58:0x0163, B:60:0x0169, B:61:0x0177, B:62:0x0186, B:64:0x018c, B:66:0x0192, B:67:0x01a0, B:68:0x01ac, B:70:0x01b2, B:71:0x01be, B:46:0x012c, B:48:0x0135, B:50:0x013f, B:53:0x0152, B:55:0x0156, B:73:0x01cb, B:83:0x01f9, B:84:0x01fc, B:86:0x0201, B:88:0x0208, B:80:0x01f0, B:82:0x01f6, B:75:0x01d3, B:77:0x01e3), top: B:95:0x0009, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void m5411a(android.content.Context r10, java.lang.String r11, boolean r12, com.tencent.bugly.BuglyStrategy r13) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6725p.m5411a(android.content.Context, java.lang.String, boolean, com.tencent.bugly.BuglyStrategy):void");
    }
}
