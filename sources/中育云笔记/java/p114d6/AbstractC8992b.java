package p114d6;

import android.content.Context;

/* renamed from: d6.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8992b {

    /* renamed from: a */
    public static Context f20958a;

    /* renamed from: a */
    public static Context m17549a() {
        return f20958a;
    }

    /* renamed from: b */
    public static void m17550b(Context context) {
        if (context == null || f20958a != null) {
            return;
        }
        f20958a = context.getApplicationContext();
    }
}
