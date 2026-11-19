package com.tendcloud.tenddata;

import com.tendcloud.tenddata.AbstractRunnableC7889bu;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;

/* renamed from: com.tendcloud.tenddata.bt */
/* loaded from: classes5.dex */
public class C7888bt implements AbstractRunnableC7889bu.a {
    @Override // com.tendcloud.tenddata.AbstractRunnableC7889bu.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SocketChannel wrapChannel(SocketChannel socketChannel, SelectionKey selectionKey) {
        return socketChannel;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7853al
    /* renamed from: createWebSocket, reason: merged with bridge method [inline-methods] */
    public C7854am mo11141a(AbstractC7852ak abstractC7852ak, AbstractC7860as abstractC7860as, Socket socket) {
        return new C7854am(abstractC7852ak, abstractC7860as);
    }

    @Override // com.tendcloud.tenddata.AbstractRunnableC7889bu.a
    public C7854am createWebSocket(AbstractC7852ak abstractC7852ak, List<AbstractC7860as> list, Socket socket) {
        return new C7854am(abstractC7852ak, list);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7853al
    /* renamed from: a */
    public /* synthetic */ InterfaceC7851aj mo11142a(AbstractC7852ak abstractC7852ak, List list, Socket socket) {
        return createWebSocket(abstractC7852ak, (List<AbstractC7860as>) list, socket);
    }
}
