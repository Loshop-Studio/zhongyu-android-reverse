package com.xuexiang.xui.widget.textview.badge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Random;
import p073h4.AbstractC5625a;
import p166t3.C6585b;
import p166t3.C6586c;
import p166t3.C6587d;
import p166t3.InterfaceC6584a;

/* loaded from: classes3.dex */
public class BadgeView extends View implements InterfaceC6584a {

    /* renamed from: a */
    public final int f5025a;

    /* renamed from: b */
    public final int f5026b;

    /* renamed from: c */
    public final float f5027c;

    /* renamed from: d */
    public final float f5028d;

    /* renamed from: e */
    public int f5029e;

    /* renamed from: f */
    public String f5030f;

    /* renamed from: g */
    public boolean f5031g;

    /* renamed from: h */
    public final boolean f5032h;

    /* renamed from: i */
    public final int f5033i;

    /* renamed from: j */
    public final float f5034j;

    /* renamed from: k */
    public final float f5035k;

    /* renamed from: l */
    public int f5036l;

    /* renamed from: m */
    public final RectF f5037m;

    /* renamed from: n */
    public final RectF f5038n;

    /* renamed from: o */
    public Paint.FontMetrics f5039o;

    /* renamed from: p */
    public final PointF f5040p;

    /* renamed from: q */
    public final PointF f5041q;

    /* renamed from: r */
    public final PointF f5042r;

    /* renamed from: s */
    public View f5043s;

    /* renamed from: t */
    public int f5044t;

    /* renamed from: u */
    public int f5045u;

    /* renamed from: v */
    public final TextPaint f5046v;

    /* renamed from: w */
    public final Paint f5047w;

    /* renamed from: x */
    public final Paint f5048x;

    /* renamed from: y */
    public C6586c f5049y;

    /* renamed from: z */
    public ViewGroup f5050z;

    public BadgeView(Context context) {
        super(context, null, 0);
        setLayerType(1, null);
        this.f5037m = new RectF();
        this.f5038n = new RectF();
        new Path();
        this.f5040p = new PointF();
        this.f5041q = new PointF();
        this.f5042r = new PointF();
        new PointF();
        new ArrayList();
        TextPaint textPaint = new TextPaint();
        this.f5046v = textPaint;
        textPaint.setAntiAlias(true);
        this.f5046v.setSubpixelText(true);
        this.f5046v.setFakeBoldText(true);
        this.f5046v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Paint paint = new Paint();
        this.f5047w = paint;
        paint.setAntiAlias(true);
        this.f5047w.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f5048x = paint2;
        paint2.setAntiAlias(true);
        this.f5048x.setStyle(Paint.Style.STROKE);
        this.f5025a = -1552832;
        this.f5026b = -1;
        this.f5027c = AbstractC5625a.m4954n(getContext(), 11.0f);
        this.f5028d = AbstractC5625a.m4948h(getContext(), 5.0f);
        this.f5029e = 0;
        this.f5033i = 8388661;
        this.f5034j = AbstractC5625a.m4948h(getContext(), 1.0f);
        this.f5035k = AbstractC5625a.m4948h(getContext(), 1.0f);
        AbstractC5625a.m4948h(getContext(), 90.0f);
        this.f5032h = true;
        setTranslationZ(1000.0f);
    }

    private float getBadgeCircleRadius() {
        float fWidth;
        float f;
        if (this.f5030f.isEmpty()) {
            return this.f5028d;
        }
        if (this.f5030f.length() != 1) {
            return this.f5038n.height() / 2.0f;
        }
        if (this.f5037m.height() > this.f5037m.width()) {
            fWidth = this.f5037m.height() / 2.0f;
            f = this.f5028d;
        } else {
            fWidth = this.f5037m.width() / 2.0f;
            f = this.f5028d;
        }
        return (f * 0.5f) + fWidth;
    }

    /* renamed from: a */
    public final void m3615a(View view) {
        if (view == null) {
            throw new IllegalStateException("targetView can not be null");
        }
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("targetView must have a parent");
        }
        this.f5043s = view;
        if (parent instanceof C6587d) {
            ((C6587d) parent).addView(this);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int iIndexOfChild = viewGroup.indexOfChild(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        viewGroup.removeView(view);
        C6587d c6587d = new C6587d(getContext());
        if (viewGroup instanceof RelativeLayout) {
            c6587d.setId(view.getId());
        }
        viewGroup.addView(c6587d, iIndexOfChild, layoutParams);
        c6587d.addView(view);
        c6587d.addView(this);
    }

    /* renamed from: b */
    public final void m3616b(View view) {
        if (view.getParent() != null && (view.getParent() instanceof View)) {
            m3616b((View) view.getParent());
        } else if (view instanceof ViewGroup) {
            this.f5050z = (ViewGroup) view;
        }
    }

    /* renamed from: c */
    public void mo3605c(boolean z8) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (z8) {
            this.f5050z.addView(this, new FrameLayout.LayoutParams(-1, -1));
        } else {
            m3615a(this.f5043s);
        }
    }

