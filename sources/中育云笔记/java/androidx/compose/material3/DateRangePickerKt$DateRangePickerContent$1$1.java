package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$1$1", m26211f = "DateRangePicker.kt", m26212l = {730}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DateRangePickerKt$DateRangePickerContent$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ int $monthIndex;
    final /* synthetic */ LazyListState $monthsListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePickerContent$1$1(LazyListState lazyListState, int i10, InterfaceC11588c<? super DateRangePickerKt$DateRangePickerContent$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$monthsListState = lazyListState;
        this.$monthIndex = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new DateRangePickerKt$DateRangePickerContent$1$1(this.$monthsListState, this.$monthIndex, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            int firstVisibleItemIndex = this.$monthsListState.getFirstVisibleItemIndex();
            int i11 = this.$monthIndex;
            if (firstVisibleItemIndex != i11) {
                LazyListState lazyListState = this.$monthsListState;
                this.label = 1;
                if (LazyListState.scrollToItem$default(lazyListState, i11, 0, this, 2, null) == objM25952f) {
                    return objM25952f;
                }
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
        return ((DateRangePickerKt$DateRangePickerContent$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
