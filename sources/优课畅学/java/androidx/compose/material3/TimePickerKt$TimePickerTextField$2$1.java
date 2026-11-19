package androidx.compose.material3;

import androidx.compose.p013ui.focus.FocusRequester;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.material3.TimePickerKt$TimePickerTextField$2$1", m17801f = "TimePicker.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class TimePickerKt$TimePickerTextField$2$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ int $selection;
    final /* synthetic */ TimePickerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimePickerTextField$2$1(TimePickerState timePickerState, int i10, FocusRequester focusRequester, InterfaceC9324c<? super TimePickerKt$TimePickerTextField$2$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$state = timePickerState;
        this.$selection = i10;
        this.$focusRequester = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new TimePickerKt$TimePickerTextField$2$1(this.$state, this.$selection, this.$focusRequester, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((TimePickerKt$TimePickerTextField$2$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        if (TimePickerSelectionMode.m22756equalsimpl0(this.$state.mo21736getSelectionyecRtBI(), this.$selection)) {
            this.$focusRequester.requestFocus();
        }
        return C8736p.f16368a;
    }
}
