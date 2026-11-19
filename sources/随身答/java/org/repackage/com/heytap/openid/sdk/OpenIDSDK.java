package org.repackage.com.heytap.openid.sdk;

import android.content.Context;
import org.repackage.p203a.p204a.p205a.p206a.C9284a;
import org.repackage.p203a.p204a.p205a.p206a.C9286c;

/* loaded from: classes5.dex */
public class OpenIDSDK {
    /* renamed from: a */
    public static void m15095a(Context context) {
        C9284a.f16009b = C9286c.a.f16017a.m15093a(context.getApplicationContext());
        C9284a.f16008a = true;
    }

    /* renamed from: b */
    public static String m15097b(Context context) {
        if (C9284a.f16008a) {
            return C9286c.a.f16017a.m15092a(context.getApplicationContext(), "GUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: c */
    public static String m15098c(Context context) {
        if (C9284a.f16008a) {
            return C9286c.a.f16017a.m15092a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: d */
    public static String m15099d(Context context) {
        if (C9284a.f16008a) {
            return C9286c.a.f16017a.m15092a(context.getApplicationContext(), "DUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: e */
    public static String m15100e(Context context) {
        if (C9284a.f16008a) {
            return C9286c.a.f16017a.m15092a(context.getApplicationContext(), "AUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: a */
    public static boolean m15096a() {
        if (C9284a.f16008a) {
            return C9284a.f16009b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }
}
