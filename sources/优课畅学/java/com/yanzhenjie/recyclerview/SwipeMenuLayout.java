package com.yanzhenjie.recyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.yanzhenjie.recyclerview.AbstractC7029a;
import com.yanzhenjie.recyclerview.p061x.R$styleable;
import p306y2.InterfaceC10603b;

/* loaded from: classes4.dex */
public class SwipeMenuLayout extends FrameLayout implements InterfaceC10603b {

    /* renamed from: a */
    public int f8477a;

    /* renamed from: b */
    public int f8478b;

    /* renamed from: c */
    public int f8479c;

    /* renamed from: d */
    public float f8480d;

    /* renamed from: e */
    public int f8481e;

    /* renamed from: f */
    public int f8482f;

    /* renamed from: g */
    public int f8483g;

    /* renamed from: h */
    public int f8484h;

    /* renamed from: i */
    public int f8485i;

    /* renamed from: j */
    public int f8486j;

    /* renamed from: k */
    public View f8487k;

    /* renamed from: l */
    public C7030b f8488l;

    /* renamed from: m */
    public C7031c f8489m;

    /* renamed from: n */
    public AbstractC7029a f8490n;

    /* renamed from: o */
    public boolean f8491o;

    /* renamed from: p */
    public boolean f8492p;

    /* renamed from: q */
    public boolean f8493q;

    /* renamed from: r */
    public OverScroller f8494r;

    /* renamed from: s */
    public VelocityTracker f8495s;

    /* renamed from: t */
    public int f8496t;

    /* renamed from: u */
    public int f8497u;

    public SwipeMenuLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // p306y2.InterfaceC10603b
    /* renamed from: a */
    public void mo7275a() {
        m7290p(this.f8481e);
    }

    /* renamed from: b */
    public float m7276b(float f10) {
        return (float) Math.sin((float) ((f10 - 0.5f) * 0.4712389167638204d));
    }

    /* renamed from: c */
    public final int m7277c(MotionEvent motionEvent, int i10) {
        int x10 = (int) (motionEvent.getX() - getScrollX());
        int iM7311g = this.f8490n.m7311g();
        int i11 = iM7311g / 2;
        float f10 = iM7311g;
        float f11 = i11;
        return Math.min(i10 > 0 ? Math.round(Math.abs((f11 + (m7276b(Math.min(1.0f, (Math.abs(x10) * 1.0f) / f10)) * f11)) / i10) * 1000.0f) * 4 : (int) (((Math.abs(x10) / f10) + 1.0f) * 100.0f), this.f8481e);
    }

    @Override // android.view.View
    public void computeScroll() {
        AbstractC7029a abstractC7029a;
        if (!this.f8494r.computeScrollOffset() || (abstractC7029a = this.f8490n) == null) {
            return;
        }
        if (abstractC7029a instanceof C7031c) {
            scrollTo(Math.abs(this.f8494r.getCurrX()), 0);
            invalidate();
        } else {
            scrollTo(-Math.abs(this.f8494r.getCurrX()), 0);
            invalidate();
        }
    }

    /* renamed from: d */
    public boolean m7278d() {
        C7030b c7030b = this.f8488l;
        return c7030b != null && c7030b.m7307c();
    }

    /* renamed from: e */
    public boolean m7279e() {
        C7031c c7031c = this.f8489m;
        return c7031c != null && c7031c.m7307c();
    }

    /* renamed from: f */
    public boolean m7280f() {
        C7030b c7030b = this.f8488l;
        return (c7030b == null || c7030b.m7313i(getScrollX())) ? false : true;
    }

    /* renamed from: g */
    public boolean m7281g() {
        C7030b c7030b = this.f8488l;
        return c7030b != null && c7030b.m7314j(getScrollX());
    }

    public float getOpenPercent() {
        return this.f8480d;
    }

    /* renamed from: h */
    public boolean m7282h() {
        C7030b c7030b = this.f8488l;
        return c7030b != null && c7030b.m7315k(getScrollX());
    }

    /* renamed from: i */
    public boolean m7283i() {
        return m7281g() || m7286l();
    }

    /* renamed from: j */
    public boolean m7284j() {
        return m7282h() || m7287m();
    }

    /* renamed from: k */
    public boolean m7285k() {
        C7031c c7031c = this.f8489m;
        return (c7031c == null || c7031c.m7313i(getScrollX())) ? false : true;
    }

    /* renamed from: l */
    public boolean m7286l() {
        C7031c c7031c = this.f8489m;
        return c7031c != null && c7031c.m7316j(getScrollX());
    }

