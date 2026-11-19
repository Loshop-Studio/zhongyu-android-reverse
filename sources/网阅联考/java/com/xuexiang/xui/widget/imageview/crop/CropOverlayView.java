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
import p131v0.AbstractC4618a;
import p131v0.AbstractC4623f;
import p131v0.AbstractC4625h;

/* loaded from: classes2.dex */
public class CropOverlayView extends View {

    /* renamed from: A */
    public static final float f3499A;

    /* renamed from: B */
    public static final float f3500B;

    /* renamed from: y */
    public static final float f3501y;

    /* renamed from: z */
    public static final float f3502z;

    /* renamed from: a */
    public Paint f3503a;

    /* renamed from: b */
    public Paint f3504b;

    /* renamed from: c */
    public Paint f3505c;

    /* renamed from: d */
    public Paint f3506d;

    /* renamed from: e */
    public Rect f3507e;

    /* renamed from: f */
    public float f3508f;

    /* renamed from: g */
    public float f3509g;

    /* renamed from: h */
    public Pair f3510h;

    /* renamed from: i */
    public Handle f3511i;

    /* renamed from: j */
    public boolean f3512j;

    /* renamed from: k */
    public int f3513k;

    /* renamed from: l */
    public int f3514l;

    /* renamed from: m */
    public float f3515m;

    /* renamed from: n */
    public int f3516n;

    /* renamed from: o */
    public boolean f3517o;

    /* renamed from: p */
    public float f3518p;

    /* renamed from: q */
    public float f3519q;

    /* renamed from: r */
    public float f3520r;

    /* renamed from: s */
    public Bitmap f3521s;

    /* renamed from: t */
    public int f3522t;

    /* renamed from: u */
    public int f3523u;

    /* renamed from: v */
    public Bitmap f3524v;

    /* renamed from: w */
    public int f3525w;

    /* renamed from: x */
    public int f3526x;

    static {
        float fM6409a = AbstractC4625h.m6409a();
        f3501y = fM6409a;
        float fM6410b = AbstractC4625h.m6410b();
        f3502z = fM6410b;
        float f4 = (fM6409a / 2.0f) - (fM6410b / 2.0f);
        f3499A = f4;
        f3500B = (fM6409a / 2.0f) + f4;
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3512j = false;
        this.f3513k = 1;
        this.f3514l = 1;
        this.f3515m = 1 / 1;
        this.f3517o = false;
        this.f3521s = null;
        this.f3522t = 0;
        this.f3523u = 0;
        this.f3524v = null;
        this.f3525w = 0;
        this.f3526x = 0;
        m4312e(context);
    }

    /* renamed from: k */
    public static boolean m4307k() {
        return Math.abs(Edge.LEFT.m4326g() - Edge.RIGHT.m4326g()) >= 100.0f && Math.abs(Edge.TOP.m4326g() - Edge.BOTTOM.m4326g()) >= 100.0f;
    }

    /* renamed from: a */
    public final void m4308a(Canvas canvas, Rect rect) {
        float fM4326g = Edge.LEFT.m4326g();
        float fM4326g2 = Edge.TOP.m4326g();
        float fM4326g3 = Edge.RIGHT.m4326g();
        float fM4326g4 = Edge.BOTTOM.m4326g();
        canvas.drawRect(rect.left, rect.top, rect.right, fM4326g2, this.f3506d);
        canvas.drawRect(rect.left, fM4326g4, rect.right, rect.bottom, this.f3506d);
        canvas.drawRect(rect.left, fM4326g2, fM4326g, fM4326g4, this.f3506d);
        canvas.drawRect(fM4326g3, fM4326g2, rect.right, fM4326g4, this.f3506d);
    }

    /* renamed from: b */
    public final void m4309b(Canvas canvas) {
        float fWidth = this.f3507e.width();
        float f4 = this.f3522t / fWidth;
        float fHeight = this.f3523u / this.f3507e.height();
        int iM4323i = (int) (Edge.m4323i() * f4);
        int iM4322h = (int) (Edge.m4322h() * fHeight);
        this.f3503a.setStrokeWidth(0.0f);
        this.f3503a.setTextAlign(Paint.Align.CENTER);
        this.f3503a.setTextSize(25.0f);
        canvas.drawText(iM4323i + "x" + iM4322h, (Edge.LEFT.m4326g() / 2.0f) + (Edge.RIGHT.m4326g() / 2.0f), (Edge.TOP.m4326g() / 2.0f) + (Edge.BOTTOM.m4326g() / 2.0f), this.f3503a);
    }

