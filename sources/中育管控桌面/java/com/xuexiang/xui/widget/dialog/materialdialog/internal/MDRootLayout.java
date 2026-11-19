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
import com.xuexiang.xui.utils.AbstractC5859g;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.StackingBehavior;

/* loaded from: classes3.dex */
public class MDRootLayout extends ViewGroup {

    /* renamed from: a */
    public final MDButton[] f4931a;

    /* renamed from: b */
    public int f4932b;

    /* renamed from: c */
    public View f4933c;

    /* renamed from: d */
    public View f4934d;

    /* renamed from: e */
    public boolean f4935e;

    /* renamed from: f */
    public boolean f4936f;

    /* renamed from: g */
    public StackingBehavior f4937g;

    /* renamed from: h */
    public boolean f4938h;

    /* renamed from: i */
    public boolean f4939i;

    /* renamed from: j */
    public boolean f4940j;

    /* renamed from: k */
    public boolean f4941k;

    /* renamed from: l */
    public int f4942l;

    /* renamed from: m */
    public int f4943m;

    /* renamed from: n */
    public int f4944n;

    /* renamed from: o */
    public GravityEnum f4945o;

    /* renamed from: p */
    public int f4946p;

    /* renamed from: q */
    public Paint f4947q;

    /* renamed from: r */
    public ViewTreeObserver.OnScrollChangedListener f4948r;

    /* renamed from: s */
    public ViewTreeObserver.OnScrollChangedListener f4949s;

    /* renamed from: t */
    public int f4950t;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$a */
    public class ViewTreeObserverOnPreDrawListenerC5894a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f4951a;

        /* renamed from: b */
        public final /* synthetic */ boolean f4952b;

        /* renamed from: c */
        public final /* synthetic */ boolean f4953c;

        public ViewTreeObserverOnPreDrawListenerC5894a(View view, boolean z6, boolean z7) {
            this.f4951a = view;
            this.f4952b = z6;
            this.f4953c = z7;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f4951a.getMeasuredHeight() == 0) {
                return true;
            }
            if (MDRootLayout.m4647l((WebView) this.f4951a)) {
                MDRootLayout.this.m4651h((ViewGroup) this.f4951a, this.f4952b, this.f4953c);
            } else {
                if (this.f4952b) {
                    MDRootLayout.this.f4935e = false;
                }
                if (this.f4953c) {
                    MDRootLayout.this.f4936f = false;
                }
            }
            this.f4951a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$b */
    public class C5895b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f4955a;

        /* renamed from: b */
        public final /* synthetic */ boolean f4956b;

        /* renamed from: c */
        public final /* synthetic */ boolean f4957c;

        public C5895b(ViewGroup viewGroup, boolean z6, boolean z7) {
            this.f4955a = viewGroup;
            this.f4956b = z6;
            this.f4957c = z7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i6, int i7) {
            super.onScrolled(recyclerView, i6, i7);
            MDButton[] mDButtonArr = MDRootLayout.this.f4931a;
            int length = mDButtonArr.length;
            boolean z6 = false;
            int i8 = 0;
            while (true) {
                if (i8 < length) {
                    MDButton mDButton = mDButtonArr[i8];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z6 = true;
                        break;
                    }
                    i8++;
                } else {
                    break;
                }
            }
            MDRootLayout.this.m4653p(this.f4955a, this.f4956b, this.f4957c, z6);
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$c */
    public class ViewTreeObserverOnScrollChangedListenerC5896c implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f4959a;

        /* renamed from: b */
        public final /* synthetic */ boolean f4960b;

        /* renamed from: c */
        public final /* synthetic */ boolean f4961c;

