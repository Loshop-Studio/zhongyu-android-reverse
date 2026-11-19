package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.C9128p;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class PullToRefreshStateImpl implements PullToRefreshState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<PullToRefreshStateImpl, Float> Saver = SaverKt.Saver(new InterfaceC10574p() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$Companion$Saver$1
        @Override // p300x7.InterfaceC10574p
        public final Float invoke(SaverScope saverScope, PullToRefreshStateImpl pullToRefreshStateImpl) {
            return (Float) pullToRefreshStateImpl.anim.getValue();
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$Companion$Saver$2
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }

        public final PullToRefreshStateImpl invoke(float f10) {
            return new PullToRefreshStateImpl(new Animatable(Float.valueOf(f10), VectorConvertersKt.getVectorConverter(C9128p.f17495a), null, null, 12, null), null);
        }
    });
    private final Animatable<Float, AnimationVector1D> anim;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Saver<PullToRefreshStateImpl, Float> getSaver() {
            return PullToRefreshStateImpl.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PullToRefreshStateImpl(Animatable animatable, AbstractC9126n abstractC9126n) {
        this(animatable);
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public Object animateToHidden(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAnimateTo$default = Animatable.animateTo$default(this.anim, AbstractC9536a.m17797b(0.0f), null, null, null, interfaceC9324c, 14, null);
        return objAnimateTo$default == AbstractC9434a.m17291f() ? objAnimateTo$default : C8736p.f16368a;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public Object animateToThreshold(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAnimateTo$default = Animatable.animateTo$default(this.anim, AbstractC9536a.m17797b(1.0f), null, null, null, interfaceC9324c, 14, null);
        return objAnimateTo$default == AbstractC9434a.m17291f() ? objAnimateTo$default : C8736p.f16368a;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public float getDistanceFraction() {
        return this.anim.getValue().floatValue();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public boolean isAnimating() {
        return this.anim.isRunning();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public Object snapTo(float f10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objSnapTo = this.anim.snapTo(AbstractC9536a.m17797b(f10), interfaceC9324c);
        return objSnapTo == AbstractC9434a.m17291f() ? objSnapTo : C8736p.f16368a;
    }

    private PullToRefreshStateImpl(Animatable<Float, AnimationVector1D> animatable) {
        this.anim = animatable;
    }

    public PullToRefreshStateImpl() {
        this(new Animatable(Float.valueOf(0.0f), VectorConvertersKt.getVectorConverter(C9128p.f17495a), null, null, 12, null));
    }
}
