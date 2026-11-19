package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.State;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    private Alignment currentAlignment;
    private EnterTransition enter;
    private ExitTransition exit;
    private GraphicsLayerBlockForEnterExit graphicsLayerBlock;
    private InterfaceC10559a isEnabled;
    private boolean lookaheadConstraintsAvailable;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;
    private Transition<EnterExitState> transition;
    private long lookaheadSize = AnimationModifierKt.getInvalidSize();
    private long lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private final InterfaceC10570l sizeTransitionSpec = new InterfaceC10570l() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
        {
            super(1);
        }

        @Override // p300x7.InterfaceC10570l
        public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<EnterExitState> segment) {
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            FiniteAnimationSpec<IntSize> animationSpec = null;
            if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                ChangeSize changeSize = this.this$0.getEnter().getData$animation_release().getChangeSize();
                if (changeSize != null) {
                    animationSpec = changeSize.getAnimationSpec();
                }
            } else if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                ChangeSize changeSize2 = this.this$0.getExit().getData$animation_release().getChangeSize();
                if (changeSize2 != null) {
                    animationSpec = changeSize2.getAnimationSpec();
                }
            } else {
                animationSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
            }
            return animationSpec == null ? EnterExitTransitionKt.DefaultSizeAnimationSpec : animationSpec;
        }
    };
    private final InterfaceC10570l slideSpec = new InterfaceC10570l() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
        {
            super(1);
        }

        @Override // p300x7.InterfaceC10570l
        public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
            FiniteAnimationSpec<IntOffset> animationSpec;
            FiniteAnimationSpec<IntOffset> animationSpec2;
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                Slide slide = this.this$0.getEnter().getData$animation_release().getSlide();
                return (slide == null || (animationSpec2 = slide.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultOffsetAnimationSpec : animationSpec2;
            }
            if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            }
            Slide slide2 = this.this$0.getExit().getData$animation_release().getSlide();
            return (slide2 == null || (animationSpec = slide2.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultOffsetAnimationSpec : animationSpec;
        }
    };

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EnterExitTransitionModifierNode(Transition<EnterExitState> transition, Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, InterfaceC10559a interfaceC10559a, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.isEnabled = interfaceC10559a;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    /* renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m20199setLookaheadConstraintsBRTryo0(long j10) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = j10;
    }

    public final Alignment getAlignment() {
        Alignment alignment;
        Alignment alignment2;
        if (this.transition.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            ChangeSize changeSize = this.enter.getData$animation_release().getChangeSize();
            if (changeSize != null && (alignment2 = changeSize.getAlignment()) != null) {
                return alignment2;
            }
            ChangeSize changeSize2 = this.exit.getData$animation_release().getChangeSize();
            if (changeSize2 != null) {
                return changeSize2.getAlignment();
            }
            return null;
        }
        ChangeSize changeSize3 = this.exit.getData$animation_release().getChangeSize();
        if (changeSize3 != null && (alignment = changeSize3.getAlignment()) != null) {
            return alignment;
        }
        ChangeSize changeSize4 = this.enter.getData$animation_release().getChangeSize();
        if (changeSize4 != null) {
            return changeSize4.getAlignment();
        }
        return null;
    }

    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    public final EnterTransition getEnter() {
        return this.enter;
    }

    public final ExitTransition getExit() {
        return this.exit;
    }

    public final GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    public final InterfaceC10570l getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getSlideAnimation() {
        return this.slideAnimation;
    }

    public final InterfaceC10570l getSlideSpec() {
        return this.slideSpec;
    }

    public final Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public final InterfaceC10559a isEnabled() {
        return this.isEnabled;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        State<IntOffset> stateAnimate;
        State<IntOffset> stateAnimate2;
        if (this.transition.getCurrentState() == this.transition.getTargetState()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            Alignment alignment = getAlignment();
            if (alignment == null) {
                alignment = Alignment.Companion.getTopStart();
            }
            this.currentAlignment = alignment;
        }
        if (measureScope.isLookingAhead()) {
            final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(j10);
            long jM27065constructorimpl = IntSize.m27065constructorimpl((placeableMo25627measureBRTryo0.getWidth() << 32) | (placeableMo25627measureBRTryo0.getHeight() & 4294967295L));
            this.lookaheadSize = jM27065constructorimpl;
            m20199setLookaheadConstraintsBRTryo0(j10);
            return MeasureScope.layout$default(measureScope, (int) (jM27065constructorimpl >> 32), (int) (jM27065constructorimpl & 4294967295L), null, new InterfaceC10570l() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$1
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo0, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        if (!((Boolean) this.isEnabled.invoke()).booleanValue()) {
            final Placeable placeableMo25627measureBRTryo02 = measurable.mo25627measureBRTryo0(j10);
            return MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo02.getWidth(), placeableMo25627measureBRTryo02.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$3$1
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo02, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        final InterfaceC10570l interfaceC10570lInit = this.graphicsLayerBlock.init();
        final Placeable placeableMo25627measureBRTryo03 = measurable.mo25627measureBRTryo0(j10);
        long jM27065constructorimpl2 = IntSize.m27065constructorimpl((placeableMo25627measureBRTryo03.getWidth() << 32) | (placeableMo25627measureBRTryo03.getHeight() & 4294967295L));
        final long j11 = AnimationModifierKt.m20171isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : jM27065constructorimpl2;
        Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
        State<IntSize> stateAnimate3 = deferredAnimation != null ? deferredAnimation.animate(this.sizeTransitionSpec, new InterfaceC10570l() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m27062boximpl(m20203invokeYEO4UFw((EnterExitState) obj));
            }

            /* renamed from: invoke-YEO4UFw, reason: not valid java name */
            public final long m20203invokeYEO4UFw(EnterExitState enterExitState) {
                return this.this$0.m20200sizeByStateUzc_VyU(enterExitState, j11);
            }
        }) : null;
        if (stateAnimate3 != null) {
            jM27065constructorimpl2 = stateAnimate3.getValue().m27074unboximpl();
        }
        long jM26866constrain4WqzIAM = ConstraintsKt.m26866constrain4WqzIAM(j10, jM27065constructorimpl2);
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
        long jM27038getZeronOccac = (deferredAnimation2 == null || (stateAnimate2 = deferredAnimation2.animate(new InterfaceC10570l() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$1
            @Override // p300x7.InterfaceC10570l
            public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
                return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            }
        }, new InterfaceC10570l() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntOffset.m27018boximpl(m20204invokeBjo55l4((EnterExitState) obj));
            }

            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
            public final long m20204invokeBjo55l4(EnterExitState enterExitState) {
                return this.this$0.m20202targetOffsetByStateoFUgxo0(enterExitState, j11);
            }
        })) == null) ? IntOffset.Companion.m27038getZeronOccac() : stateAnimate2.getValue().m27036unboximpl();
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3 = this.slideAnimation;
        long jM27038getZeronOccac2 = (deferredAnimation3 == null || (stateAnimate = deferredAnimation3.animate(this.slideSpec, new InterfaceC10570l() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$slideOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntOffset.m27018boximpl(m20205invokeBjo55l4((EnterExitState) obj));
            }

            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
            public final long m20205invokeBjo55l4(EnterExitState enterExitState) {
                return this.this$0.m20201slideTargetValueByStateoFUgxo0(enterExitState, j11);
            }
        })) == null) ? IntOffset.Companion.m27038getZeronOccac() : stateAnimate.getValue().m27036unboximpl();
        Alignment alignment2 = this.currentAlignment;
        final long jM27031plusqkQi6aY = IntOffset.m27031plusqkQi6aY(alignment2 != null ? alignment2.mo23844alignKFBX0sM(j11, jM26866constrain4WqzIAM, LayoutDirection.Ltr) : IntOffset.Companion.m27038getZeronOccac(), jM27038getZeronOccac2);
        final long j12 = jM27038getZeronOccac;
        return MeasureScope.layout$default(measureScope, (int) (jM26866constrain4WqzIAM >> 32), (int) (jM26866constrain4WqzIAM & 4294967295L), null, new InterfaceC10570l() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
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
                placementScope.placeWithLayer(placeableMo25627measureBRTryo03, IntOffset.m27027getXimpl(j12) + IntOffset.m27027getXimpl(jM27031plusqkQi6aY), IntOffset.m27028getYimpl(j12) + IntOffset.m27028getYimpl(jM27031plusqkQi6aY), 0.0f, interfaceC10570lInit);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
    }

    public final void setCurrentAlignment(Alignment alignment) {
        this.currentAlignment = alignment;
    }

    public final void setEnabled(InterfaceC10559a interfaceC10559a) {
        this.isEnabled = interfaceC10559a;
    }

    public final void setEnter(EnterTransition enterTransition) {
        this.enter = enterTransition;
    }

    public final void setExit(ExitTransition exitTransition) {
        this.exit = exitTransition;
    }

    public final void setGraphicsLayerBlock(GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public final void setOffsetAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.offsetAnimation = deferredAnimation;
    }

    public final void setSizeAnimation(Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
        this.sizeAnimation = deferredAnimation;
    }

    public final void setSlideAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.slideAnimation = deferredAnimation;
    }

    public final void setTransition(Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    /* renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m20200sizeByStateUzc_VyU(EnterExitState enterExitState, long j10) {
        InterfaceC10570l size;
        InterfaceC10570l size2;
        int i10 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                ChangeSize changeSize = this.enter.getData$animation_release().getChangeSize();
                if (changeSize != null && (size = changeSize.getSize()) != null) {
                    return ((IntSize) size.invoke(IntSize.m27062boximpl(j10))).m27074unboximpl();
                }
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ChangeSize changeSize2 = this.exit.getData$animation_release().getChangeSize();
                if (changeSize2 != null && (size2 = changeSize2.getSize()) != null) {
                    return ((IntSize) size2.invoke(IntSize.m27062boximpl(j10))).m27074unboximpl();
                }
            }
        }
        return j10;
    }

    /* renamed from: slideTargetValueByState-oFUgxo0, reason: not valid java name */
    public final long m20201slideTargetValueByStateoFUgxo0(EnterExitState enterExitState, long j10) {
        InterfaceC10570l slideOffset;
        InterfaceC10570l slideOffset2;
        Slide slide = this.enter.getData$animation_release().getSlide();
        long jM27038getZeronOccac = (slide == null || (slideOffset2 = slide.getSlideOffset()) == null) ? IntOffset.Companion.m27038getZeronOccac() : ((IntOffset) slideOffset2.invoke(IntSize.m27062boximpl(j10))).m27036unboximpl();
        Slide slide2 = this.exit.getData$animation_release().getSlide();
        long jM27038getZeronOccac2 = (slide2 == null || (slideOffset = slide2.getSlideOffset()) == null) ? IntOffset.Companion.m27038getZeronOccac() : ((IntOffset) slideOffset.invoke(IntSize.m27062boximpl(j10))).m27036unboximpl();
        int i10 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i10 == 1) {
            return IntOffset.Companion.m27038getZeronOccac();
        }
        if (i10 == 2) {
            return jM27038getZeronOccac;
        }
        if (i10 == 3) {
            return jM27038getZeronOccac2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m20202targetOffsetByStateoFUgxo0(EnterExitState enterExitState, long j10) {
        if (this.currentAlignment == null) {
            return IntOffset.Companion.m27038getZeronOccac();
        }
        if (getAlignment() == null) {
            return IntOffset.Companion.m27038getZeronOccac();
        }
        if (AbstractC9133u.m16128b(this.currentAlignment, getAlignment())) {
            return IntOffset.Companion.m27038getZeronOccac();
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i10 == 1) {
            return IntOffset.Companion.m27038getZeronOccac();
        }
        if (i10 == 2) {
            return IntOffset.Companion.m27038getZeronOccac();
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ChangeSize changeSize = this.exit.getData$animation_release().getChangeSize();
        if (changeSize == null) {
            return IntOffset.Companion.m27038getZeronOccac();
        }
        long jM27074unboximpl = ((IntSize) changeSize.getSize().invoke(IntSize.m27062boximpl(j10))).m27074unboximpl();
        Alignment alignment = getAlignment();
        AbstractC9133u.m16130d(alignment);
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        long jMo23844alignKFBX0sM = alignment.mo23844alignKFBX0sM(j10, jM27074unboximpl, layoutDirection);
        Alignment alignment2 = this.currentAlignment;
        AbstractC9133u.m16130d(alignment2);
        return IntOffset.m27030minusqkQi6aY(jMo23844alignKFBX0sM, alignment2.mo23844alignKFBX0sM(j10, jM27074unboximpl, layoutDirection));
    }
}
