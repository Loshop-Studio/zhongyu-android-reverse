package com.xuexiang.xui.widget.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
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
import p089j3.InterfaceC5744c;

/* loaded from: classes3.dex */
public class HorizontalProgressView extends View {

    /* renamed from: a */
    public int f4664a;

    /* renamed from: b */
    public float f4665b;

    /* renamed from: c */
    public int f4666c;

    /* renamed from: d */
    public int f4667d;

    /* renamed from: e */
    public boolean f4668e;

    /* renamed from: f */
    public int f4669f;

    /* renamed from: g */
    public int f4670g;

    /* renamed from: h */
    public int f4671h;

    /* renamed from: i */
    public int f4672i;

    /* renamed from: j */
    public boolean f4673j;

    /* renamed from: k */
    public int f4674k;

    /* renamed from: l */
    public int f4675l;

    /* renamed from: m */
    public boolean f4676m;

    /* renamed from: n */
    public float f4677n;

    /* renamed from: o */
    public final Paint f4678o;

    /* renamed from: p */
    public LinearGradient f4679p;

    /* renamed from: q */
    public RectF f4680q;

    /* renamed from: r */
    public RectF f4681r;

    /* renamed from: s */
    public BaseInterpolator f4682s;

    public HorizontalProgressView(Context context) {
        this(context, null);
    }

    private void setObjectAnimatorType(int i) {
        if (i == 0) {
            if (this.f4682s != null) {
                this.f4682s = null;
            }
            this.f4682s = new AccelerateDecelerateInterpolator();
            return;
        }
        if (i == 1) {
            if (this.f4682s != null) {
                this.f4682s = null;
            }
            this.f4682s = new LinearInterpolator();
            return;
        }
        if (i == 2) {
            if (this.f4682s != null) {
                this.f4682s = null;
                this.f4682s = new AccelerateInterpolator();
                return;
            }
            return;
        }
        if (i == 3) {
            if (this.f4682s != null) {
                this.f4682s = null;
            }
            this.f4682s = new DecelerateInterpolator();
        } else {
            if (i != 4) {
                return;
            }
            if (this.f4682s != null) {
                this.f4682s = null;
            }
            this.f4682s = new OvershootInterpolator();
        }
    }

    public float getProgress() {
        return this.f4677n;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4680q = new RectF(((this.f4665b * (((getWidth() - getPaddingLeft()) - getPaddingRight()) + 60)) / 100.0f) + getPaddingLeft(), (getHeight() / 2.0f) - getPaddingTop(), (this.f4677n / 100.0f) * ((getWidth() - getPaddingRight()) - 20), (getHeight() / 2.0f) + getPaddingTop() + this.f4669f);
        this.f4681r = new RectF(getPaddingLeft(), (getHeight() / 2.0f) - getPaddingTop(), (getWidth() - getPaddingRight()) - 20, (getHeight() / 2.0f) + getPaddingTop() + this.f4669f);
        if (this.f4668e) {
            this.f4678o.setShader(null);
            this.f4678o.setColor(this.f4672i);
            RectF rectF = this.f4681r;
            float f = this.f4674k;
            canvas.drawRoundRect(rectF, f, f, this.f4678o);
        }
        this.f4678o.setShader(this.f4679p);
        RectF rectF2 = this.f4680q;
        int i = this.f4674k;
        canvas.drawRoundRect(rectF2, i, i, this.f4678o);
        if (this.f4673j) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextSize(this.f4670g);
            paint.setColor(this.f4671h);
            paint.setTextAlign(Paint.Align.CENTER);
            String strM90o = AbstractC0037f.m90o(new StringBuilder(), "%", (int) this.f4677n);
            if (!this.f4676m) {
                canvas.drawText(strM90o, (getWidth() - getPaddingLeft()) / 2.0f, ((getHeight() / 2.0f) - getPaddingTop()) - this.f4675l, paint);
            } else {
                canvas.drawText(strM90o, ((this.f4677n / 100.0f) * (((getWidth() - getPaddingLeft()) - getPaddingRight()) - AbstractC5625a.m4948h(getContext(), 28.0f))) + AbstractC5625a.m4948h(getContext(), 10.0f), ((getHeight() / 2.0f) - getPaddingTop()) - this.f4675l, paint);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        this.f4679p = new LinearGradient(getPaddingLeft() - 50, (getHeight() - getPaddingTop()) - 50, getWidth() - getPaddingRight(), (getHeight() / 2.0f) + getPaddingTop() + this.f4669f, this.f4666c, this.f4667d, Shader.TileMode.CLAMP);
    }

    public void setAnimateType(int i) {
        this.f4664a = i;
        setObjectAnimatorType(i);
    }

    public void setEndColor(@ColorInt int i) {
        this.f4667d = i;
        this.f4679p = new LinearGradient(getPaddingLeft() - 50, (getHeight() - getPaddingTop()) - 50, getWidth() - getPaddingRight(), this.f4669f + (getHeight() / 2.0f) + getPaddingTop(), this.f4666c, this.f4667d, Shader.TileMode.CLAMP);
        invalidate();
    }

    public void setEndProgress(float f) {
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("Illegal progress value, please change it!");
        }
        invalidate();
    }

