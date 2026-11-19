package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", m26211f = "Scrollable.kt", m26212l = {898, 901}, m26213m = "onPostFling-RZ2iAVY")
/* loaded from: classes.dex */
public final class ScrollableNestedScrollConnection$onPostFling$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollableNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNestedScrollConnection$onPostFling$1(ScrollableNestedScrollConnection scrollableNestedScrollConnection, InterfaceC11588c<? super ScrollableNestedScrollConnection$onPostFling$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = scrollableNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo27229onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
