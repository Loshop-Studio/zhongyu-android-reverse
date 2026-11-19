package com.tendcloud.tenddata;

import android.annotation.SuppressLint;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLSession;

@SuppressLint({"Assert"})
/* renamed from: com.tendcloud.tenddata.ah */
/* loaded from: classes5.dex */
public class C7849ah implements InterfaceC7857ap, ByteChannel {

    /* renamed from: a */
    protected static ByteBuffer f14334a = ByteBuffer.allocate(0);

    /* renamed from: m */
    static final /* synthetic */ boolean f14335m = true;

    /* renamed from: b */
    protected ExecutorService f14336b;

    /* renamed from: c */
    protected List<Future<?>> f14337c;

    /* renamed from: d */
    protected ByteBuffer f14338d;

    /* renamed from: e */
    protected ByteBuffer f14339e;

    /* renamed from: f */
    protected ByteBuffer f14340f;

    /* renamed from: g */
    protected SocketChannel f14341g;

    /* renamed from: h */
    protected SelectionKey f14342h;

    /* renamed from: i */
    protected SSLEngine f14343i;

    /* renamed from: j */
    protected SSLEngineResult f14344j;

    /* renamed from: k */
    protected SSLEngineResult f14345k;

    /* renamed from: l */
    protected int f14346l = 0;