    public void setProgress(float f) {
        this.f4677n = f;
        invalidate();
    }

    public void setProgressCornerRadius(int i) {
        this.f4674k = AbstractC5625a.m4948h(getContext(), i);
        invalidate();
    }

    public void setProgressDuration(int i) {
    }

    public void setProgressTextColor(@ColorInt int i) {
        this.f4671h = i;
    }

    public void setProgressTextMoved(boolean z8) {
        this.f4676m = z8;
    }

    public void setProgressTextPaddingBottom(int i) {
        this.f4675l = AbstractC5625a.m4948h(getContext(), i);
    }

    public void setProgressTextSize(int i) {
        this.f4670g = AbstractC5625a.m4954n(getContext(), i);
        invalidate();
    }

    public void setProgressTextVisibility(boolean z8) {
        this.f4673j = z8;
        invalidate();
    }

    public void setStartColor(@ColorInt int i) {
        this.f4666c = i;
        this.f4679p = new LinearGradient(getPaddingLeft() - 50, (getHeight() - getPaddingTop()) - 50, getWidth() - getPaddingRight(), this.f4669f + (getHeight() / 2.0f) + getPaddingTop(), this.f4666c, this.f4667d, Shader.TileMode.CLAMP);
        invalidate();
    }

    public void setStartProgress(float f) {
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("Illegal progress value, please change it!");
        }
        this.f4665b = f;
        this.f4677n = f;
        invalidate();
    }

    public void setTrackColor(@ColorInt int i) {
        this.f4672i = i;
        invalidate();
    }

    public void setTrackEnabled(boolean z8) {
        this.f4668e = z8;
        invalidate();
    }

    public void setTrackWidth(int i) {
        this.f4669f = AbstractC5625a.m4948h(getContext(), i);
        invalidate();
    }

    public HorizontalProgressView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.HorizontalProgressViewStyle);
    }

    public HorizontalProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4664a = 0;
        this.f4665b = 0.0f;
        this.f4666c = getResources().getColor(R$color.xui_config_color_light_orange);
        this.f4667d = getResources().getColor(R$color.xui_config_color_dark_orange);
        this.f4668e = false;
        this.f4669f = 6;
        this.f4670g = 48;
        this.f4672i = getResources().getColor(R$color.default_pv_track_color);
        this.f4673j = true;
        this.f4674k = 30;
        this.f4675l = 5;
        this.f4676m = true;
        this.f4677n = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.HorizontalProgressView, i, 0);
        this.f4665b = typedArrayObtainStyledAttributes.getInt(R$styleable.HorizontalProgressView_hpv_start_progress, 0);
        typedArrayObtainStyledAttributes.getInt(R$styleable.HorizontalProgressView_hpv_end_progress, 60);
        this.f4666c = typedArrayObtainStyledAttributes.getColor(R$styleable.HorizontalProgressView_hpv_start_color, getResources().getColor(R$color.xui_config_color_light_orange));
        this.f4667d = typedArrayObtainStyledAttributes.getColor(R$styleable.HorizontalProgressView_hpv_end_color, getResources().getColor(R$color.xui_config_color_dark_orange));
        this.f4668e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.HorizontalProgressView_hpv_isTracked, false);
        this.f4671h = typedArrayObtainStyledAttributes.getColor(R$styleable.HorizontalProgressView_hpv_progress_textColor, AbstractC5806u.m5252F(getContext(), R$attr.colorAccent, 0));
        this.f4670g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HorizontalProgressView_hpv_progress_textSize, getResources().getDimensionPixelSize(R$dimen.default_pv_horizontal_text_size));
        this.f4669f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HorizontalProgressView_hpv_track_width, getResources().getDimensionPixelSize(R$dimen.default_pv_trace_width));
        this.f4664a = typedArrayObtainStyledAttributes.getInt(R$styleable.HorizontalProgressView_hpv_animate_type, 0);
        this.f4672i = typedArrayObtainStyledAttributes.getColor(R$styleable.HorizontalProgressView_hpv_track_color, getResources().getColor(R$color.default_pv_track_color));
        this.f4673j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.HorizontalProgressView_hpv_progress_textVisibility, true);
        typedArrayObtainStyledAttributes.getInt(R$styleable.HorizontalProgressView_hpv_progress_duration, 1200);
        this.f4674k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HorizontalProgressView_hpv_corner_radius, getResources().getDimensionPixelSize(R$dimen.default_pv_corner_radius));
        this.f4675l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HorizontalProgressView_hpv_text_padding_bottom, getResources().getDimensionPixelSize(R$dimen.default_pv_corner_radius));
        this.f4676m = typedArrayObtainStyledAttributes.getBoolean(R$styleable.HorizontalProgressView_hpv_text_movedEnable, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f4677n = this.f4665b;
        setAnimateType(this.f4664a);
        Paint paint = new Paint(1);
        this.f4678o = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    public void setProgressViewUpdateListener(InterfaceC5744c interfaceC5744c) {
    }
}
