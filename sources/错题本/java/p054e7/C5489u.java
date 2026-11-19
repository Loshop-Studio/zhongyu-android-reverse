package p054e7;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractRunnableC5978l0;
import kotlinx.coroutines.C5981m0;

/* renamed from: e7.u */
/* loaded from: classes4.dex */
public class C5489u {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8484b = AtomicIntegerFieldUpdater.newUpdater(C5489u.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a */
    public AbstractRunnableC5978l0[] f8485a;

    /* renamed from: a */
    public final void m4867a(AbstractRunnableC5978l0 abstractRunnableC5978l0) {
        abstractRunnableC5978l0.m5595c((C5981m0) this);
        AbstractRunnableC5978l0[] abstractRunnableC5978l0Arr = this.f8485a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8484b;
        if (abstractRunnableC5978l0Arr == null) {
            abstractRunnableC5978l0Arr = new AbstractRunnableC5978l0[4];
            this.f8485a = abstractRunnableC5978l0Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC5978l0Arr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(abstractRunnableC5978l0Arr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
            abstractRunnableC5978l0Arr = (AbstractRunnableC5978l0[]) objArrCopyOf;
            this.f8485a = abstractRunnableC5978l0Arr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC5978l0Arr[i] = abstractRunnableC5978l0;
        abstractRunnableC5978l0.f9469b = i;
        m4869c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.AbstractRunnableC5978l0 m4868b(int r9) {
        /*
            r8 = this;
            kotlinx.coroutines.l0[] r0 = r8.f8485a
            kotlin.jvm.internal.AbstractC5830k.m5327d(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p054e7.C5489u.f8484b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.m4870d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.AbstractC5830k.m5327d(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.AbstractC5830k.m5327d(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.m4870d(r9, r2)
            r8.m4869c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            kotlinx.coroutines.l0[] r5 = r8.f8485a
            kotlin.jvm.internal.AbstractC5830k.m5327d(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.AbstractC5830k.m5327d(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.AbstractC5830k.m5327d(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.AbstractC5830k.m5327d(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.AbstractC5830k.m5327d(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.m4870d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.AbstractC5830k.m5327d(r9)
            r2 = 0
            r9.m5595c(r2)
            r9.f9469b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p054e7.C5489u.m4868b(int):kotlinx.coroutines.l0");
    }

    /* renamed from: c */
    public final void m4869c(int i) {
        while (i > 0) {
            AbstractRunnableC5978l0[] abstractRunnableC5978l0Arr = this.f8485a;
            AbstractC5830k.m5327d(abstractRunnableC5978l0Arr);
            int i8 = (i - 1) / 2;
            AbstractRunnableC5978l0 abstractRunnableC5978l0 = abstractRunnableC5978l0Arr[i8];
            AbstractC5830k.m5327d(abstractRunnableC5978l0);
            AbstractRunnableC5978l0 abstractRunnableC5978l02 = abstractRunnableC5978l0Arr[i];
            AbstractC5830k.m5327d(abstractRunnableC5978l02);
            if (abstractRunnableC5978l0.compareTo(abstractRunnableC5978l02) <= 0) {
                return;
            }
            m4870d(i, i8);
            i = i8;
        }
    }

    /* renamed from: d */
    public final void m4870d(int i, int i8) {
        AbstractRunnableC5978l0[] abstractRunnableC5978l0Arr = this.f8485a;
        AbstractC5830k.m5327d(abstractRunnableC5978l0Arr);
        AbstractRunnableC5978l0 abstractRunnableC5978l0 = abstractRunnableC5978l0Arr[i8];
        AbstractC5830k.m5327d(abstractRunnableC5978l0);
        AbstractRunnableC5978l0 abstractRunnableC5978l02 = abstractRunnableC5978l0Arr[i];
        AbstractC5830k.m5327d(abstractRunnableC5978l02);
        abstractRunnableC5978l0Arr[i] = abstractRunnableC5978l0;
        abstractRunnableC5978l0Arr[i8] = abstractRunnableC5978l02;
        abstractRunnableC5978l0.f9469b = i;
        abstractRunnableC5978l02.f9469b = i8;
    }
}
