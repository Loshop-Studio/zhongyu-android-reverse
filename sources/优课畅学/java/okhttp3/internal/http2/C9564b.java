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
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8797p;
import p147j9.AbstractC9038h;
import p225q9.C9856a;
import p225q9.C9872q;

/* renamed from: okhttp3.internal.http2.b */
/* loaded from: classes5.dex */
public final class C9564b {

    /* renamed from: a */
    public static final C9564b f19120a;

    /* renamed from: b */
    public static final C9856a[] f19121b;

    /* renamed from: c */
    public static final Map f19122c;

    static {
        C9564b c9564b = new C9564b();
        f19120a = c9564b;
        C9856a c9856a = new C9856a(C9856a.f19667j, "");
        ByteString byteString = C9856a.f19664g;
        C9856a c9856a2 = new C9856a(byteString, "GET");
        C9856a c9856a3 = new C9856a(byteString, "POST");
        ByteString byteString2 = C9856a.f19665h;
        C9856a c9856a4 = new C9856a(byteString2, "/");
        C9856a c9856a5 = new C9856a(byteString2, "/index.html");
        ByteString byteString3 = C9856a.f19666i;
        C9856a c9856a6 = new C9856a(byteString3, "http");
        C9856a c9856a7 = new C9856a(byteString3, "https");
        ByteString byteString4 = C9856a.f19663f;
        f19121b = new C9856a[]{c9856a, c9856a2, c9856a3, c9856a4, c9856a5, c9856a6, c9856a7, new C9856a(byteString4, "200"), new C9856a(byteString4, "204"), new C9856a(byteString4, "206"), new C9856a(byteString4, "304"), new C9856a(byteString4, "400"), new C9856a(byteString4, "404"), new C9856a(byteString4, "500"), new C9856a("accept-charset", ""), new C9856a("accept-encoding", "gzip, deflate"), new C9856a("accept-language", ""), new C9856a("accept-ranges", ""), new C9856a("accept", ""), new C9856a("access-control-allow-origin", ""), new C9856a("age", ""), new C9856a("allow", ""), new C9856a("authorization", ""), new C9856a("cache-control", ""), new C9856a("content-disposition", ""), new C9856a("content-encoding", ""), new C9856a("content-language", ""), new C9856a("content-length", ""), new C9856a("content-location", ""), new C9856a("content-range", ""), new C9856a("content-type", ""), new C9856a("cookie", ""), new C9856a("date", ""), new C9856a("etag", ""), new C9856a("expect", ""), new C9856a("expires", ""), new C9856a(TypedValues.TransitionType.S_FROM, ""), new C9856a("host", ""), new C9856a("if-match", ""), new C9856a("if-modified-since", ""), new C9856a("if-none-match", ""), new C9856a("if-range", ""), new C9856a("if-unmodified-since", ""), new C9856a("last-modified", ""), new C9856a("link", ""), new C9856a(RequestParameters.SUBRESOURCE_LOCATION, ""), new C9856a("max-forwards", ""), new C9856a("proxy-authenticate", ""), new C9856a("proxy-authorization", ""), new C9856a("range", ""), new C9856a(RequestParameters.SUBRESOURCE_REFERER, ""), new C9856a("refresh", ""), new C9856a("retry-after", ""), new C9856a("server", ""), new C9856a("set-cookie", ""), new C9856a("strict-transport-security", ""), new C9856a("transfer-encoding", ""), new C9856a("user-agent", ""), new C9856a("vary", ""), new C9856a("via", ""), new C9856a("www-authenticate", "")};
        f19122c = c9564b.m17915d();
    }

