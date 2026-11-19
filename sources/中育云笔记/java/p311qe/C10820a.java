package p311qe;

import android.support.v4.media.session.PlaybackStateCompat;
import je.C9737q;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.BufferedSource;

/* renamed from: qe.a */
/* loaded from: classes6.dex */
public final class C10820a {

    /* renamed from: c */
    public static final a f26083c = new a(null);

    /* renamed from: a */
    public final BufferedSource f26084a;

    /* renamed from: b */
    public long f26085b;

    /* renamed from: qe.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C10820a(BufferedSource source) {
        AbstractC9979u.m20294g(source, "source");
        this.f26084a = source;
        this.f26085b = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    /* renamed from: a */
    public final C9737q m23249a() {
        C9737q.a aVar = new C9737q.a();
        while (true) {
            String strM23250b = m23250b();
            if (strM23250b.length() == 0) {
                return aVar.m19400f();
            }
            aVar.m19397c(strM23250b);
        }
    }

    /* renamed from: b */
    public final String m23250b() {
        String utf8LineStrict = this.f26084a.readUtf8LineStrict(this.f26085b);
        this.f26085b -= utf8LineStrict.length();
        return utf8LineStrict;
    }
}
