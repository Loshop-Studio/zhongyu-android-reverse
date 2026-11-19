package com.xuexiang.xui.widget.textview.badge;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.camera.video.AudioStats;
import com.taobao.sophix.PatchStatus;
import com.xuexiang.xui.utils.AbstractC8037c;
import java.util.ArrayList;
import java.util.List;
import p251m9.AbstractC10212b;
import p251m9.C10211a;

/* loaded from: classes5.dex */
public class BadgeView extends View implements InterfaceC8300a {

    /* renamed from: A */
    public Path f17297A;

    /* renamed from: B */
    public Paint.FontMetrics f17298B;

    /* renamed from: C */
    public PointF f17299C;

    /* renamed from: D */
    public PointF f17300D;

    /* renamed from: E */
    public PointF f17301E;

    /* renamed from: F */
    public PointF f17302F;

    /* renamed from: G */
    public List f17303G;

    /* renamed from: H */
    public View f17304H;

    /* renamed from: I */
    public int f17305I;

    /* renamed from: J */
    public int f17306J;

    /* renamed from: K */
    public TextPaint f17307K;

    /* renamed from: L */
    public Paint f17308L;

    /* renamed from: M */
    public Paint f17309M;

    /* renamed from: N */
    public C10211a f17310N;

    /* renamed from: O */
    public ViewGroup f17311O;

    /* renamed from: c */
    public int f17312c;

    /* renamed from: d */
    public int f17313d;

    /* renamed from: e */
    public int f17314e;

    /* renamed from: f */
    public Drawable f17315f;

    /* renamed from: g */
    public Bitmap f17316g;

    /* renamed from: h */
    public boolean f17317h;

    /* renamed from: i */
    public float f17318i;

    /* renamed from: j */
    public float f17319j;

    /* renamed from: k */
    public float f17320k;

    /* renamed from: l */
    public int f17321l;

    /* renamed from: m */
    public String f17322m;

    /* renamed from: n */
    public boolean f17323n;

    /* renamed from: o */
    public boolean f17324o;

    /* renamed from: p */
    public boolean f17325p;

    /* renamed from: q */
    public boolean f17326q;

    /* renamed from: r */
    public int f17327r;

    /* renamed from: s */
    public float f17328s;

    /* renamed from: t */
    public float f17329t;

    /* renamed from: u */
    public float f17330u;

    /* renamed from: v */
    public float f17331v;

    /* renamed from: w */
    public int f17332w;

    /* renamed from: x */
    public boolean f17333x;

    /* renamed from: y */
    public RectF f17334y;

    /* renamed from: z */
    public RectF f17335z;

    /* renamed from: com.xuexiang.xui.widget.textview.badge.BadgeView$a */
    public static class C8299a extends ViewGroup {
        public C8299a(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchRestoreInstanceState(SparseArray sparseArray) {
            if (getParent() instanceof RelativeLayout) {
                return;
            }
            super.dispatchRestoreInstanceState(sparseArray);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        @Override // android.view.View
        public void onMeasure(int i10, int i11) {
            View view = null;
            View view2 = null;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof BadgeView) {
                    view2 = childAt;
                } else {
                    view = childAt;
                }
            }
            if (view == null) {
                super.onMeasure(i10, i11);
                return;
            }
            view.measure(i10, i11);
            if (view2 != null) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
            }
            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public BadgeView(Context context) {
        this(context, null);
    }

    private float getBadgeCircleRadius() {
        return this.f17322m.isEmpty() ? this.f17320k : this.f17322m.length() == 1 ? this.f17334y.height() > this.f17334y.width() ? (this.f17334y.height() / 2.0f) + (this.f17320k * 0.5f) : (this.f17334y.width() / 2.0f) + (this.f17320k * 0.5f) : this.f17335z.height() / 2.0f;
    }

