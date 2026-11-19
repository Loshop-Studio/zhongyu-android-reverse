package coil3.network;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p327s.C11017j;
import p327s.C11019l;
import p338t.C11193a;
import p380w.C11634n;
import vc.InterfaceC11588c;

/* renamed from: coil3.network.b */
/* loaded from: classes3.dex */
public interface InterfaceC5485b {

    /* renamed from: a */
    public static final a f3850a = a.f3852a;

    /* renamed from: b */
    public static final InterfaceC5485b f3851b = new C11193a();

    /* renamed from: coil3.network.b$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f3852a = new a();
    }

    /* renamed from: coil3.network.b$b */
    public static final class b {

        /* renamed from: a */
        public final C11017j f3853a = null;

        /* renamed from: b */
        public final C11019l f3854b;

        public b(C11019l c11019l) {
            this.f3854b = c11019l;
        }

        /* renamed from: a */
        public final C11017j m3235a() {
            return this.f3853a;
        }

        /* renamed from: b */
        public final C11019l m3236b() {
            return this.f3854b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC9979u.m20289b(this.f3853a, bVar.f3853a) && AbstractC9979u.m20289b(this.f3854b, bVar.f3854b);
        }

        public int hashCode() {
            C11017j c11017j = this.f3853a;
            int iHashCode = (c11017j != null ? c11017j.hashCode() : 0) * 31;
            C11019l c11019l = this.f3854b;
            return iHashCode + (c11019l != null ? c11019l.hashCode() : 0);
        }

        public String toString() {
            return "ReadResult(request=" + this.f3853a + ", response=" + this.f3854b + ')';
        }
    }

    /* renamed from: a */
    Object mo3233a(C11019l c11019l, C11017j c11017j, C11019l c11019l2, C11634n c11634n, InterfaceC11588c interfaceC11588c);

    /* renamed from: b */
    Object mo3234b(C11019l c11019l, C11017j c11017j, C11634n c11634n, InterfaceC11588c interfaceC11588c);

    /* renamed from: coil3.network.b$c */
    public static final class c {

        /* renamed from: b */
        public static final a f3855b = new a(null);

        /* renamed from: c */
        public static final c f3856c = new c();

        /* renamed from: a */
        public final C11019l f3857a;

        /* renamed from: coil3.network.b$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC9972n abstractC9972n) {
                this();
            }

            public a() {
            }
        }

        public c(C11019l c11019l) {
            this.f3857a = c11019l;
        }

        /* renamed from: a */
        public final C11019l m3237a() {
            return this.f3857a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC9979u.m20289b(this.f3857a, ((c) obj).f3857a);
        }

        public int hashCode() {
            C11019l c11019l = this.f3857a;
            if (c11019l != null) {
                return c11019l.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "WriteResult(response=" + this.f3857a + ')';
        }

        public c() {
            this.f3857a = null;
        }
    }
}
