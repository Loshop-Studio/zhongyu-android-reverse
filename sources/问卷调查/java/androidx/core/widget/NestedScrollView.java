package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.WeakHashMap;
import p000a.p005b.p006c.C0016b;
import p000a.p031h.p043j.C0243a;
import p000a.p031h.p043j.C0258g;
import p000a.p031h.p043j.C0261j;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.InterfaceC0257f;
import p000a.p031h.p043j.InterfaceC0260i;
import p000a.p031h.p043j.p044a0.C0245b;
import p070b.p071a.p072a.p073a.C0561a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0260i, InterfaceC0257f {

    /* renamed from: B */
    public static final C0513a f3156B = new C0513a();

    /* renamed from: C */
    public static final int[] f3157C = {R.attr.fillViewport};

    /* renamed from: A */
    public InterfaceC0514b f3158A;

    /* renamed from: b */
    public long f3159b;

    /* renamed from: c */
    public final Rect f3160c;

    /* renamed from: d */
    public OverScroller f3161d;

    /* renamed from: e */
    public EdgeEffect f3162e;

    /* renamed from: f */
    public EdgeEffect f3163f;

    /* renamed from: g */
    public int f3164g;

    /* renamed from: h */
    public boolean f3165h;

    /* renamed from: i */
    public boolean f3166i;

    /* renamed from: j */
    public View f3167j;

    /* renamed from: k */
    public boolean f3168k;

    /* renamed from: l */
    public VelocityTracker f3169l;

    /* renamed from: m */
    public boolean f3170m;

    /* renamed from: n */
    public boolean f3171n;

    /* renamed from: o */
    public int f3172o;

    /* renamed from: p */
    public int f3173p;

    /* renamed from: q */
    public int f3174q;

    /* renamed from: r */
    public int f3175r;

    /* renamed from: s */
    public final int[] f3176s;

    /* renamed from: t */
    public final int[] f3177t;

    /* renamed from: u */
    public int f3178u;

    /* renamed from: v */
    public int f3179v;

    /* renamed from: w */
    public C0515c f3180w;

    /* renamed from: x */
    public final C0261j f3181x;

    /* renamed from: y */
    public final C0258g f3182y;

    /* renamed from: z */
    public float f3183z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0513a extends C0243a {
        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: c */
        public void mo809c(View view, AccessibilityEvent accessibilityEvent) {
            this.f1556a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: d */
        public void mo810d(View view, C0245b c0245b) {
            int scrollRange;
            this.f1556a.onInitializeAccessibilityNodeInfo(view, c0245b.f1563a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0245b.f1563a.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c0245b.f1563a.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                c0245b.m818a(C0245b.a.f1568g);
                c0245b.m818a(C0245b.a.f1572k);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c0245b.m818a(C0245b.a.f1567f);
                c0245b.m818a(C0245b.a.f1573l);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0075 A[RETURN] */
        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo813g(android.view.View r4, int r5, android.os.Bundle r6) {
            /*
                r3 = this;
                boolean r6 = super.mo813g(r4, r5, r6)
                r0 = 1
                if (r6 == 0) goto L8
                return r0
            L8:
                androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
                boolean r6 = r4.isEnabled()
                r1 = 0
                if (r6 != 0) goto L12
                return r1
            L12:
                r6 = 4096(0x1000, float:5.74E-42)
                r2 = 250(0xfa, float:3.5E-43)
                if (r5 == r6) goto L53
                r6 = 8192(0x2000, float:1.148E-41)
                if (r5 == r6) goto L27
                r6 = 16908344(0x1020038, float:2.3877386E-38)
                if (r5 == r6) goto L27
                r6 = 16908346(0x102003a, float:2.3877392E-38)
                if (r5 == r6) goto L53
                return r1
            L27:
                int r5 = r4.getHeight()
                int r6 = r4.getPaddingBottom()
                int r5 = r5 - r6
                int r6 = r4.getPaddingTop()
                int r5 = r5 - r6
                int r6 = r4.getScrollY()
                int r6 = r6 - r5
                int r5 = java.lang.Math.max(r6, r1)
                int r6 = r4.getScrollY()
                if (r5 == r6) goto L52
            L44:
                int r6 = r4.getScrollX()
                int r1 = r1 - r6
                int r6 = r4.getScrollY()
                int r5 = r5 - r6
                r4.m1701B(r1, r5, r2, r0)
                return r0
            L52:
                return r1
            L53:
                int r5 = r4.getHeight()
                int r6 = r4.getPaddingBottom()
                int r5 = r5 - r6
                int r6 = r4.getPaddingTop()
                int r5 = r5 - r6
                int r6 = r4.getScrollY()
                int r6 = r6 + r5
                int r5 = r4.getScrollRange()
                int r5 = java.lang.Math.min(r6, r5)
                int r6 = r4.getScrollY()
                if (r5 == r6) goto L75
                goto L44
            L75:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.C0513a.mo813g(android.view.View, int, android.os.Bundle):boolean");
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface InterfaceC0514b {
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public static class C0515c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0515c> CREATOR = new a();

        /* renamed from: b */
        public int f3184b;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        public class a implements Parcelable.Creator<C0515c> {
            @Override // android.os.Parcelable.Creator
            public C0515c createFromParcel(Parcel parcel) {
                return new C0515c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0515c[] newArray(int i) {
                return new C0515c[i];
            }
        }

        public C0515c(Parcel parcel) {
            super(parcel);
            this.f3184b = parcel.readInt();
        }

        public C0515c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbM2079g = C0561a.m2079g("HorizontalScrollView.SavedState{");
            sbM2079g.append(Integer.toHexString(System.identityHashCode(this)));
            sbM2079g.append(" scrollPosition=");
            sbM2079g.append(this.f3184b);
            sbM2079g.append("}");
            return sbM2079g.toString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3184b);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1088R.attr.nestedScrollViewStyle);
        this.f3160c = new Rect();
        this.f3165h = true;
        this.f3166i = false;
        this.f3167j = null;
        this.f3168k = false;
        this.f3171n = true;
        this.f3175r = -1;
        this.f3176s = new int[2];
        this.f3177t = new int[2];
        this.f3161d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3172o = viewConfiguration.getScaledTouchSlop();
        this.f3173p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3174q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3157C, C1088R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f3181x = new C0261j();
        this.f3182y = new C0258g(this);
        setNestedScrollingEnabled(true);
        C0266o.m875n(this, f3156B);
    }

    /* renamed from: c */
    public static int m1698c(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3183z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f3183z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3183z;
    }

    /* renamed from: s */
    public static boolean m1699s(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1699s((View) parent, view2);
    }

    /* renamed from: A */
    public final void m1700A(View view) {
        view.getDrawingRect(this.f3160c);
        offsetDescendantRectToMyCoords(view, this.f3160c);
        int iM1705d = m1705d(this.f3160c);
        if (iM1705d != 0) {
            scrollBy(0, iM1705d);
        }
    }

    /* renamed from: B */
    public final void m1701B(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3159b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f3161d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, i3);
            m1719y(z);
        } else {
            if (!this.f3161d.isFinished()) {
                m1703a();
            }
            scrollBy(i, i2);
        }
        this.f3159b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: C */
    public boolean m1702C(int i, int i2) {
        return this.f3182y.m850i(i, i2);
    }

    /* renamed from: a */
    public final void m1703a() {
        this.f3161d.abortAnimation();
        this.f3182y.m851j(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    /* renamed from: b */
    public boolean m1704b(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m1714t(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1707f(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f3160c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f3160c);
            m1707f(m1705d(this.f3160c));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!m1714t(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f3161d.isFinished()) {
            return;
        }
        this.f3161d.computeScrollOffset();
        int currY = this.f3161d.getCurrY();
        int i = currY - this.f3179v;
        this.f3179v = currY;
        int[] iArr = this.f3177t;
        boolean z = false;
        iArr[1] = 0;
        m1706e(0, i, iArr, null, 1);
        int i2 = i - this.f3177t[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            m1717w(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.f3177t;
            iArr2[1] = 0;
            this.f3182y.m847f(0, scrollY2, 0, i3, this.f3176s, 1, iArr2);
            i2 = i3 - this.f3177t[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                m1709h();
                if (i2 < 0) {
                    if (this.f3162e.isFinished()) {
                        edgeEffect = this.f3162e;
                        edgeEffect.onAbsorb((int) this.f3161d.getCurrVelocity());
                    }
                } else if (this.f3163f.isFinished()) {
                    edgeEffect = this.f3163f;
                    edgeEffect.onAbsorb((int) this.f3161d.getCurrVelocity());
                }
            }
            m1703a();
        }
        if (this.f3161d.isFinished()) {
            this.f3182y.m851j(1);
        } else {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    /* renamed from: d */
    public int m1705d(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1710j(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.f3182y.m842a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f3182y.m843b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m1706e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3182y.m846e(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f3162e != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.f3162e.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int iMin = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    iMin += getPaddingTop();
                }
                canvas.translate(paddingLeft, iMin);
                this.f3162e.setSize(width, height);
                if (this.f3162e.draw(canvas)) {
                    WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(iSave);
            }
            if (this.f3163f.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                paddingLeft2 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f3163f.setSize(width2, height2);
            if (this.f3163f.draw(canvas)) {
                WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave2);
        }
    }

    /* renamed from: e */
    public boolean m1706e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f3182y.m844c(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: f */
    public final void m1707f(int i) {
        if (i != 0) {
            if (this.f3171n) {
                m1701B(0, i, 250, false);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* renamed from: g */
    public final void m1708g() {
        this.f3168k = false;
        m1718x();
        this.f3182y.m851j(0);
        EdgeEffect edgeEffect = this.f3162e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f3163f.onRelease();
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3181x.m858a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* renamed from: h */
    public final void m1709h() {
        if (getOverScrollMode() == 2) {
            this.f3162e = null;
            this.f3163f = null;
        } else if (this.f3162e == null) {
            Context context = getContext();
            this.f3162e = new EdgeEffect(context);
            this.f3163f = new EdgeEffect(context);
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m1713r(0);
    }

    @Override // p000a.p031h.p043j.InterfaceC0259h
    /* renamed from: i */
    public void mo852i(View view, View view2, int i, int i2) {
        C0261j c0261j = this.f3181x;
        if (i2 == 1) {
            c0261j.f1612b = i;
        } else {
            c0261j.f1611a = i;
        }
        m1702C(2, i2);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f3182y.f1609d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m1710j(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m1710j(android.view.KeyEvent):boolean");
    }

    @Override // p000a.p031h.p043j.InterfaceC0260i
    /* renamed from: k */
    public void mo857k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m1715u(i4, i5, iArr);
    }

    @Override // p000a.p031h.p043j.InterfaceC0259h
    /* renamed from: l */
    public void mo853l(View view, int i, int i2, int i3, int i4, int i5) {
        m1715u(i4, i5, null);
    }

    @Override // p000a.p031h.p043j.InterfaceC0259h
    /* renamed from: m */
    public void mo854m(View view, int i) {
        C0261j c0261j = this.f3181x;
        if (i == 1) {
            c0261j.f1612b = 0;
        } else {
            c0261j.f1611a = 0;
        }
        this.f3182y.m851j(i);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // p000a.p031h.p043j.InterfaceC0259h
    /* renamed from: n */
    public void mo855n(View view, int i, int i2, int[] iArr, int i3) {
        m1706e(i, i2, iArr, null, i3);
    }

    @Override // p000a.p031h.p043j.InterfaceC0259h
    /* renamed from: o */
    public boolean mo856o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3166i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f3168k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = 0;
        this.f3165h = false;
        View view = this.f3167j;
        if (view != null && m1699s(view, this)) {
            m1700A(this.f3167j);
        }
        this.f3167j = null;
        if (!this.f3166i) {
            if (this.f3180w != null) {
                scrollTo(getScrollX(), this.f3180w.f3184b);
                this.f3180w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iM1698c = m1698c(scrollY, paddingTop, measuredHeight);
            if (iM1698c != scrollY) {
                scrollTo(getScrollX(), iM1698c);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3166i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3170m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        m1711p((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m1706e(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m1715u(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f3181x.f1611a = i;
        m1702C(2, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i) : focusFinder.findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || (true ^ m1714t(viewFindNextFocus, 0, getHeight()))) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0515c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0515c c0515c = (C0515c) parcelable;
        super.onRestoreInstanceState(c0515c.getSuperState());
        this.f3180w = c0515c;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0515c c0515c = new C0515c(super.onSaveInstanceState());
        c0515c.f3184b = getScrollY();
        return c0515c;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC0514b interfaceC0514b = this.f3158A;
        if (interfaceC0514b != null) {
            C0016b c0016b = (C0016b) interfaceC0514b;
            AlertController.m1560c(this, c0016b.f53a, c0016b.f54b);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m1714t(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f3160c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f3160c);
        m1707f(m1705d(this.f3160c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f3181x.f1611a = 0;
        this.f3182y.m851j(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0209  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void m1711p(int i) {
        if (getChildCount() > 0) {
            this.f3161d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m1719y(true);
        }
    }

    /* renamed from: q */
    public boolean m1712q(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f3160c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3160c.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f3160c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3160c;
        return m1720z(i, rect3.top, rect3.bottom);
    }

    /* renamed from: r */
    public boolean m1713r(int i) {
        return this.f3182y.m848g(i) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f3165h) {
            this.f3167j = view2;
        } else {
            m1700A(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM1705d = m1705d(rect);
        boolean z2 = iM1705d != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM1705d);
            } else {
                m1701B(0, iM1705d, 250, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m1718x();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f3165h = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iM1698c = m1698c(i, width, width2);
            int iM1698c2 = m1698c(i2, height, height2);
            if (iM1698c == getScrollX() && iM1698c2 == getScrollY()) {
                return;
            }
            super.scrollTo(iM1698c, iM1698c2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f3170m) {
            this.f3170m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0258g c0258g = this.f3182y;
        if (c0258g.f1609d) {
            View view = c0258g.f1608c;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            view.stopNestedScroll();
        }
        c0258g.f1609d = z;
    }

    public void setOnScrollChangeListener(InterfaceC0514b interfaceC0514b) {
        this.f3158A = interfaceC0514b;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f3171n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f3182y.m850i(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f3182y.m851j(0);
    }

    /* renamed from: t */
    public final boolean m1714t(View view, int i, int i2) {
        view.getDrawingRect(this.f3160c);
        offsetDescendantRectToMyCoords(view, this.f3160c);
        return this.f3160c.bottom + i >= getScrollY() && this.f3160c.top - i <= getScrollY() + i2;
    }

    /* renamed from: u */
    public final void m1715u(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3182y.m845d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: v */
    public final void m1716v(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3175r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3164g = (int) motionEvent.getY(i);
            this.f3175r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3169l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: w */
    public boolean m1717w(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2;
        int overScrollMode = getOverScrollMode();
        boolean z3 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z4 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z5 = overScrollMode == 0 || (overScrollMode == 1 && z3);
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        int i9 = i3 + i;
        int i10 = !z5 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z6 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z = true;
        } else if (i9 < i13) {
            z = true;
            i9 = i13;
        } else {
            z = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z2 = true;
        } else if (i11 < i15) {
            z2 = true;
            i11 = i15;
        } else {
            z2 = false;
        }
        if (z2 && !m1713r(1)) {
            this.f3161d.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z, z2);
        return z || z2;
    }

    /* renamed from: x */
    public final void m1718x() {
        VelocityTracker velocityTracker = this.f3169l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3169l = null;
        }
    }

    /* renamed from: y */
    public final void m1719y(boolean z) {
        if (z) {
            m1702C(2, 1);
        } else {
            this.f3182y.m851j(1);
        }
        this.f3179v = getScrollY();
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1720z(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r17.getHeight()
            int r5 = r17.getScrollY()
            int r4 = r4 + r5
            r8 = 33
            if (r1 != r8) goto L17
            r8 = 1
            goto L18
        L17:
            r8 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r6 = r14.getBottom()
            if (r2 >= r6) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r6 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r8 == 0) goto L4f
            int r7 = r11.getTop()
            if (r15 < r7) goto L57
        L4f:
            if (r8 != 0) goto L59
            int r7 = r11.getBottom()
            if (r6 <= r7) goto L59
        L57:
            r6 = 1
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r6 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r6 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r6 = 0
            goto L7f
        L75:
            if (r8 == 0) goto L79
            int r2 = r2 - r5
            goto L7b
        L79:
            int r2 = r3 - r4
        L7b:
            r0.m1707f(r2)
            r6 = 1
        L7f:
            android.view.View r2 = r17.findFocus()
            if (r11 == r2) goto L88
            r11.requestFocus(r1)
        L88:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m1720z(int, int, int):boolean");
    }
}
