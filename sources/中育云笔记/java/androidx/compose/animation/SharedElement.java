package androidx.compose.animation;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RectKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SharedElement {
    public static final int $stable = 8;
    private final Object key;
    private final SharedTransitionScopeImpl scope;
    private SharedElementInternalState targetBoundsProvider;
    private final MutableState _targetBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState foundMatch$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private final MutableState currentBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final SnapshotStateList<SharedElementInternalState> states = SnapshotStateKt.mutableStateListOf();
    private final InterfaceC9540l updateMatch = new InterfaceC9540l() { // from class: androidx.compose.animation.SharedElement.updateMatch.1
        {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SharedElement) obj);
            return C10786q.f26013a;
        }

        public final void invoke(SharedElement sharedElement) {
            SharedElement.this.updateMatch();
        }
    };
    private final InterfaceC9529a observingVisibilityChange = new InterfaceC9529a() { // from class: androidx.compose.animation.SharedElement$observingVisibilityChange$1
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            m26814invoke();
            return C10786q.f26013a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m26814invoke() {
            this.this$0.hasVisibleContent();
        }
    };

    public SharedElement(Object obj, SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.key = obj;
        this.scope = sharedTransitionScopeImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Rect get_targetBounds() {
        return (Rect) this._targetBounds$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasVisibleContent() {
        SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (snapshotStateList.get(i10).getBoundsAnimation().getTarget()) {
                return true;
            }
        }
        return false;
    }

    private final void setFoundMatch(boolean z10) {
        this.foundMatch$delegate.setValue(Boolean.valueOf(z10));
    }

    private final void set_targetBounds(Rect rect) {
        this._targetBounds$delegate.setValue(rect);
    }

    public final void addState(SharedElementInternalState sharedElementInternalState) {
        this.states.add(sharedElementInternalState);
        this.scope.observeReads$animation_release(this, this.updateMatch, this.observingVisibilityChange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getCurrentBounds() {
        return (Rect) this.currentBounds$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getFoundMatch() {
        return ((Boolean) this.foundMatch$delegate.getValue()).booleanValue();
    }

    public final Object getKey() {
        return this.key;
    }

    public final SharedTransitionScopeImpl getScope() {
        return this.scope;
    }

    public final SnapshotStateList<SharedElementInternalState> getStates() {
        return this.states;
    }

    public final Rect getTargetBounds() {
        SharedElementInternalState sharedElementInternalState = this.targetBoundsProvider;
        set_targetBounds(sharedElementInternalState != null ? RectKt.m30677Recttz77jQw(sharedElementInternalState.m26815calculateLookaheadOffsetF1C5BW0(), sharedElementInternalState.m26816getNonNullLookaheadSizeNHjbRc()) : null);
        return get_targetBounds();
    }

    public final SharedElementInternalState getTargetBoundsProvider$animation_release() {
        return this.targetBoundsProvider;
    }

    public final boolean isAnimating() {
        SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
        int size = snapshotStateList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (!snapshotStateList.get(i10).getBoundsAnimation().isRunning()) {
                i10++;
            } else if (getFoundMatch()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: onLookaheadResult-v_w8tDc, reason: not valid java name */
    public final void m26813onLookaheadResultv_w8tDc(SharedElementInternalState sharedElementInternalState, long j10, long j11) {
        if (sharedElementInternalState.getBoundsAnimation().getTarget()) {
            this.targetBoundsProvider = sharedElementInternalState;
            Rect rect = get_targetBounds();
            Offset offsetM30626boximpl = rect != null ? Offset.m30626boximpl(rect.m30672getTopLeftF1C5BW0()) : null;
            if (offsetM30626boximpl == null ? false : Offset.m30634equalsimpl0(offsetM30626boximpl.m30647unboximpl(), j11)) {
                Rect rect2 = get_targetBounds();
                Size sizeM30694boximpl = rect2 != null ? Size.m30694boximpl(rect2.m30670getSizeNHjbRc()) : null;
                if (sizeM30694boximpl == null ? false : Size.m30702equalsimpl0(sizeM30694boximpl.m30711unboximpl(), j10)) {
                    return;
                }
            }
            Rect rectM30677Recttz77jQw = RectKt.m30677Recttz77jQw(j11, j10);
            set_targetBounds(rectM30677Recttz77jQw);
            SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
            int size = snapshotStateList.size();
            for (int i10 = 0; i10 < size; i10++) {
                BoundsAnimation boundsAnimation = snapshotStateList.get(i10).getBoundsAnimation();
                Rect currentBounds = getCurrentBounds();
                AbstractC9979u.m20291d(currentBounds);
                boundsAnimation.animate(currentBounds, rectM30677Recttz77jQw);
            }
        }
    }

    public final void onSharedTransitionFinished() {
        setFoundMatch(this.states.size() > 1 && hasVisibleContent());
        set_targetBounds(null);
    }

    public final void removeState(SharedElementInternalState sharedElementInternalState) {
        this.states.remove(sharedElementInternalState);
        if (!this.states.isEmpty()) {
            this.scope.observeReads$animation_release(this, this.updateMatch, this.observingVisibilityChange);
        } else {
            updateMatch();
            this.scope.clearObservation$animation_release(this);
        }
    }

    public final void setCurrentBounds(Rect rect) {
        this.currentBounds$delegate.setValue(rect);
    }

    public final void updateMatch() {
        boolean zHasVisibleContent = hasVisibleContent();
        if (this.states.size() > 1 && zHasVisibleContent) {
            setFoundMatch(true);
        } else if (!this.scope.isTransitionActive() || !zHasVisibleContent) {
            setFoundMatch(false);
        }
        if (this.states.isEmpty()) {
            return;
        }
        this.scope.observeReads$animation_release(this, this.updateMatch, this.observingVisibilityChange);
    }

    public final void updateTargetBoundsProvider() {
        SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
        int size = snapshotStateList.size() - 1;
        SharedElementInternalState sharedElementInternalState = null;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                SharedElementInternalState sharedElementInternalState2 = snapshotStateList.get(size);
                if (sharedElementInternalState2.getBoundsAnimation().getTarget()) {
                    sharedElementInternalState = sharedElementInternalState2;
                }
                if (i10 < 0) {
                    break;
                } else {
                    size = i10;
                }
            }
        }
        if (AbstractC9979u.m20289b(sharedElementInternalState, this.targetBoundsProvider)) {
            return;
        }
        this.targetBoundsProvider = sharedElementInternalState;
        set_targetBounds(null);
    }
}
