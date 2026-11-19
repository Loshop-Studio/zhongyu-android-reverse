package p065g5;

import androidx.collection.SieveCacheKt;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;

/* renamed from: g5.h */
/* loaded from: classes4.dex */
public abstract class AbstractC6424h {

    /* renamed from: a */
    public static final byte[] f8094a = new byte[0];

    /* renamed from: b */
    public static final Options f8095b;

    static {
        Options.Companion companion = Options.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        f8095b = companion.m8945of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe0000"), companion2.decodeHex("fffe"), companion2.decodeHex("0000feff"));
    }

    /* renamed from: A */
    public static final int m6982A(String str, int i6) throws NumberFormatException {
        if (str != null) {
            try {
                long j6 = Long.parseLong(str);
                if (j6 > SieveCacheKt.NodeLinkMask) {
                    return Integer.MAX_VALUE;
                }
                if (j6 < 0) {
                    return 0;
                }
                return (int) j6;
            } catch (NumberFormatException unused) {
            }
        }
        return i6;
    }

    /* renamed from: B */
    public static final String m6983B(String str, int i6, int i7) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iM7001o = m7001o(str, i6, i7);
        String strSubstring = str.substring(iM7001o, m7003q(str, iM7001o, i7));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: C */
    public static /* synthetic */ String m6984C(String str, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = str.length();
        }
        return m6983B(str, i6, i7);
    }

    /* renamed from: D */
    public static final Throwable m6985D(Exception exc, List suppressed) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(exc, (Exception) it.next());
        }
        return exc;
    }

    /* renamed from: E */
    public static final void m6986E(BufferedSink bufferedSink, int i6) {
        Intrinsics.checkNotNullParameter(bufferedSink, "<this>");
        bufferedSink.writeByte((i6 >>> 16) & 255);
        bufferedSink.writeByte((i6 >>> 8) & 255);
        bufferedSink.writeByte(i6 & 255);
    }

    /* renamed from: a */
    public static final void m6987a(List list, Object obj) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    /* renamed from: b */
    public static final int m6988b(byte b7, int i6) {
        return b7 & i6;
    }

    /* renamed from: c */
    public static final int m6989c(short s6, int i6) {
        return s6 & i6;
    }

    /* renamed from: d */
    public static final long m6990d(int i6, long j6) {
        return i6 & j6;
    }

    /* renamed from: e */
    public static final void m6991e(long j6, long j7, long j8) {
        if ((j7 | j8) < 0 || j7 > j6 || j6 - j7 < j8) {
            throw new ArrayIndexOutOfBoundsException("length=" + j6 + ", offset=" + j7 + ", count=" + j7);
        }
    }

    /* renamed from: f */
    public static final void m6992f(Closeable closeable) throws IOException {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public static final String[] m6993g(String[] strArr, String value) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[ArraysKt.getLastIndex(strArr2)] = value;
        return strArr2;
    }

    /* renamed from: h */
    public static final int m6994h(String str, char c7, int i6, int i7) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i6 < i7) {
            if (str.charAt(i6) == c7) {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    /* renamed from: i */
    public static final int m6995i(String str, String delimiters, int i6, int i7) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i6 < i7) {
            if (StringsKt.contains$default((CharSequence) delimiters, str.charAt(i6), false, 2, (Object) null)) {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    /* renamed from: j */
    public static /* synthetic */ int m6996j(String str, char c7, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i6 = 0;
        }
        if ((i8 & 4) != 0) {
            i7 = str.length();
        }
        return m6994h(str, c7, i6, i7);
    }

    /* renamed from: k */
    public static final Options m6997k() {
        return f8095b;
    }

    /* renamed from: l */
    public static final boolean m6998l(String[] strArr, String[] strArr2, Comparator comparator) {
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

    /* renamed from: m */
    public static final int m6999m(String[] strArr, String value, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (comparator.compare(strArr[i6], value) == 0) {
                return i6;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public static final int m7000n(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = str.charAt(i6);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0) {
                return i6;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public static final int m7001o(String str, int i6, int i7) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i6 < i7) {
            char cCharAt = str.charAt(i6);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    /* renamed from: p */
    public static /* synthetic */ int m7002p(String str, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = str.length();
        }
        return m7001o(str, i6, i7);
    }

    /* renamed from: q */
    public static final int m7003q(String str, int i6, int i7) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i8 = i7 - 1;
        if (i6 <= i8) {
            while (true) {
                char cCharAt = str.charAt(i8);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i8 + 1;
                }
                if (i8 == i6) {
                    break;
                }
                i8--;
            }
        }
        return i6;
    }

    /* renamed from: r */
    public static /* synthetic */ int m7004r(String str, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = str.length();
        }
        return m7003q(str, i6, i7);
    }

    /* renamed from: s */
    public static final int m7005s(String str, int i6) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i6 < length) {
            char cCharAt = str.charAt(i6);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i6;
            }
            i6++;
        }
        return str.length();
    }

    /* renamed from: t */
    public static final List m7006t(Iterable a7, Iterable b7) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        Iterator it = a7.iterator();
        Iterator it2 = b7.iterator();
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return CollectionsKt.build(listCreateListBuilder);
            }
            if (it.hasNext()) {
                listCreateListBuilder.add(it.next());
            }
            if (it2.hasNext()) {
                listCreateListBuilder.add(it2.next());
            }
        }
    }

    /* renamed from: u */
    public static final String[] m7007u(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i6]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i6++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: v */
    public static final boolean m7008v(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.equals(name, HttpHeaders.AUTHORIZATION, true) || StringsKt.equals(name, "Cookie", true) || StringsKt.equals(name, "Proxy-Authorization", true) || StringsKt.equals(name, "Set-Cookie", true);
    }

    /* renamed from: w */
    public static final int m7009w(char c7) {
        if ('0' <= c7 && c7 < ':') {
            return c7 - '0';
        }
        if ('a' <= c7 && c7 < 'g') {
            return c7 - 'W';
        }
        if ('A' > c7 || c7 >= 'G') {
            return -1;
        }
        return c7 - '7';
    }

    /* renamed from: x */
    public static final int m7010x(BufferedSource bufferedSource) {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        return m6988b(bufferedSource.readByte(), 255) | (m6988b(bufferedSource.readByte(), 255) << 16) | (m6988b(bufferedSource.readByte(), 255) << 8);
    }

    /* renamed from: y */
    public static final int m7011y(Buffer buffer, byte b7) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        int i6 = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b7) {
            i6++;
            buffer.readByte();
        }
        return i6;
    }

    /* renamed from: z */
    public static final long m7012z(String str, long j6) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j6;
        }
    }
}
