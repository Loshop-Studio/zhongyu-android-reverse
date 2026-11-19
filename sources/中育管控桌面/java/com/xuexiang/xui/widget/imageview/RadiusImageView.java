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

/* loaded from: classes3.dex */
public class RadiusImageView extends AppCompatImageView {

    /* renamed from: v */
    public static final Bitmap.Config f4998v = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public boolean f4999a;

    /* renamed from: b */
    public boolean f5000b;

    /* renamed from: c */
    public boolean f5001c;

    /* renamed from: d */
    public int f5002d;

    /* renamed from: e */
    public int f5003e;

    /* renamed from: f */
    public int f5004f;

    /* renamed from: g */
    public int f5005g;

    /* renamed from: h */
    public int f5006h;

    /* renamed from: i */
    public boolean f5007i;

    /* renamed from: j */
    public int f5008j;

    /* renamed from: k */
    public Paint f5009k;

    /* renamed from: l */
    public Paint f5010l;

    /* renamed from: m */
    public ColorFilter f5011m;

    /* renamed from: n */
    public ColorFilter f5012n;

    /* renamed from: o */
    public BitmapShader f5013o;

    /* renamed from: p */
    public boolean f5014p;

    /* renamed from: q */
    public RectF f5015q;

    /* renamed from: r */
    public Bitmap f5016r;

    /* renamed from: s */
    public Matrix f5017s;

    /* renamed from: t */
    public int f5018t;

    /* renamed from: u */
    public int f5019u;

