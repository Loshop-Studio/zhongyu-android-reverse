package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollSource;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", m17801f = "Scrollable.kt", m17802l = {814}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref$LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref$LongRef ref$LongRef, long j10, InterfaceC9324c<? super ScrollingLogic$doFlingAnimation$2> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = scrollingLogic;
        this.$result = ref$LongRef;
        this.$available = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, interfaceC9324c);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(NestedScrollScope nestedScrollScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((ScrollingLogic$doFlingAnimation$2) create(nestedScrollScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ScrollingLogic scrollingLogic;
        Ref$LongRef ref$LongRef;
        ScrollingLogic scrollingLogic2;
        long j10;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            final ScrollingLogic scrollingLogic3 = this.this$0;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float f10) {
                    if (ComposeFoundationFlags.NewNestedFlingPropagationEnabled && Math.abs(f10) != 0.0f && scrollingLogic3.shouldCancelFling(f10)) {
                        throw new FlingCancellationException();
                    }
                    ScrollingLogic scrollingLogic4 = scrollingLogic3;
                    return scrollingLogic4.reverseIfNeeded(scrollingLogic4.m20645toFloatk4lQ0M(nestedScrollScope.mo20600scrollByWithOverscrollOzD1aCk(scrollingLogic4.m20643reverseIfNeededMKHz9U(scrollingLogic4.m20646toOffsettuRUvjQ(f10)), NestedScrollSource.Companion.m25393getSideEffectWNlRxjI())));
                }
            };
            scrollingLogic = this.this$0;
            Ref$LongRef ref$LongRef2 = this.$result;
            long j11 = this.$available;
            FlingBehavior flingBehavior = scrollingLogic.flingBehavior;
            long j12 = ref$LongRef2.f17472a;
            float fReverseIfNeeded = scrollingLogic.reverseIfNeeded(scrollingLogic.m20638toFloatTH1AsA0(j11));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = ref$LongRef2;
            this.J$0 = j12;
            this.label = 1;
            Object objPerformFling = flingBehavior.performFling(scrollScope, fReverseIfNeeded, this);
            if (objPerformFling == objM17291f) {
                return objM17291f;
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
            AbstractC9079b.m15926b(obj);
        }
        ref$LongRef.f17472a = scrollingLogic.m20639updateQWom1Mo(j10, scrollingLogic2.reverseIfNeeded(((Number) obj).floatValue()));
        return C8736p.f16368a;
    }
}
