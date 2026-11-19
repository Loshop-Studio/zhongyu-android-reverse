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
import com.xuexiang.xui.utils.AbstractC6482g;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.StackingBehavior;

/* loaded from: classes4.dex */
public class MDRootLayout extends ViewGroup {

    /* renamed from: a */
    public final MDButton[] f6206a;

    /* renamed from: b */
    public int f6207b;

    /* renamed from: c */
    public View f6208c;

    /* renamed from: d */
    public View f6209d;

    /* renamed from: e */
    public boolean f6210e;

    /* renamed from: f */
    public boolean f6211f;

    /* renamed from: g */
    public StackingBehavior f6212g;

    /* renamed from: h */
    public boolean f6213h;

    /* renamed from: i */
    public boolean f6214i;

    /* renamed from: j */
    public boolean f6215j;

    /* renamed from: k */
    public boolean f6216k;

    /* renamed from: l */
    public int f6217l;

    /* renamed from: m */
    public int f6218m;

    /* renamed from: n */
    public int f6219n;

    /* renamed from: o */
    public GravityEnum f6220o;

    /* renamed from: p */
    public int f6221p;

    /* renamed from: q */
    public Paint f6222q;

    /* renamed from: r */
    public ViewTreeObserver.OnScrollChangedListener f6223r;

    /* renamed from: s */
    public ViewTreeObserver.OnScrollChangedListener f6224s;

    /* renamed from: t */
    public int f6225t;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$a */
    public class ViewTreeObserverOnPreDrawListenerC6515a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f6226a;

        /* renamed from: b */
        public final /* synthetic */ boolean f6227b;

        /* renamed from: c */
        public final /* synthetic */ boolean f6228c;

        public ViewTreeObserverOnPreDrawListenerC6515a(View view, boolean z9, boolean z10) {
            this.f6226a = view;
            this.f6227b = z9;
            this.f6228c = z10;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f6226a.getMeasuredHeight() == 0) {
                return true;
            }
            if (MDRootLayout.m5628l((WebView) this.f6226a)) {
                MDRootLayout.this.m5632h((ViewGroup) this.f6226a, this.f6227b, this.f6228c);
            } else {
                if (this.f6227b) {
                    MDRootLayout.this.f6210e = false;
                }
                if (this.f6228c) {
                    MDRootLayout.this.f6211f = false;
                }
            }
            this.f6226a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$b */
    public class C6516b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f6230a;

        /* renamed from: b */
        public final /* synthetic */ boolean f6231b;

        /* renamed from: c */
        public final /* synthetic */ boolean f6232c;

