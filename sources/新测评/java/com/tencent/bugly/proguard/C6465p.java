package com.tencent.bugly.proguard;

import android.content.Context;
import android.util.Log;
import com.tencent.bugly.BuglyStrategy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.p */
/* loaded from: classes4.dex */
public final class C6465p {

    /* renamed from: a */
    public static boolean f5634a = true;

    /* renamed from: b */
    public static List<AbstractC6464o> f5635b = new ArrayList();

    /* renamed from: c */
    public static boolean f5636c;

    /* renamed from: d */
    private static C6472w f5637d;

    /* renamed from: e */
    private static boolean f5638e;

    /* renamed from: a */
    private static boolean m5234a(C6403aa c6403aa) {
        List<String> list = c6403aa.f5213v;
        return list != null && list.contains("bugly");
    }

    /* renamed from: a */
    public static synchronized void m5230a(Context context) {
        m5231a(context, null);
    }

    /* renamed from: a */
    public static synchronized void m5231a(Context context, BuglyStrategy buglyStrategy) {
        if (f5638e) {
            C6414al.m4928d("[init] initial Multi-times, ignore this.", new Object[0]);
            return;
        }
        if (context == null) {
            Log.w(C6414al.f5290b, "[init] context of init() is null, check it.");
            return;
        }
        C6403aa c6403aaM4788a = C6403aa.m4788a(context);
        if (m5234a(c6403aaM4788a)) {
            f5634a = false;
            return;
        }
        String strM4803e = c6403aaM4788a.m4803e();
        if (strM4803e == null) {
            Log.e(C6414al.f5290b, "[init] meta data of BUGLY_APPID in AndroidManifest.xml should be set.");
        } else {
            m5232a(context, strM4803e, c6403aaM4788a.f5146D, buglyStrategy);
        }
    }

    /* renamed from: a */
    public static synchronized void m5233a(AbstractC6464o abstractC6464o) {
        if (!f5635b.contains(abstractC6464o)) {
            f5635b.add(abstractC6464o);
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
    public static synchronized void m5232a(android.content.Context r10, java.lang.String r11, boolean r12, com.tencent.bugly.BuglyStrategy r13) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6465p.m5232a(android.content.Context, java.lang.String, boolean, com.tencent.bugly.BuglyStrategy):void");
    }
}
