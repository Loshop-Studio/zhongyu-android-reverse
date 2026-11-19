package p011a9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p148io.CloseableKt;
import kotlin.text.Charsets;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import p028b9.AbstractC5070d;

/* renamed from: a9.x */
/* loaded from: classes5.dex */
public abstract class AbstractC0061x {
    public static final a Companion = new a(null);

    /* renamed from: a9.x$a */
    public static final class a {

        /* renamed from: a9.x$a$a, reason: collision with other inner class name */
        public static final class C10092a extends AbstractC0061x {

            /* renamed from: a */
            public final /* synthetic */ C0057t f288a;

            /* renamed from: b */
            public final /* synthetic */ File f289b;

            public C10092a(C0057t c0057t, File file) {
                this.f288a = c0057t;
                this.f289b = file;
            }

            @Override // p011a9.AbstractC0061x
            public long contentLength() {
                return this.f289b.length();
            }

            @Override // p011a9.AbstractC0061x
            public C0057t contentType() {
                return this.f288a;
            }

            @Override // p011a9.AbstractC0061x
            public void writeTo(BufferedSink sink) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                Source source = Okio.source(this.f289b);
                try {
                    sink.writeAll(source);
                    CloseableKt.closeFinally(source, null);
                } finally {
                }
            }
        }

        /* renamed from: a9.x$a$b */
        public static final class b extends AbstractC0061x {

            /* renamed from: a */
            public final /* synthetic */ C0057t f290a;

            /* renamed from: b */
            public final /* synthetic */ ByteString f291b;

            public b(C0057t c0057t, ByteString byteString) {
                this.f290a = c0057t;
                this.f291b = byteString;
            }

            @Override // p011a9.AbstractC0061x
            public long contentLength() {
                return this.f291b.size();
            }

            @Override // p011a9.AbstractC0061x
            public C0057t contentType() {
                return this.f290a;
            }

            @Override // p011a9.AbstractC0061x
            public void writeTo(BufferedSink sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.f291b);
            }
        }

        /* renamed from: a9.x$a$c */
        public static final class c extends AbstractC0061x {

            /* renamed from: a */
            public final /* synthetic */ C0057t f292a;

            /* renamed from: b */
            public final /* synthetic */ int f293b;

            /* renamed from: c */
            public final /* synthetic */ byte[] f294c;

            /* renamed from: d */
            public final /* synthetic */ int f295d;

            public c(C0057t c0057t, int i10, byte[] bArr, int i11) {
                this.f292a = c0057t;
                this.f293b = i10;
                this.f294c = bArr;
                this.f295d = i11;
            }

            @Override // p011a9.AbstractC0061x
            public long contentLength() {
                return this.f293b;
            }

            @Override // p011a9.AbstractC0061x
            public C0057t contentType() {
                return this.f292a;
            }

            @Override // p011a9.AbstractC0061x
            public void writeTo(BufferedSink sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.f294c, this.f295d, this.f293b);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: n */
        public static /* synthetic */ AbstractC0061x m397n(a aVar, C0057t c0057t, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.m405f(c0057t, bArr, i10, i11);
        }

        /* renamed from: o */
        public static /* synthetic */ AbstractC0061x m398o(a aVar, ByteString byteString, C0057t c0057t, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c0057t = null;
            }
            return aVar.m408i(byteString, c0057t);
        }

        /* renamed from: p */
        public static /* synthetic */ AbstractC0061x m399p(a aVar, byte[] bArr, C0057t c0057t, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                c0057t = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.m412m(bArr, c0057t, i10, i11);
        }

        /* renamed from: a */
        public final AbstractC0061x m400a(C0057t c0057t, File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return m406g(file, c0057t);
        }

        /* renamed from: b */
        public final AbstractC0061x m401b(C0057t c0057t, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m407h(content, c0057t);
        }

        /* renamed from: c */
        public final AbstractC0061x m402c(C0057t c0057t, ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m408i(content, c0057t);
        }

        /* renamed from: d */
        public final AbstractC0061x m403d(C0057t c0057t, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m397n(this, c0057t, content, 0, 0, 12, null);
        }

        /* renamed from: e */
        public final AbstractC0061x m404e(C0057t c0057t, byte[] content, int i10) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m397n(this, c0057t, content, i10, 0, 8, null);
        }

        /* renamed from: f */
        public final AbstractC0061x m405f(C0057t c0057t, byte[] content, int i10, int i11) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m412m(content, c0057t, i10, i11);
        }

        /* renamed from: g */
        public final AbstractC0061x m406g(File file, C0057t c0057t) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return new C10092a(c0057t, file);
        }

        /* renamed from: h */
        public final AbstractC0061x m407h(String str, C0057t c0057t) {
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
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return m412m(bytes, c0057t, 0, bytes.length);
        }

        /* renamed from: i */
        public final AbstractC0061x m408i(ByteString byteString, C0057t c0057t) {
            Intrinsics.checkNotNullParameter(byteString, "<this>");
            return new b(c0057t, byteString);
        }

        /* renamed from: j */
        public final AbstractC0061x m409j(byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m399p(this, bArr, null, 0, 0, 7, null);
        }

        /* renamed from: k */
        public final AbstractC0061x m410k(byte[] bArr, C0057t c0057t) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m399p(this, bArr, c0057t, 0, 0, 6, null);
        }

        /* renamed from: l */
        public final AbstractC0061x m411l(byte[] bArr, C0057t c0057t, int i10) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m399p(this, bArr, c0057t, i10, 0, 4, null);
        }

        /* renamed from: m */
        public final AbstractC0061x m412m(byte[] bArr, C0057t c0057t, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            AbstractC5070d.m2647l(bArr.length, i10, i11);
            return new c(c0057t, i11, bArr, i10);
        }

        public a() {
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    public static final AbstractC0061x create(C0057t c0057t, File file) {
        return Companion.m400a(c0057t, file);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract C0057t contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final AbstractC0061x create(C0057t c0057t, String str) {
        return Companion.m401b(c0057t, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final AbstractC0061x create(C0057t c0057t, ByteString byteString) {
        return Companion.m402c(c0057t, byteString);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final AbstractC0061x create(C0057t c0057t, byte[] bArr) {
        return Companion.m403d(c0057t, bArr);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final AbstractC0061x create(C0057t c0057t, byte[] bArr, int i10) {
        return Companion.m404e(c0057t, bArr, i10);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final AbstractC0061x create(C0057t c0057t, byte[] bArr, int i10, int i11) {
        return Companion.m405f(c0057t, bArr, i10, i11);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC0061x create(File file, C0057t c0057t) {
        return Companion.m406g(file, c0057t);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC0061x create(String str, C0057t c0057t) {
        return Companion.m407h(str, c0057t);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC0061x create(ByteString byteString, C0057t c0057t) {
        return Companion.m408i(byteString, c0057t);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC0061x create(byte[] bArr) {
        return Companion.m409j(bArr);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC0061x create(byte[] bArr, C0057t c0057t) {
        return Companion.m410k(bArr, c0057t);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC0061x create(byte[] bArr, C0057t c0057t, int i10) {
        return Companion.m411l(bArr, c0057t, i10);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC0061x create(byte[] bArr, C0057t c0057t, int i10, int i11) {
        return Companion.m412m(bArr, c0057t, i10, i11);
    }
}
