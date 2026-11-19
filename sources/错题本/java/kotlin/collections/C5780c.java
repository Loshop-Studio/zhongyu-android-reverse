package kotlin.collections;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;

/* renamed from: kotlin.collections.c */
/* loaded from: classes2.dex */
public final class C5780c {
    /* renamed from: a */
    public static void m5142a(int i, int i8, int i9) {
        if (i < 0 || i8 > i9) {
            StringBuilder sbM99x = AbstractC0037f.m99x("startIndex: ", ", endIndex: ", i, ", size: ", i8);
            sbM99x.append(i9);
            throw new IndexOutOfBoundsException(sbM99x.toString());
        }
        if (i > i8) {
            throw new IllegalArgumentException(AbstractC0584a.m912m(i, i8, "startIndex: ", " > endIndex: "));
        }
    }

    /* renamed from: b */
    public static void m5143b(int i, int i8) {
        if (i < 0 || i >= i8) {
            throw new IndexOutOfBoundsException(AbstractC0584a.m912m(i, i8, "index: ", ", size: "));
        }
    }

    /* renamed from: c */
    public static void m5144c(int i, int i8) {
        if (i < 0 || i > i8) {
            throw new IndexOutOfBoundsException(AbstractC0584a.m912m(i, i8, "index: ", ", size: "));
        }
    }

    /* renamed from: d */
    public static void m5145d(int i, int i8, int i9) {
        if (i < 0 || i8 > i9) {
            StringBuilder sbM99x = AbstractC0037f.m99x("fromIndex: ", ", toIndex: ", i, ", size: ", i8);
            sbM99x.append(i9);
            throw new IndexOutOfBoundsException(sbM99x.toString());
        }
        if (i > i8) {
            throw new IllegalArgumentException(AbstractC0584a.m912m(i, i8, "fromIndex: ", " > toIndex: "));
        }
    }

    /* renamed from: e */
    public static int m5146e(int i, int i8) {
        int i9 = i + (i >> 1);
        if (i9 - i8 < 0) {
            i9 = i8;
        }
        return i9 - 2147483639 > 0 ? i8 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i9;
    }
}
