package okhttp3.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
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
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.collections.AbstractC2743y;
import kotlin.collections.C2716c0;
import kotlin.collections.C2725h;
import kotlin.collections.C2730l;
import kotlin.collections.C2731m;
import kotlin.collections.C2738t;
import kotlin.jvm.internal.C2757a0;
import kotlin.jvm.internal.C2759b0;
import kotlin.jvm.internal.C2768k;
import kotlin.jvm.internal.C2769l;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.p129io.FileSystem;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1034c;
import p014b3.C1037f;
import p082e3.C2478d;
import p082e3.C2484j;
import p082e3.C2496v;
import p128o2.C2909b;
import p128o2.C2925r;
import p163v2.C3424a;
import p171x2.InterfaceC3459a;
import p171x2.InterfaceC3470l;

/* loaded from: classes.dex */
public final class Util {

    @NotNull
    public static final byte[] EMPTY_BYTE_ARRAY;

    @NotNull
    public static final Headers EMPTY_HEADERS = Headers.Companion.m10000of(new String[0]);

    @NotNull
    public static final RequestBody EMPTY_REQUEST;

    @NotNull
    public static final ResponseBody EMPTY_RESPONSE;
    private static final Options UNICODE_BOMS;

    @NotNull
    public static final TimeZone UTC;
    private static final C2484j VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;

    @NotNull
    public static final String okHttpName;

