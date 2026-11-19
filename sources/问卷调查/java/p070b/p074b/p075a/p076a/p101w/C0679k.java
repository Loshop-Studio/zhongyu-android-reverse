package p070b.p074b.p075a.p076a.p101w;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;
import p070b.p074b.p075a.p076a.p101w.C0675g;
import p070b.p074b.p075a.p076a.p101w.C0681m;

/* renamed from: b.b.a.a.w.k */
/* loaded from: classes.dex */
public class C0679k {

    /* renamed from: a */
    public final C0681m[] f4068a = new C0681m[4];

    /* renamed from: b */
    public final Matrix[] f4069b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f4070c = new Matrix[4];

    /* renamed from: d */
    public final PointF f4071d = new PointF();

    /* renamed from: e */
    public final Path f4072e = new Path();

    /* renamed from: f */
    public final Path f4073f = new Path();

    /* renamed from: g */
    public final C0681m f4074g = new C0681m();

    /* renamed from: h */
    public final float[] f4075h = new float[2];

    /* renamed from: i */
    public final float[] f4076i = new float[2];

    /* renamed from: j */
    public boolean f4077j = true;

    /* renamed from: b.b.a.a.w.k$a */
    public interface a {
    }

    public C0679k() {
        for (int i = 0; i < 4; i++) {
            this.f4068a[i] = new C0681m();
            this.f4069b[i] = new Matrix();
            this.f4070c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    public void m2315a(C0678j c0678j, float f2, RectF rectF, a aVar, Path path) {
        float fCenterX;
        float f3;
        char c2;
        C0674f c0674f;
        C0681m c0681m;
        Matrix matrix;
        Path path2;
        float f4;
        float f5;
        path.rewind();
        this.f4072e.rewind();
        this.f4073f.rewind();
        this.f4073f.addRect(rectF, Path.Direction.CW);
        int i = 0;
        while (i < 4) {
            InterfaceC0671c interfaceC0671c = i != 1 ? i != 2 ? i != 3 ? c0678j.f4049f : c0678j.f4048e : c0678j.f4051h : c0678j.f4050g;
            C0672d c0672d = i != 1 ? i != 2 ? i != 3 ? c0678j.f4045b : c0678j.f4044a : c0678j.f4047d : c0678j.f4046c;
            C0681m c0681m2 = this.f4068a[i];
            Objects.requireNonNull(c0672d);
            c0672d.mo2280a(c0681m2, 90.0f, f2, interfaceC0671c.mo2279a(rectF));
            int i2 = i + 1;
            float f6 = i2 * 90;
            this.f4069b[i].reset();
            PointF pointF = this.f4071d;
            if (i == 1) {
                f4 = rectF.right;
            } else if (i != 2) {
                f4 = i != 3 ? rectF.right : rectF.left;
                f5 = rectF.top;
                pointF.set(f4, f5);
                Matrix matrix2 = this.f4069b[i];
                PointF pointF2 = this.f4071d;
                matrix2.setTranslate(pointF2.x, pointF2.y);
                this.f4069b[i].preRotate(f6);
                float[] fArr = this.f4075h;
                C0681m[] c0681mArr = this.f4068a;
                fArr[0] = c0681mArr[i].f4082c;
                fArr[1] = c0681mArr[i].f4083d;
                this.f4069b[i].mapPoints(fArr);
                this.f4070c[i].reset();
                Matrix matrix3 = this.f4070c[i];
                float[] fArr2 = this.f4075h;
                matrix3.setTranslate(fArr2[0], fArr2[1]);
                this.f4070c[i].preRotate(f6);
                i = i2;
            } else {
                f4 = rectF.left;
            }
            f5 = rectF.bottom;
            pointF.set(f4, f5);
            Matrix matrix22 = this.f4069b[i];
            PointF pointF22 = this.f4071d;
            matrix22.setTranslate(pointF22.x, pointF22.y);
            this.f4069b[i].preRotate(f6);
            float[] fArr3 = this.f4075h;
            C0681m[] c0681mArr2 = this.f4068a;
            fArr3[0] = c0681mArr2[i].f4082c;
            fArr3[1] = c0681mArr2[i].f4083d;
            this.f4069b[i].mapPoints(fArr3);
            this.f4070c[i].reset();
            Matrix matrix32 = this.f4070c[i];
            float[] fArr22 = this.f4075h;
            matrix32.setTranslate(fArr22[0], fArr22[1]);
            this.f4070c[i].preRotate(f6);
            i = i2;
        }
        int i3 = 0;
        while (i3 < 4) {
            float[] fArr4 = this.f4075h;
            C0681m[] c0681mArr3 = this.f4068a;
            fArr4[0] = c0681mArr3[i3].f4080a;
            fArr4[1] = c0681mArr3[i3].f4081b;
            this.f4069b[i3].mapPoints(fArr4);
            float[] fArr5 = this.f4075h;
            if (i3 == 0) {
                path.moveTo(fArr5[0], fArr5[1]);
            } else {
                path.lineTo(fArr5[0], fArr5[1]);
            }
            this.f4068a[i3].m2320c(this.f4069b[i3], path);
            if (aVar != null) {
                C0681m c0681m3 = this.f4068a[i3];
                Matrix matrix4 = this.f4069b[i3];
                C0675g.a aVar2 = (C0675g.a) aVar;
                BitSet bitSet = C0675g.this.f4001e;
                Objects.requireNonNull(c0681m3);
                bitSet.set(i3, false);
                C0681m.f[] fVarArr = C0675g.this.f3999c;
                c0681m3.m2319b(c0681m3.f4085f);
                fVarArr[i3] = new C0680l(c0681m3, new ArrayList(c0681m3.f4087h), matrix4);
            }
            int i4 = i3 + 1;
            int i5 = i4 % 4;
            float[] fArr6 = this.f4075h;
            C0681m[] c0681mArr4 = this.f4068a;
            fArr6[0] = c0681mArr4[i3].f4082c;
            fArr6[1] = c0681mArr4[i3].f4083d;
            this.f4069b[i3].mapPoints(fArr6);
            float[] fArr7 = this.f4076i;
            C0681m[] c0681mArr5 = this.f4068a;
            fArr7[0] = c0681mArr5[i5].f4080a;
            fArr7[1] = c0681mArr5[i5].f4081b;
            this.f4069b[i5].mapPoints(fArr7);
            float f7 = this.f4075h[0];
            float[] fArr8 = this.f4076i;
            float fMax = Math.max(((float) Math.hypot(f7 - fArr8[0], r13[1] - fArr8[1])) - 0.001f, 0.0f);
            float[] fArr9 = this.f4075h;
            C0681m[] c0681mArr6 = this.f4068a;
            fArr9[0] = c0681mArr6[i3].f4082c;
            fArr9[1] = c0681mArr6[i3].f4083d;
            this.f4069b[i3].mapPoints(fArr9);
            if (i3 == 1 || i3 == 3) {
                fCenterX = rectF.centerX();
                f3 = this.f4075h[0];
            } else {
                fCenterX = rectF.centerY();
                f3 = this.f4075h[1];
            }
            float fAbs = Math.abs(fCenterX - f3);
            this.f4074g.m2322e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i3 == 1) {
                c2 = 3;
                c0674f = c0678j.f4054k;
            } else if (i3 != 2) {
                c2 = 3;
                c0674f = i3 != 3 ? c0678j.f4053j : c0678j.f4052i;
            } else {
                c2 = 3;
                c0674f = c0678j.f4055l;
            }
            c0674f.m2281a(fMax, fAbs, f2, this.f4074g);
            Path path3 = new Path();
            this.f4074g.m2320c(this.f4070c[i3], path3);
            if (this.f4077j && (m2316b(path3, i3) || m2316b(path3, i5))) {
                path3.op(path3, this.f4073f, Path.Op.DIFFERENCE);
                float[] fArr10 = this.f4075h;
                C0681m c0681m4 = this.f4074g;
                fArr10[0] = c0681m4.f4080a;
                fArr10[1] = c0681m4.f4081b;
                this.f4070c[i3].mapPoints(fArr10);
                Path path4 = this.f4072e;
                float[] fArr11 = this.f4075h;
                path4.moveTo(fArr11[0], fArr11[1]);
                c0681m = this.f4074g;
                matrix = this.f4070c[i3];
                path2 = this.f4072e;
            } else {
                c0681m = this.f4074g;
                matrix = this.f4070c[i3];
                path2 = path;
            }
            c0681m.m2320c(matrix, path2);
            if (aVar != null) {
                C0681m c0681m5 = this.f4074g;
                Matrix matrix5 = this.f4070c[i3];
                C0675g.a aVar3 = (C0675g.a) aVar;
                Objects.requireNonNull(c0681m5);
                C0675g.this.f4001e.set(i3 + 4, false);
                C0681m.f[] fVarArr2 = C0675g.this.f4000d;
                c0681m5.m2319b(c0681m5.f4085f);
                fVarArr2[i3] = new C0680l(c0681m5, new ArrayList(c0681m5.f4087h), matrix5);
            }
            i3 = i4;
        }
        path.close();
        this.f4072e.close();
        if (this.f4072e.isEmpty()) {
            return;
        }
        path.op(this.f4072e, Path.Op.UNION);
    }

    /* renamed from: b */
    public final boolean m2316b(Path path, int i) {
        Path path2 = new Path();
        this.f4068a[i].m2320c(this.f4069b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
