package p006a5;

import java.util.LinkedHashMap;

/* renamed from: a5.a */
/* loaded from: classes4.dex */
public abstract class AbstractC0012a {
    /* renamed from: a */
    public static int m14a(int i6) {
        if (i6 < 3) {
            return i6 + 1;
        }
        if (i6 < 1073741824) {
            return (int) ((i6 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static LinkedHashMap m15b(int i6) {
        return new LinkedHashMap(m14a(i6));
    }
}
