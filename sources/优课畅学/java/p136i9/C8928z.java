package p136i9;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import p136i9.C8924v;
import p136i9.C8927y;
import p147j9.AbstractC9041k;

/* renamed from: i9.z */
/* loaded from: classes5.dex */
public final class C8928z extends AbstractC8901c0 {

    /* renamed from: f */
    public static final b f16822f = new b(null);

    /* renamed from: g */
    public static final C8927y f16823g;

    /* renamed from: h */
    public static final C8927y f16824h;

    /* renamed from: i */
    public static final C8927y f16825i;

    /* renamed from: j */
    public static final C8927y f16826j;

    /* renamed from: k */
    public static final C8927y f16827k;

    /* renamed from: l */
    public static final byte[] f16828l;

    /* renamed from: m */
    public static final byte[] f16829m;

    /* renamed from: n */
    public static final byte[] f16830n;

    /* renamed from: a */
    public final ByteString f16831a;

    /* renamed from: b */
    public final C8927y f16832b;

    /* renamed from: c */
    public final List f16833c;

    /* renamed from: d */
    public final C8927y f16834d;

    /* renamed from: e */
    public long f16835e;

    /* renamed from: i9.z$a */
    public static final class a {

        /* renamed from: a */
        public final ByteString f16836a;

        /* renamed from: b */
        public C8927y f16837b;

        /* renamed from: c */
        public final List f16838c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public final a m15346a(C8924v c8924v, AbstractC8901c0 body) {
            AbstractC9133u.m16133g(body, "body");
            m15347b(c.f16839c.m15353a(c8924v, body));
            return this;
        }

        /* renamed from: b */
        public final a m15347b(c part) {
            AbstractC9133u.m16133g(part, "part");
            this.f16838c.add(part);
            return this;
        }

        /* renamed from: c */
        public final C8928z m15348c() {
            if (this.f16838c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new C8928z(this.f16836a, this.f16837b, AbstractC9041k.m15792v(this.f16838c));
        }

        /* renamed from: d */
        public final a m15349d(C8927y type) {
            AbstractC9133u.m16133g(type, "type");
            if (AbstractC9133u.m16128b(type.m15341h(), "multipart")) {
                this.f16837b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public a(String boundary) {
            AbstractC9133u.m16133g(boundary, "boundary");
            this.f16836a = ByteString.Companion.encodeUtf8(boundary);
            this.f16837b = C8928z.f16823g;
            this.f16838c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i10, AbstractC9126n abstractC9126n) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                AbstractC9133u.m16132f(str, "toString(...)");
            }
            this(str);
        }
    }

    /* renamed from: i9.z$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final void m15350a(StringBuilder sb, String key) {
            AbstractC9133u.m16133g(sb, "<this>");
            AbstractC9133u.m16133g(key, "key");
            sb.append('\"');
            int length = key.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = key.charAt(i10);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt != '\"') {
                    sb.append(cCharAt);
                } else {
                    sb.append("%22");
                }
            }
            sb.append('\"');
        }

        public b() {
        }
    }

    /* renamed from: i9.z$c */
    public static final class c {

        /* renamed from: c */
        public static final a f16839c = new a(null);

        /* renamed from: a */
        public final C8924v f16840a;

        /* renamed from: b */
        public final AbstractC8901c0 f16841b;

