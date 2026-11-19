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
    public static final Bitmap.Config f7531v = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public boolean f7532a;

    /* renamed from: b */
    public boolean f7533b;

    /* renamed from: c */
    public boolean f7534c;

    /* renamed from: d */
    public int f7535d;

    /* renamed from: e */
    public int f7536e;

    /* renamed from: f */
    public int f7537f;

    /* renamed from: g */
    public int f7538g;

    /* renamed from: h */
    public int f7539h;

    /* renamed from: i */
    public boolean f7540i;

    /* renamed from: j */
    public int f7541j;

    /* renamed from: k */
    public Paint f7542k;

    /* renamed from: l */
    public Paint f7543l;

    /* renamed from: m */
    public ColorFilter f7544m;

    /* renamed from: n */
    public ColorFilter f7545n;

    /* renamed from: o */
    public BitmapShader f7546o;

    /* renamed from: p */
    public boolean f7547p;

    /* renamed from: q */
    public RectF f7548q;

    /* renamed from: r */
    public Bitmap f7549r;

    /* renamed from: s */
    public Matrix f7550s;

    /* renamed from: t */
    public int f7551t;

    /* renamed from: u */
    public int f7552u;

    private Bitmap getBitmap() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            try {
                Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f7531v) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f7531v);
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
    public final void m6767a(Canvas canvas, int i9) {
        float f10 = (i9 * 1.0f) / 2.0f;
        this.f7542k.setColorFilter(this.f7532a ? this.f7545n : this.f7544m);
        if (this.f7534c) {
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width - f10, this.f7542k);
            return;
        }
        RectF rectF = this.f7548q;
        rectF.left = f10;
        rectF.top = f10;
        rectF.right = getWidth() - f10;
        this.f7548q.bottom = getHeight() - f10;
        if (this.f7533b) {
            canvas.drawOval(this.f7548q, this.f7542k);
            return;
        }
        RectF rectF2 = this.f7548q;
        int i10 = this.f7541j;
        canvas.drawRoundRect(rectF2, i10, i10, this.f7542k);
    }

    /* renamed from: b */
    public final void m6768b(Canvas canvas, int i9) {
        if (i9 <= 0) {
            return;
        }
        float f10 = i9;
        float f11 = (1.0f * f10) / 2.0f;
        this.f7543l.setColor(this.f7532a ? this.f7538g : this.f7536e);
        this.f7543l.setStrokeWidth(f10);
        if (this.f7534c) {
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width - f11, this.f7543l);
            return;
        }
        RectF rectF = this.f7548q;
        rectF.left = f11;
        rectF.top = f11;
        rectF.right = getWidth() - f11;
        this.f7548q.bottom = getHeight() - f11;
        if (this.f7533b) {
            canvas.drawOval(this.f7548q, this.f7543l);
            return;
        }
        RectF rectF2 = this.f7548q;
        int i10 = this.f7541j;
        canvas.drawRoundRect(rectF2, i10, i10, this.f7543l);
    }

    /* renamed from: c */
    public void m6769c() {
        Bitmap bitmap = getBitmap();
        if (bitmap == this.f7549r) {
            return;
        }
        this.f7549r = bitmap;
        if (bitmap == null) {
            this.f7546o = null;
            invalidate();
            return;
        }
        this.f7547p = true;
        Bitmap bitmap2 = this.f7549r;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f7546o = new BitmapShader(bitmap2, tileMode, tileMode);
        if (this.f7542k == null) {
            Paint paint = new Paint();
            this.f7542k = paint;
            paint.setAntiAlias(true);
        }
        this.f7542k.setShader(this.f7546o);
        requestLayout();
        invalidate();
    }

    /* renamed from: d */
    public final void m6770d() {
        Bitmap bitmap;
        this.f7550s.reset();
        this.f7547p = false;
        if (this.f7546o == null || (bitmap = this.f7549r) == null) {
            return;
        }
        float width = bitmap.getWidth();
        float height = this.f7549r.getHeight();
        float fMax = Math.max(this.f7551t / width, this.f7552u / height);
        this.f7550s.setScale(fMax, fMax);
        this.f7550s.postTranslate((-((width * fMax) - this.f7551t)) / 2.0f, (-((fMax * height) - this.f7552u)) / 2.0f);
        this.f7546o.setLocalMatrix(this.f7550s);
        this.f7542k.setShader(this.f7546o);
    }

    public int getBorderColor() {
        return this.f7536e;
    }

    public int getBorderWidth() {
        return this.f7535d;
    }

    public int getCornerRadius() {
        return this.f7541j;
    }

    public int getSelectedBorderColor() {
        return this.f7538g;
    }

    public int getSelectedBorderWidth() {
        return this.f7537f;
    }

    public int getSelectedMaskColor() {
        return this.f7539h;
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f7532a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int i9 = this.f7532a ? this.f7537f : this.f7535d;
        if (this.f7549r == null || this.f7546o == null) {
            m6768b(canvas, i9);
            return;
        }
        if (this.f7551t != width || this.f7552u != height || this.f7547p) {
            this.f7551t = width;
            this.f7552u = height;
            m6770d();
        }
        m6767a(canvas, i9);
        m6768b(canvas, i9);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f7534c) {
            int iMin = Math.min(measuredWidth, measuredHeight);
            setMeasuredDimension(iMin, iMin);
            return;
        }
        int mode = View.MeasureSpec.getMode(i9);
        int mode2 = View.MeasureSpec.getMode(i10);
        Bitmap bitmap = this.f7549r;
        if (bitmap == null) {
            return;
        }
        boolean z9 = true;
        boolean z10 = mode == Integer.MIN_VALUE || mode == 0;
        if (mode2 != Integer.MIN_VALUE && mode2 != 0) {
            z9 = false;
        }
        float width = bitmap.getWidth();
        float height = this.f7549r.getHeight();
        float f10 = measuredWidth / width;
        float f11 = measuredHeight / height;
        if (!z10 || !z9) {
            if (z10) {
                setMeasuredDimension((int) (width * f11), measuredHeight);
                return;
            } else {
                if (z9) {
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
        if (!this.f7540i) {
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
    public void setAdjustViewBounds(boolean z9) {
        if (z9) {
            throw new IllegalArgumentException("不支持adjustViewBounds");
        }
    }

    public void setBorderColor(@ColorInt int i9) {
        if (this.f7536e != i9) {
            this.f7536e = i9;
            invalidate();
        }
    }

    public void setBorderWidth(int i9) {
        if (this.f7535d != i9) {
            this.f7535d = i9;
            invalidate();
        }
    }

    public void setCircle(boolean z9) {
        if (this.f7534c != z9) {
            this.f7534c = z9;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f7544m == colorFilter) {
            return;
        }
        this.f7544m = colorFilter;
        if (this.f7532a) {
            return;
        }
        invalidate();
    }

    public void setCornerRadius(int i9) {
        if (this.f7541j != i9) {
            this.f7541j = i9;
            if (this.f7534c || this.f7533b) {
                return;
            }
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m6769c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m6769c();
    }

    public void setOval(boolean z9) {
        boolean z10 = false;
        if (z9 && this.f7534c) {
            this.f7534c = false;
            z10 = true;
        }
        if (this.f7533b != z9 || z10) {
            this.f7533b = z9;
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
    public void setSelected(boolean z9) {
        if (this.f7532a != z9) {
            this.f7532a = z9;
            invalidate();
        }
    }

    public void setSelectedBorderColor(@ColorInt int i9) {
        if (this.f7538g != i9) {
            this.f7538g = i9;
            if (this.f7532a) {
                invalidate();
            }
        }
    }

    public void setSelectedBorderWidth(int i9) {
        if (this.f7537f != i9) {
            this.f7537f = i9;
            if (this.f7532a) {
                invalidate();
            }
        }
    }

    public void setSelectedColorFilter(ColorFilter colorFilter) {
        if (this.f7545n == colorFilter) {
            return;
        }
        this.f7545n = colorFilter;
        if (this.f7532a) {
            invalidate();
        }
    }

    public void setSelectedMaskColor(@ColorInt int i9) {
        if (this.f7539h != i9) {
            this.f7539h = i9;
            if (i9 != 0) {
                this.f7545n = new PorterDuffColorFilter(this.f7539h, PorterDuff.Mode.DARKEN);
            } else {
                this.f7545n = null;
            }
            if (this.f7532a) {
                invalidate();
            }
        }
        this.f7539h = i9;
    }

    public void setTouchSelectModeEnabled(boolean z9) {
        this.f7540i = z9;
    }
}
