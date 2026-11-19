package com.yanzhenjie.recyclerview.widget;

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
    public ArrayList f8544a;

    /* renamed from: b */
    public View f8545b;

    /* renamed from: c */
    public float f8546c;

    /* renamed from: d */
    public final Runnable f8547d;

    /* renamed from: e */
    public int f8548e;

    /* renamed from: f */
    public boolean f8549f;

    /* renamed from: g */
    public boolean f8550g;

    /* renamed from: h */
    public boolean f8551h;

    /* renamed from: i */
    public int f8552i;

    /* renamed from: j */
    public Drawable f8553j;

    /* renamed from: k */
    public boolean f8554k;

    /* renamed from: l */
    public List f8555l;

    /* renamed from: b */
    private boolean m7333b(View view) {
        if (!m7338g(view).contains("sticky")) {
            return false;
        }
        this.f8544a.add(view);
        return true;
    }

    /* renamed from: c */
    private void m7334c() {
        float fMin;
        Iterator it = this.f8544a.iterator();
        View view = null;
        View view2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View view3 = (View) it.next();
            int iM7339h = (m7339h(view3) - getScrollY()) + (this.f8550g ? 0 : getPaddingTop());
            if (iM7339h <= 0) {
                if (view != null) {
                    if (iM7339h > (m7339h(view) - getScrollY()) + (this.f8550g ? 0 : getPaddingTop())) {
                    }
                }
                view = view3;
            } else {
                if (view2 != null) {
                    if (iM7339h < (m7339h(view2) - getScrollY()) + (this.f8550g ? 0 : getPaddingTop())) {
                    }
                }
                view2 = view3;
            }
        }
        if (view == null) {
            if (this.f8545b != null) {
                List list = this.f8555l;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    if (it2.hasNext()) {
                        AbstractC5379p.m2596a(it2.next());
                        throw null;
                    }
                }
                m7344m();
                return;
            }
            return;
        }
        if (view2 == null) {
            fMin = 0.0f;
        } else {
            fMin = Math.min(0, ((m7339h(view2) - getScrollY()) + (this.f8550g ? 0 : getPaddingTop())) - view.getHeight());
        }
        this.f8546c = fMin;
        View view4 = this.f8545b;
        if (view != view4) {
            if (view4 != null) {
                List list2 = this.f8555l;
                if (list2 != null) {
                    Iterator it3 = list2.iterator();
                    if (it3.hasNext()) {
                        AbstractC5379p.m2596a(it3.next());
                        throw null;
                    }
                }
                m7344m();
            }
            this.f8548e = m7336e(view);
            m7343l(view);
            List list3 = this.f8555l;
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
    private void m7335d(View view) {
        if (m7333b(view) || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            m7335d(viewGroup.getChildAt(i10));
        }
    }

    /* renamed from: e */
    private int m7336e(View view) {
        int left = view.getLeft();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            left += view.getLeft();
        }
        return left;
    }

    /* renamed from: f */
    private int m7337f(View view) {
        int right = view.getRight();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            right += view.getRight();
        }
        return right;
    }

    /* renamed from: g */
    private String m7338g(View view) {
        return String.valueOf(view.getTag());
    }

    /* renamed from: h */
    private int m7339h(View view) {
        int top2 = view.getTop();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            top2 += view.getTop();
        }
        return top2;
    }

    /* renamed from: i */
    private void m7340i(View view) {
        view.setAlpha(0.0f);
    }

    /* renamed from: j */
    private void m7341j() {
        if (this.f8545b != null) {
            m7344m();
        }
        this.f8544a.clear();
        m7335d(getChildAt(0));
        m7334c();
        invalidate();
    }

    /* renamed from: k */
    private void m7342k(View view) {
        view.setAlpha(1.0f);
    }

    /* renamed from: l */
    private void m7343l(View view) {
        this.f8545b = view;
        if (view != null) {
            if (m7338g(view).contains("-hastransparency")) {
                m7340i(this.f8545b);
            }
            if (m7338g(this.f8545b).contains("-nonconstant")) {
                post(this.f8547d);
            }
        }
    }

    /* renamed from: m */
    private void m7344m() {
        if (m7338g(this.f8545b).contains("-hastransparency")) {
            m7342k(this.f8545b);
        }
        this.f8545b = null;
        removeCallbacks(this.f8547d);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        m7335d(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f8545b != null) {
            canvas.save();
            canvas.translate(getPaddingLeft() + this.f8548e, getScrollY() + this.f8546c + (this.f8550g ? getPaddingTop() : 0));
            canvas.clipRect(0.0f, this.f8550g ? -this.f8546c : 0.0f, getWidth() - this.f8548e, this.f8545b.getHeight() + this.f8552i + 1);
            if (this.f8553j != null) {
                this.f8553j.setBounds(0, this.f8545b.getHeight(), this.f8545b.getWidth(), this.f8545b.getHeight() + this.f8552i);
                this.f8553j.draw(canvas);
            }
            canvas.clipRect(0.0f, this.f8550g ? -this.f8546c : 0.0f, getWidth(), this.f8545b.getHeight());
            if (m7338g(this.f8545b).contains("-hastransparency")) {
                m7342k(this.f8545b);
                this.f8545b.draw(canvas);
                m7340i(this.f8545b);
            } else {
                this.f8545b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f8549f = true;
        }
        if (this.f8549f) {
            boolean z10 = this.f8545b != null;
            this.f8549f = z10;
            if (z10) {
                this.f8549f = motionEvent.getY() <= ((float) this.f8545b.getHeight()) + this.f8546c && motionEvent.getX() >= ((float) m7336e(this.f8545b)) && motionEvent.getX() <= ((float) m7337f(this.f8545b));
            }
        } else if (this.f8545b == null) {
            this.f8549f = false;
        }
        if (this.f8549f) {
            motionEvent.offsetLocation(0.0f, ((getScrollY() + this.f8546c) - m7339h(this.f8545b)) * (-1.0f));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f8547d);
        super.onDetachedFromWindow();
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f8551h) {
            this.f8550g = true;
        }
        m7341j();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        m7334c();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f8549f) {
            motionEvent.offsetLocation(0.0f, (getScrollY() + this.f8546c) - m7339h(this.f8545b));
        }
        if (motionEvent.getAction() == 0) {
            this.f8554k = false;
        }
        if (this.f8554k) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(0);
            super.onTouchEvent(motionEventObtain);
            this.f8554k = false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f8554k = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        super.setClipToPadding(z10);
        this.f8550g = z10;
        this.f8551h = true;
    }

    public void setShadowDrawable(Drawable drawable) {
        this.f8553j = drawable;
    }

    public void setShadowHeight(int i10) {
        this.f8552i = i10;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        super.addView(view, i10);
        m7335d(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        m7335d(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        super.addView(view, i10, i11);
        m7335d(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        m7335d(view);
    }
}
