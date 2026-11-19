package p096l;

import kotlin.jvm.internal.Intrinsics;
import p187y.C7872e;

/* renamed from: l.a */
/* loaded from: classes3.dex */
public interface InterfaceC7259a {

    /* renamed from: a */
    public static final c f9163a = c.f9166a;

    /* renamed from: b */
    public static final InterfaceC7259a f9164b = new b();

    /* renamed from: c */
    public static final InterfaceC7259a f9165c = new a();

    /* renamed from: l.a$a */
    public static final class a implements InterfaceC7259a {
        @Override // p096l.InterfaceC7259a
        public boolean equals(Object obj, Object obj2) {
            return Intrinsics.areEqual(obj, obj2);
        }

        @Override // p096l.InterfaceC7259a
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

    /* renamed from: l.a$b */
    public static final class b implements InterfaceC7259a {
        @Override // p096l.InterfaceC7259a
        public boolean equals(Object obj, Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj instanceof C7872e) || !(obj2 instanceof C7872e)) {
                return Intrinsics.areEqual(obj, obj2);
            }
            C7872e c7872e = (C7872e) obj;
            C7872e c7872e2 = (C7872e) obj2;
            return Intrinsics.areEqual(c7872e.m9574c(), c7872e2.m9574c()) && Intrinsics.areEqual(c7872e.m9575d(), c7872e2.m9575d()) && Intrinsics.areEqual(c7872e.m9588q(), c7872e2.m9588q()) && Intrinsics.areEqual(c7872e.m9589r(), c7872e2.m9589r()) && Intrinsics.areEqual(c7872e.m9580i(), c7872e2.m9580i()) && Intrinsics.areEqual(c7872e.m9595x(), c7872e2.m9595x()) && c7872e.m9594w() == c7872e2.m9594w() && c7872e.m9593v() == c7872e2.m9593v();
        }

        @Override // p096l.InterfaceC7259a
        public int hashCode(Object obj) {
            if (!(obj instanceof C7872e)) {
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }
            C7872e c7872e = (C7872e) obj;
            int iHashCode = ((c7872e.m9574c().hashCode() * 31) + c7872e.m9575d().hashCode()) * 31;
            String strM9588q = c7872e.m9588q();
            int iHashCode2 = (((iHashCode + (strM9588q != null ? strM9588q.hashCode() : 0)) * 31) + c7872e.m9589r().hashCode()) * 31;
            String strM9580i = c7872e.m9580i();
            return ((((((iHashCode2 + (strM9580i != null ? strM9580i.hashCode() : 0)) * 31) + c7872e.m9595x().hashCode()) * 31) + c7872e.m9594w().hashCode()) * 31) + c7872e.m9593v().hashCode();
        }

        public String toString() {
            return "AsyncImageModelEqualityDelegate.Default";
        }
    }

    /* renamed from: l.a$c */
    public static final class c {

        /* renamed from: a */
        public static final /* synthetic */ c f9166a = new c();
    }

    boolean equals(Object obj, Object obj2);

    int hashCode(Object obj);
}
