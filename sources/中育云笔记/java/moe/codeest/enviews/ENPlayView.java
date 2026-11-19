package moe.codeest.enviews;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnticipateInterpolator;
import com.shuyu.gsyvideoplayer.R$styleable;

/* loaded from: classes6.dex */
public class ENPlayView extends View {

    /* renamed from: s */
    public static int f24428s = 0;

    /* renamed from: t */
    public static int f24429t = 1;

    /* renamed from: u */
    public static int f24430u = -1;

    /* renamed from: v */
    public static int f24431v = -328966;

    /* renamed from: w */
    public static int f24432w = 4;

    /* renamed from: x */
    public static int f24433x = 4;

    /* renamed from: y */
    public static int f24434y = 1200;

    /* renamed from: c */
    public int f24435c;

    /* renamed from: d */
    public Paint f24436d;

    /* renamed from: e */
    public Paint f24437e;

    /* renamed from: f */
    public int f24438f;

    /* renamed from: g */
    public int f24439g;

    /* renamed from: h */
    public int f24440h;

    /* renamed from: i */
    public int f24441i;

    /* renamed from: j */
    public int f24442j;

    /* renamed from: k */
    public RectF f24443k;

    /* renamed from: l */
    public RectF f24444l;

    /* renamed from: m */
    public float f24445m;

    /* renamed from: n */
    public Path f24446n;

    /* renamed from: o */
    public Path f24447o;

    /* renamed from: p */
    public PathMeasure f24448p;

    /* renamed from: q */
    public float f24449q;

    /* renamed from: r */
    public int f24450r;

