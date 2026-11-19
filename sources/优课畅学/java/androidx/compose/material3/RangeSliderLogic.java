package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
final class RangeSliderLogic {
    private final MutableInteractionSource endInteractionSource;
    private final MutableInteractionSource startInteractionSource;
    private final RangeSliderState state;

    @InterfaceC9539d(m17800c = "androidx.compose.material3.RangeSliderLogic$captureThumb$1", m17801f = "Slider.kt", m17802l = {1739}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.RangeSliderLogic$captureThumb$1 */
    public static final class C22681 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ boolean $draggingStart;
        final /* synthetic */ Interaction $interaction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22681(boolean z10, Interaction interaction, InterfaceC9324c<? super C22681> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$draggingStart = z10;
            this.$interaction = interaction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return RangeSliderLogic.this.new C22681(this.$draggingStart, this.$interaction, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C22681) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                MutableInteractionSource mutableInteractionSourceActiveInteraction = RangeSliderLogic.this.activeInteraction(this.$draggingStart);
                Interaction interaction = this.$interaction;
                this.label = 1;
                if (mutableInteractionSourceActiveInteraction.emit(interaction, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
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

    public final void captureThumb(boolean z10, float f10, Interaction interaction, InterfaceC8822b0 interfaceC8822b0) {
        RangeSliderState rangeSliderState = this.state;
        rangeSliderState.onDrag$material3_release(z10, f10 - (z10 ? rangeSliderState.getRawOffsetStart$material3_release() : rangeSliderState.getRawOffsetEnd$material3_release()));
        AbstractC8839h.m14861d(interfaceC8822b0, null, null, new C22681(z10, interaction, null), 3, null);
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
