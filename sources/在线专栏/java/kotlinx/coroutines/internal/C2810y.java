package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.jvm.internal.C2769l;
import kotlinx.coroutines.internal.InterfaceC2811z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.internal.y */
/* loaded from: classes.dex */
public class C2810y<T extends InterfaceC2811z & Comparable<? super T>> {

    @NotNull
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    @Nullable
    private T[] f10796a;

    /* renamed from: f */
    private final T[] m9363f() {
        T[] tArr = this.f10796a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new InterfaceC2811z[4];
            this.f10796a = tArr2;
            return tArr2;
        }
        if (m9370c() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, m9370c() * 2);
        C2769l.m9240d(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((InterfaceC2811z[]) objArrCopyOf);
        this.f10796a = tArr3;
        return tArr3;
    }

    /* renamed from: j */
    private final void m9364j(int i4) {
        this._size = i4;
    }

    /* renamed from: k */
    private final void m9365k(int i4) {
        while (true) {
            int i5 = (i4 * 2) + 1;
            if (i5 >= m9370c()) {
                return;
            }
            T[] tArr = this.f10796a;
            C2769l.m9239c(tArr);
            int i6 = i5 + 1;
            if (i6 < m9370c()) {
                T t3 = tArr[i6];
                C2769l.m9239c(t3);
                T t4 = tArr[i5];
                C2769l.m9239c(t4);
                if (((Comparable) t3).compareTo(t4) < 0) {
                    i5 = i6;
                }
            }
            T t5 = tArr[i4];
            C2769l.m9239c(t5);
            T t6 = tArr[i5];
            C2769l.m9239c(t6);
            if (((Comparable) t5).compareTo(t6) <= 0) {
                return;
            }
            m9367m(i4, i5);
            i4 = i5;
        }
    }

    /* renamed from: l */
    private final void m9366l(int i4) {
        while (i4 > 0) {
            T[] tArr = this.f10796a;
            C2769l.m9239c(tArr);
            int i5 = (i4 - 1) / 2;
            T t3 = tArr[i5];
            C2769l.m9239c(t3);
            T t4 = tArr[i4];
            C2769l.m9239c(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            m9367m(i4, i5);
            i4 = i5;
        }
    }

    /* renamed from: m */
    private final void m9367m(int i4, int i5) {
        T[] tArr = this.f10796a;
        C2769l.m9239c(tArr);
        T t3 = tArr[i5];
        C2769l.m9239c(t3);
        T t4 = tArr[i4];
        C2769l.m9239c(t4);
        tArr[i4] = t3;
        tArr[i5] = t4;
        t3.mo8519a(i4);
        t4.mo8519a(i5);
    }

    /* renamed from: a */
    public final void m9368a(@NotNull T t3) {
        t3.mo8521c(this);
        InterfaceC2811z[] interfaceC2811zArrM9363f = m9363f();
        int iM9370c = m9370c();
        m9364j(iM9370c + 1);
        interfaceC2811zArrM9363f[iM9370c] = t3;
        t3.mo8519a(iM9370c);
        m9366l(iM9370c);
    }

    @Nullable
    /* renamed from: b */
    public final T m9369b() {
        T[] tArr = this.f10796a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: c */
    public final int m9370c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean m9371d() {
        return m9370c() == 0;
    }

    @Nullable
    /* renamed from: e */
    public final T m9372e() {
        T t3;
        synchronized (this) {
            t3 = (T) m9369b();
        }
        return t3;
    }

    /* renamed from: g */
    public final boolean m9373g(@NotNull T t3) {
        boolean z3;
        synchronized (this) {
            if (t3.mo8522d() == null) {
                z3 = false;
            } else {
                m9374h(t3.getIndex());
                z3 = true;
            }
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T m9374h(int r6) {
        /*
            r5 = this;
            T extends kotlinx.coroutines.internal.z & java.lang.Comparable<? super T>[] r0 = r5.f10796a
            kotlin.jvm.internal.C2769l.m9239c(r0)
            int r1 = r5.m9370c()
            r2 = -1
            int r1 = r1 + r2
            r5.m9364j(r1)
            int r1 = r5.m9370c()
            if (r6 >= r1) goto L3d
            int r1 = r5.m9370c()
            r5.m9367m(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.C2769l.m9239c(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.C2769l.m9239c(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.m9367m(r6, r1)
            r5.m9366l(r1)
            goto L3d
        L3a:
            r5.m9365k(r6)
        L3d:
            int r6 = r5.m9370c()
            r6 = r0[r6]
            kotlin.jvm.internal.C2769l.m9239c(r6)
            r1 = 0
            r6.mo8521c(r1)
            r6.mo8519a(r2)
            int r2 = r5.m9370c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C2810y.m9374h(int):kotlinx.coroutines.internal.z");
    }

    @Nullable
    /* renamed from: i */
    public final T m9375i() {
        T t3;
        synchronized (this) {
            t3 = m9370c() > 0 ? (T) m9374h(0) : null;
        }
        return t3;
    }
}
