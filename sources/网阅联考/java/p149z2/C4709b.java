package p149z2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import p121s2.AbstractC4550b;

/* renamed from: z2.b */
/* loaded from: classes2.dex */
public final class C4709b {

    /* renamed from: a */
    public static final C4708a[] f6077a;

    /* renamed from: b */
    public static final Map f6078b;

    /* renamed from: c */
    public static final C4709b f6079c;

    static {
        C4709b c4709b = new C4709b();
        f6079c = c4709b;
        ByteString byteString = C4708a.f6069f;
        ByteString byteString2 = C4708a.f6070g;
        ByteString byteString3 = C4708a.f6071h;
        ByteString byteString4 = C4708a.f6068e;
        f6077a = new C4708a[]{new C4708a(C4708a.f6072i, ""), new C4708a(byteString, "GET"), new C4708a(byteString, "POST"), new C4708a(byteString2, "/"), new C4708a(byteString2, "/index.html"), new C4708a(byteString3, "http"), new C4708a(byteString3, "https"), new C4708a(byteString4, "200"), new C4708a(byteString4, "204"), new C4708a(byteString4, "206"), new C4708a(byteString4, "304"), new C4708a(byteString4, "400"), new C4708a(byteString4, "404"), new C4708a(byteString4, "500"), new C4708a("accept-charset", ""), new C4708a("accept-encoding", "gzip, deflate"), new C4708a("accept-language", ""), new C4708a("accept-ranges", ""), new C4708a("accept", ""), new C4708a("access-control-allow-origin", ""), new C4708a("age", ""), new C4708a("allow", ""), new C4708a("authorization", ""), new C4708a("cache-control", ""), new C4708a("content-disposition", ""), new C4708a("content-encoding", ""), new C4708a("content-language", ""), new C4708a("content-length", ""), new C4708a("content-location", ""), new C4708a("content-range", ""), new C4708a("content-type", ""), new C4708a("cookie", ""), new C4708a("date", ""), new C4708a("etag", ""), new C4708a("expect", ""), new C4708a("expires", ""), new C4708a("from", ""), new C4708a("host", ""), new C4708a("if-match", ""), new C4708a("if-modified-since", ""), new C4708a("if-none-match", ""), new C4708a("if-range", ""), new C4708a("if-unmodified-since", ""), new C4708a("last-modified", ""), new C4708a("link", ""), new C4708a("location", ""), new C4708a("max-forwards", ""), new C4708a("proxy-authenticate", ""), new C4708a("proxy-authorization", ""), new C4708a("range", ""), new C4708a("referer", ""), new C4708a("refresh", ""), new C4708a("retry-after", ""), new C4708a("server", ""), new C4708a("set-cookie", ""), new C4708a("strict-transport-security", ""), new C4708a("transfer-encoding", ""), new C4708a("user-agent", ""), new C4708a("vary", ""), new C4708a("via", ""), new C4708a("www-authenticate", "")};
        f6078b = c4709b.m6714d();
    }

