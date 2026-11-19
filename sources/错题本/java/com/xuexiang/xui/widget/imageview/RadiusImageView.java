package com.xuexiang.xui.widget.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes3.dex */
public class RadiusImageView extends AppCompatImageView {

    /* renamed from: v */
    public static final Bitmap.Config f4328v = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public boolean f4329a;

    /* renamed from: b */
    public boolean f4330b;

    /* renamed from: c */
    public boolean f4331c;

    /* renamed from: d */
    public int f4332d;

    /* renamed from: e */
    public int f4333e;

    /* renamed from: f */
    public int f4334f;

    /* renamed from: g */
    public int f4335g;

    /* renamed from: h */
    public int f4336h;

    /* renamed from: i */
    public boolean f4337i;

    /* renamed from: j */
    public int f4338j;

    /* renamed from: k */
    public Paint f4339k;

    /* renamed from: l */
    public final Paint f4340l;

    /* renamed from: m */
    public ColorFilter f4341m;

    /* renamed from: n */
    public ColorFilter f4342n;

    /* renamed from: o */
    public BitmapShader f4343o;

    /* renamed from: p */
    public boolean f4344p;

    /* renamed from: q */
    public final RectF f4345q;

    /* renamed from: r */
    public Bitmap f4346r;

    /* renamed from: s */
    public final Matrix f4347s;

    /* renamed from: t */
    public int f4348t;

    /* renamed from: u */
    public int f4349u;

    public RadiusImageView(Context context) {
        this(context, null, R$attr.RadiusImageViewStyle);
    }

