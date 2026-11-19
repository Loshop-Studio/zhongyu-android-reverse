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
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10978w;

/* loaded from: classes3.dex */
public final class CropOverlayView extends View {

    /* renamed from: P */
    public static final C5897a f5299P = new C5897a(null);

    /* renamed from: A */
    public CropWindowMoveHandler f5300A;

    /* renamed from: B */
    public boolean f5301B;

    /* renamed from: C */
    public int f5302C;

    /* renamed from: D */
    public int f5303D;

    /* renamed from: E */
    public float f5304E;

    /* renamed from: F */
    public CropImageView.Guidelines f5305F;

    /* renamed from: G */
    public CropImageView.CropShape f5306G;

    /* renamed from: H */
    public CropImageView.CropCornerShape f5307H;

    /* renamed from: I */
    public boolean f5308I;

    /* renamed from: J */
    public String f5309J;

    /* renamed from: K */
    public float f5310K;

    /* renamed from: L */
    public int f5311L;

    /* renamed from: M */
    public final Rect f5312M;

    /* renamed from: N */
    public boolean f5313N;

    /* renamed from: O */
    public final float f5314O;

    /* renamed from: c */
    public float f5315c;

    /* renamed from: d */
    public Integer f5316d;

    /* renamed from: e */
    public CropImageOptions f5317e;

    /* renamed from: f */
    public ScaleGestureDetector f5318f;

    /* renamed from: g */
    public boolean f5319g;

    /* renamed from: h */
    public boolean f5320h;

    /* renamed from: i */
    public final C5906d f5321i;

    /* renamed from: j */
    public InterfaceC5898b f5322j;

    /* renamed from: k */
    public final RectF f5323k;

    /* renamed from: l */
    public Paint f5324l;

    /* renamed from: m */
    public Paint f5325m;

    /* renamed from: n */
    public Paint f5326n;

    /* renamed from: o */
    public Paint f5327o;

    /* renamed from: p */
    public Paint f5328p;

    /* renamed from: q */
    public final Path f5329q;

    /* renamed from: r */
    public final float[] f5330r;

    /* renamed from: s */
    public final RectF f5331s;

    /* renamed from: t */
    public int f5332t;

    /* renamed from: u */
    public int f5333u;

    /* renamed from: v */
    public float f5334v;

    /* renamed from: w */
    public float f5335w;

    /* renamed from: x */
    public float f5336x;

    /* renamed from: y */
    public float f5337y;

    /* renamed from: z */
    public float f5338z;

    /* renamed from: com.canhub.cropper.CropOverlayView$a */
    public static final class C5897a {
        public /* synthetic */ C5897a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final Paint m4535a(int i10) {
            Paint paint = new Paint();
            paint.setColor(i10);
            return paint;
        }

        /* renamed from: b */
        public final Paint m4536b(float f10, int i10) {
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
        public final Paint m4537c(int i10) {
            Paint paint = new Paint();
            paint.setColor(i10);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            return paint;
        }

        /* renamed from: d */
        public final Paint m4538d(CropImageOptions options) {
            AbstractC9979u.m20294g(options, "options");
            Paint paint = new Paint();
            paint.setStrokeWidth(1.0f);
            paint.setTextSize(options.f5204q0);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setColor(options.f5206r0);
            return paint;
        }

        public C5897a() {
        }
    }

    /* renamed from: com.canhub.cropper.CropOverlayView$b */
    public interface InterfaceC5898b {
        /* renamed from: a */
        void mo4478a(boolean z10);
    }

