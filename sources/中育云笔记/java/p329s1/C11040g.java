package p329s1;

import android.content.Context;
import android.net.Uri;
import com.danikula.videocache.ProxyCacheException;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import p340t1.C11205f;
import p340t1.C11206g;
import p340t1.C11207h;
import p340t1.InterfaceC11200a;
import p340t1.InterfaceC11202c;
import p354u1.C11321a;
import p354u1.InterfaceC11322b;
import p369v1.AbstractC11413d;
import p369v1.InterfaceC11412c;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: s1.g */
/* loaded from: classes3.dex */
public class C11040g {

    /* renamed from: a */
    public final Object f26624a;

    /* renamed from: b */
    public final ExecutorService f26625b;

    /* renamed from: c */
    public final Map f26626c;

    /* renamed from: d */
    public final ServerSocket f26627d;

    /* renamed from: e */
    public final int f26628e;

    /* renamed from: f */
    public final Thread f26629f;

    /* renamed from: g */
    public final C11036c f26630g;

    /* renamed from: h */
    public final C11044k f26631h;

    /* renamed from: s1.g$b */
    public static final class b {

        /* renamed from: a */
        public File f26632a;

        /* renamed from: d */
        public final InterfaceC11412c f26635d;

        /* renamed from: f */
        public HostnameVerifier f26637f;

        /* renamed from: g */
        public TrustManager[] f26638g;

        /* renamed from: c */
        public InterfaceC11200a f26634c = new C11207h(IjkMediaMeta.AV_CH_STEREO_LEFT);

        /* renamed from: b */
        public InterfaceC11202c f26633b = new C11205f();

        /* renamed from: e */
        public InterfaceC11322b f26636e = new C11321a();

        public b(Context context) {
            this.f26635d = AbstractC11413d.m25371b(context);
            this.f26632a = AbstractC11050q.m24492c(context);
        }

        /* renamed from: a */
        public C11040g m24430a() {
            return new C11040g(m24431b());
        }

        /* renamed from: b */
        public final C11036c m24431b() {
            return new C11036c(this.f26632a, this.f26633b, this.f26634c, this.f26635d, this.f26636e, this.f26637f, this.f26638g);
        }

        /* renamed from: c */
        public b m24432c(File file) {
            this.f26632a = (File) AbstractC11045l.m24467d(file);
            return this;
        }

        /* renamed from: d */
        public b m24433d(InterfaceC11202c interfaceC11202c) {
            this.f26633b = (InterfaceC11202c) AbstractC11045l.m24467d(interfaceC11202c);
            return this;
        }

        /* renamed from: e */
        public b m24434e(InterfaceC11322b interfaceC11322b) {
            this.f26636e = (InterfaceC11322b) AbstractC11045l.m24467d(interfaceC11322b);
            return this;
        }

        /* renamed from: f */
        public b m24435f(HostnameVerifier hostnameVerifier) {
            this.f26637f = hostnameVerifier;
            return this;
        }

        /* renamed from: g */
        public b m24436g(int i10) {
            this.f26634c = new C11206g(i10);
            return this;
        }

        /* renamed from: h */
        public b m24437h(long j10) {
            this.f26634c = new C11207h(j10);
            return this;
        }

        /* renamed from: i */
        public b m24438i(TrustManager[] trustManagerArr) {
            this.f26638g = trustManagerArr;
            return this;
        }
    }

    /* renamed from: s1.g$c */
    public final class c implements Runnable {

        /* renamed from: c */
        public final Socket f26639c;

        public c(Socket socket) {
            this.f26639c = socket;
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            C11040g.this.m24422o(this.f26639c);
        }
    }

    /* renamed from: s1.g$d */
    public final class d implements Runnable {

        /* renamed from: c */
        public final CountDownLatch f26641c;

        public d(CountDownLatch countDownLatch) {
            this.f26641c = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            this.f26641c.countDown();
            C11040g.this.m24429v();
        }
    }

    /* renamed from: c */
    public final String m24410c(String str) {
        return String.format(Locale.US, "http://%s:%d/%s", "127.0.0.1", Integer.valueOf(this.f26628e), AbstractC11047n.m24488f(str));
    }

