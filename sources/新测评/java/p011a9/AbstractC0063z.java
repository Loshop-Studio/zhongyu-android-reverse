package p011a9;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p148io.CloseableKt;
import kotlin.text.Charsets;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p028b9.AbstractC5070d;

/* renamed from: a9.z */
/* loaded from: classes5.dex */
public abstract class AbstractC0063z implements Closeable {
    public static final b Companion = new b(null);
    private Reader reader;

    /* renamed from: a9.z$a */
    public static final class a extends Reader {

        /* renamed from: a */
        public final BufferedSource f323a;

        /* renamed from: b */
        public final Charset f324b;

        /* renamed from: c */
        public boolean f325c;

        /* renamed from: d */
        public Reader f326d;

        public a(BufferedSource source, Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.f323a = source;
            this.f324b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Unit unit;
            this.f325c = true;
            Reader reader = this.f326d;
            if (reader != null) {
                reader.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f323a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.f325c) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f326d;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f323a.inputStream(), AbstractC5070d.m2618I(this.f323a, this.f324b));
                this.f326d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i10, i11);
        }
    }

    /* renamed from: a9.z$b */
    public static final class b {

        /* renamed from: a9.z$b$a */
        public static final class a extends AbstractC0063z {

            /* renamed from: a */
            public final /* synthetic */ C0057t f327a;

            /* renamed from: b */
            public final /* synthetic */ long f328b;

            /* renamed from: c */
            public final /* synthetic */ BufferedSource f329c;

            public a(C0057t c0057t, long j10, BufferedSource bufferedSource) {
                this.f327a = c0057t;
                this.f328b = j10;
                this.f329c = bufferedSource;
            }

            @Override // p011a9.AbstractC0063z
            public long contentLength() {
                return this.f328b;
            }

            @Override // p011a9.AbstractC0063z
            public C0057t contentType() {
                return this.f327a;
            }

            @Override // p011a9.AbstractC0063z
            public BufferedSource source() {
                return this.f329c;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ AbstractC0063z m453i(b bVar, byte[] bArr, C0057t c0057t, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c0057t = null;
            }
            return bVar.m461h(bArr, c0057t);
        }

        /* renamed from: a */
        public final AbstractC0063z m454a(C0057t c0057t, long j10, BufferedSource content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m459f(content, c0057t, j10);
        }

        /* renamed from: b */
        public final AbstractC0063z m455b(C0057t c0057t, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m458e(content, c0057t);
        }

        /* renamed from: c */
        public final AbstractC0063z m456c(C0057t c0057t, ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m460g(content, c0057t);
        }

        /* renamed from: d */
        public final AbstractC0063z m457d(C0057t c0057t, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m461h(content, c0057t);
        }

        /* renamed from: e */
        public final AbstractC0063z m458e(String str, C0057t c0057t) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            if (c0057t != null) {
                Charset charsetM272d = C0057t.m272d(c0057t, null, 1, null);
                if (charsetM272d == null) {
                    c0057t = C0057t.f189e.m279b(c0057t + "; charset=utf-8");
                } else {
                    charset = charsetM272d;
                }
            }
            Buffer bufferWriteString = new Buffer().writeString(str, charset);
            return m459f(bufferWriteString, c0057t, bufferWriteString.size());
        }

        /* renamed from: f */
        public final AbstractC0063z m459f(BufferedSource bufferedSource, C0057t c0057t, long j10) {
            Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
            return new a(c0057t, j10, bufferedSource);
        }

        /* renamed from: g */
        public final AbstractC0063z m460g(ByteString byteString, C0057t c0057t) {
            Intrinsics.checkNotNullParameter(byteString, "<this>");
            return m459f(new Buffer().write(byteString), c0057t, byteString.size());
        }

        /* renamed from: h */
        public final AbstractC0063z m461h(byte[] bArr, C0057t c0057t) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m459f(new Buffer().write(bArr), c0057t, bArr.length);
        }

        public b() {
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @JvmStatic
    public static final AbstractC0063z create(C0057t c0057t, long j10, BufferedSource bufferedSource) {
        return Companion.m454a(c0057t, j10, bufferedSource);
    }

    /* renamed from: a */
    public final Charset m452a() {
        Charset charsetM275c;
        C0057t c0057tContentType = contentType();
        return (c0057tContentType == null || (charsetM275c = c0057tContentType.m275c(Charsets.UTF_8)) == null) ? Charsets.UTF_8 : charsetM275c;
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final ByteString byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        BufferedSource bufferedSourceSource = source();
        try {
            ByteString byteString = bufferedSourceSource.readByteString();
            CloseableKt.closeFinally(bufferedSourceSource, null);
            int size = byteString.size();
            if (jContentLength == -1 || jContentLength == size) {
                return byteString;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + size + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        BufferedSource bufferedSourceSource = source();
        try {
            byte[] byteArray = bufferedSourceSource.readByteArray();
            CloseableKt.closeFinally(bufferedSourceSource, null);
            int length = byteArray.length;
            if (jContentLength == -1 || jContentLength == length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(source(), m452a());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC5070d.m2648m(source());
    }

    public abstract long contentLength();

    public abstract C0057t contentType();

    public abstract BufferedSource source();

    public final String string() throws IOException {
        BufferedSource bufferedSourceSource = source();
        try {
            String string = bufferedSourceSource.readString(AbstractC5070d.m2618I(bufferedSourceSource, m452a()));
            CloseableKt.closeFinally(bufferedSourceSource, null);
            return string;
        } finally {
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final AbstractC0063z create(C0057t c0057t, String str) {
        return Companion.m455b(c0057t, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final AbstractC0063z create(C0057t c0057t, ByteString byteString) {
        return Companion.m456c(c0057t, byteString);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final AbstractC0063z create(C0057t c0057t, byte[] bArr) {
        return Companion.m457d(c0057t, bArr);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC0063z create(String str, C0057t c0057t) {
        return Companion.m458e(str, c0057t);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC0063z create(BufferedSource bufferedSource, C0057t c0057t, long j10) {
        return Companion.m459f(bufferedSource, c0057t, j10);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC0063z create(ByteString byteString, C0057t c0057t) {
        return Companion.m460g(byteString, c0057t);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC0063z create(byte[] bArr, C0057t c0057t) {
        return Companion.m461h(bArr, c0057t);
    }
}
