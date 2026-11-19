package androidx.compose.material3;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", m26211f = "Slider.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SliderKt$SliderImpl$drag$1$1 extends SuspendLambda implements InterfaceC9545q {
    final /* synthetic */ SliderState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$drag$1$1(SliderState sliderState, InterfaceC11588c<? super SliderKt$SliderImpl$drag$1$1> interfaceC11588c) {
        super(3, interfaceC11588c);
        this.$state = sliderState;
    }

    @Override // p181hd.InterfaceC9545q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC11122i0) obj, ((Number) obj2).floatValue(), (InterfaceC11588c<? super C10786q>) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.$state.getGestureEndAction$material3_release().invoke();
        return C10786q.f26013a;
    }

    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, float f10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return new SliderKt$SliderImpl$drag$1$1(this.$state, interfaceC11588c).invokeSuspend(C10786q.f26013a);
    }
}
