package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.channels.BufferedChannel", m26211f = "BufferedChannel.kt", m26212l = {759}, m26213m = "receiveCatching-JP2dKIU$suspendImpl")
/* loaded from: classes6.dex */
public final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {

    /* renamed from: c */
    public /* synthetic */ Object f23545c;

    /* renamed from: d */
    public final /* synthetic */ BufferedChannel f23546d;

    /* renamed from: e */
    public int f23547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(BufferedChannel bufferedChannel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f23546d = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f23545c = obj;
        this.f23547e |= Integer.MIN_VALUE;
        Object objM20553W0 = BufferedChannel.m20553W0(this.f23546d, this);
        return objM20553W0 == AbstractC11725a.m25952f() ? objM20553W0 : C10002c.m20724b(objM20553W0);
    }
}
