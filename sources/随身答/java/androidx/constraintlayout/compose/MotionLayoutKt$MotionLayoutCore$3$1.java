package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1", m13451f = "MotionLayout.kt", m13452i = {}, m13453l = {475, 485}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes2.dex */
public final class MotionLayoutKt$MotionLayoutCore$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $animateToEnd$delegate;
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Channel<ConstraintSet> $channel;
    final /* synthetic */ MutableState<ConstraintSet> $end$delegate;
    final /* synthetic */ Function0<Unit> $finishedAnimationListener;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;
    final /* synthetic */ MutableState<ConstraintSet> $start$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionLayoutKt$MotionLayoutCore$3$1(Channel<ConstraintSet> channel, Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, Function0<Unit> function0, MutableState<Boolean> mutableState, MutableState<ConstraintSet> mutableState2, MutableState<ConstraintSet> mutableState3, Continuation<? super MotionLayoutKt$MotionLayoutCore$3$1> continuation) {
        super(2, continuation);
        this.$channel = channel;
        this.$progress = animatable;
        this.$animationSpec = animationSpec;
        this.$finishedAnimationListener = function0;
        this.$animateToEnd$delegate = mutableState;
        this.$start$delegate = mutableState2;
        this.$end$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MotionLayoutKt$MotionLayoutCore$3$1(this.$channel, this.$progress, this.$animationSpec, this.$finishedAnimationListener, this.$animateToEnd$delegate, this.$start$delegate, this.$end$delegate, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[PHI: r0 r1
      0x0027: PHI (r0v3 kotlinx.coroutines.channels.ChannelIterator<androidx.constraintlayout.compose.ConstraintSet>) = 
      (r0v14 kotlinx.coroutines.channels.ChannelIterator<androidx.constraintlayout.compose.ConstraintSet>)
      (r0v17 kotlinx.coroutines.channels.ChannelIterator<androidx.constraintlayout.compose.ConstraintSet>)
     binds: [B:13:0x003a, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r1v0 java.lang.Object) = (r1v12 java.lang.Object), (r1v15 java.lang.Object) binds: [B:13:0x003a, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:39:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c3 -> B:12:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r12.label
            r9 = 2
            r10 = 1
            if (r0 == 0) goto L29
            if (r0 == r10) goto L1f
            if (r0 != r9) goto L17
            java.lang.Object r0 = r12.L$0
            kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto Lb0
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1f:
            java.lang.Object r0 = r12.L$0
            kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
            kotlin.ResultKt.throwOnFailure(r13)
            r1 = r13
        L27:
            r11 = r0
            goto L3e
        L29:
            kotlin.ResultKt.throwOnFailure(r13)
            kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> r0 = r12.$channel
            kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
        L32:
            r12.L$0 = r0
            r12.label = r10
            java.lang.Object r1 = r0.hasNext(r12)
            if (r1 != r8) goto L27
            goto Lae
        L3e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto Lc6
            java.lang.Object r0 = r11.next()
            androidx.constraintlayout.compose.ConstraintSet r0 = (androidx.constraintlayout.compose.ConstraintSet) r0
            kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> r1 = r12.$channel
            java.lang.Object r1 = r1.mo26239tryReceivePtdJZtk()
            java.lang.Object r1 = kotlinx.coroutines.channels.ChannelResult.m26251getOrNullimpl(r1)
            androidx.constraintlayout.compose.ConstraintSet r1 = (androidx.constraintlayout.compose.ConstraintSet) r1
            if (r1 != 0) goto L5b
            goto L5c
        L5b:
            r0 = r1
        L5c:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r12.$animateToEnd$delegate
            boolean r1 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$23(r1)
            if (r1 == 0) goto L67
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L68
        L67:
            r1 = 0
        L68:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r2 = r12.$animateToEnd$delegate
            boolean r2 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$23(r2)
            if (r2 == 0) goto L77
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r2 = r12.$start$delegate
            androidx.constraintlayout.compose.ConstraintSet r2 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$14(r2)
            goto L7d
        L77:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r2 = r12.$end$delegate
            androidx.constraintlayout.compose.ConstraintSet r2 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$17(r2)
        L7d:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 != 0) goto Lc3
            androidx.compose.runtime.MutableState<java.lang.Boolean> r2 = r12.$animateToEnd$delegate
            boolean r2 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$23(r2)
            if (r2 == 0) goto L91
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r2 = r12.$end$delegate
            androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$18(r2, r0)
            goto L96
        L91:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r2 = r12.$start$delegate
            androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$15(r2, r0)
        L96:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r0 = r12.$progress
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> r2 = r12.$animationSpec
            r12.L$0 = r11
            r12.label = r9
            r3 = 0
            r4 = 0
            r6 = 12
            r7 = 0
            r5 = r12
            java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r8) goto Laf
        Lae:
            return r8
        Laf:
            r0 = r11
        Lb0:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r12.$animateToEnd$delegate
            boolean r2 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$23(r1)
            r2 = r2 ^ r10
            androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$24(r1, r2)
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r12.$finishedAnimationListener
            if (r1 == 0) goto L32
            r1.invoke()
            goto L32
        Lc3:
            r0 = r11
            goto L32
        Lc6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MotionLayoutKt$MotionLayoutCore$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
