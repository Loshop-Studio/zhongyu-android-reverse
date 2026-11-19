package p172l8;

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
import kotlin.p161io.CloseableKt;
import kotlin.text.Charsets;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p182m8.AbstractC9045d;

/* renamed from: l8.z */
/* loaded from: classes5.dex */
public abstract class AbstractC8927z implements Closeable {
    public static final b Companion = new b(null);
    private Reader reader;

    /* renamed from: l8.z$a */
    public static final class a extends Reader {

        /* renamed from: a */
        public final BufferedSource f14951a;

        /* renamed from: b */
        public final Charset f14952b;

        /* renamed from: c */
        public boolean f14953c;

        /* renamed from: d */
        public Reader f14954d;

        public a(BufferedSource source, Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.f14951a = source;
            this.f14952b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Unit unit;
            this.f14953c = true;
            Reader reader = this.f14954d;
            if (reader != null) {
                reader.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f14951a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i9, int i10) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.f14953c) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f14954d;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f14951a.inputStream(), AbstractC9045d.m14467I(this.f14951a, this.f14952b));
                this.f14954d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i9, i10);
        }
    }

    /* renamed from: l8.z$b */
    public static final class b {

        /* renamed from: l8.z$b$a */
        public static final class a extends AbstractC8927z {

            /* renamed from: a */
            public final /* synthetic */ C8921t f14955a;

            /* renamed from: b */
            public final /* synthetic */ long f14956b;

            /* renamed from: c */
            public final /* synthetic */ BufferedSource f14957c;

            public a(C8921t c8921t, long j9, BufferedSource bufferedSource) {
                this.f14955a = c8921t;
                this.f14956b = j9;
                this.f14957c = bufferedSource;
            }

            @Override // p172l8.AbstractC8927z
            public long contentLength() {
                return this.f14956b;
            }

            @Override // p172l8.AbstractC8927z
            public C8921t contentType() {
                return this.f14955a;
            }

            @Override // p172l8.AbstractC8927z
            public BufferedSource source() {
                return this.f14957c;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ AbstractC8927z m14209i(b bVar, byte[] bArr, C8921t c8921t, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                c8921t = null;
            }
            return bVar.m14217h(bArr, c8921t);
        }

        /* renamed from: a */
        public final AbstractC8927z m14210a(String str, C8921t c8921t) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            if (c8921t != null) {
                Charset charsetM14028d = C8921t.m14028d(c8921t, null, 1, null);
                if (charsetM14028d == null) {
                    c8921t = C8921t.f14817e.m14035b(c8921t + "; charset=utf-8");
                } else {
                    charset = charsetM14028d;
                }
            }
            Buffer bufferWriteString = new Buffer().writeString(str, charset);
            return m14215f(bufferWriteString, c8921t, bufferWriteString.size());
        }

        /* renamed from: b */
        public final AbstractC8927z m14211b(C8921t c8921t, long j9, BufferedSource content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m14215f(content, c8921t, j9);
        }

        /* renamed from: c */
        public final AbstractC8927z m14212c(C8921t c8921t, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m14210a(content, c8921t);
        }

        /* renamed from: d */
        public final AbstractC8927z m14213d(C8921t c8921t, ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m14216g(content, c8921t);
        }

        /* renamed from: e */
        public final AbstractC8927z m14214e(C8921t c8921t, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m14217h(content, c8921t);
        }

        /* renamed from: f */
        public final AbstractC8927z m14215f(BufferedSource bufferedSource, C8921t c8921t, long j9) {
            Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
            return new a(c8921t, j9, bufferedSource);
        }

        /* renamed from: g */
        public final AbstractC8927z m14216g(ByteString byteString, C8921t c8921t) {
            Intrinsics.checkNotNullParameter(byteString, "<this>");
            return m14215f(new Buffer().write(byteString), c8921t, byteString.size());
        }

        /* renamed from: h */
        public final AbstractC8927z m14217h(byte[] bArr, C8921t c8921t) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m14215f(new Buffer().write(bArr), c8921t, bArr.length);
        }

        public b() {
        }
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC8927z create(String str, C8921t c8921t) {
        return Companion.m14210a(str, c8921t);
    }

    /* renamed from: a */
    public final Charset m14208a() {
        Charset charsetM14031c;
        C8921t c8921tContentType = contentType();
        return (c8921tContentType == null || (charsetM14031c = c8921tContentType.m14031c(Charsets.UTF_8)) == null) ? Charsets.UTF_8 : charsetM14031c;
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
        a aVar = new a(source(), m14208a());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC9045d.m14497m(source());
    }

    public abstract long contentLength();

    public abstract C8921t contentType();

    public abstract BufferedSource source();

    public final String string() throws IOException {
        BufferedSource bufferedSourceSource = source();
        try {
            String string = bufferedSourceSource.readString(AbstractC9045d.m14467I(bufferedSourceSource, m14208a()));
            CloseableKt.closeFinally(bufferedSourceSource, null);
            return string;
        } finally {
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @JvmStatic
    public static final AbstractC8927z create(C8921t c8921t, long j9, BufferedSource bufferedSource) {
        return Companion.m14211b(c8921t, j9, bufferedSource);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final AbstractC8927z create(C8921t c8921t, String str) {
        return Companion.m14212c(c8921t, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final AbstractC8927z create(C8921t c8921t, ByteString byteString) {
        return Companion.m14213d(c8921t, byteString);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final AbstractC8927z create(C8921t c8921t, byte[] bArr) {
        return Companion.m14214e(c8921t, bArr);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC8927z create(BufferedSource bufferedSource, C8921t c8921t, long j9) {
        return Companion.m14215f(bufferedSource, c8921t, j9);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC8927z create(ByteString byteString, C8921t c8921t) {
        return Companion.m14216g(byteString, c8921t);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC8927z create(byte[] bArr, C8921t c8921t) {
        return Companion.m14217h(bArr, c8921t);
    }
}
