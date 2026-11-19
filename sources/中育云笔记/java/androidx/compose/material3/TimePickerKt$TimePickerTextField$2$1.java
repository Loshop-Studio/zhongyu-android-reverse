package androidx.compose.material3;

import androidx.compose.p014ui.focus.FocusRequester;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.TimePickerKt$TimePickerTextField$2$1", m26211f = "TimePicker.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class TimePickerKt$TimePickerTextField$2$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ int $selection;
    final /* synthetic */ TimePickerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimePickerTextField$2$1(TimePickerState timePickerState, int i10, FocusRequester focusRequester, InterfaceC11588c<? super TimePickerKt$TimePickerTextField$2$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$state = timePickerState;
        this.$selection = i10;
        this.$focusRequester = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new TimePickerKt$TimePickerTextField$2$1(this.$state, this.$selection, this.$focusRequester, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        if (TimePickerSelectionMode.m29358equalsimpl0(this.$state.mo28338getSelectionyecRtBI(), this.$selection)) {
            this.$focusRequester.requestFocus();
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((TimePickerKt$TimePickerTextField$2$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
