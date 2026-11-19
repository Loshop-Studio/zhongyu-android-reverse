package je;

import cd.AbstractC5423b;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import p309qc.InterfaceC10770a;
import p310qd.C10792c;

/* renamed from: je.x */
/* loaded from: classes6.dex */
public abstract class AbstractC9744x {
    public static final a Companion = new a(null);

    /* renamed from: je.x$a */
    public static final class a {

        /* renamed from: je.x$a$a, reason: collision with other inner class name */
        public static final class C12142a extends AbstractC9744x {

            /* renamed from: a */
            public final /* synthetic */ C9740t f22869a;

            /* renamed from: b */
            public final /* synthetic */ File f22870b;

            public C12142a(C9740t c9740t, File file) {
                this.f22869a = c9740t;
                this.f22870b = file;
            }

            @Override // je.AbstractC9744x
            public long contentLength() {
                return this.f22870b.length();
            }

            @Override // je.AbstractC9744x
            public C9740t contentType() {
                return this.f22869a;
            }

            @Override // je.AbstractC9744x
            public void writeTo(BufferedSink sink) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                AbstractC9979u.m20294g(sink, "sink");
                Source source = Okio.source(this.f22870b);
                try {
                    sink.writeAll(source);
                    AbstractC5423b.m2902a(source, null);
                } finally {
                }
            }
        }

        /* renamed from: je.x$a$b */
        public static final class b extends AbstractC9744x {

            /* renamed from: a */
            public final /* synthetic */ C9740t f22871a;

            /* renamed from: b */
            public final /* synthetic */ ByteString f22872b;

            public b(C9740t c9740t, ByteString byteString) {
                this.f22871a = c9740t;
                this.f22872b = byteString;
            }

            @Override // je.AbstractC9744x
            public long contentLength() {
                return this.f22872b.size();
            }

            @Override // je.AbstractC9744x
            public C9740t contentType() {
                return this.f22871a;
            }

            @Override // je.AbstractC9744x
            public void writeTo(BufferedSink sink) {
                AbstractC9979u.m20294g(sink, "sink");
                sink.write(this.f22872b);
            }
        }

        /* renamed from: je.x$a$c */
        public static final class c extends AbstractC9744x {

            /* renamed from: a */
            public final /* synthetic */ C9740t f22873a;

            /* renamed from: b */
            public final /* synthetic */ int f22874b;

            /* renamed from: c */
            public final /* synthetic */ byte[] f22875c;

            /* renamed from: d */
            public final /* synthetic */ int f22876d;

            public c(C9740t c9740t, int i10, byte[] bArr, int i11) {
                this.f22873a = c9740t;
                this.f22874b = i10;
                this.f22875c = bArr;
                this.f22876d = i11;
            }

            @Override // je.AbstractC9744x
            public long contentLength() {
                return this.f22874b;
            }

            @Override // je.AbstractC9744x
            public C9740t contentType() {
                return this.f22873a;
            }

            @Override // je.AbstractC9744x
            public void writeTo(BufferedSink sink) {
                AbstractC9979u.m20294g(sink, "sink");
                sink.write(this.f22875c, this.f22876d, this.f22874b);
            }
        }

        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: n */
        public static /* synthetic */ AbstractC9744x m19610n(a aVar, C9740t c9740t, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.m19620h(c9740t, bArr, i10, i11);
        }

