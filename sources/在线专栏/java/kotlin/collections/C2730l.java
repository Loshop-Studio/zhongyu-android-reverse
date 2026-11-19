package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1034c;
import p138p2.C2998b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.l */
/* loaded from: classes.dex */
public class C2730l extends C2729k {
    @NotNull
    /* renamed from: c */
    public static final <T> Collection<T> m9136c(@NotNull T[] tArr) {
        C2769l.m9241e(tArr, "<this>");
        return new C2715c(tArr, false);
    }

    /* renamed from: d */
    public static final <T extends Comparable<? super T>> int m9137d(@NotNull List<? extends T> list, @Nullable T t3, int i4, int i5) {
        C2769l.m9241e(list, "<this>");
        m9146m(list.size(), i4, i5);
        int i6 = i5 - 1;
        while (i4 <= i6) {
            int i7 = (i4 + i6) >>> 1;
            int iM10105a = C2998b.m10105a(list.get(i7), t3);
            if (iM10105a < 0) {
                i4 = i7 + 1;
            } else {
                if (iM10105a <= 0) {
                    return i7;
                }
                i6 = i7 - 1;
            }
        }
        return -(i4 + 1);
    }

    /* renamed from: e */
    public static /* synthetic */ int m9138e(List list, Comparable comparable, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = list.size();
        }
        return m9137d(list, comparable, i4, i5);
    }

    @NotNull
    /* renamed from: f */
    public static <T> List<T> m9139f() {
        return C2740v.f10707a;
    }

    @NotNull
    /* renamed from: g */
    public static C1034c m9140g(@NotNull Collection<?> collection) {
        C2769l.m9241e(collection, "<this>");
        return new C1034c(0, collection.size() - 1);
    }

    /* renamed from: h */
    public static <T> int m9141h(@NotNull List<? extends T> list) {
        C2769l.m9241e(list, "<this>");
        return list.size() - 1;
    }

    @NotNull
    /* renamed from: i */
    public static <T> List<T> m9142i(@NotNull T... elements) {
        C2769l.m9241e(elements, "elements");
        return elements.length > 0 ? C2723g.m9080b(elements) : m9139f();
    }

    @NotNull
    /* renamed from: j */
    public static <T> List<T> m9143j(@NotNull T... elements) {
        C2769l.m9241e(elements, "elements");
        return C2725h.m9095o(elements);
    }

    @NotNull
    /* renamed from: k */
    public static <T> List<T> m9144k(@NotNull T... elements) {
        C2769l.m9241e(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C2715c(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: l */
    public static <T> List<T> m9145l(@NotNull List<? extends T> list) {
        C2769l.m9241e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C2729k.m9135b(list.get(0)) : m9139f();
    }

    /* renamed from: m */
    private static final void m9146m(int i4, int i5, int i6) {
        if (i5 > i6) {
            throw new IllegalArgumentException("fromIndex (" + i5 + ") is greater than toIndex (" + i6 + ").");
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i5 + ") is less than zero.");
        }
        if (i6 <= i4) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i6 + ") is greater than size (" + i4 + ").");
    }

    /* renamed from: n */
    public static void m9147n() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: o */
    public static void m9148o() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
