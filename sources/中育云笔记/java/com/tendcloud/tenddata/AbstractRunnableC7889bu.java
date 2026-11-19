package com.tendcloud.tenddata;

import android.annotation.SuppressLint;
import java.io.IOException;
import java.lang.Thread;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"Assert"})
/* renamed from: com.tendcloud.tenddata.bu */
/* loaded from: classes5.dex */
public abstract class AbstractRunnableC7889bu extends AbstractC7852ak implements Runnable {

    /* renamed from: a */
    public static int f14430a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    static final /* synthetic */ boolean f14431b = true;

    /* renamed from: c */
    private final Collection<InterfaceC7851aj> f14432c;

    /* renamed from: d */
    private final InetSocketAddress f14433d;

    /* renamed from: e */
    private ServerSocketChannel f14434e;

    /* renamed from: f */
    private Selector f14435f;

    /* renamed from: g */
    private List<AbstractC7860as> f14436g;

    /* renamed from: h */
    private Thread f14437h;

    /* renamed from: i */
    private volatile AtomicBoolean f14438i;

    /* renamed from: j */
    private List<b> f14439j;

    /* renamed from: k */
    private List<C7854am> f14440k;

    /* renamed from: l */
    private BlockingQueue<ByteBuffer> f14441l;

    /* renamed from: m */
    private int f14442m;

    /* renamed from: n */
    private AtomicInteger f14443n;

    /* renamed from: o */
    private a f14444o;

    /* renamed from: com.tendcloud.tenddata.bu$a */
    public interface a extends InterfaceC7853al {
        /* renamed from: createWebSocket */
        C7854am mo11141a(AbstractC7852ak abstractC7852ak, AbstractC7860as abstractC7860as, Socket socket);

        C7854am createWebSocket(AbstractC7852ak abstractC7852ak, List<AbstractC7860as> list, Socket socket);

        ByteChannel wrapChannel(SocketChannel socketChannel, SelectionKey selectionKey);
    }

    /* renamed from: com.tendcloud.tenddata.bu$b */
    public class b extends Thread {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private BlockingQueue<C7854am> iqueue = new LinkedBlockingQueue();

