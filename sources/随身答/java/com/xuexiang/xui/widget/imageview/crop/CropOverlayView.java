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
import p261u3.AbstractC9672a;
import p261u3.AbstractC9677f;
import p261u3.AbstractC9679h;

/* loaded from: classes4.dex */
public class CropOverlayView extends View {

    /* renamed from: A */
    public static final float f7553A;

    /* renamed from: B */
    public static final float f7554B;

    /* renamed from: y */
    public static final float f7555y;

    /* renamed from: z */
    public static final float f7556z;

    /* renamed from: a */
    public Paint f7557a;

    /* renamed from: b */
    public Paint f7558b;

    /* renamed from: c */
    public Paint f7559c;

    /* renamed from: d */
    public Paint f7560d;

    /* renamed from: e */
    public Rect f7561e;

    /* renamed from: f */
    public float f7562f;

    /* renamed from: g */
    public float f7563g;

    /* renamed from: h */
    public Pair f7564h;

    /* renamed from: i */
    public Handle f7565i;

    /* renamed from: j */
    public boolean f7566j;

    /* renamed from: k */
    public int f7567k;

    /* renamed from: l */
    public int f7568l;

    /* renamed from: m */
    public float f7569m;

    /* renamed from: n */
    public int f7570n;

    /* renamed from: o */
    public boolean f7571o;

    /* renamed from: p */
    public float f7572p;

    /* renamed from: q */
    public float f7573q;

    /* renamed from: r */
    public float f7574r;

    /* renamed from: s */
    public Bitmap f7575s;

    /* renamed from: t */
    public int f7576t;

    /* renamed from: u */
    public int f7577u;

    /* renamed from: v */
    public Bitmap f7578v;

    /* renamed from: w */
    public int f7579w;

    /* renamed from: x */
    public int f7580x;

    static {
        float fM16152a = AbstractC9679h.m16152a();
        f7555y = fM16152a;
        float fM16153b = AbstractC9679h.m16153b();
        f7556z = fM16153b;
        float f10 = (fM16152a / 2.0f) - (fM16153b / 2.0f);
        f7553A = f10;
        f7554B = (fM16152a / 2.0f) + f10;
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7566j = false;
        this.f7567k = 1;
        this.f7568l = 1;
        this.f7569m = 1 / 1;
        this.f7571o = false;
        this.f7575s = null;
        this.f7576t = 0;
        this.f7577u = 0;
        this.f7578v = null;
        this.f7579w = 0;
        this.f7580x = 0;
        m6776e(context);
    }

    /* renamed from: k */
    public static boolean m6771k() {
        return Math.abs(Edge.LEFT.m6793t() - Edge.RIGHT.m6793t()) >= 100.0f && Math.abs(Edge.TOP.m6793t() - Edge.BOTTOM.m6793t()) >= 100.0f;
    }

    /* renamed from: a */
    public final void m6772a(Canvas canvas, Rect rect) {
        float fM6793t = Edge.LEFT.m6793t();
        float fM6793t2 = Edge.TOP.m6793t();
        float fM6793t3 = Edge.RIGHT.m6793t();
        float fM6793t4 = Edge.BOTTOM.m6793t();
        canvas.drawRect(rect.left, rect.top, rect.right, fM6793t2, this.f7560d);
        canvas.drawRect(rect.left, fM6793t4, rect.right, rect.bottom, this.f7560d);
        canvas.drawRect(rect.left, fM6793t2, fM6793t, fM6793t4, this.f7560d);
        canvas.drawRect(fM6793t3, fM6793t2, rect.right, fM6793t4, this.f7560d);
    }

    /* renamed from: b */
    public final void m6773b(Canvas canvas) {
        float fWidth = this.f7561e.width();
        float f10 = this.f7576t / fWidth;
        float fHeight = this.f7577u / this.f7561e.height();
        int iM6787v = (int) (Edge.m6787v() * f10);
        int iM6786u = (int) (Edge.m6786u() * fHeight);
        this.f7557a.setStrokeWidth(0.0f);
        this.f7557a.setTextAlign(Paint.Align.CENTER);
        this.f7557a.setTextSize(25.0f);
        canvas.drawText(iM6787v + "x" + iM6786u, (Edge.LEFT.m6793t() / 2.0f) + (Edge.RIGHT.m6793t() / 2.0f), (Edge.TOP.m6793t() / 2.0f) + (Edge.BOTTOM.m6793t() / 2.0f), this.f7557a);
    }

