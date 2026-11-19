package p129h7;

import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: h7.c */
/* loaded from: classes5.dex */
public final class C8107c {

    /* renamed from: a */
    public boolean f13842a;

    /* renamed from: b */
    public boolean f13843b;

    /* renamed from: c */
    public float f13844c;

    /* renamed from: d */
    public float f13845d;

    /* renamed from: e */
    public float f13846e;

    /* renamed from: f */
    public int f13847f;

    /* renamed from: g */
    public boolean f13848g;

    /* renamed from: h */
    public float f13849h;

    /* renamed from: i */
    public int f13850i;

    public C8107c(boolean z9, boolean z10, float f10, float f11, float f12, int i9, boolean z11, float f13, int i10) {
        this.f13842a = z9;
        this.f13843b = z10;
        this.f13844c = f10;
        this.f13845d = f11;
        this.f13846e = f12;
        this.f13847f = i9;
        this.f13848g = z11;
        this.f13849h = f13;
        this.f13850i = i10;
    }

    /* renamed from: a */
    public final boolean m12956a() {
        return this.f13843b;
    }

    /* renamed from: b */
    public final boolean m12957b() {
        return this.f13842a;
    }

    /* renamed from: c */
    public final int m12958c() {
        return this.f13850i;
    }

    /* renamed from: d */
    public final float m12959d() {
        return this.f13849h;
    }

    /* renamed from: e */
    public final float m12960e() {
        return this.f13844c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8107c)) {
            return false;
        }
        C8107c c8107c = (C8107c) obj;
        return this.f13842a == c8107c.f13842a && this.f13843b == c8107c.f13843b && Float.compare(this.f13844c, c8107c.f13844c) == 0 && Float.compare(this.f13845d, c8107c.f13845d) == 0 && Float.compare(this.f13846e, c8107c.f13846e) == 0 && this.f13847f == c8107c.f13847f && this.f13848g == c8107c.f13848g && Float.compare(this.f13849h, c8107c.f13849h) == 0 && this.f13850i == c8107c.f13850i;
    }

    /* renamed from: f */
    public final int m12961f() {
        return this.f13847f;
    }

    /* renamed from: g */
    public final float m12962g() {
        return this.f13846e;
    }

    /* renamed from: h */
    public final boolean m12963h() {
        return this.f13848g;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f13842a) * 31) + Boolean.hashCode(this.f13843b)) * 31) + Float.hashCode(this.f13844c)) * 31) + Float.hashCode(this.f13845d)) * 31) + Float.hashCode(this.f13846e)) * 31) + Integer.hashCode(this.f13847f)) * 31) + Boolean.hashCode(this.f13848g)) * 31) + Float.hashCode(this.f13849h)) * 31) + Integer.hashCode(this.f13850i);
    }

    /* renamed from: i */
    public final void m12964i(boolean z9) {
        this.f13842a = z9;
    }

    /* renamed from: j */
    public final void m12965j(float f10) {
        this.f13849h = f10;
    }

    /* renamed from: k */
    public final void m12966k(int i9) {
        this.f13847f = i9;
    }

    /* renamed from: l */
    public final void m12967l(boolean z9) {
        this.f13848g = z9;
    }

    /* renamed from: m */
    public final void m12968m(float f10) {
        this.f13846e = f10;
    }

    public String toString() {
        return "SimpleBoardConfig(enableFinger=" + this.f13842a + ", enableControl=" + this.f13843b + ", maxScaleTime=" + this.f13844c + ", minScaleTime=" + this.f13845d + ", penWidth=" + this.f13846e + ", penColor=" + this.f13847f + ", isPenDashed=" + this.f13848g + ", eraserSize=" + this.f13849h + ", eraserColor=" + this.f13850i + ")";
    }

    public /* synthetic */ C8107c(boolean z9, boolean z10, float f10, float f11, float f12, int i9, boolean z11, float f13, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z9, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? 1.5f : f10, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? 3.0f : f12, (i11 & 32) != 0 ? ViewCompat.MEASURED_STATE_MASK : i9, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? 40.0f : f13, (i11 & 256) != 0 ? SupportMenu.CATEGORY_MASK : i10);
    }
}
