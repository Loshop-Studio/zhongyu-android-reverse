package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.compose.material3.SliderKt", m17801f = "Slider.kt", m17802l = {1426}, m17803m = "awaitSlop-8vUncbI")
/* loaded from: classes2.dex */
public final class SliderKt$awaitSlop$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public SliderKt$awaitSlop$1(InterfaceC9324c<? super SliderKt$awaitSlop$1> interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SliderKt.m22505awaitSlop8vUncbI(null, 0L, 0, this);
    }
}
