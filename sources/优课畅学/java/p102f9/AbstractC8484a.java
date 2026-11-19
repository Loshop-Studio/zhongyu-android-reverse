package p102f9;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: f9.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8484a {
    /* renamed from: a */
    public static int m13870a(Context context) {
        return ((ActivityManager) context.getSystemService("activity")).getMemoryClass();
    }
}
