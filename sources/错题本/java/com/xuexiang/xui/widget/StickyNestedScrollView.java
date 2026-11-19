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
import p016b0.RunnableC3059a;

/* loaded from: classes3.dex */
public class StickyNestedScrollView extends NestedScrollView {

    /* renamed from: a */
    public final ArrayList f3965a;

    /* renamed from: b */
    public View f3966b;

    /* renamed from: c */
    public float f3967c;

    /* renamed from: d */
    public final RunnableC3059a f3968d;

    /* renamed from: e */
    public int f3969e;

    /* renamed from: f */
    public boolean f3970f;

    /* renamed from: g */
    public boolean f3971g;

    /* renamed from: h */
    public boolean f3972h;

    /* renamed from: i */
    public int f3973i;

    /* renamed from: j */
    public Drawable f3974j;

    /* renamed from: k */
    public boolean f3975k;

    public StickyNestedScrollView(Context context) {
        this(context, null);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        m3435c(view);
    }

    /* renamed from: b */
    public final void m3434b() {
        float fMin;
        ArrayList arrayList = this.f3965a;
        int size = arrayList.size();
        View view = null;
        View view2 = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            View view3 = (View) obj;
            int iM3438f = (m3438f(view3) - getScrollY()) + (this.f3971g ? 0 : getPaddingTop());
            if (iM3438f <= 0) {
                if (view != null) {
                    if (iM3438f > (m3438f(view) - getScrollY()) + (this.f3971g ? 0 : getPaddingTop())) {
                    }
                }
                view = view3;
            } else {
                if (view2 != null) {
                    if (iM3438f < (m3438f(view2) - getScrollY()) + (this.f3971g ? 0 : getPaddingTop())) {
                    }
                }
                view2 = view3;
            }
        }
        if (view == null) {
            if (this.f3966b != null) {
                m3439g();
                return;
            }
            return;
        }
        if (view2 == null) {
            fMin = 0.0f;
        } else {
            fMin = Math.min(0, ((m3438f(view2) - getScrollY()) + (this.f3971g ? 0 : getPaddingTop())) - view.getHeight());
        }
        this.f3967c = fMin;
        View view4 = this.f3966b;
        if (view != view4) {
            if (view4 != null) {
                m3439g();
            }
            this.f3969e = m3436d(view);
            this.f3966b = view;
            if (String.valueOf(view.getTag()).contains("-hastransparency")) {
                this.f3966b.setAlpha(0.0f);
            }
            if (String.valueOf(this.f3966b.getTag()).contains("-nonconstant")) {
                post(this.f3968d);
            }
        }
    }

    /* renamed from: c */
    public final void m3435c(View view) {
        if (String.valueOf(view.getTag()).contains("sticky")) {
            this.f3965a.add(view);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3435c(viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: d */
    public final int m3436d(View view) {
        int left = view.getLeft();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            left += view.getLeft();
        }
        return left;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f3966b != null) {
            canvas.save();
            canvas.translate(getPaddingLeft() + this.f3969e, getScrollY() + this.f3967c + (this.f3971g ? getPaddingTop() : 0));
            canvas.clipRect(0.0f, this.f3971g ? -this.f3967c : 0.0f, getWidth() - this.f3969e, this.f3966b.getHeight() + this.f3973i + 1);
            if (this.f3974j != null) {
                this.f3974j.setBounds(0, this.f3966b.getHeight(), this.f3966b.getWidth(), this.f3966b.getHeight() + this.f3973i);
                this.f3974j.draw(canvas);
            }
            canvas.clipRect(0.0f, this.f3971g ? -this.f3967c : 0.0f, getWidth(), this.f3966b.getHeight());
            if (String.valueOf(this.f3966b.getTag()).contains("-hastransparency")) {
                this.f3966b.setAlpha(1.0f);
                this.f3966b.draw(canvas);
                this.f3966b.setAlpha(0.0f);
            } else {
                this.f3966b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3970f = true;
        }
        if (this.f3970f) {
            boolean z8 = this.f3966b != null;
            this.f3970f = z8;
            if (z8) {
                this.f3970f = motionEvent.getY() <= ((float) this.f3966b.getHeight()) + this.f3967c && motionEvent.getX() >= ((float) m3436d(this.f3966b)) && motionEvent.getX() <= ((float) m3437e(this.f3966b));
            }
        } else if (this.f3966b == null) {
            this.f3970f = false;
        }
        if (this.f3970f) {
            motionEvent.offsetLocation(0.0f, ((getScrollY() + this.f3967c) - m3438f(this.f3966b)) * (-1.0f));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final int m3437e(View view) {
        int right = view.getRight();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            right += view.getRight();
        }
        return right;
    }

    /* renamed from: f */
    public final int m3438f(View view) {
        int top2 = view.getTop();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            top2 += view.getTop();
        }
        return top2;
    }

    /* renamed from: g */
    public final void m3439g() {
        if (String.valueOf(this.f3966b.getTag()).contains("-hastransparency")) {
            this.f3966b.setAlpha(1.0f);
        }
        this.f3966b = null;
        removeCallbacks(this.f3968d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f3968d);
        super.onDetachedFromWindow();
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        super.onLayout(z8, i, i8, i9, i10);
        if (!this.f3972h) {
            this.f3971g = true;
        }
        if (this.f3966b != null) {
            m3439g();
        }
        this.f3965a.clear();
        m3435c(getChildAt(0));
        m3434b();
        invalidate();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i, int i8, int i9, int i10) {
        super.onScrollChanged(i, i8, i9, i10);
        m3434b();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3970f) {
            motionEvent.offsetLocation(0.0f, (getScrollY() + this.f3967c) - m3438f(this.f3966b));
        }
        if (motionEvent.getAction() == 0) {
            this.f3975k = false;
        }
        if (this.f3975k) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(0);
            super.onTouchEvent(motionEventObtain);
            this.f3975k = false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f3975k = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z8) {
        super.setClipToPadding(z8);
        this.f3971g = z8;
        this.f3972h = true;
    }

    public void setShadowDrawable(Drawable drawable) {
        this.f3974j = drawable;
    }

    public void setShadowHeight(int i) {
        this.f3973i = i;
    }

    public StickyNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.scrollViewStyle);
    }

    public StickyNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3968d = new RunnableC3059a(this, 19);
        this.f3973i = 10;
        this.f3975k = true;
        this.f3965a = new ArrayList();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        super.addView(view, i);
        m3435c(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        m3435c(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i8) {
        super.addView(view, i, i8);
        m3435c(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        m3435c(view);
    }
}
