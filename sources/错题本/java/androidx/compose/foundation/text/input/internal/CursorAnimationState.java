package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5976k1;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR*\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f`\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R+\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnimationState;", "", "", "animate", "<init>", "(Z)V", "Ld6/s;", "snapToVisibleAndAnimate", "(Lh6/c;)Ljava/lang/Object;", "cancelAndHide", "()V", "Z", "getAnimate", "()Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/w0;", "Landroidx/compose/foundation/AtomicReference;", "animationJob", "Ljava/util/concurrent/atomic/AtomicReference;", "", "<set-?>", "cursorAlpha$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getCursorAlpha", "()F", "setCursorAlpha", "(F)V", "cursorAlpha", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCursorAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,99:1\n79#2:100\n112#2,2:101\n*S KotlinDebug\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n*L\n44#1:100\n44#1:101,2\n*E\n"})
/* loaded from: classes.dex */
public final class CursorAnimationState {
    public static final int $stable = 8;
    private final boolean animate;

    @NotNull
    private AtomicReference<InterfaceC6013w0> animationJob = new AtomicReference<>(null);

    /* renamed from: cursorAlpha$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState cursorAlpha = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "", "<anonymous>", "(Lkotlinx/coroutines/v;)Z"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", m5303f = "CursorAnimationState.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2 */
    public static final class C13282 extends SuspendLambda implements InterfaceC6473e {
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", m5303f = "CursorAnimationState.kt", m5304i = {}, m5305l = {72, 77, 79, 81}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ InterfaceC6013w0 $oldJob;
            int label;
            final /* synthetic */ CursorAnimationState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC6013w0 interfaceC6013w0, CursorAnimationState cursorAnimationState, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$oldJob = interfaceC6013w0;
                this.this$0 = cursorAnimationState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass1(this.$oldJob, this.this$0, interfaceC5631c);
            }

            /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
            
                if (kotlinx.coroutines.AbstractC6014x.m5638i(500, r10) != r0) goto L36;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0066 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0017, B:36:0x0074, B:30:0x005d, B:33:0x0066, B:14:0x0025, B:15:0x0029, B:28:0x0057, B:29:0x005c, B:23:0x0041, B:25:0x004e), top: B:40:0x000d }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0071 -> B:36:0x0074). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r10.label
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 1065353216(0x3f800000, float:1.0)
                    r6 = 4
                    r7 = 3
                    r8 = 2
                    r9 = 1
                    if (r1 == 0) goto L31
                    if (r1 == r9) goto L2d
                    if (r1 == r8) goto L29
                    if (r1 == r7) goto L25
                    if (r1 != r6) goto L1d
                    kotlin.AbstractC5774b.m5119b(r11)     // Catch: java.lang.Throwable -> L1b
                    goto L74
                L1b:
                    r11 = move-exception
                    goto L7a
                L1d:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L25:
                    kotlin.AbstractC5774b.m5119b(r11)     // Catch: java.lang.Throwable -> L1b
                    goto L66
                L29:
                    kotlin.AbstractC5774b.m5119b(r11)     // Catch: java.lang.Throwable -> L1b
                    goto L57
                L2d:
                    kotlin.AbstractC5774b.m5119b(r11)
                    goto L41
                L31:
                    kotlin.AbstractC5774b.m5119b(r11)
                    kotlinx.coroutines.w0 r11 = r10.$oldJob
                    if (r11 == 0) goto L41
                    r10.label = r9
                    java.lang.Object r11 = kotlinx.coroutines.AbstractC6014x.m5636g(r11, r10)
                    if (r11 != r0) goto L41
                    goto L73
                L41:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r5)     // Catch: java.lang.Throwable -> L1b
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                    boolean r11 = r11.getAnimate()     // Catch: java.lang.Throwable -> L1b
                    if (r11 != 0) goto L5d
                    r10.label = r8     // Catch: java.lang.Throwable -> L1b
                    kotlin.coroutines.intrinsics.CoroutineSingletons r11 = kotlinx.coroutines.AbstractC6014x.m5634e(r10)     // Catch: java.lang.Throwable -> L1b
                    if (r11 != r0) goto L57
                    goto L73
                L57:
                    kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1b
                    r11.<init>()     // Catch: java.lang.Throwable -> L1b
                    throw r11     // Catch: java.lang.Throwable -> L1b
                L5d:
                    r10.label = r7     // Catch: java.lang.Throwable -> L1b
                    java.lang.Object r11 = kotlinx.coroutines.AbstractC6014x.m5638i(r3, r10)     // Catch: java.lang.Throwable -> L1b
                    if (r11 != r0) goto L66
                    goto L73
                L66:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r2)     // Catch: java.lang.Throwable -> L1b
                    r10.label = r6     // Catch: java.lang.Throwable -> L1b
                    java.lang.Object r11 = kotlinx.coroutines.AbstractC6014x.m5638i(r3, r10)     // Catch: java.lang.Throwable -> L1b
                    if (r11 != r0) goto L74
                L73:
                    return r0
                L74:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r5)     // Catch: java.lang.Throwable -> L1b
                    goto L5d
                L7a:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r0 = r10.this$0
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r0, r2)
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnimationState.C13282.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        public C13282(InterfaceC5631c<? super C13282> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C13282 c13282 = CursorAnimationState.this.new C13282(interfaceC5631c);
            c13282.L$0 = obj;
            return c13282;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
            InterfaceC6013w0 interfaceC6013w0 = (InterfaceC6013w0) CursorAnimationState.this.animationJob.getAndSet(null);
            AtomicReference atomicReference = CursorAnimationState.this.animationJob;
            C5976k1 c5976k1M5651v = AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass1(interfaceC6013w0, CursorAnimationState.this, null), 3);
            while (true) {
                if (atomicReference.compareAndSet(null, c5976k1M5651v)) {
                    z8 = true;
                    break;
                }
                if (atomicReference.get() != null) {
                    z8 = false;
                    break;
                }
            }
            return Boolean.valueOf(z8);
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super Boolean> interfaceC5631c) {
            return ((C13282) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public CursorAnimationState(boolean z8) {
        this.animate = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCursorAlpha(float f) {
        this.cursorAlpha.setFloatValue(f);
    }

    public final void cancelAndHide() {
        InterfaceC6013w0 andSet = this.animationJob.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(null);
        }
    }

    public final boolean getAnimate() {
        return this.animate;
    }

    public final float getCursorAlpha() {
        return this.cursorAlpha.getFloatValue();
    }

    @Nullable
    public final Object snapToVisibleAndAnimate(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objM5637h = AbstractC6014x.m5637h(new C13282(null), interfaceC5631c);
        return objM5637h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5637h : C5443s.f8405a;
    }
}
