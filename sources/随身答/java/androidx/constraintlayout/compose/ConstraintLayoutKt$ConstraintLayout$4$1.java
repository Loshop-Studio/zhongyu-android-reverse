package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = 176)
@DebugMetadata(m13450c = "androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4$1", m13451f = "ConstraintLayout.kt", m13452i = {}, m13453l = {779, 789}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt$ConstraintLayout$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animateChangesSpec;
    final /* synthetic */ Channel<ConstraintSet> $channel;
    final /* synthetic */ MutableIntState $direction;
    final /* synthetic */ MutableState<ConstraintSet> $endConstraint$delegate;
    final /* synthetic */ Function0<Unit> $finishedAnimationListener;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;
    final /* synthetic */ MutableState<ConstraintSet> $startConstraint$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$4$1(Channel<ConstraintSet> channel, MutableIntState mutableIntState, Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, Function0<Unit> function0, MutableState<ConstraintSet> mutableState, MutableState<ConstraintSet> mutableState2, Continuation<? super ConstraintLayoutKt$ConstraintLayout$4$1> continuation) {
        super(2, continuation);
        this.$channel = channel;
        this.$direction = mutableIntState;
        this.$progress = animatable;
        this.$animateChangesSpec = animationSpec;
        this.$finishedAnimationListener = function0;
        this.$startConstraint$delegate = mutableState;
        this.$endConstraint$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConstraintLayoutKt$ConstraintLayout$4$1(this.$channel, this.$direction, this.$progress, this.$animateChangesSpec, this.$finishedAnimationListener, this.$startConstraint$delegate, this.$endConstraint$delegate, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, null, null, r10, 12, null) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ab -> B:7:0x0016). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c5 -> B:12:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r14.L$0
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            kotlin.ResultKt.throwOnFailure(r15)
            r10 = r14
        L16:
            r15 = r1
            goto Lae
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            java.lang.Object r1 = r14.L$0
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            kotlin.ResultKt.throwOnFailure(r15)
            goto L42
        L29:
            kotlin.ResultKt.throwOnFailure(r15)
            kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> r15 = r14.$channel
            kotlinx.coroutines.channels.ChannelIterator r15 = r15.iterator()
        L32:
            r14.L$0 = r15
            r14.label = r3
            java.lang.Object r1 = r15.hasNext(r14)
            if (r1 != r0) goto L3f
            r10 = r14
            goto Lad
        L3f:
            r13 = r1
            r1 = r15
            r15 = r13
        L42:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto Lc9
            java.lang.Object r15 = r1.next()
            androidx.constraintlayout.compose.ConstraintSet r15 = (androidx.constraintlayout.compose.ConstraintSet) r15
            kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$channel
            java.lang.Object r4 = r4.mo26239tryReceivePtdJZtk()
            java.lang.Object r4 = kotlinx.coroutines.channels.ChannelResult.m26251getOrNullimpl(r4)
            androidx.constraintlayout.compose.ConstraintSet r4 = (androidx.constraintlayout.compose.ConstraintSet) r4
            if (r4 != 0) goto L5f
            goto L60
        L5f:
            r15 = r4
        L60:
            androidx.compose.runtime.MutableIntState r4 = r14.$direction
            int r4 = r4.getIntValue()
            if (r4 != r3) goto L6f
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$startConstraint$delegate
            androidx.constraintlayout.compose.ConstraintSet r4 = androidx.constraintlayout.compose.ConstraintLayoutKt.m24326access$ConstraintLayout$lambda17(r4)
            goto L75
        L6f:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$endConstraint$delegate
            androidx.constraintlayout.compose.ConstraintSet r4 = androidx.constraintlayout.compose.ConstraintLayoutKt.m24328access$ConstraintLayout$lambda20(r4)
        L75:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r4)
            if (r4 != 0) goto Lc5
            androidx.compose.runtime.MutableIntState r4 = r14.$direction
            int r4 = r4.getIntValue()
            if (r4 != r3) goto L89
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$endConstraint$delegate
            androidx.constraintlayout.compose.ConstraintLayoutKt.m24329access$ConstraintLayout$lambda21(r4, r15)
            goto L8e
        L89:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$startConstraint$delegate
            androidx.constraintlayout.compose.ConstraintLayoutKt.m24327access$ConstraintLayout$lambda18(r4, r15)
        L8e:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r5 = r14.$progress
            androidx.compose.runtime.MutableIntState r15 = r14.$direction
            int r15 = r15.getIntValue()
            float r15 = (float) r15
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r15)
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> r7 = r14.$animateChangesSpec
            r14.L$0 = r1
            r14.label = r2
            r8 = 0
            r9 = 0
            r11 = 12
            r12 = 0
            r10 = r14
            java.lang.Object r15 = androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r15 != r0) goto L16
        Lad:
            return r0
        Lae:
            androidx.compose.runtime.MutableIntState r1 = r10.$direction
            int r4 = r1.getIntValue()
            if (r4 != r3) goto Lb8
            r4 = 0
            goto Lb9
        Lb8:
            r4 = r3
        Lb9:
            r1.setIntValue(r4)
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r10.$finishedAnimationListener
            if (r1 == 0) goto L32
            r1.invoke()
            goto L32
        Lc5:
            r10 = r14
            r15 = r1
            goto L32
        Lc9:
            r10 = r14
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConstraintLayoutKt$ConstraintLayout$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
