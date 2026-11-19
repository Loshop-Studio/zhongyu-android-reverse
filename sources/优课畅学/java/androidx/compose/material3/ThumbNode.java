package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.node.LayoutModifierNodeKt;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Constraints;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$IntRef;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
final class ThumbNode extends Modifier.Node implements LayoutModifierNode {
    private boolean checked;
    private float initialOffset = Float.NaN;
    private float initialSize = Float.NaN;
    private InteractionSource interactionSource;
    private boolean isPressed;
    private Animatable<Float, AnimationVector1D> offsetAnim;
    private Animatable<Float, AnimationVector1D> sizeAnim;

    @InterfaceC9539d(m17800c = "androidx.compose.material3.ThumbNode$onAttach$1", m17801f = "Switch.kt", m17802l = {TbsListener.ErrorCode.COPY_INSTALL_SUCCESS}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ThumbNode$onAttach$1 */
    public static final class C23761 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C23761(InterfaceC9324c<? super C23761> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return ThumbNode.this.new C23761(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C23761) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                InterfaceC9266c interactions = ThumbNode.this.getInteractionSource().getInteractions();
                final ThumbNode thumbNode = ThumbNode.this;
                InterfaceC9267d interfaceC9267d = new InterfaceC9267d() { // from class: androidx.compose.material3.ThumbNode.onAttach.1.1
                    @Override // p169l8.InterfaceC9267d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC9324c interfaceC9324c) {
                        return emit((Interaction) obj2, (InterfaceC9324c<? super C8736p>) interfaceC9324c);
                    }

                    public final Object emit(Interaction interaction, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                        if (interaction instanceof PressInteraction.Press) {
                            ref$IntRef.f17471a++;
                        } else if (interaction instanceof PressInteraction.Release) {
                            Ref$IntRef ref$IntRef2 = ref$IntRef;
                            ref$IntRef2.f17471a--;
                        } else if (interaction instanceof PressInteraction.Cancel) {
                            Ref$IntRef ref$IntRef3 = ref$IntRef;
                            ref$IntRef3.f17471a--;
                        }
                        boolean z10 = ref$IntRef.f17471a > 0;
                        if (thumbNode.isPressed != z10) {
                            thumbNode.isPressed = z10;
                            LayoutModifierNodeKt.invalidateMeasurement(thumbNode);
                        }
                        return C8736p.f16368a;
                    }
                };
                this.label = 1;
                if (interactions.collect(interfaceC9267d, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
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

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        float fMo20497toPx0680j_4 = measureScope.mo20497toPx0680j_4(this.isPressed ? SwitchTokens.INSTANCE.m23531getPressedHandleWidthD9Ej5fM() : ((measurable.maxIntrinsicHeight(Constraints.m26852getMaxWidthimpl(j10)) != 0 && measurable.maxIntrinsicWidth(Constraints.m26851getMaxHeightimpl(j10)) != 0) || this.checked) ? SwitchKt.getThumbDiameter() : SwitchKt.getUncheckedThumbDiameter());
        Animatable<Float, AnimationVector1D> animatable = this.sizeAnim;
        int iFloatValue = (int) (animatable != null ? animatable.getValue().floatValue() : fMo20497toPx0680j_4);
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(Constraints.Companion.m26862fixedJhjzzOo(iFloatValue, iFloatValue));
        final float fMo20497toPx0680j_42 = measureScope.mo20497toPx0680j_4(C3156Dp.m26899constructorimpl(C3156Dp.m26899constructorimpl(SwitchKt.SwitchHeight - measureScope.mo20493toDpu2uoSUM(fMo20497toPx0680j_4)) / 2.0f));
        float fMo20497toPx0680j_43 = measureScope.mo20497toPx0680j_4(C3156Dp.m26899constructorimpl(C3156Dp.m26899constructorimpl(SwitchKt.SwitchWidth - SwitchKt.getThumbDiameter()) - SwitchKt.ThumbPadding));
        boolean z10 = this.isPressed;
        if (z10 && this.checked) {
            fMo20497toPx0680j_42 = fMo20497toPx0680j_43 - measureScope.mo20497toPx0680j_4(SwitchTokens.INSTANCE.m23537getTrackOutlineWidthD9Ej5fM());
        } else if (z10 && !this.checked) {
            fMo20497toPx0680j_42 = measureScope.mo20497toPx0680j_4(SwitchTokens.INSTANCE.m23537getTrackOutlineWidthD9Ej5fM());
        } else if (this.checked) {
            fMo20497toPx0680j_42 = fMo20497toPx0680j_43;
        }
        Animatable<Float, AnimationVector1D> animatable2 = this.sizeAnim;
        if (!AbstractC9133u.m16127a(animatable2 != null ? animatable2.getTargetValue() : null, fMo20497toPx0680j_4)) {
            AbstractC8839h.m14861d(getCoroutineScope(), null, null, new ThumbNode$measure$1(this, fMo20497toPx0680j_4, null), 3, null);
        }
        Animatable<Float, AnimationVector1D> animatable3 = this.offsetAnim;
        if (!AbstractC9133u.m16127a(animatable3 != null ? animatable3.getTargetValue() : null, fMo20497toPx0680j_42)) {
            AbstractC8839h.m14861d(getCoroutineScope(), null, null, new ThumbNode$measure$2(this, fMo20497toPx0680j_42, null), 3, null);
        }
        if (Float.isNaN(this.initialSize) && Float.isNaN(this.initialOffset)) {
            this.initialSize = fMo20497toPx0680j_4;
            this.initialOffset = fMo20497toPx0680j_42;
        }
        return MeasureScope.layout$default(measureScope, iFloatValue, iFloatValue, null, new InterfaceC10570l() { // from class: androidx.compose.material3.ThumbNode$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable placeable = placeableMo25627measureBRTryo0;
                Animatable animatable4 = this.offsetAnim;
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (int) (animatable4 != null ? ((Number) animatable4.getValue()).floatValue() : fMo20497toPx0680j_42), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        AbstractC8839h.m14861d(getCoroutineScope(), null, null, new C23761(null), 3, null);
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
