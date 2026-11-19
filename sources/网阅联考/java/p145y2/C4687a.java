package p145y2;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import p117r2.C4516s;

/* renamed from: y2.a */
/* loaded from: classes2.dex */
public final class C4687a {

    /* renamed from: c */
    public static final a f6007c = new a(null);

    /* renamed from: a */
    public long f6008a;

    /* renamed from: b */
    public final BufferedSource f6009b;

    /* renamed from: y2.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C4687a(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f6009b = source;
        this.f6008a = 262144;
    }

    /* renamed from: a */
    public final C4516s m6628a() throws IOException {
        C4516s.a aVar = new C4516s.a();
        while (true) {
            String strM6629b = m6629b();
            if (strM6629b.length() == 0) {
                return aVar.m5968e();
            }
            aVar.m5966c(strM6629b);
        }
    }

    /* renamed from: b */
    public final String m6629b() throws IOException {
        String utf8LineStrict = this.f6009b.readUtf8LineStrict(this.f6008a);
        this.f6008a -= utf8LineStrict.length();
        return utf8LineStrict;
    }
}
