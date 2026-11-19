package okhttp3.internal.http2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import p065g5.AbstractC6424h;
import p116n5.C7467a;
import p116n5.C7483q;

/* renamed from: okhttp3.internal.http2.b */
/* loaded from: classes4.dex */
public final class C7530b {

    /* renamed from: a */
    public static final C7530b f9898a;

    /* renamed from: b */
    public static final C7467a[] f9899b;

    /* renamed from: c */
    public static final Map f9900c;

    static {
        C7530b c7530b = new C7530b();
        f9898a = c7530b;
        C7467a c7467a = new C7467a(C7467a.f9573j, "");
        ByteString byteString = C7467a.f9570g;
        C7467a c7467a2 = new C7467a(byteString, "GET");
        C7467a c7467a3 = new C7467a(byteString, "POST");
        ByteString byteString2 = C7467a.f9571h;
        C7467a c7467a4 = new C7467a(byteString2, "/");
        C7467a c7467a5 = new C7467a(byteString2, "/index.html");
        ByteString byteString3 = C7467a.f9572i;
        C7467a c7467a6 = new C7467a(byteString3, "http");
        C7467a c7467a7 = new C7467a(byteString3, "https");
        ByteString byteString4 = C7467a.f9569f;
        f9899b = new C7467a[]{c7467a, c7467a2, c7467a3, c7467a4, c7467a5, c7467a6, c7467a7, new C7467a(byteString4, "200"), new C7467a(byteString4, "204"), new C7467a(byteString4, "206"), new C7467a(byteString4, "304"), new C7467a(byteString4, "400"), new C7467a(byteString4, "404"), new C7467a(byteString4, "500"), new C7467a("accept-charset", ""), new C7467a("accept-encoding", "gzip, deflate"), new C7467a("accept-language", ""), new C7467a("accept-ranges", ""), new C7467a("accept", ""), new C7467a("access-control-allow-origin", ""), new C7467a("age", ""), new C7467a("allow", ""), new C7467a("authorization", ""), new C7467a("cache-control", ""), new C7467a("content-disposition", ""), new C7467a("content-encoding", ""), new C7467a("content-language", ""), new C7467a("content-length", ""), new C7467a("content-location", ""), new C7467a("content-range", ""), new C7467a("content-type", ""), new C7467a("cookie", ""), new C7467a("date", ""), new C7467a("etag", ""), new C7467a("expect", ""), new C7467a("expires", ""), new C7467a(TypedValues.TransitionType.S_FROM, ""), new C7467a("host", ""), new C7467a("if-match", ""), new C7467a("if-modified-since", ""), new C7467a("if-none-match", ""), new C7467a("if-range", ""), new C7467a("if-unmodified-since", ""), new C7467a("last-modified", ""), new C7467a("link", ""), new C7467a(RequestParameters.SUBRESOURCE_LOCATION, ""), new C7467a("max-forwards", ""), new C7467a("proxy-authenticate", ""), new C7467a("proxy-authorization", ""), new C7467a("range", ""), new C7467a(RequestParameters.SUBRESOURCE_REFERER, ""), new C7467a("refresh", ""), new C7467a("retry-after", ""), new C7467a("server", ""), new C7467a("set-cookie", ""), new C7467a("strict-transport-security", ""), new C7467a("transfer-encoding", ""), new C7467a("user-agent", ""), new C7467a("vary", ""), new C7467a("via", ""), new C7467a("www-authenticate", "")};
        f9900c = c7530b.m8734d();
    }

