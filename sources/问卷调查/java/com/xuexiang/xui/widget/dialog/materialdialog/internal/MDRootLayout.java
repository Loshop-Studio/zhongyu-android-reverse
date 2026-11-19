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
import androidx.recyclerview.widget.RecyclerView;
import io.github.inflationx.calligraphy3.C1088R;
import p070b.p113c.p114a.C0787a;
import p070b.p113c.p114a.C0788b;
import p070b.p113c.p114a.p116e.p124d.p125a.EnumC0805a;
import p070b.p113c.p114a.p116e.p124d.p125a.EnumC0806b;

/* loaded from: classes.dex */
public class MDRootLayout extends ViewGroup {

    /* renamed from: u */
    public static final /* synthetic */ int f5164u = 0;

    /* renamed from: b */
    public final MDButton[] f5165b;

    /* renamed from: c */
    public int f5166c;

    /* renamed from: d */
    public View f5167d;

    /* renamed from: e */
    public View f5168e;

    /* renamed from: f */
    public boolean f5169f;

    /* renamed from: g */
    public boolean f5170g;

    /* renamed from: h */
    public EnumC0806b f5171h;

    /* renamed from: i */
    public boolean f5172i;

    /* renamed from: j */
    public boolean f5173j;

    /* renamed from: k */
    public boolean f5174k;

    /* renamed from: l */
    public int f5175l;

    /* renamed from: m */
    public int f5176m;

    /* renamed from: n */
    public int f5177n;

    /* renamed from: o */
    public EnumC0805a f5178o;

    /* renamed from: p */
    public int f5179p;

    /* renamed from: q */
    public Paint f5180q;

    /* renamed from: r */
    public ViewTreeObserver.OnScrollChangedListener f5181r;

    /* renamed from: s */
    public ViewTreeObserver.OnScrollChangedListener f5182s;

    /* renamed from: t */
    public int f5183t;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$a */
    public class ViewTreeObserverOnPreDrawListenerC0958a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        public final /* synthetic */ View f5184b;

        /* renamed from: c */
        public final /* synthetic */ boolean f5185c;

        /* renamed from: d */
        public final /* synthetic */ boolean f5186d;

