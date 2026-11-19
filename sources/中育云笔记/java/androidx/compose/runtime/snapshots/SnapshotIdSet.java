package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Immutable;
import id.InterfaceC9624a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p296pd.AbstractC10661i;
import p296pd.AbstractC10662j;
import p309qc.C10786q;
import p325rc.AbstractC10980x;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@Immutable
/* loaded from: classes2.dex */
public final class SnapshotIdSet implements Iterable<Long>, InterfaceC9624a {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    private final long[] belowBound;
    private final long lowerBound;
    private final long lowerSet;
    private final long upperSet;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }

        private Companion() {
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", m26211f = "SnapshotIdSet.kt", m26212l = {252, 256, 263}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1 */
    public static final class C26221 extends RestrictedSuspendLambda implements InterfaceC9544p {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C26221(InterfaceC11588c<? super C26221> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C26221 c26221 = SnapshotIdSet.this.new C26221(interfaceC11588c);
            c26221.L$0 = obj;
            return c26221;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        
            if (r15.mo22551a(r4, r20) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
        
            if (r13.mo22551a(r4, r20) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b5 -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d3 -> B:43:0x00f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f2 -> B:42:0x00f3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.C26221.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AbstractC10661i abstractC10661i, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C26221) create(abstractC10661i, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    private SnapshotIdSet(long j10, long j11, long j12, long[] jArr) {
        this.upperSet = j10;
        this.lowerSet = j11;
        this.lowerBound = j12;
        this.belowBound = jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.runtime.snapshots.SnapshotIdSet] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [hd.p] */
    private final SnapshotIdSet fastFold(SnapshotIdSet snapshotIdSet, InterfaceC9544p interfaceC9544p) {
        long[] jArr = this.belowBound;
        int i10 = 0;
        if (jArr != null) {
            int length = jArr.length;
            int i11 = 0;
            snapshotIdSet = snapshotIdSet;
            while (i11 < length) {
                Object objInvoke = interfaceC9544p.invoke(snapshotIdSet, Long.valueOf(jArr[i11]));
                i11++;
                snapshotIdSet = objInvoke;
            }
        }
        if (this.lowerSet != 0) {
            int i12 = 0;
            snapshotIdSet = snapshotIdSet;
            while (i12 < 64) {
                if ((this.lowerSet & (1 << i12)) != 0) {
                    snapshotIdSet = interfaceC9544p.invoke(snapshotIdSet, Long.valueOf(this.lowerBound + i12));
                }
                i12++;
                snapshotIdSet = snapshotIdSet;
            }
        }
        snapshotIdSet = snapshotIdSet;
        if (this.upperSet != 0) {
            while (i10 < 64) {
                if ((this.upperSet & (1 << i10)) != 0) {
                    snapshotIdSet = interfaceC9544p.invoke(snapshotIdSet, Long.valueOf(this.lowerBound + i10 + 64));
                }
                i10++;
                snapshotIdSet = snapshotIdSet;
            }
        }
        return (SnapshotIdSet) snapshotIdSet;
    }

    public final SnapshotIdSet and(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (AbstractC9979u.m20289b(snapshotIdSet, snapshotIdSet2) || AbstractC9979u.m20289b(this, snapshotIdSet2)) {
            return snapshotIdSet2;
        }
        long j10 = snapshotIdSet.lowerBound;
        long j11 = this.lowerBound;
        if (j10 == j11) {
            long[] jArr = snapshotIdSet.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                long j12 = this.upperSet;
                long j13 = snapshotIdSet.upperSet;
                long j14 = j12 & j13;
                long j15 = this.lowerSet;
                long j16 = snapshotIdSet.lowerSet;
                return (j14 == 0 && (j15 & j16) == 0 && jArr2 == null) ? snapshotIdSet2 : new SnapshotIdSet(j12 & j13, j15 & j16, j11, jArr2);
            }
        }
        SnapshotIdSet snapshotIdSet3 = snapshotIdSet2;
        int i10 = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j17 : jArr3) {
                    if (snapshotIdSet.get(j17)) {
                        snapshotIdSet3 = snapshotIdSet3.set(j17);
                    }
                }
            }
            SnapshotIdSet snapshotIdSet4 = snapshotIdSet3;
            if (this.lowerSet != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if ((this.lowerSet & (1 << i11)) != 0) {
                        long j18 = this.lowerBound + i11;
                        if (snapshotIdSet.get(j18)) {
                            snapshotIdSet4 = snapshotIdSet4.set(j18);
                        }
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i10 < 64) {
                    if ((this.upperSet & (1 << i10)) != 0) {
                        long j19 = this.lowerBound + i10 + 64;
                        if (snapshotIdSet.get(j19)) {
                            snapshotIdSet4 = snapshotIdSet4.set(j19);
                        }
                    }
                    i10++;
                }
            }
            return snapshotIdSet4;
        }
        long[] jArr4 = snapshotIdSet.belowBound;
        if (jArr4 != null) {
            for (long j20 : jArr4) {
                if (get(j20)) {
                    snapshotIdSet3 = snapshotIdSet3.set(j20);
                }
            }
        }
        SnapshotIdSet snapshotIdSet5 = snapshotIdSet3;
        if (snapshotIdSet.lowerSet != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((snapshotIdSet.lowerSet & (1 << i12)) != 0) {
                    long j21 = snapshotIdSet.lowerBound + i12;
                    if (get(j21)) {
                        snapshotIdSet5 = snapshotIdSet5.set(j21);
                    }
                }
            }
        }
        if (snapshotIdSet.upperSet != 0) {
            while (i10 < 64) {
                if ((snapshotIdSet.upperSet & (1 << i10)) != 0) {
                    long j22 = snapshotIdSet.lowerBound + i10 + 64;
                    if (get(j22)) {
                        snapshotIdSet5 = snapshotIdSet5.set(j22);
                    }
                }
                i10++;
            }
        }
        return snapshotIdSet5;
    }

    public final SnapshotIdSet andNot(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSetClear;
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        long j10 = snapshotIdSet.lowerBound;
        long j11 = this.lowerBound;
        if (j10 == j11) {
            long[] jArr = snapshotIdSet.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet((~snapshotIdSet.upperSet) & this.upperSet, (~snapshotIdSet.lowerSet) & this.lowerSet, j11, jArr2);
            }
        }
        long[] jArr3 = snapshotIdSet.belowBound;
        if (jArr3 != null) {
            snapshotIdSetClear = this;
            for (long j12 : jArr3) {
                snapshotIdSetClear = snapshotIdSetClear.clear(j12);
            }
        } else {
            snapshotIdSetClear = this;
        }
        if (snapshotIdSet.lowerSet != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((snapshotIdSet.lowerSet & (1 << i10)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(snapshotIdSet.lowerBound + i10);
                }
            }
        }
        if (snapshotIdSet.upperSet != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((snapshotIdSet.upperSet & (1 << i11)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(snapshotIdSet.lowerBound + i11 + 64);
                }
            }
        }
        return snapshotIdSetClear;
    }

    public final SnapshotIdSet clear(long j10) {
        long[] jArr;
        int iBinarySearch;
        long j11 = this.lowerBound;
        long j12 = j10 - j11;
        if (j12 >= 0 && j12 < 64) {
            long j13 = 1 << ((int) j12);
            long j14 = this.lowerSet;
            if ((j14 & j13) != 0) {
                return new SnapshotIdSet(this.upperSet, j14 & (~j13), j11, this.belowBound);
            }
        } else if (j12 >= 64 && j12 < 128) {
            long j15 = 1 << (((int) j12) - 64);
            long j16 = this.upperSet;
            if ((j16 & j15) != 0) {
                return new SnapshotIdSet(j16 & (~j15), this.lowerSet, j11, this.belowBound);
            }
        } else if (j12 < 0 && (jArr = this.belowBound) != null && (iBinarySearch = SnapshotId_jvmKt.binarySearch(jArr, j10)) >= 0) {
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdRemovedAt(jArr, iBinarySearch));
        }
        return this;
    }

    public final void fastForEach(InterfaceC9540l interfaceC9540l) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            for (long j10 : jArr) {
                interfaceC9540l.invoke(Long.valueOf(j10));
            }
        }
        if (this.lowerSet != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((this.lowerSet & (1 << i10)) != 0) {
                    interfaceC9540l.invoke(Long.valueOf(this.lowerBound + i10));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((this.upperSet & (1 << i11)) != 0) {
                    interfaceC9540l.invoke(Long.valueOf(this.lowerBound + i11 + 64));
                }
            }
        }
    }

    public final boolean get(long j10) {
        long[] jArr;
        long j11 = j10 - this.lowerBound;
        return (j11 < 0 || j11 >= 64) ? (j11 < 64 || j11 >= 128) ? j11 <= 0 && (jArr = this.belowBound) != null && SnapshotId_jvmKt.binarySearch(jArr, j10) >= 0 : ((1 << (((int) j11) + (-64))) & this.upperSet) != 0 : ((1 << ((int) j11)) & this.lowerSet) != 0;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return AbstractC10662j.m22558b(new C26221(null)).iterator();
    }

    public final long lowest(long j10) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            return jArr[0];
        }
        if (this.lowerSet != 0) {
            return this.lowerBound + Long.numberOfTrailingZeros(r0);
        }
        return this.upperSet != 0 ? this.lowerBound + 64 + Long.numberOfTrailingZeros(r0) : j10;
    }

    /* renamed from: or */
    public final SnapshotIdSet m1056or(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2;
        SnapshotIdSet snapshotIdSet3 = EMPTY;
        if (snapshotIdSet == snapshotIdSet3) {
            return this;
        }
        if (this == snapshotIdSet3) {
            return snapshotIdSet;
        }
        long j10 = snapshotIdSet.lowerBound;
        long j11 = this.lowerBound;
        if (j10 == j11) {
            long[] jArr = snapshotIdSet.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet(snapshotIdSet.upperSet | this.upperSet, snapshotIdSet.lowerSet | this.lowerSet, j11, jArr2);
            }
        }
        int i10 = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j12 : jArr3) {
                    snapshotIdSet = snapshotIdSet.set(j12);
                }
            }
            if (this.lowerSet != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if ((this.lowerSet & (1 << i11)) != 0) {
                        snapshotIdSet = snapshotIdSet.set(this.lowerBound + i11);
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i10 < 64) {
                    if ((this.upperSet & (1 << i10)) != 0) {
                        snapshotIdSet = snapshotIdSet.set(this.lowerBound + i10 + 64);
                    }
                    i10++;
                }
            }
            return snapshotIdSet;
        }
        long[] jArr4 = snapshotIdSet.belowBound;
        if (jArr4 != null) {
            snapshotIdSet2 = this;
            for (long j13 : jArr4) {
                snapshotIdSet2 = snapshotIdSet2.set(j13);
            }
        } else {
            snapshotIdSet2 = this;
        }
        if (snapshotIdSet.lowerSet != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((snapshotIdSet.lowerSet & (1 << i12)) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.set(snapshotIdSet.lowerBound + i12);
                }
            }
        }
        if (snapshotIdSet.upperSet != 0) {
            while (i10 < 64) {
                if ((snapshotIdSet.upperSet & (1 << i10)) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.set(snapshotIdSet.lowerBound + i10 + 64);
                }
                i10++;
            }
        }
        return snapshotIdSet2;
    }

    public final SnapshotIdSet set(long j10) {
        long j11;
        long j12;
        long[] array;
        long j13 = this.lowerBound;
        long j14 = j10 - j13;
        long j15 = 0;
        if (j14 >= 0 && j14 < 64) {
            long j16 = 1 << ((int) j14);
            long j17 = this.lowerSet;
            if ((j17 & j16) == 0) {
                return new SnapshotIdSet(this.upperSet, j17 | j16, j13, this.belowBound);
            }
        } else if (j14 >= 64 && j14 < 128) {
            long j18 = 1 << (((int) j14) - 64);
            long j19 = this.upperSet;
            if ((j19 & j18) == 0) {
                return new SnapshotIdSet(j19 | j18, this.lowerSet, j13, this.belowBound);
            }
        } else if (j14 < 128) {
            long[] jArr = this.belowBound;
            if (jArr == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, j13, new long[]{j10});
            }
            int iBinarySearch = SnapshotId_jvmKt.binarySearch(jArr, j10);
            if (iBinarySearch < 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdInsertedAt(jArr, -(iBinarySearch + 1), j10));
            }
        } else if (!get(j10)) {
            long j20 = this.upperSet;
            long j21 = this.lowerSet;
            long j22 = this.lowerBound;
            long j23 = 64;
            long j24 = ((j10 + 1) / j23) * j23;
            if (j24 < 0) {
                j24 = 9223372036854775680L;
            }
            SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
            long j25 = j20;
            while (true) {
                if (j22 >= j24) {
                    j11 = j21;
                    j12 = j22;
                    break;
                }
                if (j21 != j15) {
                    if (snapshotIdArrayBuilder == null) {
                        snapshotIdArrayBuilder = new SnapshotIdArrayBuilder(this.belowBound);
                    }
                    int i10 = 0;
                    while (i10 < 64) {
                        long j26 = j15;
                        if ((j21 & (1 << i10)) != j15) {
                            snapshotIdArrayBuilder.add(j22 + i10);
                        }
                        i10++;
                        j15 = j26;
                    }
                }
                j11 = j15;
                if (j25 == j11) {
                    j12 = j24;
                    break;
                }
                j22 += j23;
                j21 = j25;
                j15 = j11;
                j25 = j15;
            }
            if (snapshotIdArrayBuilder == null || (array = snapshotIdArrayBuilder.toArray()) == null) {
                array = this.belowBound;
            }
            return new SnapshotIdSet(j25, j11, j12, array).set(j10);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        sb2.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }
}
