package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.annotation.TargetApi;
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
import com.xuexiang.xui.utils.AbstractC8041g;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.StackingBehavior;

/* loaded from: classes5.dex */
public class MDRootLayout extends ViewGroup {

    /* renamed from: c */
    public final MDButton[] f15842c;

    /* renamed from: d */
    public int f15843d;

    /* renamed from: e */
    public View f15844e;

    /* renamed from: f */
    public View f15845f;

    /* renamed from: g */
    public boolean f15846g;

    /* renamed from: h */
    public boolean f15847h;

    /* renamed from: i */
    public StackingBehavior f15848i;

    /* renamed from: j */
    public boolean f15849j;

    /* renamed from: k */
    public boolean f15850k;

    /* renamed from: l */
    public boolean f15851l;

    /* renamed from: m */
    public boolean f15852m;

    /* renamed from: n */
    public int f15853n;

    /* renamed from: o */
    public int f15854o;

    /* renamed from: p */
    public int f15855p;

    /* renamed from: q */
    public GravityEnum f15856q;

    /* renamed from: r */
    public int f15857r;

    /* renamed from: s */
    public Paint f15858s;

    /* renamed from: t */
    public ViewTreeObserver.OnScrollChangedListener f15859t;

    /* renamed from: u */
    public ViewTreeObserver.OnScrollChangedListener f15860u;

    /* renamed from: v */
    public int f15861v;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$a */
    public class ViewTreeObserverOnPreDrawListenerC8098a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: c */
        public final /* synthetic */ View f15862c;

        /* renamed from: d */
        public final /* synthetic */ boolean f15863d;

        /* renamed from: e */
        public final /* synthetic */ boolean f15864e;

        public ViewTreeObserverOnPreDrawListenerC8098a(View view, boolean z10, boolean z11) {
            this.f15862c = view;
            this.f15863d = z10;
            this.f15864e = z11;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f15862c.getMeasuredHeight() == 0) {
                return true;
            }
            if (MDRootLayout.m12550l((WebView) this.f15862c)) {
                MDRootLayout.this.m12554h((ViewGroup) this.f15862c, this.f15863d, this.f15864e);
            } else {
                if (this.f15863d) {
                    MDRootLayout.this.f15846g = false;
                }
                if (this.f15864e) {
                    MDRootLayout.this.f15847h = false;
                }
            }
            this.f15862c.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$b */
    public class C8099b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f15866a;

        /* renamed from: b */
        public final /* synthetic */ boolean f15867b;

        /* renamed from: c */
        public final /* synthetic */ boolean f15868c;

