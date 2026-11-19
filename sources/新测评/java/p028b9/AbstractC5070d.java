package p028b9;

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
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Source;
import p011a9.AbstractC0052o;
import p011a9.AbstractC0061x;
import p011a9.AbstractC0063z;
import p011a9.C0054q;
import p011a9.C0055r;
import p011a9.C0059v;
import p011a9.C0062y;
import p011a9.InterfaceC0042e;
import p125i9.C7716a;

/* renamed from: b9.d */
/* loaded from: classes5.dex */
public abstract class AbstractC5070d {

    /* renamed from: a */
    public static final byte[] f2633a;

    /* renamed from: b */
    public static final C0054q f2634b = C0054q.f165b.m201g(new String[0]);

    /* renamed from: c */
    public static final AbstractC0063z f2635c;

    /* renamed from: d */
    public static final AbstractC0061x f2636d;

    /* renamed from: e */
    public static final Options f2637e;

    /* renamed from: f */
    public static final TimeZone f2638f;

    /* renamed from: g */
    public static final Regex f2639g;

    /* renamed from: h */
    public static final boolean f2640h;

    /* renamed from: i */
    public static final String f2641i;

    static {
        byte[] bArr = new byte[0];
        f2633a = bArr;
        f2635c = AbstractC0063z.b.m453i(AbstractC0063z.Companion, bArr, null, 1, null);
        f2636d = AbstractC0061x.a.m399p(AbstractC0061x.Companion, bArr, null, 0, 0, 7, null);
        Options.Companion companion = Options.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        f2637e = companion.m14628of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f2638f = timeZone;
        f2639g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f2640h = false;
        String name = C0059v.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f2641i = StringsKt.removeSuffix(StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    /* renamed from: A */
    public static /* synthetic */ int m2610A(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m2661z(str, i10, i11);
    }

    /* renamed from: B */
    public static final int m2611B(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
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
    public static /* synthetic */ int m2612C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m2611B(str, i10, i11);
    }

    /* renamed from: D */
    public static final int m2613D(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
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
    public static final String[] m2614E(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
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
    public static final boolean m2615F(Socket socket, BufferedSource source) throws SocketException {
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
    public static final boolean m2616G(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.equals(name, HttpHeaders.AUTHORIZATION, true) || StringsKt.equals(name, "Cookie", true) || StringsKt.equals(name, "Proxy-Authorization", true) || StringsKt.equals(name, "Set-Cookie", true);
    }

    /* renamed from: H */
    public static final int m2617H(char c10) {
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
    public static final Charset m2618I(BufferedSource bufferedSource, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iSelect = bufferedSource.select(f2637e);
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
    public static final int m2619J(BufferedSource bufferedSource) {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        return m2639d(bufferedSource.readByte(), 255) | (m2639d(bufferedSource.readByte(), 255) << 16) | (m2639d(bufferedSource.readByte(), 255) << 8);
    }

    /* renamed from: K */
    public static final int m2620K(Buffer buffer, byte b10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        int i10 = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b10) {
            i10++;
            buffer.readByte();
        }
        return i10;
    }

    /* renamed from: L */
    public static final boolean m2621L(Source source, int i10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = source.getTimeout().getHasDeadline() ? source.getTimeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        source.getTimeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                buffer.clear();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.getTimeout().clearDeadline();
                return true;
            }
            source.getTimeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.getTimeout().clearDeadline();
                return false;
            }
            source.getTimeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.getTimeout().clearDeadline();
            } else {
                source.getTimeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    /* renamed from: M */
    public static final ThreadFactory m2622M(final String name, final boolean z9) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: b9.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC5070d.m2623N(name, z9, runnable);
            }
        };
    }

    /* renamed from: N */
    public static final Thread m2623N(String name, boolean z9, Runnable runnable) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z9);
        return thread;
    }

