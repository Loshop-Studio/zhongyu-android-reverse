package androidx.slidingpanelayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.C0332a;
import androidx.core.view.C0335a;
import androidx.core.view.C0358u;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.C0384c;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import p016c0.C1050c;

/* loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: a */
    private int f4135a;

    /* renamed from: b */
    private int f4136b;

    /* renamed from: c */
    private Drawable f4137c;

    /* renamed from: d */
    private Drawable f4138d;

    /* renamed from: e */
    private final int f4139e;

    /* renamed from: f */
    private boolean f4140f;

    /* renamed from: g */
    View f4141g;

    /* renamed from: h */
    float f4142h;

    /* renamed from: i */
    private float f4143i;

    /* renamed from: j */
    int f4144j;

    /* renamed from: k */
    boolean f4145k;

    /* renamed from: l */
    private int f4146l;

    /* renamed from: m */
    private float f4147m;

    /* renamed from: n */
    private float f4148n;

    /* renamed from: o */
    private InterfaceC0657d f4149o;

    /* renamed from: p */
    final C0384c f4150p;

    /* renamed from: q */
    boolean f4151q;

    /* renamed from: r */
    private boolean f4152r;

    /* renamed from: s */
    private final Rect f4153s;

    /* renamed from: t */
    final ArrayList<RunnableC0655b> f4154t;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0653a();

        /* renamed from: a */
        boolean f4160a;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
        static class C0653a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0653a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f4160a ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4160a = parcel.readInt() != 0;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    class C0654a extends C0335a {

        /* renamed from: a */
        private final Rect f4161a = new Rect();

        C0654a() {
        }

        /* renamed from: a */
        private void m3690a(C1050c c1050c, C1050c c1050c2) {
            Rect rect = this.f4161a;
            c1050c2.m4893m(rect);
            c1050c.m4871X(rect);
            c1050c2.m4895n(rect);
            c1050c.m4872Y(rect);
            c1050c.m4857F0(c1050c2.m4866N());
            c1050c.m4903r0(c1050c2.m4909v());
            c1050c.m4879c0(c1050c2.m4899p());
            c1050c.m4885g0(c1050c2.m4902r());
            c1050c.m4888i0(c1050c2.m4856F());
            c1050c.m4881d0(c1050c2.m4854E());
            c1050c.m4891k0(c1050c2.m4858G());
            c1050c.m4892l0(c1050c2.m4860H());
            c1050c.m4870V(c1050c2.m4848B());
            c1050c.m4916z0(c1050c2.m4864L());
            c1050c.m4898o0(c1050c2.m4861I());
            c1050c.m4874a(c1050c2.m4890k());
            c1050c.m4901q0(c1050c2.m4906t());
        }

        /* renamed from: b */
        public boolean m3691b(View view) {
            return SlidingPaneLayout.this.m3678h(view);
        }

        @Override // androidx.core.view.C0335a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // androidx.core.view.C0335a
        public void onInitializeAccessibilityNodeInfo(View view, C1050c c1050c) {
            C1050c c1050cM4835Q = C1050c.m4835Q(c1050c);
            super.onInitializeAccessibilityNodeInfo(view, c1050cM4835Q);
            m3690a(c1050c, c1050cM4835Q);
            c1050cM4835Q.m4868S();
            c1050c.m4879c0(SlidingPaneLayout.class.getName());
            c1050c.m4849B0(view);
            Object objM1992H = C0358u.m1992H(view);
            if (objM1992H instanceof View) {
                c1050c.m4907t0((View) objM1992H);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i4);
                if (!m3691b(childAt) && childAt.getVisibility() == 0) {
                    C0358u.m1979A0(childAt, 1);
                    c1050c.m4878c(childAt);
                }
            }
        }

        @Override // androidx.core.view.C0335a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (m3691b(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    private class RunnableC0655b implements Runnable {

        /* renamed from: a */
        final View f4163a;

        RunnableC0655b(View view) {
            this.f4163a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4163a.getParent() == SlidingPaneLayout.this) {
                this.f4163a.setLayerType(0, null);
                SlidingPaneLayout.this.m3677g(this.f4163a);
            }
            SlidingPaneLayout.this.f4154t.remove(this);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    private class C0656c extends C0384c.c {
        C0656c() {
        }

        @Override // androidx.customview.widget.C0384c.c
        public int clampViewPositionHorizontal(View view, int i4, int i5) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f4141g.getLayoutParams();
            if (SlidingPaneLayout.this.m3679i()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + SlidingPaneLayout.this.f4141g.getWidth());
                return Math.max(Math.min(i4, width), width - SlidingPaneLayout.this.f4144j);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i4, paddingLeft), SlidingPaneLayout.this.f4144j + paddingLeft);
        }

        @Override // androidx.customview.widget.C0384c.c
        public int clampViewPositionVertical(View view, int i4, int i5) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.C0384c.c
        public int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.f4144j;
        }

        @Override // androidx.customview.widget.C0384c.c
        public void onEdgeDragStarted(int i4, int i5) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f4150p.m2275c(slidingPaneLayout.f4141g, i5);
        }

        @Override // androidx.customview.widget.C0384c.c
        public void onViewCaptured(View view, int i4) {
            SlidingPaneLayout.this.m3684p();
        }

        @Override // androidx.customview.widget.C0384c.c
        public void onViewDragStateChanged(int i4) {
            if (SlidingPaneLayout.this.f4150p.m2261A() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f4142h != IGoodView.DEFAULT_TO_ALPHA) {
                    slidingPaneLayout.m3675e(slidingPaneLayout.f4141g);
                    SlidingPaneLayout.this.f4151q = true;
                } else {
                    slidingPaneLayout.m3686r(slidingPaneLayout.f4141g);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.m3674d(slidingPaneLayout2.f4141g);
                    SlidingPaneLayout.this.f4151q = false;
                }
            }
        }

        @Override // androidx.customview.widget.C0384c.c
        public void onViewPositionChanged(View view, int i4, int i5, int i6, int i7) {
            SlidingPaneLayout.this.m3682l(i4);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.C0384c.c
        public void onViewReleased(View view, float f4, float f5) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.m3679i()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f4 < IGoodView.DEFAULT_TO_ALPHA || (f4 == IGoodView.DEFAULT_TO_ALPHA && SlidingPaneLayout.this.f4142h > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f4144j;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f4141g.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f4 > IGoodView.DEFAULT_TO_ALPHA || (f4 == IGoodView.DEFAULT_TO_ALPHA && SlidingPaneLayout.this.f4142h > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f4144j;
                }
            }
            SlidingPaneLayout.this.f4150p.m2269N(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.C0384c.c
        public boolean tryCaptureView(View view, int i4) {
            if (SlidingPaneLayout.this.f4145k) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f4157b;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    public interface InterfaceC0657d {
        /* renamed from: a */
        void m3692a(View view, float f4);

        /* renamed from: b */
        void m3693b(View view);

        /* renamed from: c */
        void m3694c(View view);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private boolean m3668b(View view, int i4) {
        if (!this.f4152r && !m3685q(IGoodView.DEFAULT_TO_ALPHA, i4)) {
            return false;
        }
        this.f4151q = false;
        return true;
    }

    /* renamed from: c */
    private void m3669c(View view, float f4, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f4 > IGoodView.DEFAULT_TO_ALPHA && i4 != 0) {
            int i5 = (((int) ((((-16777216) & i4) >>> 24) * f4)) << 24) | (i4 & 16777215);
            if (layoutParams.f4159d == null) {
                layoutParams.f4159d = new Paint();
            }
            layoutParams.f4159d.setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.f4159d);
            }
            m3677g(view);
            return;
        }
        if (view.getLayerType() != 0) {
            Paint paint = layoutParams.f4159d;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            RunnableC0655b runnableC0655b = new RunnableC0655b(view);
            this.f4154t.add(runnableC0655b);
            C0358u.m2035i0(this, runnableC0655b);
        }
    }

    /* renamed from: n */
    private boolean m3670n(View view, int i4) {
        if (!this.f4152r && !m3685q(1.0f, i4)) {
            return false;
        }
        this.f4151q = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3671o(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.m3679i()
            android.view.View r1 = r9.f4141g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f4158c
            r3 = 0
            if (r2 == 0) goto L1c
            if (r0 == 0) goto L16
            int r1 = r1.rightMargin
            goto L18
        L16:
            int r1 = r1.leftMargin
        L18:
            if (r1 > 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            int r2 = r9.getChildCount()
        L21:
            if (r3 >= r2) goto L59
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f4141g
            if (r4 != r5) goto L2c
            goto L56
        L2c:
            float r5 = r9.f4143i
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f4146l
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.f4143i = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L44
            int r5 = -r5
        L44:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L56
            float r5 = r9.f4143i
            if (r0 == 0) goto L4f
            float r5 = r5 - r6
            goto L51
        L4f:
            float r5 = r6 - r5
        L51:
            int r6 = r9.f4136b
            r9.m3669c(r4, r5, r6)
        L56:
            int r3 = r3 + 1
            goto L21
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.m3671o(float):void");
    }

    /* renamed from: s */
    private static boolean m3672s(View view) {
        return view.isOpaque();
    }

    /* renamed from: a */
    public boolean m3673a() {
        return m3668b(this.f4141g, 0);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f4150p.m2278n(true)) {
            if (this.f4140f) {
                C0358u.m2033h0(this);
            } else {
                this.f4150p.m2273a();
            }
        }
    }

    /* renamed from: d */
    void m3674d(View view) {
        InterfaceC0657d interfaceC0657d = this.f4149o;
        if (interfaceC0657d != null) {
            interfaceC0657d.m3694c(view);
        }
        sendAccessibilityEvent(32);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i4;
        int right;
        super.draw(canvas);
        Drawable drawable = m3679i() ? this.f4138d : this.f4137c;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (m3679i()) {
            right = childAt.getRight();
            i4 = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i5 = left - intrinsicWidth;
            i4 = left;
            right = i5;
        }
        drawable.setBounds(right, top, i4, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f4140f && !layoutParams.f4157b && this.f4141g != null) {
            canvas.getClipBounds(this.f4153s);
            if (m3679i()) {
                Rect rect = this.f4153s;
                rect.left = Math.max(rect.left, this.f4141g.getRight());
            } else {
                Rect rect2 = this.f4153s;
                rect2.right = Math.min(rect2.right, this.f4141g.getLeft());
            }
            canvas.clipRect(this.f4153s);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j4);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    /* renamed from: e */
    void m3675e(View view) {
        InterfaceC0657d interfaceC0657d = this.f4149o;
        if (interfaceC0657d != null) {
            interfaceC0657d.m3693b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* renamed from: f */
    void m3676f(View view) {
        InterfaceC0657d interfaceC0657d = this.f4149o;
        if (interfaceC0657d != null) {
            interfaceC0657d.m3692a(view, this.f4142h);
        }
    }

    /* renamed from: g */
    void m3677g(View view) {
        C0358u.m1983C0(view, ((LayoutParams) view.getLayoutParams()).f4159d);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f4136b;
    }

    public int getParallaxDistance() {
        return this.f4146l;
    }

    public int getSliderFadeColor() {
        return this.f4135a;
    }

    /* renamed from: h */
    boolean m3678h(View view) {
        if (view == null) {
            return false;
        }
        return this.f4140f && ((LayoutParams) view.getLayoutParams()).f4158c && this.f4142h > IGoodView.DEFAULT_TO_ALPHA;
    }

    /* renamed from: i */
    boolean m3679i() {
        return C0358u.m1978A(this) == 1;
    }

    /* renamed from: j */
    public boolean m3680j() {
        return !this.f4140f || this.f4142h == 1.0f;
    }

    /* renamed from: k */
    public boolean m3681k() {
        return this.f4140f;
    }

    /* renamed from: l */
    void m3682l(int i4) {
        if (this.f4141g == null) {
            this.f4142h = IGoodView.DEFAULT_TO_ALPHA;
            return;
        }
        boolean zM3679i = m3679i();
        LayoutParams layoutParams = (LayoutParams) this.f4141g.getLayoutParams();
        int width = this.f4141g.getWidth();
        if (zM3679i) {
            i4 = (getWidth() - i4) - width;
        }
        float paddingRight = (i4 - ((zM3679i ? getPaddingRight() : getPaddingLeft()) + (zM3679i ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / this.f4144j;
        this.f4142h = paddingRight;
        if (this.f4146l != 0) {
            m3671o(paddingRight);
        }
        if (layoutParams.f4158c) {
            m3669c(this.f4141g, this.f4142h, this.f4135a);
        }
        m3676f(this.f4141g);
    }

    /* renamed from: m */
    public boolean m3683m() {
        return m3670n(this.f4141g, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4152r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4152r = true;
        int size = this.f4154t.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f4154t.get(i4).run();
        }
        this.f4154t.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f4140f && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f4151q = !this.f4150p.m2264E(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f4140f || (this.f4145k && actionMasked != 0)) {
            this.f4150p.m2274b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.f4150p.m2274b();
            return false;
        }
        if (actionMasked == 0) {
            this.f4145k = false;
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            this.f4147m = x3;
            this.f4148n = y3;
            if (this.f4150p.m2264E(this.f4141g, (int) x3, (int) y3) && m3678h(this.f4141g)) {
                z3 = true;
            }
            return this.f4150p.m2270O(motionEvent) || z3;
        }
        if (actionMasked == 2) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            float fAbs = Math.abs(x4 - this.f4147m);
            float fAbs2 = Math.abs(y4 - this.f4148n);
            if (fAbs > this.f4150p.m2282z() && fAbs2 > fAbs) {
                this.f4150p.m2274b();
                this.f4145k = true;
                return false;
            }
        }
        z3 = false;
        if (this.f4150p.m2270O(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        boolean zM3679i = m3679i();
        if (zM3679i) {
            this.f4150p.m2267L(2);
        } else {
            this.f4150p.m2267L(1);
        }
        int i12 = i6 - i4;
        int paddingRight = zM3679i ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM3679i ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f4152r) {
            this.f4142h = (this.f4140f && this.f4151q) ? 1.0f : IGoodView.DEFAULT_TO_ALPHA;
        }
        int i13 = paddingRight;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f4157b) {
                    int i15 = i12 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i15 - this.f4139e) - i13) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f4144j = iMin;
                    int i16 = zM3679i ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.f4158c = ((i13 + i16) + iMin) + (measuredWidth / 2) > i15;
                    int i17 = (int) (iMin * this.f4142h);
                    i13 += i16 + i17;
                    this.f4142h = i17 / iMin;
                    i8 = 0;
                } else if (!this.f4140f || (i9 = this.f4146l) == 0) {
                    i13 = paddingRight;
                    i8 = 0;
                } else {
                    i8 = (int) ((1.0f - this.f4142h) * i9);
                    i13 = paddingRight;
                }
                if (zM3679i) {
                    i11 = (i12 - i13) + i8;
                    i10 = i11 - measuredWidth;
                } else {
                    i10 = i13 - i8;
                    i11 = i10 + measuredWidth;
                }
                childAt.layout(i10, paddingTop, i11, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
            }
        }
        if (this.f4152r) {
            if (this.f4140f) {
                if (this.f4146l != 0) {
                    m3671o(this.f4142h);
                }
                if (((LayoutParams) this.f4141g.getLayoutParams()).f4158c) {
                    m3669c(this.f4141g, this.f4142h, this.f4135a);
                }
            } else {
                for (int i18 = 0; i18 < childCount; i18++) {
                    m3669c(getChildAt(i18), IGoodView.DEFAULT_TO_ALPHA, this.f4135a);
                }
            }
            m3686r(this.f4141g);
        }
        this.f4152r = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1 A[PHI: r13
      0x00b1: PHI (r13v2 float) = (r13v1 float), (r13v7 float) binds: [B:35:0x00a8, B:37:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f4160a) {
            m3683m();
        } else {
            m3673a();
        }
        this.f4151q = savedState.f4160a;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4160a = m3681k() ? m3680j() : this.f4151q;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 != i6) {
            this.f4152r = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4140f) {
            return super.onTouchEvent(motionEvent);
        }
        this.f4150p.m2265F(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            this.f4147m = x3;
            this.f4148n = y3;
        } else if (actionMasked == 1 && m3678h(this.f4141g)) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            float f4 = x4 - this.f4147m;
            float f5 = y4 - this.f4148n;
            int iM2282z = this.f4150p.m2282z();
            if ((f4 * f4) + (f5 * f5) < iM2282z * iM2282z && this.f4150p.m2264E(this.f4141g, (int) x4, (int) y4)) {
                m3668b(this.f4141g, 0);
            }
        }
        return true;
    }

    /* renamed from: p */
    void m3684p() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: q */
    boolean m3685q(float f4, int i4) {
        int paddingLeft;
        if (!this.f4140f) {
            return false;
        }
        boolean zM3679i = m3679i();
        LayoutParams layoutParams = (LayoutParams) this.f4141g.getLayoutParams();
        if (zM3679i) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + (f4 * this.f4144j)) + this.f4141g.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + (f4 * this.f4144j));
        }
        C0384c c0384c = this.f4150p;
        View view = this.f4141g;
        if (!c0384c.m2271P(view, paddingLeft, view.getTop())) {
            return false;
        }
        m3684p();
        C0358u.m2033h0(this);
        return true;
    }

    /* renamed from: r */
    void m3686r(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        boolean z3;
        View view2 = view;
        boolean zM3679i = m3679i();
        int width = zM3679i ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM3679i ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m3672s(view)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i4 = 0;
        while (i4 < childCount && (childAt = getChildAt(i4)) != view2) {
            if (childAt.getVisibility() == 8) {
                z3 = zM3679i;
            } else {
                z3 = zM3679i;
                childAt.setVisibility((Math.max(zM3679i ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zM3679i ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i4++;
            view2 = view;
            zM3679i = z3;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f4140f) {
            return;
        }
        this.f4151q = view == this.f4141g;
    }

    public void setCoveredFadeColor(int i4) {
        this.f4136b = i4;
    }

    public void setPanelSlideListener(InterfaceC0657d interfaceC0657d) {
        this.f4149o = interfaceC0657d;
    }

    public void setParallaxDistance(int i4) {
        this.f4146l = i4;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f4137c = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f4138d = drawable;
    }

    @Deprecated
    public void setShadowResource(int i4) {
        setShadowDrawable(getResources().getDrawable(i4));
    }

    public void setShadowResourceLeft(int i4) {
        setShadowDrawableLeft(C0332a.m1806d(getContext(), i4));
    }

    public void setShadowResourceRight(int i4) {
        setShadowDrawableRight(C0332a.m1806d(getContext(), i4));
    }

    public void setSliderFadeColor(int i4) {
        this.f4135a = i4;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        private static final int[] f4155e = {R.attr.layout_weight};

        /* renamed from: a */
        public float f4156a;

        /* renamed from: b */
        boolean f4157b;

        /* renamed from: c */
        boolean f4158c;

        /* renamed from: d */
        Paint f4159d;

        public LayoutParams() {
            super(-1, -1);
            this.f4156a = IGoodView.DEFAULT_TO_ALPHA;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4156a = IGoodView.DEFAULT_TO_ALPHA;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4156a = IGoodView.DEFAULT_TO_ALPHA;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4156a = IGoodView.DEFAULT_TO_ALPHA;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4155e);
            this.f4156a = typedArrayObtainStyledAttributes.getFloat(0, IGoodView.DEFAULT_TO_ALPHA);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f4135a = -858993460;
        this.f4152r = true;
        this.f4153s = new Rect();
        this.f4154t = new ArrayList<>();
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f4139e = (int) ((32.0f * f4) + 0.5f);
        setWillNotDraw(false);
        C0358u.m2051q0(this, new C0654a());
        C0358u.m1979A0(this, 1);
        C0384c c0384cM2253o = C0384c.m2253o(this, 0.5f, new C0656c());
        this.f4150p = c0384cM2253o;
        c0384cM2253o.m2268M(f4 * 400.0f);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
