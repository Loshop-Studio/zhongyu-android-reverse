package p058f5;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import p058f5.C6383v;
import p058f5.C6386y;
import p065g5.AbstractC6427k;

/* renamed from: f5.z */
/* loaded from: classes4.dex */
public final class C6387z extends AbstractC6360c0 {

    /* renamed from: f */
    public static final b f7990f = new b(null);

    /* renamed from: g */
    public static final C6386y f7991g;

    /* renamed from: h */
    public static final C6386y f7992h;

    /* renamed from: i */
    public static final C6386y f7993i;

    /* renamed from: j */
    public static final C6386y f7994j;

    /* renamed from: k */
    public static final C6386y f7995k;

    /* renamed from: l */
    public static final byte[] f7996l;

    /* renamed from: m */
    public static final byte[] f7997m;

    /* renamed from: n */
    public static final byte[] f7998n;

    /* renamed from: a */
    public final ByteString f7999a;

    /* renamed from: b */
    public final C6386y f8000b;

    /* renamed from: c */
    public final List f8001c;

    /* renamed from: d */
    public final C6386y f8002d;

    /* renamed from: e */
    public long f8003e;

    /* renamed from: f5.z$a */
    public static final class a {

        /* renamed from: a */
        public final ByteString f8004a;

        /* renamed from: b */
        public C6386y f8005b;

        /* renamed from: c */
        public final List f8006c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public final a m6885a(String name, String str, AbstractC6360c0 body) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(body, "body");
            m6887c(c.f8007c.m6894b(name, str, body));
            return this;
        }

        /* renamed from: b */
        public final a m6886b(C6383v c6383v, AbstractC6360c0 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            m6887c(c.f8007c.m6893a(c6383v, body));
            return this;
        }

        /* renamed from: c */
        public final a m6887c(c part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.f8006c.add(part);
            return this;
        }

