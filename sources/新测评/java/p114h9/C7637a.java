package p114h9;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import p011a9.C0054q;

/* renamed from: h9.a */
/* loaded from: classes5.dex */
public final class C7637a {

    /* renamed from: c */
    public static final a f12842c = new a(null);

    /* renamed from: a */
    public final BufferedSource f12843a;

    /* renamed from: b */
    public long f12844b;

    /* renamed from: h9.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C7637a(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f12843a = source;
        this.f12844b = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    /* renamed from: a */
    public final C0054q m12621a() throws IOException {
        C0054q.a aVar = new C0054q.a();
        while (true) {
            String strM12622b = m12622b();
            if (strM12622b.length() == 0) {
                return aVar.m191f();
            }
            aVar.m188c(strM12622b);
        }
    }

    /* renamed from: b */
    public final String m12622b() throws IOException {
        String utf8LineStrict = this.f12843a.readUtf8LineStrict(this.f12844b);
        this.f12844b -= utf8LineStrict.length();
        return utf8LineStrict;
    }
}