        /* renamed from: i9.z$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC9126n abstractC9126n) {
                this();
            }

            /* renamed from: a */
            public final c m15353a(C8924v c8924v, AbstractC8901c0 body) {
                AbstractC9133u.m16133g(body, "body");
                AbstractC9126n abstractC9126n = null;
                if ((c8924v != null ? c8924v.m15260a(HttpHeaders.CONTENT_TYPE) : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((c8924v != null ? c8924v.m15260a(HttpHeaders.CONTENT_LENGTH) : null) == null) {
                    return new c(c8924v, body, abstractC9126n);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            /* renamed from: b */
            public final c m15354b(String name, String str, AbstractC8901c0 body) {
                AbstractC9133u.m16133g(name, "name");
                AbstractC9133u.m16133g(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                b bVar = C8928z.f16822f;
                bVar.m15350a(sb, name);
                if (str != null) {
                    sb.append("; filename=");
                    bVar.m15350a(sb, str);
                }
                return m15353a(new C8924v.a().m15271e(HttpHeaders.CONTENT_DISPOSITION, sb.toString()).m15272f(), body);
            }

            public a() {
            }
        }

        public /* synthetic */ c(C8924v c8924v, AbstractC8901c0 abstractC8901c0, AbstractC9126n abstractC9126n) {
            this(c8924v, abstractC8901c0);
        }

        /* renamed from: a */
        public final AbstractC8901c0 m15351a() {
            return this.f16841b;
        }

        /* renamed from: b */
        public final C8924v m15352b() {
            return this.f16840a;
        }

        public c(C8924v c8924v, AbstractC8901c0 abstractC8901c0) {
            this.f16840a = c8924v;
            this.f16841b = abstractC8901c0;
        }
    }

    static {
        C8927y.a aVar = C8927y.f16815e;
        f16823g = aVar.m15342a("multipart/mixed");
        f16824h = aVar.m15342a("multipart/alternative");
        f16825i = aVar.m15342a("multipart/digest");
        f16826j = aVar.m15342a("multipart/parallel");
        f16827k = aVar.m15342a("multipart/form-data");
        f16828l = new byte[]{58, 32};
        f16829m = new byte[]{13, 10};
        f16830n = new byte[]{45, 45};
    }

    public C8928z(ByteString boundaryByteString, C8927y type, List parts) {
        AbstractC9133u.m16133g(boundaryByteString, "boundaryByteString");
        AbstractC9133u.m16133g(type, "type");
        AbstractC9133u.m16133g(parts, "parts");
        this.f16831a = boundaryByteString;
        this.f16832b = type;
        this.f16833c = parts;
        this.f16834d = C8927y.f16815e.m15342a(type + "; boundary=" + m15345a());
        this.f16835e = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final long m15344b(BufferedSink bufferedSink, boolean z10) throws EOFException {
        Buffer buffer;
        if (z10) {
            bufferedSink = new Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.f16833c.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) this.f16833c.get(i10);
            C8924v c8924vM15352b = cVar.m15352b();
            AbstractC8901c0 abstractC8901c0M15351a = cVar.m15351a();
            AbstractC9133u.m16130d(bufferedSink);
            bufferedSink.write(f16830n);
            bufferedSink.write(this.f16831a);
            bufferedSink.write(f16829m);
            if (c8924vM15352b != null) {
                int size2 = c8924vM15352b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    bufferedSink.writeUtf8(c8924vM15352b.m15262c(i11)).write(f16828l).writeUtf8(c8924vM15352b.m15265g(i11)).write(f16829m);
                }
            }
            C8927y c8927yContentType = abstractC8901c0M15351a.contentType();
            if (c8927yContentType != null) {
                bufferedSink.writeUtf8("Content-Type: ").writeUtf8(c8927yContentType.toString()).write(f16829m);
            }
            long jContentLength = abstractC8901c0M15351a.contentLength();
            if (jContentLength == -1 && z10) {
                AbstractC9133u.m16130d(buffer);
                buffer.clear();
                return -1L;
            }
            byte[] bArr = f16829m;
            bufferedSink.write(bArr);
            if (z10) {
                j10 += jContentLength;
            } else {
                abstractC8901c0M15351a.writeTo(bufferedSink);
            }
            bufferedSink.write(bArr);
        }
        AbstractC9133u.m16130d(bufferedSink);
        byte[] bArr2 = f16830n;
        bufferedSink.write(bArr2);
        bufferedSink.write(this.f16831a);
        bufferedSink.write(bArr2);
        bufferedSink.write(f16829m);
        if (!z10) {
            return j10;
        }
        AbstractC9133u.m16130d(buffer);
        long size3 = j10 + buffer.size();
        buffer.clear();
        return size3;
    }

    /* renamed from: a */
    public final String m15345a() {
        return this.f16831a.utf8();
    }

    @Override // p136i9.AbstractC8901c0
    public long contentLength() throws EOFException {
        long j10 = this.f16835e;
        if (j10 != -1) {
            return j10;
        }
        long jM15344b = m15344b(null, true);
        this.f16835e = jM15344b;
        return jM15344b;
    }

    @Override // p136i9.AbstractC8901c0
    public C8927y contentType() {
        return this.f16834d;
    }

    @Override // p136i9.AbstractC8901c0
    public boolean isOneShot() {
        List list = this.f16833c;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).m15351a().isOneShot()) {
                return true;
            }
        }
        return false;
    }

    @Override // p136i9.AbstractC8901c0
    public void writeTo(BufferedSink sink) throws EOFException {
        AbstractC9133u.m16133g(sink, "sink");
        m15344b(sink, false);
    }
}
