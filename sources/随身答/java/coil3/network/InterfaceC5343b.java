package coil3.network;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p257u.C9652j;
import p257u.C9654l;
import p267v.C9735a;
import p297y.C9932m;

/* renamed from: coil3.network.b */
/* loaded from: classes3.dex */
public interface InterfaceC5343b {

    /* renamed from: a */
    public static final a f3070a = a.f3072a;

    /* renamed from: b */
    public static final InterfaceC5343b f3071b = new C9735a();

    /* renamed from: coil3.network.b$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f3072a = new a();
    }

    /* renamed from: coil3.network.b$b */
    public static final class b {

        /* renamed from: a */
        public final C9652j f3073a = null;

        /* renamed from: b */
        public final C9654l f3074b;

        public b(C9654l c9654l) {
            this.f3074b = c9654l;
        }

        /* renamed from: a */
        public final C9652j m2864a() {
            return this.f3073a;
        }

        /* renamed from: b */
        public final C9654l m2865b() {
            return this.f3074b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f3073a, bVar.f3073a) && Intrinsics.areEqual(this.f3074b, bVar.f3074b);
        }

        public int hashCode() {
            C9652j c9652j = this.f3073a;
            int iHashCode = (c9652j != null ? c9652j.hashCode() : 0) * 31;
            C9654l c9654l = this.f3074b;
            return iHashCode + (c9654l != null ? c9654l.hashCode() : 0);
        }

        public String toString() {
            return "ReadResult(request=" + this.f3073a + ", response=" + this.f3074b + ')';
        }
    }

    /* renamed from: a */
    Object mo2862a(C9654l c9654l, C9652j c9652j, C9654l c9654l2, C9932m c9932m, Continuation continuation);

    /* renamed from: b */
    Object mo2863b(C9654l c9654l, C9652j c9652j, C9932m c9932m, Continuation continuation);

    /* renamed from: coil3.network.b$c */
    public static final class c {

        /* renamed from: b */
        public static final a f3075b = new a(null);

        /* renamed from: c */
        public static final c f3076c = new c();

        /* renamed from: a */
        public final C9654l f3077a;

        /* renamed from: coil3.network.b$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public c(C9654l c9654l) {
            this.f3077a = c9654l;
        }

        /* renamed from: a */
        public final C9654l m2866a() {
            return this.f3077a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f3077a, ((c) obj).f3077a);
        }

        public int hashCode() {
            C9654l c9654l = this.f3077a;
            if (c9654l != null) {
                return c9654l.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "WriteResult(response=" + this.f3077a + ')';
        }

        public c() {
            this.f3077a = null;
        }
    }
}
