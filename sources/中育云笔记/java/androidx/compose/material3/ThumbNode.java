package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.node.LayoutModifierNodeKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$IntRef;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
final class ThumbNode extends Modifier.Node implements LayoutModifierNode {
    private boolean checked;
    private float initialOffset = Float.NaN;
    private float initialSize = Float.NaN;
    private InteractionSource interactionSource;
    private boolean isPressed;
    private Animatable<Float, AnimationVector1D> offsetAnim;
    private Animatable<Float, AnimationVector1D> sizeAnim;

    @InterfaceC11829d(m26210c = "androidx.compose.material3.ThumbNode$onAttach$1", m26211f = "Switch.kt", m26212l = {220}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ThumbNode$onAttach$1 */
    public static final class C24061 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C24061(InterfaceC11588c<? super C24061> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return ThumbNode.this.new C24061(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                InterfaceC11594c interactions = ThumbNode.this.getInteractionSource().getInteractions();
                final ThumbNode thumbNode = ThumbNode.this;
                InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.material3.ThumbNode.onAttach.1.1
                    @Override // p379vd.InterfaceC11595d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                        return emit((Interaction) obj2, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                    }

                    public final Object emit(Interaction interaction, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        if (interaction instanceof PressInteraction.Press) {
                            ref$IntRef.f23400c++;
                        } else if (interaction instanceof PressInteraction.Release) {
                            Ref$IntRef ref$IntRef2 = ref$IntRef;
                            ref$IntRef2.f23400c--;
                        } else if (interaction instanceof PressInteraction.Cancel) {
                            Ref$IntRef ref$IntRef3 = ref$IntRef;
                            ref$IntRef3.f23400c--;
                        }
                        boolean z10 = ref$IntRef.f23400c > 0;
                        if (thumbNode.isPressed != z10) {
                            thumbNode.isPressed = z10;
                            LayoutModifierNodeKt.invalidateMeasurement(thumbNode);
                        }
                        return C10786q.f26013a;
                    }
                };
                this.label = 1;
                if (interactions.collect(interfaceC11595d, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C24061) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public ThumbNode(InteractionSource interactionSource, boolean z10) {
        this.interactionSource = interactionSource;
        this.checked = z10;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        float fMo27099toPx0680j_4 = measureScope.mo27099toPx0680j_4(this.isPressed ? SwitchTokens.INSTANCE.m30133getPressedHandleWidthD9Ej5fM() : ((measurable.maxIntrinsicHeight(Constraints.m33454getMaxWidthimpl(j10)) != 0 && measurable.maxIntrinsicWidth(Constraints.m33453getMaxHeightimpl(j10)) != 0) || this.checked) ? SwitchKt.getThumbDiameter() : SwitchKt.getUncheckedThumbDiameter());
        Animatable<Float, AnimationVector1D> animatable = this.sizeAnim;
        int iFloatValue = (int) (animatable != null ? animatable.getValue().floatValue() : fMo27099toPx0680j_4);
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.Companion.m33464fixedJhjzzOo(iFloatValue, iFloatValue));
        final float fMo27099toPx0680j_42 = measureScope.mo27099toPx0680j_4(C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(SwitchKt.SwitchHeight - measureScope.mo27095toDpu2uoSUM(fMo27099toPx0680j_4)) / 2.0f));
        float fMo27099toPx0680j_43 = measureScope.mo27099toPx0680j_4(C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(SwitchKt.SwitchWidth - SwitchKt.getThumbDiameter()) - SwitchKt.ThumbPadding));
        boolean z10 = this.isPressed;
        if (z10 && this.checked) {
            fMo27099toPx0680j_42 = fMo27099toPx0680j_43 - measureScope.mo27099toPx0680j_4(SwitchTokens.INSTANCE.m30139getTrackOutlineWidthD9Ej5fM());
        } else if (z10 && !this.checked) {
            fMo27099toPx0680j_42 = measureScope.mo27099toPx0680j_4(SwitchTokens.INSTANCE.m30139getTrackOutlineWidthD9Ej5fM());
        } else if (this.checked) {
            fMo27099toPx0680j_42 = fMo27099toPx0680j_43;
        }
        Animatable<Float, AnimationVector1D> animatable2 = this.sizeAnim;
        if (!AbstractC9979u.m20288a(animatable2 != null ? animatable2.getTargetValue() : null, fMo27099toPx0680j_4)) {
            AbstractC11117h.m24726d(getCoroutineScope(), null, null, new ThumbNode$measure$1(this, fMo27099toPx0680j_4, null), 3, null);
        }
        Animatable<Float, AnimationVector1D> animatable3 = this.offsetAnim;
        if (!AbstractC9979u.m20288a(animatable3 != null ? animatable3.getTargetValue() : null, fMo27099toPx0680j_42)) {
            AbstractC11117h.m24726d(getCoroutineScope(), null, null, new ThumbNode$measure$2(this, fMo27099toPx0680j_42, null), 3, null);
        }
        if (Float.isNaN(this.initialSize) && Float.isNaN(this.initialOffset)) {
            this.initialSize = fMo27099toPx0680j_4;
            this.initialOffset = fMo27099toPx0680j_42;
        }
        return MeasureScope.layout$default(measureScope, iFloatValue, iFloatValue, null, new InterfaceC9540l() { // from class: androidx.compose.material3.ThumbNode$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable placeable = placeableMo32229measureBRTryo0;
                Animatable animatable4 = this.offsetAnim;
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (int) (animatable4 != null ? ((Number) animatable4.getValue()).floatValue() : fMo27099toPx0680j_42), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        AbstractC11117h.m24726d(getCoroutineScope(), null, null, new C24061(null), 3, null);
    }

    public final void setChecked(boolean z10) {
        this.checked = z10;
    }

    public final void setInteractionSource(InteractionSource interactionSource) {
        this.interactionSource = interactionSource;
    }

    public final void update() {
        if (this.sizeAnim == null && !Float.isNaN(this.initialSize)) {
            this.sizeAnim = AnimatableKt.Animatable$default(this.initialSize, 0.0f, 2, null);
        }
        if (this.offsetAnim != null || Float.isNaN(this.initialOffset)) {
            return;
        }
        this.offsetAnim = AnimatableKt.Animatable$default(this.initialOffset, 0.0f, 2, null);
    }
}
