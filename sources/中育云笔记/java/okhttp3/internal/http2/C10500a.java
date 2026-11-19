package okhttp3.internal.http2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import anet.channel.util.HttpConstant;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.taobao.accs.common.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10964p;
import re.C10994a;
import re.C10998e;

/* renamed from: okhttp3.internal.http2.a */
/* loaded from: classes6.dex */
public final class C10500a {

    /* renamed from: a */
    public static final C10500a f25155a;

    /* renamed from: b */
    public static final C10994a[] f25156b;

    /* renamed from: c */
    public static final Map f25157c;

    static {
        C10500a c10500a = new C10500a();
        f25155a = c10500a;
        C10994a c10994a = new C10994a(C10994a.f26507j, "");
        ByteString byteString = C10994a.f26504g;
        C10994a c10994a2 = new C10994a(byteString, "GET");
        C10994a c10994a3 = new C10994a(byteString, "POST");
        ByteString byteString2 = C10994a.f26505h;
        C10994a c10994a4 = new C10994a(byteString2, MqttTopic.TOPIC_LEVEL_SEPARATOR);
        C10994a c10994a5 = new C10994a(byteString2, "/index.html");
        ByteString byteString3 = C10994a.f26506i;
        C10994a c10994a6 = new C10994a(byteString3, HttpConstant.HTTP);
        C10994a c10994a7 = new C10994a(byteString3, "https");
        ByteString byteString4 = C10994a.f26503f;
        f25156b = new C10994a[]{c10994a, c10994a2, c10994a3, c10994a4, c10994a5, c10994a6, c10994a7, new C10994a(byteString4, "200"), new C10994a(byteString4, "204"), new C10994a(byteString4, "206"), new C10994a(byteString4, "304"), new C10994a(byteString4, "400"), new C10994a(byteString4, "404"), new C10994a(byteString4, "500"), new C10994a("accept-charset", ""), new C10994a("accept-encoding", "gzip, deflate"), new C10994a("accept-language", ""), new C10994a("accept-ranges", ""), new C10994a("accept", ""), new C10994a("access-control-allow-origin", ""), new C10994a("age", ""), new C10994a("allow", ""), new C10994a("authorization", ""), new C10994a("cache-control", ""), new C10994a("content-disposition", ""), new C10994a("content-encoding", ""), new C10994a("content-language", ""), new C10994a("content-length", ""), new C10994a("content-location", ""), new C10994a("content-range", ""), new C10994a("content-type", ""), new C10994a("cookie", ""), new C10994a("date", ""), new C10994a("etag", ""), new C10994a("expect", ""), new C10994a("expires", ""), new C10994a(TypedValues.TransitionType.S_FROM, ""), new C10994a(Constants.KEY_HOST, ""), new C10994a("if-match", ""), new C10994a("if-modified-since", ""), new C10994a("if-none-match", ""), new C10994a("if-range", ""), new C10994a("if-unmodified-since", ""), new C10994a("last-modified", ""), new C10994a("link", ""), new C10994a(RequestParameters.SUBRESOURCE_LOCATION, ""), new C10994a("max-forwards", ""), new C10994a("proxy-authenticate", ""), new C10994a("proxy-authorization", ""), new C10994a("range", ""), new C10994a(RequestParameters.SUBRESOURCE_REFERER, ""), new C10994a("refresh", ""), new C10994a("retry-after", ""), new C10994a("server", ""), new C10994a("set-cookie", ""), new C10994a("strict-transport-security", ""), new C10994a("transfer-encoding", ""), new C10994a("user-agent", ""), new C10994a("vary", ""), new C10994a("via", ""), new C10994a("www-authenticate", "")};
        f25157c = c10500a.m22025d();
    }

