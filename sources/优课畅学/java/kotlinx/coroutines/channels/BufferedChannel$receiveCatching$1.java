package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.channels.BufferedChannel", m17801f = "BufferedChannel.kt", m17802l = {762}, m17803m = "receiveCatching-JP2dKIU$suspendImpl")
/* loaded from: classes5.dex */
public final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f17631a;

    /* renamed from: b */
    public final /* synthetic */ BufferedChannel f17632b;

    /* renamed from: c */
    public int f17633c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(BufferedChannel bufferedChannel, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f17632b = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f17631a = obj;
        this.f17633c |= Integer.MIN_VALUE;
        Object objM16377D0 = BufferedChannel.m16377D0(this.f17632b, this);
        return objM16377D0 == AbstractC9434a.m17291f() ? objM16377D0 : C9160c.m16531b(objM16377D0);
    }
}