    /* renamed from: com.canhub.cropper.CropOverlayView$c */
    public final class C5899c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C5899c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            AbstractC9979u.m20294g(detector, "detector");
            RectF rectFM4617i = CropOverlayView.this.f5321i.m4617i();
            float focusX = detector.getFocusX();
            float focusY = detector.getFocusY();
            float f10 = 2;
            float currentSpanY = detector.getCurrentSpanY() / f10;
            float currentSpanX = detector.getCurrentSpanX() / f10;
            float f11 = focusY - currentSpanY;
            float f12 = focusX - currentSpanX;
            float f13 = focusX + currentSpanX;
            float f14 = focusY + currentSpanY;
            if (f12 >= f13 || f11 > f14 || f12 < 0.0f || f13 > CropOverlayView.this.f5321i.m4612d() || f11 < 0.0f || f14 > CropOverlayView.this.f5321i.m4611c()) {
                return true;
            }
            rectFM4617i.set(f12, f11, f13, f14);
            CropOverlayView.this.f5321i.m4631w(rectFM4617i);
            CropOverlayView.this.invalidate();
            return true;
        }
    }

    /* renamed from: com.canhub.cropper.CropOverlayView$d */
    public /* synthetic */ class C5900d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5340a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f5341b;

        static {
            int[] iArr = new int[CropImageView.CropShape.values().length];
            try {
                iArr[CropImageView.CropShape.f5265c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropImageView.CropShape.f5267e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropImageView.CropShape.f5268f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropImageView.CropShape.f5266d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5340a = iArr;
            int[] iArr2 = new int[CropImageView.CropCornerShape.values().length];
            try {
                iArr2[CropImageView.CropCornerShape.f5262d.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CropImageView.CropCornerShape.f5261c.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f5341b = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CropOverlayView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        AbstractC9979u.m20294g(context, "context");
    }

    /* renamed from: b */
    public final boolean m4511b(RectF rectF) {
        float f10;
        float f11;
        C5903a c5903a = C5903a.f5362a;
        float fM4557A = c5903a.m4557A(this.f5330r);
        float fM4559C = c5903a.m4559C(this.f5330r);
        float fM4558B = c5903a.m4558B(this.f5330r);
        float fM4589v = c5903a.m4589v(this.f5330r);
        if (!m4525p()) {
            this.f5331s.set(fM4557A, fM4559C, fM4558B, fM4589v);
            return false;
        }
        float[] fArr = this.f5330r;
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
        float fMax = Math.max(fM4557A, f33 < f30 ? f33 : fM4557A);
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
            f37 = fM4558B;
        }
        float fMin = Math.min(fM4558B, f37);
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
        float fMax4 = Math.max(fM4559C, Math.max((f19 * fMax3) + f21, (f20 * fMin3) + f22));
        float fMin4 = Math.min(fM4589v, Math.min((f20 * fMax3) + f24, (f19 * fMin3) + f23));
        RectF rectF2 = this.f5331s;
        rectF2.left = fMax3;
        rectF2.top = fMax4;
        rectF2.right = fMin3;
        rectF2.bottom = fMin4;
        return true;
    }

    /* renamed from: c */
    public final void m4512c(Canvas canvas) {
        RectF rectFM4617i = this.f5321i.m4617i();
        C5903a c5903a = C5903a.f5362a;
        float fMax = Math.max(c5903a.m4557A(this.f5330r), 0.0f);
        float fMax2 = Math.max(c5903a.m4559C(this.f5330r), 0.0f);
        float fMin = Math.min(c5903a.m4558B(this.f5330r), getWidth());
        float fMin2 = Math.min(c5903a.m4589v(this.f5330r), getHeight());
        CropImageView.CropShape cropShape = this.f5306G;
        int i10 = cropShape == null ? -1 : C5900d.f5340a[cropShape.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            this.f5329q.reset();
            this.f5323k.set(rectFM4617i.left, rectFM4617i.top, rectFM4617i.right, rectFM4617i.bottom);
            this.f5329q.addOval(this.f5323k, Path.Direction.CW);
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.f5329q);
            } else {
                canvas.clipPath(this.f5329q, Region.Op.XOR);
            }
            Paint paint = this.f5327o;
            AbstractC9979u.m20291d(paint);
            canvas.drawRect(fMax, fMax2, fMin, fMin2, paint);
            canvas.restore();
            return;
        }
        if (!m4525p()) {
            float f10 = rectFM4617i.top;
            Paint paint2 = this.f5327o;
            AbstractC9979u.m20291d(paint2);
            canvas.drawRect(fMax, fMax2, fMin, f10, paint2);
            float f11 = rectFM4617i.bottom;
            Paint paint3 = this.f5327o;
            AbstractC9979u.m20291d(paint3);
            canvas.drawRect(fMax, f11, fMin, fMin2, paint3);
            float f12 = rectFM4617i.top;
            float f13 = rectFM4617i.left;
            float f14 = rectFM4617i.bottom;
            Paint paint4 = this.f5327o;
            AbstractC9979u.m20291d(paint4);
            canvas.drawRect(fMax, f12, f13, f14, paint4);
            float f15 = rectFM4617i.right;
            float f16 = rectFM4617i.top;
            float f17 = rectFM4617i.bottom;
            Paint paint5 = this.f5327o;
            AbstractC9979u.m20291d(paint5);
            canvas.drawRect(f15, f16, fMin, f17, paint5);
            return;
        }
        this.f5329q.reset();
        Path path = this.f5329q;
        float[] fArr = this.f5330r;
        path.moveTo(fArr[0], fArr[1]);
        Path path2 = this.f5329q;
        float[] fArr2 = this.f5330r;
        path2.lineTo(fArr2[2], fArr2[3]);
        Path path3 = this.f5329q;
        float[] fArr3 = this.f5330r;
        path3.lineTo(fArr3[4], fArr3[5]);
        Path path4 = this.f5329q;
        float[] fArr4 = this.f5330r;
        path4.lineTo(fArr4[6], fArr4[7]);
        this.f5329q.close();
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(this.f5329q);
        } else {
            canvas.clipPath(this.f5329q, Region.Op.INTERSECT);
        }
        Paint paint6 = this.f5327o;
        AbstractC9979u.m20291d(paint6);
        canvas.drawRect(fMax, fMax2, fMin, fMin2, paint6);
        canvas.restore();
    }

    /* renamed from: d */
    public final void m4513d(Canvas canvas) {
        Paint paint = this.f5324l;
        if (paint != null) {
            AbstractC9979u.m20291d(paint);
            float strokeWidth = paint.getStrokeWidth();
            RectF rectFM4617i = this.f5321i.m4617i();
            float f10 = strokeWidth / 2;
            rectFM4617i.inset(f10, f10);
            CropImageView.CropShape cropShape = this.f5306G;
            int i10 = cropShape == null ? -1 : C5900d.f5340a[cropShape.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                Paint paint2 = this.f5324l;
                AbstractC9979u.m20291d(paint2);
                canvas.drawRect(rectFM4617i, paint2);
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("Unrecognized crop shape");
                }
                Paint paint3 = this.f5324l;
                AbstractC9979u.m20291d(paint3);
                canvas.drawOval(rectFM4617i, paint3);
            }
        }
    }

    /* renamed from: e */
    public final void m4514e(Canvas canvas, RectF rectF, float f10, float f11) {
        float f12 = rectF.left - f10;
        float f13 = rectF.top - f10;
        Paint paint = this.f5325m;
        AbstractC9979u.m20291d(paint);
        canvas.drawCircle(f12, f13, f11, paint);
        float f14 = rectF.right + f10;
        float f15 = rectF.top - f10;
        Paint paint2 = this.f5325m;
        AbstractC9979u.m20291d(paint2);
        canvas.drawCircle(f14, f15, f11, paint2);
        float f16 = rectF.left - f10;
        float f17 = rectF.bottom + f10;
        Paint paint3 = this.f5325m;
        AbstractC9979u.m20291d(paint3);
        canvas.drawCircle(f16, f17, f11, paint3);
        float f18 = rectF.right + f10;
        float f19 = rectF.bottom + f10;
        Paint paint4 = this.f5325m;
        AbstractC9979u.m20291d(paint4);
        canvas.drawCircle(f18, f19, f11, paint4);
    }

    /* renamed from: f */
    public final void m4515f(Canvas canvas, RectF rectF, float f10, float f11) {
        CropImageView.CropShape cropShape = this.f5306G;
        int i10 = cropShape == null ? -1 : C5900d.f5340a[cropShape.ordinal()];
        if (i10 == 1) {
            m4516g(canvas, rectF, f10, f11, this.f5315c);
            return;
        }
        if (i10 == 2) {
            float fCenterX = rectF.centerX() - this.f5335w;
            float f12 = rectF.top - f10;
            float fCenterX2 = rectF.centerX() + this.f5335w;
            float f13 = rectF.top - f10;
            Paint paint = this.f5325m;
            AbstractC9979u.m20291d(paint);
            canvas.drawLine(fCenterX, f12, fCenterX2, f13, paint);
            float fCenterX3 = rectF.centerX() - this.f5335w;
            float f14 = rectF.bottom + f10;
            float fCenterX4 = rectF.centerX() + this.f5335w;
            float f15 = rectF.bottom + f10;
            Paint paint2 = this.f5325m;
            AbstractC9979u.m20291d(paint2);
            canvas.drawLine(fCenterX3, f14, fCenterX4, f15, paint2);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            m4520k(canvas, rectF, f10, f11);
            return;
        }
        float f16 = rectF.left - f10;
        float fCenterY = rectF.centerY() - this.f5335w;
        float f17 = rectF.left - f10;
        float fCenterY2 = rectF.centerY() + this.f5335w;
        Paint paint3 = this.f5325m;
        AbstractC9979u.m20291d(paint3);
        canvas.drawLine(f16, fCenterY, f17, fCenterY2, paint3);
        float f18 = rectF.right + f10;
        float fCenterY3 = rectF.centerY() - this.f5335w;
        float f19 = rectF.right + f10;
        float fCenterY4 = rectF.centerY() + this.f5335w;
        Paint paint4 = this.f5325m;
        AbstractC9979u.m20291d(paint4);
        canvas.drawLine(f18, fCenterY3, f19, fCenterY4, paint4);
    }

    /* renamed from: g */
    public final void m4516g(Canvas canvas, RectF rectF, float f10, float f11, float f12) {
        CropImageView.CropCornerShape cropCornerShape = this.f5307H;
        int i10 = cropCornerShape == null ? -1 : C5900d.f5341b[cropCornerShape.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                m4514e(canvas, rectF, f10, f12);
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                m4520k(canvas, rectF, f10, f11);
            }
        }
    }

    public final int getAspectRatioX() {
        return this.f5302C;
    }

    public final int getAspectRatioY() {
        return this.f5303D;
    }

    public final CropImageView.CropCornerShape getCornerShape() {
        return this.f5307H;
    }

    public final CropImageView.CropShape getCropShape() {
        return this.f5306G;
    }

    public final RectF getCropWindowRect() {
        return this.f5321i.m4617i();
    }

    public final CropImageView.Guidelines getGuidelines() {
        return this.f5305F;
    }

    public final Rect getInitialCropWindowRect() {
        return this.f5312M;
    }

    /* renamed from: h */
    public final void m4517h(Canvas canvas) {
        float strokeWidth;
        if (this.f5325m != null) {
            Paint paint = this.f5324l;
            if (paint != null) {
                AbstractC9979u.m20291d(paint);
                strokeWidth = paint.getStrokeWidth();
            } else {
                strokeWidth = 0.0f;
            }
            Paint paint2 = this.f5325m;
            AbstractC9979u.m20291d(paint2);
            float strokeWidth2 = paint2.getStrokeWidth();
            float f10 = 2;
            float f11 = (strokeWidth2 - strokeWidth) / f10;
            float f12 = strokeWidth2 / f10;
            float f13 = f12 + f11;
            CropImageView.CropShape cropShape = this.f5306G;
            int i10 = cropShape == null ? -1 : C5900d.f5340a[cropShape.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                f12 += this.f5334v;
            } else if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            RectF rectFM4617i = this.f5321i.m4617i();
            rectFM4617i.inset(f12, f12);
            m4515f(canvas, rectFM4617i, f11, f13);
            if (this.f5307H == CropImageView.CropCornerShape.f5262d) {
                Integer num = this.f5316d;
                this.f5325m = num != null ? f5299P.m4537c(num.intValue()) : null;
                m4515f(canvas, rectFM4617i, f11, f13);
            }
        }
    }

    /* renamed from: i */
    public final void m4518i(Canvas canvas) {
        if (this.f5308I) {
            RectF rectFM4617i = this.f5321i.m4617i();
            float f10 = (rectFM4617i.left + rectFM4617i.right) / 2;
            float f11 = rectFM4617i.top - 50;
            Paint paint = this.f5328p;
            if (paint != null) {
                paint.setTextSize(this.f5310K);
                paint.setColor(this.f5311L);
            }
            String str = this.f5309J;
            Paint paint2 = this.f5328p;
            AbstractC9979u.m20291d(paint2);
            canvas.drawText(str, f10, f11, paint2);
            canvas.save();
        }
    }

    /* renamed from: j */
    public final void m4519j(Canvas canvas) {
        float strokeWidth;
        if (this.f5326n != null) {
            Paint paint = this.f5324l;
            if (paint != null) {
                AbstractC9979u.m20291d(paint);
                strokeWidth = paint.getStrokeWidth();
            } else {
                strokeWidth = 0.0f;
            }
            RectF rectFM4617i = this.f5321i.m4617i();
            rectFM4617i.inset(strokeWidth, strokeWidth);
            float f10 = 3;
            float fWidth = rectFM4617i.width() / f10;
            float fHeight = rectFM4617i.height() / f10;
            CropImageView.CropShape cropShape = this.f5306G;
            int i10 = cropShape == null ? -1 : C5900d.f5340a[cropShape.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                float f11 = rectFM4617i.left + fWidth;
                float f12 = rectFM4617i.right - fWidth;
                float f13 = rectFM4617i.top;
                float f14 = rectFM4617i.bottom;
                Paint paint2 = this.f5326n;
                AbstractC9979u.m20291d(paint2);
                canvas.drawLine(f11, f13, f11, f14, paint2);
                float f15 = rectFM4617i.top;
                float f16 = rectFM4617i.bottom;
                Paint paint3 = this.f5326n;
                AbstractC9979u.m20291d(paint3);
                canvas.drawLine(f12, f15, f12, f16, paint3);
                float f17 = rectFM4617i.top + fHeight;
                float f18 = rectFM4617i.bottom - fHeight;
                float f19 = rectFM4617i.left;
                float f20 = rectFM4617i.right;
                Paint paint4 = this.f5326n;
                AbstractC9979u.m20291d(paint4);
                canvas.drawLine(f19, f17, f20, f17, paint4);
                float f21 = rectFM4617i.left;
                float f22 = rectFM4617i.right;
                Paint paint5 = this.f5326n;
                AbstractC9979u.m20291d(paint5);
                canvas.drawLine(f21, f18, f22, f18, paint5);
                return;
            }
            if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            float f23 = 2;
            float fWidth2 = (rectFM4617i.width() / f23) - strokeWidth;
            float fHeight2 = (rectFM4617i.height() / f23) - strokeWidth;
            float f24 = rectFM4617i.left + fWidth;
            float f25 = rectFM4617i.right - fWidth;
            float fSin = (float) (fHeight2 * Math.sin(Math.acos((fWidth2 - fWidth) / fWidth2)));
            float f26 = (rectFM4617i.top + fHeight2) - fSin;
            float f27 = (rectFM4617i.bottom - fHeight2) + fSin;
            Paint paint6 = this.f5326n;
            AbstractC9979u.m20291d(paint6);
            canvas.drawLine(f24, f26, f24, f27, paint6);
            float f28 = (rectFM4617i.top + fHeight2) - fSin;
            float f29 = (rectFM4617i.bottom - fHeight2) + fSin;
            Paint paint7 = this.f5326n;
            AbstractC9979u.m20291d(paint7);
            canvas.drawLine(f25, f28, f25, f29, paint7);
            float f30 = rectFM4617i.top + fHeight;
            float f31 = rectFM4617i.bottom - fHeight;
            float fCos = (float) (fWidth2 * Math.cos(Math.asin((fHeight2 - fHeight) / fHeight2)));
            float f32 = (rectFM4617i.left + fWidth2) - fCos;
            float f33 = (rectFM4617i.right - fWidth2) + fCos;
            Paint paint8 = this.f5326n;
            AbstractC9979u.m20291d(paint8);
            canvas.drawLine(f32, f30, f33, f30, paint8);
            float f34 = (rectFM4617i.left + fWidth2) - fCos;
            float f35 = (rectFM4617i.right - fWidth2) + fCos;
            Paint paint9 = this.f5326n;
            AbstractC9979u.m20291d(paint9);
            canvas.drawLine(f34, f31, f35, f31, paint9);
        }
    }

    /* renamed from: k */
    public final void m4520k(Canvas canvas, RectF rectF, float f10, float f11) {
        float f12 = rectF.left;
        float f13 = rectF.top;
        float f14 = f13 + this.f5335w;
        Paint paint = this.f5325m;
        AbstractC9979u.m20291d(paint);
        canvas.drawLine(f12 - f10, f13 - f11, f12 - f10, f14, paint);
        float f15 = rectF.left;
        float f16 = rectF.top;
        Paint paint2 = this.f5325m;
        AbstractC9979u.m20291d(paint2);
        canvas.drawLine(f15 - f11, f16 - f10, f15 + this.f5335w, f16 - f10, paint2);
        float f17 = rectF.right;
        float f18 = rectF.top;
        float f19 = f18 + this.f5335w;
        Paint paint3 = this.f5325m;
        AbstractC9979u.m20291d(paint3);
        canvas.drawLine(f17 + f10, f18 - f11, f17 + f10, f19, paint3);
        float f20 = rectF.right;
        float f21 = rectF.top;
        Paint paint4 = this.f5325m;
        AbstractC9979u.m20291d(paint4);
        canvas.drawLine(f20 + f11, f21 - f10, f20 - this.f5335w, f21 - f10, paint4);
        float f22 = rectF.left;
        float f23 = rectF.bottom;
        float f24 = f23 - this.f5335w;
        Paint paint5 = this.f5325m;
        AbstractC9979u.m20291d(paint5);
        canvas.drawLine(f22 - f10, f23 + f11, f22 - f10, f24, paint5);
        float f25 = rectF.left;
        float f26 = rectF.bottom;
        Paint paint6 = this.f5325m;
        AbstractC9979u.m20291d(paint6);
        canvas.drawLine(f25 - f11, f26 + f10, f25 + this.f5335w, f26 + f10, paint6);
        float f27 = rectF.right;
        float f28 = rectF.bottom;
        float f29 = f28 - this.f5335w;
        Paint paint7 = this.f5325m;
        AbstractC9979u.m20291d(paint7);
        canvas.drawLine(f27 + f10, f28 + f11, f27 + f10, f29, paint7);
        float f30 = rectF.right;
        float f31 = rectF.bottom;
        Paint paint8 = this.f5325m;
        AbstractC9979u.m20291d(paint8);
        canvas.drawLine(f30 + f11, f31 + f10, f30 - this.f5335w, f31 + f10, paint8);
    }

    /* renamed from: l */
    public final void m4521l(RectF rectF) {
        if (rectF.width() < this.f5321i.m4614f()) {
            float fM4614f = (this.f5321i.m4614f() - rectF.width()) / 2;
            rectF.left -= fM4614f;
            rectF.right += fM4614f;
        }
        if (rectF.height() < this.f5321i.m4613e()) {
            float fM4613e = (this.f5321i.m4613e() - rectF.height()) / 2;
            rectF.top -= fM4613e;
            rectF.bottom += fM4613e;
        }
        if (rectF.width() > this.f5321i.m4612d()) {
            float fWidth = (rectF.width() - this.f5321i.m4612d()) / 2;
            rectF.left += fWidth;
            rectF.right -= fWidth;
        }
        if (rectF.height() > this.f5321i.m4611c()) {
            float fHeight = (rectF.height() - this.f5321i.m4611c()) / 2;
            rectF.top += fHeight;
            rectF.bottom -= fHeight;
        }
        m4511b(rectF);
        if (this.f5331s.width() > 0.0f && this.f5331s.height() > 0.0f) {
            float fMax = Math.max(this.f5331s.left, 0.0f);
            float fMax2 = Math.max(this.f5331s.top, 0.0f);
            float fMin = Math.min(this.f5331s.right, getWidth());
            float fMin2 = Math.min(this.f5331s.bottom, getHeight());
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
        if (!this.f5301B || Math.abs(rectF.width() - (rectF.height() * this.f5304E)) <= 0.1d) {
            return;
        }
        if (rectF.width() > rectF.height() * this.f5304E) {
            float fAbs = Math.abs((rectF.height() * this.f5304E) - rectF.width()) / 2;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        } else {
            float fAbs2 = Math.abs((rectF.width() / this.f5304E) - rectF.height()) / 2;
            rectF.top += fAbs2;
            rectF.bottom -= fAbs2;
        }
    }

    /* renamed from: m */
    public final void m4522m() {
        RectF cropWindowRect = getCropWindowRect();
        m4521l(cropWindowRect);
        this.f5321i.m4631w(cropWindowRect);
    }

    /* renamed from: n */
    public final void m4523n() {
        C5903a c5903a = C5903a.f5362a;
        float fMax = Math.max(c5903a.m4557A(this.f5330r), 0.0f);
        float fMax2 = Math.max(c5903a.m4559C(this.f5330r), 0.0f);
        float fMin = Math.min(c5903a.m4558B(this.f5330r), getWidth());
        float fMin2 = Math.min(c5903a.m4589v(this.f5330r), getHeight());
        if (fMin <= fMax || fMin2 <= fMax2) {
            return;
        }
        RectF rectF = new RectF();
        this.f5313N = true;
        float f10 = this.f5336x;
        float f11 = fMin - fMax;
        float f12 = f10 * f11;
        float f13 = fMin2 - fMax2;
        float f14 = f10 * f13;
        if (this.f5312M.width() > 0 && this.f5312M.height() > 0) {
            rectF.left = (this.f5312M.left / this.f5321i.m4622n()) + fMax;
            rectF.top = (this.f5312M.top / this.f5321i.m4621m()) + fMax2;
            rectF.right = rectF.left + (this.f5312M.width() / this.f5321i.m4622n());
            rectF.bottom = rectF.top + (this.f5312M.height() / this.f5321i.m4621m());
            rectF.left = Math.max(fMax, rectF.left);
            rectF.top = Math.max(fMax2, rectF.top);
            rectF.right = Math.min(fMin, rectF.right);
            rectF.bottom = Math.min(fMin2, rectF.bottom);
        } else if (!this.f5301B || fMin <= fMax || fMin2 <= fMax2) {
            rectF.left = fMax + f12;
            rectF.top = fMax2 + f14;
            rectF.right = fMin - f12;
            rectF.bottom = fMin2 - f14;
        } else if (f11 / f13 > this.f5304E) {
            rectF.top = fMax2 + f14;
            rectF.bottom = fMin2 - f14;
            float width = getWidth() / 2.0f;
            this.f5304E = this.f5302C / this.f5303D;
            float fMax3 = Math.max(this.f5321i.m4614f(), rectF.height() * this.f5304E) / 2.0f;
            rectF.left = width - fMax3;
            rectF.right = width + fMax3;
        } else {
            rectF.left = fMax + f12;
            rectF.right = fMin - f12;
            float height = getHeight() / 2.0f;
            float fMax4 = Math.max(this.f5321i.m4613e(), rectF.width() / this.f5304E) / 2.0f;
            rectF.top = height - fMax4;
            rectF.bottom = height + fMax4;
        }
        m4521l(rectF);
        this.f5321i.m4631w(rectF);
    }

    /* renamed from: o */
    public final boolean m4524o() {
        return this.f5301B;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC9979u.m20294g(canvas, "canvas");
        super.onDraw(canvas);
        m4512c(canvas);
        if (this.f5321i.m4632x()) {
            CropImageView.Guidelines guidelines = this.f5305F;
            if (guidelines == CropImageView.Guidelines.f5273e) {
                m4519j(canvas);
            } else if (guidelines == CropImageView.Guidelines.f5272d && this.f5300A != null) {
                m4519j(canvas);
            }
        }
        C5897a c5897a = f5299P;
        CropImageOptions cropImageOptions = this.f5317e;
        this.f5325m = c5897a.m4536b(cropImageOptions != null ? cropImageOptions.f5151A : 0.0f, cropImageOptions != null ? cropImageOptions.f5154D : -1);
        m4518i(canvas);
        m4513d(canvas);
        m4517h(canvas);
        if (Build.VERSION.SDK_INT >= 29) {
            m4534y();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        ScaleGestureDetector scaleGestureDetector;
        AbstractC9979u.m20294g(event, "event");
        if (!isEnabled()) {
            return false;
        }
        if (this.f5319g && (scaleGestureDetector = this.f5318f) != null) {
            scaleGestureDetector.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action == 0) {
            m4526q(event.getX(), event.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                m4527r(event.getX(), event.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        m4528s();
        return true;
    }

    /* renamed from: p */
    public final boolean m4525p() {
        float[] fArr = this.f5330r;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    /* renamed from: q */
    public final void m4526q(float f10, float f11) {
        C5906d c5906d = this.f5321i;
        float f12 = this.f5337y;
        CropImageView.CropShape cropShape = this.f5306G;
        AbstractC9979u.m20291d(cropShape);
        CropWindowMoveHandler cropWindowMoveHandlerM4615g = c5906d.m4615g(f10, f11, f12, cropShape, this.f5320h);
        this.f5300A = cropWindowMoveHandlerM4615g;
        if (cropWindowMoveHandlerM4615g != null) {
            invalidate();
        }
    }

    /* renamed from: r */
    public final void m4527r(float f10, float f11) {
        if (this.f5300A != null) {
            float f12 = this.f5338z;
            RectF rectFM4617i = this.f5321i.m4617i();
            if (m4511b(rectFM4617i)) {
                f12 = 0.0f;
            }
            CropWindowMoveHandler cropWindowMoveHandler = this.f5300A;
            AbstractC9979u.m20291d(cropWindowMoveHandler);
            cropWindowMoveHandler.m4550l(rectFM4617i, f10, f11, this.f5331s, this.f5332t, this.f5333u, f12, this.f5301B, this.f5304E);
            this.f5321i.m4631w(rectFM4617i);
            InterfaceC5898b interfaceC5898b = this.f5322j;
            if (interfaceC5898b != null) {
                interfaceC5898b.mo4478a(true);
            }
            invalidate();
        }
    }

    /* renamed from: s */
    public final void m4528s() {
        if (this.f5300A != null) {
            this.f5300A = null;
            InterfaceC5898b interfaceC5898b = this.f5322j;
            if (interfaceC5898b != null) {
                interfaceC5898b.mo4478a(false);
            }
            invalidate();
        }
    }

    public final void setAspectRatioX(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f5302C != i10) {
            this.f5302C = i10;
            this.f5304E = i10 / this.f5303D;
            if (this.f5313N) {
                m4523n();
                invalidate();
            }
        }
    }

    public final void setAspectRatioY(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f5303D != i10) {
            this.f5303D = i10;
            this.f5304E = this.f5302C / i10;
            if (this.f5313N) {
                m4523n();
                invalidate();
            }
        }
    }

    public final void setCropCornerRadius(float f10) {
        this.f5315c = f10;
    }

    public final void setCropCornerShape(CropImageView.CropCornerShape cropCornerShape) {
        AbstractC9979u.m20294g(cropCornerShape, "cropCornerShape");
        if (this.f5307H != cropCornerShape) {
            this.f5307H = cropCornerShape;
            invalidate();
        }
    }

    public final void setCropLabelText(String str) {
        if (str != null) {
            this.f5309J = str;
        }
    }

    public final void setCropLabelTextColor(int i10) {
        this.f5311L = i10;
        invalidate();
    }

    public final void setCropLabelTextSize(float f10) {
        this.f5310K = f10;
        invalidate();
    }

    public final void setCropShape(CropImageView.CropShape cropShape) {
        AbstractC9979u.m20294g(cropShape, "cropShape");
        if (this.f5306G != cropShape) {
            this.f5306G = cropShape;
            invalidate();
        }
    }

    public final void setCropWindowChangeListener(InterfaceC5898b interfaceC5898b) {
        this.f5322j = interfaceC5898b;
    }

    public final void setCropWindowRect(RectF rect) {
        AbstractC9979u.m20294g(rect, "rect");
        this.f5321i.m4631w(rect);
    }

    public final void setCropperTextLabelVisibility(boolean z10) {
        this.f5308I = z10;
        invalidate();
    }

    public final void setFixedAspectRatio(boolean z10) {
        if (this.f5301B != z10) {
            this.f5301B = z10;
            if (this.f5313N) {
                m4523n();
                invalidate();
            }
        }
    }

    public final void setGuidelines(CropImageView.Guidelines guidelines) {
        AbstractC9979u.m20294g(guidelines, "guidelines");
        if (this.f5305F != guidelines) {
            this.f5305F = guidelines;
            if (this.f5313N) {
                invalidate();
            }
        }
    }

    public final void setInitialAttributeValues(CropImageOptions options) {
        InterfaceC5898b interfaceC5898b;
        AbstractC9979u.m20294g(options, "options");
        boolean zM20289b = AbstractC9979u.m20289b(this.f5317e, options);
        CropImageOptions cropImageOptions = this.f5317e;
        boolean z10 = cropImageOptions == null || options.f5213v != cropImageOptions.f5213v || cropImageOptions == null || options.f5215w != cropImageOptions.f5215w || cropImageOptions == null || options.f5217x != cropImageOptions.f5217x;
        this.f5317e = options;
        this.f5321i.m4630v(options.f5161K, options.f5162L);
        this.f5321i.m4629u(options.f5163M, options.f5164N);
        if (zM20289b) {
            return;
        }
        this.f5321i.m4628t(options);
        this.f5311L = options.f5206r0;
        this.f5310K = options.f5204q0;
        String str = options.f5208s0;
        if (str == null) {
            str = "";
        }
        this.f5309J = str;
        this.f5308I = options.f5195m;
        this.f5315c = options.f5183g;
        this.f5307H = options.f5181f;
        this.f5306G = options.f5179e;
        this.f5338z = options.f5185h;
        setEnabled(options.f5207s);
        this.f5305F = options.f5189j;
        this.f5301B = options.f5213v;
        setAspectRatioX(options.f5215w);
        setAspectRatioY(options.f5217x);
        boolean z11 = options.f5203q;
        this.f5319g = z11;
        if (z11 && this.f5318f == null) {
            this.f5318f = new ScaleGestureDetector(getContext(), new C5899c());
        }
        this.f5320h = options.f5205r;
        this.f5337y = options.f5187i;
        this.f5336x = options.f5211u;
        C5897a c5897a = f5299P;
        this.f5324l = c5897a.m4536b(options.f5219y, options.f5220z);
        this.f5334v = options.f5152B;
        this.f5335w = options.f5153C;
        this.f5316d = Integer.valueOf(options.f5155E);
        this.f5325m = c5897a.m4536b(options.f5151A, options.f5154D);
        this.f5326n = c5897a.m4536b(options.f5156F, options.f5157G);
        this.f5327o = c5897a.m4535a(options.f5158H);
        this.f5328p = c5897a.m4538d(options);
        if (z10) {
            m4523n();
        }
        invalidate();
        if (!z10 || (interfaceC5898b = this.f5322j) == null) {
            return;
        }
        interfaceC5898b.mo4478a(false);
    }

    public final void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.f5312M;
        if (rect == null) {
            rect = C5903a.f5362a.m4582o();
        }
        rect2.set(rect);
        if (this.f5313N) {
            m4523n();
            invalidate();
            InterfaceC5898b interfaceC5898b = this.f5322j;
            if (interfaceC5898b != null) {
                interfaceC5898b.mo4478a(false);
            }
        }
    }

    public final void setSnapRadius(float f10) {
        this.f5338z = f10;
    }

    /* renamed from: t */
    public final void m4529t() {
        if (this.f5313N) {
            setCropWindowRect(C5903a.f5362a.m4583p());
            m4523n();
            invalidate();
        }
    }

    /* renamed from: u */
    public final void m4530u(float[] fArr, int i10, int i11) {
        if (fArr == null || !Arrays.equals(this.f5330r, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f5330r, 0.0f);
            } else {
                System.arraycopy(fArr, 0, this.f5330r, 0, fArr.length);
            }
            this.f5332t = i10;
            this.f5333u = i11;
            RectF rectFM4617i = this.f5321i.m4617i();
            if (rectFM4617i.width() == 0.0f || rectFM4617i.height() == 0.0f) {
                m4523n();
            }
        }
    }

    /* renamed from: v */
    public final boolean m4531v(boolean z10) {
        if (this.f5320h == z10) {
            return false;
        }
        this.f5320h = z10;
        return true;
    }

    /* renamed from: w */
    public final void m4532w(float f10, float f11, float f12, float f13) {
        this.f5321i.m4627s(f10, f11, f12, f13);
    }

    /* renamed from: x */
    public final boolean m4533x(boolean z10) {
        if (this.f5319g == z10) {
            return false;
        }
        this.f5319g = z10;
        if (!z10 || this.f5318f != null) {
            return true;
        }
        this.f5318f = new ScaleGestureDetector(getContext(), new C5899c());
        return true;
    }

    /* renamed from: y */
    public final void m4534y() {
        RectF rectFM4617i = this.f5321i.m4617i();
        List systemGestureExclusionRects = getSystemGestureExclusionRects();
        AbstractC9979u.m20293f(systemGestureExclusionRects, "getSystemGestureExclusionRects(...)");
        Rect rect = (Rect) (systemGestureExclusionRects.size() > 0 ? systemGestureExclusionRects.get(0) : new Rect());
        List systemGestureExclusionRects2 = getSystemGestureExclusionRects();
        AbstractC9979u.m20293f(systemGestureExclusionRects2, "getSystemGestureExclusionRects(...)");
        Rect rect2 = (Rect) (1 < systemGestureExclusionRects2.size() ? systemGestureExclusionRects2.get(1) : new Rect());
        List systemGestureExclusionRects3 = getSystemGestureExclusionRects();
        AbstractC9979u.m20293f(systemGestureExclusionRects3, "getSystemGestureExclusionRects(...)");
        Rect rect3 = (Rect) (2 < systemGestureExclusionRects3.size() ? systemGestureExclusionRects3.get(2) : new Rect());
        float f10 = rectFM4617i.left;
        float f11 = this.f5337y;
        int i10 = (int) (f10 - f11);
        rect.left = i10;
        int i11 = (int) (rectFM4617i.right + f11);
        rect.right = i11;
        float f12 = rectFM4617i.top;
        int i12 = (int) (f12 - f11);
        rect.top = i12;
        float f13 = this.f5314O;
        rect.bottom = (int) (i12 + (f13 * 0.3f));
        rect2.left = i10;
        rect2.right = i11;
        float f14 = rectFM4617i.bottom;
        int i13 = (int) (((f12 + f14) / 2.0f) - (0.2f * f13));
        rect2.top = i13;
        rect2.bottom = (int) (i13 + (0.4f * f13));
        rect3.left = rect.left;
        rect3.right = rect.right;
        int i14 = (int) (f14 + f11);
        rect3.bottom = i14;
        rect3.top = (int) (i14 - (f13 * 0.3f));
        setSystemGestureExclusionRects(AbstractC10978w.m24139q(rect, rect2, rect3));
    }

    public /* synthetic */ CropOverlayView(Context context, AttributeSet attributeSet, int i10, AbstractC9972n abstractC9972n) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9979u.m20294g(context, "context");
        this.f5320h = true;
        this.f5321i = new C5906d();
        this.f5323k = new RectF();
        this.f5329q = new Path();
        this.f5330r = new float[8];
        this.f5331s = new RectF();
        this.f5304E = this.f5302C / this.f5303D;
        this.f5309J = "";
        this.f5310K = 20.0f;
        this.f5311L = -1;
        this.f5312M = new Rect();
        this.f5314O = TypedValue.applyDimension(1, 200.0f, Resources.getSystem().getDisplayMetrics());
    }
}
