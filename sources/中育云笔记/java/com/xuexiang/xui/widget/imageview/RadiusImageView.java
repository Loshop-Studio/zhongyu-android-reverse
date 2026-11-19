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

/* loaded from: classes5.dex */
public class RadiusImageView extends AppCompatImageView {

    /* renamed from: x */
    public static final Bitmap.Config f16049x = Bitmap.Config.ARGB_8888;

    /* renamed from: c */
    public boolean f16050c;

    /* renamed from: d */
    public boolean f16051d;

    /* renamed from: e */
    public boolean f16052e;

    /* renamed from: f */
    public int f16053f;

    /* renamed from: g */
    public int f16054g;

    /* renamed from: h */
    public int f16055h;

    /* renamed from: i */
    public int f16056i;

    /* renamed from: j */
    public int f16057j;

    /* renamed from: k */
    public boolean f16058k;

    /* renamed from: l */
    public int f16059l;

    /* renamed from: m */
    public Paint f16060m;

    /* renamed from: n */
    public Paint f16061n;

    /* renamed from: o */
    public ColorFilter f16062o;

    /* renamed from: p */
    public ColorFilter f16063p;

    /* renamed from: q */
    public BitmapShader f16064q;

    /* renamed from: r */
    public boolean f16065r;

    /* renamed from: s */
    public RectF f16066s;

    /* renamed from: t */
    public Bitmap f16067t;

    /* renamed from: u */
    public Matrix f16068u;

    /* renamed from: v */
    public int f16069v;

    /* renamed from: w */
    public int f16070w;

    public RadiusImageView(Context context) {
        this(context, null, R$attr.RadiusImageViewStyle);
    }

