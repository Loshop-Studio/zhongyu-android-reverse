package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.SliderKt", m26211f = "Slider.kt", m26212l = {1426}, m26213m = "awaitSlop-8vUncbI")
/* loaded from: classes2.dex */
public final class SliderKt$awaitSlop$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public SliderKt$awaitSlop$1(InterfaceC11588c<? super SliderKt$awaitSlop$1> interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SliderKt.m29107awaitSlop8vUncbI(null, 0L, 0, this);
    }
}
