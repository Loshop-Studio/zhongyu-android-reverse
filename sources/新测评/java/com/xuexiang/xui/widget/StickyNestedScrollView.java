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
import p137k.AbstractC7846r;

/* loaded from: classes4.dex */
public class StickyNestedScrollView extends NestedScrollView {

    /* renamed from: a */
    public ArrayList f5771a;

    /* renamed from: b */
    public View f5772b;

    /* renamed from: c */
    public float f5773c;

    /* renamed from: d */
    public final Runnable f5774d;

    /* renamed from: e */
    public int f5775e;

    /* renamed from: f */
    public boolean f5776f;

    /* renamed from: g */
    public boolean f5777g;

    /* renamed from: h */
    public boolean f5778h;

    /* renamed from: i */
    public int f5779i;

    /* renamed from: j */
    public Drawable f5780j;

    /* renamed from: k */
    public boolean f5781k;

    /* renamed from: l */
    public List f5782l;

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        m5408d(view);
    }

    /* renamed from: b */
    public final boolean m5406b(View view) {
        if (!m5411g(view).contains("sticky")) {
            return false;
        }
        this.f5771a.add(view);
        return true;
    }

    /* renamed from: c */
    public final void m5407c() {
        float fMin;
        ArrayList arrayList = this.f5771a;
        int size = arrayList.size();
        View view = null;
        View view2 = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view3 = (View) obj;
            int iM5412h = (m5412h(view3) - getScrollY()) + (this.f5777g ? 0 : getPaddingTop());
            if (iM5412h <= 0) {
                if (view != null) {
                    if (iM5412h > (m5412h(view) - getScrollY()) + (this.f5777g ? 0 : getPaddingTop())) {
                    }
                }
                view = view3;
            } else {
                if (view2 != null) {
                    if (iM5412h < (m5412h(view2) - getScrollY()) + (this.f5777g ? 0 : getPaddingTop())) {
                    }
                }
                view2 = view3;
            }
        }
        if (view == null) {
            if (this.f5772b != null) {
                List list = this.f5782l;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        AbstractC7846r.m13306a(it.next());
                        throw null;
                    }
                }
                m5417m();
                return;
            }
            return;
        }
        if (view2 == null) {
            fMin = 0.0f;
        } else {
            fMin = Math.min(0, ((m5412h(view2) - getScrollY()) + (this.f5777g ? 0 : getPaddingTop())) - view.getHeight());
        }
        this.f5773c = fMin;
        View view4 = this.f5772b;
        if (view != view4) {
            if (view4 != null) {
                List list2 = this.f5782l;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    if (it2.hasNext()) {
                        AbstractC7846r.m13306a(it2.next());
                        throw null;
                    }
                }
                m5417m();
            }
            this.f5775e = m5409e(view);
            m5416l(view);
            List list3 = this.f5782l;
            if (list3 != null) {
                Iterator it3 = list3.iterator();
                if (it3.hasNext()) {
                    AbstractC7846r.m13306a(it3.next());
                    throw null;
                }
            }
        }
    }

    /* renamed from: d */
    public final void m5408d(View view) {
        if (m5406b(view) || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            m5408d(viewGroup.getChildAt(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f5772b != null) {
            canvas.save();
            canvas.translate(getPaddingLeft() + this.f5775e, getScrollY() + this.f5773c + (this.f5777g ? getPaddingTop() : 0));
            canvas.clipRect(0.0f, this.f5777g ? -this.f5773c : 0.0f, getWidth() - this.f5775e, this.f5772b.getHeight() + this.f5779i + 1);
            if (this.f5780j != null) {
                this.f5780j.setBounds(0, this.f5772b.getHeight(), this.f5772b.getWidth(), this.f5772b.getHeight() + this.f5779i);
                this.f5780j.draw(canvas);
            }
            canvas.clipRect(0.0f, this.f5777g ? -this.f5773c : 0.0f, getWidth(), this.f5772b.getHeight());
            if (m5411g(this.f5772b).contains("-hastransparency")) {
                m5415k(this.f5772b);
                this.f5772b.draw(canvas);
                m5413i(this.f5772b);
            } else {
                this.f5772b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f5776f = true;
        }
        if (this.f5776f) {
            boolean z9 = this.f5772b != null;
            this.f5776f = z9;
            if (z9) {
                this.f5776f = motionEvent.getY() <= ((float) this.f5772b.getHeight()) + this.f5773c && motionEvent.getX() >= ((float) m5409e(this.f5772b)) && motionEvent.getX() <= ((float) m5410f(this.f5772b));
            }
        } else if (this.f5772b == null) {
            this.f5776f = false;
        }
        if (this.f5776f) {
            motionEvent.offsetLocation(0.0f, ((getScrollY() + this.f5773c) - m5412h(this.f5772b)) * (-1.0f));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final int m5409e(View view) {
        int left = view.getLeft();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            left += view.getLeft();
        }
        return left;
    }

    /* renamed from: f */
    public final int m5410f(View view) {
        int right = view.getRight();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            right += view.getRight();
        }
        return right;
    }

    /* renamed from: g */
    public final String m5411g(View view) {
        return String.valueOf(view.getTag());
    }

    /* renamed from: h */
    public final int m5412h(View view) {
        int top2 = view.getTop();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            top2 += view.getTop();
        }
        return top2;
    }

    /* renamed from: i */
    public final void m5413i(View view) {
        view.setAlpha(0.0f);
    }

    /* renamed from: j */
    public final void m5414j() {
        if (this.f5772b != null) {
            m5417m();
        }
        this.f5771a.clear();
        m5408d(getChildAt(0));
        m5407c();
        invalidate();
    }

    /* renamed from: k */
    public final void m5415k(View view) {
        view.setAlpha(1.0f);
    }

    /* renamed from: l */
    public final void m5416l(View view) {
        this.f5772b = view;
        if (view != null) {
            if (m5411g(view).contains("-hastransparency")) {
                m5413i(this.f5772b);
            }
            if (m5411g(this.f5772b).contains("-nonconstant")) {
                post(this.f5774d);
            }
        }
    }

    /* renamed from: m */
    public final void m5417m() {
        if (m5411g(this.f5772b).contains("-hastransparency")) {
            m5415k(this.f5772b);
        }
        this.f5772b = null;
        removeCallbacks(this.f5774d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f5774d);
        super.onDetachedFromWindow();
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (!this.f5778h) {
            this.f5777g = true;
        }
        m5414j();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        m5407c();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f5776f) {
            motionEvent.offsetLocation(0.0f, (getScrollY() + this.f5773c) - m5412h(this.f5772b));
        }
        if (motionEvent.getAction() == 0) {
            this.f5781k = false;
        }
        if (this.f5781k) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(0);
            super.onTouchEvent(motionEventObtain);
            this.f5781k = false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f5781k = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z9) {
        super.setClipToPadding(z9);
        this.f5777g = z9;
        this.f5778h = true;
    }

    public void setShadowDrawable(Drawable drawable) {
        this.f5780j = drawable;
    }

    public void setShadowHeight(int i10) {
        this.f5779i = i10;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        super.addView(view, i10);
        m5408d(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        m5408d(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        super.addView(view, i10, i11);
        m5408d(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        m5408d(view);
    }
}
