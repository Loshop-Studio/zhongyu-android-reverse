package je;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import je.C9738r;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Buffer;
import okio.BufferedSink;

/* renamed from: je.p */
/* loaded from: classes6.dex */
public final class C9736p extends AbstractC9744x {

    /* renamed from: c */
    public static final b f22739c = new b(null);

    /* renamed from: d */
    public static final C9740t f22740d = C9740t.f22770e.m19488a("application/x-www-form-urlencoded");

    /* renamed from: a */
    public final List f22741a;

    /* renamed from: b */
    public final List f22742b;

    /* renamed from: je.p$a */
    public static final class a {

        /* renamed from: a */
        public final Charset f22743a;

        /* renamed from: b */
        public final List f22744b;

        /* renamed from: c */
        public final List f22745c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public final a m19385a(String name, String value) {
            AbstractC9979u.m20294g(name, "name");
            AbstractC9979u.m20294g(value, "value");
            List list = this.f22744b;
            C9738r.b bVar = C9738r.f22749k;
            list.add(C9738r.b.m19464b(bVar, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f22743a, 91, null));
            this.f22745c.add(C9738r.b.m19464b(bVar, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f22743a, 91, null));
            return this;
        }

        /* renamed from: b */
        public final a m19386b(String name, String value) {
            AbstractC9979u.m20294g(name, "name");
            AbstractC9979u.m20294g(value, "value");
            List list = this.f22744b;
            C9738r.b bVar = C9738r.f22749k;
            list.add(C9738r.b.m19464b(bVar, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f22743a, 83, null));
            this.f22745c.add(C9738r.b.m19464b(bVar, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f22743a, 83, null));
            return this;
        }

        /* renamed from: c */
        public final C9736p m19387c() {
            return new C9736p(this.f22744b, this.f22745c);
        }

        public a(Charset charset) {
            this.f22743a = charset;
            this.f22744b = new ArrayList();
            this.f22745c = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i10, AbstractC9972n abstractC9972n) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    /* renamed from: je.p$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        public b() {
        }
    }

    public C9736p(List encodedNames, List encodedValues) {
        AbstractC9979u.m20294g(encodedNames, "encodedNames");
        AbstractC9979u.m20294g(encodedValues, "encodedValues");
        this.f22741a = AbstractC9920d.m20011S(encodedNames);
        this.f22742b = AbstractC9920d.m20011S(encodedValues);
    }

    /* renamed from: a */
    public final long m19384a(BufferedSink bufferedSink, boolean z10) throws EOFException {
        Buffer buffer;
        if (z10) {
            buffer = new Buffer();
        } else {
            AbstractC9979u.m20291d(bufferedSink);
            buffer = bufferedSink.getBuffer();
        }
        int size = this.f22741a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8((String) this.f22741a.get(i10));
            buffer.writeByte(61);
            buffer.writeUtf8((String) this.f22742b.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // je.AbstractC9744x
    public long contentLength() {
        return m19384a(null, true);
    }

    @Override // je.AbstractC9744x
    public C9740t contentType() {
        return f22740d;
    }

    @Override // je.AbstractC9744x
    public void writeTo(BufferedSink sink) throws EOFException {
        AbstractC9979u.m20294g(sink, "sink");
        m19384a(sink, false);
    }
}