    public C7849ah(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null || sSLEngine == null || executorService == null) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.f14341g = socketChannel;
        this.f14343i = sSLEngine;
        this.f14336b = executorService;
        SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, sSLEngine.getHandshakeStatus(), 0, 0);
        this.f14345k = sSLEngineResult;
        this.f14344j = sSLEngineResult;
        this.f14337c = new ArrayList(3);
        if (selectionKey != null) {
            selectionKey.interestOps(selectionKey.interestOps() | 4);
            this.f14342h = selectionKey;
        }
        m11131a(sSLEngine.getSession());
        this.f14341g.write(m11125b(f14334a));
        m11127j();
    }

    /* renamed from: a */
    private void m11124a(Future<?> future) throws ExecutionException, InterruptedException {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    future.get();
                    break;
                } catch (ExecutionException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: b */
    private synchronized ByteBuffer m11125b(ByteBuffer byteBuffer) {
        this.f14339e.compact();
        this.f14345k = this.f14343i.wrap(byteBuffer, this.f14339e);
        this.f14339e.flip();
        return this.f14339e;
    }

    /* renamed from: c */
    private int m11126c(ByteBuffer byteBuffer) {
        if (this.f14338d.hasRemaining()) {
            return m11123a(this.f14338d, byteBuffer);
        }
        if (!this.f14338d.hasRemaining()) {
            this.f14338d.clear();
        }
        if (!this.f14340f.hasRemaining()) {
            return 0;
        }
        m11128k();
        int iM11123a = m11123a(this.f14338d, byteBuffer);
        if (iM11123a > 0) {
            return iM11123a;
        }
        return 0;
    }

    /* renamed from: j */
    private synchronized void m11127j() {
        try {
            if (this.f14343i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
                return;
            }
            if (!this.f14337c.isEmpty()) {
                Iterator<Future<?>> it = this.f14337c.iterator();
                while (it.hasNext()) {
                    Future<?> next = it.next();
                    if (!next.isDone()) {
                        if (mo11122d()) {
                            m11124a(next);
                        }
                        return;
                    }
                    it.remove();
                }
            }
            if (this.f14343i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                if (!mo11122d() || this.f14344j.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                    this.f14340f.compact();
                    if (this.f14341g.read(this.f14340f) == -1) {
                        throw new IOException("connection closed unexpectedly by peer");
                    }
                    this.f14340f.flip();
                }
                this.f14338d.compact();
                m11128k();
                if (this.f14344j.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    m11131a(this.f14343i.getSession());
                    return;
                }
            }
            m11133e();
            if (this.f14337c.isEmpty() || this.f14343i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                this.f14341g.write(m11125b(f14334a));
                if (this.f14345k.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    m11131a(this.f14343i.getSession());
                    return;
                }
            }
            if (!f14335m && this.f14343i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
                throw new AssertionError();
            }
            this.f14346l = 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: k */
    private synchronized ByteBuffer m11128k() {
        while (true) {
            try {
                int iRemaining = this.f14338d.remaining();
                SSLEngineResult sSLEngineResultUnwrap = this.f14343i.unwrap(this.f14340f, this.f14338d);
                this.f14344j = sSLEngineResultUnwrap;
                if (sSLEngineResultUnwrap.getStatus() != SSLEngineResult.Status.OK || (iRemaining == this.f14338d.remaining() && this.f14343i.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NEED_UNWRAP)) {
                    break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14338d.flip();
        return this.f14338d;
    }

    /* renamed from: l */
    private boolean m11129l() {
        SSLEngineResult.HandshakeStatus handshakeStatus = this.f14343i.getHandshakeStatus();
        return handshakeStatus == SSLEngineResult.HandshakeStatus.FINISHED || handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14343i.closeOutbound();
        this.f14343i.getSession().invalidate();
        if (this.f14341g.isOpen()) {
            this.f14341g.write(m11125b(f14334a));
        }
        this.f14341g.close();
        this.f14336b.shutdownNow();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7857ap
    /* renamed from: d */
    public boolean mo11122d() {
        return this.f14341g.isBlocking();
    }

    /* renamed from: e */
    public void m11133e() {
        while (true) {
            Runnable delegatedTask = this.f14343i.getDelegatedTask();
            if (delegatedTask == null) {
                return;
            } else {
                this.f14337c.add(this.f14336b.submit(delegatedTask));
            }
        }
    }

    /* renamed from: f */
    public boolean m11134f() {
        return this.f14341g.isConnected();
    }

    /* renamed from: g */
    public boolean m11135g() {
        return this.f14341g.finishConnect();
    }

    /* renamed from: h */
    public Socket m11136h() {
        return this.f14341g.socket();
    }

    /* renamed from: i */
    public boolean m11137i() {
        return this.f14343i.isInboundDone();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f14341g.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (!m11129l()) {
            if (mo11122d()) {
                while (!m11129l()) {
                    m11127j();
                }
            } else {
                m11127j();
                if (!m11129l()) {
                    return 0;
                }
            }
        }
        if (this.f14346l <= 1) {
            m11131a(this.f14343i.getSession());
        }
        int iM11126c = m11126c(byteBuffer);
        if (iM11126c != 0) {
            return iM11126c;
        }
        if (!f14335m && this.f14338d.position() != 0) {
            throw new AssertionError();
        }
        this.f14338d.clear();
        if (this.f14340f.hasRemaining()) {
            this.f14340f.compact();
        } else {
            this.f14340f.clear();
        }
        if ((mo11122d() || this.f14344j.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) && this.f14341g.read(this.f14340f) == -1) {
            return -1;
        }
        this.f14340f.flip();
        m11128k();
        int iM11123a = m11123a(this.f14338d, byteBuffer);
        return (iM11123a == 0 && mo11122d()) ? read(byteBuffer) : iM11123a;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (!m11129l()) {
            m11127j();
            return 0;
        }
        if (this.f14346l <= 1) {
            m11131a(this.f14343i.getSession());
        }
        return this.f14341g.write(m11125b(byteBuffer));
    }

    /* renamed from: a */
    public void m11131a(SSLSession sSLSession) {
        int applicationBufferSize = sSLSession.getApplicationBufferSize();
        int packetBufferSize = sSLSession.getPacketBufferSize();
        ByteBuffer byteBuffer = this.f14338d;
        if (byteBuffer == null) {
            this.f14338d = ByteBuffer.allocate(applicationBufferSize);
            this.f14339e = ByteBuffer.allocate(packetBufferSize);
            this.f14340f = ByteBuffer.allocate(packetBufferSize);
        } else {
            if (byteBuffer.capacity() != applicationBufferSize) {
                this.f14338d = ByteBuffer.allocate(applicationBufferSize);
            }
            if (this.f14339e.capacity() != packetBufferSize) {
                this.f14339e = ByteBuffer.allocate(packetBufferSize);
            }
            if (this.f14340f.capacity() != packetBufferSize) {
                this.f14340f = ByteBuffer.allocate(packetBufferSize);
            }
        }
        this.f14338d.rewind();
        this.f14338d.flip();
        this.f14340f.rewind();
        this.f14340f.flip();
        this.f14339e.rewind();
        this.f14339e.flip();
        this.f14346l++;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7857ap
    /* renamed from: b */
    public void mo11120b() {
        write(this.f14339e);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7857ap
    /* renamed from: c */
    public boolean mo11121c() {
        if (this.f14338d.hasRemaining()) {
            return true;
        }
        return (!this.f14340f.hasRemaining() || this.f14344j.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW || this.f14344j.getStatus() == SSLEngineResult.Status.CLOSED) ? false : true;
    }

    /* renamed from: a */
    public SelectableChannel m11130a(boolean z10) {
        return this.f14341g.configureBlocking(z10);
    }

    /* renamed from: a */
    public boolean m11132a(SocketAddress socketAddress) {
        return this.f14341g.connect(socketAddress);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7857ap
    /* renamed from: a */
    public boolean mo11119a() {
        return this.f14339e.hasRemaining() || !m11129l();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7857ap
    /* renamed from: a */
    public int mo11118a(ByteBuffer byteBuffer) {
        return m11126c(byteBuffer);
    }

    /* renamed from: a */
    private int m11123a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iRemaining = byteBuffer.remaining();
        int iRemaining2 = byteBuffer2.remaining();
        if (iRemaining > iRemaining2) {
            int iMin = Math.min(iRemaining, iRemaining2);
            for (int i10 = 0; i10 < iMin; i10++) {
                byteBuffer2.put(byteBuffer.get());
            }
            return iMin;
        }
        byteBuffer2.put(byteBuffer);
        return iRemaining;
    }
}
