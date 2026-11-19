package je;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import je.C9737q;
import je.C9740t;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* renamed from: je.u */
/* loaded from: classes6.dex */
public final class C9741u extends AbstractC9744x {

    /* renamed from: f */
    public static final b f22777f = new b(null);

    /* renamed from: g */
    public static final C9740t f22778g;

    /* renamed from: h */
    public static final C9740t f22779h;

    /* renamed from: i */
    public static final C9740t f22780i;

    /* renamed from: j */
    public static final C9740t f22781j;

    /* renamed from: k */
    public static final C9740t f22782k;

    /* renamed from: l */
    public static final byte[] f22783l;

    /* renamed from: m */
    public static final byte[] f22784m;

    /* renamed from: n */
    public static final byte[] f22785n;

    /* renamed from: a */
    public final ByteString f22786a;

    /* renamed from: b */
    public final C9740t f22787b;

    /* renamed from: c */
    public final List f22788c;

    /* renamed from: d */
    public final C9740t f22789d;

    /* renamed from: e */
    public long f22790e;

    /* renamed from: je.u$a */
    public static final class a {

        /* renamed from: a */
        public final ByteString f22791a;

        /* renamed from: b */
        public C9740t f22792b;

        /* renamed from: c */
        public final List f22793c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public final a m19492a(String name, String str, AbstractC9744x body) {
            AbstractC9979u.m20294g(name, "name");
            AbstractC9979u.m20294g(body, "body");
            m19494c(c.f22794c.m19501b(name, str, body));
            return this;
        }

        /* renamed from: b */
        public final a m19493b(C9737q c9737q, AbstractC9744x body) {
            AbstractC9979u.m20294g(body, "body");
            m19494c(c.f22794c.m19500a(c9737q, body));
            return this;
        }

        /* renamed from: c */
        public final a m19494c(c part) {
            AbstractC9979u.m20294g(part, "part");
            this.f22793c.add(part);
            return this;
        }

