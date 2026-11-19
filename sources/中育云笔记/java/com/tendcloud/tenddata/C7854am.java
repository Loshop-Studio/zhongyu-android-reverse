package com.tendcloud.tenddata;

import android.annotation.SuppressLint;
import com.tendcloud.tenddata.AbstractC7860as;
import com.tendcloud.tenddata.AbstractRunnableC7889bu;
import com.tendcloud.tenddata.InterfaceC7851aj;
import com.tendcloud.tenddata.InterfaceC7876bh;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@SuppressLint({"Assert"})
/* renamed from: com.tendcloud.tenddata.am */
/* loaded from: classes5.dex */
public class C7854am implements InterfaceC7851aj {

    /* renamed from: c */
    public static int f14349c = 16384;

    /* renamed from: d */
    public static boolean f14350d = false;

    /* renamed from: e */
    public static final List<AbstractC7860as> f14351e;

    /* renamed from: k */
    static final /* synthetic */ boolean f14352k = true;

    /* renamed from: f */
    public SelectionKey f14353f;

    /* renamed from: g */
    public ByteChannel f14354g;

    /* renamed from: h */
    public final BlockingQueue<ByteBuffer> f14355h;

    /* renamed from: i */
    public final BlockingQueue<ByteBuffer> f14356i;

    /* renamed from: j */
    public volatile AbstractRunnableC7889bu.b f14357j;

    /* renamed from: l */
    private volatile boolean f14358l;

    /* renamed from: m */
    private InterfaceC7851aj.a f14359m;

    /* renamed from: n */
    private final InterfaceC7855an f14360n;

    /* renamed from: o */
    private List<AbstractC7860as> f14361o;

    /* renamed from: p */
    private AbstractC7860as f14362p;

    /* renamed from: q */
    private InterfaceC7851aj.b f14363q;

    /* renamed from: r */
    private InterfaceC7876bh.a f14364r;

    /* renamed from: s */
    private ByteBuffer f14365s;

    /* renamed from: t */
    private InterfaceC7878bj f14366t;

    /* renamed from: u */
    private String f14367u;

    /* renamed from: v */
    private Integer f14368v;

    /* renamed from: w */
    private Boolean f14369w;

    /* renamed from: x */
    private String f14370x;

    static {
        ArrayList arrayList = new ArrayList(4);
        f14351e = arrayList;
        arrayList.add(new C7862au());
        arrayList.add(new C7861at());
        arrayList.add(new C7864aw());
        arrayList.add(new C7863av());
    }

