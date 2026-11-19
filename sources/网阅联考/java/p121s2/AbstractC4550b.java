package p121s2;

import android.support.v4.media.session.PlaybackStateCompat;
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
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Source;
import p117r2.AbstractC4498b0;
import p117r2.AbstractC4514q;
import p117r2.AbstractC4523z;
import p117r2.C4496a0;
import p117r2.C4516s;
import p117r2.C4517t;
import p117r2.C4521x;
import p117r2.InterfaceC4502e;
import p149z2.C4708a;

/* renamed from: s2.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4550b {

    /* renamed from: a */
    public static final byte[] f5701a;

    /* renamed from: b */
    public static final C4516s f5702b = C4516s.f5532b.m5978g(new String[0]);

    /* renamed from: c */
    public static final AbstractC4498b0 f5703c;

    /* renamed from: d */
    public static final AbstractC4523z f5704d;

    /* renamed from: e */
    public static final Options f5705e;

    /* renamed from: f */
    public static final TimeZone f5706f;

    /* renamed from: g */
    public static final Regex f5707g;

    /* renamed from: h */
    public static final boolean f5708h;

    /* renamed from: i */
    public static final String f5709i;

    /* renamed from: s2.b$a */
    public static final class a implements AbstractC4514q.c {

        /* renamed from: a */
        public final /* synthetic */ AbstractC4514q f5710a;

        public a(AbstractC4514q abstractC4514q) {
            this.f5710a = abstractC4514q;
        }

        @Override // p117r2.AbstractC4514q.c
        /* renamed from: a */
        public final AbstractC4514q mo5953a(InterfaceC4502e it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f5710a;
        }
    }

    /* renamed from: s2.b$b */
    public static final class b implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ String f5711a;

        /* renamed from: b */
        public final /* synthetic */ boolean f5712b;

        public b(String str, boolean z3) {
            this.f5711a = str;
            this.f5712b = z3;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f5711a);
            thread.setDaemon(this.f5712b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f5701a = bArr;
        f5703c = AbstractC4498b0.b.m5842e(AbstractC4498b0.f5320b, bArr, null, 1, null);
        f5704d = AbstractC4523z.a.m6152j(AbstractC4523z.Companion, bArr, null, 0, 0, 7, null);
        Options.Companion companion = Options.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        f5705e = companion.m5653of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f5706f = timeZone;
        f5707g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f5708h = false;
        String name = C4521x.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f5709i = StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    /* renamed from: A */
    public static final int m6198A(String indexOfNonWhitespace, int i4) {
        Intrinsics.checkNotNullParameter(indexOfNonWhitespace, "$this$indexOfNonWhitespace");
        int length = indexOfNonWhitespace.length();
        while (i4 < length) {
            char cCharAt = indexOfNonWhitespace.charAt(i4);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i4;
            }
            i4++;
        }
        return indexOfNonWhitespace.length();
    }

    /* renamed from: B */
    public static final String[] m6199B(String[] intersect, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(intersect, "$this$intersect");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : intersect) {
            int length = other.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i4]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i4++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: C */
    public static final boolean m6200C(Socket isHealthy, BufferedSource source) throws SocketException {
        Intrinsics.checkNotNullParameter(isHealthy, "$this$isHealthy");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = isHealthy.getSoTimeout();
            try {
                isHealthy.setSoTimeout(1);
                boolean z3 = !source.exhausted();
                isHealthy.setSoTimeout(soTimeout);
                return z3;
            } catch (Throwable th) {
                isHealthy.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: D */
    public static final int m6201D(char c4) {
        if ('0' <= c4 && '9' >= c4) {
            return c4 - '0';
        }
        char c5 = 'a';
        if ('a' > c4 || 'f' < c4) {
            c5 = 'A';
            if ('A' > c4 || 'F' < c4) {
                return -1;
            }
        }
        return (c4 - c5) + 10;
    }

    /* renamed from: E */
    public static final Charset m6202E(BufferedSource readBomAsCharset, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(readBomAsCharset, "$this$readBomAsCharset");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iSelect = readBomAsCharset.select(f5705e);
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

    /* renamed from: F */
    public static final int m6203F(BufferedSource readMedium) {
        Intrinsics.checkNotNullParameter(readMedium, "$this$readMedium");
        return m6220b(readMedium.readByte(), 255) | (m6220b(readMedium.readByte(), 255) << 16) | (m6220b(readMedium.readByte(), 255) << 8);
    }

    /* renamed from: G */
    public static final int m6204G(Buffer skipAll, byte b4) throws EOFException {
        Intrinsics.checkNotNullParameter(skipAll, "$this$skipAll");
        int i4 = 0;
        while (!skipAll.exhausted() && skipAll.getByte(0L) == b4) {
            i4++;
            skipAll.readByte();
        }
        return i4;
    }

    /* renamed from: H */
    public static final boolean m6205H(Source skipAll, int i4, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(skipAll, "$this$skipAll");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = skipAll.timeout().getHasDeadline() ? skipAll.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        skipAll.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i4)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (skipAll.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                buffer.clear();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                skipAll.timeout().clearDeadline();
            } else {
                skipAll.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                skipAll.timeout().clearDeadline();
            } else {
                skipAll.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                skipAll.timeout().clearDeadline();
            } else {
                skipAll.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    /* renamed from: I */
    public static final ThreadFactory m6206I(String name, boolean z3) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new b(name, z3);
    }

    /* renamed from: J */
    public static final List m6207J(C4516s toHeaderList) {
        Intrinsics.checkNotNullParameter(toHeaderList, "$this$toHeaderList");
        IntRange intRangeUntil = RangesKt___RangesKt.until(0, toHeaderList.size());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new C4708a(toHeaderList.m5960b(iNextInt), toHeaderList.m5962e(iNextInt)));
        }
        return arrayList;
    }

    /* renamed from: K */
    public static final C4516s m6208K(List toHeaders) {
        Intrinsics.checkNotNullParameter(toHeaders, "$this$toHeaders");
        C4516s.a aVar = new C4516s.a();
        Iterator it = toHeaders.iterator();
        while (it.hasNext()) {
            C4708a c4708a = (C4708a) it.next();
            aVar.m5967d(c4708a.m6709a().utf8(), c4708a.m6710b().utf8());
        }
        return aVar.m5968e();
    }

    /* renamed from: L */
    public static final String m6209L(C4517t toHostHeader, boolean z3) {
        String strM5987i;
        Intrinsics.checkNotNullParameter(toHostHeader, "$this$toHostHeader");
        if (StringsKt__StringsKt.contains$default((CharSequence) toHostHeader.m5987i(), (CharSequence) ":", false, 2, (Object) null)) {
            strM5987i = '[' + toHostHeader.m5987i() + ']';
        } else {
            strM5987i = toHostHeader.m5987i();
        }
        if (!z3 && toHostHeader.m5992n() == C4517t.f5536l.m6035c(toHostHeader.m5996r())) {
            return strM5987i;
        }
        return strM5987i + ':' + toHostHeader.m5992n();
    }

    /* renamed from: M */
    public static /* synthetic */ String m6210M(C4517t c4517t, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        return m6209L(c4517t, z3);
    }

    /* renamed from: N */
    public static final List m6211N(List toImmutableList) {
        Intrinsics.checkNotNullParameter(toImmutableList, "$this$toImmutableList");
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt___CollectionsKt.toMutableList((Collection) toImmutableList));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    /* renamed from: O */
    public static final Map m6212O(Map toImmutableMap) {
        Intrinsics.checkNotNullParameter(toImmutableMap, "$this$toImmutableMap");
        if (toImmutableMap.isEmpty()) {
            return MapsKt__MapsKt.emptyMap();
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return mapUnmodifiableMap;
    }

    /* renamed from: P */
    public static final long m6213P(String toLongOrDefault, long j4) {
        Intrinsics.checkNotNullParameter(toLongOrDefault, "$this$toLongOrDefault");
        try {
            return Long.parseLong(toLongOrDefault);
        } catch (NumberFormatException unused) {
            return j4;
        }
    }

    /* renamed from: Q */
    public static final int m6214Q(String str, int i4) throws NumberFormatException {
        if (str != null) {
            try {
                long j4 = Long.parseLong(str);
                if (j4 > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (j4 < 0) {
                    return 0;
                }
                return (int) j4;
            } catch (NumberFormatException unused) {
            }
        }
        return i4;
    }

    /* renamed from: R */
    public static final String m6215R(String trimSubstring, int i4, int i5) {
        Intrinsics.checkNotNullParameter(trimSubstring, "$this$trimSubstring");
        int iM6241w = m6241w(trimSubstring, i4, i5);
        String strSubstring = trimSubstring.substring(iM6241w, m6243y(trimSubstring, iM6241w, i5));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: S */
    public static /* synthetic */ String m6216S(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return m6215R(str, i4, i5);
    }

    /* renamed from: T */
    public static final Throwable m6217T(Exception withSuppressed, List suppressed) {
        Intrinsics.checkNotNullParameter(withSuppressed, "$this$withSuppressed");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt__ExceptionsKt.addSuppressed(withSuppressed, (Exception) it.next());
        }
        return withSuppressed;
    }

    /* renamed from: U */
    public static final void m6218U(BufferedSink writeMedium, int i4) throws IOException {
        Intrinsics.checkNotNullParameter(writeMedium, "$this$writeMedium");
        writeMedium.writeByte((i4 >>> 16) & 255);
        writeMedium.writeByte((i4 >>> 8) & 255);
        writeMedium.writeByte(i4 & 255);
    }

    /* renamed from: a */
    public static final void m6219a(List addIfAbsent, Object obj) {
        Intrinsics.checkNotNullParameter(addIfAbsent, "$this$addIfAbsent");
        if (addIfAbsent.contains(obj)) {
            return;
        }
        addIfAbsent.add(obj);
    }

    /* renamed from: b */
    public static final int m6220b(byte b4, int i4) {
        return b4 & i4;
    }

    /* renamed from: c */
    public static final int m6221c(short s3, int i4) {
        return s3 & i4;
    }

    /* renamed from: d */
    public static final long m6222d(int i4, long j4) {
        return i4 & j4;
    }

    /* renamed from: e */
    public static final AbstractC4514q.c m6223e(AbstractC4514q asFactory) {
        Intrinsics.checkNotNullParameter(asFactory, "$this$asFactory");
        return new a(asFactory);
    }

    /* renamed from: f */
    public static final boolean m6224f(String canParseAsIpAddress) {
        Intrinsics.checkNotNullParameter(canParseAsIpAddress, "$this$canParseAsIpAddress");
        return f5707g.matches(canParseAsIpAddress);
    }

    /* renamed from: g */
    public static final boolean m6225g(C4517t canReuseConnectionFor, C4517t other) {
        Intrinsics.checkNotNullParameter(canReuseConnectionFor, "$this$canReuseConnectionFor");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(canReuseConnectionFor.m5987i(), other.m5987i()) && canReuseConnectionFor.m5992n() == other.m5992n() && Intrinsics.areEqual(canReuseConnectionFor.m5996r(), other.m5996r());
    }

    /* renamed from: h */
    public static final int m6226h(String name, long j4, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        boolean z3 = true;
        if (!(j4 >= 0)) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j4);
        if (!(millis <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis == 0 && j4 > 0) {
            z3 = false;
        }
        if (z3) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    /* renamed from: i */
    public static final void m6227i(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: j */
    public static final void m6228j(Closeable closeQuietly) throws IOException {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    public static final void m6229k(Socket closeQuietly) throws IOException {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    public static final String[] m6230l(String[] concat, String value) {
        Intrinsics.checkNotNullParameter(concat, "$this$concat");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(concat, concat.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr = (String[]) objArrCopyOf;
        strArr[ArraysKt___ArraysKt.getLastIndex(strArr)] = value;
        return strArr;
    }

    /* renamed from: m */
    public static final int m6231m(String delimiterOffset, char c4, int i4, int i5) {
        Intrinsics.checkNotNullParameter(delimiterOffset, "$this$delimiterOffset");
        while (i4 < i5) {
            if (delimiterOffset.charAt(i4) == c4) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    /* renamed from: n */
    public static final int m6232n(String delimiterOffset, String delimiters, int i4, int i5) {
        Intrinsics.checkNotNullParameter(delimiterOffset, "$this$delimiterOffset");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i4 < i5) {
            if (StringsKt__StringsKt.contains$default((CharSequence) delimiters, delimiterOffset.charAt(i4), false, 2, (Object) null)) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    /* renamed from: o */
    public static /* synthetic */ int m6233o(String str, char c4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = str.length();
        }
        return m6231m(str, c4, i4, i5);
    }

    /* renamed from: p */
    public static final boolean m6234p(Source discard, int i4, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(discard, "$this$discard");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return m6205H(discard, i4, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static final String m6235q(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        return str;
    }

    /* renamed from: r */
    public static final boolean m6236r(String[] hasIntersection, String[] strArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(hasIntersection, "$this$hasIntersection");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(hasIntersection.length == 0) && strArr != null) {
            if (!(strArr.length == 0)) {
                for (String str : hasIntersection) {
                    for (String str2 : strArr) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: s */
    public static final long m6237s(C4496a0 headersContentLength) {
        Intrinsics.checkNotNullParameter(headersContentLength, "$this$headersContentLength");
        String strM5959a = headersContentLength.m5808j().m5959a("Content-Length");
        if (strM5959a != null) {
            return m6213P(strM5959a, -1L);
        }
        return -1L;
    }

    /* renamed from: t */
    public static final List m6238t(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    /* renamed from: u */
    public static final int m6239u(String[] indexOf, String value, Comparator comparator) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = indexOf.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (comparator.compare(indexOf[i4], value) == 0) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: v */
    public static final int m6240v(String indexOfControlOrNonAscii) {
        Intrinsics.checkNotNullParameter(indexOfControlOrNonAscii, "$this$indexOfControlOrNonAscii");
        int length = indexOfControlOrNonAscii.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = indexOfControlOrNonAscii.charAt(i4);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, WorkQueueKt.MASK) >= 0) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: w */
    public static final int m6241w(String indexOfFirstNonAsciiWhitespace, int i4, int i5) {
        Intrinsics.checkNotNullParameter(indexOfFirstNonAsciiWhitespace, "$this$indexOfFirstNonAsciiWhitespace");
        while (i4 < i5) {
            char cCharAt = indexOfFirstNonAsciiWhitespace.charAt(i4);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    /* renamed from: x */
    public static /* synthetic */ int m6242x(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return m6241w(str, i4, i5);
    }

    /* renamed from: y */
    public static final int m6243y(String indexOfLastNonAsciiWhitespace, int i4, int i5) {
        Intrinsics.checkNotNullParameter(indexOfLastNonAsciiWhitespace, "$this$indexOfLastNonAsciiWhitespace");
        int i6 = i5 - 1;
        if (i6 >= i4) {
            while (true) {
                char cCharAt = indexOfLastNonAsciiWhitespace.charAt(i6);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i6 + 1;
                }
                if (i6 == i4) {
                    break;
                }
                i6--;
            }
        }
        return i4;
    }

    /* renamed from: z */
    public static /* synthetic */ int m6244z(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return m6243y(str, i4, i5);
    }
}
