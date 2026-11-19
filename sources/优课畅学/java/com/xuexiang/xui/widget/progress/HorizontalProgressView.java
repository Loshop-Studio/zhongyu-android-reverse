package com.xuexiang.xui.widget.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
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
import com.xuexiang.xui.utils.AbstractC6872b;
import com.xuexiang.xui.utils.AbstractC6877g;

/* loaded from: classes4.dex */
public class HorizontalProgressView extends View {

    /* renamed from: a */
    public int f8024a;

    /* renamed from: b */
    public float f8025b;

    /* renamed from: c */
    public float f8026c;

    /* renamed from: d */
    public int f8027d;

    /* renamed from: e */
    public int f8028e;

    /* renamed from: f */
    public boolean f8029f;

    /* renamed from: g */
    public int f8030g;

    /* renamed from: h */
    public int f8031h;

    /* renamed from: i */
    public int f8032i;

    /* renamed from: j */
    public int f8033j;

    /* renamed from: k */
    public int f8034k;

    /* renamed from: l */
    public boolean f8035l;

    /* renamed from: m */
    public int f8036m;

    /* renamed from: n */
    public int f8037n;

    /* renamed from: o */
    public boolean f8038o;

    /* renamed from: p */
    public float f8039p;

    /* renamed from: q */
    public Paint f8040q;

    /* renamed from: r */
    public LinearGradient f8041r;

    /* renamed from: s */
    public RectF f8042s;

    /* renamed from: t */
    public RectF f8043t;

    /* renamed from: u */
    public Interpolator f8044u;

    /* renamed from: com.xuexiang.xui.widget.progress.HorizontalProgressView$a */
    public interface InterfaceC6971a {
    }

