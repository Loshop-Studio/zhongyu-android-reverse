package p238t;

import android.content.Context;
import androidx.camera.video.AudioStats;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p030c0.AbstractC5077b;
import p030c0.AbstractC5078c;
import p137k.InterfaceC7838j;
import p238t.InterfaceC9363d;

/* renamed from: t.d */
/* loaded from: classes3.dex */
public interface InterfaceC9363d {

    /* renamed from: t.d$a */
    public static final class a {

        /* renamed from: a */
        public Function0 f16228a;

        /* renamed from: b */
        public boolean f16229b = true;

        /* renamed from: c */
        public boolean f16230c = true;

        /* renamed from: d */
        public static /* synthetic */ a m15626d(a aVar, Context context, double d10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                d10 = AbstractC5078c.m2671a(context);
            }
            return aVar.m15629c(context, d10);
        }

        /* renamed from: e */
        public static final long m15627e(double d10, Context context) {
            return (long) (d10 * AbstractC5078c.m2677g(context));
        }

        /* renamed from: b */
        public final InterfaceC9363d m15628b() {
            InterfaceC9368i c9360a;
            InterfaceC9369j c9367h = this.f16230c ? new C9367h() : new C9361b();
            if (this.f16229b) {
                Function0 function0 = this.f16228a;
                if (function0 == null) {
                    throw new IllegalStateException("maxSizeBytesFactory == null");
                }
                c9360a = new C9366g(((Number) function0.invoke()).longValue(), c9367h);
            } else {
                c9360a = new C9360a(c9367h);
            }
            return new C9365f(c9360a, c9367h);
        }

        /* renamed from: c */
        public final a m15629c(final Context context, final double d10) {
            if (AudioStats.AUDIO_AMPLITUDE_NONE > d10 || d10 > 1.0d) {
                throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
            }
            this.f16228a = new Function0() { // from class: t.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Long.valueOf(InterfaceC9363d.a.m15627e(d10, context));
                }
            };
            return this;
        }
    }

    /* renamed from: t.d$b */
    public static final class b {

        /* renamed from: a */
        public final String f16231a;

        /* renamed from: b */
        public final Map f16232b;

        public b(String str, Map map) {
            this.f16231a = str;
            this.f16232b = AbstractC5077b.m2670d(map);
        }

        /* renamed from: a */
        public final Map m15630a() {
            return this.f16232b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f16231a, bVar.f16231a) && Intrinsics.areEqual(this.f16232b, bVar.f16232b);
        }

        public int hashCode() {
            return (this.f16231a.hashCode() * 31) + this.f16232b.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f16231a + ", extras=" + this.f16232b + ')';
        }
    }

    /* renamed from: t.d$c */
    public static final class c {

        /* renamed from: a */
        public final InterfaceC7838j f16233a;

        /* renamed from: b */
        public final Map f16234b;

        public c(InterfaceC7838j interfaceC7838j, Map map) {
            this.f16233a = interfaceC7838j;
            this.f16234b = AbstractC5077b.m2670d(map);
        }

        /* renamed from: a */
        public final Map m15631a() {
            return this.f16234b;
        }

        /* renamed from: b */
        public final InterfaceC7838j m15632b() {
            return this.f16233a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f16233a, cVar.f16233a) && Intrinsics.areEqual(this.f16234b, cVar.f16234b);
        }

        public int hashCode() {
            return (this.f16233a.hashCode() * 31) + this.f16234b.hashCode();
        }

        public String toString() {
            return "Value(image=" + this.f16233a + ", extras=" + this.f16234b + ')';
        }
    }

    /* renamed from: a */
    c mo15620a(b bVar);

    /* renamed from: b */
    void mo15621b(long j10);

    void clear();

    /* renamed from: d */
    long mo15622d();

    /* renamed from: f */
    void mo15623f(long j10);

    /* renamed from: g */
    void mo15624g(b bVar, c cVar);

    long getSize();
}