    /* renamed from: A */
    public final void m13550A() {
        if (this.f17333x) {
            m13566m(this.f17300D);
            m13553E(5);
        } else {
            m13551B();
            m13553E(4);
        }
    }

    /* renamed from: B */
    public void m13551B() {
        PointF pointF = this.f17300D;
        pointF.x = -1000.0f;
        pointF.y = -1000.0f;
        this.f17332w = 4;
        mo13420C(false);
        getParent().requestDisallowInterceptTouchEvent(false);
        invalidate();
    }

    /* renamed from: C */
    public void mo13420C(boolean z10) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (z10) {
            this.f17311O.addView(this, new FrameLayout.LayoutParams(-1, -1));
        } else {
            m13567n(this.f17304H);
        }
    }

    /* renamed from: D */
    public final void m13552D(boolean z10) {
        int iM12188b = AbstractC8037c.m12188b(getContext(), 1.0f);
        int iM12188b2 = AbstractC8037c.m12188b(getContext(), 1.5f);
        int i10 = this.f17332w;
        if (i10 == 1) {
            iM12188b = AbstractC8037c.m12188b(getContext(), 1.0f);
            iM12188b2 = AbstractC8037c.m12188b(getContext(), -1.5f);
        } else if (i10 == 2) {
            iM12188b = AbstractC8037c.m12188b(getContext(), -1.0f);
            iM12188b2 = AbstractC8037c.m12188b(getContext(), -1.5f);
        } else if (i10 == 3) {
            iM12188b = AbstractC8037c.m12188b(getContext(), -1.0f);
            iM12188b2 = AbstractC8037c.m12188b(getContext(), 1.5f);
        } else if (i10 == 4) {
            iM12188b = AbstractC8037c.m12188b(getContext(), 1.0f);
            iM12188b2 = AbstractC8037c.m12188b(getContext(), 1.5f);
        }
        this.f17308L.setShadowLayer(z10 ? AbstractC8037c.m12188b(getContext(), 2.0f) : 0.0f, iM12188b, iM12188b2, 855638016);
    }

    /* renamed from: E */
    public final void m13553E(int i10) {
    }

