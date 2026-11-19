package com.xuexiang.xui.widget.imageview.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import p071d2.AbstractC8278a;
import p071d2.AbstractC8283f;
import p071d2.AbstractC8286i;

/* loaded from: classes4.dex */
public class CropOverlayView extends View {

    /* renamed from: A */
    public static final float f7712A;

    /* renamed from: B */
    public static final float f7713B;

    /* renamed from: y */
    public static final float f7714y;

    /* renamed from: z */
    public static final float f7715z;

    /* renamed from: a */
    public Paint f7716a;

    /* renamed from: b */
    public Paint f7717b;

    /* renamed from: c */
    public Paint f7718c;

    /* renamed from: d */
    public Paint f7719d;

    /* renamed from: e */
    public Rect f7720e;

    /* renamed from: f */
    public float f7721f;

    /* renamed from: g */
    public float f7722g;

    /* renamed from: h */
    public Pair f7723h;

    /* renamed from: i */
    public Handle f7724i;

    /* renamed from: j */
    public boolean f7725j;

    /* renamed from: k */
    public int f7726k;

    /* renamed from: l */
    public int f7727l;

    /* renamed from: m */
    public float f7728m;

    /* renamed from: n */
    public int f7729n;

    /* renamed from: o */
    public boolean f7730o;

    /* renamed from: p */
    public float f7731p;

    /* renamed from: q */
    public float f7732q;

    /* renamed from: r */
    public float f7733r;

    /* renamed from: s */
    public Bitmap f7734s;

    /* renamed from: t */
    public int f7735t;

    /* renamed from: u */
    public int f7736u;

    /* renamed from: v */
    public Bitmap f7737v;

    /* renamed from: w */
    public int f7738w;

    /* renamed from: x */
    public int f7739x;

    static {
        float fM13454a = AbstractC8286i.m13454a();
        f7714y = fM13454a;
        float fM13455b = AbstractC8286i.m13455b();
        f7715z = fM13455b;
        float f10 = (fM13454a / 2.0f) - (fM13455b / 2.0f);
        f7712A = f10;
        f7713B = (fM13454a / 2.0f) + f10;
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7725j = false;
        this.f7726k = 1;
        this.f7727l = 1;
        this.f7728m = 1 / 1;
        this.f7730o = false;
        this.f7734s = null;
        this.f7735t = 0;
        this.f7736u = 0;
        this.f7737v = null;
        this.f7738w = 0;
        this.f7739x = 0;
        m6862e(context);
    }

    /* renamed from: m */
    public static boolean m6857m() {
        return Math.abs(Edge.LEFT.m6878h() - Edge.RIGHT.m6878h()) >= 100.0f && Math.abs(Edge.TOP.m6878h() - Edge.BOTTOM.m6878h()) >= 100.0f;
    }

    /* renamed from: a */
    public final void m6858a(Canvas canvas, Rect rect) {
        float fM6878h = Edge.LEFT.m6878h();
        float fM6878h2 = Edge.TOP.m6878h();
        float fM6878h3 = Edge.RIGHT.m6878h();
        float fM6878h4 = Edge.BOTTOM.m6878h();
        canvas.drawRect(rect.left, rect.top, rect.right, fM6878h2, this.f7719d);
        canvas.drawRect(rect.left, fM6878h4, rect.right, rect.bottom, this.f7719d);
        canvas.drawRect(rect.left, fM6878h2, fM6878h, fM6878h4, this.f7719d);
        canvas.drawRect(fM6878h3, fM6878h2, rect.right, fM6878h4, this.f7719d);
    }

    /* renamed from: b */
    public final void m6859b(Canvas canvas) {
        float fWidth = this.f7720e.width();
        float f10 = this.f7735t / fWidth;
        float fHeight = this.f7736u / this.f7720e.height();
        int iM6875j = (int) (Edge.m6875j() * f10);
        int iM6874i = (int) (Edge.m6874i() * fHeight);
        this.f7716a.setStrokeWidth(0.0f);
        this.f7716a.setTextAlign(Paint.Align.CENTER);
        this.f7716a.setTextSize(25.0f);
        canvas.drawText(iM6875j + "x" + iM6874i, (Edge.LEFT.m6878h() / 2.0f) + (Edge.RIGHT.m6878h() / 2.0f), (Edge.TOP.m6878h() / 2.0f) + (Edge.BOTTOM.m6878h() / 2.0f), this.f7716a);
    }