    private Bitmap getBitmap() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            try {
                Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f4998v) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f4998v);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return bitmapCreateBitmap;
            } catch (Exception e6) {
                e6.printStackTrace();
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
    public final void m4680a(Canvas canvas, int i6) {
        float f6 = (i6 * 1.0f) / 2.0f;
        this.f5009k.setColorFilter(this.f4999a ? this.f5012n : this.f5011m);
        if (this.f5001c) {
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width - f6, this.f5009k);
            return;
        }
        RectF rectF = this.f5015q;
        rectF.left = f6;
        rectF.top = f6;
        rectF.right = getWidth() - f6;
        this.f5015q.bottom = getHeight() - f6;
        if (this.f5000b) {
            canvas.drawOval(this.f5015q, this.f5009k);
            return;
        }
        RectF rectF2 = this.f5015q;
        int i7 = this.f5008j;
        canvas.drawRoundRect(rectF2, i7, i7, this.f5009k);
    }

    /* renamed from: b */
    public final void m4681b(Canvas canvas, int i6) {
        if (i6 <= 0) {
            return;
        }
        float f6 = i6;
        float f7 = (1.0f * f6) / 2.0f;
        this.f5010l.setColor(this.f4999a ? this.f5005g : this.f5003e);
        this.f5010l.setStrokeWidth(f6);
        if (this.f5001c) {
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width - f7, this.f5010l);
            return;
        }
        RectF rectF = this.f5015q;
        rectF.left = f7;
        rectF.top = f7;
        rectF.right = getWidth() - f7;
        this.f5015q.bottom = getHeight() - f7;
        if (this.f5000b) {
            canvas.drawOval(this.f5015q, this.f5010l);
            return;
        }
        RectF rectF2 = this.f5015q;
        int i7 = this.f5008j;
        canvas.drawRoundRect(rectF2, i7, i7, this.f5010l);
    }

    /* renamed from: c */
    public void m4682c() {
        Bitmap bitmap = getBitmap();
        if (bitmap == this.f5016r) {
            return;
        }
        this.f5016r = bitmap;
        if (bitmap == null) {
            this.f5013o = null;
            invalidate();
            return;
        }
        this.f5014p = true;
        Bitmap bitmap2 = this.f5016r;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f5013o = new BitmapShader(bitmap2, tileMode, tileMode);
        if (this.f5009k == null) {
            Paint paint = new Paint();
            this.f5009k = paint;
            paint.setAntiAlias(true);
        }
        this.f5009k.setShader(this.f5013o);
        requestLayout();
        invalidate();
    }

    /* renamed from: d */
    public final void m4683d() {
        Bitmap bitmap;
        this.f5017s.reset();
        this.f5014p = false;
        if (this.f5013o == null || (bitmap = this.f5016r) == null) {
            return;
        }
        float width = bitmap.getWidth();
        float height = this.f5016r.getHeight();
        float fMax = Math.max(this.f5018t / width, this.f5019u / height);
        this.f5017s.setScale(fMax, fMax);
        this.f5017s.postTranslate((-((width * fMax) - this.f5018t)) / 2.0f, (-((fMax * height) - this.f5019u)) / 2.0f);
        this.f5013o.setLocalMatrix(this.f5017s);
        this.f5009k.setShader(this.f5013o);
    }

    public int getBorderColor() {
        return this.f5003e;
    }

    public int getBorderWidth() {
        return this.f5002d;
    }

    public int getCornerRadius() {
        return this.f5008j;
    }

    public int getSelectedBorderColor() {
        return this.f5005g;
    }

    public int getSelectedBorderWidth() {
        return this.f5004f;
    }

    public int getSelectedMaskColor() {
        return this.f5006h;
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f4999a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int i6 = this.f4999a ? this.f5004f : this.f5002d;
        if (this.f5016r == null || this.f5013o == null) {
            m4681b(canvas, i6);
            return;
        }
        if (this.f5018t != width || this.f5019u != height || this.f5014p) {
            this.f5018t = width;
            this.f5019u = height;
            m4683d();
        }
        m4680a(canvas, i6);
        m4681b(canvas, i6);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f5001c) {
            int iMin = Math.min(measuredWidth, measuredHeight);
            setMeasuredDimension(iMin, iMin);
            return;
        }
        int mode = View.MeasureSpec.getMode(i6);
        int mode2 = View.MeasureSpec.getMode(i7);
        Bitmap bitmap = this.f5016r;
        if (bitmap == null) {
            return;
        }
        boolean z6 = true;
        boolean z7 = mode == Integer.MIN_VALUE || mode == 0;
        if (mode2 != Integer.MIN_VALUE && mode2 != 0) {
            z6 = false;
        }
        float width = bitmap.getWidth();
        float height = this.f5016r.getHeight();
        float f6 = measuredWidth / width;
        float f7 = measuredHeight / height;
        if (!z7 || !z6) {
            if (z7) {
                setMeasuredDimension((int) (width * f7), measuredHeight);
                return;
            } else {
                if (z6) {
                    setMeasuredDimension(measuredWidth, (int) (height * f6));
                    return;
                }
                return;
            }
        }
        if (f6 >= 1.0f && f7 >= 1.0f) {
            setMeasuredDimension((int) width, (int) height);
            return;
        }
        if (f6 >= 1.0f) {
            setMeasuredDimension((int) (height * f7), measuredHeight);
            return;
        }
        if (f7 >= 1.0f) {
            setMeasuredDimension(measuredWidth, (int) (height * f6));
        } else if (f6 < f7) {
            setMeasuredDimension(measuredWidth, (int) (height * f6));
        } else {
            setMeasuredDimension((int) (width * f7), measuredHeight);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            setSelected(false);
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f5007i) {
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
    public void setAdjustViewBounds(boolean z6) {
        if (z6) {
            throw new IllegalArgumentException("不支持adjustViewBounds");
        }
    }

    public void setBorderColor(@ColorInt int i6) {
        if (this.f5003e != i6) {
            this.f5003e = i6;
            invalidate();
        }
    }

    public void setBorderWidth(int i6) {
        if (this.f5002d != i6) {
            this.f5002d = i6;
            invalidate();
        }
    }

    public void setCircle(boolean z6) {
        if (this.f5001c != z6) {
            this.f5001c = z6;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f5011m == colorFilter) {
            return;
        }
        this.f5011m = colorFilter;
        if (this.f4999a) {
            return;
        }
        invalidate();
    }

    public void setCornerRadius(int i6) {
        if (this.f5008j != i6) {
            this.f5008j = i6;
            if (this.f5001c || this.f5000b) {
                return;
            }
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m4682c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m4682c();
    }

    public void setOval(boolean z6) {
        boolean z7 = false;
        if (z6 && this.f5001c) {
            this.f5001c = false;
            z7 = true;
        }
        if (this.f5000b != z6 || z7) {
            this.f5000b = z6;
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
    public void setSelected(boolean z6) {
        if (this.f4999a != z6) {
            this.f4999a = z6;
            invalidate();
        }
    }

    public void setSelectedBorderColor(@ColorInt int i6) {
        if (this.f5005g != i6) {
            this.f5005g = i6;
            if (this.f4999a) {
                invalidate();
            }
        }
    }

    public void setSelectedBorderWidth(int i6) {
        if (this.f5004f != i6) {
            this.f5004f = i6;
            if (this.f4999a) {
                invalidate();
            }
        }
    }

    public void setSelectedColorFilter(ColorFilter colorFilter) {
        if (this.f5012n == colorFilter) {
            return;
        }
        this.f5012n = colorFilter;
        if (this.f4999a) {
            invalidate();
        }
    }

    public void setSelectedMaskColor(@ColorInt int i6) {
        if (this.f5006h != i6) {
            this.f5006h = i6;
            if (i6 != 0) {
                this.f5012n = new PorterDuffColorFilter(this.f5006h, PorterDuff.Mode.DARKEN);
            } else {
                this.f5012n = null;
            }
            if (this.f4999a) {
                invalidate();
            }
        }
        this.f5006h = i6;
    }

    public void setTouchSelectModeEnabled(boolean z6) {
        this.f5007i = z6;
    }
}
