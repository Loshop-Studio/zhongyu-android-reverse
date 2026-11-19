package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.AbstractC5810y;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.C6289c0;
import okhttp3.C6301i0;
import okhttp3.C6338z;
import okhttp3.InterfaceC6292e;
import okhttp3.InterfaceC6294f;
import p024c0.C3210g;
import p115m4.C6104b;
import p139p7.AbstractC6396c;
import p146q7.C6442b;
import p153r7.C6480b;
import p161s7.C6566a;
import p161s7.C6570e;
import p185v7.C6685n;

/* renamed from: okhttp3.internal.connection.i */
/* loaded from: classes4.dex */
public final class C6310i implements InterfaceC6292e {

    /* renamed from: a */
    public final C6338z f10149a;

    /* renamed from: b */
    public final C6289c0 f10150b;

    /* renamed from: c */
    public final C6314m f10151c;

    /* renamed from: d */
    public final C6309h f10152d;

    /* renamed from: e */
    public final AtomicBoolean f10153e;

    /* renamed from: f */
    public Object f10154f;

    /* renamed from: g */
    public C6306e f10155g;

    /* renamed from: h */
    public C6312k f10156h;

    /* renamed from: i */
    public boolean f10157i;

    /* renamed from: j */
    public C6305d f10158j;

    /* renamed from: k */
    public boolean f10159k;

    /* renamed from: l */
    public boolean f10160l;

    /* renamed from: m */
    public boolean f10161m;

    /* renamed from: n */
    public volatile boolean f10162n;

    /* renamed from: o */
    public volatile C6305d f10163o;

    /* renamed from: p */
    public volatile C6312k f10164p;

    public C6310i(C6338z c6338z, C6289c0 originalRequest) {
        AbstractC5830k.m5330g(originalRequest, "originalRequest");
        this.f10149a = c6338z;
        this.f10150b = originalRequest;
        this.f10151c = (C6314m) c6338z.f10325b.f10022b;
        c6338z.f10328e.getClass();
        C6309h c6309h = new C6309h(this);
        c6309h.timeout(0, TimeUnit.MILLISECONDS);
        this.f10152d = c6309h;
        this.f10153e = new AtomicBoolean();
        this.f10161m = true;
    }

