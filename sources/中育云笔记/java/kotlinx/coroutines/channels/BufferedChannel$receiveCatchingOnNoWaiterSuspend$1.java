package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.channels.BufferedChannel", m26211f = "BufferedChannel.kt", m26212l = {3117}, m26213m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
/* loaded from: classes6.dex */
public final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f23548c;

    /* renamed from: d */
    public Object f23549d;

    /* renamed from: e */
    public int f23550e;

    /* renamed from: f */
    public long f23551f;

    /* renamed from: g */
    public /* synthetic */ Object f23552g;

    /* renamed from: h */
    public final /* synthetic */ BufferedChannel f23553h;

    /* renamed from: i */
    public int f23554i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel bufferedChannel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f23553h = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f23552g = obj;
        this.f23554i |= Integer.MIN_VALUE;
        Object objM20621X0 = this.f23553h.m20621X0(null, 0, 0L, this);
        return objM20621X0 == AbstractC11725a.m25952f() ? objM20621X0 : C10002c.m20724b(objM20621X0);
    }
}
