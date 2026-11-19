package p117r2;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import p117r2.C4517t;
import p121s2.AbstractC4550b;

/* renamed from: r2.r */
/* loaded from: classes2.dex */
public final class C4515r extends AbstractC4523z {

    /* renamed from: a */
    public final List f5527a;

    /* renamed from: b */
    public final List f5528b;

    /* renamed from: d */
    public static final b f5526d = new b(null);

    /* renamed from: c */
    public static final C4519v f5525c = C4519v.f5558g.m6054a("application/x-www-form-urlencoded");

    /* renamed from: r2.r$a */
    public static final class a {

        /* renamed from: a */
        public final List f5529a;

        /* renamed from: b */
        public final List f5530b;

        /* renamed from: c */
        public final Charset f5531c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public final a m5955a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List list = this.f5529a;
            C4517t.b bVar = C4517t.f5536l;
            list.add(C4517t.b.m6032b(bVar, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f5531c, 91, null));
            this.f5530b.add(C4517t.b.m6032b(bVar, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f5531c, 91, null));
            return this;
        }

        /* renamed from: b */
        public final a m5956b(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List list = this.f5529a;
            C4517t.b bVar = C4517t.f5536l;
            list.add(C4517t.b.m6032b(bVar, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f5531c, 83, null));
            this.f5530b.add(C4517t.b.m6032b(bVar, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f5531c, 83, null));
            return this;
        }

        /* renamed from: c */
        public final C4515r m5957c() {
            return new C4515r(this.f5529a, this.f5530b);
        }

        public a(Charset charset) {
            this.f5531c = charset;
            this.f5529a = new ArrayList();
            this.f5530b = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? null : charset);
        }
    }

    /* renamed from: r2.r$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C4515r(List encodedNames, List encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f5527a = AbstractC4550b.m6211N(encodedNames);
        this.f5528b = AbstractC4550b.m6211N(encodedValues);
    }

    /* renamed from: a */
    public final long m5954a(BufferedSink bufferedSink, boolean z3) throws EOFException {
        Buffer buffer;
        if (z3) {
            buffer = new Buffer();
        } else {
            Intrinsics.checkNotNull(bufferedSink);
            buffer = bufferedSink.getBuffer();
        }
        int size = this.f5527a.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8((String) this.f5527a.get(i4));
            buffer.writeByte(61);
            buffer.writeUtf8((String) this.f5528b.get(i4));
        }
        if (!z3) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // p117r2.AbstractC4523z
    public long contentLength() {
        return m5954a(null, true);
    }

    @Override // p117r2.AbstractC4523z
    /* renamed from: contentType */
    public C4519v getContentType() {
        return f5525c;
    }

    @Override // p117r2.AbstractC4523z
    public void writeTo(BufferedSink sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        m5954a(sink, false);
    }
}
