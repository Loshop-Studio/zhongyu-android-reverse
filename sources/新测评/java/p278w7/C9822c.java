package p278w7;

import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w7.c */
/* loaded from: classes5.dex */
public final class C9822c {

    /* renamed from: a */
    public boolean f17376a;

    /* renamed from: b */
    public boolean f17377b;

    /* renamed from: c */
    public float f17378c;

    /* renamed from: d */
    public float f17379d;

    /* renamed from: e */
    public float f17380e;

    /* renamed from: f */
    public int f17381f;

    /* renamed from: g */
    public boolean f17382g;

    /* renamed from: h */
    public float f17383h;

    /* renamed from: i */
    public int f17384i;

    public C9822c(boolean z9, boolean z10, float f10, float f11, float f12, int i10, boolean z11, float f13, int i11) {
        this.f17376a = z9;
        this.f17377b = z10;
        this.f17378c = f10;
        this.f17379d = f11;
        this.f17380e = f12;
        this.f17381f = i10;
        this.f17382g = z11;
        this.f17383h = f13;
        this.f17384i = i11;
    }

    /* renamed from: a */
    public final boolean m16432a() {
        return this.f17377b;
    }

    /* renamed from: b */
    public final boolean m16433b() {
        return this.f17376a;
    }

    /* renamed from: c */
    public final int m16434c() {
        return this.f17384i;
    }

    /* renamed from: d */
    public final float m16435d() {
        return this.f17383h;
    }

    /* renamed from: e */
    public final float m16436e() {
        return this.f17378c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9822c)) {
            return false;
        }
        C9822c c9822c = (C9822c) obj;
        return this.f17376a == c9822c.f17376a && this.f17377b == c9822c.f17377b && Float.compare(this.f17378c, c9822c.f17378c) == 0 && Float.compare(this.f17379d, c9822c.f17379d) == 0 && Float.compare(this.f17380e, c9822c.f17380e) == 0 && this.f17381f == c9822c.f17381f && this.f17382g == c9822c.f17382g && Float.compare(this.f17383h, c9822c.f17383h) == 0 && this.f17384i == c9822c.f17384i;
    }

    /* renamed from: f */
    public final float m16437f() {
        return this.f17379d;
    }

    /* renamed from: g */
    public final int m16438g() {
        return this.f17381f;
    }

    /* renamed from: h */
    public final float m16439h() {
        return this.f17380e;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f17376a) * 31) + Boolean.hashCode(this.f17377b)) * 31) + Float.hashCode(this.f17378c)) * 31) + Float.hashCode(this.f17379d)) * 31) + Float.hashCode(this.f17380e)) * 31) + Integer.hashCode(this.f17381f)) * 31) + Boolean.hashCode(this.f17382g)) * 31) + Float.hashCode(this.f17383h)) * 31) + Integer.hashCode(this.f17384i);
    }

    /* renamed from: i */
    public final boolean m16440i() {
        return this.f17382g;
    }

    /* renamed from: j */
    public final void m16441j(boolean z9) {
        this.f17376a = z9;
    }

    /* renamed from: k */
    public final void m16442k(float f10) {
        this.f17383h = f10;
    }

    /* renamed from: l */
    public final void m16443l(int i10) {
        this.f17381f = i10;
    }

    /* renamed from: m */
    public final void m16444m(boolean z9) {
        this.f17382g = z9;
    }

    /* renamed from: n */
    public final void m16445n(float f10) {
        this.f17380e = f10;
    }

    public String toString() {
        return "SimpleBoardConfig(enableFinger=" + this.f17376a + ", enableControl=" + this.f17377b + ", maxScaleTime=" + this.f17378c + ", minScaleTime=" + this.f17379d + ", penWidth=" + this.f17380e + ", penColor=" + this.f17381f + ", isPenDashed=" + this.f17382g + ", eraserSize=" + this.f17383h + ", eraserColor=" + this.f17384i + ")";
    }

    public /* synthetic */ C9822c(boolean z9, boolean z10, float f10, float f11, float f12, int i10, boolean z11, float f13, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? true : z9, (i12 & 2) != 0 ? false : z10, (i12 & 4) != 0 ? 1.5f : f10, (i12 & 8) != 0 ? 1.0f : f11, (i12 & 16) != 0 ? 3.0f : f12, (i12 & 32) != 0 ? ViewCompat.MEASURED_STATE_MASK : i10, (i12 & 64) != 0 ? false : z11, (i12 & 128) != 0 ? 40.0f : f13, (i12 & 256) != 0 ? SupportMenu.CATEGORY_MASK : i11);
    }
}