    /* renamed from: a */
    public final ByteString m22022a(ByteString name) throws IOException {
        AbstractC9979u.m20294g(name, "name");
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
    public final Map m22023b() {
        return f25157c;
    }

    /* renamed from: c */
    public final C10994a[] m22024c() {
        return f25156b;
    }

    /* renamed from: d */
    public final Map m22025d() {
        C10994a[] c10994aArr = f25156b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c10994aArr.length);
        int length = c10994aArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            C10994a[] c10994aArr2 = f25156b;
            if (!linkedHashMap.containsKey(c10994aArr2[i10].f26508a)) {
                linkedHashMap.put(c10994aArr2[i10].f26508a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC9979u.m20293f(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    /* renamed from: okhttp3.internal.http2.a$a */
    public static final class a {

        /* renamed from: a */
        public final int f25158a;

        /* renamed from: b */
        public int f25159b;

        /* renamed from: c */
        public final List f25160c;

        /* renamed from: d */
        public final BufferedSource f25161d;

        /* renamed from: e */
        public C10994a[] f25162e;

        /* renamed from: f */
        public int f25163f;

        /* renamed from: g */
        public int f25164g;

        /* renamed from: h */
        public int f25165h;

        public a(Source source, int i10, int i11) {
            AbstractC9979u.m20294g(source, "source");
            this.f25158a = i10;
            this.f25159b = i11;
            this.f25160c = new ArrayList();
            this.f25161d = Okio.buffer(source);
            this.f25162e = new C10994a[8];
            this.f25163f = r2.length - 1;
        }

        /* renamed from: a */
        public final void m22026a() {
            int i10 = this.f25159b;
            int i11 = this.f25165h;
            if (i10 < i11) {
                if (i10 == 0) {
                    m22027b();
                } else {
                    m22029d(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        public final void m22027b() {
            AbstractC10964p.m23991F(this.f25162e, null, 0, 0, 6, null);
            this.f25163f = this.f25162e.length - 1;
            this.f25164g = 0;
            this.f25165h = 0;
        }

        /* renamed from: c */
        public final int m22028c(int i10) {
            return this.f25163f + 1 + i10;
        }

        /* renamed from: d */
        public final int m22029d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f25162e.length;
                while (true) {
                    length--;
                    i11 = this.f25163f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C10994a c10994a = this.f25162e[length];
                    AbstractC9979u.m20291d(c10994a);
                    int i13 = c10994a.f26510c;
                    i10 -= i13;
                    this.f25165h -= i13;
                    this.f25164g--;
                    i12++;
                }
                C10994a[] c10994aArr = this.f25162e;
                System.arraycopy(c10994aArr, i11 + 1, c10994aArr, i11 + 1 + i12, this.f25164g);
                this.f25163f += i12;
            }
            return i12;
        }

        /* renamed from: e */
        public final List m22030e() {
            List listM23922X0 = AbstractC10947g0.m23922X0(this.f25160c);
            this.f25160c.clear();
            return listM23922X0;
        }

        /* renamed from: f */
        public final ByteString m22031f(int i10) throws IOException {
            if (m22033h(i10)) {
                return C10500a.f25155a.m22024c()[i10].f26508a;
            }
            int iM22028c = m22028c(i10 - C10500a.f25155a.m22024c().length);
            if (iM22028c >= 0) {
                C10994a[] c10994aArr = this.f25162e;
                if (iM22028c < c10994aArr.length) {
                    C10994a c10994a = c10994aArr[iM22028c];
                    AbstractC9979u.m20291d(c10994a);
                    return c10994a.f26508a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        /* renamed from: g */
        public final void m22032g(int i10, C10994a c10994a) {
            this.f25160c.add(c10994a);
            int i11 = c10994a.f26510c;
            if (i10 != -1) {
                C10994a c10994a2 = this.f25162e[m22028c(i10)];
                AbstractC9979u.m20291d(c10994a2);
                i11 -= c10994a2.f26510c;
            }
            int i12 = this.f25159b;
            if (i11 > i12) {
                m22027b();
                return;
            }
            int iM22029d = m22029d((this.f25165h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f25164g + 1;
                C10994a[] c10994aArr = this.f25162e;
                if (i13 > c10994aArr.length) {
                    C10994a[] c10994aArr2 = new C10994a[c10994aArr.length * 2];
                    System.arraycopy(c10994aArr, 0, c10994aArr2, c10994aArr.length, c10994aArr.length);
                    this.f25163f = this.f25162e.length - 1;
                    this.f25162e = c10994aArr2;
                }
                int i14 = this.f25163f;
                this.f25163f = i14 - 1;
                this.f25162e[i14] = c10994a;
                this.f25164g++;
            } else {
                this.f25162e[i10 + m22028c(i10) + iM22029d] = c10994a;
            }
            this.f25165h += i11;
        }

        /* renamed from: h */
        public final boolean m22033h(int i10) {
            return i10 >= 0 && i10 <= C10500a.f25155a.m22024c().length - 1;
        }

        /* renamed from: i */
        public final int m22034i() {
            return AbstractC9920d.m20022d(this.f25161d.readByte(), 255);
        }

        /* renamed from: j */
        public final ByteString m22035j() {
            int iM22034i = m22034i();
            boolean z10 = (iM22034i & 128) == 128;
            long jM22038m = m22038m(iM22034i, 127);
            if (!z10) {
                return this.f25161d.readByteString(jM22038m);
            }
            Buffer buffer = new Buffer();
            C10998e.f26553a.m24296b(this.f25161d, jM22038m, buffer);
            return buffer.readByteString();
        }

        /* renamed from: k */
        public final void m22036k() throws IOException {
            while (!this.f25161d.exhausted()) {
                int iM20022d = AbstractC9920d.m20022d(this.f25161d.readByte(), 255);
                if (iM20022d == 128) {
                    throw new IOException("index == 0");
                }
                if ((iM20022d & 128) == 128) {
                    m22037l(m22038m(iM20022d, 127) - 1);
                } else if (iM20022d == 64) {
                    m22040o();
                } else if ((iM20022d & 64) == 64) {
                    m22039n(m22038m(iM20022d, 63) - 1);
                } else if ((iM20022d & 32) == 32) {
                    int iM22038m = m22038m(iM20022d, 31);
                    this.f25159b = iM22038m;
                    if (iM22038m < 0 || iM22038m > this.f25158a) {
                        throw new IOException("Invalid dynamic table size update " + this.f25159b);
                    }
                    m22026a();
                } else if (iM20022d == 16 || iM20022d == 0) {
                    m22042q();
                } else {
                    m22041p(m22038m(iM20022d, 15) - 1);
                }
            }
        }

        /* renamed from: l */
        public final void m22037l(int i10) throws IOException {
            if (m22033h(i10)) {
                this.f25160c.add(C10500a.f25155a.m22024c()[i10]);
                return;
            }
            int iM22028c = m22028c(i10 - C10500a.f25155a.m22024c().length);
            if (iM22028c >= 0) {
                C10994a[] c10994aArr = this.f25162e;
                if (iM22028c < c10994aArr.length) {
                    List list = this.f25160c;
                    C10994a c10994a = c10994aArr[iM22028c];
                    AbstractC9979u.m20291d(c10994a);
                    list.add(c10994a);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        /* renamed from: m */
        public final int m22038m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iM22034i = m22034i();
                if ((iM22034i & 128) == 0) {
                    return i11 + (iM22034i << i13);
                }
                i11 += (iM22034i & 127) << i13;
                i13 += 7;
            }
        }

        /* renamed from: n */
        public final void m22039n(int i10) {
            m22032g(-1, new C10994a(m22031f(i10), m22035j()));
        }

        /* renamed from: o */
        public final void m22040o() {
            m22032g(-1, new C10994a(C10500a.f25155a.m22022a(m22035j()), m22035j()));
        }

        /* renamed from: p */
        public final void m22041p(int i10) throws IOException {
            this.f25160c.add(new C10994a(m22031f(i10), m22035j()));
        }

        /* renamed from: q */
        public final void m22042q() throws IOException {
            this.f25160c.add(new C10994a(C10500a.f25155a.m22022a(m22035j()), m22035j()));
        }

        public /* synthetic */ a(Source source, int i10, int i11, int i12, AbstractC9972n abstractC9972n) {
            this(source, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    /* renamed from: okhttp3.internal.http2.a$b */
    public static final class b {

        /* renamed from: a */
        public int f25166a;

        /* renamed from: b */
        public final boolean f25167b;

        /* renamed from: c */
        public final Buffer f25168c;

        /* renamed from: d */
        public int f25169d;

        /* renamed from: e */
        public boolean f25170e;

        /* renamed from: f */
        public int f25171f;

        /* renamed from: g */
        public C10994a[] f25172g;

        /* renamed from: h */
        public int f25173h;

        /* renamed from: i */
        public int f25174i;

        /* renamed from: j */
        public int f25175j;

        public b(int i10, boolean z10, Buffer out) {
            AbstractC9979u.m20294g(out, "out");
            this.f25166a = i10;
            this.f25167b = z10;
            this.f25168c = out;
            this.f25169d = Integer.MAX_VALUE;
            this.f25171f = i10;
            this.f25172g = new C10994a[8];
            this.f25173h = r2.length - 1;
        }

        /* renamed from: a */
        public final void m22043a() {
            int i10 = this.f25171f;
            int i11 = this.f25175j;
            if (i10 < i11) {
                if (i10 == 0) {
                    m22044b();
                } else {
                    m22045c(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        public final void m22044b() {
            AbstractC10964p.m23991F(this.f25172g, null, 0, 0, 6, null);
            this.f25173h = this.f25172g.length - 1;
            this.f25174i = 0;
            this.f25175j = 0;
        }

        /* renamed from: c */
        public final int m22045c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f25172g.length;
                while (true) {
                    length--;
                    i11 = this.f25173h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C10994a c10994a = this.f25172g[length];
                    AbstractC9979u.m20291d(c10994a);
                    i10 -= c10994a.f26510c;
                    int i13 = this.f25175j;
                    C10994a c10994a2 = this.f25172g[length];
                    AbstractC9979u.m20291d(c10994a2);
                    this.f25175j = i13 - c10994a2.f26510c;
                    this.f25174i--;
                    i12++;
                }
                C10994a[] c10994aArr = this.f25172g;
                System.arraycopy(c10994aArr, i11 + 1, c10994aArr, i11 + 1 + i12, this.f25174i);
                C10994a[] c10994aArr2 = this.f25172g;
                int i14 = this.f25173h;
                Arrays.fill(c10994aArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f25173h += i12;
            }
            return i12;
        }

        /* renamed from: d */
        public final void m22046d(C10994a c10994a) {
            int i10 = c10994a.f26510c;
            int i11 = this.f25171f;
            if (i10 > i11) {
                m22044b();
                return;
            }
            m22045c((this.f25175j + i10) - i11);
            int i12 = this.f25174i + 1;
            C10994a[] c10994aArr = this.f25172g;
            if (i12 > c10994aArr.length) {
                C10994a[] c10994aArr2 = new C10994a[c10994aArr.length * 2];
                System.arraycopy(c10994aArr, 0, c10994aArr2, c10994aArr.length, c10994aArr.length);
                this.f25173h = this.f25172g.length - 1;
                this.f25172g = c10994aArr2;
            }
            int i13 = this.f25173h;
            this.f25173h = i13 - 1;
            this.f25172g[i13] = c10994a;
            this.f25174i++;
            this.f25175j += i10;
        }

        /* renamed from: e */
        public final void m22047e(int i10) {
            this.f25166a = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f25171f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f25169d = Math.min(this.f25169d, iMin);
            }
            this.f25170e = true;
            this.f25171f = iMin;
            m22043a();
        }

        /* renamed from: f */
        public final void m22048f(ByteString data) {
            AbstractC9979u.m20294g(data, "data");
            if (this.f25167b) {
                C10998e c10998e = C10998e.f26553a;
                if (c10998e.m24298d(data) < data.size()) {
                    Buffer buffer = new Buffer();
                    c10998e.m24297c(data, buffer);
                    ByteString byteString = buffer.readByteString();
                    m22050h(byteString.size(), 127, 128);
                    this.f25168c.write(byteString);
                    return;
                }
            }
            m22050h(data.size(), 127, 0);
            this.f25168c.write(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m22049g(java.util.List r13) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C10500a.b.m22049g(java.util.List):void");
        }

        /* renamed from: h */
        public final void m22050h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f25168c.writeByte(i10 | i12);
                return;
            }
            this.f25168c.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f25168c.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f25168c.writeByte(i13);
        }

        public /* synthetic */ b(int i10, boolean z10, Buffer buffer, int i11, AbstractC9972n abstractC9972n) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, buffer);
        }
    }
}
