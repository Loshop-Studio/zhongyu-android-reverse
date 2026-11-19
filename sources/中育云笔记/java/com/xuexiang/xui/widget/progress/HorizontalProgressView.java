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
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8041g;

/* loaded from: classes5.dex */
public class HorizontalProgressView extends View {

    /* renamed from: c */
    public int f16717c;

    /* renamed from: d */
    public float f16718d;

    /* renamed from: e */
    public float f16719e;

    /* renamed from: f */
    public int f16720f;

    /* renamed from: g */
    public int f16721g;

    /* renamed from: h */
    public boolean f16722h;

    /* renamed from: i */
    public int f16723i;

    /* renamed from: j */
    public int f16724j;

    /* renamed from: k */
    public int f16725k;

    /* renamed from: l */
    public int f16726l;

    /* renamed from: m */
    public int f16727m;

    /* renamed from: n */
    public boolean f16728n;

    /* renamed from: o */
    public int f16729o;

    /* renamed from: p */
    public int f16730p;

    /* renamed from: q */
    public boolean f16731q;

    /* renamed from: r */
    public float f16732r;

    /* renamed from: s */
    public Paint f16733s;

    /* renamed from: t */
    public LinearGradient f16734t;

    /* renamed from: u */
    public RectF f16735u;

    /* renamed from: v */
    public RectF f16736v;

    /* renamed from: w */
    public Interpolator f16737w;

    /* renamed from: com.xuexiang.xui.widget.progress.HorizontalProgressView$a */
    public interface InterfaceC8204a {
    }

    public HorizontalProgressView(Context context) {
        this(context, null);
    }

