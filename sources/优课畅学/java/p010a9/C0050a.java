package p010a9;

import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Map;
import p323z8.AbstractC10730a;
import p323z8.AbstractC10731b;
import p323z8.AbstractC10732c;

/* renamed from: a9.a */
/* loaded from: classes5.dex */
public class C0050a extends AbstractC10730a {

    /* renamed from: e */
    public Canvas f116e;

    /* renamed from: f */
    public int f117f;

    /* renamed from: g */
    public int f118g;

    /* renamed from: a */
    public Camera f112a = new Camera();

    /* renamed from: b */
    public Matrix f113b = new Matrix();

    /* renamed from: c */
    public final a f114c = new a();

    /* renamed from: d */
    public AbstractC0051b f115d = new C0057h();

    /* renamed from: h */
    public float f119h = 1.0f;

    /* renamed from: i */
    public int f120i = 160;

    /* renamed from: j */
    public float f121j = 1.0f;

    /* renamed from: k */
    public int f122k = 0;

    /* renamed from: l */
    public boolean f123l = true;

    /* renamed from: m */
    public int f124m = 2048;

    /* renamed from: n */
    public int f125n = 2048;

    /* renamed from: a9.a$a */
    public static class a {

        /* renamed from: a */
        public float f126a;

        /* renamed from: c */
        public final TextPaint f128c;

        /* renamed from: d */
        public final TextPaint f129d;

        /* renamed from: e */
        public Paint f130e;

        /* renamed from: f */
        public Paint f131f;

        /* renamed from: g */
        public Paint f132g;

        /* renamed from: v */
        public boolean f147v;

        /* renamed from: b */
        public final Map f127b = new HashMap(10);

        /* renamed from: h */
        public int f133h = 4;

        /* renamed from: i */
        public float f134i = 4.0f;

        /* renamed from: j */
        public float f135j = 3.5f;

        /* renamed from: k */
        public float f136k = 1.0f;

        /* renamed from: l */
        public float f137l = 1.0f;

        /* renamed from: m */
        public int f138m = 204;

        /* renamed from: n */
        public boolean f139n = false;

        /* renamed from: o */
        public boolean f140o = false;

        /* renamed from: p */
        public boolean f141p = true;

        /* renamed from: q */
        public boolean f142q = true;

        /* renamed from: r */
        public boolean f143r = false;

        /* renamed from: s */
        public boolean f144s = false;

        /* renamed from: t */
        public boolean f145t = true;

        /* renamed from: u */
        public boolean f146u = true;

        /* renamed from: w */
        public int f148w = AbstractC10731b.f21281a;

        /* renamed from: x */
        public float f149x = 1.0f;

        /* renamed from: y */
        public boolean f150y = false;

        public a() {
            TextPaint textPaint = new TextPaint();
            this.f128c = textPaint;
            textPaint.setStrokeWidth(this.f135j);
            this.f129d = new TextPaint(textPaint);
            this.f130e = new Paint();
            Paint paint = new Paint();
            this.f131f = paint;
            paint.setStrokeWidth(this.f133h);
            Paint paint2 = this.f131f;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f132g = paint3;
            paint3.setStyle(style);
            this.f132g.setStrokeWidth(4.0f);
        }

        /* renamed from: c */
        public void m150c(AbstractC10732c abstractC10732c, Paint paint, boolean z10) {
            if (this.f147v) {
                if (z10) {
                    paint.setStyle(this.f144s ? Paint.Style.FILL : Paint.Style.STROKE);
                    paint.setColor(abstractC10732c.f21302i & ViewCompat.MEASURED_SIZE_MASK);
                    paint.setAlpha(this.f144s ? (int) (this.f138m * (this.f148w / AbstractC10731b.f21281a)) : this.f148w);
                    return;
                } else {
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(abstractC10732c.f21299f & ViewCompat.MEASURED_SIZE_MASK);
                    paint.setAlpha(this.f148w);
                    return;
                }
            }
            if (z10) {
                paint.setStyle(this.f144s ? Paint.Style.FILL : Paint.Style.STROKE);
                paint.setColor(abstractC10732c.f21302i & ViewCompat.MEASURED_SIZE_MASK);
                paint.setAlpha(this.f144s ? this.f138m : AbstractC10731b.f21281a);
            } else {
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(abstractC10732c.f21299f & ViewCompat.MEASURED_SIZE_MASK);
                paint.setAlpha(AbstractC10731b.f21281a);
            }
        }

