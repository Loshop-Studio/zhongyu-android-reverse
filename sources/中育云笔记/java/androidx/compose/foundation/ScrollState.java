package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

@Stable
/* loaded from: classes.dex */
public final class ScrollState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<ScrollState, ?> Saver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$1
        @Override // p181hd.InterfaceC9544p
        public final Integer invoke(SaverScope saverScope, ScrollState scrollState) {
            return Integer.valueOf(scrollState.getValue());
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$2
        public final ScrollState invoke(int i10) {
            return new ScrollState(i10);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    });
    private float accumulator;
    private final MutableIntState value$delegate;
    private final MutableIntState viewportSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
    private final MutableInteractionSource internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
    private MutableIntState _maxValueState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);
    private final ScrollableState scrollableState = ScrollableStateKt.ScrollableState(new InterfaceC9540l() { // from class: androidx.compose.foundation.ScrollState$scrollableState$1
        {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }

        public final Float invoke(float f10) {
            float value = this.this$0.getValue() + f10 + this.this$0.accumulator;
            float fM21760m = AbstractC10410o.m21760m(value, 0.0f, this.this$0.getMaxValue());
            boolean z10 = value == fM21760m;
            float value2 = fM21760m - this.this$0.getValue();
            int iRound = Math.round(value2);
            ScrollState scrollState = this.this$0;
            scrollState.setValue(scrollState.getValue() + iRound);
            this.this$0.accumulator = value2 - iRound;
            if (!z10) {
                f10 = value2;
            }
            return Float.valueOf(f10);
        }
    });
    private final State canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new InterfaceC9529a() { // from class: androidx.compose.foundation.ScrollState$canScrollForward$2
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.getValue() < this.this$0.getMaxValue());
        }
    });
    private final State canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new InterfaceC9529a() { // from class: androidx.compose.foundation.ScrollState$canScrollBackward$2
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.getValue() > 0);
        }
    });

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Saver<ScrollState, ?> getSaver() {
            return ScrollState.Saver;
        }

        private Companion() {
        }
    }

    public ScrollState(int i10) {
        this.value$delegate = SnapshotIntStateKt.mutableIntStateOf(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollTo$default(ScrollState scrollState, int i10, AnimationSpec animationSpec, InterfaceC11588c interfaceC11588c, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        return scrollState.animateScrollTo(i10, animationSpec, interfaceC11588c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValue(int i10) {
        this.value$delegate.setIntValue(i10);
    }

    public final Object animateScrollTo(int i10, AnimationSpec<Float> animationSpec, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnimateScrollBy = ScrollExtensionsKt.animateScrollBy(this, i10 - getValue(), animationSpec, interfaceC11588c);
        return objAnimateScrollBy == AbstractC11725a.m25952f() ? objAnimateScrollBy : C10786q.f26013a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f10) {
        return this.scrollableState.dispatchRawDelta(f10);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.scrollableState.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.scrollableState.getLastScrolledForward();
    }

    public final int getMaxValue() {
        return this._maxValueState.getIntValue();
    }

    public final int getValue() {
        return this.value$delegate.getIntValue();
    }

    public final int getViewportSize() {
        return this.viewportSize$delegate.getIntValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objScroll = this.scrollableState.scroll(mutatePriority, interfaceC9544p, interfaceC11588c);
        return objScroll == AbstractC11725a.m25952f() ? objScroll : C10786q.f26013a;
    }

    public final Object scrollTo(int i10, InterfaceC11588c<? super Float> interfaceC11588c) {
        return ScrollExtensionsKt.scrollBy(this, i10 - getValue(), interfaceC11588c);
    }

    public final void setMaxValue$foundation_release(int i10) {
        this._maxValueState.setIntValue(i10);
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (getValue() > i10) {
                setValue(i10);
            }
            C10786q c10786q = C10786q.f26013a;
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public final void setViewportSize$foundation_release(int i10) {
        this.viewportSize$delegate.setIntValue(i10);
    }
}
