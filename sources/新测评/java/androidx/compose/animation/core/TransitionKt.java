package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.TransitionAnimationState;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
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
import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u001b\u001a\u0002H\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u001c\u001a3\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u001d2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u001e\u001ai\u0010\u001f\u001a\u00020\u0011\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014\"\b\b\u0002\u0010!*\u00020\"*\b\u0012\u0004\u0012\u0002H 0\u00132\u001c\u0010#\u001a\u0018\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0$R\b\u0012\u0004\u0012\u0002H 0\u00132\u0006\u0010%\u001a\u0002H\u00142\u0006\u0010&\u001a\u0002H\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00140(H\u0003¢\u0006\u0002\u0010)\u001a\u0082\u0001\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020,0\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u00107\u001a\b\u0012\u0004\u0012\u00020\u00010+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u00108\u001a\b\u0012\u0004\u0012\u0002090+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u0002090(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u0002090\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u0010:\u001a\b\u0012\u0004\u0012\u00020;0+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020;0\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u0010<\u001a\b\u0012\u0004\u0012\u00020=0+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020=0\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u0010>\u001a\b\u0012\u0004\u0012\u00020?0+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020?0\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u0010@\u001a\b\u0012\u0004\u0012\u00020A0+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020A0\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a¦\u0001\u0010B\u001a\b\u0012\u0004\u0012\u0002H\u00140+\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014\"\b\b\u0002\u0010!*\u00020\"*\b\u0012\u0004\u0012\u0002H 0\u00132\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0D2*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u0002H\u00140\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u0010E\u001a\\\u0010F\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u0002H 0\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u0010G\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H\u00140\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u0010I\u001aA\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u0002H 0\u00132\u0006\u0010K\u001a\u0002H\u00142\u0006\u0010\u001b\u001a\u0002H\u00142\u0006\u0010L\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010M\u001aa\u0010N\u001a\u0018\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0OR\b\u0012\u0004\u0012\u0002H 0\u0013\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014\"\b\b\u0002\u0010!*\u00020\"*\b\u0012\u0004\u0012\u0002H 0\u00132\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0D2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010P\u001am\u0010Q\u001a\b\u0012\u0004\u0012\u0002H\u00140+\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014\"\b\b\u0002\u0010!*\u00020\"*\b\u0012\u0004\u0012\u0002H 0\u00132\u0006\u0010%\u001a\u0002H\u00142\u0006\u0010&\u001a\u0002H\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00140(2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0D2\u0006\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010R\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u001b\u0010\b\u001a\u00020\t8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\"\u001e\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, m13558d2 = {"AnimationDebugDurationScale", "", "NoReset", "", "ResetAnimationSnap", "ResetAnimationSnapCurrent", "ResetAnimationSnapTarget", "ResetNoSnap", "SeekableStateObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getSeekableStateObserver", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SeekableStateObserver$delegate", "Lkotlin/Lazy;", "SeekableTransitionStateTotalDurationChanged", "Lkotlin/Function1;", "Landroidx/compose/animation/core/SeekableTransitionState;", "", "rememberTransition", "Landroidx/compose/animation/core/Transition;", ExifInterface.GPS_DIRECTION_TRUE, "transitionState", "Landroidx/compose/animation/core/TransitionState;", "label", "", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "updateTransition", "targetState", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "UpdateInitialAndTargetValues", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "transitionAnimation", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)V", "animateDp", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "transitionSpec", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "state", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloat", "animateInt", "animateIntOffset", "Landroidx/compose/ui/unit/IntOffset;", "animateIntSize", "Landroidx/compose/ui/unit/IntSize;", "animateOffset", "Landroidx/compose/ui/geometry/Offset;", "animateRect", "Landroidx/compose/ui/geometry/Rect;", "animateSize", "Landroidx/compose/ui/geometry/Size;", "animateValue", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "createChildTransition", "transformToChildState", "parentState", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "createChildTransitionInternal", "initialState", "childLabel", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;", "createDeferredAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;", "createTransitionAnimation", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation-core_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2141:1\n1832#1,7:2214\n1832#1,7:2221\n1832#1,7:2228\n1832#1,7:2235\n1832#1,7:2242\n1832#1,7:2249\n1832#1,7:2256\n1832#1,7:2263\n1247#2,6:2142\n1247#2,6:2148\n1247#2,6:2154\n1247#2,6:2160\n1247#2,6:2166\n1247#2,6:2172\n1247#2,6:2178\n1247#2,6:2184\n1247#2,6:2190\n1247#2,6:2196\n1247#2,6:2202\n1247#2,6:2208\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1925#1:2214,7\n1955#1:2221,7\n1985#1:2228,7\n2015#1:2235,7\n2049#1:2242,7\n2079#1:2249,7\n2110#1:2256,7\n2140#1:2263,7\n88#1:2142,6\n90#1:2148,6\n806#1:2154,6\n808#1:2160,6\n819#1:2166,6\n1733#1:2172,6\n1734#1:2178,6\n1762#1:2184,6\n1776#1:2190,6\n1780#1:2196,6\n1851#1:2202,6\n1865#1:2208,6\n*E\n"})
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;
    private static final float NoReset = -1.0f;
    private static final float ResetAnimationSnap = -3.0f;
    private static final float ResetAnimationSnapCurrent = -4.0f;
    private static final float ResetAnimationSnapTarget = -5.0f;
    private static final float ResetNoSnap = -2.0f;
    private static final Function1<SeekableTransitionState<?>, Unit> SeekableTransitionStateTotalDurationChanged = new Function1<SeekableTransitionState<?>, Unit>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableTransitionStateTotalDurationChanged$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SeekableTransitionState<?> seekableTransitionState) {
            invoke2(seekableTransitionState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SeekableTransitionState<?> seekableTransitionState) {
            seekableTransitionState.onTotalDurationChanged$animation_core_release();
        }
    };
    private static final Lazy SeekableStateObserver$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<SnapshotStateObserver>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SnapshotStateObserver invoke() {
            SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new Function1<Function0<? extends Unit>, Unit>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
                    invoke2((Function0<Unit>) function0);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Function0<Unit> function0) {
                    function0.invoke();
                }
            });
            snapshotStateObserver.start();
            return snapshotStateObserver;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final <S, T, V extends AnimationVector> void UpdateInitialAndTargetValues(final Transition<S> transition, final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, final T t10, final T t11, final FiniteAnimationSpec<T> finiteAnimationSpec, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(867041821);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(transition) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(transitionAnimationState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.changed(t10) : composerStartRestartGroup.changedInstance(t10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? composerStartRestartGroup.changed(t11) : composerStartRestartGroup.changedInstance(t11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (32768 & i10) == 0 ? composerStartRestartGroup.changed(finiteAnimationSpec) : composerStartRestartGroup.changedInstance(finiteAnimationSpec) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 9363) != 9362, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(867041821, i11, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1880)");
            }
            if (transition.isSeeking()) {
                transitionAnimationState.updateInitialAndTargetValue$animation_core_release(t10, t11, finiteAnimationSpec);
            } else {
                transitionAnimationState.updateTargetValue$animation_core_release(t11, finiteAnimationSpec);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.core.TransitionKt.UpdateInitialAndTargetValues.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    TransitionKt.UpdateInitialAndTargetValues(transition, transitionAnimationState, t10, t11, finiteAnimationSpec, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<C3127Dp> animateDp(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<C3127Dp>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, C3127Dp> function32, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<C3127Dp>>() { // from class: androidx.compose.animation.core.TransitionKt.animateDp.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<C3127Dp> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<C3127Dp> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(-575880366);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-575880366, i12, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1950)");
                    }
                    SpringSpec<C3127Dp> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, C3127Dp.m23559boximpl(VisibilityThresholdsKt.getVisibilityThreshold(C3127Dp.INSTANCE)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(C3127Dp.INSTANCE), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Float> animateFloat(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, Float> function32, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Float>>() { // from class: androidx.compose.animation.core.TransitionKt.animateFloat.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<Float> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(-522164544);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-522164544, i12, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1920)");
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
        if ((i11 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Integer> animateInt(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Integer>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, Integer> function32, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Integer>>() { // from class: androidx.compose.animation.core.TransitionKt.animateInt.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Integer> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<Integer> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(-785273069);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-785273069, i12, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:2074)");
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
        if ((i11 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<IntOffset> animateIntOffset(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntOffset>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, IntOffset> function32, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntOffset>>() { // from class: androidx.compose.animation.core.TransitionKt.animateIntOffset.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<IntOffset> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<IntOffset> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(-1953479610);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1953479610, i12, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:2043)");
                    }
                    long j10 = 1;
                    SpringSpec<IntOffset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m23680boximpl(IntOffset.m23683constructorimpl((j10 & 4294967295L) | (j10 << 32))), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<IntSize> animateIntSize(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntSize>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, IntSize> function32, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.core.TransitionKt.animateIntSize.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<IntSize> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(967893300);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(967893300, i12, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:2105)");
                    }
                    long j10 = 1;
                    SpringSpec<IntSize> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m23724boximpl(IntSize.m23727constructorimpl((j10 & 4294967295L) | (j10 << 32))), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Offset> animateOffset(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Offset>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, Offset> function32, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Offset>>() { // from class: androidx.compose.animation.core.TransitionKt.animateOffset.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Offset> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<Offset> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(1623385561);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1623385561, i12, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:1980)");
                    }
                    SpringSpec<Offset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m20724boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.INSTANCE)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(Offset.INSTANCE), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Rect> animateRect(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Rect>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, Rect> function32, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Rect>>() { // from class: androidx.compose.animation.core.TransitionKt.animateRect.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Rect> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<Rect> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(691336298);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(691336298, i12, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:2135)");
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
        if ((i11 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(Rect.INSTANCE), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Size> animateSize(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Size>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, Size> function32, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Size>>() { // from class: androidx.compose.animation.core.TransitionKt.animateSize.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Size> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<Size> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(-1607152761);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1607152761, i12, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:2010)");
                    }
                    SpringSpec<Size> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m20792boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.INSTANCE)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(Size.INSTANCE), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S, T, V extends AnimationVector> State<T> animateValue(Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<T>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, ? extends T> function32, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<T>>() { // from class: androidx.compose.animation.core.TransitionKt.animateValue.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<T> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(-895531546);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-895531546, i12, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1827)");
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
        if ((i11 & 4) != 0) {
            str = "ValueAnimation";
        }
        int i12 = (i10 >> 9) & 112;
        return createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i12)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i12)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i10 >> 3) & 112)), twoWayConverter, str, composer, (i10 & 14) | (57344 & (i10 << 9)) | ((i10 << 6) & 458752));
    }

    @ExperimentalTransitionApi
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <S, T> Transition<T> createChildTransition(Transition<S> transition, String str, Function3<? super S, ? super Composer, ? super Integer, ? extends T> function3, Composer composer, int i10, int i11) {
        boolean z9 = true;
        if ((i11 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i12 = i10 & 14;
        if (((i12 ^ 6) <= 4 || !composer.changed(transition)) && (i10 & 6) != 4) {
            z9 = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = transition.getCurrentState();
            composer.updateRememberedValue(objRememberedValue);
        }
        if (transition.isSeeking()) {
            objRememberedValue = transition.getCurrentState();
        }
        int i13 = (i10 >> 3) & 112;
        return createChildTransitionInternal(transition, function3.invoke(objRememberedValue, composer, Integer.valueOf(i13)), function3.invoke(transition.getTargetState(), composer, Integer.valueOf(i13)), str2, composer, i12 | ((i10 << 6) & 7168));
    }

    @Composable
    @PublishedApi
    public static final <S, T> Transition<T> createChildTransitionInternal(final Transition<S> transition, T t10, T t11, String str, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198307638, i10, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1773)");
        }
        int i11 = (i10 & 14) ^ 6;
        boolean z9 = true;
        boolean z10 = (i11 > 4 && composer.changed(transition)) || (i10 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Transition(new MutableTransitionState(t10), transition, transition.getLabel() + " > " + str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<T> transition2 = (Transition) objRememberedValue;
        if ((i11 <= 4 || !composer.changed(transition)) && (i10 & 6) != 4) {
            z9 = false;
        }
        boolean zChanged = composer.changed(transition2) | z9;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
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
        EffectsKt.DisposableEffect(transition2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t10, t11, transition.getLastSeekedTimeNanos());
        } else {
            transition2.updateTarget$animation_core_release(t11);
            transition2.setSeeking$animation_core_release(false);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition2;
    }

    @Composable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(final Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, String str, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1714122528, i10, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1731)");
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z9 = true;
        boolean z10 = (i12 > 4 && composer.changed(transition)) || (i10 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = transition.new DeferredAnimation(twoWayConverter, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<S>.DeferredAnimation<T, V> deferredAnimation = (Transition.DeferredAnimation) objRememberedValue;
        if ((i12 <= 4 || !composer.changed(transition)) && (i10 & 6) != 4) {
            z9 = false;
        }
        boolean zChangedInstance = composer.changedInstance(deferredAnimation) | z9;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
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
        EffectsKt.DisposableEffect(deferredAnimation, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
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
    public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(final Transition<S> transition, T t10, T t11, FiniteAnimationSpec<T> finiteAnimationSpec, TwoWayConverter<T, V> twoWayConverter, String str, Composer composer, int i10) {
        T t12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304821198, i10, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1848)");
        }
        int i11 = i10 & 14;
        int i12 = i11 ^ 6;
        boolean z9 = true;
        boolean z10 = (i12 > 4 && composer.changed(transition)) || (i10 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            t12 = t11;
            Object transitionAnimationState = transition.new TransitionAnimationState(t10, AnimationStateKt.createZeroVectorFrom(twoWayConverter, t12), twoWayConverter, str);
            composer.updateRememberedValue(transitionAnimationState);
            objRememberedValue = transitionAnimationState;
        } else {
            t12 = t11;
        }
        final Transition.TransitionAnimationState transitionAnimationState2 = (Transition.TransitionAnimationState) objRememberedValue;
        int i13 = (i10 >> 3) & 8;
        int i14 = i10 << 3;
        UpdateInitialAndTargetValues(transition, transitionAnimationState2, t10, t12, finiteAnimationSpec, composer, (i13 << 9) | (i13 << 6) | i11 | (i14 & 896) | (i14 & 7168) | (57344 & i14));
        if ((i12 <= 4 || !composer.changed(transition)) && (i10 & 6) != 4) {
            z9 = false;
        }
        boolean zChanged = composer.changed(transitionAnimationState2) | z9;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
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
        EffectsKt.DisposableEffect(transitionAnimationState2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transitionAnimationState2;
    }

    public static final SnapshotStateObserver getSeekableStateObserver() {
        return (SnapshotStateObserver) SeekableStateObserver$delegate.getValue();
    }

    @Composable
    public static final <T> Transition<T> rememberTransition(TransitionState<T> transitionState, String str, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1643203617, i10, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:803)");
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z9 = true;
        boolean z10 = (i12 > 4 && composer.changed(transitionState)) || (i10 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Transition((TransitionState) transitionState, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<T> transition = (Transition) objRememberedValue;
        if (transitionState instanceof SeekableTransitionState) {
            composer.startReplaceGroup(1030829284);
            T currentState = transitionState.getCurrentState();
            T targetState = transitionState.getTargetState();
            if ((i12 <= 4 || !composer.changed(transitionState)) && (i10 & 6) != 4) {
                z9 = false;
            }
            Object objRememberedValue2 = composer.rememberedValue();
            if (z9 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new TransitionKt$rememberTransition$1$1(transitionState, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(currentState, targetState, (Function2) objRememberedValue2, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1031290843);
            transition.animateTo$animation_core_release(transitionState.getTargetState(), composer, 0);
            composer.endReplaceGroup();
        }
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
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
        EffectsKt.DisposableEffect(transition, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition;
    }

    @Composable
    public static final <T> Transition<T> updateTransition(T t10, String str, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2029166765, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:86)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Transition(t10, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<T> transition = (Transition) objRememberedValue;
        transition.animateTo$animation_core_release(t10, composer, (i10 & 8) | 48 | (i10 & 14));
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
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
        EffectsKt.DisposableEffect(transition, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition;
    }

    @Deprecated(message = "Use rememberTransition() instead", replaceWith = @ReplaceWith(expression = "rememberTransition(transitionState, label)", imports = {}))
    @Composable
    public static final <T> Transition<T> updateTransition(MutableTransitionState<T> mutableTransitionState, String str, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(882913843, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:856)");
        }
        Transition<T> transitionRememberTransition = rememberTransition(mutableTransitionState, str, composer, i10 & 126, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transitionRememberTransition;
    }
}
