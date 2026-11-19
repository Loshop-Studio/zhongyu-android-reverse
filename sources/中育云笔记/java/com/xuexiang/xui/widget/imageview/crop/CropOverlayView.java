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
import p262n8.AbstractC10327a;
import p262n8.AbstractC10332f;
import p262n8.AbstractC10335i;

/* loaded from: classes5.dex */
public class CropOverlayView extends View {

    /* renamed from: A */
    public static final float f16083A;

    /* renamed from: B */
    public static final float f16084B;

    /* renamed from: C */
    public static final float f16085C;

    /* renamed from: D */
    public static final float f16086D;

    /* renamed from: c */
    public Paint f16087c;

    /* renamed from: d */
    public Paint f16088d;

    /* renamed from: e */
    public Paint f16089e;

    /* renamed from: f */
    public Paint f16090f;

    /* renamed from: g */
    public Rect f16091g;

    /* renamed from: h */
    public float f16092h;

    /* renamed from: i */
    public float f16093i;

    /* renamed from: j */
    public Pair f16094j;

    /* renamed from: k */
    public Handle f16095k;

    /* renamed from: l */
    public boolean f16096l;

    /* renamed from: m */
    public int f16097m;

    /* renamed from: n */
    public int f16098n;

    /* renamed from: o */
    public float f16099o;

    /* renamed from: p */
    public int f16100p;

    /* renamed from: q */
    public boolean f16101q;

    /* renamed from: r */
    public float f16102r;

    /* renamed from: s */
    public float f16103s;

    /* renamed from: t */
    public float f16104t;

    /* renamed from: u */
    public Bitmap f16105u;

    /* renamed from: v */
    public int f16106v;

    /* renamed from: w */
    public int f16107w;

    /* renamed from: x */
    public Bitmap f16108x;

    /* renamed from: y */
    public int f16109y;

    /* renamed from: z */
    public int f16110z;

    static {
        float fM21586a = AbstractC10335i.m21586a();
        f16083A = fM21586a;
        float fM21587b = AbstractC10335i.m21587b();
        f16084B = fM21587b;
        float f10 = (fM21586a / 2.0f) - (fM21587b / 2.0f);
        f16085C = f10;
        f16086D = (fM21586a / 2.0f) + f10;
    }

    public CropOverlayView(Context context) {
        super(context);
        this.f16096l = false;
        this.f16097m = 1;
        this.f16098n = 1;
        this.f16099o = 1 / 1;
        this.f16101q = false;
        this.f16105u = null;
        this.f16106v = 0;
        this.f16107w = 0;
        this.f16108x = null;
        this.f16109y = 0;
        this.f16110z = 0;
        m12713e(context);
    }

    /* renamed from: m */
    public static boolean m12708m() {
        return Math.abs(Edge.LEFT.m12729k() - Edge.RIGHT.m12729k()) >= 100.0f && Math.abs(Edge.TOP.m12729k() - Edge.BOTTOM.m12729k()) >= 100.0f;
    }

    /* renamed from: a */
    public final void m12709a(Canvas canvas, Rect rect) {
        float fM12729k = Edge.LEFT.m12729k();
        float fM12729k2 = Edge.TOP.m12729k();
        float fM12729k3 = Edge.RIGHT.m12729k();
        float fM12729k4 = Edge.BOTTOM.m12729k();
        canvas.drawRect(rect.left, rect.top, rect.right, fM12729k2, this.f16090f);
        canvas.drawRect(rect.left, fM12729k4, rect.right, rect.bottom, this.f16090f);
        canvas.drawRect(rect.left, fM12729k2, fM12729k, fM12729k4, this.f16090f);
        canvas.drawRect(fM12729k3, fM12729k2, rect.right, fM12729k4, this.f16090f);
    }

