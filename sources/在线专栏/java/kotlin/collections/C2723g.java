package kotlin.collections;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.g */
/* loaded from: classes.dex */
public class C2723g extends C2721f {
    @NotNull
    /* renamed from: b */
    public static <T> List<T> m9080b(@NotNull T[] tArr) {
        C2769l.m9241e(tArr, "<this>");
        List<T> listM9105a = C2727i.m9105a(tArr);
        C2769l.m9240d(listM9105a, "asList(this)");
        return listM9105a;
    }

    @NotNull
    /* renamed from: c */
    public static byte[] m9081c(@NotNull byte[] bArr, @NotNull byte[] destination, int i4, int i5, int i6) {
        C2769l.m9241e(bArr, "<this>");
        C2769l.m9241e(destination, "destination");
        System.arraycopy(bArr, i5, destination, i4, i6 - i5);
        return destination;
    }

    @NotNull
    /* renamed from: d */
    public static final <T> T[] m9082d(@NotNull T[] tArr, @NotNull T[] destination, int i4, int i5, int i6) {
        C2769l.m9241e(tArr, "<this>");
        C2769l.m9241e(destination, "destination");
        System.arraycopy(tArr, i5, destination, i4, i6 - i5);
        return destination;
    }

    /* renamed from: e */
    public static /* synthetic */ byte[] m9083e(byte[] bArr, byte[] bArr2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = bArr.length;
        }
        return m9081c(bArr, bArr2, i4, i5, i6);
    }

    /* renamed from: f */
    public static /* synthetic */ Object[] m9084f(Object[] objArr, Object[] objArr2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = objArr.length;
        }
        return m9082d(objArr, objArr2, i4, i5, i6);
    }

    @NotNull
    /* renamed from: g */
    public static byte[] m9085g(@NotNull byte[] bArr, int i4, int i5) {
        C2769l.m9241e(bArr, "<this>");
        C2719e.m9077a(i5, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
        C2769l.m9240d(bArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return bArrCopyOfRange;
    }

    @NotNull
    /* renamed from: h */
    public static <T> T[] m9086h(@NotNull T[] tArr, int i4, int i5) {
        C2769l.m9241e(tArr, "<this>");
        C2719e.m9077a(i5, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i4, i5);
        C2769l.m9240d(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    /* renamed from: i */
    public static final void m9087i(@NotNull int[] iArr, int i4, int i5, int i6) {
        C2769l.m9241e(iArr, "<this>");
        Arrays.fill(iArr, i5, i6, i4);
    }

    /* renamed from: j */
    public static <T> void m9088j(@NotNull T[] tArr, T t3, int i4, int i5) {
        C2769l.m9241e(tArr, "<this>");
        Arrays.fill(tArr, i4, i5, t3);
    }

    /* renamed from: k */
    public static /* synthetic */ void m9089k(int[] iArr, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = iArr.length;
        }
        m9087i(iArr, i4, i5, i6);
    }

    /* renamed from: l */
    public static /* synthetic */ void m9090l(Object[] objArr, Object obj, int i4, int i5, int i6, Object obj2) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = objArr.length;
        }
        m9088j(objArr, obj, i4, i5);
    }
}
