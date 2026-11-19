package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.collection.MutableObjectList;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC5895f;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.sync.C6001a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p076h7.InterfaceC5638a;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;
import p200x6.C6756f;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002fgB\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00028\u00002\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\"\u0010 J\u001f\u0010'\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b)\u0010 J\u0010\u0010*\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b*\u0010 J\u000f\u0010+\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010\u0018J\u000f\u0010,\u001a\u00020\u0007H\u0002¢\u0006\u0004\b,\u0010\u0018R+\u0010\u0006\u001a\u00028\u00002\u0006\u0010-\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010\u0005R+\u00106\u001a\u00028\u00002\u0006\u0010-\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010/\u001a\u0004\b4\u00101\"\u0004\b5\u0010\u0005R\"\u00107\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u00101\"\u0004\b:\u0010\u0005R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010;R\"\u0010<\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00070B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR+\u0010\u000b\u001a\u00020\n2\u0006\u0010-\u001a\u00020\n8G@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010L\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010K8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010=R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020#0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010^\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R \u0010a\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00070`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00070`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010b¨\u0006h"}, m5110d2 = {"Landroidx/compose/animation/core/SeekableTransitionState;", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/core/TransitionState;", "initialState", "<init>", "(Ljava/lang/Object;)V", "targetState", "Ld6/s;", "snapTo", "(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;", "", "fraction", "seekTo", "(FLjava/lang/Object;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Transition;", "transition", "transitionConfigured$animation_core_release", "(Landroidx/compose/animation/core/Transition;)V", "transitionConfigured", "transitionRemoved$animation_core_release", "()V", "transitionRemoved", "observeTotalDuration$animation_core_release", "observeTotalDuration", "onTotalDurationChanged$animation_core_release", "onTotalDurationChanged", "endAllAnimations", "runAnimations", "(Lh6/c;)Ljava/lang/Object;", "doOneFrame", "animateOneFrame", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "animation", "", "deltaPlayTimeNanos", "recalculateAnimationValue", "(Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;J)V", "waitForCompositionAfterTargetStateChange", "waitForComposition", "moveAnimationToInitialState", "seekToFraction", "<set-?>", "targetState$delegate", "Landroidx/compose/runtime/MutableState;", "getTargetState", "()Ljava/lang/Object;", "setTargetState$animation_core_release", "currentState$delegate", "getCurrentState", "setCurrentState$animation_core_release", "currentState", "composedTargetState", "Ljava/lang/Object;", "getComposedTargetState$animation_core_release", "setComposedTargetState$animation_core_release", "Landroidx/compose/animation/core/Transition;", "totalDurationNanos", "J", "getTotalDurationNanos$animation_core_release", "()J", "setTotalDurationNanos$animation_core_release", "(J)V", "Lkotlin/Function0;", "recalculateTotalDurationNanos", "Lr6/a;", "fraction$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getFraction", "()F", "setFraction", "(F)V", "Lkotlinx/coroutines/f;", "compositionContinuation", "Lkotlinx/coroutines/f;", "getCompositionContinuation$animation_core_release", "()Lkotlinx/coroutines/f;", "setCompositionContinuation$animation_core_release", "(Lkotlinx/coroutines/f;)V", "Lh7/a;", "compositionContinuationMutex", "Lh7/a;", "getCompositionContinuationMutex$animation_core_release", "()Lh7/a;", "Landroidx/compose/animation/core/MutatorMutex;", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "lastFrameTimeNanos", "Landroidx/collection/MutableObjectList;", "initialValueAnimations", "Landroidx/collection/MutableObjectList;", "currentAnimation", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "Lkotlin/Function1;", "firstFrameLambda", "Lr6/c;", "durationScale", "F", "animateOneFrameLambda", "Companion", "SeekingAnimationState", "animation-core_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt\n+ 5 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 7 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,2141:1\n85#2:2142\n113#2,2:2143\n85#2:2145\n113#2,2:2146\n79#3:2148\n112#3,2:2149\n71#4:2151\n33#5,5:2152\n52#5,5:2181\n314#6,11:2157\n314#6,11:2168\n919#7,2:2179\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n*L\n218#1:2142\n218#1:2143,2\n221#1:2145\n221#1:2146,2\n250#1:2148\n250#1:2149,2\n413#1:2151\n482#1:2152,5\n679#1:2181,5\n523#1:2157,11\n544#1:2168,11\n573#1:2179,2\n*E\n"})
/* loaded from: classes.dex */
public final class SeekableTransitionState<S> extends TransitionState<S> {

    @NotNull
    private final InterfaceC6471c animateOneFrameLambda;
    private S composedTargetState;

    @Nullable
    private InterfaceC5895f compositionContinuation;

    @NotNull
    private final InterfaceC5638a compositionContinuationMutex;

    @Nullable
    private SeekingAnimationState currentAnimation;

    /* renamed from: currentState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentState;
    private float durationScale;

    @NotNull
    private final InterfaceC6471c firstFrameLambda;

    /* renamed from: fraction$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState fraction;

    @NotNull
    private final MutableObjectList<SeekingAnimationState> initialValueAnimations;
    private long lastFrameTimeNanos;

    @NotNull
    private final MutatorMutex mutatorMutex;

    @NotNull
    private final InterfaceC6469a recalculateTotalDurationNanos;

    /* renamed from: targetState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState targetState;
    private long totalDurationNanos;

    @Nullable
    private Transition<S> transition;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final AnimationVector1D ZeroVelocity = new AnimationVector1D(0.0f);

    @NotNull
    private static final AnimationVector1D Target1 = new AnimationVector1D(1.0f);

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m5110d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$Companion;", "", "()V", "Target1", "Landroidx/compose/animation/core/AnimationVector1D;", "getTarget1", "()Landroidx/compose/animation/core/AnimationVector1D;", "ZeroVelocity", "getZeroVelocity", "animation-core_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final AnimationVector1D getTarget1() {
            return SeekableTransitionState.Target1;
        }

        @NotNull
        public final AnimationVector1D getZeroVelocity() {
            return SeekableTransitionState.ZeroVelocity;
        }

        private Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\u001a\u0010 \u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, m5110d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "", "()V", "animationSpec", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector1D;", "getAnimationSpec", "()Landroidx/compose/animation/core/VectorizedAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;)V", "animationSpecDuration", "", "getAnimationSpecDuration", "()J", "setAnimationSpecDuration", "(J)V", "durationNanos", "getDurationNanos", "setDurationNanos", "initialVelocity", "getInitialVelocity", "()Landroidx/compose/animation/core/AnimationVector1D;", "setInitialVelocity", "(Landroidx/compose/animation/core/AnimationVector1D;)V", "isComplete", "", "()Z", "setComplete", "(Z)V", "progressNanos", "getProgressNanos", "setProgressNanos", "start", "getStart", "setStart", "value", "", "getValue", "()F", "setValue", "(F)V", "toString", "", "animation-core_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class SeekingAnimationState {
        public static final int $stable = 8;

        @Nullable
        private VectorizedAnimationSpec<AnimationVector1D> animationSpec;
        private long animationSpecDuration;
        private long durationNanos;

        @Nullable
        private AnimationVector1D initialVelocity;
        private boolean isComplete;
        private long progressNanos;

        @NotNull
        private AnimationVector1D start = new AnimationVector1D(0.0f);
        private float value;

        @Nullable
        public final VectorizedAnimationSpec<AnimationVector1D> getAnimationSpec() {
            return this.animationSpec;
        }

        public final long getAnimationSpecDuration() {
            return this.animationSpecDuration;
        }

        public final long getDurationNanos() {
            return this.durationNanos;
        }

        @Nullable
        public final AnimationVector1D getInitialVelocity() {
            return this.initialVelocity;
        }

        public final long getProgressNanos() {
            return this.progressNanos;
        }

        @NotNull
        public final AnimationVector1D getStart() {
            return this.start;
        }

        public final float getValue() {
            return this.value;
        }

        /* renamed from: isComplete, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public final void setAnimationSpec(@Nullable VectorizedAnimationSpec<AnimationVector1D> vectorizedAnimationSpec) {
            this.animationSpec = vectorizedAnimationSpec;
        }

        public final void setAnimationSpecDuration(long j7) {
            this.animationSpecDuration = j7;
        }

        public final void setComplete(boolean z8) {
            this.isComplete = z8;
        }

        public final void setDurationNanos(long j7) {
            this.durationNanos = j7;
        }

        public final void setInitialVelocity(@Nullable AnimationVector1D animationVector1D) {
            this.initialVelocity = animationVector1D;
        }

        public final void setProgressNanos(long j7) {
            this.progressNanos = j7;
        }

        public final void setStart(@NotNull AnimationVector1D animationVector1D) {
            this.start = animationVector1D;
        }

        public final void setValue(float f) {
            this.value = f;
        }

        @NotNull
        public String toString() {
            return "progress nanos: " + this.progressNanos + ", animationSpec: " + this.animationSpec + ", isComplete: " + this.isComplete + ", value: " + this.value + ", start: " + this.start + ", initialVelocity: " + this.initialVelocity + ", durationNanos: " + this.durationNanos + ", animationSpecDuration: " + this.animationSpecDuration;
        }
    }

    @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {ExifInterface.LATITUDE_SOUTH, "Ld6/s;", "<anonymous>", "()V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", m5303f = "Transition.kt", m5304i = {}, m5305l = {599}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2 */
    public static final class C06942 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", m5303f = "Transition.kt", m5304i = {0}, m5305l = {2147, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 614, 668, 670}, m5306m = "invokeSuspend", m5307n = {"$this$withLock_u24default$iv"}, m5308s = {"L$0"})
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateTo$2$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,2141:1\n120#2,10:2142\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateTo$2$1\n*L\n610#1:2142,10\n*E\n"})
        /* renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
            final /* synthetic */ S $targetState;
            final /* synthetic */ Transition<S> $transition;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SeekableTransitionState<S> seekableTransitionState, S s8, Transition<S> transition, FiniteAnimationSpec<Float> finiteAnimationSpec, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.this$0 = seekableTransitionState;
                this.$targetState = s8;
                this.$transition = transition;
                this.$animationSpec = finiteAnimationSpec;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, interfaceC5631c);
            }

            /* JADX WARN: Code restructure failed: missing block: B:74:0x01ea, code lost:
            
                if (r2.waitForComposition(r18) != r0) goto L76;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 508
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.C06942.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06942(Transition<S> transition, SeekableTransitionState<S> seekableTransitionState, S s8, FiniteAnimationSpec<Float> finiteAnimationSpec, InterfaceC5631c<? super C06942> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.$transition = transition;
            this.this$0 = seekableTransitionState;
            this.$targetState = s8;
            this.$animationSpec = finiteAnimationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C06942(this.$transition, this.this$0, this.$targetState, this.$animationSpec, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C06942) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, null);
                this.label = 1;
                if (AbstractC6014x.m5637h(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            this.$transition.onTransitionEnd$animation_core_release();
            return C5443s.f8405a;
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.animation.core.SeekableTransitionState", m5303f = "Transition.kt", m5304i = {0, 1}, m5305l = {353, 356}, m5306m = "runAnimations", m5307n = {"this", "this"}, m5308s = {"L$0", "L$0"})
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 */
    public static final class C06951 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06951(SeekableTransitionState<S> seekableTransitionState, InterfaceC5631c<? super C06951> interfaceC5631c) {
            super(interfaceC5631c);
            this.this$0 = seekableTransitionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.runAnimations(this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {ExifInterface.LATITUDE_SOUTH, "Ld6/s;", "<anonymous>", "()V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", m5303f = "Transition.kt", m5304i = {}, m5305l = {488}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3 */
    public static final class C06963 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ float $fraction;
        final /* synthetic */ S $oldTargetState;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", m5303f = "Transition.kt", m5304i = {}, m5305l = {TypedValues.PositionType.TYPE_POSITION_TYPE}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ float $fraction;
            final /* synthetic */ S $oldTargetState;
            final /* synthetic */ S $targetState;
            final /* synthetic */ Transition<S> $transition;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", m5303f = "Transition.kt", m5304i = {}, m5305l = {TypedValues.PositionType.TYPE_PERCENT_X}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C68431 extends SuspendLambda implements InterfaceC6473e {
                int label;
                final /* synthetic */ SeekableTransitionState<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C68431(SeekableTransitionState<S> seekableTransitionState, InterfaceC5631c<? super C68431> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = seekableTransitionState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new C68431(this.this$0, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        SeekableTransitionState<S> seekableTransitionState = this.this$0;
                        this.label = 1;
                        if (seekableTransitionState.runAnimations(this) == coroutineSingletons) {
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
                    return ((C68431) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(S s8, S s9, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$targetState = s8;
                this.$oldTargetState = s9;
                this.this$0 = seekableTransitionState;
                this.$transition = transition;
                this.$fraction = f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, interfaceC5631c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                C5443s c5443s = C5443s.f8405a;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                    if (AbstractC5830k.m5325b(this.$targetState, this.$oldTargetState)) {
                        ((SeekableTransitionState) this.this$0).currentAnimation = null;
                        if (AbstractC5830k.m5325b(this.this$0.getCurrentState(), this.$targetState)) {
                            return c5443s;
                        }
                    } else {
                        this.this$0.moveAnimationToInitialState();
                    }
                    if (!AbstractC5830k.m5325b(this.$targetState, this.$oldTargetState)) {
                        this.$transition.updateTarget$animation_core_release(this.$targetState);
                        this.$transition.setPlayTimeNanos(0L);
                        this.this$0.setTargetState$animation_core_release(this.$targetState);
                        this.$transition.resetAnimationFraction$animation_core_release(this.$fraction);
                    }
                    this.this$0.setFraction(this.$fraction);
                    if (((SeekableTransitionState) this.this$0).initialValueAnimations.isNotEmpty()) {
                        AbstractC6014x.m5651v(interfaceC6009v, null, null, new C68431(this.this$0, null), 3);
                    } else {
                        ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = Long.MIN_VALUE;
                    }
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    this.label = 1;
                    if (seekableTransitionState.waitForCompositionAfterTargetStateChange(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                }
                this.this$0.seekToFraction();
                return c5443s;
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06963(S s8, S s9, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f, InterfaceC5631c<? super C06963> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.$targetState = s8;
            this.$oldTargetState = s9;
            this.this$0 = seekableTransitionState;
            this.$transition = transition;
            this.$fraction = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C06963(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C06963) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, null);
                this.label = 1;
                if (AbstractC6014x.m5637h(anonymousClass1, this) == coroutineSingletons) {
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

    @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {ExifInterface.LATITUDE_SOUTH, "Ld6/s;", "<anonymous>", "()V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", m5303f = "Transition.kt", m5304i = {}, m5305l = {457}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$snapTo$2 */
    public static final class C06972 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06972(SeekableTransitionState<S> seekableTransitionState, S s8, Transition<S> transition, InterfaceC5631c<? super C06972> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = seekableTransitionState;
            this.$targetState = s8;
            this.$transition = transition;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C06972(this.this$0, this.$targetState, this.$transition, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C06972) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                this.this$0.endAllAnimations();
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = Long.MIN_VALUE;
                this.this$0.setFraction(0.0f);
                S s8 = this.$targetState;
                float f = AbstractC5830k.m5325b(s8, this.this$0.getCurrentState()) ? -4.0f : AbstractC5830k.m5325b(s8, this.this$0.getTargetState()) ? -5.0f : -3.0f;
                this.$transition.updateTarget$animation_core_release(this.$targetState);
                this.$transition.setPlayTimeNanos(0L);
                this.this$0.setTargetState$animation_core_release(this.$targetState);
                this.this$0.setFraction(0.0f);
                this.this$0.setCurrentState$animation_core_release(this.$targetState);
                this.$transition.resetAnimationFraction$animation_core_release(f);
                if (f == -3.0f) {
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    this.label = 1;
                    if (seekableTransitionState.waitForCompositionAfterTargetStateChange(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            this.$transition.onTransitionEnd$animation_core_release();
            return C5443s.f8405a;
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.animation.core.SeekableTransitionState", m5303f = "Transition.kt", m5304i = {0, 0, 1, 1}, m5305l = {543, 2142}, m5306m = "waitForComposition", m5307n = {"this", "expectedState", "this", "expectedState"}, m5308s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 */
    public static final class C06981 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06981(SeekableTransitionState<S> seekableTransitionState, InterfaceC5631c<? super C06981> interfaceC5631c) {
            super(interfaceC5631c);
            this.this$0 = seekableTransitionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.waitForComposition(this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.animation.core.SeekableTransitionState", m5303f = "Transition.kt", m5304i = {0, 0, 1, 1}, m5305l = {519, 2142}, m5306m = "waitForCompositionAfterTargetStateChange", m5307n = {"this", "expectedState", "this", "expectedState"}, m5308s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 */
    public static final class C06991 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06991(SeekableTransitionState<S> seekableTransitionState, InterfaceC5631c<? super C06991> interfaceC5631c) {
            super(interfaceC5631c);
            this.this$0 = seekableTransitionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.waitForCompositionAfterTargetStateChange(this);
        }
    }

    public SeekableTransitionState(S s8) {
        super(null);
        this.targetState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s8, null, 2, null);
        this.currentState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s8, null, 2, null);
        this.composedTargetState = s8;
        this.recalculateTotalDurationNanos = new InterfaceC6469a(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$recalculateTotalDurationNanos$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m6680invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m6680invoke() {
                SeekableTransitionState<S> seekableTransitionState = this.this$0;
                Transition transition = ((SeekableTransitionState) seekableTransitionState).transition;
                seekableTransitionState.setTotalDurationNanos$animation_core_release(transition != null ? transition.getTotalDurationNanos() : 0L);
            }
        };
        this.fraction = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.compositionContinuationMutex = new C6001a();
        this.mutatorMutex = new MutatorMutex();
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        this.initialValueAnimations = new MutableObjectList<>(0, 1, null);
        this.firstFrameLambda = new InterfaceC6471c(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$firstFrameLambda$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C5443s.f8405a;
            }

            public final void invoke(long j7) {
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = j7;
            }
        };
        this.animateOneFrameLambda = new InterfaceC6471c(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$animateOneFrameLambda$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C5443s.f8405a;
            }

            public final void invoke(long j7) {
                long j8 = j7 - ((SeekableTransitionState) this.this$0).lastFrameTimeNanos;
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = j7;
                long jM6242r = AbstractC6600a.m6242r(j8 / ((SeekableTransitionState) this.this$0).durationScale);
                if (((SeekableTransitionState) this.this$0).initialValueAnimations.isNotEmpty()) {
                    MutableObjectList mutableObjectList = ((SeekableTransitionState) this.this$0).initialValueAnimations;
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    Object[] objArr = mutableObjectList.content;
                    int i = mutableObjectList._size;
                    int i8 = 0;
                    for (int i9 = 0; i9 < i; i9++) {
                        SeekableTransitionState.SeekingAnimationState seekingAnimationState = (SeekableTransitionState.SeekingAnimationState) objArr[i9];
                        seekableTransitionState.recalculateAnimationValue(seekingAnimationState, jM6242r);
                        seekingAnimationState.setComplete(true);
                    }
                    Transition transition = ((SeekableTransitionState) this.this$0).transition;
                    if (transition != null) {
                        transition.updateInitialValues$animation_core_release();
                    }
                    MutableObjectList mutableObjectList2 = ((SeekableTransitionState) this.this$0).initialValueAnimations;
                    int i10 = mutableObjectList2._size;
                    Object[] objArr2 = mutableObjectList2.content;
                    C6756f c6756fM5260N = AbstractC5806u.m5260N(0, i10);
                    int i11 = c6756fM5260N.f11420a;
                    int i12 = c6756fM5260N.f11421b;
                    if (i11 <= i12) {
                        while (true) {
                            objArr2[i11 - i8] = objArr2[i11];
                            if (((SeekableTransitionState.SeekingAnimationState) objArr2[i11]).getIsComplete()) {
                                i8++;
                            }
                            if (i11 == i12) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    AbstractC5802q.m5186M(null, objArr2, i10 - i8, i10);
                    mutableObjectList2._size -= i8;
                }
                SeekableTransitionState.SeekingAnimationState seekingAnimationState2 = ((SeekableTransitionState) this.this$0).currentAnimation;
                if (seekingAnimationState2 != null) {
                    seekingAnimationState2.setDurationNanos(this.this$0.getTotalDurationNanos());
                    this.this$0.recalculateAnimationValue(seekingAnimationState2, jM6242r);
                    this.this$0.setFraction(seekingAnimationState2.getValue());
                    if (seekingAnimationState2.getValue() == 1.0f) {
                        ((SeekableTransitionState) this.this$0).currentAnimation = null;
                    }
                    this.this$0.seekToFraction();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateOneFrame(InterfaceC5631c<? super C5443s> interfaceC5631c) {
        float durationScale = SuspendAnimationKt.getDurationScale(interfaceC5631c.getContext());
        C5443s c5443s = C5443s.f8405a;
        if (durationScale <= 0.0f) {
            endAllAnimations();
            return c5443s;
        }
        this.durationScale = durationScale;
        Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.animateOneFrameLambda, interfaceC5631c);
        return objWithFrameNanos == CoroutineSingletons.COROUTINE_SUSPENDED ? objWithFrameNanos : c5443s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SeekableTransitionState seekableTransitionState, Object obj, FiniteAnimationSpec finiteAnimationSpec, InterfaceC5631c interfaceC5631c, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = null;
        }
        return seekableTransitionState.animateTo(obj, finiteAnimationSpec, interfaceC5631c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doOneFrame(InterfaceC5631c<? super C5443s> interfaceC5631c) {
        long j7 = this.lastFrameTimeNanos;
        C5443s c5443s = C5443s.f8405a;
        if (j7 == Long.MIN_VALUE) {
            Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.firstFrameLambda, interfaceC5631c);
            return objWithFrameNanos == CoroutineSingletons.COROUTINE_SUSPENDED ? objWithFrameNanos : c5443s;
        }
        Object objAnimateOneFrame = animateOneFrame(interfaceC5631c);
        return objAnimateOneFrame == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateOneFrame : c5443s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAllAnimations() {
        Transition<S> transition = this.transition;
        if (transition != null) {
            transition.clearInitialAnimations$animation_core_release();
        }
        this.initialValueAnimations.clear();
        if (this.currentAnimation != null) {
            this.currentAnimation = null;
            setFraction(1.0f);
            seekToFraction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveAnimationToInitialState() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        SeekingAnimationState seekingAnimationState = this.currentAnimation;
        if (seekingAnimationState == null) {
            if (this.totalDurationNanos <= 0 || getFraction() == 1.0f || AbstractC5830k.m5325b(getCurrentState(), getTargetState())) {
                seekingAnimationState = null;
            } else {
                seekingAnimationState = new SeekingAnimationState();
                seekingAnimationState.setValue(getFraction());
                long j7 = this.totalDurationNanos;
                seekingAnimationState.setDurationNanos(j7);
                seekingAnimationState.setAnimationSpecDuration(AbstractC6600a.m6242r((1.0d - getFraction()) * j7));
                seekingAnimationState.getStart().set$animation_core_release(0, getFraction());
            }
        }
        if (seekingAnimationState != null) {
            seekingAnimationState.setDurationNanos(this.totalDurationNanos);
            this.initialValueAnimations.add(seekingAnimationState);
            transition.setInitialAnimations$animation_core_release(seekingAnimationState);
        }
        this.currentAnimation = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recalculateAnimationValue(SeekingAnimationState animation, long deltaPlayTimeNanos) {
        long progressNanos = animation.getProgressNanos() + deltaPlayTimeNanos;
        animation.setProgressNanos(progressNanos);
        long animationSpecDuration = animation.getAnimationSpecDuration();
        if (progressNanos >= animationSpecDuration) {
            animation.setValue(1.0f);
            return;
        }
        VectorizedAnimationSpec<AnimationVector1D> animationSpec = animation.getAnimationSpec();
        if (animationSpec == null) {
            float f = progressNanos / animationSpecDuration;
            animation.setValue((f * 1.0f) + ((1 - f) * animation.getStart().get$animation_core_release(0)));
            return;
        }
        AnimationVector1D start = animation.getStart();
        AnimationVector1D animationVector1D = Target1;
        AnimationVector1D initialVelocity = animation.getInitialVelocity();
        if (initialVelocity == null) {
            initialVelocity = ZeroVelocity;
        }
        animation.setValue(AbstractC5806u.m5273l(((AnimationVector1D) animationSpec.getValueFromNanos(progressNanos, start, animationVector1D, initialVelocity)).get$animation_core_release(0), 0.0f, 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r11, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runAnimations(p075h6.InterfaceC5631c<? super p045d6.C5443s> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.compose.animation.core.SeekableTransitionState.C06951
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = (androidx.compose.animation.core.SeekableTransitionState.C06951) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            d6.s r7 = p045d6.C5443s.f8405a
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            goto L33
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L33:
            java.lang.Object r2 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r2 = (androidx.compose.animation.core.SeekableTransitionState) r2
            kotlin.AbstractC5774b.m5119b(r11)
            goto L72
        L3b:
            kotlin.AbstractC5774b.m5119b(r11)
            androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState> r11 = r10.initialValueAnimations
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L4b
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r11 = r10.currentAnimation
            if (r11 != 0) goto L4b
            return r7
        L4b:
            h6.h r11 = r0.getContext()
            float r11 = androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(r11)
            r2 = 0
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L5e
            r10.endAllAnimations()
            r10.lastFrameTimeNanos = r5
            return r7
        L5e:
            long r8 = r10.lastFrameTimeNanos
            int r11 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r11 != 0) goto L71
            r6.c r11 = r10.firstFrameLambda
            r0.L$0 = r10
            r0.label = r4
            java.lang.Object r11 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r11, r0)
            if (r11 != r1) goto L71
            goto L8c
        L71:
            r2 = r10
        L72:
            androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState> r11 = r2.initialValueAnimations
            boolean r11 = r11.isNotEmpty()
            if (r11 != 0) goto L82
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r11 = r2.currentAnimation
            if (r11 == 0) goto L7f
            goto L82
        L7f:
            r2.lastFrameTimeNanos = r5
            return r7
        L82:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r11 = r2.animateOneFrame(r0)
            if (r11 != r1) goto L72
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.runAnimations(h6.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object seekTo$default(SeekableTransitionState seekableTransitionState, float f, Object obj, InterfaceC5631c interfaceC5631c, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        return seekableTransitionState.seekTo(f, obj, interfaceC5631c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void seekToFraction() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        transition.seekAnimations$animation_core_release(AbstractC6600a.m6242r(getFraction() * transition.getTotalDurationNanos()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFraction(float f) {
        this.fraction.setFloatValue(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForComposition(p075h6.InterfaceC5631c<? super p045d6.C5443s> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.animation.core.SeekableTransitionState.C06981
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = (androidx.compose.animation.core.SeekableTransitionState.C06981) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r0 = (androidx.compose.animation.core.SeekableTransitionState) r0
            kotlin.AbstractC5774b.m5119b(r7)
            goto L82
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.L$1
            java.lang.Object r5 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r5 = (androidx.compose.animation.core.SeekableTransitionState) r5
            kotlin.AbstractC5774b.m5119b(r7)
            r7 = r2
            goto L5c
        L43:
            kotlin.AbstractC5774b.m5119b(r7)
            java.lang.Object r7 = r6.getTargetState()
            h7.a r2 = r6.compositionContinuationMutex
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            kotlinx.coroutines.sync.a r2 = (kotlinx.coroutines.sync.C6001a) r2
            java.lang.Object r2 = r2.m5615e(r0)
            if (r2 != r1) goto L5b
            goto L7e
        L5b:
            r5 = r6
        L5c:
            r0.L$0 = r5
            r0.L$1 = r7
            r0.label = r3
            kotlinx.coroutines.g r2 = new kotlinx.coroutines.g
            h6.c r0 = p185v7.AbstractC6683l.m6374n(r0)
            r2.<init>(r4, r0)
            r2.m5584u()
            r5.setCompositionContinuation$animation_core_release(r2)
            h7.a r0 = r5.getCompositionContinuationMutex()
            p076h7.AbstractC5640c.m4969a(r0)
            java.lang.Object r0 = r2.m5583t()
            if (r0 != r1) goto L7f
        L7e:
            return r1
        L7f:
            r1 = r7
            r7 = r0
            r0 = r5
        L82:
            boolean r7 = kotlin.jvm.internal.AbstractC5830k.m5325b(r7, r1)
            if (r7 == 0) goto L8b
            d6.s r7 = p045d6.C5443s.f8405a
            return r7
        L8b:
            r1 = -9223372036854775808
            r0.lastFrameTimeNanos = r1
            java.util.concurrent.CancellationException r7 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "targetState while waiting for composition"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.waitForComposition(h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForCompositionAfterTargetStateChange(p075h6.InterfaceC5631c<? super p045d6.C5443s> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.animation.core.SeekableTransitionState.C06991
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = (androidx.compose.animation.core.SeekableTransitionState.C06991) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r0 = (androidx.compose.animation.core.SeekableTransitionState) r0
            kotlin.AbstractC5774b.m5119b(r7)
            goto L90
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.L$1
            java.lang.Object r5 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r5 = (androidx.compose.animation.core.SeekableTransitionState) r5
            kotlin.AbstractC5774b.m5119b(r7)
            r7 = r2
            goto L5c
        L43:
            kotlin.AbstractC5774b.m5119b(r7)
            java.lang.Object r7 = r6.getTargetState()
            h7.a r2 = r6.compositionContinuationMutex
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            kotlinx.coroutines.sync.a r2 = (kotlinx.coroutines.sync.C6001a) r2
            java.lang.Object r2 = r2.m5615e(r0)
            if (r2 != r1) goto L5b
            goto L8c
        L5b:
            r5 = r6
        L5c:
            S r2 = r5.composedTargetState
            boolean r2 = kotlin.jvm.internal.AbstractC5830k.m5325b(r7, r2)
            if (r2 == 0) goto L6a
            h7.a r7 = r5.compositionContinuationMutex
            p076h7.AbstractC5640c.m4969a(r7)
            goto L96
        L6a:
            r0.L$0 = r5
            r0.L$1 = r7
            r0.label = r3
            kotlinx.coroutines.g r2 = new kotlinx.coroutines.g
            h6.c r0 = p185v7.AbstractC6683l.m6374n(r0)
            r2.<init>(r4, r0)
            r2.m5584u()
            r5.setCompositionContinuation$animation_core_release(r2)
            h7.a r0 = r5.getCompositionContinuationMutex()
            p076h7.AbstractC5640c.m4969a(r0)
            java.lang.Object r0 = r2.m5583t()
            if (r0 != r1) goto L8d
        L8c:
            return r1
        L8d:
            r1 = r7
            r7 = r0
            r0 = r5
        L90:
            boolean r2 = kotlin.jvm.internal.AbstractC5830k.m5325b(r7, r1)
            if (r2 == 0) goto L99
        L96:
            d6.s r7 = p045d6.C5443s.f8405a
            return r7
        L99:
            r2 = -9223372036854775808
            r0.lastFrameTimeNanos = r2
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "snapTo() was canceled because state was changed to "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r7 = " instead of "
            r2.append(r7)
            r2.append(r1)
            java.lang.String r7 = r2.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.waitForCompositionAfterTargetStateChange(h6.c):java.lang.Object");
    }

    @Nullable
    public final Object animateTo(S s8, @Nullable FiniteAnimationSpec<Float> finiteAnimationSpec, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objMutate$default;
        Transition<S> transition = this.transition;
        C5443s c5443s = C5443s.f8405a;
        return (transition != null && (objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C06942(transition, this, s8, finiteAnimationSpec, null), interfaceC5631c, 1, null)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objMutate$default : c5443s;
    }

    public final S getComposedTargetState$animation_core_release() {
        return this.composedTargetState;
    }

    @Nullable
    /* renamed from: getCompositionContinuation$animation_core_release, reason: from getter */
    public final InterfaceC5895f getCompositionContinuation() {
        return this.compositionContinuation;
    }

    @NotNull
    /* renamed from: getCompositionContinuationMutex$animation_core_release, reason: from getter */
    public final InterfaceC5638a getCompositionContinuationMutex() {
        return this.compositionContinuationMutex;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return (S) this.currentState.getValue();
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d)
    public final float getFraction() {
        return this.fraction.getFloatValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getTargetState() {
        return (S) this.targetState.getValue();
    }

    /* renamed from: getTotalDurationNanos$animation_core_release, reason: from getter */
    public final long getTotalDurationNanos() {
        return this.totalDurationNanos;
    }

    public final void observeTotalDuration$animation_core_release() {
        TransitionKt.getSeekableStateObserver().observeReads(this, TransitionKt.SeekableTransitionStateTotalDurationChanged, this.recalculateTotalDurationNanos);
    }

    public final void onTotalDurationChanged$animation_core_release() {
        long j7 = this.totalDurationNanos;
        observeTotalDuration$animation_core_release();
        long j8 = this.totalDurationNanos;
        if (j7 != j8) {
            SeekingAnimationState seekingAnimationState = this.currentAnimation;
            if (seekingAnimationState == null) {
                if (j8 != 0) {
                    seekToFraction();
                    return;
                }
                return;
            }
            long progressNanos = seekingAnimationState.getProgressNanos();
            long j9 = this.totalDurationNanos;
            if (progressNanos > j9) {
                endAllAnimations();
                return;
            }
            seekingAnimationState.setDurationNanos(j9);
            if (seekingAnimationState.getAnimationSpec() == null) {
                seekingAnimationState.setAnimationSpecDuration(AbstractC6600a.m6242r((1.0d - seekingAnimationState.getStart().get$animation_core_release(0)) * this.totalDurationNanos));
            }
        }
    }

    @Nullable
    public final Object seekTo(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float f, S s8, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        boolean z8 = false;
        if (0.0f <= f && f <= 1.0f) {
            z8 = true;
        }
        if (!z8) {
            PreconditionsKt.throwIllegalArgumentException("Expecting fraction between 0 and 1. Got " + f);
        }
        Transition<S> transition = this.transition;
        C5443s c5443s = C5443s.f8405a;
        if (transition == null) {
            return c5443s;
        }
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C06963(s8, getTargetState(), this, transition, f, null), interfaceC5631c, 1, null);
        return objMutate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objMutate$default : c5443s;
    }

    public final void setComposedTargetState$animation_core_release(S s8) {
        this.composedTargetState = s8;
    }

    public final void setCompositionContinuation$animation_core_release(@Nullable InterfaceC5895f interfaceC5895f) {
        this.compositionContinuation = interfaceC5895f;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setCurrentState$animation_core_release(S s8) {
        this.currentState.setValue(s8);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setTargetState$animation_core_release(S s8) {
        this.targetState.setValue(s8);
    }

    public final void setTotalDurationNanos$animation_core_release(long j7) {
        this.totalDurationNanos = j7;
    }

    @Nullable
    public final Object snapTo(S s8, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objMutate$default;
        Transition<S> transition = this.transition;
        C5443s c5443s = C5443s.f8405a;
        return transition == null ? c5443s : (!(AbstractC5830k.m5325b(getCurrentState(), s8) && AbstractC5830k.m5325b(getTargetState(), s8)) && (objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C06972(this, s8, transition, null), interfaceC5631c, 1, null)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objMutate$default : c5443s;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(@NotNull Transition<S> transition) {
        Transition<S> transition2 = this.transition;
        if (!(transition2 == null || AbstractC5830k.m5325b(transition, transition2))) {
            PreconditionsKt.throwIllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition);
        }
        this.transition = transition;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionRemoved$animation_core_release() {
        this.transition = null;
        TransitionKt.getSeekableStateObserver().clear(this);
    }
}