        public b() {
            setName("WebSocketWorker-" + getId());
            setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.tendcloud.tenddata.bu.b.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(thread, th);
                }
            });
        }

        public void put(C7854am c7854am) throws InterruptedException {
            this.iqueue.put(c7854am);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws InterruptedException {
            C7854am c7854amTake;
            RuntimeException e10;
            C7854am c7854am = null;
            while (true) {
                try {
                    try {
                        c7854amTake = this.iqueue.take();
                    } catch (RuntimeException e11) {
                        c7854amTake = c7854am;
                        e10 = e11;
                    }
                    try {
                        ByteBuffer byteBufferPoll = c7854amTake.f14356i.poll();
                        try {
                            c7854amTake.decode(byteBufferPoll);
                            AbstractRunnableC7889bu.this.m11281a(byteBufferPoll);
                            c7854am = c7854amTake;
                        } catch (Throwable th) {
                            AbstractRunnableC7889bu.this.m11281a(byteBufferPoll);
                            throw th;
                        }
                    } catch (RuntimeException e12) {
                        e10 = e12;
                        AbstractRunnableC7889bu.this.m11283b(c7854amTake, e10);
                        return;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public AbstractRunnableC7889bu() {
        this(new InetSocketAddress(80), f14430a, null);
    }

    /* renamed from: j */
    private ByteBuffer m11285j() {
        return this.f14441l.take();
    }

    /* renamed from: a */
    public void m11288a(InterfaceC7851aj interfaceC7851aj, int i10, String str) {
    }

    /* renamed from: a */
    public abstract void m11291a(InterfaceC7851aj interfaceC7851aj, InterfaceC7878bj interfaceC7878bj);

    /* renamed from: a */
    public abstract void m11292a(InterfaceC7851aj interfaceC7851aj, Exception exc);

    /* renamed from: a */
    public abstract void m11293a(InterfaceC7851aj interfaceC7851aj, String str);

    /* renamed from: b */
    public void m11297b(InterfaceC7851aj interfaceC7851aj) {
    }

    /* renamed from: b */
    public abstract void m11298b(InterfaceC7851aj interfaceC7851aj, int i10, String str, boolean z10);

    /* renamed from: c */
    public Collection<InterfaceC7851aj> m11299c() {
        return this.f14432c;
    }

    /* renamed from: d */
    public InetSocketAddress m11301d() {
        return this.f14433d;
    }

    /* renamed from: e */
    public int m11303e() {
        ServerSocketChannel serverSocketChannel;
        int port = m11301d().getPort();
        return (port != 0 || (serverSocketChannel = this.f14434e) == null) ? port : serverSocketChannel.socket().getLocalPort();
    }

    /* renamed from: f */
    public List<AbstractC7860as> m11304f() {
        return Collections.unmodifiableList(this.f14436g);
    }

    /* renamed from: g */
    public ByteBuffer m11305g() {
        return ByteBuffer.allocate(C7854am.f14349c);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public InetSocketAddress getLocalSocketAddress(InterfaceC7851aj interfaceC7851aj) {
        return (InetSocketAddress) m11284e(interfaceC7851aj).getLocalSocketAddress();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public InetSocketAddress getRemoteSocketAddress(InterfaceC7851aj interfaceC7851aj) {
        return (InetSocketAddress) m11284e(interfaceC7851aj).getRemoteSocketAddress();
    }

    /* renamed from: h */
    public String m11306h() {
        return "<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"" + m11303e() + "\" /></cross-domain-policy>";
    }

    /* renamed from: i */
    public final InterfaceC7853al m11307i() {
        return this.f14444o;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public final void onWebsocketClose(InterfaceC7851aj interfaceC7851aj, int i10, String str, boolean z10) {
        this.f14435f.wakeup();
        try {
            if (m11300c(interfaceC7851aj)) {
                m11298b(interfaceC7851aj, i10, str, z10);
            }
        } finally {
            try {
                m11297b(interfaceC7851aj);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public void onWebsocketCloseInitiated(InterfaceC7851aj interfaceC7851aj, int i10, String str) {
        m11288a(interfaceC7851aj, i10, str);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public void onWebsocketClosing(InterfaceC7851aj interfaceC7851aj, int i10, String str, boolean z10) {
        m11289a(interfaceC7851aj, i10, str, z10);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public final void onWebsocketError(InterfaceC7851aj interfaceC7851aj, Exception exc) {
        m11292a(interfaceC7851aj, exc);
    }

    @Override // com.tendcloud.tenddata.AbstractC7852ak, com.tendcloud.tenddata.InterfaceC7855an
    public InterfaceC7886br onWebsocketHandshakeReceivedAsServer(InterfaceC7851aj interfaceC7851aj, AbstractC7860as abstractC7860as, InterfaceC7878bj interfaceC7878bj) {
        return super.onWebsocketHandshakeReceivedAsServer(interfaceC7851aj, abstractC7860as, interfaceC7878bj);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public final void onWebsocketMessage(InterfaceC7851aj interfaceC7851aj, String str) {
        m11293a(interfaceC7851aj, str);
    }

    @Override // com.tendcloud.tenddata.AbstractC7852ak, com.tendcloud.tenddata.InterfaceC7855an
    @Deprecated
    public void onWebsocketMessageFragment(InterfaceC7851aj interfaceC7851aj, InterfaceC7876bh interfaceC7876bh) {
        m11290a(interfaceC7851aj, interfaceC7876bh);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public final void onWebsocketOpen(InterfaceC7851aj interfaceC7851aj, InterfaceC7883bo interfaceC7883bo) {
        if (m11302d(interfaceC7851aj)) {
            m11291a(interfaceC7851aj, (InterfaceC7878bj) interfaceC7883bo);
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public final void onWriteDemand(InterfaceC7851aj interfaceC7851aj) {
        C7854am c7854am = (C7854am) interfaceC7851aj;
        try {
            c7854am.f14353f.interestOps(5);
        } catch (CancelledKeyException unused) {
            c7854am.f14355h.clear();
        }
        this.f14435f.wakeup();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b3 A[Catch: all -> 0x009c, RuntimeException -> 0x009f, TRY_ENTER, TryCatch #13 {RuntimeException -> 0x009f, blocks: (B:14:0x005f, B:16:0x0067, B:18:0x0078, B:20:0x007e, B:21:0x0084, B:24:0x008b, B:26:0x0092, B:28:0x0098, B:35:0x00a6, B:37:0x00d3, B:39:0x00d9, B:40:0x00df, B:41:0x00e3, B:43:0x00eb, B:45:0x00f1, B:47:0x0102, B:49:0x010a, B:52:0x0112, B:53:0x0116, B:55:0x011b, B:56:0x011e, B:103:0x01b3, B:104:0x01b6, B:59:0x0122, B:61:0x0128, B:62:0x012e, B:64:0x0136, B:66:0x013c, B:70:0x0144, B:72:0x014c, B:73:0x0154, B:74:0x015c, B:76:0x0162, B:79:0x016a, B:81:0x0170, B:82:0x0179, B:84:0x017e, B:85:0x0181), top: B:175:0x005f, outer: #14 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.AbstractRunnableC7889bu.run():void");
    }

    public final void setWebSocketFactory(a aVar) {
        this.f14444o = aVar;
    }

    public void stop(int i10) {
        ArrayList arrayList;
        int i11 = 0;
        if (this.f14438i.compareAndSet(false, true)) {
            synchronized (this.f14432c) {
                arrayList = new ArrayList(this.f14432c);
            }
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((InterfaceC7851aj) obj).close(1001);
            }
            synchronized (this) {
                try {
                    if (this.f14437h != null) {
                        Thread.currentThread();
                        if (this.f14437h != Thread.currentThread()) {
                            if (arrayList.size() > 0) {
                                this.f14437h.join(i10);
                            }
                            this.f14437h.interrupt();
                            this.f14437h.join();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public AbstractRunnableC7889bu(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, f14430a, null);
    }

    /* renamed from: a */
    public void m11289a(InterfaceC7851aj interfaceC7851aj, int i10, String str, boolean z10) {
    }

    /* renamed from: b */
    public void m11296b() {
        stop(0);
    }

    /* renamed from: c */
    public boolean m11300c(InterfaceC7851aj interfaceC7851aj) {
        boolean zRemove;
        synchronized (this.f14432c) {
            try {
                zRemove = this.f14432c.remove(interfaceC7851aj);
                if (!f14431b && !zRemove) {
                    throw new AssertionError();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f14438i.get() && this.f14432c.size() == 0) {
            this.f14437h.interrupt();
        }
        return zRemove;
    }

    /* renamed from: d */
    public boolean m11302d(InterfaceC7851aj interfaceC7851aj) {
        boolean zAdd;
        if (this.f14438i.get()) {
            interfaceC7851aj.close(1001);
            return true;
        }
        synchronized (this.f14432c) {
            try {
                zAdd = this.f14432c.add(interfaceC7851aj);
                if (!f14431b && !zAdd) {
                    throw new AssertionError();
                }
            } finally {
            }
        }
        return zAdd;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7855an
    public final void onWebsocketMessage(InterfaceC7851aj interfaceC7851aj, ByteBuffer byteBuffer) {
        m11294a(interfaceC7851aj, byteBuffer);
    }

    public AbstractRunnableC7889bu(InetSocketAddress inetSocketAddress, int i10) {
        this(inetSocketAddress, i10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m11283b(InterfaceC7851aj interfaceC7851aj, Exception exc) {
        m11292a(interfaceC7851aj, exc);
        try {
            m11296b();
        } catch (IOException e10) {
            m11292a((InterfaceC7851aj) null, e10);
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            m11292a((InterfaceC7851aj) null, e11);
        }
    }

    /* renamed from: a */
    public void m11290a(InterfaceC7851aj interfaceC7851aj, InterfaceC7876bh interfaceC7876bh) {
    }

    public AbstractRunnableC7889bu(InetSocketAddress inetSocketAddress, List<AbstractC7860as> list) {
        this(inetSocketAddress, f14430a, list);
    }

    /* renamed from: e */
    private Socket m11284e(InterfaceC7851aj interfaceC7851aj) {
        return ((SocketChannel) ((C7854am) interfaceC7851aj).f14353f.channel()).socket();
    }

    /* renamed from: a */
    public void m11294a(InterfaceC7851aj interfaceC7851aj, ByteBuffer byteBuffer) {
    }

    public AbstractRunnableC7889bu(InetSocketAddress inetSocketAddress, int i10, List<AbstractC7860as> list) {
        this(inetSocketAddress, i10, list, new HashSet());
    }

    /* renamed from: a */
    public boolean m11295a(SelectionKey selectionKey) {
        return true;
    }

    public AbstractRunnableC7889bu(InetSocketAddress inetSocketAddress, int i10, List<AbstractC7860as> list, Collection<InterfaceC7851aj> collection) {
        this.f14438i = new AtomicBoolean(false);
        this.f14442m = 0;
        this.f14443n = new AtomicInteger(0);
        this.f14444o = new C7888bt();
        if (inetSocketAddress != null && i10 >= 1 && collection != null) {
            if (list == null) {
                this.f14436g = Collections.EMPTY_LIST;
            } else {
                this.f14436g = list;
            }
            this.f14433d = inetSocketAddress;
            this.f14432c = collection;
            this.f14440k = new LinkedList();
            this.f14439j = new ArrayList(i10);
            this.f14441l = new LinkedBlockingQueue();
            for (int i11 = 0; i11 < i10; i11++) {
                b bVar = new b();
                this.f14439j.add(bVar);
                bVar.start();
            }
            return;
        }
        throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
    }

    /* renamed from: a */
    public void m11286a() {
        if (this.f14437h == null) {
            new Thread(this).start();
            return;
        }
        throw new IllegalStateException(getClass().getName() + " can only be started once.");
    }

    /* renamed from: a */
    public void m11287a(InterfaceC7851aj interfaceC7851aj) throws InterruptedException {
        if (this.f14443n.get() >= (this.f14439j.size() * 2) + 1) {
            return;
        }
        this.f14443n.incrementAndGet();
        this.f14441l.put(m11305g());
    }

    /* renamed from: a */
    private void m11278a(C7854am c7854am) throws InterruptedException {
        if (c7854am.f14357j == null) {
            List<b> list = this.f14439j;
            c7854am.f14357j = list.get(this.f14442m % list.size());
            this.f14442m++;
        }
        c7854am.f14357j.put(c7854am);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m11281a(ByteBuffer byteBuffer) throws InterruptedException {
        if (this.f14441l.size() > this.f14443n.intValue()) {
            return;
        }
        this.f14441l.put(byteBuffer);
    }

    /* renamed from: a */
    private void m11282a(SelectionKey selectionKey, InterfaceC7851aj interfaceC7851aj, IOException iOException) throws IOException {
        SelectableChannel selectableChannelChannel;
        if (interfaceC7851aj != null) {
            interfaceC7851aj.closeConnection(1006, iOException.getMessage());
            return;
        }
        if (selectionKey == null || (selectableChannelChannel = selectionKey.channel()) == null || !selectableChannelChannel.isOpen()) {
            return;
        }
        try {
            selectableChannelChannel.close();
        } catch (IOException unused) {
        }
        if (C7854am.f14350d) {
            System.out.println("Connection closed because of" + iOException);
        }
    }
}
