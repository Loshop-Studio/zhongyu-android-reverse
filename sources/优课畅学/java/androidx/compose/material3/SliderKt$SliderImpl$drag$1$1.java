package androidx.compose.material3;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", m17801f = "Slider.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SliderKt$SliderImpl$drag$1$1 extends SuspendLambda implements InterfaceC10575q {
    final /* synthetic */ SliderState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$drag$1$1(SliderState sliderState, InterfaceC9324c<? super SliderKt$SliderImpl$drag$1$1> interfaceC9324c) {
        super(3, interfaceC9324c);
        this.$state = sliderState;
    }

    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, float f10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return new SliderKt$SliderImpl$drag$1$1(this.$state, interfaceC9324c).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        this.$state.getGestureEndAction$material3_release().invoke();
        return C8736p.f16368a;
    }

    @Override // p300x7.InterfaceC10575q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC8822b0) obj, ((Number) obj2).floatValue(), (InterfaceC9324c<? super C8736p>) obj3);
    }
}