    /* renamed from: a */
    public final ByteString m8731a(ByteString name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = name.size();
        for (int i6 = 0; i6 < size; i6++) {
            byte b7 = name.getByte(i6);
            if (65 <= b7 && b7 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }

    /* renamed from: b */
    public final Map m8732b() {
        return f9900c;
    }

    /* renamed from: c */
    public final C7467a[] m8733c() {
        return f9899b;
    }

    /* renamed from: d */
    public final Map m8734d() {
        C7467a[] c7467aArr = f9899b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c7467aArr.length, 1.0f);
        int length = c7467aArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            C7467a[] c7467aArr2 = f9899b;
            if (!linkedHashMap.containsKey(c7467aArr2[i6].f9574a)) {
                linkedHashMap.put(c7467aArr2[i6].f9574a, Integer.valueOf(i6));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    /* renamed from: okhttp3.internal.http2.b$a */
    public static final class a {

        /* renamed from: a */
        public final int f9901a;

        /* renamed from: b */
        public int f9902b;

        /* renamed from: c */
        public final List f9903c;

        /* renamed from: d */
        public final BufferedSource f9904d;

        /* renamed from: e */
        public C7467a[] f9905e;

        /* renamed from: f */
        public int f9906f;

        /* renamed from: g */
        public int f9907g;

        /* renamed from: h */
        public int f9908h;

        public a(Source source, int i6, int i7) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f9901a = i6;
            this.f9902b = i7;
            this.f9903c = new ArrayList();
            this.f9904d = Okio.buffer(source);
            this.f9905e = new C7467a[8];
            this.f9906f = r2.length - 1;
        }

        /* renamed from: a */
        public final void m8735a() {
            int i6 = this.f9902b;
            int i7 = this.f9908h;
            if (i6 < i7) {
                if (i6 == 0) {
                    m8736b();
                } else {
                    m8738d(i7 - i6);
                }
            }
        }

        /* renamed from: b */
        public final void m8736b() {
            ArraysKt.fill$default(this.f9905e, (Object) null, 0, 0, 6, (Object) null);
            this.f9906f = this.f9905e.length - 1;
            this.f9907g = 0;
            this.f9908h = 0;
        }

        /* renamed from: c */
        public final int m8737c(int i6) {
            return this.f9906f + 1 + i6;
        }

        /* renamed from: d */
        public final int m8738d(int i6) {
            int i7;
            int i8 = 0;
            if (i6 > 0) {
                int length = this.f9905e.length;
                while (true) {
                    length--;
                    i7 = this.f9906f;
                    if (length < i7 || i6 <= 0) {
                        break;
                    }
                    C7467a c7467a = this.f9905e[length];
                    Intrinsics.checkNotNull(c7467a);
                    int i9 = c7467a.f9576c;
                    i6 -= i9;
                    this.f9908h -= i9;
                    this.f9907g--;
                    i8++;
                }
                C7467a[] c7467aArr = this.f9905e;
                System.arraycopy(c7467aArr, i7 + 1, c7467aArr, i7 + 1 + i8, this.f9907g);
                this.f9906f += i8;
            }
            return i8;
        }

        /* renamed from: e */
        public final List m8739e() {
            List list = CollectionsKt.toList(this.f9903c);
            this.f9903c.clear();
            return list;
        }

        /* renamed from: f */
        public final ByteString m8740f(int i6) throws IOException {
            if (m8742h(i6)) {
                return C7530b.f9898a.m8733c()[i6].f9574a;
            }
            int iM8737c = m8737c(i6 - C7530b.f9898a.m8733c().length);
            if (iM8737c >= 0) {
                C7467a[] c7467aArr = this.f9905e;
                if (iM8737c < c7467aArr.length) {
                    C7467a c7467a = c7467aArr[iM8737c];
                    Intrinsics.checkNotNull(c7467a);
                    return c7467a.f9574a;
                }
            }
            throw new IOException("Header index too large " + (i6 + 1));
        }

        /* renamed from: g */
        public final void m8741g(int i6, C7467a c7467a) {
            this.f9903c.add(c7467a);
            int i7 = c7467a.f9576c;
            if (i6 != -1) {
                C7467a c7467a2 = this.f9905e[m8737c(i6)];
                Intrinsics.checkNotNull(c7467a2);
                i7 -= c7467a2.f9576c;
            }
            int i8 = this.f9902b;
            if (i7 > i8) {
                m8736b();
                return;
            }
            int iM8738d = m8738d((this.f9908h + i7) - i8);
            if (i6 == -1) {
                int i9 = this.f9907g + 1;
                C7467a[] c7467aArr = this.f9905e;
                if (i9 > c7467aArr.length) {
                    C7467a[] c7467aArr2 = new C7467a[c7467aArr.length * 2];
                    System.arraycopy(c7467aArr, 0, c7467aArr2, c7467aArr.length, c7467aArr.length);
                    this.f9906f = this.f9905e.length - 1;
                    this.f9905e = c7467aArr2;
                }
                int i10 = this.f9906f;
                this.f9906f = i10 - 1;
                this.f9905e[i10] = c7467a;
                this.f9907g++;
            } else {
                this.f9905e[i6 + m8737c(i6) + iM8738d] = c7467a;
            }
            this.f9908h += i7;
        }

        /* renamed from: h */
        public final boolean m8742h(int i6) {
            return i6 >= 0 && i6 <= C7530b.f9898a.m8733c().length - 1;
        }

        /* renamed from: i */
        public final int m8743i() {
            return AbstractC6424h.m6988b(this.f9904d.readByte(), 255);
        }

        /* renamed from: j */
        public final ByteString m8744j() {
            int iM8743i = m8743i();
            boolean z6 = (iM8743i & 128) == 128;
            long jM8747m = m8747m(iM8743i, 127);
            if (!z6) {
                return this.f9904d.readByteString(jM8747m);
            }
            Buffer buffer = new Buffer();
            C7483q.f9652a.m8593b(this.f9904d, jM8747m, buffer);
            return buffer.readByteString();
        }

        /* renamed from: k */
        public final void m8745k() throws IOException {
            while (!this.f9904d.exhausted()) {
                int iM6988b = AbstractC6424h.m6988b(this.f9904d.readByte(), 255);
                if (iM6988b == 128) {
                    throw new IOException("index == 0");
                }
                if ((iM6988b & 128) == 128) {
                    m8746l(m8747m(iM6988b, 127) - 1);
                } else if (iM6988b == 64) {
                    m8749o();
                } else if ((iM6988b & 64) == 64) {
                    m8748n(m8747m(iM6988b, 63) - 1);
                } else if ((iM6988b & 32) == 32) {
                    int iM8747m = m8747m(iM6988b, 31);
                    this.f9902b = iM8747m;
                    if (iM8747m < 0 || iM8747m > this.f9901a) {
                        throw new IOException("Invalid dynamic table size update " + this.f9902b);
                    }
                    m8735a();
                } else if (iM6988b == 16 || iM6988b == 0) {
                    m8751q();
                } else {
                    m8750p(m8747m(iM6988b, 15) - 1);
                }
            }
        }

        /* renamed from: l */
        public final void m8746l(int i6) throws IOException {
            if (m8742h(i6)) {
                this.f9903c.add(C7530b.f9898a.m8733c()[i6]);
                return;
            }
            int iM8737c = m8737c(i6 - C7530b.f9898a.m8733c().length);
            if (iM8737c >= 0) {
                C7467a[] c7467aArr = this.f9905e;
                if (iM8737c < c7467aArr.length) {
                    List list = this.f9903c;
                    C7467a c7467a = c7467aArr[iM8737c];
                    Intrinsics.checkNotNull(c7467a);
                    list.add(c7467a);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i6 + 1));
        }

        /* renamed from: m */
        public final int m8747m(int i6, int i7) {
            int i8 = i6 & i7;
            if (i8 < i7) {
                return i8;
            }
            int i9 = 0;
            while (true) {
                int iM8743i = m8743i();
                if ((iM8743i & 128) == 0) {
                    return i7 + (iM8743i << i9);
                }
                i7 += (iM8743i & 127) << i9;
                i9 += 7;
            }
        }

        /* renamed from: n */
        public final void m8748n(int i6) {
            m8741g(-1, new C7467a(m8740f(i6), m8744j()));
        }

        /* renamed from: o */
        public final void m8749o() {
            m8741g(-1, new C7467a(C7530b.f9898a.m8731a(m8744j()), m8744j()));
        }

        /* renamed from: p */
        public final void m8750p(int i6) throws IOException {
            this.f9903c.add(new C7467a(m8740f(i6), m8744j()));
        }

        /* renamed from: q */
        public final void m8751q() throws IOException {
            this.f9903c.add(new C7467a(C7530b.f9898a.m8731a(m8744j()), m8744j()));
        }

        public /* synthetic */ a(Source source, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
            this(source, i6, (i8 & 4) != 0 ? i6 : i7);
        }
    }

    /* renamed from: okhttp3.internal.http2.b$b */
    public static final class b {

        /* renamed from: a */
        public int f9909a;

        /* renamed from: b */
        public final boolean f9910b;

        /* renamed from: c */
        public final Buffer f9911c;

        /* renamed from: d */
        public int f9912d;

        /* renamed from: e */
        public boolean f9913e;

        /* renamed from: f */
        public int f9914f;

        /* renamed from: g */
        public C7467a[] f9915g;

        /* renamed from: h */
        public int f9916h;

        /* renamed from: i */
        public int f9917i;

        /* renamed from: j */
        public int f9918j;

        public b(int i6, boolean z6, Buffer out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f9909a = i6;
            this.f9910b = z6;
            this.f9911c = out;
            this.f9912d = Integer.MAX_VALUE;
            this.f9914f = i6;
            this.f9915g = new C7467a[8];
            this.f9916h = r2.length - 1;
        }

        /* renamed from: a */
        public final void m8752a() {
            int i6 = this.f9914f;
            int i7 = this.f9918j;
            if (i6 < i7) {
                if (i6 == 0) {
                    m8753b();
                } else {
                    m8754c(i7 - i6);
                }
            }
        }

        /* renamed from: b */
        public final void m8753b() {
            ArraysKt.fill$default(this.f9915g, (Object) null, 0, 0, 6, (Object) null);
            this.f9916h = this.f9915g.length - 1;
            this.f9917i = 0;
            this.f9918j = 0;
        }

        /* renamed from: c */
        public final int m8754c(int i6) {
            int i7;
            int i8 = 0;
            if (i6 > 0) {
                int length = this.f9915g.length;
                while (true) {
                    length--;
                    i7 = this.f9916h;
                    if (length < i7 || i6 <= 0) {
                        break;
                    }
                    C7467a c7467a = this.f9915g[length];
                    Intrinsics.checkNotNull(c7467a);
                    i6 -= c7467a.f9576c;
                    int i9 = this.f9918j;
                    C7467a c7467a2 = this.f9915g[length];
                    Intrinsics.checkNotNull(c7467a2);
                    this.f9918j = i9 - c7467a2.f9576c;
                    this.f9917i--;
                    i8++;
                }
                C7467a[] c7467aArr = this.f9915g;
                System.arraycopy(c7467aArr, i7 + 1, c7467aArr, i7 + 1 + i8, this.f9917i);
                C7467a[] c7467aArr2 = this.f9915g;
                int i10 = this.f9916h;
                Arrays.fill(c7467aArr2, i10 + 1, i10 + 1 + i8, (Object) null);
                this.f9916h += i8;
            }
            return i8;
        }

        /* renamed from: d */
        public final void m8755d(C7467a c7467a) {
            int i6 = c7467a.f9576c;
            int i7 = this.f9914f;
            if (i6 > i7) {
                m8753b();
                return;
            }
            m8754c((this.f9918j + i6) - i7);
            int i8 = this.f9917i + 1;
            C7467a[] c7467aArr = this.f9915g;
            if (i8 > c7467aArr.length) {
                C7467a[] c7467aArr2 = new C7467a[c7467aArr.length * 2];
                System.arraycopy(c7467aArr, 0, c7467aArr2, c7467aArr.length, c7467aArr.length);
                this.f9916h = this.f9915g.length - 1;
                this.f9915g = c7467aArr2;
            }
            int i9 = this.f9916h;
            this.f9916h = i9 - 1;
            this.f9915g[i9] = c7467a;
            this.f9917i++;
            this.f9918j += i6;
        }

        /* renamed from: e */
        public final void m8756e(int i6) {
            this.f9909a = i6;
            int iMin = Math.min(i6, 16384);
            int i7 = this.f9914f;
            if (i7 == iMin) {
                return;
            }
            if (iMin < i7) {
                this.f9912d = Math.min(this.f9912d, iMin);
            }
            this.f9913e = true;
            this.f9914f = iMin;
            m8752a();
        }

        /* renamed from: f */
        public final void m8757f(ByteString data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.f9910b) {
                C7483q c7483q = C7483q.f9652a;
                if (c7483q.m8595d(data) < data.size()) {
                    Buffer buffer = new Buffer();
                    c7483q.m8594c(data, buffer);
                    ByteString byteString = buffer.readByteString();
                    m8759h(byteString.size(), 127, 128);
                    this.f9911c.write(byteString);
                    return;
                }
            }
            m8759h(data.size(), 127, 0);
            this.f9911c.write(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m8758g(java.util.List r13) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C7530b.b.m8758g(java.util.List):void");
        }

        /* renamed from: h */
        public final void m8759h(int i6, int i7, int i8) {
            if (i6 < i7) {
                this.f9911c.writeByte(i6 | i8);
                return;
            }
            this.f9911c.writeByte(i8 | i7);
            int i9 = i6 - i7;
            while (i9 >= 128) {
                this.f9911c.writeByte(128 | (i9 & 127));
                i9 >>>= 7;
            }
            this.f9911c.writeByte(i9);
        }

        public /* synthetic */ b(int i6, boolean z6, Buffer buffer, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? 4096 : i6, (i7 & 2) != 0 ? true : z6, buffer);
        }
    }
}
