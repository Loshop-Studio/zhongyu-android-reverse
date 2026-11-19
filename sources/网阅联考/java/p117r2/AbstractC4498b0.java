package p117r2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p086io.CloseableKt;
import kotlin.text.Charsets;
import okio.Buffer;
import okio.BufferedSource;
import p121s2.AbstractC4550b;

/* renamed from: r2.b0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4498b0 implements Closeable {

    /* renamed from: b */
    public static final b f5320b = new b(null);

    /* renamed from: a */
    public Reader f5321a;

    /* renamed from: r2.b0$a */
    public static final class a extends Reader {

        /* renamed from: a */
        public boolean f5322a;

        /* renamed from: b */
        public Reader f5323b;

        /* renamed from: c */
        public final BufferedSource f5324c;

        /* renamed from: d */
        public final Charset f5325d;

        public a(BufferedSource source, Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.f5324c = source;
            this.f5325d = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f5322a = true;
            Reader reader = this.f5323b;
            if (reader != null) {
                reader.close();
            } else {
                this.f5324c.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i4, int i5) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.f5322a) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f5323b;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f5324c.inputStream(), AbstractC4550b.m6202E(this.f5324c, this.f5325d));
                this.f5323b = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i4, i5);
        }
    }

    /* renamed from: r2.b0$b */
    public static final class b {

        /* renamed from: r2.b0$b$a */
        public static final class a extends AbstractC4498b0 {

            /* renamed from: c */
            public final /* synthetic */ BufferedSource f5326c;

            /* renamed from: d */
            public final /* synthetic */ C4519v f5327d;

            /* renamed from: e */
            public final /* synthetic */ long f5328e;

            public a(BufferedSource bufferedSource, C4519v c4519v, long j4) {
                this.f5326c = bufferedSource;
                this.f5327d = c4519v;
                this.f5328e = j4;
            }

            @Override // p117r2.AbstractC4498b0
            /* renamed from: c */
            public long mo5090c() {
                return this.f5328e;
            }

            @Override // p117r2.AbstractC4498b0
            /* renamed from: d */
            public C4519v mo5091d() {
                return this.f5327d;
            }

            @Override // p117r2.AbstractC4498b0
            /* renamed from: f */
            public BufferedSource mo5092f() {
                return this.f5326c;
            }
        }

        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: e */
        public static /* synthetic */ AbstractC4498b0 m5842e(b bVar, byte[] bArr, C4519v c4519v, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                c4519v = null;
            }
            return bVar.m5846d(bArr, c4519v);
        }

        /* renamed from: a */
        public final AbstractC4498b0 m5843a(String toResponseBody, C4519v c4519v) {
            Intrinsics.checkNotNullParameter(toResponseBody, "$this$toResponseBody");
            Charset charset = Charsets.UTF_8;
            if (c4519v != null) {
                Charset charsetM6049d = C4519v.m6049d(c4519v, null, 1, null);
                if (charsetM6049d == null) {
                    c4519v = C4519v.f5558g.m6055b(c4519v + "; charset=utf-8");
                } else {
                    charset = charsetM6049d;
                }
            }
            Buffer bufferWriteString = new Buffer().writeString(toResponseBody, charset);
            return m5844b(bufferWriteString, c4519v, bufferWriteString.size());
        }

        /* renamed from: b */
        public final AbstractC4498b0 m5844b(BufferedSource asResponseBody, C4519v c4519v, long j4) {
            Intrinsics.checkNotNullParameter(asResponseBody, "$this$asResponseBody");
            return new a(asResponseBody, c4519v, j4);
        }

        /* renamed from: c */
        public final AbstractC4498b0 m5845c(C4519v c4519v, long j4, BufferedSource content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m5844b(content, c4519v, j4);
        }

        /* renamed from: d */
        public final AbstractC4498b0 m5846d(byte[] toResponseBody, C4519v c4519v) {
            Intrinsics.checkNotNullParameter(toResponseBody, "$this$toResponseBody");
            return m5844b(new Buffer().write(toResponseBody), c4519v, toResponseBody.length);
        }
    }

    /* renamed from: e */
    public static final AbstractC4498b0 m5838e(C4519v c4519v, long j4, BufferedSource bufferedSource) {
        return f5320b.m5845c(c4519v, j4, bufferedSource);
    }

    /* renamed from: a */
    public final Reader m5839a() {
        Reader reader = this.f5321a;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(mo5092f(), m5840b());
        this.f5321a = aVar;
        return aVar;
    }

    /* renamed from: b */
    public final Charset m5840b() {
        Charset charsetM6051c;
        C4519v c4519vMo5091d = mo5091d();
        return (c4519vMo5091d == null || (charsetM6051c = c4519vMo5091d.m6051c(Charsets.UTF_8)) == null) ? Charsets.UTF_8 : charsetM6051c;
    }

    /* renamed from: c */
    public abstract long mo5090c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC4550b.m6228j(mo5092f());
    }

    /* renamed from: d */
    public abstract C4519v mo5091d();

    /* renamed from: f */
    public abstract BufferedSource mo5092f();

    /* renamed from: g */
    public final String m5841g() {
        BufferedSource bufferedSourceMo5092f = mo5092f();
        try {
            String string = bufferedSourceMo5092f.readString(AbstractC4550b.m6202E(bufferedSourceMo5092f, m5840b()));
            CloseableKt.closeFinally(bufferedSourceMo5092f, null);
            return string;
        } finally {
        }
    }
}
