package com.xuexiang.xui.widget.imageview;

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
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes4.dex */
public class RadiusImageView extends AppCompatImageView {

    /* renamed from: v */
    public static final Bitmap.Config f7678v = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public boolean f7679a;

    /* renamed from: b */
    public boolean f7680b;

    /* renamed from: c */
    public boolean f7681c;

    /* renamed from: d */
    public int f7682d;

    /* renamed from: e */
    public int f7683e;

    /* renamed from: f */
    public int f7684f;

    /* renamed from: g */
    public int f7685g;

    /* renamed from: h */
    public int f7686h;

    /* renamed from: i */
    public boolean f7687i;

    /* renamed from: j */
    public int f7688j;

    /* renamed from: k */
    public Paint f7689k;

    /* renamed from: l */
    public Paint f7690l;

    /* renamed from: m */
    public ColorFilter f7691m;

    /* renamed from: n */
    public ColorFilter f7692n;

    /* renamed from: o */
    public BitmapShader f7693o;

    /* renamed from: p */
    public boolean f7694p;

    /* renamed from: q */
    public RectF f7695q;

    /* renamed from: r */
    public Bitmap f7696r;

    /* renamed from: s */
    public Matrix f7697s;

    /* renamed from: t */
    public int f7698t;

    /* renamed from: u */
    public int f7699u;

