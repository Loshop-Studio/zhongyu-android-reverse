package coil3.network;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p249u.C9524j;
import p249u.C9526l;
import p260v.C9622a;
import p290y.C9892k;

/* renamed from: coil3.network.b */
/* loaded from: classes3.dex */
public interface InterfaceC5208b {

    /* renamed from: a */
    public static final a f3175a = a.f3177a;

    /* renamed from: b */
    public static final InterfaceC5208b f3176b = new C9622a();

    /* renamed from: coil3.network.b$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f3177a = new a();
    }

    /* renamed from: coil3.network.b$b */
    public static final class b {

        /* renamed from: a */
        public final C9524j f3178a = null;

        /* renamed from: b */
        public final C9526l f3179b;

        public b(C9526l c9526l) {
            this.f3179b = c9526l;
        }

        /* renamed from: a */
        public final C9524j m3144a() {
            return this.f3178a;
        }

        /* renamed from: b */
        public final C9526l m3145b() {
            return this.f3179b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f3178a, bVar.f3178a) && Intrinsics.areEqual(this.f3179b, bVar.f3179b);
        }

        public int hashCode() {
            C9524j c9524j = this.f3178a;
            int iHashCode = (c9524j != null ? c9524j.hashCode() : 0) * 31;
            C9526l c9526l = this.f3179b;
            return iHashCode + (c9526l != null ? c9526l.hashCode() : 0);
        }

        public String toString() {
            return "ReadResult(request=" + this.f3178a + ", response=" + this.f3179b + ')';
        }
    }

    /* renamed from: a */
    Object mo3142a(C9526l c9526l, C9524j c9524j, C9526l c9526l2, C9892k c9892k, Continuation continuation);

    /* renamed from: b */
    Object mo3143b(C9526l c9526l, C9524j c9524j, C9892k c9892k, Continuation continuation);

    /* renamed from: coil3.network.b$c */
    public static final class c {

        /* renamed from: b */
        public static final a f3180b = new a(null);

        /* renamed from: c */
        public static final c f3181c = new c();

        /* renamed from: a */
        public final C9526l f3182a;

        /* renamed from: coil3.network.b$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public c(C9526l c9526l) {
            this.f3182a = c9526l;
        }

        /* renamed from: a */
        public final C9526l m3146a() {
            return this.f3182a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f3182a, ((c) obj).f3182a);
        }

        public int hashCode() {
            C9526l c9526l = this.f3182a;
            if (c9526l != null) {
                return c9526l.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "WriteResult(response=" + this.f3182a + ')';
        }

        public c() {
            this.f3182a = null;
        }
    }
}
