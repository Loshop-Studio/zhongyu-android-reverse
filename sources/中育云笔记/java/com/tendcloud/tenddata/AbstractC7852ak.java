package com.tendcloud.tenddata;

import com.tendcloud.tenddata.InterfaceC7876bh;
import java.net.InetSocketAddress;

/* renamed from: com.tendcloud.tenddata.ak */
/* loaded from: classes5.dex */
public abstract class AbstractC7852ak implements InterfaceC7855an {
    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public String getFlashPolicy(InterfaceC7851aj interfaceC7851aj) throws C7869ba {
        InetSocketAddress localSocketAddress = interfaceC7851aj.getLocalSocketAddress();
        if (localSocketAddress == null) {
            throw new C7869ba("socket not bound");
        }
        StringBuffer stringBuffer = new StringBuffer(90);
        stringBuffer.append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"");
        stringBuffer.append(localSocketAddress.getPort());
        stringBuffer.append("\" /></cross-domain-policy>\u0000");
        return stringBuffer.toString();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public void onWebsocketHandshakeReceivedAsClient(InterfaceC7851aj interfaceC7851aj, InterfaceC7878bj interfaceC7878bj, InterfaceC7885bq interfaceC7885bq) {
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public InterfaceC7886br onWebsocketHandshakeReceivedAsServer(InterfaceC7851aj interfaceC7851aj, AbstractC7860as abstractC7860as, InterfaceC7878bj interfaceC7878bj) {
        return new C7882bn();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public void onWebsocketHandshakeSentAsClient(InterfaceC7851aj interfaceC7851aj, InterfaceC7878bj interfaceC7878bj) {
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public void onWebsocketMessageFragment(InterfaceC7851aj interfaceC7851aj, InterfaceC7876bh interfaceC7876bh) {
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public void onWebsocketPing(InterfaceC7851aj interfaceC7851aj, InterfaceC7876bh interfaceC7876bh) {
        C7877bi c7877bi = new C7877bi(interfaceC7876bh);
        c7877bi.setOptcode(InterfaceC7876bh.a.PONG);
        interfaceC7851aj.sendFrame(c7877bi);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public void onWebsocketPong(InterfaceC7851aj interfaceC7851aj, InterfaceC7876bh interfaceC7876bh) {
    }
}
