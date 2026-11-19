package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$1$1", m17801f = "DateRangePicker.kt", m17802l = {730}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DateRangePickerKt$DateRangePickerContent$1$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ int $monthIndex;
    final /* synthetic */ LazyListState $monthsListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePickerContent$1$1(LazyListState lazyListState, int i10, InterfaceC9324c<? super DateRangePickerKt$DateRangePickerContent$1$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$monthsListState = lazyListState;
        this.$monthIndex = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new DateRangePickerKt$DateRangePickerContent$1$1(this.$monthsListState, this.$monthIndex, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((DateRangePickerKt$DateRangePickerContent$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            int firstVisibleItemIndex = this.$monthsListState.getFirstVisibleItemIndex();
            int i11 = this.$monthIndex;
            if (firstVisibleItemIndex != i11) {
                LazyListState lazyListState = this.$monthsListState;
                this.label = 1;
                if (LazyListState.scrollToItem$default(lazyListState, i11, 0, this, 2, null) == objM17291f) {
                    return objM17291f;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
