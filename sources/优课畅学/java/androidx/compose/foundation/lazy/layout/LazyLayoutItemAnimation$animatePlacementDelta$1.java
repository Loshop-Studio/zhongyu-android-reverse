package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p013ui.unit.IntOffset;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", m17801f = "LazyLayoutItemAnimation.kt", m17802l = {141, 148}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ FiniteAnimationSpec<IntOffset> $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animatePlacementDelta$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, long j10, InterfaceC9324c<? super LazyLayoutItemAnimation$animatePlacementDelta$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = finiteAnimationSpec;
        this.$totalDelta = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((LazyLayoutItemAnimation$animatePlacementDelta$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.AbstractC9079b.m15926b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
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
            kotlin.AbstractC9079b.m15926b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            goto L6c
        L27:
            kotlin.AbstractC9079b.m15926b(r12)
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
            androidx.compose.ui.unit.IntOffset r4 = androidx.compose.p013ui.unit.IntOffset.m27018boximpl(r4)     // Catch: java.util.concurrent.CancellationException -> L14
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L14
            r11.label = r3     // Catch: java.util.concurrent.CancellationException -> L14
            java.lang.Object r12 = r12.snapTo(r4, r11)     // Catch: java.util.concurrent.CancellationException -> L14
            if (r12 != r0) goto L6c
            r8 = r11
            goto Laf
        L6c:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            x7.a r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getOnLayerPropertyChanged$p(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L14
        L75:
            r5 = r1
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            java.lang.Object r12 = r12.getValue()     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.ui.unit.IntOffset r12 = (androidx.compose.p013ui.unit.IntOffset) r12     // Catch: java.util.concurrent.CancellationException -> L14
            long r3 = r12.m27036unboximpl()     // Catch: java.util.concurrent.CancellationException -> L14
            long r6 = r11.$totalDelta     // Catch: java.util.concurrent.CancellationException -> L14
            long r3 = androidx.compose.p013ui.unit.IntOffset.m27030minusqkQi6aY(r3, r6)     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            r6 = r3
            androidx.compose.ui.unit.IntOffset r4 = androidx.compose.p013ui.unit.IntOffset.m27018boximpl(r6)     // Catch: java.util.concurrent.CancellationException -> L14
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
            h7.p r12 = p123h7.C8736p.f16368a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
