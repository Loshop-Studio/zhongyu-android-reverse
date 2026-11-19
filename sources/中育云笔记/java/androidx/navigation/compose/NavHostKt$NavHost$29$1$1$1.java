package androidx.navigation.compose;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.navigation.NavBackStackEntry;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1", m26211f = "NavHost.kt", m26212l = {642, 646}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NavHostKt$NavHost$29$1$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ SeekableTransitionState<NavBackStackEntry> $transitionState;
    final /* synthetic */ float $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$29$1$1$1(float f10, SeekableTransitionState<NavBackStackEntry> seekableTransitionState, NavBackStackEntry navBackStackEntry, InterfaceC11588c<? super NavHostKt$NavHost$29$1$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$value = f10;
        this.$transitionState = seekableTransitionState;
        this.$backStackEntry = navBackStackEntry;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new NavHostKt$NavHost$29$1$1$1(this.$value, this.$transitionState, this.$backStackEntry, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r11.snapTo(r1, r10) == r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
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
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.AbstractC9924b.m20071b(r11)
            r7 = r10
            goto L4d
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            kotlin.AbstractC9924b.m20071b(r11)
            goto L39
        L20:
            kotlin.AbstractC9924b.m20071b(r11)
            float r5 = r10.$value
            int r11 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r11 <= 0) goto L39
            r11 = r4
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r4 = r10.$transitionState
            r10.label = r11
            r6 = 0
            r8 = 2
            r9 = 0
            r7 = r10
            java.lang.Object r11 = androidx.compose.animation.core.SeekableTransitionState.seekTo$default(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L3a
            goto L4c
        L39:
            r7 = r10
        L3a:
            float r11 = r7.$value
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L4d
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r11 = r7.$transitionState
            androidx.navigation.NavBackStackEntry r1 = r7.$backStackEntry
            r7.label = r3
            java.lang.Object r11 = r11.snapTo(r1, r10)
            if (r11 != r0) goto L4d
        L4c:
            return r0
        L4d:
            qc.q r11 = p309qc.C10786q.f26013a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((NavHostKt$NavHost$29$1$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
