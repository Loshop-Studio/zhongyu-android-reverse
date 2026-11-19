package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollSource;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", m26211f = "Scrollable.kt", m26212l = {475}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollableNode$onKeyEvent$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ long $scrollAmount;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", m26211f = "Scrollable.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1 */
    public static final class C13431 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ long $scrollAmount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13431(long j10, InterfaceC11588c<? super C13431> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$scrollAmount = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13431 c13431 = new C13431(this.$scrollAmount, interfaceC11588c);
            c13431.L$0 = obj;
            return c13431;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(NestedScrollScope nestedScrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13431) create(nestedScrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            ((NestedScrollScope) this.L$0).mo27201scrollByOzD1aCk(this.$scrollAmount, NestedScrollSource.Companion.m31996getUserInputWNlRxjI());
            return C10786q.f26013a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onKeyEvent$1(ScrollableNode scrollableNode, long j10, InterfaceC11588c<? super ScrollableNode$onKeyEvent$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = scrollableNode;
        this.$scrollAmount = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new ScrollableNode$onKeyEvent$1(this.this$0, this.$scrollAmount, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            ScrollingLogic scrollingLogic = this.this$0.scrollingLogic;
            MutatePriority mutatePriority = MutatePriority.UserInput;
            C13431 c13431 = new C13431(this.$scrollAmount, null);
            this.label = 1;
            if (scrollingLogic.scroll(mutatePriority, c13431, this) == objM25952f) {
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
        return ((ScrollableNode$onKeyEvent$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
