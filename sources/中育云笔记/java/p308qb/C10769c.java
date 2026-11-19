package p308qb;

import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: qb.c */
/* loaded from: classes6.dex */
public final class C10769c {

    /* renamed from: a */
    public boolean f25983a;

    /* renamed from: b */
    public boolean f25984b;

    /* renamed from: c */
    public float f25985c;

    /* renamed from: d */
    public float f25986d;

    /* renamed from: e */
    public float f25987e;

    /* renamed from: f */
    public int f25988f;

    /* renamed from: g */
    public boolean f25989g;

    /* renamed from: h */
    public float f25990h;

    /* renamed from: i */
    public int f25991i;

    public C10769c(boolean z10, boolean z11, float f10, float f11, float f12, int i10, boolean z12, float f13, int i11) {
        this.f25983a = z10;
        this.f25984b = z11;
        this.f25985c = f10;
        this.f25986d = f11;
        this.f25987e = f12;
        this.f25988f = i10;
        this.f25989g = z12;
        this.f25990h = f13;
        this.f25991i = i11;
    }

    /* renamed from: a */
    public final boolean m22960a() {
        return this.f25984b;
    }

    /* renamed from: b */
    public final boolean m22961b() {
        return this.f25983a;
    }

    /* renamed from: c */
    public final int m22962c() {
        return this.f25991i;
    }

    /* renamed from: d */
    public final float m22963d() {
        return this.f25990h;
    }

    /* renamed from: e */
    public final float m22964e() {
        return this.f25985c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10769c)) {
            return false;
        }
        C10769c c10769c = (C10769c) obj;
        return this.f25983a == c10769c.f25983a && this.f25984b == c10769c.f25984b && Float.compare(this.f25985c, c10769c.f25985c) == 0 && Float.compare(this.f25986d, c10769c.f25986d) == 0 && Float.compare(this.f25987e, c10769c.f25987e) == 0 && this.f25988f == c10769c.f25988f && this.f25989g == c10769c.f25989g && Float.compare(this.f25990h, c10769c.f25990h) == 0 && this.f25991i == c10769c.f25991i;
    }

    /* renamed from: f */
    public final int m22965f() {
        return this.f25988f;
    }

    /* renamed from: g */
    public final float m22966g() {
        return this.f25987e;
    }

    /* renamed from: h */
    public final boolean m22967h() {
        return this.f25989g;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f25983a) * 31) + Boolean.hashCode(this.f25984b)) * 31) + Float.hashCode(this.f25985c)) * 31) + Float.hashCode(this.f25986d)) * 31) + Float.hashCode(this.f25987e)) * 31) + Integer.hashCode(this.f25988f)) * 31) + Boolean.hashCode(this.f25989g)) * 31) + Float.hashCode(this.f25990h)) * 31) + Integer.hashCode(this.f25991i);
    }

    /* renamed from: i */
    public final void m22968i(boolean z10) {
        this.f25983a = z10;
    }

    /* renamed from: j */
    public final void m22969j(float f10) {
        this.f25990h = f10;
    }

    /* renamed from: k */
    public final void m22970k(int i10) {
        this.f25988f = i10;
    }

    /* renamed from: l */
    public final void m22971l(boolean z10) {
        this.f25989g = z10;
    }

    /* renamed from: m */
    public final void m22972m(float f10) {
        this.f25987e = f10;
    }

    public String toString() {
        return "SimpleBoardConfig(enableFinger=" + this.f25983a + ", enableControl=" + this.f25984b + ", maxScaleTime=" + this.f25985c + ", minScaleTime=" + this.f25986d + ", penWidth=" + this.f25987e + ", penColor=" + this.f25988f + ", isPenDashed=" + this.f25989g + ", eraserSize=" + this.f25990h + ", eraserColor=" + this.f25991i + ")";
    }

    public /* synthetic */ C10769c(boolean z10, boolean z11, float f10, float f11, float f12, int i10, boolean z12, float f13, int i11, int i12, AbstractC9972n abstractC9972n) {
        this((i12 & 1) != 0 ? true : z10, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? 1.5f : f10, (i12 & 8) != 0 ? 1.0f : f11, (i12 & 16) != 0 ? 3.0f : f12, (i12 & 32) != 0 ? ViewCompat.MEASURED_STATE_MASK : i10, (i12 & 64) != 0 ? false : z12, (i12 & 128) != 0 ? 40.0f : f13, (i12 & 256) != 0 ? SupportMenu.CATEGORY_MASK : i11);
    }
}