    /* renamed from: c */
    public final void m4310c(Canvas canvas) {
        float fM4326g = Edge.LEFT.m4326g();
        float fM4326g2 = Edge.TOP.m4326g();
        float fM4326g3 = Edge.RIGHT.m4326g();
        float fM4326g4 = Edge.BOTTOM.m4326g();
        Bitmap bitmap = this.f3524v;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, fM4326g - (this.f3525w / 2.0f), fM4326g2 - (this.f3526x / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f3524v, fM4326g3 - (this.f3525w / 2.0f), fM4326g2 - (this.f3526x / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f3524v, fM4326g - (this.f3525w / 2.0f), fM4326g4 - (this.f3526x / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f3524v, fM4326g3 - (this.f3525w / 2.0f), fM4326g4 - (this.f3526x / 2.0f), (Paint) null);
            return;
        }
        float f4 = this.f3519q;
        canvas.drawLine(fM4326g - f4, fM4326g2 - this.f3518p, fM4326g - f4, fM4326g2 + this.f3520r, this.f3505c);
        float f5 = this.f3519q;
        canvas.drawLine(fM4326g, fM4326g2 - f5, fM4326g + this.f3520r, fM4326g2 - f5, this.f3505c);
        float f6 = this.f3519q;
        canvas.drawLine(fM4326g3 + f6, fM4326g2 - this.f3518p, fM4326g3 + f6, fM4326g2 + this.f3520r, this.f3505c);
        float f7 = this.f3519q;
        canvas.drawLine(fM4326g3, fM4326g2 - f7, fM4326g3 - this.f3520r, fM4326g2 - f7, this.f3505c);
        float f8 = this.f3519q;
        canvas.drawLine(fM4326g - f8, this.f3518p + fM4326g4, fM4326g - f8, fM4326g4 - this.f3520r, this.f3505c);
        float f9 = this.f3519q;
        canvas.drawLine(fM4326g, fM4326g4 + f9, fM4326g + this.f3520r, fM4326g4 + f9, this.f3505c);
        float f10 = this.f3519q;
        canvas.drawLine(fM4326g3 + f10, this.f3518p + fM4326g4, fM4326g3 + f10, fM4326g4 - this.f3520r, this.f3505c);
        float f11 = this.f3519q;
        canvas.drawLine(fM4326g3, fM4326g4 + f11, fM4326g3 - this.f3520r, fM4326g4 + f11, this.f3505c);
    }

    /* renamed from: d */
    public final void m4311d(Canvas canvas) {
        float fM4326g = Edge.LEFT.m4326g();
        float fM4326g2 = Edge.TOP.m4326g();
        float fM4326g3 = Edge.RIGHT.m4326g();
        float fM4326g4 = Edge.BOTTOM.m4326g();
        float fM4323i = Edge.m4323i() / 3.0f;
        float f4 = fM4326g + fM4323i;
        canvas.drawLine(f4, fM4326g2, f4, fM4326g4, this.f3504b);
        float f5 = fM4326g3 - fM4323i;
        canvas.drawLine(f5, fM4326g2, f5, fM4326g4, this.f3504b);
        float fM4322h = Edge.m4322h() / 3.0f;
        float f6 = fM4326g2 + fM4322h;
        canvas.drawLine(fM4326g, f6, fM4326g3, f6, this.f3504b);
        float f7 = fM4326g4 - fM4322h;
        canvas.drawLine(fM4326g, f7, fM4326g3, f7, this.f3504b);
    }

    /* renamed from: e */
    public final void m4312e(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f3508f = AbstractC4623f.m6404d(context);
        this.f3509g = TypedValue.applyDimension(1, 6.0f, displayMetrics);
        this.f3503a = AbstractC4625h.m6412d(context);
        this.f3504b = AbstractC4625h.m6414f(context);
        this.f3506d = AbstractC4625h.m6411c(context);
        this.f3505c = AbstractC4625h.m6413e(context);
        this.f3519q = TypedValue.applyDimension(1, f3499A, displayMetrics);
        this.f3518p = TypedValue.applyDimension(1, f3500B, displayMetrics);
        this.f3520r = TypedValue.applyDimension(1, 20.0f, displayMetrics);
        this.f3516n = 1;
    }

    /* renamed from: f */
    public final void m4313f(Rect rect) {
        if (!this.f3517o) {
            this.f3517o = true;
        }
        if (!this.f3512j) {
            float fWidth = rect.width() * 0.1f;
            float fHeight = rect.height() * 0.1f;
            Edge.LEFT.m4331n(rect.left + fWidth);
            Edge.TOP.m4331n(rect.top + fHeight);
            Edge.RIGHT.m4331n(rect.right - fWidth);
            Edge.BOTTOM.m4331n(rect.bottom - fHeight);
            return;
        }
        if (AbstractC4618a.m6389b(rect) > this.f3515m) {
            Edge edge = Edge.TOP;
            edge.m4331n(rect.top);
            Edge edge2 = Edge.BOTTOM;
            edge2.m4331n(rect.bottom);
            float width = getWidth() / 2.0f;
            float fMax = Math.max(40.0f, AbstractC4618a.m6395h(edge.m4326g(), edge2.m4326g(), this.f3515m));
            if (fMax == 40.0f) {
                this.f3515m = 40.0f / (edge2.m4326g() - edge.m4326g());
            }
            float f4 = fMax / 2.0f;
            Edge.LEFT.m4331n(width - f4);
            Edge.RIGHT.m4331n(width + f4);
            return;
        }
        Edge edge3 = Edge.LEFT;
        edge3.m4331n(rect.left);
        Edge edge4 = Edge.RIGHT;
        edge4.m4331n(rect.right);
        float height = getHeight() / 2.0f;
        float fMax2 = Math.max(40.0f, AbstractC4618a.m6391d(edge3.m4326g(), edge4.m4326g(), this.f3515m));
        if (fMax2 == 40.0f) {
            float fM4326g = edge4.m4326g() - edge3.m4326g();
            if (fM4326g > 0.0f) {
                this.f3515m = fM4326g / 40.0f;
            }
        }
        float f5 = fMax2 / 2.0f;
        Edge.TOP.m4331n(height - f5);
        Edge.BOTTOM.m4331n(height + f5);
    }

    /* renamed from: g */
    public final void m4314g(float f4, float f5) {
        float fM4326g = Edge.LEFT.m4326g();
        float fM4326g2 = Edge.TOP.m4326g();
        float fM4326g3 = Edge.RIGHT.m4326g();
        float fM4326g4 = Edge.BOTTOM.m4326g();
        Handle handleM6403c = AbstractC4623f.m6403c(f4, f5, fM4326g, fM4326g2, fM4326g3, fM4326g4, this.f3508f);
        this.f3511i = handleM6403c;
        if (handleM6403c == null) {
            return;
        }
        this.f3510h = AbstractC4623f.m6402b(handleM6403c, f4, f5, fM4326g, fM4326g2, fM4326g3, fM4326g4);
        invalidate();
    }

    /* renamed from: h */
    public final void m4315h(float f4, float f5) {
        if (this.f3511i == null) {
            return;
        }
        float fFloatValue = f4 + ((Float) this.f3510h.first).floatValue();
        float fFloatValue2 = f5 + ((Float) this.f3510h.second).floatValue();
        if (this.f3512j) {
            this.f3511i.m4334a(fFloatValue, fFloatValue2, this.f3515m, this.f3507e, this.f3509g);
        } else {
            this.f3511i.m4335b(fFloatValue, fFloatValue2, this.f3507e, this.f3509g);
        }
        invalidate();
    }

    /* renamed from: i */
    public final void m4316i() {
        if (this.f3511i == null) {
            return;
        }
        this.f3511i = null;
        invalidate();
    }

    /* renamed from: j */
    public void m4317j() {
        if (this.f3517o) {
            m4313f(this.f3507e);
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m4308a(canvas, this.f3507e);
        if (m4307k()) {
            int i4 = this.f3516n;
            if (i4 == 2) {
                m4311d(canvas);
                m4309b(canvas);
            } else if (i4 == 1 && this.f3511i != null) {
                m4311d(canvas);
                m4309b(canvas);
            }
        }
        canvas.drawRect(Edge.LEFT.m4326g(), Edge.TOP.m4326g(), Edge.RIGHT.m4326g(), Edge.BOTTOM.m4326g(), this.f3503a);
        m4310c(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        m4313f(this.f3507e);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            m4314g(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                m4315h(motionEvent.getX(), motionEvent.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        m4316i();
        return true;
    }

    public void setAspectRatioX(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f3513k = i4;
        this.f3515m = i4 / this.f3514l;
        m4317j();
    }

    public void setAspectRatioY(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f3514l = i4;
        this.f3515m = this.f3513k / i4;
        m4317j();
    }

    public void setBitmapRect(Rect rect) {
        this.f3507e = rect;
        m4313f(rect);
    }

    public void setBorderAndGuidelineColor(@ColorInt int i4) {
        this.f3503a.setColor(i4);
        this.f3504b.setColor(i4);
        m4317j();
    }

    public void setBorderColor(@ColorInt int i4) {
        this.f3503a.setColor(i4);
        m4317j();
    }

    public void setBorderWidth(@Dimension float f4) {
        this.f3503a.setStrokeWidth(f4);
        m4317j();
    }

    public void setCornerColor(@ColorInt int i4) {
        this.f3505c.setColor(i4);
        m4317j();
    }

    public void setCornerWidth(@Dimension float f4) {
        this.f3505c.setStrokeWidth(f4);
        m4317j();
    }

    public void setCropOverlayCornerBitmap(Bitmap bitmap) {
        this.f3524v = bitmap;
        if (bitmap != null) {
            this.f3525w = bitmap.getWidth();
            this.f3526x = this.f3524v.getHeight();
        }
    }

    public void setFixedAspectRatio(boolean z3) {
        this.f3512j = z3;
        m4317j();
    }

    public void setGuidelineColor(@ColorInt int i4) {
        this.f3504b.setColor(i4);
        m4317j();
    }

    public void setGuidelineWidth(@Dimension float f4) {
        this.f3504b.setStrokeWidth(f4);
        m4317j();
    }

    public void setGuidelines(int i4) {
        if (i4 < 0 || i4 > 2) {
            throw new IllegalArgumentException("Guideline value must be set between 0 and 2. See documentation.");
        }
        this.f3516n = i4;
        m4317j();
    }
}
