package p062g0;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: g0.i */
/* loaded from: classes2.dex */
public abstract class AbstractC3749i {
    /* renamed from: a */
    public static void m4765a(boolean z3, String str) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m4766b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    /* renamed from: c */
    public static Collection m4767c(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return collection;
    }

    /* renamed from: d */
    public static Object m4768d(Object obj) {
        return m4769e(obj, "Argument must not be null");
    }

    /* renamed from: e */
    public static Object m4769e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
