package p312r;

import android.content.Context;
import androidx.camera.video.AudioStats;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p001a0.AbstractC0005b;
import p001a0.AbstractC0006c;
import p181hd.InterfaceC9529a;
import p212k.InterfaceC9756j;
import p312r.InterfaceC10825d;

/* renamed from: r.d */
/* loaded from: classes3.dex */
public interface InterfaceC10825d {

    /* renamed from: r.d$a */
    public static final class a {

        /* renamed from: a */
        public InterfaceC9529a f26115a;

        /* renamed from: b */
        public boolean f26116b = true;

        /* renamed from: c */
        public boolean f26117c = true;

        /* renamed from: d */
        public static /* synthetic */ a m23289d(a aVar, Context context, double d10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                d10 = AbstractC0006c.m12a(context);
            }
            return aVar.m23292c(context, d10);
        }

        /* renamed from: e */
        public static final long m23290e(double d10, Context context) {
            return (long) (d10 * AbstractC0006c.m18g(context));
        }

        /* renamed from: b */
        public final InterfaceC10825d m23291b() {
            InterfaceC10830i c10822a;
            InterfaceC10831j c10829h = this.f26117c ? new C10829h() : new C10823b();
            if (this.f26116b) {
                InterfaceC9529a interfaceC9529a = this.f26115a;
                if (interfaceC9529a == null) {
                    throw new IllegalStateException("maxSizeBytesFactory == null");
                }
                c10822a = new C10828g(((Number) interfaceC9529a.invoke()).longValue(), c10829h);
            } else {
                c10822a = new C10822a(c10829h);
            }
            return new C10827f(c10822a, c10829h);
        }

        /* renamed from: c */
        public final a m23292c(final Context context, final double d10) {
            if (AudioStats.AUDIO_AMPLITUDE_NONE > d10 || d10 > 1.0d) {
                throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
            }
            this.f26115a = new InterfaceC9529a() { // from class: r.c
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return Long.valueOf(InterfaceC10825d.a.m23290e(d10, context));
                }
            };
            return this;
        }
    }

    /* renamed from: r.d$b */
    public static final class b {

        /* renamed from: a */
        public final String f26118a;

        /* renamed from: b */
        public final Map f26119b;

        public b(String str, Map map) {
            this.f26118a = str;
            this.f26119b = AbstractC0005b.m11d(map);
        }

        /* renamed from: a */
        public final Map m23293a() {
            return this.f26119b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC9979u.m20289b(this.f26118a, bVar.f26118a) && AbstractC9979u.m20289b(this.f26119b, bVar.f26119b);
        }

        public int hashCode() {
            return (this.f26118a.hashCode() * 31) + this.f26119b.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f26118a + ", extras=" + this.f26119b + ')';
        }
    }

    /* renamed from: r.d$c */
    public static final class c {

        /* renamed from: a */
        public final InterfaceC9756j f26120a;

        /* renamed from: b */
        public final Map f26121b;

        public c(InterfaceC9756j interfaceC9756j, Map map) {
            this.f26120a = interfaceC9756j;
            this.f26121b = AbstractC0005b.m11d(map);
        }

        /* renamed from: a */
        public final Map m23294a() {
            return this.f26121b;
        }

        /* renamed from: b */
        public final InterfaceC9756j m23295b() {
            return this.f26120a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC9979u.m20289b(this.f26120a, cVar.f26120a) && AbstractC9979u.m20289b(this.f26121b, cVar.f26121b);
        }

        public int hashCode() {
            return (this.f26120a.hashCode() * 31) + this.f26121b.hashCode();
        }

        public String toString() {
            return "Value(image=" + this.f26120a + ", extras=" + this.f26121b + ')';
        }
    }

    /* renamed from: a */
    c mo23283a(b bVar);

    /* renamed from: b */
    void mo23284b(long j10);

    /* renamed from: c */
    long mo23285c();

    void clear();

    /* renamed from: e */
    void mo23286e(long j10);

    /* renamed from: f */
    void mo23287f(b bVar, c cVar);

    long getSize();
}
