package com.canhub.cropper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.canhub.cropper.CropImageView;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;

/* loaded from: classes3.dex */
public final class CropOverlayView extends View {

    /* renamed from: N */
    public static final C5478a f3529N = new C5478a(null);

    /* renamed from: A */
    public int f3530A;

    /* renamed from: B */
    public int f3531B;

    /* renamed from: C */
    public float f3532C;

    /* renamed from: D */
    public CropImageView.Guidelines f3533D;

    /* renamed from: E */
    public CropImageView.CropShape f3534E;

    /* renamed from: F */
    public CropImageView.CropCornerShape f3535F;

    /* renamed from: G */
    public boolean f3536G;

    /* renamed from: H */
    public String f3537H;

    /* renamed from: I */
    public float f3538I;

    /* renamed from: J */
    public int f3539J;

    /* renamed from: K */
    public final Rect f3540K;

    /* renamed from: L */
    public boolean f3541L;

    /* renamed from: M */
    public final float f3542M;

    /* renamed from: a */
    public float f3543a;

    /* renamed from: b */
    public Integer f3544b;

    /* renamed from: c */
    public CropImageOptions f3545c;

    /* renamed from: d */
    public ScaleGestureDetector f3546d;

    /* renamed from: e */
    public boolean f3547e;

    /* renamed from: f */
    public boolean f3548f;

    /* renamed from: g */
    public final C5487d f3549g;

    /* renamed from: h */
    public InterfaceC5479b f3550h;

    /* renamed from: i */
    public final RectF f3551i;

    /* renamed from: j */
    public Paint f3552j;

    /* renamed from: k */
    public Paint f3553k;

    /* renamed from: l */
    public Paint f3554l;

    /* renamed from: m */
    public Paint f3555m;

    /* renamed from: n */
    public Paint f3556n;

    /* renamed from: o */
    public final Path f3557o;

    /* renamed from: p */
    public final float[] f3558p;

    /* renamed from: q */
    public final RectF f3559q;

    /* renamed from: r */
    public int f3560r;

    /* renamed from: s */
    public int f3561s;

    /* renamed from: t */
    public float f3562t;

    /* renamed from: u */
    public float f3563u;

    /* renamed from: v */
    public float f3564v;

    /* renamed from: w */
    public float f3565w;

    /* renamed from: x */
    public float f3566x;

    /* renamed from: y */
    public CropWindowMoveHandler f3567y;

    /* renamed from: z */
    public boolean f3568z;

    /* renamed from: com.canhub.cropper.CropOverlayView$a */
    public static final class C5478a {
        public /* synthetic */ C5478a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final Paint m3333a(int i10) {
            Paint paint = new Paint();
            paint.setColor(i10);
            return paint;
        }

        /* renamed from: b */
        public final Paint m3334b(float f10, int i10) {
            if (f10 <= 0.0f) {
                return null;
            }
            Paint paint = new Paint();
            paint.setColor(i10);
            paint.setStrokeWidth(f10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            return paint;
        }

        /* renamed from: c */
        public final Paint m3335c(int i10) {
            Paint paint = new Paint();
            paint.setColor(i10);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            return paint;
        }

        /* renamed from: d */
        public final Paint m3336d(CropImageOptions options) {
            AbstractC9133u.m16133g(options, "options");
            Paint paint = new Paint();
            paint.setStrokeWidth(1.0f);
            paint.setTextSize(options.f3432o0);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setColor(options.f3434p0);
            return paint;
        }

        public C5478a() {
        }
    }

    /* renamed from: com.canhub.cropper.CropOverlayView$b */
    public interface InterfaceC5479b {
        /* renamed from: a */
        void mo3277a(boolean z10);
    }

