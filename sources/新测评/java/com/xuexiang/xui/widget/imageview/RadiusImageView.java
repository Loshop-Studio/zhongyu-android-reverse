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
    public static final Bitmap.Config f6273v = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public boolean f6274a;

    /* renamed from: b */
    public boolean f6275b;

    /* renamed from: c */
    public boolean f6276c;

    /* renamed from: d */
    public int f6277d;

    /* renamed from: e */
    public int f6278e;

    /* renamed from: f */
    public int f6279f;

    /* renamed from: g */
    public int f6280g;

    /* renamed from: h */
    public int f6281h;

    /* renamed from: i */
    public boolean f6282i;

    /* renamed from: j */
    public int f6283j;

    /* renamed from: k */
    public Paint f6284k;

    /* renamed from: l */
    public Paint f6285l;

    /* renamed from: m */
    public ColorFilter f6286m;

    /* renamed from: n */
    public ColorFilter f6287n;

    /* renamed from: o */
    public BitmapShader f6288o;

    /* renamed from: p */
    public boolean f6289p;

    /* renamed from: q */
    public RectF f6290q;

    /* renamed from: r */
    public Bitmap f6291r;

    /* renamed from: s */
    public Matrix f6292s;

    /* renamed from: t */
    public int f6293t;

    /* renamed from: u */
    public int f6294u;

    private Bitmap getBitmap() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            try {
                Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f6273v) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f6273v);
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
    public final void m5661a(Canvas canvas, int i10) {
        float f10 = (i10 * 1.0f) / 2.0f;
        this.f6284k.setColorFilter(this.f6274a ? this.f6287n : this.f6286m);
        if (this.f6276c) {
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width - f10, this.f6284k);
            return;
        }
        RectF rectF = this.f6290q;
        rectF.left = f10;
        rectF.top = f10;
        rectF.right = getWidth() - f10;
        this.f6290q.bottom = getHeight() - f10;
        if (this.f6275b) {
            canvas.drawOval(this.f6290q, this.f6284k);
            return;
        }
        RectF rectF2 = this.f6290q;
        int i11 = this.f6283j;
        canvas.drawRoundRect(rectF2, i11, i11, this.f6284k);
    }

    /* renamed from: b */
    public final void m5662b(Canvas canvas, int i10) {
        if (i10 <= 0) {
            return;
        }
        float f10 = i10;
        float f11 = (1.0f * f10) / 2.0f;
        this.f6285l.setColor(this.f6274a ? this.f6280g : this.f6278e);
        this.f6285l.setStrokeWidth(f10);
        if (this.f6276c) {
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width - f11, this.f6285l);
            return;
        }
        RectF rectF = this.f6290q;
        rectF.left = f11;
        rectF.top = f11;
        rectF.right = getWidth() - f11;
        this.f6290q.bottom = getHeight() - f11;
        if (this.f6275b) {
            canvas.drawOval(this.f6290q, this.f6285l);
            return;
        }
        RectF rectF2 = this.f6290q;
        int i11 = this.f6283j;
        canvas.drawRoundRect(rectF2, i11, i11, this.f6285l);
    }

    /* renamed from: c */
    public void m5663c() {
        Bitmap bitmap = getBitmap();
        if (bitmap == this.f6291r) {
            return;
        }
        this.f6291r = bitmap;
        if (bitmap == null) {
            this.f6288o = null;
            invalidate();
            return;
        }
        this.f6289p = true;
        Bitmap bitmap2 = this.f6291r;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f6288o = new BitmapShader(bitmap2, tileMode, tileMode);
        if (this.f6284k == null) {
            Paint paint = new Paint();
            this.f6284k = paint;
            paint.setAntiAlias(true);
        }
        this.f6284k.setShader(this.f6288o);
        requestLayout();
        invalidate();
    }

    /* renamed from: d */
    public final void m5664d() {
        Bitmap bitmap;
        this.f6292s.reset();
        this.f6289p = false;
        if (this.f6288o == null || (bitmap = this.f6291r) == null) {
            return;
        }
        float width = bitmap.getWidth();
        float height = this.f6291r.getHeight();
        float fMax = Math.max(this.f6293t / width, this.f6294u / height);
        this.f6292s.setScale(fMax, fMax);
        this.f6292s.postTranslate((-((width * fMax) - this.f6293t)) / 2.0f, (-((fMax * height) - this.f6294u)) / 2.0f);
        this.f6288o.setLocalMatrix(this.f6292s);
        this.f6284k.setShader(this.f6288o);
    }

    public int getBorderColor() {
        return this.f6278e;
    }

    public int getBorderWidth() {
        return this.f6277d;
    }

    public int getCornerRadius() {
        return this.f6283j;
    }

    public int getSelectedBorderColor() {
        return this.f6280g;
    }

    public int getSelectedBorderWidth() {
        return this.f6279f;
    }

    public int getSelectedMaskColor() {
        return this.f6281h;
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f6274a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int i10 = this.f6274a ? this.f6279f : this.f6277d;
        if (this.f6291r == null || this.f6288o == null) {
            m5662b(canvas, i10);
            return;
        }
        if (this.f6293t != width || this.f6294u != height || this.f6289p) {
            this.f6293t = width;
            this.f6294u = height;
            m5664d();
        }
        m5661a(canvas, i10);
        m5662b(canvas, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f6276c) {
            int iMin = Math.min(measuredWidth, measuredHeight);
            setMeasuredDimension(iMin, iMin);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        Bitmap bitmap = this.f6291r;
        if (bitmap == null) {
            return;
        }
        boolean z9 = true;
        boolean z10 = mode == Integer.MIN_VALUE || mode == 0;
        if (mode2 != Integer.MIN_VALUE && mode2 != 0) {
            z9 = false;
        }
        float width = bitmap.getWidth();
        float height = this.f6291r.getHeight();
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
        if (!this.f6282i) {
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

    public void setBorderColor(@ColorInt int i10) {
        if (this.f6278e != i10) {
            this.f6278e = i10;
            invalidate();
        }
    }

    public void setBorderWidth(int i10) {
        if (this.f6277d != i10) {
            this.f6277d = i10;
            invalidate();
        }
    }

    public void setCircle(boolean z9) {
        if (this.f6276c != z9) {
            this.f6276c = z9;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f6286m == colorFilter) {
            return;
        }
        this.f6286m = colorFilter;
        if (this.f6274a) {
            return;
        }
        invalidate();
    }

    public void setCornerRadius(int i10) {
        if (this.f6283j != i10) {
            this.f6283j = i10;
            if (this.f6276c || this.f6275b) {
                return;
            }
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m5663c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m5663c();
    }

    public void setOval(boolean z9) {
        boolean z10 = false;
        if (z9 && this.f6276c) {
            this.f6276c = false;
            z10 = true;
        }
        if (this.f6275b != z9 || z10) {
            this.f6275b = z9;
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
        if (this.f6274a != z9) {
            this.f6274a = z9;
            invalidate();
        }
    }

    public void setSelectedBorderColor(@ColorInt int i10) {
        if (this.f6280g != i10) {
            this.f6280g = i10;
            if (this.f6274a) {
                invalidate();
            }
        }
    }

    public void setSelectedBorderWidth(int i10) {
        if (this.f6279f != i10) {
            this.f6279f = i10;
            if (this.f6274a) {
                invalidate();
            }
        }
    }

    public void setSelectedColorFilter(ColorFilter colorFilter) {
        if (this.f6287n == colorFilter) {
            return;
        }
        this.f6287n = colorFilter;
        if (this.f6274a) {
            invalidate();
        }
    }

    public void setSelectedMaskColor(@ColorInt int i10) {
        if (this.f6281h != i10) {
            this.f6281h = i10;
            if (i10 != 0) {
                this.f6287n = new PorterDuffColorFilter(this.f6281h, PorterDuff.Mode.DARKEN);
            } else {
                this.f6287n = null;
            }
            if (this.f6274a) {
                invalidate();
            }
        }
        this.f6281h = i10;
    }

    public void setTouchSelectModeEnabled(boolean z9) {
        this.f6282i = z9;
    }
}
