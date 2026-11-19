package androidx.room.coroutines;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.room.coroutines.Pool", m17801f = "ConnectionPoolImpl.kt", m17802l = {TbsListener.ErrorCode.DEXOPT_EXCEPTION}, m17803m = "acquireWithTimeout-KLykuaI")
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
    public Pool$acquireWithTimeout$1(Pool pool, InterfaceC9324c<? super Pool$acquireWithTimeout$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = pool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m27219acquireWithTimeoutKLykuaI(0L, null, this);
    }
}
