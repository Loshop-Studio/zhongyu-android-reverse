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
import p028b9.AbstractC5070d;
import p125i9.C7716a;
import p125i9.C7720e;

/* renamed from: okhttp3.internal.http2.a */
/* loaded from: classes5.dex */
public final class C8740a {

    /* renamed from: a */
    public static final C8740a f14731a;

    /* renamed from: b */
    public static final C7716a[] f14732b;

    /* renamed from: c */
    public static final Map f14733c;

    static {
        C8740a c8740a = new C8740a();
        f14731a = c8740a;
        C7716a c7716a = new C7716a(C7716a.f13095j, "");
        ByteString byteString = C7716a.f13092g;
        C7716a c7716a2 = new C7716a(byteString, "GET");
        C7716a c7716a3 = new C7716a(byteString, "POST");
        ByteString byteString2 = C7716a.f13093h;
        C7716a c7716a4 = new C7716a(byteString2, "/");
        C7716a c7716a5 = new C7716a(byteString2, "/index.html");
        ByteString byteString3 = C7716a.f13094i;
        C7716a c7716a6 = new C7716a(byteString3, "http");
        C7716a c7716a7 = new C7716a(byteString3, "https");
        ByteString byteString4 = C7716a.f13091f;
        f14732b = new C7716a[]{c7716a, c7716a2, c7716a3, c7716a4, c7716a5, c7716a6, c7716a7, new C7716a(byteString4, "200"), new C7716a(byteString4, "204"), new C7716a(byteString4, "206"), new C7716a(byteString4, "304"), new C7716a(byteString4, "400"), new C7716a(byteString4, "404"), new C7716a(byteString4, "500"), new C7716a("accept-charset", ""), new C7716a("accept-encoding", "gzip, deflate"), new C7716a("accept-language", ""), new C7716a("accept-ranges", ""), new C7716a("accept", ""), new C7716a("access-control-allow-origin", ""), new C7716a("age", ""), new C7716a("allow", ""), new C7716a("authorization", ""), new C7716a("cache-control", ""), new C7716a("content-disposition", ""), new C7716a("content-encoding", ""), new C7716a("content-language", ""), new C7716a("content-length", ""), new C7716a("content-location", ""), new C7716a("content-range", ""), new C7716a("content-type", ""), new C7716a("cookie", ""), new C7716a("date", ""), new C7716a("etag", ""), new C7716a("expect", ""), new C7716a("expires", ""), new C7716a(TypedValues.TransitionType.S_FROM, ""), new C7716a("host", ""), new C7716a("if-match", ""), new C7716a("if-modified-since", ""), new C7716a("if-none-match", ""), new C7716a("if-range", ""), new C7716a("if-unmodified-since", ""), new C7716a("last-modified", ""), new C7716a("link", ""), new C7716a(RequestParameters.SUBRESOURCE_LOCATION, ""), new C7716a("max-forwards", ""), new C7716a("proxy-authenticate", ""), new C7716a("proxy-authorization", ""), new C7716a("range", ""), new C7716a(RequestParameters.SUBRESOURCE_REFERER, ""), new C7716a("refresh", ""), new C7716a("retry-after", ""), new C7716a("server", ""), new C7716a("set-cookie", ""), new C7716a("strict-transport-security", ""), new C7716a("transfer-encoding", ""), new C7716a("user-agent", ""), new C7716a("vary", ""), new C7716a("via", ""), new C7716a("www-authenticate", "")};
        f14733c = c8740a.m14465d();
    }

