package androidx.navigation.compose;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1", m13596f = "NavHost.kt", m13597i = {}, m13598l = {642, 646}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$29$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ SeekableTransitionState<NavBackStackEntry> $transitionState;
    final /* synthetic */ float $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$29$1$1$1(float f10, SeekableTransitionState<NavBackStackEntry> seekableTransitionState, NavBackStackEntry navBackStackEntry, Continuation<? super NavHostKt$NavHost$29$1$1$1> continuation) {
        super(2, continuation);
        this.$value = f10;
        this.$transitionState = seekableTransitionState;
        this.$backStackEntry = navBackStackEntry;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NavHostKt$NavHost$29$1$1$1(this.$value, this.$transitionState, this.$backStackEntry, continuation);
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
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.throwOnFailure(r11)
            r7 = r10
            goto L4d
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L39
        L20:
            kotlin.ResultKt.throwOnFailure(r11)
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
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NavHostKt$NavHost$29$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
