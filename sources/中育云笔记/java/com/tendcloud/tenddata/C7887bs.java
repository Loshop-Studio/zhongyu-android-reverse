package com.tendcloud.tenddata;

import com.tendcloud.tenddata.AbstractRunnableC7889bu;
import java.net.Socket;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

/* renamed from: com.tendcloud.tenddata.bs */
/* loaded from: classes5.dex */
public class C7887bs implements AbstractRunnableC7889bu.a {

    /* renamed from: a */
    protected SSLContext f14428a;

    /* renamed from: b */
    protected ExecutorService f14429b;

    public C7887bs(SSLContext sSLContext) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor());
    }

    @Override // com.tendcloud.tenddata.InterfaceC7853al
    /* renamed from: createWebSocket */
    public C7854am mo11141a(AbstractC7852ak abstractC7852ak, AbstractC7860as abstractC7860as, Socket socket) {
        return new C7854am(abstractC7852ak, abstractC7860as);
    }

    @Override // com.tendcloud.tenddata.AbstractRunnableC7889bu.a
    public ByteChannel wrapChannel(SocketChannel socketChannel, SelectionKey selectionKey) {
        SSLEngine sSLEngineCreateSSLEngine = this.f14428a.createSSLEngine();
        sSLEngineCreateSSLEngine.setUseClientMode(false);
        return new C7849ah(socketChannel, sSLEngineCreateSSLEngine, this.f14429b, selectionKey);
    }

    public C7887bs(SSLContext sSLContext, ExecutorService executorService) {
        if (sSLContext == null || executorService == null) {
            throw new IllegalArgumentException();
        }
        this.f14428a = sSLContext;
        this.f14429b = executorService;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7853al
    /* renamed from: a */
    public /* synthetic */ InterfaceC7851aj mo11142a(AbstractC7852ak abstractC7852ak, List list, Socket socket) {
        return createWebSocket(abstractC7852ak, (List<AbstractC7860as>) list, socket);
    }

    @Override // com.tendcloud.tenddata.AbstractRunnableC7889bu.a
    public C7854am createWebSocket(AbstractC7852ak abstractC7852ak, List<AbstractC7860as> list, Socket socket) {
        return new C7854am(abstractC7852ak, list);
    }
}