    /* renamed from: m */
    public boolean m7287m() {
        C7031c c7031c = this.f8489m;
        return c7031c != null && c7031c.m7317k(getScrollX());
    }

    /* renamed from: n */
    public boolean m7288n() {
        return this.f8493q;
    }

    /* renamed from: o */
    public final void m7289o(int i10, int i11) {
        if (this.f8490n != null) {
            if (Math.abs(getScrollX()) < this.f8490n.m7310f().getWidth() * this.f8480d) {
                mo7275a();
                return;
            }
            if (Math.abs(i10) > this.f8482f || Math.abs(i11) > this.f8482f) {
                if (m7284j()) {
                    mo7275a();
                    return;
                } else {
                    m7291q();
                    return;
                }
            }
            if (m7283i()) {
                mo7275a();
            } else {
                m7291q();
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f8477a;
        if (i10 != 0 && this.f8488l == null) {
            this.f8488l = new C7030b(findViewById(i10));
        }
        int i11 = this.f8479c;
        if (i11 != 0 && this.f8489m == null) {
            this.f8489m = new C7031c(findViewById(i11));
        }
        int i12 = this.f8478b;
        if (i12 != 0 && this.f8487k == null) {
            this.f8487k = findViewById(i12);
            return;
        }
        TextView textView = new TextView(getContext());
        textView.setClickable(true);
        textView.setGravity(17);
        textView.setTextSize(16.0f);
        textView.setText("You may not have set the ContentView.");
        this.f8487k = textView;
        addView(textView);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (m7288n()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                int x10 = (int) motionEvent.getX();
                this.f8483g = x10;
                this.f8485i = x10;
                this.f8486j = (int) motionEvent.getY();
                return false;
            }
            if (action == 1) {
                AbstractC7029a abstractC7029a = this.f8490n;
                boolean z10 = abstractC7029a != null && abstractC7029a.mo7312h(getWidth(), motionEvent.getX());
                if (!m7283i() || !z10) {
                    return false;
                }
                mo7275a();
                return true;
            }
            if (action == 2) {
                int x11 = (int) (motionEvent.getX() - this.f8485i);
                return Math.abs(x11) > this.f8482f && Math.abs(x11) > Math.abs((int) (motionEvent.getY() - ((float) this.f8486j)));
            }
            if (action == 3) {
                if (!this.f8494r.isFinished()) {
                    this.f8494r.abortAnimation();
                }
                return false;
            }
        }
        return zOnInterceptTouchEvent;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f8487k;
        if (view != null) {
            int measuredWidthAndState = view.getMeasuredWidthAndState();
            int measuredHeightAndState = this.f8487k.getMeasuredHeightAndState();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8487k.getLayoutParams();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop() + layoutParams.topMargin;
            this.f8487k.layout(paddingLeft, paddingTop, measuredWidthAndState + paddingLeft, measuredHeightAndState + paddingTop);
        }
        C7030b c7030b = this.f8488l;
        if (c7030b != null) {
            View viewM7310f = c7030b.m7310f();
            int measuredWidthAndState2 = viewM7310f.getMeasuredWidthAndState();
            int measuredHeightAndState2 = viewM7310f.getMeasuredHeightAndState();
            int paddingTop2 = getPaddingTop() + ((FrameLayout.LayoutParams) viewM7310f.getLayoutParams()).topMargin;
            viewM7310f.layout(-measuredWidthAndState2, paddingTop2, 0, measuredHeightAndState2 + paddingTop2);
        }
        C7031c c7031c = this.f8489m;
        if (c7031c != null) {
            View viewM7310f2 = c7031c.m7310f();
            int measuredWidthAndState3 = viewM7310f2.getMeasuredWidthAndState();
            int measuredHeightAndState3 = viewM7310f2.getMeasuredHeightAndState();
            int paddingTop3 = getPaddingTop() + ((FrameLayout.LayoutParams) viewM7310f2.getLayoutParams()).topMargin;
            int measuredWidthAndState4 = getMeasuredWidthAndState();
            viewM7310f2.layout(measuredWidthAndState4, paddingTop3, measuredWidthAndState3 + measuredWidthAndState4, measuredHeightAndState3 + paddingTop3);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m7288n()) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f8495s == null) {
            this.f8495s = VelocityTracker.obtain();
        }
        this.f8495s.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f8483g = (int) motionEvent.getX();
            this.f8484h = (int) motionEvent.getY();
        } else if (action == 1) {
            int x10 = (int) (this.f8485i - motionEvent.getX());
            int y10 = (int) (this.f8486j - motionEvent.getY());
            this.f8492p = false;
            this.f8495s.computeCurrentVelocity(1000, this.f8497u);
            int xVelocity = (int) this.f8495s.getXVelocity();
            int iAbs = Math.abs(xVelocity);
            if (iAbs <= this.f8496t) {
                m7289o(x10, y10);
            } else if (this.f8490n != null) {
                int iM7277c = m7277c(motionEvent, iAbs);
                if (this.f8490n instanceof C7031c) {
                    if (xVelocity < 0) {
                        m7292r(iM7277c);
                    } else {
                        m7290p(iM7277c);
                    }
                } else if (xVelocity > 0) {
                    m7292r(iM7277c);
                } else {
                    m7290p(iM7277c);
                }
                ViewCompat.postInvalidateOnAnimation(this);
            }
            this.f8495s.clear();
            this.f8495s.recycle();
            this.f8495s = null;
            if (Math.abs(this.f8485i - motionEvent.getX()) > this.f8482f || Math.abs(this.f8486j - motionEvent.getY()) > this.f8482f || m7281g() || m7286l()) {
                motionEvent.setAction(3);
                super.onTouchEvent(motionEvent);
                return true;
            }
        } else if (action == 2) {
            int x11 = (int) (this.f8483g - motionEvent.getX());
            int y11 = (int) (this.f8484h - motionEvent.getY());
            if (!this.f8492p && Math.abs(x11) > this.f8482f && Math.abs(x11) > Math.abs(y11)) {
                this.f8492p = true;
            }
            if (this.f8492p) {
                if (this.f8490n == null || this.f8491o) {
                    if (x11 < 0) {
                        C7030b c7030b = this.f8488l;
                        if (c7030b != null) {
                            this.f8490n = c7030b;
                        } else {
                            this.f8490n = this.f8489m;
                        }
                    } else {
                        C7031c c7031c = this.f8489m;
                        if (c7031c != null) {
                            this.f8490n = c7031c;
                        } else {
                            this.f8490n = this.f8488l;
                        }
                    }
                }
                scrollBy(x11, 0);
                this.f8483g = (int) motionEvent.getX();
                this.f8484h = (int) motionEvent.getY();
                this.f8491o = false;
            }
        } else if (action == 3) {
            this.f8492p = false;
            if (this.f8494r.isFinished()) {
                m7289o((int) (this.f8485i - motionEvent.getX()), (int) (this.f8486j - motionEvent.getY()));
            } else {
                this.f8494r.abortAnimation();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public void m7290p(int i10) {
        AbstractC7029a abstractC7029a = this.f8490n;
        if (abstractC7029a != null) {
            abstractC7029a.mo7305a(this.f8494r, getScrollX(), i10);
            invalidate();
        }
    }

    /* renamed from: q */
    public void m7291q() {
        m7292r(this.f8481e);
    }

    /* renamed from: r */
    public final void m7292r(int i10) {
        AbstractC7029a abstractC7029a = this.f8490n;
        if (abstractC7029a != null) {
            abstractC7029a.mo7306b(this.f8494r, getScrollX(), i10);
            invalidate();
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        AbstractC7029a abstractC7029a = this.f8490n;
        if (abstractC7029a == null) {
            super.scrollTo(i10, i11);
            return;
        }
        AbstractC7029a.a aVarMo7308d = abstractC7029a.mo7308d(i10, i11);
        this.f8491o = aVarMo7308d.f8538c;
        if (aVarMo7308d.f8536a != getScrollX()) {
            super.scrollTo(aVarMo7308d.f8536a, aVarMo7308d.f8537b);
        }
    }

    public void setOpenPercent(float f10) {
        this.f8480d = f10;
    }

    public void setScrollerDuration(int i10) {
        this.f8481e = i10;
    }

    public void setSwipeEnable(boolean z10) {
        this.f8493q = z10;
    }

    public SwipeMenuLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8477a = 0;
        this.f8478b = 0;
        this.f8479c = 0;
        this.f8480d = 0.5f;
        this.f8481e = 200;
        this.f8493q = true;
        setClickable(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SwipeMenuLayout);
        this.f8477a = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SwipeMenuLayout_leftViewId, this.f8477a);
        this.f8478b = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SwipeMenuLayout_contentViewId, this.f8478b);
        this.f8479c = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SwipeMenuLayout_rightViewId, this.f8479c);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f8482f = viewConfiguration.getScaledTouchSlop();
        this.f8496t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8497u = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f8494r = new OverScroller(getContext());
    }
}
