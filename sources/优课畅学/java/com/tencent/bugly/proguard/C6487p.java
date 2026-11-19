package com.tencent.bugly.proguard;

import android.content.Context;
import android.util.Log;
import com.tencent.bugly.BuglyStrategy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.p */
/* loaded from: classes4.dex */
public final class C6487p {

    /* renamed from: a */
    public static boolean f4977a = true;

    /* renamed from: b */
    public static List<AbstractC6486o> f4978b = new ArrayList();

    /* renamed from: c */
    public static boolean f4979c;

    /* renamed from: d */
    private static C6494w f4980d;

    /* renamed from: e */
    private static boolean f4981e;

    /* renamed from: a */
    private static boolean m4594a(C6425aa c6425aa) {
        List<String> list = c6425aa.f4556v;
        return list != null && list.contains("bugly");
    }

    /* renamed from: a */
    public static synchronized void m4590a(Context context) {
        m4591a(context, null);
    }

    /* renamed from: a */
    public static synchronized void m4591a(Context context, BuglyStrategy buglyStrategy) {
        if (f4981e) {
            C6436al.m4288d("[init] initial Multi-times, ignore this.", new Object[0]);
            return;
        }
        if (context == null) {
            Log.w(C6436al.f4633b, "[init] context of init() is null, check it.");
            return;
        }
        C6425aa c6425aaM4148a = C6425aa.m4148a(context);
        if (m4594a(c6425aaM4148a)) {
            f4977a = false;
            return;
        }
        String strM4163e = c6425aaM4148a.m4163e();
        if (strM4163e == null) {
            Log.e(C6436al.f4633b, "[init] meta data of BUGLY_APPID in AndroidManifest.xml should be set.");
        } else {
            m4592a(context, strM4163e, c6425aaM4148a.f4489D, buglyStrategy);
        }
    }

    /* renamed from: a */
    public static synchronized void m4593a(AbstractC6486o abstractC6486o) {
        if (!f4978b.contains(abstractC6486o)) {
            f4978b.add(abstractC6486o);
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
    public static synchronized void m4592a(android.content.Context r10, java.lang.String r11, boolean r12, com.tencent.bugly.BuglyStrategy r13) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6487p.m4592a(android.content.Context, java.lang.String, boolean, com.tencent.bugly.BuglyStrategy):void");
    }
}
