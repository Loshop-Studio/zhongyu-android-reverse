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
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.color.utilities.Contrast;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 X*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002XYB\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010<\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010=J*\u0010>\u001a\u00020\b2\b\b\u0002\u00101\u001a\u00028\u00002\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010@H\u0086@¢\u0006\u0002\u0010AJ\u000e\u0010B\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010=J\b\u0010C\u001a\u00020\bH\u0002J\b\u0010D\u001a\u00020\bH\u0002J\r\u0010E\u001a\u00020\bH\u0000¢\u0006\u0002\bFJ\r\u0010G\u001a\u00020\bH\u0000¢\u0006\u0002\bHJ\u0018\u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\u00192\u0006\u0010K\u001a\u00020\u0007H\u0002J\u000e\u0010L\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010=J\"\u0010M\u001a\u00020\b2\b\b\u0001\u0010#\u001a\u00020!2\b\b\u0002\u00101\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010NJ\b\u0010O\u001a\u00020\bH\u0002J\u0016\u0010P\u001a\u00020\b2\u0006\u00101\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010QJ\u001b\u0010R\u001a\u00020\b2\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;H\u0010¢\u0006\u0002\bSJ\r\u0010T\u001a\u00020\bH\u0010¢\u0006\u0002\bUJ\u000e\u0010V\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010=J\u000e\u0010W\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010=R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u00028\u0000X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\u0004R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010#\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020!8G@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\b00X\u0082\u0004¢\u0006\u0002\n\u0000R+\u00101\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u001f\u001a\u0004\b2\u0010\u000b\"\u0004\b3\u0010\u0004R\u001a\u00105\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010:\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Z"}, m13558d2 = {"Landroidx/compose/animation/core/SeekableTransitionState;", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/core/TransitionState;", "initialState", "(Ljava/lang/Object;)V", "animateOneFrameLambda", "Lkotlin/Function1;", "", "", "composedTargetState", "getComposedTargetState$animation_core_release", "()Ljava/lang/Object;", "setComposedTargetState$animation_core_release", "Ljava/lang/Object;", "compositionContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "getCompositionContinuation$animation_core_release", "()Lkotlinx/coroutines/CancellableContinuation;", "setCompositionContinuation$animation_core_release", "(Lkotlinx/coroutines/CancellableContinuation;)V", "compositionContinuationMutex", "Lkotlinx/coroutines/sync/Mutex;", "getCompositionContinuationMutex$animation_core_release", "()Lkotlinx/coroutines/sync/Mutex;", "currentAnimation", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "<set-?>", "currentState", "getCurrentState", "setCurrentState$animation_core_release", "currentState$delegate", "Landroidx/compose/runtime/MutableState;", "durationScale", "", "firstFrameLambda", "fraction", "getFraction", "()F", "setFraction", "(F)V", "fraction$delegate", "Landroidx/compose/runtime/MutableFloatState;", "initialValueAnimations", "Landroidx/collection/MutableObjectList;", "lastFrameTimeNanos", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "recalculateTotalDurationNanos", "Lkotlin/Function0;", "targetState", "getTargetState", "setTargetState$animation_core_release", "targetState$delegate", "totalDurationNanos", "getTotalDurationNanos$animation_core_release", "()J", "setTotalDurationNanos$animation_core_release", "(J)V", "transition", "Landroidx/compose/animation/core/Transition;", "animateOneFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doOneFrame", "endAllAnimations", "moveAnimationToInitialState", "observeTotalDuration", "observeTotalDuration$animation_core_release", "onTotalDurationChanged", "onTotalDurationChanged$animation_core_release", "recalculateAnimationValue", "animation", "deltaPlayTimeNanos", "runAnimations", "seekTo", "(FLjava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "seekToFraction", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionConfigured", "transitionConfigured$animation_core_release", "transitionRemoved", "transitionRemoved$animation_core_release", "waitForComposition", "waitForCompositionAfterTargetStateChange", "Companion", "SeekingAnimationState", "animation-core_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt\n+ 5 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 7 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,2141:1\n85#2:2142\n113#2,2:2143\n85#2:2145\n113#2,2:2146\n79#3:2148\n112#3,2:2149\n71#4:2151\n33#5,5:2152\n52#5,5:2181\n314#6,11:2157\n314#6,11:2168\n919#7,2:2179\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n*L\n218#1:2142\n218#1:2143,2\n221#1:2145\n221#1:2146,2\n250#1:2148\n250#1:2149,2\n413#1:2151\n482#1:2152,5\n679#1:2181,5\n523#1:2157,11\n544#1:2168,11\n573#1:2179,2\n*E\n"})
/* loaded from: classes.dex */
public final class SeekableTransitionState<S> extends TransitionState<S> {
    private final Function1<Long, Unit> animateOneFrameLambda;
    private S composedTargetState;
    private CancellableContinuation<? super S> compositionContinuation;
    private final Mutex compositionContinuationMutex;
    private SeekingAnimationState currentAnimation;

