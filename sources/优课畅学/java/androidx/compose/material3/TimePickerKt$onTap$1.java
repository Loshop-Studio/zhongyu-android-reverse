package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.compose.material3.TimePickerKt", m17801f = "TimePicker.kt", m17802l = {894, 897}, m17803m = "onTap-rOwcSBo")
/* loaded from: classes2.dex */
public final class TimePickerKt$onTap$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public TimePickerKt$onTap$1(InterfaceC9324c<? super TimePickerKt$onTap$1> interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TimePickerKt.m22737onTaprOwcSBo(null, 0.0f, 0.0f, 0.0f, false, 0L, this);
    }
}
