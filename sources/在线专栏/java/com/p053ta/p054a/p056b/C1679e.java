package com.p053ta.p054a.p056b;

import android.content.Context;
import com.p053ta.p054a.C1672a;
import com.p053ta.p054a.p057c.C1683a;
import com.p053ta.p054a.p057c.C1688f;
import java.io.File;

/* renamed from: com.ta.a.b.e */
/* loaded from: classes.dex */
public class C1679e {
    /* renamed from: a */
    public static void m5742a(String str) {
        try {
            C1688f.m5774e();
            C1683a.m5752b(m5744b(), str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static String m5744b() {
        String str = m5741a(C1672a.m5731a().getContext()) + File.separator + "4635b664f789000d";
        C1688f.m5773b("", str);
        return str;
    }

    /* renamed from: c */
    public static String m5745c() {
        return m5741a(C1672a.m5731a().getContext()) + File.separator + "9983c160aa044115";
    }

    /* renamed from: d */
    public static String m5746d() {
        try {
            return C1683a.m5753c(m5744b());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m5741a(Context context) {
        String str = context.getFilesDir().getAbsolutePath() + File.separator + ".7934039a7252be16";
        C1688f.m5773b("", "UtdidAppRoot dir:" + str);
        C1683a.m5751b(str);
        return str;
    }

    /* renamed from: a */
    public static boolean m5743a(Context context) {
        try {
            return !context.getFileStreamPath("3c9b584e65e6c983").exists();
        } catch (Exception unused) {
            return true;
        }
    }
}
