package p058f5;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import p065g5.AbstractC6427k;
import p172v5.AbstractC7800a;

/* renamed from: f5.s */
/* loaded from: classes4.dex */
public final class C6380s extends AbstractC6360c0 {

    /* renamed from: c */
    public static final b f7952c = new b(null);

    /* renamed from: d */
    public static final C6386y f7953d = C6386y.f7983e.m6881a("application/x-www-form-urlencoded");

    /* renamed from: a */
    public final List f7954a;

    /* renamed from: b */
    public final List f7955b;

    /* renamed from: f5.s$a */
    public static final class a {

        /* renamed from: a */
        public final Charset f7956a;

        /* renamed from: b */
        public final List f7957b;

        /* renamed from: c */
        public final List f7958c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public final a m6795a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7957b.add(AbstractC7800a.m9371d(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.f7956a, 91, null));
            this.f7958c.add(AbstractC7800a.m9371d(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.f7956a, 91, null));
            return this;
        }

        /* renamed from: b */
        public final a m6796b(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7957b.add(AbstractC7800a.m9371d(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.f7956a, 83, null));
            this.f7958c.add(AbstractC7800a.m9371d(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.f7956a, 83, null));
            return this;
        }

        /* renamed from: c */
        public final C6380s m6797c() {
            return new C6380s(this.f7957b, this.f7958c);
        }

        public a(Charset charset) {
            this.f7956a = charset;
            this.f7957b = new ArrayList();
            this.f7958c = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? null : charset);
        }
    }

    /* renamed from: f5.s$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public C6380s(List encodedNames, List encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f7954a = AbstractC6427k.m7034v(encodedNames);
        this.f7955b = AbstractC6427k.m7034v(encodedValues);
    }

    /* renamed from: a */
    public final long m6794a(BufferedSink bufferedSink, boolean z6) throws EOFException {
        Buffer buffer;
        if (z6) {
            buffer = new Buffer();
        } else {
            Intrinsics.checkNotNull(bufferedSink);
            buffer = bufferedSink.getBuffer();
        }
        int size = this.f7954a.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (i6 > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8((String) this.f7954a.get(i6));
            buffer.writeByte(61);
            buffer.writeUtf8((String) this.f7955b.get(i6));
        }
        if (!z6) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // p058f5.AbstractC6360c0
    public long contentLength() {
        return m6794a(null, true);
    }

    @Override // p058f5.AbstractC6360c0
    /* renamed from: contentType */
    public C6386y getContentType() {
        return f7953d;
    }

    @Override // p058f5.AbstractC6360c0
    public void writeTo(BufferedSink sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        m6794a(sink, false);
    }
}
