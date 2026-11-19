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

/* loaded from: classes2.dex */
public class RadiusImageView extends AppCompatImageView {

    /* renamed from: v */
    public static final Bitmap.Config f3477v = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public boolean f3478a;

    /* renamed from: b */
    public boolean f3479b;

    /* renamed from: c */
    public boolean f3480c;

    /* renamed from: d */
    public int f3481d;

    /* renamed from: e */
    public int f3482e;

    /* renamed from: f */
    public int f3483f;

    /* renamed from: g */
    public int f3484g;

    /* renamed from: h */
    public int f3485h;

    /* renamed from: i */
    public boolean f3486i;

    /* renamed from: j */
    public int f3487j;

    /* renamed from: k */
    public Paint f3488k;

    /* renamed from: l */
    public Paint f3489l;

    /* renamed from: m */
    public ColorFilter f3490m;

    /* renamed from: n */
    public ColorFilter f3491n;

    /* renamed from: o */
    public BitmapShader f3492o;

    /* renamed from: p */
    public boolean f3493p;

    /* renamed from: q */
    public RectF f3494q;

    /* renamed from: r */
    public Bitmap f3495r;

    /* renamed from: s */
    public Matrix f3496s;

    /* renamed from: t */
    public int f3497t;

    /* renamed from: u */
    public int f3498u;

