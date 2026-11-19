package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m26211f = "Channels.kt", m26212l = {32, 33}, m26213m = "emitAllImpl$FlowKt__ChannelsKt")
/* loaded from: classes6.dex */
public final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {

    /* renamed from: c */
    public Object f23618c;

    /* renamed from: d */
    public Object f23619d;

    /* renamed from: e */
    public Object f23620e;

    /* renamed from: f */
    public boolean f23621f;

    /* renamed from: g */
    public /* synthetic */ Object f23622g;

    /* renamed from: h */
    public int f23623h;

    public FlowKt__ChannelsKt$emitAllImpl$1(InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23622g = obj;
        this.f23623h |= Integer.MIN_VALUE;
        return FlowKt__ChannelsKt.m20767d(null, null, false, this);
    }
}