    /* renamed from: c */
    public final void m6774c(Canvas canvas) {
        float fM6793t = Edge.LEFT.m6793t();
        float fM6793t2 = Edge.TOP.m6793t();
        float fM6793t3 = Edge.RIGHT.m6793t();
        float fM6793t4 = Edge.BOTTOM.m6793t();
        Bitmap bitmap = this.f7578v;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, fM6793t - (this.f7579w / 2.0f), fM6793t2 - (this.f7580x / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f7578v, fM6793t3 - (this.f7579w / 2.0f), fM6793t2 - (this.f7580x / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f7578v, fM6793t - (this.f7579w / 2.0f), fM6793t4 - (this.f7580x / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f7578v, fM6793t3 - (this.f7579w / 2.0f), fM6793t4 - (this.f7580x / 2.0f), (Paint) null);
            return;
        }
        float f10 = this.f7573q;
        canvas.drawLine(fM6793t - f10, fM6793t2 - this.f7572p, fM6793t - f10, this.f7574r + fM6793t2, this.f7559c);
        float f11 = this.f7573q;
        canvas.drawLine(fM6793t, fM6793t2 - f11, fM6793t + this.f7574r, fM6793t2 - f11, this.f7559c);
        float f12 = this.f7573q;
        canvas.drawLine(fM6793t3 + f12, fM6793t2 - this.f7572p, fM6793t3 + f12, fM6793t2 + this.f7574r, this.f7559c);
        float f13 = this.f7573q;
        canvas.drawLine(fM6793t3, fM6793t2 - f13, fM6793t3 - this.f7574r, fM6793t2 - f13, this.f7559c);
        float f14 = this.f7573q;
        canvas.drawLine(fM6793t - f14, this.f7572p + fM6793t4, fM6793t - f14, fM6793t4 - this.f7574r, this.f7559c);
        float f15 = this.f7573q;
        canvas.drawLine(fM6793t, fM6793t4 + f15, fM6793t + this.f7574r, fM6793t4 + f15, this.f7559c);
        float f16 = this.f7573q;
        canvas.drawLine(fM6793t3 + f16, this.f7572p + fM6793t4, fM6793t3 + f16, fM6793t4 - this.f7574r, this.f7559c);
        float f17 = this.f7573q;
        canvas.drawLine(fM6793t3, fM6793t4 + f17, fM6793t3 - this.f7574r, fM6793t4 + f17, this.f7559c);
    }

    /* renamed from: d */
    public final void m6775d(Canvas canvas) {
        float fM6793t = Edge.LEFT.m6793t();
        float fM6793t2 = Edge.TOP.m6793t();
        float fM6793t3 = Edge.RIGHT.m6793t();
        float fM6793t4 = Edge.BOTTOM.m6793t();
        float fM6787v = Edge.m6787v() / 3.0f;
        float f10 = fM6793t + fM6787v;
        canvas.drawLine(f10, fM6793t2, f10, fM6793t4, this.f7558b);
        float f11 = fM6793t3 - fM6787v;
        canvas.drawLine(f11, fM6793t2, f11, fM6793t4, this.f7558b);
        float fM6786u = Edge.m6786u() / 3.0f;
        float f12 = fM6793t2 + fM6786u;
        canvas.drawLine(fM6793t, f12, fM6793t3, f12, this.f7558b);
        float f13 = fM6793t4 - fM6786u;
        canvas.drawLine(fM6793t, f13, fM6793t3, f13, this.f7558b);
    }

    /* renamed from: e */
    public final void m6776e(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f7562f = AbstractC9677f.m16147d(context);
        this.f7563g = TypedValue.applyDimension(1, 6.0f, displayMetrics);
        this.f7557a = AbstractC9679h.m16155d(context);
        this.f7558b = AbstractC9679h.m16157f(context);
        this.f7560d = AbstractC9679h.m16154c(context);
        this.f7559c = AbstractC9679h.m16156e(context);
        this.f7573q = TypedValue.applyDimension(1, f7553A, displayMetrics);
        this.f7572p = TypedValue.applyDimension(1, f7554B, displayMetrics);
        this.f7574r = TypedValue.applyDimension(1, 20.0f, displayMetrics);
        this.f7570n = 1;
    }

    /* renamed from: f */
    public final void m6777f(Rect rect) {
        if (!this.f7571o) {
            this.f7571o = true;
        }
        if (!this.f7566j) {
            float fWidth = rect.width() * 0.1f;
            float fHeight = rect.height() * 0.1f;
            Edge.LEFT.m6788A(rect.left + fWidth);
            Edge.TOP.m6788A(rect.top + fHeight);
            Edge.RIGHT.m6788A(rect.right - fWidth);
            Edge.BOTTOM.m6788A(rect.bottom - fHeight);
            return;
        }
        if (AbstractC9672a.m16132b(rect) > this.f7569m) {
            Edge edge = Edge.TOP;
            edge.m6788A(rect.top);
            Edge edge2 = Edge.BOTTOM;
            edge2.m6788A(rect.bottom);
            float width = getWidth() / 2.0f;
            float fMax = Math.max(40.0f, AbstractC9672a.m16138h(edge.m6793t(), edge2.m6793t(), this.f7569m));
            if (fMax == 40.0f) {
                this.f7569m = 40.0f / (edge2.m6793t() - edge.m6793t());
            }
            float f10 = fMax / 2.0f;
            Edge.LEFT.m6788A(width - f10);
            Edge.RIGHT.m6788A(width + f10);
            return;
        }
        Edge edge3 = Edge.LEFT;
        edge3.m6788A(rect.left);
        Edge edge4 = Edge.RIGHT;
        edge4.m6788A(rect.right);
        float height = getHeight() / 2.0f;
        float fMax2 = Math.max(40.0f, AbstractC9672a.m16134d(edge3.m6793t(), edge4.m6793t(), this.f7569m));
        if (fMax2 == 40.0f) {
            float fM6793t = edge4.m6793t() - edge3.m6793t();
            if (fM6793t > 0.0f) {
                this.f7569m = fM6793t / 40.0f;
            }
        }
        float f11 = fMax2 / 2.0f;
        Edge.TOP.m6788A(height - f11);
        Edge.BOTTOM.m6788A(height + f11);
    }

    /* renamed from: g */
    public final void m6778g(float f10, float f11) {
        float fM6793t = Edge.LEFT.m6793t();
        float fM6793t2 = Edge.TOP.m6793t();
        float fM6793t3 = Edge.RIGHT.m6793t();
        float fM6793t4 = Edge.BOTTOM.m6793t();
        Handle handleM16146c = AbstractC9677f.m16146c(f10, f11, fM6793t, fM6793t2, fM6793t3, fM6793t4, this.f7562f);
        this.f7565i = handleM16146c;
        if (handleM16146c == null) {
            return;
        }
        this.f7564h = AbstractC9677f.m16145b(handleM16146c, f10, f11, fM6793t, fM6793t2, fM6793t3, fM6793t4);
        invalidate();
    }

    /* renamed from: h */
    public final void m6779h(float f10, float f11) {
        if (this.f7565i == null) {
            return;
        }
        float fFloatValue = f10 + ((Float) this.f7564h.first).floatValue();
        float fFloatValue2 = f11 + ((Float) this.f7564h.second).floatValue();
        if (this.f7566j) {
            this.f7565i.m6798a(fFloatValue, fFloatValue2, this.f7569m, this.f7561e, this.f7563g);
        } else {
            this.f7565i.m6799c(fFloatValue, fFloatValue2, this.f7561e, this.f7563g);
        }
        invalidate();
    }

    /* renamed from: i */
    public final void m6780i() {
        if (this.f7565i == null) {
            return;
        }
        this.f7565i = null;
        invalidate();
    }

    /* renamed from: j */
    public void m6781j() {
        if (this.f7571o) {
            m6777f(this.f7561e);
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m6772a(canvas, this.f7561e);
        if (m6771k()) {
            int i9 = this.f7570n;
            if (i9 == 2) {
                m6775d(canvas);
                m6773b(canvas);
            } else if (i9 == 1 && this.f7565i != null) {
                m6775d(canvas);
                m6773b(canvas);
            }
        }
        canvas.drawRect(Edge.LEFT.m6793t(), Edge.TOP.m6793t(), Edge.RIGHT.m6793t(), Edge.BOTTOM.m6793t(), this.f7557a);
        m6774c(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        m6777f(this.f7561e);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            m6778g(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                m6779h(motionEvent.getX(), motionEvent.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        m6780i();
        return true;
    }

    public void setAspectRatioX(int i9) {
        if (i9 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f7567k = i9;
        this.f7569m = i9 / this.f7568l;
        m6781j();
    }

    public void setAspectRatioY(int i9) {
        if (i9 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f7568l = i9;
        this.f7569m = this.f7567k / i9;
        m6781j();
    }

    public void setBitmapRect(Rect rect) {
        this.f7561e = rect;
        m6777f(rect);
    }

    public void setBorderAndGuidelineColor(@ColorInt int i9) {
        this.f7557a.setColor(i9);
        this.f7558b.setColor(i9);
        m6781j();
    }

    public void setBorderColor(@ColorInt int i9) {
        this.f7557a.setColor(i9);
        m6781j();
    }

    public void setBorderWidth(@Dimension float f10) {
        this.f7557a.setStrokeWidth(f10);
        m6781j();
    }

    public void setCornerColor(@ColorInt int i9) {
        this.f7559c.setColor(i9);
        m6781j();
    }

    public void setCornerWidth(@Dimension float f10) {
        this.f7559c.setStrokeWidth(f10);
        m6781j();
    }

    public void setCropOverlayCornerBitmap(Bitmap bitmap) {
        this.f7578v = bitmap;
        if (bitmap != null) {
            this.f7579w = bitmap.getWidth();
            this.f7580x = this.f7578v.getHeight();
        }
    }

    public void setFixedAspectRatio(boolean z9) {
        this.f7566j = z9;
        m6781j();
    }

    public void setGuidelineColor(@ColorInt int i9) {
        this.f7558b.setColor(i9);
        m6781j();
    }

    public void setGuidelineWidth(@Dimension float f10) {
        this.f7558b.setStrokeWidth(f10);
        m6781j();
    }

    public void setGuidelines(int i9) {
        if (i9 < 0 || i9 > 2) {
            throw new IllegalArgumentException("Guideline value must be set between 0 and 2. See documentation.");
        }
        this.f7570n = i9;
        m6781j();
    }
}
