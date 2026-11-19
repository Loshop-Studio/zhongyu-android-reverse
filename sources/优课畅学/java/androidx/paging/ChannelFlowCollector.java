package androidx.paging;

import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.channels.InterfaceC9163f;
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;

/* loaded from: classes3.dex */
public final class ChannelFlowCollector<T> implements InterfaceC9267d {
    private final InterfaceC9163f channel;

    public ChannelFlowCollector(InterfaceC9163f channel) {
        AbstractC9133u.m16133g(channel, "channel");
        this.channel = channel;
    }

    @Override // p169l8.InterfaceC9267d
    public Object emit(T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objSend = this.channel.send(t10, interfaceC9324c);
        return objSend == AbstractC9434a.m17291f() ? objSend : C8736p.f16368a;
    }

    public final InterfaceC9163f getChannel() {
        return this.channel;
    }
}
