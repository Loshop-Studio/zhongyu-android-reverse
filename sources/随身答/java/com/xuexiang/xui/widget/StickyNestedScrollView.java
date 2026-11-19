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
import p217q.AbstractC9343a;

/* loaded from: classes4.dex */
public class StickyNestedScrollView extends NestedScrollView {

    /* renamed from: a */
    public ArrayList f7026a;

    /* renamed from: b */
    public View f7027b;

    /* renamed from: c */
    public float f7028c;

    /* renamed from: d */
    public final Runnable f7029d;

    /* renamed from: e */
    public int f7030e;

    /* renamed from: f */
    public boolean f7031f;

    /* renamed from: g */
    public boolean f7032g;

    /* renamed from: h */
    public boolean f7033h;

    /* renamed from: i */
    public int f7034i;

    /* renamed from: j */
    public Drawable f7035j;

    /* renamed from: k */
    public boolean f7036k;

    /* renamed from: l */
    public List f7037l;

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        m6504d(view);
    }

    /* renamed from: b */
    public final boolean m6502b(View view) {
        if (!m6507g(view).contains("sticky")) {
            return false;
        }
        this.f7026a.add(view);
        return true;
    }

    /* renamed from: c */
    public final void m6503c() {
        float fMin;
        ArrayList arrayList = this.f7026a;
        int size = arrayList.size();
        View view = null;
        View view2 = null;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            View view3 = (View) obj;
            int iM6508h = (m6508h(view3) - getScrollY()) + (this.f7032g ? 0 : getPaddingTop());
            if (iM6508h <= 0) {
                if (view != null) {
                    if (iM6508h > (m6508h(view) - getScrollY()) + (this.f7032g ? 0 : getPaddingTop())) {
                    }
                }
                view = view3;
            } else {
                if (view2 != null) {
                    if (iM6508h < (m6508h(view2) - getScrollY()) + (this.f7032g ? 0 : getPaddingTop())) {
                    }
                }
                view2 = view3;
            }
        }
        if (view == null) {
            if (this.f7027b != null) {
                List list = this.f7037l;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        AbstractC9343a.m15285a(it.next());
                        throw null;
                    }
                }
                m6513m();
                return;
            }
            return;
        }
        if (view2 == null) {
            fMin = 0.0f;
        } else {
            fMin = Math.min(0, ((m6508h(view2) - getScrollY()) + (this.f7032g ? 0 : getPaddingTop())) - view.getHeight());
        }
        this.f7028c = fMin;
        View view4 = this.f7027b;
        if (view != view4) {
            if (view4 != null) {
                List list2 = this.f7037l;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    if (it2.hasNext()) {
                        AbstractC9343a.m15285a(it2.next());
                        throw null;
                    }
                }
                m6513m();
            }
            this.f7030e = m6505e(view);
            m6512l(view);
            List list3 = this.f7037l;
            if (list3 != null) {
                Iterator it3 = list3.iterator();
                if (it3.hasNext()) {
                    AbstractC9343a.m15285a(it3.next());
                    throw null;
                }
            }
        }
    }

    /* renamed from: d */
    public final void m6504d(View view) {
        if (m6502b(view) || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            m6504d(viewGroup.getChildAt(i9));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f7027b != null) {
            canvas.save();
            canvas.translate(getPaddingLeft() + this.f7030e, getScrollY() + this.f7028c + (this.f7032g ? getPaddingTop() : 0));
            canvas.clipRect(0.0f, this.f7032g ? -this.f7028c : 0.0f, getWidth() - this.f7030e, this.f7027b.getHeight() + this.f7034i + 1);
            if (this.f7035j != null) {
                this.f7035j.setBounds(0, this.f7027b.getHeight(), this.f7027b.getWidth(), this.f7027b.getHeight() + this.f7034i);
                this.f7035j.draw(canvas);
            }
            canvas.clipRect(0.0f, this.f7032g ? -this.f7028c : 0.0f, getWidth(), this.f7027b.getHeight());
            if (m6507g(this.f7027b).contains("-hastransparency")) {
                m6511k(this.f7027b);
                this.f7027b.draw(canvas);
                m6509i(this.f7027b);
            } else {
                this.f7027b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f7031f = true;
        }
        if (this.f7031f) {
            boolean z9 = this.f7027b != null;
            this.f7031f = z9;
            if (z9) {
                this.f7031f = motionEvent.getY() <= ((float) this.f7027b.getHeight()) + this.f7028c && motionEvent.getX() >= ((float) m6505e(this.f7027b)) && motionEvent.getX() <= ((float) m6506f(this.f7027b));
            }
        } else if (this.f7027b == null) {
            this.f7031f = false;
        }
        if (this.f7031f) {
            motionEvent.offsetLocation(0.0f, ((getScrollY() + this.f7028c) - m6508h(this.f7027b)) * (-1.0f));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final int m6505e(View view) {
        int left = view.getLeft();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            left += view.getLeft();
        }
        return left;
    }

    /* renamed from: f */
    public final int m6506f(View view) {
        int right = view.getRight();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            right += view.getRight();
        }
        return right;
    }

    /* renamed from: g */
    public final String m6507g(View view) {
        return String.valueOf(view.getTag());
    }

    /* renamed from: h */
    public final int m6508h(View view) {
        int top2 = view.getTop();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            top2 += view.getTop();
        }
        return top2;
    }

    /* renamed from: i */
    public final void m6509i(View view) {
        view.setAlpha(0.0f);
    }

    /* renamed from: j */
    public final void m6510j() {
        if (this.f7027b != null) {
            m6513m();
        }
        this.f7026a.clear();
        m6504d(getChildAt(0));
        m6503c();
        invalidate();
    }

    /* renamed from: k */
    public final void m6511k(View view) {
        view.setAlpha(1.0f);
    }

    /* renamed from: l */
    public final void m6512l(View view) {
        this.f7027b = view;
        if (view != null) {
            if (m6507g(view).contains("-hastransparency")) {
                m6509i(this.f7027b);
            }
            if (m6507g(this.f7027b).contains("-nonconstant")) {
                post(this.f7029d);
            }
        }
    }

    /* renamed from: m */
    public final void m6513m() {
        if (m6507g(this.f7027b).contains("-hastransparency")) {
            m6511k(this.f7027b);
        }
        this.f7027b = null;
        removeCallbacks(this.f7029d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f7029d);
        super.onDetachedFromWindow();
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        if (!this.f7033h) {
            this.f7032g = true;
        }
        m6510j();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        m6503c();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f7031f) {
            motionEvent.offsetLocation(0.0f, (getScrollY() + this.f7028c) - m6508h(this.f7027b));
        }
        if (motionEvent.getAction() == 0) {
            this.f7036k = false;
        }
        if (this.f7036k) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(0);
            super.onTouchEvent(motionEventObtain);
            this.f7036k = false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f7036k = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z9) {
        super.setClipToPadding(z9);
        this.f7032g = z9;
        this.f7033h = true;
    }

    public void setShadowDrawable(Drawable drawable) {
        this.f7035j = drawable;
    }

    public void setShadowHeight(int i9) {
        this.f7034i = i9;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i9) {
        super.addView(view, i9);
        m6504d(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i9, layoutParams);
        m6504d(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i9, int i10) {
        super.addView(view, i9, i10);
        m6504d(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        m6504d(view);
    }
}
