package p109m5;

import android.support.v4.media.session.PlaybackStateCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import p058f5.C6383v;

/* renamed from: m5.a */
/* loaded from: classes4.dex */
public final class C7406a {

    /* renamed from: c */
    public static final a f9441c = new a(null);

    /* renamed from: a */
    public final BufferedSource f9442a;

    /* renamed from: b */
    public long f9443b;

    /* renamed from: m5.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C7406a(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f9442a = source;
        this.f9443b = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    /* renamed from: a */
    public final C6383v m8417a() {
        C6383v.a aVar = new C6383v.a();
        while (true) {
            String strM8418b = m8418b();
            if (strM8418b.length() == 0) {
                return aVar.m6811f();
            }
            aVar.m6808c(strM8418b);
        }
    }

    /* renamed from: b */
    public final String m8418b() {
        String utf8LineStrict = this.f9442a.readUtf8LineStrict(this.f9443b);
        this.f9443b -= utf8LineStrict.length();
        return utf8LineStrict;
    }
}
