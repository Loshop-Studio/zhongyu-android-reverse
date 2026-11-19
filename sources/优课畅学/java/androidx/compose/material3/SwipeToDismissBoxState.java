package androidx.compose.material3;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.material3.internal.AnchoredDraggableDefaults;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import com.google.android.material.color.utilities.Contrast;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SwipeToDismissBoxState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableState;
    private final Density density;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue> Saver(final InterfaceC10570l interfaceC10570l, final InterfaceC10570l interfaceC10570l2, final Density density) {
            return SaverKt.Saver(new InterfaceC10574p() { // from class: androidx.compose.material3.SwipeToDismissBoxState$Companion$Saver$1
                @Override // p300x7.InterfaceC10574p
                public final SwipeToDismissBoxValue invoke(SaverScope saverScope, SwipeToDismissBoxState swipeToDismissBoxState) {
                    return swipeToDismissBoxState.getCurrentValue();
                }
            }, new InterfaceC10570l() { // from class: androidx.compose.material3.SwipeToDismissBoxState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public final SwipeToDismissBoxState invoke(SwipeToDismissBoxValue swipeToDismissBoxValue) {
                    return new SwipeToDismissBoxState(swipeToDismissBoxValue, density, interfaceC10570l, interfaceC10570l2);
                }
            });
        }

        private Companion() {
        }
    }

    public SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, Density density, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        this.density = density;
        this.anchoredDraggableState = new AnchoredDraggableState<>(swipeToDismissBoxValue, interfaceC10570l2, new InterfaceC10559a() { // from class: androidx.compose.material3.SwipeToDismissBoxState$anchoredDraggableState$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Float invoke() {
                return Float.valueOf(this.this$0.getDensity$material3_release().mo20497toPx0680j_4(SwipeToDismissBoxKt.DismissVelocityThreshold));
            }
        }, AnchoredDraggableDefaults.INSTANCE.getAnimationSpec(), interfaceC10570l);
    }

    public final Object dismiss(SwipeToDismissBoxValue swipeToDismissBoxValue, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, swipeToDismissBoxValue, 0.0f, interfaceC9324c, 2, null);
        return objAnimateTo$default == AbstractC9434a.m17291f() ? objAnimateTo$default : C8736p.f16368a;
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

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN)
    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    public final SwipeToDismissBoxValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final Object reset(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, SwipeToDismissBoxValue.Settled, 0.0f, interfaceC9324c, 2, null);
        return objAnimateTo$default == AbstractC9434a.m17291f() ? objAnimateTo$default : C8736p.f16368a;
    }

    public final Object snapTo(SwipeToDismissBoxValue swipeToDismissBoxValue, InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, swipeToDismissBoxValue, interfaceC9324c);
        return objSnapTo == AbstractC9434a.m17291f() ? objSnapTo : C8736p.f16368a;
    }

    public /* synthetic */ SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, Density density, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, int i10, AbstractC9126n abstractC9126n) {
        this(swipeToDismissBoxValue, density, (i10 & 4) != 0 ? new InterfaceC10570l() { // from class: androidx.compose.material3.SwipeToDismissBoxState.1
            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(SwipeToDismissBoxValue swipeToDismissBoxValue2) {
                return Boolean.TRUE;
            }
        } : interfaceC10570l, interfaceC10570l2);
    }
}
