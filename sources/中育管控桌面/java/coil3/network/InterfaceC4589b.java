package coil3.network;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p159u.C7743j;
import p159u.C7745l;
import p166v.C7780a;
import p187y.C7880m;

/* renamed from: coil3.network.b */
/* loaded from: classes3.dex */
public interface InterfaceC4589b {

    /* renamed from: a */
    public static final a f1859a = a.f1861a;

    /* renamed from: b */
    public static final InterfaceC4589b f1860b = new C7780a();

    /* renamed from: coil3.network.b$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f1861a = new a();
    }

    /* renamed from: coil3.network.b$b */
    public static final class b {

        /* renamed from: a */
        public final C7743j f1862a = null;

        /* renamed from: b */
        public final C7745l f1863b;

        public b(C7745l c7745l) {
            this.f1863b = c7745l;
        }

        /* renamed from: a */
        public final C7743j m1970a() {
            return this.f1862a;
        }

        /* renamed from: b */
        public final C7745l m1971b() {
            return this.f1863b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f1862a, bVar.f1862a) && Intrinsics.areEqual(this.f1863b, bVar.f1863b);
        }

        public int hashCode() {
            C7743j c7743j = this.f1862a;
            int iHashCode = (c7743j != null ? c7743j.hashCode() : 0) * 31;
            C7745l c7745l = this.f1863b;
            return iHashCode + (c7745l != null ? c7745l.hashCode() : 0);
        }

        public String toString() {
            return "ReadResult(request=" + this.f1862a + ", response=" + this.f1863b + ')';
        }
    }

    /* renamed from: a */
    Object mo1968a(C7745l c7745l, C7743j c7743j, C7745l c7745l2, C7880m c7880m, Continuation continuation);

    /* renamed from: b */
    Object mo1969b(C7745l c7745l, C7743j c7743j, C7880m c7880m, Continuation continuation);

    /* renamed from: coil3.network.b$c */
    public static final class c {

        /* renamed from: b */
        public static final a f1864b = new a(null);

        /* renamed from: c */
        public static final c f1865c = new c();

        /* renamed from: a */
        public final C7745l f1866a;

        /* renamed from: coil3.network.b$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public c(C7745l c7745l) {
            this.f1866a = c7745l;
        }

        /* renamed from: a */
        public final C7745l m1972a() {
            return this.f1866a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f1866a, ((c) obj).f1866a);
        }

        public int hashCode() {
            C7745l c7745l = this.f1866a;
            if (c7745l != null) {
                return c7745l.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "WriteResult(response=" + this.f1866a + ')';
        }

        public c() {
            this.f1866a = null;
        }
    }
}
