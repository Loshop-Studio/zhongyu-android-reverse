package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC6801g;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.StackingBehavior;

/* loaded from: classes4.dex */
public class MDRootLayout extends ViewGroup {

    /* renamed from: a */
    public final MDButton[] f7464a;

    /* renamed from: b */
    public int f7465b;

    /* renamed from: c */
    public View f7466c;

    /* renamed from: d */
    public View f7467d;

    /* renamed from: e */
    public boolean f7468e;

    /* renamed from: f */
    public boolean f7469f;

    /* renamed from: g */
    public StackingBehavior f7470g;

    /* renamed from: h */
    public boolean f7471h;

    /* renamed from: i */
    public boolean f7472i;

    /* renamed from: j */
    public boolean f7473j;

    /* renamed from: k */
    public boolean f7474k;

    /* renamed from: l */
    public int f7475l;

    /* renamed from: m */
    public int f7476m;

    /* renamed from: n */
    public int f7477n;

    /* renamed from: o */
    public GravityEnum f7478o;

    /* renamed from: p */
    public int f7479p;

    /* renamed from: q */
    public Paint f7480q;

    /* renamed from: r */
    public ViewTreeObserver.OnScrollChangedListener f7481r;

    /* renamed from: s */
    public ViewTreeObserver.OnScrollChangedListener f7482s;

    /* renamed from: t */
    public int f7483t;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$a */
    public class ViewTreeObserverOnPreDrawListenerC6835a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f7484a;

        /* renamed from: b */
        public final /* synthetic */ boolean f7485b;

        /* renamed from: c */
        public final /* synthetic */ boolean f7486c;

        public ViewTreeObserverOnPreDrawListenerC6835a(View view, boolean z9, boolean z10) {
            this.f7484a = view;
            this.f7485b = z9;
            this.f7486c = z10;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f7484a.getMeasuredHeight() == 0) {
                return true;
            }
            if (MDRootLayout.m6733l((WebView) this.f7484a)) {
                MDRootLayout.this.m6737h((ViewGroup) this.f7484a, this.f7485b, this.f7486c);
            } else {
                if (this.f7485b) {
                    MDRootLayout.this.f7468e = false;
                }
                if (this.f7486c) {
                    MDRootLayout.this.f7469f = false;
                }
            }
            this.f7484a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$b */
    public class C6836b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f7488a;

        /* renamed from: b */
        public final /* synthetic */ boolean f7489b;

        /* renamed from: c */
        public final /* synthetic */ boolean f7490c;

        public C6836b(ViewGroup viewGroup, boolean z9, boolean z10) {
            this.f7488a = viewGroup;
            this.f7489b = z9;
            this.f7490c = z10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i9, int i10) {
            super.onScrolled(recyclerView, i9, i10);
            MDButton[] mDButtonArr = MDRootLayout.this.f7464a;
            int length = mDButtonArr.length;
            boolean z9 = false;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    MDButton mDButton = mDButtonArr[i11];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z9 = true;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MDRootLayout.this.m6739p(this.f7488a, this.f7489b, this.f7490c, z9);
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$c */
    public class ViewTreeObserverOnScrollChangedListenerC6837c implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f7492a;

        /* renamed from: b */
        public final /* synthetic */ boolean f7493b;

        /* renamed from: c */
        public final /* synthetic */ boolean f7494c;

        public ViewTreeObserverOnScrollChangedListenerC6837c(ViewGroup viewGroup, boolean z9, boolean z10) {
            this.f7492a = viewGroup;
            this.f7493b = z9;
            this.f7494c = z10;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            MDButton[] mDButtonArr = MDRootLayout.this.f7464a;
            int length = mDButtonArr.length;
            boolean z9 = false;
            int i9 = 0;
            while (true) {
                if (i9 < length) {
                    MDButton mDButton = mDButtonArr[i9];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z9 = true;
                        break;
                    }
                    i9++;
                } else {
                    break;
                }
            }
            ViewGroup viewGroup = this.f7492a;
            if (viewGroup instanceof WebView) {
                MDRootLayout.this.m6740q((WebView) viewGroup, this.f7493b, this.f7494c, z9);
            } else {
                MDRootLayout.this.m6739p(viewGroup, this.f7493b, this.f7494c, z9);
            }
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$d */
    public static /* synthetic */ class C6838d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7496a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f7496a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7496a[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f7464a = new MDButton[3];
        this.f7468e = false;
        this.f7469f = false;
        this.f7470g = StackingBehavior.ADAPTIVE;
        this.f7471h = false;
        this.f7472i = true;
        this.f7478o = GravityEnum.START;
        m6738o(context, attributeSet, 0);
    }

    /* renamed from: i */
    public static boolean m6730i(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        return !(adapterView.getFirstVisiblePosition() == 0) || !(adapterView.getLastVisiblePosition() == adapterView.getCount() - 1) || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    /* renamed from: j */
    public static boolean m6731j(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().canScrollVertically()) ? false : true;
    }

    /* renamed from: k */
    public static boolean m6732k(ScrollView scrollView) {
        if (scrollView.getChildCount() == 0) {
            return false;
        }
        return (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight();
    }

    /* renamed from: l */
    public static boolean m6733l(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    /* renamed from: m */
    public static View m6734m(ViewGroup viewGroup) {
        if (viewGroup != null && viewGroup.getChildCount() != 0) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt.getVisibility() == 0 && childAt.getBottom() == viewGroup.getMeasuredHeight()) {
                    return childAt;
                }
            }
        }
        return null;
    }

