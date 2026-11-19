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
import p055f2.AbstractC6296a;
import p055f2.AbstractC6301f;
import p055f2.AbstractC6303h;

/* loaded from: classes3.dex */
public class CropOverlayView extends View {

    /* renamed from: A */
    public static final float f5020A;

    /* renamed from: B */
    public static final float f5021B;

    /* renamed from: y */
    public static final float f5022y;

    /* renamed from: z */
    public static final float f5023z;

    /* renamed from: a */
    public Paint f5024a;

    /* renamed from: b */
    public Paint f5025b;

    /* renamed from: c */
    public Paint f5026c;

    /* renamed from: d */
    public Paint f5027d;

    /* renamed from: e */
    public Rect f5028e;

    /* renamed from: f */
    public float f5029f;

    /* renamed from: g */
    public float f5030g;

    /* renamed from: h */
    public Pair f5031h;

    /* renamed from: i */
    public Handle f5032i;

    /* renamed from: j */
    public boolean f5033j;

    /* renamed from: k */
    public int f5034k;

    /* renamed from: l */
    public int f5035l;

    /* renamed from: m */
    public float f5036m;

    /* renamed from: n */
    public int f5037n;

    /* renamed from: o */
    public boolean f5038o;

    /* renamed from: p */
    public float f5039p;

    /* renamed from: q */
    public float f5040q;

    /* renamed from: r */
    public float f5041r;

    /* renamed from: s */
    public Bitmap f5042s;

    /* renamed from: t */
    public int f5043t;

    /* renamed from: u */
    public int f5044u;

    /* renamed from: v */
    public Bitmap f5045v;

    /* renamed from: w */
    public int f5046w;

    /* renamed from: x */
    public int f5047x;

    static {
        float fM6467a = AbstractC6303h.m6467a();
        f5022y = fM6467a;
        float fM6468b = AbstractC6303h.m6468b();
        f5023z = fM6468b;
        float f6 = (fM6467a / 2.0f) - (fM6468b / 2.0f);
        f5020A = f6;
        f5021B = (fM6467a / 2.0f) + f6;
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5033j = false;
        this.f5034k = 1;
        this.f5035l = 1;
        this.f5036m = 1 / 1;
        this.f5038o = false;
        this.f5042s = null;
        this.f5043t = 0;
        this.f5044u = 0;
        this.f5045v = null;
        this.f5046w = 0;
        this.f5047x = 0;
        m4689e(context);
    }

    /* renamed from: k */
    public static boolean m4684k() {
        return Math.abs(Edge.LEFT.m4703g() - Edge.RIGHT.m4703g()) >= 100.0f && Math.abs(Edge.TOP.m4703g() - Edge.BOTTOM.m4703g()) >= 100.0f;
    }

    /* renamed from: a */
    public final void m4685a(Canvas canvas, Rect rect) {
        float fM4703g = Edge.LEFT.m4703g();
        float fM4703g2 = Edge.TOP.m4703g();
        float fM4703g3 = Edge.RIGHT.m4703g();
        float fM4703g4 = Edge.BOTTOM.m4703g();
        canvas.drawRect(rect.left, rect.top, rect.right, fM4703g2, this.f5027d);
        canvas.drawRect(rect.left, fM4703g4, rect.right, rect.bottom, this.f5027d);
        canvas.drawRect(rect.left, fM4703g2, fM4703g, fM4703g4, this.f5027d);
        canvas.drawRect(fM4703g3, fM4703g2, rect.right, fM4703g4, this.f5027d);
    }

    /* renamed from: b */
    public final void m4686b(Canvas canvas) {
        float fWidth = this.f5028e.width();
        float f6 = this.f5043t / fWidth;
        float fHeight = this.f5044u / this.f5028e.height();
        int iM4700i = (int) (Edge.m4700i() * f6);
        int iM4699h = (int) (Edge.m4699h() * fHeight);
        this.f5024a.setStrokeWidth(0.0f);
        this.f5024a.setTextAlign(Paint.Align.CENTER);
        this.f5024a.setTextSize(25.0f);
        canvas.drawText(iM4700i + "x" + iM4699h, (Edge.LEFT.m4703g() / 2.0f) + (Edge.RIGHT.m4703g() / 2.0f), (Edge.TOP.m4703g() / 2.0f) + (Edge.BOTTOM.m4703g() / 2.0f), this.f5024a);
    }

