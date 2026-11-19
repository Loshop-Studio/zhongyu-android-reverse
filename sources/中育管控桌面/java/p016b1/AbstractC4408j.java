package p016b1;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: b1.j */
/* loaded from: classes3.dex */
public abstract class AbstractC4408j {
    /* renamed from: a */
    public static void m1435a(boolean z6, String str) {
        if (!z6) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m1436b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    /* renamed from: c */
    public static Collection m1437c(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return collection;
    }

    /* renamed from: d */
    public static Object m1438d(Object obj) {
        return m1439e(obj, "Argument must not be null");
    }

    /* renamed from: e */
    public static Object m1439e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
