package p014b3;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p014b3.C1032a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b3.f */
/* loaded from: classes.dex */
public class C1037f extends C1036e {
    /* renamed from: b */
    public static int m4821b(int i4, int i5) {
        return i4 < i5 ? i5 : i4;
    }

    /* renamed from: c */
    public static long m4822c(long j4, long j5) {
        return j4 < j5 ? j5 : j4;
    }

    /* renamed from: d */
    public static int m4823d(int i4, int i5) {
        return i4 > i5 ? i5 : i4;
    }

    /* renamed from: e */
    public static long m4824e(long j4, long j5) {
        return j4 > j5 ? j5 : j4;
    }

    /* renamed from: f */
    public static int m4825f(int i4, int i5, int i6) {
        if (i5 <= i6) {
            return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i6 + " is less than minimum " + i5 + '.');
    }

    @NotNull
    /* renamed from: g */
    public static C1032a m4826g(int i4, int i5) {
        return C1032a.f5712d.m4806a(i4, i5, -1);
    }

    @NotNull
    /* renamed from: h */
    public static C1032a m4827h(@NotNull C1032a c1032a, int i4) {
        C2769l.m9241e(c1032a, "<this>");
        C1036e.m4820a(i4 > 0, Integer.valueOf(i4));
        C1032a.a aVar = C1032a.f5712d;
        int iM4802a = c1032a.m4802a();
        int iM4803b = c1032a.m4803b();
        if (c1032a.m4804c() <= 0) {
            i4 = -i4;
        }
        return aVar.m4806a(iM4802a, iM4803b, i4);
    }

    @NotNull
    /* renamed from: i */
    public static C1034c m4828i(int i4, int i5) {
        return i5 <= Integer.MIN_VALUE ? C1034c.f5720e.m4811a() : new C1034c(i4, i5 - 1);
    }
}
