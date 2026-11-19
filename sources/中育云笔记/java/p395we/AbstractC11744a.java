package p395we;

import com.blankj.utilcode.constant.TimeConstants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.Charset;
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;
import org.apache.commons.net.ProtocolCommandSupport;

/* renamed from: we.a */
/* loaded from: classes6.dex */
public abstract class AbstractC11744a {

    /* renamed from: m */
    public static final SocketFactory f27903m = SocketFactory.getDefault();

    /* renamed from: n */
    public static final ServerSocketFactory f27904n = ServerSocketFactory.getDefault();

    /* renamed from: i */
    public int f27913i = TimeConstants.MIN;

    /* renamed from: j */
    public int f27914j = -1;

    /* renamed from: k */
    public int f27915k = -1;

    /* renamed from: l */
    public Charset f27916l = Charset.defaultCharset();

    /* renamed from: b */
    public Socket f27906b = null;

    /* renamed from: c */
    public String f27907c = null;

    /* renamed from: e */
    public InputStream f27909e = null;

    /* renamed from: f */
    public OutputStream f27910f = null;

    /* renamed from: a */
    public int f27905a = 0;

    /* renamed from: d */
    public int f27908d = 0;

    /* renamed from: g */
    public SocketFactory f27911g = f27903m;

    /* renamed from: h */
    public ServerSocketFactory f27912h = f27904n;

    /* renamed from: a */
    public final void m25972a(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        Socket socketCreateSocket = this.f27911g.createSocket();
        this.f27906b = socketCreateSocket;
        int i12 = this.f27914j;
        if (i12 != -1) {
            socketCreateSocket.setReceiveBufferSize(i12);
        }
        int i13 = this.f27915k;
        if (i13 != -1) {
            this.f27906b.setSendBufferSize(i13);
        }
        if (inetAddress2 != null) {
            this.f27906b.bind(new InetSocketAddress(inetAddress2, i11));
        }
        this.f27906b.connect(new InetSocketAddress(inetAddress, i10), this.f27913i);
        mo25973b();
    }

    /* renamed from: b */
    public void mo25973b() throws SocketException {
        m25974c();
        this.f27909e = this.f27906b.getInputStream();
        this.f27910f = this.f27906b.getOutputStream();
    }

    /* renamed from: c */
    public void m25974c() throws SocketException {
        this.f27906b.setSoTimeout(this.f27905a);
    }

    /* renamed from: d */
    public final void m25975d(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: e */
    public final void m25976e(Socket socket) throws IOException {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: f */
    public void m25977f(String str, int i10) throws IOException {
        this.f27907c = str;
        m25972a(InetAddress.getByName(str), i10, null, -1);
    }

    /* renamed from: g */
    public void mo25978g() throws IOException {
        m25976e(this.f27906b);
        m25975d(this.f27909e);
        m25975d(this.f27910f);
        this.f27906b = null;
        this.f27907c = null;
        this.f27909e = null;
        this.f27910f = null;
    }

    /* renamed from: h */
    public void m25979h(String str, String str2) {
        if (mo25981j().m22265d() > 0) {
            mo25981j().m22263a(str, str2);
        }
    }

    /* renamed from: i */
    public void m25980i(int i10, String str) {
        if (mo25981j().m22265d() > 0) {
            mo25981j().m22264c(i10, str);
        }
    }

    /* renamed from: j */
    public abstract ProtocolCommandSupport mo25981j();

    /* renamed from: k */
    public InetAddress m25982k() {
        return this.f27906b.getLocalAddress();
    }

    /* renamed from: l */
    public InetAddress m25983l() {
        return this.f27906b.getInetAddress();
    }

    /* renamed from: m */
    public int m25984m() {
        return this.f27906b.getSoTimeout();
    }

    /* renamed from: n */
    public boolean m25985n() {
        Socket socket = this.f27906b;
        if (socket == null) {
            return false;
        }
        return socket.isConnected();
    }

    /* renamed from: o */
    public void m25986o(int i10) {
        this.f27913i = i10;
    }

    /* renamed from: p */
    public void m25987p(int i10) {
        this.f27908d = i10;
    }

    /* renamed from: q */
    public void m25988q(int i10) throws SocketException {
        this.f27906b.setSoTimeout(i10);
    }

    /* renamed from: r */
    public boolean m25989r(Socket socket) {
        return socket.getInetAddress().equals(m25983l());
    }
}