    @NotNull
    public static final String userAgent = "okhttp/4.9.0";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        Options.Companion companion = Options.Companion;
        ByteString.Companion companion2 = ByteString.Companion;
        UNICODE_BOMS = companion.m10010of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        C2769l.m9239c(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new C2484j("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        C2769l.m9240d(name, "OkHttpClient::class.java.name");
        okHttpName = C2496v.m8396j0(C2496v.m8395i0(name, "okhttp3."), "Client");
    }

    public static final <E> void addIfAbsent(@NotNull List<E> addIfAbsent, E e4) {
        C2769l.m9241e(addIfAbsent, "$this$addIfAbsent");
        if (addIfAbsent.contains(e4)) {
            return;
        }
        addIfAbsent.add(e4);
    }

    public static final int and(byte b4, int i4) {
        return b4 & i4;
    }

    public static final int and(short s3, int i4) {
        return s3 & i4;
    }

    public static final long and(int i4, long j4) {
        return i4 & j4;
    }

    @NotNull
    public static final EventListener.Factory asFactory(@NotNull final EventListener asFactory) {
        C2769l.m9241e(asFactory, "$this$asFactory");
        return new EventListener.Factory() { // from class: okhttp3.internal.Util.asFactory.1
            @Override // okhttp3.EventListener.Factory
            @NotNull
            public final EventListener create(@NotNull Call it) {
                C2769l.m9241e(it, "it");
                return asFactory;
            }
        };
    }

    public static final void assertThreadDoesntHoldLock(@NotNull Object assertThreadDoesntHoldLock) {
        C2769l.m9241e(assertThreadDoesntHoldLock, "$this$assertThreadDoesntHoldLock");
        if (assertionsEnabled && Thread.holdsLock(assertThreadDoesntHoldLock)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            C2769l.m9240d(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(assertThreadDoesntHoldLock);
            throw new AssertionError(sb.toString());
        }
    }

    public static final void assertThreadHoldsLock(@NotNull Object assertThreadHoldsLock) {
        C2769l.m9241e(assertThreadHoldsLock, "$this$assertThreadHoldsLock");
        if (!assertionsEnabled || Thread.holdsLock(assertThreadHoldsLock)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        C2769l.m9240d(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(assertThreadHoldsLock);
        throw new AssertionError(sb.toString());
    }

    public static final boolean canParseAsIpAddress(@NotNull String canParseAsIpAddress) {
        C2769l.m9241e(canParseAsIpAddress, "$this$canParseAsIpAddress");
        return VERIFY_AS_IP_ADDRESS.m8279c(canParseAsIpAddress);
    }

    public static final boolean canReuseConnectionFor(@NotNull HttpUrl canReuseConnectionFor, @NotNull HttpUrl other) {
        C2769l.m9241e(canReuseConnectionFor, "$this$canReuseConnectionFor");
        C2769l.m9241e(other, "other");
        return C2769l.m9237a(canReuseConnectionFor.host(), other.host()) && canReuseConnectionFor.port() == other.port() && C2769l.m9237a(canReuseConnectionFor.scheme(), other.scheme());
    }

    public static final int checkDuration(@NotNull String name, long j4, @Nullable TimeUnit timeUnit) {
        C2769l.m9241e(name, "name");
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

    public static final void checkOffsetAndCount(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(@NotNull Closeable closeQuietly) throws IOException {
        C2769l.m9241e(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final String[] concat(@NotNull String[] concat, @NotNull String value) {
        C2769l.m9241e(concat, "$this$concat");
        C2769l.m9241e(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(concat, concat.length + 1);
        C2769l.m9240d(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr = (String[]) objArrCopyOf;
        strArr[C2725h.m9098r(strArr)] = value;
        return strArr;
    }

    public static final int delimiterOffset(@NotNull String delimiterOffset, @NotNull String delimiters, int i4, int i5) {
        C2769l.m9241e(delimiterOffset, "$this$delimiterOffset");
        C2769l.m9241e(delimiters, "delimiters");
        while (i4 < i5) {
            if (C2496v.m8364G(delimiters, delimiterOffset.charAt(i4), false, 2, null)) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = str.length();
        }
        return delimiterOffset(str, str2, i4, i5);
    }

    public static final boolean discard(@NotNull Source discard, int i4, @NotNull TimeUnit timeUnit) {
        C2769l.m9241e(discard, "$this$discard");
        C2769l.m9241e(timeUnit, "timeUnit");
        try {
            return skipAll(discard, i4, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @NotNull
    public static final <T> List<T> filterList(@NotNull Iterable<? extends T> filterList, @NotNull InterfaceC3470l<? super T, Boolean> predicate) {
        C2769l.m9241e(filterList, "$this$filterList");
        C2769l.m9241e(predicate, "predicate");
        List<T> listM9139f = C2730l.m9139f();
        for (T t3 : filterList) {
            if (predicate.invoke(t3).booleanValue()) {
                if (listM9139f.isEmpty()) {
                    listM9139f = new ArrayList<>();
                }
                C2759b0.m9221a(listM9139f).add(t3);
            }
        }
        return listM9139f;
    }

    @NotNull
    public static final String format(@NotNull String format, @NotNull Object... args) {
        C2769l.m9241e(format, "format");
        C2769l.m9241e(args, "args");
        C2757a0 c2757a0 = C2757a0.f10720a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        C2769l.m9240d(str, "java.lang.String.format(locale, format, *args)");
        return str;
    }

    public static final boolean hasIntersection(@NotNull String[] hasIntersection, @Nullable String[] strArr, @NotNull Comparator<? super String> comparator) {
        C2769l.m9241e(hasIntersection, "$this$hasIntersection");
        C2769l.m9241e(comparator, "comparator");
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

    public static final long headersContentLength(@NotNull Response headersContentLength) {
        C2769l.m9241e(headersContentLength, "$this$headersContentLength");
        String str = headersContentLength.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(@NotNull InterfaceC3459a<C2925r> block) {
        C2769l.m9241e(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> immutableListOf(@NotNull T... elements) {
        C2769l.m9241e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(C2730l.m9142i(Arrays.copyOf(objArr, objArr.length)));
        C2769l.m9240d(listUnmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int indexOf(@NotNull String[] indexOf, @NotNull String value, @NotNull Comparator<String> comparator) {
        C2769l.m9241e(indexOf, "$this$indexOf");
        C2769l.m9241e(value, "value");
        C2769l.m9241e(comparator, "comparator");
        int length = indexOf.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (comparator.compare(indexOf[i4], value) == 0) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(@NotNull String indexOfControlOrNonAscii) {
        C2769l.m9241e(indexOfControlOrNonAscii, "$this$indexOfControlOrNonAscii");
        int length = indexOfControlOrNonAscii.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = indexOfControlOrNonAscii.charAt(i4);
            if (C2769l.m9243g(cCharAt, 31) <= 0 || C2769l.m9243g(cCharAt, 127) >= 0) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(@NotNull String indexOfFirstNonAsciiWhitespace, int i4, int i5) {
        C2769l.m9241e(indexOfFirstNonAsciiWhitespace, "$this$indexOfFirstNonAsciiWhitespace");
        while (i4 < i5) {
            char cCharAt = indexOfFirstNonAsciiWhitespace.charAt(i4);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i4, i5);
    }

    public static final int indexOfLastNonAsciiWhitespace(@NotNull String indexOfLastNonAsciiWhitespace, int i4, int i5) {
        C2769l.m9241e(indexOfLastNonAsciiWhitespace, "$this$indexOfLastNonAsciiWhitespace");
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

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i4, i5);
    }

    public static final int indexOfNonWhitespace(@NotNull String indexOfNonWhitespace, int i4) {
        C2769l.m9241e(indexOfNonWhitespace, "$this$indexOfNonWhitespace");
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

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return indexOfNonWhitespace(str, i4);
    }

    @NotNull
    public static final String[] intersect(@NotNull String[] intersect, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        C2769l.m9241e(intersect, "$this$intersect");
        C2769l.m9241e(other, "other");
        C2769l.m9241e(comparator, "comparator");
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
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public static final boolean isCivilized(@NotNull FileSystem isCivilized, @NotNull File file) throws IOException {
        C2769l.m9241e(isCivilized, "$this$isCivilized");
        C2769l.m9241e(file, "file");
        Sink sink = isCivilized.sink(file);
        try {
            try {
                isCivilized.delete(file);
                C3424a.m10441a(sink, null);
                return true;
            } catch (IOException unused) {
                C2925r c2925r = C2925r.f11415a;
                C3424a.m10441a(sink, null);
                isCivilized.delete(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean isHealthy(@NotNull Socket isHealthy, @NotNull BufferedSource source) throws SocketException {
        C2769l.m9241e(isHealthy, "$this$isHealthy");
        C2769l.m9241e(source, "source");
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

    public static final void notify(@NotNull Object notify) {
        C2769l.m9241e(notify, "$this$notify");
        notify.notify();
    }

    public static final void notifyAll(@NotNull Object notifyAll) {
        C2769l.m9241e(notifyAll, "$this$notifyAll");
        notifyAll.notifyAll();
    }

    public static final int parseHexDigit(char c4) {
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

    @NotNull
    public static final String peerName(@NotNull Socket peerName) {
        C2769l.m9241e(peerName, "$this$peerName");
        SocketAddress remoteSocketAddress = peerName.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        C2769l.m9240d(hostName, "address.hostName");
        return hostName;
    }

    @NotNull
    public static final Charset readBomAsCharset(@NotNull BufferedSource readBomAsCharset, @NotNull Charset charset) throws IOException {
        C2769l.m9241e(readBomAsCharset, "$this$readBomAsCharset");
        C2769l.m9241e(charset, "default");
        int iSelect = readBomAsCharset.select(UNICODE_BOMS);
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            C2769l.m9240d(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iSelect == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            C2769l.m9240d(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iSelect == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            C2769l.m9240d(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iSelect == 3) {
            return C2478d.f10081a.m8264a();
        }
        if (iSelect == 4) {
            return C2478d.f10081a.m8265b();
        }
        throw new AssertionError();
    }

    @Nullable
    public static final <T> T readFieldOrNull(@NotNull Object instance, @NotNull Class<T> fieldType, @NotNull String fieldName) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        T tCast;
        Object fieldOrNull;
        C2769l.m9241e(instance, "instance");
        C2769l.m9241e(fieldType, "fieldType");
        C2769l.m9241e(fieldName, "fieldName");
        Class<?> superclass = instance.getClass();
        while (true) {
            tCast = null;
            if (!(!C2769l.m9237a(superclass, Object.class))) {
                if (!(!C2769l.m9237a(fieldName, "delegate")) || (fieldOrNull = readFieldOrNull(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, fieldType, fieldName);
            }
            try {
                Field field = superclass.getDeclaredField(fieldName);
                C2769l.m9240d(field, "field");
                field.setAccessible(true);
                Object obj = field.get(instance);
                if (!fieldType.isInstance(obj)) {
                    break;
                }
                tCast = fieldType.cast(obj);
                break;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                C2769l.m9240d(superclass, "c.superclass");
            }
        }
        return tCast;
    }

    public static final int readMedium(@NotNull BufferedSource readMedium) throws IOException {
        C2769l.m9241e(readMedium, "$this$readMedium");
        return and(readMedium.readByte(), 255) | (and(readMedium.readByte(), 255) << 16) | (and(readMedium.readByte(), 255) << 8);
    }

    public static final boolean skipAll(@NotNull Source skipAll, int i4, @NotNull TimeUnit timeUnit) throws IOException {
        boolean z3;
        C2769l.m9241e(skipAll, "$this$skipAll");
        C2769l.m9241e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = skipAll.timeout().hasDeadline() ? skipAll.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        skipAll.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i4)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (skipAll.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                buffer.clear();
            }
            z3 = true;
        } catch (InterruptedIOException unused) {
            z3 = false;
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
            }
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                skipAll.timeout().clearDeadline();
            } else {
                skipAll.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
        if (jDeadlineNanoTime == Long.MAX_VALUE) {
            skipAll.timeout().clearDeadline();
        } else {
            skipAll.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
        }
        return z3;
    }

    @NotNull
    public static final ThreadFactory threadFactory(@NotNull final String name, final boolean z3) {
        C2769l.m9241e(name, "name");
        return new ThreadFactory() { // from class: okhttp3.internal.Util.threadFactory.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, name);
                thread.setDaemon(z3);
                return thread;
            }
        };
    }

    public static final void threadName(@NotNull String name, @NotNull InterfaceC3459a<C2925r> block) {
        C2769l.m9241e(name, "name");
        C2769l.m9241e(block, "block");
        Thread currentThread = Thread.currentThread();
        C2769l.m9240d(currentThread, "currentThread");
        String name2 = currentThread.getName();
        currentThread.setName(name);
        try {
            block.invoke();
        } finally {
            C2768k.m9236b(1);
            currentThread.setName(name2);
            C2768k.m9235a(1);
        }
    }

    @NotNull
    public static final List<Header> toHeaderList(@NotNull Headers toHeaderList) {
        C2769l.m9241e(toHeaderList, "$this$toHeaderList");
        C1034c c1034cM4828i = C1037f.m4828i(0, toHeaderList.size());
        ArrayList arrayList = new ArrayList(C2731m.m9149p(c1034cM4828i, 10));
        Iterator<Integer> it = c1034cM4828i.iterator();
        while (it.hasNext()) {
            int iMo4807a = ((AbstractC2743y) it).mo4807a();
            arrayList.add(new Header(toHeaderList.name(iMo4807a), toHeaderList.value(iMo4807a)));
        }
        return arrayList;
    }

    @NotNull
    public static final Headers toHeaders(@NotNull List<Header> toHeaders) {
        C2769l.m9241e(toHeaders, "$this$toHeaders");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : toHeaders) {
            builder.addLenient$okhttp(header.component1().utf8(), header.component2().utf8());
        }
        return builder.build();
    }

    @NotNull
    public static final String toHexString(long j4) {
        String hexString = Long.toHexString(j4);
        C2769l.m9240d(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    @NotNull
    public static final String toHostHeader(@NotNull HttpUrl toHostHeader, boolean z3) {
        String strHost;
        C2769l.m9241e(toHostHeader, "$this$toHostHeader");
        if (C2496v.m8366H(toHostHeader.host(), ":", false, 2, null)) {
            strHost = '[' + toHostHeader.host() + ']';
        } else {
            strHost = toHostHeader.host();
        }
        if (!z3 && toHostHeader.port() == HttpUrl.Companion.defaultPort(toHostHeader.scheme())) {
            return strHost;
        }
        return strHost + ':' + toHostHeader.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        return toHostHeader(httpUrl, z3);
    }

    @NotNull
    public static final <T> List<T> toImmutableList(@NotNull List<? extends T> toImmutableList) {
        C2769l.m9241e(toImmutableList, "$this$toImmutableList");
        List<T> listUnmodifiableList = Collections.unmodifiableList(C2738t.m9165M(toImmutableList));
        C2769l.m9240d(listUnmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    @NotNull
    public static final <K, V> Map<K, V> toImmutableMap(@NotNull Map<K, ? extends V> toImmutableMap) {
        C2769l.m9241e(toImmutableMap, "$this$toImmutableMap");
        if (toImmutableMap.isEmpty()) {
            return C2716c0.m9054d();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
        C2769l.m9240d(mapUnmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return mapUnmodifiableMap;
    }

    public static final long toLongOrDefault(@NotNull String toLongOrDefault, long j4) {
        C2769l.m9241e(toLongOrDefault, "$this$toLongOrDefault");
        try {
            return Long.parseLong(toLongOrDefault);
        } catch (NumberFormatException unused) {
            return j4;
        }
    }

    public static final int toNonNegativeInt(@Nullable String str, int i4) throws NumberFormatException {
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

    @NotNull
    public static final String trimSubstring(@NotNull String trimSubstring, int i4, int i5) {
        C2769l.m9241e(trimSubstring, "$this$trimSubstring");
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(trimSubstring, i4, i5);
        String strSubstring = trimSubstring.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(trimSubstring, iIndexOfFirstNonAsciiWhitespace, i5));
        C2769l.m9240d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return trimSubstring(str, i4, i5);
    }

    public static final void wait(@NotNull Object wait) throws InterruptedException {
        C2769l.m9241e(wait, "$this$wait");
        wait.wait();
    }

    @NotNull
    public static final Throwable withSuppressed(@NotNull Exception withSuppressed, @NotNull List<? extends Exception> suppressed) {
        C2769l.m9241e(withSuppressed, "$this$withSuppressed");
        C2769l.m9241e(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            C2909b.m9982a(withSuppressed, it.next());
        }
        return withSuppressed;
    }

    public static final void writeMedium(@NotNull BufferedSink writeMedium, int i4) throws IOException {
        C2769l.m9241e(writeMedium, "$this$writeMedium");
        writeMedium.writeByte((i4 >>> 16) & 255);
        writeMedium.writeByte((i4 >>> 8) & 255);
        writeMedium.writeByte(i4 & 255);
    }

    public static final int delimiterOffset(@NotNull String delimiterOffset, char c4, int i4, int i5) {
        C2769l.m9241e(delimiterOffset, "$this$delimiterOffset");
        while (i4 < i5) {
            if (delimiterOffset.charAt(i4) == c4) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = str.length();
        }
        return delimiterOffset(str, c4, i4, i5);
    }

    @NotNull
    public static final String toHexString(int i4) {
        String hexString = Integer.toHexString(i4);
        C2769l.m9240d(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    public static final void closeQuietly(@NotNull Socket closeQuietly) throws IOException {
        C2769l.m9241e(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(@NotNull ServerSocket closeQuietly) throws IOException {
        C2769l.m9241e(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(@NotNull Buffer skipAll, byte b4) throws EOFException {
        C2769l.m9241e(skipAll, "$this$skipAll");
        int i4 = 0;
        while (!skipAll.exhausted() && skipAll.getByte(0L) == b4) {
            i4++;
            skipAll.readByte();
        }
        return i4;
    }
}
