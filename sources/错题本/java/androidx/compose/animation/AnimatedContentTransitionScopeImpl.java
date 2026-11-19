package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.ClipKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.ParentDataModifier;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\\]^B'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0015\u001a\u00020\u0012*\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0004¢\u0006\u0004\b\u0015\u0010\u0016JK\u0010$\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#JK\u0010)\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010.\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0012H\u0001¢\u0006\u0004\b,\u0010-R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u00101R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R1\u0010C\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR,\u0010F\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0E0D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR*\u0010J\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010E8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010S\u001a\u00020P*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0018\u0010U\u001a\u00020P*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010RR\u001a\u0010\r\u001a\u00020\u000b8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bV\u0010@R\u0014\u0010Y\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010[\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`²\u0006\u0014\u0010_\u001a\u00020P\"\u0004\b\u0000\u0010\u00018\n@\nX\u008a\u008e\u0002"}, m5110d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/core/Transition;", "transition", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/IntSize;", "fullSize", "currentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculateOffset-emnUabE", "(JJ)J", "calculateOffset", "Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "using", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/animation/SizeTransform;)Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "towards", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "offsetForFullSlide", "initialOffset", "Landroidx/compose/animation/EnterTransition;", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lr6/c;)Landroidx/compose/animation/EnterTransition;", "slideIntoContainer", "targetOffset", "Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lr6/c;)Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer", "contentTransform", "Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier$animation_release", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier", "Landroidx/compose/animation/core/Transition;", "getTransition$animation_release", "()Landroidx/compose/animation/core/Transition;", "Landroidx/compose/ui/Alignment;", "getContentAlignment", "()Landroidx/compose/ui/Alignment;", "setContentAlignment", "(Landroidx/compose/ui/Alignment;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection$animation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "measuredSize$delegate", "Landroidx/compose/runtime/MutableState;", "getMeasuredSize-YbymL2g$animation_release", "()J", "setMeasuredSize-ozmzZPI$animation_release", "(J)V", "measuredSize", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/State;", "targetSizeMap", "Landroidx/collection/MutableScatterMap;", "getTargetSizeMap$animation_release", "()Landroidx/collection/MutableScatterMap;", "animatedSize", "Landroidx/compose/runtime/State;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation_release", "(Landroidx/compose/runtime/State;)V", "", "isLeft-gWo6LJ4", "(I)Z", "isLeft", "isRight-gWo6LJ4", "isRight", "getCurrentSize-YbymL2g", "getInitialState", "()Ljava/lang/Object;", "initialState", "getTargetState", "targetState", "ChildData", "SizeModifierElement", "SizeModifierNode", "shouldAnimateSize", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,958:1\n1#2:959\n85#3:960\n113#3,2:961\n85#3:975\n113#3,2:976\n1247#4,6:963\n1247#4,6:969\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n*L\n546#1:960\n546#1:961,2\n558#1:975\n558#1:976,2\n558#1:963,6\n571#1:969,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {
    public static final int $stable = 8;

    @Nullable
    private State<IntSize> animatedSize;

    @NotNull
    private Alignment contentAlignment;

    @NotNull
    private LayoutDirection layoutDirection;

    /* renamed from: measuredSize$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState measuredSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m13468boximpl(IntSize.INSTANCE.m13481getZeroYbymL2g()), null, 2, null);

    @NotNull
    private final MutableScatterMap<S, State<IntSize>> targetSizeMap = ScatterMapKt.mutableScatterMapOf();

    @NotNull
    private final Transition<S> transition;

    @StabilityInferred(parameters = 1)
    @Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\u0002\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000e"}, m5110d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "isTarget", "", "(Z)V", "<set-?>", "()Z", "setTarget", "isTarget$delegate", "Landroidx/compose/runtime/MutableState;", "modifyParentData", "", "Landroidx/compose/ui/unit/Density;", "parentData", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,958:1\n85#2:959\n113#2,2:960\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData\n*L\n592#1:959\n592#1:960,2\n*E\n"})
    public static final class ChildData implements ParentDataModifier {
        public static final int $stable = 0;

        /* renamed from: isTarget$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState isTarget;

        public ChildData(boolean z8) {
            this.isTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean isTarget() {
            return ((Boolean) this.isTarget.getValue()).booleanValue();
        }

        @Override // androidx.compose.p011ui.layout.ParentDataModifier
        @NotNull
        public Object modifyParentData(@NotNull Density density, @Nullable Object obj) {
            return this;
        }

        public final void setTarget(boolean z8) {
            this.isTarget.setValue(Boolean.valueOf(z8));
        }
    }

    @Metadata(m5109d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002BE\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001b*\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, m5110d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeAnimation", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "scope", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "create", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "node", "Ld6/s;", "update", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/runtime/State;", "getSizeTransform", "()Landroidx/compose/runtime/State;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "getScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class SizeModifierElement<S> extends ModifierNodeElement<SizeModifierNode<S>> {

        @NotNull
        private final AnimatedContentTransitionScopeImpl<S> scope;

        @Nullable
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;

        @NotNull
        private final State<SizeTransform> sizeTransform;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifierElement(@Nullable Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, @NotNull State<? extends SizeTransform> state, @NotNull AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
            this.scope = animatedContentTransitionScopeImpl;
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        public boolean equals(@Nullable Object other) {
            if (!(other instanceof SizeModifierElement)) {
                return false;
            }
            SizeModifierElement sizeModifierElement = (SizeModifierElement) other;
            return AbstractC5830k.m5325b(sizeModifierElement.sizeAnimation, this.sizeAnimation) && AbstractC5830k.m5325b(sizeModifierElement.sizeTransform, this.sizeTransform);
        }

        @NotNull
        public final AnimatedContentTransitionScopeImpl<S> getScope() {
            return this.scope;
        }

        @Nullable
        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        @NotNull
        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        public int hashCode() {
            int iHashCode = this.scope.hashCode() * 31;
            Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
            return this.sizeTransform.hashCode() + ((iHashCode + (deferredAnimation != null ? deferredAnimation.hashCode() : 0)) * 31);
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
            inspectorInfo.setName("sizeTransform");
            inspectorInfo.getProperties().set("sizeAnimation", this.sizeAnimation);
            inspectorInfo.getProperties().set("sizeTransform", this.sizeTransform);
            inspectorInfo.getProperties().set("scope", this.scope);
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        @NotNull
        /* renamed from: create */
        public SizeModifierNode<S> getNode() {
            return new SizeModifierNode<>(this.sizeAnimation, this.sizeTransform, this.scope);
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        public void update(@NotNull SizeModifierNode<S> node) {
            node.setSizeAnimation(this.sizeAnimation);
            node.setSizeTransform(this.sizeTransform);
            node.setScope(this.scope);
        }
    }

    @Metadata(m5109d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002BE\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001e\u001a\u00020\u001b*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR:\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, m5110d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeAnimation", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "scope", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "default", "lastContinuousSizeOrDefault-mzRDjE0", "(J)J", "lastContinuousSizeOrDefault", "Ld6/s;", "onReset", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setSizeAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "Landroidx/compose/runtime/State;", "getSizeTransform", "()Landroidx/compose/runtime/State;", "setSizeTransform", "(Landroidx/compose/runtime/State;)V", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "getScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "setScope", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "lastSize", "J", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,958:1\n30#2:959\n30#2:961\n30#2:963\n30#2:965\n80#3:960\n80#3:962\n80#3:964\n80#3:966\n85#3:968\n90#3:970\n54#4:967\n59#4:969\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode\n*L\n657#1:959\n660#1:961\n661#1:963\n663#1:965\n657#1:960\n660#1:962\n661#1:964\n663#1:966\n689#1:968\n689#1:970\n689#1:967\n689#1:969\n*E\n"})
    public static final class SizeModifierNode<S> extends LayoutModifierNodeWithPassThroughIntrinsics {
        private long lastSize = AnimatedContentKt.UnspecifiedSize;

        @NotNull
        private AnimatedContentTransitionScopeImpl<S> scope;

        @Nullable
        private Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;

        @NotNull
        private State<? extends SizeTransform> sizeTransform;

        public SizeModifierNode(@Nullable Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, @NotNull State<? extends SizeTransform> state, @NotNull AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
            this.scope = animatedContentTransitionScopeImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lastContinuousSizeOrDefault-mzRDjE0, reason: not valid java name */
        public final long m6572lastContinuousSizeOrDefaultmzRDjE0(long j7) {
            return IntSize.m13474equalsimpl0(this.lastSize, AnimatedContentKt.UnspecifiedSize) ? j7 : this.lastSize;
        }

        @NotNull
        public final AnimatedContentTransitionScopeImpl<S> getScope() {
            return this.scope;
        }

        @Nullable
        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        @NotNull
        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.p011ui.node.LayoutModifierNode
        @NotNull
        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult mo6573measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
            final long jM13480unboximpl;
            final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(j7);
            if (measureScope.isLookingAhead()) {
                jM13480unboximpl = IntSize.m13471constructorimpl((placeableMo12033measureBRTryo0.getWidth() << 32) | (placeableMo12033measureBRTryo0.getHeight() & 4294967295L));
            } else if (this.sizeAnimation == null) {
                jM13480unboximpl = IntSize.m13471constructorimpl((placeableMo12033measureBRTryo0.getWidth() << 32) | (placeableMo12033measureBRTryo0.getHeight() & 4294967295L));
                this.lastSize = IntSize.m13471constructorimpl((placeableMo12033measureBRTryo0.getWidth() << 32) | (placeableMo12033measureBRTryo0.getHeight() & 4294967295L));
            } else {
                final long jM13471constructorimpl = IntSize.m13471constructorimpl((placeableMo12033measureBRTryo0.getWidth() << 32) | (placeableMo12033measureBRTryo0.getHeight() & 4294967295L));
                Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
                AbstractC5830k.m5327d(deferredAnimation);
                State<IntSize> stateAnimate = deferredAnimation.animate(new InterfaceC6471c(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    @Override // p152r6.InterfaceC6471c
                    public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<S> segment) {
                        long jM13480unboximpl2;
                        FiniteAnimationSpec<IntSize> finiteAnimationSpecMo6636createAnimationSpecTemP2vQ;
                        if (AbstractC5830k.m5325b(segment.getInitialState(), this.this$0.getScope().getInitialState())) {
                            jM13480unboximpl2 = this.this$0.m6572lastContinuousSizeOrDefaultmzRDjE0(jM13471constructorimpl);
                        } else {
                            State state = (State) this.this$0.getScope().getTargetSizeMap$animation_release().get(segment.getInitialState());
                            jM13480unboximpl2 = state != null ? ((IntSize) state.getValue()).m13480unboximpl() : IntSize.INSTANCE.m13481getZeroYbymL2g();
                        }
                        State state2 = (State) this.this$0.getScope().getTargetSizeMap$animation_release().get(segment.getTargetState());
                        long jM13480unboximpl3 = state2 != null ? ((IntSize) state2.getValue()).m13480unboximpl() : IntSize.INSTANCE.m13481getZeroYbymL2g();
                        SizeTransform value = this.this$0.getSizeTransform().getValue();
                        return (value == null || (finiteAnimationSpecMo6636createAnimationSpecTemP2vQ = value.mo6636createAnimationSpecTemP2vQ(jM13480unboximpl2, jM13480unboximpl3)) == null) ? AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null) : finiteAnimationSpecMo6636createAnimationSpecTemP2vQ;
                    }
                }, new InterfaceC6471c(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2
                    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return IntSize.m13468boximpl(m6574invokeYEO4UFw(obj));
                    }

                    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
                    public final long m6574invokeYEO4UFw(S s8) {
                        if (AbstractC5830k.m5325b(s8, this.this$0.getScope().getInitialState())) {
                            return this.this$0.m6572lastContinuousSizeOrDefaultmzRDjE0(jM13471constructorimpl);
                        }
                        State state = (State) this.this$0.getScope().getTargetSizeMap$animation_release().get(s8);
                        return state != null ? ((IntSize) state.getValue()).m13480unboximpl() : IntSize.INSTANCE.m13481getZeroYbymL2g();
                    }
                });
                this.scope.setAnimatedSize$animation_release(stateAnimate);
                jM13480unboximpl = stateAnimate.getValue().m13480unboximpl();
                this.lastSize = stateAnimate.getValue().m13480unboximpl();
            }
            return MeasureScope.layout$default(measureScope, (int) (jM13480unboximpl >> 32), (int) (jM13480unboximpl & 4294967295L), null, new InterfaceC6471c(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
                final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.m12097place70tqf50$default(placementScope, placeableMo12033measureBRTryo0, this.this$0.getScope().getContentAlignment().mo10250alignKFBX0sM(IntSize.m13471constructorimpl((placeableMo12033measureBRTryo0.getWidth() << 32) | (placeableMo12033measureBRTryo0.getHeight() & 4294967295L)), jM13480unboximpl, LayoutDirection.Ltr), 0.0f, 2, null);
                }
            }, 4, null);
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onReset() {
            super.onReset();
            this.lastSize = AnimatedContentKt.UnspecifiedSize;
        }

        public final void setScope(@NotNull AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.scope = animatedContentTransitionScopeImpl;
        }

        public final void setSizeAnimation(@Nullable Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
            this.sizeAnimation = deferredAnimation;
        }

        public final void setSizeTransform(@NotNull State<? extends SizeTransform> state) {
            this.sizeTransform = state;
        }
    }

    public AnimatedContentTransitionScopeImpl(@NotNull Transition<S> transition, @NotNull Alignment alignment, @NotNull LayoutDirection layoutDirection) {
        this.transition = transition;
        this.contentAlignment = alignment;
        this.layoutDirection = layoutDirection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateOffset-emnUabE, reason: not valid java name */
    public final long m6565calculateOffsetemnUabE(long fullSize, long currentSize) {
        return getContentAlignment().mo10250alignKFBX0sM(fullSize, currentSize, LayoutDirection.Ltr);
    }

    private static final boolean createSizeAnimationModifier$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createSizeAnimationModifier$lambda$3(MutableState<Boolean> mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentSize-YbymL2g, reason: not valid java name */
    public final long m6566getCurrentSizeYbymL2g() {
        State<IntSize> state = this.animatedSize;
        return state != null ? state.getValue().m13480unboximpl() : m6569getMeasuredSizeYbymL2g$animation_release();
    }

    /* renamed from: isLeft-gWo6LJ4, reason: not valid java name */
    private final boolean m6567isLeftgWo6LJ4(int i) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
        if (AnimatedContentTransitionScope.SlideDirection.m6553equalsimpl0(i, companion.m6559getLeftDKzdypw())) {
            return true;
        }
        if (AnimatedContentTransitionScope.SlideDirection.m6553equalsimpl0(i, companion.m6561getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr) {
            return true;
        }
        return AnimatedContentTransitionScope.SlideDirection.m6553equalsimpl0(i, companion.m6558getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl;
    }

    /* renamed from: isRight-gWo6LJ4, reason: not valid java name */
    private final boolean m6568isRightgWo6LJ4(int i) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
        if (AnimatedContentTransitionScope.SlideDirection.m6553equalsimpl0(i, companion.m6560getRightDKzdypw())) {
            return true;
        }
        if (AnimatedContentTransitionScope.SlideDirection.m6553equalsimpl0(i, companion.m6561getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl) {
            return true;
        }
        return AnimatedContentTransitionScope.SlideDirection.m6553equalsimpl0(i, companion.m6558getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr;
    }

    @Composable
    @NotNull
    public final Modifier createSizeAnimationModifier$animation_release(@NotNull ContentTransform contentTransform, @Nullable Composer composer, int i) {
        Modifier modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93755870, i, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:556)");
        }
        boolean zChanged = composer.changed(this);
        Object objRememberedValue = composer.rememberedValue();
        Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = null;
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (AbstractC5830k.m5325b(this.transition.getCurrentState(), this.transition.getTargetState())) {
            createSizeAnimationModifier$lambda$3(mutableState, false);
        } else if (stateRememberUpdatedState.getValue() != null) {
            createSizeAnimationModifier$lambda$3(mutableState, true);
        }
        if (createSizeAnimationModifier$lambda$2(mutableState)) {
            composer.startReplaceGroup(249676467);
            deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), null, composer, 0, 2);
            boolean zChanged2 = composer.changed(deferredAnimationCreateDeferredAnimation);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) stateRememberUpdatedState.getValue();
                objRememberedValue2 = (sizeTransform == null || sizeTransform.getClip()) ? ClipKt.clipToBounds(Modifier.INSTANCE) : Modifier.INSTANCE;
                composer.updateRememberedValue(objRememberedValue2);
            }
            modifier = (Modifier) objRememberedValue2;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(249942509);
            composer.endReplaceGroup();
            this.animatedSize = null;
            modifier = Modifier.INSTANCE;
        }
        Modifier modifierThen = modifier.then(new SizeModifierElement(deferredAnimationCreateDeferredAnimation, stateRememberUpdatedState, this));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifierThen;
    }

    @Nullable
    public final State<IntSize> getAnimatedSize$animation_release() {
        return this.animatedSize;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @NotNull
    public Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    @NotNull
    /* renamed from: getLayoutDirection$animation_release, reason: from getter */
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMeasuredSize-YbymL2g$animation_release, reason: not valid java name */
    public final long m6569getMeasuredSizeYbymL2g$animation_release() {
        return ((IntSize) this.measuredSize.getValue()).m13480unboximpl();
    }

    @NotNull
    public final MutableScatterMap<S, State<IntSize>> getTargetSizeMap$animation_release() {
        return this.targetSizeMap;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    @NotNull
    public final Transition<S> getTransition$animation_release() {
        return this.transition;
    }

    public final void setAnimatedSize$animation_release(@Nullable State<IntSize> state) {
        this.animatedSize = state;
    }

    public void setContentAlignment(@NotNull Alignment alignment) {
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation_release(@NotNull LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation_release, reason: not valid java name */
    public final void m6570setMeasuredSizeozmzZPI$animation_release(long j7) {
        this.measuredSize.setValue(IntSize.m13468boximpl(j7));
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @NotNull
    /* renamed from: slideIntoContainer-mOhB8PU */
    public EnterTransition mo6548slideIntoContainermOhB8PU(int towards, @NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final InterfaceC6471c initialOffset) {
        if (m6567isLeftgWo6LJ4(towards)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new InterfaceC6471c() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Integer invoke(int i) {
                    long j7 = i;
                    return (Integer) initialOffset.invoke(Integer.valueOf(((int) (this.m6566getCurrentSizeYbymL2g() >> 32)) - IntOffset.m13433getXimpl(this.m6565calculateOffsetemnUabE(IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32)), this.m6566getCurrentSizeYbymL2g()))));
                }
            });
        }
        if (m6568isRightgWo6LJ4(towards)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new InterfaceC6471c() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Integer invoke(int i) {
                    long j7 = i;
                    return (Integer) initialOffset.invoke(Integer.valueOf((-IntOffset.m13433getXimpl(this.m6565calculateOffsetemnUabE(IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32)), this.m6566getCurrentSizeYbymL2g()))) - i));
                }
            });
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
        return AnimatedContentTransitionScope.SlideDirection.m6553equalsimpl0(towards, companion.m6562getUpDKzdypw()) ? EnterExitTransitionKt.slideInVertically(animationSpec, new InterfaceC6471c() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i) {
                long j7 = i;
                return (Integer) initialOffset.invoke(Integer.valueOf(((int) (this.m6566getCurrentSizeYbymL2g() & 4294967295L)) - IntOffset.m13434getYimpl(this.m6565calculateOffsetemnUabE(IntSize.m13471constructorimpl((4294967295L & j7) | (j7 << 32)), this.m6566getCurrentSizeYbymL2g()))));
            }
        }) : AnimatedContentTransitionScope.SlideDirection.m6553equalsimpl0(towards, companion.m6557getDownDKzdypw()) ? EnterExitTransitionKt.slideInVertically(animationSpec, new InterfaceC6471c() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i) {
                long j7 = i;
                return (Integer) initialOffset.invoke(Integer.valueOf((-IntOffset.m13434getYimpl(this.m6565calculateOffsetemnUabE(IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32)), this.m6566getCurrentSizeYbymL2g()))) - i));
            }
        }) : EnterTransition.INSTANCE.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @NotNull
    /* renamed from: slideOutOfContainer-mOhB8PU */
    public ExitTransition mo6549slideOutOfContainermOhB8PU(int towards, @NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final InterfaceC6471c targetOffset) {
        if (m6567isLeftgWo6LJ4(towards)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new InterfaceC6471c(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
                final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Integer invoke(int i) {
                    State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    long j7 = i;
                    return (Integer) targetOffset.invoke(Integer.valueOf((-IntOffset.m13433getXimpl(this.this$0.m6565calculateOffsetemnUabE(IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32)), state != null ? ((IntSize) state.getValue()).m13480unboximpl() : IntSize.INSTANCE.m13481getZeroYbymL2g()))) - i));
                }
            });
        }
        if (m6568isRightgWo6LJ4(towards)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new InterfaceC6471c(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$2
                final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Integer invoke(int i) {
                    State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    long jM13480unboximpl = state != null ? ((IntSize) state.getValue()).m13480unboximpl() : IntSize.INSTANCE.m13481getZeroYbymL2g();
                    long j7 = i;
                    return (Integer) targetOffset.invoke(Integer.valueOf((-IntOffset.m13433getXimpl(this.this$0.m6565calculateOffsetemnUabE(IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32)), jM13480unboximpl))) + ((int) (jM13480unboximpl >> 32))));
                }
            });
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
        return AnimatedContentTransitionScope.SlideDirection.m6553equalsimpl0(towards, companion.m6562getUpDKzdypw()) ? EnterExitTransitionKt.slideOutVertically(animationSpec, new InterfaceC6471c(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$3
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i) {
                State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                long j7 = i;
                return (Integer) targetOffset.invoke(Integer.valueOf((-IntOffset.m13434getYimpl(this.this$0.m6565calculateOffsetemnUabE(IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32)), state != null ? ((IntSize) state.getValue()).m13480unboximpl() : IntSize.INSTANCE.m13481getZeroYbymL2g()))) - i));
            }
        }) : AnimatedContentTransitionScope.SlideDirection.m6553equalsimpl0(towards, companion.m6557getDownDKzdypw()) ? EnterExitTransitionKt.slideOutVertically(animationSpec, new InterfaceC6471c(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$4
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i) {
                State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                long jM13480unboximpl = state != null ? ((IntSize) state.getValue()).m13480unboximpl() : IntSize.INSTANCE.m13481getZeroYbymL2g();
                long j7 = i;
                return (Integer) targetOffset.invoke(Integer.valueOf((-IntOffset.m13434getYimpl(this.this$0.m6565calculateOffsetemnUabE(IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32)), jM13480unboximpl))) + ((int) (jM13480unboximpl & 4294967295L))));
            }
        }) : ExitTransition.INSTANCE.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @NotNull
    public ContentTransform using(@NotNull ContentTransform contentTransform, @Nullable SizeTransform sizeTransform) {
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }
}
