package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.C9974p;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class PullToRefreshStateImpl implements PullToRefreshState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<PullToRefreshStateImpl, Float> Saver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$Companion$Saver$1
        @Override // p181hd.InterfaceC9544p
        public final Float invoke(SaverScope saverScope, PullToRefreshStateImpl pullToRefreshStateImpl) {
            return (Float) pullToRefreshStateImpl.anim.getValue();
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$Companion$Saver$2
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }

        public final PullToRefreshStateImpl invoke(float f10) {
            return new PullToRefreshStateImpl(new Animatable(Float.valueOf(f10), VectorConvertersKt.getVectorConverter(C9974p.f23424a), null, null, 12, null), null);
        }
    });
    private final Animatable<Float, AnimationVector1D> anim;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Saver<PullToRefreshStateImpl, Float> getSaver() {
            return PullToRefreshStateImpl.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PullToRefreshStateImpl(Animatable animatable, AbstractC9972n abstractC9972n) {
        this(animatable);
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public Object animateToHidden(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnimateTo$default = Animatable.animateTo$default(this.anim, AbstractC11826a.m26207b(0.0f), null, null, null, interfaceC11588c, 14, null);
        return objAnimateTo$default == AbstractC11725a.m25952f() ? objAnimateTo$default : C10786q.f26013a;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public Object animateToThreshold(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnimateTo$default = Animatable.animateTo$default(this.anim, AbstractC11826a.m26207b(1.0f), null, null, null, interfaceC11588c, 14, null);
        return objAnimateTo$default == AbstractC11725a.m25952f() ? objAnimateTo$default : C10786q.f26013a;
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
    public Object snapTo(float f10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objSnapTo = this.anim.snapTo(AbstractC11826a.m26207b(f10), interfaceC11588c);
        return objSnapTo == AbstractC11725a.m25952f() ? objSnapTo : C10786q.f26013a;
    }

    private PullToRefreshStateImpl(Animatable<Float, AnimationVector1D> animatable) {
        this.anim = animatable;
    }

    public PullToRefreshStateImpl() {
        this(new Animatable(Float.valueOf(0.0f), VectorConvertersKt.getVectorConverter(C9974p.f23424a), null, null, 12, null));
    }
}
