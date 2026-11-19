package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollSource;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/NestedScrollScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/NestedScrollScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", m5303f = "Scrollable.kt", m5304i = {}, m5305l = {330}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class ScrollableNode$drag$2$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6473e $forEachDelta;
    final /* synthetic */ ScrollingLogic $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$drag$2$1(InterfaceC6473e interfaceC6473e, ScrollingLogic scrollingLogic, InterfaceC5631c<? super ScrollableNode$drag$2$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$forEachDelta = interfaceC6473e;
        this.$this_with = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        ScrollableNode$drag$2$1 scrollableNode$drag$2$1 = new ScrollableNode$drag$2$1(this.$forEachDelta, this.$this_with, interfaceC5631c);
        scrollableNode$drag$2$1.L$0 = obj;
        return scrollableNode$drag$2$1;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(NestedScrollScope nestedScrollScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((ScrollableNode$drag$2$1) create(nestedScrollScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            InterfaceC6473e interfaceC6473e = this.$forEachDelta;
            final ScrollingLogic scrollingLogic = this.$this_with;
            InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.ScrollableNode$drag$2$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DragEvent.DragDelta) obj2);
                    return C5443s.f8405a;
                }

                public final void invoke(DragEvent.DragDelta dragDelta) {
                    nestedScrollScope.mo7006scrollByWithOverscrollOzD1aCk(scrollingLogic.m7050singleAxisOffsetMKHz9U(dragDelta.getDelta()), NestedScrollSource.INSTANCE.m11800getUserInputWNlRxjI());
                }
            };
            this.label = 1;
            if (interfaceC6473e.invoke(interfaceC6471c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }
}