    private Bitmap getBitmap() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            try {
                boolean z8 = drawable instanceof ColorDrawable;
                Bitmap.Config config = f4328v;
                Bitmap bitmapCreateBitmap = z8 ? Bitmap.createBitmap(2, 2, config) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), config);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return bitmapCreateBitmap;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap == null) {
            return null;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width == 0.0f || height == 0.0f) {
            return null;
        }
        float minimumWidth = getMinimumWidth() / width;
        float minimumHeight = getMinimumHeight() / height;
        if (minimumWidth <= 1.0f && minimumHeight <= 1.0f) {
            return bitmap;
        }
        float fMax = Math.max(minimumWidth, minimumHeight);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        return Bitmap.createBitmap(bitmap, 0, 0, (int) width, (int) height, matrix, false);
    }

    /* renamed from: a */
    public final void m3491a(Canvas canvas, int i) {
        if (i <= 0) {
            return;
        }
        float f = i;
        float f7 = (1.0f * f) / 2.0f;
        this.f4340l.setColor(this.f4329a ? this.f4335g : this.f4333e);
        this.f4340l.setStrokeWidth(f);
        if (this.f4331c) {
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width - f7, this.f4340l);
            return;
        }
        RectF rectF = this.f4345q;
        rectF.left = f7;
        rectF.top = f7;
        rectF.right = getWidth() - f7;
        rectF.bottom = getHeight() - f7;
        if (this.f4330b) {
            canvas.drawOval(rectF, this.f4340l);
        } else {
            int i8 = this.f4338j;
            canvas.drawRoundRect(rectF, i8, i8, this.f4340l);
        }
    }

    /* renamed from: b */
    public final void m3492b() {
        Bitmap bitmap = getBitmap();
        if (bitmap == this.f4346r) {
            return;
        }
        this.f4346r = bitmap;
        if (bitmap == null) {
            this.f4343o = null;
            invalidate();
            return;
        }
        this.f4344p = true;
        Bitmap bitmap2 = this.f4346r;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f4343o = new BitmapShader(bitmap2, tileMode, tileMode);
        if (this.f4339k == null) {
            Paint paint = new Paint();
            this.f4339k = paint;
            paint.setAntiAlias(true);
        }
        this.f4339k.setShader(this.f4343o);
        requestLayout();
        invalidate();
    }

    public int getBorderColor() {
        return this.f4333e;
    }

    public int getBorderWidth() {
        return this.f4332d;
    }

    public int getCornerRadius() {
        return this.f4338j;
    }

    public int getSelectedBorderColor() {
        return this.f4335g;
    }

    public int getSelectedBorderWidth() {
        return this.f4334f;
    }

    public int getSelectedMaskColor() {
        return this.f4336h;
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.f4329a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int i = this.f4329a ? this.f4334f : this.f4332d;
        if (this.f4346r == null || this.f4343o == null) {
            m3491a(canvas, i);
            return;
        }
        if (this.f4348t != width || this.f4349u != height || this.f4344p) {
            this.f4348t = width;
            this.f4349u = height;
            this.f4347s.reset();
            this.f4344p = false;
            if (this.f4343o != null && (bitmap = this.f4346r) != null) {
                float width2 = bitmap.getWidth();
                float height2 = this.f4346r.getHeight();
                float fMax = Math.max(this.f4348t / width2, this.f4349u / height2);
                this.f4347s.setScale(fMax, fMax);
                this.f4347s.postTranslate((-((width2 * fMax) - this.f4348t)) / 2.0f, (-((fMax * height2) - this.f4349u)) / 2.0f);
                this.f4343o.setLocalMatrix(this.f4347s);
                this.f4339k.setShader(this.f4343o);
            }
        }
        float f = (i * 1.0f) / 2.0f;
        this.f4339k.setColorFilter(this.f4329a ? this.f4342n : this.f4341m);
        if (this.f4331c) {
            float width3 = getWidth() / 2;
            canvas.drawCircle(width3, width3, width3 - f, this.f4339k);
        } else {
            RectF rectF = this.f4345q;
            rectF.left = f;
            rectF.top = f;
            rectF.right = getWidth() - f;
            rectF.bottom = getHeight() - f;
            if (this.f4330b) {
                canvas.drawOval(rectF, this.f4339k);
            } else {
                float f7 = this.f4338j;
                canvas.drawRoundRect(rectF, f7, f7, this.f4339k);
            }
        }
        m3491a(canvas, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f4331c) {
            int iMin = Math.min(measuredWidth, measuredHeight);
            setMeasuredDimension(iMin, iMin);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i8);
        Bitmap bitmap = this.f4346r;
        if (bitmap == null) {
            return;
        }
        boolean z8 = true;
        boolean z9 = mode == Integer.MIN_VALUE || mode == 0;
        if (mode2 != Integer.MIN_VALUE && mode2 != 0) {
            z8 = false;
        }
        float width = bitmap.getWidth();
        float height = this.f4346r.getHeight();
        float f = measuredWidth / width;
        float f7 = measuredHeight / height;
        if (!z9 || !z8) {
            if (z9) {
                setMeasuredDimension((int) (width * f7), measuredHeight);
                return;
            } else {
                if (z8) {
                    setMeasuredDimension(measuredWidth, (int) (height * f));
                    return;
                }
                return;
            }
        }
        if (f >= 1.0f && f7 >= 1.0f) {
            setMeasuredDimension((int) width, (int) height);
            return;
        }
        if (f >= 1.0f) {
            setMeasuredDimension((int) (height * f7), measuredHeight);
            return;
        }
        if (f7 >= 1.0f) {
            setMeasuredDimension(measuredWidth, (int) (height * f));
        } else if (f < f7) {
            setMeasuredDimension(measuredWidth, (int) (height * f));
        } else {
            setMeasuredDimension((int) (width * f7), measuredHeight);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            setSelected(false);
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f4337i) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setSelected(true);
        } else if (action == 1 || action == 3 || action == 4 || action == 8) {
            setSelected(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z8) {
        if (z8) {
            throw new IllegalArgumentException("不支持adjustViewBounds");
        }
    }

    public void setBorderColor(@ColorInt int i) {
        if (this.f4333e != i) {
            this.f4333e = i;
            invalidate();
        }
    }

    public void setBorderWidth(int i) {
        if (this.f4332d != i) {
            this.f4332d = i;
            invalidate();
        }
    }

    public void setCircle(boolean z8) {
        if (this.f4331c != z8) {
            this.f4331c = z8;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f4341m == colorFilter) {
            return;
        }
        this.f4341m = colorFilter;
        if (this.f4329a) {
            return;
        }
        invalidate();
    }

    public void setCornerRadius(int i) {
        if (this.f4338j != i) {
            this.f4338j = i;
            if (this.f4331c || this.f4330b) {
                return;
            }
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m3492b();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m3492b();
    }

    public void setOval(boolean z8) {
        boolean z9 = false;
        if (z8 && this.f4331c) {
            this.f4331c = false;
            z9 = true;
        }
        if (this.f4330b != z8 || z9) {
            this.f4330b = z8;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            super.setScaleType(scaleType);
        } else {
            throw new IllegalArgumentException("不支持ScaleType " + scaleType);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z8) {
        if (this.f4329a != z8) {
            this.f4329a = z8;
            invalidate();
        }
    }

    public void setSelectedBorderColor(@ColorInt int i) {
        if (this.f4335g != i) {
            this.f4335g = i;
            if (this.f4329a) {
                invalidate();
            }
        }
    }

    public void setSelectedBorderWidth(int i) {
        if (this.f4334f != i) {
            this.f4334f = i;
            if (this.f4329a) {
                invalidate();
            }
        }
    }

    public void setSelectedColorFilter(ColorFilter colorFilter) {
        if (this.f4342n == colorFilter) {
            return;
        }
        this.f4342n = colorFilter;
        if (this.f4329a) {
            invalidate();
        }
    }

    public void setSelectedMaskColor(@ColorInt int i) {
        if (this.f4336h != i) {
            this.f4336h = i;
            if (i != 0) {
                this.f4342n = new PorterDuffColorFilter(this.f4336h, PorterDuff.Mode.DARKEN);
            } else {
                this.f4342n = null;
            }
            if (this.f4329a) {
                invalidate();
            }
        }
        this.f4336h = i;
    }

    public void setTouchSelectModeEnabled(boolean z8) {
        this.f4337i = z8;
    }

    public RadiusImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.RadiusImageViewStyle);
    }

    public RadiusImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4329a = false;
        this.f4330b = false;
        this.f4331c = false;
        this.f4337i = true;
        this.f4344p = false;
        this.f4345q = new RectF();
        Paint paint = new Paint();
        this.f4340l = paint;
        paint.setAntiAlias(true);
        this.f4340l.setStyle(Paint.Style.STROKE);
        this.f4347s = new Matrix();
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RadiusImageView, i, 0);
        this.f4332d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RadiusImageView_riv_border_width, 0);
        this.f4333e = typedArrayObtainStyledAttributes.getColor(R$styleable.RadiusImageView_riv_border_color, -7829368);
        this.f4334f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RadiusImageView_riv_selected_border_width, this.f4332d);
        this.f4335g = typedArrayObtainStyledAttributes.getColor(R$styleable.RadiusImageView_riv_selected_border_color, this.f4333e);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.RadiusImageView_riv_selected_mask_color, 0);
        this.f4336h = color;
        if (color != 0) {
            this.f4342n = new PorterDuffColorFilter(this.f4336h, PorterDuff.Mode.DARKEN);
        }
        this.f4337i = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RadiusImageView_riv_is_touch_select_mode_enabled, true);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RadiusImageView_riv_is_circle, false);
        this.f4331c = z8;
        if (!z8) {
            this.f4330b = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RadiusImageView_riv_is_oval, false);
        }
        if (!this.f4330b) {
            this.f4338j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RadiusImageView_riv_corner_radius, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
