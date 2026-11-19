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
import kotlinx.coroutines.scheduling.WorkQueueKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import p182m8.AbstractC9045d;
import p256t8.C9636a;
import p256t8.C9640e;

/* renamed from: okhttp3.internal.http2.a */
/* loaded from: classes5.dex */
public final class C9243a {

    /* renamed from: a */
    public static final C9243a f15858a;

    /* renamed from: b */
    public static final C9636a[] f15859b;

    /* renamed from: c */
    public static final Map f15860c;

    static {
        C9243a c9243a = new C9243a();
        f15858a = c9243a;
        C9636a c9636a = new C9636a(C9636a.f16925j, "");
        ByteString byteString = C9636a.f16922g;
        C9636a c9636a2 = new C9636a(byteString, "GET");
        C9636a c9636a3 = new C9636a(byteString, "POST");
        ByteString byteString2 = C9636a.f16923h;
        C9636a c9636a4 = new C9636a(byteString2, "/");
        C9636a c9636a5 = new C9636a(byteString2, "/index.html");
        ByteString byteString3 = C9636a.f16924i;
        C9636a c9636a6 = new C9636a(byteString3, "http");
        C9636a c9636a7 = new C9636a(byteString3, "https");
        ByteString byteString4 = C9636a.f16921f;
        f15859b = new C9636a[]{c9636a, c9636a2, c9636a3, c9636a4, c9636a5, c9636a6, c9636a7, new C9636a(byteString4, "200"), new C9636a(byteString4, "204"), new C9636a(byteString4, "206"), new C9636a(byteString4, "304"), new C9636a(byteString4, "400"), new C9636a(byteString4, "404"), new C9636a(byteString4, "500"), new C9636a("accept-charset", ""), new C9636a("accept-encoding", "gzip, deflate"), new C9636a("accept-language", ""), new C9636a("accept-ranges", ""), new C9636a("accept", ""), new C9636a("access-control-allow-origin", ""), new C9636a("age", ""), new C9636a("allow", ""), new C9636a("authorization", ""), new C9636a("cache-control", ""), new C9636a("content-disposition", ""), new C9636a("content-encoding", ""), new C9636a("content-language", ""), new C9636a("content-length", ""), new C9636a("content-location", ""), new C9636a("content-range", ""), new C9636a("content-type", ""), new C9636a("cookie", ""), new C9636a("date", ""), new C9636a("etag", ""), new C9636a("expect", ""), new C9636a("expires", ""), new C9636a(TypedValues.TransitionType.S_FROM, ""), new C9636a("host", ""), new C9636a("if-match", ""), new C9636a("if-modified-since", ""), new C9636a("if-none-match", ""), new C9636a("if-range", ""), new C9636a("if-unmodified-since", ""), new C9636a("last-modified", ""), new C9636a("link", ""), new C9636a(RequestParameters.SUBRESOURCE_LOCATION, ""), new C9636a("max-forwards", ""), new C9636a("proxy-authenticate", ""), new C9636a("proxy-authorization", ""), new C9636a("range", ""), new C9636a(RequestParameters.SUBRESOURCE_REFERER, ""), new C9636a("refresh", ""), new C9636a("retry-after", ""), new C9636a("server", ""), new C9636a("set-cookie", ""), new C9636a("strict-transport-security", ""), new C9636a("transfer-encoding", ""), new C9636a("user-agent", ""), new C9636a("vary", ""), new C9636a("via", ""), new C9636a("www-authenticate", "")};
        f15860c = c9243a.m14899d();
    }

