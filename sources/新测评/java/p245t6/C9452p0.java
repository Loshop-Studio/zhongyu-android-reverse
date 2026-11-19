package p245t6;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t6.p0 */
/* loaded from: classes4.dex */
public final class C9452p0 {

    /* renamed from: a */
    public final Boolean f16485a;

    /* renamed from: b */
    public final AbstractC9454q0 f16486b;

    /* renamed from: c */
    public final Boolean f16487c;

    public C9452p0(Boolean bool, AbstractC9454q0 abstractC9454q0, Boolean bool2) {
        this.f16485a = bool;
        this.f16486b = abstractC9454q0;
        this.f16487c = bool2;
    }

    /* renamed from: b */
    public static /* synthetic */ C9452p0 m15755b(C9452p0 c9452p0, Boolean bool, AbstractC9454q0 abstractC9454q0, Boolean bool2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = c9452p0.f16485a;
        }
        if ((i10 & 2) != 0) {
            abstractC9454q0 = c9452p0.f16486b;
        }
        if ((i10 & 4) != 0) {
            bool2 = c9452p0.f16487c;
        }
        return c9452p0.m15756a(bool, abstractC9454q0, bool2);
    }

    /* renamed from: a */
    public final C9452p0 m15756a(Boolean bool, AbstractC9454q0 abstractC9454q0, Boolean bool2) {
        return new C9452p0(bool, abstractC9454q0, bool2);
    }

    /* renamed from: c */
    public final AbstractC9454q0 m15757c() {
        return this.f16486b;
    }

    /* renamed from: d */
    public final Boolean m15758d() {
        return this.f16485a;
    }

    /* renamed from: e */
    public final Boolean m15759e() {
        return this.f16487c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9452p0)) {
            return false;
        }
        C9452p0 c9452p0 = (C9452p0) obj;
        return Intrinsics.areEqual(this.f16485a, c9452p0.f16485a) && Intrinsics.areEqual(this.f16486b, c9452p0.f16486b) && Intrinsics.areEqual(this.f16487c, c9452p0.f16487c);
    }

    public int hashCode() {
        Boolean bool = this.f16485a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        AbstractC9454q0 abstractC9454q0 = this.f16486b;
        int iHashCode2 = (iHashCode + (abstractC9454q0 == null ? 0 : abstractC9454q0.hashCode())) * 31;
        Boolean bool2 = this.f16487c;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "HomeDataModifyInfo(isFavorite=" + this.f16485a + ", taskButtonState=" + this.f16486b + ", isUnread=" + this.f16487c + ")";
    }

    public /* synthetic */ C9452p0(Boolean bool, AbstractC9454q0 abstractC9454q0, Boolean bool2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : abstractC9454q0, (i10 & 4) != 0 ? null : bool2);
    }
}
