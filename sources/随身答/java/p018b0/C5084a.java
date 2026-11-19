package p018b0;

import android.graphics.RectF;
import com.caverock.androidsvg.C5623a;
import com.caverock.androidsvg.SVG;
import p001a0.AbstractC0005b;
import p001a0.C0008e;
import p151k.InterfaceC8239j;
import p297y.C9932m;

/* renamed from: b0.a */
/* loaded from: classes3.dex */
public final class C5084a implements InterfaceC5085b {

    /* renamed from: a */
    public final SVG f2188a;

    /* renamed from: b */
    public C5623a f2189b;

    public C5084a(SVG svg) {
        this.f2188a = svg;
    }

    @Override // p018b0.InterfaceC5085b
    /* renamed from: a */
    public void mo2122a(String str) {
        this.f2188a.m3687t(str);
    }

    @Override // p018b0.InterfaceC5085b
    /* renamed from: b */
    public void mo2123b(C9932m c9932m) {
        String strM6a = AbstractC0005b.m6a(c9932m);
        if (strM6a != null) {
            C5623a c5623a = new C5623a();
            c5623a.m3877a(strM6a);
            this.f2189b = c5623a;
        }
    }

    @Override // p018b0.InterfaceC5085b
    /* renamed from: c */
    public void mo2124c(String str) {
        this.f2188a.m3685r(str);
    }

    @Override // p018b0.InterfaceC5085b
    /* renamed from: d */
    public void mo2125d(float[] fArr) {
        SVG svg = this.f2188a;
        float f10 = fArr[0];
        float f11 = fArr[1];
        svg.m3686s(f10, f11, fArr[2] - f10, fArr[3] - f11);
    }

    @Override // p018b0.InterfaceC5085b
    /* renamed from: e */
    public float[] mo2126e() {
        RectF rectFM3676g = this.f2188a.m3676g();
        if (rectFM3676g != null) {
            return new float[]{rectFM3676g.left, rectFM3676g.top, rectFM3676g.right, rectFM3676g.bottom};
        }
        return null;
    }

    @Override // p018b0.InterfaceC5085b
    /* renamed from: f */
    public InterfaceC8239j mo2127f(int i9, int i10) {
        return new C0008e(this.f2188a, this.f2189b, i9, i10);
    }

    @Override // p018b0.InterfaceC5085b
    public float getHeight() {
        return this.f2188a.m3675f();
    }

    @Override // p018b0.InterfaceC5085b
    public float getWidth() {
        return this.f2188a.m3677h();
    }
}
