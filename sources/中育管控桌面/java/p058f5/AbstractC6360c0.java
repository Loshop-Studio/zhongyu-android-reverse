package p058f5;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p094io.CloseableKt;
import okio.BufferedSink;
import okio.ByteString;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Source;
import p065g5.AbstractC6417a;
import p065g5.AbstractC6424h;

/* renamed from: f5.c0 */
/* loaded from: classes4.dex */
public abstract class AbstractC6360c0 {
    public static final a Companion;

    @JvmField
    public static final AbstractC6360c0 EMPTY;

    /* renamed from: f5.c0$a */
    public static final class a {

        /* renamed from: f5.c0$a$a, reason: collision with other inner class name */
        public static final class C8027a extends AbstractC6360c0 {

            /* renamed from: a */
            public final /* synthetic */ C6386y f7820a;

            /* renamed from: b */
            public final /* synthetic */ File f7821b;

            public C8027a(C6386y c6386y, File file) {
                this.f7820a = c6386y;
                this.f7821b = file;
            }

            @Override // p058f5.AbstractC6360c0
            public long contentLength() {
                return this.f7821b.length();
            }

            @Override // p058f5.AbstractC6360c0
            public C6386y contentType() {
                return this.f7820a;
            }

            @Override // p058f5.AbstractC6360c0
            public void writeTo(BufferedSink sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                Source source = Okio.source(this.f7821b);
                try {
                    sink.writeAll(source);
                    CloseableKt.closeFinally(source, null);
                } finally {
                }
            }
        }

        /* renamed from: f5.c0$a$b */
        public static final class b extends AbstractC6360c0 {

            /* renamed from: a */
            public final /* synthetic */ C6386y f7822a;

            /* renamed from: b */
            public final /* synthetic */ FileSystem f7823b;

            /* renamed from: c */
            public final /* synthetic */ Path f7824c;

            public b(C6386y c6386y, FileSystem fileSystem, Path path) {
                this.f7822a = c6386y;
                this.f7823b = fileSystem;
                this.f7824c = path;
            }

            @Override // p058f5.AbstractC6360c0
            public long contentLength() {
                Long size = this.f7823b.metadata(this.f7824c).getSize();
                if (size != null) {
                    return size.longValue();
                }
                return -1L;
            }

            @Override // p058f5.AbstractC6360c0
            public C6386y contentType() {
                return this.f7822a;
            }

            @Override // p058f5.AbstractC6360c0
            public void writeTo(BufferedSink sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                Source source = this.f7823b.source(this.f7824c);
                try {
                    sink.writeAll(source);
                    CloseableKt.closeFinally(source, null);
                } finally {
                }
            }
        }

        /* renamed from: f5.c0$a$c */
        public static final class c extends AbstractC6360c0 {

            /* renamed from: a */
            public final /* synthetic */ C6386y f7825a;

            /* renamed from: b */
            public final /* synthetic */ ByteString f7826b;

            public c(C6386y c6386y, ByteString byteString) {
                this.f7825a = c6386y;
                this.f7826b = byteString;
            }

            @Override // p058f5.AbstractC6360c0
            public long contentLength() {
                return this.f7826b.size();
            }

            @Override // p058f5.AbstractC6360c0
            public C6386y contentType() {
                return this.f7825a;
            }

            @Override // p058f5.AbstractC6360c0
            public void writeTo(BufferedSink sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.f7826b);
            }
        }

        /* renamed from: f5.c0$a$d */
        public static final class d extends AbstractC6360c0 {

            /* renamed from: a */
            public final /* synthetic */ C6386y f7827a;

            /* renamed from: b */
            public final /* synthetic */ FileDescriptor f7828b;

            public d(C6386y c6386y, FileDescriptor fileDescriptor) {
                this.f7827a = c6386y;
                this.f7828b = fileDescriptor;
            }

            @Override // p058f5.AbstractC6360c0
            public C6386y contentType() {
                return this.f7827a;
            }

            @Override // p058f5.AbstractC6360c0
            public boolean isOneShot() {
                return true;
            }

            @Override // p058f5.AbstractC6360c0
            public void writeTo(BufferedSink sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                FileInputStream fileInputStream = new FileInputStream(this.f7828b);
                try {
                    sink.getBuffer().writeAll(Okio.source(fileInputStream));
                    CloseableKt.closeFinally(fileInputStream, null);
                } finally {
                }
            }
        }

        /* renamed from: f5.c0$a$e */
        public static final class e extends AbstractC6360c0 {

            /* renamed from: a */
            public final /* synthetic */ C6386y f7829a;

            /* renamed from: b */
            public final /* synthetic */ int f7830b;

            /* renamed from: c */
            public final /* synthetic */ byte[] f7831c;

            /* renamed from: d */
            public final /* synthetic */ int f7832d;

            public e(C6386y c6386y, int i6, byte[] bArr, int i7) {
                this.f7829a = c6386y;
                this.f7830b = i6;
                this.f7831c = bArr;
                this.f7832d = i7;
            }

            @Override // p058f5.AbstractC6360c0
            public long contentLength() {
                return this.f7830b;
            }

            @Override // p058f5.AbstractC6360c0
            public C6386y contentType() {
                return this.f7829a;
            }

            @Override // p058f5.AbstractC6360c0
            public void writeTo(BufferedSink sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.f7831c, this.f7832d, this.f7830b);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: p */
        public static /* synthetic */ AbstractC6360c0 m6612p(a aVar, C6386y c6386y, byte[] bArr, int i6, int i7, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                i6 = 0;
            }
            if ((i8 & 8) != 0) {
                i7 = bArr.length;
            }
            return aVar.m6620f(c6386y, bArr, i6, i7);
        }

