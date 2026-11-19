package com.wang.avi;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.alibaba.android.arouter.utils.Consts;
import p388w7.AbstractC11710a;
import p404x7.C11810a;

/* loaded from: classes5.dex */
public class AVLoadingIndicatorView extends View {

    /* renamed from: p */
    public static final C11810a f15157p = new C11810a();

    /* renamed from: c */
    public long f15158c;

    /* renamed from: d */
    public boolean f15159d;

    /* renamed from: e */
    public boolean f15160e;

    /* renamed from: f */
    public boolean f15161f;

    /* renamed from: g */
    public final Runnable f15162g;

    /* renamed from: h */
    public final Runnable f15163h;

    /* renamed from: i */
    public int f15164i;

    /* renamed from: j */
    public int f15165j;

    /* renamed from: k */
    public int f15166k;

    /* renamed from: l */
    public int f15167l;

    /* renamed from: m */
    public AbstractC11710a f15168m;

    /* renamed from: n */
    public int f15169n;

    /* renamed from: o */
    public boolean f15170o;

    /* renamed from: com.wang.avi.AVLoadingIndicatorView$a */
    public class RunnableC8023a implements Runnable {
        public RunnableC8023a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AVLoadingIndicatorView.this.f15159d = false;
            AVLoadingIndicatorView.this.f15158c = -1L;
            AVLoadingIndicatorView.this.setVisibility(8);
        }
    }

    /* renamed from: com.wang.avi.AVLoadingIndicatorView$b */
    public class RunnableC8024b implements Runnable {
        public RunnableC8024b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AVLoadingIndicatorView.this.f15160e = false;
            if (AVLoadingIndicatorView.this.f15161f) {
                return;
            }
            AVLoadingIndicatorView.this.f15158c = System.currentTimeMillis();
            AVLoadingIndicatorView.this.setVisibility(0);
        }
    }

    public AVLoadingIndicatorView(Context context) {
        super(context);
        this.f15158c = -1L;
        this.f15159d = false;
        this.f15160e = false;
        this.f15161f = false;
        this.f15162g = new RunnableC8023a();
        this.f15163h = new RunnableC8024b();
        m12142f(context, null, 0, 0);
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        AbstractC11710a abstractC11710a = this.f15168m;
        if (abstractC11710a != null) {
            abstractC11710a.setHotspot(f10, f11);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m12147k();
    }

    /* renamed from: e */
    public void m12141e(Canvas canvas) {
        AbstractC11710a abstractC11710a = this.f15168m;
        if (abstractC11710a != null) {
            int iSave = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            abstractC11710a.draw(canvas);
            canvas.restoreToCount(iSave);
            if (this.f15170o) {
                abstractC11710a.start();
                this.f15170o = false;
            }
        }
    }

    /* renamed from: f */
    public final void m12142f(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f15164i = 24;
        this.f15165j = 48;
        this.f15166k = 24;
        this.f15167l = 48;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVLoadingIndicatorView, i10, i11);
        this.f15164i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AVLoadingIndicatorView_minWidth, this.f15164i);
        this.f15165j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AVLoadingIndicatorView_maxWidth, this.f15165j);
        this.f15166k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AVLoadingIndicatorView_minHeight, this.f15166k);
        this.f15167l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AVLoadingIndicatorView_maxHeight, this.f15167l);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.AVLoadingIndicatorView_indicatorName);
        this.f15169n = typedArrayObtainStyledAttributes.getColor(R$styleable.AVLoadingIndicatorView_indicatorColor, -1);
        setIndicator(string);
        if (this.f15168m == null) {
            setIndicator(f15157p);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: g */
    public final void m12143g() {
        removeCallbacks(this.f15162g);
        removeCallbacks(this.f15163h);
    }

    public AbstractC11710a getIndicator() {
        return this.f15168m;
    }

    /* renamed from: h */
    public void m12144h() {
        if (getVisibility() != 0) {
            return;
        }
        if (this.f15168m != null) {
            this.f15170o = true;
        }
        postInvalidate();
    }

    /* renamed from: i */
    public void m12145i() {
        if (this.f15168m != null) {
            this.f15168m.stop();
            this.f15170o = false;
        }
        postInvalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (!verifyDrawable(drawable)) {
            super.invalidateDrawable(drawable);
            return;
        }
        Rect bounds = drawable.getBounds();
        int scrollX = getScrollX() + getPaddingLeft();
        int scrollY = getScrollY() + getPaddingTop();
        invalidate(bounds.left + scrollX, bounds.top + scrollY, bounds.right + scrollX, bounds.bottom + scrollY);
    }

    /* renamed from: j */
    public final void m12146j(int i10, int i11) {
        int i12;
        int paddingRight = i10 - (getPaddingRight() + getPaddingLeft());
        int paddingTop = i11 - (getPaddingTop() + getPaddingBottom());
        if (this.f15168m != null) {
            float intrinsicWidth = r0.getIntrinsicWidth() / this.f15168m.getIntrinsicHeight();
            float f10 = paddingRight;
            float f11 = paddingTop;
            float f12 = f10 / f11;
            int i13 = 0;
            if (intrinsicWidth == f12) {
                i12 = 0;
            } else if (f12 > intrinsicWidth) {
                int i14 = (int) (f11 * intrinsicWidth);
                int i15 = (paddingRight - i14) / 2;
                i13 = i15;
                paddingRight = i14 + i15;
                i12 = 0;
            } else {
                int i16 = (int) (f10 * (1.0f / intrinsicWidth));
                int i17 = (paddingTop - i16) / 2;
                int i18 = i16 + i17;
                i12 = i17;
                paddingTop = i18;
            }
            this.f15168m.setBounds(i13, i12, paddingRight, paddingTop);
        }
    }

    /* renamed from: k */
    public final void m12147k() {
        int[] drawableState = getDrawableState();
        AbstractC11710a abstractC11710a = this.f15168m;
        if (abstractC11710a == null || !abstractC11710a.isStateful()) {
            return;
        }
        this.f15168m.setState(drawableState);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m12144h();
        m12143g();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m12145i();
        super.onDetachedFromWindow();
        m12143g();
    }

    @Override // android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m12141e(canvas);
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        int iMax;
        int iMax2;
        try {
            AbstractC11710a abstractC11710a = this.f15168m;
            if (abstractC11710a != null) {
                iMax2 = Math.max(this.f15164i, Math.min(this.f15165j, abstractC11710a.getIntrinsicWidth()));
                iMax = Math.max(this.f15166k, Math.min(this.f15167l, abstractC11710a.getIntrinsicHeight()));
            } else {
                iMax = 0;
                iMax2 = 0;
            }
            m12147k();
            setMeasuredDimension(View.resolveSizeAndState(iMax2 + getPaddingLeft() + getPaddingRight(), i10, 0), View.resolveSizeAndState(iMax + getPaddingTop() + getPaddingBottom(), i11, 0));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        m12146j(i10, i11);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 8 || i10 == 4) {
            m12145i();
        } else {
            m12144h();
        }
    }

    public void setIndicator(AbstractC11710a abstractC11710a) {
        AbstractC11710a abstractC11710a2 = this.f15168m;
        if (abstractC11710a2 != abstractC11710a) {
            if (abstractC11710a2 != null) {
                abstractC11710a2.setCallback(null);
                unscheduleDrawable(this.f15168m);
            }
            this.f15168m = abstractC11710a;
            setIndicatorColor(this.f15169n);
            if (abstractC11710a != null) {
                abstractC11710a.setCallback(this);
            }
            postInvalidate();
        }
    }

    public void setIndicatorColor(int i10) {
        this.f15169n = i10;
        this.f15168m.m25897i(i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (getVisibility() != i10) {
            super.setVisibility(i10);
            if (i10 == 8 || i10 == 4) {
                m12145i();
            } else {
                m12144h();
            }
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f15168m || super.verifyDrawable(drawable);
    }

    public void setIndicator(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!str.contains(Consts.DOT)) {
            sb2.append(getClass().getPackage().getName());
            sb2.append(".indicators");
            sb2.append(Consts.DOT);
        }
        sb2.append(str);
        try {
            setIndicator((AbstractC11710a) Class.forName(sb2.toString()).newInstance());
        } catch (ClassNotFoundException unused) {
            Log.e("AVLoadingIndicatorView", "Didn't find your class , check the name again !");
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (InstantiationException e11) {
            e11.printStackTrace();
        }
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15158c = -1L;
        this.f15159d = false;
        this.f15160e = false;
        this.f15161f = false;
        this.f15162g = new RunnableC8023a();
        this.f15163h = new RunnableC8024b();
        m12142f(context, attributeSet, 0, R$style.AVLoadingIndicatorView);
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15158c = -1L;
        this.f15159d = false;
        this.f15160e = false;
        this.f15161f = false;
        this.f15162g = new RunnableC8023a();
        this.f15163h = new RunnableC8024b();
        m12142f(context, attributeSet, i10, R$style.AVLoadingIndicatorView);
    }
}
