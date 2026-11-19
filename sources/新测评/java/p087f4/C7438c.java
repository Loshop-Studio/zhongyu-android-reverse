package p087f4;

import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f4.c */
/* loaded from: classes4.dex */
public final class C7438c {

    /* renamed from: a */
    public boolean f12152a;

    /* renamed from: b */
    public boolean f12153b;

    /* renamed from: c */
    public boolean f12154c;

    /* renamed from: d */
    public boolean f12155d;

    /* renamed from: e */
    public boolean f12156e;

    /* renamed from: f */
    public int f12157f;

    /* renamed from: g */
    public int f12158g;

    public C7438c(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11) {
        this.f12152a = z9;
        this.f12153b = z10;
        this.f12154c = z11;
        this.f12155d = z12;
        this.f12156e = z13;
        this.f12157f = i10;
        this.f12158g = i11;
    }

    /* renamed from: a */
    public final boolean m11993a() {
        return this.f12154c;
    }

    /* renamed from: b */
    public final int m11994b() {
        return this.f12158g;
    }

    /* renamed from: c */
    public final int m11995c() {
        return this.f12157f;
    }

    /* renamed from: d */
    public final boolean m11996d() {
        return this.f12156e;
    }

    /* renamed from: e */
    public final boolean m11997e() {
        return this.f12155d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7438c)) {
            return false;
        }
        C7438c c7438c = (C7438c) obj;
        return this.f12152a == c7438c.f12152a && this.f12153b == c7438c.f12153b && this.f12154c == c7438c.f12154c && this.f12155d == c7438c.f12155d && this.f12156e == c7438c.f12156e && this.f12157f == c7438c.f12157f && this.f12158g == c7438c.f12158g;
    }

    /* renamed from: f */
    public final boolean m11998f() {
        return this.f12153b;
    }

    /* renamed from: g */
    public final boolean m11999g() {
        return this.f12152a;
    }

    /* renamed from: h */
    public final void m12000h(MoveConfigEntity moveConfigEntity) {
        Intrinsics.checkNotNullParameter(moveConfigEntity, "moveConfigEntity");
        this.f12152a = moveConfigEntity.getIsEnable();
        this.f12153b = moveConfigEntity.getVerticalTranslate();
        this.f12154c = moveConfigEntity.getHorizontalTranslate();
        this.f12155d = moveConfigEntity.getScale();
        this.f12156e = moveConfigEntity.getRotate();
        this.f12157f = moveConfigEntity.getMaxWidthTimes();
        this.f12158g = moveConfigEntity.getMaxHeightTimes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public int hashCode() {
        boolean z9 = this.f12152a;
        ?? r02 = z9;
        if (z9) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f12153b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.f12154c;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        ?? r24 = this.f12155d;
        int i15 = r24;
        if (r24 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z10 = this.f12156e;
        return ((((i16 + (z10 ? 1 : z10 ? 1 : 0)) * 31) + Integer.hashCode(this.f12157f)) * 31) + Integer.hashCode(this.f12158g);
    }

    /* renamed from: i */
    public final void m12001i(boolean z9) {
        this.f12154c = z9;
    }

    /* renamed from: j */
    public final void m12002j(int i10) {
        this.f12158g = i10;
    }

    /* renamed from: k */
    public final void m12003k(int i10) {
        this.f12157f = i10;
    }

    /* renamed from: l */
    public final void m12004l(boolean z9) {
        this.f12152a = z9;
    }

    /* renamed from: m */
    public final void m12005m(boolean z9) {
        this.f12156e = z9;
    }

    /* renamed from: n */
    public final void m12006n(boolean z9) {
        this.f12155d = z9;
    }

    /* renamed from: o */
    public final void m12007o(boolean z9) {
        this.f12153b = z9;
    }

    public String toString() {
        return "MoveActionConfig(isMoveActionEnable=" + this.f12152a + ", verticalTranslate=" + this.f12153b + ", horizontalTranslate=" + this.f12154c + ", scale=" + this.f12155d + ", rotate=" + this.f12156e + ", maxWidthTimes=" + this.f12157f + ", maxHeightTimes=" + this.f12158g + ')';
    }

    public /* synthetic */ C7438c(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z9, (i12 & 2) != 0 ? false : z10, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? false : z13, (i12 & 32) != 0 ? 1 : i10, (i12 & 64) != 0 ? 1 : i11);
    }
}
