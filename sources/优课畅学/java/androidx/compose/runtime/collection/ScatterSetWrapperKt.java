package androidx.compose.runtime.collection;

import androidx.collection.ScatterSet;
import java.util.Iterator;
import java.util.Set;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class ScatterSetWrapperKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean fastAny(java.util.Set<? extends java.lang.Object> r14, p300x7.InterfaceC10570l r15) {
        /*
            boolean r0 = r14 instanceof androidx.compose.runtime.collection.ScatterSetWrapper
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L59
            androidx.compose.runtime.collection.ScatterSetWrapper r14 = (androidx.compose.runtime.collection.ScatterSetWrapper) r14
            androidx.collection.ScatterSet r14 = r14.getSet$runtime_release()
            java.lang.Object[] r0 = r14.elements
            long[] r14 = r14.metadata
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L58
            r4 = r2
        L16:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L53
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L30:
            if (r9 >= r7) goto L51
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Object r10 = r15.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4d
            return r1
        L4d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L30
        L51:
            if (r7 != r8) goto L58
        L53:
            if (r4 == r3) goto L58
            int r4 = r4 + 1
            goto L16
        L58:
            return r2
        L59:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            boolean r0 = r14 instanceof java.util.Collection
            if (r0 == 0) goto L69
            r0 = r14
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L69
            return r2
        L69:
            java.util.Iterator r14 = r14.iterator()
        L6d:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r14.next()
            java.lang.Object r0 = r15.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6d
            return r1
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScatterSetWrapperKt.fastAny(java.util.Set, x7.l):boolean");
    }

    public static final <T> void fastForEach(Set<? extends T> set, InterfaceC10570l interfaceC10570l) {
        if (!(set instanceof ScatterSetWrapper)) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                interfaceC10570l.invoke(it.next());
            }
            return;
        }
        ScatterSet<T> set$runtime_release = ((ScatterSetWrapper) set).getSet$runtime_release();
        Object[] objArr = set$runtime_release.elements;
        long[] jArr = set$runtime_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        interfaceC10570l.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final <T> Set<T> wrapIntoSet(ScatterSet<T> scatterSet) {
        return new ScatterSetWrapper(scatterSet);
    }
}
