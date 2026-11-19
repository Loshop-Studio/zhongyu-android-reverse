package p172l8;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import p172l8.C8918q;
import p172l8.C8921t;
import p182m8.AbstractC9045d;

/* renamed from: l8.u */
/* loaded from: classes5.dex */
public final class C8922u extends AbstractC8925x {

    /* renamed from: f */
    public static final b f14824f = new b(null);

    /* renamed from: g */
    public static final C8921t f14825g;

    /* renamed from: h */
    public static final C8921t f14826h;

    /* renamed from: i */
    public static final C8921t f14827i;

    /* renamed from: j */
    public static final C8921t f14828j;

    /* renamed from: k */
    public static final C8921t f14829k;

    /* renamed from: l */
    public static final byte[] f14830l;

    /* renamed from: m */
    public static final byte[] f14831m;

    /* renamed from: n */
    public static final byte[] f14832n;

    /* renamed from: a */
    public final ByteString f14833a;

    /* renamed from: b */
    public final C8921t f14834b;

    /* renamed from: c */
    public final List f14835c;

    /* renamed from: d */
    public final C8921t f14836d;

    /* renamed from: e */
    public long f14837e;

    /* renamed from: l8.u$a */
    public static final class a {

        /* renamed from: a */
        public final ByteString f14838a;

        /* renamed from: b */
        public C8921t f14839b;

        /* renamed from: c */
        public final List f14840c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public final a m14038a(String name, String str, AbstractC8925x body) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(body, "body");
            m14040c(c.f14841c.m14047b(name, str, body));
            return this;
        }

        /* renamed from: b */
        public final a m14039b(C8918q c8918q, AbstractC8925x body) {
            Intrinsics.checkNotNullParameter(body, "body");
            m14040c(c.f14841c.m14046a(c8918q, body));
            return this;
        }

        /* renamed from: c */
        public final a m14040c(c part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.f14840c.add(part);
            return this;
        }

