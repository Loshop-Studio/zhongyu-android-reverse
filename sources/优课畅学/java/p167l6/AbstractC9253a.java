package p167l6;

import java.util.LinkedHashMap;

/* renamed from: l6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9253a {
    /* renamed from: a */
    public static int m16961a(int i10) {
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static LinkedHashMap m16962b(int i10) {
        return new LinkedHashMap(m16961a(i10));
    }
}
