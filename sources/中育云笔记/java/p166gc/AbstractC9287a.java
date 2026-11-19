package p166gc;

import java.util.LinkedHashMap;

/* renamed from: gc.a */
/* loaded from: classes6.dex */
public abstract class AbstractC9287a {
    /* renamed from: a */
    public static int m18311a(int i10) {
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static LinkedHashMap m18312b(int i10) {
        return new LinkedHashMap(m18311a(i10));
    }
}
