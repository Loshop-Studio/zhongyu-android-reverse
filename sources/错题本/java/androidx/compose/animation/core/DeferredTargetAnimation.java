package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@ExperimentalAnimatableApi
@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R/\u0010\u0018\u001a\u0004\u0018\u00018\u00002\b\u0010\u0011\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u001e\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010 \u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006\""}, m5110d2 = {"Landroidx/compose/animation/core/DeferredTargetAnimation;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Landroidx/compose/animation/core/TwoWayConverter;", "vectorConverter", "<init>", "(Landroidx/compose/animation/core/TwoWayConverter;)V", TypedValues.AttributesType.S_TARGET, "Lkotlinx/coroutines/v;", "coroutineScope", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "updateTarget", "(Ljava/lang/Object;Lkotlinx/coroutines/v;Landroidx/compose/animation/core/FiniteAnimationSpec;)Ljava/lang/Object;", "Landroidx/compose/animation/core/TwoWayConverter;", "<set-?>", "_pendingTarget$delegate", "Landroidx/compose/runtime/MutableState;", "get_pendingTarget", "()Ljava/lang/Object;", "set_pendingTarget", "(Ljava/lang/Object;)V", "_pendingTarget", "Landroidx/compose/animation/core/Animatable;", "animatable", "Landroidx/compose/animation/core/Animatable;", "getTarget", "getPendingTarget", "pendingTarget", "", "isIdle", "()Z", "animation-core_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDeferredTargetAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeferredTargetAnimation.kt\nandroidx/compose/animation/core/DeferredTargetAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n85#2:91\n113#2,2:92\n1#3:94\n*S KotlinDebug\n*F\n+ 1 DeferredTargetAnimation.kt\nandroidx/compose/animation/core/DeferredTargetAnimation\n*L\n51#1:91\n51#1:92,2\n*E\n"})
/* loaded from: classes.dex */
public final class DeferredTargetAnimation<T, V extends AnimationVector> {
    public static final int $stable = 8;

    /* renamed from: _pendingTarget$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState _pendingTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @Nullable
    private Animatable<T, V> animatable;

    @NotNull
    private final TwoWayConverter<T, V> vectorConverter;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1", m5303f = "DeferredTargetAnimation.kt", m5304i = {}, m5305l = {76}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1 */
    public static final class C06841 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ Animatable<T, V> $anim;
        final /* synthetic */ FiniteAnimationSpec<T> $animationSpec;
        final /* synthetic */ T $target;
        int label;
        final /* synthetic */ DeferredTargetAnimation<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06841(Animatable<T, V> animatable, DeferredTargetAnimation<T, V> deferredTargetAnimation, T t8, FiniteAnimationSpec<T> finiteAnimationSpec, InterfaceC5631c<? super C06841> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$anim = animatable;
            this.this$0 = deferredTargetAnimation;
            this.$target = t8;
            this.$animationSpec = finiteAnimationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C06841(this.$anim, this.this$0, this.$target, this.$animationSpec, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                if (!AbstractC5830k.m5325b(this.$anim.getTargetValue(), this.this$0.get_pendingTarget())) {
                    Animatable<T, V> animatable = this.$anim;
                    T t8 = this.$target;
                    FiniteAnimationSpec<T> finiteAnimationSpec = this.$animationSpec;
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, t8, finiteAnimationSpec, null, null, this, 12, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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
            return ((C06841) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public DeferredTargetAnimation(@NotNull TwoWayConverter<T, V> twoWayConverter) {
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

    private final void set_pendingTarget(T t8) {
        this._pendingTarget.setValue(t8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object updateTarget$default(DeferredTargetAnimation deferredTargetAnimation, Object obj, InterfaceC6009v interfaceC6009v, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj2) {
        if ((i & 4) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return deferredTargetAnimation.updateTarget(obj, interfaceC6009v, finiteAnimationSpec);
    }

    @Nullable
    public final T getPendingTarget() {
        return get_pendingTarget();
    }

    public final boolean isIdle() {
        if (!AbstractC5830k.m5325b(get_pendingTarget(), getTarget())) {
            return false;
        }
        Animatable<T, V> animatable = this.animatable;
        return animatable == null || !animatable.isRunning();
    }

    public final T updateTarget(T target, @NotNull InterfaceC6009v coroutineScope, @NotNull FiniteAnimationSpec<T> animationSpec) {
        T t8;
        Animatable<T, V> animatable;
        set_pendingTarget(target);
        Animatable<T, V> animatable2 = this.animatable;
        if (animatable2 == null) {
            Animatable<T, V> animatable3 = new Animatable<>(target, this.vectorConverter, null, null, 12, null);
            this.animatable = animatable3;
            animatable = animatable3;
            t8 = target;
        } else {
            t8 = target;
            animatable = animatable2;
        }
        AbstractC6014x.m5651v(coroutineScope, null, null, new C06841(animatable, this, t8, animationSpec, null), 3);
        return animatable.getValue();
    }
}
