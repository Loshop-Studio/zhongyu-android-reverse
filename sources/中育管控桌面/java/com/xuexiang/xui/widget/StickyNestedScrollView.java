package com.xuexiang.xui.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p087k.AbstractC6619r;

/* loaded from: classes3.dex */
public class StickyNestedScrollView extends NestedScrollView {

    /* renamed from: a */
    public ArrayList f4495a;

    /* renamed from: b */
    public View f4496b;

    /* renamed from: c */
    public float f4497c;

    /* renamed from: d */
    public final Runnable f4498d;

    /* renamed from: e */
    public int f4499e;

    /* renamed from: f */
    public boolean f4500f;

    /* renamed from: g */
    public boolean f4501g;

    /* renamed from: h */
    public boolean f4502h;

    /* renamed from: i */
    public int f4503i;

    /* renamed from: j */
    public Drawable f4504j;

    /* renamed from: k */
    public boolean f4505k;

    /* renamed from: l */
    public List f4506l;

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        m4417d(view);
    }

    /* renamed from: b */
    public final boolean m4415b(View view) {
        if (!m4420g(view).contains("sticky")) {
            return false;
        }
        this.f4495a.add(view);
        return true;
    }

    /* renamed from: c */
    public final void m4416c() {
        float fMin;
        ArrayList arrayList = this.f4495a;
        int size = arrayList.size();
        View view = null;
        View view2 = null;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            View view3 = (View) obj;
            int iM4421h = (m4421h(view3) - getScrollY()) + (this.f4501g ? 0 : getPaddingTop());
            if (iM4421h <= 0) {
                if (view != null) {
                    if (iM4421h > (m4421h(view) - getScrollY()) + (this.f4501g ? 0 : getPaddingTop())) {
                    }
                }
                view = view3;
            } else {
                if (view2 != null) {
                    if (iM4421h < (m4421h(view2) - getScrollY()) + (this.f4501g ? 0 : getPaddingTop())) {
                    }
                }
                view2 = view3;
            }
        }
        if (view == null) {
            if (this.f4496b != null) {
                List list = this.f4506l;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        AbstractC6619r.m7572a(it.next());
                        throw null;
                    }
                }
                m4426m();
                return;
            }
            return;
        }
        if (view2 == null) {
            fMin = 0.0f;
        } else {
            fMin = Math.min(0, ((m4421h(view2) - getScrollY()) + (this.f4501g ? 0 : getPaddingTop())) - view.getHeight());
        }
        this.f4497c = fMin;
        View view4 = this.f4496b;
        if (view != view4) {
            if (view4 != null) {
                List list2 = this.f4506l;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    if (it2.hasNext()) {
                        AbstractC6619r.m7572a(it2.next());
                        throw null;
                    }
                }
                m4426m();
            }
            this.f4499e = m4418e(view);
            m4425l(view);
            List list3 = this.f4506l;
            if (list3 != null) {
                Iterator it3 = list3.iterator();
                if (it3.hasNext()) {
                    AbstractC6619r.m7572a(it3.next());
                    throw null;
                }
            }
        }
    }

    /* renamed from: d */
    public final void m4417d(View view) {
        if (m4415b(view) || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
            m4417d(viewGroup.getChildAt(i6));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f4496b != null) {
            canvas.save();
            canvas.translate(getPaddingLeft() + this.f4499e, getScrollY() + this.f4497c + (this.f4501g ? getPaddingTop() : 0));
            canvas.clipRect(0.0f, this.f4501g ? -this.f4497c : 0.0f, getWidth() - this.f4499e, this.f4496b.getHeight() + this.f4503i + 1);
            if (this.f4504j != null) {
                this.f4504j.setBounds(0, this.f4496b.getHeight(), this.f4496b.getWidth(), this.f4496b.getHeight() + this.f4503i);
                this.f4504j.draw(canvas);
            }
            canvas.clipRect(0.0f, this.f4501g ? -this.f4497c : 0.0f, getWidth(), this.f4496b.getHeight());
            if (m4420g(this.f4496b).contains("-hastransparency")) {
                m4424k(this.f4496b);
                this.f4496b.draw(canvas);
                m4422i(this.f4496b);
            } else {
                this.f4496b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4500f = true;
        }
        if (this.f4500f) {
            boolean z6 = this.f4496b != null;
            this.f4500f = z6;
            if (z6) {
                this.f4500f = motionEvent.getY() <= ((float) this.f4496b.getHeight()) + this.f4497c && motionEvent.getX() >= ((float) m4418e(this.f4496b)) && motionEvent.getX() <= ((float) m4419f(this.f4496b));
            }
        } else if (this.f4496b == null) {
            this.f4500f = false;
        }
        if (this.f4500f) {
            motionEvent.offsetLocation(0.0f, ((getScrollY() + this.f4497c) - m4421h(this.f4496b)) * (-1.0f));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final int m4418e(View view) {
        int left = view.getLeft();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            left += view.getLeft();
        }
        return left;
    }

    /* renamed from: f */
    public final int m4419f(View view) {
        int right = view.getRight();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            right += view.getRight();
        }
        return right;
    }

    /* renamed from: g */
    public final String m4420g(View view) {
        return String.valueOf(view.getTag());
    }

    /* renamed from: h */
    public final int m4421h(View view) {
        int top = view.getTop();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            top += view.getTop();
        }
        return top;
    }

    /* renamed from: i */
    public final void m4422i(View view) {
        view.setAlpha(0.0f);
    }

    /* renamed from: j */
    public final void m4423j() {
        if (this.f4496b != null) {
            m4426m();
        }
        this.f4495a.clear();
        m4417d(getChildAt(0));
        m4416c();
        invalidate();
    }

    /* renamed from: k */
    public final void m4424k(View view) {
        view.setAlpha(1.0f);
    }

    /* renamed from: l */
    public final void m4425l(View view) {
        this.f4496b = view;
        if (view != null) {
            if (m4420g(view).contains("-hastransparency")) {
                m4422i(this.f4496b);
            }
            if (m4420g(this.f4496b).contains("-nonconstant")) {
                post(this.f4498d);
            }
        }
    }

    /* renamed from: m */
    public final void m4426m() {
        if (m4420g(this.f4496b).contains("-hastransparency")) {
            m4424k(this.f4496b);
        }
        this.f4496b = null;
        removeCallbacks(this.f4498d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f4498d);
        super.onDetachedFromWindow();
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        super.onLayout(z6, i6, i7, i8, i9);
        if (!this.f4502h) {
            this.f4501g = true;
        }
        m4423j();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i6, int i7, int i8, int i9) {
        super.onScrollChanged(i6, i7, i8, i9);
        m4416c();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f4500f) {
            motionEvent.offsetLocation(0.0f, (getScrollY() + this.f4497c) - m4421h(this.f4496b));
        }
        if (motionEvent.getAction() == 0) {
            this.f4505k = false;
        }
        if (this.f4505k) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(0);
            super.onTouchEvent(motionEventObtain);
            this.f4505k = false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f4505k = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z6) {
        super.setClipToPadding(z6);
        this.f4501g = z6;
        this.f4502h = true;
    }

    public void setShadowDrawable(Drawable drawable) {
        this.f4504j = drawable;
    }

    public void setShadowHeight(int i6) {
        this.f4503i = i6;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i6) {
        super.addView(view, i6);
        m4417d(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i6, layoutParams);
        m4417d(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i6, int i7) {
        super.addView(view, i6, i7);
        m4417d(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        m4417d(view);
    }
}
