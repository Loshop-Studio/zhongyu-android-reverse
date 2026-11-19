package p136i9;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.Buffer;
import okio.BufferedSink;
import p147j9.AbstractC9041k;
import p313y9.AbstractC10683a;

/* renamed from: i9.s */
/* loaded from: classes5.dex */
public final class C8921s extends AbstractC8901c0 {

    /* renamed from: c */
    public static final b f16784c = new b(null);

    /* renamed from: d */
    public static final C8927y f16785d = C8927y.f16815e.m15342a("application/x-www-form-urlencoded");

    /* renamed from: a */
    public final List f16786a;

    /* renamed from: b */
    public final List f16787b;

    /* renamed from: i9.s$a */
    public static final class a {

        /* renamed from: a */
        public final Charset f16788a;

        /* renamed from: b */
        public final List f16789b;

        /* renamed from: c */
        public final List f16790c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public final a m15256a(String name, String value) {
            AbstractC9133u.m16133g(name, "name");
            AbstractC9133u.m16133g(value, "value");
            this.f16789b.add(AbstractC10683a.m19973d(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.f16788a, 91, null));
            this.f16790c.add(AbstractC10683a.m19973d(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.f16788a, 91, null));
            return this;
        }

        /* renamed from: b */
        public final a m15257b(String name, String value) {
            AbstractC9133u.m16133g(name, "name");
            AbstractC9133u.m16133g(value, "value");
            this.f16789b.add(AbstractC10683a.m19973d(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.f16788a, 83, null));
            this.f16790c.add(AbstractC10683a.m19973d(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.f16788a, 83, null));
            return this;
        }

        /* renamed from: c */
        public final C8921s m15258c() {
            return new C8921s(this.f16789b, this.f16790c);
        }

        public a(Charset charset) {
            this.f16788a = charset;
            this.f16789b = new ArrayList();
            this.f16790c = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i10, AbstractC9126n abstractC9126n) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    /* renamed from: i9.s$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        public b() {
        }
    }

    public C8921s(List encodedNames, List encodedValues) {
        AbstractC9133u.m16133g(encodedNames, "encodedNames");
        AbstractC9133u.m16133g(encodedValues, "encodedValues");
        this.f16786a = AbstractC9041k.m15792v(encodedNames);
        this.f16787b = AbstractC9041k.m15792v(encodedValues);
    }

    /* renamed from: a */
    public final long m15255a(BufferedSink bufferedSink, boolean z10) throws EOFException {
        Buffer buffer;
        if (z10) {
            buffer = new Buffer();
        } else {
            AbstractC9133u.m16130d(bufferedSink);
            buffer = bufferedSink.getBuffer();
        }
        int size = this.f16786a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8((String) this.f16786a.get(i10));
            buffer.writeByte(61);
            buffer.writeUtf8((String) this.f16787b.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // p136i9.AbstractC8901c0
    public long contentLength() {
        return m15255a(null, true);
    }

    @Override // p136i9.AbstractC8901c0
    public C8927y contentType() {
        return f16785d;
    }

    @Override // p136i9.AbstractC8901c0
    public void writeTo(BufferedSink sink) throws EOFException {
        AbstractC9133u.m16133g(sink, "sink");
        m15255a(sink, false);
    }
}
