package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollSource;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", m17801f = "Scrollable.kt", m17802l = {475}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollableNode$onKeyEvent$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ long $scrollAmount;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", m17801f = "Scrollable.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1 */
    public static final class C13131 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ long $scrollAmount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13131(long j10, InterfaceC9324c<? super C13131> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$scrollAmount = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13131 c13131 = new C13131(this.$scrollAmount, interfaceC9324c);
            c13131.L$0 = obj;
            return c13131;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(NestedScrollScope nestedScrollScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13131) create(nestedScrollScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            ((NestedScrollScope) this.L$0).mo20599scrollByOzD1aCk(this.$scrollAmount, NestedScrollSource.Companion.m25394getUserInputWNlRxjI());
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onKeyEvent$1(ScrollableNode scrollableNode, long j10, InterfaceC9324c<? super ScrollableNode$onKeyEvent$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = scrollableNode;
        this.$scrollAmount = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new ScrollableNode$onKeyEvent$1(this.this$0, this.$scrollAmount, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((ScrollableNode$onKeyEvent$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ScrollingLogic scrollingLogic = this.this$0.scrollingLogic;
            MutatePriority mutatePriority = MutatePriority.UserInput;
            C13131 c13131 = new C13131(this.$scrollAmount, null);
            this.label = 1;
            if (scrollingLogic.scroll(mutatePriority, c13131, this) == objM17291f) {
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
