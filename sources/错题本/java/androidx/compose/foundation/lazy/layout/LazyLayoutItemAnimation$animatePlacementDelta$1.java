package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p011ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", m5303f = "LazyLayoutItemAnimation.kt", m5304i = {0}, m5305l = {141, 148}, m5306m = "invokeSuspend", m5307n = {"finalSpec"}, m5308s = {"L$0"})
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ FiniteAnimationSpec<IntOffset> $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animatePlacementDelta$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, long j7, InterfaceC5631c<? super LazyLayoutItemAnimation$animatePlacementDelta$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = finiteAnimationSpec;
        this.$totalDelta = j7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, interfaceC5631c);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|38|(1:(1:(5:6|7|34|35|36)(2:9|10))(2:11|12))(7:14|15|(2:17|(1:19)(1:20))(1:22)|21|23|(2:25|(1:27))(4:29|30|39|31)|33)|28|29|30|39|31) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r12, r4, r5, null, r7, r8, 4, null) != r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.AbstractC5774b.m5119b(r12)     // Catch: java.util.concurrent.CancellationException -> L12
            r8 = r11
            goto Lae
        L12:
            r8 = r11
            goto Lb9
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            java.lang.Object r1 = r11.L$0
            androidx.compose.animation.core.FiniteAnimationSpec r1 = (androidx.compose.animation.core.FiniteAnimationSpec) r1
            kotlin.AbstractC5774b.m5119b(r12)     // Catch: java.util.concurrent.CancellationException -> L12
            goto L6a
        L25:
            kotlin.AbstractC5774b.m5119b(r12)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L12
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L12
            boolean r12 = r12.isRunning()     // Catch: java.util.concurrent.CancellationException -> L12
            if (r12 == 0) goto L43
            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> r12 = r11.$spec     // Catch: java.util.concurrent.CancellationException -> L12
            boolean r1 = r12 instanceof androidx.compose.animation.core.SpringSpec     // Catch: java.util.concurrent.CancellationException -> L12
            if (r1 == 0) goto L3d
            androidx.compose.animation.core.SpringSpec r12 = (androidx.compose.animation.core.SpringSpec) r12     // Catch: java.util.concurrent.CancellationException -> L12
            goto L41
        L3d:
            androidx.compose.animation.core.SpringSpec r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimationKt.access$getInterruptionSpec$p()     // Catch: java.util.concurrent.CancellationException -> L12
        L41:
            r1 = r12
            goto L46
        L43:
            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> r12 = r11.$spec     // Catch: java.util.concurrent.CancellationException -> L12
            goto L41
        L46:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L12
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L12
            boolean r12 = r12.isRunning()     // Catch: java.util.concurrent.CancellationException -> L12
            if (r12 != 0) goto L73
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L12
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L12
            long r4 = r11.$totalDelta     // Catch: java.util.concurrent.CancellationException -> L12
            androidx.compose.ui.unit.IntOffset r4 = androidx.compose.p011ui.unit.IntOffset.m13424boximpl(r4)     // Catch: java.util.concurrent.CancellationException -> L12
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L12
            r11.label = r3     // Catch: java.util.concurrent.CancellationException -> L12
            java.lang.Object r12 = r12.snapTo(r4, r11)     // Catch: java.util.concurrent.CancellationException -> L12
            if (r12 != r0) goto L6a
            r8 = r11
            goto Lad
        L6a:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L12
            r6.a r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getOnLayerPropertyChanged$p(r12)     // Catch: java.util.concurrent.CancellationException -> L12
            r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L12
        L73:
            r5 = r1
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L12
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L12
            java.lang.Object r12 = r12.getValue()     // Catch: java.util.concurrent.CancellationException -> L12
            androidx.compose.ui.unit.IntOffset r12 = (androidx.compose.p011ui.unit.IntOffset) r12     // Catch: java.util.concurrent.CancellationException -> L12
            long r3 = r12.m13442unboximpl()     // Catch: java.util.concurrent.CancellationException -> L12
            long r6 = r11.$totalDelta     // Catch: java.util.concurrent.CancellationException -> L12
            long r3 = androidx.compose.p011ui.unit.IntOffset.m13436minusqkQi6aY(r3, r6)     // Catch: java.util.concurrent.CancellationException -> L12
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L12
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L12
            r6 = r3
            androidx.compose.ui.unit.IntOffset r4 = androidx.compose.p011ui.unit.IntOffset.m13424boximpl(r6)     // Catch: java.util.concurrent.CancellationException -> L12
            r8 = r6
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$1 r7 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$1     // Catch: java.util.concurrent.CancellationException -> L12
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r1 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L12
            r7.<init>()     // Catch: java.util.concurrent.CancellationException -> L12
            r1 = 0
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L12
            r11.label = r2     // Catch: java.util.concurrent.CancellationException -> L12
            r6 = 0
            r9 = 4
            r10 = 0
            r8 = r11
            r3 = r12
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> Lb9
            if (r12 != r0) goto Lae
        Lad:
            return r0
        Lae:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r8.this$0     // Catch: java.util.concurrent.CancellationException -> Lb9
            r0 = 0
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setPlacementAnimationInProgress(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lb9
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r8.this$0     // Catch: java.util.concurrent.CancellationException -> Lb9
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setRunningMovingAwayAnimation$p(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lb9
        Lb9:
            d6.s r12 = p045d6.C5443s.f8405a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((LazyLayoutItemAnimation$animatePlacementDelta$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