        /* renamed from: d */
        public final void m151d(AbstractC10732c abstractC10732c, Paint paint) {
            if (this.f150y) {
                Float fValueOf = (Float) this.f127b.get(Float.valueOf(abstractC10732c.f21304k));
                if (fValueOf == null || this.f126a != this.f149x) {
                    float f10 = this.f149x;
                    this.f126a = f10;
                    fValueOf = Float.valueOf(abstractC10732c.f21304k * f10);
                    this.f127b.put(Float.valueOf(abstractC10732c.f21304k), fValueOf);
                }
                paint.setTextSize(fValueOf.floatValue());
            }
        }

        /* renamed from: e */
        public void m152e(boolean z10) {
            this.f142q = this.f141p;
            this.f140o = this.f139n;
            this.f144s = this.f143r;
            this.f146u = z10 && this.f145t;
        }

        /* renamed from: f */
        public Paint m153f(AbstractC10732c abstractC10732c) {
            this.f132g.setColor(abstractC10732c.f21305l);
            return this.f132g;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.text.TextPaint m154g(p323z8.AbstractC10732c r4, boolean r5) {
            /*
                r3 = this;
                if (r5 == 0) goto L5
                android.text.TextPaint r5 = r3.f128c
                goto Lc
            L5:
                android.text.TextPaint r5 = r3.f129d
                android.text.TextPaint r0 = r3.f128c
                r5.set(r0)
            Lc:
                float r0 = r4.f21304k
                r5.setTextSize(r0)
                r3.m151d(r4, r5)
                boolean r0 = r3.f140o
                if (r0 == 0) goto L28
                float r0 = r3.f134i
                r1 = 0
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 <= 0) goto L28
                int r4 = r4.f21302i
                if (r4 != 0) goto L24
                goto L28
            L24:
                r5.setShadowLayer(r0, r1, r1, r4)
                goto L2b
            L28:
                r5.clearShadowLayer()
            L2b:
                boolean r4 = r3.f146u
                r5.setAntiAlias(r4)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p010a9.C0050a.a.m154g(z8.c, boolean):android.text.TextPaint");
        }

        /* renamed from: h */
        public float m155h() {
            boolean z10 = this.f140o;
            if (z10 && this.f142q) {
                return Math.max(this.f134i, this.f135j);
            }
            if (z10) {
                return this.f134i;
            }
            if (this.f142q) {
                return this.f135j;
            }
            return 0.0f;
        }

        /* renamed from: i */
        public Paint m156i(AbstractC10732c abstractC10732c) {
            this.f131f.setColor(abstractC10732c.f21303j);
            return this.f131f;
        }

        /* renamed from: j */
        public boolean m157j(AbstractC10732c abstractC10732c) {
            return (this.f142q || this.f144s) && this.f135j > 0.0f && abstractC10732c.f21302i != 0;
        }
    }

    /* renamed from: u */
    public static final int m118u(Canvas canvas) {
        return canvas.getMaximumBitmapHeight();
    }

    /* renamed from: v */
    public static final int m119v(Canvas canvas) {
        return canvas.getMaximumBitmapWidth();
    }

    /* renamed from: A */
    public final int m120A(AbstractC10732c abstractC10732c, Canvas canvas, float f10, float f11) {
        this.f112a.save();
        this.f112a.rotateY(-abstractC10732c.f21301h);
        this.f112a.rotateZ(-abstractC10732c.f21300g);
        this.f112a.getMatrix(this.f113b);
        this.f113b.preTranslate(-f10, -f11);
        this.f113b.postTranslate(f10, f11);
        this.f112a.restore();
        int iSave = canvas.save();
        canvas.concat(this.f113b);
        return iSave;
    }

    /* renamed from: B */
    public final void m121B(AbstractC10732c abstractC10732c, float f10, float f11) {
        int i10 = abstractC10732c.f21306m;
        float f12 = f10 + (i10 * 2);
        float f13 = f11 + (i10 * 2);
        if (abstractC10732c.f21305l != 0) {
            float f14 = 8;
            f12 += f14;
            f13 += f14;
        }
        abstractC10732c.f21308o = f12 + m145x();
        abstractC10732c.f21309p = f13;
    }

    @Override // p323z8.AbstractC10730a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo140q(Canvas canvas) {
        m123D(canvas);
    }

