package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollingLogic", m26211f = "Scrollable.kt", m26212l = {782}, m26213m = "doFlingAnimation-QWom1Mo")
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$1(ScrollingLogic scrollingLogic, InterfaceC11588c<? super ScrollingLogic$doFlingAnimation$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m27242doFlingAnimationQWom1Mo(0L, this);
    }
}
