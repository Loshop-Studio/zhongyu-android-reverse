package com.xuexiang.xui.widget.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8041g;
import p420y7.AbstractC11916b;

/* loaded from: classes5.dex */
public class CircleProgressView extends View {

    /* renamed from: A */
    public int f16687A;

    /* renamed from: B */
    public boolean f16688B;

    /* renamed from: C */
    public int f16689C;

    /* renamed from: D */
    public PathEffect f16690D;

    /* renamed from: c */
    public int f16691c;

    /* renamed from: d */
    public float f16692d;

    /* renamed from: e */
    public float f16693e;

    /* renamed from: f */
    public int f16694f;

    /* renamed from: g */
    public int f16695g;

    /* renamed from: h */
    public boolean f16696h;

    /* renamed from: i */
    public boolean f16697i;

    /* renamed from: j */
    public int f16698j;

    /* renamed from: k */
    public int f16699k;

    /* renamed from: l */
    public int f16700l;

    /* renamed from: m */
    public int f16701m;

    /* renamed from: n */
    public boolean f16702n;

    /* renamed from: o */
    public int f16703o;

    /* renamed from: p */
    public int f16704p;

    /* renamed from: q */
    public boolean f16705q;

    /* renamed from: r */
    public float f16706r;

    /* renamed from: s */
    public Paint f16707s;

    /* renamed from: t */
    public Paint f16708t;

    /* renamed from: u */
    public LinearGradient f16709u;

    /* renamed from: v */
    public RectF f16710v;

    /* renamed from: w */
    public Interpolator f16711w;

    /* renamed from: x */
    public Path f16712x;

    /* renamed from: y */
    public float f16713y;

    /* renamed from: z */
    public float f16714z;

    /* renamed from: com.xuexiang.xui.widget.progress.CircleProgressView$a */
    public class RunnableC8202a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ boolean f16715c;

