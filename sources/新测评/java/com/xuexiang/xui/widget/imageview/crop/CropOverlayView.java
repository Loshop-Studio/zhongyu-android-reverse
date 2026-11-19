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
import p075e3.AbstractC7330a;
import p075e3.AbstractC7335f;
import p075e3.AbstractC7337h;

/* loaded from: classes4.dex */
public class CropOverlayView extends View {

    /* renamed from: A */
    public static final float f6295A;

    /* renamed from: B */
    public static final float f6296B;

    /* renamed from: y */
    public static final float f6297y;

    /* renamed from: z */
    public static final float f6298z;

    /* renamed from: a */
    public Paint f6299a;

    /* renamed from: b */
    public Paint f6300b;

    /* renamed from: c */
    public Paint f6301c;

    /* renamed from: d */
    public Paint f6302d;

    /* renamed from: e */
    public Rect f6303e;

    /* renamed from: f */
    public float f6304f;

    /* renamed from: g */
    public float f6305g;

    /* renamed from: h */
    public Pair f6306h;

    /* renamed from: i */
    public Handle f6307i;

    /* renamed from: j */
    public boolean f6308j;

    /* renamed from: k */
    public int f6309k;

    /* renamed from: l */
    public int f6310l;

    /* renamed from: m */
    public float f6311m;

    /* renamed from: n */
    public int f6312n;

    /* renamed from: o */
    public boolean f6313o;

    /* renamed from: p */
    public float f6314p;

    /* renamed from: q */
    public float f6315q;

    /* renamed from: r */
    public float f6316r;

    /* renamed from: s */
    public Bitmap f6317s;

    /* renamed from: t */
    public int f6318t;

    /* renamed from: u */
    public int f6319u;

    /* renamed from: v */
    public Bitmap f6320v;

    /* renamed from: w */
    public int f6321w;

    /* renamed from: x */
    public int f6322x;

    static {
        float fM11735a = AbstractC7337h.m11735a();
        f6297y = fM11735a;
        float fM11736b = AbstractC7337h.m11736b();
        f6298z = fM11736b;
        float f10 = (fM11735a / 2.0f) - (fM11736b / 2.0f);
        f6295A = f10;
        f6296B = (fM11735a / 2.0f) + f10;
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6308j = false;
        this.f6309k = 1;
        this.f6310l = 1;
        this.f6311m = 1 / 1;
        this.f6313o = false;
        this.f6317s = null;
        this.f6318t = 0;
        this.f6319u = 0;
        this.f6320v = null;
        this.f6321w = 0;
        this.f6322x = 0;
        m5670e(context);
    }

    /* renamed from: k */
    public static boolean m5665k() {
        return Math.abs(Edge.LEFT.m5684q() - Edge.RIGHT.m5684q()) >= 100.0f && Math.abs(Edge.TOP.m5684q() - Edge.BOTTOM.m5684q()) >= 100.0f;
    }

    /* renamed from: a */
    public final void m5666a(Canvas canvas, Rect rect) {
        float fM5684q = Edge.LEFT.m5684q();
        float fM5684q2 = Edge.TOP.m5684q();
        float fM5684q3 = Edge.RIGHT.m5684q();
        float fM5684q4 = Edge.BOTTOM.m5684q();
        canvas.drawRect(rect.left, rect.top, rect.right, fM5684q2, this.f6302d);
        canvas.drawRect(rect.left, fM5684q4, rect.right, rect.bottom, this.f6302d);
        canvas.drawRect(rect.left, fM5684q2, fM5684q, fM5684q4, this.f6302d);
        canvas.drawRect(fM5684q3, fM5684q2, rect.right, fM5684q4, this.f6302d);
    }

    /* renamed from: b */
    public final void m5667b(Canvas canvas) {
        float fWidth = this.f6303e.width();
        float f10 = this.f6318t / fWidth;
        float fHeight = this.f6319u / this.f6303e.height();
        int iM5681s = (int) (Edge.m5681s() * f10);
        int iM5680r = (int) (Edge.m5680r() * fHeight);
        this.f6299a.setStrokeWidth(0.0f);
        this.f6299a.setTextAlign(Paint.Align.CENTER);
        this.f6299a.setTextSize(25.0f);
        canvas.drawText(iM5681s + "x" + iM5680r, (Edge.LEFT.m5684q() / 2.0f) + (Edge.RIGHT.m5684q() / 2.0f), (Edge.TOP.m5684q() / 2.0f) + (Edge.BOTTOM.m5684q() / 2.0f), this.f6299a);
    }