        /* renamed from: d */
        public final C8922u m14041d() {
            if (this.f14840c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new C8922u(this.f14838a, this.f14839b, AbstractC9045d.m14477S(this.f14840c));
        }

        /* renamed from: e */
        public final a m14042e(C8921t type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type.m14033h(), "multipart")) {
                this.f14839b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public a(String boundary) {
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.f14838a = ByteString.INSTANCE.encodeUtf8(boundary);
            this.f14839b = C8922u.f14825g;
            this.f14840c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i9 & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    /* renamed from: l8.u$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m14043a(StringBuilder sb, String key) {
            Intrinsics.checkNotNullParameter(sb, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            sb.append(Typography.quote);
            int length = key.length();
            for (int i9 = 0; i9 < length; i9++) {
                char cCharAt = key.charAt(i9);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(cCharAt);
                }
            }
            sb.append(Typography.quote);
        }

        public b() {
        }
    }

    /* renamed from: l8.u$c */
    public static final class c {

        /* renamed from: c */
        public static final a f14841c = new a(null);

        /* renamed from: a */
        public final C8918q f14842a;

        /* renamed from: b */
        public final AbstractC8925x f14843b;

        /* renamed from: l8.u$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final c m14046a(C8918q c8918q, AbstractC8925x body) {
                Intrinsics.checkNotNullParameter(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if ((c8918q != null ? c8918q.m13936a(HttpHeaders.CONTENT_TYPE) : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((c8918q != null ? c8918q.m13936a(HttpHeaders.CONTENT_LENGTH) : null) == null) {
                    return new c(c8918q, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            /* renamed from: b */
            public final c m14047b(String name, String str, AbstractC8925x body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                b bVar = C8922u.f14824f;
                bVar.m14043a(sb, name);
                if (str != null) {
                    sb.append("; filename=");
                    bVar.m14043a(sb, str);
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return m14046a(new C8918q.a().m13946e(HttpHeaders.CONTENT_DISPOSITION, string).m13947f(), body);
            }

            public a() {
            }
        }

        public /* synthetic */ c(C8918q c8918q, AbstractC8925x abstractC8925x, DefaultConstructorMarker defaultConstructorMarker) {
            this(c8918q, abstractC8925x);
        }

        /* renamed from: a */
        public final AbstractC8925x m14044a() {
            return this.f14843b;
        }

        /* renamed from: b */
        public final C8918q m14045b() {
            return this.f14842a;
        }

        public c(C8918q c8918q, AbstractC8925x abstractC8925x) {
            this.f14842a = c8918q;
            this.f14843b = abstractC8925x;
        }
    }

    static {
        C8921t.a aVar = C8921t.f14817e;
        f14825g = aVar.m14034a("multipart/mixed");
        f14826h = aVar.m14034a("multipart/alternative");
        f14827i = aVar.m14034a("multipart/digest");
        f14828j = aVar.m14034a("multipart/parallel");
        f14829k = aVar.m14034a("multipart/form-data");
        f14830l = new byte[]{58, 32};
        f14831m = new byte[]{13, 10};
        f14832n = new byte[]{45, 45};
    }

    public C8922u(ByteString boundaryByteString, C8921t type, List parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f14833a = boundaryByteString;
        this.f14834b = type;
        this.f14835c = parts;
        this.f14836d = C8921t.f14817e.m14034a(type + "; boundary=" + m14037a());
        this.f14837e = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final long m14036b(BufferedSink bufferedSink, boolean z9) throws IOException {
        Buffer buffer;
        if (z9) {
            bufferedSink = new Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.f14835c.size();
        long j9 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            c cVar = (c) this.f14835c.get(i9);
            C8918q c8918qM14045b = cVar.m14045b();
            AbstractC8925x abstractC8925xM14044a = cVar.m14044a();
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.write(f14832n);
            bufferedSink.write(this.f14833a);
            bufferedSink.write(f14831m);
            if (c8918qM14045b != null) {
                int size2 = c8918qM14045b.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    bufferedSink.writeUtf8(c8918qM14045b.m13937b(i10)).write(f14830l).writeUtf8(c8918qM14045b.m13940f(i10)).write(f14831m);
                }
            }
            C8921t c8921tContentType = abstractC8925xM14044a.contentType();
            if (c8921tContentType != null) {
                bufferedSink.writeUtf8("Content-Type: ").writeUtf8(c8921tContentType.toString()).write(f14831m);
            }
            long jContentLength = abstractC8925xM14044a.contentLength();
            if (jContentLength != -1) {
                bufferedSink.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(f14831m);
            } else if (z9) {
                Intrinsics.checkNotNull(buffer);
                buffer.clear();
                return -1L;
            }
            byte[] bArr = f14831m;
            bufferedSink.write(bArr);
            if (z9) {
                j9 += jContentLength;
            } else {
                abstractC8925xM14044a.writeTo(bufferedSink);
            }
            bufferedSink.write(bArr);
        }
        Intrinsics.checkNotNull(bufferedSink);
        byte[] bArr2 = f14832n;
        bufferedSink.write(bArr2);
        bufferedSink.write(this.f14833a);
        bufferedSink.write(bArr2);
        bufferedSink.write(f14831m);
        if (!z9) {
            return j9;
        }
        Intrinsics.checkNotNull(buffer);
        long size3 = j9 + buffer.size();
        buffer.clear();
        return size3;
    }

    /* renamed from: a */
    public final String m14037a() {
        return this.f14833a.utf8();
    }

    @Override // p172l8.AbstractC8925x
    public long contentLength() throws IOException {
        long j9 = this.f14837e;
        if (j9 != -1) {
            return j9;
        }
        long jM14036b = m14036b(null, true);
        this.f14837e = jM14036b;
        return jM14036b;
    }

    @Override // p172l8.AbstractC8925x
    public C8921t contentType() {
        return this.f14836d;
    }

    @Override // p172l8.AbstractC8925x
    public void writeTo(BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        m14036b(sink, false);
    }
}
