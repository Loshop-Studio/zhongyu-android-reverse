package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", m17801f = "Button.kt", m17802l = {989, 998}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ButtonElevation$animateElevation$2$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ Animatable<C3156Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ ButtonElevation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$2$1(Animatable<C3156Dp, AnimationVector1D> animatable, float f10, boolean z10, ButtonElevation buttonElevation, Interaction interaction, InterfaceC9324c<? super ButtonElevation$animateElevation$2$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$animatable = animatable;
        this.$target = f10;
        this.$enabled = z10;
        this.this$0 = buttonElevation;
        this.$interaction = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new ButtonElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((ButtonElevation$animateElevation$2$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r7.snapTo(r1, r6) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.m22913animateElevationrAjV9yQ(r7, r1, r3, r4, r6) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            kotlin.AbstractC9079b.m15926b(r7)
            goto La0
        L1c:
            kotlin.AbstractC9079b.m15926b(r7)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            java.lang.Object r7 = r7.getTargetValue()
            androidx.compose.ui.unit.Dp r7 = (androidx.compose.p013ui.unit.C3156Dp) r7
            float r7 = r7.m26913unboximpl()
            float r1 = r6.$target
            boolean r7 = androidx.compose.p013ui.unit.C3156Dp.m26904equalsimpl0(r7, r1)
            if (r7 != 0) goto La0
            boolean r7 = r6.$enabled
            if (r7 != 0) goto L48
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            float r1 = r6.$target
            androidx.compose.ui.unit.Dp r1 = androidx.compose.p013ui.unit.C3156Dp.m26897boximpl(r1)
            r6.label = r3
            java.lang.Object r7 = r7.snapTo(r1, r6)
            if (r7 != r0) goto La0
            goto L9f
        L48:
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            java.lang.Object r7 = r7.getTargetValue()
            androidx.compose.ui.unit.Dp r7 = (androidx.compose.p013ui.unit.C3156Dp) r7
            float r7 = r7.m26913unboximpl()
            androidx.compose.material3.ButtonElevation r1 = r6.this$0
            float r1 = androidx.compose.material3.ButtonElevation.access$getPressedElevation$p(r1)
            boolean r1 = androidx.compose.p013ui.unit.C3156Dp.m26904equalsimpl0(r7, r1)
            r3 = 0
            if (r1 == 0) goto L6e
            androidx.compose.foundation.interaction.PressInteraction$Press r7 = new androidx.compose.foundation.interaction.PressInteraction$Press
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.p013ui.geometry.Offset.Companion
            long r4 = r1.m24051getZeroF1C5BW0()
            r7.<init>(r4, r3)
            r3 = r7
            goto L91
        L6e:
            androidx.compose.material3.ButtonElevation r1 = r6.this$0
            float r1 = androidx.compose.material3.ButtonElevation.access$getHoveredElevation$p(r1)
            boolean r1 = androidx.compose.p013ui.unit.C3156Dp.m26904equalsimpl0(r7, r1)
            if (r1 == 0) goto L80
            androidx.compose.foundation.interaction.HoverInteraction$Enter r3 = new androidx.compose.foundation.interaction.HoverInteraction$Enter
            r3.<init>()
            goto L91
        L80:
            androidx.compose.material3.ButtonElevation r1 = r6.this$0
            float r1 = androidx.compose.material3.ButtonElevation.access$getFocusedElevation$p(r1)
            boolean r7 = androidx.compose.p013ui.unit.C3156Dp.m26904equalsimpl0(r7, r1)
            if (r7 == 0) goto L91
            androidx.compose.foundation.interaction.FocusInteraction$Focus r3 = new androidx.compose.foundation.interaction.FocusInteraction$Focus
            r3.<init>()
        L91:
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            float r1 = r6.$target
            androidx.compose.foundation.interaction.Interaction r4 = r6.$interaction
            r6.label = r2
            java.lang.Object r7 = androidx.compose.material3.internal.ElevationKt.m22913animateElevationrAjV9yQ(r7, r1, r3, r4, r6)
            if (r7 != r0) goto La0
        L9f:
            return r0
        La0:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonElevation$animateElevation$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
