package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p011ui.unit.C2331Dp;
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
@DebugMetadata(m5302c = "androidx.compose.material3.CardElevation$animateElevation$2$1", m5303f = "Card.kt", m5304i = {}, m5305l = {731, 741}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class CardElevation$animateElevation$2$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ Animatable<C2331Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ CardElevation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardElevation$animateElevation$2$1(Animatable<C2331Dp, AnimationVector1D> animatable, float f, boolean z8, CardElevation cardElevation, Interaction interaction, InterfaceC5631c<? super CardElevation$animateElevation$2$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$animatable = animatable;
        this.$target = f;
        this.$enabled = z8;
        this.this$0 = cardElevation;
        this.$interaction = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
        return new CardElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, interfaceC5631c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r7.snapTo(r1, r6) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.m9319animateElevationrAjV9yQ(r7, r1, r3, r4, r6) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            kotlin.AbstractC5774b.m5119b(r7)
            goto Lb0
        L1a:
            kotlin.AbstractC5774b.m5119b(r7)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            java.lang.Object r7 = r7.getTargetValue()
            androidx.compose.ui.unit.Dp r7 = (androidx.compose.p011ui.unit.C2331Dp) r7
            float r7 = r7.m13319unboximpl()
            float r1 = r6.$target
            boolean r7 = androidx.compose.p011ui.unit.C2331Dp.m13310equalsimpl0(r7, r1)
            if (r7 != 0) goto Lb0
            boolean r7 = r6.$enabled
            if (r7 != 0) goto L46
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            float r1 = r6.$target
            androidx.compose.ui.unit.Dp r1 = androidx.compose.p011ui.unit.C2331Dp.m13303boximpl(r1)
            r6.label = r3
            java.lang.Object r7 = r7.snapTo(r1, r6)
            if (r7 != r0) goto Lb0
            goto Laf
        L46:
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            java.lang.Object r7 = r7.getTargetValue()
            androidx.compose.ui.unit.Dp r7 = (androidx.compose.p011ui.unit.C2331Dp) r7
            float r7 = r7.m13319unboximpl()
            androidx.compose.material3.CardElevation r1 = r6.this$0
            float r1 = androidx.compose.material3.CardElevation.access$getPressedElevation$p(r1)
            boolean r1 = androidx.compose.p011ui.unit.C2331Dp.m13310equalsimpl0(r7, r1)
            r3 = 0
            if (r1 == 0) goto L6c
            androidx.compose.foundation.interaction.PressInteraction$Press r7 = new androidx.compose.foundation.interaction.PressInteraction$Press
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.p011ui.geometry.Offset.INSTANCE
            long r4 = r1.m10457getZeroF1C5BW0()
            r7.<init>(r4, r3)
            r3 = r7
            goto La1
        L6c:
            androidx.compose.material3.CardElevation r1 = r6.this$0
            float r1 = androidx.compose.material3.CardElevation.access$getHoveredElevation$p(r1)
            boolean r1 = androidx.compose.p011ui.unit.C2331Dp.m13310equalsimpl0(r7, r1)
            if (r1 == 0) goto L7e
            androidx.compose.foundation.interaction.HoverInteraction$Enter r3 = new androidx.compose.foundation.interaction.HoverInteraction$Enter
            r3.<init>()
            goto La1
        L7e:
            androidx.compose.material3.CardElevation r1 = r6.this$0
            float r1 = androidx.compose.material3.CardElevation.access$getFocusedElevation$p(r1)
            boolean r1 = androidx.compose.p011ui.unit.C2331Dp.m13310equalsimpl0(r7, r1)
            if (r1 == 0) goto L90
            androidx.compose.foundation.interaction.FocusInteraction$Focus r3 = new androidx.compose.foundation.interaction.FocusInteraction$Focus
            r3.<init>()
            goto La1
        L90:
            androidx.compose.material3.CardElevation r1 = r6.this$0
            float r1 = androidx.compose.material3.CardElevation.access$getDraggedElevation$p(r1)
            boolean r7 = androidx.compose.p011ui.unit.C2331Dp.m13310equalsimpl0(r7, r1)
            if (r7 == 0) goto La1
            androidx.compose.foundation.interaction.DragInteraction$Start r3 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r3.<init>()
        La1:
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            float r1 = r6.$target
            androidx.compose.foundation.interaction.Interaction r4 = r6.$interaction
            r6.label = r2
            java.lang.Object r7 = androidx.compose.material3.internal.ElevationKt.m9319animateElevationrAjV9yQ(r7, r1, r3, r4, r6)
            if (r7 != r0) goto Lb0
        Laf:
            return r0
        Lb0:
            d6.s r7 = p045d6.C5443s.f8405a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardElevation$animateElevation$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    @Nullable
    public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((CardElevation$animateElevation$2$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
