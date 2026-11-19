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
import com.xuexiang.xui.utils.AbstractC3531f;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.StackingBehavior;

/* loaded from: classes2.dex */
public class MDRootLayout extends ViewGroup {

    /* renamed from: a */
    public final MDButton[] f3411a;

    /* renamed from: b */
    public int f3412b;

    /* renamed from: c */
    public View f3413c;

    /* renamed from: d */
    public View f3414d;

    /* renamed from: e */
    public boolean f3415e;

    /* renamed from: f */
    public boolean f3416f;

    /* renamed from: g */
    public StackingBehavior f3417g;

    /* renamed from: h */
    public boolean f3418h;

    /* renamed from: i */
    public boolean f3419i;

    /* renamed from: j */
    public boolean f3420j;

    /* renamed from: k */
    public boolean f3421k;

    /* renamed from: l */
    public int f3422l;

    /* renamed from: m */
    public int f3423m;

    /* renamed from: n */
    public int f3424n;

    /* renamed from: o */
    public GravityEnum f3425o;

    /* renamed from: p */
    public int f3426p;

    /* renamed from: q */
    public Paint f3427q;

    /* renamed from: r */
    public ViewTreeObserver.OnScrollChangedListener f3428r;

    /* renamed from: s */
    public ViewTreeObserver.OnScrollChangedListener f3429s;

    /* renamed from: t */
    public int f3430t;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$a */
    public class ViewTreeObserverOnPreDrawListenerC3555a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f3431a;

        /* renamed from: b */
        public final /* synthetic */ boolean f3432b;

        /* renamed from: c */
        public final /* synthetic */ boolean f3433c;

        public ViewTreeObserverOnPreDrawListenerC3555a(View view, boolean z3, boolean z4) {
            this.f3431a = view;
            this.f3432b = z3;
            this.f3433c = z4;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f3431a.getMeasuredHeight() == 0) {
                return true;
            }
            if (MDRootLayout.m4271l((WebView) this.f3431a)) {
                MDRootLayout.this.m4275h((ViewGroup) this.f3431a, this.f3432b, this.f3433c);
            } else {
                if (this.f3432b) {
                    MDRootLayout.this.f3415e = false;
                }
                if (this.f3433c) {
                    MDRootLayout.this.f3416f = false;
                }
            }
            this.f3431a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$b */
    public class C3556b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f3435a;

        /* renamed from: b */
        public final /* synthetic */ boolean f3436b;

        /* renamed from: c */
        public final /* synthetic */ boolean f3437c;

