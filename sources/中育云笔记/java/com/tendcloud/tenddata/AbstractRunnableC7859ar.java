package com.tendcloud.tenddata;

import android.annotation.SuppressLint;
import com.tendcloud.tenddata.InterfaceC7851aj;
import com.tendcloud.tenddata.InterfaceC7876bh;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.eclipse.paho.client.mqttv3.MqttTopic;

@SuppressLint({"Assert"})
/* renamed from: com.tendcloud.tenddata.ar */
/* loaded from: classes5.dex */
public abstract class AbstractRunnableC7859ar extends AbstractC7852ak implements InterfaceC7851aj, Runnable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private CountDownLatch closeLatch;
    private CountDownLatch connectLatch;
    private int connectTimeout;
    private AbstractC7860as draft;
    private C7854am engine;
    private Map<String, String> headers;
    private InputStream istream;
    private OutputStream ostream;
    private Proxy proxy;
    private Socket socket;
    protected URI uri;
    private Thread writeThread;

    /* renamed from: com.tendcloud.tenddata.ar$a */
    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName("WebsocketWriteThread");
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer byteBufferTake = AbstractRunnableC7859ar.this.engine.f14355h.take();
                    AbstractRunnableC7859ar.this.ostream.write(byteBufferTake.array(), 0, byteBufferTake.limit());
                    AbstractRunnableC7859ar.this.ostream.flush();
                } catch (IOException unused) {
                    AbstractRunnableC7859ar.this.engine.m11154b();
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
        }
    }

    public AbstractRunnableC7859ar(URI uri) {
        this(uri, new C7862au());
    }

    private int getPort() {
        int port = this.uri.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.uri.getScheme();
        if (scheme.equals(C7842aa.f14258s)) {
            return 443;
        }
        if (scheme.equals("ws")) {
            return 80;
        }
        throw new RuntimeException("unkonow scheme" + scheme);
    }

    private void sendHandshake() throws C7869ba {
        String path = this.uri.getPath();
        String query = this.uri.getQuery();
        if (path == null || path.length() == 0) {
            path = MqttTopic.TOPIC_LEVEL_SEPARATOR;
        }
        if (query != null) {
            path = path + "?" + query;
        }
        int port = getPort();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.uri.getHost());
        sb2.append(port != 80 ? ":" + port : "");
        String string = sb2.toString();
        C7881bm c7881bm = new C7881bm();
        c7881bm.setResourceDescriptor(path);
        c7881bm.mo11270a("Host", string);
        Map<String, String> map = this.headers;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c7881bm.mo11270a(entry.getKey(), entry.getValue());
            }
        }
        this.engine.startHandshake(c7881bm);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void close() {
        if (this.writeThread != null) {
            this.engine.close(1000);
        }
    }

    public void closeBlocking() throws InterruptedException {
        close();
        this.closeLatch.await();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void closeConnection(int i10, String str) {
        this.engine.closeConnection(i10, str);
    }

    public void connect() {
        if (this.writeThread != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        Thread thread = new Thread(this);
        this.writeThread = thread;
        thread.start();
    }

    public boolean connectBlocking() throws InterruptedException {
        connect();
        this.connectLatch.await();
        return this.engine.isOpen();
    }

    public InterfaceC7851aj getConnection() {
        return this.engine;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public AbstractC7860as getDraft() {
        return this.draft;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public InetSocketAddress getLocalSocketAddress(InterfaceC7851aj interfaceC7851aj) {
        Socket socket = this.socket;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public InterfaceC7851aj.a getReadyState() {
        return this.engine.getReadyState();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public InetSocketAddress getRemoteSocketAddress(InterfaceC7851aj interfaceC7851aj) {
        Socket socket = this.socket;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public String getResourceDescriptor() {
        return this.uri.getPath();
    }

    public URI getURI() {
        return this.uri;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public boolean hasBufferedData() {
        return this.engine.hasBufferedData();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public boolean isClosed() {
        return this.engine.isClosed();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public boolean isClosing() {
        return this.engine.isClosing();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public boolean isConnecting() {
        return this.engine.isConnecting();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public boolean isFlushAndClose() {
        return this.engine.isFlushAndClose();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public boolean isOpen() {
        return this.engine.isOpen();
    }

    public abstract void onClose(int i10, String str, boolean z10);

    public void onCloseInitiated(int i10, String str) {
    }

    public void onClosing(int i10, String str, boolean z10) {
    }

    public abstract void onError(Exception exc);

    public void onFragment(InterfaceC7876bh interfaceC7876bh) {
    }

    public abstract void onMessage(String str);

    public void onMessage(ByteBuffer byteBuffer) {
    }

    public abstract void onOpen(InterfaceC7885bq interfaceC7885bq);

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public final void onWebsocketClose(InterfaceC7851aj interfaceC7851aj, int i10, String str, boolean z10) throws IOException {
        this.connectLatch.countDown();
        this.closeLatch.countDown();
        Thread thread = this.writeThread;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e10) {
            onWebsocketError(this, e10);
        }
        onClose(i10, str, z10);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public void onWebsocketCloseInitiated(InterfaceC7851aj interfaceC7851aj, int i10, String str) {
        onCloseInitiated(i10, str);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public void onWebsocketClosing(InterfaceC7851aj interfaceC7851aj, int i10, String str, boolean z10) {
        onClosing(i10, str, z10);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public final void onWebsocketError(InterfaceC7851aj interfaceC7851aj, Exception exc) {
        onError(exc);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public final void onWebsocketMessage(InterfaceC7851aj interfaceC7851aj, String str) {
        onMessage(str);
    }

    @Override // com.tendcloud.tenddata.AbstractC7852ak, com.tendcloud.tenddata.InterfaceC7855an
    public void onWebsocketMessageFragment(InterfaceC7851aj interfaceC7851aj, InterfaceC7876bh interfaceC7876bh) {
        onFragment(interfaceC7876bh);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public final void onWebsocketOpen(InterfaceC7851aj interfaceC7851aj, InterfaceC7883bo interfaceC7883bo) {
        this.connectLatch.countDown();
        onOpen((InterfaceC7885bq) interfaceC7883bo);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public final void onWriteDemand(InterfaceC7851aj interfaceC7851aj) {
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            C7917cv.f14639a.put(Long.valueOf(Thread.currentThread().getId()), getURI().getHost());
            try {
                Socket socket = this.socket;
                if (socket == null) {
                    this.socket = new Socket(this.proxy);
                } else if (socket.isClosed()) {
                    throw new IOException();
                }
                if (!this.socket.isBound()) {
                    this.socket.connect(new InetSocketAddress(this.uri.getHost(), getPort()), this.connectTimeout);
                }
                this.istream = this.socket.getInputStream();
                this.ostream = this.socket.getOutputStream();
                sendHandshake();
                Thread thread = new Thread(new a());
                this.writeThread = thread;
                thread.start();
                byte[] bArr = new byte[C7854am.f14349c];
                while (!isClosed() && (i10 = this.istream.read(bArr)) != -1) {
                    try {
                        try {
                            this.engine.decode(ByteBuffer.wrap(bArr, 0, i10));
                        } catch (IOException unused) {
                            this.engine.m11154b();
                            return;
                        }
                    } catch (RuntimeException e10) {
                        onError(e10);
                        this.engine.closeConnection(1006, e10.getMessage());
                        return;
                    }
                }
                this.engine.m11154b();
            } catch (Exception e11) {
                onWebsocketError(this.engine, e11);
                this.engine.closeConnection(-1, e11.getMessage());
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void send(String str) {
        this.engine.send(str);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void sendFragmentedFrame(InterfaceC7876bh.a aVar, ByteBuffer byteBuffer, boolean z10) {
        this.engine.sendFragmentedFrame(aVar, byteBuffer, z10);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void sendFrame(InterfaceC7876bh interfaceC7876bh) {
        this.engine.sendFrame(interfaceC7876bh);
    }

    public void setProxy(Proxy proxy) {
        if (proxy == null) {
            throw new IllegalArgumentException();
        }
        this.proxy = proxy;
    }

    public void setSocket(Socket socket) {
        if (this.socket != null) {
            throw new IllegalStateException("socket has already been set");
        }
        this.socket = socket;
    }

    public AbstractRunnableC7859ar(URI uri, AbstractC7860as abstractC7860as) {
        this(uri, abstractC7860as, null, 0);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public final void onWebsocketMessage(InterfaceC7851aj interfaceC7851aj, ByteBuffer byteBuffer) {
        onMessage(byteBuffer);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void send(byte[] bArr) {
        this.engine.send(bArr);
    }

    public AbstractRunnableC7859ar(URI uri, AbstractC7860as abstractC7860as, Map<String, String> map, int i10) {
        this.uri = null;
        this.engine = null;
        this.socket = null;
        this.proxy = Proxy.NO_PROXY;
        this.connectLatch = new CountDownLatch(1);
        this.closeLatch = new CountDownLatch(1);
        this.connectTimeout = 0;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        if (abstractC7860as != null) {
            this.uri = uri;
            this.draft = abstractC7860as;
            this.headers = map;
            this.connectTimeout = i10;
            this.engine = new C7854am(this, abstractC7860as);
            return;
        }
        throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void close(int i10) {
        this.engine.close();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public InetSocketAddress getLocalSocketAddress() {
        return this.engine.getLocalSocketAddress();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public InetSocketAddress getRemoteSocketAddress() {
        return this.engine.getRemoteSocketAddress();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void send(ByteBuffer byteBuffer) {
        this.engine.send(byteBuffer);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void close(int i10, String str) {
        this.engine.close(i10, str);
    }
}
