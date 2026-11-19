package p136i9;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p123h7.AbstractC8722b;
import p123h7.InterfaceC8721a;
import p147j9.AbstractC9031a;
import p147j9.AbstractC9038h;
import p147j9.AbstractC9041k;

/* renamed from: i9.e0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8905e0 implements Closeable {
    public static final b Companion;
    public static final AbstractC8905e0 EMPTY;
    private Reader reader;

    /* renamed from: i9.e0$a */
    public static final class a extends Reader {

        /* renamed from: a */
        public final BufferedSource f16720a;

        /* renamed from: b */
        public final Charset f16721b;

        /* renamed from: c */
        public boolean f16722c;

        /* renamed from: d */
        public Reader f16723d;

        public a(BufferedSource source, Charset charset) {
            AbstractC9133u.m16133g(source, "source");
            AbstractC9133u.m16133g(charset, "charset");
            this.f16720a = source;
            this.f16721b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f16722c = true;
            Reader reader = this.f16723d;
            if (reader != null) {
                reader.close();
            } else {
                this.f16720a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i10, int i11) throws IOException {
            AbstractC9133u.m16133g(cbuf, "cbuf");
            if (this.f16722c) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f16723d;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f16720a.inputStream(), AbstractC9041k.m15784n(this.f16720a, this.f16721b));
                this.f16723d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i10, i11);
        }
    }

    /* renamed from: i9.e0$b */
    public static final class b {

        /* renamed from: i9.e0$b$a */
        public static final class a extends AbstractC8905e0 {

            /* renamed from: a */
            public final /* synthetic */ C8927y f16724a;

            /* renamed from: b */
            public final /* synthetic */ long f16725b;

            /* renamed from: c */
            public final /* synthetic */ BufferedSource f16726c;

            public a(C8927y c8927y, long j10, BufferedSource bufferedSource) {
                this.f16724a = c8927y;
                this.f16725b = j10;
                this.f16726c = bufferedSource;
            }

            @Override // p136i9.AbstractC8905e0
            public long contentLength() {
                return this.f16725b;
            }

            @Override // p136i9.AbstractC8905e0
            public C8927y contentType() {
                return this.f16724a;
            }

            @Override // p136i9.AbstractC8905e0
            public BufferedSource source() {
                return this.f16726c;
            }
        }

        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ AbstractC8905e0 m15165i(b bVar, ByteString byteString, C8927y c8927y, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c8927y = null;
            }
            return bVar.m15172g(byteString, c8927y);
        }

        /* renamed from: a */
        public final AbstractC8905e0 m15166a(C8927y c8927y, long j10, BufferedSource content) {
            AbstractC9133u.m16133g(content, "content");
            return m15171f(content, c8927y, j10);
        }

        /* renamed from: b */
        public final AbstractC8905e0 m15167b(C8927y c8927y, String content) {
            AbstractC9133u.m16133g(content, "content");
            return m15170e(content, c8927y);
        }

        /* renamed from: c */
        public final AbstractC8905e0 m15168c(C8927y c8927y, ByteString content) {
            AbstractC9133u.m16133g(content, "content");
            return m15172g(content, c8927y);
        }

        /* renamed from: d */
        public final AbstractC8905e0 m15169d(C8927y c8927y, byte[] content) {
            AbstractC9133u.m16133g(content, "content");
            return m15173h(content, c8927y);
        }

        /* renamed from: e */
        public final AbstractC8905e0 m15170e(String str, C8927y c8927y) {
            AbstractC9133u.m16133g(str, "<this>");
            Pair pairM15697b = AbstractC9031a.m15697b(c8927y);
            Charset charset = (Charset) pairM15697b.m15903a();
            C8927y c8927y2 = (C8927y) pairM15697b.m15904b();
            Buffer bufferWriteString = new Buffer().writeString(str, charset);
            return m15171f(bufferWriteString, c8927y2, bufferWriteString.size());
        }

        /* renamed from: f */
        public final AbstractC8905e0 m15171f(BufferedSource bufferedSource, C8927y c8927y, long j10) {
            AbstractC9133u.m16133g(bufferedSource, "<this>");
            return new a(c8927y, j10, bufferedSource);
        }

        /* renamed from: g */
        public final AbstractC8905e0 m15172g(ByteString byteString, C8927y c8927y) {
            AbstractC9133u.m16133g(byteString, "<this>");
            return m15171f(new Buffer().write(byteString), c8927y, byteString.size());
        }

        /* renamed from: h */
        public final AbstractC8905e0 m15173h(byte[] bArr, C8927y c8927y) {
            AbstractC9133u.m16133g(bArr, "<this>");
            return m15171f(new Buffer().write(bArr), c8927y, bArr.length);
        }

        public b() {
        }
    }

    static {
        b bVar = new b(null);
        Companion = bVar;
        EMPTY = b.m15165i(bVar, ByteString.EMPTY, null, 1, null);
    }

    @InterfaceC8721a
    public static final AbstractC8905e0 create(C8927y c8927y, long j10, BufferedSource bufferedSource) {
        return Companion.m15166a(c8927y, j10, bufferedSource);
    }

    /* renamed from: a */
    public final Charset m15164a() {
        return AbstractC9031a.m15696a(contentType());
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final ByteString byteString() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        long jContentLength = contentLength();
        if (jContentLength > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        BufferedSource bufferedSourceSource = source();
        ByteString th = null;
        try {
            ByteString byteString = bufferedSourceSource.readByteString();
            if (bufferedSourceSource != null) {
                try {
                    bufferedSourceSource.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = th;
            th = byteString;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedSourceSource != null) {
                try {
                    bufferedSourceSource.close();
                } catch (Throwable th4) {
                    AbstractC8722b.m14228a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int size = th.size();
        if (jContentLength == -1 || jContentLength == size) {
            return th;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + size + ") disagree");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final byte[] bytes() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        long jContentLength = contentLength();
        if (jContentLength > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        BufferedSource bufferedSourceSource = source();
        byte[] th = null;
        try {
            byte[] byteArray = bufferedSourceSource.readByteArray();
            if (bufferedSourceSource != null) {
                try {
                    bufferedSourceSource.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = th;
            th = byteArray;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedSourceSource != null) {
                try {
                    bufferedSourceSource.close();
                } catch (Throwable th4) {
                    AbstractC8722b.m14228a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (jContentLength == -1 || jContentLength == length) {
            return th;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(source(), m15164a());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC9038h.m15750f(source());
    }

    public abstract long contentLength();

    public abstract C8927y contentType();

    public abstract BufferedSource source();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final String string() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        BufferedSource bufferedSourceSource = source();
        String th = null;
        try {
            String string = bufferedSourceSource.readString(AbstractC9041k.m15784n(bufferedSourceSource, m15164a()));
            if (bufferedSourceSource != null) {
                try {
                    bufferedSourceSource.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = th;
            th = string;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedSourceSource != null) {
                try {
                    bufferedSourceSource.close();
                } catch (Throwable th4) {
                    AbstractC8722b.m14228a(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    @InterfaceC8721a
    public static final AbstractC8905e0 create(C8927y c8927y, String str) {
        return Companion.m15167b(c8927y, str);
    }

    @InterfaceC8721a
    public static final AbstractC8905e0 create(C8927y c8927y, ByteString byteString) {
        return Companion.m15168c(c8927y, byteString);
    }

    @InterfaceC8721a
    public static final AbstractC8905e0 create(C8927y c8927y, byte[] bArr) {
        return Companion.m15169d(c8927y, bArr);
    }

    public static final AbstractC8905e0 create(String str, C8927y c8927y) {
        return Companion.m15170e(str, c8927y);
    }

    public static final AbstractC8905e0 create(BufferedSource bufferedSource, C8927y c8927y, long j10) {
        return Companion.m15171f(bufferedSource, c8927y, j10);
    }

    public static final AbstractC8905e0 create(ByteString byteString, C8927y c8927y) {
        return Companion.m15172g(byteString, c8927y);
    }

    public static final AbstractC8905e0 create(byte[] bArr, C8927y c8927y) {
        return Companion.m15173h(bArr, c8927y);
    }
}
