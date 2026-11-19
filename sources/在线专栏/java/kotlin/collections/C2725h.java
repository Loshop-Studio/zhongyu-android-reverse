package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1034c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.h */
/* loaded from: classes.dex */
public class C2725h extends C2723g {
    /* renamed from: m */
    public static boolean m9093m(@NotNull char[] cArr, char c4) {
        C2769l.m9241e(cArr, "<this>");
        return m9099s(cArr, c4) >= 0;
    }

    /* renamed from: n */
    public static final <T> boolean m9094n(@NotNull T[] tArr, T t3) {
        C2769l.m9241e(tArr, "<this>");
        return m9100t(tArr, t3) >= 0;
    }

    @NotNull
    /* renamed from: o */
    public static final <T> List<T> m9095o(@NotNull T[] tArr) {
        C2769l.m9241e(tArr, "<this>");
        return (List) m9096p(tArr, new ArrayList());
    }

    @NotNull
    /* renamed from: p */
    public static final <C extends Collection<? super T>, T> C m9096p(@NotNull T[] tArr, @NotNull C destination) {
        C2769l.m9241e(tArr, "<this>");
        C2769l.m9241e(destination, "destination");
        int length = tArr.length;
        int i4 = 0;
        while (i4 < length) {
            T t3 = tArr[i4];
            i4++;
            if (t3 != null) {
                destination.add(t3);
            }
        }
        return destination;
    }

    @NotNull
    /* renamed from: q */
    public static <T> C1034c m9097q(@NotNull T[] tArr) {
        C2769l.m9241e(tArr, "<this>");
        return new C1034c(0, m9098r(tArr));
    }

    /* renamed from: r */
    public static <T> int m9098r(@NotNull T[] tArr) {
        C2769l.m9241e(tArr, "<this>");
        return tArr.length - 1;
    }

    /* renamed from: s */
    public static final int m9099s(@NotNull char[] cArr, char c4) {
        C2769l.m9241e(cArr, "<this>");
        int length = cArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            if (c4 == cArr[i4]) {
                return i4;
            }
            i4 = i5;
        }
        return -1;
    }

    /* renamed from: t */
    public static final <T> int m9100t(@NotNull T[] tArr, T t3) {
        C2769l.m9241e(tArr, "<this>");
        int i4 = 0;
        if (t3 == null) {
            int length = tArr.length;
            while (i4 < length) {
                int i5 = i4 + 1;
                if (tArr[i4] == null) {
                    return i4;
                }
                i4 = i5;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i4 < length2) {
            int i6 = i4 + 1;
            if (C2769l.m9237a(t3, tArr[i4])) {
                return i4;
            }
            i4 = i6;
        }
        return -1;
    }

    /* renamed from: u */
    public static char m9101u(@NotNull char[] cArr) {
        C2769l.m9241e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    /* renamed from: v */
    public static <T> T m9102v(@NotNull T[] tArr) {
        C2769l.m9241e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    @NotNull
    /* renamed from: w */
    public static <T> List<T> m9103w(@NotNull T[] tArr) {
        C2769l.m9241e(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? m9104x(tArr) : C2729k.m9135b(tArr[0]) : C2730l.m9139f();
    }

    @NotNull
    /* renamed from: x */
    public static <T> List<T> m9104x(@NotNull T[] tArr) {
        C2769l.m9241e(tArr, "<this>");
        return new ArrayList(C2730l.m9136c(tArr));
    }
}