    private Bitmap getBitmap() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            try {
                Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f7678v) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f7678v);
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
    public final void m6849a(Canvas canvas, int i10) {
        float f10 = (i10 * 1.0f) / 2.0f;
        this.f7689k.setColorFilter(this.f7679a ? this.f7692n : this.f7691m);
        if (this.f7681c) {
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width - f10, this.f7689k);
            return;
        }
        RectF rectF = this.f7695q;
        rectF.left = f10;
        rectF.top = f10;
        rectF.right = getWidth() - f10;
        this.f7695q.bottom = getHeight() - f10;
        if (this.f7680b) {
            canvas.drawOval(this.f7695q, this.f7689k);
            return;
        }
        RectF rectF2 = this.f7695q;
        int i11 = this.f7688j;
        canvas.drawRoundRect(rectF2, i11, i11, this.f7689k);
    }

    /* renamed from: b */
    public final void m6850b(Canvas canvas, int i10) {
        if (i10 <= 0) {
            return;
        }
        float f10 = i10;
        float f11 = (1.0f * f10) / 2.0f;
        this.f7690l.setColor(this.f7679a ? this.f7685g : this.f7683e);
        this.f7690l.setStrokeWidth(f10);
        if (this.f7681c) {
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width - f11, this.f7690l);
            return;
        }
        RectF rectF = this.f7695q;
        rectF.left = f11;
        rectF.top = f11;
        rectF.right = getWidth() - f11;
        this.f7695q.bottom = getHeight() - f11;
        if (this.f7680b) {
            canvas.drawOval(this.f7695q, this.f7690l);
            return;
        }
        RectF rectF2 = this.f7695q;
        int i11 = this.f7688j;
        canvas.drawRoundRect(rectF2, i11, i11, this.f7690l);
    }

    /* renamed from: c */
    public void m6851c() {
        Bitmap bitmap = getBitmap();
        if (bitmap == this.f7696r) {
            return;
        }
        this.f7696r = bitmap;
        if (bitmap == null) {
            this.f7693o = null;
            invalidate();
            return;
        }
        this.f7694p = true;
        Bitmap bitmap2 = this.f7696r;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f7693o = new BitmapShader(bitmap2, tileMode, tileMode);
        if (this.f7689k == null) {
            Paint paint = new Paint();
            this.f7689k = paint;
            paint.setAntiAlias(true);
        }
        this.f7689k.setShader(this.f7693o);
        requestLayout();
        invalidate();
    }

    /* renamed from: d */
    public final void m6852d() {
        Bitmap bitmap;
        this.f7697s.reset();
        this.f7694p = false;
        if (this.f7693o == null || (bitmap = this.f7696r) == null) {
            return;
        }
        float width = bitmap.getWidth();
        float height = this.f7696r.getHeight();
        float fMax = Math.max(this.f7698t / width, this.f7699u / height);
        this.f7697s.setScale(fMax, fMax);
        this.f7697s.postTranslate((-((width * fMax) - this.f7698t)) / 2.0f, (-((fMax * height) - this.f7699u)) / 2.0f);
        this.f7693o.setLocalMatrix(this.f7697s);
        this.f7689k.setShader(this.f7693o);
    }

    public int getBorderColor() {
        return this.f7683e;
    }

    public int getBorderWidth() {
        return this.f7682d;
    }

    public int getCornerRadius() {
        return this.f7688j;
    }

    public int getSelectedBorderColor() {
        return this.f7685g;
    }

    public int getSelectedBorderWidth() {
        return this.f7684f;
    }

    public int getSelectedMaskColor() {
        return this.f7686h;
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f7679a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int i10 = this.f7679a ? this.f7684f : this.f7682d;
        if (this.f7696r == null || this.f7693o == null) {
            m6850b(canvas, i10);
            return;
        }
        if (this.f7698t != width || this.f7699u != height || this.f7694p) {
            this.f7698t = width;
            this.f7699u = height;
            m6852d();
        }
        m6849a(canvas, i10);
        m6850b(canvas, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f7681c) {
            int iMin = Math.min(measuredWidth, measuredHeight);
            setMeasuredDimension(iMin, iMin);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        Bitmap bitmap = this.f7696r;
        if (bitmap == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = mode == Integer.MIN_VALUE || mode == 0;
        if (mode2 != Integer.MIN_VALUE && mode2 != 0) {
            z10 = false;
        }
        float width = bitmap.getWidth();
        float height = this.f7696r.getHeight();
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
        if (!this.f7687i) {
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
        if (this.f7683e != i10) {
            this.f7683e = i10;
            invalidate();
        }
    }

    public void setBorderWidth(int i10) {
        if (this.f7682d != i10) {
            this.f7682d = i10;
            invalidate();
        }
    }

    public void setCircle(boolean z10) {
        if (this.f7681c != z10) {
            this.f7681c = z10;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f7691m == colorFilter) {
            return;
        }
        this.f7691m = colorFilter;
        if (this.f7679a) {
            return;
        }
        invalidate();
    }

    public void setCornerRadius(int i10) {
        if (this.f7688j != i10) {
            this.f7688j = i10;
            if (this.f7681c || this.f7680b) {
                return;
            }
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m6851c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m6851c();
    }

    public void setOval(boolean z10) {
        boolean z11 = false;
        if (z10 && this.f7681c) {
            this.f7681c = false;
            z11 = true;
        }
        if (this.f7680b != z10 || z11) {
            this.f7680b = z10;
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
        if (this.f7679a != z10) {
            this.f7679a = z10;
            invalidate();
        }
    }

    public void setSelectedBorderColor(@ColorInt int i10) {
        if (this.f7685g != i10) {
            this.f7685g = i10;
            if (this.f7679a) {
                invalidate();
            }
        }
    }

    public void setSelectedBorderWidth(int i10) {
        if (this.f7684f != i10) {
            this.f7684f = i10;
            if (this.f7679a) {
                invalidate();
            }
        }
    }

    public void setSelectedColorFilter(ColorFilter colorFilter) {
        if (this.f7692n == colorFilter) {
            return;
        }
        this.f7692n = colorFilter;
        if (this.f7679a) {
            invalidate();
        }
    }

    public void setSelectedMaskColor(@ColorInt int i10) {
        if (this.f7686h != i10) {
            this.f7686h = i10;
            if (i10 != 0) {
                this.f7692n = new PorterDuffColorFilter(this.f7686h, PorterDuff.Mode.DARKEN);
            } else {
                this.f7692n = null;
            }
            if (this.f7679a) {
                invalidate();
            }
        }
        this.f7686h = i10;
    }

    public void setTouchSelectModeEnabled(boolean z10) {
        this.f7687i = z10;
    }
}
