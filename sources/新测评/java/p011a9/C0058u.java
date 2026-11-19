package p011a9;

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
import p011a9.C0054q;
import p011a9.C0057t;
import p028b9.AbstractC5070d;

/* renamed from: a9.u */
/* loaded from: classes5.dex */
public final class C0058u extends AbstractC0061x {

    /* renamed from: f */
    public static final b f196f = new b(null);

    /* renamed from: g */
    public static final C0057t f197g;

    /* renamed from: h */
    public static final C0057t f198h;

    /* renamed from: i */
    public static final C0057t f199i;

    /* renamed from: j */
    public static final C0057t f200j;

    /* renamed from: k */
    public static final C0057t f201k;

    /* renamed from: l */
    public static final byte[] f202l;

    /* renamed from: m */
    public static final byte[] f203m;

    /* renamed from: n */
    public static final byte[] f204n;

    /* renamed from: a */
    public final ByteString f205a;

    /* renamed from: b */
    public final C0057t f206b;

    /* renamed from: c */
    public final List f207c;

    /* renamed from: d */
    public final C0057t f208d;

    /* renamed from: e */
    public long f209e;

    /* renamed from: a9.u$a */
    public static final class a {

        /* renamed from: a */
        public final ByteString f210a;

        /* renamed from: b */
        public C0057t f211b;

        /* renamed from: c */
        public final List f212c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public final a m282a(String name, String str, AbstractC0061x body) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(body, "body");
            m284c(c.f213c.m291b(name, str, body));
            return this;
        }

        /* renamed from: b */
        public final a m283b(C0054q c0054q, AbstractC0061x body) {
            Intrinsics.checkNotNullParameter(body, "body");
            m284c(c.f213c.m290a(c0054q, body));
            return this;
        }

        /* renamed from: c */
        public final a m284c(c part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.f212c.add(part);
            return this;
        }

        /* renamed from: d */
        public final C0058u m285d() {
            if (this.f212c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new C0058u(this.f210a, this.f211b, AbstractC5070d.m2628S(this.f212c));
        }

        /* renamed from: e */
        public final a m286e(C0057t type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type.m277h(), "multipart")) {
                this.f211b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public a(String boundary) {
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.f210a = ByteString.INSTANCE.encodeUtf8(boundary);
            this.f211b = C0058u.f197g;
            this.f212c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    /* renamed from: a9.u$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m287a(StringBuilder sb, String key) {
            Intrinsics.checkNotNullParameter(sb, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            sb.append(Typography.quote);
            int length = key.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = key.charAt(i10);
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

    /* renamed from: a9.u$c */
    public static final class c {

        /* renamed from: c */
        public static final a f213c = new a(null);

        /* renamed from: a */
        public final C0054q f214a;

        /* renamed from: b */
        public final AbstractC0061x f215b;

        /* renamed from: a9.u$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final c m290a(C0054q c0054q, AbstractC0061x body) {
                Intrinsics.checkNotNullParameter(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if ((c0054q != null ? c0054q.m180a(HttpHeaders.CONTENT_TYPE) : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((c0054q != null ? c0054q.m180a(HttpHeaders.CONTENT_LENGTH) : null) == null) {
                    return new c(c0054q, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            /* renamed from: b */
            public final c m291b(String name, String str, AbstractC0061x body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                b bVar = C0058u.f196f;
                bVar.m287a(sb, name);
                if (str != null) {
                    sb.append("; filename=");
                    bVar.m287a(sb, str);
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return m290a(new C0054q.a().m190e(HttpHeaders.CONTENT_DISPOSITION, string).m191f(), body);
            }

            public a() {
            }
        }

        public /* synthetic */ c(C0054q c0054q, AbstractC0061x abstractC0061x, DefaultConstructorMarker defaultConstructorMarker) {
            this(c0054q, abstractC0061x);
        }

        /* renamed from: a */
        public final AbstractC0061x m288a() {
            return this.f215b;
        }

        /* renamed from: b */
        public final C0054q m289b() {
            return this.f214a;
        }

        public c(C0054q c0054q, AbstractC0061x abstractC0061x) {
            this.f214a = c0054q;
            this.f215b = abstractC0061x;
        }
    }

    static {
        C0057t.a aVar = C0057t.f189e;
        f197g = aVar.m278a("multipart/mixed");
        f198h = aVar.m278a("multipart/alternative");
        f199i = aVar.m278a("multipart/digest");
        f200j = aVar.m278a("multipart/parallel");
        f201k = aVar.m278a("multipart/form-data");
        f202l = new byte[]{58, 32};
        f203m = new byte[]{13, 10};
        f204n = new byte[]{45, 45};
    }

    public C0058u(ByteString boundaryByteString, C0057t type, List parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f205a = boundaryByteString;
        this.f206b = type;
        this.f207c = parts;
        this.f208d = C0057t.f189e.m278a(type + "; boundary=" + m281a());
        this.f209e = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final long m280b(BufferedSink bufferedSink, boolean z9) throws IOException {
        Buffer buffer;
        if (z9) {
            bufferedSink = new Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.f207c.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) this.f207c.get(i10);
            C0054q c0054qM289b = cVar.m289b();
            AbstractC0061x abstractC0061xM288a = cVar.m288a();
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.write(f204n);
            bufferedSink.write(this.f205a);
            bufferedSink.write(f203m);
            if (c0054qM289b != null) {
                int size2 = c0054qM289b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    bufferedSink.writeUtf8(c0054qM289b.m181b(i11)).write(f202l).writeUtf8(c0054qM289b.m184f(i11)).write(f203m);
                }
            }
            C0057t contentType = abstractC0061xM288a.getContentType();
            if (contentType != null) {
                bufferedSink.writeUtf8("Content-Type: ").writeUtf8(contentType.toString()).write(f203m);
            }
            long jContentLength = abstractC0061xM288a.contentLength();
            if (jContentLength != -1) {
                bufferedSink.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(f203m);
            } else if (z9) {
                Intrinsics.checkNotNull(buffer);
                buffer.clear();
                return -1L;
            }
            byte[] bArr = f203m;
            bufferedSink.write(bArr);
            if (z9) {
                j10 += jContentLength;
            } else {
                abstractC0061xM288a.writeTo(bufferedSink);
            }
            bufferedSink.write(bArr);
        }
        Intrinsics.checkNotNull(bufferedSink);
        byte[] bArr2 = f204n;
        bufferedSink.write(bArr2);
        bufferedSink.write(this.f205a);
        bufferedSink.write(bArr2);
        bufferedSink.write(f203m);
        if (!z9) {
            return j10;
        }
        Intrinsics.checkNotNull(buffer);
        long size3 = j10 + buffer.size();
        buffer.clear();
        return size3;
    }

    /* renamed from: a */
    public final String m281a() {
        return this.f205a.utf8();
    }

    @Override // p011a9.AbstractC0061x
    public long contentLength() throws IOException {
        long j10 = this.f209e;
        if (j10 != -1) {
            return j10;
        }
        long jM280b = m280b(null, true);
        this.f209e = jM280b;
        return jM280b;
    }

    @Override // p011a9.AbstractC0061x
    /* renamed from: contentType */
    public C0057t getContentType() {
        return this.f208d;
    }

    @Override // p011a9.AbstractC0061x
    public void writeTo(BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        m280b(sink, false);
    }
}
