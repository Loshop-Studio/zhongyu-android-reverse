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
import com.xuexiang.xui.utils.AbstractC6877g;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.StackingBehavior;

/* loaded from: classes4.dex */
public class MDRootLayout extends ViewGroup {

    /* renamed from: a */
    public final MDButton[] f7593a;

    /* renamed from: b */
    public int f7594b;

    /* renamed from: c */
    public View f7595c;

    /* renamed from: d */
    public View f7596d;

    /* renamed from: e */
    public boolean f7597e;

    /* renamed from: f */
    public boolean f7598f;

    /* renamed from: g */
    public StackingBehavior f7599g;

    /* renamed from: h */
    public boolean f7600h;

    /* renamed from: i */
    public boolean f7601i;

    /* renamed from: j */
    public boolean f7602j;

    /* renamed from: k */
    public boolean f7603k;

    /* renamed from: l */
    public int f7604l;

    /* renamed from: m */
    public int f7605m;

    /* renamed from: n */
    public int f7606n;

    /* renamed from: o */
    public GravityEnum f7607o;

    /* renamed from: p */
    public int f7608p;

    /* renamed from: q */
    public Paint f7609q;

    /* renamed from: r */
    public ViewTreeObserver.OnScrollChangedListener f7610r;

    /* renamed from: s */
    public ViewTreeObserver.OnScrollChangedListener f7611s;

    /* renamed from: t */
    public int f7612t;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$a */
    public class ViewTreeObserverOnPreDrawListenerC6918a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f7613a;

        /* renamed from: b */
        public final /* synthetic */ boolean f7614b;

        /* renamed from: c */
        public final /* synthetic */ boolean f7615c;

        public ViewTreeObserverOnPreDrawListenerC6918a(View view, boolean z10, boolean z11) {
            this.f7613a = view;
            this.f7614b = z10;
            this.f7615c = z11;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f7613a.getMeasuredHeight() == 0) {
                return true;
            }
            if (MDRootLayout.m6791l((WebView) this.f7613a)) {
                MDRootLayout.this.m6795h((ViewGroup) this.f7613a, this.f7614b, this.f7615c);
            } else {
                if (this.f7614b) {
                    MDRootLayout.this.f7597e = false;
                }
                if (this.f7615c) {
                    MDRootLayout.this.f7598f = false;
                }
            }
            this.f7613a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$b */
    public class C6919b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f7617a;

        /* renamed from: b */
        public final /* synthetic */ boolean f7618b;

        /* renamed from: c */
        public final /* synthetic */ boolean f7619c;

