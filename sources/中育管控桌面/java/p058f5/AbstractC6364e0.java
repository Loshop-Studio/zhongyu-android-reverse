package p058f5;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p065g5.AbstractC6417a;
import p065g5.AbstractC6424h;
import p065g5.AbstractC6427k;

/* renamed from: f5.e0 */
/* loaded from: classes4.dex */
public abstract class AbstractC6364e0 implements Closeable {
    public static final b Companion;

    @JvmField
    public static final AbstractC6364e0 EMPTY;
    private Reader reader;

    /* renamed from: f5.e0$a */
    public static final class a extends Reader {

        /* renamed from: a */
        public final BufferedSource f7888a;

        /* renamed from: b */
        public final Charset f7889b;

        /* renamed from: c */
        public boolean f7890c;

        /* renamed from: d */
        public Reader f7891d;

        public a(BufferedSource source, Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.f7888a = source;
            this.f7889b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f7890c = true;
            Reader reader = this.f7891d;
            if (reader != null) {
                reader.close();
            } else {
                this.f7888a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i6, int i7) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.f7890c) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f7891d;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f7888a.inputStream(), AbstractC6427k.m7026n(this.f7888a, this.f7889b));
                this.f7891d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i6, i7);
        }
    }

    /* renamed from: f5.e0$b */
    public static final class b {

        /* renamed from: f5.e0$b$a */
        public static final class a extends AbstractC6364e0 {

            /* renamed from: a */
            public final /* synthetic */ C6386y f7892a;

            /* renamed from: b */
            public final /* synthetic */ long f7893b;

            /* renamed from: c */
            public final /* synthetic */ BufferedSource f7894c;

            public a(C6386y c6386y, long j6, BufferedSource bufferedSource) {
                this.f7892a = c6386y;
                this.f7893b = j6;
                this.f7894c = bufferedSource;
            }

            @Override // p058f5.AbstractC6364e0
            public long contentLength() {
                return this.f7893b;
            }

            @Override // p058f5.AbstractC6364e0
            public C6386y contentType() {
                return this.f7892a;
            }

            @Override // p058f5.AbstractC6364e0
            public BufferedSource source() {
                return this.f7894c;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ AbstractC6364e0 m6702i(b bVar, ByteString byteString, C6386y c6386y, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                c6386y = null;
            }
            return bVar.m6709g(byteString, c6386y);
        }

        /* renamed from: a */
        public final AbstractC6364e0 m6703a(C6386y c6386y, long j6, BufferedSource content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m6708f(content, c6386y, j6);
        }

        /* renamed from: b */
        public final AbstractC6364e0 m6704b(C6386y c6386y, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m6707e(content, c6386y);
        }

        /* renamed from: c */
        public final AbstractC6364e0 m6705c(C6386y c6386y, ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m6709g(content, c6386y);
        }

        /* renamed from: d */
        public final AbstractC6364e0 m6706d(C6386y c6386y, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m6710h(content, c6386y);
        }

        /* renamed from: e */
        public final AbstractC6364e0 m6707e(String str, C6386y c6386y) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Pair pairM6939b = AbstractC6417a.m6939b(c6386y);
            Charset charset = (Charset) pairM6939b.component1();
            C6386y c6386y2 = (C6386y) pairM6939b.component2();
            Buffer bufferWriteString = new Buffer().writeString(str, charset);
            return m6708f(bufferWriteString, c6386y2, bufferWriteString.size());
        }

        /* renamed from: f */
        public final AbstractC6364e0 m6708f(BufferedSource bufferedSource, C6386y c6386y, long j6) {
            Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
            return new a(c6386y, j6, bufferedSource);
        }

        /* renamed from: g */
        public final AbstractC6364e0 m6709g(ByteString byteString, C6386y c6386y) {
            Intrinsics.checkNotNullParameter(byteString, "<this>");
            return m6708f(new Buffer().write(byteString), c6386y, byteString.size());
        }

        /* renamed from: h */
        public final AbstractC6364e0 m6710h(byte[] bArr, C6386y c6386y) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m6708f(new Buffer().write(bArr), c6386y, bArr.length);
        }

        public b() {
        }
    }

    static {
        b bVar = new b(null);
        Companion = bVar;
        EMPTY = b.m6702i(bVar, ByteString.EMPTY, null, 1, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @JvmStatic
    public static final AbstractC6364e0 create(C6386y c6386y, long j6, BufferedSource bufferedSource) {
        return Companion.m6703a(c6386y, j6, bufferedSource);
    }

    /* renamed from: a */
    public final Charset m6701a() {
        return AbstractC6417a.m6938a(contentType());
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final ByteString byteString() throws IOException {
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
                    ExceptionsKt.addSuppressed(th, th4);
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
    public final byte[] bytes() throws IOException {
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
                    ExceptionsKt.addSuppressed(th, th4);
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
        a aVar = new a(source(), m6701a());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC6424h.m6992f(source());
    }

    public abstract long contentLength();

    public abstract C6386y contentType();

    public abstract BufferedSource source();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final String string() {
        BufferedSource bufferedSourceSource = source();
        String th = null;
        try {
            String string = bufferedSourceSource.readString(AbstractC6427k.m7026n(bufferedSourceSource, m6701a()));
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
                    ExceptionsKt.addSuppressed(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final AbstractC6364e0 create(C6386y c6386y, String str) {
        return Companion.m6704b(c6386y, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final AbstractC6364e0 create(C6386y c6386y, ByteString byteString) {
        return Companion.m6705c(c6386y, byteString);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final AbstractC6364e0 create(C6386y c6386y, byte[] bArr) {
        return Companion.m6706d(c6386y, bArr);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC6364e0 create(String str, C6386y c6386y) {
        return Companion.m6707e(str, c6386y);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC6364e0 create(BufferedSource bufferedSource, C6386y c6386y, long j6) {
        return Companion.m6708f(bufferedSource, c6386y, j6);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC6364e0 create(ByteString byteString, C6386y c6386y) {
        return Companion.m6709g(byteString, c6386y);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC6364e0 create(byte[] bArr, C6386y c6386y) {
        return Companion.m6710h(bArr, c6386y);
    }
}
