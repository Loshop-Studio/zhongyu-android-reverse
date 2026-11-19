package p136i9;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.BufferedSink;
import okio.ByteString;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Source;
import p123h7.InterfaceC8721a;
import p147j9.AbstractC9031a;
import p147j9.AbstractC9038h;
import p256t7.AbstractC10117b;

/* renamed from: i9.c0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8901c0 {
    public static final a Companion;
    public static final AbstractC8901c0 EMPTY;

    /* renamed from: i9.c0$a */
    public static final class a {

        /* renamed from: i9.c0$a$a, reason: collision with other inner class name */
        public static final class C10806a extends AbstractC8901c0 {

            /* renamed from: a */
            public final /* synthetic */ C8927y f16652a;

            /* renamed from: b */
            public final /* synthetic */ File f16653b;

            public C10806a(C8927y c8927y, File file) {
                this.f16652a = c8927y;
                this.f16653b = file;
            }

            @Override // p136i9.AbstractC8901c0
            public long contentLength() {
                return this.f16653b.length();
            }

            @Override // p136i9.AbstractC8901c0
            public C8927y contentType() {
                return this.f16652a;
            }

            @Override // p136i9.AbstractC8901c0
            public void writeTo(BufferedSink sink) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                AbstractC9133u.m16133g(sink, "sink");
                Source source = Okio.source(this.f16653b);
                try {
                    sink.writeAll(source);
                    AbstractC10117b.m18861a(source, null);
                } finally {
                }
            }
        }

        /* renamed from: i9.c0$a$b */
        public static final class b extends AbstractC8901c0 {

            /* renamed from: a */
            public final /* synthetic */ C8927y f16654a;

            /* renamed from: b */
            public final /* synthetic */ FileSystem f16655b;

            /* renamed from: c */
            public final /* synthetic */ Path f16656c;

            public b(C8927y c8927y, FileSystem fileSystem, Path path) {
                this.f16654a = c8927y;
                this.f16655b = fileSystem;
                this.f16656c = path;
            }

            @Override // p136i9.AbstractC8901c0
            public long contentLength() {
                Long size = this.f16655b.metadata(this.f16656c).getSize();
                if (size != null) {
                    return size.longValue();
                }
                return -1L;
            }

            @Override // p136i9.AbstractC8901c0
            public C8927y contentType() {
                return this.f16654a;
            }

            @Override // p136i9.AbstractC8901c0
            public void writeTo(BufferedSink sink) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                AbstractC9133u.m16133g(sink, "sink");
                Source source = this.f16655b.source(this.f16656c);
                try {
                    sink.writeAll(source);
                    AbstractC10117b.m18861a(source, null);
                } finally {
                }
            }
        }

        /* renamed from: i9.c0$a$c */
        public static final class c extends AbstractC8901c0 {

            /* renamed from: a */
            public final /* synthetic */ C8927y f16657a;

            /* renamed from: b */
            public final /* synthetic */ ByteString f16658b;

            public c(C8927y c8927y, ByteString byteString) {
                this.f16657a = c8927y;
                this.f16658b = byteString;
            }

            @Override // p136i9.AbstractC8901c0
            public long contentLength() {
                return this.f16658b.size();
            }

            @Override // p136i9.AbstractC8901c0
            public C8927y contentType() {
                return this.f16657a;
            }

            @Override // p136i9.AbstractC8901c0
            public void writeTo(BufferedSink sink) {
                AbstractC9133u.m16133g(sink, "sink");
                sink.write(this.f16658b);
            }
        }

        /* renamed from: i9.c0$a$d */
        public static final class d extends AbstractC8901c0 {

            /* renamed from: a */
            public final /* synthetic */ C8927y f16659a;

            /* renamed from: b */
            public final /* synthetic */ FileDescriptor f16660b;

            public d(C8927y c8927y, FileDescriptor fileDescriptor) {
                this.f16659a = c8927y;
                this.f16660b = fileDescriptor;
            }

            @Override // p136i9.AbstractC8901c0
            public C8927y contentType() {
                return this.f16659a;
            }

            @Override // p136i9.AbstractC8901c0
            public boolean isOneShot() {
                return true;
            }

            @Override // p136i9.AbstractC8901c0
            public void writeTo(BufferedSink sink) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                AbstractC9133u.m16133g(sink, "sink");
                FileInputStream fileInputStream = new FileInputStream(this.f16660b);
                try {
                    sink.getBuffer().writeAll(Okio.source(fileInputStream));
                    AbstractC10117b.m18861a(fileInputStream, null);
                } finally {
                }
            }
        }

        /* renamed from: i9.c0$a$e */
        public static final class e extends AbstractC8901c0 {

            /* renamed from: a */
            public final /* synthetic */ C8927y f16661a;

            /* renamed from: b */
            public final /* synthetic */ int f16662b;

            /* renamed from: c */
            public final /* synthetic */ byte[] f16663c;

            /* renamed from: d */
            public final /* synthetic */ int f16664d;

            public e(C8927y c8927y, int i10, byte[] bArr, int i11) {
                this.f16661a = c8927y;
                this.f16662b = i10;
                this.f16663c = bArr;
                this.f16664d = i11;
            }

            @Override // p136i9.AbstractC8901c0
            public long contentLength() {
                return this.f16662b;
            }

            @Override // p136i9.AbstractC8901c0
            public C8927y contentType() {
                return this.f16661a;
            }

            @Override // p136i9.AbstractC8901c0
            public void writeTo(BufferedSink sink) {
                AbstractC9133u.m16133g(sink, "sink");
                sink.write(this.f16663c, this.f16664d, this.f16662b);
            }
        }

        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: p */
        public static /* synthetic */ AbstractC8901c0 m15075p(a aVar, C8927y c8927y, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.m15083f(c8927y, bArr, i10, i11);
        }

        /* renamed from: q */
        public static /* synthetic */ AbstractC8901c0 m15076q(a aVar, ByteString byteString, C8927y c8927y, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c8927y = null;
            }
            return aVar.m15087j(byteString, c8927y);
        }

        /* renamed from: r */
        public static /* synthetic */ AbstractC8901c0 m15077r(a aVar, byte[] bArr, C8927y c8927y, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                c8927y = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.m15092o(bArr, c8927y, i10, i11);
        }

        /* renamed from: a */
        public final AbstractC8901c0 m15078a(C8927y c8927y, File file) {
            AbstractC9133u.m16133g(file, "file");
            return m15084g(file, c8927y);
        }

        /* renamed from: b */
        public final AbstractC8901c0 m15079b(C8927y c8927y, String content) {
            AbstractC9133u.m16133g(content, "content");
            return m15086i(content, c8927y);
        }

        /* renamed from: c */
        public final AbstractC8901c0 m15080c(C8927y c8927y, ByteString content) {
            AbstractC9133u.m16133g(content, "content");
            return m15087j(content, c8927y);
        }

        /* renamed from: d */
        public final AbstractC8901c0 m15081d(C8927y c8927y, byte[] content) {
            AbstractC9133u.m16133g(content, "content");
            return m15075p(this, c8927y, content, 0, 0, 12, null);
        }

        /* renamed from: e */
        public final AbstractC8901c0 m15082e(C8927y c8927y, byte[] content, int i10) {
            AbstractC9133u.m16133g(content, "content");
            return m15075p(this, c8927y, content, i10, 0, 8, null);
        }

        /* renamed from: f */
        public final AbstractC8901c0 m15083f(C8927y c8927y, byte[] content, int i10, int i11) {
            AbstractC9133u.m16133g(content, "content");
            return m15092o(content, c8927y, i10, i11);
        }

        /* renamed from: g */
        public final AbstractC8901c0 m15084g(File file, C8927y c8927y) {
            AbstractC9133u.m16133g(file, "<this>");
            return new C10806a(c8927y, file);
        }

        /* renamed from: h */
        public final AbstractC8901c0 m15085h(FileDescriptor fileDescriptor, C8927y c8927y) {
            AbstractC9133u.m16133g(fileDescriptor, "<this>");
            return new d(c8927y, fileDescriptor);
        }

        /* renamed from: i */
        public final AbstractC8901c0 m15086i(String str, C8927y c8927y) {
            AbstractC9133u.m16133g(str, "<this>");
            Pair pairM15697b = AbstractC9031a.m15697b(c8927y);
            Charset charset = (Charset) pairM15697b.m15903a();
            C8927y c8927y2 = (C8927y) pairM15697b.m15904b();
            byte[] bytes = str.getBytes(charset);
            AbstractC9133u.m16132f(bytes, "getBytes(...)");
            return m15092o(bytes, c8927y2, 0, bytes.length);
        }

        /* renamed from: j */
        public final AbstractC8901c0 m15087j(ByteString byteString, C8927y c8927y) {
            AbstractC9133u.m16133g(byteString, "<this>");
            return new c(c8927y, byteString);
        }

        /* renamed from: k */
        public final AbstractC8901c0 m15088k(Path path, FileSystem fileSystem, C8927y c8927y) {
            AbstractC9133u.m16133g(path, "<this>");
            AbstractC9133u.m16133g(fileSystem, "fileSystem");
            return new b(c8927y, fileSystem, path);
        }

        /* renamed from: l */
        public final AbstractC8901c0 m15089l(byte[] bArr) {
            AbstractC9133u.m16133g(bArr, "<this>");
            return m15077r(this, bArr, null, 0, 0, 7, null);
        }

        /* renamed from: m */
        public final AbstractC8901c0 m15090m(byte[] bArr, C8927y c8927y) {
            AbstractC9133u.m16133g(bArr, "<this>");
            return m15077r(this, bArr, c8927y, 0, 0, 6, null);
        }

        /* renamed from: n */
        public final AbstractC8901c0 m15091n(byte[] bArr, C8927y c8927y, int i10) {
            AbstractC9133u.m16133g(bArr, "<this>");
            return m15077r(this, bArr, c8927y, i10, 0, 4, null);
        }

        /* renamed from: o */
        public final AbstractC8901c0 m15092o(byte[] bArr, C8927y c8927y, int i10, int i11) {
            AbstractC9133u.m16133g(bArr, "<this>");
            AbstractC9038h.m15749e(bArr.length, i10, i11);
            return new e(c8927y, i11, bArr, i10);
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        Companion = aVar;
        EMPTY = a.m15076q(aVar, ByteString.EMPTY, null, 1, null);
    }

    @InterfaceC8721a
    public static final AbstractC8901c0 create(C8927y c8927y, File file) {
        return Companion.m15078a(c8927y, file);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract C8927y contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink);

    @InterfaceC8721a
    public static final AbstractC8901c0 create(C8927y c8927y, String str) {
        return Companion.m15079b(c8927y, str);
    }

    @InterfaceC8721a
    public static final AbstractC8901c0 create(C8927y c8927y, ByteString byteString) {
        return Companion.m15080c(c8927y, byteString);
    }

    @InterfaceC8721a
    public static final AbstractC8901c0 create(C8927y c8927y, byte[] bArr) {
        return Companion.m15081d(c8927y, bArr);
    }

    @InterfaceC8721a
    public static final AbstractC8901c0 create(C8927y c8927y, byte[] bArr, int i10) {
        return Companion.m15082e(c8927y, bArr, i10);
    }

    @InterfaceC8721a
    public static final AbstractC8901c0 create(C8927y c8927y, byte[] bArr, int i10, int i11) {
        return Companion.m15083f(c8927y, bArr, i10, i11);
    }

    public static final AbstractC8901c0 create(File file, C8927y c8927y) {
        return Companion.m15084g(file, c8927y);
    }

    public static final AbstractC8901c0 create(FileDescriptor fileDescriptor, C8927y c8927y) {
        return Companion.m15085h(fileDescriptor, c8927y);
    }

    public static final AbstractC8901c0 create(String str, C8927y c8927y) {
        return Companion.m15086i(str, c8927y);
    }

    public static final AbstractC8901c0 create(ByteString byteString, C8927y c8927y) {
        return Companion.m15087j(byteString, c8927y);
    }

    public static final AbstractC8901c0 create(Path path, FileSystem fileSystem, C8927y c8927y) {
        return Companion.m15088k(path, fileSystem, c8927y);
    }

    public static final AbstractC8901c0 create(byte[] bArr) {
        return Companion.m15089l(bArr);
    }

    public static final AbstractC8901c0 create(byte[] bArr, C8927y c8927y) {
        return Companion.m15090m(bArr, c8927y);
    }

    public static final AbstractC8901c0 create(byte[] bArr, C8927y c8927y, int i10) {
        return Companion.m15091n(bArr, c8927y, i10);
    }

    public static final AbstractC8901c0 create(byte[] bArr, C8927y c8927y, int i10, int i11) {
        return Companion.m15092o(bArr, c8927y, i10, i11);
    }
}