        public ViewTreeObserverOnScrollChangedListenerC5896c(ViewGroup viewGroup, boolean z6, boolean z7) {
            this.f4959a = viewGroup;
            this.f4960b = z6;
            this.f4961c = z7;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            MDButton[] mDButtonArr = MDRootLayout.this.f4931a;
            int length = mDButtonArr.length;
            boolean z6 = false;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    MDButton mDButton = mDButtonArr[i6];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z6 = true;
                        break;
                    }
                    i6++;
                } else {
                    break;
                }
            }
            ViewGroup viewGroup = this.f4959a;
            if (viewGroup instanceof WebView) {
                MDRootLayout.this.m4654q((WebView) viewGroup, this.f4960b, this.f4961c, z6);
            } else {
                MDRootLayout.this.m4653p(viewGroup, this.f4960b, this.f4961c, z6);
            }
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$d */
    public static /* synthetic */ class C5897d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4963a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f4963a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4963a[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4931a = new MDButton[3];
        this.f4935e = false;
        this.f4936f = false;
        this.f4937g = StackingBehavior.ADAPTIVE;
        this.f4938h = false;
        this.f4939i = true;
        this.f4945o = GravityEnum.START;
        m4652o(context, attributeSet, 0);
    }

    /* renamed from: i */
    public static boolean m4644i(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        return !(adapterView.getFirstVisiblePosition() == 0) || !(adapterView.getLastVisiblePosition() == adapterView.getCount() - 1) || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    /* renamed from: j */
    public static boolean m4645j(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().canScrollVertically()) ? false : true;
    }

    /* renamed from: k */
    public static boolean m4646k(ScrollView scrollView) {
        if (scrollView.getChildCount() == 0) {
            return false;
        }
        return (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight();
    }

    /* renamed from: l */
    public static boolean m4647l(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    /* renamed from: m */
    public static View m4648m(ViewGroup viewGroup) {
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
    public static View m4649n(ViewGroup viewGroup) {
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
    public static boolean m4650s(View view) {
        boolean z6 = (view == null || view.getVisibility() == 8) ? false : true;
        return (z6 && (view instanceof MDButton)) ? ((MDButton) view).getText().toString().trim().length() > 0 : z6;
    }

    /* renamed from: h */
    public final void m4651h(ViewGroup viewGroup, boolean z6, boolean z7) {
        if ((z7 || this.f4948r != null) && !(z7 && this.f4949s == null)) {
            return;
        }
        if (viewGroup instanceof RecyclerView) {
            C5895b c5895b = new C5895b(viewGroup, z6, z7);
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            recyclerView.addOnScrollListener(c5895b);
            c5895b.onScrolled(recyclerView, 0, 0);
            return;
        }
        ViewTreeObserverOnScrollChangedListenerC5896c viewTreeObserverOnScrollChangedListenerC5896c = new ViewTreeObserverOnScrollChangedListenerC5896c(viewGroup, z6, z7);
        if (z7) {
            this.f4949s = viewTreeObserverOnScrollChangedListenerC5896c;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f4949s);
        } else {
            this.f4948r = viewTreeObserverOnScrollChangedListenerC5896c;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f4948r);
        }
        viewTreeObserverOnScrollChangedListenerC5896c.onScrollChanged();
    }

    /* renamed from: o */
    public final void m4652o(Context context, AttributeSet attributeSet, int i6) {
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MDRootLayout, i6, 0);
        this.f4940j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f4942l = resources.getDimensionPixelSize(R$dimen.md_notitle_vertical_padding);
        this.f4943m = resources.getDimensionPixelSize(R$dimen.md_button_frame_vertical_padding);
        this.f4946p = resources.getDimensionPixelSize(R$dimen.md_button_padding_frame_side);
        this.f4944n = AbstractC5859g.m4390p(context, R$attr.md_button_height, resources.getDimensionPixelSize(R$dimen.default_md_button_height_phone));
        this.f4947q = new Paint();
        this.f4950t = resources.getDimensionPixelSize(R$dimen.md_divider_height);
        this.f4947q.setColor(AbstractC5859g.m4387m(context, R$attr.md_divider_color));
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        View view = this.f4934d;
        if (view != null) {
            if (this.f4935e) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, r0 - this.f4950t, getMeasuredWidth(), view.getTop(), this.f4947q);
            } else {
                canvas2 = canvas;
            }
            if (this.f4936f) {
                canvas2.drawRect(0.0f, this.f4934d.getBottom(), getMeasuredWidth(), r15 + this.f4950t, this.f4947q);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getId() == R$id.md_titleFrame) {
                this.f4933c = childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNeutral) {
                this.f4931a[0] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNegative) {
                this.f4931a[1] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultPositive) {
                this.f4931a[2] = (MDButton) childAt;
            } else {
                this.f4934d = childAt;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int i10;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        int measuredWidth5;
        int measuredWidth6;
        int measuredWidth7;
        int measuredWidth8;
        if (m4650s(this.f4933c)) {
            int measuredHeight = this.f4933c.getMeasuredHeight() + i7;
            this.f4933c.layout(i6, i7, i8, measuredHeight);
            i7 = measuredHeight;
        } else if (!this.f4941k && this.f4939i) {
            i7 += this.f4942l;
        }
        if (m4650s(this.f4934d)) {
            View view = this.f4934d;
            view.layout(i6, i7, i8, view.getMeasuredHeight() + i7);
        }
        if (this.f4938h) {
            int measuredHeight2 = i9 - this.f4943m;
            for (MDButton mDButton : this.f4931a) {
                if (m4650s(mDButton)) {
                    mDButton.layout(i6, measuredHeight2 - mDButton.getMeasuredHeight(), i8, measuredHeight2);
                    measuredHeight2 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            if (this.f4939i) {
                i9 -= this.f4943m;
            }
            int i11 = i9 - this.f4944n;
            int measuredWidth9 = this.f4946p;
            if (m4650s(this.f4931a[2])) {
                if (this.f4945o == GravityEnum.END) {
                    measuredWidth7 = i6 + measuredWidth9;
                    measuredWidth8 = this.f4931a[2].getMeasuredWidth() + measuredWidth7;
                    i10 = -1;
                } else {
                    int i12 = i8 - measuredWidth9;
                    measuredWidth7 = i12 - this.f4931a[2].getMeasuredWidth();
                    measuredWidth8 = i12;
                    i10 = measuredWidth7;
                }
                this.f4931a[2].layout(measuredWidth7, i11, measuredWidth8, i9);
                measuredWidth9 += this.f4931a[2].getMeasuredWidth();
            } else {
                i10 = -1;
            }
            if (m4650s(this.f4931a[1])) {
                GravityEnum gravityEnum = this.f4945o;
                if (gravityEnum == GravityEnum.END) {
                    measuredWidth5 = measuredWidth9 + i6;
                    measuredWidth6 = this.f4931a[1].getMeasuredWidth() + measuredWidth5;
                } else if (gravityEnum == GravityEnum.START) {
                    measuredWidth6 = i8 - measuredWidth9;
                    measuredWidth5 = measuredWidth6 - this.f4931a[1].getMeasuredWidth();
                } else {
                    measuredWidth5 = this.f4946p + i6;
                    measuredWidth6 = this.f4931a[1].getMeasuredWidth() + measuredWidth5;
                    measuredWidth = measuredWidth6;
                    this.f4931a[1].layout(measuredWidth5, i11, measuredWidth6, i9);
                }
                measuredWidth = -1;
                this.f4931a[1].layout(measuredWidth5, i11, measuredWidth6, i9);
            } else {
                measuredWidth = -1;
            }
            if (m4650s(this.f4931a[0])) {
                GravityEnum gravityEnum2 = this.f4945o;
                if (gravityEnum2 == GravityEnum.END) {
                    measuredWidth3 = i8 - this.f4946p;
                    measuredWidth4 = measuredWidth3 - this.f4931a[0].getMeasuredWidth();
                } else if (gravityEnum2 == GravityEnum.START) {
                    measuredWidth4 = i6 + this.f4946p;
                    measuredWidth3 = this.f4931a[0].getMeasuredWidth() + measuredWidth4;
                } else {
                    if (measuredWidth != -1 || i10 == -1) {
                        if (i10 == -1 && measuredWidth != -1) {
                            measuredWidth2 = this.f4931a[0].getMeasuredWidth();
                        } else if (i10 == -1) {
                            measuredWidth = ((i8 - i6) / 2) - (this.f4931a[0].getMeasuredWidth() / 2);
                            measuredWidth2 = this.f4931a[0].getMeasuredWidth();
                        }
                        i10 = measuredWidth + measuredWidth2;
                    } else {
                        measuredWidth = i10 - this.f4931a[0].getMeasuredWidth();
                    }
                    measuredWidth3 = i10;
                    measuredWidth4 = measuredWidth;
                }
                this.f4931a[0].layout(measuredWidth4, i11, measuredWidth3, i9);
            }
        }
        m4657u(this.f4934d, true, true);
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
    public final void m4653p(ViewGroup viewGroup, boolean z6, boolean z7, boolean z8) {
        if (z6 && viewGroup.getChildCount() > 0) {
            View view = this.f4933c;
            this.f4935e = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (!z7 || viewGroup.getChildCount() <= 0) {
            return;
        }
        this.f4936f = z8 && (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom();
    }

    /* renamed from: q */
    public final void m4654q(WebView webView, boolean z6, boolean z7, boolean z8) {
        boolean z9 = false;
        if (z6) {
            View view = this.f4933c;
            this.f4935e = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z7) {
            if (z8 && (webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom() < webView.getContentHeight() * webView.getScale()) {
                z9 = true;
            }
            this.f4936f = z9;
        }
    }

    /* renamed from: r */
    public final void m4655r() {
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int i6 = C5897d.f4963a[this.f4945o.ordinal()];
            if (i6 == 1) {
                this.f4945o = GravityEnum.END;
            } else {
                if (i6 != 2) {
                    return;
                }
                this.f4945o = GravityEnum.START;
            }
        }
    }

    public void setButtonGravity(GravityEnum gravityEnum) {
        this.f4945o = gravityEnum;
        m4655r();
    }

    public void setButtonStackedGravity(GravityEnum gravityEnum) {
        for (MDButton mDButton : this.f4931a) {
            if (mDButton != null) {
                mDButton.setStackedGravity(gravityEnum);
            }
        }
    }

    public void setDividerColor(int i6) {
        this.f4947q.setColor(i6);
        invalidate();
    }

    public void setMaxHeight(int i6) {
        this.f4932b = i6;
    }

    public void setStackingBehavior(StackingBehavior stackingBehavior) {
        this.f4937g = stackingBehavior;
        invalidate();
    }

    /* renamed from: t */
    public void m4656t() {
        this.f4941k = true;
    }

    /* renamed from: u */
    public final void m4657u(View view, boolean z6, boolean z7) {
        if (view == null) {
            return;
        }
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            if (m4646k(scrollView)) {
                m4651h(scrollView, z6, z7);
                return;
            }
            if (z6) {
                this.f4935e = false;
            }
            if (z7) {
                this.f4936f = false;
                return;
            }
            return;
        }
        if (view instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) view;
            if (m4644i(adapterView)) {
                m4651h(adapterView, z6, z7);
                return;
            }
            if (z6) {
                this.f4935e = false;
            }
            if (z7) {
                this.f4936f = false;
                return;
            }
            return;
        }
        if (view instanceof WebView) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC5894a(view, z6, z7));
            return;
        }
        if (view instanceof RecyclerView) {
            boolean zM4645j = m4645j((RecyclerView) view);
            if (z6) {
                this.f4935e = zM4645j;
            }
            if (z7) {
                this.f4936f = zM4645j;
            }
            if (zM4645j) {
                m4651h((ViewGroup) view, z6, z7);
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            View viewM4649n = m4649n(viewGroup);
            m4657u(viewM4649n, z6, z7);
            View viewM4648m = m4648m(viewGroup);
            if (viewM4648m != viewM4649n) {
                m4657u(viewM4648m, false, true);
            }
        }
    }
}