    /* renamed from: a */
    public final ByteString m6711a(ByteString name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = name.size();
        for (int i4 = 0; i4 < size; i4++) {
            byte b4 = (byte) 65;
            byte b5 = (byte) 90;
            byte b6 = name.getByte(i4);
            if (b4 <= b6 && b5 >= b6) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }

    /* renamed from: b */
    public final Map m6712b() {
        return f6078b;
    }

    /* renamed from: c */
    public final C4708a[] m6713c() {
        return f6077a;
    }

    /* renamed from: d */
    public final Map m6714d() {
        C4708a[] c4708aArr = f6077a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c4708aArr.length);
        int length = c4708aArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            C4708a[] c4708aArr2 = f6077a;
            if (!linkedHashMap.containsKey(c4708aArr2[i4].f6075b)) {
                linkedHashMap.put(c4708aArr2[i4].f6075b, Integer.valueOf(i4));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "Collections.unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    /* renamed from: z2.b$a */
    public static final class a {

        /* renamed from: a */
        public final List f6080a;

        /* renamed from: b */
        public final BufferedSource f6081b;

        /* renamed from: c */
        public C4708a[] f6082c;

        /* renamed from: d */
        public int f6083d;

        /* renamed from: e */
        public int f6084e;

        /* renamed from: f */
        public int f6085f;

        /* renamed from: g */
        public final int f6086g;

        /* renamed from: h */
        public int f6087h;

        public a(Source source, int i4, int i5) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f6086g = i4;
            this.f6087h = i5;
            this.f6080a = new ArrayList();
            this.f6081b = Okio.buffer(source);
            this.f6082c = new C4708a[8];
            this.f6083d = r2.length - 1;
        }

        /* renamed from: a */
        public final void m6715a() {
            int i4 = this.f6087h;
            int i5 = this.f6085f;
            if (i4 < i5) {
                if (i4 == 0) {
                    m6716b();
                } else {
                    m6718d(i5 - i4);
                }
            }
        }

        /* renamed from: b */
        public final void m6716b() {
            ArraysKt___ArraysJvmKt.fill$default(this.f6082c, (Object) null, 0, 0, 6, (Object) null);
            this.f6083d = this.f6082c.length - 1;
            this.f6084e = 0;
            this.f6085f = 0;
        }

        /* renamed from: c */
        public final int m6717c(int i4) {
            return this.f6083d + 1 + i4;
        }

        /* renamed from: d */
        public final int m6718d(int i4) {
            int i5;
            int i6 = 0;
            if (i4 > 0) {
                int length = this.f6082c.length;
                while (true) {
                    length--;
                    i5 = this.f6083d;
                    if (length < i5 || i4 <= 0) {
                        break;
                    }
                    C4708a c4708a = this.f6082c[length];
                    Intrinsics.checkNotNull(c4708a);
                    int i7 = c4708a.f6074a;
                    i4 -= i7;
                    this.f6085f -= i7;
                    this.f6084e--;
                    i6++;
                }
                C4708a[] c4708aArr = this.f6082c;
                System.arraycopy(c4708aArr, i5 + 1, c4708aArr, i5 + 1 + i6, this.f6084e);
                this.f6083d += i6;
            }
            return i6;
        }

        /* renamed from: e */
        public final List m6719e() {
            List list = CollectionsKt___CollectionsKt.toList(this.f6080a);
            this.f6080a.clear();
            return list;
        }

        /* renamed from: f */
        public final ByteString m6720f(int i4) throws IOException {
            if (m6722h(i4)) {
                return C4709b.f6079c.m6713c()[i4].f6075b;
            }
            int iM6717c = m6717c(i4 - C4709b.f6079c.m6713c().length);
            if (iM6717c >= 0) {
                C4708a[] c4708aArr = this.f6082c;
                if (iM6717c < c4708aArr.length) {
                    C4708a c4708a = c4708aArr[iM6717c];
                    Intrinsics.checkNotNull(c4708a);
                    return c4708a.f6075b;
                }
            }
            throw new IOException("Header index too large " + (i4 + 1));
        }

        /* renamed from: g */
        public final void m6721g(int i4, C4708a c4708a) {
            this.f6080a.add(c4708a);
            int i5 = c4708a.f6074a;
            if (i4 != -1) {
                C4708a c4708a2 = this.f6082c[m6717c(i4)];
                Intrinsics.checkNotNull(c4708a2);
                i5 -= c4708a2.f6074a;
            }
            int i6 = this.f6087h;
            if (i5 > i6) {
                m6716b();
                return;
            }
            int iM6718d = m6718d((this.f6085f + i5) - i6);
            if (i4 == -1) {
                int i7 = this.f6084e + 1;
                C4708a[] c4708aArr = this.f6082c;
                if (i7 > c4708aArr.length) {
                    C4708a[] c4708aArr2 = new C4708a[c4708aArr.length * 2];
                    System.arraycopy(c4708aArr, 0, c4708aArr2, c4708aArr.length, c4708aArr.length);
                    this.f6083d = this.f6082c.length - 1;
                    this.f6082c = c4708aArr2;
                }
                int i8 = this.f6083d;
                this.f6083d = i8 - 1;
                this.f6082c[i8] = c4708a;
                this.f6084e++;
            } else {
                this.f6082c[i4 + m6717c(i4) + iM6718d] = c4708a;
            }
            this.f6085f += i5;
        }

        /* renamed from: h */
        public final boolean m6722h(int i4) {
            return i4 >= 0 && i4 <= C4709b.f6079c.m6713c().length - 1;
        }

        /* renamed from: i */
        public final int m6723i() {
            return AbstractC4550b.m6220b(this.f6081b.readByte(), 255);
        }

        /* renamed from: j */
        public final ByteString m6724j() throws IOException {
            int iM6723i = m6723i();
            boolean z3 = (iM6723i & 128) == 128;
            long jM6727m = m6727m(iM6723i, WorkQueueKt.MASK);
            if (!z3) {
                return this.f6081b.readByteString(jM6727m);
            }
            Buffer buffer = new Buffer();
            C4716i.f6271d.m6905b(this.f6081b, jM6727m, buffer);
            return buffer.readByteString();
        }

        /* renamed from: k */
        public final void m6725k() throws IOException {
            while (!this.f6081b.exhausted()) {
                int iM6220b = AbstractC4550b.m6220b(this.f6081b.readByte(), 255);
                if (iM6220b == 128) {
                    throw new IOException("index == 0");
                }
                if ((iM6220b & 128) == 128) {
                    m6726l(m6727m(iM6220b, WorkQueueKt.MASK) - 1);
                } else if (iM6220b == 64) {
                    m6729o();
                } else if ((iM6220b & 64) == 64) {
                    m6728n(m6727m(iM6220b, 63) - 1);
                } else if ((iM6220b & 32) == 32) {
                    int iM6727m = m6727m(iM6220b, 31);
                    this.f6087h = iM6727m;
                    if (iM6727m < 0 || iM6727m > this.f6086g) {
                        throw new IOException("Invalid dynamic table size update " + this.f6087h);
                    }
                    m6715a();
                } else if (iM6220b == 16 || iM6220b == 0) {
                    m6731q();
                } else {
                    m6730p(m6727m(iM6220b, 15) - 1);
                }
            }
        }

        /* renamed from: l */
        public final void m6726l(int i4) throws IOException {
            if (m6722h(i4)) {
                this.f6080a.add(C4709b.f6079c.m6713c()[i4]);
                return;
            }
            int iM6717c = m6717c(i4 - C4709b.f6079c.m6713c().length);
            if (iM6717c >= 0) {
                C4708a[] c4708aArr = this.f6082c;
                if (iM6717c < c4708aArr.length) {
                    List list = this.f6080a;
                    C4708a c4708a = c4708aArr[iM6717c];
                    Intrinsics.checkNotNull(c4708a);
                    list.add(c4708a);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i4 + 1));
        }

        /* renamed from: m */
        public final int m6727m(int i4, int i5) {
            int i6 = i4 & i5;
            if (i6 < i5) {
                return i6;
            }
            int i7 = 0;
            while (true) {
                int iM6723i = m6723i();
                if ((iM6723i & 128) == 0) {
                    return i5 + (iM6723i << i7);
                }
                i5 += (iM6723i & WorkQueueKt.MASK) << i7;
                i7 += 7;
            }
        }

        /* renamed from: n */
        public final void m6728n(int i4) {
            m6721g(-1, new C4708a(m6720f(i4), m6724j()));
        }

        /* renamed from: o */
        public final void m6729o() {
            m6721g(-1, new C4708a(C4709b.f6079c.m6711a(m6724j()), m6724j()));
        }

        /* renamed from: p */
        public final void m6730p(int i4) throws IOException {
            this.f6080a.add(new C4708a(m6720f(i4), m6724j()));
        }

        /* renamed from: q */
        public final void m6731q() throws IOException {
            this.f6080a.add(new C4708a(C4709b.f6079c.m6711a(m6724j()), m6724j()));
        }

        public /* synthetic */ a(Source source, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this(source, i4, (i6 & 4) != 0 ? i4 : i5);
        }
    }

    /* renamed from: z2.b$b */
    public static final class b {

        /* renamed from: a */
        public int f6088a;

        /* renamed from: b */
        public boolean f6089b;

        /* renamed from: c */
        public int f6090c;

        /* renamed from: d */
        public C4708a[] f6091d;

        /* renamed from: e */
        public int f6092e;

        /* renamed from: f */
        public int f6093f;

        /* renamed from: g */
        public int f6094g;

        /* renamed from: h */
        public int f6095h;

        /* renamed from: i */
        public final boolean f6096i;

        /* renamed from: j */
        public final Buffer f6097j;

        public b(int i4, boolean z3, Buffer out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f6095h = i4;
            this.f6096i = z3;
            this.f6097j = out;
            this.f6088a = Integer.MAX_VALUE;
            this.f6090c = i4;
            this.f6091d = new C4708a[8];
            this.f6092e = r2.length - 1;
        }

        /* renamed from: a */
        public final void m6732a() {
            int i4 = this.f6090c;
            int i5 = this.f6094g;
            if (i4 < i5) {
                if (i4 == 0) {
                    m6733b();
                } else {
                    m6734c(i5 - i4);
                }
            }
        }

        /* renamed from: b */
        public final void m6733b() {
            ArraysKt___ArraysJvmKt.fill$default(this.f6091d, (Object) null, 0, 0, 6, (Object) null);
            this.f6092e = this.f6091d.length - 1;
            this.f6093f = 0;
            this.f6094g = 0;
        }

        /* renamed from: c */
        public final int m6734c(int i4) {
            int i5;
            int i6 = 0;
            if (i4 > 0) {
                int length = this.f6091d.length;
                while (true) {
                    length--;
                    i5 = this.f6092e;
                    if (length < i5 || i4 <= 0) {
                        break;
                    }
                    C4708a c4708a = this.f6091d[length];
                    Intrinsics.checkNotNull(c4708a);
                    i4 -= c4708a.f6074a;
                    int i7 = this.f6094g;
                    C4708a c4708a2 = this.f6091d[length];
                    Intrinsics.checkNotNull(c4708a2);
                    this.f6094g = i7 - c4708a2.f6074a;
                    this.f6093f--;
                    i6++;
                }
                C4708a[] c4708aArr = this.f6091d;
                System.arraycopy(c4708aArr, i5 + 1, c4708aArr, i5 + 1 + i6, this.f6093f);
                C4708a[] c4708aArr2 = this.f6091d;
                int i8 = this.f6092e;
                Arrays.fill(c4708aArr2, i8 + 1, i8 + 1 + i6, (Object) null);
                this.f6092e += i6;
            }
            return i6;
        }

        /* renamed from: d */
        public final void m6735d(C4708a c4708a) {
            int i4 = c4708a.f6074a;
            int i5 = this.f6090c;
            if (i4 > i5) {
                m6733b();
                return;
            }
            m6734c((this.f6094g + i4) - i5);
            int i6 = this.f6093f + 1;
            C4708a[] c4708aArr = this.f6091d;
            if (i6 > c4708aArr.length) {
                C4708a[] c4708aArr2 = new C4708a[c4708aArr.length * 2];
                System.arraycopy(c4708aArr, 0, c4708aArr2, c4708aArr.length, c4708aArr.length);
                this.f6092e = this.f6091d.length - 1;
                this.f6091d = c4708aArr2;
            }
            int i7 = this.f6092e;
            this.f6092e = i7 - 1;
            this.f6091d[i7] = c4708a;
            this.f6093f++;
            this.f6094g += i4;
        }

        /* renamed from: e */
        public final void m6736e(int i4) {
            this.f6095h = i4;
            int iMin = Math.min(i4, 16384);
            int i5 = this.f6090c;
            if (i5 == iMin) {
                return;
            }
            if (iMin < i5) {
                this.f6088a = Math.min(this.f6088a, iMin);
            }
            this.f6089b = true;
            this.f6090c = iMin;
            m6732a();
        }

        /* renamed from: f */
        public final void m6737f(ByteString data) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.f6096i) {
                C4716i c4716i = C4716i.f6271d;
                if (c4716i.m6907d(data) < data.size()) {
                    Buffer buffer = new Buffer();
                    c4716i.m6906c(data, buffer);
                    ByteString byteString = buffer.readByteString();
                    m6739h(byteString.size(), WorkQueueKt.MASK, 128);
                    this.f6097j.write(byteString);
                    return;
                }
            }
            m6739h(data.size(), WorkQueueKt.MASK, 0);
            this.f6097j.write(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m6738g(java.util.List r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 269
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p149z2.C4709b.b.m6738g(java.util.List):void");
        }

        /* renamed from: h */
        public final void m6739h(int i4, int i5, int i6) {
            if (i4 < i5) {
                this.f6097j.writeByte(i4 | i6);
                return;
            }
            this.f6097j.writeByte(i6 | i5);
            int i7 = i4 - i5;
            while (i7 >= 128) {
                this.f6097j.writeByte(128 | (i7 & WorkQueueKt.MASK));
                i7 >>>= 7;
            }
            this.f6097j.writeByte(i7);
        }

        public /* synthetic */ b(int i4, boolean z3, Buffer buffer, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 4096 : i4, (i5 & 2) != 0 ? true : z3, buffer);
        }
    }
}
