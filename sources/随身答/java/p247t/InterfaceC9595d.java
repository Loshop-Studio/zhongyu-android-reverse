package p247t;

import android.content.Context;
import androidx.camera.video.AudioStats;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p090e0.AbstractC7804b;
import p090e0.AbstractC7805c;
import p151k.InterfaceC8239j;
import p247t.InterfaceC9595d;

/* renamed from: t.d */
/* loaded from: classes3.dex */
public interface InterfaceC9595d {

    /* renamed from: t.d$a */
    public static final class a {

        /* renamed from: a */
        public Function0 f16795a;

        /* renamed from: b */
        public boolean f16796b = true;

        /* renamed from: c */
        public boolean f16797c = true;

        /* renamed from: d */
        public static /* synthetic */ a m15798d(a aVar, Context context, double d10, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                d10 = AbstractC7805c.m12179a(context);
            }
            return aVar.m15801c(context, d10);
        }

        /* renamed from: e */
        public static final long m15799e(double d10, Context context) {
            return (long) (d10 * AbstractC7805c.m12185g(context));
        }

        /* renamed from: b */
        public final InterfaceC9595d m15800b() {
            InterfaceC9600i c9592a;
            InterfaceC9601j c9599h = this.f16797c ? new C9599h() : new C9593b();
            if (this.f16796b) {
                Function0 function0 = this.f16795a;
                if (function0 == null) {
                    throw new IllegalStateException("maxSizeBytesFactory == null");
                }
                long jLongValue = ((Number) function0.invoke()).longValue();
                c9592a = jLongValue > 0 ? new C9598g(jLongValue, c9599h) : new C9592a(c9599h);
            } else {
                c9592a = new C9592a(c9599h);
            }
            return new C9597f(c9592a, c9599h);
        }

        /* renamed from: c */
        public final a m15801c(final Context context, final double d10) {
            if (AudioStats.AUDIO_AMPLITUDE_NONE > d10 || d10 > 1.0d) {
                throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
            }
            this.f16795a = new Function0() { // from class: t.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Long.valueOf(InterfaceC9595d.a.m15799e(d10, context));
                }
            };
            return this;
        }
    }

    /* renamed from: t.d$b */
    public static final class b {

        /* renamed from: a */
        public final String f16798a;

        /* renamed from: b */
        public final Map f16799b;

        public b(String str, Map map) {
            this.f16798a = str;
            this.f16799b = AbstractC7804b.m12178d(map);
        }

        /* renamed from: a */
        public final Map m15802a() {
            return this.f16799b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f16798a, bVar.f16798a) && Intrinsics.areEqual(this.f16799b, bVar.f16799b);
        }

        public int hashCode() {
            return (this.f16798a.hashCode() * 31) + this.f16799b.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f16798a + ", extras=" + this.f16799b + ')';
        }
    }

    /* renamed from: t.d$c */
    public static final class c {

        /* renamed from: a */
        public final InterfaceC8239j f16800a;

        /* renamed from: b */
        public final Map f16801b;

        public c(InterfaceC8239j interfaceC8239j, Map map) {
            this.f16800a = interfaceC8239j;
            this.f16801b = AbstractC7804b.m12178d(map);
        }

        /* renamed from: a */
        public final Map m15803a() {
            return this.f16801b;
        }

        /* renamed from: b */
        public final InterfaceC8239j m15804b() {
            return this.f16800a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f16800a, cVar.f16800a) && Intrinsics.areEqual(this.f16801b, cVar.f16801b);
        }

        public int hashCode() {
            return (this.f16800a.hashCode() * 31) + this.f16801b.hashCode();
        }

        public String toString() {
            return "Value(image=" + this.f16800a + ", extras=" + this.f16801b + ')';
        }
    }

    /* renamed from: a */
    c mo15794a(b bVar);

    void clear();

    /* renamed from: d */
    void mo15795d(long j9);

    /* renamed from: e */
    void mo15796e(b bVar, c cVar);

    long getSize();
}