    /* renamed from: c */
    public static final String m5910c(C6310i c6310i) {
        StringBuilder sb = new StringBuilder();
        sb.append(c6310i.f10162n ? "canceled " : "");
        sb.append(NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(c6310i.f10150b.f10075a.m5973g());
        return sb.toString();
    }

    public final void cancel() {
        Socket socket;
        if (this.f10162n) {
            return;
        }
        this.f10162n = true;
        C6305d c6305d = this.f10163o;
        if (c6305d != null) {
            c6305d.f10131c.cancel();
        }
        C6312k c6312k = this.f10164p;
        if (c6312k == null || (socket = c6312k.f10167c) == null) {
            return;
        }
        AbstractC6396c.m6044d(socket);
    }

    public final Object clone() {
        return new C6310i(this.f10149a, this.f10150b);
    }

    /* renamed from: e */
    public final void m5911e(C6312k c6312k) {
        byte[] bArr = AbstractC6396c.f10486a;
        if (this.f10156h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f10156h = c6312k;
        c6312k.f10180p.add(new C6308g(this, this.f10154f));
    }

    /* renamed from: f */
    public final IOException m5912f(IOException iOException) throws IOException {
        IOException interruptedIOException;
        Socket socketM5919m;
        byte[] bArr = AbstractC6396c.f10486a;
        C6312k c6312k = this.f10156h;
        if (c6312k != null) {
            synchronized (c6312k) {
                socketM5919m = m5919m();
            }
            if (this.f10156h == null) {
                if (socketM5919m != null) {
                    AbstractC6396c.m6044d(socketM5919m);
                }
            } else if (socketM5919m != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f10157i && this.f10152d.exit()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            AbstractC5830k.m5327d(interruptedIOException);
        }
        return interruptedIOException;
    }

    /* renamed from: g */
    public final void m5913g(InterfaceC6294f interfaceC6294f) {
        RunnableC6307f runnableC6307f;
        if (!this.f10153e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        C6685n c6685n = C6685n.f11276a;
        this.f10154f = C6685n.f11276a.mo6337g();
        C3210g c3210g = this.f10149a.f10324a;
        RunnableC6307f runnableC6307f2 = new RunnableC6307f(this, interfaceC6294f);
        c3210g.getClass();
        synchronized (c3210g) {
            ((ArrayDeque) c3210g.f1753d).add(runnableC6307f2);
            String str = this.f10150b.f10075a.f10268d;
            Iterator it = ((ArrayDeque) c3210g.f1754e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) c3210g.f1753d).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            runnableC6307f = null;
                            break;
                        } else {
                            runnableC6307f = (RunnableC6307f) it2.next();
                            if (AbstractC5830k.m5325b(runnableC6307f.f10146c.f10150b.f10075a.f10268d, str)) {
                                break;
                            }
                        }
                    }
                } else {
                    runnableC6307f = (RunnableC6307f) it.next();
                    if (AbstractC5830k.m5325b(runnableC6307f.f10146c.f10150b.f10075a.f10268d, str)) {
                        break;
                    }
                }
            }
            if (runnableC6307f != null) {
                runnableC6307f2.f10145b = runnableC6307f.f10145b;
            }
        }
        c3210g.m2159i();
    }

    /* renamed from: h */
    public final C6301i0 m5914h() {
        if (!this.f10153e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f10152d.enter();
        C6685n c6685n = C6685n.f11276a;
        this.f10154f = C6685n.f11276a.mo6337g();
        try {
            C3210g c3210g = this.f10149a.f10324a;
            synchronized (c3210g) {
                ((ArrayDeque) c3210g.f1755f).add(this);
            }
            return m5916j();
        } finally {
            C3210g c3210g2 = this.f10149a.f10324a;
            c3210g2.m2153c((ArrayDeque) c3210g2.f1755f, this);
        }
    }

    /* renamed from: i */
    public final void m5915i(boolean z8) {
        C6305d c6305d;
        synchronized (this) {
            if (!this.f10161m) {
                throw new IllegalStateException("released");
            }
        }
        if (z8 && (c6305d = this.f10163o) != null) {
            c6305d.f10131c.cancel();
            c6305d.f10129a.m5917k(c6305d, true, true, null);
        }
        this.f10158j = null;
    }

    /* renamed from: j */
    public final C6301i0 m5916j() {
        ArrayList arrayList = new ArrayList();
        AbstractC5810y.m5291S(this.f10149a.f10326c, arrayList);
        arrayList.add(new C6104b(this.f10149a, 2));
        arrayList.add(new C6104b(this.f10149a.f10333j));
        arrayList.add(new C6442b());
        arrayList.add(C6302a.f10117a);
        AbstractC5810y.m5291S(this.f10149a.f10327d, arrayList);
        arrayList.add(new C6566a(0));
        C6289c0 c6289c0 = this.f10150b;
        C6338z c6338z = this.f10149a;
        boolean z8 = false;
        try {
            try {
                C6301i0 c6301i0M6214b = new C6570e(this, arrayList, 0, null, c6289c0, c6338z.f10346w, c6338z.f10347x, c6338z.f10348y).m6214b(this.f10150b);
                if (this.f10162n) {
                    AbstractC6396c.m6043c(c6301i0M6214b);
                    throw new IOException("Canceled");
                }
                m5918l(null);
                return c6301i0M6214b;
            } catch (IOException e) {
                z8 = true;
                IOException iOExceptionM5918l = m5918l(e);
                AbstractC5830k.m5328e(iOExceptionM5918l, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionM5918l;
            }
        } catch (Throwable th) {
            if (!z8) {
                m5918l(null);
            }
            throw th;
        }
    }

    /* renamed from: k */
    public final IOException m5917k(C6305d exchange, boolean z8, boolean z9, IOException iOException) {
        boolean z10;
        boolean z11;
        AbstractC5830k.m5330g(exchange, "exchange");
        if (exchange.equals(this.f10163o)) {
            synchronized (this) {
                z10 = false;
                if (z8) {
                    try {
                        if (!this.f10159k) {
                            if (z9 || !this.f10160l) {
                                z11 = false;
                            }
                        }
                        if (z8) {
                            this.f10159k = false;
                        }
                        if (z9) {
                            this.f10160l = false;
                        }
                        boolean z12 = this.f10159k;
                        boolean z13 = (z12 || this.f10160l) ? false : true;
                        if (!z12 && !this.f10160l) {
                            if (!this.f10161m) {
                                z10 = true;
                            }
                        }
                        z11 = z10;
                        z10 = z13;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z9) {
                    }
                    z11 = false;
                }
            }
            if (z10) {
                this.f10163o = null;
                C6312k c6312k = this.f10156h;
                if (c6312k != null) {
                    synchronized (c6312k) {
                        c6312k.f10177m++;
                    }
                }
            }
            if (z11) {
                return m5912f(iOException);
            }
        }
        return iOException;
    }

    /* renamed from: l */
    public final IOException m5918l(IOException iOException) {
        boolean z8;
        synchronized (this) {
            z8 = false;
            if (this.f10161m) {
                this.f10161m = false;
                if (!this.f10159k) {
                    if (!this.f10160l) {
                        z8 = true;
                    }
                }
            }
        }
        return z8 ? m5912f(iOException) : iOException;
    }

    /* renamed from: m */
    public final Socket m5919m() {
        C6312k c6312k = this.f10156h;
        AbstractC5830k.m5327d(c6312k);
        byte[] bArr = AbstractC6396c.f10486a;
        ArrayList arrayList = c6312k.f10180p;
        int size = arrayList.size();
        int i = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i8);
            i8++;
            if (AbstractC5830k.m5325b(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.f10156h = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        c6312k.f10181q = System.nanoTime();
        C6314m c6314m = this.f10151c;
        ConcurrentLinkedQueue concurrentLinkedQueue = c6314m.f10187d;
        byte[] bArr2 = AbstractC6396c.f10486a;
        if (!c6312k.f10174j) {
            c6314m.f10185b.m6129b(c6314m.f10186c, 0L);
            return null;
        }
        c6312k.f10174j = true;
        concurrentLinkedQueue.remove(c6312k);
        if (concurrentLinkedQueue.isEmpty()) {
            C6480b c6480b = c6314m.f10185b;
            c6480b.getClass();
            synchronized (c6480b.f10650a) {
                if (c6480b.m6128a()) {
                    c6480b.f10650a.m6135d(c6480b);
                }
            }
        }
        Socket socket = c6312k.f10168d;
        AbstractC5830k.m5327d(socket);
        return socket;
    }
}
