package com.xuexiang.xui.widget.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v4.media.AbstractC0037f;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$styleable;
import kotlin.collections.AbstractC5806u;
import p073h4.AbstractC5625a;
import p089j3.InterfaceC5743b;
import p089j3.RunnableC5742a;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class CircleProgressView extends View {

    /* renamed from: z */
    public static final /* synthetic */ int f4638z = 0;

    /* renamed from: a */
    public float f4639a;

    /* renamed from: b */
    public int f4640b;

    /* renamed from: c */
    public int f4641c;

    /* renamed from: d */
    public boolean f4642d;

    /* renamed from: e */
    public boolean f4643e;

    /* renamed from: f */
    public int f4644f;

    /* renamed from: g */
    public int f4645g;

    /* renamed from: h */
    public int f4646h;

    /* renamed from: i */
    public int f4647i;

    /* renamed from: j */
    public boolean f4648j;

    /* renamed from: k */
    public int f4649k;

    /* renamed from: l */
    public boolean f4650l;

    /* renamed from: m */
    public float f4651m;

    /* renamed from: n */
    public final Paint f4652n;

    /* renamed from: o */
    public final Paint f4653o;

    /* renamed from: p */
    public LinearGradient f4654p;

    /* renamed from: q */
    public RectF f4655q;

    /* renamed from: r */
    public BaseInterpolator f4656r;

    /* renamed from: s */
    public final Path f4657s;

    /* renamed from: t */
    public float f4658t;

    /* renamed from: u */
    public float f4659u;

    /* renamed from: v */
    public int f4660v;

    /* renamed from: w */
    public boolean f4661w;

    /* renamed from: x */
    public int f4662x;

    /* renamed from: y */
    public PathDashPathEffect f4663y;

    public CircleProgressView(Context context) {
        this(context, null);
    }

    private void setObjectAnimatorType(int i) {
        if (i == 0) {
            if (this.f4656r != null) {
                this.f4656r = null;
            }
            this.f4656r = new AccelerateDecelerateInterpolator();
            return;
        }
        if (i == 1) {
            if (this.f4656r != null) {
                this.f4656r = null;
            }
            this.f4656r = new LinearInterpolator();
            return;
        }
        if (i == 2) {
            if (this.f4656r != null) {
                this.f4656r = null;
                this.f4656r = new AccelerateInterpolator();
                return;
            }
            return;
        }
        if (i == 3) {
            if (this.f4656r != null) {
                this.f4656r = null;
            }
            this.f4656r = new DecelerateInterpolator();
        } else {
            if (i != 4) {
                return;
            }
            if (this.f4656r != null) {
                this.f4656r = null;
            }
            this.f4656r = new OvershootInterpolator();
        }
    }

    /* renamed from: a */
    public final void m3537a(boolean z8) {
        if (!z8) {
            this.f4663y = null;
            this.f4652n.setPathEffect(null);
            return;
        }
        if (this.f4663y == null) {
            this.f4663y = new PathDashPathEffect(this.f4657s, this.f4660v, 0.0f, PathDashPathEffect.Style.ROTATE);
        }
        this.f4652n.setPathEffect(this.f4663y);
    }

    /* renamed from: b */
    public final void m3538b() {
        invalidate();
        requestLayout();
    }

    /* renamed from: c */
    public final void m3539c() {
        if (this.f4655q != null) {
            this.f4655q = null;
        }
        this.f4655q = new RectF(getPaddingLeft() + this.f4644f, getPaddingTop() + this.f4644f, (getWidth() - getPaddingRight()) - this.f4644f, (getHeight() - getPaddingBottom()) - this.f4644f);
    }

    public float getProgress() {
        return this.f4651m;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4642d) {
            this.f4653o.setShader(null);
            this.f4653o.setColor(this.f4649k);
            boolean z8 = this.f4643e;
            if (z8) {
                this.f4653o.setStyle(Paint.Style.FILL);
            } else {
                this.f4653o.setStyle(Paint.Style.STROKE);
            }
            if (this.f4648j) {
                canvas.drawArc(this.f4655q, 135.0f, 270.0f, z8, this.f4653o);
            } else {
                canvas.drawArc(this.f4655q, 90.0f, 360.0f, z8, this.f4653o);
            }
        }
        this.f4652n.setShader(this.f4654p);
        m3539c();
        boolean z9 = this.f4643e;
        if (z9) {
            this.f4652n.setStyle(Paint.Style.FILL);
        } else {
            this.f4652n.setStyle(Paint.Style.STROKE);
        }
        if (this.f4648j) {
            RectF rectF = this.f4655q;
            float f = this.f4639a;
            canvas.drawArc(rectF, (f * 2.7f) + 135.0f, (this.f4651m - f) * 2.7f, z9, this.f4652n);
        } else {
            RectF rectF2 = this.f4655q;
            float f7 = this.f4639a;
            canvas.drawArc(rectF2, (f7 * 3.6f) + 270.0f, (this.f4651m - f7) * 3.6f, z9, this.f4652n);
        }
        if (this.f4650l) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextSize(this.f4646h);
            paint.setColor(this.f4647i);
            paint.setTextAlign(Paint.Align.CENTER);
            AbstractC6582a.m6218b();
            paint.setTypeface(null);
            canvas.drawText(AbstractC0037f.m90o(new StringBuilder(), "%", (int) this.f4651m), ((getPaddingLeft() + getWidth()) - getPaddingRight()) >> 1, (((getPaddingTop() + getHeight()) - getPaddingBottom()) - (paint.ascent() + paint.descent())) / 2.0f, paint);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        m3539c();
        RectF rectF = this.f4655q;
        this.f4654p = new LinearGradient(rectF.left - 200.0f, rectF.top - 200.0f, rectF.right + 20.0f, rectF.bottom + 20.0f, this.f4640b, this.f4641c, Shader.TileMode.CLAMP);
        RectF rectF2 = new RectF(0.0f, 0.0f, this.f4658t, this.f4659u);
        int i11 = this.f4662x;
        this.f4657s.addRoundRect(rectF2, i11, i11, Path.Direction.CW);
    }

    public void setAnimateType(int i) {
        setObjectAnimatorType(i);
    }

    public void setCircleBroken(boolean z8) {
        this.f4648j = z8;
        m3538b();
    }

    public void setEndColor(@ColorInt int i) {
        this.f4641c = i;
        m3539c();
        RectF rectF = this.f4655q;
        this.f4654p = new LinearGradient(rectF.left - 200.0f, rectF.top - 200.0f, rectF.right + 20.0f, 20.0f + rectF.bottom, this.f4640b, this.f4641c, Shader.TileMode.CLAMP);
        m3538b();
    }

    public void setEndProgress(float f) {
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("Illegal progress value, please change it!");
        }
        m3538b();
    }

    public void setFillEnabled(boolean z8) {
        this.f4643e = z8;
        m3538b();
    }

    public void setGraduatedEnabled(boolean z8) {
        this.f4661w = z8;
        post(new RunnableC5742a(this, z8));
    }

    public void setProgress(float f) {
        this.f4651m = f;
        m3538b();
    }

    public void setProgressDuration(int i) {
    }

    public void setProgressTextColor(@ColorInt int i) {
        this.f4647i = i;
    }

    public void setProgressTextSize(int i) {
        this.f4646h = AbstractC5625a.m4954n(getContext(), i);
        m3538b();
    }

    public void setProgressTextVisibility(boolean z8) {
        this.f4650l = z8;
    }

    public void setProgressWidth(int i) {
        float f = i;
        this.f4645g = AbstractC5625a.m4948h(getContext(), f);
        this.f4652n.setStrokeWidth(f);
        m3538b();
    }

    public void setScaleZoneCornerRadius(int i) {
        this.f4662x = AbstractC5625a.m4948h(getContext(), i);
    }

    public void setScaleZoneLength(float f) {
        this.f4659u = AbstractC5625a.m4948h(getContext(), f);
    }

    public void setScaleZonePadding(int i) {
        this.f4660v = AbstractC5625a.m4948h(getContext(), i);
    }

    public void setScaleZoneWidth(float f) {
        this.f4658t = AbstractC5625a.m4948h(getContext(), f);
    }

    public void setStartColor(@ColorInt int i) {
        this.f4640b = i;
        m3539c();
        RectF rectF = this.f4655q;
        this.f4654p = new LinearGradient(rectF.left - 200.0f, rectF.top - 200.0f, rectF.right + 20.0f, 20.0f + rectF.bottom, this.f4640b, this.f4641c, Shader.TileMode.CLAMP);
        m3538b();
    }

    public void setStartProgress(float f) {
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("Illegal progress value, please change it!");
        }
        this.f4639a = f;
        this.f4651m = f;
        m3538b();
    }

    public void setTrackColor(@ColorInt int i) {
        this.f4649k = i;
        m3538b();
    }

    public void setTrackEnabled(boolean z8) {
        this.f4642d = z8;
        m3538b();
    }

    public void setTrackWidth(int i) {
        float f = i;
        this.f4644f = AbstractC5625a.m4948h(getContext(), f);
        this.f4653o.setStrokeWidth(f);
        m3539c();
        m3538b();
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.CircleProgressViewStyle);
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4639a = 0.0f;
        this.f4640b = getResources().getColor(R$color.xui_config_color_light_orange);
        this.f4641c = getResources().getColor(R$color.xui_config_color_dark_orange);
        this.f4649k = getResources().getColor(R$color.default_pv_track_color);
        this.f4651m = 0.0f;
        this.f4661w = false;
        this.f4662x = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CircleProgressView, i, 0);
        this.f4639a = typedArrayObtainStyledAttributes.getInt(R$styleable.CircleProgressView_cpv_start_progress, 0);
        typedArrayObtainStyledAttributes.getInt(R$styleable.CircleProgressView_cpv_end_progress, 60);
        this.f4640b = typedArrayObtainStyledAttributes.getColor(R$styleable.CircleProgressView_cpv_start_color, getResources().getColor(R$color.xui_config_color_light_orange));
        this.f4641c = typedArrayObtainStyledAttributes.getColor(R$styleable.CircleProgressView_cpv_end_color, getResources().getColor(R$color.xui_config_color_dark_orange));
        this.f4643e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CircleProgressView_cpv_isFilled, false);
        this.f4642d = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CircleProgressView_cpv_isTracked, false);
        this.f4648j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CircleProgressView_cpv_circle_broken, false);
        this.f4647i = typedArrayObtainStyledAttributes.getColor(R$styleable.CircleProgressView_cpv_progress_textColor, AbstractC5806u.m5252F(getContext(), R$attr.colorAccent, 0));
        this.f4646h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleProgressView_cpv_progress_textSize, getResources().getDimensionPixelSize(R$dimen.default_pv_progress_text_size));
        this.f4644f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleProgressView_cpv_track_width, getResources().getDimensionPixelSize(R$dimen.default_pv_trace_width));
        this.f4645g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleProgressView_cpv_progress_width, getResources().getDimensionPixelSize(R$dimen.default_pv_trace_width));
        typedArrayObtainStyledAttributes.getInt(R$styleable.CircleProgressView_cpv_animate_type, 0);
        this.f4649k = typedArrayObtainStyledAttributes.getColor(R$styleable.CircleProgressView_cpv_track_color, getResources().getColor(R$color.default_pv_track_color));
        this.f4650l = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CircleProgressView_cpv_progress_textVisibility, true);
        typedArrayObtainStyledAttributes.getInt(R$styleable.CircleProgressView_cpv_progress_duration, 1200);
        this.f4659u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleProgressView_cpv_scaleZone_length, getResources().getDimensionPixelSize(R$dimen.default_pv_zone_length));
        this.f4658t = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleProgressView_cpv_scaleZone_width, getResources().getDimensionPixelSize(R$dimen.default_pv_zone_width));
        this.f4660v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleProgressView_cpv_scaleZone_padding, getResources().getDimensionPixelSize(R$dimen.default_pv_zone_padding));
        this.f4662x = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleProgressView_cpv_scaleZone_corner_radius, getResources().getDimensionPixelSize(R$dimen.default_pv_zone_corner_radius));
        this.f4661w = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CircleProgressView_cpv_isGraduated, false);
        this.f4651m = this.f4639a;
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f4652n = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f4652n;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.f4652n.setStrokeWidth(this.f4645g);
        Paint paint3 = new Paint(1);
        this.f4653o = paint3;
        paint3.setStyle(style);
        this.f4653o.setStrokeCap(cap);
        this.f4653o.setStrokeWidth(this.f4644f);
        this.f4657s = new Path();
        m3537a(this.f4661w);
    }

    public void setProgressViewUpdateListener(InterfaceC5743b interfaceC5743b) {
    }
}