        public ViewTreeObserverOnPreDrawListenerC0958a(View view, boolean z, boolean z2) {
            this.f5184b = view;
            this.f5185c = z;
            this.f5186d = z2;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f5184b.getMeasuredHeight() != 0) {
                WebView webView = (WebView) this.f5184b;
                int i = MDRootLayout.f5164u;
                if (((float) webView.getMeasuredHeight()) < webView.getScale() * ((float) webView.getContentHeight())) {
                    MDRootLayout.this.m2752b((ViewGroup) this.f5184b, this.f5185c, this.f5186d);
                } else {
                    if (this.f5185c) {
                        MDRootLayout.this.f5169f = false;
                    }
                    if (this.f5186d) {
                        MDRootLayout.this.f5170g = false;
                    }
                }
                this.f5184b.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            return true;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$b */
    public class C0959b extends RecyclerView.AbstractC0542p {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f5188a;

        /* renamed from: b */
        public final /* synthetic */ boolean f5189b;

        /* renamed from: c */
        public final /* synthetic */ boolean f5190c;

        public C0959b(ViewGroup viewGroup, boolean z, boolean z2) {
            this.f5188a = viewGroup;
            this.f5189b = z;
            this.f5190c = z2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0542p
        /* renamed from: b */
        public void mo1373b(RecyclerView recyclerView, int i, int i2) {
            MDButton[] mDButtonArr = MDRootLayout.this.f5165b;
            int length = mDButtonArr.length;
            boolean z = false;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    MDButton mDButton = mDButtonArr[i3];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z = true;
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            MDRootLayout.m2750a(MDRootLayout.this, this.f5188a, this.f5189b, this.f5190c, z);
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout$c */
    public class ViewTreeObserverOnScrollChangedListenerC0960c implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f5192a;

        /* renamed from: b */
        public final /* synthetic */ boolean f5193b;

        /* renamed from: c */
        public final /* synthetic */ boolean f5194c;

        public ViewTreeObserverOnScrollChangedListenerC0960c(ViewGroup viewGroup, boolean z, boolean z2) {
            this.f5192a = viewGroup;
            this.f5193b = z;
            this.f5194c = z2;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onScrollChanged() {
            /*
                r8 = this;
                com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout r0 = com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout.this
                com.xuexiang.xui.widget.dialog.materialdialog.internal.MDButton[] r0 = r0.f5165b
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L7:
                r4 = 8
                r5 = 1
                if (r3 >= r1) goto L1b
                r6 = r0[r3]
                if (r6 == 0) goto L18
                int r6 = r6.getVisibility()
                if (r6 == r4) goto L18
                r0 = r5
                goto L1c
            L18:
                int r3 = r3 + 1
                goto L7
            L1b:
                r0 = r2
            L1c:
                android.view.ViewGroup r1 = r8.f5192a
                boolean r3 = r1 instanceof android.webkit.WebView
                if (r3 == 0) goto L6e
                com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout r3 = com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout.this
                android.webkit.WebView r1 = (android.webkit.WebView) r1
                boolean r6 = r8.f5193b
                boolean r7 = r8.f5194c
                java.util.Objects.requireNonNull(r3)
                if (r6 == 0) goto L49
                android.view.View r6 = r3.f5167d
                if (r6 == 0) goto L46
                int r6 = r6.getVisibility()
                if (r6 == r4) goto L46
                int r4 = r1.getScrollY()
                int r6 = r1.getPaddingTop()
                int r6 = r6 + r4
                if (r6 <= 0) goto L46
                r4 = r5
                goto L47
            L46:
                r4 = r2
            L47:
                r3.f5169f = r4
            L49:
                if (r7 == 0) goto L77
                if (r0 == 0) goto L6b
                int r0 = r1.getScrollY()
                int r4 = r1.getMeasuredHeight()
                int r4 = r4 + r0
                int r0 = r1.getPaddingBottom()
                int r4 = r4 - r0
                float r0 = (float) r4
                int r4 = r1.getContentHeight()
                float r4 = (float) r4
                float r1 = r1.getScale()
                float r1 = r1 * r4
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L6b
                r2 = r5
            L6b:
                r3.f5170g = r2
                goto L77
            L6e:
                com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout r2 = com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout.this
                boolean r3 = r8.f5193b
                boolean r4 = r8.f5194c
                com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout.m2750a(r2, r1, r3, r4, r0)
            L77:
                com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout r0 = com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout.this
                r0.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout.ViewTreeObserverOnScrollChangedListenerC0960c.onScrollChanged():void");
        }
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5165b = new MDButton[3];
        this.f5169f = false;
        this.f5170g = false;
        this.f5171h = EnumC0806b.ADAPTIVE;
        this.f5172i = false;
        this.f5173j = true;
        this.f5178o = EnumC0805a.START;
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0788b.f4451e, 0, 0);
        this.f5174k = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f5175l = resources.getDimensionPixelSize(C1088R.dimen.md_notitle_vertical_padding);
        this.f5176m = resources.getDimensionPixelSize(C1088R.dimen.md_button_frame_vertical_padding);
        this.f5179p = resources.getDimensionPixelSize(C1088R.dimen.md_button_padding_frame_side);
        this.f5177n = C0787a.m2463C(context, C1088R.attr.md_button_height, resources.getDimensionPixelSize(C1088R.dimen.default_md_button_height_phone));
        this.f5180q = new Paint();
        this.f5183t = resources.getDimensionPixelSize(C1088R.dimen.md_divider_height);
        this.f5180q.setColor(C0787a.m2462B(context, C1088R.attr.md_divider_color, 0));
        setWillNotDraw(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2750a(com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout r3, android.view.ViewGroup r4, boolean r5, boolean r6, boolean r7) {
        /*
            java.util.Objects.requireNonNull(r3)
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L31
            int r5 = r4.getChildCount()
            if (r5 <= 0) goto L31
            android.view.View r5 = r3.f5167d
            if (r5 == 0) goto L2e
            int r5 = r5.getVisibility()
            r2 = 8
            if (r5 == r2) goto L2e
            int r5 = r4.getScrollY()
            int r2 = r4.getPaddingTop()
            int r2 = r2 + r5
            android.view.View r5 = r4.getChildAt(r1)
            int r5 = r5.getTop()
            if (r2 <= r5) goto L2e
            r5 = r0
            goto L2f
        L2e:
            r5 = r1
        L2f:
            r3.f5169f = r5
        L31:
            if (r6 == 0) goto L5c
            int r5 = r4.getChildCount()
            if (r5 <= 0) goto L5c
            if (r7 == 0) goto L59
            int r5 = r4.getScrollY()
            int r6 = r4.getHeight()
            int r6 = r6 + r5
            int r5 = r4.getPaddingBottom()
            int r6 = r6 - r5
            int r5 = r4.getChildCount()
            int r5 = r5 - r0
            android.view.View r4 = r4.getChildAt(r5)
            int r4 = r4.getBottom()
            if (r6 >= r4) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            r3.f5170g = r0
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout.m2750a(com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout, android.view.ViewGroup, boolean, boolean, boolean):void");
    }

    /* renamed from: c */
    public static boolean m2751c(View view) {
        boolean z = (view == null || view.getVisibility() == 8) ? false : true;
        if (z && (view instanceof MDButton)) {
            return ((MDButton) view).getText().toString().trim().length() > 0;
        }
        return z;
    }

    /* renamed from: b */
    public final void m2752b(ViewGroup viewGroup, boolean z, boolean z2) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        if ((z2 || this.f5181r != null) && !(z2 && this.f5182s == null)) {
            return;
        }
        if (viewGroup instanceof RecyclerView) {
            C0959b c0959b = new C0959b(viewGroup, z, z2);
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            recyclerView.m1860h(c0959b);
            c0959b.mo1373b(recyclerView, 0, 0);
            return;
        }
        ViewTreeObserverOnScrollChangedListenerC0960c viewTreeObserverOnScrollChangedListenerC0960c = new ViewTreeObserverOnScrollChangedListenerC0960c(viewGroup, z, z2);
        if (z2) {
            this.f5182s = viewTreeObserverOnScrollChangedListenerC0960c;
            viewTreeObserver = viewGroup.getViewTreeObserver();
            onScrollChangedListener = this.f5182s;
        } else {
            this.f5181r = viewTreeObserverOnScrollChangedListenerC0960c;
            viewTreeObserver = viewGroup.getViewTreeObserver();
            onScrollChangedListener = this.f5181r;
        }
        viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
        viewTreeObserverOnScrollChangedListenerC0960c.onScrollChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.widget.AdapterView] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.widget.ScrollView] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2753d(android.view.View r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout.m2753d(android.view.View, boolean, boolean):void");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.f5168e;
        if (view != null) {
            if (this.f5169f) {
                canvas.drawRect(0.0f, r0 - this.f5183t, getMeasuredWidth(), view.getTop(), this.f5180q);
            }
            if (this.f5170g) {
                canvas.drawRect(0.0f, this.f5168e.getBottom(), getMeasuredWidth(), r0 + this.f5183t, this.f5180q);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() == C1088R.id.md_titleFrame) {
                this.f5167d = childAt;
            } else if (childAt.getId() == C1088R.id.md_buttonDefaultNeutral) {
                this.f5165b[0] = (MDButton) childAt;
            } else if (childAt.getId() == C1088R.id.md_buttonDefaultNegative) {
                this.f5165b[1] = (MDButton) childAt;
            } else if (childAt.getId() == C1088R.id.md_buttonDefaultPositive) {
                this.f5165b[2] = (MDButton) childAt;
            } else {
                this.f5168e = childAt;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int measuredWidth2;
        MDButton mDButton;
        int measuredWidth3;
        int measuredWidth4;
        int measuredWidth5;
        int measuredWidth6;
        int measuredWidth7;
        int measuredWidth8;
        EnumC0805a enumC0805a = EnumC0805a.START;
        EnumC0805a enumC0805a2 = EnumC0805a.END;
        if (m2751c(this.f5167d)) {
            int measuredHeight = this.f5167d.getMeasuredHeight() + i2;
            this.f5167d.layout(i, i2, i3, measuredHeight);
            i2 = measuredHeight;
        } else if (this.f5173j) {
            i2 += this.f5175l;
        }
        if (m2751c(this.f5168e)) {
            View view = this.f5168e;
            view.layout(i, i2, i3, view.getMeasuredHeight() + i2);
        }
        if (this.f5172i) {
            int measuredHeight2 = i4 - this.f5176m;
            for (MDButton mDButton2 : this.f5165b) {
                if (m2751c(mDButton2)) {
                    mDButton2.layout(i, measuredHeight2 - mDButton2.getMeasuredHeight(), i3, measuredHeight2);
                    measuredHeight2 -= mDButton2.getMeasuredHeight();
                }
            }
        } else {
            if (this.f5173j) {
                i4 -= this.f5176m;
            }
            int i5 = i4 - this.f5177n;
            int measuredWidth9 = this.f5179p;
            if (m2751c(this.f5165b[2])) {
                if (this.f5178o == enumC0805a2) {
                    measuredWidth7 = i + measuredWidth9;
                    measuredWidth8 = this.f5165b[2].getMeasuredWidth() + measuredWidth7;
                    measuredWidth = -1;
                } else {
                    int i6 = i3 - measuredWidth9;
                    measuredWidth7 = i6 - this.f5165b[2].getMeasuredWidth();
                    measuredWidth8 = i6;
                    measuredWidth = measuredWidth7;
                }
                this.f5165b[2].layout(measuredWidth7, i5, measuredWidth8, i4);
                measuredWidth9 += this.f5165b[2].getMeasuredWidth();
            } else {
                measuredWidth = -1;
            }
            if (m2751c(this.f5165b[1])) {
                EnumC0805a enumC0805a3 = this.f5178o;
                if (enumC0805a3 == enumC0805a2) {
                    measuredWidth5 = measuredWidth9 + i;
                    measuredWidth6 = this.f5165b[1].getMeasuredWidth() + measuredWidth5;
                } else if (enumC0805a3 == enumC0805a) {
                    measuredWidth6 = i3 - measuredWidth9;
                    measuredWidth5 = measuredWidth6 - this.f5165b[1].getMeasuredWidth();
                } else {
                    measuredWidth5 = this.f5179p + i;
                    measuredWidth6 = this.f5165b[1].getMeasuredWidth() + measuredWidth5;
                    measuredWidth2 = measuredWidth6;
                    this.f5165b[1].layout(measuredWidth5, i5, measuredWidth6, i4);
                }
                measuredWidth2 = -1;
                this.f5165b[1].layout(measuredWidth5, i5, measuredWidth6, i4);
            } else {
                measuredWidth2 = -1;
            }
            if (m2751c(this.f5165b[0])) {
                EnumC0805a enumC0805a4 = this.f5178o;
                if (enumC0805a4 == enumC0805a2) {
                    measuredWidth3 = i3 - this.f5179p;
                    measuredWidth4 = measuredWidth3 - this.f5165b[0].getMeasuredWidth();
                } else if (enumC0805a4 == enumC0805a) {
                    measuredWidth4 = this.f5179p + i;
                    measuredWidth3 = this.f5165b[0].getMeasuredWidth() + measuredWidth4;
                } else {
                    if (measuredWidth2 != -1 || measuredWidth == -1) {
                        if (measuredWidth == -1 && measuredWidth2 != -1) {
                            mDButton = this.f5165b[0];
                        } else if (measuredWidth == -1) {
                            measuredWidth2 = ((i3 - i) / 2) - (this.f5165b[0].getMeasuredWidth() / 2);
                            mDButton = this.f5165b[0];
                        }
                        measuredWidth = mDButton.getMeasuredWidth() + measuredWidth2;
                    } else {
                        measuredWidth2 = measuredWidth - this.f5165b[0].getMeasuredWidth();
                    }
                    measuredWidth3 = measuredWidth;
                    measuredWidth4 = measuredWidth2;
                }
                this.f5165b[0].layout(measuredWidth4, i5, measuredWidth3, i4);
            }
        }
        m2753d(this.f5168e, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout.onMeasure(int, int):void");
    }

    public void setButtonGravity(EnumC0805a enumC0805a) {
        EnumC0805a enumC0805a2;
        this.f5178o = enumC0805a;
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int iOrdinal = this.f5178o.ordinal();
            if (iOrdinal == 0) {
                enumC0805a2 = EnumC0805a.END;
            } else if (iOrdinal != 2) {
                return;
            } else {
                enumC0805a2 = EnumC0805a.START;
            }
            this.f5178o = enumC0805a2;
        }
    }

    public void setButtonStackedGravity(EnumC0805a enumC0805a) {
        for (MDButton mDButton : this.f5165b) {
            if (mDButton != null) {
                mDButton.setStackedGravity(enumC0805a);
            }
        }
    }

    public void setDividerColor(int i) {
        this.f5180q.setColor(i);
        invalidate();
    }

    public void setMaxHeight(int i) {
        this.f5166c = i;
    }

    public void setStackingBehavior(EnumC0806b enumC0806b) {
        this.f5171h = enumC0806b;
        invalidate();
    }
}