        public C3556b(ViewGroup viewGroup, boolean z3, boolean z4) {
            this.f3435a = viewGroup;
            this.f3436b = z3;
            this.f3437c = z4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
            MDButton[] mDButtonArr = MDRootLayout.this.f3411a;
            int length = mDButtonArr.length;
            boolean z3 = false;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    MDButton mDButton = mDButtonArr[i6];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z3 = true;
                        break;
                    }
                    i6++;
                } else {
                    break;
                }
            }
            MDRootLayout.this.m4277p(this.f3435a, this.f3436b, this.f3437c, z3);
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$c */
    public class ViewTreeObserverOnScrollChangedListenerC3557c implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f3439a;

        /* renamed from: b */
        public final /* synthetic */ boolean f3440b;

        /* renamed from: c */
        public final /* synthetic */ boolean f3441c;

        public ViewTreeObserverOnScrollChangedListenerC3557c(ViewGroup viewGroup, boolean z3, boolean z4) {
            this.f3439a = viewGroup;
            this.f3440b = z3;
            this.f3441c = z4;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            MDButton[] mDButtonArr = MDRootLayout.this.f3411a;
            int length = mDButtonArr.length;
            boolean z3 = false;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    MDButton mDButton = mDButtonArr[i4];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z3 = true;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            ViewGroup viewGroup = this.f3439a;
            if (viewGroup instanceof WebView) {
                MDRootLayout.this.m4278q((WebView) viewGroup, this.f3440b, this.f3441c, z3);
            } else {
                MDRootLayout.this.m4277p(viewGroup, this.f3440b, this.f3441c, z3);
            }
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$d */
    public static /* synthetic */ class C3558d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3443a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f3443a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3443a[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3411a = new MDButton[3];
        this.f3415e = false;
        this.f3416f = false;
        this.f3417g = StackingBehavior.ADAPTIVE;
        this.f3418h = false;
        this.f3419i = true;
        this.f3425o = GravityEnum.START;
        m4276o(context, attributeSet, 0);
    }

    /* renamed from: i */
    public static boolean m4268i(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        return !(adapterView.getFirstVisiblePosition() == 0) || !(adapterView.getLastVisiblePosition() == adapterView.getCount() - 1) || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    /* renamed from: j */
    public static boolean m4269j(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().canScrollVertically()) ? false : true;
    }

    /* renamed from: k */
    public static boolean m4270k(ScrollView scrollView) {
        if (scrollView.getChildCount() == 0) {
            return false;
        }
        return (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight();
    }

    /* renamed from: l */
    public static boolean m4271l(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    /* renamed from: m */
    public static View m4272m(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getBottom() == viewGroup.getMeasuredHeight()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: n */
    public static View m4273n(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: s */
    public static boolean m4274s(View view) {
        boolean z3 = (view == null || view.getVisibility() == 8) ? false : true;
        if (z3 && (view instanceof MDButton)) {
            return ((MDButton) view).getText().toString().trim().length() > 0;
        }
        return z3;
    }

    /* renamed from: h */
    public final void m4275h(ViewGroup viewGroup, boolean z3, boolean z4) {
        if ((z4 || this.f3428r != null) && !(z4 && this.f3429s == null)) {
            return;
        }
        if (viewGroup instanceof RecyclerView) {
            C3556b c3556b = new C3556b(viewGroup, z3, z4);
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            recyclerView.addOnScrollListener(c3556b);
            c3556b.onScrolled(recyclerView, 0, 0);
            return;
        }
        ViewTreeObserverOnScrollChangedListenerC3557c viewTreeObserverOnScrollChangedListenerC3557c = new ViewTreeObserverOnScrollChangedListenerC3557c(viewGroup, z3, z4);
        if (z4) {
            this.f3429s = viewTreeObserverOnScrollChangedListenerC3557c;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f3429s);
        } else {
            this.f3428r = viewTreeObserverOnScrollChangedListenerC3557c;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f3428r);
        }
        viewTreeObserverOnScrollChangedListenerC3557c.onScrollChanged();
    }

    /* renamed from: o */
    public final void m4276o(Context context, AttributeSet attributeSet, int i4) {
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MDRootLayout, i4, 0);
        this.f3420j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f3422l = resources.getDimensionPixelSize(R$dimen.md_notitle_vertical_padding);
        this.f3423m = resources.getDimensionPixelSize(R$dimen.md_button_frame_vertical_padding);
        this.f3426p = resources.getDimensionPixelSize(R$dimen.md_button_padding_frame_side);
        this.f3424n = AbstractC3531f.m4074g(context, R$attr.md_button_height, resources.getDimensionPixelSize(R$dimen.default_md_button_height_phone));
        this.f3427q = new Paint();
        this.f3430t = resources.getDimensionPixelSize(R$dimen.md_divider_height);
        this.f3427q.setColor(AbstractC3531f.m4071d(context, R$attr.md_divider_color));
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.f3414d;
        if (view != null) {
            if (this.f3415e) {
                canvas.drawRect(0.0f, r0 - this.f3430t, getMeasuredWidth(), view.getTop(), this.f3427q);
            }
            if (this.f3416f) {
                canvas.drawRect(0.0f, this.f3414d.getBottom(), getMeasuredWidth(), r0 + this.f3430t, this.f3427q);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getId() == R$id.md_titleFrame) {
                this.f3413c = childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNeutral) {
                this.f3411a[0] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNegative) {
                this.f3411a[1] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultPositive) {
                this.f3411a[2] = (MDButton) childAt;
            } else {
                this.f3414d = childAt;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int i8;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        int measuredWidth5;
        int measuredWidth6;
        int measuredWidth7;
        int measuredWidth8;
        if (m4274s(this.f3413c)) {
            int measuredHeight = this.f3413c.getMeasuredHeight() + i5;
            this.f3413c.layout(i4, i5, i6, measuredHeight);
            i5 = measuredHeight;
        } else if (!this.f3421k && this.f3419i) {
            i5 += this.f3422l;
        }
        if (m4274s(this.f3414d)) {
            View view = this.f3414d;
            view.layout(i4, i5, i6, view.getMeasuredHeight() + i5);
        }
        if (this.f3418h) {
            int measuredHeight2 = i7 - this.f3423m;
            for (MDButton mDButton : this.f3411a) {
                if (m4274s(mDButton)) {
                    mDButton.layout(i4, measuredHeight2 - mDButton.getMeasuredHeight(), i6, measuredHeight2);
                    measuredHeight2 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            if (this.f3419i) {
                i7 -= this.f3423m;
            }
            int i9 = i7 - this.f3424n;
            int measuredWidth9 = this.f3426p;
            if (m4274s(this.f3411a[2])) {
                if (this.f3425o == GravityEnum.END) {
                    measuredWidth7 = i4 + measuredWidth9;
                    measuredWidth8 = this.f3411a[2].getMeasuredWidth() + measuredWidth7;
                    i8 = -1;
                } else {
                    int i10 = i6 - measuredWidth9;
                    measuredWidth7 = i10 - this.f3411a[2].getMeasuredWidth();
                    measuredWidth8 = i10;
                    i8 = measuredWidth7;
                }
                this.f3411a[2].layout(measuredWidth7, i9, measuredWidth8, i7);
                measuredWidth9 += this.f3411a[2].getMeasuredWidth();
            } else {
                i8 = -1;
            }
            if (m4274s(this.f3411a[1])) {
                GravityEnum gravityEnum = this.f3425o;
                if (gravityEnum == GravityEnum.END) {
                    measuredWidth5 = measuredWidth9 + i4;
                    measuredWidth6 = this.f3411a[1].getMeasuredWidth() + measuredWidth5;
                } else if (gravityEnum == GravityEnum.START) {
                    measuredWidth6 = i6 - measuredWidth9;
                    measuredWidth5 = measuredWidth6 - this.f3411a[1].getMeasuredWidth();
                } else {
                    measuredWidth5 = this.f3426p + i4;
                    measuredWidth6 = this.f3411a[1].getMeasuredWidth() + measuredWidth5;
                    measuredWidth = measuredWidth6;
                    this.f3411a[1].layout(measuredWidth5, i9, measuredWidth6, i7);
                }
                measuredWidth = -1;
                this.f3411a[1].layout(measuredWidth5, i9, measuredWidth6, i7);
            } else {
                measuredWidth = -1;
            }
            if (m4274s(this.f3411a[0])) {
                GravityEnum gravityEnum2 = this.f3425o;
                if (gravityEnum2 == GravityEnum.END) {
                    measuredWidth3 = i6 - this.f3426p;
                    measuredWidth4 = measuredWidth3 - this.f3411a[0].getMeasuredWidth();
                } else if (gravityEnum2 == GravityEnum.START) {
                    measuredWidth4 = i4 + this.f3426p;
                    measuredWidth3 = this.f3411a[0].getMeasuredWidth() + measuredWidth4;
                } else {
                    if (measuredWidth != -1 || i8 == -1) {
                        if (i8 == -1 && measuredWidth != -1) {
                            measuredWidth2 = this.f3411a[0].getMeasuredWidth();
                        } else if (i8 == -1) {
                            measuredWidth = ((i6 - i4) / 2) - (this.f3411a[0].getMeasuredWidth() / 2);
                            measuredWidth2 = this.f3411a[0].getMeasuredWidth();
                        }
                        i8 = measuredWidth + measuredWidth2;
                    } else {
                        measuredWidth = i8 - this.f3411a[0].getMeasuredWidth();
                    }
                    measuredWidth3 = i8;
                    measuredWidth4 = measuredWidth;
                }
                this.f3411a[0].layout(measuredWidth4, i9, measuredWidth3, i7);
            }
        }
        m4280t(this.f3414d, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout.onMeasure(int, int):void");
    }

    /* renamed from: p */
    public final void m4277p(ViewGroup viewGroup, boolean z3, boolean z4, boolean z5) {
        if (z3 && viewGroup.getChildCount() > 0) {
            View view = this.f3413c;
            this.f3415e = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (!z4 || viewGroup.getChildCount() <= 0) {
            return;
        }
        this.f3416f = z5 && (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom();
    }

    /* renamed from: q */
    public final void m4278q(WebView webView, boolean z3, boolean z4, boolean z5) {
        if (z3) {
            View view = this.f3413c;
            this.f3415e = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z4) {
            this.f3416f = z5 && ((float) ((webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom())) < ((float) webView.getContentHeight()) * webView.getScale();
        }
    }

    /* renamed from: r */
    public final void m4279r() {
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int i4 = C3558d.f3443a[this.f3425o.ordinal()];
            if (i4 == 1) {
                this.f3425o = GravityEnum.END;
            } else {
                if (i4 != 2) {
                    return;
                }
                this.f3425o = GravityEnum.START;
            }
        }
    }

    public void setButtonGravity(GravityEnum gravityEnum) {
        this.f3425o = gravityEnum;
        m4279r();
    }

    public void setButtonStackedGravity(GravityEnum gravityEnum) {
        for (MDButton mDButton : this.f3411a) {
            if (mDButton != null) {
                mDButton.setStackedGravity(gravityEnum);
            }
        }
    }

    public void setDividerColor(int i4) {
        this.f3427q.setColor(i4);
        invalidate();
    }

    public void setMaxHeight(int i4) {
        this.f3412b = i4;
    }

    public void setStackingBehavior(StackingBehavior stackingBehavior) {
        this.f3417g = stackingBehavior;
        invalidate();
    }

    /* renamed from: t */
    public final void m4280t(View view, boolean z3, boolean z4) {
        if (view == null) {
            return;
        }
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            if (m4270k(scrollView)) {
                m4275h(scrollView, z3, z4);
                return;
            }
            if (z3) {
                this.f3415e = false;
            }
            if (z4) {
                this.f3416f = false;
                return;
            }
            return;
        }
        if (view instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) view;
            if (m4268i(adapterView)) {
                m4275h(adapterView, z3, z4);
                return;
            }
            if (z3) {
                this.f3415e = false;
            }
            if (z4) {
                this.f3416f = false;
                return;
            }
            return;
        }
        if (view instanceof WebView) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC3555a(view, z3, z4));
            return;
        }
        if (view instanceof RecyclerView) {
            boolean zM4269j = m4269j((RecyclerView) view);
            if (z3) {
                this.f3415e = zM4269j;
            }
            if (z4) {
                this.f3416f = zM4269j;
            }
            if (zM4269j) {
                m4275h((ViewGroup) view, z3, z4);
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            View viewM4273n = m4273n(viewGroup);
            m4280t(viewM4273n, z3, z4);
            View viewM4272m = m4272m(viewGroup);
            if (viewM4272m != viewM4273n) {
                m4280t(viewM4272m, false, true);
            }
        }
    }
}
