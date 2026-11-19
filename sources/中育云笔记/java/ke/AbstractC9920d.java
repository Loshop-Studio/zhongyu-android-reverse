package ke;

import androidx.collection.SieveCacheKt;
import anet.channel.util.HttpConstant;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import je.AbstractC9735o;
import je.AbstractC9744x;
import je.AbstractC9746z;
import je.C9737q;
import je.C9738r;
import je.C9742v;
import je.C9745y;
import je.InterfaceC9725e;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9963e;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9960c0;
import kotlin.text.Regex;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Source;
import p265nd.AbstractC10410o;
import p265nd.C10405j;
import p309qc.AbstractC10771b;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import p310qd.C10792c;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10961n0;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import re.C10994a;

/* renamed from: ke.d */
/* loaded from: classes6.dex */
public abstract class AbstractC9920d {

    /* renamed from: a */
    public static final byte[] f23241a;

    /* renamed from: b */
    public static final C9737q f23242b = C9737q.f22746d.m19410g(new String[0]);

    /* renamed from: c */
    public static final AbstractC9746z f23243c;

    /* renamed from: d */
    public static final AbstractC9744x f23244d;

    /* renamed from: e */
    public static final Options f23245e;

    /* renamed from: f */
    public static final TimeZone f23246f;

    /* renamed from: g */
    public static final Regex f23247g;

    /* renamed from: h */
    public static final boolean f23248h;

    /* renamed from: i */
    public static final String f23249i;

    static {
        byte[] bArr = new byte[0];
        f23241a = bArr;
        f23243c = AbstractC9746z.b.m19666i(AbstractC9746z.Companion, bArr, null, 1, null);
        f23244d = AbstractC9744x.a.m19612p(AbstractC9744x.Companion, bArr, null, 0, 0, 7, null);
        Options.Companion companion = Options.Companion;
        ByteString.Companion companion2 = ByteString.Companion;
        f23245e = companion.m22188of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        AbstractC9979u.m20291d(timeZone);
        f23246f = timeZone;
        f23247g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f23248h = false;
        String name = C9742v.class.getName();
        AbstractC9979u.m20293f(name, "OkHttpClient::class.java.name");
        f23249i = AbstractC10793c0.m23150z0(AbstractC10793c0.m23149y0(name, "okhttp3."), "Client");
    }

    /* renamed from: A */
    public static /* synthetic */ int m19993A(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m20044z(str, i10, i11);
    }