    public C7854am(InterfaceC7855an interfaceC7855an, List<AbstractC7860as> list) {
        this(interfaceC7855an, (AbstractC7860as) null);
        this.f14363q = InterfaceC7851aj.b.SERVER;
        if (list == null || list.isEmpty()) {
            this.f14361o = f14351e;
        } else {
            this.f14361o = list;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c3  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m11146a(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C7854am.m11146a(java.nio.ByteBuffer):boolean");
    }

    /* renamed from: b */
    private void m11147b(ByteBuffer byteBuffer) throws C7866ay {
        int iMo11260a;
        String strMo11261b;
        try {
            for (InterfaceC7876bh interfaceC7876bh : this.f14362p.mo11243c(byteBuffer)) {
                if (f14350d) {
                    System.out.println("matched frame: " + interfaceC7876bh);
                }
                InterfaceC7876bh.a aVarMo11268f = interfaceC7876bh.mo11268f();
                boolean zMo11266d = interfaceC7876bh.mo11266d();
                if (aVarMo11268f == InterfaceC7876bh.a.CLOSING) {
                    if (interfaceC7876bh instanceof InterfaceC7873be) {
                        InterfaceC7873be interfaceC7873be = (InterfaceC7873be) interfaceC7876bh;
                        iMo11260a = interfaceC7873be.mo11260a();
                        strMo11261b = interfaceC7873be.mo11261b();
                    } else {
                        iMo11260a = 1005;
                        strMo11261b = "";
                    }
                    if (this.f14359m == InterfaceC7851aj.a.CLOSING) {
                        m11152a(iMo11260a, strMo11261b, true);
                    } else if (this.f14362p.mo11241b() == AbstractC7860as.a.TWOWAY) {
                        m11149c(iMo11260a, strMo11261b, true);
                    } else {
                        m11155b(iMo11260a, strMo11261b, false);
                    }
                } else if (aVarMo11268f == InterfaceC7876bh.a.PING) {
                    this.f14360n.onWebsocketPing(this, interfaceC7876bh);
                } else if (aVarMo11268f == InterfaceC7876bh.a.PONG) {
                    this.f14360n.onWebsocketPong(this, interfaceC7876bh);
                } else if (!zMo11266d || aVarMo11268f == InterfaceC7876bh.a.CONTINUOUS) {
                    if (aVarMo11268f != InterfaceC7876bh.a.CONTINUOUS) {
                        if (this.f14364r != null) {
                            throw new C7866ay(1002, "Previous continuous frame sequence not completed.");
                        }
                        this.f14364r = aVarMo11268f;
                    } else if (zMo11266d) {
                        if (this.f14364r == null) {
                            throw new C7866ay(1002, "Continuous frame sequence was not started.");
                        }
                        this.f14364r = null;
                    } else if (this.f14364r == null) {
                        throw new C7866ay(1002, "Continuous frame sequence was not started.");
                    }
                    try {
                        this.f14360n.onWebsocketMessageFragment(this, interfaceC7876bh);
                    } catch (RuntimeException e10) {
                        this.f14360n.onWebsocketError(this, e10);
                    }
                } else {
                    if (this.f14364r != null) {
                        throw new C7866ay(1002, "Continuous frame sequence not completed.");
                    }
                    if (aVarMo11268f == InterfaceC7876bh.a.TEXT) {
                        try {
                            this.f14360n.onWebsocketMessage(this, C7891bw.m11339a(interfaceC7876bh.mo11265c()));
                        } catch (RuntimeException e11) {
                            this.f14360n.onWebsocketError(this, e11);
                        }
                    } else {
                        if (aVarMo11268f != InterfaceC7876bh.a.BINARY) {
                            throw new C7866ay(1002, "non control or continious frame expected");
                        }
                        try {
                            this.f14360n.onWebsocketMessage(this, interfaceC7876bh.mo11265c());
                        } catch (RuntimeException e12) {
                            this.f14360n.onWebsocketError(this, e12);
                        }
                    }
                }
            }
        } catch (C7866ay e13) {
            this.f14360n.onWebsocketError(this, e13);
            close(e13);
        }
    }

    /* renamed from: c */
    private void m11149c(int i10, String str, boolean z10) {
        InterfaceC7851aj.a aVar = this.f14359m;
        InterfaceC7851aj.a aVar2 = InterfaceC7851aj.a.CLOSING;
        if (aVar == aVar2 || aVar == InterfaceC7851aj.a.CLOSED) {
            return;
        }
        if (aVar == InterfaceC7851aj.a.OPEN) {
            if (i10 == 1006) {
                if (!f14352k && z10) {
                    throw new AssertionError();
                }
                this.f14359m = aVar2;
                m11155b(i10, str, false);
                return;
            }
            if (this.f14362p.mo11241b() != AbstractC7860as.a.NONE) {
                try {
                    if (!z10) {
                        try {
                            this.f14360n.onWebsocketCloseInitiated(this, i10, str);
                        } catch (RuntimeException e10) {
                            this.f14360n.onWebsocketError(this, e10);
                        }
                    }
                    sendFrame(new C7874bf(i10, str));
                } catch (C7866ay e11) {
                    this.f14360n.onWebsocketError(this, e11);
                    m11155b(1006, "generated frame is invalid", false);
                }
            }
            m11155b(i10, str, z10);
        } else if (i10 != -3) {
            m11155b(-1, str, false);
        } else {
            if (!f14352k && !z10) {
                throw new AssertionError();
            }
            m11155b(-3, str, true);
        }
        if (i10 == 1002) {
            m11155b(i10, str, z10);
        }
        this.f14359m = InterfaceC7851aj.a.CLOSING;
        this.f14365s = null;
    }

    /* renamed from: d */
    private void m11150d(ByteBuffer byteBuffer) {
        if (f14350d) {
            PrintStream printStream = System.out;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("write(");
            sb2.append(byteBuffer.remaining());
            sb2.append("): {");
            sb2.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
            sb2.append("}");
            printStream.println(sb2.toString());
        }
        this.f14355h.add(byteBuffer);
        this.f14360n.onWriteDemand(this);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void close(int i10, String str) {
        m11149c(i10, str, false);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void closeConnection(int i10, String str) {
        m11152a(i10, str, false);
    }

    public void decode(ByteBuffer byteBuffer) {
        try {
            boolean z10 = f14352k;
            if (!z10 && !byteBuffer.hasRemaining()) {
                throw new AssertionError();
            }
            if (f14350d) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("process(");
                sb2.append(byteBuffer.remaining());
                sb2.append("): {");
                sb2.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
                sb2.append("}");
                printStream.println(sb2.toString());
            }
            if (this.f14359m != InterfaceC7851aj.a.NOT_YET_CONNECTED) {
                m11147b(byteBuffer);
            } else if (m11146a(byteBuffer)) {
                if (!z10 && this.f14365s.hasRemaining() == byteBuffer.hasRemaining() && byteBuffer.hasRemaining()) {
                    throw new AssertionError();
                }
                if (byteBuffer.hasRemaining()) {
                    m11147b(byteBuffer);
                } else if (this.f14365s.hasRemaining()) {
                    m11147b(this.f14365s);
                }
            }
            if (!z10 && !isClosing() && !isFlushAndClose() && byteBuffer.hasRemaining()) {
                throw new AssertionError();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public AbstractC7860as getDraft() {
        return this.f14362p;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public InetSocketAddress getLocalSocketAddress() {
        return this.f14360n.getLocalSocketAddress(this);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public InterfaceC7851aj.a getReadyState() {
        return this.f14359m;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public InetSocketAddress getRemoteSocketAddress() {
        return this.f14360n.getRemoteSocketAddress(this);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public String getResourceDescriptor() {
        return this.f14370x;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public boolean hasBufferedData() {
        return !this.f14355h.isEmpty();
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public boolean isClosed() {
        return this.f14359m == InterfaceC7851aj.a.CLOSED;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public boolean isClosing() {
        return this.f14359m == InterfaceC7851aj.a.CLOSING;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public boolean isConnecting() {
        if (f14352k || !this.f14358l || this.f14359m == InterfaceC7851aj.a.CONNECTING) {
            return this.f14359m == InterfaceC7851aj.a.CONNECTING;
        }
        throw new AssertionError();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public boolean isFlushAndClose() {
        return this.f14358l;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public boolean isOpen() {
        if (!f14352k && this.f14359m == InterfaceC7851aj.a.OPEN && this.f14358l) {
            throw new AssertionError();
        }
        return this.f14359m == InterfaceC7851aj.a.OPEN;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void send(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        m11144a(this.f14362p.mo11237a(str, this.f14363q == InterfaceC7851aj.b.CLIENT));
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void sendFragmentedFrame(InterfaceC7876bh.a aVar, ByteBuffer byteBuffer, boolean z10) {
        m11144a(this.f14362p.m11234a(aVar, byteBuffer, z10));
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void sendFrame(InterfaceC7876bh interfaceC7876bh) {
        if (f14350d) {
            System.out.println("send frame: " + interfaceC7876bh);
        }
        m11150d(this.f14362p.mo11233a(interfaceC7876bh));
    }

    public void startHandshake(InterfaceC7879bk interfaceC7879bk) throws C7869ba {
        boolean z10 = f14352k;
        if (!z10 && this.f14359m == InterfaceC7851aj.a.CONNECTING) {
            throw new AssertionError("shall only be called once");
        }
        this.f14366t = this.f14362p.mo11231a(interfaceC7879bk);
        String strMo11269a = interfaceC7879bk.mo11269a();
        this.f14370x = strMo11269a;
        if (!z10 && strMo11269a == null) {
            throw new AssertionError();
        }
        try {
            this.f14360n.onWebsocketHandshakeSentAsClient(this, this.f14366t);
            m11145a(this.f14362p.m11235a(this.f14366t, this.f14363q));
        } catch (C7866ay unused) {
            throw new C7869ba("Handshake data rejected by client.");
        } catch (RuntimeException e10) {
            this.f14360n.onWebsocketError(this, e10);
            throw new C7869ba("rejected because of" + e10);
        }
    }

    public String toString() {
        return super.toString();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void close(int i10) {
        m11149c(i10, "", false);
    }

    public void close(C7866ay c7866ay) {
        m11149c(c7866ay.m11259a(), c7866ay.getMessage(), false);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void send(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        m11144a(this.f14362p.mo11238a(byteBuffer, this.f14363q == InterfaceC7851aj.b.CLIENT));
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void close() {
        close(1000);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7851aj
    public void send(byte[] bArr) {
        send(ByteBuffer.wrap(bArr));
    }

    public C7854am(InterfaceC7855an interfaceC7855an, AbstractC7860as abstractC7860as) {
        this.f14358l = false;
        this.f14359m = InterfaceC7851aj.a.NOT_YET_CONNECTED;
        this.f14362p = null;
        this.f14364r = null;
        this.f14365s = ByteBuffer.allocate(0);
        this.f14366t = null;
        this.f14367u = null;
        this.f14368v = null;
        this.f14369w = null;
        this.f14370x = null;
        if (interfaceC7855an != null && (abstractC7860as != null || this.f14363q != InterfaceC7851aj.b.SERVER)) {
            this.f14355h = new LinkedBlockingQueue();
            this.f14356i = new LinkedBlockingQueue();
            this.f14360n = interfaceC7855an;
            this.f14363q = InterfaceC7851aj.b.CLIENT;
            if (abstractC7860as != null) {
                this.f14362p = abstractC7860as.mo11242c();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("parameters must not be null");
    }

    /* renamed from: c */
    private AbstractC7860as.b m11148c(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        int iLimit = byteBuffer.limit();
        byte[] bArr = AbstractC7860as.f14374c;
        if (iLimit > bArr.length) {
            return AbstractC7860as.b.NOT_MATCHED;
        }
        if (byteBuffer.limit() >= bArr.length) {
            int i10 = 0;
            while (byteBuffer.hasRemaining()) {
                if (AbstractC7860as.f14374c[i10] != byteBuffer.get()) {
                    byteBuffer.reset();
                    return AbstractC7860as.b.NOT_MATCHED;
                }
                i10++;
            }
            return AbstractC7860as.b.MATCHED;
        }
        throw new C7865ax(bArr.length);
    }

    @Deprecated
    public C7854am(InterfaceC7855an interfaceC7855an, AbstractC7860as abstractC7860as, Socket socket) {
        this(interfaceC7855an, abstractC7860as);
    }

    @Deprecated
    public C7854am(InterfaceC7855an interfaceC7855an, List<AbstractC7860as> list, Socket socket) {
        this(interfaceC7855an, list);
    }

    /* renamed from: b */
    public synchronized void m11155b(int i10, String str, boolean z10) {
        if (this.f14358l) {
            return;
        }
        this.f14368v = Integer.valueOf(i10);
        this.f14367u = str;
        this.f14369w = Boolean.valueOf(z10);
        this.f14358l = true;
        this.f14360n.onWriteDemand(this);
        try {
            this.f14360n.onWebsocketClosing(this, i10, str, z10);
        } catch (RuntimeException e10) {
            this.f14360n.onWebsocketError(this, e10);
        }
        AbstractC7860as abstractC7860as = this.f14362p;
        if (abstractC7860as != null) {
            abstractC7860as.mo11239a();
        }
        this.f14366t = null;
    }

    /* renamed from: b */
    public void m11154b() {
        try {
            if (getReadyState() == InterfaceC7851aj.a.NOT_YET_CONNECTED) {
                m11153a(-1, true);
                return;
            }
            if (this.f14358l) {
                m11152a(this.f14368v.intValue(), this.f14367u, this.f14369w.booleanValue());
                return;
            }
            if (this.f14362p.mo11241b() == AbstractC7860as.a.NONE) {
                m11153a(1000, true);
                return;
            }
            if (this.f14362p.mo11241b() == AbstractC7860as.a.ONEWAY) {
                if (this.f14363q == InterfaceC7851aj.b.SERVER) {
                    m11153a(1006, true);
                    return;
                } else {
                    m11153a(1000, true);
                    return;
                }
            }
            m11153a(1006, true);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public synchronized void m11152a(int i10, String str, boolean z10) {
        try {
            if (this.f14359m == InterfaceC7851aj.a.CLOSED) {
                return;
            }
            SelectionKey selectionKey = this.f14353f;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            ByteChannel byteChannel = this.f14354g;
            if (byteChannel != null) {
                try {
                    byteChannel.close();
                } catch (IOException e10) {
                    this.f14360n.onWebsocketError(this, e10);
                }
            }
            try {
                this.f14360n.onWebsocketClose(this, i10, str, z10);
            } catch (RuntimeException e11) {
                this.f14360n.onWebsocketError(this, e11);
            }
            AbstractC7860as abstractC7860as = this.f14362p;
            if (abstractC7860as != null) {
                abstractC7860as.mo11239a();
            }
            this.f14366t = null;
            this.f14359m = InterfaceC7851aj.a.CLOSED;
            this.f14355h.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public void m11153a(int i10, boolean z10) {
        m11152a(i10, "", z10);
    }

    /* renamed from: a */
    public void m11151a() {
        if (this.f14369w != null) {
            m11152a(this.f14368v.intValue(), this.f14367u, this.f14369w.booleanValue());
            return;
        }
        throw new IllegalStateException("this method must be used in conjuction with flushAndClose");
    }

    /* renamed from: a */
    private void m11144a(Collection<InterfaceC7876bh> collection) {
        if (isOpen()) {
            Iterator<InterfaceC7876bh> it = collection.iterator();
            while (it.hasNext()) {
                sendFrame(it.next());
            }
            return;
        }
        throw new C7872bd();
    }

    /* renamed from: a */
    private void m11145a(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        while (it.hasNext()) {
            m11150d(it.next());
        }
    }

    /* renamed from: a */
    private void m11143a(InterfaceC7883bo interfaceC7883bo) {
        if (f14350d) {
            System.out.println("open using draft: " + this.f14362p.getClass().getSimpleName());
        }
        this.f14359m = InterfaceC7851aj.a.OPEN;
        try {
            this.f14360n.onWebsocketOpen(this, interfaceC7883bo);
        } catch (RuntimeException e10) {
            this.f14360n.onWebsocketError(this, e10);
        }
    }
}
