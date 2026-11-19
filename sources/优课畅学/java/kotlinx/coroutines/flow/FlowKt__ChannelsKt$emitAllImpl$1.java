package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m17801f = "Channels.kt", m17802l = {32, 33}, m17803m = "emitAllImpl$FlowKt__ChannelsKt")
/* loaded from: classes5.dex */
public final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {

    /* renamed from: a */
    public Object f17710a;

    /* renamed from: b */
    public Object f17711b;

    /* renamed from: c */
    public Object f17712c;

    /* renamed from: d */
    public boolean f17713d;

    /* renamed from: e */
    public /* synthetic */ Object f17714e;

    /* renamed from: f */
    public int f17715f;

    public FlowKt__ChannelsKt$emitAllImpl$1(InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17714e = obj;
        this.f17715f |= Integer.MIN_VALUE;
        return FlowKt__ChannelsKt.m16579d(null, null, false, this);
    }
}