        public C8099b(ViewGroup viewGroup, boolean z10, boolean z11) {
            this.f15866a = viewGroup;
            this.f15867b = z10;
            this.f15868c = z11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            super.onScrolled(recyclerView, i10, i11);
            MDButton[] mDButtonArr = MDRootLayout.this.f15842c;
            int length = mDButtonArr.length;
            boolean z10 = false;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    MDButton mDButton = mDButtonArr[i12];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            MDRootLayout.this.m12556p(this.f15866a, this.f15867b, this.f15868c, z10);
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$c */
    public class ViewTreeObserverOnScrollChangedListenerC8100c implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f15870a;

        /* renamed from: b */
        public final /* synthetic */ boolean f15871b;

        /* renamed from: c */
        public final /* synthetic */ boolean f15872c;

        public ViewTreeObserverOnScrollChangedListenerC8100c(ViewGroup viewGroup, boolean z10, boolean z11) {
            this.f15870a = viewGroup;
            this.f15871b = z10;
            this.f15872c = z11;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            MDButton[] mDButtonArr = MDRootLayout.this.f15842c;
            int length = mDButtonArr.length;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    MDButton mDButton = mDButtonArr[i10];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            ViewGroup viewGroup = this.f15870a;
            if (viewGroup instanceof WebView) {
                MDRootLayout.this.m12557q((WebView) viewGroup, this.f15871b, this.f15872c, z10);
            } else {
                MDRootLayout.this.m12556p(viewGroup, this.f15871b, this.f15872c, z10);
            }
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$d */
    public static /* synthetic */ class C8101d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15874a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f15874a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15874a[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MDRootLayout(Context context) {
        super(context, null);
        this.f15842c = new MDButton[3];
        this.f15846g = false;
        this.f15847h = false;
        this.f15848i = StackingBehavior.ADAPTIVE;
        this.f15849j = false;
        this.f15850k = true;
        this.f15856q = GravityEnum.START;
        m12555o(context, null, 0);
    }

    /* renamed from: i */
    public static boolean m12547i(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        return !(adapterView.getFirstVisiblePosition() == 0) || !(adapterView.getLastVisiblePosition() == adapterView.getCount() - 1) || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    /* renamed from: j */
    public static boolean m12548j(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().canScrollVertically()) ? false : true;
    }

    /* renamed from: k */
    public static boolean m12549k(ScrollView scrollView) {
        if (scrollView.getChildCount() == 0) {
            return false;
        }
        return (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight();
    }

    /* renamed from: l */
    public static boolean m12550l(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    /* renamed from: m */
    public static View m12551m(ViewGroup viewGroup) {
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
    public static View m12552n(ViewGroup viewGroup) {
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
    public static boolean m12553s(View view) {
        boolean z10 = (view == null || view.getVisibility() == 8) ? false : true;
        return (z10 && (view instanceof MDButton)) ? ((MDButton) view).getText().toString().trim().length() > 0 : z10;
    }

    /* renamed from: h */
    public final void m12554h(ViewGroup viewGroup, boolean z10, boolean z11) {
        if ((z11 || this.f15859t != null) && !(z11 && this.f15860u == null)) {
            return;
        }
        if (viewGroup instanceof RecyclerView) {
            C8099b c8099b = new C8099b(viewGroup, z10, z11);
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            recyclerView.addOnScrollListener(c8099b);
            c8099b.onScrolled(recyclerView, 0, 0);
            return;
        }
        ViewTreeObserverOnScrollChangedListenerC8100c viewTreeObserverOnScrollChangedListenerC8100c = new ViewTreeObserverOnScrollChangedListenerC8100c(viewGroup, z10, z11);
        if (z11) {
            this.f15860u = viewTreeObserverOnScrollChangedListenerC8100c;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f15860u);
        } else {
            this.f15859t = viewTreeObserverOnScrollChangedListenerC8100c;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f15859t);
        }
        viewTreeObserverOnScrollChangedListenerC8100c.onScrollChanged();
    }

    /* renamed from: o */
    public final void m12555o(Context context, AttributeSet attributeSet, int i10) {
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MDRootLayout, i10, 0);
        this.f15851l = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f15853n = resources.getDimensionPixelSize(R$dimen.md_notitle_vertical_padding);
        this.f15854o = resources.getDimensionPixelSize(R$dimen.md_button_frame_vertical_padding);
        this.f15857r = resources.getDimensionPixelSize(R$dimen.md_button_padding_frame_side);
        this.f15855p = AbstractC8041g.m12220g(context, R$attr.md_button_height, resources.getDimensionPixelSize(R$dimen.default_md_button_height_phone));
        this.f15858s = new Paint();
        this.f15861v = resources.getDimensionPixelSize(R$dimen.md_divider_height);
        this.f15858s.setColor(AbstractC8041g.m12217d(context, R$attr.md_divider_color));
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        View view = this.f15845f;
        if (view != null) {
            if (this.f15846g) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, r0 - this.f15861v, getMeasuredWidth(), view.getTop(), this.f15858s);
            } else {
                canvas2 = canvas;
            }
            if (this.f15847h) {
                canvas2.drawRect(0.0f, this.f15845f.getBottom(), getMeasuredWidth(), r15 + this.f15861v, this.f15858s);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() == R$id.md_titleFrame) {
                this.f15844e = childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNeutral) {
                this.f15842c[0] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNegative) {
                this.f15842c[1] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultPositive) {
                this.f15842c[2] = (MDButton) childAt;
            } else {
                this.f15845f = childAt;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        int measuredWidth5;
        int measuredWidth6;
        int measuredWidth7;
        int measuredWidth8;
        if (m12553s(this.f15844e)) {
            int measuredHeight = this.f15844e.getMeasuredHeight() + i11;
            this.f15844e.layout(i10, i11, i12, measuredHeight);
            i11 = measuredHeight;
        } else if (!this.f15852m && this.f15850k) {
            i11 += this.f15853n;
        }
        if (m12553s(this.f15845f)) {
            View view = this.f15845f;
            view.layout(i10, i11, i12, view.getMeasuredHeight() + i11);
        }
        if (this.f15849j) {
            int measuredHeight2 = i13 - this.f15854o;
            for (MDButton mDButton : this.f15842c) {
                if (m12553s(mDButton)) {
                    mDButton.layout(i10, measuredHeight2 - mDButton.getMeasuredHeight(), i12, measuredHeight2);
                    measuredHeight2 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            if (this.f15850k) {
                i13 -= this.f15854o;
            }
            int i15 = i13 - this.f15855p;
            int measuredWidth9 = this.f15857r;
            if (m12553s(this.f15842c[2])) {
                if (this.f15856q == GravityEnum.END) {
                    measuredWidth7 = i10 + measuredWidth9;
                    measuredWidth8 = this.f15842c[2].getMeasuredWidth() + measuredWidth7;
                    i14 = -1;
                } else {
                    int i16 = i12 - measuredWidth9;
                    measuredWidth7 = i16 - this.f15842c[2].getMeasuredWidth();
                    measuredWidth8 = i16;
                    i14 = measuredWidth7;
                }
                this.f15842c[2].layout(measuredWidth7, i15, measuredWidth8, i13);
                measuredWidth9 += this.f15842c[2].getMeasuredWidth();
            } else {
                i14 = -1;
            }
            if (m12553s(this.f15842c[1])) {
                GravityEnum gravityEnum = this.f15856q;
                if (gravityEnum == GravityEnum.END) {
                    measuredWidth5 = measuredWidth9 + i10;
                    measuredWidth6 = this.f15842c[1].getMeasuredWidth() + measuredWidth5;
                } else if (gravityEnum == GravityEnum.START) {
                    measuredWidth6 = i12 - measuredWidth9;
                    measuredWidth5 = measuredWidth6 - this.f15842c[1].getMeasuredWidth();
                } else {
                    measuredWidth5 = this.f15857r + i10;
                    measuredWidth6 = this.f15842c[1].getMeasuredWidth() + measuredWidth5;
                    measuredWidth = measuredWidth6;
                    this.f15842c[1].layout(measuredWidth5, i15, measuredWidth6, i13);
                }
                measuredWidth = -1;
                this.f15842c[1].layout(measuredWidth5, i15, measuredWidth6, i13);
            } else {
                measuredWidth = -1;
            }
            if (m12553s(this.f15842c[0])) {
                GravityEnum gravityEnum2 = this.f15856q;
                if (gravityEnum2 == GravityEnum.END) {
                    measuredWidth3 = i12 - this.f15857r;
                    measuredWidth4 = measuredWidth3 - this.f15842c[0].getMeasuredWidth();
                } else if (gravityEnum2 == GravityEnum.START) {
                    measuredWidth4 = i10 + this.f15857r;
                    measuredWidth3 = this.f15842c[0].getMeasuredWidth() + measuredWidth4;
                } else {
                    if (measuredWidth != -1 || i14 == -1) {
                        if (i14 == -1 && measuredWidth != -1) {
                            measuredWidth2 = this.f15842c[0].getMeasuredWidth();
                        } else if (i14 == -1) {
                            measuredWidth = ((i12 - i10) / 2) - (this.f15842c[0].getMeasuredWidth() / 2);
                            measuredWidth2 = this.f15842c[0].getMeasuredWidth();
                        }
                        i14 = measuredWidth + measuredWidth2;
                    } else {
                        measuredWidth = i14 - this.f15842c[0].getMeasuredWidth();
                    }
                    measuredWidth3 = i14;
                    measuredWidth4 = measuredWidth;
                }
                this.f15842c[0].layout(measuredWidth4, i15, measuredWidth3, i13);
            }
        }
        m12559t(this.f15845f, true, true);
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
    public final void m12556p(ViewGroup viewGroup, boolean z10, boolean z11, boolean z12) {
        if (z10 && viewGroup.getChildCount() > 0) {
            View view = this.f15844e;
            this.f15846g = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (!z11 || viewGroup.getChildCount() <= 0) {
            return;
        }
        this.f15847h = z12 && (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom();
    }

    /* renamed from: q */
    public final void m12557q(WebView webView, boolean z10, boolean z11, boolean z12) {
        boolean z13 = false;
        if (z10) {
            View view = this.f15844e;
            this.f15846g = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z11) {
            if (z12 && (webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom() < webView.getContentHeight() * webView.getScale()) {
                z13 = true;
            }
            this.f15847h = z13;
        }
    }

    /* renamed from: r */
    public final void m12558r() {
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int i10 = C8101d.f15874a[this.f15856q.ordinal()];
            if (i10 == 1) {
                this.f15856q = GravityEnum.END;
            } else {
                if (i10 != 2) {
                    return;
                }
                this.f15856q = GravityEnum.START;
            }
        }
    }

    public void setButtonGravity(GravityEnum gravityEnum) {
        this.f15856q = gravityEnum;
        m12558r();
    }

    public void setButtonStackedGravity(GravityEnum gravityEnum) {
        for (MDButton mDButton : this.f15842c) {
            if (mDButton != null) {
                mDButton.setStackedGravity(gravityEnum);
            }
        }
    }

    public void setDividerColor(int i10) {
        this.f15858s.setColor(i10);
        invalidate();
    }

    public void setMaxHeight(int i10) {
        this.f15843d = i10;
    }

    public void setStackingBehavior(StackingBehavior stackingBehavior) {
        this.f15848i = stackingBehavior;
        invalidate();
    }

    /* renamed from: t */
    public final void m12559t(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            if (m12549k(scrollView)) {
                m12554h(scrollView, z10, z11);
                return;
            }
            if (z10) {
                this.f15846g = false;
            }
            if (z11) {
                this.f15847h = false;
                return;
            }
            return;
        }
        if (view instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) view;
            if (m12547i(adapterView)) {
                m12554h(adapterView, z10, z11);
                return;
            }
            if (z10) {
                this.f15846g = false;
            }
            if (z11) {
                this.f15847h = false;
                return;
            }
            return;
        }
        if (view instanceof WebView) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC8098a(view, z10, z11));
            return;
        }
        if (view instanceof RecyclerView) {
            boolean zM12548j = m12548j((RecyclerView) view);
            if (z10) {
                this.f15846g = zM12548j;
            }
            if (z11) {
                this.f15847h = zM12548j;
            }
            if (zM12548j) {
                m12554h((ViewGroup) view, z10, z11);
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            View viewM12552n = m12552n(viewGroup);
            m12559t(viewM12552n, z10, z11);
            View viewM12551m = m12551m(viewGroup);
            if (viewM12551m != viewM12552n) {
                m12559t(viewM12551m, false, true);
            }
        }
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15842c = new MDButton[3];
        this.f15846g = false;
        this.f15847h = false;
        this.f15848i = StackingBehavior.ADAPTIVE;
        this.f15849j = false;
        this.f15850k = true;
        this.f15856q = GravityEnum.START;
        m12555o(context, attributeSet, 0);
    }

    @TargetApi(11)
    public MDRootLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15842c = new MDButton[3];
        this.f15846g = false;
        this.f15847h = false;
        this.f15848i = StackingBehavior.ADAPTIVE;
        this.f15849j = false;
        this.f15850k = true;
        this.f15856q = GravityEnum.START;
        m12555o(context, attributeSet, i10);
    }
}