        /* renamed from: o */
        public static /* synthetic */ AbstractC9744x m19611o(a aVar, ByteString byteString, C9740t c9740t, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c9740t = null;
            }
            return aVar.m19621i(byteString, c9740t);
        }

        /* renamed from: p */
        public static /* synthetic */ AbstractC9744x m19612p(a aVar, byte[] bArr, C9740t c9740t, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                c9740t = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.m19625m(bArr, c9740t, i10, i11);
        }

        /* renamed from: a */
        public final AbstractC9744x m19613a(File file, C9740t c9740t) {
            AbstractC9979u.m20294g(file, "<this>");
            return new C12142a(c9740t, file);
        }

        /* renamed from: b */
        public final AbstractC9744x m19614b(String str, C9740t c9740t) {
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
            byte[] bytes = str.getBytes(charset);
            AbstractC9979u.m20293f(bytes, "this as java.lang.String).getBytes(charset)");
            return m19625m(bytes, c9740t, 0, bytes.length);
        }

        /* renamed from: c */
        public final AbstractC9744x m19615c(C9740t c9740t, File file) {
            AbstractC9979u.m20294g(file, "file");
            return m19613a(file, c9740t);
        }

        /* renamed from: d */
        public final AbstractC9744x m19616d(C9740t c9740t, String content) {
            AbstractC9979u.m20294g(content, "content");
            return m19614b(content, c9740t);
        }

        /* renamed from: e */
        public final AbstractC9744x m19617e(C9740t c9740t, ByteString content) {
            AbstractC9979u.m20294g(content, "content");
            return m19621i(content, c9740t);
        }

        /* renamed from: f */
        public final AbstractC9744x m19618f(C9740t c9740t, byte[] content) {
            AbstractC9979u.m20294g(content, "content");
            return m19610n(this, c9740t, content, 0, 0, 12, null);
        }

        /* renamed from: g */
        public final AbstractC9744x m19619g(C9740t c9740t, byte[] content, int i10) {
            AbstractC9979u.m20294g(content, "content");
            return m19610n(this, c9740t, content, i10, 0, 8, null);
        }

        /* renamed from: h */
        public final AbstractC9744x m19620h(C9740t c9740t, byte[] content, int i10, int i11) {
            AbstractC9979u.m20294g(content, "content");
            return m19625m(content, c9740t, i10, i11);
        }

        /* renamed from: i */
        public final AbstractC9744x m19621i(ByteString byteString, C9740t c9740t) {
            AbstractC9979u.m20294g(byteString, "<this>");
            return new b(c9740t, byteString);
        }

        /* renamed from: j */
        public final AbstractC9744x m19622j(byte[] bArr) {
            AbstractC9979u.m20294g(bArr, "<this>");
            return m19612p(this, bArr, null, 0, 0, 7, null);
        }

        /* renamed from: k */
        public final AbstractC9744x m19623k(byte[] bArr, C9740t c9740t) {
            AbstractC9979u.m20294g(bArr, "<this>");
            return m19612p(this, bArr, c9740t, 0, 0, 6, null);
        }

        /* renamed from: l */
        public final AbstractC9744x m19624l(byte[] bArr, C9740t c9740t, int i10) {
            AbstractC9979u.m20294g(bArr, "<this>");
            return m19612p(this, bArr, c9740t, i10, 0, 4, null);
        }

        /* renamed from: m */
        public final AbstractC9744x m19625m(byte[] bArr, C9740t c9740t, int i10, int i11) {
            AbstractC9979u.m20294g(bArr, "<this>");
            AbstractC9920d.m20030l(bArr.length, i10, i11);
            return new c(c9740t, i11, bArr, i10);
        }

        public a() {
        }
    }

    public static final AbstractC9744x create(File file, C9740t c9740t) {
        return Companion.m19613a(file, c9740t);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract C9740t contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink);

    public static final AbstractC9744x create(String str, C9740t c9740t) {
        return Companion.m19614b(str, c9740t);
    }

    @InterfaceC10770a
    public static final AbstractC9744x create(C9740t c9740t, File file) {
        return Companion.m19615c(c9740t, file);
    }

    @InterfaceC10770a
    public static final AbstractC9744x create(C9740t c9740t, String str) {
        return Companion.m19616d(c9740t, str);
    }

    @InterfaceC10770a
    public static final AbstractC9744x create(C9740t c9740t, ByteString byteString) {
        return Companion.m19617e(c9740t, byteString);
    }

    @InterfaceC10770a
    public static final AbstractC9744x create(C9740t c9740t, byte[] bArr) {
        return Companion.m19618f(c9740t, bArr);
    }

    @InterfaceC10770a
    public static final AbstractC9744x create(C9740t c9740t, byte[] bArr, int i10) {
        return Companion.m19619g(c9740t, bArr, i10);
    }

    @InterfaceC10770a
    public static final AbstractC9744x create(C9740t c9740t, byte[] bArr, int i10, int i11) {
        return Companion.m19620h(c9740t, bArr, i10, i11);
    }

    public static final AbstractC9744x create(ByteString byteString, C9740t c9740t) {
        return Companion.m19621i(byteString, c9740t);
    }

    public static final AbstractC9744x create(byte[] bArr) {
        return Companion.m19622j(bArr);
    }

    public static final AbstractC9744x create(byte[] bArr, C9740t c9740t) {
        return Companion.m19623k(bArr, c9740t);
    }

    public static final AbstractC9744x create(byte[] bArr, C9740t c9740t, int i10) {
        return Companion.m19624l(bArr, c9740t, i10);
    }

    public static final AbstractC9744x create(byte[] bArr, C9740t c9740t, int i10, int i11) {
        return Companion.m19625m(bArr, c9740t, i10, i11);
    }
}
