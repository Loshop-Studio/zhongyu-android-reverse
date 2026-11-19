package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred(parameters = 0)
@ExperimentalAnimatableApi
@Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J+\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0002\u0010\u001eR/\u0010\t\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0016\u0010\u0017\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m13558d2 = {"Landroidx/compose/animation/core/DeferredTargetAnimation;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "", "vectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/TwoWayConverter;)V", "<set-?>", "_pendingTarget", "get_pendingTarget", "()Ljava/lang/Object;", "set_pendingTarget", "(Ljava/lang/Object;)V", "_pendingTarget$delegate", "Landroidx/compose/runtime/MutableState;", "animatable", "Landroidx/compose/animation/core/Animatable;", "isIdle", "", "()Z", "pendingTarget", "getPendingTarget", TypedValues.AttributesType.S_TARGET, "getTarget", "updateTarget", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "(Ljava/lang/Object;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/FiniteAnimationSpec;)Ljava/lang/Object;", "animation-core_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nDeferredTargetAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeferredTargetAnimation.kt\nandroidx/compose/animation/core/DeferredTargetAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n85#2:91\n113#2,2:92\n1#3:94\n*S KotlinDebug\n*F\n+ 1 DeferredTargetAnimation.kt\nandroidx/compose/animation/core/DeferredTargetAnimation\n*L\n51#1:91\n51#1:92,2\n*E\n"})
/* loaded from: classes.dex */
public final class DeferredTargetAnimation<T, V extends AnimationVector> {
    public static final int $stable = 8;

    /* renamed from: _pendingTarget$delegate, reason: from kotlin metadata */
    private final MutableState _pendingTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private Animatable<T, V> animatable;
    private final TwoWayConverter<T, V> vectorConverter;

    @Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1", m13596f = "DeferredTargetAnimation.kt", m13597i = {}, m13598l = {76}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1 */
    public static final class C10581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<T, V> $anim;
        final /* synthetic */ FiniteAnimationSpec<T> $animationSpec;
        final /* synthetic */ T $target;
        int label;
        final /* synthetic */ DeferredTargetAnimation<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10581(Animatable<T, V> animatable, DeferredTargetAnimation<T, V> deferredTargetAnimation, T t10, FiniteAnimationSpec<T> finiteAnimationSpec, Continuation<? super C10581> continuation) {
            super(2, continuation);
            this.$anim = animatable;
            this.this$0 = deferredTargetAnimation;
            this.$target = t10;
            this.$animationSpec = finiteAnimationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10581(this.$anim, this.this$0, this.$target, this.$animationSpec, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!Intrinsics.areEqual(this.$anim.getTargetValue(), this.this$0.get_pendingTarget())) {
                    Animatable<T, V> animatable = this.$anim;
                    T t10 = this.$target;
                    FiniteAnimationSpec<T> finiteAnimationSpec = this.$animationSpec;
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, t10, finiteAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
            return ((C10581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public DeferredTargetAnimation(TwoWayConverter<T, V> twoWayConverter) {
        this.vectorConverter = twoWayConverter;
    }

    private final T getTarget() {
        Animatable<T, V> animatable = this.animatable;
        if (animatable != null) {
            return animatable.getTargetValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T get_pendingTarget() {
        return this._pendingTarget.getValue();
    }

    private final void set_pendingTarget(T t10) {
        this._pendingTarget.setValue(t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object updateTarget$default(DeferredTargetAnimation deferredTargetAnimation, Object obj, CoroutineScope coroutineScope, FiniteAnimationSpec finiteAnimationSpec, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return deferredTargetAnimation.updateTarget(obj, coroutineScope, finiteAnimationSpec);
    }

    public final T getPendingTarget() {
        return get_pendingTarget();
    }

    public final boolean isIdle() {
        if (!Intrinsics.areEqual(get_pendingTarget(), getTarget())) {
            return false;
        }
        Animatable<T, V> animatable = this.animatable;
        return animatable == null || !animatable.isRunning();
    }

    public final T updateTarget(T target, CoroutineScope coroutineScope, FiniteAnimationSpec<T> animationSpec) {
        T t10;
        Animatable<T, V> animatable;
        set_pendingTarget(target);
        Animatable<T, V> animatable2 = this.animatable;
        if (animatable2 == null) {
            t10 = target;
            Animatable<T, V> animatable3 = new Animatable<>(t10, this.vectorConverter, null, null, 12, null);
            this.animatable = animatable3;
            animatable = animatable3;
        } else {
            t10 = target;
            animatable = animatable2;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C10581(animatable, this, t10, animationSpec, null), 3, null);
        return animatable.getValue();
    }
}