        public C6516b(ViewGroup viewGroup, boolean z9, boolean z10) {
            this.f6230a = viewGroup;
            this.f6231b = z9;
            this.f6232c = z10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            super.onScrolled(recyclerView, i10, i11);
            MDButton[] mDButtonArr = MDRootLayout.this.f6206a;
            int length = mDButtonArr.length;
            boolean z9 = false;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    MDButton mDButton = mDButtonArr[i12];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z9 = true;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            MDRootLayout.this.m5634p(this.f6230a, this.f6231b, this.f6232c, z9);
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$c */
    public class ViewTreeObserverOnScrollChangedListenerC6517c implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f6234a;

        /* renamed from: b */
        public final /* synthetic */ boolean f6235b;

        /* renamed from: c */
        public final /* synthetic */ boolean f6236c;

        public ViewTreeObserverOnScrollChangedListenerC6517c(ViewGroup viewGroup, boolean z9, boolean z10) {
            this.f6234a = viewGroup;
            this.f6235b = z9;
            this.f6236c = z10;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            MDButton[] mDButtonArr = MDRootLayout.this.f6206a;
            int length = mDButtonArr.length;
            boolean z9 = false;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    MDButton mDButton = mDButtonArr[i10];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z9 = true;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            ViewGroup viewGroup = this.f6234a;
            if (viewGroup instanceof WebView) {
                MDRootLayout.this.m5635q((WebView) viewGroup, this.f6235b, this.f6236c, z9);
            } else {
                MDRootLayout.this.m5634p(viewGroup, this.f6235b, this.f6236c, z9);
            }
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$d */
    public static /* synthetic */ class C6518d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6238a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f6238a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6238a[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6206a = new MDButton[3];
        this.f6210e = false;
        this.f6211f = false;
        this.f6212g = StackingBehavior.ADAPTIVE;
        this.f6213h = false;
        this.f6214i = true;
        this.f6220o = GravityEnum.START;
        m5633o(context, attributeSet, 0);
    }

    /* renamed from: i */
    public static boolean m5625i(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        return !(adapterView.getFirstVisiblePosition() == 0) || !(adapterView.getLastVisiblePosition() == adapterView.getCount() - 1) || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    /* renamed from: j */
    public static boolean m5626j(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().canScrollVertically()) ? false : true;
    }

    /* renamed from: k */
    public static boolean m5627k(ScrollView scrollView) {
        if (scrollView.getChildCount() == 0) {
            return false;
        }
        return (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight();
    }

    /* renamed from: l */
    public static boolean m5628l(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    /* renamed from: m */
    public static View m5629m(ViewGroup viewGroup) {
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
    public static View m5630n(ViewGroup viewGroup) {
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
    public static boolean m5631s(View view) {
        boolean z9 = (view == null || view.getVisibility() == 8) ? false : true;
        return (z9 && (view instanceof MDButton)) ? ((MDButton) view).getText().toString().trim().length() > 0 : z9;
    }

    /* renamed from: h */
    public final void m5632h(ViewGroup viewGroup, boolean z9, boolean z10) {
        if ((z10 || this.f6223r != null) && !(z10 && this.f6224s == null)) {
            return;
        }
        if (viewGroup instanceof RecyclerView) {
            C6516b c6516b = new C6516b(viewGroup, z9, z10);
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            recyclerView.addOnScrollListener(c6516b);
            c6516b.onScrolled(recyclerView, 0, 0);
            return;
        }
        ViewTreeObserverOnScrollChangedListenerC6517c viewTreeObserverOnScrollChangedListenerC6517c = new ViewTreeObserverOnScrollChangedListenerC6517c(viewGroup, z9, z10);
        if (z10) {
            this.f6224s = viewTreeObserverOnScrollChangedListenerC6517c;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f6224s);
        } else {
            this.f6223r = viewTreeObserverOnScrollChangedListenerC6517c;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f6223r);
        }
        viewTreeObserverOnScrollChangedListenerC6517c.onScrollChanged();
    }

    /* renamed from: o */
    public final void m5633o(Context context, AttributeSet attributeSet, int i10) {
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MDRootLayout, i10, 0);
        this.f6215j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f6217l = resources.getDimensionPixelSize(R$dimen.md_notitle_vertical_padding);
        this.f6218m = resources.getDimensionPixelSize(R$dimen.md_button_frame_vertical_padding);
        this.f6221p = resources.getDimensionPixelSize(R$dimen.md_button_padding_frame_side);
        this.f6219n = AbstractC6482g.m5385p(context, R$attr.md_button_height, resources.getDimensionPixelSize(R$dimen.default_md_button_height_phone));
        this.f6222q = new Paint();
        this.f6225t = resources.getDimensionPixelSize(R$dimen.md_divider_height);
        this.f6222q.setColor(AbstractC6482g.m5382m(context, R$attr.md_divider_color));
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        View view = this.f6209d;
        if (view != null) {
            if (this.f6210e) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, r0 - this.f6225t, getMeasuredWidth(), view.getTop(), this.f6222q);
            } else {
                canvas2 = canvas;
            }
            if (this.f6211f) {
                canvas2.drawRect(0.0f, this.f6209d.getBottom(), getMeasuredWidth(), r15 + this.f6225t, this.f6222q);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() == R$id.md_titleFrame) {
                this.f6208c = childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNeutral) {
                this.f6206a[0] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNegative) {
                this.f6206a[1] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultPositive) {
                this.f6206a[2] = (MDButton) childAt;
            } else {
                this.f6209d = childAt;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        int measuredWidth5;
        int measuredWidth6;
        int measuredWidth7;
        int measuredWidth8;
        if (m5631s(this.f6208c)) {
            int measuredHeight = this.f6208c.getMeasuredHeight() + i11;
            this.f6208c.layout(i10, i11, i12, measuredHeight);
            i11 = measuredHeight;
        } else if (!this.f6216k && this.f6214i) {
            i11 += this.f6217l;
        }
        if (m5631s(this.f6209d)) {
            View view = this.f6209d;
            view.layout(i10, i11, i12, view.getMeasuredHeight() + i11);
        }
        if (this.f6213h) {
            int measuredHeight2 = i13 - this.f6218m;
            for (MDButton mDButton : this.f6206a) {
                if (m5631s(mDButton)) {
                    mDButton.layout(i10, measuredHeight2 - mDButton.getMeasuredHeight(), i12, measuredHeight2);
                    measuredHeight2 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            if (this.f6214i) {
                i13 -= this.f6218m;
            }
            int i15 = i13 - this.f6219n;
            int measuredWidth9 = this.f6221p;
            if (m5631s(this.f6206a[2])) {
                if (this.f6220o == GravityEnum.END) {
                    measuredWidth7 = i10 + measuredWidth9;
                    measuredWidth8 = this.f6206a[2].getMeasuredWidth() + measuredWidth7;
                    i14 = -1;
                } else {
                    int i16 = i12 - measuredWidth9;
                    measuredWidth7 = i16 - this.f6206a[2].getMeasuredWidth();
                    measuredWidth8 = i16;
                    i14 = measuredWidth7;
                }
                this.f6206a[2].layout(measuredWidth7, i15, measuredWidth8, i13);
                measuredWidth9 += this.f6206a[2].getMeasuredWidth();
            } else {
                i14 = -1;
            }
            if (m5631s(this.f6206a[1])) {
                GravityEnum gravityEnum = this.f6220o;
                if (gravityEnum == GravityEnum.END) {
                    measuredWidth5 = measuredWidth9 + i10;
                    measuredWidth6 = this.f6206a[1].getMeasuredWidth() + measuredWidth5;
                } else if (gravityEnum == GravityEnum.START) {
                    measuredWidth6 = i12 - measuredWidth9;
                    measuredWidth5 = measuredWidth6 - this.f6206a[1].getMeasuredWidth();
                } else {
                    measuredWidth5 = this.f6221p + i10;
                    measuredWidth6 = this.f6206a[1].getMeasuredWidth() + measuredWidth5;
                    measuredWidth = measuredWidth6;
                    this.f6206a[1].layout(measuredWidth5, i15, measuredWidth6, i13);
                }
                measuredWidth = -1;
                this.f6206a[1].layout(measuredWidth5, i15, measuredWidth6, i13);
            } else {
                measuredWidth = -1;
            }
            if (m5631s(this.f6206a[0])) {
                GravityEnum gravityEnum2 = this.f6220o;
                if (gravityEnum2 == GravityEnum.END) {
                    measuredWidth3 = i12 - this.f6221p;
                    measuredWidth4 = measuredWidth3 - this.f6206a[0].getMeasuredWidth();
                } else if (gravityEnum2 == GravityEnum.START) {
                    measuredWidth4 = i10 + this.f6221p;
                    measuredWidth3 = this.f6206a[0].getMeasuredWidth() + measuredWidth4;
                } else {
                    if (measuredWidth != -1 || i14 == -1) {
                        if (i14 == -1 && measuredWidth != -1) {
                            measuredWidth2 = this.f6206a[0].getMeasuredWidth();
                        } else if (i14 == -1) {
                            measuredWidth = ((i12 - i10) / 2) - (this.f6206a[0].getMeasuredWidth() / 2);
                            measuredWidth2 = this.f6206a[0].getMeasuredWidth();
                        }
                        i14 = measuredWidth + measuredWidth2;
                    } else {
                        measuredWidth = i14 - this.f6206a[0].getMeasuredWidth();
                    }
                    measuredWidth3 = i14;
                    measuredWidth4 = measuredWidth;
                }
                this.f6206a[0].layout(measuredWidth4, i15, measuredWidth3, i13);
            }
        }
        m5638u(this.f6209d, true, true);
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
    public final void m5634p(ViewGroup viewGroup, boolean z9, boolean z10, boolean z11) {
        if (z9 && viewGroup.getChildCount() > 0) {
            View view = this.f6208c;
            this.f6210e = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (!z10 || viewGroup.getChildCount() <= 0) {
            return;
        }
        this.f6211f = z11 && (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom();
    }

    /* renamed from: q */
    public final void m5635q(WebView webView, boolean z9, boolean z10, boolean z11) {
        boolean z12 = false;
        if (z9) {
            View view = this.f6208c;
            this.f6210e = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z10) {
            if (z11 && (webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom() < webView.getContentHeight() * webView.getScale()) {
                z12 = true;
            }
            this.f6211f = z12;
        }
    }

    /* renamed from: r */
    public final void m5636r() {
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int i10 = C6518d.f6238a[this.f6220o.ordinal()];
            if (i10 == 1) {
                this.f6220o = GravityEnum.END;
            } else {
                if (i10 != 2) {
                    return;
                }
                this.f6220o = GravityEnum.START;
            }
        }
    }

    public void setButtonGravity(GravityEnum gravityEnum) {
        this.f6220o = gravityEnum;
        m5636r();
    }

    public void setButtonStackedGravity(GravityEnum gravityEnum) {
        for (MDButton mDButton : this.f6206a) {
            if (mDButton != null) {
                mDButton.setStackedGravity(gravityEnum);
            }
        }
    }

    public void setDividerColor(int i10) {
        this.f6222q.setColor(i10);
        invalidate();
    }

    public void setMaxHeight(int i10) {
        this.f6207b = i10;
    }

    public void setStackingBehavior(StackingBehavior stackingBehavior) {
        this.f6212g = stackingBehavior;
        invalidate();
    }

    /* renamed from: t */
    public void m5637t() {
        this.f6216k = true;
    }

    /* renamed from: u */
    public final void m5638u(View view, boolean z9, boolean z10) {
        if (view == null) {
            return;
        }
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            if (m5627k(scrollView)) {
                m5632h(scrollView, z9, z10);
                return;
            }
            if (z9) {
                this.f6210e = false;
            }
            if (z10) {
                this.f6211f = false;
                return;
            }
            return;
        }
        if (view instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) view;
            if (m5625i(adapterView)) {
                m5632h(adapterView, z9, z10);
                return;
            }
            if (z9) {
                this.f6210e = false;
            }
            if (z10) {
                this.f6211f = false;
                return;
            }
            return;
        }
        if (view instanceof WebView) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC6515a(view, z9, z10));
            return;
        }
        if (view instanceof RecyclerView) {
            boolean zM5626j = m5626j((RecyclerView) view);
            if (z9) {
                this.f6210e = zM5626j;
            }
            if (z10) {
                this.f6211f = zM5626j;
            }
            if (zM5626j) {
                m5632h((ViewGroup) view, z9, z10);
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            View viewM5630n = m5630n(viewGroup);
            m5638u(viewM5630n, z9, z10);
            View viewM5629m = m5629m(viewGroup);
            if (viewM5629m != viewM5630n) {
                m5638u(viewM5629m, false, true);
            }
        }
    }
}
