package androidx.compose.foundation.gestures;

import android.support.v4.media.AbstractC0037f;
import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.AbstractC5774b;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6475g;

@Metadata(m5109d1 = {"\u0000À\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001ac\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010\u001ao\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0012\u001a[\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0013\u001ag\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0014\u001aX\u0010\u001e\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001526\u0010\u001d\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0016H\u0086\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a<\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\b\b\u0000\u0010\u0000*\u00020 2\u001d\u0010$\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\u0004\u0012\u00020\u001c0!¢\u0006\u0002\b#¢\u0006\u0004\b%\u0010&\u001a\u0095\u0001\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010'\u001a\u00028\u00002!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001a0!2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0,2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0.2#\b\u0002\u00101\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00040!H\u0007¢\u0006\u0004\b2\u00103\u001a£\u0001\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010'\u001a\u00028\u00002\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001a0!2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0,2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0.2#\b\u0002\u00101\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00040!H\u0007¢\u0006\u0004\b2\u00105\u001a(\u00107\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00106\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b7\u00108\u001aT\u0010=\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00109\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020:2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010<\u001a\u00028\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0,H\u0082@¢\u0006\u0004\b=\u0010>\u001a8\u0010=\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00106\u001a\u00028\u00002\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001a0,H\u0086@¢\u0006\u0004\b=\u0010@\u001aP\u0010A\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00106\u001a\u00028\u00002\u0006\u00109\u001a\u00020\u001a2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0,2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0.H\u0086@¢\u0006\u0004\bA\u0010B\u001a`\u0010D\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010C\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\u001a2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001a0!2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0*H\u0002¢\u0006\u0004\bD\u0010E\u001a\u001b\u0010G\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010F\u001a\u00020\u001aH\u0002¢\u0006\u0004\bG\u0010H\u001aH\u0010L\u001a\u00020\u001c\"\u0004\b\u0000\u0010I2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000*2\"\u0010\u001d\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0K\u0012\u0006\u0012\u0004\u0018\u00010 0\u0016H\u0082@¢\u0006\u0004\bL\u0010M\u001a\u001b\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000N\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\bO\u0010P\u001a\\\u0010T\u001a\u00020S\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010R\u001a\u00020Q2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001a0!2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0,H\u0000¢\u0006\u0004\bT\u0010U\u001aT\u0010W\u001a\u00020V\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001a0!2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0*H\u0002¢\u0006\u0004\bW\u0010X\u001a\u001e\u0010[\u001a\u00020\u001c2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0*H\u0082\b¢\u0006\u0004\b[\u0010\\\" \u0010^\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u00040!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_\" \u0010a\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u001a0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010_\"\u001a\u0010c\u001a\u00020b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0014\u0010g\u001a\u00020Y8\u0002X\u0082T¢\u0006\u0006\n\u0004\bg\u0010h\"\u0014\u0010i\u001a\u00020Y8\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010h\"\u0014\u0010j\u001a\u00020Y8\u0002X\u0082T¢\u0006\u0006\n\u0004\bj\u0010h\"\u0014\u0010k\u001a\u00020Y8\u0002X\u0082T¢\u0006\u0006\n\u0004\bk\u0010h\"\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u001a0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010m\"\u0014\u0010n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006p"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "state", "", "reverseDirection", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "anchoredDraggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/AnchoredDraggableState;ZLandroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;)Landroidx/compose/ui/Modifier;", "startDragImmediately", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/AnchoredDraggableState;ZLandroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/foundation/gestures/FlingBehavior;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/foundation/gestures/FlingBehavior;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "key", "", RequestParameters.POSITION, "Ld6/s;", "block", "forEach", "(Landroidx/compose/foundation/gestures/DraggableAnchors;Lr6/e;)V", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DraggableAnchorsConfig;", "Lkotlin/ExtensionFunctionType;", "builder", "DraggableAnchors", "(Lr6/c;)Landroidx/compose/foundation/gestures/DraggableAnchors;", "initialValue", "totalDistance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "newValue", "confirmValueChange", "AnchoredDraggableState", "(Ljava/lang/Object;Lr6/c;Lr6/a;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lr6/c;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "anchors", "(Ljava/lang/Object;Landroidx/compose/foundation/gestures/DraggableAnchors;Lr6/c;Lr6/a;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lr6/c;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "targetValue", "snapTo", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;", "velocity", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchoredDragScope", "latestTarget", "animateTo", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;FLandroidx/compose/foundation/gestures/AnchoredDragScope;Landroidx/compose/foundation/gestures/DraggableAnchors;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lh6/c;)Ljava/lang/Object;", "animationSpec", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lh6/c;)Ljava/lang/Object;", "animateToWithDecay", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;FLandroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lh6/c;)Ljava/lang/Object;", "currentOffset", "computeTarget", "(Landroidx/compose/foundation/gestures/DraggableAnchors;FFLr6/c;Lr6/a;)Ljava/lang/Object;", TypedValues.AttributesType.S_TARGET, "coerceToTarget", "(FF)F", "I", "inputs", "Lh6/c;", "restartable", "(Lr6/a;Lr6/e;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DefaultDraggableAnchors;", "emptyDraggableAnchors", "()Landroidx/compose/foundation/gestures/DefaultDraggableAnchors;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "anchoredDraggableFlingBehavior", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/ui/unit/Density;Lr6/c;Landroidx/compose/animation/core/AnimationSpec;)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "AnchoredDraggableLayoutInfoProvider", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Lr6/c;Lr6/a;)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "", "generateMsg", "debugLog", "(Lr6/a;)V", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "AlwaysDrag", "Lr6/c;", "", "GetOrNan", "Landroidx/compose/ui/unit/Dp;", "AnchoredDraggableMinFlingVelocity", "F", "getAnchoredDraggableMinFlingVelocity", "()F", "ConfigurationMovedToModifier", "Ljava/lang/String;", "SettleWithVelocityDeprecated", "StartDragImmediatelyDeprecated", "ConfirmValueChangeDeprecated", "NoOpDecayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "DEBUG", "Z", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1753:1\n1749#1,4:1755\n1#2:1754\n113#3:1759\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n*L\n1313#1:1755,4\n1655#1:1759\n*E\n"})
/* loaded from: classes.dex */
public final class AnchoredDraggableKt {

