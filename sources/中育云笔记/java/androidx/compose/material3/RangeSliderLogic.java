package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
final class RangeSliderLogic {
    private final MutableInteractionSource endInteractionSource;
    private final MutableInteractionSource startInteractionSource;
    private final RangeSliderState state;

    @InterfaceC11829d(m26210c = "androidx.compose.material3.RangeSliderLogic$captureThumb$1", m26211f = "Slider.kt", m26212l = {1739}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.RangeSliderLogic$captureThumb$1 */
    public static final class C22981 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ boolean $draggingStart;
        final /* synthetic */ Interaction $interaction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22981(boolean z10, Interaction interaction, InterfaceC11588c<? super C22981> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$draggingStart = z10;
            this.$interaction = interaction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return RangeSliderLogic.this.new C22981(this.$draggingStart, this.$interaction, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                MutableInteractionSource mutableInteractionSourceActiveInteraction = RangeSliderLogic.this.activeInteraction(this.$draggingStart);
                Interaction interaction = this.$interaction;
                this.label = 1;
                if (mutableInteractionSourceActiveInteraction.emit(interaction, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C22981) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public RangeSliderLogic(RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2) {
        this.state = rangeSliderState;
        this.startInteractionSource = mutableInteractionSource;
        this.endInteractionSource = mutableInteractionSource2;
    }

    public final MutableInteractionSource activeInteraction(boolean z10) {
        return z10 ? this.startInteractionSource : this.endInteractionSource;
    }

    public final void captureThumb(boolean z10, float f10, Interaction interaction, InterfaceC11122i0 interfaceC11122i0) {
        RangeSliderState rangeSliderState = this.state;
        rangeSliderState.onDrag$material3_release(z10, f10 - (z10 ? rangeSliderState.getRawOffsetStart$material3_release() : rangeSliderState.getRawOffsetEnd$material3_release()));
        AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C22981(z10, interaction, null), 3, null);
    }

    public final int compareOffsets(float f10) {
        return Float.compare(Math.abs(this.state.getRawOffsetStart$material3_release() - f10), Math.abs(this.state.getRawOffsetEnd$material3_release() - f10));
    }

    public final MutableInteractionSource getEndInteractionSource() {
        return this.endInteractionSource;
    }

    public final MutableInteractionSource getStartInteractionSource() {
        return this.startInteractionSource;
    }

    public final RangeSliderState getState() {
        return this.state;
    }
}