    public HorizontalProgressView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.HorizontalProgressViewStyle);
    }

    private void setObjectAnimatorType(int i10) {
        if (i10 == 0) {
            if (this.f8044u != null) {
                this.f8044u = null;
            }
            this.f8044u = new AccelerateDecelerateInterpolator();
            return;
        }
        if (i10 == 1) {
            if (this.f8044u != null) {
                this.f8044u = null;
            }
            this.f8044u = new LinearInterpolator();
            return;
        }
        if (i10 == 2) {
            if (this.f8044u != null) {
                this.f8044u = null;
                this.f8044u = new AccelerateInterpolator();
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (this.f8044u != null) {
                this.f8044u = null;
            }
            this.f8044u = new DecelerateInterpolator();
        } else {
            if (i10 != 4) {
                return;
            }
            if (this.f8044u != null) {
                this.f8044u = null;
            }
            this.f8044u = new OvershootInterpolator();
        }
    }

    /* renamed from: a */
    public final void m7075a(Canvas canvas) {
        if (this.f8035l) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextSize(this.f8031h);
            paint.setColor(this.f8032i);
            paint.setTextAlign(Paint.Align.CENTER);
            String str = ((int) this.f8039p) + "%";
            if (this.f8038o) {
                canvas.drawText(str, ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - AbstractC6872b.m6425a(getContext(), 28.0f)) * (this.f8039p / 100.0f)) + AbstractC6872b.m6425a(getContext(), 10.0f), ((getHeight() / 2.0f) - getPaddingTop()) - this.f8037n, paint);
            } else {
                canvas.drawText(str, (getWidth() - getPaddingLeft()) / 2.0f, ((getHeight() / 2.0f) - getPaddingTop()) - this.f8037n, paint);
            }
        }
    }

    /* renamed from: b */
    public final void m7076b(Canvas canvas) {
        if (this.f8029f) {
            this.f8040q.setShader(null);
            this.f8040q.setColor(this.f8033j);
            RectF rectF = this.f8043t;
            int i10 = this.f8036m;
            canvas.drawRoundRect(rectF, i10, i10, this.f8040q);
        }
    }

    /* renamed from: c */
    public final void m7077c() {
        Paint paint = new Paint(1);
        this.f8040q = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    /* renamed from: d */
    public final void m7078d(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.HorizontalProgressView, i10, 0);
        this.f8025b = typedArrayObtainStyledAttributes.getInt(R$styleable.HorizontalProgressView_hpv_start_progress, 0);
        this.f8026c = typedArrayObtainStyledAttributes.getInt(R$styleable.HorizontalProgressView_hpv_end_progress, 60);
        this.f8027d = typedArrayObtainStyledAttributes.getColor(R$styleable.HorizontalProgressView_hpv_start_color, getResources().getColor(R$color.xui_config_color_light_orange));
        this.f8028e = typedArrayObtainStyledAttributes.getColor(R$styleable.HorizontalProgressView_hpv_end_color, getResources().getColor(R$color.xui_config_color_dark_orange));
        this.f8029f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.HorizontalProgressView_hpv_isTracked, false);
        this.f8032i = typedArrayObtainStyledAttributes.getColor(R$styleable.HorizontalProgressView_hpv_progress_textColor, AbstractC6877g.m6472f(getContext()));
        this.f8031h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HorizontalProgressView_hpv_progress_textSize, getResources().getDimensionPixelSize(R$dimen.default_pv_horizontal_text_size));
        this.f8030g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HorizontalProgressView_hpv_track_width, getResources().getDimensionPixelSize(R$dimen.default_pv_trace_width));
        this.f8024a = typedArrayObtainStyledAttributes.getInt(R$styleable.HorizontalProgressView_hpv_animate_type, 0);
        this.f8033j = typedArrayObtainStyledAttributes.getColor(R$styleable.HorizontalProgressView_hpv_track_color, getResources().getColor(R$color.default_pv_track_color));
        this.f8035l = typedArrayObtainStyledAttributes.getBoolean(R$styleable.HorizontalProgressView_hpv_progress_textVisibility, true);
        this.f8034k = typedArrayObtainStyledAttributes.getInt(R$styleable.HorizontalProgressView_hpv_progress_duration, 1200);
        this.f8036m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HorizontalProgressView_hpv_corner_radius, getResources().getDimensionPixelSize(R$dimen.default_pv_corner_radius));
        this.f8037n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HorizontalProgressView_hpv_text_padding_bottom, getResources().getDimensionPixelSize(R$dimen.default_pv_corner_radius));
        this.f8038o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.HorizontalProgressView_hpv_text_movedEnable, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f8039p = this.f8025b;
        setAnimateType(this.f8024a);
    }

    /* renamed from: e */
    public final void m7079e() {
        invalidate();
    }

    /* renamed from: f */
    public final void m7080f() {
        this.f8042s = new RectF(getPaddingLeft() + ((this.f8025b * (((getWidth() - getPaddingLeft()) - getPaddingRight()) + 60)) / 100.0f), (getHeight() / 2.0f) - getPaddingTop(), ((getWidth() - getPaddingRight()) - 20) * (this.f8039p / 100.0f), (getHeight() / 2.0f) + getPaddingTop() + this.f8030g);
        this.f8043t = new RectF(getPaddingLeft(), (getHeight() / 2.0f) - getPaddingTop(), (getWidth() - getPaddingRight()) - 20, (getHeight() / 2.0f) + getPaddingTop() + this.f8030g);
    }

    public float getProgress() {
        return this.f8039p;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m7080f();
        m7076b(canvas);
        this.f8040q.setShader(this.f8041r);
        RectF rectF = this.f8042s;
        int i10 = this.f8036m;
        canvas.drawRoundRect(rectF, i10, i10, this.f8040q);
        m7075a(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f8041r = new LinearGradient(getPaddingLeft() - 50, (getHeight() - getPaddingTop()) - 50, getWidth() - getPaddingRight(), (getHeight() / 2.0f) + getPaddingTop() + this.f8030g, this.f8027d, this.f8028e, Shader.TileMode.CLAMP);
    }

    public void setAnimateType(int i10) {
        this.f8024a = i10;
        setObjectAnimatorType(i10);
    }

    public void setEndColor(@ColorInt int i10) {
        this.f8028e = i10;
        this.f8041r = new LinearGradient(getPaddingLeft() - 50, (getHeight() - getPaddingTop()) - 50, getWidth() - getPaddingRight(), this.f8030g + (getHeight() / 2.0f) + getPaddingTop(), this.f8027d, this.f8028e, Shader.TileMode.CLAMP);
        m7079e();
    }

    public void setEndProgress(float f10) {
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("Illegal progress value, please change it!");
        }
        this.f8026c = f10;
        m7079e();
    }

    public void setProgress(float f10) {
        this.f8039p = f10;
        m7079e();
    }

    public void setProgressCornerRadius(int i10) {
        this.f8036m = AbstractC6872b.m6425a(getContext(), i10);
        m7079e();
    }

    public void setProgressDuration(int i10) {
        this.f8034k = i10;
    }

    public void setProgressTextColor(@ColorInt int i10) {
        this.f8032i = i10;
    }

    public void setProgressTextMoved(boolean z10) {
        this.f8038o = z10;
    }

    public void setProgressTextPaddingBottom(int i10) {
        this.f8037n = AbstractC6872b.m6425a(getContext(), i10);
    }

    public void setProgressTextSize(int i10) {
        this.f8031h = AbstractC6872b.m6428d(getContext(), i10);
        m7079e();
    }

    public void setProgressTextVisibility(boolean z10) {
        this.f8035l = z10;
        m7079e();
    }

    public void setProgressViewUpdateListener(InterfaceC6971a interfaceC6971a) {
    }

    public void setStartColor(@ColorInt int i10) {
        this.f8027d = i10;
        this.f8041r = new LinearGradient(getPaddingLeft() - 50, (getHeight() - getPaddingTop()) - 50, getWidth() - getPaddingRight(), this.f8030g + (getHeight() / 2.0f) + getPaddingTop(), this.f8027d, this.f8028e, Shader.TileMode.CLAMP);
        m7079e();
    }

    public void setStartProgress(float f10) {
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("Illegal progress value, please change it!");
        }
        this.f8025b = f10;
        this.f8039p = f10;
        m7079e();
    }

    public void setTrackColor(@ColorInt int i10) {
        this.f8033j = i10;
        m7079e();
    }

    public void setTrackEnabled(boolean z10) {
        this.f8029f = z10;
        m7079e();
    }

    public void setTrackWidth(int i10) {
        this.f8030g = AbstractC6872b.m6425a(getContext(), i10);
        m7079e();
    }

    public HorizontalProgressView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8024a = 0;
        this.f8025b = 0.0f;
        this.f8026c = 60.0f;
        this.f8027d = getResources().getColor(R$color.xui_config_color_light_orange);
        this.f8028e = getResources().getColor(R$color.xui_config_color_dark_orange);
        this.f8029f = false;
        this.f8030g = 6;
        this.f8031h = 48;
        this.f8033j = getResources().getColor(R$color.default_pv_track_color);
        this.f8034k = 1200;
        this.f8035l = true;
        this.f8036m = 30;
        this.f8037n = 5;
        this.f8038o = true;
        this.f8039p = 0.0f;
        m7078d(context, attributeSet, i10);
        m7077c();
    }
}
