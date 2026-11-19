package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AbstractC0370e;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p006ui.AbstractC1266a;
import androidx.compose.p006ui.AbstractC1267b;
import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.draw.ClipKt;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.ParentDataModifier;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.p006ui.unit.IntSize;
import androidx.compose.p006ui.unit.IntSizeKt;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003UVWB%\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ%\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0004\b>\u0010?JP\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u0002002\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u0002060D2#\b\u0002\u0010E\u001a\u001d\u0012\u0013\u0012\u00110G¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020G0Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJP\u0010M\u001a\u00020N2\u0006\u0010B\u001a\u0002002\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u0002060D2#\b\u0002\u0010O\u001a\u001d\u0012\u0013\u0012\u00110G¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020G0Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020=*\u00020=2\b\u0010S\u001a\u0004\u0018\u00010TH\u0087\u0004R%\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0080\u000eø\u0001\u0000¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u00020\f8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR4\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010#R)\u0010&\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0'X\u0080\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001b\u0010.\u001a\u00020/*\u0002008BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b1\u00102R\u001b\u00103\u001a\u00020/*\u0002008BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b4\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, m5175d2 = {"Landroidx/compose/animation/AnimatedContentScope;", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/core/Transition$Segment;", "transition", "Landroidx/compose/animation/core/Transition;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "animatedSize", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/IntSize;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation_release", "(Landroidx/compose/runtime/State;)V", "getContentAlignment$animation_release", "()Landroidx/compose/ui/Alignment;", "setContentAlignment$animation_release", "(Landroidx/compose/ui/Alignment;)V", "currentSize", "getCurrentSize-YbymL2g", "()J", "initialState", "getInitialState", "()Ljava/lang/Object;", "getLayoutDirection$animation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "measuredSize", "getMeasuredSize-YbymL2g$animation_release", "setMeasuredSize-ozmzZPI$animation_release", "(J)V", "measuredSize$delegate", "Landroidx/compose/runtime/MutableState;", "targetSizeMap", "", "getTargetSizeMap$animation_release", "()Ljava/util/Map;", "targetState", "getTargetState", "getTransition$animation_release", "()Landroidx/compose/animation/core/Transition;", "isLeft", "", "Landroidx/compose/animation/AnimatedContentScope$SlideDirection;", "isLeft-9jb1Dl8", "(I)Z", "isRight", "isRight-9jb1Dl8", "calculateOffset", "Landroidx/compose/ui/unit/IntOffset;", "fullSize", "calculateOffset-emnUabE", "(JJ)J", "createSizeAnimationModifier", "Landroidx/compose/ui/Modifier;", "contentTransform", "Landroidx/compose/animation/ContentTransform;", "createSizeAnimationModifier$animation_release", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "slideIntoContainer", "Landroidx/compose/animation/EnterTransition;", "towards", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "initialOffset", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "offsetForFullSlide", "slideIntoContainer-HTTW7Ok", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideOutOfContainer", "Landroidx/compose/animation/ExitTransition;", "targetOffset", "slideOutOfContainer-HTTW7Ok", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "using", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "ChildData", "SizeModifier", "SlideDirection", "animation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@ExperimentalAnimationApi
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,780:1\n76#2:781\n102#2,2:782\n76#2:798\n102#2,2:799\n36#3:784\n36#3:791\n1057#4,6:785\n1057#4,6:792\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentScope\n*L\n478#1:781\n478#1:782,2\n493#1:798\n493#1:799,2\n493#1:784\n505#1:791\n493#1:785,6\n505#1:792,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedContentScope<S> implements Transition.Segment<S> {
    public static final int $stable = 8;
    private State<IntSize> animatedSize;
    private Alignment contentAlignment;
    private LayoutDirection layoutDirection;

    /* renamed from: measuredSize$delegate, reason: from kotlin metadata */
    private final MutableState measuredSize;
    private final Map<S, State<IntSize>> targetSizeMap;
    private final Transition<S> transition;

    @Metadata(m5174d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u000b*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004¨\u0006\u0013"}, m5175d2 = {"Landroidx/compose/animation/AnimatedContentScope$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "isTarget", "", "(Z)V", "()Z", "setTarget", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "modifyParentData", "Landroidx/compose/ui/unit/Density;", "parentData", "animation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ChildData implements ParentDataModifier {
        private boolean isTarget;

        public ChildData(boolean z3) {
            this.isTarget = z3;
        }

        public static /* synthetic */ ChildData copy$default(ChildData childData, boolean z3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z3 = childData.isTarget;
            }
            return childData.copy(z3);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
        public /* synthetic */ boolean all(Function1 function1) {
            return AbstractC1267b.m309a(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
        public /* synthetic */ boolean any(Function1 function1) {
            return AbstractC1267b.m310b(this, function1);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsTarget() {
            return this.isTarget;
        }

        public final ChildData copy(boolean isTarget) {
            return new ChildData(isTarget);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChildData) && this.isTarget == ((ChildData) other).isTarget;
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
        public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
            return AbstractC1267b.m311c(this, obj, function2);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
        public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
            return AbstractC1267b.m312d(this, obj, function2);
        }

        public int hashCode() {
            boolean z3 = this.isTarget;
            if (z3) {
                return 1;
            }
            return z3 ? 1 : 0;
        }

        public final boolean isTarget() {
            return this.isTarget;
        }

        @Override // androidx.compose.p006ui.layout.ParentDataModifier
        public Object modifyParentData(Density density, Object obj) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            return this;
        }

        public final void setTarget(boolean z3) {
            this.isTarget = z3;
        }

        @Override // androidx.compose.p006ui.Modifier
        public /* synthetic */ Modifier then(Modifier modifier) {
            return AbstractC1266a.m307a(this, modifier);
        }

        public String toString() {
            return "ChildData(isTarget=" + this.isTarget + ')';
        }
    }

    @Metadata(m5174d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0083\u0004\u0018\u00002\u00020\u0001B6\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bø\u0001\u0000¢\u0006\u0002\u0010\nJ)\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00028\u00000\u0006ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, m5175d2 = {"Landroidx/compose/animation/AnimatedContentScope$SizeModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeTransform", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;)V", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeTransform", "()Landroidx/compose/runtime/State;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @ExperimentalAnimationApi
    public final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        private final State<SizeTransform> sizeTransform;
        final /* synthetic */ AnimatedContentScope<S> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifier(AnimatedContentScope animatedContentScope, Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, State<? extends SizeTransform> sizeTransform) {
            Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
            Intrinsics.checkNotNullParameter(sizeTransform, "sizeTransform");
            this.this$0 = animatedContentScope;
            this.sizeAnimation = sizeAnimation;
            this.sizeTransform = sizeTransform;
        }

        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.p006ui.layout.LayoutModifier
        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult mo6941measure3p2s80s(MeasureScope measure, Measurable measurable, long j4) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            final Placeable placeableMo10585measureBRTryo0 = measurable.mo10585measureBRTryo0(j4);
            Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
            final AnimatedContentScope<S> animatedContentScope = this.this$0;
            Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>> function1 = new Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$size$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<S> animate) {
                    FiniteAnimationSpec<IntSize> finiteAnimationSpecMo6992createAnimationSpecTemP2vQ;
                    Intrinsics.checkNotNullParameter(animate, "$this$animate");
                    State<IntSize> state = animatedContentScope.getTargetSizeMap$animation_release().get(animate.getInitialState());
                    long packedValue = state != null ? state.getValue().getPackedValue() : IntSize.INSTANCE.m11690getZeroYbymL2g();
                    State<IntSize> state2 = animatedContentScope.getTargetSizeMap$animation_release().get(animate.getTargetState());
                    long packedValue2 = state2 != null ? state2.getValue().getPackedValue() : IntSize.INSTANCE.m11690getZeroYbymL2g();
                    SizeTransform value = this.getSizeTransform().getValue();
                    return (value == null || (finiteAnimationSpecMo6992createAnimationSpecTemP2vQ = value.mo6992createAnimationSpecTemP2vQ(packedValue, packedValue2)) == null) ? AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null) : finiteAnimationSpecMo6992createAnimationSpecTemP2vQ;
                }
            };
            final AnimatedContentScope<S> animatedContentScope2 = this.this$0;
            State<IntSize> stateAnimate = deferredAnimation.animate(function1, new Function1<S, IntSize>() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$size$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntSize invoke(Object obj) {
                    return IntSize.m11677boximpl(m6942invokeYEO4UFw(obj));
                }

                /* renamed from: invoke-YEO4UFw, reason: not valid java name */
                public final long m6942invokeYEO4UFw(S s3) {
                    State<IntSize> state = animatedContentScope2.getTargetSizeMap$animation_release().get(s3);
                    return state != null ? state.getValue().getPackedValue() : IntSize.INSTANCE.m11690getZeroYbymL2g();
                }
            });
            this.this$0.setAnimatedSize$animation_release(stateAnimate);
            final long jMo8841alignKFBX0sM = this.this$0.getContentAlignment().mo8841alignKFBX0sM(IntSizeKt.IntSize(placeableMo10585measureBRTryo0.getWidth(), placeableMo10585measureBRTryo0.getHeight()), stateAnimate.getValue().getPackedValue(), LayoutDirection.Ltr);
            return MeasureScope.CC.m634p(measure, IntSize.m11685getWidthimpl(stateAnimate.getValue().getPackedValue()), IntSize.m11684getHeightimpl(stateAnimate.getValue().getPackedValue()), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$1
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
                    Placeable.PlacementScope.m10620place70tqf50$default(layout, placeableMo10585measureBRTryo0, jMo8841alignKFBX0sM, 0.0f, 2, null);
                }
            }, 4, null);
        }
    }

    @Metadata(m5174d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m5175d2 = {"Landroidx/compose/animation/AnimatedContentScope$SlideDirection;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "animation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @Immutable
    @JvmInline
    public static final class SlideDirection {
        private final int value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int Left = m6944constructorimpl(0);
        private static final int Right = m6944constructorimpl(1);

        /* renamed from: Up */
        private static final int f71Up = m6944constructorimpl(2);
        private static final int Down = m6944constructorimpl(3);
        private static final int Start = m6944constructorimpl(4);
        private static final int End = m6944constructorimpl(5);

        @Metadata(m5174d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, m5175d2 = {"Landroidx/compose/animation/AnimatedContentScope$SlideDirection$Companion;", "", "()V", "Down", "Landroidx/compose/animation/AnimatedContentScope$SlideDirection;", "getDown-aUPqQNE", "()I", "I", "End", "getEnd-aUPqQNE", "Left", "getLeft-aUPqQNE", "Right", "getRight-aUPqQNE", "Start", "getStart-aUPqQNE", "Up", "getUp-aUPqQNE", "animation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getDown-aUPqQNE, reason: not valid java name */
            public final int m6950getDownaUPqQNE() {
                return SlideDirection.Down;
            }

            /* renamed from: getEnd-aUPqQNE, reason: not valid java name */
            public final int m6951getEndaUPqQNE() {
                return SlideDirection.End;
            }

            /* renamed from: getLeft-aUPqQNE, reason: not valid java name */
            public final int m6952getLeftaUPqQNE() {
                return SlideDirection.Left;
            }

            /* renamed from: getRight-aUPqQNE, reason: not valid java name */
            public final int m6953getRightaUPqQNE() {
                return SlideDirection.Right;
            }

            /* renamed from: getStart-aUPqQNE, reason: not valid java name */
            public final int m6954getStartaUPqQNE() {
                return SlideDirection.Start;
            }

            /* renamed from: getUp-aUPqQNE, reason: not valid java name */
            public final int m6955getUpaUPqQNE() {
                return SlideDirection.f71Up;
            }
        }

        private /* synthetic */ SlideDirection(int i4) {
            this.value = i4;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SlideDirection m6943boximpl(int i4) {
            return new SlideDirection(i4);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m6944constructorimpl(int i4) {
            return i4;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m6945equalsimpl(int i4, Object obj) {
            return (obj instanceof SlideDirection) && i4 == ((SlideDirection) obj).getValue();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6946equalsimpl0(int i4, int i5) {
            return i4 == i5;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m6947hashCodeimpl(int i4) {
            return i4;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m6948toStringimpl(int i4) {
            return m6946equalsimpl0(i4, Left) ? "Left" : m6946equalsimpl0(i4, Right) ? "Right" : m6946equalsimpl0(i4, f71Up) ? "Up" : m6946equalsimpl0(i4, Down) ? "Down" : m6946equalsimpl0(i4, Start) ? "Start" : m6946equalsimpl0(i4, End) ? "End" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m6945equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m6947hashCodeimpl(this.value);
        }

        public String toString() {
            return m6948toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }
    }

    public AnimatedContentScope(Transition<S> transition, Alignment contentAlignment, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(contentAlignment, "contentAlignment");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.transition = transition;
        this.contentAlignment = contentAlignment;
        this.layoutDirection = layoutDirection;
        this.measuredSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m11677boximpl(IntSize.INSTANCE.m11690getZeroYbymL2g()), null, 2, null);
        this.targetSizeMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateOffset-emnUabE, reason: not valid java name */
    public final long m6931calculateOffsetemnUabE(long fullSize, long currentSize) {
        return this.contentAlignment.mo8841alignKFBX0sM(fullSize, currentSize, LayoutDirection.Ltr);
    }

    private static final boolean createSizeAnimationModifier$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createSizeAnimationModifier$lambda$3(MutableState<Boolean> mutableState, boolean z3) {
        mutableState.setValue(Boolean.valueOf(z3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentSize-YbymL2g, reason: not valid java name */
    public final long m6932getCurrentSizeYbymL2g() {
        State<IntSize> state = this.animatedSize;
        return state != null ? state.getValue().getPackedValue() : m6937getMeasuredSizeYbymL2g$animation_release();
    }

    /* renamed from: isLeft-9jb1Dl8, reason: not valid java name */
    private final boolean m6933isLeft9jb1Dl8(int i4) {
        SlideDirection.Companion companion = SlideDirection.INSTANCE;
        return SlideDirection.m6946equalsimpl0(i4, companion.m6952getLeftaUPqQNE()) || (SlideDirection.m6946equalsimpl0(i4, companion.m6954getStartaUPqQNE()) && this.layoutDirection == LayoutDirection.Ltr) || (SlideDirection.m6946equalsimpl0(i4, companion.m6951getEndaUPqQNE()) && this.layoutDirection == LayoutDirection.Rtl);
    }

    /* renamed from: isRight-9jb1Dl8, reason: not valid java name */
    private final boolean m6934isRight9jb1Dl8(int i4) {
        SlideDirection.Companion companion = SlideDirection.INSTANCE;
        return SlideDirection.m6946equalsimpl0(i4, companion.m6953getRightaUPqQNE()) || (SlideDirection.m6946equalsimpl0(i4, companion.m6954getStartaUPqQNE()) && this.layoutDirection == LayoutDirection.Rtl) || (SlideDirection.m6946equalsimpl0(i4, companion.m6951getEndaUPqQNE()) && this.layoutDirection == LayoutDirection.Ltr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: slideIntoContainer-HTTW7Ok$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m6935slideIntoContainerHTTW7Ok$default(AnimatedContentScope animatedContentScope, int i4, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m11634boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
        }
        if ((i5 & 4) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$1
                public final Integer invoke(int i6) {
                    return Integer.valueOf(i6);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return animatedContentScope.m6939slideIntoContainerHTTW7Ok(i4, finiteAnimationSpec, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: slideOutOfContainer-HTTW7Ok$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m6936slideOutOfContainerHTTW7Ok$default(AnimatedContentScope animatedContentScope, int i4, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m11634boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
        }
        if ((i5 & 4) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$1
                public final Integer invoke(int i6) {
                    return Integer.valueOf(i6);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return animatedContentScope.m6940slideOutOfContainerHTTW7Ok(i4, finiteAnimationSpec, function1);
    }

    @Composable
    public final Modifier createSizeAnimationModifier$animation_release(ContentTransform contentTransform, Composer composer, int i4) {
        Modifier modifier;
        Intrinsics.checkNotNullParameter(contentTransform, "contentTransform");
        composer.startReplaceableGroup(-1349251863);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1349251863, i4, -1, "androidx.compose.animation.AnimatedContentScope.createSizeAnimationModifier (AnimatedContent.kt:489)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(this);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        boolean z3 = false;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (Intrinsics.areEqual(this.transition.getCurrentState(), this.transition.getTargetState())) {
            createSizeAnimationModifier$lambda$3(mutableState, false);
        } else if (stateRememberUpdatedState.getValue() != null) {
            createSizeAnimationModifier$lambda$3(mutableState, true);
        }
        if (createSizeAnimationModifier$lambda$2(mutableState)) {
            Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), null, composer, 64, 2);
            composer.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer.changed(deferredAnimationCreateDeferredAnimation);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) stateRememberUpdatedState.getValue();
                if (sizeTransform != null && !sizeTransform.getClip()) {
                    z3 = true;
                }
                Modifier modifierClipToBounds = Modifier.INSTANCE;
                if (!z3) {
                    modifierClipToBounds = ClipKt.clipToBounds(modifierClipToBounds);
                }
                objRememberedValue2 = modifierClipToBounds.then(new SizeModifier(this, deferredAnimationCreateDeferredAnimation, stateRememberUpdatedState));
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            modifier = (Modifier) objRememberedValue2;
        } else {
            this.animatedSize = null;
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier;
    }

    public final State<IntSize> getAnimatedSize$animation_release() {
        return this.animatedSize;
    }

    /* renamed from: getContentAlignment$animation_release, reason: from getter */
    public final Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    /* renamed from: getLayoutDirection$animation_release, reason: from getter */
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMeasuredSize-YbymL2g$animation_release, reason: not valid java name */
    public final long m6937getMeasuredSizeYbymL2g$animation_release() {
        return ((IntSize) this.measuredSize.getValue()).getPackedValue();
    }

    public final Map<S, State<IntSize>> getTargetSizeMap$animation_release() {
        return this.targetSizeMap;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    public final Transition<S> getTransition$animation_release() {
        return this.transition;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public /* synthetic */ boolean isTransitioningTo(Object obj, Object obj2) {
        return AbstractC0370e.m148a(this, obj, obj2);
    }

    public final void setAnimatedSize$animation_release(State<IntSize> state) {
        this.animatedSize = state;
    }

    public final void setContentAlignment$animation_release(Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "<set-?>");
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation_release(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation_release, reason: not valid java name */
    public final void m6938setMeasuredSizeozmzZPI$animation_release(long j4) {
        this.measuredSize.setValue(IntSize.m11677boximpl(j4));
    }

    /* renamed from: slideIntoContainer-HTTW7Ok, reason: not valid java name */
    public final EnterTransition m6939slideIntoContainerHTTW7Ok(int towards, FiniteAnimationSpec<IntOffset> animationSpec, final Function1<? super Integer, Integer> initialOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffset, "initialOffset");
        if (m6933isLeft9jb1Dl8(towards)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i4) {
                    return initialOffset.invoke(Integer.valueOf(IntSize.m11685getWidthimpl(this.m6932getCurrentSizeYbymL2g()) - IntOffset.m11643getXimpl(this.m6931calculateOffsetemnUabE(IntSizeKt.IntSize(i4, i4), this.m6932getCurrentSizeYbymL2g()))));
                }
            });
        }
        if (m6934isRight9jb1Dl8(towards)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i4) {
                    return initialOffset.invoke(Integer.valueOf((-IntOffset.m11643getXimpl(this.m6931calculateOffsetemnUabE(IntSizeKt.IntSize(i4, i4), this.m6932getCurrentSizeYbymL2g()))) - i4));
                }
            });
        }
        SlideDirection.Companion companion = SlideDirection.INSTANCE;
        return SlideDirection.m6946equalsimpl0(towards, companion.m6955getUpaUPqQNE()) ? EnterExitTransitionKt.slideInVertically(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i4) {
                return initialOffset.invoke(Integer.valueOf(IntSize.m11684getHeightimpl(this.m6932getCurrentSizeYbymL2g()) - IntOffset.m11644getYimpl(this.m6931calculateOffsetemnUabE(IntSizeKt.IntSize(i4, i4), this.m6932getCurrentSizeYbymL2g()))));
            }
        }) : SlideDirection.m6946equalsimpl0(towards, companion.m6950getDownaUPqQNE()) ? EnterExitTransitionKt.slideInVertically(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i4) {
                return initialOffset.invoke(Integer.valueOf((-IntOffset.m11644getYimpl(this.m6931calculateOffsetemnUabE(IntSizeKt.IntSize(i4, i4), this.m6932getCurrentSizeYbymL2g()))) - i4));
            }
        }) : EnterTransition.INSTANCE.getNone();
    }

    /* renamed from: slideOutOfContainer-HTTW7Ok, reason: not valid java name */
    public final ExitTransition m6940slideOutOfContainerHTTW7Ok(int towards, FiniteAnimationSpec<IntOffset> animationSpec, final Function1<? super Integer, Integer> targetOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffset, "targetOffset");
        if (m6933isLeft9jb1Dl8(towards)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$2
                final /* synthetic */ AnimatedContentScope<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i4) {
                    State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    return targetOffset.invoke(Integer.valueOf((-IntOffset.m11643getXimpl(this.this$0.m6931calculateOffsetemnUabE(IntSizeKt.IntSize(i4, i4), state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.m11690getZeroYbymL2g()))) - i4));
                }
            });
        }
        if (m6934isRight9jb1Dl8(towards)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$3
                final /* synthetic */ AnimatedContentScope<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i4) {
                    State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    long packedValue = state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.m11690getZeroYbymL2g();
                    return targetOffset.invoke(Integer.valueOf((-IntOffset.m11643getXimpl(this.this$0.m6931calculateOffsetemnUabE(IntSizeKt.IntSize(i4, i4), packedValue))) + IntSize.m11685getWidthimpl(packedValue)));
                }
            });
        }
        SlideDirection.Companion companion = SlideDirection.INSTANCE;
        return SlideDirection.m6946equalsimpl0(towards, companion.m6955getUpaUPqQNE()) ? EnterExitTransitionKt.slideOutVertically(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$4
            final /* synthetic */ AnimatedContentScope<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i4) {
                State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                return targetOffset.invoke(Integer.valueOf((-IntOffset.m11644getYimpl(this.this$0.m6931calculateOffsetemnUabE(IntSizeKt.IntSize(i4, i4), state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.m11690getZeroYbymL2g()))) - i4));
            }
        }) : SlideDirection.m6946equalsimpl0(towards, companion.m6950getDownaUPqQNE()) ? EnterExitTransitionKt.slideOutVertically(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$5
            final /* synthetic */ AnimatedContentScope<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i4) {
                State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                long packedValue = state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.m11690getZeroYbymL2g();
                return targetOffset.invoke(Integer.valueOf((-IntOffset.m11644getYimpl(this.this$0.m6931calculateOffsetemnUabE(IntSizeKt.IntSize(i4, i4), packedValue))) + IntSize.m11684getHeightimpl(packedValue)));
            }
        }) : ExitTransition.INSTANCE.getNone();
    }

    @ExperimentalAnimationApi
    public final ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform) {
        Intrinsics.checkNotNullParameter(contentTransform, "<this>");
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }
}
