package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.ParentDataModifier;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {
    public static final int $stable = 8;
    private State<IntSize> animatedSize;
    private Alignment contentAlignment;
    private LayoutDirection layoutDirection;
    private final MutableState measuredSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m27062boximpl(IntSize.Companion.m27075getZeroYbymL2g()), null, 2, null);
    private final MutableScatterMap<S, State<IntSize>> targetSizeMap = ScatterMapKt.mutableScatterMapOf();
    private final Transition<S> transition;

    @StabilityInferred(parameters = 1)
    public static final class ChildData implements ParentDataModifier {
        public static final int $stable = 0;
        private final MutableState isTarget$delegate;

        public ChildData(boolean z10) {
            this.isTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z10), null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean isTarget() {
            return ((Boolean) this.isTarget$delegate.getValue()).booleanValue();
        }

        @Override // androidx.compose.p013ui.layout.ParentDataModifier
        public Object modifyParentData(Density density, Object obj) {
            return this;
        }

        public final void setTarget(boolean z10) {
            this.isTarget$delegate.setValue(Boolean.valueOf(z10));
        }
    }

    public static final class SizeModifierElement<S> extends ModifierNodeElement<SizeModifierNode<S>> {
        private final AnimatedContentTransitionScopeImpl<S> scope;
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        private final State<SizeTransform> sizeTransform;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifierElement(Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, State<? extends SizeTransform> state, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
            this.scope = animatedContentTransitionScopeImpl;
        }

        @Override // androidx.compose.p013ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            if (!(obj instanceof SizeModifierElement)) {
                return false;
            }
            SizeModifierElement sizeModifierElement = (SizeModifierElement) obj;
            return AbstractC9133u.m16128b(sizeModifierElement.sizeAnimation, this.sizeAnimation) && AbstractC9133u.m16128b(sizeModifierElement.sizeTransform, this.sizeTransform);
        }

        public final AnimatedContentTransitionScopeImpl<S> getScope() {
            return this.scope;
        }

        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.p013ui.node.ModifierNodeElement
        public int hashCode() {
            int iHashCode = this.scope.hashCode() * 31;
            Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
            return ((iHashCode + (deferredAnimation != null ? deferredAnimation.hashCode() : 0)) * 31) + this.sizeTransform.hashCode();
        }

        @Override // androidx.compose.p013ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("sizeTransform");
            inspectorInfo.getProperties().set("sizeAnimation", this.sizeAnimation);
            inspectorInfo.getProperties().set("sizeTransform", this.sizeTransform);
            inspectorInfo.getProperties().set("scope", this.scope);
        }

        @Override // androidx.compose.p013ui.node.ModifierNodeElement
        public SizeModifierNode<S> create() {
            return new SizeModifierNode<>(this.sizeAnimation, this.sizeTransform, this.scope);
        }

        @Override // androidx.compose.p013ui.node.ModifierNodeElement
        public void update(SizeModifierNode<S> sizeModifierNode) {
            sizeModifierNode.setSizeAnimation(this.sizeAnimation);
            sizeModifierNode.setSizeTransform(this.sizeTransform);
            sizeModifierNode.setScope(this.scope);
        }
    }

    public static final class SizeModifierNode<S> extends LayoutModifierNodeWithPassThroughIntrinsics {
        private long lastSize = AnimatedContentKt.UnspecifiedSize;
        private AnimatedContentTransitionScopeImpl<S> scope;
        private Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        private State<? extends SizeTransform> sizeTransform;

        public SizeModifierNode(Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, State<? extends SizeTransform> state, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
            this.scope = animatedContentTransitionScopeImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lastContinuousSizeOrDefault-mzRDjE0, reason: not valid java name */
        public final long m20166lastContinuousSizeOrDefaultmzRDjE0(long j10) {
            return IntSize.m27068equalsimpl0(this.lastSize, AnimatedContentKt.UnspecifiedSize) ? j10 : this.lastSize;
        }

        public final AnimatedContentTransitionScopeImpl<S> getScope() {
            return this.scope;
        }

        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.p013ui.node.LayoutModifierNode
        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
            final long jM27074unboximpl;
            final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(j10);
            if (measureScope.isLookingAhead()) {
                jM27074unboximpl = IntSize.m27065constructorimpl((placeableMo25627measureBRTryo0.getWidth() << 32) | (placeableMo25627measureBRTryo0.getHeight() & 4294967295L));
            } else if (this.sizeAnimation == null) {
                jM27074unboximpl = IntSize.m27065constructorimpl((placeableMo25627measureBRTryo0.getWidth() << 32) | (placeableMo25627measureBRTryo0.getHeight() & 4294967295L));
                this.lastSize = IntSize.m27065constructorimpl((placeableMo25627measureBRTryo0.getWidth() << 32) | (placeableMo25627measureBRTryo0.getHeight() & 4294967295L));
            } else {
                final long jM27065constructorimpl = IntSize.m27065constructorimpl((placeableMo25627measureBRTryo0.getWidth() << 32) | (placeableMo25627measureBRTryo0.getHeight() & 4294967295L));
                Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
                AbstractC9133u.m16130d(deferredAnimation);
                State<IntSize> stateAnimate = deferredAnimation.animate(new InterfaceC10570l(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    @Override // p300x7.InterfaceC10570l
                    public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<S> segment) {
                        long jM27074unboximpl2;
                        FiniteAnimationSpec<IntSize> finiteAnimationSpecMo20230createAnimationSpecTemP2vQ;
                        if (AbstractC9133u.m16128b(segment.getInitialState(), this.this$0.getScope().getInitialState())) {
                            jM27074unboximpl2 = this.this$0.m20166lastContinuousSizeOrDefaultmzRDjE0(jM27065constructorimpl);
                        } else {
                            State state = (State) this.this$0.getScope().getTargetSizeMap$animation_release().get(segment.getInitialState());
                            jM27074unboximpl2 = state != null ? ((IntSize) state.getValue()).m27074unboximpl() : IntSize.Companion.m27075getZeroYbymL2g();
                        }
                        State state2 = (State) this.this$0.getScope().getTargetSizeMap$animation_release().get(segment.getTargetState());
                        long jM27074unboximpl3 = state2 != null ? ((IntSize) state2.getValue()).m27074unboximpl() : IntSize.Companion.m27075getZeroYbymL2g();
                        SizeTransform value = this.this$0.getSizeTransform().getValue();
                        return (value == null || (finiteAnimationSpecMo20230createAnimationSpecTemP2vQ = value.mo20230createAnimationSpecTemP2vQ(jM27074unboximpl2, jM27074unboximpl3)) == null) ? AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null) : finiteAnimationSpecMo20230createAnimationSpecTemP2vQ;
                    }
                }, new InterfaceC10570l(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2
                    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return IntSize.m27062boximpl(m20168invokeYEO4UFw(obj));
                    }

                    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
                    public final long m20168invokeYEO4UFw(S s10) {
                        if (AbstractC9133u.m16128b(s10, this.this$0.getScope().getInitialState())) {
                            return this.this$0.m20166lastContinuousSizeOrDefaultmzRDjE0(jM27065constructorimpl);
                        }
                        State state = (State) this.this$0.getScope().getTargetSizeMap$animation_release().get(s10);
                        return state != null ? ((IntSize) state.getValue()).m27074unboximpl() : IntSize.Companion.m27075getZeroYbymL2g();
                    }
                });
                this.scope.setAnimatedSize$animation_release(stateAnimate);
                jM27074unboximpl = stateAnimate.getValue().m27074unboximpl();
                this.lastSize = stateAnimate.getValue().m27074unboximpl();
            }
            return MeasureScope.layout$default(measureScope, (int) (jM27074unboximpl >> 32), (int) (jM27074unboximpl & 4294967295L), null, new InterfaceC10570l(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
                final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.m25691place70tqf50$default(placementScope, placeableMo25627measureBRTryo0, this.this$0.getScope().getContentAlignment().mo23844alignKFBX0sM(IntSize.m27065constructorimpl((placeableMo25627measureBRTryo0.getWidth() << 32) | (placeableMo25627measureBRTryo0.getHeight() & 4294967295L)), jM27074unboximpl, LayoutDirection.Ltr), 0.0f, 2, null);
                }
            }, 4, null);
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onReset() {
            super.onReset();
            this.lastSize = AnimatedContentKt.UnspecifiedSize;
        }

        public final void setScope(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.scope = animatedContentTransitionScopeImpl;
        }

        public final void setSizeAnimation(Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
            this.sizeAnimation = deferredAnimation;
        }

        public final void setSizeTransform(State<? extends SizeTransform> state) {
            this.sizeTransform = state;
        }
    }

    public AnimatedContentTransitionScopeImpl(Transition<S> transition, Alignment alignment, LayoutDirection layoutDirection) {
        this.transition = transition;
        this.contentAlignment = alignment;
        this.layoutDirection = layoutDirection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateOffset-emnUabE, reason: not valid java name */
    public final long m20159calculateOffsetemnUabE(long j10, long j11) {
        return getContentAlignment().mo23844alignKFBX0sM(j10, j11, LayoutDirection.Ltr);
    }

    private static final boolean createSizeAnimationModifier$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createSizeAnimationModifier$lambda$3(MutableState<Boolean> mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentSize-YbymL2g, reason: not valid java name */
    public final long m20160getCurrentSizeYbymL2g() {
        State<IntSize> state = this.animatedSize;
        return state != null ? state.getValue().m27074unboximpl() : m20163getMeasuredSizeYbymL2g$animation_release();
    }

    /* renamed from: isLeft-gWo6LJ4, reason: not valid java name */
    private final boolean m20161isLeftgWo6LJ4(int i10) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (AnimatedContentTransitionScope.SlideDirection.m20147equalsimpl0(i10, companion.m20153getLeftDKzdypw())) {
            return true;
        }
        if (AnimatedContentTransitionScope.SlideDirection.m20147equalsimpl0(i10, companion.m20155getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr) {
            return true;
        }
        return AnimatedContentTransitionScope.SlideDirection.m20147equalsimpl0(i10, companion.m20152getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl;
    }

    /* renamed from: isRight-gWo6LJ4, reason: not valid java name */
    private final boolean m20162isRightgWo6LJ4(int i10) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (AnimatedContentTransitionScope.SlideDirection.m20147equalsimpl0(i10, companion.m20154getRightDKzdypw())) {
            return true;
        }
        if (AnimatedContentTransitionScope.SlideDirection.m20147equalsimpl0(i10, companion.m20155getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl) {
            return true;
        }
        return AnimatedContentTransitionScope.SlideDirection.m20147equalsimpl0(i10, companion.m20152getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr;
    }

    @Composable
    public final Modifier createSizeAnimationModifier$animation_release(ContentTransform contentTransform, Composer composer, int i10) {
        Modifier modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93755870, i10, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:556)");
        }
        boolean zChanged = composer.changed(this);
        Object objRememberedValue = composer.rememberedValue();
        Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = null;
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (AbstractC9133u.m16128b(this.transition.getCurrentState(), this.transition.getTargetState())) {
            createSizeAnimationModifier$lambda$3(mutableState, false);
        } else if (stateRememberUpdatedState.getValue() != null) {
            createSizeAnimationModifier$lambda$3(mutableState, true);
        }
        if (createSizeAnimationModifier$lambda$2(mutableState)) {
            composer.startReplaceGroup(249676467);
            deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.Companion), null, composer, 0, 2);
            boolean zChanged2 = composer.changed(deferredAnimationCreateDeferredAnimation);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) stateRememberUpdatedState.getValue();
                objRememberedValue2 = (sizeTransform == null || sizeTransform.getClip()) ? ClipKt.clipToBounds(Modifier.Companion) : Modifier.Companion;
                composer.updateRememberedValue(objRememberedValue2);
            }
            modifier = (Modifier) objRememberedValue2;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(249942509);
            composer.endReplaceGroup();
            this.animatedSize = null;
            modifier = Modifier.Companion;
        }
        Modifier modifierThen = modifier.then(new SizeModifierElement(deferredAnimationCreateDeferredAnimation, stateRememberUpdatedState, this));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifierThen;
    }

    public final State<IntSize> getAnimatedSize$animation_release() {
        return this.animatedSize;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    public final LayoutDirection getLayoutDirection$animation_release() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMeasuredSize-YbymL2g$animation_release, reason: not valid java name */
    public final long m20163getMeasuredSizeYbymL2g$animation_release() {
        return ((IntSize) this.measuredSize$delegate.getValue()).m27074unboximpl();
    }

    public final MutableScatterMap<S, State<IntSize>> getTargetSizeMap$animation_release() {
        return this.targetSizeMap;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    public final Transition<S> getTransition$animation_release() {
        return this.transition;
    }

    public final void setAnimatedSize$animation_release(State<IntSize> state) {
        this.animatedSize = state;
    }

    public void setContentAlignment(Alignment alignment) {
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation_release(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation_release, reason: not valid java name */
    public final void m20164setMeasuredSizeozmzZPI$animation_release(long j10) {
        this.measuredSize$delegate.setValue(IntSize.m27062boximpl(j10));
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideIntoContainer-mOhB8PU */
    public EnterTransition mo20142slideIntoContainermOhB8PU(int i10, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final InterfaceC10570l interfaceC10570l) {
        if (m20161isLeftgWo6LJ4(i10)) {
            return EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec, new InterfaceC10570l() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Integer invoke(int i11) {
                    long j10 = i11;
                    return (Integer) interfaceC10570l.invoke(Integer.valueOf(((int) (this.m20160getCurrentSizeYbymL2g() >> 32)) - IntOffset.m27027getXimpl(this.m20159calculateOffsetemnUabE(IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32)), this.m20160getCurrentSizeYbymL2g()))));
                }
            });
        }
        if (m20162isRightgWo6LJ4(i10)) {
            return EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec, new InterfaceC10570l() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Integer invoke(int i11) {
                    long j10 = i11;
                    return (Integer) interfaceC10570l.invoke(Integer.valueOf((-IntOffset.m27027getXimpl(this.m20159calculateOffsetemnUabE(IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32)), this.m20160getCurrentSizeYbymL2g()))) - i11));
                }
            });
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        return AnimatedContentTransitionScope.SlideDirection.m20147equalsimpl0(i10, companion.m20156getUpDKzdypw()) ? EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new InterfaceC10570l() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i11) {
                long j10 = i11;
                return (Integer) interfaceC10570l.invoke(Integer.valueOf(((int) (this.m20160getCurrentSizeYbymL2g() & 4294967295L)) - IntOffset.m27028getYimpl(this.m20159calculateOffsetemnUabE(IntSize.m27065constructorimpl((4294967295L & j10) | (j10 << 32)), this.m20160getCurrentSizeYbymL2g()))));
            }
        }) : AnimatedContentTransitionScope.SlideDirection.m20147equalsimpl0(i10, companion.m20151getDownDKzdypw()) ? EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new InterfaceC10570l() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i11) {
                long j10 = i11;
                return (Integer) interfaceC10570l.invoke(Integer.valueOf((-IntOffset.m27028getYimpl(this.m20159calculateOffsetemnUabE(IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32)), this.m20160getCurrentSizeYbymL2g()))) - i11));
            }
        }) : EnterTransition.Companion.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideOutOfContainer-mOhB8PU */
    public ExitTransition mo20143slideOutOfContainermOhB8PU(int i10, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final InterfaceC10570l interfaceC10570l) {
        if (m20161isLeftgWo6LJ4(i10)) {
            return EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec, new InterfaceC10570l(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
                final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Integer invoke(int i11) {
                    State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    long j10 = i11;
                    return (Integer) interfaceC10570l.invoke(Integer.valueOf((-IntOffset.m27027getXimpl(this.this$0.m20159calculateOffsetemnUabE(IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32)), state != null ? ((IntSize) state.getValue()).m27074unboximpl() : IntSize.Companion.m27075getZeroYbymL2g()))) - i11));
                }
            });
        }
        if (m20162isRightgWo6LJ4(i10)) {
            return EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec, new InterfaceC10570l(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$2
                final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Integer invoke(int i11) {
                    State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    long jM27074unboximpl = state != null ? ((IntSize) state.getValue()).m27074unboximpl() : IntSize.Companion.m27075getZeroYbymL2g();
                    long j10 = i11;
                    return (Integer) interfaceC10570l.invoke(Integer.valueOf((-IntOffset.m27027getXimpl(this.this$0.m20159calculateOffsetemnUabE(IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32)), jM27074unboximpl))) + ((int) (jM27074unboximpl >> 32))));
                }
            });
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        return AnimatedContentTransitionScope.SlideDirection.m20147equalsimpl0(i10, companion.m20156getUpDKzdypw()) ? EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new InterfaceC10570l(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$3
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i11) {
                State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                long j10 = i11;
                return (Integer) interfaceC10570l.invoke(Integer.valueOf((-IntOffset.m27028getYimpl(this.this$0.m20159calculateOffsetemnUabE(IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32)), state != null ? ((IntSize) state.getValue()).m27074unboximpl() : IntSize.Companion.m27075getZeroYbymL2g()))) - i11));
            }
        }) : AnimatedContentTransitionScope.SlideDirection.m20147equalsimpl0(i10, companion.m20151getDownDKzdypw()) ? EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new InterfaceC10570l(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$4
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i11) {
                State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                long jM27074unboximpl = state != null ? ((IntSize) state.getValue()).m27074unboximpl() : IntSize.Companion.m27075getZeroYbymL2g();
                long j10 = i11;
                return (Integer) interfaceC10570l.invoke(Integer.valueOf((-IntOffset.m27028getYimpl(this.this$0.m20159calculateOffsetemnUabE(IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32)), jM27074unboximpl))) + ((int) (jM27074unboximpl & 4294967295L))));
            }
        }) : ExitTransition.Companion.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform) {
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }
}