        /* renamed from: d */
        public final C6387z m6888d() {
            if (this.f8006c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new C6387z(this.f8004a, this.f8005b, AbstractC6427k.m7034v(this.f8006c));
        }

        /* renamed from: e */
        public final a m6889e(C6386y type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type.m6880h(), "multipart")) {
                this.f8005b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public a(String boundary) {
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.f8004a = ByteString.INSTANCE.encodeUtf8(boundary);
            this.f8005b = C6387z.f7991g;
            this.f8006c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i6 & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            }
            this(str);
        }
    }

    /* renamed from: f5.z$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m6890a(StringBuilder sb, String key) {
            Intrinsics.checkNotNullParameter(sb, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            sb.append(Typography.quote);
            int length = key.length();
            for (int i6 = 0; i6 < length; i6++) {
                char cCharAt = key.charAt(i6);
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
            sb.append(Typography.quote);
        }

        public b() {
        }
    }

    /* renamed from: f5.z$c */
    public static final class c {

        /* renamed from: c */
        public static final a f8007c = new a(null);

        /* renamed from: a */
        public final C6383v f8008a;

        /* renamed from: b */
        public final AbstractC6360c0 f8009b;

        /* renamed from: f5.z$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final c m6893a(C6383v c6383v, AbstractC6360c0 body) {
                Intrinsics.checkNotNullParameter(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if ((c6383v != null ? c6383v.m6799a(HttpHeaders.CONTENT_TYPE) : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((c6383v != null ? c6383v.m6799a(HttpHeaders.CONTENT_LENGTH) : null) == null) {
                    return new c(c6383v, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            /* renamed from: b */
            public final c m6894b(String name, String str, AbstractC6360c0 body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                b bVar = C6387z.f7990f;
                bVar.m6890a(sb, name);
                if (str != null) {
                    sb.append("; filename=");
                    bVar.m6890a(sb, str);
                }
                return m6893a(new C6383v.a().m6810e(HttpHeaders.CONTENT_DISPOSITION, sb.toString()).m6811f(), body);
            }

            public a() {
            }
        }

        public /* synthetic */ c(C6383v c6383v, AbstractC6360c0 abstractC6360c0, DefaultConstructorMarker defaultConstructorMarker) {
            this(c6383v, abstractC6360c0);
        }

        /* renamed from: a */
        public final AbstractC6360c0 m6891a() {
            return this.f8009b;
        }

        /* renamed from: b */
        public final C6383v m6892b() {
            return this.f8008a;
        }

        public c(C6383v c6383v, AbstractC6360c0 abstractC6360c0) {
            this.f8008a = c6383v;
            this.f8009b = abstractC6360c0;
        }
    }

    static {
        C6386y.a aVar = C6386y.f7983e;
        f7991g = aVar.m6881a("multipart/mixed");
        f7992h = aVar.m6881a("multipart/alternative");
        f7993i = aVar.m6881a("multipart/digest");
        f7994j = aVar.m6881a("multipart/parallel");
        f7995k = aVar.m6881a("multipart/form-data");
        f7996l = new byte[]{58, 32};
        f7997m = new byte[]{13, 10};
        f7998n = new byte[]{45, 45};
    }

    public C6387z(ByteString boundaryByteString, C6386y type, List parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f7999a = boundaryByteString;
        this.f8000b = type;
        this.f8001c = parts;
        this.f8002d = C6386y.f7983e.m6881a(type + "; boundary=" + m6884a());
        this.f8003e = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final long m6883b(BufferedSink bufferedSink, boolean z6) throws EOFException {
        Buffer buffer;
        if (z6) {
            bufferedSink = new Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.f8001c.size();
        long j6 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            c cVar = (c) this.f8001c.get(i6);
            C6383v c6383vM6892b = cVar.m6892b();
            AbstractC6360c0 abstractC6360c0M6891a = cVar.m6891a();
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.write(f7998n);
            bufferedSink.write(this.f7999a);
            bufferedSink.write(f7997m);
            if (c6383vM6892b != null) {
                int size2 = c6383vM6892b.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    bufferedSink.writeUtf8(c6383vM6892b.m6801c(i7)).write(f7996l).writeUtf8(c6383vM6892b.m6804g(i7)).write(f7997m);
                }
            }
            C6386y c6386yContentType = abstractC6360c0M6891a.contentType();
            if (c6386yContentType != null) {
                bufferedSink.writeUtf8("Content-Type: ").writeUtf8(c6386yContentType.toString()).write(f7997m);
            }
            long jContentLength = abstractC6360c0M6891a.contentLength();
            if (jContentLength == -1 && z6) {
                Intrinsics.checkNotNull(buffer);
                buffer.clear();
                return -1L;
            }
            byte[] bArr = f7997m;
            bufferedSink.write(bArr);
            if (z6) {
                j6 += jContentLength;
            } else {
                abstractC6360c0M6891a.writeTo(bufferedSink);
            }
            bufferedSink.write(bArr);
        }
        Intrinsics.checkNotNull(bufferedSink);
        byte[] bArr2 = f7998n;
        bufferedSink.write(bArr2);
        bufferedSink.write(this.f7999a);
        bufferedSink.write(bArr2);
        bufferedSink.write(f7997m);
        if (!z6) {
            return j6;
        }
        Intrinsics.checkNotNull(buffer);
        long size3 = j6 + buffer.size();
        buffer.clear();
        return size3;
    }

    /* renamed from: a */
    public final String m6884a() {
        return this.f7999a.utf8();
    }

    @Override // p058f5.AbstractC6360c0
    public long contentLength() throws EOFException {
        long j6 = this.f8003e;
        if (j6 != -1) {
            return j6;
        }
        long jM6883b = m6883b(null, true);
        this.f8003e = jM6883b;
        return jM6883b;
    }

    @Override // p058f5.AbstractC6360c0
    public C6386y contentType() {
        return this.f8002d;
    }

    @Override // p058f5.AbstractC6360c0
    public boolean isOneShot() {
        List list = this.f8001c;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).m6891a().isOneShot()) {
                return true;
            }
        }
        return false;
    }

    @Override // p058f5.AbstractC6360c0
    public void writeTo(BufferedSink sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        m6883b(sink, false);
    }
}
