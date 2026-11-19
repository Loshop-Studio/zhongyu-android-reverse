package p139p7;

import androidx.collection.SieveCacheKt;
import androidx.compose.material3.AbstractC1923c;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5840a;
import kotlin.text.AbstractC5855p;
import kotlin.text.Regex;
import okhttp3.AbstractC6297g0;
import okhttp3.AbstractC6323m0;
import okhttp3.AbstractC6326o;
import okhttp3.C6293e0;
import okhttp3.C6295f0;
import okhttp3.C6301i0;
import okhttp3.C6319k0;
import okhttp3.C6321l0;
import okhttp3.C6329q;
import okhttp3.C6330r;
import okhttp3.C6338z;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Source;
import p045d6.C5434j;
import p178u7.C6627b;

/* renamed from: p7.c */
/* loaded from: classes4.dex */
public abstract class AbstractC6396c {

    /* renamed from: a */
    public static final byte[] f10486a;

    /* renamed from: b */
    public static final C6329q f10487b = AbstractC6326o.m5957g(new String[0]);

    /* renamed from: c */
    public static final C6319k0 f10488c;

    /* renamed from: d */
    public static final C6293e0 f10489d;

    /* renamed from: e */
    public static final Options f10490e;

    /* renamed from: f */
    public static final TimeZone f10491f;

    /* renamed from: g */
    public static final Regex f10492g;

    /* renamed from: h */
    public static final String f10493h;

    static {
        byte[] bArr = new byte[0];
        f10486a = bArr;
        AbstractC6323m0.Companion.getClass();
        f10488c = C6321l0.m5949c(bArr, null);
        f10489d = C6295f0.m5892c(AbstractC6297g0.Companion, bArr, null, 0, 7);
        Options.Companion companion = Options.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        f10490e = companion.m5992of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        AbstractC5830k.m5327d(timeZone);
        f10491f = timeZone;
        f10492g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f10493h = AbstractC5855p.m5390X(AbstractC5855p.m5388V(C6338z.class.getName(), "okhttp3."), "Client");
    }

    /* renamed from: a */
    public static final boolean m6041a(C6330r c6330r, C6330r other) {
        AbstractC5830k.m5330g(c6330r, "<this>");
        AbstractC5830k.m5330g(other, "other");
        return AbstractC5830k.m5325b(c6330r.f10268d, other.f10268d) && c6330r.f10269e == other.f10269e && AbstractC5830k.m5325b(c6330r.f10265a, other.f10265a);
    }

