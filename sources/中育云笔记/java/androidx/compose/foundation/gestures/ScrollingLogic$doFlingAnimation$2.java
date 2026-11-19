package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollSource;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", m26211f = "Scrollable.kt", m26212l = {814}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref$LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref$LongRef ref$LongRef, long j10, InterfaceC11588c<? super ScrollingLogic$doFlingAnimation$2> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = scrollingLogic;
        this.$result = ref$LongRef;
        this.$available = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, interfaceC11588c);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(NestedScrollScope nestedScrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((ScrollingLogic$doFlingAnimation$2) create(nestedScrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ScrollingLogic scrollingLogic;
        Ref$LongRef ref$LongRef;
        ScrollingLogic scrollingLogic2;
        long j10;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            final ScrollingLogic scrollingLogic3 = this.this$0;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float f10) {
                    if (ComposeFoundationFlags.NewNestedFlingPropagationEnabled && Math.abs(f10) != 0.0f && scrollingLogic3.shouldCancelFling(f10)) {
                        throw new FlingCancellationException();
                    }
                    ScrollingLogic scrollingLogic4 = scrollingLogic3;
                    return scrollingLogic4.reverseIfNeeded(scrollingLogic4.m27247toFloatk4lQ0M(nestedScrollScope.mo27202scrollByWithOverscrollOzD1aCk(scrollingLogic4.m27245reverseIfNeededMKHz9U(scrollingLogic4.m27248toOffsettuRUvjQ(f10)), NestedScrollSource.Companion.m31995getSideEffectWNlRxjI())));
                }
            };
            scrollingLogic = this.this$0;
            Ref$LongRef ref$LongRef2 = this.$result;
            long j11 = this.$available;
            FlingBehavior flingBehavior = scrollingLogic.flingBehavior;
            long j12 = ref$LongRef2.f23401c;
            float fReverseIfNeeded = scrollingLogic.reverseIfNeeded(scrollingLogic.m27240toFloatTH1AsA0(j11));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = ref$LongRef2;
            this.J$0 = j12;
            this.label = 1;
            Object objPerformFling = flingBehavior.performFling(scrollScope, fReverseIfNeeded, this);
            if (objPerformFling == objM25952f) {
                return objM25952f;
            }
            ref$LongRef = ref$LongRef2;
            obj = objPerformFling;
            scrollingLogic2 = scrollingLogic;
            j10 = j12;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.J$0;
            ref$LongRef = (Ref$LongRef) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            AbstractC9924b.m20071b(obj);
        }
        ref$LongRef.f23401c = scrollingLogic.m27241updateQWom1Mo(j10, scrollingLogic2.reverseIfNeeded(((Number) obj).floatValue()));
        return C10786q.f26013a;
    }
}
