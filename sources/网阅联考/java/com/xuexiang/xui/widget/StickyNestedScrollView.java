package com.xuexiang.xui.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.bumptech.glide.AbstractC2857b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class StickyNestedScrollView extends NestedScrollView {

    /* renamed from: a */
    public ArrayList f3111a;

    /* renamed from: b */
    public View f3112b;

    /* renamed from: c */
    public float f3113c;

    /* renamed from: d */
    public final Runnable f3114d;

    /* renamed from: e */
    public int f3115e;

    /* renamed from: f */
    public boolean f3116f;

    /* renamed from: g */
    public boolean f3117g;

    /* renamed from: h */
    public boolean f3118h;

    /* renamed from: i */
    public int f3119i;

    /* renamed from: j */
    public Drawable f3120j;

    /* renamed from: k */
    public boolean f3121k;

    /* renamed from: l */
    public List f3122l;

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        m4094d(view);
    }

    /* renamed from: b */
    public final boolean m4092b(View view) {
        if (!m4097g(view).contains("sticky")) {
            return false;
        }
        this.f3111a.add(view);
        return true;
    }

    /* renamed from: c */
    public final void m4093c() {
        float fMin;
        Iterator it = this.f3111a.iterator();
        View view = null;
        View view2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View view3 = (View) it.next();
            int iM4098h = (m4098h(view3) - getScrollY()) + (this.f3117g ? 0 : getPaddingTop());
            if (iM4098h <= 0) {
                if (view != null) {
                    if (iM4098h > (m4098h(view) - getScrollY()) + (this.f3117g ? 0 : getPaddingTop())) {
                    }
                }
                view = view3;
            } else {
                if (view2 != null) {
                    if (iM4098h < (m4098h(view2) - getScrollY()) + (this.f3117g ? 0 : getPaddingTop())) {
                    }
                }
                view2 = view3;
            }
        }
        if (view == null) {
            if (this.f3112b != null) {
                List list = this.f3122l;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    if (it2.hasNext()) {
                        AbstractC2857b.m1678a(it2.next());
                        throw null;
                    }
                }
                m4103m();
                return;
            }
            return;
        }
        if (view2 == null) {
            fMin = 0.0f;
        } else {
            fMin = Math.min(0, ((m4098h(view2) - getScrollY()) + (this.f3117g ? 0 : getPaddingTop())) - view.getHeight());
        }
        this.f3113c = fMin;
        View view4 = this.f3112b;
        if (view != view4) {
            if (view4 != null) {
                List list2 = this.f3122l;
                if (list2 != null) {
                    Iterator it3 = list2.iterator();
                    if (it3.hasNext()) {
                        AbstractC2857b.m1678a(it3.next());
                        throw null;
                    }
                }
                m4103m();
            }
            this.f3115e = m4095e(view);
            m4102l(view);
            List list3 = this.f3122l;
            if (list3 != null) {
                Iterator it4 = list3.iterator();
                if (it4.hasNext()) {
                    AbstractC2857b.m1678a(it4.next());
                    throw null;
                }
            }
        }
    }

    /* renamed from: d */
    public final void m4094d(View view) {
        if (m4092b(view) || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            m4094d(viewGroup.getChildAt(i4));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f3112b != null) {
            canvas.save();
            canvas.translate(getPaddingLeft() + this.f3115e, getScrollY() + this.f3113c + (this.f3117g ? getPaddingTop() : 0));
            canvas.clipRect(0.0f, this.f3117g ? -this.f3113c : 0.0f, getWidth() - this.f3115e, this.f3112b.getHeight() + this.f3119i + 1);
            if (this.f3120j != null) {
                this.f3120j.setBounds(0, this.f3112b.getHeight(), this.f3112b.getWidth(), this.f3112b.getHeight() + this.f3119i);
                this.f3120j.draw(canvas);
            }
            canvas.clipRect(0.0f, this.f3117g ? -this.f3113c : 0.0f, getWidth(), this.f3112b.getHeight());
            if (m4097g(this.f3112b).contains("-hastransparency")) {
                m4101k(this.f3112b);
                this.f3112b.draw(canvas);
                m4099i(this.f3112b);
            } else {
                this.f3112b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3116f = true;
        }
        if (this.f3116f) {
            boolean z3 = this.f3112b != null;
            this.f3116f = z3;
            if (z3) {
                this.f3116f = motionEvent.getY() <= ((float) this.f3112b.getHeight()) + this.f3113c && motionEvent.getX() >= ((float) m4095e(this.f3112b)) && motionEvent.getX() <= ((float) m4096f(this.f3112b));
            }
        } else if (this.f3112b == null) {
            this.f3116f = false;
        }
        if (this.f3116f) {
            motionEvent.offsetLocation(0.0f, ((getScrollY() + this.f3113c) - m4098h(this.f3112b)) * (-1.0f));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final int m4095e(View view) {
        int left = view.getLeft();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            left += view.getLeft();
        }
        return left;
    }

    /* renamed from: f */
    public final int m4096f(View view) {
        int right = view.getRight();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            right += view.getRight();
        }
        return right;
    }

    /* renamed from: g */
    public final String m4097g(View view) {
        return String.valueOf(view.getTag());
    }

    /* renamed from: h */
    public final int m4098h(View view) {
        int top = view.getTop();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            top += view.getTop();
        }
        return top;
    }

    /* renamed from: i */
    public final void m4099i(View view) {
        view.setAlpha(0.0f);
    }

    /* renamed from: j */
    public final void m4100j() {
        if (this.f3112b != null) {
            m4103m();
        }
        this.f3111a.clear();
        m4094d(getChildAt(0));
        m4093c();
        invalidate();
    }

    /* renamed from: k */
    public final void m4101k(View view) {
        view.setAlpha(1.0f);
    }

    /* renamed from: l */
    public final void m4102l(View view) {
        this.f3112b = view;
        if (view != null) {
            if (m4097g(view).contains("-hastransparency")) {
                m4099i(this.f3112b);
            }
            if (m4097g(this.f3112b).contains("-nonconstant")) {
                post(this.f3114d);
            }
        }
    }

    /* renamed from: m */
    public final void m4103m() {
        if (m4097g(this.f3112b).contains("-hastransparency")) {
            m4101k(this.f3112b);
        }
        this.f3112b = null;
        removeCallbacks(this.f3114d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3114d);
        super.onDetachedFromWindow();
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (!this.f3118h) {
            this.f3117g = true;
        }
        m4100j();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        m4093c();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3116f) {
            motionEvent.offsetLocation(0.0f, (getScrollY() + this.f3113c) - m4098h(this.f3112b));
        }
        if (motionEvent.getAction() == 0) {
            this.f3121k = false;
        }
        if (this.f3121k) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(0);
            super.onTouchEvent(motionEventObtain);
            this.f3121k = false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f3121k = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        super.setClipToPadding(z3);
        this.f3117g = z3;
        this.f3118h = true;
    }

    public void setShadowDrawable(Drawable drawable) {
        this.f3120j = drawable;
    }

    public void setShadowHeight(int i4) {
        this.f3119i = i4;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i4) {
        super.addView(view, i4);
        m4094d(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        m4094d(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, int i5) {
        super.addView(view, i4, i5);
        m4094d(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        m4094d(view);
    }
}