    private void setObjectAnimatorType(int i10) {
        if (i10 == 0) {
            if (this.f16737w != null) {
                this.f16737w = null;
            }
            this.f16737w = new AccelerateDecelerateInterpolator();
            return;
        }
        if (i10 == 1) {
            if (this.f16737w != null) {
                this.f16737w = null;
            }
            this.f16737w = new LinearInterpolator();
            return;
        }
        if (i10 == 2) {
            if (this.f16737w != null) {
                this.f16737w = null;
                this.f16737w = new AccelerateInterpolator();
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (this.f16737w != null) {
                this.f16737w = null;
            }
            this.f16737w = new DecelerateInterpolator();
        } else {
            if (i10 != 4) {
                return;
            }
            if (this.f16737w != null) {
                this.f16737w = null;
            }
            this.f16737w = new OvershootInterpolator();
        }
    }

    /* renamed from: a */
    public final void m13087a(Canvas canvas) {
        if (this.f16728n) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextSize(this.f16724j);
            paint.setColor(this.f16725k);
            paint.setTextAlign(Paint.Align.CENTER);
            String str = ((int) this.f16732r) + "%";
            if (this.f16731q) {
                canvas.drawText(str, ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - AbstractC8037c.m12188b(getContext(), 28.0f)) * (this.f16732r / 100.0f)) + AbstractC8037c.m12188b(getContext(), 10.0f), ((getHeight() / 2.0f) - getPaddingTop()) - this.f16730p, paint);
            } else {
                canvas.drawText(str, (getWidth() - getPaddingLeft()) / 2.0f, ((getHeight() / 2.0f) - getPaddingTop()) - this.f16730p, paint);
            }
        }
    }

    /* renamed from: b */
    public final void m13088b(Canvas canvas) {
        if (this.f16722h) {
            this.f16733s.setShader(null);
            this.f16733s.setColor(this.f16726l);
            RectF rectF = this.f16736v;
            int i10 = this.f16729o;
            canvas.drawRoundRect(rectF, i10, i10, this.f16733s);
        }
    }

    /* renamed from: c */
    public final void m13089c() {
        Paint paint = new Paint(1);
        this.f16733s = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    /* renamed from: d */
    public final void m13090d(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.HorizontalProgressView, i10, 0);
        this.f16718d = typedArrayObtainStyledAttributes.getInt(R$styleable.HorizontalProgressView_hpv_start_progress, 0);
        this.f16719e = typedArrayObtainStyledAttributes.getInt(R$styleable.HorizontalProgressView_hpv_end_progress, 60);
        this.f16720f = typedArrayObtainStyledAttributes.getColor(R$styleable.HorizontalProgressView_hpv_start_color, getResources().getColor(R$color.xui_config_color_light_orange));
        this.f16721g = typedArrayObtainStyledAttributes.getColor(R$styleable.HorizontalProgressView_hpv_end_color, getResources().getColor(R$color.xui_config_color_dark_orange));
        this.f16722h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.HorizontalProgressView_hpv_isTracked, false);
        this.f16725k = typedArrayObtainStyledAttributes.getColor(R$styleable.HorizontalProgressView_hpv_progress_textColor, AbstractC8041g.m12217d(getContext(), R$attr.colorAccent));
        this.f16724j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HorizontalProgressView_hpv_progress_textSize, getResources().getDimensionPixelSize(R$dimen.default_pv_horizontal_text_size));
        this.f16723i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HorizontalProgressView_hpv_track_width, getResources().getDimensionPixelSize(R$dimen.default_pv_trace_width));
        this.f16717c = typedArrayObtainStyledAttributes.getInt(R$styleable.HorizontalProgressView_hpv_animate_type, 0);
        this.f16726l = typedArrayObtainStyledAttributes.getColor(R$styleable.HorizontalProgressView_hpv_track_color, getResources().getColor(R$color.default_pv_track_color));
        this.f16728n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.HorizontalProgressView_hpv_progress_textVisibility, true);
        this.f16727m = typedArrayObtainStyledAttributes.getInt(R$styleable.HorizontalProgressView_hpv_progress_duration, 1200);
        this.f16729o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HorizontalProgressView_hpv_corner_radius, getResources().getDimensionPixelSize(R$dimen.default_pv_corner_radius));
        this.f16730p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HorizontalProgressView_hpv_text_padding_bottom, getResources().getDimensionPixelSize(R$dimen.default_pv_corner_radius));
        this.f16731q = typedArrayObtainStyledAttributes.getBoolean(R$styleable.HorizontalProgressView_hpv_text_movedEnable, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f16732r = this.f16718d;
        setAnimateType(this.f16717c);
    }

    /* renamed from: e */
    public final void m13091e() {
        invalidate();
    }

    /* renamed from: f */
    public final void m13092f() {
        this.f16735u = new RectF(getPaddingLeft() + ((this.f16718d * (((getWidth() - getPaddingLeft()) - getPaddingRight()) + 60)) / 100.0f), (getHeight() / 2.0f) - getPaddingTop(), ((getWidth() - getPaddingRight()) - 20) * (this.f16732r / 100.0f), (getHeight() / 2.0f) + getPaddingTop() + this.f16723i);
        this.f16736v = new RectF(getPaddingLeft(), (getHeight() / 2.0f) - getPaddingTop(), (getWidth() - getPaddingRight()) - 20, (getHeight() / 2.0f) + getPaddingTop() + this.f16723i);
    }

    public float getProgress() {
        return this.f16732r;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m13092f();
        m13088b(canvas);
        this.f16733s.setShader(this.f16734t);
        RectF rectF = this.f16735u;
        int i10 = this.f16729o;
        canvas.drawRoundRect(rectF, i10, i10, this.f16733s);
        m13087a(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f16734t = new LinearGradient(getPaddingLeft() - 50, (getHeight() - getPaddingTop()) - 50, getWidth() - getPaddingRight(), (getHeight() / 2.0f) + getPaddingTop() + this.f16723i, this.f16720f, this.f16721g, Shader.TileMode.CLAMP);
    }

    public void setAnimateType(int i10) {
        this.f16717c = i10;
        setObjectAnimatorType(i10);
    }

    public void setEndColor(@ColorInt int i10) {
        this.f16721g = i10;
        this.f16734t = new LinearGradient(getPaddingLeft() - 50, (getHeight() - getPaddingTop()) - 50, getWidth() - getPaddingRight(), this.f16723i + (getHeight() / 2.0f) + getPaddingTop(), this.f16720f, this.f16721g, Shader.TileMode.CLAMP);
        m13091e();
    }

    public void setEndProgress(float f10) {
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("Illegal progress value, please change it!");
        }
        this.f16719e = f10;
        m13091e();
    }

    public void setProgress(float f10) {
        this.f16732r = f10;
        m13091e();
    }

    public void setProgressCornerRadius(int i10) {
        this.f16729o = AbstractC8037c.m12188b(getContext(), i10);
        m13091e();
    }

    public void setProgressDuration(int i10) {
        this.f16727m = i10;
    }

    public void setProgressTextColor(@ColorInt int i10) {
        this.f16725k = i10;
    }

    public void setProgressTextMoved(boolean z10) {
        this.f16731q = z10;
    }

    public void setProgressTextPaddingBottom(int i10) {
        this.f16730p = AbstractC8037c.m12188b(getContext(), i10);
    }

    public void setProgressTextSize(int i10) {
        this.f16724j = AbstractC8037c.m12190d(getContext(), i10);
        m13091e();
    }

    public void setProgressTextVisibility(boolean z10) {
        this.f16728n = z10;
        m13091e();
    }

    public void setProgressViewUpdateListener(InterfaceC8204a interfaceC8204a) {
    }

    public void setStartColor(@ColorInt int i10) {
        this.f16720f = i10;
        this.f16734t = new LinearGradient(getPaddingLeft() - 50, (getHeight() - getPaddingTop()) - 50, getWidth() - getPaddingRight(), this.f16723i + (getHeight() / 2.0f) + getPaddingTop(), this.f16720f, this.f16721g, Shader.TileMode.CLAMP);
        m13091e();
    }

    public void setStartProgress(float f10) {
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("Illegal progress value, please change it!");
        }
        this.f16718d = f10;
        this.f16732r = f10;
        m13091e();
    }

    public void setTrackColor(@ColorInt int i10) {
        this.f16726l = i10;
        m13091e();
    }

    public void setTrackEnabled(boolean z10) {
        this.f16722h = z10;
        m13091e();
    }

    public void setTrackWidth(int i10) {
        this.f16723i = AbstractC8037c.m12188b(getContext(), i10);
        m13091e();
    }

    public HorizontalProgressView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.HorizontalProgressViewStyle);
    }

    public HorizontalProgressView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16717c = 0;
        this.f16718d = 0.0f;
        this.f16719e = 60.0f;
        this.f16720f = getResources().getColor(R$color.xui_config_color_light_orange);
        this.f16721g = getResources().getColor(R$color.xui_config_color_dark_orange);
        this.f16722h = false;
        this.f16723i = 6;
        this.f16724j = 48;
        this.f16726l = getResources().getColor(R$color.default_pv_track_color);
        this.f16727m = 1200;
        this.f16728n = true;
        this.f16729o = 30;
        this.f16730p = 5;
        this.f16731q = true;
        this.f16732r = 0.0f;
        m13090d(context, attributeSet, i10);
        m13089c();
    }
}
