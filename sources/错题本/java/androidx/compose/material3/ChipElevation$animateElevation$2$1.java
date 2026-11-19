package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.compose.material3.ChipElevation$animateElevation$2$1", m5303f = "Chip.kt", m5304i = {}, m5305l = {2241, 2243}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class ChipElevation$animateElevation$2$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ Animatable<C2331Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ MutableState<Interaction> $lastInteraction$delegate;
    final /* synthetic */ float $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipElevation$animateElevation$2$1(Animatable<C2331Dp, AnimationVector1D> animatable, float f, boolean z8, Interaction interaction, MutableState<Interaction> mutableState, InterfaceC5631c<? super ChipElevation$animateElevation$2$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$animatable = animatable;
        this.$target = f;
        this.$enabled = z8;
        this.$interaction = interaction;
        this.$lastInteraction$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
        return new ChipElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.$interaction, this.$lastInteraction$delegate, interfaceC5631c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r6.snapTo(r1, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.m9319animateElevationrAjV9yQ(r1, r3, r6, r4, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            kotlin.AbstractC5774b.m5119b(r6)
            goto L5a
        L19:
            kotlin.AbstractC5774b.m5119b(r6)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r6 = r5.$animatable
            java.lang.Object r6 = r6.getTargetValue()
            androidx.compose.ui.unit.Dp r6 = (androidx.compose.p011ui.unit.C2331Dp) r6
            float r6 = r6.m13319unboximpl()
            float r1 = r5.$target
            boolean r6 = androidx.compose.p011ui.unit.C2331Dp.m13310equalsimpl0(r6, r1)
            if (r6 != 0) goto L61
            boolean r6 = r5.$enabled
            if (r6 != 0) goto L45
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r6 = r5.$animatable
            float r1 = r5.$target
            androidx.compose.ui.unit.Dp r1 = androidx.compose.p011ui.unit.C2331Dp.m13303boximpl(r1)
            r5.label = r3
            java.lang.Object r6 = r6.snapTo(r1, r5)
            if (r6 != r0) goto L5a
            goto L59
        L45:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.Interaction> r6 = r5.$lastInteraction$delegate
            androidx.compose.foundation.interaction.Interaction r6 = androidx.compose.material3.ChipElevation.access$animateElevation$lambda$2(r6)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r1 = r5.$animatable
            float r3 = r5.$target
            androidx.compose.foundation.interaction.Interaction r4 = r5.$interaction
            r5.label = r2
            java.lang.Object r6 = androidx.compose.material3.internal.ElevationKt.m9319animateElevationrAjV9yQ(r1, r3, r6, r4, r5)
            if (r6 != r0) goto L5a
        L59:
            return r0
        L5a:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.Interaction> r6 = r5.$lastInteraction$delegate
            androidx.compose.foundation.interaction.Interaction r0 = r5.$interaction
            androidx.compose.material3.ChipElevation.access$animateElevation$lambda$3(r6, r0)
        L61:
            d6.s r6 = p045d6.C5443s.f8405a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipElevation$animateElevation$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    @Nullable
    public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((ChipElevation$animateElevation$2$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