    /* renamed from: n */
    public static View m6735n(ViewGroup viewGroup) {
        if (viewGroup != null && viewGroup.getChildCount() != 0) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                    return childAt;
                }
            }
        }
        return null;
    }

    /* renamed from: s */
    public static boolean m6736s(View view) {
        boolean z9 = (view == null || view.getVisibility() == 8) ? false : true;
        return (z9 && (view instanceof MDButton)) ? ((MDButton) view).getText().toString().trim().length() > 0 : z9;
    }

    /* renamed from: h */
    public final void m6737h(ViewGroup viewGroup, boolean z9, boolean z10) {
        if ((z10 || this.f7481r != null) && !(z10 && this.f7482s == null)) {
            return;
        }
        if (viewGroup instanceof RecyclerView) {
            C6836b c6836b = new C6836b(viewGroup, z9, z10);
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            recyclerView.addOnScrollListener(c6836b);
            c6836b.onScrolled(recyclerView, 0, 0);
            return;
        }
        ViewTreeObserverOnScrollChangedListenerC6837c viewTreeObserverOnScrollChangedListenerC6837c = new ViewTreeObserverOnScrollChangedListenerC6837c(viewGroup, z9, z10);
        if (z10) {
            this.f7482s = viewTreeObserverOnScrollChangedListenerC6837c;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f7482s);
        } else {
            this.f7481r = viewTreeObserverOnScrollChangedListenerC6837c;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f7481r);
        }
        viewTreeObserverOnScrollChangedListenerC6837c.onScrollChanged();
    }

    /* renamed from: o */
    public final void m6738o(Context context, AttributeSet attributeSet, int i9) {
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MDRootLayout, i9, 0);
        this.f7473j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f7475l = resources.getDimensionPixelSize(R$dimen.md_notitle_vertical_padding);
        this.f7476m = resources.getDimensionPixelSize(R$dimen.md_button_frame_vertical_padding);
        this.f7479p = resources.getDimensionPixelSize(R$dimen.md_button_padding_frame_side);
        this.f7477n = AbstractC6801g.m6482o(context, R$attr.md_button_height, resources.getDimensionPixelSize(R$dimen.default_md_button_height_phone));
        this.f7480q = new Paint();
        this.f7483t = resources.getDimensionPixelSize(R$dimen.md_divider_height);
        this.f7480q.setColor(AbstractC6801g.m6479l(context, R$attr.md_divider_color));
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        View view = this.f7467d;
        if (view != null) {
            if (this.f7468e) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, r0 - this.f7483t, getMeasuredWidth(), view.getTop(), this.f7480q);
            } else {
                canvas2 = canvas;
            }
            if (this.f7469f) {
                canvas2.drawRect(0.0f, this.f7467d.getBottom(), getMeasuredWidth(), r15 + this.f7483t, this.f7480q);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getId() == R$id.md_titleFrame) {
                this.f7466c = childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNeutral) {
                this.f7464a[0] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNegative) {
                this.f7464a[1] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultPositive) {
                this.f7464a[2] = (MDButton) childAt;
            } else {
                this.f7467d = childAt;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int i13;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        int measuredWidth5;
        int measuredWidth6;
        int measuredWidth7;
        int measuredWidth8;
        if (m6736s(this.f7466c)) {
            int measuredHeight = this.f7466c.getMeasuredHeight() + i10;
            this.f7466c.layout(i9, i10, i11, measuredHeight);
            i10 = measuredHeight;
        } else if (!this.f7474k && this.f7472i) {
            i10 += this.f7475l;
        }
        if (m6736s(this.f7467d)) {
            View view = this.f7467d;
            view.layout(i9, i10, i11, view.getMeasuredHeight() + i10);
        }
        if (this.f7471h) {
            int measuredHeight2 = i12 - this.f7476m;
            for (MDButton mDButton : this.f7464a) {
                if (m6736s(mDButton)) {
                    mDButton.layout(i9, measuredHeight2 - mDButton.getMeasuredHeight(), i11, measuredHeight2);
                    measuredHeight2 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            if (this.f7472i) {
                i12 -= this.f7476m;
            }
            int i14 = i12 - this.f7477n;
            int measuredWidth9 = this.f7479p;
            if (m6736s(this.f7464a[2])) {
                if (this.f7478o == GravityEnum.END) {
                    measuredWidth7 = i9 + measuredWidth9;
                    measuredWidth8 = this.f7464a[2].getMeasuredWidth() + measuredWidth7;
                    i13 = -1;
                } else {
                    int i15 = i11 - measuredWidth9;
                    measuredWidth7 = i15 - this.f7464a[2].getMeasuredWidth();
                    measuredWidth8 = i15;
                    i13 = measuredWidth7;
                }
                this.f7464a[2].layout(measuredWidth7, i14, measuredWidth8, i12);
                measuredWidth9 += this.f7464a[2].getMeasuredWidth();
            } else {
                i13 = -1;
            }
            if (m6736s(this.f7464a[1])) {
                GravityEnum gravityEnum = this.f7478o;
                if (gravityEnum == GravityEnum.END) {
                    measuredWidth5 = measuredWidth9 + i9;
                    measuredWidth6 = this.f7464a[1].getMeasuredWidth() + measuredWidth5;
                } else if (gravityEnum == GravityEnum.START) {
                    measuredWidth6 = i11 - measuredWidth9;
                    measuredWidth5 = measuredWidth6 - this.f7464a[1].getMeasuredWidth();
                } else {
                    measuredWidth5 = this.f7479p + i9;
                    measuredWidth6 = this.f7464a[1].getMeasuredWidth() + measuredWidth5;
                    measuredWidth = measuredWidth6;
                    this.f7464a[1].layout(measuredWidth5, i14, measuredWidth6, i12);
                }
                measuredWidth = -1;
                this.f7464a[1].layout(measuredWidth5, i14, measuredWidth6, i12);
            } else {
                measuredWidth = -1;
            }
            if (m6736s(this.f7464a[0])) {
                GravityEnum gravityEnum2 = this.f7478o;
                if (gravityEnum2 == GravityEnum.END) {
                    measuredWidth3 = i11 - this.f7479p;
                    measuredWidth4 = measuredWidth3 - this.f7464a[0].getMeasuredWidth();
                } else if (gravityEnum2 == GravityEnum.START) {
                    measuredWidth4 = i9 + this.f7479p;
                    measuredWidth3 = this.f7464a[0].getMeasuredWidth() + measuredWidth4;
                } else {
                    if (measuredWidth != -1 || i13 == -1) {
                        if (i13 == -1 && measuredWidth != -1) {
                            measuredWidth2 = this.f7464a[0].getMeasuredWidth();
                        } else if (i13 == -1) {
                            measuredWidth = ((i11 - i9) / 2) - (this.f7464a[0].getMeasuredWidth() / 2);
                            measuredWidth2 = this.f7464a[0].getMeasuredWidth();
                        }
                        i13 = measuredWidth + measuredWidth2;
                    } else {
                        measuredWidth = i13 - this.f7464a[0].getMeasuredWidth();
                    }
                    measuredWidth3 = i13;
                    measuredWidth4 = measuredWidth;
                }
                this.f7464a[0].layout(measuredWidth4, i14, measuredWidth3, i12);
            }
        }
        m6743u(this.f7467d, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout.onMeasure(int, int):void");
    }

    /* renamed from: p */
    public final void m6739p(ViewGroup viewGroup, boolean z9, boolean z10, boolean z11) {
        if (z9 && viewGroup.getChildCount() > 0) {
            View view = this.f7466c;
            this.f7468e = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (!z10 || viewGroup.getChildCount() <= 0) {
            return;
        }
        this.f7469f = z11 && (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom();
    }

    /* renamed from: q */
    public final void m6740q(WebView webView, boolean z9, boolean z10, boolean z11) {
        boolean z12 = false;
        if (z9) {
            View view = this.f7466c;
            this.f7468e = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z10) {
            if (z11 && (webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom() < webView.getContentHeight() * webView.getScale()) {
                z12 = true;
            }
            this.f7469f = z12;
        }
    }

    /* renamed from: r */
    public final void m6741r() {
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int i9 = C6838d.f7496a[this.f7478o.ordinal()];
            if (i9 == 1) {
                this.f7478o = GravityEnum.END;
            } else {
                if (i9 != 2) {
                    return;
                }
                this.f7478o = GravityEnum.START;
            }
        }
    }

    public void setButtonGravity(GravityEnum gravityEnum) {
        this.f7478o = gravityEnum;
        m6741r();
    }

    public void setButtonStackedGravity(GravityEnum gravityEnum) {
        for (MDButton mDButton : this.f7464a) {
            if (mDButton != null) {
                mDButton.setStackedGravity(gravityEnum);
            }
        }
    }

    public void setDividerColor(int i9) {
        this.f7480q.setColor(i9);
        invalidate();
    }

    public void setMaxHeight(int i9) {
        this.f7465b = i9;
    }

    public void setStackingBehavior(StackingBehavior stackingBehavior) {
        this.f7470g = stackingBehavior;
        invalidate();
    }

    /* renamed from: t */
    public void m6742t() {
        this.f7474k = true;
    }

    /* renamed from: u */
    public final void m6743u(View view, boolean z9, boolean z10) {
        if (view == null) {
            return;
        }
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            if (m6732k(scrollView)) {
                m6737h(scrollView, z9, z10);
                return;
            }
            if (z9) {
                this.f7468e = false;
            }
            if (z10) {
                this.f7469f = false;
                return;
            }
            return;
        }
        if (view instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) view;
            if (m6730i(adapterView)) {
                m6737h(adapterView, z9, z10);
                return;
            }
            if (z9) {
                this.f7468e = false;
            }
            if (z10) {
                this.f7469f = false;
                return;
            }
            return;
        }
        if (view instanceof WebView) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC6835a(view, z9, z10));
            return;
        }
        if (view instanceof RecyclerView) {
            boolean zM6731j = m6731j((RecyclerView) view);
            if (z9) {
                this.f7468e = zM6731j;
            }
            if (z10) {
                this.f7469f = zM6731j;
            }
            if (zM6731j) {
                m6737h((ViewGroup) view, z9, z10);
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            View viewM6735n = m6735n(viewGroup);
            m6743u(viewM6735n, z9, z10);
            View viewM6734m = m6734m(viewGroup);
            if (viewM6734m != viewM6735n) {
                m6743u(viewM6734m, false, true);
            }
        }
    }
}
