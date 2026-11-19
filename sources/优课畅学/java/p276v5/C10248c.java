package p276v5;

import androidx.core.internal.view.SupportMenu;
import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: v5.c */
/* loaded from: classes5.dex */
public final class C10248c {

    /* renamed from: a */
    public boolean f20479a;

    /* renamed from: b */
    public boolean f20480b;

    /* renamed from: c */
    public float f20481c;

    /* renamed from: d */
    public float f20482d;

    /* renamed from: e */
    public float f20483e;

    /* renamed from: f */
    public int f20484f;

    /* renamed from: g */
    public boolean f20485g;

    /* renamed from: h */
    public float f20486h;

    /* renamed from: i */
    public int f20487i;

    public C10248c(boolean z10, boolean z11, float f10, float f11, float f12, int i10, boolean z12, float f13, int i11) {
        this.f20479a = z10;
        this.f20480b = z11;
        this.f20481c = f10;
        this.f20482d = f11;
        this.f20483e = f12;
        this.f20484f = i10;
        this.f20485g = z12;
        this.f20486h = f13;
        this.f20487i = i11;
    }

    /* renamed from: a */
    public final boolean m19187a() {
        return this.f20480b;
    }

    /* renamed from: b */
    public final boolean m19188b() {
        return this.f20479a;
    }

    /* renamed from: c */
    public final int m19189c() {
        return this.f20487i;
    }

    /* renamed from: d */
    public final float m19190d() {
        return this.f20486h;
    }

    /* renamed from: e */
    public final float m19191e() {
        return this.f20481c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10248c)) {
            return false;
        }
        C10248c c10248c = (C10248c) obj;
        return this.f20479a == c10248c.f20479a && this.f20480b == c10248c.f20480b && Float.compare(this.f20481c, c10248c.f20481c) == 0 && Float.compare(this.f20482d, c10248c.f20482d) == 0 && Float.compare(this.f20483e, c10248c.f20483e) == 0 && this.f20484f == c10248c.f20484f && this.f20485g == c10248c.f20485g && Float.compare(this.f20486h, c10248c.f20486h) == 0 && this.f20487i == c10248c.f20487i;
    }

    /* renamed from: f */
    public final int m19192f() {
        return this.f20484f;
    }

    /* renamed from: g */
    public final float m19193g() {
        return this.f20483e;
    }

    /* renamed from: h */
    public final boolean m19194h() {
        return this.f20485g;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f20479a) * 31) + Boolean.hashCode(this.f20480b)) * 31) + Float.hashCode(this.f20481c)) * 31) + Float.hashCode(this.f20482d)) * 31) + Float.hashCode(this.f20483e)) * 31) + Integer.hashCode(this.f20484f)) * 31) + Boolean.hashCode(this.f20485g)) * 31) + Float.hashCode(this.f20486h)) * 31) + Integer.hashCode(this.f20487i);
    }

    /* renamed from: i */
    public final void m19195i(boolean z10) {
        this.f20479a = z10;
    }

    /* renamed from: j */
    public final void m19196j(float f10) {
        this.f20486h = f10;
    }

    /* renamed from: k */
    public final void m19197k(int i10) {
        this.f20484f = i10;
    }

    /* renamed from: l */
    public final void m19198l(boolean z10) {
        this.f20485g = z10;
    }

    /* renamed from: m */
    public final void m19199m(float f10) {
        this.f20483e = f10;
    }

    public String toString() {
        return "SimpleBoardConfig(enableFinger=" + this.f20479a + ", enableControl=" + this.f20480b + ", maxScaleTime=" + this.f20481c + ", minScaleTime=" + this.f20482d + ", penWidth=" + this.f20483e + ", penColor=" + this.f20484f + ", isPenDashed=" + this.f20485g + ", eraserSize=" + this.f20486h + ", eraserColor=" + this.f20487i + ")";
    }

    public /* synthetic */ C10248c(boolean z10, boolean z11, float f10, float f11, float f12, int i10, boolean z12, float f13, int i11, int i12, AbstractC9126n abstractC9126n) {
        this((i12 & 1) != 0 ? true : z10, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? 1.5f : f10, (i12 & 8) != 0 ? 1.0f : f11, (i12 & 16) != 0 ? 3.0f : f12, (i12 & 32) != 0 ? -16777216 : i10, (i12 & 64) != 0 ? false : z12, (i12 & 128) != 0 ? 40.0f : f13, (i12 & 256) != 0 ? SupportMenu.CATEGORY_MASK : i11);
    }
}
