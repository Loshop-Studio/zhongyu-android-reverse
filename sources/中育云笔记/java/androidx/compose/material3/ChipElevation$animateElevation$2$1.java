package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.ChipElevation$animateElevation$2$1", m26211f = "Chip.kt", m26212l = {2241, 2243}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ChipElevation$animateElevation$2$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Animatable<C3186Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ MutableState<Interaction> $lastInteraction$delegate;
    final /* synthetic */ float $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipElevation$animateElevation$2$1(Animatable<C3186Dp, AnimationVector1D> animatable, float f10, boolean z10, Interaction interaction, MutableState<Interaction> mutableState, InterfaceC11588c<? super ChipElevation$animateElevation$2$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$animatable = animatable;
        this.$target = f10;
        this.$enabled = z10;
        this.$interaction = interaction;
        this.$lastInteraction$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new ChipElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.$interaction, this.$lastInteraction$delegate, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r6.snapTo(r1, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.m29515animateElevationrAjV9yQ(r1, r3, r6, r4, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
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
            kotlin.AbstractC9924b.m20071b(r6)
            goto L5c
        L1b:
            kotlin.AbstractC9924b.m20071b(r6)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r6 = r5.$animatable
            java.lang.Object r6 = r6.getTargetValue()
            androidx.compose.ui.unit.Dp r6 = (androidx.compose.p014ui.unit.C3186Dp) r6
            float r6 = r6.m33515unboximpl()
            float r1 = r5.$target
            boolean r6 = androidx.compose.p014ui.unit.C3186Dp.m33506equalsimpl0(r6, r1)
            if (r6 != 0) goto L63
            boolean r6 = r5.$enabled
            if (r6 != 0) goto L47
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r6 = r5.$animatable
            float r1 = r5.$target
            androidx.compose.ui.unit.Dp r1 = androidx.compose.p014ui.unit.C3186Dp.m33499boximpl(r1)
            r5.label = r3
            java.lang.Object r6 = r6.snapTo(r1, r5)
            if (r6 != r0) goto L5c
            goto L5b
        L47:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.Interaction> r6 = r5.$lastInteraction$delegate
            androidx.compose.foundation.interaction.Interaction r6 = androidx.compose.material3.ChipElevation.access$animateElevation$lambda$2(r6)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r1 = r5.$animatable
            float r3 = r5.$target
            androidx.compose.foundation.interaction.Interaction r4 = r5.$interaction
            r5.label = r2
            java.lang.Object r6 = androidx.compose.material3.internal.ElevationKt.m29515animateElevationrAjV9yQ(r1, r3, r6, r4, r5)
            if (r6 != r0) goto L5c
        L5b:
            return r0
        L5c:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.Interaction> r6 = r5.$lastInteraction$delegate
            androidx.compose.foundation.interaction.Interaction r0 = r5.$interaction
            androidx.compose.material3.ChipElevation.access$animateElevation$lambda$3(r6, r0)
        L63:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipElevation$animateElevation$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((ChipElevation$animateElevation$2$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
