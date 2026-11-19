package androidx.compose.runtime.snapshots;

import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p160s6.InterfaceC6560a;
import p185v7.AbstractC6683l;
import p214z6.AbstractC6832j;

@Metadata(m5109d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 12\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u00011B5\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJE\u0010\u0012\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002+\u0010\u0011\u001a'\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00000\rH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00002\n\u0010\u0014\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00002\n\u0010\u0014\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010\"\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030!H\u0096\u0002¢\u0006\u0004\b\"\u0010#J(\u0010'\u001a\u00020%2\u0016\u0010&\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020%0$H\u0086\b¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\u00060\u0002j\u0002`\u00032\n\u0010)\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u001c\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100¨\u00062"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "upperSet", "lowerSet", "lowerBound", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "belowBound", "<init>", "(JJJ[J)V", "initial", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "acc", "operation", "fastFold", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;Lr6/e;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "id", "", "get", "(J)Z", "set", "(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "clear", "ids", "andNot", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "and", "bits", "or", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/Function1;", "Ld6/s;", "block", "fastForEach", "(Lr6/c;)V", "default", "lowest", "(J)J", "", "toString", "()Ljava/lang/String;", "J", "[J", "Companion", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n274#1,7:318\n281#1,15:329\n276#1:344\n274#1,7:345\n281#1,15:356\n276#1:371\n274#1,7:372\n281#1,15:383\n276#1:398\n274#1,7:399\n281#1,15:410\n276#1:425\n274#1,7:426\n281#1,15:437\n276#1:452\n280#1:453\n281#1,15:458\n1#2:316\n143#3:317\n83#3,4:325\n83#3,4:352\n83#3,4:379\n83#3,4:406\n83#3,4:433\n83#3,4:454\n83#3,4:473\n68#3:477\n1549#4:478\n1620#4,3:479\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n198#1:318,7\n198#1:329,15\n198#1:344\n218#1:345,7\n218#1:356,15\n218#1:371\n222#1:372,7\n222#1:383,15\n222#1:398\n242#1:399,7\n242#1:410,15\n242#1:425\n245#1:426,7\n245#1:437,15\n245#1:452\n275#1:453\n275#1:458,15\n131#1:317\n198#1:325,4\n218#1:352,4\n222#1:379,4\n242#1:406,4\n245#1:433,4\n275#1:454,4\n280#1:473,4\n299#1:477\n306#1:478\n306#1:479,3\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Long>, InterfaceC6560a {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);

    @Nullable
    private final long[] belowBound;
    private final long lowerBound;
    private final long lowerSet;
    private final long upperSet;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {"Lz6/j;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "Ld6/s;", "<anonymous>", "(Lz6/j;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", m5303f = "SnapshotIdSet.kt", m5304i = {0, 0, 1, 1, 2, 2}, m5305l = {252, 256, 263}, m5306m = "invokeSuspend", m5307n = {"$this$sequence", "$this$forEach$iv", "$this$sequence", "index", "$this$sequence", "index"}, m5308s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet$iterator$1\n+ 2 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n*L\n1#1,315:1\n83#2,4:316\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet$iterator$1\n*L\n252#1:316,4\n*E\n"})
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1 */
    public static final class C20611 extends RestrictedSuspendLambda implements InterfaceC6473e {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C20611(InterfaceC5631c<? super C20611> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C20611 c20611 = SnapshotIdSet.this.new C20611(interfaceC5631c);
            c20611.L$0 = obj;
            return c20611;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
        
            if (r15.mo6491a(r18, r9) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
        
            if (r13.mo6491a(r18, r9) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0077 -> B:19:0x007b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0099 -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b4 -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d3 -> B:43:0x00f5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f3 -> B:42:0x00f4). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.C20611.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AbstractC6832j abstractC6832j, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C20611) create(abstractC6832j, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    private SnapshotIdSet(long j7, long j8, long j9, long[] jArr) {
        this.upperSet = j7;
        this.lowerSet = j8;
        this.lowerBound = j9;
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
    /* JADX WARN: Type inference failed for: r13v0, types: [r6.e] */
    private final SnapshotIdSet fastFold(SnapshotIdSet initial, InterfaceC6473e operation) {
        long[] jArr = this.belowBound;
        int i = 0;
        if (jArr != null) {
            int length = jArr.length;
            int i8 = 0;
            initial = initial;
            while (i8 < length) {
                Object objInvoke = operation.invoke(initial, Long.valueOf(jArr[i8]));
                i8++;
                initial = objInvoke;
            }
        }
        if (this.lowerSet != 0) {
            int i9 = 0;
            initial = initial;
            while (i9 < 64) {
                if ((this.lowerSet & (1 << i9)) != 0) {
                    initial = operation.invoke(initial, Long.valueOf(this.lowerBound + i9));
                }
                i9++;
                initial = initial;
            }
        }
        initial = initial;
        if (this.upperSet != 0) {
            while (i < 64) {
                if ((this.upperSet & (1 << i)) != 0) {
                    initial = operation.invoke(initial, Long.valueOf(this.lowerBound + i + 64));
                }
                i++;
                initial = initial;
            }
        }
        return (SnapshotIdSet) initial;
    }

    @NotNull
    public final SnapshotIdSet and(@NotNull SnapshotIdSet ids) {
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (AbstractC5830k.m5325b(ids, snapshotIdSet) || equals(snapshotIdSet)) {
            return snapshotIdSet;
        }
        long j7 = ids.lowerBound;
        long j8 = this.lowerBound;
        if (j7 == j8) {
            long[] jArr = ids.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                long j9 = this.upperSet;
                long j10 = ids.upperSet;
                long j11 = j9 & j10;
                long j12 = this.lowerSet;
                long j13 = ids.lowerSet;
                return (j11 == 0 && (j12 & j13) == 0 && jArr2 == null) ? snapshotIdSet : new SnapshotIdSet(j9 & j10, j12 & j13, j8, jArr2);
            }
        }
        SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
        int i = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j14 : jArr3) {
                    if (ids.get(j14)) {
                        snapshotIdSet2 = snapshotIdSet2.set(j14);
                    }
                }
            }
            SnapshotIdSet snapshotIdSet3 = snapshotIdSet2;
            if (this.lowerSet != 0) {
                for (int i8 = 0; i8 < 64; i8++) {
                    if ((this.lowerSet & (1 << i8)) != 0) {
                        long j15 = this.lowerBound + i8;
                        if (ids.get(j15)) {
                            snapshotIdSet3 = snapshotIdSet3.set(j15);
                        }
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i < 64) {
                    if ((this.upperSet & (1 << i)) != 0) {
                        long j16 = this.lowerBound + i + 64;
                        if (ids.get(j16)) {
                            snapshotIdSet3 = snapshotIdSet3.set(j16);
                        }
                    }
                    i++;
                }
            }
            return snapshotIdSet3;
        }
        long[] jArr4 = ids.belowBound;
        if (jArr4 != null) {
            for (long j17 : jArr4) {
                if (get(j17)) {
                    snapshotIdSet2 = snapshotIdSet2.set(j17);
                }
            }
        }
        SnapshotIdSet snapshotIdSet4 = snapshotIdSet2;
        if (ids.lowerSet != 0) {
            for (int i9 = 0; i9 < 64; i9++) {
                if ((ids.lowerSet & (1 << i9)) != 0) {
                    long j18 = ids.lowerBound + i9;
                    if (get(j18)) {
                        snapshotIdSet4 = snapshotIdSet4.set(j18);
                    }
                }
            }
        }
        if (ids.upperSet != 0) {
            while (i < 64) {
                if ((ids.upperSet & (1 << i)) != 0) {
                    long j19 = ids.lowerBound + i + 64;
                    if (get(j19)) {
                        snapshotIdSet4 = snapshotIdSet4.set(j19);
                    }
                }
                i++;
            }
        }
        return snapshotIdSet4;
    }

    @NotNull
    public final SnapshotIdSet andNot(@NotNull SnapshotIdSet ids) {
        SnapshotIdSet snapshotIdSetClear;
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (ids == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return snapshotIdSet;
        }
        long j7 = ids.lowerBound;
        long j8 = this.lowerBound;
        if (j7 == j8) {
            long[] jArr = ids.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet((~ids.upperSet) & this.upperSet, (~ids.lowerSet) & this.lowerSet, j8, jArr2);
            }
        }
        long[] jArr3 = ids.belowBound;
        if (jArr3 != null) {
            snapshotIdSetClear = this;
            for (long j9 : jArr3) {
                snapshotIdSetClear = snapshotIdSetClear.clear(j9);
            }
        } else {
            snapshotIdSetClear = this;
        }
        if (ids.lowerSet != 0) {
            for (int i = 0; i < 64; i++) {
                if ((ids.lowerSet & (1 << i)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(ids.lowerBound + i);
                }
            }
        }
        if (ids.upperSet != 0) {
            for (int i8 = 0; i8 < 64; i8++) {
                if ((ids.upperSet & (1 << i8)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(ids.lowerBound + i8 + 64);
                }
            }
        }
        return snapshotIdSetClear;
    }

    @NotNull
    public final SnapshotIdSet clear(long id) {
        long[] jArr;
        int iBinarySearch;
        long j7 = this.lowerBound;
        long j8 = id - j7;
        if (j8 >= 0 && j8 < 64) {
            long j9 = 1 << ((int) j8);
            long j10 = this.lowerSet;
            if ((j10 & j9) != 0) {
                return new SnapshotIdSet(this.upperSet, j10 & (~j9), j7, this.belowBound);
            }
        } else if (j8 >= 64 && j8 < 128) {
            long j11 = 1 << (((int) j8) - 64);
            long j12 = this.upperSet;
            if ((j12 & j11) != 0) {
                return new SnapshotIdSet(j12 & (~j11), this.lowerSet, j7, this.belowBound);
            }
        } else if (j8 < 0 && (jArr = this.belowBound) != null && (iBinarySearch = SnapshotId_jvmKt.binarySearch(jArr, id)) >= 0) {
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdRemovedAt(jArr, iBinarySearch));
        }
        return this;
    }

    public final void fastForEach(@NotNull InterfaceC6471c block) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            for (long j7 : jArr) {
                block.invoke(Long.valueOf(j7));
            }
        }
        if (this.lowerSet != 0) {
            for (int i = 0; i < 64; i++) {
                if ((this.lowerSet & (1 << i)) != 0) {
                    block.invoke(Long.valueOf(this.lowerBound + i));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i8 = 0; i8 < 64; i8++) {
                if ((this.upperSet & (1 << i8)) != 0) {
                    block.invoke(Long.valueOf(this.lowerBound + i8 + 64));
                }
            }
        }
    }

    public final boolean get(long id) {
        long[] jArr;
        long j7 = id - this.lowerBound;
        return (j7 < 0 || j7 >= 64) ? (j7 < 64 || j7 >= 128) ? j7 <= 0 && (jArr = this.belowBound) != null && SnapshotId_jvmKt.binarySearch(jArr, id) >= 0 : ((1 << (((int) j7) + (-64))) & this.upperSet) != 0 : ((1 << ((int) j7)) & this.lowerSet) != 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Long> iterator() {
        return AbstractC6683l.m6376p(new C20611(null));
    }

    public final long lowest(long j7) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            return jArr[0];
        }
        if (this.lowerSet != 0) {
            return this.lowerBound + Long.numberOfTrailingZeros(r0);
        }
        return this.upperSet != 0 ? this.lowerBound + 64 + Long.numberOfTrailingZeros(r0) : j7;
    }

    @NotNull
    /* renamed from: or */
    public final SnapshotIdSet m1101or(@NotNull SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet;
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (bits == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return bits;
        }
        long j7 = bits.lowerBound;
        long j8 = this.lowerBound;
        if (j7 == j8) {
            long[] jArr = bits.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet(bits.upperSet | this.upperSet, bits.lowerSet | this.lowerSet, j8, jArr2);
            }
        }
        int i = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j9 : jArr3) {
                    bits = bits.set(j9);
                }
            }
            if (this.lowerSet != 0) {
                for (int i8 = 0; i8 < 64; i8++) {
                    if ((this.lowerSet & (1 << i8)) != 0) {
                        bits = bits.set(this.lowerBound + i8);
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i < 64) {
                    if ((this.upperSet & (1 << i)) != 0) {
                        bits = bits.set(this.lowerBound + i + 64);
                    }
                    i++;
                }
            }
            return bits;
        }
        long[] jArr4 = bits.belowBound;
        if (jArr4 != null) {
            snapshotIdSet = this;
            for (long j10 : jArr4) {
                snapshotIdSet = snapshotIdSet.set(j10);
            }
        } else {
            snapshotIdSet = this;
        }
        if (bits.lowerSet != 0) {
            for (int i9 = 0; i9 < 64; i9++) {
                if ((bits.lowerSet & (1 << i9)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.lowerBound + i9);
                }
            }
        }
        if (bits.upperSet != 0) {
            while (i < 64) {
                if ((bits.upperSet & (1 << i)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.lowerBound + i + 64);
                }
                i++;
            }
        }
        return snapshotIdSet;
    }

    @NotNull
    public final SnapshotIdSet set(long id) {
        long j7;
        long j8;
        long[] array;
        long j9 = this.lowerBound;
        long j10 = id - j9;
        long j11 = 0;
        if (j10 >= 0 && j10 < 64) {
            long j12 = 1 << ((int) j10);
            long j13 = this.lowerSet;
            if ((j13 & j12) == 0) {
                return new SnapshotIdSet(this.upperSet, j13 | j12, j9, this.belowBound);
            }
        } else if (j10 >= 64 && j10 < 128) {
            long j14 = 1 << (((int) j10) - 64);
            long j15 = this.upperSet;
            if ((j15 & j14) == 0) {
                return new SnapshotIdSet(j15 | j14, this.lowerSet, j9, this.belowBound);
            }
        } else if (j10 < 128) {
            long[] jArr = this.belowBound;
            if (jArr == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, j9, new long[]{id});
            }
            int iBinarySearch = SnapshotId_jvmKt.binarySearch(jArr, id);
            if (iBinarySearch < 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdInsertedAt(jArr, -(iBinarySearch + 1), id));
            }
        } else if (!get(id)) {
            long j16 = this.upperSet;
            long j17 = this.lowerSet;
            long j18 = this.lowerBound;
            long j19 = 64;
            long j20 = ((id + 1) / j19) * j19;
            if (j20 < 0) {
                j20 = 9223372036854775680L;
            }
            SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
            long j21 = j16;
            while (true) {
                if (j18 >= j20) {
                    j7 = j17;
                    j8 = j18;
                    break;
                }
                if (j17 != j11) {
                    if (snapshotIdArrayBuilder == null) {
                        snapshotIdArrayBuilder = new SnapshotIdArrayBuilder(this.belowBound);
                    }
                    int i = 0;
                    while (i < 64) {
                        long j22 = j11;
                        if ((j17 & (1 << i)) != j11) {
                            snapshotIdArrayBuilder.add(j18 + i);
                        }
                        i++;
                        j11 = j22;
                    }
                }
                j7 = j11;
                if (j21 == j7) {
                    j8 = j20;
                    break;
                }
                j18 += j19;
                j17 = j21;
                j11 = j7;
                j21 = j11;
            }
            if (snapshotIdArrayBuilder == null || (array = snapshotIdArrayBuilder.toArray()) == null) {
                array = this.belowBound;
            }
            return new SnapshotIdSet(j21, j7, j8, array).set(id);
        }
        return this;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        return AbstractC0584a.m911l(']', ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null), sb);
    }
}