    /* renamed from: com.canhub.cropper.CropOverlayView$c */
    public final class C5480c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C5480c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            AbstractC9133u.m16133g(detector, "detector");
            RectF rectFM3415i = CropOverlayView.this.f3549g.m3415i();
            float focusX = detector.getFocusX();
            float focusY = detector.getFocusY();
            float f10 = 2;
            float currentSpanY = detector.getCurrentSpanY() / f10;
            float currentSpanX = detector.getCurrentSpanX() / f10;
            float f11 = focusY - currentSpanY;
            float f12 = focusX - currentSpanX;
            float f13 = focusX + currentSpanX;
            float f14 = focusY + currentSpanY;
            if (f12 >= f13 || f11 > f14 || f12 < 0.0f || f13 > CropOverlayView.this.f3549g.m3410d() || f11 < 0.0f || f14 > CropOverlayView.this.f3549g.m3409c()) {
                return true;
            }
            rectFM3415i.set(f12, f11, f13, f14);
            CropOverlayView.this.f3549g.m3429w(rectFM3415i);
            CropOverlayView.this.invalidate();
            return true;
        }
    }

    /* renamed from: com.canhub.cropper.CropOverlayView$d */
    public /* synthetic */ class C5481d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3570a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3571b;

        static {
            int[] iArr = new int[CropImageView.CropShape.values().length];
            try {
                iArr[CropImageView.CropShape.f3495a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropImageView.CropShape.f3497c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropImageView.CropShape.f3498d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropImageView.CropShape.f3496b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3570a = iArr;
            int[] iArr2 = new int[CropImageView.CropCornerShape.values().length];
            try {
                iArr2[CropImageView.CropCornerShape.f3492b.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CropImageView.CropCornerShape.f3491a.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f3571b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        this.f3548f = true;
        this.f3549g = new C5487d();
        this.f3551i = new RectF();
        this.f3557o = new Path();
        this.f3558p = new float[8];
        this.f3559q = new RectF();
        this.f3532C = this.f3530A / this.f3531B;
        this.f3537H = "";
        this.f3538I = 20.0f;
        this.f3539J = -1;
        this.f3540K = new Rect();
        this.f3542M = TypedValue.applyDimension(1, 200.0f, Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: b */
    public final boolean m3309b(RectF rectF) {
        float f10;
        float f11;
        C5484a c5484a = C5484a.f3592a;
        float fM3355A = c5484a.m3355A(this.f3558p);
        float fM3357C = c5484a.m3357C(this.f3558p);
        float fM3356B = c5484a.m3356B(this.f3558p);
        float fM3387v = c5484a.m3387v(this.f3558p);
        if (!m3323p()) {
            this.f3559q.set(fM3355A, fM3357C, fM3356B, fM3387v);
            return false;
        }
        float[] fArr = this.f3558p;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        if (f17 < f13) {
            float f18 = fArr[3];
            if (f13 < f18) {
                f14 = fArr[2];
                f12 = f14;
                f13 = f15;
                f11 = f16;
                f15 = f18;
                f10 = f17;
            } else {
                f12 = fArr[2];
                f11 = f14;
                f14 = f12;
                f15 = f13;
                f13 = f18;
                f10 = f15;
            }
        } else {
            f10 = fArr[3];
            if (f13 > f10) {
                f11 = fArr[2];
                f14 = f16;
                f15 = f17;
            } else {
                f11 = f12;
                f10 = f13;
                f12 = f16;
                f13 = f17;
            }
        }
        float f19 = (f13 - f10) / (f12 - f11);
        float f20 = (-1.0f) / f19;
        float f21 = f10 - (f19 * f11);
        float f22 = f10 - (f11 * f20);
        float f23 = f15 - (f19 * f14);
        float f24 = f15 - (f14 * f20);
        float fCenterY = rectF.centerY() - rectF.top;
        float fCenterX = rectF.centerX();
        float f25 = rectF.left;
        float f26 = fCenterY / (fCenterX - f25);
        float f27 = -f26;
        float f28 = rectF.top;
        float f29 = f28 - (f25 * f26);
        float f30 = rectF.right;
        float f31 = f28 - (f27 * f30);
        float f32 = f19 - f26;
        float f33 = (f29 - f21) / f32;
        float fMax = Math.max(fM3355A, f33 < f30 ? f33 : fM3355A);
        float f34 = (f29 - f22) / (f20 - f26);
        if (f34 >= rectF.right) {
            f34 = fMax;
        }
        float fMax2 = Math.max(fMax, f34);
        float f35 = f20 - f27;
        float f36 = (f31 - f24) / f35;
        float fMax3 = Math.max(fMax2, f36 < rectF.right ? f36 : fMax2);
        float f37 = (f31 - f22) / f35;
        if (f37 <= rectF.left) {
            f37 = fM3356B;
        }
        float fMin = Math.min(fM3356B, f37);
        float f38 = (f31 - f23) / (f19 - f27);
        if (f38 <= rectF.left) {
            f38 = fMin;
        }
        float fMin2 = Math.min(fMin, f38);
        float f39 = (f29 - f23) / f32;
        if (f39 <= rectF.left) {
            f39 = fMin2;
        }
        float fMin3 = Math.min(fMin2, f39);
        float fMax4 = Math.max(fM3357C, Math.max((f19 * fMax3) + f21, (f20 * fMin3) + f22));
        float fMin4 = Math.min(fM3387v, Math.min((f20 * fMax3) + f24, (f19 * fMin3) + f23));
        RectF rectF2 = this.f3559q;
        rectF2.left = fMax3;
        rectF2.top = fMax4;
        rectF2.right = fMin3;
        rectF2.bottom = fMin4;
        return true;
    }

    /* renamed from: c */
    public final void m3310c(Canvas canvas) {
        RectF rectFM3415i = this.f3549g.m3415i();
        C5484a c5484a = C5484a.f3592a;
        float fMax = Math.max(c5484a.m3355A(this.f3558p), 0.0f);
        float fMax2 = Math.max(c5484a.m3357C(this.f3558p), 0.0f);
        float fMin = Math.min(c5484a.m3356B(this.f3558p), getWidth());
        float fMin2 = Math.min(c5484a.m3387v(this.f3558p), getHeight());
        CropImageView.CropShape cropShape = this.f3534E;
        int i10 = cropShape == null ? -1 : C5481d.f3570a[cropShape.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            this.f3557o.reset();
            this.f3551i.set(rectFM3415i.left, rectFM3415i.top, rectFM3415i.right, rectFM3415i.bottom);
            this.f3557o.addOval(this.f3551i, Path.Direction.CW);
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.f3557o);
            } else {
                canvas.clipPath(this.f3557o, Region.Op.XOR);
            }
            Paint paint = this.f3555m;
            AbstractC9133u.m16130d(paint);
            canvas.drawRect(fMax, fMax2, fMin, fMin2, paint);
            canvas.restore();
            return;
        }
        if (!m3323p()) {
            float f10 = rectFM3415i.top;
            Paint paint2 = this.f3555m;
            AbstractC9133u.m16130d(paint2);
            canvas.drawRect(fMax, fMax2, fMin, f10, paint2);
            float f11 = rectFM3415i.bottom;
            Paint paint3 = this.f3555m;
            AbstractC9133u.m16130d(paint3);
            canvas.drawRect(fMax, f11, fMin, fMin2, paint3);
            float f12 = rectFM3415i.top;
            float f13 = rectFM3415i.left;
            float f14 = rectFM3415i.bottom;
            Paint paint4 = this.f3555m;
            AbstractC9133u.m16130d(paint4);
            canvas.drawRect(fMax, f12, f13, f14, paint4);
            float f15 = rectFM3415i.right;
            float f16 = rectFM3415i.top;
            float f17 = rectFM3415i.bottom;
            Paint paint5 = this.f3555m;
            AbstractC9133u.m16130d(paint5);
            canvas.drawRect(f15, f16, fMin, f17, paint5);
            return;
        }
        this.f3557o.reset();
        Path path = this.f3557o;
        float[] fArr = this.f3558p;
        path.moveTo(fArr[0], fArr[1]);
        Path path2 = this.f3557o;
        float[] fArr2 = this.f3558p;
        path2.lineTo(fArr2[2], fArr2[3]);
        Path path3 = this.f3557o;
        float[] fArr3 = this.f3558p;
        path3.lineTo(fArr3[4], fArr3[5]);
        Path path4 = this.f3557o;
        float[] fArr4 = this.f3558p;
        path4.lineTo(fArr4[6], fArr4[7]);
        this.f3557o.close();
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(this.f3557o);
        } else {
            canvas.clipPath(this.f3557o, Region.Op.INTERSECT);
        }
        Paint paint6 = this.f3555m;
        AbstractC9133u.m16130d(paint6);
        canvas.drawRect(fMax, fMax2, fMin, fMin2, paint6);
        canvas.restore();
    }

    /* renamed from: d */
    public final void m3311d(Canvas canvas) {
        Paint paint = this.f3552j;
        if (paint != null) {
            AbstractC9133u.m16130d(paint);
            float strokeWidth = paint.getStrokeWidth();
            RectF rectFM3415i = this.f3549g.m3415i();
            float f10 = strokeWidth / 2;
            rectFM3415i.inset(f10, f10);
            CropImageView.CropShape cropShape = this.f3534E;
            int i10 = cropShape == null ? -1 : C5481d.f3570a[cropShape.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                Paint paint2 = this.f3552j;
                AbstractC9133u.m16130d(paint2);
                canvas.drawRect(rectFM3415i, paint2);
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("Unrecognized crop shape");
                }
                Paint paint3 = this.f3552j;
                AbstractC9133u.m16130d(paint3);
                canvas.drawOval(rectFM3415i, paint3);
            }
        }
    }

    /* renamed from: e */
    public final void m3312e(Canvas canvas, RectF rectF, float f10, float f11) {
        float f12 = rectF.left - f10;
        float f13 = rectF.top - f10;
        Paint paint = this.f3553k;
        AbstractC9133u.m16130d(paint);
        canvas.drawCircle(f12, f13, f11, paint);
        float f14 = rectF.right + f10;
        float f15 = rectF.top - f10;
        Paint paint2 = this.f3553k;
        AbstractC9133u.m16130d(paint2);
        canvas.drawCircle(f14, f15, f11, paint2);
        float f16 = rectF.left - f10;
        float f17 = rectF.bottom + f10;
        Paint paint3 = this.f3553k;
        AbstractC9133u.m16130d(paint3);
        canvas.drawCircle(f16, f17, f11, paint3);
        float f18 = rectF.right + f10;
        float f19 = rectF.bottom + f10;
        Paint paint4 = this.f3553k;
        AbstractC9133u.m16130d(paint4);
        canvas.drawCircle(f18, f19, f11, paint4);
    }

    /* renamed from: f */
    public final void m3313f(Canvas canvas, RectF rectF, float f10, float f11) {
        CropImageView.CropShape cropShape = this.f3534E;
        int i10 = cropShape == null ? -1 : C5481d.f3570a[cropShape.ordinal()];
        if (i10 == 1) {
            m3314g(canvas, rectF, f10, f11, this.f3543a);
            return;
        }
        if (i10 == 2) {
            float fCenterX = rectF.centerX() - this.f3563u;
            float f12 = rectF.top - f10;
            float fCenterX2 = rectF.centerX() + this.f3563u;
            float f13 = rectF.top - f10;
            Paint paint = this.f3553k;
            AbstractC9133u.m16130d(paint);
            canvas.drawLine(fCenterX, f12, fCenterX2, f13, paint);
            float fCenterX3 = rectF.centerX() - this.f3563u;
            float f14 = rectF.bottom + f10;
            float fCenterX4 = rectF.centerX() + this.f3563u;
            float f15 = rectF.bottom + f10;
            Paint paint2 = this.f3553k;
            AbstractC9133u.m16130d(paint2);
            canvas.drawLine(fCenterX3, f14, fCenterX4, f15, paint2);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            m3318k(canvas, rectF, f10, f11);
            return;
        }
        float f16 = rectF.left - f10;
        float fCenterY = rectF.centerY() - this.f3563u;
        float f17 = rectF.left - f10;
        float fCenterY2 = rectF.centerY() + this.f3563u;
        Paint paint3 = this.f3553k;
        AbstractC9133u.m16130d(paint3);
        canvas.drawLine(f16, fCenterY, f17, fCenterY2, paint3);
        float f18 = rectF.right + f10;
        float fCenterY3 = rectF.centerY() - this.f3563u;
        float f19 = rectF.right + f10;
        float fCenterY4 = rectF.centerY() + this.f3563u;
        Paint paint4 = this.f3553k;
        AbstractC9133u.m16130d(paint4);
        canvas.drawLine(f18, fCenterY3, f19, fCenterY4, paint4);
    }

    /* renamed from: g */
    public final void m3314g(Canvas canvas, RectF rectF, float f10, float f11, float f12) {
        CropImageView.CropCornerShape cropCornerShape = this.f3535F;
        int i10 = cropCornerShape == null ? -1 : C5481d.f3571b[cropCornerShape.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                m3312e(canvas, rectF, f10, f12);
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                m3318k(canvas, rectF, f10, f11);
            }
        }
    }

    public final int getAspectRatioX() {
        return this.f3530A;
    }

    public final int getAspectRatioY() {
        return this.f3531B;
    }

    public final CropImageView.CropCornerShape getCornerShape() {
        return this.f3535F;
    }

    public final CropImageView.CropShape getCropShape() {
        return this.f3534E;
    }

    public final RectF getCropWindowRect() {
        return this.f3549g.m3415i();
    }

    public final CropImageView.Guidelines getGuidelines() {
        return this.f3533D;
    }

    public final Rect getInitialCropWindowRect() {
        return this.f3540K;
    }

    /* renamed from: h */
    public final void m3315h(Canvas canvas) {
        float strokeWidth;
        if (this.f3553k != null) {
            Paint paint = this.f3552j;
            if (paint != null) {
                AbstractC9133u.m16130d(paint);
                strokeWidth = paint.getStrokeWidth();
            } else {
                strokeWidth = 0.0f;
            }
            Paint paint2 = this.f3553k;
            AbstractC9133u.m16130d(paint2);
            float strokeWidth2 = paint2.getStrokeWidth();
            float f10 = 2;
            float f11 = (strokeWidth2 - strokeWidth) / f10;
            float f12 = strokeWidth2 / f10;
            float f13 = f12 + f11;
            CropImageView.CropShape cropShape = this.f3534E;
            int i10 = cropShape == null ? -1 : C5481d.f3570a[cropShape.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                f12 += this.f3562t;
            } else if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            RectF rectFM3415i = this.f3549g.m3415i();
            rectFM3415i.inset(f12, f12);
            m3313f(canvas, rectFM3415i, f11, f13);
            if (this.f3535F == CropImageView.CropCornerShape.f3492b) {
                Integer num = this.f3544b;
                this.f3553k = num != null ? f3529N.m3335c(num.intValue()) : null;
                m3313f(canvas, rectFM3415i, f11, f13);
            }
        }
    }

    /* renamed from: i */
    public final void m3316i(Canvas canvas) {
        if (this.f3536G) {
            RectF rectFM3415i = this.f3549g.m3415i();
            float f10 = (rectFM3415i.left + rectFM3415i.right) / 2;
            float f11 = rectFM3415i.top - 50;
            Paint paint = this.f3556n;
            if (paint != null) {
                paint.setTextSize(this.f3538I);
                paint.setColor(this.f3539J);
            }
            String str = this.f3537H;
            Paint paint2 = this.f3556n;
            AbstractC9133u.m16130d(paint2);
            canvas.drawText(str, f10, f11, paint2);
            canvas.save();
        }
    }

    /* renamed from: j */
    public final void m3317j(Canvas canvas) {
        float strokeWidth;
        if (this.f3554l != null) {
            Paint paint = this.f3552j;
            if (paint != null) {
                AbstractC9133u.m16130d(paint);
                strokeWidth = paint.getStrokeWidth();
            } else {
                strokeWidth = 0.0f;
            }
            RectF rectFM3415i = this.f3549g.m3415i();
            rectFM3415i.inset(strokeWidth, strokeWidth);
            float f10 = 3;
            float fWidth = rectFM3415i.width() / f10;
            float fHeight = rectFM3415i.height() / f10;
            CropImageView.CropShape cropShape = this.f3534E;
            int i10 = cropShape == null ? -1 : C5481d.f3570a[cropShape.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                float f11 = rectFM3415i.left + fWidth;
                float f12 = rectFM3415i.right - fWidth;
                float f13 = rectFM3415i.top;
                float f14 = rectFM3415i.bottom;
                Paint paint2 = this.f3554l;
                AbstractC9133u.m16130d(paint2);
                canvas.drawLine(f11, f13, f11, f14, paint2);
                float f15 = rectFM3415i.top;
                float f16 = rectFM3415i.bottom;
                Paint paint3 = this.f3554l;
                AbstractC9133u.m16130d(paint3);
                canvas.drawLine(f12, f15, f12, f16, paint3);
                float f17 = rectFM3415i.top + fHeight;
                float f18 = rectFM3415i.bottom - fHeight;
                float f19 = rectFM3415i.left;
                float f20 = rectFM3415i.right;
                Paint paint4 = this.f3554l;
                AbstractC9133u.m16130d(paint4);
                canvas.drawLine(f19, f17, f20, f17, paint4);
                float f21 = rectFM3415i.left;
                float f22 = rectFM3415i.right;
                Paint paint5 = this.f3554l;
                AbstractC9133u.m16130d(paint5);
                canvas.drawLine(f21, f18, f22, f18, paint5);
                return;
            }
            if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            float f23 = 2;
            float fWidth2 = (rectFM3415i.width() / f23) - strokeWidth;
            float fHeight2 = (rectFM3415i.height() / f23) - strokeWidth;
            float f24 = rectFM3415i.left + fWidth;
            float f25 = rectFM3415i.right - fWidth;
            float fSin = (float) (fHeight2 * Math.sin(Math.acos((fWidth2 - fWidth) / fWidth2)));
            float f26 = (rectFM3415i.top + fHeight2) - fSin;
            float f27 = (rectFM3415i.bottom - fHeight2) + fSin;
            Paint paint6 = this.f3554l;
            AbstractC9133u.m16130d(paint6);
            canvas.drawLine(f24, f26, f24, f27, paint6);
            float f28 = (rectFM3415i.top + fHeight2) - fSin;
            float f29 = (rectFM3415i.bottom - fHeight2) + fSin;
            Paint paint7 = this.f3554l;
            AbstractC9133u.m16130d(paint7);
            canvas.drawLine(f25, f28, f25, f29, paint7);
            float f30 = rectFM3415i.top + fHeight;
            float f31 = rectFM3415i.bottom - fHeight;
            float fCos = (float) (fWidth2 * Math.cos(Math.asin((fHeight2 - fHeight) / fHeight2)));
            float f32 = (rectFM3415i.left + fWidth2) - fCos;
            float f33 = (rectFM3415i.right - fWidth2) + fCos;
            Paint paint8 = this.f3554l;
            AbstractC9133u.m16130d(paint8);
            canvas.drawLine(f32, f30, f33, f30, paint8);
            float f34 = (rectFM3415i.left + fWidth2) - fCos;
            float f35 = (rectFM3415i.right - fWidth2) + fCos;
            Paint paint9 = this.f3554l;
            AbstractC9133u.m16130d(paint9);
            canvas.drawLine(f34, f31, f35, f31, paint9);
        }
    }

    /* renamed from: k */
    public final void m3318k(Canvas canvas, RectF rectF, float f10, float f11) {
        float f12 = rectF.left;
        float f13 = rectF.top;
        float f14 = f13 + this.f3563u;
        Paint paint = this.f3553k;
        AbstractC9133u.m16130d(paint);
        canvas.drawLine(f12 - f10, f13 - f11, f12 - f10, f14, paint);
        float f15 = rectF.left;
        float f16 = rectF.top;
        Paint paint2 = this.f3553k;
        AbstractC9133u.m16130d(paint2);
        canvas.drawLine(f15 - f11, f16 - f10, f15 + this.f3563u, f16 - f10, paint2);
        float f17 = rectF.right;
        float f18 = rectF.top;
        float f19 = f18 + this.f3563u;
        Paint paint3 = this.f3553k;
        AbstractC9133u.m16130d(paint3);
        canvas.drawLine(f17 + f10, f18 - f11, f17 + f10, f19, paint3);
        float f20 = rectF.right;
        float f21 = rectF.top;
        Paint paint4 = this.f3553k;
        AbstractC9133u.m16130d(paint4);
        canvas.drawLine(f20 + f11, f21 - f10, f20 - this.f3563u, f21 - f10, paint4);
        float f22 = rectF.left;
        float f23 = rectF.bottom;
        float f24 = f23 - this.f3563u;
        Paint paint5 = this.f3553k;
        AbstractC9133u.m16130d(paint5);
        canvas.drawLine(f22 - f10, f23 + f11, f22 - f10, f24, paint5);
        float f25 = rectF.left;
        float f26 = rectF.bottom;
        Paint paint6 = this.f3553k;
        AbstractC9133u.m16130d(paint6);
        canvas.drawLine(f25 - f11, f26 + f10, f25 + this.f3563u, f26 + f10, paint6);
        float f27 = rectF.right;
        float f28 = rectF.bottom;
        float f29 = f28 - this.f3563u;
        Paint paint7 = this.f3553k;
        AbstractC9133u.m16130d(paint7);
        canvas.drawLine(f27 + f10, f28 + f11, f27 + f10, f29, paint7);
        float f30 = rectF.right;
        float f31 = rectF.bottom;
        Paint paint8 = this.f3553k;
        AbstractC9133u.m16130d(paint8);
        canvas.drawLine(f30 + f11, f31 + f10, f30 - this.f3563u, f31 + f10, paint8);
    }

    /* renamed from: l */
    public final void m3319l(RectF rectF) {
        if (rectF.width() < this.f3549g.m3412f()) {
            float fM3412f = (this.f3549g.m3412f() - rectF.width()) / 2;
            rectF.left -= fM3412f;
            rectF.right += fM3412f;
        }
        if (rectF.height() < this.f3549g.m3411e()) {
            float fM3411e = (this.f3549g.m3411e() - rectF.height()) / 2;
            rectF.top -= fM3411e;
            rectF.bottom += fM3411e;
        }
        if (rectF.width() > this.f3549g.m3410d()) {
            float fWidth = (rectF.width() - this.f3549g.m3410d()) / 2;
            rectF.left += fWidth;
            rectF.right -= fWidth;
        }
        if (rectF.height() > this.f3549g.m3409c()) {
            float fHeight = (rectF.height() - this.f3549g.m3409c()) / 2;
            rectF.top += fHeight;
            rectF.bottom -= fHeight;
        }
        m3309b(rectF);
        if (this.f3559q.width() > 0.0f && this.f3559q.height() > 0.0f) {
            float fMax = Math.max(this.f3559q.left, 0.0f);
            float fMax2 = Math.max(this.f3559q.top, 0.0f);
            float fMin = Math.min(this.f3559q.right, getWidth());
            float fMin2 = Math.min(this.f3559q.bottom, getHeight());
            if (rectF.left < fMax) {
                rectF.left = fMax;
            }
            if (rectF.top < fMax2) {
                rectF.top = fMax2;
            }
            if (rectF.right > fMin) {
                rectF.right = fMin;
            }
            if (rectF.bottom > fMin2) {
                rectF.bottom = fMin2;
            }
        }
        if (!this.f3568z || Math.abs(rectF.width() - (rectF.height() * this.f3532C)) <= 0.1d) {
            return;
        }
        if (rectF.width() > rectF.height() * this.f3532C) {
            float fAbs = Math.abs((rectF.height() * this.f3532C) - rectF.width()) / 2;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        } else {
            float fAbs2 = Math.abs((rectF.width() / this.f3532C) - rectF.height()) / 2;
            rectF.top += fAbs2;
            rectF.bottom -= fAbs2;
        }
    }

    /* renamed from: m */
    public final void m3320m() {
        RectF cropWindowRect = getCropWindowRect();
        m3319l(cropWindowRect);
        this.f3549g.m3429w(cropWindowRect);
    }

    /* renamed from: n */
    public final void m3321n() {
        C5484a c5484a = C5484a.f3592a;
        float fMax = Math.max(c5484a.m3355A(this.f3558p), 0.0f);
        float fMax2 = Math.max(c5484a.m3357C(this.f3558p), 0.0f);
        float fMin = Math.min(c5484a.m3356B(this.f3558p), getWidth());
        float fMin2 = Math.min(c5484a.m3387v(this.f3558p), getHeight());
        if (fMin <= fMax || fMin2 <= fMax2) {
            return;
        }
        RectF rectF = new RectF();
        this.f3541L = true;
        float f10 = this.f3564v;
        float f11 = fMin - fMax;
        float f12 = f10 * f11;
        float f13 = fMin2 - fMax2;
        float f14 = f10 * f13;
        if (this.f3540K.width() > 0 && this.f3540K.height() > 0) {
            rectF.left = (this.f3540K.left / this.f3549g.m3420n()) + fMax;
            rectF.top = (this.f3540K.top / this.f3549g.m3419m()) + fMax2;
            rectF.right = rectF.left + (this.f3540K.width() / this.f3549g.m3420n());
            rectF.bottom = rectF.top + (this.f3540K.height() / this.f3549g.m3419m());
            rectF.left = Math.max(fMax, rectF.left);
            rectF.top = Math.max(fMax2, rectF.top);
            rectF.right = Math.min(fMin, rectF.right);
            rectF.bottom = Math.min(fMin2, rectF.bottom);
        } else if (!this.f3568z || fMin <= fMax || fMin2 <= fMax2) {
            rectF.left = fMax + f12;
            rectF.top = fMax2 + f14;
            rectF.right = fMin - f12;
            rectF.bottom = fMin2 - f14;
        } else if (f11 / f13 > this.f3532C) {
            rectF.top = fMax2 + f14;
            rectF.bottom = fMin2 - f14;
            float width = getWidth() / 2.0f;
            this.f3532C = this.f3530A / this.f3531B;
            float fMax3 = Math.max(this.f3549g.m3412f(), rectF.height() * this.f3532C) / 2.0f;
            rectF.left = width - fMax3;
            rectF.right = width + fMax3;
        } else {
            rectF.left = fMax + f12;
            rectF.right = fMin - f12;
            float height = getHeight() / 2.0f;
            float fMax4 = Math.max(this.f3549g.m3411e(), rectF.width() / this.f3532C) / 2.0f;
            rectF.top = height - fMax4;
            rectF.bottom = height + fMax4;
        }
        m3319l(rectF);
        this.f3549g.m3429w(rectF);
    }

    /* renamed from: o */
    public final boolean m3322o() {
        return this.f3568z;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC9133u.m16133g(canvas, "canvas");
        super.onDraw(canvas);
        m3310c(canvas);
        if (this.f3549g.m3430x()) {
            CropImageView.Guidelines guidelines = this.f3533D;
            if (guidelines == CropImageView.Guidelines.f3503c) {
                m3317j(canvas);
            } else if (guidelines == CropImageView.Guidelines.f3502b && this.f3567y != null) {
                m3317j(canvas);
            }
        }
        C5478a c5478a = f3529N;
        CropImageOptions cropImageOptions = this.f3545c;
        this.f3553k = c5478a.m3334b(cropImageOptions != null ? cropImageOptions.f3449y : 0.0f, cropImageOptions != null ? cropImageOptions.f3382B : -1);
        m3316i(canvas);
        m3311d(canvas);
        m3315h(canvas);
        if (Build.VERSION.SDK_INT >= 29) {
            m3332y();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        ScaleGestureDetector scaleGestureDetector;
        AbstractC9133u.m16133g(event, "event");
        if (!isEnabled()) {
            return false;
        }
        if (this.f3547e && (scaleGestureDetector = this.f3546d) != null) {
            scaleGestureDetector.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action == 0) {
            m3324q(event.getX(), event.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                m3325r(event.getX(), event.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        m3326s();
        return true;
    }

    /* renamed from: p */
    public final boolean m3323p() {
        float[] fArr = this.f3558p;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    /* renamed from: q */
    public final void m3324q(float f10, float f11) {
        C5487d c5487d = this.f3549g;
        float f12 = this.f3565w;
        CropImageView.CropShape cropShape = this.f3534E;
        AbstractC9133u.m16130d(cropShape);
        CropWindowMoveHandler cropWindowMoveHandlerM3413g = c5487d.m3413g(f10, f11, f12, cropShape, this.f3548f);
        this.f3567y = cropWindowMoveHandlerM3413g;
        if (cropWindowMoveHandlerM3413g != null) {
            invalidate();
        }
    }

    /* renamed from: r */
    public final void m3325r(float f10, float f11) {
        if (this.f3567y != null) {
            float f12 = this.f3566x;
            RectF rectFM3415i = this.f3549g.m3415i();
            if (m3309b(rectFM3415i)) {
                f12 = 0.0f;
            }
            CropWindowMoveHandler cropWindowMoveHandler = this.f3567y;
            AbstractC9133u.m16130d(cropWindowMoveHandler);
            cropWindowMoveHandler.m3348l(rectFM3415i, f10, f11, this.f3559q, this.f3560r, this.f3561s, f12, this.f3568z, this.f3532C);
            this.f3549g.m3429w(rectFM3415i);
            InterfaceC5479b interfaceC5479b = this.f3550h;
            if (interfaceC5479b != null) {
                interfaceC5479b.mo3277a(true);
            }
            invalidate();
        }
    }

    /* renamed from: s */
    public final void m3326s() {
        if (this.f3567y != null) {
            this.f3567y = null;
            InterfaceC5479b interfaceC5479b = this.f3550h;
            if (interfaceC5479b != null) {
                interfaceC5479b.mo3277a(false);
            }
            invalidate();
        }
    }

    public final void setAspectRatioX(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f3530A != i10) {
            this.f3530A = i10;
            this.f3532C = i10 / this.f3531B;
            if (this.f3541L) {
                m3321n();
                invalidate();
            }
        }
    }

    public final void setAspectRatioY(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f3531B != i10) {
            this.f3531B = i10;
            this.f3532C = this.f3530A / i10;
            if (this.f3541L) {
                m3321n();
                invalidate();
            }
        }
    }

    public final void setCropCornerRadius(float f10) {
        this.f3543a = f10;
    }

    public final void setCropCornerShape(CropImageView.CropCornerShape cropCornerShape) {
        AbstractC9133u.m16133g(cropCornerShape, "cropCornerShape");
        if (this.f3535F != cropCornerShape) {
            this.f3535F = cropCornerShape;
            invalidate();
        }
    }

    public final void setCropLabelText(String str) {
        if (str != null) {
            this.f3537H = str;
        }
    }

    public final void setCropLabelTextColor(int i10) {
        this.f3539J = i10;
        invalidate();
    }

    public final void setCropLabelTextSize(float f10) {
        this.f3538I = f10;
        invalidate();
    }

    public final void setCropShape(CropImageView.CropShape cropShape) {
        AbstractC9133u.m16133g(cropShape, "cropShape");
        if (this.f3534E != cropShape) {
            this.f3534E = cropShape;
            invalidate();
        }
    }

    public final void setCropWindowChangeListener(InterfaceC5479b interfaceC5479b) {
        this.f3550h = interfaceC5479b;
    }

    public final void setCropWindowRect(RectF rect) {
        AbstractC9133u.m16133g(rect, "rect");
        this.f3549g.m3429w(rect);
    }

    public final void setCropperTextLabelVisibility(boolean z10) {
        this.f3536G = z10;
        invalidate();
    }

    public final void setFixedAspectRatio(boolean z10) {
        if (this.f3568z != z10) {
            this.f3568z = z10;
            if (this.f3541L) {
                m3321n();
                invalidate();
            }
        }
    }

    public final void setGuidelines(CropImageView.Guidelines guidelines) {
        AbstractC9133u.m16133g(guidelines, "guidelines");
        if (this.f3533D != guidelines) {
            this.f3533D = guidelines;
            if (this.f3541L) {
                invalidate();
            }
        }
    }

    public final void setInitialAttributeValues(CropImageOptions options) {
        InterfaceC5479b interfaceC5479b;
        AbstractC9133u.m16133g(options, "options");
        boolean zM16128b = AbstractC9133u.m16128b(this.f3545c, options);
        CropImageOptions cropImageOptions = this.f3545c;
        boolean z10 = cropImageOptions == null || options.f3441t != cropImageOptions.f3441t || cropImageOptions == null || options.f3443u != cropImageOptions.f3443u || cropImageOptions == null || options.f3445v != cropImageOptions.f3445v;
        this.f3545c = options;
        this.f3549g.m3428v(options.f3389I, options.f3390J);
        this.f3549g.m3427u(options.f3391K, options.f3392L);
        if (zM16128b) {
            return;
        }
        this.f3549g.m3426t(options);
        this.f3539J = options.f3434p0;
        this.f3538I = options.f3432o0;
        String str = options.f3436q0;
        if (str == null) {
            str = "";
        }
        this.f3537H = str;
        this.f3536G = options.f3423k;
        this.f3543a = options.f3411e;
        this.f3535F = options.f3410d;
        this.f3534E = options.f3409c;
        this.f3566x = options.f3413f;
        setEnabled(options.f3435q);
        this.f3533D = options.f3417h;
        this.f3568z = options.f3441t;
        setAspectRatioX(options.f3443u);
        setAspectRatioY(options.f3445v);
        boolean z11 = options.f3431o;
        this.f3547e = z11;
        if (z11 && this.f3546d == null) {
            this.f3546d = new ScaleGestureDetector(getContext(), new C5480c());
        }
        this.f3548f = options.f3433p;
        this.f3565w = options.f3415g;
        this.f3564v = options.f3439s;
        C5478a c5478a = f3529N;
        this.f3552j = c5478a.m3334b(options.f3447w, options.f3448x);
        this.f3562t = options.f3450z;
        this.f3563u = options.f3381A;
        this.f3544b = Integer.valueOf(options.f3383C);
        this.f3553k = c5478a.m3334b(options.f3449y, options.f3382B);
        this.f3554l = c5478a.m3334b(options.f3384D, options.f3385E);
        this.f3555m = c5478a.m3333a(options.f3386F);
        this.f3556n = c5478a.m3336d(options);
        if (z10) {
            m3321n();
        }
        invalidate();
        if (!z10 || (interfaceC5479b = this.f3550h) == null) {
            return;
        }
        interfaceC5479b.mo3277a(false);
    }

    public final void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.f3540K;
        if (rect == null) {
            rect = C5484a.f3592a.m3380o();
        }
        rect2.set(rect);
        if (this.f3541L) {
            m3321n();
            invalidate();
            InterfaceC5479b interfaceC5479b = this.f3550h;
            if (interfaceC5479b != null) {
                interfaceC5479b.mo3277a(false);
            }
        }
    }

    public final void setSnapRadius(float f10) {
        this.f3566x = f10;
    }

    /* renamed from: t */
    public final void m3327t() {
        if (this.f3541L) {
            setCropWindowRect(C5484a.f3592a.m3381p());
            m3321n();
            invalidate();
        }
    }

    /* renamed from: u */
    public final void m3328u(float[] fArr, int i10, int i11) {
        if (fArr == null || !Arrays.equals(this.f3558p, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f3558p, 0.0f);
            } else {
                System.arraycopy(fArr, 0, this.f3558p, 0, fArr.length);
            }
            this.f3560r = i10;
            this.f3561s = i11;
            RectF rectFM3415i = this.f3549g.m3415i();
            if (rectFM3415i.width() == 0.0f || rectFM3415i.height() == 0.0f) {
                m3321n();
            }
        }
    }

    /* renamed from: v */
    public final boolean m3329v(boolean z10) {
        if (this.f3548f == z10) {
            return false;
        }
        this.f3548f = z10;
        return true;
    }

    /* renamed from: w */
    public final void m3330w(float f10, float f11, float f12, float f13) {
        this.f3549g.m3425s(f10, f11, f12, f13);
    }

    /* renamed from: x */
    public final boolean m3331x(boolean z10) {
        if (this.f3547e == z10) {
            return false;
        }
        this.f3547e = z10;
        if (!z10 || this.f3546d != null) {
            return true;
        }
        this.f3546d = new ScaleGestureDetector(getContext(), new C5480c());
        return true;
    }

    /* renamed from: y */
    public final void m3332y() {
        RectF rectFM3415i = this.f3549g.m3415i();
        List systemGestureExclusionRects = getSystemGestureExclusionRects();
        AbstractC9133u.m16132f(systemGestureExclusionRects, "getSystemGestureExclusionRects(...)");
        Rect rect = (Rect) (systemGestureExclusionRects.size() > 0 ? systemGestureExclusionRects.get(0) : new Rect());
        List systemGestureExclusionRects2 = getSystemGestureExclusionRects();
        AbstractC9133u.m16132f(systemGestureExclusionRects2, "getSystemGestureExclusionRects(...)");
        Rect rect2 = (Rect) (1 < systemGestureExclusionRects2.size() ? systemGestureExclusionRects2.get(1) : new Rect());
        List systemGestureExclusionRects3 = getSystemGestureExclusionRects();
        AbstractC9133u.m16132f(systemGestureExclusionRects3, "getSystemGestureExclusionRects(...)");
        Rect rect3 = (Rect) (2 < systemGestureExclusionRects3.size() ? systemGestureExclusionRects3.get(2) : new Rect());
        float f10 = rectFM3415i.left;
        float f11 = this.f3565w;
        int i10 = (int) (f10 - f11);
        rect.left = i10;
        int i11 = (int) (rectFM3415i.right + f11);
        rect.right = i11;
        float f12 = rectFM3415i.top;
        int i12 = (int) (f12 - f11);
        rect.top = i12;
        float f13 = this.f3542M;
        rect.bottom = (int) (i12 + (f13 * 0.3f));
        rect2.left = i10;
        rect2.right = i11;
        float f14 = rectFM3415i.bottom;
        int i13 = (int) (((f12 + f14) / 2.0f) - (0.2f * f13));
        rect2.top = i13;
        rect2.bottom = (int) (i13 + (0.4f * f13));
        rect3.left = rect.left;
        rect3.right = rect.right;
        int i14 = (int) (f14 + f11);
        rect3.bottom = i14;
        rect3.top = (int) (i14 - (f13 * 0.3f));
        setSystemGestureExclusionRects(AbstractC8809v.m14774q(rect, rect2, rect3));
    }
}