    @Override // com.xuexiang.xui.widget.textview.badge.InterfaceC8300a
    /* renamed from: a */
    public InterfaceC8300a mo13554a(String str) {
        this.f17322m = str;
        this.f17321l = 1;
        m13579z();
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.InterfaceC8300a
    /* renamed from: b */
    public InterfaceC8300a mo13555b(int i10) {
        this.f17312c = i10;
        if (i10 == 0) {
            this.f17307K.setXfermode(null);
        } else {
            this.f17307K.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.InterfaceC8300a
    /* renamed from: c */
    public InterfaceC8300a mo13556c(int i10) {
        this.f17314e = i10;
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.InterfaceC8300a
    /* renamed from: d */
    public InterfaceC8300a mo13557d(int i10, float f10, boolean z10) {
        this.f17313d = i10;
        if (z10) {
            f10 = AbstractC8037c.m12188b(getContext(), f10);
        }
        this.f17318i = f10;
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.InterfaceC8300a
    /* renamed from: e */
    public InterfaceC8300a mo13558e(int i10) {
        if (i10 != 8388659 && i10 != 8388661 && i10 != 8388691 && i10 != 8388693 && i10 != 17 && i10 != 49 && i10 != 81 && i10 != 8388627 && i10 != 8388629) {
            throw new IllegalStateException("only support Gravity.START | Gravity.TOP , Gravity.END | Gravity.TOP , Gravity.START | Gravity.BOTTOM , Gravity.END | Gravity.BOTTOM , Gravity.CENTER , Gravity.CENTER | Gravity.TOP , Gravity.CENTER | Gravity.BOTTOM ,Gravity.CENTER | Gravity.START , Gravity.CENTER | Gravity.END");
        }
        this.f17327r = i10;
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.InterfaceC8300a
    /* renamed from: f */
    public InterfaceC8300a mo13559f(int i10) {
        this.f17321l = i10;
        if (i10 < 0) {
            this.f17322m = "";
        } else if (i10 > 99) {
            this.f17322m = this.f17325p ? String.valueOf(i10) : "99+";
        } else if (i10 > 0) {
            this.f17322m = String.valueOf(i10);
        } else {
            this.f17322m = null;
        }
        m13579z();
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.InterfaceC8300a
    /* renamed from: g */
    public InterfaceC8300a mo13560g(float f10, float f11, boolean z10) {
        if (z10) {
            f10 = AbstractC8037c.m12188b(getContext(), f10);
        }
        this.f17328s = f10;
        if (z10) {
            f11 = AbstractC8037c.m12188b(getContext(), f11);
        }
        this.f17329t = f11;
        invalidate();
        return this;
    }

    public Drawable getBadgeBackground() {
        return this.f17315f;
    }

    public int getBadgeBackgroundColor() {
        return this.f17312c;
    }

    public int getBadgeGravity() {
        return this.f17327r;
    }

    public int getBadgeNumber() {
        return this.f17321l;
    }

    public String getBadgeText() {
        return this.f17322m;
    }

    public int getBadgeTextColor() {
        return this.f17314e;
    }

    public PointF getDragCenter() {
        if (this.f17323n && this.f17324o) {
            return this.f17300D;
        }
        return null;
    }

    public View getTargetView() {
        return this.f17304H;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.InterfaceC8300a
    /* renamed from: h */
    public InterfaceC8300a mo13561h(boolean z10) {
        this.f17326q = z10;
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.InterfaceC8300a
    /* renamed from: i */
    public InterfaceC8300a mo13562i(boolean z10) {
        this.f17325p = z10;
        int i10 = this.f17321l;
        if (i10 > 99) {
            mo13559f(i10);
        }
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.InterfaceC8300a
    /* renamed from: j */
    public InterfaceC8300a mo13563j(float f10, boolean z10) {
        if (z10) {
            f10 = AbstractC8037c.m12188b(getContext(), f10);
        }
        this.f17320k = f10;
        m13569p();
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.InterfaceC8300a
    /* renamed from: k */
    public InterfaceC8300a mo13564k(float f10, boolean z10) {
        if (z10) {
            f10 = AbstractC8037c.m12188b(getContext(), f10);
        }
        this.f17319j = f10;
        m13579z();
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.InterfaceC8300a
    /* renamed from: l */
    public InterfaceC8300a mo13565l(Drawable drawable, boolean z10) {
        this.f17317h = z10;
        this.f17315f = drawable;
        m13569p();
        invalidate();
        return this;
    }

    /* renamed from: m */
    public void m13566m(PointF pointF) {
        if (this.f17322m == null) {
            return;
        }
        C10211a c10211a = this.f17310N;
        if (c10211a == null || !c10211a.isRunning()) {
            mo13420C(true);
            C10211a c10211a2 = new C10211a(m13568o(), pointF, this);
            this.f17310N = c10211a2;
            c10211a2.start();
            mo13559f(0);
        }
    }

    /* renamed from: n */
    public InterfaceC8300a m13567n(View view) {
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
        this.f17304H = view;
        if (parent instanceof C8299a) {
            ((C8299a) parent).addView(this);
            return this;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int iIndexOfChild = viewGroup.indexOfChild(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        viewGroup.removeView(view);
        C8299a c8299a = new C8299a(getContext());
        if (viewGroup instanceof RelativeLayout) {
            c8299a.setId(view.getId());
        }
        viewGroup.addView(c8299a, iIndexOfChild, layoutParams);
        c8299a.addView(view);
        c8299a.addView(this);
        return this;
    }

    /* renamed from: o */
    public Bitmap m13568o() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f17335z.width()) + AbstractC8037c.m12188b(getContext(), 3.0f), ((int) this.f17335z.height()) + AbstractC8037c.m12188b(getContext(), 3.0f), Bitmap.Config.ARGB_8888);
        m13570q(new Canvas(bitmapCreateBitmap), new PointF(r1.getWidth() / 2.0f, r1.getHeight() / 2.0f), getBadgeCircleRadius());
        return bitmapCreateBitmap;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17311O == null) {
            m13575v(this.f17304H);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C10211a c10211a = this.f17310N;
        if (c10211a != null && c10211a.isRunning()) {
            this.f17310N.m21350d(canvas);
            return;
        }
        if (this.f17322m != null) {
            m13577x();
            float badgeCircleRadius = getBadgeCircleRadius();
            float fM21354b = this.f17330u * (1.0f - (AbstractC10212b.m21354b(this.f17301E, this.f17300D) / this.f17331v));
            if (!this.f17323n || !this.f17324o) {
                m13574u();
                m13570q(canvas, this.f17299C, badgeCircleRadius);
                return;
            }
            this.f17332w = AbstractC10212b.m21355c(this.f17300D, this.f17301E);
            m13552D(this.f17326q);
            boolean z10 = fM21354b < ((float) AbstractC8037c.m12188b(getContext(), 1.5f));
            this.f17333x = z10;
            if (z10) {
                m13553E(3);
                m13570q(canvas, this.f17300D, badgeCircleRadius);
            } else {
                m13553E(2);
                m13572s(canvas, fM21354b, badgeCircleRadius);
                m13570q(canvas, this.f17300D, badgeCircleRadius);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f17305I = i10;
        this.f17306J = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L45
            if (r0 == r2) goto L31
            r3 = 2
            if (r0 == r3) goto L18
            r3 = 3
            if (r0 == r3) goto L31
            r3 = 5
            if (r0 == r3) goto L45
            r3 = 6
            if (r0 == r3) goto L31
            goto La8
        L18:
            boolean r0 = r6.f17324o
            if (r0 == 0) goto La8
            android.graphics.PointF r0 = r6.f17300D
            float r3 = r7.getRawX()
            r0.x = r3
            android.graphics.PointF r0 = r6.f17300D
            float r3 = r7.getRawY()
            r0.y = r3
            r6.invalidate()
            goto La8
        L31:
            int r0 = r7.getActionIndex()
            int r0 = r7.getPointerId(r0)
            if (r0 != 0) goto La8
            boolean r0 = r6.f17324o
            if (r0 == 0) goto La8
            r6.f17324o = r1
            r6.m13550A()
            goto La8
        L45:
            float r0 = r7.getX()
            float r3 = r7.getY()
            boolean r4 = r6.f17323n
            if (r4 == 0) goto La8
            int r4 = r7.getActionIndex()
            int r4 = r7.getPointerId(r4)
            if (r4 != 0) goto La8
            android.graphics.RectF r4 = r6.f17335z
            float r5 = r4.left
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto La8
            float r5 = r4.right
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto La8
            float r0 = r4.top
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto La8
            float r0 = r4.bottom
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto La8
            java.lang.String r0 = r6.f17322m
            if (r0 == 0) goto La8
            r6.m13578y()
            r6.f17324o = r2
            r6.m13553E(r2)
            android.content.Context r0 = r6.getContext()
            r3 = 1088421888(0x40e00000, float:7.0)
            int r0 = com.xuexiang.xui.utils.AbstractC8037c.m12188b(r0, r3)
            float r0 = (float) r0
            r6.f17330u = r0
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            r6.mo13420C(r2)
            android.graphics.PointF r0 = r6.f17300D
            float r3 = r7.getRawX()
            r0.x = r3
            android.graphics.PointF r0 = r6.f17300D
            float r3 = r7.getRawY()
            r0.y = r3
        La8:
            boolean r0 = r6.f17324o
            if (r0 != 0) goto Lb4
            boolean r7 = super.onTouchEvent(r7)
            if (r7 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r1
        Lb4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.textview.badge.BadgeView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m13569p() {
        if (this.f17322m != null && this.f17317h) {
            Bitmap bitmap = this.f17316g;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f17316g.recycle();
            }
            float badgeCircleRadius = getBadgeCircleRadius();
            if (!this.f17322m.isEmpty() && this.f17322m.length() != 1) {
                this.f17316g = Bitmap.createBitmap((int) (this.f17334y.width() + (this.f17320k * 2.0f)), (int) (this.f17334y.height() + this.f17320k), Bitmap.Config.ARGB_4444);
                new Canvas(this.f17316g).drawRoundRect(0.0f, 0.0f, r3.getWidth(), r3.getHeight(), r3.getHeight() / 2.0f, r3.getHeight() / 2.0f, this.f17308L);
            } else {
                int i10 = ((int) badgeCircleRadius) * 2;
                this.f17316g = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_4444);
                new Canvas(this.f17316g).drawCircle(r0.getWidth() / 2.0f, r0.getHeight() / 2.0f, r0.getWidth() / 2.0f, this.f17308L);
            }
        }
    }

    /* renamed from: q */
    public final void m13570q(Canvas canvas, PointF pointF, float f10) {
        if (pointF.x == -1000.0f && pointF.y == -1000.0f) {
            return;
        }
        if (this.f17322m.isEmpty() || this.f17322m.length() == 1) {
            RectF rectF = this.f17335z;
            float f11 = pointF.x;
            float f12 = (int) f10;
            rectF.left = f11 - f12;
            float f13 = pointF.y;
            rectF.top = f13 - f12;
            rectF.right = f11 + f12;
            rectF.bottom = f12 + f13;
            if (this.f17315f != null) {
                m13571r(canvas);
            } else {
                canvas.drawCircle(f11, f13, f10, this.f17308L);
                if (this.f17313d != 0 && this.f17318i > 0.0f) {
                    canvas.drawCircle(pointF.x, pointF.y, f10, this.f17309M);
                }
            }
        } else {
            this.f17335z.left = pointF.x - ((this.f17334y.width() / 2.0f) + this.f17320k);
            this.f17335z.top = pointF.y - ((this.f17334y.height() / 2.0f) + (this.f17320k * 0.5f));
            this.f17335z.right = pointF.x + (this.f17334y.width() / 2.0f) + this.f17320k;
            this.f17335z.bottom = pointF.y + (this.f17334y.height() / 2.0f) + (this.f17320k * 0.5f);
            float fHeight = this.f17335z.height() / 2.0f;
            if (this.f17315f != null) {
                m13571r(canvas);
            } else {
                canvas.drawRoundRect(this.f17335z, fHeight, fHeight, this.f17308L);
                if (this.f17313d != 0 && this.f17318i > 0.0f) {
                    canvas.drawRoundRect(this.f17335z, fHeight, fHeight, this.f17309M);
                }
            }
        }
        if (this.f17322m.isEmpty()) {
            return;
        }
        String str = this.f17322m;
        float f14 = pointF.x;
        RectF rectF2 = this.f17335z;
        float f15 = rectF2.bottom + rectF2.top;
        Paint.FontMetrics fontMetrics = this.f17298B;
        canvas.drawText(str, f14, ((f15 - fontMetrics.bottom) - fontMetrics.top) / 2.0f, this.f17307K);
    }

    /* renamed from: r */
    public final void m13571r(Canvas canvas) {
        Canvas canvas2;
        this.f17308L.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        RectF rectF = this.f17335z;
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int width = (int) rectF.right;
        int height = (int) rectF.bottom;
        if (this.f17317h) {
            width = i10 + this.f17316g.getWidth();
            height = this.f17316g.getHeight() + i11;
            canvas2 = canvas;
            canvas2.saveLayer(i10, i11, width, height, null, 31);
        } else {
            canvas2 = canvas;
        }
        this.f17315f.setBounds(i10, i11, width, height);
        this.f17315f.draw(canvas2);
        if (!this.f17317h) {
            canvas2.drawRect(this.f17335z, this.f17309M);
            return;
        }
        this.f17308L.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas2.drawBitmap(this.f17316g, i10, i11, this.f17308L);
        canvas2.restore();
        this.f17308L.setXfermode(null);
        if (this.f17322m.isEmpty() || this.f17322m.length() == 1) {
            canvas2.drawCircle(this.f17335z.centerX(), this.f17335z.centerY(), this.f17335z.width() / 2.0f, this.f17309M);
        } else {
            RectF rectF2 = this.f17335z;
            canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, this.f17335z.height() / 2.0f, this.f17309M);
        }
    }

    /* renamed from: s */
    public final void m13572s(Canvas canvas, float f10, float f11) {
        float f12;
        float f13;
        float f14;
        Double dValueOf = Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        PointF pointF = this.f17300D;
        float f15 = pointF.y;
        PointF pointF2 = this.f17301E;
        float f16 = f15 - pointF2.y;
        float f17 = pointF.x - pointF2.x;
        this.f17303G.clear();
        if (f17 != 0.0f) {
            double d10 = (-1.0d) / (f16 / f17);
            AbstractC10212b.m21353a(this.f17300D, f11, Double.valueOf(d10), this.f17303G);
            AbstractC10212b.m21353a(this.f17301E, f10, Double.valueOf(d10), this.f17303G);
        } else {
            AbstractC10212b.m21353a(this.f17300D, f11, dValueOf, this.f17303G);
            AbstractC10212b.m21353a(this.f17301E, f10, dValueOf, this.f17303G);
        }
        this.f17297A.reset();
        Path path = this.f17297A;
        PointF pointF3 = this.f17301E;
        float f18 = pointF3.x;
        float f19 = pointF3.y;
        int i10 = this.f17332w;
        path.addCircle(f18, f19, f10, (i10 == 1 || i10 == 2) ? Path.Direction.CCW : Path.Direction.CW);
        PointF pointF4 = this.f17302F;
        PointF pointF5 = this.f17301E;
        float f20 = pointF5.x;
        PointF pointF6 = this.f17300D;
        pointF4.x = (f20 + pointF6.x) / 2.0f;
        pointF4.y = (pointF5.y + pointF6.y) / 2.0f;
        this.f17297A.moveTo(((PointF) this.f17303G.get(2)).x, ((PointF) this.f17303G.get(2)).y);
        Path path2 = this.f17297A;
        PointF pointF7 = this.f17302F;
        path2.quadTo(pointF7.x, pointF7.y, ((PointF) this.f17303G.get(0)).x, ((PointF) this.f17303G.get(0)).y);
        this.f17297A.lineTo(((PointF) this.f17303G.get(1)).x, ((PointF) this.f17303G.get(1)).y);
        Path path3 = this.f17297A;
        PointF pointF8 = this.f17302F;
        path3.quadTo(pointF8.x, pointF8.y, ((PointF) this.f17303G.get(3)).x, ((PointF) this.f17303G.get(3)).y);
        this.f17297A.lineTo(((PointF) this.f17303G.get(2)).x, ((PointF) this.f17303G.get(2)).y);
        this.f17297A.close();
        canvas.drawPath(this.f17297A, this.f17308L);
        if (this.f17313d == 0 || this.f17318i <= 0.0f) {
            return;
        }
        this.f17297A.reset();
        this.f17297A.moveTo(((PointF) this.f17303G.get(2)).x, ((PointF) this.f17303G.get(2)).y);
        Path path4 = this.f17297A;
        PointF pointF9 = this.f17302F;
        path4.quadTo(pointF9.x, pointF9.y, ((PointF) this.f17303G.get(0)).x, ((PointF) this.f17303G.get(0)).y);
        this.f17297A.moveTo(((PointF) this.f17303G.get(1)).x, ((PointF) this.f17303G.get(1)).y);
        Path path5 = this.f17297A;
        PointF pointF10 = this.f17302F;
        path5.quadTo(pointF10.x, pointF10.y, ((PointF) this.f17303G.get(3)).x, ((PointF) this.f17303G.get(3)).y);
        int i11 = this.f17332w;
        if (i11 == 1 || i11 == 2) {
            float f21 = ((PointF) this.f17303G.get(2)).x;
            PointF pointF11 = this.f17301E;
            f12 = f21 - pointF11.x;
            f13 = pointF11.y;
            f14 = ((PointF) this.f17303G.get(2)).y;
        } else {
            float f22 = ((PointF) this.f17303G.get(3)).x;
            PointF pointF12 = this.f17301E;
            f12 = f22 - pointF12.x;
            f13 = pointF12.y;
            f14 = ((PointF) this.f17303G.get(3)).y;
        }
        double dAtan = Math.atan((f13 - f14) / f12);
        int i12 = this.f17332w;
        float fM21357e = 360.0f - ((float) AbstractC10212b.m21357e(AbstractC10212b.m21356d(dAtan, i12 + (-1) == 0 ? 4 : i12 - 1)));
        Path path6 = this.f17297A;
        PointF pointF13 = this.f17301E;
        float f23 = pointF13.x;
        float f24 = pointF13.y;
        path6.addArc(f23 - f10, f24 - f10, f23 + f10, f24 + f10, fM21357e, 180.0f);
        canvas.drawPath(this.f17297A, this.f17309M);
    }

    /* renamed from: t */
    public final void m13573t(View view) {
        if (view.getParent() != null && (view.getParent() instanceof View)) {
            m13573t((View) view.getParent());
        } else if (view instanceof ViewGroup) {
            this.f17311O = (ViewGroup) view;
        }
    }

    /* renamed from: u */
    public final void m13574u() {
        float fMax = Math.max(this.f17334y.height(), this.f17334y.width());
        switch (this.f17327r) {
            case 17:
                PointF pointF = this.f17299C;
                pointF.x = this.f17305I / 2.0f;
                pointF.y = this.f17306J / 2.0f;
                break;
            case 49:
                PointF pointF2 = this.f17299C;
                pointF2.x = this.f17305I / 2.0f;
                pointF2.y = this.f17329t + this.f17320k + (this.f17334y.height() / 2.0f);
                break;
            case PatchStatus.CODE_LOAD_HANDLE_DEX /* 81 */:
                PointF pointF3 = this.f17299C;
                pointF3.x = this.f17305I / 2.0f;
                pointF3.y = this.f17306J - ((this.f17329t + this.f17320k) + (this.f17334y.height() / 2.0f));
                break;
            case 8388627:
                PointF pointF4 = this.f17299C;
                pointF4.x = this.f17328s + this.f17320k + (fMax / 2.0f);
                pointF4.y = this.f17306J / 2.0f;
                break;
            case 8388629:
                PointF pointF5 = this.f17299C;
                pointF5.x = this.f17305I - ((this.f17328s + this.f17320k) + (fMax / 2.0f));
                pointF5.y = this.f17306J / 2.0f;
                break;
            case 8388659:
                PointF pointF6 = this.f17299C;
                float f10 = this.f17328s;
                float f11 = this.f17320k;
                pointF6.x = f10 + f11 + (fMax / 2.0f);
                pointF6.y = this.f17329t + f11 + (this.f17334y.height() / 2.0f);
                break;
            case 8388661:
                PointF pointF7 = this.f17299C;
                float f12 = this.f17305I;
                float f13 = this.f17328s;
                float f14 = this.f17320k;
                pointF7.x = f12 - ((f13 + f14) + (fMax / 2.0f));
                pointF7.y = this.f17329t + f14 + (this.f17334y.height() / 2.0f);
                break;
            case 8388691:
                PointF pointF8 = this.f17299C;
                float f15 = this.f17328s;
                float f16 = this.f17320k;
                pointF8.x = f15 + f16 + (fMax / 2.0f);
                pointF8.y = this.f17306J - ((this.f17329t + f16) + (this.f17334y.height() / 2.0f));
                break;
            case 8388693:
                PointF pointF9 = this.f17299C;
                float f17 = this.f17305I;
                float f18 = this.f17328s;
                float f19 = this.f17320k;
                pointF9.x = f17 - ((f18 + f19) + (fMax / 2.0f));
                pointF9.y = this.f17306J - ((this.f17329t + f19) + (this.f17334y.height() / 2.0f));
                break;
        }
        m13578y();
    }

    /* renamed from: v */
    public final void m13575v(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getRootView();
        this.f17311O = viewGroup;
        if (viewGroup == null) {
            m13573t(view);
        }
    }

    /* renamed from: w */
    public final void m13576w() {
        setLayerType(1, null);
        this.f17334y = new RectF();
        this.f17335z = new RectF();
        this.f17297A = new Path();
        this.f17299C = new PointF();
        this.f17300D = new PointF();
        this.f17301E = new PointF();
        this.f17302F = new PointF();
        this.f17303G = new ArrayList();
        TextPaint textPaint = new TextPaint();
        this.f17307K = textPaint;
        textPaint.setAntiAlias(true);
        this.f17307K.setSubpixelText(true);
        this.f17307K.setFakeBoldText(true);
        this.f17307K.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Paint paint = new Paint();
        this.f17308L = paint;
        paint.setAntiAlias(true);
        this.f17308L.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f17309M = paint2;
        paint2.setAntiAlias(true);
        this.f17309M.setStyle(Paint.Style.STROKE);
        this.f17312c = -1552832;
        this.f17314e = -1;
        this.f17319j = AbstractC8037c.m12190d(getContext(), 11.0f);
        this.f17320k = AbstractC8037c.m12188b(getContext(), 5.0f);
        this.f17321l = 0;
        this.f17327r = 8388661;
        this.f17328s = AbstractC8037c.m12188b(getContext(), 1.0f);
        this.f17329t = AbstractC8037c.m12188b(getContext(), 1.0f);
        this.f17331v = AbstractC8037c.m12188b(getContext(), 90.0f);
        this.f17326q = true;
        this.f17317h = false;
        setTranslationZ(1000.0f);
    }

    /* renamed from: x */
    public final void m13577x() {
        m13552D(this.f17326q);
        this.f17308L.setColor(this.f17312c);
        this.f17309M.setColor(this.f17313d);
        this.f17309M.setStrokeWidth(this.f17318i);
        this.f17307K.setColor(this.f17314e);
        this.f17307K.setTextAlign(Paint.Align.CENTER);
    }

    /* renamed from: y */
    public final void m13578y() {
        getLocationOnScreen(new int[2]);
        PointF pointF = this.f17301E;
        PointF pointF2 = this.f17299C;
        pointF.x = pointF2.x + r0[0];
        pointF.y = pointF2.y + r0[1];
    }

    /* renamed from: z */
    public final void m13579z() {
        RectF rectF = this.f17334y;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        if (TextUtils.isEmpty(this.f17322m)) {
            RectF rectF2 = this.f17334y;
            rectF2.right = 0.0f;
            rectF2.bottom = 0.0f;
        } else {
            this.f17307K.setTextSize(this.f17319j);
            this.f17334y.right = this.f17307K.measureText(this.f17322m);
            Paint.FontMetrics fontMetrics = this.f17307K.getFontMetrics();
            this.f17298B = fontMetrics;
            this.f17334y.bottom = fontMetrics.descent - fontMetrics.ascent;
        }
        m13569p();
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m13576w();
    }
}