        /* renamed from: q */
        public static /* synthetic */ AbstractC6360c0 m6613q(a aVar, ByteString byteString, C6386y c6386y, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                c6386y = null;
            }
            return aVar.m6624j(byteString, c6386y);
        }

        /* renamed from: r */
        public static /* synthetic */ AbstractC6360c0 m6614r(a aVar, byte[] bArr, C6386y c6386y, int i6, int i7, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                c6386y = null;
            }
            if ((i8 & 2) != 0) {
                i6 = 0;
            }
            if ((i8 & 4) != 0) {
                i7 = bArr.length;
            }
            return aVar.m6629o(bArr, c6386y, i6, i7);
        }

        /* renamed from: a */
        public final AbstractC6360c0 m6615a(C6386y c6386y, File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return m6621g(file, c6386y);
        }

        /* renamed from: b */
        public final AbstractC6360c0 m6616b(C6386y c6386y, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m6623i(content, c6386y);
        }

        /* renamed from: c */
        public final AbstractC6360c0 m6617c(C6386y c6386y, ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m6624j(content, c6386y);
        }

        /* renamed from: d */
        public final AbstractC6360c0 m6618d(C6386y c6386y, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m6612p(this, c6386y, content, 0, 0, 12, null);
        }

        /* renamed from: e */
        public final AbstractC6360c0 m6619e(C6386y c6386y, byte[] content, int i6) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m6612p(this, c6386y, content, i6, 0, 8, null);
        }

        /* renamed from: f */
        public final AbstractC6360c0 m6620f(C6386y c6386y, byte[] content, int i6, int i7) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m6629o(content, c6386y, i6, i7);
        }

        /* renamed from: g */
        public final AbstractC6360c0 m6621g(File file, C6386y c6386y) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return new C8027a(c6386y, file);
        }

        /* renamed from: h */
        public final AbstractC6360c0 m6622h(FileDescriptor fileDescriptor, C6386y c6386y) {
            Intrinsics.checkNotNullParameter(fileDescriptor, "<this>");
            return new d(c6386y, fileDescriptor);
        }

        /* renamed from: i */
        public final AbstractC6360c0 m6623i(String str, C6386y c6386y) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Pair pairM6939b = AbstractC6417a.m6939b(c6386y);
            Charset charset = (Charset) pairM6939b.component1();
            C6386y c6386y2 = (C6386y) pairM6939b.component2();
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return m6629o(bytes, c6386y2, 0, bytes.length);
        }

        /* renamed from: j */
        public final AbstractC6360c0 m6624j(ByteString byteString, C6386y c6386y) {
            Intrinsics.checkNotNullParameter(byteString, "<this>");
            return new c(c6386y, byteString);
        }

        /* renamed from: k */
        public final AbstractC6360c0 m6625k(Path path, FileSystem fileSystem, C6386y c6386y) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
            return new b(c6386y, fileSystem, path);
        }

        /* renamed from: l */
        public final AbstractC6360c0 m6626l(byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m6614r(this, bArr, null, 0, 0, 7, null);
        }

        /* renamed from: m */
        public final AbstractC6360c0 m6627m(byte[] bArr, C6386y c6386y) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m6614r(this, bArr, c6386y, 0, 0, 6, null);
        }

        /* renamed from: n */
        public final AbstractC6360c0 m6628n(byte[] bArr, C6386y c6386y, int i6) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m6614r(this, bArr, c6386y, i6, 0, 4, null);
        }

        /* renamed from: o */
        public final AbstractC6360c0 m6629o(byte[] bArr, C6386y c6386y, int i6, int i7) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            AbstractC6424h.m6991e(bArr.length, i6, i7);
            return new e(c6386y, i7, bArr, i6);
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        Companion = aVar;
        EMPTY = a.m6613q(aVar, ByteString.EMPTY, null, 1, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    public static final AbstractC6360c0 create(C6386y c6386y, File file) {
        return Companion.m6615a(c6386y, file);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract C6386y contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final AbstractC6360c0 create(C6386y c6386y, String str) {
        return Companion.m6616b(c6386y, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final AbstractC6360c0 create(C6386y c6386y, ByteString byteString) {
        return Companion.m6617c(c6386y, byteString);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final AbstractC6360c0 create(C6386y c6386y, byte[] bArr) {
        return Companion.m6618d(c6386y, bArr);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final AbstractC6360c0 create(C6386y c6386y, byte[] bArr, int i6) {
        return Companion.m6619e(c6386y, bArr, i6);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final AbstractC6360c0 create(C6386y c6386y, byte[] bArr, int i6, int i7) {
        return Companion.m6620f(c6386y, bArr, i6, i7);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC6360c0 create(File file, C6386y c6386y) {
        return Companion.m6621g(file, c6386y);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC6360c0 create(FileDescriptor fileDescriptor, C6386y c6386y) {
        return Companion.m6622h(fileDescriptor, c6386y);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC6360c0 create(String str, C6386y c6386y) {
        return Companion.m6623i(str, c6386y);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC6360c0 create(ByteString byteString, C6386y c6386y) {
        return Companion.m6624j(byteString, c6386y);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final AbstractC6360c0 create(Path path, FileSystem fileSystem, C6386y c6386y) {
        return Companion.m6625k(path, fileSystem, c6386y);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC6360c0 create(byte[] bArr) {
        return Companion.m6626l(bArr);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC6360c0 create(byte[] bArr, C6386y c6386y) {
        return Companion.m6627m(bArr, c6386y);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC6360c0 create(byte[] bArr, C6386y c6386y, int i6) {
        return Companion.m6628n(bArr, c6386y, i6);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final AbstractC6360c0 create(byte[] bArr, C6386y c6386y, int i6, int i7) {
        return Companion.m6629o(bArr, c6386y, i6, i7);
    }
}
