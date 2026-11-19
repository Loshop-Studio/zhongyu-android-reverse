package com.tendcloud.tenddata;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

/* renamed from: com.tendcloud.tenddata.an */
/* loaded from: classes5.dex */
public interface InterfaceC7855an {
    String getFlashPolicy(InterfaceC7851aj interfaceC7851aj);

    InetSocketAddress getLocalSocketAddress(InterfaceC7851aj interfaceC7851aj);

    InetSocketAddress getRemoteSocketAddress(InterfaceC7851aj interfaceC7851aj);

    void onWebsocketClose(InterfaceC7851aj interfaceC7851aj, int i10, String str, boolean z10);

    void onWebsocketCloseInitiated(InterfaceC7851aj interfaceC7851aj, int i10, String str);

    void onWebsocketClosing(InterfaceC7851aj interfaceC7851aj, int i10, String str, boolean z10);

    void onWebsocketError(InterfaceC7851aj interfaceC7851aj, Exception exc);

    void onWebsocketHandshakeReceivedAsClient(InterfaceC7851aj interfaceC7851aj, InterfaceC7878bj interfaceC7878bj, InterfaceC7885bq interfaceC7885bq);

    InterfaceC7886br onWebsocketHandshakeReceivedAsServer(InterfaceC7851aj interfaceC7851aj, AbstractC7860as abstractC7860as, InterfaceC7878bj interfaceC7878bj);

    void onWebsocketHandshakeSentAsClient(InterfaceC7851aj interfaceC7851aj, InterfaceC7878bj interfaceC7878bj);

    void onWebsocketMessage(InterfaceC7851aj interfaceC7851aj, String str);

    void onWebsocketMessage(InterfaceC7851aj interfaceC7851aj, ByteBuffer byteBuffer);

    void onWebsocketMessageFragment(InterfaceC7851aj interfaceC7851aj, InterfaceC7876bh interfaceC7876bh);

    void onWebsocketOpen(InterfaceC7851aj interfaceC7851aj, InterfaceC7883bo interfaceC7883bo);

    void onWebsocketPing(InterfaceC7851aj interfaceC7851aj, InterfaceC7876bh interfaceC7876bh);

    void onWebsocketPong(InterfaceC7851aj interfaceC7851aj, InterfaceC7876bh interfaceC7876bh);

    void onWriteDemand(InterfaceC7851aj interfaceC7851aj);
}
