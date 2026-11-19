package p065g3;

import android.content.Context;
import p060f3.AbstractC3736a;
import p060f3.C3737b;

/* renamed from: g3.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3757a {
    /* renamed from: a */
    public static void m4792a(Context context) {
        AbstractC3736a.f4361b = C3737b.b.f4368a.m4734b(context.getApplicationContext());
        AbstractC3736a.f4360a = true;
    }

    /* renamed from: b */
    public static boolean m4793b() {
        if (AbstractC3736a.f4360a) {
            return AbstractC3736a.f4361b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: c */
    public static String m4794c(Context context) {
        if (AbstractC3736a.f4360a) {
            return C3737b.b.f4368a.m4733a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }
}