    public Drawable getBadgeBackground() {
        return null;
    }

    public int getBadgeBackgroundColor() {
        return this.f5025a;
    }

    public int getBadgeGravity() {
        return this.f5033i;
    }

    public int getBadgeNumber() {
        return this.f5029e;
    }

    public String getBadgeText() {
        return this.f5030f;
    }

    public int getBadgeTextColor() {
        return this.f5026b;
    }

    public PointF getDragCenter() {
        return null;
    }

    public View getTargetView() {
        return this.f5043s;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5050z == null) {
            View view = this.f5043s;
            ViewGroup viewGroup = (ViewGroup) view.getRootView();
            this.f5050z = viewGroup;
            if (viewGroup == null) {
                m3616b(view);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) throws NumberFormatException {
        C6586c c6586c = this.f5049y;
        if (c6586c != null && c6586c.isRunning()) {
            C6586c c6586c2 = this.f5049y;
            for (C6585b[] c6585bArr : c6586c2.f10997a) {
                for (C6585b c6585b : c6585bArr) {
                    float f = Float.parseFloat(c6586c2.getAnimatedValue().toString());
                    Paint paint = c6585b.f10996g;
                    paint.setColor(c6585b.f10994e);
                    float f7 = c6585b.f10991b;
                    Random random = c6585b.f10990a;
                    c6585b.f10991b = ((random.nextFloat() - 0.5f) * random.nextInt(c6585b.f10995f) * 0.1f) + f7;
                    float fNextFloat = ((random.nextFloat() - 0.5f) * random.nextInt(c6585b.f10995f) * 0.1f) + c6585b.f10992c;
                    c6585b.f10992c = fNextFloat;
                    float f8 = c6585b.f10991b;
                    float f9 = c6585b.f10993d;
                    canvas.drawCircle(f8, fNextFloat, f9 - (f * f9), paint);
                }
            }
            return;
        }
        if (this.f5030f != null) {
            int iM4948h = AbstractC5625a.m4948h(getContext(), 1.0f);
            int iM4948h2 = AbstractC5625a.m4948h(getContext(), 1.5f);
            int i = this.f5036l;
            if (i == 1) {
                iM4948h = AbstractC5625a.m4948h(getContext(), 1.0f);
                iM4948h2 = AbstractC5625a.m4948h(getContext(), -1.5f);
            } else if (i == 2) {
                iM4948h = AbstractC5625a.m4948h(getContext(), -1.0f);
                iM4948h2 = AbstractC5625a.m4948h(getContext(), -1.5f);
            } else if (i == 3) {
                iM4948h = AbstractC5625a.m4948h(getContext(), -1.0f);
                iM4948h2 = AbstractC5625a.m4948h(getContext(), 1.5f);
            } else if (i == 4) {
                iM4948h = AbstractC5625a.m4948h(getContext(), 1.0f);
                iM4948h2 = AbstractC5625a.m4948h(getContext(), 1.5f);
            }
            this.f5047w.setShadowLayer(this.f5032h ? AbstractC5625a.m4948h(getContext(), 2.0f) : 0.0f, iM4948h, iM4948h2, 855638016);
            this.f5047w.setColor(this.f5025a);
            this.f5048x.setColor(0);
            this.f5048x.setStrokeWidth(0.0f);
            this.f5046v.setColor(this.f5026b);
            this.f5046v.setTextAlign(Paint.Align.CENTER);
            float badgeCircleRadius = getBadgeCircleRadius();
            float f10 = this.f5042r.x;
            PointF pointF = this.f5041q;
            Math.sqrt(Math.pow(r3.y - pointF.y, 2.0d) + Math.pow(f10 - pointF.x, 2.0d));
            float fMax = Math.max(this.f5037m.height(), this.f5037m.width());
            int i8 = this.f5033i;
            if (i8 == 17) {
                PointF pointF2 = this.f5040p;
                pointF2.x = this.f5044t / 2.0f;
                pointF2.y = this.f5045u / 2.0f;
            } else if (i8 == 49) {
                PointF pointF3 = this.f5040p;
                pointF3.x = this.f5044t / 2.0f;
                pointF3.y = (this.f5037m.height() / 2.0f) + this.f5035k + this.f5028d;
            } else if (i8 == 8388629) {
                float f11 = this.f5044t - ((fMax / 2.0f) + (this.f5034j + this.f5028d));
                PointF pointF4 = this.f5040p;
                pointF4.x = f11;
                pointF4.y = this.f5045u / 2.0f;
            } else if (i8 == 8388661) {
                float f12 = this.f5044t;
                float f13 = this.f5034j;
                float f14 = this.f5028d;
                float f15 = f12 - ((fMax / 2.0f) + (f13 + f14));
                PointF pointF5 = this.f5040p;
                pointF5.x = f15;
                pointF5.y = (this.f5037m.height() / 2.0f) + this.f5035k + f14;
            }
            getLocationOnScreen(new int[2]);
            PointF pointF6 = this.f5040p;
            float f16 = pointF6.x + r3[0];
            PointF pointF7 = this.f5042r;
            pointF7.x = f16;
            pointF7.y = pointF6.y + r3[1];
            PointF pointF8 = this.f5040p;
            if (pointF8.x == -1000.0f && pointF8.y == -1000.0f) {
                return;
            }
            if (this.f5030f.isEmpty() || this.f5030f.length() == 1) {
                float f17 = pointF8.x;
                float f18 = (int) badgeCircleRadius;
                RectF rectF = this.f5038n;
                rectF.left = f17 - f18;
                float f19 = pointF8.y;
                rectF.top = f19 - f18;
                rectF.right = f17 + f18;
                rectF.bottom = f18 + f19;
                canvas.drawCircle(f17, f19, badgeCircleRadius, this.f5047w);
            } else {
                this.f5038n.left = pointF8.x - ((this.f5037m.width() / 2.0f) + this.f5028d);
                this.f5038n.top = pointF8.y - ((this.f5028d * 0.5f) + (this.f5037m.height() / 2.0f));
                this.f5038n.right = (this.f5037m.width() / 2.0f) + this.f5028d + pointF8.x;
                this.f5038n.bottom = (this.f5028d * 0.5f) + (this.f5037m.height() / 2.0f) + pointF8.y;
                float fHeight = this.f5038n.height() / 2.0f;
                canvas.drawRoundRect(this.f5038n, fHeight, fHeight, this.f5047w);
            }
            if (this.f5030f.isEmpty()) {
                return;
            }
            String str = this.f5030f;
            float f20 = pointF8.x;
            RectF rectF2 = this.f5038n;
            float f21 = rectF2.bottom + rectF2.top;
            Paint.FontMetrics fontMetrics = this.f5039o;
            canvas.drawText(str, f20, ((f21 - fontMetrics.bottom) - fontMetrics.top) / 2.0f, this.f5046v);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        this.f5044t = i;
        this.f5045u = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L58
            if (r0 == r2) goto L2f
            r3 = 2
            if (r0 == r3) goto L17
            r3 = 3
            if (r0 == r3) goto L2f
            r3 = 5
            if (r0 == r3) goto L58
            r3 = 6
            if (r0 == r3) goto L2f
            goto L5e
        L17:
            boolean r0 = r4.f5031g
            if (r0 == 0) goto L5e
            android.graphics.PointF r0 = r4.f5041q
            float r3 = r5.getRawX()
            r0.x = r3
            android.graphics.PointF r0 = r4.f5041q
            float r3 = r5.getRawY()
            r0.y = r3
            r4.invalidate()
            goto L5e
        L2f:
            int r0 = r5.getActionIndex()
            int r0 = r5.getPointerId(r0)
            if (r0 != 0) goto L5e
            boolean r0 = r4.f5031g
            if (r0 == 0) goto L5e
            r4.f5031g = r1
            android.graphics.PointF r0 = r4.f5041q
            r3 = -998637568(0xffffffffc47a0000, float:-1000.0)
            r0.x = r3
            r0.y = r3
            r0 = 4
            r4.f5036l = r0
            r4.mo3605c(r1)
            android.view.ViewParent r0 = r4.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            r4.invalidate()
            goto L5e
        L58:
            r5.getX()
            r5.getY()
        L5e:
            boolean r0 = r4.f5031g
            if (r0 != 0) goto L6a
            boolean r5 = super.onTouchEvent(r5)
            if (r5 == 0) goto L69
            goto L6a
        L69:
            return r1
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.textview.badge.BadgeView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