    /* renamed from: a */
    public final ByteString m14896a(ByteString name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = name.size();
        for (int i9 = 0; i9 < size; i9++) {
            byte b10 = name.getByte(i9);
            if (65 <= b10 && b10 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }

    /* renamed from: b */
    public final Map m14897b() {
        return f15860c;
    }

    /* renamed from: c */
    public final C9636a[] m14898c() {
        return f15859b;
    }

    /* renamed from: d */
    public final Map m14899d() {
        C9636a[] c9636aArr = f15859b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c9636aArr.length);
        int length = c9636aArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            C9636a[] c9636aArr2 = f15859b;
            if (!linkedHashMap.containsKey(c9636aArr2[i9].f16926a)) {
                linkedHashMap.put(c9636aArr2[i9].f16926a, Integer.valueOf(i9));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    /* renamed from: okhttp3.internal.http2.a$a */
    public static final class a {

        /* renamed from: a */
        public final int f15861a;

        /* renamed from: b */
        public int f15862b;

        /* renamed from: c */
        public final List f15863c;

        /* renamed from: d */
        public final BufferedSource f15864d;

        /* renamed from: e */
        public C9636a[] f15865e;

        /* renamed from: f */
        public int f15866f;

        /* renamed from: g */
        public int f15867g;

        /* renamed from: h */
        public int f15868h;

        public a(Source source, int i9, int i10) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f15861a = i9;
            this.f15862b = i10;
            this.f15863c = new ArrayList();
            this.f15864d = Okio.buffer(source);
            this.f15865e = new C9636a[8];
            this.f15866f = r2.length - 1;
        }

        /* renamed from: a */
        public final void m14900a() {
            int i9 = this.f15862b;
            int i10 = this.f15868h;
            if (i9 < i10) {
                if (i9 == 0) {
                    m14901b();
                } else {
                    m14903d(i10 - i9);
                }
            }
        }

        /* renamed from: b */
        public final void m14901b() {
            ArraysKt.fill$default(this.f15865e, (Object) null, 0, 0, 6, (Object) null);
            this.f15866f = this.f15865e.length - 1;
            this.f15867g = 0;
            this.f15868h = 0;
        }

        /* renamed from: c */
        public final int m14902c(int i9) {
            return this.f15866f + 1 + i9;
        }

        /* renamed from: d */
        public final int m14903d(int i9) {
            int i10;
            int i11 = 0;
            if (i9 > 0) {
                int length = this.f15865e.length;
                while (true) {
                    length--;
                    i10 = this.f15866f;
                    if (length < i10 || i9 <= 0) {
                        break;
                    }
                    C9636a c9636a = this.f15865e[length];
                    Intrinsics.checkNotNull(c9636a);
                    int i12 = c9636a.f16928c;
                    i9 -= i12;
                    this.f15868h -= i12;
                    this.f15867g--;
                    i11++;
                }
                C9636a[] c9636aArr = this.f15865e;
                System.arraycopy(c9636aArr, i10 + 1, c9636aArr, i10 + 1 + i11, this.f15867g);
                this.f15866f += i11;
            }
            return i11;
        }

        /* renamed from: e */
        public final List m14904e() {
            List list = CollectionsKt.toList(this.f15863c);
            this.f15863c.clear();
            return list;
        }

        /* renamed from: f */
        public final ByteString m14905f(int i9) throws IOException {
            if (m14907h(i9)) {
                return C9243a.f15858a.m14898c()[i9].f16926a;
            }
            int iM14902c = m14902c(i9 - C9243a.f15858a.m14898c().length);
            if (iM14902c >= 0) {
                C9636a[] c9636aArr = this.f15865e;
                if (iM14902c < c9636aArr.length) {
                    C9636a c9636a = c9636aArr[iM14902c];
                    Intrinsics.checkNotNull(c9636a);
                    return c9636a.f16926a;
                }
            }
            throw new IOException("Header index too large " + (i9 + 1));
        }

        /* renamed from: g */
        public final void m14906g(int i9, C9636a c9636a) {
            this.f15863c.add(c9636a);
            int i10 = c9636a.f16928c;
            if (i9 != -1) {
                C9636a c9636a2 = this.f15865e[m14902c(i9)];
                Intrinsics.checkNotNull(c9636a2);
                i10 -= c9636a2.f16928c;
            }
            int i11 = this.f15862b;
            if (i10 > i11) {
                m14901b();
                return;
            }
            int iM14903d = m14903d((this.f15868h + i10) - i11);
            if (i9 == -1) {
                int i12 = this.f15867g + 1;
                C9636a[] c9636aArr = this.f15865e;
                if (i12 > c9636aArr.length) {
                    C9636a[] c9636aArr2 = new C9636a[c9636aArr.length * 2];
                    System.arraycopy(c9636aArr, 0, c9636aArr2, c9636aArr.length, c9636aArr.length);
                    this.f15866f = this.f15865e.length - 1;
                    this.f15865e = c9636aArr2;
                }
                int i13 = this.f15866f;
                this.f15866f = i13 - 1;
                this.f15865e[i13] = c9636a;
                this.f15867g++;
            } else {
                this.f15865e[i9 + m14902c(i9) + iM14903d] = c9636a;
            }
            this.f15868h += i10;
        }

        /* renamed from: h */
        public final boolean m14907h(int i9) {
            return i9 >= 0 && i9 <= C9243a.f15858a.m14898c().length - 1;
        }

        /* renamed from: i */
        public final int m14908i() {
            return AbstractC9045d.m14488d(this.f15864d.readByte(), 255);
        }

        /* renamed from: j */
        public final ByteString m14909j() throws IOException {
            int iM14908i = m14908i();
            boolean z9 = (iM14908i & 128) == 128;
            long jM14912m = m14912m(iM14908i, WorkQueueKt.MASK);
            if (!z9) {
                return this.f15864d.readByteString(jM14912m);
            }
            Buffer buffer = new Buffer();
            C9640e.f16971a.m15961b(this.f15864d, jM14912m, buffer);
            return buffer.readByteString();
        }

        /* renamed from: k */
        public final void m14910k() throws IOException {
            while (!this.f15864d.exhausted()) {
                int iM14488d = AbstractC9045d.m14488d(this.f15864d.readByte(), 255);
                if (iM14488d == 128) {
                    throw new IOException("index == 0");
                }
                if ((iM14488d & 128) == 128) {
                    m14911l(m14912m(iM14488d, WorkQueueKt.MASK) - 1);
                } else if (iM14488d == 64) {
                    m14914o();
                } else if ((iM14488d & 64) == 64) {
                    m14913n(m14912m(iM14488d, 63) - 1);
                } else if ((iM14488d & 32) == 32) {
                    int iM14912m = m14912m(iM14488d, 31);
                    this.f15862b = iM14912m;
                    if (iM14912m < 0 || iM14912m > this.f15861a) {
                        throw new IOException("Invalid dynamic table size update " + this.f15862b);
                    }
                    m14900a();
                } else if (iM14488d == 16 || iM14488d == 0) {
                    m14916q();
                } else {
                    m14915p(m14912m(iM14488d, 15) - 1);
                }
            }
        }

        /* renamed from: l */
        public final void m14911l(int i9) throws IOException {
            if (m14907h(i9)) {
                this.f15863c.add(C9243a.f15858a.m14898c()[i9]);
                return;
            }
            int iM14902c = m14902c(i9 - C9243a.f15858a.m14898c().length);
            if (iM14902c >= 0) {
                C9636a[] c9636aArr = this.f15865e;
                if (iM14902c < c9636aArr.length) {
                    List list = this.f15863c;
                    C9636a c9636a = c9636aArr[iM14902c];
                    Intrinsics.checkNotNull(c9636a);
                    list.add(c9636a);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i9 + 1));
        }

        /* renamed from: m */
        public final int m14912m(int i9, int i10) {
            int i11 = i9 & i10;
            if (i11 < i10) {
                return i11;
            }
            int i12 = 0;
            while (true) {
                int iM14908i = m14908i();
                if ((iM14908i & 128) == 0) {
                    return i10 + (iM14908i << i12);
                }
                i10 += (iM14908i & WorkQueueKt.MASK) << i12;
                i12 += 7;
            }
        }

        /* renamed from: n */
        public final void m14913n(int i9) {
            m14906g(-1, new C9636a(m14905f(i9), m14909j()));
        }

        /* renamed from: o */
        public final void m14914o() {
            m14906g(-1, new C9636a(C9243a.f15858a.m14896a(m14909j()), m14909j()));
        }

        /* renamed from: p */
        public final void m14915p(int i9) throws IOException {
            this.f15863c.add(new C9636a(m14905f(i9), m14909j()));
        }

        /* renamed from: q */
        public final void m14916q() throws IOException {
            this.f15863c.add(new C9636a(C9243a.f15858a.m14896a(m14909j()), m14909j()));
        }

        public /* synthetic */ a(Source source, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(source, i9, (i11 & 4) != 0 ? i9 : i10);
        }
    }

    /* renamed from: okhttp3.internal.http2.a$b */
    public static final class b {

        /* renamed from: a */
        public int f15869a;

        /* renamed from: b */
        public final boolean f15870b;

        /* renamed from: c */
        public final Buffer f15871c;

        /* renamed from: d */
        public int f15872d;

        /* renamed from: e */
        public boolean f15873e;

        /* renamed from: f */
        public int f15874f;

        /* renamed from: g */
        public C9636a[] f15875g;

        /* renamed from: h */
        public int f15876h;

        /* renamed from: i */
        public int f15877i;

        /* renamed from: j */
        public int f15878j;

        public b(int i9, boolean z9, Buffer out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f15869a = i9;
            this.f15870b = z9;
            this.f15871c = out;
            this.f15872d = Integer.MAX_VALUE;
            this.f15874f = i9;
            this.f15875g = new C9636a[8];
            this.f15876h = r2.length - 1;
        }

        /* renamed from: a */
        public final void m14917a() {
            int i9 = this.f15874f;
            int i10 = this.f15878j;
            if (i9 < i10) {
                if (i9 == 0) {
                    m14918b();
                } else {
                    m14919c(i10 - i9);
                }
            }
        }

        /* renamed from: b */
        public final void m14918b() {
            ArraysKt.fill$default(this.f15875g, (Object) null, 0, 0, 6, (Object) null);
            this.f15876h = this.f15875g.length - 1;
            this.f15877i = 0;
            this.f15878j = 0;
        }

        /* renamed from: c */
        public final int m14919c(int i9) {
            int i10;
            int i11 = 0;
            if (i9 > 0) {
                int length = this.f15875g.length;
                while (true) {
                    length--;
                    i10 = this.f15876h;
                    if (length < i10 || i9 <= 0) {
                        break;
                    }
                    C9636a c9636a = this.f15875g[length];
                    Intrinsics.checkNotNull(c9636a);
                    i9 -= c9636a.f16928c;
                    int i12 = this.f15878j;
                    C9636a c9636a2 = this.f15875g[length];
                    Intrinsics.checkNotNull(c9636a2);
                    this.f15878j = i12 - c9636a2.f16928c;
                    this.f15877i--;
                    i11++;
                }
                C9636a[] c9636aArr = this.f15875g;
                System.arraycopy(c9636aArr, i10 + 1, c9636aArr, i10 + 1 + i11, this.f15877i);
                C9636a[] c9636aArr2 = this.f15875g;
                int i13 = this.f15876h;
                Arrays.fill(c9636aArr2, i13 + 1, i13 + 1 + i11, (Object) null);
                this.f15876h += i11;
            }
            return i11;
        }

        /* renamed from: d */
        public final void m14920d(C9636a c9636a) {
            int i9 = c9636a.f16928c;
            int i10 = this.f15874f;
            if (i9 > i10) {
                m14918b();
                return;
            }
            m14919c((this.f15878j + i9) - i10);
            int i11 = this.f15877i + 1;
            C9636a[] c9636aArr = this.f15875g;
            if (i11 > c9636aArr.length) {
                C9636a[] c9636aArr2 = new C9636a[c9636aArr.length * 2];
                System.arraycopy(c9636aArr, 0, c9636aArr2, c9636aArr.length, c9636aArr.length);
                this.f15876h = this.f15875g.length - 1;
                this.f15875g = c9636aArr2;
            }
            int i12 = this.f15876h;
            this.f15876h = i12 - 1;
            this.f15875g[i12] = c9636a;
            this.f15877i++;
            this.f15878j += i9;
        }

        /* renamed from: e */
        public final void m14921e(int i9) {
            this.f15869a = i9;
            int iMin = Math.min(i9, 16384);
            int i10 = this.f15874f;
            if (i10 == iMin) {
                return;
            }
            if (iMin < i10) {
                this.f15872d = Math.min(this.f15872d, iMin);
            }
            this.f15873e = true;
            this.f15874f = iMin;
            m14917a();
        }

        /* renamed from: f */
        public final void m14922f(ByteString data) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.f15870b) {
                C9640e c9640e = C9640e.f16971a;
                if (c9640e.m15963d(data) < data.size()) {
                    Buffer buffer = new Buffer();
                    c9640e.m15962c(data, buffer);
                    ByteString byteString = buffer.readByteString();
                    m14924h(byteString.size(), WorkQueueKt.MASK, 128);
                    this.f15871c.write(byteString);
                    return;
                }
            }
            m14924h(data.size(), WorkQueueKt.MASK, 0);
            this.f15871c.write(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m14923g(java.util.List r13) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C9243a.b.m14923g(java.util.List):void");
        }

        /* renamed from: h */
        public final void m14924h(int i9, int i10, int i11) {
            if (i9 < i10) {
                this.f15871c.writeByte(i9 | i11);
                return;
            }
            this.f15871c.writeByte(i11 | i10);
            int i12 = i9 - i10;
            while (i12 >= 128) {
                this.f15871c.writeByte(128 | (i12 & WorkQueueKt.MASK));
                i12 >>>= 7;
            }
            this.f15871c.writeByte(i12);
        }

        public /* synthetic */ b(int i9, boolean z9, Buffer buffer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 4096 : i9, (i10 & 2) != 0 ? true : z9, buffer);
        }
    }
}
