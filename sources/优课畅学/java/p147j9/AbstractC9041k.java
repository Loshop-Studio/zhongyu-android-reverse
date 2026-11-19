package p147j9;

import androidx.collection.SieveCacheKt;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9114c0;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import p077d8.AbstractC8323h;
import p077d8.C8321f;
import p113g8.AbstractC8661c0;
import p113g8.C8660c;
import p134i7.AbstractC8792m0;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p136i9.AbstractC8920r;
import p136i9.C8897a0;
import p136i9.C8903d0;
import p136i9.C8918p;
import p136i9.C8924v;
import p136i9.C8925w;
import p136i9.InterfaceC8904e;
import p225q9.C9856a;

/* renamed from: j9.k */
/* loaded from: classes5.dex */
public abstract class AbstractC9041k {

    /* renamed from: a */
    public static final TimeZone f17264a;

    /* renamed from: b */
    public static final boolean f17265b;

    /* renamed from: c */
    public static final String f17266c;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        AbstractC9133u.m16130d(timeZone);
        f17264a = timeZone;
        f17265b = false;
        String name = C8897a0.class.getName();
        AbstractC9133u.m16132f(name, "getName(...)");
        f17266c = AbstractC8661c0.m14011z0(AbstractC8661c0.m14010y0(name, "okhttp3."), "Client");
    }

    /* renamed from: c */
    public static final AbstractC8920r.c m15773c(final AbstractC8920r abstractC8920r) {
        AbstractC9133u.m16133g(abstractC8920r, "<this>");
        return new AbstractC8920r.c() { // from class: j9.i
            @Override // p136i9.AbstractC8920r.c
            /* renamed from: a */
            public final AbstractC8920r mo15254a(InterfaceC8904e interfaceC8904e) {
                return AbstractC9041k.m15774d(abstractC8920r, interfaceC8904e);
            }
        };
    }

    /* renamed from: d */
    public static final AbstractC8920r m15774d(AbstractC8920r abstractC8920r, InterfaceC8904e it) {
        AbstractC9133u.m16133g(it, "it");
        return abstractC8920r;
    }

    /* renamed from: e */
    public static final void m15775e(C8918p c8918p) {
        AbstractC9133u.m16133g(c8918p, "<this>");
        if (f17265b && Thread.holdsLock(c8918p)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c8918p);
        }
    }

    /* renamed from: f */
    public static final boolean m15776f(C8925w c8925w, C8925w other) {
        AbstractC9133u.m16133g(c8925w, "<this>");
        AbstractC9133u.m16133g(other, "other");
        return AbstractC9133u.m16128b(c8925w.m15284h(), other.m15284h()) && c8925w.m15289m() == other.m15289m() && AbstractC9133u.m16128b(c8925w.m15293q(), other.m15293q());
    }

    /* renamed from: g */
    public static final int m15777g(String name, long j10, TimeUnit unit) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(unit, "unit");
        if (j10 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        long millis = unit.toMillis(j10);
        if (millis > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException((name + " too large").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small").toString());
    }

    /* renamed from: h */
    public static final void m15778h(Socket socket) throws IOException {
        AbstractC9133u.m16133g(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!AbstractC9133u.m16128b(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public static final boolean m15779i(Source source, int i10, TimeUnit timeUnit) {
        AbstractC9133u.m16133g(source, "<this>");
        AbstractC9133u.m16133g(timeUnit, "timeUnit");
        try {
            return m15785o(source, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public static final String m15780j(String format, Object... args) {
        AbstractC9133u.m16133g(format, "format");
        AbstractC9133u.m16133g(args, "args");
        C9114c0 c9114c0 = C9114c0.f17482a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC9133u.m16132f(str, "format(...)");
        return str;
    }

    /* renamed from: k */
    public static final long m15781k(C8903d0 c8903d0) {
        AbstractC9133u.m16133g(c8903d0, "<this>");
        String strM15260a = c8903d0.m15133l().m15260a(HttpHeaders.CONTENT_LENGTH);
        if (strM15260a != null) {
            return AbstractC9038h.m15770z(strM15260a, -1L);
        }
        return -1L;
    }

    /* renamed from: l */
    public static final List m15782l(Object... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return m15793w(elements);
    }

    /* renamed from: m */
    public static final boolean m15783m(Socket socket, BufferedSource source) throws SocketException {
        AbstractC9133u.m16133g(socket, "<this>");
        AbstractC9133u.m16133g(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.exhausted();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: n */
    public static final Charset m15784n(BufferedSource bufferedSource, Charset charset) {
        AbstractC9133u.m16133g(bufferedSource, "<this>");
        AbstractC9133u.m16133g(charset, "default");
        int iSelect = bufferedSource.select(AbstractC9038h.m15755k());
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            return C8660c.f16206b;
        }
        if (iSelect == 1) {
            return C8660c.f16208d;
        }
        if (iSelect == 2) {
            return C8660c.f16205a.m13949b();
        }
        if (iSelect == 3) {
            return C8660c.f16209e;
        }
        if (iSelect == 4) {
            return C8660c.f16205a.m13948a();
        }
        throw new AssertionError();
    }

    /* renamed from: o */
    public static final boolean m15785o(Source source, int i10, TimeUnit timeUnit) {
        AbstractC9133u.m16133g(source, "<this>");
        AbstractC9133u.m16133g(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = source.timeout().hasDeadline() ? source.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        source.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, 8192L) != -1) {
                buffer.clear();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
                return true;
            }
            source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
                return false;
            }
            source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    /* renamed from: p */
    public static final ThreadFactory m15786p(final String name, final boolean z10) {
        AbstractC9133u.m16133g(name, "name");
        return new ThreadFactory() { // from class: j9.j
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC9041k.m15787q(name, z10, runnable);
            }
        };
    }

    /* renamed from: q */
    public static final Thread m15787q(String str, boolean z10, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    /* renamed from: r */
    public static final List m15788r(C8924v c8924v) {
        AbstractC9133u.m16133g(c8924v, "<this>");
        C8321f c8321fM13525t = AbstractC8323h.m13525t(0, c8924v.size());
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(c8321fM13525t, 10));
        Iterator it = c8321fM13525t.iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC8792m0) it).nextInt();
            arrayList.add(new C9856a(c8924v.m15262c(iNextInt), c8924v.m15265g(iNextInt)));
        }
        return arrayList;
    }

    /* renamed from: s */
    public static final C8924v m15789s(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        C8924v.a aVar = new C8924v.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9856a c9856a = (C9856a) it.next();
            aVar.m15270d(c9856a.m18374a().utf8(), c9856a.m18375b().utf8());
        }
        return aVar.m15272f();
    }

    /* renamed from: t */
    public static final String m15790t(C8925w c8925w, boolean z10) {
        String strM15284h;
        AbstractC9133u.m16133g(c8925w, "<this>");
        if (AbstractC8661c0.m13973S(c8925w.m15284h(), ":", false, 2, null)) {
            strM15284h = '[' + c8925w.m15284h() + ']';
        } else {
            strM15284h = c8925w.m15284h();
        }
        if (!z10 && c8925w.m15289m() == C8925w.f16797j.m15328b(c8925w.m15293q())) {
            return strM15284h;
        }
        return strM15284h + ':' + c8925w.m15289m();
    }

    /* renamed from: u */
    public static /* synthetic */ String m15791u(C8925w c8925w, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m15790t(c8925w, z10);
    }

    /* renamed from: v */
    public static final List m15792v(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        if (list.isEmpty()) {
            return AbstractC8809v.m14771n();
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            AbstractC9133u.m16132f(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        AbstractC9133u.m16132f(array, "toArray(...)");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC8797p.m14640g(array));
        AbstractC9133u.m16132f(listUnmodifiableList, "unmodifiableList(...)");
        AbstractC9133u.m16131e(listUnmodifiableList, "null cannot be cast to non-null type kotlin.collections.List<T of okhttp3.internal._UtilJvmKt.toImmutableList>");
        return listUnmodifiableList;
    }

    /* renamed from: w */
    public static final List m15793w(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return AbstractC8809v.m14771n();
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            AbstractC9133u.m16132f(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC8797p.m14640g((Object[]) objArr.clone()));
        AbstractC9133u.m16132f(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