    /* renamed from: D */
    public final void m123D(Canvas canvas) {
        this.f116e = canvas;
        if (canvas != null) {
            this.f117f = canvas.getWidth();
            this.f118g = canvas.getHeight();
            if (this.f123l) {
                this.f124m = m119v(canvas);
                this.f125n = m118u(canvas);
            }
        }
    }

    @Override // p323z8.InterfaceC10742m
    /* renamed from: a */
    public void mo124a(float f10) {
        float fMax = Math.max(f10, getWidth() / 682.0f) * 25.0f;
        this.f122k = (int) fMax;
        if (f10 > 1.0f) {
            this.f122k = (int) (fMax * f10);
        }
    }

    @Override // p323z8.InterfaceC10742m
    /* renamed from: b */
    public void mo125b(AbstractC10732c abstractC10732c, boolean z10) {
        TextPaint textPaintM144w = m144w(abstractC10732c, z10);
        if (this.f114c.f142q) {
            this.f114c.m150c(abstractC10732c, textPaintM144w, true);
        }
        m141r(abstractC10732c, textPaintM144w, z10);
        if (this.f114c.f142q) {
            this.f114c.m150c(abstractC10732c, textPaintM144w, false);
        }
    }

    @Override // p323z8.InterfaceC10742m
    /* renamed from: c */
    public int mo126c() {
        return this.f122k;
    }

    @Override // p323z8.InterfaceC10742m
    /* renamed from: d */
    public void mo127d(float f10, int i10, float f11) {
        this.f119h = f10;
        this.f120i = i10;
        this.f121j = f11;
    }

    @Override // p323z8.InterfaceC10742m
    /* renamed from: e */
    public int mo128e(AbstractC10732c abstractC10732c) {
        boolean z10;
        C0050a c0050a;
        boolean z11;
        float fMo20053l = abstractC10732c.mo20053l();
        float fMo20048g = abstractC10732c.mo20048g();
        if (this.f116e == null) {
            return 0;
        }
        int i10 = 1;
        Paint paint = null;
        if (abstractC10732c.mo20054m() != 7) {
            z10 = false;
        } else {
            if (abstractC10732c.m20044c() == AbstractC10731b.f21282b) {
                return 0;
            }
            if (abstractC10732c.f21300g == 0.0f && abstractC10732c.f21301h == 0.0f) {
                z11 = false;
            } else {
                m120A(abstractC10732c, this.f116e, fMo20048g, fMo20053l);
                z11 = true;
            }
            if (abstractC10732c.m20044c() != AbstractC10731b.f21281a) {
                paint = this.f114c.f130e;
                paint.setAlpha(abstractC10732c.m20044c());
            }
            z10 = z11;
        }
        if (paint != null && paint.getAlpha() == AbstractC10731b.f21282b) {
            return 0;
        }
        if (this.f115d.m158a(abstractC10732c, this.f116e, fMo20048g, fMo20053l, paint, this.f114c.f128c)) {
            c0050a = this;
        } else {
            if (paint != null) {
                this.f114c.f128c.setAlpha(paint.getAlpha());
            } else {
                m146y(this.f114c.f128c);
            }
            c0050a = this;
            c0050a.mo137n(abstractC10732c, this.f116e, fMo20048g, fMo20053l, false);
            i10 = 2;
        }
        if (z10) {
            m147z(c0050a.f116e);
        }
        return i10;
    }

