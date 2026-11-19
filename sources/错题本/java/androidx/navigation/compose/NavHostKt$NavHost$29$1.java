package androidx.navigation.compose;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
@DebugMetadata(m5302c = "androidx.navigation.compose.NavHostKt$NavHost$29$1", m5303f = "NavHost.kt", m5304i = {}, m5305l = {627, 634}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes2.dex */
public final class NavHostKt$NavHost$29$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ Transition<NavBackStackEntry> $transition;
    final /* synthetic */ SeekableTransitionState<NavBackStackEntry> $transitionState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$29$1(SeekableTransitionState<NavBackStackEntry> seekableTransitionState, NavBackStackEntry navBackStackEntry, Transition<NavBackStackEntry> transition, InterfaceC5631c<? super NavHostKt$NavHost$29$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$transitionState = seekableTransitionState;
        this.$backStackEntry = navBackStackEntry;
        this.$transition = transition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s invokeSuspend$lambda$0(InterfaceC6009v interfaceC6009v, SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry, float f, float f7) {
        AbstractC6014x.m5651v(interfaceC6009v, null, null, new NavHostKt$NavHost$29$1$1$1(f, seekableTransitionState, navBackStackEntry, null), 3);
        return C5443s.f8405a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        NavHostKt$NavHost$29$1 navHostKt$NavHost$29$1 = new NavHostKt$NavHost$29$1(this.$transitionState, this.$backStackEntry, this.$transition, interfaceC5631c);
        navHostKt$NavHost$29$1.L$0 = obj;
        return navHostKt$NavHost$29$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (androidx.compose.animation.core.SeekableTransitionState.animateTo$default(r4, r5, null, r10, 2, null) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animate$default(r1, 0.0f, 0.0f, r4, r5, r10, 4, null) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        return r0;
     */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.AbstractC5774b.m5119b(r11)
            goto L7e
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L19:
            kotlin.AbstractC5774b.m5119b(r11)
            r6 = r10
            goto L7e
        L1e:
            kotlin.AbstractC5774b.m5119b(r11)
            java.lang.Object r11 = r10.L$0
            kotlinx.coroutines.v r11 = (kotlinx.coroutines.InterfaceC6009v) r11
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r1 = r10.$transitionState
            java.lang.Object r1 = r1.getCurrentState()
            androidx.navigation.NavBackStackEntry r4 = r10.$backStackEntry
            boolean r1 = kotlin.jvm.internal.AbstractC5830k.m5325b(r1, r4)
            if (r1 != 0) goto L45
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r4 = r10.$transitionState
            androidx.navigation.NavBackStackEntry r5 = r10.$backStackEntry
            r10.label = r3
            r6 = 0
            r8 = 2
            r9 = 0
            r7 = r10
            java.lang.Object r11 = androidx.compose.animation.core.SeekableTransitionState.animateTo$default(r4, r5, r6, r7, r8, r9)
            r6 = r7
            if (r11 != r0) goto L7e
            goto L7d
        L45:
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
            androidx.navigation.compose.q r5 = new androidx.navigation.compose.q
            r5.<init>()
            r6.label = r2
            r2 = 0
            r3 = 0
            r7 = 4
            r8 = 0
            java.lang.Object r11 = androidx.compose.animation.core.SuspendAnimationKt.animate$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L7e
        L7d:
            return r0
        L7e:
            d6.s r11 = p045d6.C5443s.f8405a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$29$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((NavHostKt$NavHost$29$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