    /* renamed from: c */
    public final void m5668c(Canvas canvas) {
        float fM5684q = Edge.LEFT.m5684q();
        float fM5684q2 = Edge.TOP.m5684q();
        float fM5684q3 = Edge.RIGHT.m5684q();
        float fM5684q4 = Edge.BOTTOM.m5684q();
        Bitmap bitmap = this.f6320v;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, fM5684q - (this.f6321w / 2.0f), fM5684q2 - (this.f6322x / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f6320v, fM5684q3 - (this.f6321w / 2.0f), fM5684q2 - (this.f6322x / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f6320v, fM5684q - (this.f6321w / 2.0f), fM5684q4 - (this.f6322x / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f6320v, fM5684q3 - (this.f6321w / 2.0f), fM5684q4 - (this.f6322x / 2.0f), (Paint) null);
            return;
        }
        float f10 = this.f6315q;
        canvas.drawLine(fM5684q - f10, fM5684q2 - this.f6314p, fM5684q - f10, this.f6316r + fM5684q2, this.f6301c);
        float f11 = this.f6315q;
        canvas.drawLine(fM5684q, fM5684q2 - f11, fM5684q + this.f6316r, fM5684q2 - f11, this.f6301c);
        float f12 = this.f6315q;
        canvas.drawLine(fM5684q3 + f12, fM5684q2 - this.f6314p, fM5684q3 + f12, fM5684q2 + this.f6316r, this.f6301c);
        float f13 = this.f6315q;
        canvas.drawLine(fM5684q3, fM5684q2 - f13, fM5684q3 - this.f6316r, fM5684q2 - f13, this.f6301c);
        float f14 = this.f6315q;
        canvas.drawLine(fM5684q - f14, this.f6314p + fM5684q4, fM5684q - f14, fM5684q4 - this.f6316r, this.f6301c);
        float f15 = this.f6315q;
        canvas.drawLine(fM5684q, fM5684q4 + f15, fM5684q + this.f6316r, fM5684q4 + f15, this.f6301c);
        float f16 = this.f6315q;
        canvas.drawLine(fM5684q3 + f16, this.f6314p + fM5684q4, fM5684q3 + f16, fM5684q4 - this.f6316r, this.f6301c);
        float f17 = this.f6315q;
        canvas.drawLine(fM5684q3, fM5684q4 + f17, fM5684q3 - this.f6316r, fM5684q4 + f17, this.f6301c);
    }

    /* renamed from: d */
    public final void m5669d(Canvas canvas) {
        float fM5684q = Edge.LEFT.m5684q();
        float fM5684q2 = Edge.TOP.m5684q();
        float fM5684q3 = Edge.RIGHT.m5684q();
        float fM5684q4 = Edge.BOTTOM.m5684q();
        float fM5681s = Edge.m5681s() / 3.0f;
        float f10 = fM5684q + fM5681s;
        canvas.drawLine(f10, fM5684q2, f10, fM5684q4, this.f6300b);
        float f11 = fM5684q3 - fM5681s;
        canvas.drawLine(f11, fM5684q2, f11, fM5684q4, this.f6300b);
        float fM5680r = Edge.m5680r() / 3.0f;
        float f12 = fM5684q2 + fM5680r;
        canvas.drawLine(fM5684q, f12, fM5684q3, f12, this.f6300b);
        float f13 = fM5684q4 - fM5680r;
        canvas.drawLine(fM5684q, f13, fM5684q3, f13, this.f6300b);
    }

    /* renamed from: e */
    public final void m5670e(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f6304f = AbstractC7335f.m11730d(context);
        this.f6305g = TypedValue.applyDimension(1, 6.0f, displayMetrics);
        this.f6299a = AbstractC7337h.m11738d(context);
        this.f6300b = AbstractC7337h.m11740f(context);
        this.f6302d = AbstractC7337h.m11737c(context);
        this.f6301c = AbstractC7337h.m11739e(context);
        this.f6315q = TypedValue.applyDimension(1, f6295A, displayMetrics);
        this.f6314p = TypedValue.applyDimension(1, f6296B, displayMetrics);
        this.f6316r = TypedValue.applyDimension(1, 20.0f, displayMetrics);
        this.f6312n = 1;
    }

    /* renamed from: f */
    public final void m5671f(Rect rect) {
        if (!this.f6313o) {
            this.f6313o = true;
        }
        if (!this.f6308j) {
            float fWidth = rect.width() * 0.1f;
            float fHeight = rect.height() * 0.1f;
            Edge.LEFT.m5689x(rect.left + fWidth);
            Edge.TOP.m5689x(rect.top + fHeight);
            Edge.RIGHT.m5689x(rect.right - fWidth);
            Edge.BOTTOM.m5689x(rect.bottom - fHeight);
            return;
        }
        if (AbstractC7330a.m11715b(rect) > this.f6311m) {
            Edge edge = Edge.TOP;
            edge.m5689x(rect.top);
            Edge edge2 = Edge.BOTTOM;
            edge2.m5689x(rect.bottom);
            float width = getWidth() / 2.0f;
            float fMax = Math.max(40.0f, AbstractC7330a.m11721h(edge.m5684q(), edge2.m5684q(), this.f6311m));
            if (fMax == 40.0f) {
                this.f6311m = 40.0f / (edge2.m5684q() - edge.m5684q());
            }
            float f10 = fMax / 2.0f;
            Edge.LEFT.m5689x(width - f10);
            Edge.RIGHT.m5689x(width + f10);
            return;
        }
        Edge edge3 = Edge.LEFT;
        edge3.m5689x(rect.left);
        Edge edge4 = Edge.RIGHT;
        edge4.m5689x(rect.right);
        float height = getHeight() / 2.0f;
        float fMax2 = Math.max(40.0f, AbstractC7330a.m11717d(edge3.m5684q(), edge4.m5684q(), this.f6311m));
        if (fMax2 == 40.0f) {
            float fM5684q = edge4.m5684q() - edge3.m5684q();
            if (fM5684q > 0.0f) {
                this.f6311m = fM5684q / 40.0f;
            }
        }
        float f11 = fMax2 / 2.0f;
        Edge.TOP.m5689x(height - f11);
        Edge.BOTTOM.m5689x(height + f11);
    }

    /* renamed from: g */
    public final void m5672g(float f10, float f11) {
        float fM5684q = Edge.LEFT.m5684q();
        float fM5684q2 = Edge.TOP.m5684q();
        float fM5684q3 = Edge.RIGHT.m5684q();
        float fM5684q4 = Edge.BOTTOM.m5684q();
        Handle handleM11729c = AbstractC7335f.m11729c(f10, f11, fM5684q, fM5684q2, fM5684q3, fM5684q4, this.f6304f);
        this.f6307i = handleM11729c;
        if (handleM11729c == null) {
            return;
        }
        this.f6306h = AbstractC7335f.m11728b(handleM11729c, f10, f11, fM5684q, fM5684q2, fM5684q3, fM5684q4);
        invalidate();
    }

    /* renamed from: h */
    public final void m5673h(float f10, float f11) {
        if (this.f6307i == null) {
            return;
        }
        float fFloatValue = f10 + ((Float) this.f6306h.first).floatValue();
        float fFloatValue2 = f11 + ((Float) this.f6306h.second).floatValue();
        if (this.f6308j) {
            this.f6307i.m5692a(fFloatValue, fFloatValue2, this.f6311m, this.f6303e, this.f6305g);
        } else {
            this.f6307i.m5693f(fFloatValue, fFloatValue2, this.f6303e, this.f6305g);
        }
        invalidate();
    }

    /* renamed from: i */
    public final void m5674i() {
        if (this.f6307i == null) {
            return;
        }
        this.f6307i = null;
        invalidate();
    }

    /* renamed from: j */
    public void m5675j() {
        if (this.f6313o) {
            m5671f(this.f6303e);
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m5666a(canvas, this.f6303e);
        if (m5665k()) {
            int i10 = this.f6312n;
            if (i10 == 2) {
                m5669d(canvas);
                m5667b(canvas);
            } else if (i10 == 1 && this.f6307i != null) {
                m5669d(canvas);
                m5667b(canvas);
            }
        }
        canvas.drawRect(Edge.LEFT.m5684q(), Edge.TOP.m5684q(), Edge.RIGHT.m5684q(), Edge.BOTTOM.m5684q(), this.f6299a);
        m5668c(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        m5671f(this.f6303e);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            m5672g(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                m5673h(motionEvent.getX(), motionEvent.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        m5674i();
        return true;
    }

    public void setAspectRatioX(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f6309k = i10;
        this.f6311m = i10 / this.f6310l;
        m5675j();
    }

    public void setAspectRatioY(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f6310l = i10;
        this.f6311m = this.f6309k / i10;
        m5675j();
    }

    public void setBitmapRect(Rect rect) {
        this.f6303e = rect;
        m5671f(rect);
    }

    public void setBorderAndGuidelineColor(@ColorInt int i10) {
        this.f6299a.setColor(i10);
        this.f6300b.setColor(i10);
        m5675j();
    }

    public void setBorderColor(@ColorInt int i10) {
        this.f6299a.setColor(i10);
        m5675j();
    }

    public void setBorderWidth(@Dimension float f10) {
        this.f6299a.setStrokeWidth(f10);
        m5675j();
    }

    public void setCornerColor(@ColorInt int i10) {
        this.f6301c.setColor(i10);
        m5675j();
    }

    public void setCornerWidth(@Dimension float f10) {
        this.f6301c.setStrokeWidth(f10);
        m5675j();
    }

    public void setCropOverlayCornerBitmap(Bitmap bitmap) {
        this.f6320v = bitmap;
        if (bitmap != null) {
            this.f6321w = bitmap.getWidth();
            this.f6322x = this.f6320v.getHeight();
        }
    }

    public void setFixedAspectRatio(boolean z9) {
        this.f6308j = z9;
        m5675j();
    }

    public void setGuidelineColor(@ColorInt int i10) {
        this.f6300b.setColor(i10);
        m5675j();
    }

    public void setGuidelineWidth(@Dimension float f10) {
        this.f6300b.setStrokeWidth(f10);
        m5675j();
    }

    public void setGuidelines(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Guideline value must be set between 0 and 2. See documentation.");
        }
        this.f6312n = i10;
        m5675j();
    }
}
