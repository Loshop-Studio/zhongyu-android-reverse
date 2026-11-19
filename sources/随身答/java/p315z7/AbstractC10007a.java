package p315z7;

import java.util.LinkedHashMap;

/* renamed from: z7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10007a {
    /* renamed from: a */
    public static int m17371a(int i9) {
        if (i9 < 3) {
            return i9 + 1;
        }
        if (i9 < 1073741824) {
            return (int) ((i9 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static LinkedHashMap m17372b(int i9) {
        return new LinkedHashMap(m17371a(i9));
    }
}