    /* renamed from: b */
    public final void m12710b(Canvas canvas) {
        float fWidth = this.f16091g.width();
        float f10 = this.f16106v / fWidth;
        float fHeight = this.f16107w / this.f16091g.height();
        int iM12726n = (int) (Edge.m12726n() * f10);
        int iM12725m = (int) (Edge.m12725m() * fHeight);
        this.f16087c.setStrokeWidth(0.0f);
        this.f16087c.setTextAlign(Paint.Align.CENTER);
        this.f16087c.setTextSize(25.0f);
        canvas.drawText(iM12726n + "x" + iM12725m, (Edge.LEFT.m12729k() / 2.0f) + (Edge.RIGHT.m12729k() / 2.0f), (Edge.TOP.m12729k() / 2.0f) + (Edge.BOTTOM.m12729k() / 2.0f), this.f16087c);
    }

    /* renamed from: c */
    public final void m12711c(Canvas canvas) {
        float fM12729k = Edge.LEFT.m12729k();
        float fM12729k2 = Edge.TOP.m12729k();
        float fM12729k3 = Edge.RIGHT.m12729k();
        float fM12729k4 = Edge.BOTTOM.m12729k();
        Bitmap bitmap = this.f16108x;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, fM12729k - (this.f16109y / 2.0f), fM12729k2 - (this.f16110z / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f16108x, fM12729k3 - (this.f16109y / 2.0f), fM12729k2 - (this.f16110z / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f16108x, fM12729k - (this.f16109y / 2.0f), fM12729k4 - (this.f16110z / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f16108x, fM12729k3 - (this.f16109y / 2.0f), fM12729k4 - (this.f16110z / 2.0f), (Paint) null);
            return;
        }
        float f10 = this.f16103s;
        canvas.drawLine(fM12729k - f10, fM12729k2 - this.f16102r, fM12729k - f10, this.f16104t + fM12729k2, this.f16089e);
        float f11 = this.f16103s;
        canvas.drawLine(fM12729k, fM12729k2 - f11, fM12729k + this.f16104t, fM12729k2 - f11, this.f16089e);
        float f12 = this.f16103s;
        canvas.drawLine(fM12729k3 + f12, fM12729k2 - this.f16102r, fM12729k3 + f12, fM12729k2 + this.f16104t, this.f16089e);
        float f13 = this.f16103s;
        canvas.drawLine(fM12729k3, fM12729k2 - f13, fM12729k3 - this.f16104t, fM12729k2 - f13, this.f16089e);
        float f14 = this.f16103s;
        canvas.drawLine(fM12729k - f14, this.f16102r + fM12729k4, fM12729k - f14, fM12729k4 - this.f16104t, this.f16089e);
        float f15 = this.f16103s;
        canvas.drawLine(fM12729k, fM12729k4 + f15, fM12729k + this.f16104t, fM12729k4 + f15, this.f16089e);
        float f16 = this.f16103s;
        canvas.drawLine(fM12729k3 + f16, this.f16102r + fM12729k4, fM12729k3 + f16, fM12729k4 - this.f16104t, this.f16089e);
        float f17 = this.f16103s;
        canvas.drawLine(fM12729k3, fM12729k4 + f17, fM12729k3 - this.f16104t, fM12729k4 + f17, this.f16089e);
    }

    /* renamed from: d */
    public final void m12712d(Canvas canvas) {
        float fM12729k = Edge.LEFT.m12729k();
        float fM12729k2 = Edge.TOP.m12729k();
        float fM12729k3 = Edge.RIGHT.m12729k();
        float fM12729k4 = Edge.BOTTOM.m12729k();
        float fM12726n = Edge.m12726n() / 3.0f;
        float f10 = fM12729k + fM12726n;
        canvas.drawLine(f10, fM12729k2, f10, fM12729k4, this.f16088d);
        float f11 = fM12729k3 - fM12726n;
        canvas.drawLine(f11, fM12729k2, f11, fM12729k4, this.f16088d);
        float fM12725m = Edge.m12725m() / 3.0f;
        float f12 = fM12729k2 + fM12725m;
        canvas.drawLine(fM12729k, f12, fM12729k3, f12, this.f16088d);
        float f13 = fM12729k4 - fM12725m;
        canvas.drawLine(fM12729k, f13, fM12729k3, f13, this.f16088d);
    }

    /* renamed from: e */
    public final void m12713e(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f16092h = AbstractC10332f.m21578d(context);
        this.f16093i = TypedValue.applyDimension(1, 6.0f, displayMetrics);
        this.f16087c = AbstractC10335i.m21589d(context);
        this.f16088d = AbstractC10335i.m21591f(context);
        this.f16090f = AbstractC10335i.m21588c(context);
        this.f16089e = AbstractC10335i.m21590e(context);
        this.f16103s = TypedValue.applyDimension(1, f16085C, displayMetrics);
        this.f16102r = TypedValue.applyDimension(1, f16086D, displayMetrics);
        this.f16104t = TypedValue.applyDimension(1, 20.0f, displayMetrics);
        this.f16100p = 1;
    }

    /* renamed from: f */
    public final void m12714f(Rect rect) {
        if (!this.f16101q) {
            this.f16101q = true;
        }
        if (!this.f16096l) {
            float fWidth = rect.width() * 0.1f;
            float fHeight = rect.height() * 0.1f;
            Edge.LEFT.m12734u(rect.left + fWidth);
            Edge.TOP.m12734u(rect.top + fHeight);
            Edge.RIGHT.m12734u(rect.right - fWidth);
            Edge.BOTTOM.m12734u(rect.bottom - fHeight);
            return;
        }
        if (AbstractC10327a.m21563b(rect) > this.f16099o) {
            Edge edge = Edge.TOP;
            edge.m12734u(rect.top);
            Edge edge2 = Edge.BOTTOM;
            edge2.m12734u(rect.bottom);
            float width = getWidth() / 2.0f;
            float fMax = Math.max(40.0f, AbstractC10327a.m21569h(edge.m12729k(), edge2.m12729k(), this.f16099o));
            if (fMax == 40.0f) {
                this.f16099o = 40.0f / (edge2.m12729k() - edge.m12729k());
            }
            float f10 = fMax / 2.0f;
            Edge.LEFT.m12734u(width - f10);
            Edge.RIGHT.m12734u(width + f10);
            return;
        }
        Edge edge3 = Edge.LEFT;
        edge3.m12734u(rect.left);
        Edge edge4 = Edge.RIGHT;
        edge4.m12734u(rect.right);
        float height = getHeight() / 2.0f;
        float fMax2 = Math.max(40.0f, AbstractC10327a.m21565d(edge3.m12729k(), edge4.m12729k(), this.f16099o));
        if (fMax2 == 40.0f) {
            float fM12729k = edge4.m12729k() - edge3.m12729k();
            if (fM12729k > 0.0f) {
                this.f16099o = fM12729k / 40.0f;
            }
        }
        float f11 = fMax2 / 2.0f;
        Edge.TOP.m12734u(height - f11);
        Edge.BOTTOM.m12734u(height + f11);
    }

    /* renamed from: g */
    public final void m12715g(float f10, float f11) {
        float fM12729k = Edge.LEFT.m12729k();
        float fM12729k2 = Edge.TOP.m12729k();
        float fM12729k3 = Edge.RIGHT.m12729k();
        float fM12729k4 = Edge.BOTTOM.m12729k();
        Handle handleM21577c = AbstractC10332f.m21577c(f10, f11, fM12729k, fM12729k2, fM12729k3, fM12729k4, this.f16092h);
        this.f16095k = handleM21577c;
        if (handleM21577c == null) {
            return;
        }
        this.f16094j = AbstractC10332f.m21576b(handleM21577c, f10, f11, fM12729k, fM12729k2, fM12729k3, fM12729k4);
        invalidate();
    }

    /* renamed from: h */
    public final void m12716h(float f10, float f11) {
        if (this.f16095k == null) {
            return;
        }
        float fFloatValue = f10 + ((Float) this.f16094j.first).floatValue();
        float fFloatValue2 = f11 + ((Float) this.f16094j.second).floatValue();
        if (this.f16096l) {
            this.f16095k.m12737a(fFloatValue, fFloatValue2, this.f16099o, this.f16091g, this.f16093i);
        } else {
            this.f16095k.m12738c(fFloatValue, fFloatValue2, this.f16091g, this.f16093i);
        }
        invalidate();
    }

    /* renamed from: i */
    public final void m12717i() {
        if (this.f16095k == null) {
            return;
        }
        this.f16095k = null;
        invalidate();
    }

    /* renamed from: j */
    public void m12718j() {
        if (this.f16101q) {
            m12714f(this.f16091g);
            invalidate();
        }
    }

    /* renamed from: k */
    public void m12719k(int i10, int i11) {
        this.f16106v = i10;
        this.f16107w = i11;
    }

    /* renamed from: l */
    public void m12720l(int i10, boolean z10, int i11, int i12) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Guideline value must be set between 0 and 2. See documentation.");
        }
        this.f16100p = i10;
        this.f16096l = z10;
        if (i11 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f16097m = i11;
        this.f16099o = i11 / this.f16098n;
        if (i12 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f16098n = i12;
        this.f16099o = i11 / i12;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m12709a(canvas, this.f16091g);
        if (m12708m()) {
            int i10 = this.f16100p;
            if (i10 == 2) {
                m12712d(canvas);
                m12710b(canvas);
            } else if (i10 == 1 && this.f16095k != null) {
                m12712d(canvas);
                m12710b(canvas);
            }
        }
        canvas.drawRect(Edge.LEFT.m12729k(), Edge.TOP.m12729k(), Edge.RIGHT.m12729k(), Edge.BOTTOM.m12729k(), this.f16087c);
        m12711c(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        m12714f(this.f16091g);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            m12715g(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                m12716h(motionEvent.getX(), motionEvent.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        m12717i();
        return true;
    }

    public void setAspectRatioX(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f16097m = i10;
        this.f16099o = i10 / this.f16098n;
        m12718j();
    }

    public void setAspectRatioY(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f16098n = i10;
        this.f16099o = this.f16097m / i10;
        m12718j();
    }

    public void setBitmapRect(Rect rect) {
        this.f16091g = rect;
        m12714f(rect);
    }

    public void setBorderAndGuidelineColor(@ColorInt int i10) {
        this.f16087c.setColor(i10);
        this.f16088d.setColor(i10);
        m12718j();
    }

    public void setBorderColor(@ColorInt int i10) {
        this.f16087c.setColor(i10);
        m12718j();
    }

    public void setBorderWidth(@Dimension float f10) {
        this.f16087c.setStrokeWidth(f10);
        m12718j();
    }

    public void setCornerColor(@ColorInt int i10) {
        this.f16089e.setColor(i10);
        m12718j();
    }

    public void setCornerWidth(@Dimension float f10) {
        this.f16089e.setStrokeWidth(f10);
        m12718j();
    }

    public void setCropOverlayCornerBitmap(Bitmap bitmap) {
        this.f16108x = bitmap;
        if (bitmap != null) {
            this.f16109y = bitmap.getWidth();
            this.f16110z = this.f16108x.getHeight();
        }
    }

    public void setFixedAspectRatio(boolean z10) {
        this.f16096l = z10;
        m12718j();
    }

    public void setGuidelineColor(@ColorInt int i10) {
        this.f16088d.setColor(i10);
        m12718j();
    }

    public void setGuidelineWidth(@Dimension float f10) {
        this.f16088d.setStrokeWidth(f10);
        m12718j();
    }

    public void setGuidelines(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Guideline value must be set between 0 and 2. See documentation.");
        }
        this.f16100p = i10;
        m12718j();
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16096l = false;
        this.f16097m = 1;
        this.f16098n = 1;
        this.f16099o = 1 / 1;
        this.f16101q = false;
        this.f16105u = null;
        this.f16106v = 0;
        this.f16107w = 0;
        this.f16108x = null;
        this.f16109y = 0;
        this.f16110z = 0;
        m12713e(context);
    }
}
