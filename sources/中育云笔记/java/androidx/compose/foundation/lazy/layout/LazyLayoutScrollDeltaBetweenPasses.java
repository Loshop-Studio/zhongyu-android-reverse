package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.internal.C9974p;
import p181hd.InterfaceC9540l;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyLayoutScrollDeltaBetweenPasses {
    public static final int $stable = 8;
    private AnimationState<Float, AnimationVector1D> _scrollDeltaBetweenPasses;

    public LazyLayoutScrollDeltaBetweenPasses() {
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C9974p.f23424a);
        Float fValueOf = Float.valueOf(0.0f);
        this._scrollDeltaBetweenPasses = AnimationStateKt.AnimationState$default(vectorConverter, fValueOf, fValueOf, 0L, 0L, false, 56, null);
    }

    public final float getScrollDeltaBetweenPasses$foundation_release() {
        return this._scrollDeltaBetweenPasses.getValue().floatValue();
    }

    public final void updateScrollDeltaForApproach$foundation_release(float f10, Density density, InterfaceC11122i0 interfaceC11122i0) {
        if (f10 <= density.mo27099toPx0680j_4(LazyLayoutScrollDeltaBetweenPassesKt.DeltaThresholdForScrollAnimation)) {
            return;
        }
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            float fFloatValue = this._scrollDeltaBetweenPasses.getValue().floatValue();
            if (this._scrollDeltaBetweenPasses.isRunning()) {
                this._scrollDeltaBetweenPasses = AnimationStateKt.copy$default((AnimationState) this._scrollDeltaBetweenPasses, fFloatValue - f10, 0.0f, 0L, 0L, false, 30, (Object) null);
                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C1593x63fe01d4(this, null), 3, null);
            } else {
                this._scrollDeltaBetweenPasses = new AnimationState<>(VectorConvertersKt.getVectorConverter(C9974p.f23424a), Float.valueOf(-f10), null, 0L, 0L, false, 60, null);
                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C1594x63fe01d5(this, null), 3, null);
            }
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
