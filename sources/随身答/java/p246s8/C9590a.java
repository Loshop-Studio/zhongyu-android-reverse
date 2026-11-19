package p246s8;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import p172l8.C8918q;

/* renamed from: s8.a */
/* loaded from: classes5.dex */
public final class C9590a {

    /* renamed from: c */
    public static final a f16764c = new a(null);

    /* renamed from: a */
    public final BufferedSource f16765a;

    /* renamed from: b */
    public long f16766b;

    /* renamed from: s8.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C9590a(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f16765a = source;
        this.f16766b = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    /* renamed from: a */
    public final C8918q m15762a() throws IOException {
        C8918q.a aVar = new C8918q.a();
        while (true) {
            String strM15763b = m15763b();
            if (strM15763b.length() == 0) {
                return aVar.m13947f();
            }
            aVar.m13944c(strM15763b);
        }
    }

    /* renamed from: b */
    public final String m15763b() throws IOException {
        String utf8LineStrict = this.f16765a.readUtf8LineStrict(this.f16766b);
        this.f16766b -= utf8LineStrict.length();
        return utf8LineStrict;
    }
}
