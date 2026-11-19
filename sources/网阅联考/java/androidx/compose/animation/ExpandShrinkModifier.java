package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.p006ui.unit.IntOffsetKt;
import androidx.compose.p006ui.unit.IntSize;
import androidx.compose.p006ui.unit.IntSizeKt;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001Bt\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bø\u0001\u0000¢\u0006\u0002\u0010\u0010J#\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010(J)\u0010+\u001a\u00020,*\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R*\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R*\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR1\u0010\u001d\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0\u001e¢\u0006\u0002\b!ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00064"}, m5175d2 = {"Landroidx/compose/animation/ExpandShrinkModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "offsetAnimation", "Landroidx/compose/ui/unit/IntOffset;", "expand", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/ChangeSize;", "shrink", "alignment", "Landroidx/compose/ui/Alignment;", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "getAlignment", "()Landroidx/compose/runtime/State;", "currentAlignment", "getCurrentAlignment", "()Landroidx/compose/ui/Alignment;", "setCurrentAlignment", "(Landroidx/compose/ui/Alignment;)V", "getExpand", "getOffsetAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getShrink", "getSizeAnimation", "sizeTransitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "getSizeTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "sizeByState", "targetState", "fullSize", "sizeByState-Uzc_VyU", "(Landroidx/compose/animation/EnterExitState;J)J", "targetOffsetByState", "targetOffsetByState-oFUgxo0", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/ExpandShrinkModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1180:1\n1#2:1181\n79#3:1182\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/ExpandShrinkModifier\n*L\n1152#1:1182\n*E\n"})
/* loaded from: classes.dex */
final class ExpandShrinkModifier extends LayoutModifierWithPassThroughIntrinsics {
    private final State<Alignment> alignment;
    private Alignment currentAlignment;
    private final State<ChangeSize> expand;
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    private final State<ChangeSize> shrink;
    private final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> sizeTransitionSpec;

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandShrinkModifier(Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation, State<ChangeSize> expand, State<ChangeSize> shrink, State<? extends Alignment> alignment) {
        Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
        Intrinsics.checkNotNullParameter(offsetAnimation, "offsetAnimation");
        Intrinsics.checkNotNullParameter(expand, "expand");
        Intrinsics.checkNotNullParameter(shrink, "shrink");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.sizeAnimation = sizeAnimation;
        this.offsetAnimation = offsetAnimation;
        this.expand = expand;
        this.shrink = shrink;
        this.alignment = alignment;
        this.sizeTransitionSpec = new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.ExpandShrinkModifier$sizeTransitionSpec$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<EnterExitState> segment) {
                Intrinsics.checkNotNullParameter(segment, "$this$null");
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                FiniteAnimationSpec<IntSize> animationSpec = null;
                if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                    ChangeSize value = this.this$0.getExpand().getValue();
                    if (value != null) {
                        animationSpec = value.getAnimationSpec();
                    }
                } else if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                    ChangeSize value2 = this.this$0.getShrink().getValue();
                    if (value2 != null) {
                        animationSpec = value2.getAnimationSpec();
                    }
                } else {
                    animationSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
                }
                return animationSpec == null ? EnterExitTransitionKt.DefaultSizeAnimationSpec : animationSpec;
            }
        };
    }

    public final State<Alignment> getAlignment() {
        return this.alignment;
    }

    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    public final State<ChangeSize> getExpand() {
        return this.expand;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    public final State<ChangeSize> getShrink() {
        return this.shrink;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6941measure3p2s80s(MeasureScope measure, Measurable measurable, long j4) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable placeableMo10585measureBRTryo0 = measurable.mo10585measureBRTryo0(j4);
        final long jIntSize = IntSizeKt.IntSize(placeableMo10585measureBRTryo0.getWidth(), placeableMo10585measureBRTryo0.getHeight());
        long packedValue = this.sizeAnimation.animate(this.sizeTransitionSpec, new Function1<EnterExitState, IntSize>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$currentSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(EnterExitState enterExitState) {
                return IntSize.m11677boximpl(m6977invokeYEO4UFw(enterExitState));
            }

            /* renamed from: invoke-YEO4UFw, reason: not valid java name */
            public final long m6977invokeYEO4UFw(EnterExitState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.m6975sizeByStateUzc_VyU(it, jIntSize);
            }
        }).getValue().getPackedValue();
        final long packedValue2 = this.offsetAnimation.animate(new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$offsetDelta$1
            @Override // kotlin.jvm.functions.Function1
            public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> animate) {
                Intrinsics.checkNotNullParameter(animate, "$this$animate");
                return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            }
        }, new Function1<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                return IntOffset.m11634boximpl(m6978invokeBjo55l4(enterExitState));
            }

            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
            public final long m6978invokeBjo55l4(EnterExitState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.m6976targetOffsetByStateoFUgxo0(it, jIntSize);
            }
        }).getValue().getPackedValue();
        Alignment alignment = this.currentAlignment;
        final long jMo8841alignKFBX0sM = alignment != null ? alignment.mo8841alignKFBX0sM(jIntSize, packedValue, LayoutDirection.Ltr) : IntOffset.INSTANCE.m11653getZeronOccac();
        return MeasureScope.CC.m634p(measure, IntSize.m11685getWidthimpl(packedValue), IntSize.m11684getHeightimpl(packedValue), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.place$default(layout, placeableMo10585measureBRTryo0, IntOffset.m11643getXimpl(jMo8841alignKFBX0sM) + IntOffset.m11643getXimpl(packedValue2), IntOffset.m11644getYimpl(jMo8841alignKFBX0sM) + IntOffset.m11644getYimpl(packedValue2), 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setCurrentAlignment(Alignment alignment) {
        this.currentAlignment = alignment;
    }

    /* renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m6975sizeByStateUzc_VyU(EnterExitState targetState, long fullSize) {
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        ChangeSize value = this.expand.getValue();
        long packedValue = value != null ? value.getSize().invoke(IntSize.m11677boximpl(fullSize)).getPackedValue() : fullSize;
        ChangeSize value2 = this.shrink.getValue();
        long packedValue2 = value2 != null ? value2.getSize().invoke(IntSize.m11677boximpl(fullSize)).getPackedValue() : fullSize;
        int i4 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i4 == 1) {
            return fullSize;
        }
        if (i4 == 2) {
            return packedValue;
        }
        if (i4 == 3) {
            return packedValue2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m6976targetOffsetByStateoFUgxo0(EnterExitState targetState, long fullSize) {
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        if (this.currentAlignment == null) {
            return IntOffset.INSTANCE.m11653getZeronOccac();
        }
        if (this.alignment.getValue() == null) {
            return IntOffset.INSTANCE.m11653getZeronOccac();
        }
        if (Intrinsics.areEqual(this.currentAlignment, this.alignment.getValue())) {
            return IntOffset.INSTANCE.m11653getZeronOccac();
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i4 == 1) {
            return IntOffset.INSTANCE.m11653getZeronOccac();
        }
        if (i4 == 2) {
            return IntOffset.INSTANCE.m11653getZeronOccac();
        }
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ChangeSize value = this.shrink.getValue();
        if (value == null) {
            return IntOffset.INSTANCE.m11653getZeronOccac();
        }
        long packedValue = value.getSize().invoke(IntSize.m11677boximpl(fullSize)).getPackedValue();
        Alignment value2 = this.alignment.getValue();
        Intrinsics.checkNotNull(value2);
        Alignment alignment = value2;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        long jMo8841alignKFBX0sM = alignment.mo8841alignKFBX0sM(fullSize, packedValue, layoutDirection);
        Alignment alignment2 = this.currentAlignment;
        Intrinsics.checkNotNull(alignment2);
        long jMo8841alignKFBX0sM2 = alignment2.mo8841alignKFBX0sM(fullSize, packedValue, layoutDirection);
        return IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jMo8841alignKFBX0sM) - IntOffset.m11643getXimpl(jMo8841alignKFBX0sM2), IntOffset.m11644getYimpl(jMo8841alignKFBX0sM) - IntOffset.m11644getYimpl(jMo8841alignKFBX0sM2));
    }
}