    /* renamed from: B */
    public static final int m19994B(String str, int i10, int i11) {
        AbstractC9979u.m20294g(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    /* renamed from: C */
    public static /* synthetic */ int m19995C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m19994B(str, i10, i11);
    }

    /* renamed from: D */
    public static final int m19996D(String str, int i10) {
        AbstractC9979u.m20294g(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    /* renamed from: E */
    public static final String[] m19997E(String[] strArr, String[] other, Comparator comparator) {
        AbstractC9979u.m20294g(strArr, "<this>");
        AbstractC9979u.m20294g(other, "other");
        AbstractC9979u.m20294g(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: F */
    public static final boolean m19998F(Socket socket, BufferedSource source) throws SocketException {
        AbstractC9979u.m20294g(socket, "<this>");
        AbstractC9979u.m20294g(source, "source");
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

    /* renamed from: G */
    public static final boolean m19999G(String name) {
        AbstractC9979u.m20294g(name, "name");
        return AbstractC10819z.m23230C(name, "Authorization", true) || AbstractC10819z.m23230C(name, HttpConstant.COOKIE, true) || AbstractC10819z.m23230C(name, "Proxy-Authorization", true) || AbstractC10819z.m23230C(name, HttpConstant.SET_COOKIE, true);
    }

    /* renamed from: H */
    public static final int m20000H(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    /* renamed from: I */
    public static final Charset m20001I(BufferedSource bufferedSource, Charset charset) {
        AbstractC9979u.m20294g(bufferedSource, "<this>");
        AbstractC9979u.m20294g(charset, "default");
        int iSelect = bufferedSource.select(f23245e);
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC9979u.m20293f(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iSelect == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            AbstractC9979u.m20293f(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iSelect == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            AbstractC9979u.m20293f(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iSelect == 3) {
            return C10792c.f26018a.m23081a();
        }
        if (iSelect == 4) {
            return C10792c.f26018a.m23082b();
        }
        throw new AssertionError();
    }

    /* renamed from: J */
    public static final int m20002J(BufferedSource bufferedSource) {
        AbstractC9979u.m20294g(bufferedSource, "<this>");
        return m20022d(bufferedSource.readByte(), 255) | (m20022d(bufferedSource.readByte(), 255) << 16) | (m20022d(bufferedSource.readByte(), 255) << 8);
    }

    /* renamed from: K */
    public static final int m20003K(Buffer buffer, byte b10) {
        AbstractC9979u.m20294g(buffer, "<this>");
        int i10 = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b10) {
            i10++;
            buffer.readByte();
        }
        return i10;
    }

    /* renamed from: L */
    public static final boolean m20004L(Source source, int i10, TimeUnit timeUnit) {
        AbstractC9979u.m20294g(source, "<this>");
        AbstractC9979u.m20294g(timeUnit, "timeUnit");
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

    /* renamed from: M */
    public static final ThreadFactory m20005M(final String name, final boolean z10) {
        AbstractC9979u.m20294g(name, "name");
        return new ThreadFactory() { // from class: ke.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC9920d.m20006N(name, z10, runnable);
            }
        };
    }

    /* renamed from: N */
    public static final Thread m20006N(String name, boolean z10, Runnable runnable) {
        AbstractC9979u.m20294g(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    /* renamed from: O */
    public static final List m20007O(C9737q c9737q) {
        AbstractC9979u.m20294g(c9737q, "<this>");
        C10405j c10405jM21768u = AbstractC10410o.m21768u(0, c9737q.size());
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(c10405jM21768u, 10));
        Iterator it = c10405jM21768u.iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC10961n0) it).nextInt();
            arrayList.add(new C10994a(c9737q.m19390b(iNextInt), c9737q.m19393f(iNextInt)));
        }
        return arrayList;
    }

    /* renamed from: P */
    public static final C9737q m20008P(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        C9737q.a aVar = new C9737q.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10994a c10994a = (C10994a) it.next();
            aVar.m19398d(c10994a.m24245a().utf8(), c10994a.m24246b().utf8());
        }
        return aVar.m19400f();
    }

    /* renamed from: Q */
    public static final String m20009Q(C9738r c9738r, boolean z10) {
        String strM19419i;
        AbstractC9979u.m20294g(c9738r, "<this>");
        if (AbstractC10793c0.m23108U(c9738r.m19419i(), ":", false, 2, null)) {
            strM19419i = '[' + c9738r.m19419i() + ']';
        } else {
            strM19419i = c9738r.m19419i();
        }
        if (!z10 && c9738r.m19424n() == C9738r.f22749k.m19467c(c9738r.m19428r())) {
            return strM19419i;
        }
        return strM19419i + ':' + c9738r.m19424n();
    }

    /* renamed from: R */
    public static /* synthetic */ String m20010R(C9738r c9738r, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m20009Q(c9738r, z10);
    }

    /* renamed from: S */
    public static final List m20011S(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC10947g0.m23925a1(list));
        AbstractC9979u.m20293f(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    /* renamed from: T */
    public static final Map m20012T(Map map) {
        AbstractC9979u.m20294g(map, "<this>");
        if (map.isEmpty()) {
            return AbstractC9925a.m20088h();
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        AbstractC9979u.m20293f(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    /* renamed from: U */
    public static final long m20013U(String str, long j10) {
        AbstractC9979u.m20294g(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    /* renamed from: V */
    public static final int m20014V(String str, int i10) throws NumberFormatException {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > SieveCacheKt.NodeLinkMask) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    /* renamed from: W */
    public static final String m20015W(String str, int i10, int i11) {
        AbstractC9979u.m20294g(str, "<this>");
        int iM20044z = m20044z(str, i10, i11);
        String strSubstring = str.substring(iM20044z, m19994B(str, iM20044z, i11));
        AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: X */
    public static /* synthetic */ String m20016X(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m20015W(str, i10, i11);
    }

    /* renamed from: Y */
    public static final Throwable m20017Y(Exception exc, List suppressed) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(exc, "<this>");
        AbstractC9979u.m20294g(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            AbstractC10771b.m22973a(exc, (Exception) it.next());
        }
        return exc;
    }

    /* renamed from: Z */
    public static final void m20018Z(BufferedSink bufferedSink, int i10) {
        AbstractC9979u.m20294g(bufferedSink, "<this>");
        bufferedSink.writeByte((i10 >>> 16) & 255);
        bufferedSink.writeByte((i10 >>> 8) & 255);
        bufferedSink.writeByte(i10 & 255);
    }

    /* renamed from: c */
    public static final void m20021c(List list, Object obj) {
        AbstractC9979u.m20294g(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    /* renamed from: d */
    public static final int m20022d(byte b10, int i10) {
        return b10 & i10;
    }

    /* renamed from: e */
    public static final int m20023e(short s10, int i10) {
        return s10 & i10;
    }

    /* renamed from: f */
    public static final long m20024f(int i10, long j10) {
        return i10 & j10;
    }

    /* renamed from: g */
    public static final AbstractC9735o.c m20025g(final AbstractC9735o abstractC9735o) {
        AbstractC9979u.m20294g(abstractC9735o, "<this>");
        return new AbstractC9735o.c() { // from class: ke.b
            @Override // je.AbstractC9735o.c
            /* renamed from: a */
            public final AbstractC9735o mo19383a(InterfaceC9725e interfaceC9725e) {
                return AbstractC9920d.m20026h(abstractC9735o, interfaceC9725e);
            }
        };
    }

    /* renamed from: h */
    public static final AbstractC9735o m20026h(AbstractC9735o this_asFactory, InterfaceC9725e it) {
        AbstractC9979u.m20294g(this_asFactory, "$this_asFactory");
        AbstractC9979u.m20294g(it, "it");
        return this_asFactory;
    }

    /* renamed from: i */
    public static final boolean m20027i(String str) {
        AbstractC9979u.m20294g(str, "<this>");
        return f23247g.m20341g(str);
    }

    /* renamed from: j */
    public static final boolean m20028j(C9738r c9738r, C9738r other) {
        AbstractC9979u.m20294g(c9738r, "<this>");
        AbstractC9979u.m20294g(other, "other");
        return AbstractC9979u.m20289b(c9738r.m19419i(), other.m19419i()) && c9738r.m19424n() == other.m19424n() && AbstractC9979u.m20289b(c9738r.m19428r(), other.m19428r());
    }

    /* renamed from: k */
    public static final int m20029k(String name, long j10, TimeUnit timeUnit) {
        AbstractC9979u.m20294g(name, "name");
        if (j10 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    /* renamed from: l */
    public static final void m20030l(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: m */
    public static final void m20031m(Closeable closeable) throws IOException {
        AbstractC9979u.m20294g(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public static final void m20032n(Socket socket) throws IOException {
        AbstractC9979u.m20294g(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!AbstractC9979u.m20289b(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: o */
    public static final String[] m20033o(String[] strArr, String value) {
        AbstractC9979u.m20294g(strArr, "<this>");
        AbstractC9979u.m20294g(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[AbstractC10968r.m24041A0(strArr2)] = value;
        return strArr2;
    }

    /* renamed from: p */
    public static final int m20034p(String str, char c10, int i10, int i11) {
        AbstractC9979u.m20294g(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: q */
    public static final int m20035q(String str, String delimiters, int i10, int i11) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(delimiters, "delimiters");
        while (i10 < i11) {
            if (AbstractC10793c0.m23106T(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: r */
    public static /* synthetic */ int m20036r(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return m20034p(str, c10, i10, i11);
    }

    /* renamed from: s */
    public static final boolean m20037s(Source source, int i10, TimeUnit timeUnit) {
        AbstractC9979u.m20294g(source, "<this>");
        AbstractC9979u.m20294g(timeUnit, "timeUnit");
        try {
            return m20004L(source, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public static final String m20038t(String format, Object... args) {
        AbstractC9979u.m20294g(format, "format");
        AbstractC9979u.m20294g(args, "args");
        C9960c0 c9960c0 = C9960c0.f23411a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC9979u.m20293f(str, "format(locale, format, *args)");
        return str;
    }

    /* renamed from: u */
    public static final boolean m20039u(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC9979u.m20294g(strArr, "<this>");
        AbstractC9979u.m20294g(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itM20268a = AbstractC9963e.m20268a(strArr2);
                while (itM20268a.hasNext()) {
                    if (comparator.compare(str, (String) itM20268a.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: v */
    public static final long m20040v(C9745y c9745y) {
        AbstractC9979u.m20294g(c9745y, "<this>");
        String strM19389a = c9745y.m19637r().m19389a("Content-Length");
        if (strM19389a != null) {
            return m20013U(strM19389a, -1L);
        }
        return -1L;
    }

    /* renamed from: w */
    public static final List m20041w(Object... elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC10978w.m24139q(Arrays.copyOf(objArr, objArr.length)));
        AbstractC9979u.m20293f(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    /* renamed from: x */
    public static final int m20042x(String[] strArr, String value, Comparator comparator) {
        AbstractC9979u.m20294g(strArr, "<this>");
        AbstractC9979u.m20294g(value, "value");
        AbstractC9979u.m20294g(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: y */
    public static final int m20043y(String str) {
        AbstractC9979u.m20294g(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC9979u.m20296i(cCharAt, 31) <= 0 || AbstractC9979u.m20296i(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: z */
    public static final int m20044z(String str, int i10, int i11) {
        AbstractC9979u.m20294g(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }
}
