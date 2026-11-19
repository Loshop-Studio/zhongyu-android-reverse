package p109d1;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: d1.j */
/* loaded from: classes3.dex */
public abstract class AbstractC8909j {
    /* renamed from: a */
    public static void m17465a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m17466b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    /* renamed from: c */
    public static Collection m17467c(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return collection;
    }

    /* renamed from: d */
    public static Object m17468d(Object obj) {
        return m17469e(obj, "Argument must not be null");
    }

    /* renamed from: e */
    public static Object m17469e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