    /* renamed from: c */
    public final void m6860c(Canvas canvas) {
        float fM6878h = Edge.LEFT.m6878h();
        float fM6878h2 = Edge.TOP.m6878h();
        float fM6878h3 = Edge.RIGHT.m6878h();
        float fM6878h4 = Edge.BOTTOM.m6878h();
        Bitmap bitmap = this.f7737v;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, fM6878h - (this.f7738w / 2.0f), fM6878h2 - (this.f7739x / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f7737v, fM6878h3 - (this.f7738w / 2.0f), fM6878h2 - (this.f7739x / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f7737v, fM6878h - (this.f7738w / 2.0f), fM6878h4 - (this.f7739x / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f7737v, fM6878h3 - (this.f7738w / 2.0f), fM6878h4 - (this.f7739x / 2.0f), (Paint) null);
            return;
        }
        float f10 = this.f7732q;
        canvas.drawLine(fM6878h - f10, fM6878h2 - this.f7731p, fM6878h - f10, this.f7733r + fM6878h2, this.f7718c);
        float f11 = this.f7732q;
        canvas.drawLine(fM6878h, fM6878h2 - f11, fM6878h + this.f7733r, fM6878h2 - f11, this.f7718c);
        float f12 = this.f7732q;
        canvas.drawLine(fM6878h3 + f12, fM6878h2 - this.f7731p, fM6878h3 + f12, fM6878h2 + this.f7733r, this.f7718c);
        float f13 = this.f7732q;
        canvas.drawLine(fM6878h3, fM6878h2 - f13, fM6878h3 - this.f7733r, fM6878h2 - f13, this.f7718c);
        float f14 = this.f7732q;
        canvas.drawLine(fM6878h - f14, this.f7731p + fM6878h4, fM6878h - f14, fM6878h4 - this.f7733r, this.f7718c);
        float f15 = this.f7732q;
        canvas.drawLine(fM6878h, fM6878h4 + f15, fM6878h + this.f7733r, fM6878h4 + f15, this.f7718c);
        float f16 = this.f7732q;
        canvas.drawLine(fM6878h3 + f16, this.f7731p + fM6878h4, fM6878h3 + f16, fM6878h4 - this.f7733r, this.f7718c);
        float f17 = this.f7732q;
        canvas.drawLine(fM6878h3, fM6878h4 + f17, fM6878h3 - this.f7733r, fM6878h4 + f17, this.f7718c);
    }

    /* renamed from: d */
    public final void m6861d(Canvas canvas) {
        float fM6878h = Edge.LEFT.m6878h();
        float fM6878h2 = Edge.TOP.m6878h();
        float fM6878h3 = Edge.RIGHT.m6878h();
        float fM6878h4 = Edge.BOTTOM.m6878h();
        float fM6875j = Edge.m6875j() / 3.0f;
        float f10 = fM6878h + fM6875j;
        canvas.drawLine(f10, fM6878h2, f10, fM6878h4, this.f7717b);
        float f11 = fM6878h3 - fM6875j;
        canvas.drawLine(f11, fM6878h2, f11, fM6878h4, this.f7717b);
        float fM6874i = Edge.m6874i() / 3.0f;
        float f12 = fM6878h2 + fM6874i;
        canvas.drawLine(fM6878h, f12, fM6878h3, f12, this.f7717b);
        float f13 = fM6878h4 - fM6874i;
        canvas.drawLine(fM6878h, f13, fM6878h3, f13, this.f7717b);
    }

    /* renamed from: e */
    public final void m6862e(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f7721f = AbstractC8283f.m13446d(context);
        this.f7722g = TypedValue.applyDimension(1, 6.0f, displayMetrics);
        this.f7716a = AbstractC8286i.m13457d(context);
        this.f7717b = AbstractC8286i.m13459f(context);
        this.f7719d = AbstractC8286i.m13456c(context);
        this.f7718c = AbstractC8286i.m13458e(context);
        this.f7732q = TypedValue.applyDimension(1, f7712A, displayMetrics);
        this.f7731p = TypedValue.applyDimension(1, f7713B, displayMetrics);
        this.f7733r = TypedValue.applyDimension(1, 20.0f, displayMetrics);
        this.f7729n = 1;
    }

    /* renamed from: f */
    public final void m6863f(Rect rect) {
        if (!this.f7730o) {
            this.f7730o = true;
        }
        if (!this.f7725j) {
            float fWidth = rect.width() * 0.1f;
            float fHeight = rect.height() * 0.1f;
            Edge.LEFT.m6883o(rect.left + fWidth);
            Edge.TOP.m6883o(rect.top + fHeight);
            Edge.RIGHT.m6883o(rect.right - fWidth);
            Edge.BOTTOM.m6883o(rect.bottom - fHeight);
            return;
        }
        if (AbstractC8278a.m13431b(rect) > this.f7728m) {
            Edge edge = Edge.TOP;
            edge.m6883o(rect.top);
            Edge edge2 = Edge.BOTTOM;
            edge2.m6883o(rect.bottom);
            float width = getWidth() / 2.0f;
            float fMax = Math.max(40.0f, AbstractC8278a.m13437h(edge.m6878h(), edge2.m6878h(), this.f7728m));
            if (fMax == 40.0f) {
                this.f7728m = 40.0f / (edge2.m6878h() - edge.m6878h());
            }
            float f10 = fMax / 2.0f;
            Edge.LEFT.m6883o(width - f10);
            Edge.RIGHT.m6883o(width + f10);
            return;
        }
        Edge edge3 = Edge.LEFT;
        edge3.m6883o(rect.left);
        Edge edge4 = Edge.RIGHT;
        edge4.m6883o(rect.right);
        float height = getHeight() / 2.0f;
        float fMax2 = Math.max(40.0f, AbstractC8278a.m13433d(edge3.m6878h(), edge4.m6878h(), this.f7728m));
        if (fMax2 == 40.0f) {
            float fM6878h = edge4.m6878h() - edge3.m6878h();
            if (fM6878h > 0.0f) {
                this.f7728m = fM6878h / 40.0f;
            }
        }
        float f11 = fMax2 / 2.0f;
        Edge.TOP.m6883o(height - f11);
        Edge.BOTTOM.m6883o(height + f11);
    }

    /* renamed from: g */
    public final void m6864g(float f10, float f11) {
        float fM6878h = Edge.LEFT.m6878h();
        float fM6878h2 = Edge.TOP.m6878h();
        float fM6878h3 = Edge.RIGHT.m6878h();
        float fM6878h4 = Edge.BOTTOM.m6878h();
        Handle handleM13445c = AbstractC8283f.m13445c(f10, f11, fM6878h, fM6878h2, fM6878h3, fM6878h4, this.f7721f);
        this.f7724i = handleM13445c;
        if (handleM13445c == null) {
            return;
        }
        this.f7723h = AbstractC8283f.m13444b(handleM13445c, f10, f11, fM6878h, fM6878h2, fM6878h3, fM6878h4);
        invalidate();
    }

    /* renamed from: h */
    public final void m6865h(float f10, float f11) {
        if (this.f7724i == null) {
            return;
        }
        float fFloatValue = f10 + ((Float) this.f7723h.first).floatValue();
        float fFloatValue2 = f11 + ((Float) this.f7723h.second).floatValue();
        if (this.f7725j) {
            this.f7724i.m6886a(fFloatValue, fFloatValue2, this.f7728m, this.f7720e, this.f7722g);
        } else {
            this.f7724i.m6887b(fFloatValue, fFloatValue2, this.f7720e, this.f7722g);
        }
        invalidate();
    }

    /* renamed from: i */
    public final void m6866i() {
        if (this.f7724i == null) {
            return;
        }
        this.f7724i = null;
        invalidate();
    }

    /* renamed from: j */
    public void m6867j() {
        if (this.f7730o) {
            m6863f(this.f7720e);
            invalidate();
        }
    }

    /* renamed from: k */
    public void m6868k(int i10, int i11) {
        this.f7735t = i10;
        this.f7736u = i11;
    }

    /* renamed from: l */
    public void m6869l(int i10, boolean z10, int i11, int i12) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Guideline value must be set between 0 and 2. See documentation.");
        }
        this.f7729n = i10;
        this.f7725j = z10;
        if (i11 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f7726k = i11;
        this.f7728m = i11 / this.f7727l;
        if (i12 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f7727l = i12;
        this.f7728m = i11 / i12;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m6858a(canvas, this.f7720e);
        if (m6857m()) {
            int i10 = this.f7729n;
            if (i10 == 2) {
                m6861d(canvas);
                m6859b(canvas);
            } else if (i10 == 1 && this.f7724i != null) {
                m6861d(canvas);
                m6859b(canvas);
            }
        }
        canvas.drawRect(Edge.LEFT.m6878h(), Edge.TOP.m6878h(), Edge.RIGHT.m6878h(), Edge.BOTTOM.m6878h(), this.f7716a);
        m6860c(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        m6863f(this.f7720e);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            m6864g(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                m6865h(motionEvent.getX(), motionEvent.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        m6866i();
        return true;
    }

    public void setAspectRatioX(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f7726k = i10;
        this.f7728m = i10 / this.f7727l;
        m6867j();
    }

    public void setAspectRatioY(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f7727l = i10;
        this.f7728m = this.f7726k / i10;
        m6867j();
    }

    public void setBitmapRect(Rect rect) {
        this.f7720e = rect;
        m6863f(rect);
    }

    public void setBorderAndGuidelineColor(@ColorInt int i10) {
        this.f7716a.setColor(i10);
        this.f7717b.setColor(i10);
        m6867j();
    }

    public void setBorderColor(@ColorInt int i10) {
        this.f7716a.setColor(i10);
        m6867j();
    }

    public void setBorderWidth(@Dimension float f10) {
        this.f7716a.setStrokeWidth(f10);
        m6867j();
    }

    public void setCornerColor(@ColorInt int i10) {
        this.f7718c.setColor(i10);
        m6867j();
    }

    public void setCornerWidth(@Dimension float f10) {
        this.f7718c.setStrokeWidth(f10);
        m6867j();
    }

    public void setCropOverlayCornerBitmap(Bitmap bitmap) {
        this.f7737v = bitmap;
        if (bitmap != null) {
            this.f7738w = bitmap.getWidth();
            this.f7739x = this.f7737v.getHeight();
        }
    }

    public void setFixedAspectRatio(boolean z10) {
        this.f7725j = z10;
        m6867j();
    }

    public void setGuidelineColor(@ColorInt int i10) {
        this.f7717b.setColor(i10);
        m6867j();
    }

    public void setGuidelineWidth(@Dimension float f10) {
        this.f7717b.setStrokeWidth(f10);
        m6867j();
    }

    public void setGuidelines(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Guideline value must be set between 0 and 2. See documentation.");
        }
        this.f7729n = i10;
        m6867j();
    }
}