    /* renamed from: currentState$delegate, reason: from kotlin metadata */
    private final MutableState currentState;
    private float durationScale;
    private final Function1<Long, Unit> firstFrameLambda;

    /* renamed from: fraction$delegate, reason: from kotlin metadata */
    private final MutableFloatState fraction;
    private final MutableObjectList<SeekingAnimationState> initialValueAnimations;
    private long lastFrameTimeNanos;
    private final MutatorMutex mutatorMutex;
    private final Function0<Unit> recalculateTotalDurationNanos;

    /* renamed from: targetState$delegate, reason: from kotlin metadata */
    private final MutableState targetState;
    private long totalDurationNanos;
    private Transition<S> transition;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final AnimationVector1D ZeroVelocity = new AnimationVector1D(0.0f);
    private static final AnimationVector1D Target1 = new AnimationVector1D(1.0f);

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m13558d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$Companion;", "", "()V", "Target1", "Landroidx/compose/animation/core/AnimationVector1D;", "getTarget1", "()Landroidx/compose/animation/core/AnimationVector1D;", "ZeroVelocity", "getZeroVelocity", "animation-core_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AnimationVector1D getTarget1() {
            return SeekableTransitionState.Target1;
        }

        public final AnimationVector1D getZeroVelocity() {
            return SeekableTransitionState.ZeroVelocity;
        }

