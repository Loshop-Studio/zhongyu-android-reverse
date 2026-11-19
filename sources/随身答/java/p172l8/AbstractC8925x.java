package p172l8;

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
import kotlin.p161io.CloseableKt;
import kotlin.text.Charsets;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import p182m8.AbstractC9045d;

/* renamed from: l8.x */
/* loaded from: classes5.dex */
public abstract class AbstractC8925x {
    public static final a Companion = new a(null);

    /* renamed from: l8.x$a */
    public static final class a {

        /* renamed from: l8.x$a$a, reason: collision with other inner class name */
        public static final class C10080a extends AbstractC8925x {

            /* renamed from: a */
            public final /* synthetic */ C8921t f14916a;

            /* renamed from: b */
            public final /* synthetic */ File f14917b;

            public C10080a(C8921t c8921t, File file) {
                this.f14916a = c8921t;
                this.f14917b = file;
            }

            @Override // p172l8.AbstractC8925x
            public long contentLength() {
                return this.f14917b.length();
            }

            @Override // p172l8.AbstractC8925x
            public C8921t contentType() {
                return this.f14916a;
            }

            @Override // p172l8.AbstractC8925x
            public void writeTo(BufferedSink sink) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                Source source = Okio.source(this.f14917b);
                try {
                    sink.writeAll(source);
                    CloseableKt.closeFinally(source, null);
                } finally {
                }
            }
        }

        /* renamed from: l8.x$a$b */
        public static final class b extends AbstractC8925x {

            /* renamed from: a */
            public final /* synthetic */ C8921t f14918a;

            /* renamed from: b */
            public final /* synthetic */ ByteString f14919b;

            public b(C8921t c8921t, ByteString byteString) {
                this.f14918a = c8921t;
                this.f14919b = byteString;
            }

            @Override // p172l8.AbstractC8925x
            public long contentLength() {
                return this.f14919b.size();
            }

            @Override // p172l8.AbstractC8925x
            public C8921t contentType() {
                return this.f14918a;
            }

