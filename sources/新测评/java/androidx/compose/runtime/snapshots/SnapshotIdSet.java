package androidx.compose.runtime.snapshots;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

@Metadata(m13557d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 &2\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001&B3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000J\u0012\u0010\u000e\u001a\u00020\u00002\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003J>\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002+\u0010\u0012\u001a'\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00000\u0013H\u0082\bJ!\u0010\u0017\u001a\u00020\u00182\u0016\u0010\u0019\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00180\u001aH\u0086\bJ\u0012\u0010\u001b\u001a\u00020\u001c2\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003J\u0013\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u001eH\u0096\u0002J\u0016\u0010\u001f\u001a\u00060\u0002j\u0002`\u00032\n\u0010 \u001a\u00060\u0002j\u0002`\u0003J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000J\u0012\u0010#\u001a\u00020\u00002\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003J\b\u0010$\u001a\u00020%H\u0016R\u0016\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m13558d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "upperSet", "lowerSet", "lowerBound", "belowBound", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "(JJJ[J)V", "and", "ids", "andNot", "clear", "id", "fastFold", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "acc", "fastForEach", "", "block", "Lkotlin/Function1;", "get", "", "iterator", "", "lowest", "default", "or", "bits", "set", "toString", "", "Companion", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@Immutable
@SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n274#1,7:318\n281#1,15:329\n276#1:344\n274#1,7:345\n281#1,15:356\n276#1:371\n274#1,7:372\n281#1,15:383\n276#1:398\n274#1,7:399\n281#1,15:410\n276#1:425\n274#1,7:426\n281#1,15:437\n276#1:452\n280#1:453\n281#1,15:458\n1#2:316\n143#3:317\n83#3,4:325\n83#3,4:352\n83#3,4:379\n83#3,4:406\n83#3,4:433\n83#3,4:454\n83#3,4:473\n68#3:477\n1549#4:478\n1620#4,3:479\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n198#1:318,7\n198#1:329,15\n198#1:344\n218#1:345,7\n218#1:356,15\n218#1:371\n222#1:372,7\n222#1:383,15\n222#1:398\n242#1:399,7\n242#1:410,15\n242#1:425\n245#1:426,7\n245#1:437,15\n245#1:452\n275#1:453\n275#1:458,15\n131#1:317\n198#1:325,4\n218#1:352,4\n222#1:379,4\n242#1:406,4\n245#1:433,4\n275#1:454,4\n280#1:473,4\n299#1:477\n306#1:478\n306#1:479,3\n*E\n"})
/* loaded from: classes2.dex */
public final class SnapshotIdSet implements Iterable<Long>, KMappedMarker {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    private final long[] belowBound;
    private final long lowerBound;
    private final long lowerSet;
    private final long upperSet;

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13558d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }

        private Companion() {
        }
    }

    @Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", m13596f = "SnapshotIdSet.kt", m13597i = {0, 0, 1, 1, 2, 2}, m13598l = {252, 256, 263}, m13599m = "invokeSuspend", m13600n = {"$this$sequence", "$this$forEach$iv", "$this$sequence", "index", "$this$sequence", "index"}, m13601s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet$iterator$1\n+ 2 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n*L\n1#1,315:1\n83#2,4:316\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet$iterator$1\n*L\n252#1:316,4\n*E\n"})
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1 */
    public static final class C25631 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Long>, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C25631(Continuation<? super C25631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25631 c25631 = SnapshotIdSet.this.new C25631(continuation);
            c25631.L$0 = obj;
            return c25631;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        
            if (r15.yield(r4, r20) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
        
            if (r13.yield(r4, r20) == r1) goto L40;
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
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.C25631.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Long> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C25631) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private SnapshotIdSet(long j10, long j11, long j12, long[] jArr) {
        this.upperSet = j10;
        this.lowerSet = j11;
        this.lowerBound = j12;
        this.belowBound = jArr;
    }

    private final SnapshotIdSet fastFold(SnapshotIdSet initial, Function2<? super SnapshotIdSet, ? super Long, SnapshotIdSet> operation) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            for (long j10 : jArr) {
                initial = operation.invoke(initial, Long.valueOf(j10));
            }
        }
        if (this.lowerSet != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((this.lowerSet & (1 << i10)) != 0) {
                    initial = operation.invoke(initial, Long.valueOf(this.lowerBound + i10));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((this.upperSet & (1 << i11)) != 0) {
                    initial = operation.invoke(initial, Long.valueOf(this.lowerBound + i11 + 64));
                }
            }
        }
        return initial;
    }

    public final SnapshotIdSet and(SnapshotIdSet ids) {
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (Intrinsics.areEqual(ids, snapshotIdSet) || Intrinsics.areEqual(this, snapshotIdSet)) {
            return snapshotIdSet;
        }
        long j10 = ids.lowerBound;
        long j11 = this.lowerBound;
        if (j10 == j11) {
            long[] jArr = ids.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                long j12 = this.upperSet;
                long j13 = ids.upperSet;
                long j14 = j12 & j13;
                long j15 = this.lowerSet;
                long j16 = ids.lowerSet;
                return (j14 == 0 && (j15 & j16) == 0 && jArr2 == null) ? snapshotIdSet : new SnapshotIdSet(j12 & j13, j15 & j16, j11, jArr2);
            }
        }
        SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
        int i10 = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j17 : jArr3) {
                    if (ids.get(j17)) {
                        snapshotIdSet2 = snapshotIdSet2.set(j17);
                    }
                }
            }
            SnapshotIdSet snapshotIdSet3 = snapshotIdSet2;
            if (this.lowerSet != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if ((this.lowerSet & (1 << i11)) != 0) {
                        long j18 = this.lowerBound + i11;
                        if (ids.get(j18)) {
                            snapshotIdSet3 = snapshotIdSet3.set(j18);
                        }
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i10 < 64) {
                    if ((this.upperSet & (1 << i10)) != 0) {
                        long j19 = this.lowerBound + i10 + 64;
                        if (ids.get(j19)) {
                            snapshotIdSet3 = snapshotIdSet3.set(j19);
                        }
                    }
                    i10++;
                }
            }
            return snapshotIdSet3;
        }
        long[] jArr4 = ids.belowBound;
        if (jArr4 != null) {
            for (long j20 : jArr4) {
                if (get(j20)) {
                    snapshotIdSet2 = snapshotIdSet2.set(j20);
                }
            }
        }
        SnapshotIdSet snapshotIdSet4 = snapshotIdSet2;
        if (ids.lowerSet != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((ids.lowerSet & (1 << i12)) != 0) {
                    long j21 = ids.lowerBound + i12;
                    if (get(j21)) {
                        snapshotIdSet4 = snapshotIdSet4.set(j21);
                    }
                }
            }
        }
        if (ids.upperSet != 0) {
            while (i10 < 64) {
                if ((ids.upperSet & (1 << i10)) != 0) {
                    long j22 = ids.lowerBound + i10 + 64;
                    if (get(j22)) {
                        snapshotIdSet4 = snapshotIdSet4.set(j22);
                    }
                }
                i10++;
            }
        }
        return snapshotIdSet4;
    }

    public final SnapshotIdSet andNot(SnapshotIdSet ids) {
        SnapshotIdSet snapshotIdSetClear;
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (ids == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return snapshotIdSet;
        }
        long j10 = ids.lowerBound;
        long j11 = this.lowerBound;
        if (j10 == j11) {
            long[] jArr = ids.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet((~ids.upperSet) & this.upperSet, (~ids.lowerSet) & this.lowerSet, j11, jArr2);
            }
        }
        long[] jArr3 = ids.belowBound;
        if (jArr3 != null) {
            snapshotIdSetClear = this;
            for (long j12 : jArr3) {
                snapshotIdSetClear = snapshotIdSetClear.clear(j12);
            }
        } else {
            snapshotIdSetClear = this;
        }
        if (ids.lowerSet != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((ids.lowerSet & (1 << i10)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(ids.lowerBound + i10);
                }
            }
        }
        if (ids.upperSet != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((ids.upperSet & (1 << i11)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(ids.lowerBound + i11 + 64);
                }
            }
        }
        return snapshotIdSetClear;
    }

    public final SnapshotIdSet clear(long id) {
        long[] jArr;
        int iBinarySearch;
        long j10 = this.lowerBound;
        long j11 = id - j10;
        if (j11 >= 0 && j11 < 64) {
            long j12 = 1 << ((int) j11);
            long j13 = this.lowerSet;
            if ((j13 & j12) != 0) {
                return new SnapshotIdSet(this.upperSet, j13 & (~j12), j10, this.belowBound);
            }
        } else if (j11 >= 64 && j11 < 128) {
            long j14 = 1 << (((int) j11) - 64);
            long j15 = this.upperSet;
            if ((j15 & j14) != 0) {
                return new SnapshotIdSet(j15 & (~j14), this.lowerSet, j10, this.belowBound);
            }
        } else if (j11 < 0 && (jArr = this.belowBound) != null && (iBinarySearch = SnapshotId_jvmKt.binarySearch(jArr, id)) >= 0) {
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdRemovedAt(jArr, iBinarySearch));
        }
        return this;
    }

    public final void fastForEach(Function1<? super Long, Unit> block) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            for (long j10 : jArr) {
                block.invoke(Long.valueOf(j10));
            }
        }
        if (this.lowerSet != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((this.lowerSet & (1 << i10)) != 0) {
                    block.invoke(Long.valueOf(this.lowerBound + i10));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((this.upperSet & (1 << i11)) != 0) {
                    block.invoke(Long.valueOf(this.lowerBound + i11 + 64));
                }
            }
        }
    }

    public final boolean get(long id) {
        long[] jArr;
        long j10 = id - this.lowerBound;
        return (j10 < 0 || j10 >= 64) ? (j10 < 64 || j10 >= 128) ? j10 <= 0 && (jArr = this.belowBound) != null && SnapshotId_jvmKt.binarySearch(jArr, id) >= 0 : ((1 << (((int) j10) + (-64))) & this.upperSet) != 0 : ((1 << ((int) j10)) & this.lowerSet) != 0;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return SequencesKt.sequence(new C25631(null)).iterator();
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
    public final SnapshotIdSet m1206or(SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet;
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (bits == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return bits;
        }
        long j10 = bits.lowerBound;
        long j11 = this.lowerBound;
        if (j10 == j11) {
            long[] jArr = bits.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet(bits.upperSet | this.upperSet, bits.lowerSet | this.lowerSet, j11, jArr2);
            }
        }
        int i10 = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j12 : jArr3) {
                    bits = bits.set(j12);
                }
            }
            if (this.lowerSet != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if ((this.lowerSet & (1 << i11)) != 0) {
                        bits = bits.set(this.lowerBound + i11);
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i10 < 64) {
                    if ((this.upperSet & (1 << i10)) != 0) {
                        bits = bits.set(this.lowerBound + i10 + 64);
                    }
                    i10++;
                }
            }
            return bits;
        }
        long[] jArr4 = bits.belowBound;
        if (jArr4 != null) {
            snapshotIdSet = this;
            for (long j13 : jArr4) {
                snapshotIdSet = snapshotIdSet.set(j13);
            }
        } else {
            snapshotIdSet = this;
        }
        if (bits.lowerSet != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((bits.lowerSet & (1 << i12)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.lowerBound + i12);
                }
            }
        }
        if (bits.upperSet != 0) {
            while (i10 < 64) {
                if ((bits.upperSet & (1 << i10)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.lowerBound + i10 + 64);
                }
                i10++;
            }
        }
        return snapshotIdSet;
    }

    public final SnapshotIdSet set(long id) {
        long j10;
        long j11;
        long[] array;
        long j12 = this.lowerBound;
        long j13 = id - j12;
        long j14 = 0;
        if (j13 >= 0 && j13 < 64) {
            long j15 = 1 << ((int) j13);
            long j16 = this.lowerSet;
            if ((j16 & j15) == 0) {
                return new SnapshotIdSet(this.upperSet, j16 | j15, j12, this.belowBound);
            }
        } else if (j13 >= 64 && j13 < 128) {
            long j17 = 1 << (((int) j13) - 64);
            long j18 = this.upperSet;
            if ((j18 & j17) == 0) {
                return new SnapshotIdSet(j18 | j17, this.lowerSet, j12, this.belowBound);
            }
        } else if (j13 < 128) {
            long[] jArr = this.belowBound;
            if (jArr == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, j12, new long[]{id});
            }
            int iBinarySearch = SnapshotId_jvmKt.binarySearch(jArr, id);
            if (iBinarySearch < 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdInsertedAt(jArr, -(iBinarySearch + 1), id));
            }
        } else if (!get(id)) {
            long j19 = this.upperSet;
            long j20 = this.lowerSet;
            long j21 = this.lowerBound;
            long j22 = 64;
            long j23 = ((id + 1) / j22) * j22;
            if (j23 < 0) {
                j23 = 9223372036854775680L;
            }
            SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
            long j24 = j19;
            while (true) {
                if (j21 >= j23) {
                    j10 = j20;
                    j11 = j21;
                    break;
                }
                if (j20 != j14) {
                    if (snapshotIdArrayBuilder == null) {
                        snapshotIdArrayBuilder = new SnapshotIdArrayBuilder(this.belowBound);
                    }
                    int i10 = 0;
                    while (i10 < 64) {
                        long j25 = j14;
                        if ((j20 & (1 << i10)) != j14) {
                            snapshotIdArrayBuilder.add(j21 + i10);
                        }
                        i10++;
                        j14 = j25;
                    }
                }
                j10 = j14;
                if (j24 == j10) {
                    j11 = j23;
                    break;
                }
                j21 += j22;
                j20 = j24;
                j14 = j10;
                j24 = j14;
            }
            if (snapshotIdArrayBuilder == null || (array = snapshotIdArrayBuilder.toArray()) == null) {
                array = this.belowBound;
            }
            return new SnapshotIdSet(j24, j10, j11, array).set(id);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        sb.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }
}
