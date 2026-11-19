package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1", m26211f = "AppBar.kt", m26212l = {2386, 2388}, m26213m = "onPostFling-RZ2iAVY")
/* loaded from: classes2.dex */
public final class EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EnterAlwaysScrollBehavior$nestedScrollConnection$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(EnterAlwaysScrollBehavior$nestedScrollConnection$1 enterAlwaysScrollBehavior$nestedScrollConnection$1, InterfaceC11588c<? super EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = enterAlwaysScrollBehavior$nestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo27229onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
