package org.repackage.com.heytap.openid.sdk;

import android.content.Context;
import org.repackage.p131a.p132a.p133a.p134a.C2977a;
import org.repackage.p131a.p132a.p133a.p134a.C2979c;

/* loaded from: classes.dex */
public class OpenIDSDK {
    /* renamed from: a */
    public static void m10048a(Context context) {
        C2977a.f11468b = C2979c.a.f11476a.m10046a(context.getApplicationContext());
        C2977a.f11467a = true;
    }

    /* renamed from: b */
    public static String m10050b(Context context) {
        if (C2977a.f11467a) {
            return C2979c.a.f11476a.m10045a(context.getApplicationContext(), "GUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: c */
    public static String m10051c(Context context) {
        if (C2977a.f11467a) {
            return C2979c.a.f11476a.m10045a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: d */
    public static String m10052d(Context context) {
        if (C2977a.f11467a) {
            return C2979c.a.f11476a.m10045a(context.getApplicationContext(), "DUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: e */
    public static String m10053e(Context context) {
        if (C2977a.f11467a) {
            return C2979c.a.f11476a.m10045a(context.getApplicationContext(), "AUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: a */
    public static boolean m10049a() {
        if (C2977a.f11467a) {
            return C2977a.f11468b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }
}
