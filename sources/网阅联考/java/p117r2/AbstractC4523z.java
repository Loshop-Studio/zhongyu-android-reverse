package p117r2;

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
import kotlin.p086io.CloseableKt;
import kotlin.text.Charsets;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import p121s2.AbstractC4550b;

/* renamed from: r2.z */
/* loaded from: classes2.dex */
public abstract class AbstractC4523z {
    public static final a Companion = new a(null);

    /* renamed from: r2.z$a */
    public static final class a {

        /* renamed from: r2.z$a$a, reason: collision with other inner class name */
        public static final class C4770a extends AbstractC4523z {

            /* renamed from: a */
            public final /* synthetic */ File f5655a;

            /* renamed from: b */
            public final /* synthetic */ C4519v f5656b;

            public C4770a(File file, C4519v c4519v) {
                this.f5655a = file;
                this.f5656b = c4519v;
            }

            @Override // p117r2.AbstractC4523z
            public long contentLength() {
                return this.f5655a.length();
            }

            @Override // p117r2.AbstractC4523z
            public C4519v contentType() {
                return this.f5656b;
            }

            @Override // p117r2.AbstractC4523z
            public void writeTo(BufferedSink sink) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                Source source = Okio.source(this.f5655a);
                try {
                    sink.writeAll(source);
                    CloseableKt.closeFinally(source, null);
                } finally {
                }
            }
        }

        /* renamed from: r2.z$a$b */
        public static final class b extends AbstractC4523z {

            /* renamed from: a */
            public final /* synthetic */ ByteString f5657a;

            /* renamed from: b */
            public final /* synthetic */ C4519v f5658b;

            public b(ByteString byteString, C4519v c4519v) {
                this.f5657a = byteString;
                this.f5658b = c4519v;
            }

            @Override // p117r2.AbstractC4523z
            public long contentLength() {
                return this.f5657a.size();
            }

            @Override // p117r2.AbstractC4523z
            public C4519v contentType() {
                return this.f5658b;
            }

            @Override // p117r2.AbstractC4523z
            public void writeTo(BufferedSink sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.f5657a);
            }
        }

        /* renamed from: r2.z$a$c */
        public static final class c extends AbstractC4523z {

            /* renamed from: a */
            public final /* synthetic */ byte[] f5659a;

            /* renamed from: b */
            public final /* synthetic */ C4519v f5660b;

            /* renamed from: c */
            public final /* synthetic */ int f5661c;

            /* renamed from: d */
            public final /* synthetic */ int f5662d;

            public c(byte[] bArr, C4519v c4519v, int i4, int i5) {
                this.f5659a = bArr;
                this.f5660b = c4519v;
                this.f5661c = i4;
                this.f5662d = i5;
            }

            @Override // p117r2.AbstractC4523z
            public long contentLength() {
                return this.f5661c;
            }

            @Override // p117r2.AbstractC4523z
            public C4519v contentType() {
                return this.f5660b;
            }

            @Override // p117r2.AbstractC4523z
            public void writeTo(BufferedSink sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.f5659a, this.f5662d, this.f5661c);
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ AbstractC4523z m6151i(a aVar, C4519v c4519v, byte[] bArr, int i4, int i5, int i6, Object obj) {
            if ((i6 & 4) != 0) {
                i4 = 0;
            }
            if ((i6 & 8) != 0) {
                i5 = bArr.length;
            }
            return aVar.m6159g(c4519v, bArr, i4, i5);
        }

        /* renamed from: j */
        public static /* synthetic */ AbstractC4523z m6152j(a aVar, byte[] bArr, C4519v c4519v, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                c4519v = null;
            }
            if ((i6 & 2) != 0) {
                i4 = 0;
            }
            if ((i6 & 4) != 0) {
                i5 = bArr.length;
            }
            return aVar.m6160h(bArr, c4519v, i4, i5);
        }

        /* renamed from: a */
        public final AbstractC4523z m6153a(File asRequestBody, C4519v c4519v) {
            Intrinsics.checkNotNullParameter(asRequestBody, "$this$asRequestBody");
            return new C4770a(asRequestBody, c4519v);
        }

        /* renamed from: b */
        public final AbstractC4523z m6154b(String toRequestBody, C4519v c4519v) {
            Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
            Charset charset = Charsets.UTF_8;
            if (c4519v != null) {
                Charset charsetM6049d = C4519v.m6049d(c4519v, null, 1, null);
                if (charsetM6049d == null) {
                    c4519v = C4519v.f5558g.m6055b(c4519v + "; charset=utf-8");
                } else {
                    charset = charsetM6049d;
                }
            }
            byte[] bytes = toRequestBody.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return m6160h(bytes, c4519v, 0, bytes.length);
        }

        /* renamed from: c */
        public final AbstractC4523z m6155c(ByteString toRequestBody, C4519v c4519v) {
            Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
            return new b(toRequestBody, c4519v);
        }

        /* renamed from: d */
        public final AbstractC4523z m6156d(C4519v c4519v, File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return m6153a(file, c4519v);
        }

        /* renamed from: e */
        public final AbstractC4523z m6157e(C4519v c4519v, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m6154b(content, c4519v);
        }

        /* renamed from: f */
        public final AbstractC4523z m6158f(C4519v c4519v, ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m6155c(content, c4519v);
        }

        /* renamed from: g */
        public final AbstractC4523z m6159g(C4519v c4519v, byte[] content, int i4, int i5) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m6160h(content, c4519v, i4, i5);
        }

        /* renamed from: h */
        public final AbstractC4523z m6160h(byte[] toRequestBody, C4519v c4519v, int i4, int i5) {
            Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
            AbstractC4550b.m6227i(toRequestBody.length, i4, i5);
            return new c(toRequestBody, c4519v, i5, i4);
        }
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC4523z create(File file, C4519v c4519v) {
        return Companion.m6153a(file, c4519v);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract C4519v contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink);

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC4523z create(String str, C4519v c4519v) {
        return Companion.m6154b(str, c4519v);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC4523z create(ByteString byteString, C4519v c4519v) {
        return Companion.m6155c(byteString, c4519v);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    public static final AbstractC4523z create(C4519v c4519v, File file) {
        return Companion.m6156d(c4519v, file);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final AbstractC4523z create(C4519v c4519v, String str) {
        return Companion.m6157e(c4519v, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final AbstractC4523z create(C4519v c4519v, ByteString byteString) {
        return Companion.m6158f(c4519v, byteString);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final AbstractC4523z create(C4519v c4519v, byte[] bArr) {
        return a.m6151i(Companion, c4519v, bArr, 0, 0, 12, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final AbstractC4523z create(C4519v c4519v, byte[] bArr, int i4) {
        return a.m6151i(Companion, c4519v, bArr, i4, 0, 8, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final AbstractC4523z create(C4519v c4519v, byte[] bArr, int i4, int i5) {
        return Companion.m6159g(c4519v, bArr, i4, i5);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC4523z create(byte[] bArr) {
        return a.m6152j(Companion, bArr, null, 0, 0, 7, null);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC4523z create(byte[] bArr, C4519v c4519v) {
        return a.m6152j(Companion, bArr, c4519v, 0, 0, 6, null);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC4523z create(byte[] bArr, C4519v c4519v, int i4) {
        return a.m6152j(Companion, bArr, c4519v, i4, 0, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC4523z create(byte[] bArr, C4519v c4519v, int i4, int i5) {
        return Companion.m6160h(bArr, c4519v, i4, i5);
    }
}
