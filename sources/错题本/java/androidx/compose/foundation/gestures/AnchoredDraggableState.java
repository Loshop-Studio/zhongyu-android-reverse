package androidx.compose.foundation.gestures;

import androidx.annotation.FloatRange;
import androidx.autofill.HintConstants;
import androidx.camera.video.AudioStats;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p152r6.InterfaceC6475g;

@Metadata(m5109d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\b\n*\u0001~\b\u0007\u0018\u0000 \u0086\u0001*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0086\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0004\u0010\bB4\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u0004\u0010\u000fBD\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u0004\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\b\u0002\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001f\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dH\u0086@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u001f\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011H\u0087@¢\u0006\u0004\b\u001f\u0010\"J^\u0010*\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020#2B\u0010)\u001a>\b\u0001\u0012\u0004\u0012\u00020&\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020%¢\u0006\u0002\b(H\u0086@¢\u0006\u0004\b*\u0010+J{\u0010*\u001a\u00020\u001a2\u0006\u0010,\u001a\u00028\u00002\b\b\u0002\u0010$\u001a\u00020#2W\u0010)\u001aS\b\u0001\u0012\u0004\u0012\u00020&\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(.\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020-¢\u0006\u0002\b(H\u0086@¢\u0006\u0004\b*\u0010/J\u0017\u00103\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0000¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011¢\u0006\u0004\b4\u00102J\u0017\u00105\u001a\u00020\r2\u0006\u0010,\u001a\u00028\u0000H\u0002¢\u0006\u0004\b5\u00106R=\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R=\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u00110\t8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R(\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110@8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR<\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d8\u0006@@X\u0087.¢\u0006\u0018\n\u0004\bH\u0010I\u0012\u0004\bN\u0010O\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR<\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00110P2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00110P8\u0006@@X\u0087.¢\u0006\u0018\n\u0004\bQ\u0010R\u0012\u0004\bW\u0010O\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR+\u0010`\u001a\u00028\u00002\u0006\u0010G\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010\u0005R+\u0010d\u001a\u00028\u00002\u0006\u0010G\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010\\\u001a\u0004\bb\u0010^\"\u0004\bc\u0010\u0005R\u001b\u0010,\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010^R+\u0010m\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\u00118F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010\u0013\"\u0004\bk\u0010lR!\u0010\u0016\u001a\u00020\u00118GX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bn\u0010f\u0012\u0004\bp\u0010O\u001a\u0004\bo\u0010\u0013R+\u0010t\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\u00118F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bq\u0010i\u001a\u0004\br\u0010\u0013\"\u0004\bs\u0010lR/\u0010x\u001a\u0004\u0018\u00018\u00002\b\u0010G\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bu\u0010\\\u001a\u0004\bv\u0010^\"\u0004\bw\u0010\u0005R7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010\\\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001b\u0010\u007f\u001a\b\u0012\u0004\u0012\u00028\u00000~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001e\u0010\u0084\u0001\u001a\u00020\r8@X\u0080\u0004¢\u0006\u000f\u0012\u0005\b\u0083\u0001\u0010O\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0014\u0010\u0085\u0001\u001a\u00020\r8F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0082\u0001¨\u0006\u0087\u0001"}, m5110d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState;", ExifInterface.GPS_DIRECTION_TRUE, "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "anchors", "(Ljava/lang/Object;Landroidx/compose/foundation/gestures/DraggableAnchors;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "newValue", "", "confirmValueChange", "(Ljava/lang/Object;Lr6/c;)V", "(Ljava/lang/Object;Landroidx/compose/foundation/gestures/DraggableAnchors;Lr6/c;)V", "", "requireOffset", "()F", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "progress", "(Ljava/lang/Object;Ljava/lang/Object;)F", "newAnchors", "newTarget", "Ld6/s;", "updateAnchors", "(Landroidx/compose/foundation/gestures/DraggableAnchors;Ljava/lang/Object;)V", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "settle", "(Landroidx/compose/animation/core/AnimationSpec;Lh6/c;)Ljava/lang/Object;", "velocity", "(FLh6/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "Lh6/c;", "Lkotlin/ExtensionFunctionType;", "block", "anchoredDrag", "(Landroidx/compose/foundation/MutatePriority;Lr6/f;Lh6/c;)Ljava/lang/Object;", "targetValue", "Lkotlin/Function4;", "anchor", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lr6/g;Lh6/c;)Ljava/lang/Object;", "delta", "newOffsetForDelta$foundation_release", "(F)F", "newOffsetForDelta", "dispatchRawDelta", "trySnapTo", "(Ljava/lang/Object;)Z", "Lr6/c;", "getConfirmValueChange$foundation_release", "()Lr6/c;", "setConfirmValueChange$foundation_release", "(Lr6/c;)V", "totalDistance", "positionalThreshold", "getPositionalThreshold$foundation_release", "setPositionalThreshold$foundation_release", "Lkotlin/Function0;", "velocityThreshold", "Lr6/a;", "getVelocityThreshold$foundation_release", "()Lr6/a;", "setVelocityThreshold$foundation_release", "(Lr6/a;)V", "<set-?>", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "setSnapAnimationSpec$foundation_release", "(Landroidx/compose/animation/core/AnimationSpec;)V", "getSnapAnimationSpec$annotations", "()V", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "getDecayAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "setDecayAnimationSpec$foundation_release", "(Landroidx/compose/animation/core/DecayAnimationSpec;)V", "getDecayAnimationSpec$annotations", "Landroidx/compose/foundation/MutatorMutex;", "dragMutex", "Landroidx/compose/foundation/MutatorMutex;", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "currentValue", "settledValue$delegate", "getSettledValue", "setSettledValue", "settledValue", "targetValue$delegate", "Landroidx/compose/runtime/State;", "getTargetValue", "offset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getOffset", "setOffset", "(F)V", TypedValues.CycleType.S_WAVE_OFFSET, "progress$delegate", "getProgress", "getProgress$annotations", "lastVelocity$delegate", "getLastVelocity", "setLastVelocity", "lastVelocity", "dragTarget$delegate", "getDragTarget", "setDragTarget", "dragTarget", "anchors$delegate", "getAnchors", "()Landroidx/compose/foundation/gestures/DraggableAnchors;", "setAnchors", "(Landroidx/compose/foundation/gestures/DraggableAnchors;)V", "androidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDragScope$1", "anchoredDragScope", "Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDragScope$1;", "getUsePreModifierChangeBehavior$foundation_release", "()Z", "getUsePreModifierChangeBehavior$foundation_release$annotations", "usePreModifierChangeBehavior", "isAnimationRunning", "Companion", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Stable
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 5 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex\n*L\n1#1,1753:1\n85#2:1754\n113#2,2:1755\n85#2:1757\n113#2,2:1758\n85#2:1760\n85#2:1769\n85#2:1773\n113#2,2:1774\n85#2:1776\n113#2,2:1777\n79#3:1761\n112#3,2:1762\n79#3:1770\n112#3,2:1771\n50#4,5:1764\n96#4,5:1779\n186#5,9:1784\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n*L\n851#1:1754\n851#1:1755,2\n860#1:1757\n860#1:1758,2\n867#1:1760\n940#1:1769\n959#1:1773\n959#1:1774,2\n961#1:1776\n961#1:1777,2\n885#1:1761\n885#1:1762,2\n956#1:1770\n956#1:1771,2\n895#1:1764,5\n1029#1:1779,5\n1226#1:1784,9\n*E\n"})
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AnchoredDraggableState$anchoredDragScope$1 anchoredDragScope;

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState anchors;

    @NotNull
    private InterfaceC6471c confirmValueChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentValue;
    public DecayAnimationSpec<Float> decayAnimationSpec;

    @NotNull
    private final MutatorMutex dragMutex;

    /* renamed from: dragTarget$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState dragTarget;

    /* renamed from: lastVelocity$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState lastVelocity;

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState offset;
    public InterfaceC6471c positionalThreshold;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    @NotNull
    private final State progress;

    /* renamed from: settledValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState settledValue;
    public AnimationSpec<Float> snapAnimationSpec;

    /* renamed from: targetValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final State targetValue;
    public InterfaceC6469a velocityThreshold;

    @Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJA\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0007\u0010\fJ\u008e\u0001\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u000e0\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0007\u0010\u0018¨\u0006\u0019"}, m5110d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "Saver", "()Landroidx/compose/runtime/saveable/Saver;", "Lkotlin/Function1;", "", "confirmValueChange", "(Lr6/c;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/animation/core/AnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "distance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lr6/c;Lr6/a;Lr6/c;)Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        public static /* synthetic */ Saver Saver$default(Companion companion, InterfaceC6471c interfaceC6471c, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$3
                    @Override // p152r6.InterfaceC6471c
                    public final Boolean invoke(T t8) {
                        return Boolean.TRUE;
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        return invoke((AnchoredDraggableState$Companion$Saver$3) obj2);
                    }
                };
            }
            return companion.Saver(interfaceC6471c);
        }

        @NotNull
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver() {
            return SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$1
                /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
                @Override // p152r6.InterfaceC6473e
                public final T invoke(SaverScope saverScope, AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$2
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AnchoredDraggableState$Companion$Saver$2) obj);
                }

                @Override // p152r6.InterfaceC6471c
                public final AnchoredDraggableState<T> invoke(T t8) {
                    return new AnchoredDraggableState<>(t8);
                }
            });
        }

        private Companion() {
        }

        public static /* synthetic */ Saver Saver$default(Companion companion, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c2, int i, Object obj) {
            if ((i & 16) != 0) {
                interfaceC6471c2 = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$6
                    @Override // p152r6.InterfaceC6471c
                    public final Boolean invoke(T t8) {
                        return Boolean.TRUE;
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        return invoke((AnchoredDraggableState$Companion$Saver$6) obj2);
                    }
                };
            }
            return companion.Saver(animationSpec, decayAnimationSpec, interfaceC6471c, interfaceC6469a, interfaceC6471c2);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.")
        @NotNull
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(@NotNull final InterfaceC6471c confirmValueChange) {
            return SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$4
                /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
                @Override // p152r6.InterfaceC6473e
                public final T invoke(SaverScope saverScope, AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$5
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AnchoredDraggableState$Companion$Saver$5) obj);
                }

                @Override // p152r6.InterfaceC6471c
                public final AnchoredDraggableState<T> invoke(T t8) {
                    return new AnchoredDraggableState<>(t8, confirmValueChange);
                }
            });
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to anchoredDraggableFlingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
        @NotNull
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(@NotNull final AnimationSpec<Float> snapAnimationSpec, @NotNull final DecayAnimationSpec<Float> decayAnimationSpec, @NotNull final InterfaceC6471c positionalThreshold, @NotNull final InterfaceC6469a velocityThreshold, @NotNull final InterfaceC6471c confirmValueChange) {
            return SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$7
                /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
                @Override // p152r6.InterfaceC6473e
                public final T invoke(SaverScope saverScope, AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AnchoredDraggableState$Companion$Saver$8) obj);
                }

                @Override // p152r6.InterfaceC6471c
                public final AnchoredDraggableState<T> invoke(T t8) {
                    return AnchoredDraggableKt.AnchoredDraggableState(t8, positionalThreshold, velocityThreshold, snapAnimationSpec, decayAnimationSpec, confirmValueChange);
                }
            });
        }
    }

    @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ld6/s;", "<anonymous>", "()V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {1125}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2 */
    public static final class C08302 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6474f $block;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestAnchors", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/DraggableAnchors;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {1126}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ InterfaceC6474f $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC6474f interfaceC6474f, AnchoredDraggableState<T> anchoredDraggableState, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$block = interfaceC6474f;
                this.this$0 = anchoredDraggableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, interfaceC5631c);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(DraggableAnchors<T> draggableAnchors, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass2) create(draggableAnchors, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$0;
                    InterfaceC6474f interfaceC6474f = this.$block;
                    AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (interfaceC6474f.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, this) == coroutineSingletons) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08302(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC6474f interfaceC6474f, InterfaceC5631c<? super C08302> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = anchoredDraggableState;
            this.$block = interfaceC6474f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C08302(this.this$0, this.$block, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C08302) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public final DraggableAnchors<T> invoke() {
                        return anchoredDraggableState.getAnchors();
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
                this.label = 1;
                if (AnchoredDraggableKt.restartable(interfaceC6469a, anonymousClass2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            T tClosestAnchor = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset());
            if (tClosestAnchor != null) {
                if (Math.abs(this.this$0.getOffset() - this.this$0.getAnchors().positionOf(tClosestAnchor)) < 0.5f && ((Boolean) this.this$0.getConfirmValueChange().invoke(tClosestAnchor)).booleanValue()) {
                    this.this$0.setSettledValue(tClosestAnchor);
                    this.this$0.setCurrentValue(tClosestAnchor);
                }
            }
            return C5443s.f8405a;
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableState", m5303f = "AnchoredDraggable.kt", m5304i = {0}, m5305l = {1170}, m5306m = "anchoredDrag", m5307n = {"this"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 */
    public static final class C08313 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08313(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC5631c<? super C08313> interfaceC5631c) {
            super(interfaceC5631c);
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ld6/s;", "<anonymous>", "()V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {1172}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4 */
    public static final class C08324 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6475g $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Pair;", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "<name for destructuring parameter 0>", "Ld6/s;", "<anonymous>", "(Lkotlin/Pair;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {1174}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ InterfaceC6475g $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC6475g interfaceC6475g, AnchoredDraggableState<T> anchoredDraggableState, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$block = interfaceC6475g;
                this.this$0 = anchoredDraggableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, interfaceC5631c);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    Pair pair = (Pair) this.L$0;
                    DraggableAnchors draggableAnchors = (DraggableAnchors) pair.component1();
                    Object objComponent2 = pair.component2();
                    InterfaceC6475g interfaceC6475g = this.$block;
                    AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (interfaceC6475g.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, objComponent2, this) == coroutineSingletons) {
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
            public final Object invoke(Pair<? extends DraggableAnchors<T>, ? extends T> pair, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass2) create(pair, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08324(AnchoredDraggableState<T> anchoredDraggableState, T t8, InterfaceC6475g interfaceC6475g, InterfaceC5631c<? super C08324> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = anchoredDraggableState;
            this.$targetValue = t8;
            this.$block = interfaceC6475g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C08324(this.this$0, this.$targetValue, this.$block, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C08324) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                this.this$0.setDragTarget(this.$targetValue);
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag.4.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public final Pair<DraggableAnchors<T>, T> invoke() {
                        return new Pair<>(anchoredDraggableState.getAnchors(), anchoredDraggableState.getTargetValue());
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
                this.label = 1;
                if (AnchoredDraggableKt.restartable(interfaceC6469a, anonymousClass2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            if (((Boolean) this.this$0.getConfirmValueChange().invoke(this.$targetValue)).booleanValue()) {
                ((AnchoredDraggableState) this.this$0).anchoredDragScope.dragTo(this.this$0.getAnchors().positionOf(this.$targetValue), this.this$0.getLastVelocity());
                this.this$0.setSettledValue(this.$targetValue);
                this.this$0.setCurrentValue(this.$targetValue);
            }
            return C5443s.f8405a;
        }
    }

    public AnchoredDraggableState(T t8) {
        this.confirmValueChange = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$confirmValueChange$1
            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(T t9) {
                return Boolean.TRUE;
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((AnchoredDraggableState$confirmValueChange$1) obj);
            }
        };
        this.dragMutex = new MutatorMutex();
        this.currentValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
        this.settledValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
        this.targetValue = SnapshotStateKt.derivedStateOf(new InterfaceC6469a(this) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$targetValue$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Object] */
            @Override // p152r6.InterfaceC6469a
            public final T invoke() {
                ?? dragTarget = this.this$0.getDragTarget();
                if (dragTarget != 0) {
                    return dragTarget;
                }
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                if (Float.isNaN(anchoredDraggableState.getOffset())) {
                    return anchoredDraggableState.getCurrentValue();
                }
                ?? ClosestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                return ClosestAnchor == 0 ? anchoredDraggableState.getCurrentValue() : ClosestAnchor;
            }
        });
        this.offset = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new InterfaceC6469a(this) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.progress.2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Float invoke() {
                float fPositionOf = this.this$0.getAnchors().positionOf(this.this$0.getSettledValue());
                float fPositionOf2 = this.this$0.getAnchors().positionOf(this.this$0.getTargetValue()) - fPositionOf;
                float fAbs = Math.abs(fPositionOf2);
                float f = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fRequireOffset = (this.this$0.requireOffset() - fPositionOf) / fPositionOf2;
                    if (fRequireOffset < 1.0E-6f) {
                        f = 0.0f;
                    } else if (fRequireOffset <= 0.999999f) {
                        f = fRequireOffset;
                    }
                }
                return Float.valueOf(f);
            }
        });
        this.lastVelocity = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnchoredDraggableKt.emptyDraggableAnchors(), null, 2, null);
        this.anchoredDragScope = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, InterfaceC6474f interfaceC6474f, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, interfaceC6474f, interfaceC5631c);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to anchoredDraggableFlingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
    public static /* synthetic */ void getDecayAnimationSpec$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getDragTarget() {
        return this.dragTarget.getValue();
    }

    @Deprecated(message = "Use the progress function to query the progress between two specified anchors.", replaceWith = @ReplaceWith(expression = "progress(state.settledValue, state.targetValue)", imports = {}))
    public static /* synthetic */ void getProgress$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to anchoredDraggableFlingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
    public static /* synthetic */ void getSnapAnimationSpec$annotations() {
    }

    public static /* synthetic */ void getUsePreModifierChangeBehavior$foundation_release$annotations() {
    }

    private final void setAnchors(DraggableAnchors<T> draggableAnchors) {
        this.anchors.setValue(draggableAnchors);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t8) {
        this.currentValue.setValue(t8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragTarget(T t8) {
        this.dragTarget.setValue(t8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f) {
        this.lastVelocity.setFloatValue(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(float f) {
        this.offset.setFloatValue(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSettledValue(T t8) {
        this.settledValue.setValue(t8);
    }

    private final boolean trySnapTo(T targetValue) {
        MutatorMutex mutatorMutex = this.dragMutex;
        boolean zTryLock = mutatorMutex.tryLock();
        if (!zTryLock) {
            return zTryLock;
        }
        try {
            AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = this.anchoredDragScope;
            float fPositionOf = getAnchors().positionOf(targetValue);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDraggableState$anchoredDragScope$1, fPositionOf, 0.0f, 2, null);
                setDragTarget(null);
            }
            setCurrentValue(targetValue);
            setSettledValue(targetValue);
            mutatorMutex.unlock();
            return zTryLock;
        } catch (Throwable th) {
            mutatorMutex.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors, Object obj, int i, Object obj2) {
        if ((i & 2) != 0 && (Float.isNaN(anchoredDraggableState.getOffset()) || (obj = draggableAnchors.closestAnchor(anchoredDraggableState.getOffset())) == null)) {
            obj = anchoredDraggableState.getTargetValue();
        }
        anchoredDraggableState.updateAnchors(draggableAnchors, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object anchoredDrag(T r6, @org.jetbrains.annotations.NotNull androidx.compose.foundation.MutatePriority r7, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6475g r8, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableState.C08313
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableState.C08313) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            androidx.compose.foundation.gestures.AnchoredDraggableState r6 = (androidx.compose.foundation.gestures.AnchoredDraggableState) r6
            kotlin.AbstractC5774b.m5119b(r9)     // Catch: java.lang.Throwable -> L2c
            goto L56
        L2c:
            r7 = move-exception
            goto L5c
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.AbstractC5774b.m5119b(r9)
            androidx.compose.foundation.gestures.DraggableAnchors r9 = r5.getAnchors()
            boolean r9 = r9.hasPositionFor(r6)
            if (r9 == 0) goto L60
            androidx.compose.foundation.MutatorMutex r9 = r5.dragMutex     // Catch: java.lang.Throwable -> L5a
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r5, r6, r8, r4)     // Catch: java.lang.Throwable -> L5a
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L5a
            r0.label = r3     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r6 = r9.mutate(r7, r2, r0)     // Catch: java.lang.Throwable -> L5a
            if (r6 != r1) goto L55
            return r1
        L55:
            r6 = r5
        L56:
            r6.setDragTarget(r4)
            goto L74
        L5a:
            r7 = move-exception
            r6 = r5
        L5c:
            r6.setDragTarget(r4)
            throw r7
        L60:
            r6.c r7 = r5.confirmValueChange
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L74
            r5.setSettledValue(r6)
            r5.setCurrentValue(r6)
        L74:
            d6.s r6 = p045d6.C5443s.f8405a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag(java.lang.Object, androidx.compose.foundation.MutatePriority, r6.g, h6.c):java.lang.Object");
    }

    public final float dispatchRawDelta(float delta) {
        float fNewOffsetForDelta$foundation_release = newOffsetForDelta$foundation_release(delta);
        float fRequireOffset = fNewOffsetForDelta$foundation_release - requireOffset();
        AnchoredDragScope.dragTo$default(this.anchoredDragScope, fNewOffsetForDelta$foundation_release, 0.0f, 2, null);
        return fRequireOffset;
    }

    @NotNull
    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors.getValue();
    }

    @NotNull
    /* renamed from: getConfirmValueChange$foundation_release, reason: from getter */
    public final InterfaceC6471c getConfirmValueChange() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    @NotNull
    public final DecayAnimationSpec<Float> getDecayAnimationSpec() {
        DecayAnimationSpec<Float> decayAnimationSpec = this.decayAnimationSpec;
        if (decayAnimationSpec != null) {
            return decayAnimationSpec;
        }
        AbstractC5830k.m5339p("decayAnimationSpec");
        throw null;
    }

    public final float getLastVelocity() {
        return this.lastVelocity.getFloatValue();
    }

    public final float getOffset() {
        return this.offset.getFloatValue();
    }

    @NotNull
    public final InterfaceC6471c getPositionalThreshold$foundation_release() {
        InterfaceC6471c interfaceC6471c = this.positionalThreshold;
        if (interfaceC6471c != null) {
            return interfaceC6471c;
        }
        AbstractC5830k.m5339p("positionalThreshold");
        throw null;
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d)
    public final float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    public final T getSettledValue() {
        return this.settledValue.getValue();
    }

    @NotNull
    public final AnimationSpec<Float> getSnapAnimationSpec() {
        AnimationSpec<Float> animationSpec = this.snapAnimationSpec;
        if (animationSpec != null) {
            return animationSpec;
        }
        AbstractC5830k.m5339p("snapAnimationSpec");
        throw null;
    }

    public final T getTargetValue() {
        return (T) this.targetValue.getValue();
    }

    public final boolean getUsePreModifierChangeBehavior$foundation_release() {
        return (this.positionalThreshold == null || this.velocityThreshold == null || this.snapAnimationSpec == null || this.decayAnimationSpec == null) ? false : true;
    }

    @NotNull
    public final InterfaceC6469a getVelocityThreshold$foundation_release() {
        InterfaceC6469a interfaceC6469a = this.velocityThreshold;
        if (interfaceC6469a != null) {
            return interfaceC6469a;
        }
        AbstractC5830k.m5339p("velocityThreshold");
        throw null;
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float newOffsetForDelta$foundation_release(float delta) {
        return AbstractC5806u.m5273l((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + delta, getAnchors().minPosition(), getAnchors().maxPosition());
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d)
    public final float progress(T from, T to) {
        float fPositionOf = getAnchors().positionOf(from);
        float fPositionOf2 = getAnchors().positionOf(to);
        float fM5273l = (AbstractC5806u.m5273l(getOffset(), Math.min(fPositionOf, fPositionOf2), Math.max(fPositionOf, fPositionOf2)) - fPositionOf) / (fPositionOf2 - fPositionOf);
        if (Float.isNaN(fM5273l)) {
            return 1.0f;
        }
        if (fM5273l < 1.0E-6f) {
            return 0.0f;
        }
        if (fM5273l > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(fM5273l);
    }

    public final float requireOffset() {
        if (Float.isNaN(getOffset())) {
            InlineClassHelperKt.throwIllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return getOffset();
    }

    public final void setConfirmValueChange$foundation_release(@NotNull InterfaceC6471c interfaceC6471c) {
        this.confirmValueChange = interfaceC6471c;
    }

    public final void setDecayAnimationSpec$foundation_release(@NotNull DecayAnimationSpec<Float> decayAnimationSpec) {
        this.decayAnimationSpec = decayAnimationSpec;
    }

    public final void setPositionalThreshold$foundation_release(@NotNull InterfaceC6471c interfaceC6471c) {
        this.positionalThreshold = interfaceC6471c;
    }

    public final void setSnapAnimationSpec$foundation_release(@NotNull AnimationSpec<Float> animationSpec) {
        this.snapAnimationSpec = animationSpec;
    }

    public final void setVelocityThreshold$foundation_release(@NotNull InterfaceC6469a interfaceC6469a) {
        this.velocityThreshold = interfaceC6469a;
    }

    @Nullable
    public final Object settle(@NotNull AnimationSpec<Float> animationSpec, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        T currentValue = getCurrentValue();
        T tClosestAnchor = getAnchors().closestAnchor(requireOffset());
        C5443s c5443s = C5443s.f8405a;
        if (tClosestAnchor == null || !((Boolean) this.confirmValueChange.invoke(tClosestAnchor)).booleanValue()) {
            Object objAnimateTo = AnchoredDraggableKt.animateTo(this, currentValue, animationSpec, interfaceC5631c);
            return objAnimateTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo : c5443s;
        }
        Object objAnimateTo2 = AnchoredDraggableKt.animateTo(this, tClosestAnchor, animationSpec, interfaceC5631c);
        return objAnimateTo2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo2 : c5443s;
    }

    public final void updateAnchors(@NotNull DraggableAnchors<T> newAnchors, T newTarget) {
        if (AbstractC5830k.m5325b(getAnchors(), newAnchors)) {
            return;
        }
        setAnchors(newAnchors);
        if (trySnapTo(newTarget)) {
            return;
        }
        setDragTarget(newTarget);
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, InterfaceC6475g interfaceC6475g, InterfaceC5631c interfaceC5631c, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, interfaceC6475g, interfaceC5631c);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "settle does not accept a velocity anymore. Please use FlingBehavior#performFling instead. See AnchoredDraggableSamples.kt for example usages.")
    @Nullable
    public final Object settle(float f, @NotNull InterfaceC5631c<? super Float> interfaceC5631c) {
        if (!getUsePreModifierChangeBehavior$foundation_release()) {
            InlineClassHelperKt.throwIllegalArgumentException("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        T currentValue = getCurrentValue();
        Object objComputeTarget = AnchoredDraggableKt.computeTarget(getAnchors(), requireOffset(), f, getPositionalThreshold$foundation_release(), getVelocityThreshold$foundation_release());
        if (((Boolean) this.confirmValueChange.invoke(objComputeTarget)).booleanValue()) {
            return AnchoredDraggableKt.animateToWithDecay$default(this, objComputeTarget, f, null, null, interfaceC5631c, 12, null);
        }
        return AnchoredDraggableKt.animateToWithDecay$default(this, currentValue, f, null, null, interfaceC5631c, 12, null);
    }

    @Nullable
    public final Object anchoredDrag(@NotNull MutatePriority mutatePriority, @NotNull InterfaceC6474f interfaceC6474f, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objMutate = this.dragMutex.mutate(mutatePriority, new C08302(this, interfaceC6474f, null), interfaceC5631c);
        return objMutate == CoroutineSingletons.COROUTINE_SUSPENDED ? objMutate : C5443s.f8405a;
    }

    public AnchoredDraggableState(T t8, @NotNull DraggableAnchors<T> draggableAnchors) {
        this(t8);
        setAnchors(draggableAnchors);
        trySnapTo(t8);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.")
    public AnchoredDraggableState(T t8, @NotNull InterfaceC6471c interfaceC6471c) {
        this(t8);
        this.confirmValueChange = interfaceC6471c;
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, InterfaceC6471c interfaceC6471c, int i, AbstractC5824e abstractC5824e) {
        this(obj, draggableAnchors, (i & 4) != 0 ? new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.1
            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(T t8) {
                return Boolean.TRUE;
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke((C08291) obj2);
            }
        } : interfaceC6471c);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.")
    public AnchoredDraggableState(T t8, @NotNull DraggableAnchors<T> draggableAnchors, @NotNull InterfaceC6471c interfaceC6471c) {
        this(t8, interfaceC6471c);
        setAnchors(draggableAnchors);
        trySnapTo(t8);
    }
}
