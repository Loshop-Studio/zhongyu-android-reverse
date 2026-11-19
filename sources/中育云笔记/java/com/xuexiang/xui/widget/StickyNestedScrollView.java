package com.xuexiang.xui.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p212k.AbstractC9764r;

/* loaded from: classes5.dex */
public class StickyNestedScrollView extends NestedScrollView {

    /* renamed from: c */
    public ArrayList f15304c;

    /* renamed from: d */
    public View f15305d;

    /* renamed from: e */
    public float f15306e;

    /* renamed from: f */
    public final Runnable f15307f;

    /* renamed from: g */
    public int f15308g;

    /* renamed from: h */
    public boolean f15309h;

    /* renamed from: i */
    public boolean f15310i;

    /* renamed from: j */
    public boolean f15311j;

    /* renamed from: k */
    public int f15312k;

    /* renamed from: l */
    public Drawable f15313l;

    /* renamed from: m */
    public boolean f15314m;

    /* renamed from: n */
    public List f15315n;

    /* renamed from: com.xuexiang.xui.widget.StickyNestedScrollView$a */
    public class RunnableC8045a implements Runnable {
        public RunnableC8045a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (StickyNestedScrollView.this.f15305d != null) {
                StickyNestedScrollView stickyNestedScrollView = StickyNestedScrollView.this;
                int iM12250k = stickyNestedScrollView.m12250k(stickyNestedScrollView.f15305d);
                StickyNestedScrollView stickyNestedScrollView2 = StickyNestedScrollView.this;
                int iM12249j = stickyNestedScrollView2.m12249j(stickyNestedScrollView2.f15305d);
                StickyNestedScrollView stickyNestedScrollView3 = StickyNestedScrollView.this;
                StickyNestedScrollView.this.invalidate(iM12250k, iM12249j, stickyNestedScrollView3.m12251l(stickyNestedScrollView3.f15305d), (int) (StickyNestedScrollView.this.getScrollY() + StickyNestedScrollView.this.f15305d.getHeight() + StickyNestedScrollView.this.f15306e));
            }
            StickyNestedScrollView.this.postDelayed(this, 16L);
        }
    }

    public StickyNestedScrollView(Context context) {
        this(context, null);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        m12248i(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f15305d != null) {
            canvas.save();
            canvas.translate(getPaddingLeft() + this.f15308g, getScrollY() + this.f15306e + (this.f15310i ? getPaddingTop() : 0));
            canvas.clipRect(0.0f, this.f15310i ? -this.f15306e : 0.0f, getWidth() - this.f15308g, this.f15305d.getHeight() + this.f15312k + 1);
            if (this.f15313l != null) {
                this.f15313l.setBounds(0, this.f15305d.getHeight(), this.f15305d.getWidth(), this.f15305d.getHeight() + this.f15312k);
                this.f15313l.draw(canvas);
            }
            canvas.clipRect(0.0f, this.f15310i ? -this.f15306e : 0.0f, getWidth(), this.f15305d.getHeight());
            if (m12252m(this.f15305d).contains("-hastransparency")) {
                m12257r(this.f15305d);
                this.f15305d.draw(canvas);
                m12254o(this.f15305d);
            } else {
                this.f15305d.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f15309h = true;
        }
        if (this.f15309h) {
            boolean z10 = this.f15305d != null;
            this.f15309h = z10;
            if (z10) {
                this.f15309h = motionEvent.getY() <= ((float) this.f15305d.getHeight()) + this.f15306e && motionEvent.getX() >= ((float) m12250k(this.f15305d)) && motionEvent.getX() <= ((float) m12251l(this.f15305d));
            }
        } else if (this.f15305d == null) {
            this.f15309h = false;
        }
        if (this.f15309h) {
            motionEvent.offsetLocation(0.0f, ((getScrollY() + this.f15306e) - m12253n(this.f15305d)) * (-1.0f));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: g */
    public final boolean m12246g(View view) {
        if (!m12252m(view).contains("sticky")) {
            return false;
        }
        this.f15304c.add(view);
        return true;
    }

    /* renamed from: h */
    public final void m12247h() {
        float fMin;
        ArrayList arrayList = this.f15304c;
        int size = arrayList.size();
        View view = null;
        View view2 = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view3 = (View) obj;
            int iM12253n = (m12253n(view3) - getScrollY()) + (this.f15310i ? 0 : getPaddingTop());
            if (iM12253n <= 0) {
                if (view != null) {
                    if (iM12253n > (m12253n(view) - getScrollY()) + (this.f15310i ? 0 : getPaddingTop())) {
                    }
                }
                view = view3;
            } else {
                if (view2 != null) {
                    if (iM12253n < (m12253n(view2) - getScrollY()) + (this.f15310i ? 0 : getPaddingTop())) {
                    }
                }
                view2 = view3;
            }
        }
        if (view == null) {
            if (this.f15305d != null) {
                List list = this.f15315n;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        AbstractC9764r.m19682a(it.next());
                        throw null;
                    }
                }
                m12259t();
                return;
            }
            return;
        }
        if (view2 == null) {
            fMin = 0.0f;
        } else {
            fMin = Math.min(0, ((m12253n(view2) - getScrollY()) + (this.f15310i ? 0 : getPaddingTop())) - view.getHeight());
        }
        this.f15306e = fMin;
        View view4 = this.f15305d;
        if (view != view4) {
            if (view4 != null) {
                List list2 = this.f15315n;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    if (it2.hasNext()) {
                        AbstractC9764r.m19682a(it2.next());
                        throw null;
                    }
                }
                m12259t();
            }
            this.f15308g = m12250k(view);
            m12258s(view);
            List list3 = this.f15315n;
            if (list3 != null) {
                Iterator it3 = list3.iterator();
                if (it3.hasNext()) {
                    AbstractC9764r.m19682a(it3.next());
                    throw null;
                }
            }
        }
    }

    /* renamed from: i */
    public final void m12248i(View view) {
        if (m12246g(view) || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            m12248i(viewGroup.getChildAt(i10));
        }
    }

    /* renamed from: j */
    public final int m12249j(View view) {
        int bottom = view.getBottom();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            bottom += view.getBottom();
        }
        return bottom;
    }

    /* renamed from: k */
    public final int m12250k(View view) {
        int left = view.getLeft();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            left += view.getLeft();
        }
        return left;
    }

    /* renamed from: l */
    public final int m12251l(View view) {
        int right = view.getRight();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            right += view.getRight();
        }
        return right;
    }

    /* renamed from: m */
    public final String m12252m(View view) {
        return String.valueOf(view.getTag());
    }

    /* renamed from: n */
    public final int m12253n(View view) {
        int top2 = view.getTop();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            top2 += view.getTop();
        }
        return top2;
    }

    /* renamed from: o */
    public final void m12254o(View view) {
        view.setAlpha(0.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f15307f);
        super.onDetachedFromWindow();
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f15311j) {
            this.f15310i = true;
        }
        m12255p();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        m12247h();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f15309h) {
            motionEvent.offsetLocation(0.0f, (getScrollY() + this.f15306e) - m12253n(this.f15305d));
        }
        if (motionEvent.getAction() == 0) {
            this.f15314m = false;
        }
        if (this.f15314m) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(0);
            super.onTouchEvent(motionEventObtain);
            this.f15314m = false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f15314m = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void m12255p() {
        if (this.f15305d != null) {
            m12259t();
        }
        this.f15304c.clear();
        m12248i(getChildAt(0));
        m12247h();
        invalidate();
    }

    /* renamed from: q */
    public void m12256q() {
        this.f15304c = new ArrayList();
    }

    /* renamed from: r */
    public final void m12257r(View view) {
        view.setAlpha(1.0f);
    }

    /* renamed from: s */
    public final void m12258s(View view) {
        this.f15305d = view;
        if (view != null) {
            if (m12252m(view).contains("-hastransparency")) {
                m12254o(this.f15305d);
            }
            if (m12252m(this.f15305d).contains("-nonconstant")) {
                post(this.f15307f);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        super.setClipToPadding(z10);
        this.f15310i = z10;
        this.f15311j = true;
    }

    public void setShadowDrawable(Drawable drawable) {
        this.f15313l = drawable;
    }

    public void setShadowHeight(int i10) {
        this.f15312k = i10;
    }

    /* renamed from: t */
    public final void m12259t() {
        if (m12252m(this.f15305d).contains("-hastransparency")) {
            m12257r(this.f15305d);
        }
        this.f15305d = null;
        removeCallbacks(this.f15307f);
    }

    public StickyNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.scrollViewStyle);
    }

    public StickyNestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15307f = new RunnableC8045a();
        this.f15312k = 10;
        this.f15314m = true;
        m12256q();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        super.addView(view, i10);
        m12248i(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        m12248i(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        super.addView(view, i10, i11);
        m12248i(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        m12248i(view);
    }
}