        /* renamed from: d */
        public final C9741u m19495d() {
            if (this.f22793c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new C9741u(this.f22791a, this.f22792b, AbstractC9920d.m20011S(this.f22793c));
        }

        /* renamed from: e */
        public final a m19496e(C9740t type) {
            AbstractC9979u.m20294g(type, "type");
            if (AbstractC9979u.m20289b(type.m19487i(), "multipart")) {
                this.f22792b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public a(String boundary) {
            AbstractC9979u.m20294g(boundary, "boundary");
            this.f22791a = ByteString.Companion.encodeUtf8(boundary);
            this.f22792b = C9741u.f22778g;
            this.f22793c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i10, AbstractC9972n abstractC9972n) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                AbstractC9979u.m20293f(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    /* renamed from: je.u$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final void m19497a(StringBuilder sb2, String key) {
            AbstractC9979u.m20294g(sb2, "<this>");
            AbstractC9979u.m20294g(key, "key");
            sb2.append('\"');
            int length = key.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = key.charAt(i10);
                if (cCharAt == '\n') {
                    sb2.append("%0A");
                } else if (cCharAt == '\r') {
                    sb2.append("%0D");
                } else if (cCharAt == '\"') {
                    sb2.append("%22");
                } else {
                    sb2.append(cCharAt);
                }
            }
            sb2.append('\"');
        }

        public b() {
        }
    }

    /* renamed from: je.u$c */
    public static final class c {

        /* renamed from: c */
        public static final a f22794c = new a(null);

        /* renamed from: a */
        public final C9737q f22795a;

        /* renamed from: b */
        public final AbstractC9744x f22796b;

        /* renamed from: je.u$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC9972n abstractC9972n) {
                this();
            }

            /* renamed from: a */
            public final c m19500a(C9737q c9737q, AbstractC9744x body) {
                AbstractC9979u.m20294g(body, "body");
                AbstractC9972n abstractC9972n = null;
                if ((c9737q != null ? c9737q.m19389a("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((c9737q != null ? c9737q.m19389a("Content-Length") : null) == null) {
                    return new c(c9737q, body, abstractC9972n);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            /* renamed from: b */
            public final c m19501b(String name, String str, AbstractC9744x body) {
                AbstractC9979u.m20294g(name, "name");
                AbstractC9979u.m20294g(body, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                b bVar = C9741u.f22777f;
                bVar.m19497a(sb2, name);
                if (str != null) {
                    sb2.append("; filename=");
                    bVar.m19497a(sb2, str);
                }
                String string = sb2.toString();
                AbstractC9979u.m20293f(string, "StringBuilder().apply(builderAction).toString()");
                return m19500a(new C9737q.a().m19399e(HttpHeaders.CONTENT_DISPOSITION, string).m19400f(), body);
            }

            public a() {
            }
        }

        public /* synthetic */ c(C9737q c9737q, AbstractC9744x abstractC9744x, AbstractC9972n abstractC9972n) {
            this(c9737q, abstractC9744x);
        }

        /* renamed from: a */
        public final AbstractC9744x m19498a() {
            return this.f22796b;
        }

        /* renamed from: b */
        public final C9737q m19499b() {
            return this.f22795a;
        }

        public c(C9737q c9737q, AbstractC9744x abstractC9744x) {
            this.f22795a = c9737q;
            this.f22796b = abstractC9744x;
        }
    }

    static {
        C9740t.a aVar = C9740t.f22770e;
        f22778g = aVar.m19488a("multipart/mixed");
        f22779h = aVar.m19488a("multipart/alternative");
        f22780i = aVar.m19488a("multipart/digest");
        f22781j = aVar.m19488a("multipart/parallel");
        f22782k = aVar.m19488a("multipart/form-data");
        f22783l = new byte[]{58, 32};
        f22784m = new byte[]{13, 10};
        f22785n = new byte[]{45, 45};
    }

    public C9741u(ByteString boundaryByteString, C9740t type, List parts) {
        AbstractC9979u.m20294g(boundaryByteString, "boundaryByteString");
        AbstractC9979u.m20294g(type, "type");
        AbstractC9979u.m20294g(parts, "parts");
        this.f22786a = boundaryByteString;
        this.f22787b = type;
        this.f22788c = parts;
        this.f22789d = C9740t.f22770e.m19488a(type + "; boundary=" + m19491a());
        this.f22790e = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final long m19490b(BufferedSink bufferedSink, boolean z10) throws EOFException {
        Buffer buffer;
        if (z10) {
            bufferedSink = new Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.f22788c.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) this.f22788c.get(i10);
            C9737q c9737qM19499b = cVar.m19499b();
            AbstractC9744x abstractC9744xM19498a = cVar.m19498a();
            AbstractC9979u.m20291d(bufferedSink);
            bufferedSink.write(f22785n);
            bufferedSink.write(this.f22786a);
            bufferedSink.write(f22784m);
            if (c9737qM19499b != null) {
                int size2 = c9737qM19499b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    bufferedSink.writeUtf8(c9737qM19499b.m19390b(i11)).write(f22783l).writeUtf8(c9737qM19499b.m19393f(i11)).write(f22784m);
                }
            }
            C9740t c9740tContentType = abstractC9744xM19498a.contentType();
            if (c9740tContentType != null) {
                bufferedSink.writeUtf8("Content-Type: ").writeUtf8(c9740tContentType.toString()).write(f22784m);
            }
            long jContentLength = abstractC9744xM19498a.contentLength();
            if (jContentLength != -1) {
                bufferedSink.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(f22784m);
            } else if (z10) {
                AbstractC9979u.m20291d(buffer);
                buffer.clear();
                return -1L;
            }
            byte[] bArr = f22784m;
            bufferedSink.write(bArr);
            if (z10) {
                j10 += jContentLength;
            } else {
                abstractC9744xM19498a.writeTo(bufferedSink);
            }
            bufferedSink.write(bArr);
        }
        AbstractC9979u.m20291d(bufferedSink);
        byte[] bArr2 = f22785n;
        bufferedSink.write(bArr2);
        bufferedSink.write(this.f22786a);
        bufferedSink.write(bArr2);
        bufferedSink.write(f22784m);
        if (!z10) {
            return j10;
        }
        AbstractC9979u.m20291d(buffer);
        long size3 = j10 + buffer.size();
        buffer.clear();
        return size3;
    }

    /* renamed from: a */
    public final String m19491a() {
        return this.f22786a.utf8();
    }

    @Override // je.AbstractC9744x
    public long contentLength() throws EOFException {
        long j10 = this.f22790e;
        if (j10 != -1) {
            return j10;
        }
        long jM19490b = m19490b(null, true);
        this.f22790e = jM19490b;
        return jM19490b;
    }

    @Override // je.AbstractC9744x
    public C9740t contentType() {
        return this.f22789d;
    }

    @Override // je.AbstractC9744x
    public void writeTo(BufferedSink sink) throws EOFException {
        AbstractC9979u.m20294g(sink, "sink");
        m19490b(sink, false);
    }
}
