package p172l8;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import p172l8.C8919r;
import p182m8.AbstractC9045d;

/* renamed from: l8.p */
/* loaded from: classes5.dex */
public final class C8917p extends AbstractC8925x {

    /* renamed from: c */
    public static final b f14786c = new b(null);

    /* renamed from: d */
    public static final C8921t f14787d = C8921t.f14817e.m14034a("application/x-www-form-urlencoded");

    /* renamed from: a */
    public final List f14788a;

    /* renamed from: b */
    public final List f14789b;

    /* renamed from: l8.p$a */
    public static final class a {

        /* renamed from: a */
        public final Charset f14790a;

        /* renamed from: b */
        public final List f14791b;

        /* renamed from: c */
        public final List f14792c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public final a m13932a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List list = this.f14791b;
            C8919r.b bVar = C8919r.f14796k;
            list.add(C8919r.b.m14011b(bVar, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f14790a, 91, null));
            this.f14792c.add(C8919r.b.m14011b(bVar, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f14790a, 91, null));
            return this;
        }

        /* renamed from: b */
        public final a m13933b(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List list = this.f14791b;
            C8919r.b bVar = C8919r.f14796k;
            list.add(C8919r.b.m14011b(bVar, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f14790a, 83, null));
            this.f14792c.add(C8919r.b.m14011b(bVar, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f14790a, 83, null));
            return this;
        }

        /* renamed from: c */
        public final C8917p m13934c() {
            return new C8917p(this.f14791b, this.f14792c);
        }

        public a(Charset charset) {
            this.f14790a = charset;
            this.f14791b = new ArrayList();
            this.f14792c = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? null : charset);
        }
    }

    /* renamed from: l8.p$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public C8917p(List encodedNames, List encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f14788a = AbstractC9045d.m14477S(encodedNames);
        this.f14789b = AbstractC9045d.m14477S(encodedValues);
    }

    /* renamed from: a */
    public final long m13931a(BufferedSink bufferedSink, boolean z9) throws EOFException {
        Buffer buffer;
        if (z9) {
            buffer = new Buffer();
        } else {
            Intrinsics.checkNotNull(bufferedSink);
            buffer = bufferedSink.getBuffer();
        }
        int size = this.f14788a.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (i9 > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8((String) this.f14788a.get(i9));
            buffer.writeByte(61);
            buffer.writeUtf8((String) this.f14789b.get(i9));
        }
        if (!z9) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // p172l8.AbstractC8925x
    public long contentLength() {
        return m13931a(null, true);
    }

    @Override // p172l8.AbstractC8925x
    /* renamed from: contentType */
    public C8921t getContentType() {
        return f14787d;
    }

    @Override // p172l8.AbstractC8925x
    public void writeTo(BufferedSink sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        m13931a(sink, false);
    }
}
