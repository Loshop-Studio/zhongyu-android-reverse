package p152t;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p023c0.AbstractC4457b;
import p023c0.AbstractC4458c;
import p087k.InterfaceC6611j;
import p152t.InterfaceC7708d;

/* renamed from: t.d */
/* loaded from: classes3.dex */
public interface InterfaceC7708d {

    /* renamed from: t.d$a */
    public static final class a {

        /* renamed from: a */
        public Function0 f10166a;

        /* renamed from: b */
        public boolean f10167b = true;

        /* renamed from: c */
        public boolean f10168c = true;

        /* renamed from: d */
        public static /* synthetic */ a m9175d(a aVar, Context context, double d6, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                d6 = AbstractC4458c.m1528a(context);
            }
            return aVar.m9178c(context, d6);
        }

        /* renamed from: e */
        public static final long m9176e(double d6, Context context) {
            return (long) (d6 * AbstractC4458c.m1534g(context));
        }

        /* renamed from: b */
        public final InterfaceC7708d m9177b() {
            InterfaceC7713i c7705a;
            InterfaceC7714j c7712h = this.f10168c ? new C7712h() : new C7706b();
            if (this.f10167b) {
                Function0 function0 = this.f10166a;
                if (function0 == null) {
                    throw new IllegalStateException("maxSizeBytesFactory == null");
                }
                c7705a = new C7711g(((Number) function0.invoke()).longValue(), c7712h);
            } else {
                c7705a = new C7705a(c7712h);
            }
            return new C7710f(c7705a, c7712h);
        }

        /* renamed from: c */
        public final a m9178c(final Context context, final double d6) {
            if (0.0d > d6 || d6 > 1.0d) {
                throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
            }
            this.f10166a = new Function0() { // from class: t.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Long.valueOf(InterfaceC7708d.a.m9176e(d6, context));
                }
            };
            return this;
        }
    }

    /* renamed from: t.d$b */
    public static final class b {

        /* renamed from: a */
        public final String f10169a;

        /* renamed from: b */
        public final Map f10170b;

        public b(String str, Map map) {
            this.f10169a = str;
            this.f10170b = AbstractC4457b.m1527d(map);
        }

        /* renamed from: a */
        public final Map m9179a() {
            return this.f10170b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f10169a, bVar.f10169a) && Intrinsics.areEqual(this.f10170b, bVar.f10170b);
        }

        public int hashCode() {
            return (this.f10169a.hashCode() * 31) + this.f10170b.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f10169a + ", extras=" + this.f10170b + ')';
        }
    }

    /* renamed from: t.d$c */
    public static final class c {

        /* renamed from: a */
        public final InterfaceC6611j f10171a;

        /* renamed from: b */
        public final Map f10172b;

        public c(InterfaceC6611j interfaceC6611j, Map map) {
            this.f10171a = interfaceC6611j;
            this.f10172b = AbstractC4457b.m1527d(map);
        }

        /* renamed from: a */
        public final Map m9180a() {
            return this.f10172b;
        }

        /* renamed from: b */
        public final InterfaceC6611j m9181b() {
            return this.f10171a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f10171a, cVar.f10171a) && Intrinsics.areEqual(this.f10172b, cVar.f10172b);
        }

        public int hashCode() {
            return (this.f10171a.hashCode() * 31) + this.f10172b.hashCode();
        }

        public String toString() {
            return "Value(image=" + this.f10171a + ", extras=" + this.f10172b + ')';
        }
    }

    /* renamed from: a */
    c mo9169a(b bVar);

    /* renamed from: b */
    void mo9170b(long j6);

    void clear();

    /* renamed from: d */
    long mo9171d();

    /* renamed from: f */
    void mo9172f(long j6);

    /* renamed from: g */
    void mo9173g(b bVar, c cVar);

    long getSize();
}
