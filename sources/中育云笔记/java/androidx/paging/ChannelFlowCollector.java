package androidx.paging;

import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.channels.InterfaceC10005f;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class ChannelFlowCollector<T> implements InterfaceC11595d {
    private final InterfaceC10005f channel;

    public ChannelFlowCollector(InterfaceC10005f channel) {
        AbstractC9979u.m20294g(channel, "channel");
        this.channel = channel;
    }

    @Override // p379vd.InterfaceC11595d
    public Object emit(T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objSend = this.channel.send(t10, interfaceC11588c);
        return objSend == AbstractC11725a.m25952f() ? objSend : C10786q.f26013a;
    }

    public final InterfaceC10005f getChannel() {
        return this.channel;
    }
}
