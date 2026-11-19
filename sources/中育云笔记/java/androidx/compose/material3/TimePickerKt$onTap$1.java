package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.TimePickerKt", m26211f = "TimePicker.kt", m26212l = {894, 897}, m26213m = "onTap-rOwcSBo")
/* loaded from: classes2.dex */
public final class TimePickerKt$onTap$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public TimePickerKt$onTap$1(InterfaceC11588c<? super TimePickerKt$onTap$1> interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TimePickerKt.m29339onTaprOwcSBo(null, 0.0f, 0.0f, 0.0f, false, 0L, this);
    }
}
