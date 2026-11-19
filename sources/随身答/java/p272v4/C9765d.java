package p272v4;

import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v4.d */
/* loaded from: classes4.dex */
public final class C9765d {

    /* renamed from: a */
    public boolean f17350a;

    /* renamed from: b */
    public boolean f17351b;

    /* renamed from: c */
    public boolean f17352c;

    /* renamed from: d */
    public boolean f17353d;

    /* renamed from: e */
    public boolean f17354e;

    /* renamed from: f */
    public int f17355f;

    /* renamed from: g */
    public int f17356g;

    public C9765d(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i9, int i10) {
        this.f17350a = z9;
        this.f17351b = z10;
        this.f17352c = z11;
        this.f17353d = z12;
        this.f17354e = z13;
        this.f17355f = i9;
        this.f17356g = i10;
    }

    /* renamed from: a */
    public final boolean m16522a() {
        return this.f17352c;
    }

    /* renamed from: b */
    public final int m16523b() {
        return this.f17356g;
    }

    /* renamed from: c */
    public final int m16524c() {
        return this.f17355f;
    }

    /* renamed from: d */
    public final boolean m16525d() {
        return this.f17354e;
    }

    /* renamed from: e */
    public final boolean m16526e() {
        return this.f17353d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9765d)) {
            return false;
        }
        C9765d c9765d = (C9765d) obj;
        return this.f17350a == c9765d.f17350a && this.f17351b == c9765d.f17351b && this.f17352c == c9765d.f17352c && this.f17353d == c9765d.f17353d && this.f17354e == c9765d.f17354e && this.f17355f == c9765d.f17355f && this.f17356g == c9765d.f17356g;
    }

    /* renamed from: f */
    public final boolean m16527f() {
        return this.f17351b;
    }

    /* renamed from: g */
    public final boolean m16528g() {
        return this.f17350a;
    }

    /* renamed from: h */
    public final void m16529h(MoveConfigEntity moveConfigEntity) {
        Intrinsics.checkNotNullParameter(moveConfigEntity, "moveConfigEntity");
        this.f17350a = moveConfigEntity.getIsEnable();
        this.f17351b = moveConfigEntity.getVerticalTranslate();
        this.f17352c = moveConfigEntity.getHorizontalTranslate();
        this.f17353d = moveConfigEntity.getScale();
        this.f17354e = moveConfigEntity.getRotate();
        this.f17355f = moveConfigEntity.getMaxWidthTimes();
        this.f17356g = moveConfigEntity.getMaxHeightTimes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public int hashCode() {
        boolean z9 = this.f17350a;
        ?? r02 = z9;
        if (z9) {
            r02 = 1;
        }
        int i9 = r02 * 31;
        ?? r22 = this.f17351b;
        int i10 = r22;
        if (r22 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r23 = this.f17352c;
        int i12 = r23;
        if (r23 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        ?? r24 = this.f17353d;
        int i14 = r24;
        if (r24 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z10 = this.f17354e;
        return ((((i15 + (z10 ? 1 : z10 ? 1 : 0)) * 31) + Integer.hashCode(this.f17355f)) * 31) + Integer.hashCode(this.f17356g);
    }

    /* renamed from: i */
    public final void m16530i(boolean z9) {
        this.f17352c = z9;
    }

    /* renamed from: j */
    public final void m16531j(int i9) {
        this.f17356g = i9;
    }

    /* renamed from: k */
    public final void m16532k(int i9) {
        this.f17355f = i9;
    }

    /* renamed from: l */
    public final void m16533l(boolean z9) {
        this.f17350a = z9;
    }

    /* renamed from: m */
    public final void m16534m(boolean z9) {
        this.f17354e = z9;
    }

    /* renamed from: n */
    public final void m16535n(boolean z9) {
        this.f17353d = z9;
    }

    /* renamed from: o */
    public final void m16536o(boolean z9) {
        this.f17351b = z9;
    }

    public String toString() {
        return "MoveActionConfig(isMoveActionEnable=" + this.f17350a + ", verticalTranslate=" + this.f17351b + ", horizontalTranslate=" + this.f17352c + ", scale=" + this.f17353d + ", rotate=" + this.f17354e + ", maxWidthTimes=" + this.f17355f + ", maxHeightTimes=" + this.f17356g + ')';
    }

    public /* synthetic */ C9765d(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z9, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? false : z13, (i11 & 32) != 0 ? 1 : i9, (i11 & 64) != 0 ? 1 : i10);
    }
}
