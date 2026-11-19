package androidx.compose.runtime.snapshots;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
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

@Metadata(m13412d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 &2\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001&B3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000J\u0012\u0010\u000e\u001a\u00020\u00002\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003J>\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002+\u0010\u0012\u001a'\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00000\u0013H\u0082\bJ!\u0010\u0017\u001a\u00020\u00182\u0016\u0010\u0019\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00180\u001aH\u0086\bJ\u0012\u0010\u001b\u001a\u00020\u001c2\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003J\u0013\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u001eH\u0096\u0002J\u0016\u0010\u001f\u001a\u00060\u0002j\u0002`\u00032\n\u0010 \u001a\u00060\u0002j\u0002`\u0003J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000J\u0012\u0010#\u001a\u00020\u00002\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003J\b\u0010$\u001a\u00020%H\u0016R\u0016\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m13413d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "upperSet", "lowerSet", "lowerBound", "belowBound", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "(JJJ[J)V", "and", "ids", "andNot", "clear", "id", "fastFold", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "acc", "fastForEach", "", "block", "Lkotlin/Function1;", "get", "", "iterator", "", "lowest", "default", "or", "bits", "set", "toString", "", "Companion", "runtime_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    @Metadata(m13412d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13413d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    @Metadata(m13412d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;"}, m13414k = 3, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", m13451f = "SnapshotIdSet.kt", m13452i = {0, 0, 1, 1, 2, 2}, m13453l = {252, 256, 263}, m13454m = "invokeSuspend", m13455n = {"$this$sequence", "$this$forEach$iv", "$this$sequence", "index", "$this$sequence", "index"}, m13456s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet$iterator$1\n+ 2 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n*L\n1#1,315:1\n83#2,4:316\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet$iterator$1\n*L\n252#1:316,4\n*E\n"})
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1 */
    public static final class C25511 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Long>, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C25511(Continuation<? super C25511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25511 c25511 = SnapshotIdSet.this.new C25511(continuation);
            c25511.L$0 = obj;
            return c25511;
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.C25511.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Long> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C25511) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private SnapshotIdSet(long j9, long j10, long j11, long[] jArr) {
        this.upperSet = j9;
        this.lowerSet = j10;
        this.lowerBound = j11;
        this.belowBound = jArr;
    }

    private final SnapshotIdSet fastFold(SnapshotIdSet initial, Function2<? super SnapshotIdSet, ? super Long, SnapshotIdSet> operation) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            for (long j9 : jArr) {
                initial = operation.invoke(initial, Long.valueOf(j9));
            }
        }
        if (this.lowerSet != 0) {
            for (int i9 = 0; i9 < 64; i9++) {
                if ((this.lowerSet & (1 << i9)) != 0) {
                    initial = operation.invoke(initial, Long.valueOf(this.lowerBound + i9));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((this.upperSet & (1 << i10)) != 0) {
                    initial = operation.invoke(initial, Long.valueOf(this.lowerBound + i10 + 64));
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
        long j9 = ids.lowerBound;
        long j10 = this.lowerBound;
        if (j9 == j10) {
            long[] jArr = ids.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                long j11 = this.upperSet;
                long j12 = ids.upperSet;
                long j13 = j11 & j12;
                long j14 = this.lowerSet;
                long j15 = ids.lowerSet;
                return (j13 == 0 && (j14 & j15) == 0 && jArr2 == null) ? snapshotIdSet : new SnapshotIdSet(j11 & j12, j14 & j15, j10, jArr2);
            }
        }
        SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
        int i9 = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j16 : jArr3) {
                    if (ids.get(j16)) {
                        snapshotIdSet2 = snapshotIdSet2.set(j16);
                    }
                }
            }
            SnapshotIdSet snapshotIdSet3 = snapshotIdSet2;
            if (this.lowerSet != 0) {
                for (int i10 = 0; i10 < 64; i10++) {
                    if ((this.lowerSet & (1 << i10)) != 0) {
                        long j17 = this.lowerBound + i10;
                        if (ids.get(j17)) {
                            snapshotIdSet3 = snapshotIdSet3.set(j17);
                        }
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i9 < 64) {
                    if ((this.upperSet & (1 << i9)) != 0) {
                        long j18 = this.lowerBound + i9 + 64;
                        if (ids.get(j18)) {
                            snapshotIdSet3 = snapshotIdSet3.set(j18);
                        }
                    }
                    i9++;
                }
            }
            return snapshotIdSet3;
        }
        long[] jArr4 = ids.belowBound;
        if (jArr4 != null) {
            for (long j19 : jArr4) {
                if (get(j19)) {
                    snapshotIdSet2 = snapshotIdSet2.set(j19);
                }
            }
        }
        SnapshotIdSet snapshotIdSet4 = snapshotIdSet2;
        if (ids.lowerSet != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((ids.lowerSet & (1 << i11)) != 0) {
                    long j20 = ids.lowerBound + i11;
                    if (get(j20)) {
                        snapshotIdSet4 = snapshotIdSet4.set(j20);
                    }
                }
            }
        }
        if (ids.upperSet != 0) {
            while (i9 < 64) {
                if ((ids.upperSet & (1 << i9)) != 0) {
                    long j21 = ids.lowerBound + i9 + 64;
                    if (get(j21)) {
                        snapshotIdSet4 = snapshotIdSet4.set(j21);
                    }
                }
                i9++;
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
        long j9 = ids.lowerBound;
        long j10 = this.lowerBound;
        if (j9 == j10) {
            long[] jArr = ids.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet((~ids.upperSet) & this.upperSet, (~ids.lowerSet) & this.lowerSet, j10, jArr2);
            }
        }
        long[] jArr3 = ids.belowBound;
        if (jArr3 != null) {
            snapshotIdSetClear = this;
            for (long j11 : jArr3) {
                snapshotIdSetClear = snapshotIdSetClear.clear(j11);
            }
        } else {
            snapshotIdSetClear = this;
        }
        if (ids.lowerSet != 0) {
            for (int i9 = 0; i9 < 64; i9++) {
                if ((ids.lowerSet & (1 << i9)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(ids.lowerBound + i9);
                }
            }
        }
        if (ids.upperSet != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((ids.upperSet & (1 << i10)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(ids.lowerBound + i10 + 64);
                }
            }
        }
        return snapshotIdSetClear;
    }

    public final SnapshotIdSet clear(long id) {
        long[] jArr;
        int iBinarySearch;
        long j9 = this.lowerBound;
        long j10 = id - j9;
        if (j10 >= 0 && j10 < 64) {
            long j11 = 1 << ((int) j10);
            long j12 = this.lowerSet;
            if ((j12 & j11) != 0) {
                return new SnapshotIdSet(this.upperSet, j12 & (~j11), j9, this.belowBound);
            }
        } else if (j10 >= 64 && j10 < 128) {
            long j13 = 1 << (((int) j10) - 64);
            long j14 = this.upperSet;
            if ((j14 & j13) != 0) {
                return new SnapshotIdSet(j14 & (~j13), this.lowerSet, j9, this.belowBound);
            }
        } else if (j10 < 0 && (jArr = this.belowBound) != null && (iBinarySearch = SnapshotId_jvmKt.binarySearch(jArr, id)) >= 0) {
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdRemovedAt(jArr, iBinarySearch));
        }
        return this;
    }

    public final void fastForEach(Function1<? super Long, Unit> block) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            for (long j9 : jArr) {
                block.invoke(Long.valueOf(j9));
            }
        }
        if (this.lowerSet != 0) {
            for (int i9 = 0; i9 < 64; i9++) {
                if ((this.lowerSet & (1 << i9)) != 0) {
                    block.invoke(Long.valueOf(this.lowerBound + i9));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((this.upperSet & (1 << i10)) != 0) {
                    block.invoke(Long.valueOf(this.lowerBound + i10 + 64));
                }
            }
        }
    }

    public final boolean get(long id) {
        long[] jArr;
        long j9 = id - this.lowerBound;
        return (j9 < 0 || j9 >= 64) ? (j9 < 64 || j9 >= 128) ? j9 <= 0 && (jArr = this.belowBound) != null && SnapshotId_jvmKt.binarySearch(jArr, id) >= 0 : ((1 << (((int) j9) + (-64))) & this.upperSet) != 0 : ((1 << ((int) j9)) & this.lowerSet) != 0;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return SequencesKt.sequence(new C25511(null)).iterator();
    }

    public final long lowest(long j9) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            return jArr[0];
        }
        if (this.lowerSet != 0) {
            return this.lowerBound + Long.numberOfTrailingZeros(r0);
        }
        return this.upperSet != 0 ? this.lowerBound + 64 + Long.numberOfTrailingZeros(r0) : j9;
    }

    /* renamed from: or */
    public final SnapshotIdSet m984or(SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet;
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (bits == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return bits;
        }
        long j9 = bits.lowerBound;
        long j10 = this.lowerBound;
        if (j9 == j10) {
            long[] jArr = bits.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet(bits.upperSet | this.upperSet, bits.lowerSet | this.lowerSet, j10, jArr2);
            }
        }
        int i9 = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j11 : jArr3) {
                    bits = bits.set(j11);
                }
            }
            if (this.lowerSet != 0) {
                for (int i10 = 0; i10 < 64; i10++) {
                    if ((this.lowerSet & (1 << i10)) != 0) {
                        bits = bits.set(this.lowerBound + i10);
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i9 < 64) {
                    if ((this.upperSet & (1 << i9)) != 0) {
                        bits = bits.set(this.lowerBound + i9 + 64);
                    }
                    i9++;
                }
            }
            return bits;
        }
        long[] jArr4 = bits.belowBound;
        if (jArr4 != null) {
            snapshotIdSet = this;
            for (long j12 : jArr4) {
                snapshotIdSet = snapshotIdSet.set(j12);
            }
        } else {
            snapshotIdSet = this;
        }
        if (bits.lowerSet != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((bits.lowerSet & (1 << i11)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.lowerBound + i11);
                }
            }
        }
        if (bits.upperSet != 0) {
            while (i9 < 64) {
                if ((bits.upperSet & (1 << i9)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.lowerBound + i9 + 64);
                }
                i9++;
            }
        }
        return snapshotIdSet;
    }

    public final SnapshotIdSet set(long id) {
        long j9;
        long j10;
        long[] array;
        long j11 = this.lowerBound;
        long j12 = id - j11;
        long j13 = 0;
        if (j12 >= 0 && j12 < 64) {
            long j14 = 1 << ((int) j12);
            long j15 = this.lowerSet;
            if ((j15 & j14) == 0) {
                return new SnapshotIdSet(this.upperSet, j15 | j14, j11, this.belowBound);
            }
        } else if (j12 >= 64 && j12 < 128) {
            long j16 = 1 << (((int) j12) - 64);
            long j17 = this.upperSet;
            if ((j17 & j16) == 0) {
                return new SnapshotIdSet(j17 | j16, this.lowerSet, j11, this.belowBound);
            }
        } else if (j12 < 128) {
            long[] jArr = this.belowBound;
            if (jArr == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, j11, new long[]{id});
            }
            int iBinarySearch = SnapshotId_jvmKt.binarySearch(jArr, id);
            if (iBinarySearch < 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdInsertedAt(jArr, -(iBinarySearch + 1), id));
            }
        } else if (!get(id)) {
            long j18 = this.upperSet;
            long j19 = this.lowerSet;
            long j20 = this.lowerBound;
            long j21 = 64;
            long j22 = ((id + 1) / j21) * j21;
            if (j22 < 0) {
                j22 = 9223372036854775680L;
            }
            SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
            long j23 = j18;
            while (true) {
                if (j20 >= j22) {
                    j9 = j19;
                    j10 = j20;
                    break;
                }
                if (j19 != j13) {
                    if (snapshotIdArrayBuilder == null) {
                        snapshotIdArrayBuilder = new SnapshotIdArrayBuilder(this.belowBound);
                    }
                    int i9 = 0;
                    while (i9 < 64) {
                        long j24 = j13;
                        if ((j19 & (1 << i9)) != j13) {
                            snapshotIdArrayBuilder.add(j20 + i9);
                        }
                        i9++;
                        j13 = j24;
                    }
                }
                j9 = j13;
                if (j23 == j9) {
                    j10 = j22;
                    break;
                }
                j20 += j21;
                j19 = j23;
                j13 = j9;
                j23 = j13;
            }
            if (snapshotIdArrayBuilder == null || (array = snapshotIdArrayBuilder.toArray()) == null) {
                array = this.belowBound;
            }
            return new SnapshotIdSet(j23, j9, j10, array).set(id);
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
