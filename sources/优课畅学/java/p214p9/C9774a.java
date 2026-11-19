package p214p9;

import android.support.v4.media.session.PlaybackStateCompat;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.BufferedSource;
import p136i9.C8924v;

/* renamed from: p9.a */
/* loaded from: classes5.dex */
public final class C9774a {

    /* renamed from: c */
    public static final a f19509c = new a(null);

    /* renamed from: a */
    public final BufferedSource f19510a;

    /* renamed from: b */
    public long f19511b;

    /* renamed from: p9.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public C9774a(BufferedSource source) {
        AbstractC9133u.m16133g(source, "source");
        this.f19510a = source;
        this.f19511b = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    /* renamed from: a */
    public final C8924v m18302a() {
        C8924v.a aVar = new C8924v.a();
        while (true) {
            String strM18303b = m18303b();
            if (strM18303b.length() == 0) {
                return aVar.m15272f();
            }
            aVar.m15269c(strM18303b);
        }
    }

    /* renamed from: b */
    public final String m18303b() {
        String utf8LineStrict = this.f19510a.readUtf8LineStrict(this.f19511b);
        this.f19511b -= utf8LineStrict.length();
        return utf8LineStrict;
    }
}