    /* renamed from: moe.codeest.enviews.ENPlayView$a */
    public class C10269a implements ValueAnimator.AnimatorUpdateListener {
        public C10269a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ENPlayView.this.f24445m = 1.0f - valueAnimator.getAnimatedFraction();
            ENPlayView.this.invalidate();
        }
    }

    /* renamed from: moe.codeest.enviews.ENPlayView$b */
    public class C10270b implements ValueAnimator.AnimatorUpdateListener {
        public C10270b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ENPlayView.this.f24445m = valueAnimator.getAnimatedFraction();
            ENPlayView.this.invalidate();
        }
    }

    public ENPlayView(Context context) {
        super(context);
        this.f24435c = f24429t;
        this.f24445m = 1.0f;
    }

    /* renamed from: b */
    public final int m21393b(int i10) {
        return (int) TypedValue.applyDimension(1, i10, getContext().getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public void m21394c() {
        int i10 = this.f24435c;
        int i11 = f24429t;
        if (i10 == i11) {
            return;
        }
        this.f24435c = i11;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(this.f24450r);
        valueAnimatorOfFloat.setInterpolator(new AnticipateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C10270b());
        if (valueAnimatorOfFloat.isRunning()) {
            return;
        }
        valueAnimatorOfFloat.start();
    }

    /* renamed from: d */
    public void m21395d() {
        int i10 = this.f24435c;
        int i11 = f24428s;
        if (i10 == i11) {
            return;
        }
        this.f24435c = i11;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(this.f24450r);
        valueAnimatorOfFloat.setInterpolator(new AnticipateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C10269a());
        if (valueAnimatorOfFloat.isRunning()) {
            return;
        }
        valueAnimatorOfFloat.start();
    }

    public int getCurrentState() {
        return this.f24435c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f24440h, this.f24441i, this.f24438f / 2, this.f24437e);
        float f10 = this.f24445m;
        if (f10 < 0.0f) {
            int i10 = this.f24440h;
            int i11 = this.f24442j;
            int i12 = this.f24441i;
            canvas.drawLine(i10 + i11, (i12 - (i11 * 1.6f)) + (i11 * 10 * f10), i10 + i11, i12 + (i11 * 1.6f) + (i11 * 10 * f10), this.f24436d);
            int i13 = this.f24440h;
            int i14 = this.f24442j;
            int i15 = this.f24441i;
            canvas.drawLine(i13 - i14, i15 - (i14 * 1.6f), i13 - i14, i15 + (i14 * 1.6f), this.f24436d);
            canvas.drawArc(this.f24444l, -105.0f, 360.0f, false, this.f24436d);
            return;
        }
        if (f10 <= 0.3d) {
            int i16 = this.f24440h;
            int i17 = this.f24442j;
            int i18 = this.f24441i;
            canvas.drawLine(i16 + i17, (i18 - (i17 * 1.6f)) + (((i17 * 3.2f) / 0.3f) * f10), i16 + i17, i18 + (i17 * 1.6f), this.f24436d);
            int i19 = this.f24440h;
            int i20 = this.f24442j;
            int i21 = this.f24441i;
            canvas.drawLine(i19 - i20, i21 - (i20 * 1.6f), i19 - i20, i21 + (i20 * 1.6f), this.f24436d);
            float f11 = this.f24445m;
            if (f11 != 0.0f) {
                canvas.drawArc(this.f24443k, 0.0f, f11 * 600.0f, false, this.f24436d);
            }
            canvas.drawArc(this.f24444l, (r1 * 360.0f) - 105.0f, (1.0f - this.f24445m) * 360.0f, false, this.f24436d);
            return;
        }
        if (f10 <= 0.6d) {
            canvas.drawArc(this.f24443k, (f10 - 0.3f) * 600.0f, 180.0f - ((f10 - 0.3f) * 600.0f), false, this.f24436d);
            this.f24447o.reset();
            PathMeasure pathMeasure = this.f24448p;
            float f12 = this.f24449q;
            pathMeasure.getSegment(0.02f * f12, (0.38f * f12) + (((f12 * 0.42f) / 0.3f) * (this.f24445m - 0.3f)), this.f24447o, true);
            canvas.drawPath(this.f24447o, this.f24436d);
            canvas.drawArc(this.f24444l, (r3 * 360.0f) - 105.0f, (1.0f - this.f24445m) * 360.0f, false, this.f24436d);
            return;
        }
        if (f10 > 0.8d) {
            this.f24447o.reset();
            this.f24448p.getSegment(this.f24442j * 10 * (this.f24445m - 1.0f), this.f24449q, this.f24447o, true);
            canvas.drawPath(this.f24447o, this.f24436d);
            return;
        }
        this.f24447o.reset();
        PathMeasure pathMeasure2 = this.f24448p;
        float f13 = this.f24449q;
        float f14 = this.f24445m;
        pathMeasure2.getSegment((0.02f * f13) + (((f13 * 0.2f) / 0.2f) * (f14 - 0.6f)), (0.8f * f13) + (((f13 * 0.2f) / 0.2f) * (f14 - 0.6f)), this.f24447o, true);
        canvas.drawPath(this.f24447o, this.f24436d);
        canvas.drawArc(this.f24444l, (r1 * 360.0f) - 105.0f, (1.0f - this.f24445m) * 360.0f, false, this.f24436d);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = (i10 * 9) / 10;
        this.f24438f = i14;
        this.f24439g = (i11 * 9) / 10;
        this.f24442j = i14 / m21393b(4);
        this.f24440h = i10 / 2;
        this.f24441i = i11 / 2;
        int i15 = this.f24440h;
        int i16 = this.f24442j;
        int i17 = this.f24441i;
        this.f24443k = new RectF(i15 - i16, i17 + (i16 * 0.6f), i15 + i16, i17 + (i16 * 2.6f));
        int i18 = this.f24440h;
        int i19 = this.f24438f;
        int i20 = this.f24441i;
        int i21 = this.f24439g;
        this.f24444l = new RectF(i18 - (i19 / 2), i20 - (i21 / 2), i18 + (i19 / 2), i20 + (i21 / 2));
        Path path = this.f24446n;
        int i22 = this.f24440h;
        path.moveTo(i22 - r7, this.f24441i + (this.f24442j * 1.8f));
        Path path2 = this.f24446n;
        int i23 = this.f24440h;
        path2.lineTo(i23 - r7, this.f24441i - (this.f24442j * 1.8f));
        this.f24446n.lineTo(this.f24440h + this.f24442j, this.f24441i);
        this.f24446n.close();
        this.f24448p.setPath(this.f24446n, false);
        this.f24449q = this.f24448p.getLength();
    }

    public void setDuration(int i10) {
        this.f24450r = i10;
    }

    public ENPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24435c = f24429t;
        this.f24445m = 1.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.play);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.play_play_line_color, f24430u);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.play_play_bg_line_color, f24431v);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.play_play_line_width, m21393b(f24432w));
        int integer2 = typedArrayObtainStyledAttributes.getInteger(R$styleable.play_play_bg_line_width, m21393b(f24433x));
        typedArrayObtainStyledAttributes.recycle();
        setLayerType(1, null);
        Paint paint = new Paint(1);
        this.f24436d = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f24436d;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.f24436d.setColor(color);
        this.f24436d.setStrokeWidth(integer);
        this.f24436d.setPathEffect(new CornerPathEffect(1.0f));
        Paint paint3 = new Paint(1);
        this.f24437e = paint3;
        paint3.setStyle(style);
        this.f24437e.setStrokeCap(cap);
        this.f24437e.setColor(color2);
        this.f24437e.setStrokeWidth(integer2);
        this.f24446n = new Path();
        this.f24447o = new Path();
        this.f24448p = new PathMeasure();
        this.f24450r = f24434y;
    }
}