    @NotNull
    private static final String ConfigurationMovedToModifier = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to anchoredDraggableFlingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.";

    @NotNull
    private static final String ConfirmValueChangeDeprecated = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.";
    private static final boolean DEBUG = false;

    @NotNull
    private static final String SettleWithVelocityDeprecated = "settle does not accept a velocity anymore. Please use FlingBehavior#performFling instead. See AnchoredDraggableSamples.kt for example usages.";

    @NotNull
    private static final String StartDragImmediatelyDeprecated = "startDragImmediately has been removed without replacement. Modifier.anchoredDraggable sets startDragImmediately to true by default when animations are running.";

    @NotNull
    private static final InterfaceC6471c AlwaysDrag = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AlwaysDrag$1
        @Override // p152r6.InterfaceC6471c
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.TRUE;
        }
    };

    @NotNull
    private static final InterfaceC6471c GetOrNan = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$GetOrNan$1
        public final Float invoke(int i) {
            return Float.valueOf(Float.NaN);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    };
    private static final float AnchoredDraggableMinFlingVelocity = C2331Dp.m13305constructorimpl(125);

    @NotNull
    private static final DecayAnimationSpec<Float> NoOpDecayAnimationSpec = DecayAnimationSpecKt.generateDecayAnimationSpec(new FloatDecayAnimationSpec() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$NoOpDecayAnimationSpec$1
        private final float absVelocityThreshold;

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getAbsVelocityThreshold() {
            return this.absVelocityThreshold;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public long getDurationNanos(float initialValue, float initialVelocity) {
            return 0L;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getTargetValue(float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getValueFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getVelocityFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
            return 0.0f;
        }
    });

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "anchors", "latestTarget", "Ld6/s;", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {1344}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4 */
    public static final class C08194 extends SuspendLambda implements InterfaceC6475g {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08194(AnchoredDraggableState<T> anchoredDraggableState, AnimationSpec<Float> animationSpec, InterfaceC5631c<? super C08194> interfaceC5631c) {
            super(4, interfaceC5631c);
            this.$this_animateTo = anchoredDraggableState;
            this.$animationSpec = animationSpec;
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t8, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            C08194 c08194 = new C08194(this.$this_animateTo, this.$animationSpec, interfaceC5631c);
            c08194.L$0 = anchoredDragScope;
            c08194.L$1 = draggableAnchors;
            c08194.L$2 = t8;
            return c08194.invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$1;
                Object obj2 = this.L$2;
                AnchoredDraggableState<T> anchoredDraggableState = this.$this_animateTo;
                float lastVelocity = anchoredDraggableState.getLastVelocity();
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (AnchoredDraggableKt.animateTo(anchoredDraggableState, lastVelocity, anchoredDragScope, draggableAnchors, obj2, animationSpec, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (InterfaceC5631c<? super C5443s>) obj4);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", m5303f = "AnchoredDraggable.kt", m5304i = {0, 0}, m5305l = {1380}, m5306m = "animateToWithDecay", m5307n = {"remainingVelocity", "velocity"}, m5308s = {"L$0", "F$0"})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 */
    public static final class C08201<T> extends ContinuationImpl {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C08201(InterfaceC5631c<? super C08201> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.animateToWithDecay(null, null, 0.0f, null, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "anchors", "latestTarget", "Ld6/s;", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {1391, 1409, 1433}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    @SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2\n+ 2 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n*L\n1#1,1753:1\n1749#2,4:1754\n1749#2,4:1758\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2\n*L\n1396#1:1754,4\n1408#1:1758,4\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 */
    public static final class C08212 extends SuspendLambda implements InterfaceC6475g {
        final /* synthetic */ DecayAnimationSpec<Float> $decayAnimationSpec;
        final /* synthetic */ Ref$FloatRef $remainingVelocity;
        final /* synthetic */ AnimationSpec<Float> $snapAnimationSpec;
        final /* synthetic */ AnchoredDraggableState<T> $this_animateToWithDecay;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08212(AnchoredDraggableState<T> anchoredDraggableState, float f, AnimationSpec<Float> animationSpec, Ref$FloatRef ref$FloatRef, DecayAnimationSpec<Float> decayAnimationSpec, InterfaceC5631c<? super C08212> interfaceC5631c) {
            super(4, interfaceC5631c);
            this.$this_animateToWithDecay = anchoredDraggableState;
            this.$velocity = f;
            this.$snapAnimationSpec = animationSpec;
            this.$remainingVelocity = ref$FloatRef;
            this.$decayAnimationSpec = decayAnimationSpec;
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t8, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            C08212 c08212 = new C08212(this.$this_animateToWithDecay, this.$velocity, this.$snapAnimationSpec, this.$remainingVelocity, this.$decayAnimationSpec, interfaceC5631c);
            c08212.L$0 = anchoredDragScope;
            c08212.L$1 = draggableAnchors;
            c08212.L$2 = t8;
            return c08212.invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
        
            if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r1, r1, false, r3, r24, 2, null) != r7) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
        
            if (androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo(r0, r16, r2, r4, r5, r5, r24) != r7) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00eb, code lost:
        
            if (androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo(r0, r12, r0, r4, r5, r5, r24) == r7) goto L44;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 245
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.C08212.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (InterfaceC5631c<? super C5443s>) obj4);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {1543}, m5306m = "restartable", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 */
    public static final class C08221<I> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C08221(InterfaceC5631c<? super C08221> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.restartable(null, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"I", "Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {1545}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 */
    public static final class C08232 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6473e $block;
        final /* synthetic */ InterfaceC6469a $inputs;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"I", "latestInputs", "Ld6/s;", "emit", "(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC5912g {
            final /* synthetic */ InterfaceC6009v $$this$coroutineScope;
            final /* synthetic */ InterfaceC6473e $block;
            final /* synthetic */ Ref$ObjectRef<InterfaceC6013w0> $previousDrag;

            @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"I", "Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {1552}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ InterfaceC6009v $$this$coroutineScope;
                final /* synthetic */ InterfaceC6473e $block;
                final /* synthetic */ I $latestInputs;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(InterfaceC6473e interfaceC6473e, I i, InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$block = interfaceC6473e;
                    this.$latestInputs = i;
                    this.$$this$coroutineScope = interfaceC6009v;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC6473e interfaceC6473e = this.$block;
                        Object obj2 = this.$latestInputs;
                        this.label = 1;
                        if (interfaceC6473e.invoke(obj2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    AbstractC6014x.m5635f(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            public AnonymousClass1(Ref$ObjectRef<InterfaceC6013w0> ref$ObjectRef, InterfaceC6009v interfaceC6009v, InterfaceC6473e interfaceC6473e) {
                this.$previousDrag = ref$ObjectRef;
                this.$$this$coroutineScope = interfaceC6009v;
                this.$block = interfaceC6473e;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC5912g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(I r7, p075h6.InterfaceC5631c<? super p045d6.C5443s> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.result
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r7 = r0.L$2
                    kotlinx.coroutines.w0 r7 = (kotlinx.coroutines.InterfaceC6013w0) r7
                    java.lang.Object r7 = r0.L$1
                    java.lang.Object r0 = r0.L$0
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.C08232.AnonymousClass1) r0
                    kotlin.AbstractC5774b.m5119b(r8)
                    goto L5c
                L31:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L39:
                    kotlin.AbstractC5774b.m5119b(r8)
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.w0> r8 = r6.$previousDrag
                    T r8 = r8.element
                    kotlinx.coroutines.w0 r8 = (kotlinx.coroutines.InterfaceC6013w0) r8
                    if (r8 == 0) goto L5b
                    androidx.compose.foundation.gestures.AnchoredDragFinishedSignal r2 = new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal
                    r2.<init>()
                    r8.cancel(r2)
                    r0.L$0 = r6
                    r0.L$1 = r7
                    r0.L$2 = r8
                    r0.label = r3
                    java.lang.Object r8 = r8.mo5456e(r0)
                    if (r8 != r1) goto L5b
                    return r1
                L5b:
                    r0 = r6
                L5c:
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.w0> r8 = r0.$previousDrag
                    kotlinx.coroutines.v r1 = r0.$$this$coroutineScope
                    kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2 r4 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2
                    r6.e r0 = r0.$block
                    r5 = 0
                    r4.<init>(r0, r7, r1, r5)
                    kotlinx.coroutines.k1 r7 = kotlinx.coroutines.AbstractC6014x.m5651v(r1, r5, r2, r4, r3)
                    r8.element = r7
                    d6.s r7 = p045d6.C5443s.f8405a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.C08232.AnonymousClass1.emit(java.lang.Object, h6.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08232(InterfaceC6469a interfaceC6469a, InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super C08232> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$inputs = interfaceC6469a;
            this.$block = interfaceC6473e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C08232 c08232 = new C08232(this.$inputs, this.$block, interfaceC5631c);
            c08232.L$0 = obj;
            return c08232;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                InterfaceC5910f interfaceC5910fSnapshotFlow = SnapshotStateKt.snapshotFlow(this.$inputs);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, interfaceC6009v, this.$block);
                this.label = 1;
                if (interfaceC5910fSnapshotFlow.collect(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C08232) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "anchors", "latestTarget", "Ld6/s;", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2 */
    public static final class C08242 extends SuspendLambda implements InterfaceC6475g {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        public C08242(InterfaceC5631c<? super C08242> interfaceC5631c) {
            super(4, interfaceC5631c);
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t8, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            C08242 c08242 = new C08242(interfaceC5631c);
            c08242.L$0 = anchoredDragScope;
            c08242.L$1 = draggableAnchors;
            c08242.L$2 = t8;
            return c08242.invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (InterfaceC5631c<? super C5443s>) obj4);
        }
    }

    private static final <T> SnapLayoutInfoProvider AnchoredDraggableLayoutInfoProvider(final AnchoredDraggableState<T> anchoredDraggableState, final InterfaceC6471c interfaceC6471c, final InterfaceC6469a interfaceC6469a) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.AnchoredDraggableLayoutInfoProvider.1
            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float velocity, float decayOffset) {
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float velocity) {
                float fRequireOffset = anchoredDraggableState.requireOffset();
                return anchoredDraggableState.getAnchors().positionOf(AnchoredDraggableKt.computeTarget(anchoredDraggableState.getAnchors(), fRequireOffset, velocity, interfaceC6471c, interfaceC6469a)) - fRequireOffset;
            }
        };
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = ConfigurationMovedToModifier)
    @NotNull
    public static final <T> AnchoredDraggableState<T> AnchoredDraggableState(T t8, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6469a interfaceC6469a, @NotNull AnimationSpec<Float> animationSpec, @NotNull DecayAnimationSpec<Float> decayAnimationSpec, @NotNull InterfaceC6471c interfaceC6471c2) {
        AnchoredDraggableState<T> anchoredDraggableState = new AnchoredDraggableState<>(t8, interfaceC6471c2);
        anchoredDraggableState.setPositionalThreshold$foundation_release(interfaceC6471c);
        anchoredDraggableState.setVelocityThreshold$foundation_release(interfaceC6469a);
        anchoredDraggableState.setSnapAnimationSpec$foundation_release(animationSpec);
        anchoredDraggableState.setDecayAnimationSpec$foundation_release(decayAnimationSpec);
        return anchoredDraggableState;
    }

    public static /* synthetic */ AnchoredDraggableState AnchoredDraggableState$default(Object obj, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, InterfaceC6471c interfaceC6471c2, int i, Object obj2) {
        if ((i & 32) != 0) {
            interfaceC6471c2 = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.AnchoredDraggableState.1
                @Override // p152r6.InterfaceC6471c
                public final Boolean invoke(Object obj3) {
                    return Boolean.TRUE;
                }
            };
        }
        return AnchoredDraggableState(obj, interfaceC6471c, interfaceC6469a, animationSpec, decayAnimationSpec, interfaceC6471c2);
    }

    @NotNull
    public static final <T> DraggableAnchors<T> DraggableAnchors(@NotNull InterfaceC6471c interfaceC6471c) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        interfaceC6471c.invoke(draggableAnchorsConfig);
        return new DefaultDraggableAnchors(draggableAnchorsConfig.buildKeys$foundation_release(), draggableAnchorsConfig.buildPositions$foundation_release());
    }

    @NotNull
    public static final <T> Modifier anchoredDraggable(@NotNull Modifier modifier, @NotNull AnchoredDraggableState<T> anchoredDraggableState, boolean z8, @NotNull Orientation orientation, boolean z9, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable OverscrollEffect overscrollEffect, @Nullable FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z9, Boolean.valueOf(z8), mutableInteractionSource, null, overscrollEffect, flingBehavior, 32, null));
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, boolean z8, Orientation orientation, boolean z9, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, int i, Object obj) {
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        AnchoredDraggableState anchoredDraggableState2;
        boolean z10;
        Orientation orientation2;
        if ((i & 8) != 0) {
            z9 = true;
        }
        boolean z11 = z9;
        MutableInteractionSource mutableInteractionSource2 = (i & 16) != 0 ? null : mutableInteractionSource;
        OverscrollEffect overscrollEffect2 = (i & 32) != 0 ? null : overscrollEffect;
        if ((i & 64) != 0) {
            flingBehavior2 = null;
            anchoredDraggableState2 = anchoredDraggableState;
            z10 = z8;
            orientation2 = orientation;
            modifier2 = modifier;
        } else {
            flingBehavior2 = flingBehavior;
            modifier2 = modifier;
            anchoredDraggableState2 = anchoredDraggableState;
            z10 = z8;
            orientation2 = orientation;
        }
        return anchoredDraggable(modifier2, anchoredDraggableState2, z10, orientation2, z11, mutableInteractionSource2, overscrollEffect2, flingBehavior2);
    }

    @NotNull
    public static final <T> TargetedFlingBehavior anchoredDraggableFlingBehavior(@NotNull AnchoredDraggableState<T> anchoredDraggableState, @NotNull final Density density, @NotNull InterfaceC6471c interfaceC6471c, @NotNull AnimationSpec<Float> animationSpec) {
        return SnapFlingBehaviorKt.snapFlingBehavior(AnchoredDraggableLayoutInfoProvider(anchoredDraggableState, interfaceC6471c, new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.anchoredDraggableFlingBehavior.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Float invoke() {
                return Float.valueOf(density.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(125)));
            }
        }), NoOpDecayAnimationSpec, animationSpec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, float f, final AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t8, AnimationSpec<Float> animationSpec, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnimate;
        float fPositionOf = draggableAnchors.positionOf(t8);
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.element = Float.isNaN(anchoredDraggableState.getOffset()) ? 0.0f : anchoredDraggableState.getOffset();
        if (!Float.isNaN(fPositionOf)) {
            float f7 = ref$FloatRef.element;
            if (f7 != fPositionOf && (objAnimate = SuspendAnimationKt.animate(f7, fPositionOf, f, animationSpec, new InterfaceC6473e() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return C5443s.f8405a;
                }

                public final void invoke(float f8, float f9) {
                    anchoredDragScope.dragTo(f8, f9);
                    ref$FloatRef.element = f8;
                }
            }, interfaceC5631c)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objAnimate;
            }
        }
        return C5443s.f8405a;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, AnimationSpec animationSpec, InterfaceC5631c interfaceC5631c, int i, Object obj2) {
        if ((i & 2) != 0) {
            animationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation_release() ? anchoredDraggableState.getSnapAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
        }
        return animateTo(anchoredDraggableState, obj, animationSpec, interfaceC5631c);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object animateToWithDecay(@org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.AnchoredDraggableState<T> r10, T r11, float r12, @org.jetbrains.annotations.NotNull androidx.compose.animation.core.AnimationSpec<java.lang.Float> r13, @org.jetbrains.annotations.NotNull androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r14, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super java.lang.Float> r15) {
        /*
            boolean r1 = r15 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt.C08201
            if (r1 == 0) goto L14
            r1 = r15
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r1 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.C08201) r1
            int r3 = r1.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L14
            int r3 = r3 - r4
            r1.label = r3
        L12:
            r7 = r1
            goto L1a
        L14:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r1 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1
            r1.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r0 = r7.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r8 = 1
            if (r1 == 0) goto L37
            if (r1 != r8) goto L2f
            float r1 = r7.F$0
            java.lang.Object r2 = r7.L$0
            kotlin.jvm.internal.Ref$FloatRef r2 = (kotlin.jvm.internal.Ref$FloatRef) r2
            kotlin.AbstractC5774b.m5119b(r0)
            goto L62
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            kotlin.AbstractC5774b.m5119b(r0)
            kotlin.jvm.internal.Ref$FloatRef r4 = new kotlin.jvm.internal.Ref$FloatRef
            r4.<init>()
            r4.element = r12
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2
            r6 = 0
            r1 = r10
            r2 = r12
            r3 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r5 = r0
            r0 = r4
            r7.L$0 = r0
            r7.F$0 = r12
            r7.label = r8
            r4 = 0
            r6 = r7
            r7 = 2
            r8 = 0
            r2 = r10
            r3 = r11
            java.lang.Object r2 = androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(r2, r3, r4, r5, r6, r7, r8)
            if (r2 != r9) goto L60
            return r9
        L60:
            r1 = r12
            r2 = r0
        L62:
            float r0 = r2.element
            float r1 = r1 - r0
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.animateToWithDecay(androidx.compose.foundation.gestures.AnchoredDraggableState, java.lang.Object, float, androidx.compose.animation.core.AnimationSpec, androidx.compose.animation.core.DecayAnimationSpec, h6.c):java.lang.Object");
    }

    public static /* synthetic */ Object animateToWithDecay$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, InterfaceC5631c interfaceC5631c, int i, Object obj2) {
        if ((i & 4) != 0) {
            animationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation_release() ? anchoredDraggableState.getSnapAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i & 8) != 0) {
            decayAnimationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation_release() ? anchoredDraggableState.getDecayAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getDecayAnimationSpec();
        }
        return animateToWithDecay(anchoredDraggableState, obj, f, animationSpec2, decayAnimationSpec, interfaceC5631c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f, float f7) {
        if (f7 == 0.0f) {
            return 0.0f;
        }
        return (f7 <= 0.0f ? f >= f7 : f <= f7) ? f : f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T computeTarget(androidx.compose.foundation.gestures.DraggableAnchors<T> r5, float r6, float r7, p152r6.InterfaceC6471c r8, p152r6.InterfaceC6469a r9) {
        /*
            boolean r0 = java.lang.Float.isNaN(r6)
            if (r0 != 0) goto L92
            float r0 = java.lang.Math.abs(r7)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r0 <= 0) goto L13
            r0 = r3
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L1c
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1c
            r1 = r3
            goto L1d
        L1c:
            r1 = r2
        L1d:
            if (r0 != 0) goto L27
            java.lang.Object r5 = r5.closestAnchor(r6)
            kotlin.jvm.internal.AbstractC5830k.m5327d(r5)
            return r5
        L27:
            float r7 = java.lang.Math.abs(r7)
            java.lang.Object r9 = r9.invoke()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r9 = java.lang.Math.abs(r9)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L45
            java.lang.Object r5 = r5.closestAnchor(r6, r1)
            kotlin.jvm.internal.AbstractC5830k.m5327d(r5)
            return r5
        L45:
            java.lang.Object r7 = r5.closestAnchor(r6, r2)
            kotlin.jvm.internal.AbstractC5830k.m5327d(r7)
            float r9 = r5.positionOf(r7)
            java.lang.Object r0 = r5.closestAnchor(r6, r3)
            kotlin.jvm.internal.AbstractC5830k.m5327d(r0)
            float r5 = r5.positionOf(r0)
            float r4 = r9 - r5
            float r4 = java.lang.Math.abs(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object r8 = r8.invoke(r4)
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r8 = java.lang.Math.abs(r8)
            if (r1 == 0) goto L76
            goto L77
        L76:
            r9 = r5
        L77:
            float r9 = r9 - r6
            float r5 = java.lang.Math.abs(r9)
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 < 0) goto L81
            r2 = r3
        L81:
            if (r2 != r3) goto L86
            if (r1 == 0) goto L8a
            goto L8b
        L86:
            if (r2 != 0) goto L8c
            if (r1 == 0) goto L8b
        L8a:
            return r7
        L8b:
            return r0
        L8c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L92:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The offset provided to computeTarget must not be NaN."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.computeTarget(androidx.compose.foundation.gestures.DraggableAnchors, float, float, r6.c, r6.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> DefaultDraggableAnchors<T> emptyDraggableAnchors() {
        return new DefaultDraggableAnchors<>(EmptyList.INSTANCE, new float[0]);
    }

    public static final <T> void forEach(@NotNull DraggableAnchors<T> draggableAnchors, @NotNull InterfaceC6473e interfaceC6473e) {
        int size = draggableAnchors.getSize();
        for (int i = 0; i < size; i++) {
            T tAnchorAt = draggableAnchors.anchorAt(i);
            if (tAnchorAt == null) {
                throw new IllegalArgumentException(AbstractC0037f.m82g(i, "There was no key at index ", ". Please report a bug.").toString());
            }
            interfaceC6473e.invoke(tAnchorAt, Float.valueOf(draggableAnchors.positionAt(i)));
        }
    }

    public static final float getAnchoredDraggableMinFlingVelocity() {
        return AnchoredDraggableMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object restartable(p152r6.InterfaceC6469a r4, p152r6.InterfaceC6473e r5, p075h6.InterfaceC5631c<? super p045d6.C5443s> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt.C08221
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.C08221) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.AbstractC5774b.m5119b(r6)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.AbstractC5774b.m5119b(r6)
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            r0.label = r3     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            java.lang.Object r4 = kotlinx.coroutines.AbstractC6014x.m5637h(r6, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            if (r4 != r1) goto L41
            return r1
        L41:
            d6.s r4 = p045d6.C5443s.f8405a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.restartable(r6.a, r6.e, h6.c):java.lang.Object");
    }

    @Nullable
    public static final <T> Object snapTo(@NotNull AnchoredDraggableState<T> anchoredDraggableState, T t8, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t8, null, new C08242(null), interfaceC5631c, 2, null);
        return objAnchoredDrag$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnchoredDrag$default : C5443s.f8405a;
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, boolean z8, Orientation orientation, boolean z9, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z10, FlingBehavior flingBehavior, int i, Object obj) {
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        AnchoredDraggableState anchoredDraggableState2;
        boolean z11;
        Orientation orientation2;
        if ((i & 8) != 0) {
            z9 = true;
        }
        boolean z12 = z9;
        MutableInteractionSource mutableInteractionSource2 = (i & 16) != 0 ? null : mutableInteractionSource;
        OverscrollEffect overscrollEffect2 = (i & 32) != 0 ? null : overscrollEffect;
        boolean zIsAnimationRunning = (i & 64) != 0 ? anchoredDraggableState.isAnimationRunning() : z10;
        if ((i & 128) != 0) {
            flingBehavior2 = null;
            modifier2 = modifier;
            z11 = z8;
            orientation2 = orientation;
            anchoredDraggableState2 = anchoredDraggableState;
        } else {
            flingBehavior2 = flingBehavior;
            modifier2 = modifier;
            anchoredDraggableState2 = anchoredDraggableState;
            z11 = z8;
            orientation2 = orientation;
        }
        return anchoredDraggable(modifier2, anchoredDraggableState2, z11, orientation2, z12, mutableInteractionSource2, overscrollEffect2, zIsAnimationRunning, flingBehavior2);
    }

    public static /* synthetic */ AnchoredDraggableState AnchoredDraggableState$default(Object obj, DraggableAnchors draggableAnchors, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, InterfaceC6471c interfaceC6471c2, int i, Object obj2) {
        if ((i & 64) != 0) {
            interfaceC6471c2 = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.AnchoredDraggableState.3
                @Override // p152r6.InterfaceC6471c
                public final Boolean invoke(Object obj3) {
                    return Boolean.TRUE;
                }
            };
        }
        return AnchoredDraggableState(obj, draggableAnchors, interfaceC6471c, interfaceC6469a, animationSpec, decayAnimationSpec, interfaceC6471c2);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z8, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, int i, Object obj) {
        if ((i & 4) != 0) {
            z8 = true;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z8, (i & 8) != 0 ? null : mutableInteractionSource, (i & 16) != 0 ? null : overscrollEffect, (i & 32) != 0 ? null : flingBehavior);
    }

    @Deprecated(message = StartDragImmediatelyDeprecated)
    @NotNull
    public static final <T> Modifier anchoredDraggable(@NotNull Modifier modifier, @NotNull AnchoredDraggableState<T> anchoredDraggableState, boolean z8, @NotNull Orientation orientation, boolean z9, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable OverscrollEffect overscrollEffect, boolean z10, @Nullable FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z9, Boolean.valueOf(z8), mutableInteractionSource, Boolean.valueOf(z10), overscrollEffect, flingBehavior));
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z8, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z9, FlingBehavior flingBehavior, int i, Object obj) {
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        AnchoredDraggableState anchoredDraggableState2;
        Orientation orientation2;
        if ((i & 4) != 0) {
            z8 = true;
        }
        boolean z10 = z8;
        MutableInteractionSource mutableInteractionSource2 = (i & 8) != 0 ? null : mutableInteractionSource;
        OverscrollEffect overscrollEffect2 = (i & 16) != 0 ? null : overscrollEffect;
        if ((i & 32) != 0) {
            z9 = anchoredDraggableState.isAnimationRunning();
        }
        boolean z11 = z9;
        if ((i & 64) != 0) {
            flingBehavior2 = null;
            anchoredDraggableState2 = anchoredDraggableState;
            orientation2 = orientation;
            modifier2 = modifier;
        } else {
            flingBehavior2 = flingBehavior;
            modifier2 = modifier;
            anchoredDraggableState2 = anchoredDraggableState;
            orientation2 = orientation;
        }
        return anchoredDraggable(modifier2, anchoredDraggableState2, orientation2, z10, mutableInteractionSource2, overscrollEffect2, z11, flingBehavior2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = ConfigurationMovedToModifier)
    @NotNull
    public static final <T> AnchoredDraggableState<T> AnchoredDraggableState(T t8, @NotNull DraggableAnchors<T> draggableAnchors, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6469a interfaceC6469a, @NotNull AnimationSpec<Float> animationSpec, @NotNull DecayAnimationSpec<Float> decayAnimationSpec, @NotNull InterfaceC6471c interfaceC6471c2) {
        AnchoredDraggableState<T> anchoredDraggableState = new AnchoredDraggableState<>(t8, draggableAnchors, interfaceC6471c2);
        anchoredDraggableState.setPositionalThreshold$foundation_release(interfaceC6471c);
        anchoredDraggableState.setVelocityThreshold$foundation_release(interfaceC6469a);
        anchoredDraggableState.setSnapAnimationSpec$foundation_release(animationSpec);
        anchoredDraggableState.setDecayAnimationSpec$foundation_release(decayAnimationSpec);
        return anchoredDraggableState;
    }

    @Nullable
    public static final <T> Object animateTo(@NotNull AnchoredDraggableState<T> anchoredDraggableState, T t8, @NotNull AnimationSpec<Float> animationSpec, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t8, null, new C08194(anchoredDraggableState, animationSpec, null), interfaceC5631c, 2, null);
        return objAnchoredDrag$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnchoredDrag$default : C5443s.f8405a;
    }

    @NotNull
    public static final <T> Modifier anchoredDraggable(@NotNull Modifier modifier, @NotNull AnchoredDraggableState<T> anchoredDraggableState, @NotNull Orientation orientation, boolean z8, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable OverscrollEffect overscrollEffect, @Nullable FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z8, null, mutableInteractionSource, null, overscrollEffect, flingBehavior, 32, null));
    }

    @Deprecated(message = StartDragImmediatelyDeprecated)
    @NotNull
    public static final <T> Modifier anchoredDraggable(@NotNull Modifier modifier, @NotNull AnchoredDraggableState<T> anchoredDraggableState, @NotNull Orientation orientation, boolean z8, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable OverscrollEffect overscrollEffect, boolean z9, @Nullable FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z8, null, mutableInteractionSource, Boolean.valueOf(z9), overscrollEffect, flingBehavior));
    }

    private static final void debugLog(InterfaceC6469a interfaceC6469a) {
    }
}