    /* renamed from: c */
    public final void m4687c(Canvas canvas) {
        float fM4703g = Edge.LEFT.m4703g();
        float fM4703g2 = Edge.TOP.m4703g();
        float fM4703g3 = Edge.RIGHT.m4703g();
        float fM4703g4 = Edge.BOTTOM.m4703g();
        Bitmap bitmap = this.f5045v;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, fM4703g - (this.f5046w / 2.0f), fM4703g2 - (this.f5047x / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f5045v, fM4703g3 - (this.f5046w / 2.0f), fM4703g2 - (this.f5047x / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f5045v, fM4703g - (this.f5046w / 2.0f), fM4703g4 - (this.f5047x / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f5045v, fM4703g3 - (this.f5046w / 2.0f), fM4703g4 - (this.f5047x / 2.0f), (Paint) null);
            return;
        }
        float f6 = this.f5040q;
        canvas.drawLine(fM4703g - f6, fM4703g2 - this.f5039p, fM4703g - f6, this.f5041r + fM4703g2, this.f5026c);
        float f7 = this.f5040q;
        canvas.drawLine(fM4703g, fM4703g2 - f7, fM4703g + this.f5041r, fM4703g2 - f7, this.f5026c);
        float f8 = this.f5040q;
        canvas.drawLine(fM4703g3 + f8, fM4703g2 - this.f5039p, fM4703g3 + f8, fM4703g2 + this.f5041r, this.f5026c);
        float f9 = this.f5040q;
        canvas.drawLine(fM4703g3, fM4703g2 - f9, fM4703g3 - this.f5041r, fM4703g2 - f9, this.f5026c);
        float f10 = this.f5040q;
        canvas.drawLine(fM4703g - f10, this.f5039p + fM4703g4, fM4703g - f10, fM4703g4 - this.f5041r, this.f5026c);
        float f11 = this.f5040q;
        canvas.drawLine(fM4703g, fM4703g4 + f11, fM4703g + this.f5041r, fM4703g4 + f11, this.f5026c);
        float f12 = this.f5040q;
        canvas.drawLine(fM4703g3 + f12, this.f5039p + fM4703g4, fM4703g3 + f12, fM4703g4 - this.f5041r, this.f5026c);
        float f13 = this.f5040q;
        canvas.drawLine(fM4703g3, fM4703g4 + f13, fM4703g3 - this.f5041r, fM4703g4 + f13, this.f5026c);
    }

    /* renamed from: d */
    public final void m4688d(Canvas canvas) {
        float fM4703g = Edge.LEFT.m4703g();
        float fM4703g2 = Edge.TOP.m4703g();
        float fM4703g3 = Edge.RIGHT.m4703g();
        float fM4703g4 = Edge.BOTTOM.m4703g();
        float fM4700i = Edge.m4700i() / 3.0f;
        float f6 = fM4703g + fM4700i;
        canvas.drawLine(f6, fM4703g2, f6, fM4703g4, this.f5025b);
        float f7 = fM4703g3 - fM4700i;
        canvas.drawLine(f7, fM4703g2, f7, fM4703g4, this.f5025b);
        float fM4699h = Edge.m4699h() / 3.0f;
        float f8 = fM4703g2 + fM4699h;
        canvas.drawLine(fM4703g, f8, fM4703g3, f8, this.f5025b);
        float f9 = fM4703g4 - fM4699h;
        canvas.drawLine(fM4703g, f9, fM4703g3, f9, this.f5025b);
    }

    /* renamed from: e */
    public final void m4689e(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f5029f = AbstractC6301f.m6462d(context);
        this.f5030g = TypedValue.applyDimension(1, 6.0f, displayMetrics);
        this.f5024a = AbstractC6303h.m6470d(context);
        this.f5025b = AbstractC6303h.m6472f(context);
        this.f5027d = AbstractC6303h.m6469c(context);
        this.f5026c = AbstractC6303h.m6471e(context);
        this.f5040q = TypedValue.applyDimension(1, f5020A, displayMetrics);
        this.f5039p = TypedValue.applyDimension(1, f5021B, displayMetrics);
        this.f5041r = TypedValue.applyDimension(1, 20.0f, displayMetrics);
        this.f5037n = 1;
    }

    /* renamed from: f */
    public final void m4690f(Rect rect) {
        if (!this.f5038o) {
            this.f5038o = true;
        }
        if (!this.f5033j) {
            float fWidth = rect.width() * 0.1f;
            float fHeight = rect.height() * 0.1f;
            Edge.LEFT.m4708n(rect.left + fWidth);
            Edge.TOP.m4708n(rect.top + fHeight);
            Edge.RIGHT.m4708n(rect.right - fWidth);
            Edge.BOTTOM.m4708n(rect.bottom - fHeight);
            return;
        }
        if (AbstractC6296a.m6447b(rect) > this.f5036m) {
            Edge edge = Edge.TOP;
            edge.m4708n(rect.top);
            Edge edge2 = Edge.BOTTOM;
            edge2.m4708n(rect.bottom);
            float width = getWidth() / 2.0f;
            float fMax = Math.max(40.0f, AbstractC6296a.m6453h(edge.m4703g(), edge2.m4703g(), this.f5036m));
            if (fMax == 40.0f) {
                this.f5036m = 40.0f / (edge2.m4703g() - edge.m4703g());
            }
            float f6 = fMax / 2.0f;
            Edge.LEFT.m4708n(width - f6);
            Edge.RIGHT.m4708n(width + f6);
            return;
        }
        Edge edge3 = Edge.LEFT;
        edge3.m4708n(rect.left);
        Edge edge4 = Edge.RIGHT;
        edge4.m4708n(rect.right);
        float height = getHeight() / 2.0f;
        float fMax2 = Math.max(40.0f, AbstractC6296a.m6449d(edge3.m4703g(), edge4.m4703g(), this.f5036m));
        if (fMax2 == 40.0f) {
            float fM4703g = edge4.m4703g() - edge3.m4703g();
            if (fM4703g > 0.0f) {
                this.f5036m = fM4703g / 40.0f;
            }
        }
        float f7 = fMax2 / 2.0f;
        Edge.TOP.m4708n(height - f7);
        Edge.BOTTOM.m4708n(height + f7);
    }

    /* renamed from: g */
    public final void m4691g(float f6, float f7) {
        float fM4703g = Edge.LEFT.m4703g();
        float fM4703g2 = Edge.TOP.m4703g();
        float fM4703g3 = Edge.RIGHT.m4703g();
        float fM4703g4 = Edge.BOTTOM.m4703g();
        Handle handleM6461c = AbstractC6301f.m6461c(f6, f7, fM4703g, fM4703g2, fM4703g3, fM4703g4, this.f5029f);
        this.f5032i = handleM6461c;
        if (handleM6461c == null) {
            return;
        }
        this.f5031h = AbstractC6301f.m6460b(handleM6461c, f6, f7, fM4703g, fM4703g2, fM4703g3, fM4703g4);
        invalidate();
    }

    /* renamed from: h */
    public final void m4692h(float f6, float f7) {
        if (this.f5032i == null) {
            return;
        }
        float fFloatValue = f6 + ((Float) this.f5031h.first).floatValue();
        float fFloatValue2 = f7 + ((Float) this.f5031h.second).floatValue();
        if (this.f5033j) {
            this.f5032i.m4711a(fFloatValue, fFloatValue2, this.f5036m, this.f5028e, this.f5030g);
        } else {
            this.f5032i.m4712b(fFloatValue, fFloatValue2, this.f5028e, this.f5030g);
        }
        invalidate();
    }

    /* renamed from: i */
    public final void m4693i() {
        if (this.f5032i == null) {
            return;
        }
        this.f5032i = null;
        invalidate();
    }

    /* renamed from: j */
    public void m4694j() {
        if (this.f5038o) {
            m4690f(this.f5028e);
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m4685a(canvas, this.f5028e);
        if (m4684k()) {
            int i6 = this.f5037n;
            if (i6 == 2) {
                m4688d(canvas);
                m4686b(canvas);
            } else if (i6 == 1 && this.f5032i != null) {
                m4688d(canvas);
                m4686b(canvas);
            }
        }
        canvas.drawRect(Edge.LEFT.m4703g(), Edge.TOP.m4703g(), Edge.RIGHT.m4703g(), Edge.BOTTOM.m4703g(), this.f5024a);
        m4687c(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i6, int i7, int i8, int i9) {
        m4690f(this.f5028e);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            m4691g(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                m4692h(motionEvent.getX(), motionEvent.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        m4693i();
        return true;
    }

    public void setAspectRatioX(int i6) {
        if (i6 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f5034k = i6;
        this.f5036m = i6 / this.f5035l;
        m4694j();
    }

    public void setAspectRatioY(int i6) {
        if (i6 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f5035l = i6;
        this.f5036m = this.f5034k / i6;
        m4694j();
    }

    public void setBitmapRect(Rect rect) {
        this.f5028e = rect;
        m4690f(rect);
    }

    public void setBorderAndGuidelineColor(@ColorInt int i6) {
        this.f5024a.setColor(i6);
        this.f5025b.setColor(i6);
        m4694j();
    }

    public void setBorderColor(@ColorInt int i6) {
        this.f5024a.setColor(i6);
        m4694j();
    }

    public void setBorderWidth(@Dimension float f6) {
        this.f5024a.setStrokeWidth(f6);
        m4694j();
    }

    public void setCornerColor(@ColorInt int i6) {
        this.f5026c.setColor(i6);
        m4694j();
    }

    public void setCornerWidth(@Dimension float f6) {
        this.f5026c.setStrokeWidth(f6);
        m4694j();
    }

    public void setCropOverlayCornerBitmap(Bitmap bitmap) {
        this.f5045v = bitmap;
        if (bitmap != null) {
            this.f5046w = bitmap.getWidth();
            this.f5047x = this.f5045v.getHeight();
        }
    }

    public void setFixedAspectRatio(boolean z6) {
        this.f5033j = z6;
        m4694j();
    }

    public void setGuidelineColor(@ColorInt int i6) {
        this.f5025b.setColor(i6);
        m4694j();
    }

    public void setGuidelineWidth(@Dimension float f6) {
        this.f5025b.setStrokeWidth(f6);
        m4694j();
    }

    public void setGuidelines(int i6) {
        if (i6 < 0 || i6 > 2) {
            throw new IllegalArgumentException("Guideline value must be set between 0 and 2. See documentation.");
        }
        this.f5037n = i6;
        m4694j();
    }
}
