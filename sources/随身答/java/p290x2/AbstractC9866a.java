package p290x2;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: x2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9866a {
    /* renamed from: a */
    public static SharedPreferences m16841a(Context context) {
        if (context != null) {
            return context.getSharedPreferences("umeng_general_config", 0);
        }
        return null;
    }
}
