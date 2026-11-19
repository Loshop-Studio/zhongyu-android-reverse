package p117r2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import p117r2.C4519v;
import p121s2.AbstractC4550b;

/* renamed from: r2.w */
/* loaded from: classes2.dex */
public final class C4520w extends AbstractC4523z {

    /* renamed from: f */
    public static final C4519v f5563f;

    /* renamed from: g */
    public static final C4519v f5564g;

    /* renamed from: h */
    public static final C4519v f5565h;

    /* renamed from: i */
    public static final C4519v f5566i;

    /* renamed from: j */
    public static final C4519v f5567j;

    /* renamed from: k */
    public static final byte[] f5568k;

    /* renamed from: l */
    public static final byte[] f5569l;

    /* renamed from: m */
    public static final byte[] f5570m;

    /* renamed from: n */
    public static final b f5571n = new b(null);

    /* renamed from: a */
    public final C4519v f5572a;

    /* renamed from: b */
    public long f5573b;

    /* renamed from: c */
    public final ByteString f5574c;

    /* renamed from: d */
    public final C4519v f5575d;

    /* renamed from: e */
    public final List f5576e;

    /* renamed from: r2.w$a */
    public static final class a {

        /* renamed from: a */
        public final ByteString f5577a;

        /* renamed from: b */
        public C4519v f5578b;

        /* renamed from: c */
        public final List f5579c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public final a m6058a(C4516s c4516s, AbstractC4523z body) {
            Intrinsics.checkNotNullParameter(body, "body");
            m6059b(c.f5580c.m6064a(c4516s, body));
            return this;
        }

        /* renamed from: b */
        public final a m6059b(c part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.f5579c.add(part);
            return this;
        }

        /* renamed from: c */
        public final C4520w m6060c() {
            if (!this.f5579c.isEmpty()) {
                return new C4520w(this.f5577a, this.f5578b, AbstractC4550b.m6211N(this.f5579c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        /* renamed from: d */
        public final a m6061d(C4519v type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type.m6053g(), "multipart")) {
                this.f5578b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public a(String boundary) {
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.f5577a = ByteString.INSTANCE.encodeUtf8(boundary);
            this.f5578b = C4520w.f5563f;
            this.f5579c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i4 & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "UUID.randomUUID().toString()");
            }
            this(str);
        }
    }

    /* renamed from: r2.w$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: r2.w$c */
    public static final class c {

        /* renamed from: c */
        public static final a f5580c = new a(null);

        /* renamed from: a */
        public final C4516s f5581a;

        /* renamed from: b */
        public final AbstractC4523z f5582b;

        /* renamed from: r2.w$c$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final c m6064a(C4516s c4516s, AbstractC4523z body) {
                Intrinsics.checkNotNullParameter(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (!((c4516s != null ? c4516s.m5959a("Content-Type") : null) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((c4516s != null ? c4516s.m5959a("Content-Length") : null) == null) {
                    return new c(c4516s, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }
        }

        public c(C4516s c4516s, AbstractC4523z abstractC4523z) {
            this.f5581a = c4516s;
            this.f5582b = abstractC4523z;
        }

        /* renamed from: a */
        public final AbstractC4523z m6062a() {
            return this.f5582b;
        }

        /* renamed from: b */
        public final C4516s m6063b() {
            return this.f5581a;
        }

        public /* synthetic */ c(C4516s c4516s, AbstractC4523z abstractC4523z, DefaultConstructorMarker defaultConstructorMarker) {
            this(c4516s, abstractC4523z);
        }
    }

    static {
        C4519v.a aVar = C4519v.f5558g;
        f5563f = aVar.m6054a("multipart/mixed");
        f5564g = aVar.m6054a("multipart/alternative");
        f5565h = aVar.m6054a("multipart/digest");
        f5566i = aVar.m6054a("multipart/parallel");
        f5567j = aVar.m6054a("multipart/form-data");
        f5568k = new byte[]{(byte) 58, (byte) 32};
        f5569l = new byte[]{(byte) 13, (byte) 10};
        byte b4 = (byte) 45;
        f5570m = new byte[]{b4, b4};
    }

    public C4520w(ByteString boundaryByteString, C4519v type, List parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f5574c = boundaryByteString;
        this.f5575d = type;
        this.f5576e = parts;
        this.f5572a = C4519v.f5558g.m6054a(type + "; boundary=" + m6056a());
        this.f5573b = -1L;
    }

    /* renamed from: a */
    public final String m6056a() {
        return this.f5574c.utf8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final long m6057b(BufferedSink bufferedSink, boolean z3) throws IOException {
        Buffer buffer;
        if (z3) {
            bufferedSink = new Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.f5576e.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            c cVar = (c) this.f5576e.get(i4);
            C4516s c4516sM6063b = cVar.m6063b();
            AbstractC4523z abstractC4523zM6062a = cVar.m6062a();
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.write(f5570m);
            bufferedSink.write(this.f5574c);
            bufferedSink.write(f5569l);
            if (c4516sM6063b != null) {
                int size2 = c4516sM6063b.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    bufferedSink.writeUtf8(c4516sM6063b.m5960b(i5)).write(f5568k).writeUtf8(c4516sM6063b.m5962e(i5)).write(f5569l);
                }
            }
            C4519v contentType = abstractC4523zM6062a.getContentType();
            if (contentType != null) {
                bufferedSink.writeUtf8("Content-Type: ").writeUtf8(contentType.toString()).write(f5569l);
            }
            long jContentLength = abstractC4523zM6062a.contentLength();
            if (jContentLength != -1) {
                bufferedSink.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(f5569l);
            } else if (z3) {
                Intrinsics.checkNotNull(buffer);
                buffer.clear();
                return -1L;
            }
            byte[] bArr = f5569l;
            bufferedSink.write(bArr);
            if (z3) {
                j4 += jContentLength;
            } else {
                abstractC4523zM6062a.writeTo(bufferedSink);
            }
            bufferedSink.write(bArr);
        }
        Intrinsics.checkNotNull(bufferedSink);
        byte[] bArr2 = f5570m;
        bufferedSink.write(bArr2);
        bufferedSink.write(this.f5574c);
        bufferedSink.write(bArr2);
        bufferedSink.write(f5569l);
        if (!z3) {
            return j4;
        }
        Intrinsics.checkNotNull(buffer);
        long size3 = j4 + buffer.size();
        buffer.clear();
        return size3;
    }

    @Override // p117r2.AbstractC4523z
    public long contentLength() throws IOException {
        long j4 = this.f5573b;
        if (j4 != -1) {
            return j4;
        }
        long jM6057b = m6057b(null, true);
        this.f5573b = jM6057b;
        return jM6057b;
    }

    @Override // p117r2.AbstractC4523z
    /* renamed from: contentType */
    public C4519v getContentType() {
        return this.f5572a;
    }

    @Override // p117r2.AbstractC4523z
    public void writeTo(BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        m6057b(sink, false);
    }
}
