package p011a9;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import p011a9.C0055r;
import p028b9.AbstractC5070d;

/* renamed from: a9.p */
/* loaded from: classes5.dex */
public final class C0053p extends AbstractC0061x {

    /* renamed from: c */
    public static final b f158c = new b(null);

    /* renamed from: d */
    public static final C0057t f159d = C0057t.f189e.m278a("application/x-www-form-urlencoded");

    /* renamed from: a */
    public final List f160a;

    /* renamed from: b */
    public final List f161b;

    /* renamed from: a9.p$a */
    public static final class a {

        /* renamed from: a */
        public final Charset f162a;

        /* renamed from: b */
        public final List f163b;

        /* renamed from: c */
        public final List f164c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public final a m176a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List list = this.f163b;
            C0055r.b bVar = C0055r.f168k;
            list.add(C0055r.b.m255b(bVar, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f162a, 91, null));
            this.f164c.add(C0055r.b.m255b(bVar, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f162a, 91, null));
            return this;
        }

        /* renamed from: b */
        public final a m177b(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List list = this.f163b;
            C0055r.b bVar = C0055r.f168k;
            list.add(C0055r.b.m255b(bVar, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f162a, 83, null));
            this.f164c.add(C0055r.b.m255b(bVar, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f162a, 83, null));
            return this;
        }

        /* renamed from: c */
        public final C0053p m178c() {
            return new C0053p(this.f163b, this.f164c);
        }

        public a(Charset charset) {
            this.f162a = charset;
            this.f163b = new ArrayList();
            this.f164c = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    /* renamed from: a9.p$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public C0053p(List encodedNames, List encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f160a = AbstractC5070d.m2628S(encodedNames);
        this.f161b = AbstractC5070d.m2628S(encodedValues);
    }

    /* renamed from: a */
    public final long m175a(BufferedSink bufferedSink, boolean z9) throws EOFException {
        Buffer buffer;
        if (z9) {
            buffer = new Buffer();
        } else {
            Intrinsics.checkNotNull(bufferedSink);
            buffer = bufferedSink.getBuffer();
        }
        int size = this.f160a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8((String) this.f160a.get(i10));
            buffer.writeByte(61);
            buffer.writeUtf8((String) this.f161b.get(i10));
        }
        if (!z9) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // p011a9.AbstractC0061x
    public long contentLength() {
        return m175a(null, true);
    }

    @Override // p011a9.AbstractC0061x
    /* renamed from: contentType */
    public C0057t getContentType() {
        return f159d;
    }

    @Override // p011a9.AbstractC0061x
    public void writeTo(BufferedSink sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        m175a(sink, false);
    }
}