            @Override // p172l8.AbstractC8925x
            public void writeTo(BufferedSink sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.f14919b);
            }
        }

        /* renamed from: l8.x$a$c */
        public static final class c extends AbstractC8925x {

            /* renamed from: a */
            public final /* synthetic */ C8921t f14920a;

            /* renamed from: b */
            public final /* synthetic */ int f14921b;

            /* renamed from: c */
            public final /* synthetic */ byte[] f14922c;

            /* renamed from: d */
            public final /* synthetic */ int f14923d;

            public c(C8921t c8921t, int i9, byte[] bArr, int i10) {
                this.f14920a = c8921t;
                this.f14921b = i9;
                this.f14922c = bArr;
                this.f14923d = i10;
            }

            @Override // p172l8.AbstractC8925x
            public long contentLength() {
                return this.f14921b;
            }

            @Override // p172l8.AbstractC8925x
            public C8921t contentType() {
                return this.f14920a;
            }

            @Override // p172l8.AbstractC8925x
            public void writeTo(BufferedSink sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.f14922c, this.f14923d, this.f14921b);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: n */
        public static /* synthetic */ AbstractC8925x m14153n(a aVar, C8921t c8921t, byte[] bArr, int i9, int i10, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                i9 = 0;
            }
            if ((i11 & 8) != 0) {
                i10 = bArr.length;
            }
            return aVar.m14163h(c8921t, bArr, i9, i10);
        }

        /* renamed from: o */
        public static /* synthetic */ AbstractC8925x m14154o(a aVar, ByteString byteString, C8921t c8921t, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                c8921t = null;
            }
            return aVar.m14164i(byteString, c8921t);
        }

        /* renamed from: p */
        public static /* synthetic */ AbstractC8925x m14155p(a aVar, byte[] bArr, C8921t c8921t, int i9, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                c8921t = null;
            }
            if ((i11 & 2) != 0) {
                i9 = 0;
            }
            if ((i11 & 4) != 0) {
                i10 = bArr.length;
            }
            return aVar.m14168m(bArr, c8921t, i9, i10);
        }

        /* renamed from: a */
        public final AbstractC8925x m14156a(File file, C8921t c8921t) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return new C10080a(c8921t, file);
        }

        /* renamed from: b */
        public final AbstractC8925x m14157b(String str, C8921t c8921t) {
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
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return m14168m(bytes, c8921t, 0, bytes.length);
        }

        /* renamed from: c */
        public final AbstractC8925x m14158c(C8921t c8921t, File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return m14156a(file, c8921t);
        }

        /* renamed from: d */
        public final AbstractC8925x m14159d(C8921t c8921t, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m14157b(content, c8921t);
        }

        /* renamed from: e */
        public final AbstractC8925x m14160e(C8921t c8921t, ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m14164i(content, c8921t);
        }

        /* renamed from: f */
        public final AbstractC8925x m14161f(C8921t c8921t, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m14153n(this, c8921t, content, 0, 0, 12, null);
        }

        /* renamed from: g */
        public final AbstractC8925x m14162g(C8921t c8921t, byte[] content, int i9) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m14153n(this, c8921t, content, i9, 0, 8, null);
        }

        /* renamed from: h */
        public final AbstractC8925x m14163h(C8921t c8921t, byte[] content, int i9, int i10) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m14168m(content, c8921t, i9, i10);
        }

        /* renamed from: i */
        public final AbstractC8925x m14164i(ByteString byteString, C8921t c8921t) {
            Intrinsics.checkNotNullParameter(byteString, "<this>");
            return new b(c8921t, byteString);
        }

        /* renamed from: j */
        public final AbstractC8925x m14165j(byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m14155p(this, bArr, null, 0, 0, 7, null);
        }

        /* renamed from: k */
        public final AbstractC8925x m14166k(byte[] bArr, C8921t c8921t) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m14155p(this, bArr, c8921t, 0, 0, 6, null);
        }

        /* renamed from: l */
        public final AbstractC8925x m14167l(byte[] bArr, C8921t c8921t, int i9) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m14155p(this, bArr, c8921t, i9, 0, 4, null);
        }

        /* renamed from: m */
        public final AbstractC8925x m14168m(byte[] bArr, C8921t c8921t, int i9, int i10) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            AbstractC9045d.m14496l(bArr.length, i9, i10);
            return new c(c8921t, i10, bArr, i9);
        }

        public a() {
        }
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC8925x create(File file, C8921t c8921t) {
        return Companion.m14156a(file, c8921t);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract C8921t contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink);

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC8925x create(String str, C8921t c8921t) {
        return Companion.m14157b(str, c8921t);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    public static final AbstractC8925x create(C8921t c8921t, File file) {
        return Companion.m14158c(c8921t, file);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final AbstractC8925x create(C8921t c8921t, String str) {
        return Companion.m14159d(c8921t, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final AbstractC8925x create(C8921t c8921t, ByteString byteString) {
        return Companion.m14160e(c8921t, byteString);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final AbstractC8925x create(C8921t c8921t, byte[] bArr) {
        return Companion.m14161f(c8921t, bArr);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final AbstractC8925x create(C8921t c8921t, byte[] bArr, int i9) {
        return Companion.m14162g(c8921t, bArr, i9);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final AbstractC8925x create(C8921t c8921t, byte[] bArr, int i9, int i10) {
        return Companion.m14163h(c8921t, bArr, i9, i10);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC8925x create(ByteString byteString, C8921t c8921t) {
        return Companion.m14164i(byteString, c8921t);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC8925x create(byte[] bArr) {
        return Companion.m14165j(bArr);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC8925x create(byte[] bArr, C8921t c8921t) {
        return Companion.m14166k(bArr, c8921t);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC8925x create(byte[] bArr, C8921t c8921t, int i9) {
        return Companion.m14167l(bArr, c8921t, i9);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC8925x create(byte[] bArr, C8921t c8921t, int i9, int i10) {
        return Companion.m14168m(bArr, c8921t, i9, i10);
    }
}