    /* renamed from: b */
    public static final int m6042b(long j7, TimeUnit timeUnit) {
        if (j7 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j7);
        if (millis > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j7 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    /* renamed from: c */
    public static final void m6043c(Closeable closeable) throws IOException {
        AbstractC5830k.m5330g(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final void m6044d(Socket socket) throws IOException {
        AbstractC5830k.m5330g(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e4) {
            if (!AbstractC5830k.m5325b(e4.getMessage(), "bio == null")) {
                throw e4;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static final int m6045e(int i, int i8, String str, String str2) {
        AbstractC5830k.m5330g(str, "<this>");
        while (i < i8) {
            if (AbstractC5855p.m5373G(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i8;
    }

    /* renamed from: f */
    public static final int m6046f(String str, char c, int i, int i8) {
        AbstractC5830k.m5330g(str, "<this>");
        while (i < i8) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i8;
    }

    /* renamed from: g */
    public static final String m6047g(String format, Object... objArr) {
        AbstractC5830k.m5330g(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* renamed from: h */
    public static final boolean m6048h(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC5830k.m5330g(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C5434j c5434jM5335l = AbstractC5830k.m5335l(strArr2);
                while (c5434jM5335l.hasNext()) {
                    if (comparator.compare(str, (String) c5434jM5335l.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public static final long m6049i(C6301i0 c6301i0) {
        String strM5962a = c6301i0.f10109f.m5962a(HttpHeaders.CONTENT_LENGTH);
        if (strM5962a == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM5962a);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: j */
    public static final List m6050j(Object... elements) {
        AbstractC5830k.m5330g(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC5806u.m5287z(Arrays.copyOf(objArr, objArr.length)));
        AbstractC5830k.m5329f(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    /* renamed from: k */
    public static final int m6051k(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (AbstractC5830k.m5332i(cCharAt, 31) <= 0 || AbstractC5830k.m5332i(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public static final int m6052l(int i, int i8, String str) {
        AbstractC5830k.m5330g(str, "<this>");
        while (i < i8) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i8;
    }

    /* renamed from: m */
    public static final int m6053m(int i, int i8, String str) {
        AbstractC5830k.m5330g(str, "<this>");
        int i9 = i8 - 1;
        if (i <= i9) {
            while (true) {
                char cCharAt = str.charAt(i9);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i9 + 1;
                }
                if (i9 == i) {
                    break;
                }
                i9--;
            }
        }
        return i;
    }

    /* renamed from: n */
    public static final String[] m6054n(String[] strArr, String[] other, Comparator comparator) {
        AbstractC5830k.m5330g(other, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, other[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: o */
    public static final boolean m6055o(String name) {
        AbstractC5830k.m5330g(name, "name");
        return name.equalsIgnoreCase(HttpHeaders.AUTHORIZATION) || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    /* renamed from: p */
    public static final int m6056p(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    /* renamed from: q */
    public static final Charset m6057q(BufferedSource bufferedSource, Charset charset) throws IOException {
        AbstractC5830k.m5330g(bufferedSource, "<this>");
        AbstractC5830k.m5330g(charset, "default");
        int iSelect = bufferedSource.select(f10490e);
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC5830k.m5329f(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iSelect == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            AbstractC5830k.m5329f(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iSelect == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            AbstractC5830k.m5329f(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iSelect == 3) {
            Charset charset2 = AbstractC5840a.f9235a;
            Charset charset3 = AbstractC5840a.f9238d;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            AbstractC5830k.m5329f(charsetForName, "forName(...)");
            AbstractC5840a.f9238d = charsetForName;
            return charsetForName;
        }
        if (iSelect != 4) {
            throw new AssertionError();
        }
        Charset charset4 = AbstractC5840a.f9235a;
        Charset charset5 = AbstractC5840a.f9237c;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        AbstractC5830k.m5329f(charsetForName2, "forName(...)");
        AbstractC5840a.f9237c = charsetForName2;
        return charsetForName2;
    }

    /* renamed from: r */
    public static final int m6058r(BufferedSource bufferedSource) {
        AbstractC5830k.m5330g(bufferedSource, "<this>");
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* renamed from: s */
    public static final boolean m6059s(Source source, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC5830k.m5330g(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = source.getThis$0().getHasDeadline() ? source.getThis$0().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        source.getThis$0().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, 8192L) != -1) {
                buffer.clear();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.getThis$0().clearDeadline();
                return true;
            }
            source.getThis$0().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.getThis$0().clearDeadline();
                return false;
            }
            source.getThis$0().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.getThis$0().clearDeadline();
            } else {
                source.getThis$0().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    /* renamed from: t */
    public static final C6329q m6060t(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6627b c6627b = (C6627b) it.next();
            ByteString byteString = c6627b.f11097a;
            ByteString byteString2 = c6627b.f11098b;
            String name = byteString.utf8();
            String value = byteString2.utf8();
            AbstractC5830k.m5330g(name, "name");
            AbstractC5830k.m5330g(value, "value");
            arrayList.add(name);
            arrayList.add(AbstractC5855p.m5403k0(value).toString());
        }
        return new C6329q((String[]) arrayList.toArray(new String[0]));
    }

    /* renamed from: u */
    public static final String m6061u(C6330r c6330r, boolean z8) {
        AbstractC5830k.m5330g(c6330r, "<this>");
        int i = c6330r.f10269e;
        String strM1047k = c6330r.f10268d;
        if (AbstractC5855p.m5372F(strM1047k, ":", false)) {
            strM1047k = AbstractC1923c.m1047k(']', "[", strM1047k);
        }
        if (!z8) {
            String scheme = c6330r.f10265a;
            AbstractC5830k.m5330g(scheme, "scheme");
            if (i == (scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1)) {
                return strM1047k;
            }
        }
        return strM1047k + ':' + i;
    }

    /* renamed from: v */
    public static final List m6062v(List list) {
        AbstractC5830k.m5330g(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC5805t.m5218E0(list));
        AbstractC5830k.m5329f(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    /* renamed from: w */
    public static final int m6063w(int i, String str) throws NumberFormatException {
        if (str == null) {
            return i;
        }
        try {
            long j7 = Long.parseLong(str);
            if (j7 > SieveCacheKt.NodeLinkMask) {
                return Integer.MAX_VALUE;
            }
            if (j7 < 0) {
                return 0;
            }
            return (int) j7;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: x */
    public static final String m6064x(int i, int i8, String str) {
        int iM6052l = m6052l(i, i8, str);
        String strSubstring = str.substring(iM6052l, m6053m(iM6052l, i8, str));
        AbstractC5830k.m5329f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
