package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.channels.BufferedChannel", m17801f = "BufferedChannel.kt", m17802l = {3087}, m17803m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
/* loaded from: classes5.dex */
public final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f17634a;

    /* renamed from: b */
    public Object f17635b;

    /* renamed from: c */
    public int f17636c;

    /* renamed from: d */
    public long f17637d;

    /* renamed from: e */
    public /* synthetic */ Object f17638e;

    /* renamed from: f */
    public final /* synthetic */ BufferedChannel f17639f;

    /* renamed from: g */
    public int f17640g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel bufferedChannel, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f17639f = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f17638e = obj;
        this.f17640g |= Integer.MIN_VALUE;
        Object objM16415E0 = this.f17639f.m16415E0(null, 0, 0L, this);
        return objM16415E0 == AbstractC9434a.m17291f() ? objM16415E0 : C9160c.m16531b(objM16415E0);
    }
}
