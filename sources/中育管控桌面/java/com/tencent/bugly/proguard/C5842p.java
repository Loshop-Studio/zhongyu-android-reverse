package com.tencent.bugly.proguard;

import android.content.Context;
import android.util.Log;
import com.tencent.bugly.BuglyStrategy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.p */
/* loaded from: classes3.dex */
public final class C5842p {

    /* renamed from: a */
    public static boolean f4355a = true;

    /* renamed from: b */
    public static List<AbstractC5841o> f4356b = new ArrayList();

    /* renamed from: c */
    public static boolean f4357c;

    /* renamed from: d */
    private static C5849w f4358d;

    /* renamed from: e */
    private static boolean f4359e;

    /* renamed from: a */
    private static boolean m4239a(C5780aa c5780aa) {
        List<String> list = c5780aa.f3934v;
        return list != null && list.contains("bugly");
    }

    /* renamed from: a */
    public static synchronized void m4235a(Context context) {
        m4236a(context, null);
    }

    /* renamed from: a */
    public static synchronized void m4236a(Context context, BuglyStrategy buglyStrategy) {
        if (f4359e) {
            C5791al.m3933d("[init] initial Multi-times, ignore this.", new Object[0]);
            return;
        }
        if (context == null) {
            Log.w(C5791al.f4011b, "[init] context of init() is null, check it.");
            return;
        }
        C5780aa c5780aaM3793a = C5780aa.m3793a(context);
        if (m4239a(c5780aaM3793a)) {
            f4355a = false;
            return;
        }
        String strM3808e = c5780aaM3793a.m3808e();
        if (strM3808e == null) {
            Log.e(C5791al.f4011b, "[init] meta data of BUGLY_APPID in AndroidManifest.xml should be set.");
        } else {
            m4237a(context, strM3808e, c5780aaM3793a.f3867D, buglyStrategy);
        }
    }

    /* renamed from: a */
    public static synchronized void m4238a(AbstractC5841o abstractC5841o) {
        if (!f4356b.contains(abstractC5841o)) {
            f4356b.add(abstractC5841o);
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
    public static synchronized void m4237a(android.content.Context r10, java.lang.String r11, boolean r12, com.tencent.bugly.BuglyStrategy r13) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C5842p.m4237a(android.content.Context, java.lang.String, boolean, com.tencent.bugly.BuglyStrategy):void");
    }
}
