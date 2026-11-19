package com.p074ta.p075a.p077b;

import android.content.Context;
import com.p074ta.p075a.C7569a;
import com.p074ta.p075a.p078c.C7580a;
import com.p074ta.p075a.p078c.C7585f;
import java.io.File;

/* renamed from: com.ta.a.b.e */
/* loaded from: classes5.dex */
public class C7576e {
    /* renamed from: a */
    public static void m9768a(String str) {
        try {
            C7585f.m9800e();
            C7580a.m9778b(m9770b(), str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static String m9770b() {
        String str = m9767a(C7569a.m9757a().getContext()) + File.separator + "4635b664f789000d";
        C7585f.m9799b("", str);
        return str;
    }

    /* renamed from: c */
    public static String m9771c() {
        return m9767a(C7569a.m9757a().getContext()) + File.separator + "9983c160aa044115";
    }

    /* renamed from: d */
    public static String m9772d() {
        try {
            return C7580a.m9779c(m9770b());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m9767a(Context context) {
        String str = context.getFilesDir().getAbsolutePath() + File.separator + ".7934039a7252be16";
        C7585f.m9799b("", "UtdidAppRoot dir:" + str);
        C7580a.m9777b(str);
        return str;
    }

    /* renamed from: a */
    public static boolean m9769a(Context context) {
        try {
            return !context.getFileStreamPath("3c9b584e65e6c983").exists();
        } catch (Exception unused) {
            return true;
        }
    }
}
