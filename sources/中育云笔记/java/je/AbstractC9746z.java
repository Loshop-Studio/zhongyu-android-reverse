package je;

import androidx.collection.SieveCacheKt;
import cd.AbstractC5423b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p310qd.C10792c;

/* renamed from: je.z */
/* loaded from: classes6.dex */
public abstract class AbstractC9746z implements Closeable {
    public static final b Companion = new b(null);
    private Reader reader;

    /* renamed from: je.z$a */
    public static final class a extends Reader {

        /* renamed from: c */
        public final BufferedSource f22904c;

        /* renamed from: d */
        public final Charset f22905d;

        /* renamed from: e */
        public boolean f22906e;

        /* renamed from: f */
        public Reader f22907f;

        public a(BufferedSource source, Charset charset) {
            AbstractC9979u.m20294g(source, "source");
            AbstractC9979u.m20294g(charset, "charset");
            this.f22904c = source;
            this.f22905d = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C10786q c10786q;
            this.f22906e = true;
            Reader reader = this.f22907f;
            if (reader != null) {
                reader.close();
                c10786q = C10786q.f26013a;
            } else {
                c10786q = null;
            }
            if (c10786q == null) {
                this.f22904c.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i10, int i11) throws IOException {
            AbstractC9979u.m20294g(cbuf, "cbuf");
            if (this.f22906e) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f22907f;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f22904c.inputStream(), AbstractC9920d.m20001I(this.f22904c, this.f22905d));
                this.f22907f = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i10, i11);
        }
    }

    /* renamed from: je.z$b */
    public static final class b {

        /* renamed from: je.z$b$a */
        public static final class a extends AbstractC9746z {

            /* renamed from: c */
            public final /* synthetic */ C9740t f22908c;

            /* renamed from: d */
            public final /* synthetic */ long f22909d;

            /* renamed from: e */
            public final /* synthetic */ BufferedSource f22910e;

            public a(C9740t c9740t, long j10, BufferedSource bufferedSource) {
                this.f22908c = c9740t;
                this.f22909d = j10;
                this.f22910e = bufferedSource;
            }

            @Override // je.AbstractC9746z
            public long contentLength() {
                return this.f22909d;
            }

            @Override // je.AbstractC9746z
            public C9740t contentType() {
                return this.f22908c;
            }

            @Override // je.AbstractC9746z
            public BufferedSource source() {
                return this.f22910e;
            }
        }

        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ AbstractC9746z m19666i(b bVar, byte[] bArr, C9740t c9740t, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c9740t = null;
            }
            return bVar.m19674h(bArr, c9740t);
        }

        /* renamed from: a */
        public final AbstractC9746z m19667a(String str, C9740t c9740t) {
            AbstractC9979u.m20294g(str, "<this>");
            Charset charset = C10792c.f26019b;
            if (c9740t != null) {
                Charset charsetM19481d = C9740t.m19481d(c9740t, null, 1, null);
                if (charsetM19481d == null) {
                    c9740t = C9740t.f22770e.m19489b(c9740t + "; charset=utf-8");
                } else {
                    charset = charsetM19481d;
                }
            }
            Buffer bufferWriteString = new Buffer().writeString(str, charset);
            return m19672f(bufferWriteString, c9740t, bufferWriteString.size());
        }

        /* renamed from: b */
        public final AbstractC9746z m19668b(C9740t c9740t, long j10, BufferedSource content) {
            AbstractC9979u.m20294g(content, "content");
            return m19672f(content, c9740t, j10);
        }

        /* renamed from: c */
        public final AbstractC9746z m19669c(C9740t c9740t, String content) {
            AbstractC9979u.m20294g(content, "content");
            return m19667a(content, c9740t);
        }

        /* renamed from: d */
        public final AbstractC9746z m19670d(C9740t c9740t, ByteString content) {
            AbstractC9979u.m20294g(content, "content");
            return m19673g(content, c9740t);
        }

        /* renamed from: e */
        public final AbstractC9746z m19671e(C9740t c9740t, byte[] content) {
            AbstractC9979u.m20294g(content, "content");
            return m19674h(content, c9740t);
        }

        /* renamed from: f */
        public final AbstractC9746z m19672f(BufferedSource bufferedSource, C9740t c9740t, long j10) {
            AbstractC9979u.m20294g(bufferedSource, "<this>");
            return new a(c9740t, j10, bufferedSource);
        }

        /* renamed from: g */
        public final AbstractC9746z m19673g(ByteString byteString, C9740t c9740t) {
            AbstractC9979u.m20294g(byteString, "<this>");
            return m19672f(new Buffer().write(byteString), c9740t, byteString.size());
        }

        /* renamed from: h */
        public final AbstractC9746z m19674h(byte[] bArr, C9740t c9740t) {
            AbstractC9979u.m20294g(bArr, "<this>");
            return m19672f(new Buffer().write(bArr), c9740t, bArr.length);
        }

        public b() {
        }
    }

    public static final AbstractC9746z create(String str, C9740t c9740t) {
        return Companion.m19667a(str, c9740t);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final ByteString byteString() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        long jContentLength = contentLength();
        if (jContentLength > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        BufferedSource bufferedSourceSource = source();
        try {
            ByteString byteString = bufferedSourceSource.readByteString();
            AbstractC5423b.m2902a(bufferedSourceSource, null);
            int size = byteString.size();
            if (jContentLength == -1 || jContentLength == size) {
                return byteString;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + size + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        long jContentLength = contentLength();
        if (jContentLength > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        BufferedSource bufferedSourceSource = source();
        try {
            byte[] byteArray = bufferedSourceSource.readByteArray();
            AbstractC5423b.m2902a(bufferedSourceSource, null);
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
        a aVar = new a(source(), m19665e());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC9920d.m20031m(source());
    }

    public abstract long contentLength();

    public abstract C9740t contentType();

    /* renamed from: e */
    public final Charset m19665e() {
        Charset charsetM19484c;
        C9740t c9740tContentType = contentType();
        return (c9740tContentType == null || (charsetM19484c = c9740tContentType.m19484c(C10792c.f26019b)) == null) ? C10792c.f26019b : charsetM19484c;
    }

    public abstract BufferedSource source();

    public final String string() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        BufferedSource bufferedSourceSource = source();
        try {
            String string = bufferedSourceSource.readString(AbstractC9920d.m20001I(bufferedSourceSource, m19665e()));
            AbstractC5423b.m2902a(bufferedSourceSource, null);
            return string;
        } finally {
        }
    }

    @InterfaceC10770a
    public static final AbstractC9746z create(C9740t c9740t, long j10, BufferedSource bufferedSource) {
        return Companion.m19668b(c9740t, j10, bufferedSource);
    }

    @InterfaceC10770a
    public static final AbstractC9746z create(C9740t c9740t, String str) {
        return Companion.m19669c(c9740t, str);
    }

    @InterfaceC10770a
    public static final AbstractC9746z create(C9740t c9740t, ByteString byteString) {
        return Companion.m19670d(c9740t, byteString);
    }

    @InterfaceC10770a
    public static final AbstractC9746z create(C9740t c9740t, byte[] bArr) {
        return Companion.m19671e(c9740t, bArr);
    }

    public static final AbstractC9746z create(BufferedSource bufferedSource, C9740t c9740t, long j10) {
        return Companion.m19672f(bufferedSource, c9740t, j10);
    }

    public static final AbstractC9746z create(ByteString byteString, C9740t c9740t) {
        return Companion.m19673g(byteString, c9740t);
    }

    public static final AbstractC9746z create(byte[] bArr, C9740t c9740t) {
        return Companion.m19674h(bArr, c9740t);
    }
}