    /* renamed from: a */
    public final ByteString m14462a(ByteString name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
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
    public final Map m14463b() {
        return f14733c;
    }

    /* renamed from: c */
    public final C7716a[] m14464c() {
        return f14732b;
    }

    /* renamed from: d */
    public final Map m14465d() {
        C7716a[] c7716aArr = f14732b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c7716aArr.length);
        int length = c7716aArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            C7716a[] c7716aArr2 = f14732b;
            if (!linkedHashMap.containsKey(c7716aArr2[i10].f13096a)) {
                linkedHashMap.put(c7716aArr2[i10].f13096a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    /* renamed from: okhttp3.internal.http2.a$a */
    public static final class a {

        /* renamed from: a */
        public final int f14734a;

        /* renamed from: b */
        public int f14735b;

        /* renamed from: c */
        public final List f14736c;

        /* renamed from: d */
        public final BufferedSource f14737d;

        /* renamed from: e */
        public C7716a[] f14738e;

        /* renamed from: f */
        public int f14739f;

        /* renamed from: g */
        public int f14740g;

        /* renamed from: h */
        public int f14741h;

        public a(Source source, int i10, int i11) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f14734a = i10;
            this.f14735b = i11;
            this.f14736c = new ArrayList();
            this.f14737d = Okio.buffer(source);
            this.f14738e = new C7716a[8];
            this.f14739f = r2.length - 1;
        }

        /* renamed from: a */
        public final void m14466a() {
            int i10 = this.f14735b;
            int i11 = this.f14741h;
            if (i10 < i11) {
                if (i10 == 0) {
                    m14467b();
                } else {
                    m14469d(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        public final void m14467b() {
            ArraysKt.fill$default(this.f14738e, (Object) null, 0, 0, 6, (Object) null);
            this.f14739f = this.f14738e.length - 1;
            this.f14740g = 0;
            this.f14741h = 0;
        }

        /* renamed from: c */
        public final int m14468c(int i10) {
            return this.f14739f + 1 + i10;
        }

        /* renamed from: d */
        public final int m14469d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f14738e.length;
                while (true) {
                    length--;
                    i11 = this.f14739f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C7716a c7716a = this.f14738e[length];
                    Intrinsics.checkNotNull(c7716a);
                    int i13 = c7716a.f13098c;
                    i10 -= i13;
                    this.f14741h -= i13;
                    this.f14740g--;
                    i12++;
                }
                C7716a[] c7716aArr = this.f14738e;
                System.arraycopy(c7716aArr, i11 + 1, c7716aArr, i11 + 1 + i12, this.f14740g);
                this.f14739f += i12;
            }
            return i12;
        }

        /* renamed from: e */
        public final List m14470e() {
            List list = CollectionsKt.toList(this.f14736c);
            this.f14736c.clear();
            return list;
        }

        /* renamed from: f */
        public final ByteString m14471f(int i10) throws IOException {
            if (m14473h(i10)) {
                return C8740a.f14731a.m14464c()[i10].f13096a;
            }
            int iM14468c = m14468c(i10 - C8740a.f14731a.m14464c().length);
            if (iM14468c >= 0) {
                C7716a[] c7716aArr = this.f14738e;
                if (iM14468c < c7716aArr.length) {
                    C7716a c7716a = c7716aArr[iM14468c];
                    Intrinsics.checkNotNull(c7716a);
                    return c7716a.f13096a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        /* renamed from: g */
        public final void m14472g(int i10, C7716a c7716a) {
            this.f14736c.add(c7716a);
            int i11 = c7716a.f13098c;
            if (i10 != -1) {
                C7716a c7716a2 = this.f14738e[m14468c(i10)];
                Intrinsics.checkNotNull(c7716a2);
                i11 -= c7716a2.f13098c;
            }
            int i12 = this.f14735b;
            if (i11 > i12) {
                m14467b();
                return;
            }
            int iM14469d = m14469d((this.f14741h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f14740g + 1;
                C7716a[] c7716aArr = this.f14738e;
                if (i13 > c7716aArr.length) {
                    C7716a[] c7716aArr2 = new C7716a[c7716aArr.length * 2];
                    System.arraycopy(c7716aArr, 0, c7716aArr2, c7716aArr.length, c7716aArr.length);
                    this.f14739f = this.f14738e.length - 1;
                    this.f14738e = c7716aArr2;
                }
                int i14 = this.f14739f;
                this.f14739f = i14 - 1;
                this.f14738e[i14] = c7716a;
                this.f14740g++;
            } else {
                this.f14738e[i10 + m14468c(i10) + iM14469d] = c7716a;
            }
            this.f14741h += i11;
        }

        /* renamed from: h */
        public final boolean m14473h(int i10) {
            return i10 >= 0 && i10 <= C8740a.f14731a.m14464c().length - 1;
        }

        /* renamed from: i */
        public final int m14474i() {
            return AbstractC5070d.m2639d(this.f14737d.readByte(), 255);
        }

        /* renamed from: j */
        public final ByteString m14475j() throws IOException {
            int iM14474i = m14474i();
            boolean z9 = (iM14474i & 128) == 128;
            long jM14478m = m14478m(iM14474i, 127);
            if (!z9) {
                return this.f14737d.readByteString(jM14478m);
            }
            Buffer buffer = new Buffer();
            C7720e.f13141a.m12942b(this.f14737d, jM14478m, buffer);
            return buffer.readByteString();
        }

        /* renamed from: k */
        public final void m14476k() throws IOException {
            while (!this.f14737d.exhausted()) {
                int iM2639d = AbstractC5070d.m2639d(this.f14737d.readByte(), 255);
                if (iM2639d == 128) {
                    throw new IOException("index == 0");
                }
                if ((iM2639d & 128) == 128) {
                    m14477l(m14478m(iM2639d, 127) - 1);
                } else if (iM2639d == 64) {
                    m14480o();
                } else if ((iM2639d & 64) == 64) {
                    m14479n(m14478m(iM2639d, 63) - 1);
                } else if ((iM2639d & 32) == 32) {
                    int iM14478m = m14478m(iM2639d, 31);
                    this.f14735b = iM14478m;
                    if (iM14478m < 0 || iM14478m > this.f14734a) {
                        throw new IOException("Invalid dynamic table size update " + this.f14735b);
                    }
                    m14466a();
                } else if (iM2639d == 16 || iM2639d == 0) {
                    m14482q();
                } else {
                    m14481p(m14478m(iM2639d, 15) - 1);
                }
            }
        }

        /* renamed from: l */
        public final void m14477l(int i10) throws IOException {
            if (m14473h(i10)) {
                this.f14736c.add(C8740a.f14731a.m14464c()[i10]);
                return;
            }
            int iM14468c = m14468c(i10 - C8740a.f14731a.m14464c().length);
            if (iM14468c >= 0) {
                C7716a[] c7716aArr = this.f14738e;
                if (iM14468c < c7716aArr.length) {
                    List list = this.f14736c;
                    C7716a c7716a = c7716aArr[iM14468c];
                    Intrinsics.checkNotNull(c7716a);
                    list.add(c7716a);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        /* renamed from: m */
        public final int m14478m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iM14474i = m14474i();
                if ((iM14474i & 128) == 0) {
                    return i11 + (iM14474i << i13);
                }
                i11 += (iM14474i & 127) << i13;
                i13 += 7;
            }
        }

        /* renamed from: n */
        public final void m14479n(int i10) {
            m14472g(-1, new C7716a(m14471f(i10), m14475j()));
        }

        /* renamed from: o */
        public final void m14480o() {
            m14472g(-1, new C7716a(C8740a.f14731a.m14462a(m14475j()), m14475j()));
        }

        /* renamed from: p */
        public final void m14481p(int i10) throws IOException {
            this.f14736c.add(new C7716a(m14471f(i10), m14475j()));
        }

        /* renamed from: q */
        public final void m14482q() throws IOException {
            this.f14736c.add(new C7716a(C8740a.f14731a.m14462a(m14475j()), m14475j()));
        }

        public /* synthetic */ a(Source source, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(source, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    /* renamed from: okhttp3.internal.http2.a$b */
    public static final class b {

        /* renamed from: a */
        public int f14742a;

        /* renamed from: b */
        public final boolean f14743b;

        /* renamed from: c */
        public final Buffer f14744c;

        /* renamed from: d */
        public int f14745d;

        /* renamed from: e */
        public boolean f14746e;

        /* renamed from: f */
        public int f14747f;

        /* renamed from: g */
        public C7716a[] f14748g;

        /* renamed from: h */
        public int f14749h;

        /* renamed from: i */
        public int f14750i;

        /* renamed from: j */
        public int f14751j;

        public b(int i10, boolean z9, Buffer out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f14742a = i10;
            this.f14743b = z9;
            this.f14744c = out;
            this.f14745d = Integer.MAX_VALUE;
            this.f14747f = i10;
            this.f14748g = new C7716a[8];
            this.f14749h = r2.length - 1;
        }

        /* renamed from: a */
        public final void m14483a() {
            int i10 = this.f14747f;
            int i11 = this.f14751j;
            if (i10 < i11) {
                if (i10 == 0) {
                    m14484b();
                } else {
                    m14485c(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        public final void m14484b() {
            ArraysKt.fill$default(this.f14748g, (Object) null, 0, 0, 6, (Object) null);
            this.f14749h = this.f14748g.length - 1;
            this.f14750i = 0;
            this.f14751j = 0;
        }

        /* renamed from: c */
        public final int m14485c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f14748g.length;
                while (true) {
                    length--;
                    i11 = this.f14749h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C7716a c7716a = this.f14748g[length];
                    Intrinsics.checkNotNull(c7716a);
                    i10 -= c7716a.f13098c;
                    int i13 = this.f14751j;
                    C7716a c7716a2 = this.f14748g[length];
                    Intrinsics.checkNotNull(c7716a2);
                    this.f14751j = i13 - c7716a2.f13098c;
                    this.f14750i--;
                    i12++;
                }
                C7716a[] c7716aArr = this.f14748g;
                System.arraycopy(c7716aArr, i11 + 1, c7716aArr, i11 + 1 + i12, this.f14750i);
                C7716a[] c7716aArr2 = this.f14748g;
                int i14 = this.f14749h;
                Arrays.fill(c7716aArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f14749h += i12;
            }
            return i12;
        }

        /* renamed from: d */
        public final void m14486d(C7716a c7716a) {
            int i10 = c7716a.f13098c;
            int i11 = this.f14747f;
            if (i10 > i11) {
                m14484b();
                return;
            }
            m14485c((this.f14751j + i10) - i11);
            int i12 = this.f14750i + 1;
            C7716a[] c7716aArr = this.f14748g;
            if (i12 > c7716aArr.length) {
                C7716a[] c7716aArr2 = new C7716a[c7716aArr.length * 2];
                System.arraycopy(c7716aArr, 0, c7716aArr2, c7716aArr.length, c7716aArr.length);
                this.f14749h = this.f14748g.length - 1;
                this.f14748g = c7716aArr2;
            }
            int i13 = this.f14749h;
            this.f14749h = i13 - 1;
            this.f14748g[i13] = c7716a;
            this.f14750i++;
            this.f14751j += i10;
        }

        /* renamed from: e */
        public final void m14487e(int i10) {
            this.f14742a = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f14747f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f14745d = Math.min(this.f14745d, iMin);
            }
            this.f14746e = true;
            this.f14747f = iMin;
            m14483a();
        }

        /* renamed from: f */
        public final void m14488f(ByteString data) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.f14743b) {
                C7720e c7720e = C7720e.f13141a;
                if (c7720e.m12944d(data) < data.size()) {
                    Buffer buffer = new Buffer();
                    c7720e.m12943c(data, buffer);
                    ByteString byteString = buffer.readByteString();
                    m14490h(byteString.size(), 127, 128);
                    this.f14744c.write(byteString);
                    return;
                }
            }
            m14490h(data.size(), 127, 0);
            this.f14744c.write(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m14489g(java.util.List r13) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C8740a.b.m14489g(java.util.List):void");
        }

        /* renamed from: h */
        public final void m14490h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f14744c.writeByte(i10 | i12);
                return;
            }
            this.f14744c.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f14744c.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f14744c.writeByte(i13);
        }

        public /* synthetic */ b(int i10, boolean z9, Buffer buffer, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z9, buffer);
        }
    }
}
