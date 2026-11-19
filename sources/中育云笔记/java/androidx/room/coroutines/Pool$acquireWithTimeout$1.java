package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.room.coroutines.Pool", m26211f = "ConnectionPoolImpl.kt", m26212l = {209}, m26213m = "acquireWithTimeout-KLykuaI")
/* loaded from: classes3.dex */
public final class Pool$acquireWithTimeout$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Pool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pool$acquireWithTimeout$1(Pool pool, InterfaceC11588c<? super Pool$acquireWithTimeout$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = pool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m33814acquireWithTimeoutKLykuaI(0L, null, this);
    }
}
