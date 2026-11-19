package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.C5825f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m5110d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "anim", "<init>", "(Landroidx/compose/animation/core/Animatable;)V", "()V", "Ld6/s;", "animateToThreshold", "(Lh6/c;)Ljava/lang/Object;", "animateToHidden", "targetValue", "snapTo", "(FLh6/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Animatable;", "getDistanceFraction", "()F", "distanceFraction", "", "isAnimating", "()Z", "Companion", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PullToRefreshStateImpl implements PullToRefreshState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Saver<PullToRefreshStateImpl, Float> Saver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$Companion$Saver$1
        @Override // p152r6.InterfaceC6473e
        @Nullable
        public final Float invoke(@NotNull SaverScope saverScope, @NotNull PullToRefreshStateImpl pullToRefreshStateImpl) {
            return (Float) pullToRefreshStateImpl.anim.getValue();
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$Companion$Saver$2
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }

        @Nullable
        public final PullToRefreshStateImpl invoke(float f) {
            return new PullToRefreshStateImpl(new Animatable(Float.valueOf(f), VectorConvertersKt.getVectorConverter(C5825f.f9219a), null, null, 12, null), null);
        }
    });

    @NotNull
    private final Animatable<Float, AnimationVector1D> anim;

    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m5110d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;", "", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final Saver<PullToRefreshStateImpl, Float> getSaver() {
            return PullToRefreshStateImpl.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PullToRefreshStateImpl(Animatable animatable, AbstractC5824e abstractC5824e) {
        this(animatable);
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    @Nullable
    public Object animateToHidden(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnimateTo$default = Animatable.animateTo$default(this.anim, new Float(0.0f), null, null, null, interfaceC5631c, 14, null);
        return objAnimateTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$default : C5443s.f8405a;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    @Nullable
    public Object animateToThreshold(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnimateTo$default = Animatable.animateTo$default(this.anim, new Float(1.0f), null, null, null, interfaceC5631c, 14, null);
        return objAnimateTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$default : C5443s.f8405a;
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
    @Nullable
    public Object snapTo(float f, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objSnapTo = this.anim.snapTo(new Float(f), interfaceC5631c);
        return objSnapTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objSnapTo : C5443s.f8405a;
    }

    private PullToRefreshStateImpl(Animatable<Float, AnimationVector1D> animatable) {
        this.anim = animatable;
    }

    public PullToRefreshStateImpl() {
        this(new Animatable(Float.valueOf(0.0f), VectorConvertersKt.getVectorConverter(C5825f.f9219a), null, null, 12, null));
    }
}