    /* renamed from: O */
    public static final List m2624O(C0054q c0054q) {
        Intrinsics.checkNotNullParameter(c0054q, "<this>");
        IntRange intRangeUntil = RangesKt.until(0, c0054q.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new C7716a(c0054q.m181b(iNextInt), c0054q.m184f(iNextInt)));
        }
        return arrayList;
    }

    /* renamed from: P */
    public static final C0054q m2625P(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        C0054q.a aVar = new C0054q.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7716a c7716a = (C7716a) it.next();
            aVar.m189d(c7716a.m12891a().utf8(), c7716a.m12892b().utf8());
        }
        return aVar.m191f();
    }

    /* renamed from: Q */
    public static final String m2626Q(C0055r c0055r, boolean z9) {
        String strM210i;
        Intrinsics.checkNotNullParameter(c0055r, "<this>");
        if (StringsKt.contains$default((CharSequence) c0055r.m210i(), (CharSequence) ":", false, 2, (Object) null)) {
            strM210i = '[' + c0055r.m210i() + ']';
        } else {
            strM210i = c0055r.m210i();
        }
        if (!z9 && c0055r.m215n() == C0055r.f168k.m258c(c0055r.m219r())) {
            return strM210i;
        }
        return strM210i + ':' + c0055r.m215n();
    }

    /* renamed from: R */
    public static /* synthetic */ String m2627R(C0055r c0055r, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        return m2626Q(c0055r, z9);
    }

    /* renamed from: S */
    public static final List m2628S(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    /* renamed from: T */
    public static final Map m2629T(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return MapsKt.emptyMap();
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    /* renamed from: U */
    public static final long m2630U(String str, long j10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    /* renamed from: V */
    public static final int m2631V(String str, int i10) throws NumberFormatException {
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
    public static final String m2632W(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iM2661z = m2661z(str, i10, i11);
        String strSubstring = str.substring(iM2661z, m2611B(str, iM2661z, i11));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: X */
    public static /* synthetic */ String m2633X(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m2632W(str, i10, i11);
    }

    /* renamed from: Y */
    public static final Throwable m2634Y(Exception exc, List suppressed) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(exc, (Exception) it.next());
        }
        return exc;
    }

    /* renamed from: Z */
    public static final void m2635Z(BufferedSink bufferedSink, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSink, "<this>");
        bufferedSink.writeByte((i10 >>> 16) & 255);
        bufferedSink.writeByte((i10 >>> 8) & 255);
        bufferedSink.writeByte(i10 & 255);
    }

    /* renamed from: c */
    public static final void m2638c(List list, Object obj) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    /* renamed from: d */
    public static final int m2639d(byte b10, int i10) {
        return b10 & i10;
    }

    /* renamed from: e */
    public static final int m2640e(short s10, int i10) {
        return s10 & i10;
    }

    /* renamed from: f */
    public static final long m2641f(int i10, long j10) {
        return i10 & j10;
    }

    /* renamed from: g */
    public static final AbstractC0052o.c m2642g(final AbstractC0052o abstractC0052o) {
        Intrinsics.checkNotNullParameter(abstractC0052o, "<this>");
        return new AbstractC0052o.c() { // from class: b9.b
            @Override // p011a9.AbstractC0052o.c
            /* renamed from: a */
            public final AbstractC0052o mo174a(InterfaceC0042e interfaceC0042e) {
                return AbstractC5070d.m2643h(abstractC0052o, interfaceC0042e);
            }
        };
    }

    /* renamed from: h */
    public static final AbstractC0052o m2643h(AbstractC0052o this_asFactory, InterfaceC0042e it) {
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    /* renamed from: i */
    public static final boolean m2644i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f2639g.matches(str);
    }

    /* renamed from: j */
    public static final boolean m2645j(C0055r c0055r, C0055r other) {
        Intrinsics.checkNotNullParameter(c0055r, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(c0055r.m210i(), other.m210i()) && c0055r.m215n() == other.m215n() && Intrinsics.areEqual(c0055r.m219r(), other.m219r());
    }

    /* renamed from: k */
    public static final int m2646k(String name, long j10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
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
    public static final void m2647l(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: m */
    public static final void m2648m(Closeable closeable) throws IOException {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public static final void m2649n(Socket socket) throws IOException {
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
    public static final String[] m2650o(String[] strArr, String value) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[ArraysKt.getLastIndex(strArr2)] = value;
        return strArr2;
    }

    /* renamed from: p */
    public static final int m2651p(String str, char c10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: q */
    public static final int m2652q(String str, String delimiters, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i10 < i11) {
            if (StringsKt.contains$default((CharSequence) delimiters, str.charAt(i10), false, 2, (Object) null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: r */
    public static /* synthetic */ int m2653r(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return m2651p(str, c10, i10, i11);
    }

    /* renamed from: s */
    public static final boolean m2654s(Source source, int i10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return m2621L(source, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public static final String m2655t(String format, Object... args) {
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
    public static final boolean m2656u(String[] strArr, String[] strArr2, Comparator comparator) {
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
    public static final long m2657v(C0062y c0062y) {
        Intrinsics.checkNotNullParameter(c0062y, "<this>");
        String strM180a = c0062y.m423o().m180a(HttpHeaders.CONTENT_LENGTH);
        if (strM180a != null) {
            return m2630U(strM180a, -1L);
        }
        return -1L;
    }

    /* renamed from: w */
    public static final List m2658w(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    /* renamed from: x */
    public static final int m2659x(String[] strArr, String value, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: y */
    public static final int m2660y(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: z */
    public static final int m2661z(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
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
