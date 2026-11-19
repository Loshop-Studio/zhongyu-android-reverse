package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
@ExperimentalAnimatableApi
/* loaded from: classes.dex */
public final class DeferredTargetAnimation<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private final MutableState _pendingTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private Animatable<T, V> animatable;
    private final TwoWayConverter<T, V> vectorConverter;

    @InterfaceC11829d(m26210c = "androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1", m26211f = "DeferredTargetAnimation.kt", m26212l = {PatchStatus.CODE_LOAD_SOPHIX_VERSION}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1 */
    public static final class C11171 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ Animatable<T, V> $anim;
        final /* synthetic */ FiniteAnimationSpec<T> $animationSpec;
        final /* synthetic */ T $target;
        int label;
        final /* synthetic */ DeferredTargetAnimation<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11171(Animatable<T, V> animatable, DeferredTargetAnimation<T, V> deferredTargetAnimation, T t10, FiniteAnimationSpec<T> finiteAnimationSpec, InterfaceC11588c<? super C11171> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$anim = animatable;
            this.this$0 = deferredTargetAnimation;
            this.$target = t10;
            this.$animationSpec = finiteAnimationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C11171(this.$anim, this.this$0, this.$target, this.$animationSpec, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                if (!AbstractC9979u.m20289b(this.$anim.getTargetValue(), this.this$0.get_pendingTarget())) {
                    Animatable<T, V> animatable = this.$anim;
                    T t10 = this.$target;
                    FiniteAnimationSpec<T> finiteAnimationSpec = this.$animationSpec;
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, t10, finiteAnimationSpec, null, null, this, 12, null) == objM25952f) {
                        return objM25952f;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C11171) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
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
        return this._pendingTarget$delegate.getValue();
    }

    private final void set_pendingTarget(T t10) {
        this._pendingTarget$delegate.setValue(t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object updateTarget$default(DeferredTargetAnimation deferredTargetAnimation, Object obj, InterfaceC11122i0 interfaceC11122i0, FiniteAnimationSpec finiteAnimationSpec, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return deferredTargetAnimation.updateTarget(obj, interfaceC11122i0, finiteAnimationSpec);
    }

    public final T getPendingTarget() {
        return get_pendingTarget();
    }

    public final boolean isIdle() {
        if (!AbstractC9979u.m20289b(get_pendingTarget(), getTarget())) {
            return false;
        }
        Animatable<T, V> animatable = this.animatable;
        return animatable == null || !animatable.isRunning();
    }

    public final T updateTarget(T t10, InterfaceC11122i0 interfaceC11122i0, FiniteAnimationSpec<T> finiteAnimationSpec) {
        T t11;
        Animatable<T, V> animatable;
        set_pendingTarget(t10);
        Animatable<T, V> animatable2 = this.animatable;
        if (animatable2 == null) {
            t11 = t10;
            Animatable<T, V> animatable3 = new Animatable<>(t11, this.vectorConverter, null, null, 12, null);
            this.animatable = animatable3;
            animatable = animatable3;
        } else {
            t11 = t10;
            animatable = animatable2;
        }
        AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C11171(animatable, this, t11, finiteAnimationSpec, null), 3, null);
        return animatable.getValue();
    }
}
