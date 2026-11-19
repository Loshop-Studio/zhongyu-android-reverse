package kotlinx.coroutines.flow.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.channels.InterfaceC5876e;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m5303f = "Combine.kt", m5304i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m5305l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG, 73, 76}, m5306m = "invokeSuspend", m5307n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, m5308s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* loaded from: classes4.dex */
final class CombineKt$combineInternal$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6469a $arrayFactory;
    final /* synthetic */ InterfaceC5910f[] $flows;
    final /* synthetic */ InterfaceC5912g $this_combineInternal;
    final /* synthetic */ InterfaceC6474f $transform;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 1, 0})
    @DebugMetadata(m5302c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m5303f = "Combine.kt", m5304i = {}, m5305l = {28}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 */
    public static final class C59181 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC5910f[] $flows;

        /* renamed from: $i */
        final /* synthetic */ int f9382$i;
        final /* synthetic */ AtomicInteger $nonClosed;
        final /* synthetic */ InterfaceC5876e $resultChannel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59181(InterfaceC5910f[] interfaceC5910fArr, int i, AtomicInteger atomicInteger, InterfaceC5876e interfaceC5876e, InterfaceC5631c<? super C59181> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$flows = interfaceC5910fArr;
            this.f9382$i = i;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = interfaceC5876e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C59181(this.$flows, this.f9382$i, this.$nonClosed, this.$resultChannel, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AtomicInteger atomicInteger;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    InterfaceC5910f[] interfaceC5910fArr = this.$flows;
                    int i8 = this.f9382$i;
                    InterfaceC5910f interfaceC5910f = interfaceC5910fArr[i8];
                    C5927i c5927i = new C5927i(this.$resultChannel, i8);
                    this.label = 1;
                    if (interfaceC5910f.collect(c5927i, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    this.$resultChannel.mo5489l(null);
                }
                return C5443s.f8405a;
            } finally {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    this.$resultChannel.mo5489l(null);
                }
            }
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C59181) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(InterfaceC5910f[] interfaceC5910fArr, InterfaceC6469a interfaceC6469a, InterfaceC6474f interfaceC6474f, InterfaceC5912g interfaceC5912g, InterfaceC5631c<? super CombineKt$combineInternal$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$flows = interfaceC5910fArr;
        this.$arrayFactory = interfaceC6469a;
        this.$transform = interfaceC6474f;
        this.$this_combineInternal = interfaceC5912g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, interfaceC5631c);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        if (r11.invoke(r12, r10, r19) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010e, code lost:
    
        if (r12.invoke(r13, r11, r19) == r2) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0 A[LOOP:0: B:28:0x00b0->B:47:?, LOOP_START, PHI: r7 r11
      0x00b0: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:25:0x00ab, B:47:?] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r11v4 kotlin.collections.a0) = (r11v3 kotlin.collections.a0), (r11v16 kotlin.collections.a0) binds: [B:25:0x00ab, B:47:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0111 -> B:20:0x008b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((CombineKt$combineInternal$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