        public RunnableC8202a(boolean z10) {
            this.f16715c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            CircleProgressView.this.m13079d(this.f16715c);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.progress.CircleProgressView$b */
    public interface InterfaceC8203b {
    }

    public CircleProgressView(Context context) {
        this(context, null);
    }

    private void setObjectAnimatorType(int i10) {
        if (i10 == 0) {
            if (this.f16711w != null) {
                this.f16711w = null;
            }
            this.f16711w = new AccelerateDecelerateInterpolator();
            return;
        }
        if (i10 == 1) {
            if (this.f16711w != null) {
                this.f16711w = null;
            }
            this.f16711w = new LinearInterpolator();
            return;
        }
        if (i10 == 2) {
            if (this.f16711w != null) {
                this.f16711w = null;
                this.f16711w = new AccelerateInterpolator();
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (this.f16711w != null) {
                this.f16711w = null;
            }
            this.f16711w = new DecelerateInterpolator();
        } else {
            if (i10 != 4) {
                return;
            }
            if (this.f16711w != null) {
                this.f16711w = null;
            }
            this.f16711w = new OvershootInterpolator();
        }
    }

    /* renamed from: b */
    public final void m13077b(Canvas canvas) {
        this.f16707s.setShader(this.f16709u);
        m13086k();
        m13082g(canvas, this.f16697i);
    }

    /* renamed from: c */
    public final void m13078c(Canvas canvas) {
        if (this.f16705q) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextSize(this.f16700l);
            paint.setColor(this.f16701m);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(AbstractC11916b.m26459c());
            canvas.drawText(((int) this.f16706r) + "%", ((getWidth() + getPaddingLeft()) - getPaddingRight()) >> 1, (((getHeight() + getPaddingTop()) - getPaddingBottom()) - (paint.descent() + paint.ascent())) / 2.0f, paint);
        }
    }

    /* renamed from: d */
    public final void m13079d(boolean z10) {
        if (!z10) {
            this.f16690D = null;
            this.f16707s.setPathEffect(null);
        } else {
            if (this.f16690D == null) {
                this.f16690D = new PathDashPathEffect(this.f16712x, this.f16687A, 0.0f, PathDashPathEffect.Style.ROTATE);
            }
            this.f16707s.setPathEffect(this.f16690D);
        }
    }

    /* renamed from: e */
    public final void m13080e(Canvas canvas) {
        if (this.f16696h) {
            this.f16708t.setShader(null);
            this.f16708t.setColor(this.f16703o);
            m13083h(canvas, this.f16697i);
        }
    }

    /* renamed from: f */
    public final void m13081f() {
        Paint paint = new Paint(1);
        this.f16707s = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f16707s;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.f16707s.setStrokeWidth(this.f16699k);
        Paint paint3 = new Paint(1);
        this.f16708t = paint3;
        paint3.setStyle(style);
        this.f16708t.setStrokeCap(cap);
        this.f16708t.setStrokeWidth(this.f16698j);
        this.f16712x = new Path();
        m13079d(this.f16688B);
    }

    /* renamed from: g */
    public final void m13082g(Canvas canvas, boolean z10) {
        if (z10) {
            this.f16707s.setStyle(Paint.Style.FILL);
        } else {
            this.f16707s.setStyle(Paint.Style.STROKE);
        }
        if (this.f16702n) {
            RectF rectF = this.f16710v;
            float f10 = this.f16692d;
            canvas.drawArc(rectF, (f10 * 2.7f) + 135.0f, (this.f16706r - f10) * 2.7f, z10, this.f16707s);
        } else {
            RectF rectF2 = this.f16710v;
            float f11 = this.f16692d;
            canvas.drawArc(rectF2, (f11 * 3.6f) + 270.0f, (this.f16706r - f11) * 3.6f, z10, this.f16707s);
        }
    }

    public float getProgress() {
        return this.f16706r;
    }

    /* renamed from: h */
    public final void m13083h(Canvas canvas, boolean z10) {
        if (z10) {
            this.f16708t.setStyle(Paint.Style.FILL);
        } else {
            this.f16708t.setStyle(Paint.Style.STROKE);
        }
        if (this.f16702n) {
            canvas.drawArc(this.f16710v, 135.0f, 270.0f, z10, this.f16708t);
        } else {
            canvas.drawArc(this.f16710v, 90.0f, 360.0f, z10, this.f16708t);
        }
    }

    /* renamed from: i */
    public final void m13084i(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CircleProgressView, i10, 0);
        this.f16692d = typedArrayObtainStyledAttributes.getInt(R$styleable.CircleProgressView_cpv_start_progress, 0);
        this.f16693e = typedArrayObtainStyledAttributes.getInt(R$styleable.CircleProgressView_cpv_end_progress, 60);
        this.f16694f = typedArrayObtainStyledAttributes.getColor(R$styleable.CircleProgressView_cpv_start_color, getResources().getColor(R$color.xui_config_color_light_orange));
        this.f16695g = typedArrayObtainStyledAttributes.getColor(R$styleable.CircleProgressView_cpv_end_color, getResources().getColor(R$color.xui_config_color_dark_orange));
        this.f16697i = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CircleProgressView_cpv_isFilled, false);
        this.f16696h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CircleProgressView_cpv_isTracked, false);
        this.f16702n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CircleProgressView_cpv_circle_broken, false);
        this.f16701m = typedArrayObtainStyledAttributes.getColor(R$styleable.CircleProgressView_cpv_progress_textColor, AbstractC8041g.m12217d(getContext(), R$attr.colorAccent));
        this.f16700l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleProgressView_cpv_progress_textSize, getResources().getDimensionPixelSize(R$dimen.default_pv_progress_text_size));
        this.f16698j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleProgressView_cpv_track_width, getResources().getDimensionPixelSize(R$dimen.default_pv_trace_width));
        this.f16699k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleProgressView_cpv_progress_width, getResources().getDimensionPixelSize(R$dimen.default_pv_trace_width));
        this.f16691c = typedArrayObtainStyledAttributes.getInt(R$styleable.CircleProgressView_cpv_animate_type, 0);
        this.f16703o = typedArrayObtainStyledAttributes.getColor(R$styleable.CircleProgressView_cpv_track_color, getResources().getColor(R$color.default_pv_track_color));
        this.f16705q = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CircleProgressView_cpv_progress_textVisibility, true);
        this.f16704p = typedArrayObtainStyledAttributes.getInt(R$styleable.CircleProgressView_cpv_progress_duration, 1200);
        this.f16714z = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleProgressView_cpv_scaleZone_length, getResources().getDimensionPixelSize(R$dimen.default_pv_zone_length));
        this.f16713y = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleProgressView_cpv_scaleZone_width, getResources().getDimensionPixelSize(R$dimen.default_pv_zone_width));
        this.f16687A = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleProgressView_cpv_scaleZone_padding, getResources().getDimensionPixelSize(R$dimen.default_pv_zone_padding));
        this.f16689C = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleProgressView_cpv_scaleZone_corner_radius, getResources().getDimensionPixelSize(R$dimen.default_pv_zone_corner_radius));
        this.f16688B = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CircleProgressView_cpv_isGraduated, false);
        this.f16706r = this.f16692d;
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: j */
    public final void m13085j() {
        invalidate();
        requestLayout();
    }

    /* renamed from: k */
    public final void m13086k() {
        if (this.f16710v != null) {
            this.f16710v = null;
        }
        this.f16710v = new RectF(getPaddingLeft() + this.f16698j, getPaddingTop() + this.f16698j, (getWidth() - getPaddingRight()) - this.f16698j, (getHeight() - getPaddingBottom()) - this.f16698j);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m13080e(canvas);
        m13077b(canvas);
        m13078c(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m13086k();
        RectF rectF = this.f16710v;
        this.f16709u = new LinearGradient(rectF.left - 200.0f, rectF.top - 200.0f, rectF.right + 20.0f, rectF.bottom + 20.0f, this.f16694f, this.f16695g, Shader.TileMode.CLAMP);
        RectF rectF2 = new RectF(0.0f, 0.0f, this.f16713y, this.f16714z);
        Path path = this.f16712x;
        int i14 = this.f16689C;
        path.addRoundRect(rectF2, i14, i14, Path.Direction.CW);
    }

    public void setAnimateType(int i10) {
        this.f16691c = i10;
        setObjectAnimatorType(i10);
    }

    public void setCircleBroken(boolean z10) {
        this.f16702n = z10;
        m13085j();
    }

    public void setEndColor(@ColorInt int i10) {
        this.f16695g = i10;
        m13086k();
        RectF rectF = this.f16710v;
        this.f16709u = new LinearGradient(rectF.left - 200.0f, rectF.top - 200.0f, rectF.right + 20.0f, 20.0f + rectF.bottom, this.f16694f, this.f16695g, Shader.TileMode.CLAMP);
        m13085j();
    }

    public void setEndProgress(float f10) {
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("Illegal progress value, please change it!");
        }
        this.f16693e = f10;
        m13085j();
    }

    public void setFillEnabled(boolean z10) {
        this.f16697i = z10;
        m13085j();
    }

    public void setGraduatedEnabled(boolean z10) {
        this.f16688B = z10;
        post(new RunnableC8202a(z10));
    }

    public void setProgress(float f10) {
        this.f16706r = f10;
        m13085j();
    }

    public void setProgressDuration(int i10) {
        this.f16704p = i10;
    }

    public void setProgressTextColor(@ColorInt int i10) {
        this.f16701m = i10;
    }

    public void setProgressTextSize(int i10) {
        this.f16700l = AbstractC8037c.m12190d(getContext(), i10);
        m13085j();
    }

    public void setProgressTextVisibility(boolean z10) {
        this.f16705q = z10;
    }

    public void setProgressViewUpdateListener(InterfaceC8203b interfaceC8203b) {
    }

    public void setProgressWidth(int i10) {
        float f10 = i10;
        this.f16699k = AbstractC8037c.m12188b(getContext(), f10);
        this.f16707s.setStrokeWidth(f10);
        m13085j();
    }

    public void setScaleZoneCornerRadius(int i10) {
        this.f16689C = AbstractC8037c.m12188b(getContext(), i10);
    }

    public void setScaleZoneLength(float f10) {
        this.f16714z = AbstractC8037c.m12188b(getContext(), f10);
    }

    public void setScaleZonePadding(int i10) {
        this.f16687A = AbstractC8037c.m12188b(getContext(), i10);
    }

    public void setScaleZoneWidth(float f10) {
        this.f16713y = AbstractC8037c.m12188b(getContext(), f10);
    }

    public void setStartColor(@ColorInt int i10) {
        this.f16694f = i10;
        m13086k();
        RectF rectF = this.f16710v;
        this.f16709u = new LinearGradient(rectF.left - 200.0f, rectF.top - 200.0f, rectF.right + 20.0f, 20.0f + rectF.bottom, this.f16694f, this.f16695g, Shader.TileMode.CLAMP);
        m13085j();
    }

    public void setStartProgress(float f10) {
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("Illegal progress value, please change it!");
        }
        this.f16692d = f10;
        this.f16706r = f10;
        m13085j();
    }

    public void setTrackColor(@ColorInt int i10) {
        this.f16703o = i10;
        m13085j();
    }

    public void setTrackEnabled(boolean z10) {
        this.f16696h = z10;
        m13085j();
    }

    public void setTrackWidth(int i10) {
        float f10 = i10;
        this.f16698j = AbstractC8037c.m12188b(getContext(), f10);
        this.f16708t.setStrokeWidth(f10);
        m13086k();
        m13085j();
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.CircleProgressViewStyle);
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16691c = 0;
        this.f16692d = 0.0f;
        this.f16693e = 60.0f;
        this.f16694f = getResources().getColor(R$color.xui_config_color_light_orange);
        this.f16695g = getResources().getColor(R$color.xui_config_color_dark_orange);
        this.f16703o = getResources().getColor(R$color.default_pv_track_color);
        this.f16704p = 1200;
        this.f16706r = 0.0f;
        this.f16688B = false;
        this.f16689C = 0;
        m13084i(context, attributeSet, i10);
        m13081f();
    }
}
