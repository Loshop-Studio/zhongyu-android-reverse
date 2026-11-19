package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2$1", m13596f = "Chip.kt", m13597i = {}, m13598l = {2380, 2382}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes2.dex */
public final class SelectableChipElevation$animateElevation$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<C3127Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ MutableState<Interaction> $lastInteraction$delegate;
    final /* synthetic */ float $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableChipElevation$animateElevation$2$1(Animatable<C3127Dp, AnimationVector1D> animatable, float f10, boolean z9, Interaction interaction, MutableState<Interaction> mutableState, Continuation<? super SelectableChipElevation$animateElevation$2$1> continuation) {
        super(2, continuation);
        this.$animatable = animatable;
        this.$target = f10;
        this.$enabled = z9;
        this.$interaction = interaction;
        this.$lastInteraction$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectableChipElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.$interaction, this.$lastInteraction$delegate, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r6.snapTo(r1, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.m19637animateElevationrAjV9yQ(r1, r3, r6, r4, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5c
        L1b:
            kotlin.ResultKt.throwOnFailure(r6)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r6 = r5.$animatable
            java.lang.Object r6 = r6.getTargetValue()
            androidx.compose.ui.unit.Dp r6 = (androidx.compose.p013ui.unit.C3127Dp) r6
            float r6 = r6.m23575unboximpl()
            float r1 = r5.$target
            boolean r6 = androidx.compose.p013ui.unit.C3127Dp.m23566equalsimpl0(r6, r1)
            if (r6 != 0) goto L63
            boolean r6 = r5.$enabled
            if (r6 != 0) goto L47
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r6 = r5.$animatable
            float r1 = r5.$target
            androidx.compose.ui.unit.Dp r1 = androidx.compose.p013ui.unit.C3127Dp.m23559boximpl(r1)
            r5.label = r3
            java.lang.Object r6 = r6.snapTo(r1, r5)
            if (r6 != r0) goto L5c
            goto L5b
        L47:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.Interaction> r6 = r5.$lastInteraction$delegate
            androidx.compose.foundation.interaction.Interaction r6 = androidx.compose.material3.SelectableChipElevation.access$animateElevation$lambda$2(r6)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r1 = r5.$animatable
            float r3 = r5.$target
            androidx.compose.foundation.interaction.Interaction r4 = r5.$interaction
            r5.label = r2
            java.lang.Object r6 = androidx.compose.material3.internal.ElevationKt.m19637animateElevationrAjV9yQ(r1, r3, r6, r4, r5)
            if (r6 != r0) goto L5c
        L5b:
            return r0
        L5c:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.Interaction> r6 = r5.$lastInteraction$delegate
            androidx.compose.foundation.interaction.Interaction r0 = r5.$interaction
            androidx.compose.material3.SelectableChipElevation.access$animateElevation$lambda$3(r6, r0)
        L63:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SelectableChipElevation$animateElevation$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectableChipElevation$animateElevation$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
