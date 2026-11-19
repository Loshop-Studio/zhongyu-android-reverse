package com.xuexiang.xui.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.blankj.utilcode.util.AbstractC5379p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class StickyNestedScrollView extends NestedScrollView {

    /* renamed from: a */
    public ArrayList f7092a;

    /* renamed from: b */
    public View f7093b;

    /* renamed from: c */
    public float f7094c;

    /* renamed from: d */
    public final Runnable f7095d;

    /* renamed from: e */
    public int f7096e;

    /* renamed from: f */
    public boolean f7097f;

    /* renamed from: g */
    public boolean f7098g;

    /* renamed from: h */
    public boolean f7099h;

    /* renamed from: i */
    public int f7100i;

    /* renamed from: j */
    public Drawable f7101j;

    /* renamed from: k */
    public boolean f7102k;

    /* renamed from: l */
    public List f7103l;

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        m6509d(view);
    }

    /* renamed from: b */
    public final boolean m6507b(View view) {
        if (!m6512g(view).contains("sticky")) {
            return false;
        }
        this.f7092a.add(view);
        return true;
    }

    /* renamed from: c */
    public final void m6508c() {
        float fMin;
        Iterator it = this.f7092a.iterator();
        View view = null;
        View view2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View view3 = (View) it.next();
            int iM6513h = (m6513h(view3) - getScrollY()) + (this.f7098g ? 0 : getPaddingTop());
            if (iM6513h <= 0) {
                if (view != null) {
                    if (iM6513h > (m6513h(view) - getScrollY()) + (this.f7098g ? 0 : getPaddingTop())) {
                    }
                }
                view = view3;
            } else {
                if (view2 != null) {
                    if (iM6513h < (m6513h(view2) - getScrollY()) + (this.f7098g ? 0 : getPaddingTop())) {
                    }
                }
                view2 = view3;
            }
        }
        if (view == null) {
            if (this.f7093b != null) {
                List list = this.f7103l;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    if (it2.hasNext()) {
                        AbstractC5379p.m2596a(it2.next());
                        throw null;
                    }
                }
                m6518m();
                return;
            }
            return;
        }
        if (view2 == null) {
            fMin = 0.0f;
        } else {
            fMin = Math.min(0, ((m6513h(view2) - getScrollY()) + (this.f7098g ? 0 : getPaddingTop())) - view.getHeight());
        }
        this.f7094c = fMin;
        View view4 = this.f7093b;
        if (view != view4) {
            if (view4 != null) {
                List list2 = this.f7103l;
                if (list2 != null) {
                    Iterator it3 = list2.iterator();
                    if (it3.hasNext()) {
                        AbstractC5379p.m2596a(it3.next());
                        throw null;
                    }
                }
                m6518m();
            }
            this.f7096e = m6510e(view);
            m6517l(view);
            List list3 = this.f7103l;
            if (list3 != null) {
                Iterator it4 = list3.iterator();
                if (it4.hasNext()) {
                    AbstractC5379p.m2596a(it4.next());
                    throw null;
                }
            }
        }
    }

    /* renamed from: d */
    public final void m6509d(View view) {
        if (m6507b(view) || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            m6509d(viewGroup.getChildAt(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f7093b != null) {
            canvas.save();
            canvas.translate(getPaddingLeft() + this.f7096e, getScrollY() + this.f7094c + (this.f7098g ? getPaddingTop() : 0));
            canvas.clipRect(0.0f, this.f7098g ? -this.f7094c : 0.0f, getWidth() - this.f7096e, this.f7093b.getHeight() + this.f7100i + 1);
            if (this.f7101j != null) {
                this.f7101j.setBounds(0, this.f7093b.getHeight(), this.f7093b.getWidth(), this.f7093b.getHeight() + this.f7100i);
                this.f7101j.draw(canvas);
            }
            canvas.clipRect(0.0f, this.f7098g ? -this.f7094c : 0.0f, getWidth(), this.f7093b.getHeight());
            if (m6512g(this.f7093b).contains("-hastransparency")) {
                m6516k(this.f7093b);
                this.f7093b.draw(canvas);
                m6514i(this.f7093b);
            } else {
                this.f7093b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f7097f = true;
        }
        if (this.f7097f) {
            boolean z10 = this.f7093b != null;
            this.f7097f = z10;
            if (z10) {
                this.f7097f = motionEvent.getY() <= ((float) this.f7093b.getHeight()) + this.f7094c && motionEvent.getX() >= ((float) m6510e(this.f7093b)) && motionEvent.getX() <= ((float) m6511f(this.f7093b));
            }
        } else if (this.f7093b == null) {
            this.f7097f = false;
        }
        if (this.f7097f) {
            motionEvent.offsetLocation(0.0f, ((getScrollY() + this.f7094c) - m6513h(this.f7093b)) * (-1.0f));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final int m6510e(View view) {
        int left = view.getLeft();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            left += view.getLeft();
        }
        return left;
    }

    /* renamed from: f */
    public final int m6511f(View view) {
        int right = view.getRight();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            right += view.getRight();
        }
        return right;
    }

    /* renamed from: g */
    public final String m6512g(View view) {
        return String.valueOf(view.getTag());
    }

    /* renamed from: h */
    public final int m6513h(View view) {
        int top2 = view.getTop();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            top2 += view.getTop();
        }
        return top2;
    }

    /* renamed from: i */
    public final void m6514i(View view) {
        view.setAlpha(0.0f);
    }

    /* renamed from: j */
    public final void m6515j() {
        if (this.f7093b != null) {
            m6518m();
        }
        this.f7092a.clear();
        m6509d(getChildAt(0));
        m6508c();
        invalidate();
    }

    /* renamed from: k */
    public final void m6516k(View view) {
        view.setAlpha(1.0f);
    }

    /* renamed from: l */
    public final void m6517l(View view) {
        this.f7093b = view;
        if (view != null) {
            if (m6512g(view).contains("-hastransparency")) {
                m6514i(this.f7093b);
            }
            if (m6512g(this.f7093b).contains("-nonconstant")) {
                post(this.f7095d);
            }
        }
    }

    /* renamed from: m */
    public final void m6518m() {
        if (m6512g(this.f7093b).contains("-hastransparency")) {
            m6516k(this.f7093b);
        }
        this.f7093b = null;
        removeCallbacks(this.f7095d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f7095d);
        super.onDetachedFromWindow();
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f7099h) {
            this.f7098g = true;
        }
        m6515j();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        m6508c();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f7097f) {
            motionEvent.offsetLocation(0.0f, (getScrollY() + this.f7094c) - m6513h(this.f7093b));
        }
        if (motionEvent.getAction() == 0) {
            this.f7102k = false;
        }
        if (this.f7102k) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(0);
            super.onTouchEvent(motionEventObtain);
            this.f7102k = false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f7102k = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        super.setClipToPadding(z10);
        this.f7098g = z10;
        this.f7099h = true;
    }

    public void setShadowDrawable(Drawable drawable) {
        this.f7101j = drawable;
    }

    public void setShadowHeight(int i10) {
        this.f7100i = i10;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        super.addView(view, i10);
        m6509d(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        m6509d(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        super.addView(view, i10, i11);
        m6509d(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        m6509d(view);
    }
}