    /* renamed from: d */
    public final void m24411d(Socket socket) throws IOException {
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: e */
    public final void m24412e(Socket socket) throws IOException {
        try {
            if (socket.isInputShutdown()) {
                return;
            }
            socket.shutdownInput();
        } catch (SocketException | IOException unused) {
        }
    }

    /* renamed from: f */
    public final void m24413f(Socket socket) throws IOException {
        try {
            if (socket.isOutputShutdown()) {
                return;
            }
            socket.shutdownOutput();
        } catch (IOException e10) {
            AbstractC11039f.m24407g("Failed to close socket on proxy side: {}. It seems client have already closed connection.", e10.getMessage());
        }
    }

    /* renamed from: g */
    public final File m24414g(String str) {
        C11036c c11036c = this.f26630g;
        return new File(c11036c.f26608a, c11036c.f26609b.mo24912a(str));
    }

    /* renamed from: h */
    public final C11041h m24415h(String str) {
        C11041h c11041h;
        synchronized (this.f26624a) {
            try {
                c11041h = (C11041h) this.f26626c.get(str);
                if (c11041h == null) {
                    c11041h = new C11041h(str, this.f26630g);
                    this.f26626c.put(str, c11041h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c11041h;
    }

    /* renamed from: i */
    public final int m24416i() {
        int iM24440b;
        synchronized (this.f26624a) {
            try {
                Iterator it = this.f26626c.values().iterator();
                iM24440b = 0;
                while (it.hasNext()) {
                    iM24440b += ((C11041h) it.next()).m24440b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iM24440b;
    }

    /* renamed from: j */
    public String m24417j(String str) {
        return m24418k(str, true);
    }

    /* renamed from: k */
    public String m24418k(String str, boolean z10) {
        if (!z10 || !m24420m(str)) {
            return m24419l() ? m24410c(str) : str;
        }
        File fileM24414g = m24414g(str);
        m24427t(fileM24414g);
        return Uri.fromFile(fileM24414g).toString();
    }

    /* renamed from: l */
    public final boolean m24419l() {
        return this.f26631h.m24460e(3, 70);
    }

    /* renamed from: m */
    public boolean m24420m(String str) {
        AbstractC11045l.m24468e(str, "Url can't be null!");
        return m24414g(str).exists();
    }

    /* renamed from: n */
    public final void m24421n(Throwable th) {
        AbstractC11039f.m24403c("HttpProxyCacheServer error", th.getMessage());
    }

    /* renamed from: o */
    public final void m24422o(Socket socket) throws IOException {
        StringBuilder sb2;
        try {
            try {
                C11037d c11037dM24390c = C11037d.m24390c(socket.getInputStream());
                String strM24487e = AbstractC11047n.m24487e(c11037dM24390c.f26617a);
                if (this.f26631h.m24459d(strM24487e)) {
                    this.f26631h.m24462g(socket);
                } else {
                    m24415h(strM24487e).m24442d(c11037dM24390c, socket);
                }
                m24424q(socket);
                AbstractC11039f.m24404d("Opened connections: " + m24416i());
            } catch (Throwable th) {
                m24424q(socket);
                AbstractC11039f.m24404d("Opened connections: " + m24416i());
                throw th;
            }
        } catch (ProxyCacheException e10) {
            e = e10;
            m24421n(new ProxyCacheException("Error processing request", e));
            m24424q(socket);
            sb2 = new StringBuilder();
            sb2.append("Opened connections: ");
            sb2.append(m24416i());
            AbstractC11039f.m24404d(sb2.toString());
        } catch (SocketException unused) {
            m24424q(socket);
            sb2 = new StringBuilder();
            sb2.append("Opened connections: ");
            sb2.append(m24416i());
            AbstractC11039f.m24404d(sb2.toString());
        } catch (IOException e11) {
            e = e11;
            m24421n(new ProxyCacheException("Error processing request", e));
            m24424q(socket);
            sb2 = new StringBuilder();
            sb2.append("Opened connections: ");
            sb2.append(m24416i());
            AbstractC11039f.m24404d(sb2.toString());
        }
    }

    /* renamed from: p */
    public void m24423p(InterfaceC11035b interfaceC11035b, String str) {
        AbstractC11045l.m24464a(interfaceC11035b, str);
        synchronized (this.f26624a) {
            try {
                m24415h(str).m24443e(interfaceC11035b);
            } catch (ProxyCacheException e10) {
                AbstractC11039f.m24407g("Error registering cache listener", e10.getMessage());
            }
        }
    }

    /* renamed from: q */
    public final void m24424q(Socket socket) throws IOException {
        m24412e(socket);
        m24413f(socket);
        m24411d(socket);
    }

    /* renamed from: r */
    public void m24425r() throws IOException {
        AbstractC11039f.m24404d("Shutdown proxy server");
        m24426s();
        this.f26630g.f26611d.release();
        this.f26629f.interrupt();
        try {
            if (this.f26627d.isClosed()) {
                return;
            }
            this.f26627d.close();
        } catch (IOException e10) {
            m24421n(new ProxyCacheException("Error shutting down proxy server", e10));
        }
    }

    /* renamed from: s */
    public final void m24426s() {
        synchronized (this.f26624a) {
            try {
                Iterator it = this.f26626c.values().iterator();
                while (it.hasNext()) {
                    ((C11041h) it.next()).m24444f();
                }
                this.f26626c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: t */
    public final void m24427t(File file) {
        try {
            this.f26630g.f26610c.mo24910a(file);
        } catch (IOException e10) {
            AbstractC11039f.m24402b("Error touching file " + file, e10);
        }
    }

    /* renamed from: u */
    public void m24428u(InterfaceC11035b interfaceC11035b) {
        AbstractC11045l.m24467d(interfaceC11035b);
        synchronized (this.f26624a) {
            try {
                Iterator it = this.f26626c.values().iterator();
                while (it.hasNext()) {
                    ((C11041h) it.next()).m24446h(interfaceC11035b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: v */
    public final void m24429v() throws IOException {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                this.f26625b.submit(new c(this.f26627d.accept()));
            } catch (IOException e10) {
                m24421n(new ProxyCacheException("Error during waiting connection", e10));
                return;
            }
        }
    }

    public C11040g(C11036c c11036c) throws InterruptedException {
        this.f26624a = new Object();
        this.f26625b = Executors.newFixedThreadPool(8);
        this.f26626c = new ConcurrentHashMap();
        this.f26630g = (C11036c) AbstractC11045l.m24467d(c11036c);
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.f26627d = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.f26628e = localPort;
            C11043j.m24455a("127.0.0.1", localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new d(countDownLatch));
            this.f26629f = thread;
            thread.start();
            countDownLatch.await();
            this.f26631h = new C11044k("127.0.0.1", localPort);
            AbstractC11039f.m24404d("Proxy cache server started. Is it alive? " + m24419l());
        } catch (IOException | InterruptedException e10) {
            this.f26625b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e10);
        }
    }
}
