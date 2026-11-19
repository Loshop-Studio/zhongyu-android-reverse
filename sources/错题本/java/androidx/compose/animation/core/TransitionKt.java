package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.TransitionAnimationState;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5773a;
import kotlin.Deprecated;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.C5825f;
import kotlin.jvm.internal.C5828i;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000´\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\f\u001ac\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0012R\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u000f*\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a^\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010\u001a\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00028\u00010\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001aC\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u0001\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001f\u0010 \u001a¨\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u000f*\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00028\u00010\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b(\u0010)\u001ao\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010'\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u000f*\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010*\u001a\u00028\u00012\u0006\u0010+\u001a\u00028\u00012\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b-\u0010.\u001ak\u00102\u001a\u000201\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u000f*\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001c\u00100\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020/R\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010*\u001a\u00028\u00012\u0006\u0010+\u001a\u00028\u00012\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0003¢\u0006\u0004\b2\u00103\u001a\u0084\u0001\u00105\u001a\b\u0012\u0004\u0012\u0002040'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u0002040\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b5\u00106\u001a\u0084\u0001\u00108\u001a\b\u0012\u0004\u0012\u0002070'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u0002070\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b8\u00106\u001a\u0084\u0001\u0010:\u001a\b\u0012\u0004\u0012\u0002090'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u0002090\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b:\u00106\u001a\u0084\u0001\u0010<\u001a\b\u0012\u0004\u0012\u00020;0'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020;0\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b<\u00106\u001a\u0084\u0001\u0010>\u001a\b\u0012\u0004\u0012\u00020=0'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020=0\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b>\u00106\u001a\u0084\u0001\u0010@\u001a\b\u0012\u0004\u0012\u00020?0'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020?0\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\b@\u00106\u001a\u0084\u0001\u0010B\u001a\b\u0012\u0004\u0012\u00020A0'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020A0\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\bB\u00106\u001a\u0084\u0001\u0010D\u001a\b\u0012\u0004\u0012\u00020C0'\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\"0\u0015¢\u0006\u0002\b\u0019¢\u0006\u0002\b#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010&\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020C0\u0015¢\u0006\u0002\b\u0019H\u0087\b¢\u0006\u0004\bD\u00106\"\u0014\u0010E\u001a\u00020?8\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010F\"$\u0010H\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030G\u0012\u0004\u0012\u0002010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I\"\u001b\u0010O\u001a\u00020J8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0014\u0010P\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\bP\u0010Q\"\u0014\u0010R\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u0010Q\"\u0014\u0010S\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\bS\u0010Q\"\u0014\u0010T\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\bT\u0010Q\"\u0014\u0010U\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\bU\u0010Q¨\u0006V"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "targetState", "", "label", "Landroidx/compose/animation/core/Transition;", "updateTransition", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/TransitionState;", "transitionState", "rememberTransition", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "createDeferredAnimation", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "parentState", "Landroidx/compose/runtime/Composable;", "transformToChildState", "createChildTransition", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lr6/f;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "initialState", "childLabel", "createChildTransitionInternal", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "state", "targetValueByState", "Landroidx/compose/runtime/State;", "animateValue", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Lr6/f;Ljava/lang/String;Lr6/f;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "initialValue", "targetValue", "animationSpec", "createTransitionAnimation", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "transitionAnimation", "Ld6/s;", "UpdateInitialAndTargetValues", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)V", "", "animateFloat", "(Landroidx/compose/animation/core/Transition;Lr6/f;Ljava/lang/String;Lr6/f;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "animateDp", "Landroidx/compose/ui/geometry/Offset;", "animateOffset", "Landroidx/compose/ui/geometry/Size;", "animateSize", "Landroidx/compose/ui/unit/IntOffset;", "animateIntOffset", "", "animateInt", "Landroidx/compose/ui/unit/IntSize;", "animateIntSize", "Landroidx/compose/ui/geometry/Rect;", "animateRect", "AnimationDebugDurationScale", "I", "Landroidx/compose/animation/core/SeekableTransitionState;", "SeekableTransitionStateTotalDurationChanged", "Lr6/c;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SeekableStateObserver$delegate", "Ld6/e;", "getSeekableStateObserver", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SeekableStateObserver", "NoReset", "F", "ResetNoSnap", "ResetAnimationSnap", "ResetAnimationSnapCurrent", "ResetAnimationSnapTarget", "animation-core_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2141:1\n1832#1,7:2214\n1832#1,7:2221\n1832#1,7:2228\n1832#1,7:2235\n1832#1,7:2242\n1832#1,7:2249\n1832#1,7:2256\n1832#1,7:2263\n1247#2,6:2142\n1247#2,6:2148\n1247#2,6:2154\n1247#2,6:2160\n1247#2,6:2166\n1247#2,6:2172\n1247#2,6:2178\n1247#2,6:2184\n1247#2,6:2190\n1247#2,6:2196\n1247#2,6:2202\n1247#2,6:2208\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1925#1:2214,7\n1955#1:2221,7\n1985#1:2228,7\n2015#1:2235,7\n2049#1:2242,7\n2079#1:2249,7\n2110#1:2256,7\n2140#1:2263,7\n88#1:2142,6\n90#1:2148,6\n806#1:2154,6\n808#1:2160,6\n819#1:2166,6\n1733#1:2172,6\n1734#1:2178,6\n1762#1:2184,6\n1776#1:2190,6\n1780#1:2196,6\n1851#1:2202,6\n1865#1:2208,6\n*E\n"})
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;
    private static final float NoReset = -1.0f;
    private static final float ResetAnimationSnap = -3.0f;
    private static final float ResetAnimationSnapCurrent = -4.0f;
    private static final float ResetAnimationSnapTarget = -5.0f;
    private static final float ResetNoSnap = -2.0f;

    @NotNull
    private static final InterfaceC6471c SeekableTransitionStateTotalDurationChanged = new InterfaceC6471c() { // from class: androidx.compose.animation.core.TransitionKt$SeekableTransitionStateTotalDurationChanged$1
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SeekableTransitionState<?>) obj);
            return C5443s.f8405a;
        }

        public final void invoke(SeekableTransitionState<?> seekableTransitionState) {
            seekableTransitionState.onTotalDurationChanged$animation_core_release();
        }
    };

    @NotNull
    private static final InterfaceC5429e SeekableStateObserver$delegate = AbstractC5773a.m5116a(LazyThreadSafetyMode.NONE, new InterfaceC6469a() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2
        @Override // p152r6.InterfaceC6469a
        public final SnapshotStateObserver invoke() {
            SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new InterfaceC6471c() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2.1
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC6469a) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(InterfaceC6469a interfaceC6469a) {
                    interfaceC6469a.invoke();
                }
            });
            snapshotStateObserver.start();
            return snapshotStateObserver;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final <S, T, V extends AnimationVector> void UpdateInitialAndTargetValues(final Transition<S> transition, final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, final T t8, final T t9, final FiniteAnimationSpec<T> finiteAnimationSpec, Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(867041821);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(transitionAnimationState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= (i & 512) == 0 ? composerStartRestartGroup.changed(t8) : composerStartRestartGroup.changedInstance(t8) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(t9) : composerStartRestartGroup.changedInstance(t9) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(finiteAnimationSpec) : composerStartRestartGroup.changedInstance(finiteAnimationSpec) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(867041821, i8, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1880)");
            }
            if (transition.isSeeking()) {
                transitionAnimationState.updateInitialAndTargetValue$animation_core_release(t8, t9, finiteAnimationSpec);
            } else {
                transitionAnimationState.updateTargetValue$animation_core_release(t9, finiteAnimationSpec);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.animation.core.TransitionKt.UpdateInitialAndTargetValues.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(Composer composer2, int i9) {
                    TransitionKt.UpdateInitialAndTargetValues(transition, transitionAnimationState, t8, t9, finiteAnimationSpec, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<C2331Dp> animateDp(@NotNull Transition<S> transition, @Nullable InterfaceC6474f interfaceC6474f, @Nullable String str, @NotNull InterfaceC6474f interfaceC6474f2, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            interfaceC6474f = new InterfaceC6474f() { // from class: androidx.compose.animation.core.TransitionKt.animateDp.1
                @Override // p152r6.InterfaceC6474f
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<C2331Dp> invoke(Transition.Segment<S> segment, Composer composer2, int i9) {
                    composer2.startReplaceGroup(-575880366);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-575880366, i9, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1950)");
                    }
                    SpringSpec<C2331Dp> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, C2331Dp.m13303boximpl(VisibilityThresholdsKt.getVisibilityThreshold(C2331Dp.INSTANCE)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i8 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        int i9 = i & 14;
        int i10 = i << 3;
        int i11 = i9 | (i10 & 896) | (i10 & 7168) | (i10 & 57344);
        int i12 = (i11 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC6474f2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i12)), interfaceC6474f2.invoke(transition.getTargetState(), composer, Integer.valueOf(i12)), (FiniteAnimationSpec) interfaceC6474f.invoke(transition.getSegment(), composer, Integer.valueOf((i11 >> 3) & 112)), VectorConvertersKt.getVectorConverter(C2331Dp.INSTANCE), str2, composer, (i11 & 14) | ((i11 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Float> animateFloat(@NotNull Transition<S> transition, @Nullable InterfaceC6474f interfaceC6474f, @Nullable String str, @NotNull InterfaceC6474f interfaceC6474f2, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            interfaceC6474f = new InterfaceC6474f() { // from class: androidx.compose.animation.core.TransitionKt.animateFloat.1
                @Override // p152r6.InterfaceC6474f
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<Float> invoke(Transition.Segment<S> segment, Composer composer2, int i9) {
                    composer2.startReplaceGroup(-522164544);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-522164544, i9, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1920)");
                    }
                    SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i8 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        int i9 = i & 14;
        int i10 = i << 3;
        int i11 = i9 | (i10 & 896) | (i10 & 7168) | (i10 & 57344);
        int i12 = (i11 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC6474f2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i12)), interfaceC6474f2.invoke(transition.getTargetState(), composer, Integer.valueOf(i12)), (FiniteAnimationSpec) interfaceC6474f.invoke(transition.getSegment(), composer, Integer.valueOf((i11 >> 3) & 112)), VectorConvertersKt.getVectorConverter(C5825f.f9219a), str2, composer, (i11 & 14) | ((i11 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Integer> animateInt(@NotNull Transition<S> transition, @Nullable InterfaceC6474f interfaceC6474f, @Nullable String str, @NotNull InterfaceC6474f interfaceC6474f2, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            interfaceC6474f = new InterfaceC6474f() { // from class: androidx.compose.animation.core.TransitionKt.animateInt.1
                @Override // p152r6.InterfaceC6474f
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<Integer> invoke(Transition.Segment<S> segment, Composer composer2, int i9) {
                    composer2.startReplaceGroup(-785273069);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-785273069, i9, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:2074)");
                    }
                    SpringSpec<Integer> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i8 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        int i9 = i & 14;
        int i10 = i << 3;
        int i11 = i9 | (i10 & 896) | (i10 & 7168) | (i10 & 57344);
        int i12 = (i11 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC6474f2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i12)), interfaceC6474f2.invoke(transition.getTargetState(), composer, Integer.valueOf(i12)), (FiniteAnimationSpec) interfaceC6474f.invoke(transition.getSegment(), composer, Integer.valueOf((i11 >> 3) & 112)), VectorConvertersKt.getVectorConverter(C5828i.f9220a), str2, composer, (i11 & 14) | ((i11 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<IntOffset> animateIntOffset(@NotNull Transition<S> transition, @Nullable InterfaceC6474f interfaceC6474f, @Nullable String str, @NotNull InterfaceC6474f interfaceC6474f2, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            interfaceC6474f = new InterfaceC6474f() { // from class: androidx.compose.animation.core.TransitionKt.animateIntOffset.1
                @Override // p152r6.InterfaceC6474f
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<IntOffset> invoke(Transition.Segment<S> segment, Composer composer2, int i9) {
                    composer2.startReplaceGroup(-1953479610);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1953479610, i9, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:2043)");
                    }
                    long j7 = 1;
                    SpringSpec<IntOffset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m13424boximpl(IntOffset.m13427constructorimpl((j7 & 4294967295L) | (j7 << 32))), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i8 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        int i9 = i & 14;
        int i10 = i << 3;
        int i11 = i9 | (i10 & 896) | (i10 & 7168) | (i10 & 57344);
        int i12 = (i11 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC6474f2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i12)), interfaceC6474f2.invoke(transition.getTargetState(), composer, Integer.valueOf(i12)), (FiniteAnimationSpec) interfaceC6474f.invoke(transition.getSegment(), composer, Integer.valueOf((i11 >> 3) & 112)), VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), str2, composer, (i11 & 14) | ((i11 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<IntSize> animateIntSize(@NotNull Transition<S> transition, @Nullable InterfaceC6474f interfaceC6474f, @Nullable String str, @NotNull InterfaceC6474f interfaceC6474f2, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            interfaceC6474f = new InterfaceC6474f() { // from class: androidx.compose.animation.core.TransitionKt.animateIntSize.1
                @Override // p152r6.InterfaceC6474f
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<IntSize> invoke(Transition.Segment<S> segment, Composer composer2, int i9) {
                    composer2.startReplaceGroup(967893300);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(967893300, i9, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:2105)");
                    }
                    long j7 = 1;
                    SpringSpec<IntSize> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m13468boximpl(IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32))), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i8 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        int i9 = i & 14;
        int i10 = i << 3;
        int i11 = i9 | (i10 & 896) | (i10 & 7168) | (i10 & 57344);
        int i12 = (i11 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC6474f2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i12)), interfaceC6474f2.invoke(transition.getTargetState(), composer, Integer.valueOf(i12)), (FiniteAnimationSpec) interfaceC6474f.invoke(transition.getSegment(), composer, Integer.valueOf((i11 >> 3) & 112)), VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), str2, composer, (i11 & 14) | ((i11 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Offset> animateOffset(@NotNull Transition<S> transition, @Nullable InterfaceC6474f interfaceC6474f, @Nullable String str, @NotNull InterfaceC6474f interfaceC6474f2, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            interfaceC6474f = new InterfaceC6474f() { // from class: androidx.compose.animation.core.TransitionKt.animateOffset.1
                @Override // p152r6.InterfaceC6474f
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<Offset> invoke(Transition.Segment<S> segment, Composer composer2, int i9) {
                    composer2.startReplaceGroup(1623385561);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1623385561, i9, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:1980)");
                    }
                    SpringSpec<Offset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m10430boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.INSTANCE)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i8 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        int i9 = i & 14;
        int i10 = i << 3;
        int i11 = i9 | (i10 & 896) | (i10 & 7168) | (i10 & 57344);
        int i12 = (i11 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC6474f2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i12)), interfaceC6474f2.invoke(transition.getTargetState(), composer, Integer.valueOf(i12)), (FiniteAnimationSpec) interfaceC6474f.invoke(transition.getSegment(), composer, Integer.valueOf((i11 >> 3) & 112)), VectorConvertersKt.getVectorConverter(Offset.INSTANCE), str2, composer, (i11 & 14) | ((i11 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Rect> animateRect(@NotNull Transition<S> transition, @Nullable InterfaceC6474f interfaceC6474f, @Nullable String str, @NotNull InterfaceC6474f interfaceC6474f2, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            interfaceC6474f = new InterfaceC6474f() { // from class: androidx.compose.animation.core.TransitionKt.animateRect.1
                @Override // p152r6.InterfaceC6474f
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<Rect> invoke(Transition.Segment<S> segment, Composer composer2, int i9) {
                    composer2.startReplaceGroup(691336298);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(691336298, i9, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:2135)");
                    }
                    SpringSpec<Rect> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.INSTANCE), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i8 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        int i9 = i & 14;
        int i10 = i << 3;
        int i11 = i9 | (i10 & 896) | (i10 & 7168) | (i10 & 57344);
        int i12 = (i11 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC6474f2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i12)), interfaceC6474f2.invoke(transition.getTargetState(), composer, Integer.valueOf(i12)), (FiniteAnimationSpec) interfaceC6474f.invoke(transition.getSegment(), composer, Integer.valueOf((i11 >> 3) & 112)), VectorConvertersKt.getVectorConverter(Rect.INSTANCE), str2, composer, (i11 & 14) | ((i11 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Size> animateSize(@NotNull Transition<S> transition, @Nullable InterfaceC6474f interfaceC6474f, @Nullable String str, @NotNull InterfaceC6474f interfaceC6474f2, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            interfaceC6474f = new InterfaceC6474f() { // from class: androidx.compose.animation.core.TransitionKt.animateSize.1
                @Override // p152r6.InterfaceC6474f
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<Size> invoke(Transition.Segment<S> segment, Composer composer2, int i9) {
                    composer2.startReplaceGroup(-1607152761);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1607152761, i9, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:2010)");
                    }
                    SpringSpec<Size> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m10498boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.INSTANCE)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i8 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        int i9 = i & 14;
        int i10 = i << 3;
        int i11 = i9 | (i10 & 896) | (i10 & 7168) | (i10 & 57344);
        int i12 = (i11 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC6474f2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i12)), interfaceC6474f2.invoke(transition.getTargetState(), composer, Integer.valueOf(i12)), (FiniteAnimationSpec) interfaceC6474f.invoke(transition.getSegment(), composer, Integer.valueOf((i11 >> 3) & 112)), VectorConvertersKt.getVectorConverter(Size.INSTANCE), str2, composer, (i11 & 14) | ((i11 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S, T, V extends AnimationVector> State<T> animateValue(@NotNull Transition<S> transition, @NotNull TwoWayConverter<T, V> twoWayConverter, @Nullable InterfaceC6474f interfaceC6474f, @Nullable String str, @NotNull InterfaceC6474f interfaceC6474f2, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 2) != 0) {
            interfaceC6474f = new InterfaceC6474f() { // from class: androidx.compose.animation.core.TransitionKt.animateValue.1
                @Override // p152r6.InterfaceC6474f
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<T> invoke(Transition.Segment<S> segment, Composer composer2, int i9) {
                    composer2.startReplaceGroup(-895531546);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-895531546, i9, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1827)");
                    }
                    SpringSpec<T> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i8 & 4) != 0) {
            str = "ValueAnimation";
        }
        int i9 = (i >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC6474f2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i9)), interfaceC6474f2.invoke(transition.getTargetState(), composer, Integer.valueOf(i9)), (FiniteAnimationSpec) interfaceC6474f.invoke(transition.getSegment(), composer, Integer.valueOf((i >> 3) & 112)), twoWayConverter, str, composer, (i & 14) | (57344 & (i << 9)) | ((i << 6) & 458752));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @NotNull
    @ExperimentalTransitionApi
    @Composable
    public static final <S, T> Transition<T> createChildTransition(@NotNull Transition<S> transition, @Nullable String str, @NotNull InterfaceC6474f interfaceC6474f, @Nullable Composer composer, int i, int i8) {
        boolean z8 = true;
        if ((i8 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i9 = i & 14;
        if (((i9 ^ 6) <= 4 || !composer.changed(transition)) && (i & 6) != 4) {
            z8 = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = transition.getCurrentState();
            composer.updateRememberedValue(objRememberedValue);
        }
        if (transition.isSeeking()) {
            objRememberedValue = transition.getCurrentState();
        }
        int i10 = (i >> 3) & 112;
        return createChildTransitionInternal(transition, interfaceC6474f.invoke(objRememberedValue, composer, Integer.valueOf(i10)), interfaceC6474f.invoke(transition.getTargetState(), composer, Integer.valueOf(i10)), str2, composer, i9 | ((i << 6) & 7168));
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final <S, T> Transition<T> createChildTransitionInternal(@NotNull final Transition<S> transition, T t8, T t9, @NotNull String str, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198307638, i, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1773)");
        }
        int i8 = (i & 14) ^ 6;
        boolean z8 = true;
        boolean z9 = (i8 > 4 && composer.changed(transition)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Transition(new MutableTransitionState(t8), transition, transition.getLabel() + " > " + str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<T> transition2 = (Transition) objRememberedValue;
        if ((i8 <= 4 || !composer.changed(transition)) && (i & 6) != 4) {
            z8 = false;
        }
        boolean zChanged = composer.changed(transition2) | z8;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new InterfaceC6471c() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    transition.addTransition$animation_core_release(transition2);
                    final Transition<S> transition3 = transition;
                    final Transition<T> transition4 = transition2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition3.removeTransition$animation_core_release(transition4);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(transition2, (InterfaceC6471c) objRememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t8, t9, transition.getLastSeekedTimeNanos());
        } else {
            transition2.updateTarget$animation_core_release(t9);
            transition2.setSeeking$animation_core_release(false);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition2;
    }

    @Composable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(@NotNull final Transition<S> transition, @NotNull TwoWayConverter<T, V> twoWayConverter, @Nullable String str, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1714122528, i, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1731)");
        }
        int i9 = (i & 14) ^ 6;
        boolean z8 = true;
        boolean z9 = (i9 > 4 && composer.changed(transition)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = transition.new DeferredAnimation(twoWayConverter, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<S>.DeferredAnimation<T, V> deferredAnimation = (Transition.DeferredAnimation) objRememberedValue;
        if ((i9 <= 4 || !composer.changed(transition)) && (i & 6) != 4) {
            z8 = false;
        }
        boolean zChangedInstance = composer.changedInstance(deferredAnimation) | z8;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new InterfaceC6471c() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition<S> transition2 = transition;
                    final Transition<S>.DeferredAnimation<T, V> deferredAnimation2 = deferredAnimation;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.removeAnimation$animation_core_release(deferredAnimation2);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(deferredAnimation, (InterfaceC6471c) objRememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            deferredAnimation.setupSeeking$animation_core_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return deferredAnimation;
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(@NotNull final Transition<S> transition, T t8, T t9, @NotNull FiniteAnimationSpec<T> finiteAnimationSpec, @NotNull TwoWayConverter<T, V> twoWayConverter, @NotNull String str, @Nullable Composer composer, int i) {
        T t10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304821198, i, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1848)");
        }
        int i8 = i & 14;
        int i9 = i8 ^ 6;
        boolean z8 = true;
        boolean z9 = (i9 > 4 && composer.changed(transition)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            t10 = t9;
            Object transitionAnimationState = transition.new TransitionAnimationState(t8, AnimationStateKt.createZeroVectorFrom(twoWayConverter, t10), twoWayConverter, str);
            composer.updateRememberedValue(transitionAnimationState);
            objRememberedValue = transitionAnimationState;
        } else {
            t10 = t9;
        }
        final Transition.TransitionAnimationState transitionAnimationState2 = (Transition.TransitionAnimationState) objRememberedValue;
        int i10 = (i >> 3) & 8;
        int i11 = i << 3;
        UpdateInitialAndTargetValues(transition, transitionAnimationState2, t8, t10, finiteAnimationSpec, composer, (i10 << 9) | (i10 << 6) | i8 | (i11 & 896) | (i11 & 7168) | (57344 & i11));
        if ((i9 <= 4 || !composer.changed(transition)) && (i & 6) != 4) {
            z8 = false;
        }
        boolean zChanged = composer.changed(transitionAnimationState2) | z8;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new InterfaceC6471c() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    transition.addAnimation$animation_core_release(transitionAnimationState2);
                    final Transition<S> transition2 = transition;
                    final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState3 = transitionAnimationState2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.removeAnimation$animation_core_release(transitionAnimationState3);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(transitionAnimationState2, (InterfaceC6471c) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transitionAnimationState2;
    }

    @NotNull
    public static final SnapshotStateObserver getSeekableStateObserver() {
        return (SnapshotStateObserver) SeekableStateObserver$delegate.getValue();
    }

    @Composable
    @NotNull
    public static final <T> Transition<T> rememberTransition(@NotNull TransitionState<T> transitionState, @Nullable String str, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1643203617, i, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:803)");
        }
        int i9 = (i & 14) ^ 6;
        boolean z8 = true;
        boolean z9 = (i9 > 4 && composer.changed(transitionState)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Transition((TransitionState) transitionState, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<T> transition = (Transition) objRememberedValue;
        if (transitionState instanceof SeekableTransitionState) {
            composer.startReplaceGroup(1030829284);
            T currentState = transitionState.getCurrentState();
            T targetState = transitionState.getTargetState();
            if ((i9 <= 4 || !composer.changed(transitionState)) && (i & 6) != 4) {
                z8 = false;
            }
            Object objRememberedValue2 = composer.rememberedValue();
            if (z8 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new TransitionKt$rememberTransition$1$1(transitionState, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(currentState, targetState, (InterfaceC6473e) objRememberedValue2, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1031290843);
            transition.animateTo$animation_core_release(transitionState.getTargetState(), composer, 0);
            composer.endReplaceGroup();
        }
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new InterfaceC6471c() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.onDisposed$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.DisposableEffect(transition, (InterfaceC6471c) objRememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition;
    }

    @Composable
    @NotNull
    public static final <T> Transition<T> updateTransition(T t8, @Nullable String str, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2029166765, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:86)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Transition(t8, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<T> transition = (Transition) objRememberedValue;
        transition.animateTo$animation_core_release(t8, composer, (i & 8) | 48 | (i & 14));
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new InterfaceC6471c() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.onDisposed$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(transition, (InterfaceC6471c) objRememberedValue2, composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition;
    }

    @Deprecated(message = "Use rememberTransition() instead", replaceWith = @ReplaceWith(expression = "rememberTransition(transitionState, label)", imports = {}))
    @Composable
    @NotNull
    public static final <T> Transition<T> updateTransition(@NotNull MutableTransitionState<T> mutableTransitionState, @Nullable String str, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(882913843, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:856)");
        }
        Transition<T> transitionRememberTransition = rememberTransition(mutableTransitionState, str, composer, i & 126, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transitionRememberTransition;
    }
}
