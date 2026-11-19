package p192o8;

import java.util.LinkedHashMap;

/* renamed from: o8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8722a {
    /* renamed from: a */
    public static int m14354a(int i10) {
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static LinkedHashMap m14355b(int i10) {
        return new LinkedHashMap(m14354a(i10));
    }
}
