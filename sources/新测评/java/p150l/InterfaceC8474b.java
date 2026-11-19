package p150l;

import kotlin.jvm.internal.Intrinsics;
import p290y.C9886e;

/* renamed from: l.b */
/* loaded from: classes3.dex */
public interface InterfaceC8474b {

    /* renamed from: a */
    public static final c f14004a = c.f14007a;

    /* renamed from: b */
    public static final InterfaceC8474b f14005b = new b();

    /* renamed from: c */
    public static final InterfaceC8474b f14006c = new a();

    /* renamed from: l.b$a */
    public static final class a implements InterfaceC8474b {
        @Override // p150l.InterfaceC8474b
        public boolean equals(Object obj, Object obj2) {
            return Intrinsics.areEqual(obj, obj2);
        }

        @Override // p150l.InterfaceC8474b
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
    public static final class b implements InterfaceC8474b {
        @Override // p150l.InterfaceC8474b
        public boolean equals(Object obj, Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj instanceof C9886e) || !(obj2 instanceof C9886e)) {
                return Intrinsics.areEqual(obj, obj2);
            }
            C9886e c9886e = (C9886e) obj;
            C9886e c9886e2 = (C9886e) obj2;
            return Intrinsics.areEqual(c9886e.m16617c(), c9886e2.m16617c()) && Intrinsics.areEqual(c9886e.m16618d(), c9886e2.m16618d()) && Intrinsics.areEqual(c9886e.m16631q(), c9886e2.m16631q()) && Intrinsics.areEqual(c9886e.m16632r(), c9886e2.m16632r()) && Intrinsics.areEqual(c9886e.m16623i(), c9886e2.m16623i()) && Intrinsics.areEqual(c9886e.m16638x(), c9886e2.m16638x()) && c9886e.m16637w() == c9886e2.m16637w() && c9886e.m16636v() == c9886e2.m16636v();
        }

        @Override // p150l.InterfaceC8474b
        public int hashCode(Object obj) {
            if (!(obj instanceof C9886e)) {
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }
            C9886e c9886e = (C9886e) obj;
            int iHashCode = ((c9886e.m16617c().hashCode() * 31) + c9886e.m16618d().hashCode()) * 31;
            String strM16631q = c9886e.m16631q();
            int iHashCode2 = (((iHashCode + (strM16631q != null ? strM16631q.hashCode() : 0)) * 31) + c9886e.m16632r().hashCode()) * 31;
            String strM16623i = c9886e.m16623i();
            return ((((((iHashCode2 + (strM16623i != null ? strM16623i.hashCode() : 0)) * 31) + c9886e.m16638x().hashCode()) * 31) + c9886e.m16637w().hashCode()) * 31) + c9886e.m16636v().hashCode();
        }

        public String toString() {
            return "AsyncImageModelEqualityDelegate.Default";
        }
    }

    /* renamed from: l.b$c */
    public static final class c {

        /* renamed from: a */
        public static final /* synthetic */ c f14007a = new c();
    }

    boolean equals(Object obj, Object obj2);

    int hashCode(Object obj);
}
