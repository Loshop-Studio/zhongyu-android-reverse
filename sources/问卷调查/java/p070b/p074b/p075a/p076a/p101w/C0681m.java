package p070b.p074b.p075a.p076a.p101w;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p070b.p074b.p075a.p076a.p100v.C0667a;

/* renamed from: b.b.a.a.w.m */
/* loaded from: classes.dex */
public class C0681m {

    /* renamed from: a */
    @Deprecated
    public float f4080a;

    /* renamed from: b */
    @Deprecated
    public float f4081b;

    /* renamed from: c */
    @Deprecated
    public float f4082c;

    /* renamed from: d */
    @Deprecated
    public float f4083d;

    /* renamed from: e */
    @Deprecated
    public float f4084e;

    /* renamed from: f */
    @Deprecated
    public float f4085f;

    /* renamed from: g */
    public final List<e> f4086g = new ArrayList();

    /* renamed from: h */
    public final List<f> f4087h = new ArrayList();

    /* renamed from: b.b.a.a.w.m$a */
    public static class a extends f {

        /* renamed from: b */
        public final c f4088b;

        public a(c cVar) {
            this.f4088b = cVar;
        }

        @Override // p070b.p074b.p075a.p076a.p101w.C0681m.f
        /* renamed from: a */
        public void mo2317a(Matrix matrix, C0667a c0667a, int i, Canvas canvas) {
            c cVar = this.f4088b;
            float f2 = cVar.f4097f;
            float f3 = cVar.f4098g;
            c cVar2 = this.f4088b;
            RectF rectF = new RectF(cVar2.f4093b, cVar2.f4094c, cVar2.f4095d, cVar2.f4096e);
            int[] iArr = C0667a.f3983k;
            boolean z = f3 < 0.0f;
            Path path = c0667a.f3991g;
            if (z) {
                iArr[0] = 0;
                iArr[1] = c0667a.f3990f;
                iArr[2] = c0667a.f3989e;
                iArr[3] = c0667a.f3988d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f2, f3);
                path.close();
                float f4 = -i;
                rectF.inset(f4, f4);
                iArr[0] = 0;
                iArr[1] = c0667a.f3988d;
                iArr[2] = c0667a.f3989e;
                iArr[3] = c0667a.f3990f;
            }
            float fWidth = rectF.width() / 2.0f;
            if (fWidth <= 0.0f) {
                return;
            }
            float f5 = 1.0f - (i / fWidth);
            float[] fArr = C0667a.f3984l;
            fArr[1] = f5;
            fArr[2] = ((1.0f - f5) / 2.0f) + f5;
            c0667a.f3986b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, c0667a.f3992h);
            }
            canvas.drawArc(rectF, f2, f3, true, c0667a.f3986b);
            canvas.restore();
        }
    }

    /* renamed from: b.b.a.a.w.m$b */
    public static class b extends f {

        /* renamed from: b */
        public final d f4089b;

        /* renamed from: c */
        public final float f4090c;

        /* renamed from: d */
        public final float f4091d;

        public b(d dVar, float f2, float f3) {
            this.f4089b = dVar;
            this.f4090c = f2;
            this.f4091d = f3;
        }

        @Override // p070b.p074b.p075a.p076a.p101w.C0681m.f
        /* renamed from: a */
        public void mo2317a(Matrix matrix, C0667a c0667a, int i, Canvas canvas) {
            d dVar = this.f4089b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(dVar.f4100c - this.f4091d, dVar.f4099b - this.f4090c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f4090c, this.f4091d);
            matrix2.preRotate(m2323b());
            Objects.requireNonNull(c0667a);
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int[] iArr = C0667a.f3981i;
            iArr[0] = c0667a.f3990f;
            iArr[1] = c0667a.f3989e;
            iArr[2] = c0667a.f3988d;
            Paint paint = c0667a.f3987c;
            float f2 = rectF.left;
            paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, C0667a.f3982j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, c0667a.f3987c);
            canvas.restore();
        }

        /* renamed from: b */
        public float m2323b() {
            d dVar = this.f4089b;
            return (float) Math.toDegrees(Math.atan((dVar.f4100c - this.f4091d) / (dVar.f4099b - this.f4090c)));
        }
    }

    /* renamed from: b.b.a.a.w.m$c */
    public static class c extends e {

        /* renamed from: h */
        public static final RectF f4092h = new RectF();

        /* renamed from: b */
        @Deprecated
        public float f4093b;

        /* renamed from: c */
        @Deprecated
        public float f4094c;

        /* renamed from: d */
        @Deprecated
        public float f4095d;

        /* renamed from: e */
        @Deprecated
        public float f4096e;

        /* renamed from: f */
        @Deprecated
        public float f4097f;

        /* renamed from: g */
        @Deprecated
        public float f4098g;

        public c(float f2, float f3, float f4, float f5) {
            this.f4093b = f2;
            this.f4094c = f3;
            this.f4095d = f4;
            this.f4096e = f5;
        }

        @Override // p070b.p074b.p075a.p076a.p101w.C0681m.e
        /* renamed from: a */
        public void mo2324a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4101a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f4092h;
            rectF.set(this.f4093b, this.f4094c, this.f4095d, this.f4096e);
            path.arcTo(rectF, this.f4097f, this.f4098g, false);
            path.transform(matrix);
        }
    }

    /* renamed from: b.b.a.a.w.m$d */
    public static class d extends e {

        /* renamed from: b */
        public float f4099b;

        /* renamed from: c */
        public float f4100c;

        @Override // p070b.p074b.p075a.p076a.p101w.C0681m.e
        /* renamed from: a */
        public void mo2324a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4101a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f4099b, this.f4100c);
            path.transform(matrix);
        }
    }

    /* renamed from: b.b.a.a.w.m$e */
    public static abstract class e {

        /* renamed from: a */
        public final Matrix f4101a = new Matrix();

        /* renamed from: a */
        public abstract void mo2324a(Matrix matrix, Path path);
    }

    /* renamed from: b.b.a.a.w.m$f */
    public static abstract class f {

        /* renamed from: a */
        public static final Matrix f4102a = new Matrix();

        /* renamed from: a */
        public abstract void mo2317a(Matrix matrix, C0667a c0667a, int i, Canvas canvas);
    }

    public C0681m() {
        m2322e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public void m2318a(float f2, float f3, float f4, float f5, float f6, float f7) {
        c cVar = new c(f2, f3, f4, f5);
        cVar.f4097f = f6;
        cVar.f4098g = f7;
        this.f4086g.add(cVar);
        a aVar = new a(cVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        float f9 = z ? (180.0f + f8) % 360.0f : f8;
        m2319b(f6);
        this.f4087h.add(aVar);
        this.f4084e = f9;
        double d2 = f8;
        this.f4082c = (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f2 + f4) * 0.5f);
        this.f4083d = (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f3 + f5) * 0.5f);
    }

    /* renamed from: b */
    public final void m2319b(float f2) {
        float f3 = this.f4084e;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f4082c;
        float f6 = this.f4083d;
        c cVar = new c(f5, f6, f5, f6);
        cVar.f4097f = this.f4084e;
        cVar.f4098g = f4;
        this.f4087h.add(new a(cVar));
        this.f4084e = f2;
    }

    /* renamed from: c */
    public void m2320c(Matrix matrix, Path path) {
        int size = this.f4086g.size();
        for (int i = 0; i < size; i++) {
            this.f4086g.get(i).mo2324a(matrix, path);
        }
    }

    /* renamed from: d */
    public void m2321d(float f2, float f3) {
        d dVar = new d();
        dVar.f4099b = f2;
        dVar.f4100c = f3;
        this.f4086g.add(dVar);
        b bVar = new b(dVar, this.f4082c, this.f4083d);
        float fM2323b = bVar.m2323b() + 270.0f;
        float fM2323b2 = bVar.m2323b() + 270.0f;
        m2319b(fM2323b);
        this.f4087h.add(bVar);
        this.f4084e = fM2323b2;
        this.f4082c = f2;
        this.f4083d = f3;
    }

    /* renamed from: e */
    public void m2322e(float f2, float f3, float f4, float f5) {
        this.f4080a = f2;
        this.f4081b = f3;
        this.f4082c = f2;
        this.f4083d = f3;
        this.f4084e = f4;
        this.f4085f = (f4 + f5) % 360.0f;
        this.f4086g.clear();
        this.f4087h.clear();
    }
}
