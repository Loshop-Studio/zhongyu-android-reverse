package p182m8;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
import kotlin.ExceptionsKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Source;
import p172l8.AbstractC8916o;
import p172l8.AbstractC8925x;
import p172l8.AbstractC8927z;
import p172l8.C8918q;
import p172l8.C8919r;
import p172l8.C8923v;
import p172l8.C8926y;
import p172l8.InterfaceC8906e;
import p256t8.C9636a;

/* renamed from: m8.d */
/* loaded from: classes5.dex */
public abstract class AbstractC9045d {

    /* renamed from: a */
    public static final byte[] f15224a;

    /* renamed from: b */
    public static final C8918q f15225b = C8918q.f14793b.m13957g(new String[0]);

    /* renamed from: c */
    public static final AbstractC8927z f15226c;

    /* renamed from: d */
    public static final AbstractC8925x f15227d;

    /* renamed from: e */
    public static final Options f15228e;

    /* renamed from: f */
    public static final TimeZone f15229f;

    /* renamed from: g */
    public static final Regex f15230g;

    /* renamed from: h */
    public static final boolean f15231h;

    /* renamed from: i */
    public static final String f15232i;

    static {
        byte[] bArr = new byte[0];
        f15224a = bArr;
        f15226c = AbstractC8927z.b.m14209i(AbstractC8927z.Companion, bArr, null, 1, null);
        f15227d = AbstractC8925x.a.m14155p(AbstractC8925x.Companion, bArr, null, 0, 0, 7, null);
        Options.Companion companion = Options.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        f15228e = companion.m15063of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f15229f = timeZone;
        f15230g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f15231h = false;
        String name = C8923v.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f15232i = StringsKt.removeSuffix(StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    /* renamed from: A */
    public static /* synthetic */ int m14459A(String str, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return m14510z(str, i9, i10);
    }

    /* renamed from: B */
    public static final int m14460B(String str, int i9, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i11 = i10 - 1;
        if (i9 <= i11) {
            while (true) {
                char cCharAt = str.charAt(i11);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i11 + 1;
                }
                if (i11 == i9) {
                    break;
                }
                i11--;
            }
        }
        return i9;
    }

    /* renamed from: C */
    public static /* synthetic */ int m14461C(String str, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return m14460B(str, i9, i10);
    }

    /* renamed from: D */
    public static final int m14462D(String str, int i9) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i9 < length) {
            char cCharAt = str.charAt(i9);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i9;
            }
            i9++;
        }
        return str.length();
    }

    /* renamed from: E */
    public static final String[] m14463E(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i9]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i9++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: F */
    public static final boolean m14464F(Socket socket, BufferedSource source) throws SocketException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
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
    public static final boolean m14465G(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.equals(name, "Authorization", true) || StringsKt.equals(name, "Cookie", true) || StringsKt.equals(name, "Proxy-Authorization", true) || StringsKt.equals(name, "Set-Cookie", true);
    }

    /* renamed from: H */
    public static final int m14466H(char c10) {
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
    public static final Charset m14467I(BufferedSource bufferedSource, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iSelect = bufferedSource.select(f15228e);
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iSelect == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iSelect == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iSelect == 3) {
            return Charsets.INSTANCE.UTF32_BE();
        }
        if (iSelect == 4) {
            return Charsets.INSTANCE.UTF32_LE();
        }
        throw new AssertionError();
    }

    /* renamed from: J */
    public static final int m14468J(BufferedSource bufferedSource) {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        return m14488d(bufferedSource.readByte(), 255) | (m14488d(bufferedSource.readByte(), 255) << 16) | (m14488d(bufferedSource.readByte(), 255) << 8);
    }

    /* renamed from: K */
    public static final int m14469K(Buffer buffer, byte b10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        int i9 = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b10) {
            i9++;
            buffer.readByte();
        }
        return i9;
    }

    /* renamed from: L */
    public static final boolean m14470L(Source source, int i9, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = source.timeout().getHasDeadline() ? source.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        source.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i9)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
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
    public static final ThreadFactory m14471M(final String name, final boolean z9) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: m8.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC9045d.m14472N(name, z9, runnable);
            }
        };
    }

    /* renamed from: N */
    public static final Thread m14472N(String name, boolean z9, Runnable runnable) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z9);
        return thread;
    }

    /* renamed from: O */
    public static final List m14473O(C8918q c8918q) {
        Intrinsics.checkNotNullParameter(c8918q, "<this>");
        IntRange intRangeUntil = RangesKt.until(0, c8918q.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new C9636a(c8918q.m13937b(iNextInt), c8918q.m13940f(iNextInt)));
        }
        return arrayList;
    }

    /* renamed from: P */
    public static final C8918q m14474P(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        C8918q.a aVar = new C8918q.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9636a c9636a = (C9636a) it.next();
            aVar.m13945d(c9636a.m15910a().utf8(), c9636a.m15911b().utf8());
        }
        return aVar.m13947f();
    }

    /* renamed from: Q */
    public static final String m14475Q(C8919r c8919r, boolean z9) {
        String strM13966i;
        Intrinsics.checkNotNullParameter(c8919r, "<this>");
        if (StringsKt.contains$default((CharSequence) c8919r.m13966i(), (CharSequence) ":", false, 2, (Object) null)) {
            strM13966i = '[' + c8919r.m13966i() + ']';
        } else {
            strM13966i = c8919r.m13966i();
        }
        if (!z9 && c8919r.m13971n() == C8919r.f14796k.m14014c(c8919r.m13975r())) {
            return strM13966i;
        }
        return strM13966i + ':' + c8919r.m13971n();
    }

    /* renamed from: R */
    public static /* synthetic */ String m14476R(C8919r c8919r, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = false;
        }
        return m14475Q(c8919r, z9);
    }

    /* renamed from: S */
    public static final List m14477S(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    /* renamed from: T */
    public static final Map m14478T(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return MapsKt.emptyMap();
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    /* renamed from: U */
    public static final long m14479U(String str, long j9) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j9;
        }
    }

    /* renamed from: V */
    public static final int m14480V(String str, int i9) throws NumberFormatException {
        if (str != null) {
            try {
                long j9 = Long.parseLong(str);
                if (j9 > SieveCacheKt.NodeLinkMask) {
                    return Integer.MAX_VALUE;
                }
                if (j9 < 0) {
                    return 0;
                }
                return (int) j9;
            } catch (NumberFormatException unused) {
            }
        }
        return i9;
    }

    /* renamed from: W */
    public static final String m14481W(String str, int i9, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iM14510z = m14510z(str, i9, i10);
        String strSubstring = str.substring(iM14510z, m14460B(str, iM14510z, i10));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: X */
    public static /* synthetic */ String m14482X(String str, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return m14481W(str, i9, i10);
    }

    /* renamed from: Y */
    public static final Throwable m14483Y(Exception exc, List suppressed) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(exc, (Exception) it.next());
        }
        return exc;
    }

    /* renamed from: Z */
    public static final void m14484Z(BufferedSink bufferedSink, int i9) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSink, "<this>");
        bufferedSink.writeByte((i9 >>> 16) & 255);
        bufferedSink.writeByte((i9 >>> 8) & 255);
        bufferedSink.writeByte(i9 & 255);
    }

    /* renamed from: c */
    public static final void m14487c(List list, Object obj) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    /* renamed from: d */
    public static final int m14488d(byte b10, int i9) {
        return b10 & i9;
    }

    /* renamed from: e */
    public static final int m14489e(short s9, int i9) {
        return s9 & i9;
    }

    /* renamed from: f */
    public static final long m14490f(int i9, long j9) {
        return i9 & j9;
    }

    /* renamed from: g */
    public static final AbstractC8916o.c m14491g(final AbstractC8916o abstractC8916o) {
        Intrinsics.checkNotNullParameter(abstractC8916o, "<this>");
        return new AbstractC8916o.c() { // from class: m8.b
            @Override // p172l8.AbstractC8916o.c
            /* renamed from: a */
            public final AbstractC8916o mo13930a(InterfaceC8906e interfaceC8906e) {
                return AbstractC9045d.m14492h(abstractC8916o, interfaceC8906e);
            }
        };
    }

    /* renamed from: h */
    public static final AbstractC8916o m14492h(AbstractC8916o this_asFactory, InterfaceC8906e it) {
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    /* renamed from: i */
    public static final boolean m14493i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f15230g.matches(str);
    }

    /* renamed from: j */
    public static final boolean m14494j(C8919r c8919r, C8919r other) {
        Intrinsics.checkNotNullParameter(c8919r, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(c8919r.m13966i(), other.m13966i()) && c8919r.m13971n() == other.m13971n() && Intrinsics.areEqual(c8919r.m13975r(), other.m13975r());
    }

    /* renamed from: k */
    public static final int m14495k(String name, long j9, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j9 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j9);
        if (millis > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j9 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    /* renamed from: l */
    public static final void m14496l(long j9, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j9 || j9 - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: m */
    public static final void m14497m(Closeable closeable) throws IOException {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public static final void m14498n(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!Intrinsics.areEqual(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: o */
    public static final String[] m14499o(String[] strArr, String value) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[ArraysKt.getLastIndex(strArr2)] = value;
        return strArr2;
    }

    /* renamed from: p */
    public static final int m14500p(String str, char c10, int i9, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i9 < i10) {
            if (str.charAt(i9) == c10) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    /* renamed from: q */
    public static final int m14501q(String str, String delimiters, int i9, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i9 < i10) {
            if (StringsKt.contains$default((CharSequence) delimiters, str.charAt(i9), false, 2, (Object) null)) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    /* renamed from: r */
    public static /* synthetic */ int m14502r(String str, char c10, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = str.length();
        }
        return m14500p(str, c10, i9, i10);
    }

    /* renamed from: s */
    public static final boolean m14503s(Source source, int i9, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return m14470L(source, i9, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public static final String m14504t(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    /* renamed from: u */
    public static final boolean m14505u(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator it = ArrayIteratorKt.iterator(strArr2);
                while (it.hasNext()) {
                    if (comparator.compare(str, (String) it.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: v */
    public static final long m14506v(C8926y c8926y) {
        Intrinsics.checkNotNullParameter(c8926y, "<this>");
        String strM13936a = c8926y.m14179o().m13936a(HttpHeaders.CONTENT_LENGTH);
        if (strM13936a != null) {
            return m14479U(strM13936a, -1L);
        }
        return -1L;
    }

    /* renamed from: w */
    public static final List m14507w(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    /* renamed from: x */
    public static final int m14508x(String[] strArr, String value, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (comparator.compare(strArr[i9], value) == 0) {
                return i9;
            }
        }
        return -1;
    }

    /* renamed from: y */
    public static final int m14509y(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = str.charAt(i9);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, WorkQueueKt.MASK) >= 0) {
                return i9;
            }
        }
        return -1;
    }

    /* renamed from: z */
    public static final int m14510z(String str, int i9, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i9 < i10) {
            char cCharAt = str.charAt(i9);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i9;
            }
            i9++;
        }
        return i10;
    }
}