        private Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\u001a\u0010 \u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, m13558d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "", "()V", "animationSpec", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector1D;", "getAnimationSpec", "()Landroidx/compose/animation/core/VectorizedAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;)V", "animationSpecDuration", "", "getAnimationSpecDuration", "()J", "setAnimationSpecDuration", "(J)V", "durationNanos", "getDurationNanos", "setDurationNanos", "initialVelocity", "getInitialVelocity", "()Landroidx/compose/animation/core/AnimationVector1D;", "setInitialVelocity", "(Landroidx/compose/animation/core/AnimationVector1D;)V", "isComplete", "", "()Z", "setComplete", "(Z)V", "progressNanos", "getProgressNanos", "setProgressNanos", "start", "getStart", "setStart", "value", "", "getValue", "()F", "setValue", "(F)V", "toString", "", "animation-core_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class SeekingAnimationState {
        public static final int $stable = 8;
        private VectorizedAnimationSpec<AnimationVector1D> animationSpec;
        private long animationSpecDuration;
        private long durationNanos;
        private AnimationVector1D initialVelocity;
        private boolean isComplete;
        private long progressNanos;
        private AnimationVector1D start = new AnimationVector1D(0.0f);
        private float value;

        public final VectorizedAnimationSpec<AnimationVector1D> getAnimationSpec() {
            return this.animationSpec;
        }

        public final long getAnimationSpecDuration() {
            return this.animationSpecDuration;
        }

        public final long getDurationNanos() {
            return this.durationNanos;
        }

        public final AnimationVector1D getInitialVelocity() {
            return this.initialVelocity;
        }

        public final long getProgressNanos() {
            return this.progressNanos;
        }

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

        public final void setAnimationSpec(VectorizedAnimationSpec<AnimationVector1D> vectorizedAnimationSpec) {
            this.animationSpec = vectorizedAnimationSpec;
        }

        public final void setAnimationSpecDuration(long j10) {
            this.animationSpecDuration = j10;
        }

        public final void setComplete(boolean z9) {
            this.isComplete = z9;
        }

        public final void setDurationNanos(long j10) {
            this.durationNanos = j10;
        }

        public final void setInitialVelocity(AnimationVector1D animationVector1D) {
            this.initialVelocity = animationVector1D;
        }

        public final void setProgressNanos(long j10) {
            this.progressNanos = j10;
        }

        public final void setStart(AnimationVector1D animationVector1D) {
            this.start = animationVector1D;
        }

        public final void setValue(float f10) {
            this.value = f10;
        }

        public String toString() {
            return "progress nanos: " + this.progressNanos + ", animationSpec: " + this.animationSpec + ", isComplete: " + this.isComplete + ", value: " + this.value + ", start: " + this.start + ", initialVelocity: " + this.initialVelocity + ", durationNanos: " + this.durationNanos + ", animationSpecDuration: " + this.animationSpecDuration;
        }
    }

    @Metadata(m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", m13596f = "Transition.kt", m13597i = {}, m13598l = {599}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2 */
    public static final class C10682 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        @Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", m13596f = "Transition.kt", m13597i = {0}, m13598l = {2147, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 614, 668, 670}, m13599m = "invokeSuspend", m13600n = {"$this$withLock_u24default$iv"}, m13601s = {"L$0"})
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateTo$2$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,2141:1\n120#2,10:2142\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateTo$2$1\n*L\n610#1:2142,10\n*E\n"})
        /* renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
            final /* synthetic */ S $targetState;
            final /* synthetic */ Transition<S> $transition;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SeekableTransitionState<S> seekableTransitionState, S s10, Transition<S> transition, FiniteAnimationSpec<Float> finiteAnimationSpec, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = seekableTransitionState;
                this.$targetState = s10;
                this.$transition = transition;
                this.$animationSpec = finiteAnimationSpec;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:74:0x01e8, code lost:
            
                if (r2.waitForComposition(r18) != r0) goto L76;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 504
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.C10682.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10682(Transition<S> transition, SeekableTransitionState<S> seekableTransitionState, S s10, FiniteAnimationSpec<Float> finiteAnimationSpec, Continuation<? super C10682> continuation) {
            super(1, continuation);
            this.$transition = transition;
            this.this$0 = seekableTransitionState;
            this.$targetState = s10;
            this.$animationSpec = finiteAnimationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C10682(this.$transition, this.this$0, this.$targetState, this.$animationSpec, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$transition.onTransitionEnd$animation_core_release();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C10682) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.animation.core.SeekableTransitionState", m13596f = "Transition.kt", m13597i = {0, 1}, m13598l = {353, 356}, m13599m = "runAnimations", m13600n = {"this", "this"}, m13601s = {"L$0", "L$0"})
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 */
    public static final class C10691 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10691(SeekableTransitionState<S> seekableTransitionState, Continuation<? super C10691> continuation) {
            super(continuation);
            this.this$0 = seekableTransitionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.runAnimations(this);
        }
    }

    @Metadata(m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", m13596f = "Transition.kt", m13597i = {}, m13598l = {488}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3 */
    public static final class C10703 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ float $fraction;
        final /* synthetic */ S $oldTargetState;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        @Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", m13596f = "Transition.kt", m13597i = {}, m13598l = {TypedValues.PositionType.TYPE_POSITION_TYPE}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ float $fraction;
            final /* synthetic */ S $oldTargetState;
            final /* synthetic */ S $targetState;
            final /* synthetic */ Transition<S> $transition;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            @Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
            @DebugMetadata(m13595c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", m13596f = "Transition.kt", m13597i = {}, m13598l = {TypedValues.PositionType.TYPE_PERCENT_X}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C100931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ SeekableTransitionState<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C100931(SeekableTransitionState<S> seekableTransitionState, Continuation<? super C100931> continuation) {
                    super(2, continuation);
                    this.this$0 = seekableTransitionState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C100931(this.this$0, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i10 = this.label;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        SeekableTransitionState<S> seekableTransitionState = this.this$0;
                        this.label = 1;
                        if (seekableTransitionState.runAnimations(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C100931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(S s10, S s11, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f10, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$targetState = s10;
                this.$oldTargetState = s11;
                this.this$0 = seekableTransitionState;
                this.$transition = transition;
                this.$fraction = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    if (Intrinsics.areEqual(this.$targetState, this.$oldTargetState)) {
                        ((SeekableTransitionState) this.this$0).currentAnimation = null;
                        if (Intrinsics.areEqual(this.this$0.getCurrentState(), this.$targetState)) {
                            return Unit.INSTANCE;
                        }
                    } else {
                        this.this$0.moveAnimationToInitialState();
                    }
                    if (!Intrinsics.areEqual(this.$targetState, this.$oldTargetState)) {
                        this.$transition.updateTarget$animation_core_release(this.$targetState);
                        this.$transition.setPlayTimeNanos(0L);
                        this.this$0.setTargetState$animation_core_release(this.$targetState);
                        this.$transition.resetAnimationFraction$animation_core_release(this.$fraction);
                    }
                    this.this$0.setFraction(this.$fraction);
                    if (((SeekableTransitionState) this.this$0).initialValueAnimations.isNotEmpty()) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C100931(this.this$0, null), 3, null);
                    } else {
                        ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = Long.MIN_VALUE;
                    }
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    this.label = 1;
                    if (seekableTransitionState.waitForCompositionAfterTargetStateChange(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.seekToFraction();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10703(S s10, S s11, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f10, Continuation<? super C10703> continuation) {
            super(1, continuation);
            this.$targetState = s10;
            this.$oldTargetState = s11;
            this.this$0 = seekableTransitionState;
            this.$transition = transition;
            this.$fraction = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C10703(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C10703) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", m13596f = "Transition.kt", m13597i = {}, m13598l = {457}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$snapTo$2 */
    public static final class C10712 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10712(SeekableTransitionState<S> seekableTransitionState, S s10, Transition<S> transition, Continuation<? super C10712> continuation) {
            super(1, continuation);
            this.this$0 = seekableTransitionState;
            this.$targetState = s10;
            this.$transition = transition;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C10712(this.this$0, this.$targetState, this.$transition, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.endAllAnimations();
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = Long.MIN_VALUE;
                this.this$0.setFraction(0.0f);
                S s10 = this.$targetState;
                float f10 = Intrinsics.areEqual(s10, this.this$0.getCurrentState()) ? -4.0f : Intrinsics.areEqual(s10, this.this$0.getTargetState()) ? -5.0f : -3.0f;
                this.$transition.updateTarget$animation_core_release(this.$targetState);
                this.$transition.setPlayTimeNanos(0L);
                this.this$0.setTargetState$animation_core_release(this.$targetState);
                this.this$0.setFraction(0.0f);
                this.this$0.setCurrentState$animation_core_release(this.$targetState);
                this.$transition.resetAnimationFraction$animation_core_release(f10);
                if (f10 == -3.0f) {
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    this.label = 1;
                    if (seekableTransitionState.waitForCompositionAfterTargetStateChange(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$transition.onTransitionEnd$animation_core_release();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C10712) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.animation.core.SeekableTransitionState", m13596f = "Transition.kt", m13597i = {0, 0, 1, 1}, m13598l = {543, 2142}, m13599m = "waitForComposition", m13600n = {"this", "expectedState", "this", "expectedState"}, m13601s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 */
    public static final class C10721 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10721(SeekableTransitionState<S> seekableTransitionState, Continuation<? super C10721> continuation) {
            super(continuation);
            this.this$0 = seekableTransitionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.waitForComposition(this);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.animation.core.SeekableTransitionState", m13596f = "Transition.kt", m13597i = {0, 0, 1, 1}, m13598l = {519, 2142}, m13599m = "waitForCompositionAfterTargetStateChange", m13600n = {"this", "expectedState", "this", "expectedState"}, m13601s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 */
    public static final class C10731 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10731(SeekableTransitionState<S> seekableTransitionState, Continuation<? super C10731> continuation) {
            super(continuation);
            this.this$0 = seekableTransitionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.waitForCompositionAfterTargetStateChange(this);
        }
    }

    public SeekableTransitionState(S s10) {
        super(null);
        this.targetState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s10, null, 2, null);
        this.currentState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s10, null, 2, null);
        this.composedTargetState = s10;
        this.recalculateTotalDurationNanos = new Function0<Unit>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$recalculateTotalDurationNanos$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SeekableTransitionState<S> seekableTransitionState = this.this$0;
                Transition transition = ((SeekableTransitionState) seekableTransitionState).transition;
                seekableTransitionState.setTotalDurationNanos$animation_core_release(transition != null ? transition.getTotalDurationNanos() : 0L);
            }
        };
        this.fraction = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.compositionContinuationMutex = MutexKt.Mutex$default(false, 1, null);
        this.mutatorMutex = new MutatorMutex();
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        this.initialValueAnimations = new MutableObjectList<>(0, 1, null);
        this.firstFrameLambda = new Function1<Long, Unit>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$firstFrameLambda$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                invoke(l10.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j10) {
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = j10;
            }
        };
        this.animateOneFrameLambda = new Function1<Long, Unit>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$animateOneFrameLambda$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                invoke(l10.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j10) {
                long j11 = j10 - ((SeekableTransitionState) this.this$0).lastFrameTimeNanos;
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = j10;
                long jRoundToLong = MathKt.roundToLong(j11 / ((SeekableTransitionState) this.this$0).durationScale);
                if (((SeekableTransitionState) this.this$0).initialValueAnimations.isNotEmpty()) {
                    MutableObjectList mutableObjectList = ((SeekableTransitionState) this.this$0).initialValueAnimations;
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    Object[] objArr = mutableObjectList.content;
                    int i10 = mutableObjectList._size;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        SeekableTransitionState.SeekingAnimationState seekingAnimationState = (SeekableTransitionState.SeekingAnimationState) objArr[i12];
                        seekableTransitionState.recalculateAnimationValue(seekingAnimationState, jRoundToLong);
                        seekingAnimationState.setComplete(true);
                    }
                    Transition transition = ((SeekableTransitionState) this.this$0).transition;
                    if (transition != null) {
                        transition.updateInitialValues$animation_core_release();
                    }
                    MutableObjectList mutableObjectList2 = ((SeekableTransitionState) this.this$0).initialValueAnimations;
                    int i13 = mutableObjectList2._size;
                    Object[] objArr2 = mutableObjectList2.content;
                    IntRange intRangeUntil = RangesKt.until(0, i13);
                    int first = intRangeUntil.getFirst();
                    int last = intRangeUntil.getLast();
                    if (first <= last) {
                        while (true) {
                            objArr2[first - i11] = objArr2[first];
                            if (((SeekableTransitionState.SeekingAnimationState) objArr2[first]).getIsComplete()) {
                                i11++;
                            }
                            if (first == last) {
                                break;
                            } else {
                                first++;
                            }
                        }
                    }
                    ArraysKt.fill(objArr2, (Object) null, i13 - i11, i13);
                    mutableObjectList2._size -= i11;
                }
                SeekableTransitionState.SeekingAnimationState seekingAnimationState2 = ((SeekableTransitionState) this.this$0).currentAnimation;
                if (seekingAnimationState2 != null) {
                    seekingAnimationState2.setDurationNanos(this.this$0.getTotalDurationNanos());
                    this.this$0.recalculateAnimationValue(seekingAnimationState2, jRoundToLong);
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
    public final Object animateOneFrame(Continuation<? super Unit> continuation) {
        float durationScale = SuspendAnimationKt.getDurationScale(continuation.getContext());
        if (durationScale <= 0.0f) {
            endAllAnimations();
            return Unit.INSTANCE;
        }
        this.durationScale = durationScale;
        Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.animateOneFrameLambda, continuation);
        return objWithFrameNanos == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithFrameNanos : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SeekableTransitionState seekableTransitionState, Object obj, FiniteAnimationSpec finiteAnimationSpec, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        if ((i10 & 2) != 0) {
            finiteAnimationSpec = null;
        }
        return seekableTransitionState.animateTo(obj, finiteAnimationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doOneFrame(Continuation<? super Unit> continuation) {
        if (this.lastFrameTimeNanos == Long.MIN_VALUE) {
            Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.firstFrameLambda, continuation);
            return objWithFrameNanos == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithFrameNanos : Unit.INSTANCE;
        }
        Object objAnimateOneFrame = animateOneFrame(continuation);
        return objAnimateOneFrame == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateOneFrame : Unit.INSTANCE;
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
            if (this.totalDurationNanos <= 0 || getFraction() == 1.0f || Intrinsics.areEqual(getCurrentState(), getTargetState())) {
                seekingAnimationState = null;
            } else {
                seekingAnimationState = new SeekingAnimationState();
                seekingAnimationState.setValue(getFraction());
                long j10 = this.totalDurationNanos;
                seekingAnimationState.setDurationNanos(j10);
                seekingAnimationState.setAnimationSpecDuration(MathKt.roundToLong(j10 * (1.0d - getFraction())));
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
            float f10 = progressNanos / animationSpecDuration;
            animation.setValue((animation.getStart().get$animation_core_release(0) * (1 - f10)) + (f10 * 1.0f));
        } else {
            AnimationVector1D start = animation.getStart();
            AnimationVector1D animationVector1D = Target1;
            AnimationVector1D initialVelocity = animation.getInitialVelocity();
            if (initialVelocity == null) {
                initialVelocity = ZeroVelocity;
            }
            animation.setValue(RangesKt.coerceIn(((AnimationVector1D) animationSpec.getValueFromNanos(progressNanos, start, animationVector1D, initialVelocity)).get$animation_core_release(0), 0.0f, 1.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r10, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runAnimations(kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.animation.core.SeekableTransitionState.C10691
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = (androidx.compose.animation.core.SeekableTransitionState.C10691) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            goto L33
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            java.lang.Object r2 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r2 = (androidx.compose.animation.core.SeekableTransitionState) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L76
        L3b:
            kotlin.ResultKt.throwOnFailure(r10)
            androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState> r10 = r9.initialValueAnimations
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L4d
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r10 = r9.currentAnimation
            if (r10 != 0) goto L4d
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L4d:
            kotlin.coroutines.CoroutineContext r10 = r0.getContext()
            float r10 = androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(r10)
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L62
            r9.endAllAnimations()
            r9.lastFrameTimeNanos = r5
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L62:
            long r7 = r9.lastFrameTimeNanos
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 != 0) goto L75
            kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> r10 = r9.firstFrameLambda
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r10 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r10, r0)
            if (r10 != r1) goto L75
            goto L92
        L75:
            r2 = r9
        L76:
            androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState> r10 = r2.initialValueAnimations
            boolean r10 = r10.isNotEmpty()
            if (r10 != 0) goto L88
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r10 = r2.currentAnimation
            if (r10 == 0) goto L83
            goto L88
        L83:
            r2.lastFrameTimeNanos = r5
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L88:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r10 = r2.animateOneFrame(r0)
            if (r10 != r1) goto L76
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.runAnimations(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object seekTo$default(SeekableTransitionState seekableTransitionState, float f10, Object obj, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        return seekableTransitionState.seekTo(f10, obj, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void seekToFraction() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        transition.seekAnimations$animation_core_release(MathKt.roundToLong(getFraction() * transition.getTotalDurationNanos()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFraction(float f10) {
        this.fraction.setFloatValue(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForComposition(kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.animation.core.SeekableTransitionState.C10721
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = (androidx.compose.animation.core.SeekableTransitionState.C10721) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r0 = (androidx.compose.animation.core.SeekableTransitionState) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L8c
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.L$1
            java.lang.Object r6 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r6 = (androidx.compose.animation.core.SeekableTransitionState) r6
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r2
            goto L5d
        L46:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.getTargetState()
            kotlinx.coroutines.sync.Mutex r2 = r7.compositionContinuationMutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r2 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L5c
            goto L88
        L5c:
            r6 = r7
        L5d:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r3
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r3, r5)
            r2.initCancellability()
            r6.setCompositionContinuation$animation_core_release(r2)
            kotlinx.coroutines.sync.Mutex r3 = r6.getCompositionContinuationMutex()
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r3, r4, r5, r4)
            java.lang.Object r2 = r2.getResult()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L86
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L86:
            if (r2 != r1) goto L89
        L88:
            return r1
        L89:
            r1 = r8
            r8 = r2
            r0 = r6
        L8c:
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r1)
            if (r8 == 0) goto L95
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L95:
            r1 = -9223372036854775808
            r0.lastFrameTimeNanos = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "targetState while waiting for composition"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.waitForComposition(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForCompositionAfterTargetStateChange(kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.animation.core.SeekableTransitionState.C10731
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = (androidx.compose.animation.core.SeekableTransitionState.C10731) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r0 = (androidx.compose.animation.core.SeekableTransitionState) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L9a
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.L$1
            java.lang.Object r6 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r6 = (androidx.compose.animation.core.SeekableTransitionState) r6
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r2
            goto L5d
        L46:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.getTargetState()
            kotlinx.coroutines.sync.Mutex r2 = r7.compositionContinuationMutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r2 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L5c
            goto L96
        L5c:
            r6 = r7
        L5d:
            S r2 = r6.composedTargetState
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r2)
            if (r2 == 0) goto L6b
            kotlinx.coroutines.sync.Mutex r8 = r6.compositionContinuationMutex
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r8, r4, r5, r4)
            goto La0
        L6b:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r3
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r3, r5)
            r2.initCancellability()
            r6.setCompositionContinuation$animation_core_release(r2)
            kotlinx.coroutines.sync.Mutex r3 = r6.getCompositionContinuationMutex()
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r3, r4, r5, r4)
            java.lang.Object r2 = r2.getResult()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L94
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L94:
            if (r2 != r1) goto L97
        L96:
            return r1
        L97:
            r1 = r8
            r8 = r2
            r0 = r6
        L9a:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r1)
            if (r2 == 0) goto La3
        La0:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        La3:
            r2 = -9223372036854775808
            r0.lastFrameTimeNanos = r2
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "snapTo() was canceled because state was changed to "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = " instead of "
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.waitForCompositionAfterTargetStateChange(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object animateTo(S s10, FiniteAnimationSpec<Float> finiteAnimationSpec, Continuation<? super Unit> continuation) {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return Unit.INSTANCE;
        }
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C10682(transition, this, s10, finiteAnimationSpec, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    public final S getComposedTargetState$animation_core_release() {
        return this.composedTargetState;
    }

    public final CancellableContinuation<S> getCompositionContinuation$animation_core_release() {
        return this.compositionContinuation;
    }

    /* renamed from: getCompositionContinuationMutex$animation_core_release, reason: from getter */
    public final Mutex getCompositionContinuationMutex() {
        return this.compositionContinuationMutex;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return (S) this.currentState.getValue();
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN)
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
        long j10 = this.totalDurationNanos;
        observeTotalDuration$animation_core_release();
        long j11 = this.totalDurationNanos;
        if (j10 != j11) {
            SeekingAnimationState seekingAnimationState = this.currentAnimation;
            if (seekingAnimationState == null) {
                if (j11 != 0) {
                    seekToFraction();
                    return;
                }
                return;
            }
            long progressNanos = seekingAnimationState.getProgressNanos();
            long j12 = this.totalDurationNanos;
            if (progressNanos > j12) {
                endAllAnimations();
                return;
            }
            seekingAnimationState.setDurationNanos(j12);
            if (seekingAnimationState.getAnimationSpec() == null) {
                seekingAnimationState.setAnimationSpecDuration(MathKt.roundToLong((1.0d - seekingAnimationState.getStart().get$animation_core_release(0)) * this.totalDurationNanos));
            }
        }
    }

    public final Object seekTo(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float f10, S s10, Continuation<? super Unit> continuation) {
        boolean z9 = false;
        if (0.0f <= f10 && f10 <= 1.0f) {
            z9 = true;
        }
        if (!z9) {
            PreconditionsKt.throwIllegalArgumentException("Expecting fraction between 0 and 1. Got " + f10);
        }
        Transition<S> transition = this.transition;
        if (transition == null) {
            return Unit.INSTANCE;
        }
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C10703(s10, getTargetState(), this, transition, f10, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    public final void setComposedTargetState$animation_core_release(S s10) {
        this.composedTargetState = s10;
    }

    public final void setCompositionContinuation$animation_core_release(CancellableContinuation<? super S> cancellableContinuation) {
        this.compositionContinuation = cancellableContinuation;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setCurrentState$animation_core_release(S s10) {
        this.currentState.setValue(s10);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setTargetState$animation_core_release(S s10) {
        this.targetState.setValue(s10);
    }

    public final void setTotalDurationNanos$animation_core_release(long j10) {
        this.totalDurationNanos = j10;
    }

    public final Object snapTo(S s10, Continuation<? super Unit> continuation) {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(getCurrentState(), s10) && Intrinsics.areEqual(getTargetState(), s10)) {
            return Unit.INSTANCE;
        }
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C10712(this, s10, transition, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(Transition<S> transition) {
        Transition<S> transition2 = this.transition;
        if (!(transition2 == null || Intrinsics.areEqual(transition, transition2))) {
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
