package androidx.navigation.compose;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.navigation.NavBackStackEntry;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.navigation.compose.NavHostKt$NavHost$29$1", m26211f = "NavHost.kt", m26212l = {627, 634}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NavHostKt$NavHost$29$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ Transition<NavBackStackEntry> $transition;
    final /* synthetic */ SeekableTransitionState<NavBackStackEntry> $transitionState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$29$1(SeekableTransitionState<NavBackStackEntry> seekableTransitionState, NavBackStackEntry navBackStackEntry, Transition<NavBackStackEntry> transition, InterfaceC11588c<? super NavHostKt$NavHost$29$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$transitionState = seekableTransitionState;
        this.$backStackEntry = navBackStackEntry;
        this.$transition = transition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q invokeSuspend$lambda$0(InterfaceC11122i0 interfaceC11122i0, SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry, float f10, float f11) {
        AbstractC11117h.m24726d(interfaceC11122i0, null, null, new NavHostKt$NavHost$29$1$1$1(f10, seekableTransitionState, navBackStackEntry, null), 3, null);
        return C10786q.f26013a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        NavHostKt$NavHost$29$1 navHostKt$NavHost$29$1 = new NavHostKt$NavHost$29$1(this.$transitionState, this.$backStackEntry, this.$transition, interfaceC11588c);
        navHostKt$NavHost$29$1.L$0 = obj;
        return navHostKt$NavHost$29$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (androidx.compose.animation.core.SeekableTransitionState.animateTo$default(r4, r5, null, r10, 2, null) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animate$default(r1, 0.0f, 0.0f, r4, r5, r10, 4, null) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.AbstractC9924b.m20071b(r11)
            goto L80
        L13:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1b:
            kotlin.AbstractC9924b.m20071b(r11)
            r6 = r10
            goto L80
        L20:
            kotlin.AbstractC9924b.m20071b(r11)
            java.lang.Object r11 = r10.L$0
            sd.i0 r11 = (sd.InterfaceC11122i0) r11
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r1 = r10.$transitionState
            java.lang.Object r1 = r1.getCurrentState()
            androidx.navigation.NavBackStackEntry r4 = r10.$backStackEntry
            boolean r1 = kotlin.jvm.internal.AbstractC9979u.m20289b(r1, r4)
            if (r1 != 0) goto L47
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r4 = r10.$transitionState
            androidx.navigation.NavBackStackEntry r5 = r10.$backStackEntry
            r10.label = r3
            r6 = 0
            r8 = 2
            r9 = 0
            r7 = r10
            java.lang.Object r11 = androidx.compose.animation.core.SeekableTransitionState.animateTo$default(r4, r5, r6, r7, r8, r9)
            r6 = r7
            if (r11 != r0) goto L80
            goto L7f
        L47:
            r6 = r10
            androidx.compose.animation.core.Transition<androidx.navigation.NavBackStackEntry> r1 = r6.$transition
            long r3 = r1.getTotalDurationNanos()
            r1 = 1000000(0xf4240, float:1.401298E-39)
            long r7 = (long) r1
            long r3 = r3 / r7
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r1 = r6.$transitionState
            float r1 = r1.getFraction()
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r5 = r6.$transitionState
            float r5 = r5.getFraction()
            float r3 = (float) r3
            float r5 = r5 * r3
            int r3 = (int) r5
            r4 = 0
            r5 = 6
            r7 = 0
            androidx.compose.animation.core.TweenSpec r4 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r3, r4, r7, r5, r7)
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r3 = r6.$transitionState
            androidx.navigation.NavBackStackEntry r5 = r6.$backStackEntry
            r7 = r5
            androidx.navigation.compose.r0 r5 = new androidx.navigation.compose.r0
            r5.<init>()
            r6.label = r2
            r2 = 0
            r3 = 0
            r7 = 4
            r8 = 0
            java.lang.Object r11 = androidx.compose.animation.core.SuspendAnimationKt.animate$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L80
        L7f:
            return r0
        L80:
            qc.q r11 = p309qc.C10786q.f26013a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$29$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((NavHostKt$NavHost$29$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
