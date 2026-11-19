package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class InfiniteTransition {
    public static final int $stable = 8;
    private final String label;
    private final MutableVector<TransitionAnimationState<?, ?>> _animations = new MutableVector<>(new TransitionAnimationState[16], 0);
    private final MutableState refreshChildNeeded$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private long startTimeNanos = Long.MIN_VALUE;
    private final MutableState isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private TargetBasedAnimation<T, V> animation;
        private AnimationSpec<T> animationSpec;
        private T initialValue;
        private boolean isFinished;
        private final String label;
        private long playTimeNanosOffset;
        private boolean startOnTheNextFrame;
        private T targetValue;
        private final TwoWayConverter<T, V> typeConverter;
        private final MutableState value$delegate;

        public TransitionAnimationState(T t10, T t11, TwoWayConverter<T, V> twoWayConverter, AnimationSpec<T> animationSpec, String str) {
            this.initialValue = t10;
            this.targetValue = t11;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(this.animationSpec, twoWayConverter, this.initialValue, this.targetValue, (AnimationVector) null, 16, (AbstractC9972n) null);
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            return this.animation;
        }

        public final AnimationSpec<T> getAnimationSpec() {
            return this.animationSpec;
        }

        public final T getInitialValue$animation_core_release() {
            return this.initialValue;
        }

        public final String getLabel() {
            return this.label;
        }

        public final T getTargetValue$animation_core_release() {
            return this.targetValue;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return this.isFinished;
        }

        public final void onPlayTimeChanged$animation_core_release(long j10) {
            InfiniteTransition.this.setRefreshChildNeeded(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = j10;
            }
            long j11 = j10 - this.playTimeNanosOffset;
            setValue$animation_core_release(this.animation.getValueFromNanos(j11));
            this.isFinished = this.animation.isFinishedFromNanos(j11);
        }

        public final void reset$animation_core_release() {
            this.startOnTheNextFrame = true;
        }

        public final void setAnimation$animation_core_release(TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation = targetBasedAnimation;
        }

        public final void setFinished$animation_core_release(boolean z10) {
            this.isFinished = z10;
        }

        public final void setInitialValue$animation_core_release(T t10) {
            this.initialValue = t10;
        }

        public final void setTargetValue$animation_core_release(T t10) {
            this.targetValue = t10;
        }

        public void setValue$animation_core_release(T t10) {
            this.value$delegate.setValue(t10);
        }

        public final void skipToEnd$animation_core_release() {
            setValue$animation_core_release(this.animation.getTargetValue());
            this.startOnTheNextFrame = true;
        }

        public final void updateValues$animation_core_release(T t10, T t11, AnimationSpec<T> animationSpec) {
            this.initialValue = t10;
            this.targetValue = t11;
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(animationSpec, this.typeConverter, t10, t11, (AnimationVector) null, 16, (AbstractC9972n) null);
            InfiniteTransition.this.setRefreshChildNeeded(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }
    }

    public InfiniteTransition(String str) {
        this.label = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getRefreshChildNeeded() {
        return ((Boolean) this.refreshChildNeeded$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFrame(long j10) {
        MutableVector<TransitionAnimationState<?, ?>> mutableVector = this._animations;
        TransitionAnimationState<?, ?>[] transitionAnimationStateArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            TransitionAnimationState<?, ?> transitionAnimationState = transitionAnimationStateArr[i10];
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                transitionAnimationState.onPlayTimeChanged$animation_core_release(j10);
            }
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                z10 = false;
            }
        }
        setRunning(!z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRefreshChildNeeded(boolean z10) {
        this.refreshChildNeeded$delegate.setValue(Boolean.valueOf(z10));
    }

    private final void setRunning(boolean z10) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void addAnimation$animation_core_release(TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.add(transitionAnimationState);
        setRefreshChildNeeded(true);
    }

    public final List<TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations.asMutableList();
    }

    public final String getLabel() {
        return this.label;
    }

    public final void removeAnimation$animation_core_release(TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.remove(transitionAnimationState);
    }

    @Composable
    public final void run$animation_core_release(Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-318043801);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-318043801, i11, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:164)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            if (isRunning() || getRefreshChildNeeded()) {
                composerStartRestartGroup.startReplaceGroup(1719883733);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new InfiniteTransition$run$1$1(mutableState, this, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                EffectsKt.LaunchedEffect(this, (InterfaceC9544p) objRememberedValue2, composerStartRestartGroup, i11 & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1721270456);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.animation.core.InfiniteTransition$run$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i12) {
                    this.$tmp2_rcvr.run$animation_core_release(composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }
}
