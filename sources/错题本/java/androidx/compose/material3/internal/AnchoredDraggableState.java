package androidx.compose.material3.internal;

import androidx.annotation.FloatRange;
import androidx.autofill.HintConstants;
import androidx.camera.video.AudioStats;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
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
import kotlin.Metadata;
import kotlin.Pair;
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

@Metadata(m5109d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\u0001\u0018\u0000 q*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001qBs\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0011\u0010\u0012B\u0083\u0001\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0011\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\b\b\u0002\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ^\u0010'\u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020 2B\u0010&\u001a>\b\u0001\u0012\u0004\u0012\u00020#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0$\u0012\u0006\u0012\u0004\u0018\u00010\u00020\"¢\u0006\u0002\b%H\u0086@¢\u0006\u0004\b'\u0010(J{\u0010'\u001a\u00020\u001a2\u0006\u0010)\u001a\u00028\u00002\b\b\u0002\u0010!\u001a\u00020 2W\u0010&\u001aS\b\u0001\u0012\u0004\u0012\u00020#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b()\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0$\u0012\u0006\u0012\u0004\u0018\u00010\u00020*¢\u0006\u0002\b%H\u0086@¢\u0006\u0004\b'\u0010+J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H\u0000¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005¢\u0006\u0004\b0\u0010.J'\u00103\u001a\u00028\u00002\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00028\u00002\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00028\u0000H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u000f2\u0006\u0010)\u001a\u00028\u0000H\u0002¢\u0006\u0004\b7\u00108R5\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010;R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010AR5\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\bB\u0010;R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\u00020F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR+\u00102\u001a\u00028\u00002\u0006\u0010K\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001b\u0010)\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010OR\u001b\u0010W\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bU\u0010S\u001a\u0004\bV\u0010OR+\u00101\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010\u0017\"\u0004\b[\u0010\\R\u001b\u0010_\u001a\u00020\u00058GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b]\u0010S\u001a\u0004\b^\u0010\u0017R+\u0010c\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010Y\u001a\u0004\ba\u0010\u0017\"\u0004\bb\u0010\\R/\u0010g\u001a\u0004\u0018\u00018\u00002\b\u0010K\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bd\u0010M\u001a\u0004\be\u0010O\"\u0004\bf\u0010QR7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bh\u0010M\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0011\u0010o\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006r"}, m5110d2 = {"Landroidx/compose/material3/internal/AnchoredDraggableState;", ExifInterface.GPS_DIRECTION_TRUE, "", "initialValue", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "totalDistance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "newValue", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;Lr6/c;Lr6/a;Landroidx/compose/animation/core/AnimationSpec;Lr6/c;)V", "Landroidx/compose/material3/internal/DraggableAnchors;", "anchors", "(Ljava/lang/Object;Landroidx/compose/material3/internal/DraggableAnchors;Lr6/c;Lr6/a;Landroidx/compose/animation/core/AnimationSpec;Lr6/c;)V", "requireOffset", "()F", "newAnchors", "newTarget", "Ld6/s;", "updateAnchors", "(Landroidx/compose/material3/internal/DraggableAnchors;Ljava/lang/Object;)V", "velocity", "settle", "(FLh6/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function3;", "Landroidx/compose/material3/internal/AnchoredDragScope;", "Lh6/c;", "Lkotlin/ExtensionFunctionType;", "block", "anchoredDrag", "(Landroidx/compose/foundation/MutatePriority;Lr6/f;Lh6/c;)Ljava/lang/Object;", "targetValue", "Lkotlin/Function4;", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lr6/g;Lh6/c;)Ljava/lang/Object;", "delta", "newOffsetForDelta$material3_release", "(F)F", "newOffsetForDelta", "dispatchRawDelta", TypedValues.CycleType.S_WAVE_OFFSET, "currentValue", "computeTarget", "(FLjava/lang/Object;F)Ljava/lang/Object;", "computeTargetWithoutThresholds", "(FLjava/lang/Object;)Ljava/lang/Object;", "trySnapTo", "(Ljava/lang/Object;)Z", "Lr6/c;", "getPositionalThreshold$material3_release", "()Lr6/c;", "Lr6/a;", "getVelocityThreshold$material3_release", "()Lr6/a;", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getConfirmValueChange$material3_release", "Landroidx/compose/material3/internal/InternalMutatorMutex;", "dragMutex", "Landroidx/compose/material3/internal/InternalMutatorMutex;", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material3_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "<set-?>", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "targetValue$delegate", "Landroidx/compose/runtime/State;", "getTargetValue", "closestValue$delegate", "getClosestValue$material3_release", "closestValue", "offset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getOffset", "setOffset", "(F)V", "progress$delegate", "getProgress", "progress", "lastVelocity$delegate", "getLastVelocity", "setLastVelocity", "lastVelocity", "dragTarget$delegate", "getDragTarget", "setDragTarget", "dragTarget", "anchors$delegate", "getAnchors", "()Landroidx/compose/material3/internal/DraggableAnchors;", "setAnchors", "(Landroidx/compose/material3/internal/DraggableAnchors;)V", "anchoredDragScope", "Landroidx/compose/material3/internal/AnchoredDragScope;", "isAnimationRunning", "()Z", "Companion", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Stable
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/internal/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,868:1\n81#2:869\n107#2,2:870\n81#2:872\n81#2:873\n81#2:877\n81#2:881\n107#2,2:882\n81#2:884\n107#2,2:885\n76#3:874\n109#3,2:875\n76#3:878\n109#3,2:879\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/internal/AnchoredDraggableState\n*L\n287#1:869\n287#1:870,2\n295#1:872\n310#1:873\n355#1:877\n374#1:881\n374#1:882,2\n376#1:884\n376#1:885,2\n328#1:874\n328#1:875,2\n371#1:878\n371#1:879,2\n*E\n"})
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AnchoredDragScope anchoredDragScope;

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState anchors;

    @NotNull
    private final AnimationSpec<Float> animationSpec;

    /* renamed from: closestValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final State closestValue;

    @NotNull
    private final InterfaceC6471c confirmValueChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentValue;

    @NotNull
    private final InternalMutatorMutex dragMutex;

    /* renamed from: dragTarget$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState dragTarget;

    @NotNull
    private final DraggableState draggableState;

    /* renamed from: lastVelocity$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState lastVelocity;

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState offset;

    @NotNull
    private final InterfaceC6471c positionalThreshold;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    @NotNull
    private final State progress;

    /* renamed from: targetValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final State targetValue;

    @NotNull
    private final InterfaceC6469a velocityThreshold;

    @Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J|\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0004\u0012\u00028\u00010\u0011\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m5110d2 = {"Landroidx/compose/material3/internal/AnchoredDraggableState$Companion;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "distance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "Saver", "(Landroidx/compose/animation/core/AnimationSpec;Lr6/c;Lr6/c;Lr6/a;)Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(@NotNull final AnimationSpec<Float> animationSpec, @NotNull final InterfaceC6471c confirmValueChange, @NotNull final InterfaceC6471c positionalThreshold, @NotNull final InterfaceC6469a velocityThreshold) {
            return SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$Companion$Saver$1
                /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
                @Override // p152r6.InterfaceC6473e
                @Nullable
                public final T invoke(@NotNull SaverScope saverScope, @NotNull AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new InterfaceC6471c() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AnchoredDraggableState$Companion$Saver$2) obj);
                }

                @Override // p152r6.InterfaceC6471c
                @Nullable
                public final AnchoredDraggableState<T> invoke(@NotNull T t8) {
                    return new AnchoredDraggableState<>(t8, positionalThreshold, velocityThreshold, animationSpec, confirmValueChange);
                }
            });
        }

        private Companion() {
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.material3.internal.AnchoredDraggableState", m5303f = "AnchoredDraggable.kt", m5304i = {0}, m5305l = {520}, m5306m = "anchoredDrag", m5307n = {"this"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 */
    public static final class C19451 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19451(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC5631c<? super C19451> interfaceC5631c) {
            super(interfaceC5631c);
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ld6/s;", "<anonymous>", "()V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {521}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2 */
    public static final class C19462 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6474f $block;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/material3/internal/DraggableAnchors;", "latestAnchors", "Ld6/s;", "<anonymous>", "(Landroidx/compose/material3/internal/DraggableAnchors;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
        @DebugMetadata(m5302c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {522}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
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
            @NotNull
            public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, interfaceC5631c);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // p152r6.InterfaceC6473e
            @Nullable
            public final Object invoke(@NotNull DraggableAnchors<T> draggableAnchors, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass2) create(draggableAnchors, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$0;
                    InterfaceC6474f interfaceC6474f = this.$block;
                    AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (interfaceC6474f.invoke(anchoredDragScope, draggableAnchors, this) == coroutineSingletons) {
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
        public C19462(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC6474f interfaceC6474f, InterfaceC5631c<? super C19462> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = anchoredDraggableState;
            this.$block = interfaceC6474f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@NotNull InterfaceC5631c<?> interfaceC5631c) {
            return new C19462(this.this$0, this.$block, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        @Nullable
        public final Object invoke(@Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C19462) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    @NotNull
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
            return C5443s.f8405a;
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.material3.internal.AnchoredDraggableState", m5303f = "AnchoredDraggable.kt", m5304i = {0}, m5305l = {567}, m5306m = "anchoredDrag", m5307n = {"this"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3 */
    public static final class C19473 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19473(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC5631c<? super C19473> interfaceC5631c) {
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

    @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ld6/s;", "<anonymous>", "()V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {569}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4 */
    public static final class C19484 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6475g $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Pair;", "Landroidx/compose/material3/internal/DraggableAnchors;", "<name for destructuring parameter 0>", "Ld6/s;", "<anonymous>", "(Lkotlin/Pair;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
        @DebugMetadata(m5302c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {571}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
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
            @NotNull
            public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, interfaceC5631c);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    Pair pair = (Pair) this.L$0;
                    DraggableAnchors draggableAnchors = (DraggableAnchors) pair.component1();
                    Object objComponent2 = pair.component2();
                    InterfaceC6475g interfaceC6475g = this.$block;
                    AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (interfaceC6475g.invoke(anchoredDragScope, draggableAnchors, objComponent2, this) == coroutineSingletons) {
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
            @Nullable
            public final Object invoke(@NotNull Pair<? extends DraggableAnchors<T>, ? extends T> pair, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass2) create(pair, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19484(AnchoredDraggableState<T> anchoredDraggableState, T t8, InterfaceC6475g interfaceC6475g, InterfaceC5631c<? super C19484> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = anchoredDraggableState;
            this.$targetValue = t8;
            this.$block = interfaceC6475g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@NotNull InterfaceC5631c<?> interfaceC5631c) {
            return new C19484(this.this$0, this.$targetValue, this.$block, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        @Nullable
        public final Object invoke(@Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C19484) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                this.this$0.setDragTarget(this.$targetValue);
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag.4.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    @NotNull
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
            return C5443s.f8405a;
        }
    }

    public AnchoredDraggableState(T t8, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6469a interfaceC6469a, @NotNull AnimationSpec<Float> animationSpec, @NotNull InterfaceC6471c interfaceC6471c2) {
        this.positionalThreshold = interfaceC6471c;
        this.velocityThreshold = interfaceC6469a;
        this.animationSpec = animationSpec;
        this.confirmValueChange = interfaceC6471c2;
        this.dragMutex = new InternalMutatorMutex();
        this.draggableState = new AnchoredDraggableState$draggableState$1(this);
        this.currentValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
        this.targetValue = SnapshotStateKt.derivedStateOf(new InterfaceC6469a(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$targetValue$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
            @Override // p152r6.InterfaceC6469a
            public final T invoke() {
                ?? dragTarget = this.this$0.getDragTarget();
                if (dragTarget != 0) {
                    return dragTarget;
                }
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                float offset = anchoredDraggableState.getOffset();
                return !Float.isNaN(offset) ? anchoredDraggableState.computeTarget(offset, anchoredDraggableState.getCurrentValue(), 0.0f) : anchoredDraggableState.getCurrentValue();
            }
        });
        this.closestValue = SnapshotStateKt.derivedStateOf(new InterfaceC6469a(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$closestValue$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
            @Override // p152r6.InterfaceC6469a
            public final T invoke() {
                ?? dragTarget = this.this$0.getDragTarget();
                if (dragTarget != 0) {
                    return dragTarget;
                }
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                float offset = anchoredDraggableState.getOffset();
                return !Float.isNaN(offset) ? anchoredDraggableState.computeTargetWithoutThresholds(offset, anchoredDraggableState.getCurrentValue()) : anchoredDraggableState.getCurrentValue();
            }
        });
        this.offset = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new InterfaceC6469a(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$progress$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Float invoke() {
                float fPositionOf = this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue());
                float fPositionOf2 = this.this$0.getAnchors().positionOf(this.this$0.getClosestValue$material3_release()) - fPositionOf;
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
        this.anchoredDragScope = new AnchoredDragScope(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDragScope$1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.compose.material3.internal.AnchoredDragScope
            public void dragTo(float newOffset, float lastKnownVelocity) {
                this.this$0.setOffset(newOffset);
                this.this$0.setLastVelocity(lastKnownVelocity);
            }
        };
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, InterfaceC6474f interfaceC6474f, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, interfaceC6474f, interfaceC5631c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTarget(float offset, T currentValue, float velocity) {
        DraggableAnchors<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(currentValue);
        float fFloatValue = ((Number) this.velocityThreshold.invoke()).floatValue();
        if (fPositionOf != offset && !Float.isNaN(fPositionOf)) {
            if (fPositionOf < offset) {
                if (velocity >= fFloatValue) {
                    T tClosestAnchor = anchors.closestAnchor(offset, true);
                    AbstractC5830k.m5327d(tClosestAnchor);
                    return tClosestAnchor;
                }
                T tClosestAnchor2 = anchors.closestAnchor(offset, true);
                AbstractC5830k.m5327d(tClosestAnchor2);
                if (offset >= Math.abs(Math.abs(((Number) this.positionalThreshold.invoke(Float.valueOf(Math.abs(anchors.positionOf(tClosestAnchor2) - fPositionOf)))).floatValue()) + fPositionOf)) {
                    return tClosestAnchor2;
                }
            } else {
                if (velocity <= (-fFloatValue)) {
                    T tClosestAnchor3 = anchors.closestAnchor(offset, false);
                    AbstractC5830k.m5327d(tClosestAnchor3);
                    return tClosestAnchor3;
                }
                T tClosestAnchor4 = anchors.closestAnchor(offset, false);
                AbstractC5830k.m5327d(tClosestAnchor4);
                float fAbs = Math.abs(fPositionOf - Math.abs(((Number) this.positionalThreshold.invoke(Float.valueOf(Math.abs(fPositionOf - anchors.positionOf(tClosestAnchor4))))).floatValue()));
                if (offset >= 0.0f ? offset <= fAbs : Math.abs(offset) >= fAbs) {
                    return tClosestAnchor4;
                }
            }
        }
        return currentValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTargetWithoutThresholds(float offset, T currentValue) {
        DraggableAnchors<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(currentValue);
        if (fPositionOf != offset && !Float.isNaN(fPositionOf)) {
            if (fPositionOf < offset) {
                T tClosestAnchor = anchors.closestAnchor(offset, true);
                if (tClosestAnchor != null) {
                    return tClosestAnchor;
                }
            } else {
                T tClosestAnchor2 = anchors.closestAnchor(offset, false);
                if (tClosestAnchor2 != null) {
                    return tClosestAnchor2;
                }
            }
        }
        return currentValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getDragTarget() {
        return this.dragTarget.getValue();
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

    private final boolean trySnapTo(final T targetValue) {
        return this.dragMutex.tryMutate(new InterfaceC6469a(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState.trySnapTo.1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m9309invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m9309invoke() {
                AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                T t8 = targetValue;
                float fPositionOf = anchoredDraggableState.getAnchors().positionOf(t8);
                if (!Float.isNaN(fPositionOf)) {
                    AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
                    anchoredDraggableState.setDragTarget(null);
                }
                anchoredDraggableState.setCurrentValue(t8);
            }
        });
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
    public final java.lang.Object anchoredDrag(@org.jetbrains.annotations.NotNull androidx.compose.foundation.MutatePriority r7, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6474f r8, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.internal.AnchoredDraggableState.C19451
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableState.C19451) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r7 = r0.L$0
            androidx.compose.material3.internal.AnchoredDraggableState r7 = (androidx.compose.material3.internal.AnchoredDraggableState) r7
            kotlin.AbstractC5774b.m5119b(r9)     // Catch: java.lang.Throwable -> L2d
            goto L4e
        L2d:
            r8 = move-exception
            goto L87
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.AbstractC5774b.m5119b(r9)
            androidx.compose.material3.internal.InternalMutatorMutex r9 = r6.dragMutex     // Catch: java.lang.Throwable -> L85
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2 r2 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2     // Catch: java.lang.Throwable -> L85
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L85
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L85
            r0.label = r4     // Catch: java.lang.Throwable -> L85
            java.lang.Object r7 = r9.mutate(r7, r2, r0)     // Catch: java.lang.Throwable -> L85
            if (r7 != r1) goto L4d
            return r1
        L4d:
            r7 = r6
        L4e:
            androidx.compose.material3.internal.DraggableAnchors r8 = r7.getAnchors()
            float r9 = r7.getOffset()
            java.lang.Object r8 = r8.closestAnchor(r9)
            if (r8 == 0) goto L82
            float r9 = r7.getOffset()
            androidx.compose.material3.internal.DraggableAnchors r0 = r7.getAnchors()
            float r0 = r0.positionOf(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L82
            r6.c r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L82
            r7.setCurrentValue(r8)
        L82:
            d6.s r7 = p045d6.C5443s.f8405a
            return r7
        L85:
            r8 = move-exception
            r7 = r6
        L87:
            androidx.compose.material3.internal.DraggableAnchors r9 = r7.getAnchors()
            float r0 = r7.getOffset()
            java.lang.Object r9 = r9.closestAnchor(r0)
            if (r9 == 0) goto Lbb
            float r0 = r7.getOffset()
            androidx.compose.material3.internal.DraggableAnchors r1 = r7.getAnchors()
            float r1 = r1.positionOf(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lbb
            r6.c r0 = r7.confirmValueChange
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lbb
            r7.setCurrentValue(r9)
        Lbb:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag(androidx.compose.foundation.MutatePriority, r6.f, h6.c):java.lang.Object");
    }

    public final float dispatchRawDelta(float delta) {
        float fNewOffsetForDelta$material3_release = newOffsetForDelta$material3_release(delta);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(fNewOffsetForDelta$material3_release);
        return fNewOffsetForDelta$material3_release - offset;
    }

    @NotNull
    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors.getValue();
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final T getClosestValue$material3_release() {
        return (T) this.closestValue.getValue();
    }

    @NotNull
    /* renamed from: getConfirmValueChange$material3_release, reason: from getter */
    public final InterfaceC6471c getConfirmValueChange() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    @NotNull
    /* renamed from: getDraggableState$material3_release, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    public final float getLastVelocity() {
        return this.lastVelocity.getFloatValue();
    }

    public final float getOffset() {
        return this.offset.getFloatValue();
    }

    @NotNull
    /* renamed from: getPositionalThreshold$material3_release, reason: from getter */
    public final InterfaceC6471c getPositionalThreshold() {
        return this.positionalThreshold;
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d)
    public final float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue.getValue();
    }

    @NotNull
    /* renamed from: getVelocityThreshold$material3_release, reason: from getter */
    public final InterfaceC6469a getVelocityThreshold() {
        return this.velocityThreshold;
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float newOffsetForDelta$material3_release(float delta) {
        return AbstractC5806u.m5273l((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + delta, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    public final float requireOffset() {
        if (Float.isNaN(getOffset())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return getOffset();
    }

    @Nullable
    public final Object settle(float f, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        T currentValue = getCurrentValue();
        T tComputeTarget = computeTarget(requireOffset(), currentValue, f);
        boolean zBooleanValue = ((Boolean) this.confirmValueChange.invoke(tComputeTarget)).booleanValue();
        C5443s c5443s = C5443s.f8405a;
        if (zBooleanValue) {
            Object objAnimateTo = AnchoredDraggableKt.animateTo(this, tComputeTarget, f, interfaceC5631c);
            return objAnimateTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo : c5443s;
        }
        Object objAnimateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f, interfaceC5631c);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object anchoredDrag(T r7, @org.jetbrains.annotations.NotNull androidx.compose.foundation.MutatePriority r8, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6475g r9, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.internal.AnchoredDraggableState.C19473
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.material3.internal.AnchoredDraggableState.C19473) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r7 = r0.L$0
            androidx.compose.material3.internal.AnchoredDraggableState r7 = (androidx.compose.material3.internal.AnchoredDraggableState) r7
            kotlin.AbstractC5774b.m5119b(r10)     // Catch: java.lang.Throwable -> L2e
            goto L58
        L2e:
            r8 = move-exception
            goto L92
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.AbstractC5774b.m5119b(r10)
            androidx.compose.material3.internal.DraggableAnchors r10 = r6.getAnchors()
            boolean r10 = r10.hasAnchorFor(r7)
            if (r10 == 0) goto Lca
            androidx.compose.material3.internal.InternalMutatorMutex r10 = r6.dragMutex     // Catch: java.lang.Throwable -> L90
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L90
            r2.<init>(r6, r7, r9, r5)     // Catch: java.lang.Throwable -> L90
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L90
            r0.label = r4     // Catch: java.lang.Throwable -> L90
            java.lang.Object r7 = r10.mutate(r8, r2, r0)     // Catch: java.lang.Throwable -> L90
            if (r7 != r1) goto L57
            return r1
        L57:
            r7 = r6
        L58:
            r7.setDragTarget(r5)
            androidx.compose.material3.internal.DraggableAnchors r8 = r7.getAnchors()
            float r9 = r7.getOffset()
            java.lang.Object r8 = r8.closestAnchor(r9)
            if (r8 == 0) goto Lcd
            float r9 = r7.getOffset()
            androidx.compose.material3.internal.DraggableAnchors r10 = r7.getAnchors()
            float r10 = r10.positionOf(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lcd
            r6.c r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lcd
            r7.setCurrentValue(r8)
            goto Lcd
        L90:
            r8 = move-exception
            r7 = r6
        L92:
            r7.setDragTarget(r5)
            androidx.compose.material3.internal.DraggableAnchors r9 = r7.getAnchors()
            float r10 = r7.getOffset()
            java.lang.Object r9 = r9.closestAnchor(r10)
            if (r9 == 0) goto Lc9
            float r10 = r7.getOffset()
            androidx.compose.material3.internal.DraggableAnchors r0 = r7.getAnchors()
            float r0 = r0.positionOf(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto Lc9
            r6.c r10 = r7.confirmValueChange
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lc9
            r7.setCurrentValue(r9)
        Lc9:
            throw r8
        Lca:
            r6.setCurrentValue(r7)
        Lcd:
            d6.s r7 = p045d6.C5443s.f8405a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag(java.lang.Object, androidx.compose.foundation.MutatePriority, r6.g, h6.c):java.lang.Object");
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, AnimationSpec animationSpec, InterfaceC6471c interfaceC6471c2, int i, AbstractC5824e abstractC5824e) {
        this(obj, interfaceC6471c, interfaceC6469a, animationSpec, (i & 16) != 0 ? new InterfaceC6471c() { // from class: androidx.compose.material3.internal.AnchoredDraggableState.1
            @Override // p152r6.InterfaceC6471c
            @NotNull
            public final Boolean invoke(T t8) {
                return Boolean.TRUE;
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke((C19431) obj2);
            }
        } : interfaceC6471c2);
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, AnimationSpec animationSpec, InterfaceC6471c interfaceC6471c2, int i, AbstractC5824e abstractC5824e) {
        this(obj, draggableAnchors, interfaceC6471c, interfaceC6469a, animationSpec, (i & 32) != 0 ? new InterfaceC6471c() { // from class: androidx.compose.material3.internal.AnchoredDraggableState.2
            @Override // p152r6.InterfaceC6471c
            @NotNull
            public final Boolean invoke(T t8) {
                return Boolean.TRUE;
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke((C19442) obj2);
            }
        } : interfaceC6471c2);
    }

    public AnchoredDraggableState(T t8, @NotNull DraggableAnchors<T> draggableAnchors, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6469a interfaceC6469a, @NotNull AnimationSpec<Float> animationSpec, @NotNull InterfaceC6471c interfaceC6471c2) {
        this(t8, interfaceC6471c, interfaceC6469a, animationSpec, interfaceC6471c2);
        setAnchors(draggableAnchors);
        trySnapTo(t8);
    }
}
