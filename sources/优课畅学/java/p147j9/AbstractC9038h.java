package p147j9;

import androidx.collection.SieveCacheKt;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9117e;
import kotlin.jvm.internal.AbstractC9133u;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p123h7.AbstractC8722b;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8807u;

/* renamed from: j9.h */
/* loaded from: classes5.dex */
public abstract class AbstractC9038h {

    /* renamed from: a */
    public static final byte[] f17259a = new byte[0];

    /* renamed from: b */
    public static final Options f17260b;

    static {
        Options.Companion companion = Options.Companion;
        ByteString.Companion companion2 = ByteString.Companion;
        f17260b = companion.m18126of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe0000"), companion2.decodeHex("fffe"), companion2.decodeHex("0000feff"));
    }

    /* renamed from: A */
    public static final int m15740A(String str, int i10) throws NumberFormatException {
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

    /* renamed from: B */
    public static final String m15741B(String str, int i10, int i11) {
        AbstractC9133u.m16133g(str, "<this>");
        int iM15759o = m15759o(str, i10, i11);
        String strSubstring = str.substring(iM15759o, m15761q(str, iM15759o, i11));
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: C */
    public static /* synthetic */ String m15742C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m15741B(str, i10, i11);
    }

    /* renamed from: D */
    public static final Throwable m15743D(Exception exc, List suppressed) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(exc, "<this>");
        AbstractC9133u.m16133g(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            AbstractC8722b.m14228a(exc, (Exception) it.next());
        }
        return exc;
    }

    /* renamed from: E */
    public static final void m15744E(BufferedSink bufferedSink, int i10) {
        AbstractC9133u.m16133g(bufferedSink, "<this>");
        bufferedSink.writeByte((i10 >>> 16) & 255);
        bufferedSink.writeByte((i10 >>> 8) & 255);
        bufferedSink.writeByte(i10 & 255);
    }

    /* renamed from: a */
    public static final void m15745a(List list, Object obj) {
        AbstractC9133u.m16133g(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    /* renamed from: b */
    public static final int m15746b(byte b10, int i10) {
        return b10 & i10;
    }

    /* renamed from: c */
    public static final int m15747c(short s10, int i10) {
        return s10 & i10;
    }

    /* renamed from: d */
    public static final long m15748d(int i10, long j10) {
        return i10 & j10;
    }

    /* renamed from: e */
    public static final void m15749e(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("length=" + j10 + ", offset=" + j11 + ", count=" + j11);
        }
    }

    /* renamed from: f */
    public static final void m15750f(Closeable closeable) throws IOException {
        AbstractC9133u.m16133g(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public static final String[] m15751g(String[] strArr, String value) {
        AbstractC9133u.m16133g(strArr, "<this>");
        AbstractC9133u.m16133g(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[AbstractC8801r.m14668B0(strArr2)] = value;
        return strArr2;
    }

    /* renamed from: h */
    public static final int m15752h(String str, char c10, int i10, int i11) {
        AbstractC9133u.m16133g(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: i */
    public static final int m15753i(String str, String delimiters, int i10, int i11) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(delimiters, "delimiters");
        while (i10 < i11) {
            if (AbstractC8661c0.m13971R(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: j */
    public static /* synthetic */ int m15754j(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return m15752h(str, c10, i10, i11);
    }

    /* renamed from: k */
    public static final Options m15755k() {
        return f17260b;
    }

    /* renamed from: l */
    public static final boolean m15756l(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC9133u.m16133g(strArr, "<this>");
        AbstractC9133u.m16133g(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itM16110a = AbstractC9117e.m16110a(strArr2);
                while (itM16110a.hasNext()) {
                    if (comparator.compare(str, (String) itM16110a.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    public static final int m15757m(String[] strArr, String value, Comparator comparator) {
        AbstractC9133u.m16133g(strArr, "<this>");
        AbstractC9133u.m16133g(value, "value");
        AbstractC9133u.m16133g(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public static final int m15758n(String str) {
        AbstractC9133u.m16133g(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC9133u.m16135i(cCharAt, 31) <= 0 || AbstractC9133u.m16135i(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public static final int m15759o(String str, int i10, int i11) {
        AbstractC9133u.m16133g(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: p */
    public static /* synthetic */ int m15760p(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m15759o(str, i10, i11);
    }

    /* renamed from: q */
    public static final int m15761q(String str, int i10, int i11) {
        AbstractC9133u.m16133g(str, "<this>");
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

    /* renamed from: r */
    public static /* synthetic */ int m15762r(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m15761q(str, i10, i11);
    }

    /* renamed from: s */
    public static final int m15763s(String str, int i10) {
        AbstractC9133u.m16133g(str, "<this>");
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

    /* renamed from: t */
    public static final List m15764t(Iterable a10, Iterable b10) {
        AbstractC9133u.m16133g(a10, "a");
        AbstractC9133u.m16133g(b10, "b");
        Iterator it = a10.iterator();
        Iterator it2 = b10.iterator();
        List listM14753c = AbstractC8807u.m14753c();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return AbstractC8807u.m14751a(listM14753c);
            }
            if (it.hasNext()) {
                listM14753c.add(it.next());
            }
            if (it2.hasNext()) {
                listM14753c.add(it2.next());
            }
        }
    }

    /* renamed from: u */
    public static final String[] m15765u(String[] strArr, String[] other, Comparator comparator) {
        AbstractC9133u.m16133g(strArr, "<this>");
        AbstractC9133u.m16133g(other, "other");
        AbstractC9133u.m16133g(comparator, "comparator");
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

    /* renamed from: v */
    public static final boolean m15766v(String name) {
        AbstractC9133u.m16133g(name, "name");
        return AbstractC8687z.m14093A(name, HttpHeaders.AUTHORIZATION, true) || AbstractC8687z.m14093A(name, "Cookie", true) || AbstractC8687z.m14093A(name, "Proxy-Authorization", true) || AbstractC8687z.m14093A(name, "Set-Cookie", true);
    }

    /* renamed from: w */
    public static final int m15767w(char c10) {
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

    /* renamed from: x */
    public static final int m15768x(BufferedSource bufferedSource) {
        AbstractC9133u.m16133g(bufferedSource, "<this>");
        return m15746b(bufferedSource.readByte(), 255) | (m15746b(bufferedSource.readByte(), 255) << 16) | (m15746b(bufferedSource.readByte(), 255) << 8);
    }

    /* renamed from: y */
    public static final int m15769y(Buffer buffer, byte b10) throws EOFException {
        AbstractC9133u.m16133g(buffer, "<this>");
        int i10 = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b10) {
            i10++;
            buffer.readByte();
        }
        return i10;
    }

    /* renamed from: z */
    public static final long m15770z(String str, long j10) {
        AbstractC9133u.m16133g(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }
}
