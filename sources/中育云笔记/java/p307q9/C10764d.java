package p307q9;

import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: q9.d */
/* loaded from: classes5.dex */
public final class C10764d {

    /* renamed from: a */
    public boolean f25954a;

    /* renamed from: b */
    public boolean f25955b;

    /* renamed from: c */
    public boolean f25956c;

    /* renamed from: d */
    public boolean f25957d;

    /* renamed from: e */
    public boolean f25958e;

    /* renamed from: f */
    public int f25959f;

    /* renamed from: g */
    public int f25960g;

    public C10764d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, int i11) {
        this.f25954a = z10;
        this.f25955b = z11;
        this.f25956c = z12;
        this.f25957d = z13;
        this.f25958e = z14;
        this.f25959f = i10;
        this.f25960g = i11;
    }

    /* renamed from: a */
    public final boolean m22922a() {
        return this.f25956c;
    }

    /* renamed from: b */
    public final int m22923b() {
        return this.f25960g;
    }

    /* renamed from: c */
    public final int m22924c() {
        return this.f25959f;
    }

    /* renamed from: d */
    public final boolean m22925d() {
        return this.f25958e;
    }

    /* renamed from: e */
    public final boolean m22926e() {
        return this.f25957d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10764d)) {
            return false;
        }
        C10764d c10764d = (C10764d) obj;
        return this.f25954a == c10764d.f25954a && this.f25955b == c10764d.f25955b && this.f25956c == c10764d.f25956c && this.f25957d == c10764d.f25957d && this.f25958e == c10764d.f25958e && this.f25959f == c10764d.f25959f && this.f25960g == c10764d.f25960g;
    }

    /* renamed from: f */
    public final boolean m22927f() {
        return this.f25955b;
    }

    /* renamed from: g */
    public final boolean m22928g() {
        return this.f25954a;
    }

    /* renamed from: h */
    public final void m22929h(MoveConfigEntity moveConfigEntity) {
        AbstractC9979u.m20294g(moveConfigEntity, "moveConfigEntity");
        this.f25954a = moveConfigEntity.m14229h();
        this.f25955b = moveConfigEntity.m14228g();
        this.f25956c = moveConfigEntity.m14222a();
        this.f25957d = moveConfigEntity.m14227f();
        this.f25958e = moveConfigEntity.m14226e();
        this.f25959f = moveConfigEntity.m14225d();
        this.f25960g = moveConfigEntity.m14224c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f25954a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f25955b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.f25956c;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        ?? r24 = this.f25957d;
        int i15 = r24;
        if (r24 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z11 = this.f25958e;
        return ((((i16 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Integer.hashCode(this.f25959f)) * 31) + Integer.hashCode(this.f25960g);
    }

    /* renamed from: i */
    public final void m22930i(boolean z10) {
        this.f25956c = z10;
    }

    /* renamed from: j */
    public final void m22931j(int i10) {
        this.f25960g = i10;
    }

    /* renamed from: k */
    public final void m22932k(int i10) {
        this.f25959f = i10;
    }

    /* renamed from: l */
    public final void m22933l(boolean z10) {
        this.f25954a = z10;
    }

    /* renamed from: m */
    public final void m22934m(boolean z10) {
        this.f25958e = z10;
    }

    /* renamed from: n */
    public final void m22935n(boolean z10) {
        this.f25957d = z10;
    }

    /* renamed from: o */
    public final void m22936o(boolean z10) {
        this.f25955b = z10;
    }

    public String toString() {
        return "MoveActionConfig(isMoveActionEnable=" + this.f25954a + ", verticalTranslate=" + this.f25955b + ", horizontalTranslate=" + this.f25956c + ", scale=" + this.f25957d + ", rotate=" + this.f25958e + ", maxWidthTimes=" + this.f25959f + ", maxHeightTimes=" + this.f25960g + ')';
    }

    public /* synthetic */ C10764d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, int i11, int i12, AbstractC9972n abstractC9972n) {
        this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? false : z14, (i12 & 32) != 0 ? 1 : i10, (i12 & 64) != 0 ? 1 : i11);
    }
}
