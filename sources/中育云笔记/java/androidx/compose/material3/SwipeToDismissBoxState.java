package androidx.compose.material3;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.material3.internal.AnchoredDraggableDefaults;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import com.google.android.material.color.utilities.Contrast;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SwipeToDismissBoxState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableState;
    private final Density density;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue> Saver(final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2, final Density density) {
            return SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.material3.SwipeToDismissBoxState$Companion$Saver$1
                @Override // p181hd.InterfaceC9544p
                public final SwipeToDismissBoxValue invoke(SaverScope saverScope, SwipeToDismissBoxState swipeToDismissBoxState) {
                    return swipeToDismissBoxState.getCurrentValue();
                }
            }, new InterfaceC9540l() { // from class: androidx.compose.material3.SwipeToDismissBoxState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final SwipeToDismissBoxState invoke(SwipeToDismissBoxValue swipeToDismissBoxValue) {
                    return new SwipeToDismissBoxState(swipeToDismissBoxValue, density, interfaceC9540l, interfaceC9540l2);
                }
            });
        }

        private Companion() {
        }
    }

    public SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, Density density, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        this.density = density;
        this.anchoredDraggableState = new AnchoredDraggableState<>(swipeToDismissBoxValue, interfaceC9540l2, new InterfaceC9529a() { // from class: androidx.compose.material3.SwipeToDismissBoxState$anchoredDraggableState$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Float invoke() {
                return Float.valueOf(this.this$0.getDensity$material3_release().mo27099toPx0680j_4(SwipeToDismissBoxKt.DismissVelocityThreshold));
            }
        }, AnchoredDraggableDefaults.INSTANCE.getAnimationSpec(), interfaceC9540l);
    }

    public final Object dismiss(SwipeToDismissBoxValue swipeToDismissBoxValue, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, swipeToDismissBoxValue, 0.0f, interfaceC11588c, 2, null);
        return objAnimateTo$default == AbstractC11725a.m25952f() ? objAnimateTo$default : C10786q.f26013a;
    }

    public final AnchoredDraggableState<SwipeToDismissBoxValue> getAnchoredDraggableState$material3_release() {
        return this.anchoredDraggableState;
    }

    public final SwipeToDismissBoxValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final Density getDensity$material3_release() {
        return this.density;
    }

    public final SwipeToDismissBoxValue getDismissDirection() {
        return (getOffset$material3_release() == 0.0f || Float.isNaN(getOffset$material3_release())) ? SwipeToDismissBoxValue.Settled : getOffset$material3_release() > 0.0f ? SwipeToDismissBoxValue.StartToEnd : SwipeToDismissBoxValue.EndToStart;
    }

    public final float getOffset$material3_release() {
        return this.anchoredDraggableState.getOffset();
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN)
    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    public final SwipeToDismissBoxValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final Object reset(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, SwipeToDismissBoxValue.Settled, 0.0f, interfaceC11588c, 2, null);
        return objAnimateTo$default == AbstractC11725a.m25952f() ? objAnimateTo$default : C10786q.f26013a;
    }

    public final Object snapTo(SwipeToDismissBoxValue swipeToDismissBoxValue, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, swipeToDismissBoxValue, interfaceC11588c);
        return objSnapTo == AbstractC11725a.m25952f() ? objSnapTo : C10786q.f26013a;
    }

    public /* synthetic */ SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, Density density, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i10, AbstractC9972n abstractC9972n) {
        this(swipeToDismissBoxValue, density, (i10 & 4) != 0 ? new InterfaceC9540l() { // from class: androidx.compose.material3.SwipeToDismissBoxState.1
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(SwipeToDismissBoxValue swipeToDismissBoxValue2) {
                return Boolean.TRUE;
            }
        } : interfaceC9540l, interfaceC9540l2);
    }
}