        public C6919b(ViewGroup viewGroup, boolean z10, boolean z11) {
            this.f7617a = viewGroup;
            this.f7618b = z10;
            this.f7619c = z11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            super.onScrolled(recyclerView, i10, i11);
            MDButton[] mDButtonArr = MDRootLayout.this.f7593a;
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
            MDRootLayout.this.m6797p(this.f7617a, this.f7618b, this.f7619c, z10);
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$c */
    public class ViewTreeObserverOnScrollChangedListenerC6920c implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f7621a;

        /* renamed from: b */
        public final /* synthetic */ boolean f7622b;

        /* renamed from: c */
        public final /* synthetic */ boolean f7623c;

        public ViewTreeObserverOnScrollChangedListenerC6920c(ViewGroup viewGroup, boolean z10, boolean z11) {
            this.f7621a = viewGroup;
            this.f7622b = z10;
            this.f7623c = z11;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            MDButton[] mDButtonArr = MDRootLayout.this.f7593a;
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
            ViewGroup viewGroup = this.f7621a;
            if (viewGroup instanceof WebView) {
                MDRootLayout.this.m6798q((WebView) viewGroup, this.f7622b, this.f7623c, z10);
            } else {
                MDRootLayout.this.m6797p(viewGroup, this.f7622b, this.f7623c, z10);
            }
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$d */
    public static /* synthetic */ class C6921d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7625a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f7625a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7625a[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f7593a = new MDButton[3];
        this.f7597e = false;
        this.f7598f = false;
        this.f7599g = StackingBehavior.ADAPTIVE;
        this.f7600h = false;
        this.f7601i = true;
        this.f7607o = GravityEnum.START;
        m6796o(context, attributeSet, 0);
    }

    /* renamed from: i */
    public static boolean m6788i(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        return !(adapterView.getFirstVisiblePosition() == 0) || !(adapterView.getLastVisiblePosition() == adapterView.getCount() - 1) || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    /* renamed from: j */
    public static boolean m6789j(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().canScrollVertically()) ? false : true;
    }

    /* renamed from: k */
    public static boolean m6790k(ScrollView scrollView) {
        if (scrollView.getChildCount() == 0) {
            return false;
        }
        return (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight();
    }

    /* renamed from: l */
    public static boolean m6791l(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    /* renamed from: m */
    public static View m6792m(ViewGroup viewGroup) {
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
    public static View m6793n(ViewGroup viewGroup) {
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
    public static boolean m6794s(View view) {
        boolean z10 = (view == null || view.getVisibility() == 8) ? false : true;
        return (z10 && (view instanceof MDButton)) ? ((MDButton) view).getText().toString().trim().length() > 0 : z10;
    }

    /* renamed from: h */
    public final void m6795h(ViewGroup viewGroup, boolean z10, boolean z11) {
        if ((z11 || this.f7610r != null) && !(z11 && this.f7611s == null)) {
            return;
        }
        if (viewGroup instanceof RecyclerView) {
            C6919b c6919b = new C6919b(viewGroup, z10, z11);
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            recyclerView.addOnScrollListener(c6919b);
            c6919b.onScrolled(recyclerView, 0, 0);
            return;
        }
        ViewTreeObserverOnScrollChangedListenerC6920c viewTreeObserverOnScrollChangedListenerC6920c = new ViewTreeObserverOnScrollChangedListenerC6920c(viewGroup, z10, z11);
        if (z11) {
            this.f7611s = viewTreeObserverOnScrollChangedListenerC6920c;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f7611s);
        } else {
            this.f7610r = viewTreeObserverOnScrollChangedListenerC6920c;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f7610r);
        }
        viewTreeObserverOnScrollChangedListenerC6920c.onScrollChanged();
    }

    /* renamed from: o */
    public final void m6796o(Context context, AttributeSet attributeSet, int i10) {
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MDRootLayout, i10, 0);
        this.f7602j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f7604l = resources.getDimensionPixelSize(R$dimen.md_notitle_vertical_padding);
        this.f7605m = resources.getDimensionPixelSize(R$dimen.md_button_frame_vertical_padding);
        this.f7608p = resources.getDimensionPixelSize(R$dimen.md_button_padding_frame_side);
        this.f7606n = AbstractC6877g.m6482p(context, R$attr.md_button_height, resources.getDimensionPixelSize(R$dimen.default_md_button_height_phone));
        this.f7609q = new Paint();
        this.f7612t = resources.getDimensionPixelSize(R$dimen.md_divider_height);
        this.f7609q.setColor(AbstractC6877g.m6479m(context, R$attr.md_divider_color));
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        View view = this.f7596d;
        if (view != null) {
            if (this.f7597e) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, r0 - this.f7612t, getMeasuredWidth(), view.getTop(), this.f7609q);
            } else {
                canvas2 = canvas;
            }
            if (this.f7598f) {
                canvas2.drawRect(0.0f, this.f7596d.getBottom(), getMeasuredWidth(), r15 + this.f7612t, this.f7609q);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() == R$id.md_titleFrame) {
                this.f7595c = childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNeutral) {
                this.f7593a[0] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNegative) {
                this.f7593a[1] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultPositive) {
                this.f7593a[2] = (MDButton) childAt;
            } else {
                this.f7596d = childAt;
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
        if (m6794s(this.f7595c)) {
            int measuredHeight = this.f7595c.getMeasuredHeight() + i11;
            this.f7595c.layout(i10, i11, i12, measuredHeight);
            i11 = measuredHeight;
        } else if (!this.f7603k && this.f7601i) {
            i11 += this.f7604l;
        }
        if (m6794s(this.f7596d)) {
            View view = this.f7596d;
            view.layout(i10, i11, i12, view.getMeasuredHeight() + i11);
        }
        if (this.f7600h) {
            int measuredHeight2 = i13 - this.f7605m;
            for (MDButton mDButton : this.f7593a) {
                if (m6794s(mDButton)) {
                    mDButton.layout(i10, measuredHeight2 - mDButton.getMeasuredHeight(), i12, measuredHeight2);
                    measuredHeight2 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            if (this.f7601i) {
                i13 -= this.f7605m;
            }
            int i15 = i13 - this.f7606n;
            int measuredWidth9 = this.f7608p;
            if (m6794s(this.f7593a[2])) {
                if (this.f7607o == GravityEnum.END) {
                    measuredWidth7 = i10 + measuredWidth9;
                    measuredWidth8 = this.f7593a[2].getMeasuredWidth() + measuredWidth7;
                    i14 = -1;
                } else {
                    int i16 = i12 - measuredWidth9;
                    measuredWidth7 = i16 - this.f7593a[2].getMeasuredWidth();
                    measuredWidth8 = i16;
                    i14 = measuredWidth7;
                }
                this.f7593a[2].layout(measuredWidth7, i15, measuredWidth8, i13);
                measuredWidth9 += this.f7593a[2].getMeasuredWidth();
            } else {
                i14 = -1;
            }
            if (m6794s(this.f7593a[1])) {
                GravityEnum gravityEnum = this.f7607o;
                if (gravityEnum == GravityEnum.END) {
                    measuredWidth5 = measuredWidth9 + i10;
                    measuredWidth6 = this.f7593a[1].getMeasuredWidth() + measuredWidth5;
                } else if (gravityEnum == GravityEnum.START) {
                    measuredWidth6 = i12 - measuredWidth9;
                    measuredWidth5 = measuredWidth6 - this.f7593a[1].getMeasuredWidth();
                } else {
                    measuredWidth5 = this.f7608p + i10;
                    measuredWidth6 = this.f7593a[1].getMeasuredWidth() + measuredWidth5;
                    measuredWidth = measuredWidth6;
                    this.f7593a[1].layout(measuredWidth5, i15, measuredWidth6, i13);
                }
                measuredWidth = -1;
                this.f7593a[1].layout(measuredWidth5, i15, measuredWidth6, i13);
            } else {
                measuredWidth = -1;
            }
            if (m6794s(this.f7593a[0])) {
                GravityEnum gravityEnum2 = this.f7607o;
                if (gravityEnum2 == GravityEnum.END) {
                    measuredWidth3 = i12 - this.f7608p;
                    measuredWidth4 = measuredWidth3 - this.f7593a[0].getMeasuredWidth();
                } else if (gravityEnum2 == GravityEnum.START) {
                    measuredWidth4 = i10 + this.f7608p;
                    measuredWidth3 = this.f7593a[0].getMeasuredWidth() + measuredWidth4;
                } else {
                    if (measuredWidth != -1 || i14 == -1) {
                        if (i14 == -1 && measuredWidth != -1) {
                            measuredWidth2 = this.f7593a[0].getMeasuredWidth();
                        } else if (i14 == -1) {
                            measuredWidth = ((i12 - i10) / 2) - (this.f7593a[0].getMeasuredWidth() / 2);
                            measuredWidth2 = this.f7593a[0].getMeasuredWidth();
                        }
                        i14 = measuredWidth + measuredWidth2;
                    } else {
                        measuredWidth = i14 - this.f7593a[0].getMeasuredWidth();
                    }
                    measuredWidth3 = i14;
                    measuredWidth4 = measuredWidth;
                }
                this.f7593a[0].layout(measuredWidth4, i15, measuredWidth3, i13);
            }
        }
        m6801u(this.f7596d, true, true);
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
    public final void m6797p(ViewGroup viewGroup, boolean z10, boolean z11, boolean z12) {
        if (z10 && viewGroup.getChildCount() > 0) {
            View view = this.f7595c;
            this.f7597e = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (!z11 || viewGroup.getChildCount() <= 0) {
            return;
        }
        this.f7598f = z12 && (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom();
    }

    /* renamed from: q */
    public final void m6798q(WebView webView, boolean z10, boolean z11, boolean z12) {
        boolean z13 = false;
        if (z10) {
            View view = this.f7595c;
            this.f7597e = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z11) {
            if (z12 && (webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom() < webView.getContentHeight() * webView.getScale()) {
                z13 = true;
            }
            this.f7598f = z13;
        }
    }

    /* renamed from: r */
    public final void m6799r() {
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int i10 = C6921d.f7625a[this.f7607o.ordinal()];
            if (i10 == 1) {
                this.f7607o = GravityEnum.END;
            } else {
                if (i10 != 2) {
                    return;
                }
                this.f7607o = GravityEnum.START;
            }
        }
    }

    public void setButtonGravity(GravityEnum gravityEnum) {
        this.f7607o = gravityEnum;
        m6799r();
    }

    public void setButtonStackedGravity(GravityEnum gravityEnum) {
        for (MDButton mDButton : this.f7593a) {
            if (mDButton != null) {
                mDButton.setStackedGravity(gravityEnum);
            }
        }
    }

    public void setDividerColor(int i10) {
        this.f7609q.setColor(i10);
        invalidate();
    }

    public void setMaxHeight(int i10) {
        this.f7594b = i10;
    }

    public void setStackingBehavior(StackingBehavior stackingBehavior) {
        this.f7599g = stackingBehavior;
        invalidate();
    }

    /* renamed from: t */
    public void m6800t() {
        this.f7603k = true;
    }

    /* renamed from: u */
    public final void m6801u(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            if (m6790k(scrollView)) {
                m6795h(scrollView, z10, z11);
                return;
            }
            if (z10) {
                this.f7597e = false;
            }
            if (z11) {
                this.f7598f = false;
                return;
            }
            return;
        }
        if (view instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) view;
            if (m6788i(adapterView)) {
                m6795h(adapterView, z10, z11);
                return;
            }
            if (z10) {
                this.f7597e = false;
            }
            if (z11) {
                this.f7598f = false;
                return;
            }
            return;
        }
        if (view instanceof WebView) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC6918a(view, z10, z11));
            return;
        }
        if (view instanceof RecyclerView) {
            boolean zM6789j = m6789j((RecyclerView) view);
            if (z10) {
                this.f7597e = zM6789j;
            }
            if (z11) {
                this.f7598f = zM6789j;
            }
            if (zM6789j) {
                m6795h((ViewGroup) view, z10, z11);
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            View viewM6793n = m6793n(viewGroup);
            m6801u(viewM6793n, z10, z11);
            View viewM6792m = m6792m(viewGroup);
            if (viewM6792m != viewM6793n) {
                m6801u(viewM6792m, false, true);
            }
        }
    }
}