    private Bitmap getBitmap() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            try {
                Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f3477v) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f3477v);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return bitmapCreateBitmap;
            } catch (Exception e4) {
                e4.printStackTrace();
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
    public final void m4303a(Canvas canvas, int i4) {
        float f4 = (i4 * 1.0f) / 2.0f;
        this.f3488k.setColorFilter(this.f3478a ? this.f3491n : this.f3490m);
        if (this.f3480c) {
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width - f4, this.f3488k);
            return;
        }
        RectF rectF = this.f3494q;
        rectF.left = f4;
        rectF.top = f4;
        rectF.right = getWidth() - f4;
        this.f3494q.bottom = getHeight() - f4;
        if (this.f3479b) {
            canvas.drawOval(this.f3494q, this.f3488k);
            return;
        }
        RectF rectF2 = this.f3494q;
        int i5 = this.f3487j;
        canvas.drawRoundRect(rectF2, i5, i5, this.f3488k);
    }

    /* renamed from: b */
    public final void m4304b(Canvas canvas, int i4) {
        if (i4 <= 0) {
            return;
        }
        float f4 = i4;
        float f5 = (1.0f * f4) / 2.0f;
        this.f3489l.setColor(this.f3478a ? this.f3484g : this.f3482e);
        this.f3489l.setStrokeWidth(f4);
        if (this.f3480c) {
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width - f5, this.f3489l);
            return;
        }
        RectF rectF = this.f3494q;
        rectF.left = f5;
        rectF.top = f5;
        rectF.right = getWidth() - f5;
        this.f3494q.bottom = getHeight() - f5;
        if (this.f3479b) {
            canvas.drawOval(this.f3494q, this.f3489l);
            return;
        }
        RectF rectF2 = this.f3494q;
        int i5 = this.f3487j;
        canvas.drawRoundRect(rectF2, i5, i5, this.f3489l);
    }

    /* renamed from: c */
    public void m4305c() {
        Bitmap bitmap = getBitmap();
        if (bitmap == this.f3495r) {
            return;
        }
        this.f3495r = bitmap;
        if (bitmap == null) {
            this.f3492o = null;
            invalidate();
            return;
        }
        this.f3493p = true;
        Bitmap bitmap2 = this.f3495r;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f3492o = new BitmapShader(bitmap2, tileMode, tileMode);
        if (this.f3488k == null) {
            Paint paint = new Paint();
            this.f3488k = paint;
            paint.setAntiAlias(true);
        }
        this.f3488k.setShader(this.f3492o);
        requestLayout();
        invalidate();
    }

    /* renamed from: d */
    public final void m4306d() {
        Bitmap bitmap;
        this.f3496s.reset();
        this.f3493p = false;
        if (this.f3492o == null || (bitmap = this.f3495r) == null) {
            return;
        }
        float width = bitmap.getWidth();
        float height = this.f3495r.getHeight();
        float fMax = Math.max(this.f3497t / width, this.f3498u / height);
        this.f3496s.setScale(fMax, fMax);
        this.f3496s.postTranslate((-((width * fMax) - this.f3497t)) / 2.0f, (-((fMax * height) - this.f3498u)) / 2.0f);
        this.f3492o.setLocalMatrix(this.f3496s);
        this.f3488k.setShader(this.f3492o);
    }

    public int getBorderColor() {
        return this.f3482e;
    }

    public int getBorderWidth() {
        return this.f3481d;
    }

    public int getCornerRadius() {
        return this.f3487j;
    }

    public int getSelectedBorderColor() {
        return this.f3484g;
    }

    public int getSelectedBorderWidth() {
        return this.f3483f;
    }

    public int getSelectedMaskColor() {
        return this.f3485h;
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f3478a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int i4 = this.f3478a ? this.f3483f : this.f3481d;
        if (this.f3495r == null || this.f3492o == null) {
            m4304b(canvas, i4);
            return;
        }
        if (this.f3497t != width || this.f3498u != height || this.f3493p) {
            this.f3497t = width;
            this.f3498u = height;
            m4306d();
        }
        m4303a(canvas, i4);
        m4304b(canvas, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f3480c) {
            int iMin = Math.min(measuredWidth, measuredHeight);
            setMeasuredDimension(iMin, iMin);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        Bitmap bitmap = this.f3495r;
        if (bitmap == null) {
            return;
        }
        boolean z3 = mode == Integer.MIN_VALUE || mode == 0;
        boolean z4 = mode2 == Integer.MIN_VALUE || mode2 == 0;
        float width = bitmap.getWidth();
        float height = this.f3495r.getHeight();
        float f4 = measuredWidth / width;
        float f5 = measuredHeight / height;
        if (!z3 || !z4) {
            if (z3) {
                setMeasuredDimension((int) (width * f5), measuredHeight);
                return;
            } else {
                if (z4) {
                    setMeasuredDimension(measuredWidth, (int) (height * f4));
                    return;
                }
                return;
            }
        }
        if (f4 >= 1.0f && f5 >= 1.0f) {
            setMeasuredDimension((int) width, (int) height);
            return;
        }
        if (f4 >= 1.0f) {
            setMeasuredDimension((int) (height * f5), measuredHeight);
            return;
        }
        if (f5 >= 1.0f) {
            setMeasuredDimension(measuredWidth, (int) (height * f4));
        } else if (f4 < f5) {
            setMeasuredDimension(measuredWidth, (int) (height * f4));
        } else {
            setMeasuredDimension((int) (width * f5), measuredHeight);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            setSelected(false);
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f3486i) {
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
    public void setAdjustViewBounds(boolean z3) {
        if (z3) {
            throw new IllegalArgumentException("不支持adjustViewBounds");
        }
    }

    public void setBorderColor(@ColorInt int i4) {
        if (this.f3482e != i4) {
            this.f3482e = i4;
            invalidate();
        }
    }

    public void setBorderWidth(int i4) {
        if (this.f3481d != i4) {
            this.f3481d = i4;
            invalidate();
        }
    }

    public void setCircle(boolean z3) {
        if (this.f3480c != z3) {
            this.f3480c = z3;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f3490m == colorFilter) {
            return;
        }
        this.f3490m = colorFilter;
        if (this.f3478a) {
            return;
        }
        invalidate();
    }

    public void setCornerRadius(int i4) {
        if (this.f3487j != i4) {
            this.f3487j = i4;
            if (this.f3480c || this.f3479b) {
                return;
            }
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m4305c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m4305c();
    }

    public void setOval(boolean z3) {
        boolean z4 = false;
        if (z3 && this.f3480c) {
            this.f3480c = false;
            z4 = true;
        }
        if (this.f3479b != z3 || z4) {
            this.f3479b = z3;
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
    public void setSelected(boolean z3) {
        if (this.f3478a != z3) {
            this.f3478a = z3;
            invalidate();
        }
    }

    public void setSelectedBorderColor(@ColorInt int i4) {
        if (this.f3484g != i4) {
            this.f3484g = i4;
            if (this.f3478a) {
                invalidate();
            }
        }
    }

    public void setSelectedBorderWidth(int i4) {
        if (this.f3483f != i4) {
            this.f3483f = i4;
            if (this.f3478a) {
                invalidate();
            }
        }
    }

    public void setSelectedColorFilter(ColorFilter colorFilter) {
        if (this.f3491n == colorFilter) {
            return;
        }
        this.f3491n = colorFilter;
        if (this.f3478a) {
            invalidate();
        }
    }

    public void setSelectedMaskColor(@ColorInt int i4) {
        if (this.f3485h != i4) {
            this.f3485h = i4;
            if (i4 != 0) {
                this.f3491n = new PorterDuffColorFilter(this.f3485h, PorterDuff.Mode.DARKEN);
            } else {
                this.f3491n = null;
            }
            if (this.f3478a) {
                invalidate();
            }
        }
        this.f3485h = i4;
    }

    public void setTouchSelectModeEnabled(boolean z3) {
        this.f3486i = z3;
    }
}