    @Override // p323z8.InterfaceC10742m
    /* renamed from: f */
    public int mo129f() {
        return this.f120i;
    }

    @Override // p323z8.InterfaceC10742m
    /* renamed from: g */
    public float mo130g() {
        return this.f121j;
    }

    @Override // p323z8.InterfaceC10742m
    public float getDensity() {
        return this.f119h;
    }

    @Override // p323z8.InterfaceC10742m
    public int getHeight() {
        return this.f118g;
    }

    @Override // p323z8.InterfaceC10742m
    public int getWidth() {
        return this.f117f;
    }

    @Override // p323z8.InterfaceC10742m
    /* renamed from: h */
    public int mo131h() {
        return this.f124m;
    }

    @Override // p323z8.InterfaceC10742m
    /* renamed from: i */
    public void mo132i(int i10, int i11) {
        this.f117f = i10;
        this.f118g = i11;
    }

    @Override // p323z8.InterfaceC10742m
    public boolean isHardwareAccelerated() {
        return this.f123l;
    }

    @Override // p323z8.InterfaceC10742m
    /* renamed from: j */
    public void mo133j(AbstractC10732c abstractC10732c) {
        AbstractC0051b abstractC0051b = this.f115d;
        if (abstractC0051b != null) {
            abstractC0051b.m162e(abstractC10732c);
        }
    }

    @Override // p323z8.InterfaceC10742m
    /* renamed from: k */
    public int mo134k() {
        return this.f125n;
    }

    @Override // p323z8.InterfaceC10742m
    /* renamed from: l */
    public void mo135l(AbstractC10732c abstractC10732c, boolean z10) {
        AbstractC0051b abstractC0051b = this.f115d;
        if (abstractC0051b != null) {
            abstractC0051b.m161d(abstractC10732c, z10);
        }
    }

    @Override // p323z8.InterfaceC10742m
    /* renamed from: m */
    public void mo136m(boolean z10) {
        this.f123l = z10;
    }

    @Override // p323z8.AbstractC10730a
    /* renamed from: o */
    public AbstractC0051b mo138o() {
        return this.f115d;
    }

    /* renamed from: r */
    public final void m141r(AbstractC10732c abstractC10732c, TextPaint textPaint, boolean z10) {
        this.f115d.mo160c(abstractC10732c, textPaint, z10);
        m121B(abstractC10732c, abstractC10732c.f21308o, abstractC10732c.f21309p);
    }

    @Override // p323z8.AbstractC10730a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public synchronized void mo137n(AbstractC10732c abstractC10732c, Canvas canvas, float f10, float f11, boolean z10) {
        AbstractC0051b abstractC0051b = this.f115d;
        if (abstractC0051b != null) {
            abstractC0051b.mo159b(abstractC10732c, canvas, f10, f11, z10, this.f114c);
        }
    }

    @Override // p323z8.AbstractC10730a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Canvas mo139p() {
        return this.f116e;
    }

    /* renamed from: w */
    public final synchronized TextPaint m144w(AbstractC10732c abstractC10732c, boolean z10) {
        return this.f114c.m154g(abstractC10732c, z10);
    }

    /* renamed from: x */
    public float m145x() {
        return this.f114c.m155h();
    }

    /* renamed from: y */
    public final void m146y(Paint paint) {
        int alpha = paint.getAlpha();
        int i10 = AbstractC10731b.f21281a;
        if (alpha != i10) {
            paint.setAlpha(i10);
        }
    }

    /* renamed from: z */
    public final void m147z(Canvas canvas) {
        canvas.restore();
    }
}
