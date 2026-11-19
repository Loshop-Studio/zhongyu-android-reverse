package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
@ExperimentalAnimatableApi
/* loaded from: classes.dex */
public final class DeferredTargetAnimation<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private final MutableState _pendingTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private Animatable<T, V> animatable;
    private final TwoWayConverter<T, V> vectorConverter;

    @InterfaceC9539d(m17800c = "androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1", m17801f = "DeferredTargetAnimation.kt", m17802l = {76}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1 */
    public static final class C10871 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ Animatable<T, V> $anim;
        final /* synthetic */ FiniteAnimationSpec<T> $animationSpec;
        final /* synthetic */ T $target;
        int label;
        final /* synthetic */ DeferredTargetAnimation<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10871(Animatable<T, V> animatable, DeferredTargetAnimation<T, V> deferredTargetAnimation, T t10, FiniteAnimationSpec<T> finiteAnimationSpec, InterfaceC9324c<? super C10871> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$anim = animatable;
            this.this$0 = deferredTargetAnimation;
            this.$target = t10;
            this.$animationSpec = finiteAnimationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C10871(this.$anim, this.this$0, this.$target, this.$animationSpec, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C10871) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                if (!AbstractC9133u.m16128b(this.$anim.getTargetValue(), this.this$0.get_pendingTarget())) {
                    Animatable<T, V> animatable = this.$anim;
                    T t10 = this.$target;
                    FiniteAnimationSpec<T> finiteAnimationSpec = this.$animationSpec;
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, t10, finiteAnimationSpec, null, null, this, 12, null) == objM17291f) {
                        return objM17291f;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
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
    public static /* synthetic */ Object updateTarget$default(DeferredTargetAnimation deferredTargetAnimation, Object obj, InterfaceC8822b0 interfaceC8822b0, FiniteAnimationSpec finiteAnimationSpec, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return deferredTargetAnimation.updateTarget(obj, interfaceC8822b0, finiteAnimationSpec);
    }

    public final T getPendingTarget() {
        return get_pendingTarget();
    }

    public final boolean isIdle() {
        if (!AbstractC9133u.m16128b(get_pendingTarget(), getTarget())) {
            return false;
        }
        Animatable<T, V> animatable = this.animatable;
        return animatable == null || !animatable.isRunning();
    }

    public final T updateTarget(T t10, InterfaceC8822b0 interfaceC8822b0, FiniteAnimationSpec<T> finiteAnimationSpec) {
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
        AbstractC8839h.m14861d(interfaceC8822b0, null, null, new C10871(animatable, this, t11, finiteAnimationSpec, null), 3, null);
        return animatable.getValue();
    }
}
