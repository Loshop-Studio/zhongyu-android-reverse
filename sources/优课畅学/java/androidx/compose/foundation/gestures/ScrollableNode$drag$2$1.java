package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollSource;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", m17801f = "Scrollable.kt", m17802l = {TbsListener.ErrorCode.ERROR_QBSDK_INIT_ERROR_RET_TYPE_NOT_BUNDLE}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollableNode$drag$2$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC10574p $forEachDelta;
    final /* synthetic */ ScrollingLogic $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$drag$2$1(InterfaceC10574p interfaceC10574p, ScrollingLogic scrollingLogic, InterfaceC9324c<? super ScrollableNode$drag$2$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$forEachDelta = interfaceC10574p;
        this.$this_with = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        ScrollableNode$drag$2$1 scrollableNode$drag$2$1 = new ScrollableNode$drag$2$1(this.$forEachDelta, this.$this_with, interfaceC9324c);
        scrollableNode$drag$2$1.L$0 = obj;
        return scrollableNode$drag$2$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(NestedScrollScope nestedScrollScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((ScrollableNode$drag$2$1) create(nestedScrollScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            InterfaceC10574p interfaceC10574p = this.$forEachDelta;
            final ScrollingLogic scrollingLogic = this.$this_with;
            InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.ScrollableNode$drag$2$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DragEvent.DragDelta) obj2);
                    return C8736p.f16368a;
                }

                public final void invoke(DragEvent.DragDelta dragDelta) {
                    nestedScrollScope.mo20600scrollByWithOverscrollOzD1aCk(scrollingLogic.m20644singleAxisOffsetMKHz9U(dragDelta.m20535getDeltaF1C5BW0()), NestedScrollSource.Companion.m25394getUserInputWNlRxjI());
                }
            };
            this.label = 1;
            if (interfaceC10574p.invoke(interfaceC10570l, this) == objM17291f) {
                return objM17291f;
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