    /* renamed from: a */
    public final ByteString m17912a(ByteString name) throws IOException {
        AbstractC9133u.m16133g(name, "name");
        int size = name.size();
        for (int i10 = 0; i10 < size; i10++) {
            byte b10 = name.getByte(i10);
            if (65 <= b10 && b10 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }

    /* renamed from: b */
    public final Map m17913b() {
        return f19122c;
    }

    /* renamed from: c */
    public final C9856a[] m17914c() {
        return f19121b;
    }

    /* renamed from: d */
    public final Map m17915d() {
        C9856a[] c9856aArr = f19121b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c9856aArr.length, 1.0f);
        int length = c9856aArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            C9856a[] c9856aArr2 = f19121b;
            if (!linkedHashMap.containsKey(c9856aArr2[i10].f19668a)) {
                linkedHashMap.put(c9856aArr2[i10].f19668a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC9133u.m16132f(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    /* renamed from: okhttp3.internal.http2.b$a */
    public static final class a {

        /* renamed from: a */
        public final int f19123a;

        /* renamed from: b */
        public int f19124b;

        /* renamed from: c */
        public final List f19125c;

        /* renamed from: d */
        public final BufferedSource f19126d;

        /* renamed from: e */
        public C9856a[] f19127e;

        /* renamed from: f */
        public int f19128f;

        /* renamed from: g */
        public int f19129g;

        /* renamed from: h */
        public int f19130h;

        public a(Source source, int i10, int i11) {
            AbstractC9133u.m16133g(source, "source");
            this.f19123a = i10;
            this.f19124b = i11;
            this.f19125c = new ArrayList();
            this.f19126d = Okio.buffer(source);
            this.f19127e = new C9856a[8];
            this.f19128f = r2.length - 1;
        }

        /* renamed from: a */
        public final void m17916a() {
            int i10 = this.f19124b;
            int i11 = this.f19130h;
            if (i10 < i11) {
                if (i10 == 0) {
                    m17917b();
                } else {
                    m17919d(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        public final void m17917b() {
            AbstractC8797p.m14617G(this.f19127e, null, 0, 0, 6, null);
            this.f19128f = this.f19127e.length - 1;
            this.f19129g = 0;
            this.f19130h = 0;
        }

        /* renamed from: c */
        public final int m17918c(int i10) {
            return this.f19128f + 1 + i10;
        }

        /* renamed from: d */
        public final int m17919d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f19127e.length;
                while (true) {
                    length--;
                    i11 = this.f19128f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C9856a c9856a = this.f19127e[length];
                    AbstractC9133u.m16130d(c9856a);
                    int i13 = c9856a.f19670c;
                    i10 -= i13;
                    this.f19130h -= i13;
                    this.f19129g--;
                    i12++;
                }
                C9856a[] c9856aArr = this.f19127e;
                System.arraycopy(c9856aArr, i11 + 1, c9856aArr, i11 + 1 + i12, this.f19129g);
                this.f19128f += i12;
            }
            return i12;
        }

        /* renamed from: e */
        public final List m17920e() {
            List listM14544U0 = AbstractC8778f0.m14544U0(this.f19125c);
            this.f19125c.clear();
            return listM14544U0;
        }

        /* renamed from: f */
        public final ByteString m17921f(int i10) throws IOException {
            if (m17923h(i10)) {
                return C9564b.f19120a.m17914c()[i10].f19668a;
            }
            int iM17918c = m17918c(i10 - C9564b.f19120a.m17914c().length);
            if (iM17918c >= 0) {
                C9856a[] c9856aArr = this.f19127e;
                if (iM17918c < c9856aArr.length) {
                    C9856a c9856a = c9856aArr[iM17918c];
                    AbstractC9133u.m16130d(c9856a);
                    return c9856a.f19668a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        /* renamed from: g */
        public final void m17922g(int i10, C9856a c9856a) {
            this.f19125c.add(c9856a);
            int i11 = c9856a.f19670c;
            if (i10 != -1) {
                C9856a c9856a2 = this.f19127e[m17918c(i10)];
                AbstractC9133u.m16130d(c9856a2);
                i11 -= c9856a2.f19670c;
            }
            int i12 = this.f19124b;
            if (i11 > i12) {
                m17917b();
                return;
            }
            int iM17919d = m17919d((this.f19130h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f19129g + 1;
                C9856a[] c9856aArr = this.f19127e;
                if (i13 > c9856aArr.length) {
                    C9856a[] c9856aArr2 = new C9856a[c9856aArr.length * 2];
                    System.arraycopy(c9856aArr, 0, c9856aArr2, c9856aArr.length, c9856aArr.length);
                    this.f19128f = this.f19127e.length - 1;
                    this.f19127e = c9856aArr2;
                }
                int i14 = this.f19128f;
                this.f19128f = i14 - 1;
                this.f19127e[i14] = c9856a;
                this.f19129g++;
            } else {
                this.f19127e[i10 + m17918c(i10) + iM17919d] = c9856a;
            }
            this.f19130h += i11;
        }

        /* renamed from: h */
        public final boolean m17923h(int i10) {
            return i10 >= 0 && i10 <= C9564b.f19120a.m17914c().length - 1;
        }

        /* renamed from: i */
        public final int m17924i() {
            return AbstractC9038h.m15746b(this.f19126d.readByte(), 255);
        }

        /* renamed from: j */
        public final ByteString m17925j() {
            int iM17924i = m17924i();
            boolean z10 = (iM17924i & 128) == 128;
            long jM17928m = m17928m(iM17924i, 127);
            if (!z10) {
                return this.f19126d.readByteString(jM17928m);
            }
            Buffer buffer = new Buffer();
            C9872q.f19746a.m18426b(this.f19126d, jM17928m, buffer);
            return buffer.readByteString();
        }

        /* renamed from: k */
        public final void m17926k() throws IOException {
            while (!this.f19126d.exhausted()) {
                int iM15746b = AbstractC9038h.m15746b(this.f19126d.readByte(), 255);
                if (iM15746b == 128) {
                    throw new IOException("index == 0");
                }
                if ((iM15746b & 128) == 128) {
                    m17927l(m17928m(iM15746b, 127) - 1);
                } else if (iM15746b == 64) {
                    m17930o();
                } else if ((iM15746b & 64) == 64) {
                    m17929n(m17928m(iM15746b, 63) - 1);
                } else if ((iM15746b & 32) == 32) {
                    int iM17928m = m17928m(iM15746b, 31);
                    this.f19124b = iM17928m;
                    if (iM17928m < 0 || iM17928m > this.f19123a) {
                        throw new IOException("Invalid dynamic table size update " + this.f19124b);
                    }
                    m17916a();
                } else if (iM15746b == 16 || iM15746b == 0) {
                    m17932q();
                } else {
                    m17931p(m17928m(iM15746b, 15) - 1);
                }
            }
        }

        /* renamed from: l */
        public final void m17927l(int i10) throws IOException {
            if (m17923h(i10)) {
                this.f19125c.add(C9564b.f19120a.m17914c()[i10]);
                return;
            }
            int iM17918c = m17918c(i10 - C9564b.f19120a.m17914c().length);
            if (iM17918c >= 0) {
                C9856a[] c9856aArr = this.f19127e;
                if (iM17918c < c9856aArr.length) {
                    List list = this.f19125c;
                    C9856a c9856a = c9856aArr[iM17918c];
                    AbstractC9133u.m16130d(c9856a);
                    list.add(c9856a);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        /* renamed from: m */
        public final int m17928m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iM17924i = m17924i();
                if ((iM17924i & 128) == 0) {
                    return i11 + (iM17924i << i13);
                }
                i11 += (iM17924i & 127) << i13;
                i13 += 7;
            }
        }

        /* renamed from: n */
        public final void m17929n(int i10) {
            m17922g(-1, new C9856a(m17921f(i10), m17925j()));
        }

        /* renamed from: o */
        public final void m17930o() {
            m17922g(-1, new C9856a(C9564b.f19120a.m17912a(m17925j()), m17925j()));
        }

        /* renamed from: p */
        public final void m17931p(int i10) throws IOException {
            this.f19125c.add(new C9856a(m17921f(i10), m17925j()));
        }

        /* renamed from: q */
        public final void m17932q() throws IOException {
            this.f19125c.add(new C9856a(C9564b.f19120a.m17912a(m17925j()), m17925j()));
        }

        public /* synthetic */ a(Source source, int i10, int i11, int i12, AbstractC9126n abstractC9126n) {
            this(source, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    /* renamed from: okhttp3.internal.http2.b$b */
    public static final class b {

        /* renamed from: a */
        public int f19131a;

        /* renamed from: b */
        public final boolean f19132b;

        /* renamed from: c */
        public final Buffer f19133c;

        /* renamed from: d */
        public int f19134d;

        /* renamed from: e */
        public boolean f19135e;

        /* renamed from: f */
        public int f19136f;

        /* renamed from: g */
        public C9856a[] f19137g;

        /* renamed from: h */
        public int f19138h;

        /* renamed from: i */
        public int f19139i;

        /* renamed from: j */
        public int f19140j;

        public b(int i10, boolean z10, Buffer out) {
            AbstractC9133u.m16133g(out, "out");
            this.f19131a = i10;
            this.f19132b = z10;
            this.f19133c = out;
            this.f19134d = Integer.MAX_VALUE;
            this.f19136f = i10;
            this.f19137g = new C9856a[8];
            this.f19138h = r2.length - 1;
        }

        /* renamed from: a */
        public final void m17933a() {
            int i10 = this.f19136f;
            int i11 = this.f19140j;
            if (i10 < i11) {
                if (i10 == 0) {
                    m17934b();
                } else {
                    m17935c(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        public final void m17934b() {
            AbstractC8797p.m14617G(this.f19137g, null, 0, 0, 6, null);
            this.f19138h = this.f19137g.length - 1;
            this.f19139i = 0;
            this.f19140j = 0;
        }

        /* renamed from: c */
        public final int m17935c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f19137g.length;
                while (true) {
                    length--;
                    i11 = this.f19138h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C9856a c9856a = this.f19137g[length];
                    AbstractC9133u.m16130d(c9856a);
                    i10 -= c9856a.f19670c;
                    int i13 = this.f19140j;
                    C9856a c9856a2 = this.f19137g[length];
                    AbstractC9133u.m16130d(c9856a2);
                    this.f19140j = i13 - c9856a2.f19670c;
                    this.f19139i--;
                    i12++;
                }
                C9856a[] c9856aArr = this.f19137g;
                System.arraycopy(c9856aArr, i11 + 1, c9856aArr, i11 + 1 + i12, this.f19139i);
                C9856a[] c9856aArr2 = this.f19137g;
                int i14 = this.f19138h;
                Arrays.fill(c9856aArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f19138h += i12;
            }
            return i12;
        }

        /* renamed from: d */
        public final void m17936d(C9856a c9856a) {
            int i10 = c9856a.f19670c;
            int i11 = this.f19136f;
            if (i10 > i11) {
                m17934b();
                return;
            }
            m17935c((this.f19140j + i10) - i11);
            int i12 = this.f19139i + 1;
            C9856a[] c9856aArr = this.f19137g;
            if (i12 > c9856aArr.length) {
                C9856a[] c9856aArr2 = new C9856a[c9856aArr.length * 2];
                System.arraycopy(c9856aArr, 0, c9856aArr2, c9856aArr.length, c9856aArr.length);
                this.f19138h = this.f19137g.length - 1;
                this.f19137g = c9856aArr2;
            }
            int i13 = this.f19138h;
            this.f19138h = i13 - 1;
            this.f19137g[i13] = c9856a;
            this.f19139i++;
            this.f19140j += i10;
        }

        /* renamed from: e */
        public final void m17937e(int i10) {
            this.f19131a = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f19136f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f19134d = Math.min(this.f19134d, iMin);
            }
            this.f19135e = true;
            this.f19136f = iMin;
            m17933a();
        }

        /* renamed from: f */
        public final void m17938f(ByteString data) {
            AbstractC9133u.m16133g(data, "data");
            if (this.f19132b) {
                C9872q c9872q = C9872q.f19746a;
                if (c9872q.m18428d(data) < data.size()) {
                    Buffer buffer = new Buffer();
                    c9872q.m18427c(data, buffer);
                    ByteString byteString = buffer.readByteString();
                    m17940h(byteString.size(), 127, 128);
                    this.f19133c.write(byteString);
                    return;
                }
            }
            m17940h(data.size(), 127, 0);
            this.f19133c.write(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m17939g(java.util.List r13) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C9564b.b.m17939g(java.util.List):void");
        }

        /* renamed from: h */
        public final void m17940h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f19133c.writeByte(i10 | i12);
                return;
            }
            this.f19133c.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f19133c.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f19133c.writeByte(i13);
        }

        public /* synthetic */ b(int i10, boolean z10, Buffer buffer, int i11, AbstractC9126n abstractC9126n) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, buffer);
        }
    }
}
