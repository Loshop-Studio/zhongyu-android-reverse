package p117i1;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: i1.j */
/* loaded from: classes3.dex */
public abstract class AbstractC7651j {
    /* renamed from: a */
    public static void m12680a(boolean z9, String str) {
        if (!z9) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m12681b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    /* renamed from: c */
    public static Collection m12682c(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return collection;
    }

    /* renamed from: d */
    public static Object m12683d(Object obj) {
        return m12684e(obj, "Argument must not be null");
    }

    /* renamed from: e */
    public static Object m12684e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
