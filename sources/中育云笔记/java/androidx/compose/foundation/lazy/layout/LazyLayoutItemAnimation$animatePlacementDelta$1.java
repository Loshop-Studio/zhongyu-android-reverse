package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p014ui.unit.IntOffset;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", m26211f = "LazyLayoutItemAnimation.kt", m26212l = {141, Opcodes.LCMP}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ FiniteAnimationSpec<IntOffset> $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animatePlacementDelta$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, long j10, InterfaceC11588c<? super LazyLayoutItemAnimation$animatePlacementDelta$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = finiteAnimationSpec;
        this.$totalDelta = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, interfaceC11588c);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:40)|(1:(1:(5:6|7|34|35|36)(2:9|10))(2:11|12))(7:14|15|(2:17|(1:19)(1:20))(1:22)|21|23|(2:25|(1:27))(4:29|30|38|31)|33)|28|29|30|38|31) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r12, r4, r5, null, r7, r8, 4, null) != r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.AbstractC9924b.m20071b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            r8 = r11
            goto Lb0
        L14:
            r8 = r11
            goto Lbb
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            java.lang.Object r1 = r11.L$0
            androidx.compose.animation.core.FiniteAnimationSpec r1 = (androidx.compose.animation.core.FiniteAnimationSpec) r1
            kotlin.AbstractC9924b.m20071b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            goto L6c
        L27:
            kotlin.AbstractC9924b.m20071b(r12)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            boolean r12 = r12.isRunning()     // Catch: java.util.concurrent.CancellationException -> L14
            if (r12 == 0) goto L45
            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> r12 = r11.$spec     // Catch: java.util.concurrent.CancellationException -> L14
            boolean r1 = r12 instanceof androidx.compose.animation.core.SpringSpec     // Catch: java.util.concurrent.CancellationException -> L14
            if (r1 == 0) goto L3f
            androidx.compose.animation.core.SpringSpec r12 = (androidx.compose.animation.core.SpringSpec) r12     // Catch: java.util.concurrent.CancellationException -> L14
            goto L43
        L3f:
            androidx.compose.animation.core.SpringSpec r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimationKt.access$getInterruptionSpec$p()     // Catch: java.util.concurrent.CancellationException -> L14
        L43:
            r1 = r12
            goto L48
        L45:
            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> r12 = r11.$spec     // Catch: java.util.concurrent.CancellationException -> L14
            goto L43
        L48:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            boolean r12 = r12.isRunning()     // Catch: java.util.concurrent.CancellationException -> L14
            if (r12 != 0) goto L75
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            long r4 = r11.$totalDelta     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.ui.unit.IntOffset r4 = androidx.compose.p014ui.unit.IntOffset.m33620boximpl(r4)     // Catch: java.util.concurrent.CancellationException -> L14
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L14
            r11.label = r3     // Catch: java.util.concurrent.CancellationException -> L14
            java.lang.Object r12 = r12.snapTo(r4, r11)     // Catch: java.util.concurrent.CancellationException -> L14
            if (r12 != r0) goto L6c
            r8 = r11
            goto Laf
        L6c:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            hd.a r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getOnLayerPropertyChanged$p(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L14
        L75:
            r5 = r1
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            java.lang.Object r12 = r12.getValue()     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.ui.unit.IntOffset r12 = (androidx.compose.p014ui.unit.IntOffset) r12     // Catch: java.util.concurrent.CancellationException -> L14
            long r3 = r12.m33638unboximpl()     // Catch: java.util.concurrent.CancellationException -> L14
            long r6 = r11.$totalDelta     // Catch: java.util.concurrent.CancellationException -> L14
            long r3 = androidx.compose.p014ui.unit.IntOffset.m33632minusqkQi6aY(r3, r6)     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            r6 = r3
            androidx.compose.ui.unit.IntOffset r4 = androidx.compose.p014ui.unit.IntOffset.m33620boximpl(r6)     // Catch: java.util.concurrent.CancellationException -> L14
            r8 = r6
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$1 r7 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$1     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r1 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            r7.<init>()     // Catch: java.util.concurrent.CancellationException -> L14
            r1 = 0
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L14
            r11.label = r2     // Catch: java.util.concurrent.CancellationException -> L14
            r6 = 0
            r9 = 4
            r10 = 0
            r8 = r11
            r3 = r12
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> Lbb
            if (r12 != r0) goto Lb0
        Laf:
            return r0
        Lb0:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r8.this$0     // Catch: java.util.concurrent.CancellationException -> Lbb
            r0 = 0
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setPlacementAnimationInProgress(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lbb
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r8.this$0     // Catch: java.util.concurrent.CancellationException -> Lbb
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setRunningMovingAwayAnimation$p(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lbb
        Lbb:
            qc.q r12 = p309qc.C10786q.f26013a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((LazyLayoutItemAnimation$animatePlacementDelta$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
