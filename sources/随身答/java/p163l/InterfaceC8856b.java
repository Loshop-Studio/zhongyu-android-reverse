package p163l;

import kotlin.jvm.internal.Intrinsics;
import p297y.C9924e;

/* renamed from: l.b */
/* loaded from: classes3.dex */
public interface InterfaceC8856b {

    /* renamed from: a */
    public static final c f14629a = c.f14632a;

    /* renamed from: b */
    public static final InterfaceC8856b f14630b = new b();

    /* renamed from: c */
    public static final InterfaceC8856b f14631c = new a();

    /* renamed from: l.b$a */
    public static final class a implements InterfaceC8856b {
        @Override // p163l.InterfaceC8856b
        public boolean equals(Object obj, Object obj2) {
            return Intrinsics.areEqual(obj, obj2);
        }

        @Override // p163l.InterfaceC8856b
        public int hashCode(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "AsyncImageModelEqualityDelegate.AllProperties";
        }
    }

    /* renamed from: l.b$b */
    public static final class b implements InterfaceC8856b {
        @Override // p163l.InterfaceC8856b
        public boolean equals(Object obj, Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj instanceof C9924e) || !(obj2 instanceof C9924e)) {
                return Intrinsics.areEqual(obj, obj2);
            }
            C9924e c9924e = (C9924e) obj;
            C9924e c9924e2 = (C9924e) obj2;
            return Intrinsics.areEqual(c9924e.m17019c(), c9924e2.m17019c()) && Intrinsics.areEqual(c9924e.m17020d(), c9924e2.m17020d()) && Intrinsics.areEqual(c9924e.m17033q(), c9924e2.m17033q()) && Intrinsics.areEqual(c9924e.m17034r(), c9924e2.m17034r()) && Intrinsics.areEqual(c9924e.m17025i(), c9924e2.m17025i()) && Intrinsics.areEqual(c9924e.m17040x(), c9924e2.m17040x()) && c9924e.m17039w() == c9924e2.m17039w() && c9924e.m17038v() == c9924e2.m17038v();
        }

        @Override // p163l.InterfaceC8856b
        public int hashCode(Object obj) {
            if (!(obj instanceof C9924e)) {
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }
            C9924e c9924e = (C9924e) obj;
            int iHashCode = ((c9924e.m17019c().hashCode() * 31) + c9924e.m17020d().hashCode()) * 31;
            String strM17033q = c9924e.m17033q();
            int iHashCode2 = (((iHashCode + (strM17033q != null ? strM17033q.hashCode() : 0)) * 31) + c9924e.m17034r().hashCode()) * 31;
            String strM17025i = c9924e.m17025i();
            return ((((((iHashCode2 + (strM17025i != null ? strM17025i.hashCode() : 0)) * 31) + c9924e.m17040x().hashCode()) * 31) + c9924e.m17039w().hashCode()) * 31) + c9924e.m17038v().hashCode();
        }

        public String toString() {
            return "AsyncImageModelEqualityDelegate.Default";
        }
    }

    /* renamed from: l.b$c */
    public static final class c {

        /* renamed from: a */
        public static final /* synthetic */ c f14632a = new c();
    }

    boolean equals(Object obj, Object obj2);

    int hashCode(Object obj);
}
