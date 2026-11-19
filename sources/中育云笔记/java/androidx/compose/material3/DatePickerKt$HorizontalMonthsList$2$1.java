package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p265nd.C10405j;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1", m26211f = "DatePicker.kt", m26212l = {1698}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DatePickerKt$HorizontalMonthsList$2$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ InterfaceC9540l $onDisplayedMonthChange;
    final /* synthetic */ C10405j $yearRange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$HorizontalMonthsList$2$1(LazyListState lazyListState, InterfaceC9540l interfaceC9540l, CalendarModel calendarModel, C10405j c10405j, InterfaceC11588c<? super DatePickerKt$HorizontalMonthsList$2$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$lazyListState = lazyListState;
        this.$onDisplayedMonthChange = interfaceC9540l;
        this.$calendarModel = calendarModel;
        this.$yearRange = c10405j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new DatePickerKt$HorizontalMonthsList$2$1(this.$lazyListState, this.$onDisplayedMonthChange, this.$calendarModel, this.$yearRange, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            LazyListState lazyListState = this.$lazyListState;
            InterfaceC9540l interfaceC9540l = this.$onDisplayedMonthChange;
            CalendarModel calendarModel = this.$calendarModel;
            C10405j c10405j = this.$yearRange;
            this.label = 1;
            if (DatePickerKt.updateDisplayedMonth(lazyListState, interfaceC9540l, calendarModel, c10405j, this) == objM25952f) {
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
        return ((DatePickerKt$HorizontalMonthsList$2$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