    /* renamed from: c */
    private void m12700c(Context context, AttributeSet attributeSet, int i10) {
        Paint paint = new Paint();
        this.f16061n = paint;
        paint.setAntiAlias(true);
        this.f16061n.setStyle(Paint.Style.STROKE);
        this.f16068u = new Matrix();
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RadiusImageView, i10, 0);
        this.f16053f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RadiusImageView_riv_border_width, 0);
        this.f16054g = typedArrayObtainStyledAttributes.getColor(R$styleable.RadiusImageView_riv_border_color, -7829368);
        this.f16055h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RadiusImageView_riv_selected_border_width, this.f16053f);
        this.f16056i = typedArrayObtainStyledAttributes.getColor(R$styleable.RadiusImageView_riv_selected_border_color, this.f16054g);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.RadiusImageView_riv_selected_mask_color, 0);
        this.f16057j = color;
        if (color != 0) {
            this.f16063p = new PorterDuffColorFilter(this.f16057j, PorterDuff.Mode.DARKEN);
        }
        this.f16058k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RadiusImageView_riv_is_touch_select_mode_enabled, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RadiusImageView_riv_is_circle, false);
        this.f16052e = z10;
        if (!z10) {
            this.f16051d = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RadiusImageView_riv_is_oval, false);
        }
        if (!this.f16051d) {
            this.f16059l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RadiusImageView_riv_corner_radius, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private Bitmap getBitmap() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            try {
                Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f16049x) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f16049x);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return bitmapCreateBitmap;
            } catch (Exception e10) {
                e10.printStackTrace();
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
    public final void m12701a(Canvas canvas, int i10) {
        float f10 = (i10 * 1.0f) / 2.0f;
        this.f16060m.setColorFilter(this.f16050c ? this.f16063p : this.f16062o);
        if (this.f16052e) {
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width - f10, this.f16060m);
            return;
        }
        RectF rectF = this.f16066s;
        rectF.left = f10;
        rectF.top = f10;
        rectF.right = getWidth() - f10;
        this.f16066s.bottom = getHeight() - f10;
        if (this.f16051d) {
            canvas.drawOval(this.f16066s, this.f16060m);
            return;
        }
        RectF rectF2 = this.f16066s;
        int i11 = this.f16059l;
        canvas.drawRoundRect(rectF2, i11, i11, this.f16060m);
    }

    /* renamed from: b */
    public final void m12702b(Canvas canvas, int i10) {
        if (i10 <= 0) {
            return;
        }
        float f10 = i10;
        float f11 = (1.0f * f10) / 2.0f;
        this.f16061n.setColor(this.f16050c ? this.f16056i : this.f16054g);
        this.f16061n.setStrokeWidth(f10);
        if (this.f16052e) {
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width - f11, this.f16061n);
            return;
        }
        RectF rectF = this.f16066s;
        rectF.left = f11;
        rectF.top = f11;
        rectF.right = getWidth() - f11;
        this.f16066s.bottom = getHeight() - f11;
        if (this.f16051d) {
            canvas.drawOval(this.f16066s, this.f16061n);
            return;
        }
        RectF rectF2 = this.f16066s;
        int i11 = this.f16059l;
        canvas.drawRoundRect(rectF2, i11, i11, this.f16061n);
    }

    /* renamed from: d */
    public void m12703d() {
        Bitmap bitmap = getBitmap();
        if (bitmap == this.f16067t) {
            return;
        }
        this.f16067t = bitmap;
        if (bitmap == null) {
            this.f16064q = null;
            invalidate();
            return;
        }
        this.f16065r = true;
        Bitmap bitmap2 = this.f16067t;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f16064q = new BitmapShader(bitmap2, tileMode, tileMode);
        if (this.f16060m == null) {
            Paint paint = new Paint();
            this.f16060m = paint;
            paint.setAntiAlias(true);
        }
        this.f16060m.setShader(this.f16064q);
        requestLayout();
        invalidate();
    }

    /* renamed from: e */
    public final void m12704e() {
        Bitmap bitmap;
        this.f16068u.reset();
        this.f16065r = false;
        if (this.f16064q == null || (bitmap = this.f16067t) == null) {
            return;
        }
        float width = bitmap.getWidth();
        float height = this.f16067t.getHeight();
        float fMax = Math.max(this.f16069v / width, this.f16070w / height);
        this.f16068u.setScale(fMax, fMax);
        this.f16068u.postTranslate((-((width * fMax) - this.f16069v)) / 2.0f, (-((fMax * height) - this.f16070w)) / 2.0f);
        this.f16064q.setLocalMatrix(this.f16068u);
        this.f16060m.setShader(this.f16064q);
    }

    public int getBorderColor() {
        return this.f16054g;
    }

    public int getBorderWidth() {
        return this.f16053f;
    }

    public int getCornerRadius() {
        return this.f16059l;
    }

    public int getSelectedBorderColor() {
        return this.f16056i;
    }

    public int getSelectedBorderWidth() {
        return this.f16055h;
    }

    public int getSelectedMaskColor() {
        return this.f16057j;
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f16050c;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int i10 = this.f16050c ? this.f16055h : this.f16053f;
        if (this.f16067t == null || this.f16064q == null) {
            m12702b(canvas, i10);
            return;
        }
        if (this.f16069v != width || this.f16070w != height || this.f16065r) {
            this.f16069v = width;
            this.f16070w = height;
            m12704e();
        }
        m12701a(canvas, i10);
        m12702b(canvas, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f16052e) {
            int iMin = Math.min(measuredWidth, measuredHeight);
            setMeasuredDimension(iMin, iMin);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        Bitmap bitmap = this.f16067t;
        if (bitmap == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = mode == Integer.MIN_VALUE || mode == 0;
        if (mode2 != Integer.MIN_VALUE && mode2 != 0) {
            z10 = false;
        }
        float width = bitmap.getWidth();
        float height = this.f16067t.getHeight();
        float f10 = measuredWidth / width;
        float f11 = measuredHeight / height;
        if (!z11 || !z10) {
            if (z11) {
                setMeasuredDimension((int) (width * f11), measuredHeight);
                return;
            } else {
                if (z10) {
                    setMeasuredDimension(measuredWidth, (int) (height * f10));
                    return;
                }
                return;
            }
        }
        if (f10 >= 1.0f && f11 >= 1.0f) {
            setMeasuredDimension((int) width, (int) height);
            return;
        }
        if (f10 >= 1.0f) {
            setMeasuredDimension((int) (height * f11), measuredHeight);
            return;
        }
        if (f11 >= 1.0f) {
            setMeasuredDimension(measuredWidth, (int) (height * f10));
        } else if (f10 < f11) {
            setMeasuredDimension(measuredWidth, (int) (height * f10));
        } else {
            setMeasuredDimension((int) (width * f11), measuredHeight);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            setSelected(false);
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f16058k) {
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
    public void setAdjustViewBounds(boolean z10) {
        if (z10) {
            throw new IllegalArgumentException("不支持adjustViewBounds");
        }
    }

    public void setBorderColor(@ColorInt int i10) {
        if (this.f16054g != i10) {
            this.f16054g = i10;
            invalidate();
        }
    }

    public void setBorderWidth(int i10) {
        if (this.f16053f != i10) {
            this.f16053f = i10;
            invalidate();
        }
    }

    public void setCircle(boolean z10) {
        if (this.f16052e != z10) {
            this.f16052e = z10;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f16062o == colorFilter) {
            return;
        }
        this.f16062o = colorFilter;
        if (this.f16050c) {
            return;
        }
        invalidate();
    }

    public void setCornerRadius(int i10) {
        if (this.f16059l != i10) {
            this.f16059l = i10;
            if (this.f16052e || this.f16051d) {
                return;
            }
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m12703d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m12703d();
    }

    public void setOval(boolean z10) {
        boolean z11 = false;
        if (z10 && this.f16052e) {
            this.f16052e = false;
            z11 = true;
        }
        if (this.f16051d != z10 || z11) {
            this.f16051d = z10;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != ImageView.ScaleType.CENTER_CROP) {
            throw new IllegalArgumentException(String.format("不支持ScaleType %s", scaleType));
        }
        super.setScaleType(scaleType);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z10) {
        if (this.f16050c != z10) {
            this.f16050c = z10;
            invalidate();
        }
    }

    public void setSelectedBorderColor(@ColorInt int i10) {
        if (this.f16056i != i10) {
            this.f16056i = i10;
            if (this.f16050c) {
                invalidate();
            }
        }
    }

    public void setSelectedBorderWidth(int i10) {
        if (this.f16055h != i10) {
            this.f16055h = i10;
            if (this.f16050c) {
                invalidate();
            }
        }
    }

    public void setSelectedColorFilter(ColorFilter colorFilter) {
        if (this.f16063p == colorFilter) {
            return;
        }
        this.f16063p = colorFilter;
        if (this.f16050c) {
            invalidate();
        }
    }

    public void setSelectedMaskColor(@ColorInt int i10) {
        if (this.f16057j != i10) {
            this.f16057j = i10;
            if (i10 != 0) {
                this.f16063p = new PorterDuffColorFilter(this.f16057j, PorterDuff.Mode.DARKEN);
            } else {
                this.f16063p = null;
            }
            if (this.f16050c) {
                invalidate();
            }
        }
        this.f16057j = i10;
    }

    public void setTouchSelectModeEnabled(boolean z10) {
        this.f16058k = z10;
    }

    public RadiusImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.RadiusImageViewStyle);
    }

    public RadiusImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16050c = false;
        this.f16051d = false;
        this.f16052e = false;
        this.f16058k = true;
        this.f16065r = false;
        this.f16066s = new RectF();
        m12700c(context, attributeSet, i10);
    }
}
