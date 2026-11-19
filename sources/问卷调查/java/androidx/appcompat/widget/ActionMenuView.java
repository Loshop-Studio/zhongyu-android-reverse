package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import p000a.p005b.p012g.p013i.C0054g;
import p000a.p005b.p012g.p013i.C0056i;
import p000a.p005b.p012g.p013i.InterfaceC0060m;
import p000a.p005b.p012g.p013i.InterfaceC0061n;
import p000a.p005b.p014h.C0069a1;
import p000a.p005b.p014h.C0073c;
import p000a.p005b.p014h.C0080f0;

/* loaded from: classes.dex */
public class ActionMenuView extends C0080f0 implements C0054g.b, InterfaceC0061n {

    /* renamed from: A */
    public int f2827A;

    /* renamed from: B */
    public InterfaceC0472e f2828B;

    /* renamed from: q */
    public C0054g f2829q;

    /* renamed from: r */
    public Context f2830r;

    /* renamed from: s */
    public int f2831s;

    /* renamed from: t */
    public boolean f2832t;

    /* renamed from: u */
    public C0073c f2833u;

    /* renamed from: v */
    public InterfaceC0060m.a f2834v;

    /* renamed from: w */
    public C0054g.a f2835w;

    /* renamed from: x */
    public boolean f2836x;

    /* renamed from: y */
    public int f2837y;

    /* renamed from: z */
    public int f2838z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface InterfaceC0468a {
        /* renamed from: a */
        boolean mo291a();

        /* renamed from: b */
        boolean mo292b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0469b implements InterfaceC0060m.a {
        @Override // p000a.p005b.p012g.p013i.InterfaceC0060m.a
        /* renamed from: c */
        public void mo82c(C0054g c0054g, boolean z) {
        }

        @Override // p000a.p005b.p012g.p013i.InterfaceC0060m.a
        /* renamed from: d */
        public boolean mo83d(C0054g c0054g) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0470c extends C0080f0.a {

        /* renamed from: a */
        @ViewDebug.ExportedProperty
        public boolean f2839a;

        /* renamed from: b */
        @ViewDebug.ExportedProperty
        public int f2840b;

        /* renamed from: c */
        @ViewDebug.ExportedProperty
        public int f2841c;

        /* renamed from: d */
        @ViewDebug.ExportedProperty
        public boolean f2842d;

        /* renamed from: e */
        @ViewDebug.ExportedProperty
        public boolean f2843e;

        /* renamed from: f */
        public boolean f2844f;

        public C0470c(int i, int i2) {
            super(i, i2);
            this.f2839a = false;
        }

        public C0470c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0470c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0470c(C0470c c0470c) {
            super(c0470c);
            this.f2839a = c0470c.f2839a;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0471d implements C0054g.a {
        public C0471d() {
        }

        @Override // p000a.p005b.p012g.p013i.C0054g.a
        /* renamed from: a */
        public void mo79a(C0054g c0054g) {
            C0054g.a aVar = ActionMenuView.this.f2835w;
            if (aVar != null) {
                aVar.mo79a(c0054g);
            }
        }

        @Override // p000a.p005b.p012g.p013i.C0054g.a
        /* renamed from: b */
        public boolean mo80b(C0054g c0054g, MenuItem menuItem) {
            InterfaceC0472e interfaceC0472e = ActionMenuView.this.f2828B;
            if (interfaceC0472e == null) {
                return false;
            }
            Toolbar.InterfaceC0496f interfaceC0496f = Toolbar.this.f2952H;
            return interfaceC0496f != null ? interfaceC0496f.onMenuItemClick(menuItem) : false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface InterfaceC0472e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f2838z = (int) (56.0f * f2);
        this.f2827A = (int) (f2 * 4.0f);
        this.f2830r = context;
        this.f2831s = 0;
    }

    /* renamed from: t */
    public static int m1578t(View view, int i, int i2, int i3, int i4) {
        C0470c c0470c = (C0470c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m1563e();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (!c0470c.f2839a && z2) {
            z = true;
        }
        c0470c.f2842d = z;
        c0470c.f2840b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), iMakeMeasureSpec);
        return i5;
    }

    @Override // p000a.p005b.p012g.p013i.C0054g.b
    /* renamed from: b */
    public boolean mo222b(C0056i c0056i) {
        return this.f2829q.m214s(c0056i, null, 0);
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0061n
    /* renamed from: c */
    public void mo250c(C0054g c0054g) {
        this.f2829q = c0054g;
    }

    @Override // p000a.p005b.p014h.C0080f0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0470c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p000a.p005b.p014h.C0080f0, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0470c(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f2829q == null) {
            Context context = getContext();
            C0054g c0054g = new C0054g(context);
            this.f2829q = c0054g;
            c0054g.f437e = new C0471d();
            C0073c c0073c = new C0073c(context);
            this.f2833u = c0073c;
            c0073c.f559m = true;
            c0073c.f560n = true;
            InterfaceC0060m.a c0469b = this.f2834v;
            if (c0469b == null) {
                c0469b = new C0469b();
            }
            c0073c.f375f = c0469b;
            this.f2829q.m197b(c0073c, this.f2830r);
            C0073c c0073c2 = this.f2833u;
            c0073c2.f378i = this;
            this.f2829q = c0073c2.f373d;
        }
        return this.f2829q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0073c c0073c = this.f2833u;
        C0073c.d dVar = c0073c.f556j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (c0073c.f558l) {
            return c0073c.f557k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f2831s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p000a.p005b.p014h.C0080f0
    /* renamed from: i */
    public C0080f0.a generateLayoutParams(AttributeSet attributeSet) {
        return new C0470c(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0073c c0073c = this.f2833u;
        if (c0073c != null) {
            c0073c.mo177i(false);
            if (this.f2833u.m289m()) {
                this.f2833u.m287f();
                this.f2833u.m290n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0073c c0073c = this.f2833u;
        if (c0073c != null) {
            c0073c.m285a();
        }
    }

    @Override // p000a.p005b.p014h.C0080f0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f2836x) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zM281b = C0069a1.m281b(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0470c c0470c = (C0470c) childAt.getLayoutParams();
                if (c0470c.f2839a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1581s(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM281b) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0470c).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0470c).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0470c).leftMargin) + ((LinearLayout.LayoutParams) c0470c).rightMargin;
                    m1581s(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zM281b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C0470c c0470c2 = (C0470c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0470c2.f2839a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c0470c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0470c2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C0470c c0470c3 = (C0470c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0470c3.f2839a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c0470c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0470c3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    @Override // p000a.p005b.p014h.C0080f0, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        ?? r3;
        C0054g c0054g;
        boolean z3 = this.f2836x;
        boolean z4 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f2836x = z4;
        if (z3 != z4) {
            this.f2837y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f2836x && (c0054g = this.f2829q) != null && size != this.f2837y) {
            this.f2837y = size;
            c0054g.m212q(true);
        }
        int childCount = getChildCount();
        if (!this.f2836x || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C0470c c0470c = (C0470c) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c0470c).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0470c).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.f2838z;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int i13 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z5 = false;
        long j = 0;
        while (i15 < childCount2) {
            View childAt = getChildAt(i15);
            int i16 = size3;
            int i17 = i8;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i18 = i13 + 1;
                if (z6) {
                    int i19 = this.f2827A;
                    i6 = i18;
                    r3 = 0;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    r3 = 0;
                }
                C0470c c0470c2 = (C0470c) childAt.getLayoutParams();
                c0470c2.f2844f = r3;
                c0470c2.f2841c = r3;
                c0470c2.f2840b = r3;
                c0470c2.f2842d = r3;
                ((LinearLayout.LayoutParams) c0470c2).leftMargin = r3;
                ((LinearLayout.LayoutParams) c0470c2).rightMargin = r3;
                c0470c2.f2843e = z6 && ((ActionMenuItemView) childAt).m1563e();
                int iM1578t = m1578t(childAt, i12, c0470c2.f2839a ? 1 : i10, childMeasureSpec, paddingBottom);
                iMax2 = Math.max(iMax2, iM1578t);
                if (c0470c2.f2842d) {
                    i14++;
                }
                if (c0470c2.f2839a) {
                    z5 = true;
                }
                i10 -= iM1578t;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iM1578t == 1) {
                    j |= 1 << i15;
                }
                i13 = i6;
            }
            i15++;
            size3 = i16;
            i8 = i17;
        }
        int i20 = i8;
        int i21 = size3;
        boolean z7 = z5 && i13 == 2;
        boolean z8 = false;
        while (i14 > 0 && i10 > 0) {
            int i22 = Integer.MAX_VALUE;
            int i23 = 0;
            int i24 = 0;
            long j2 = 0;
            while (i23 < childCount2) {
                int i25 = iMax;
                C0470c c0470c3 = (C0470c) getChildAt(i23).getLayoutParams();
                boolean z9 = z8;
                if (c0470c3.f2842d) {
                    int i26 = c0470c3.f2840b;
                    if (i26 < i22) {
                        j2 = 1 << i23;
                        i22 = i26;
                        i24 = 1;
                    } else if (i26 == i22) {
                        i24++;
                        j2 |= 1 << i23;
                    }
                }
                i23++;
                z8 = z9;
                iMax = i25;
            }
            i3 = iMax;
            z = z8;
            j |= j2;
            if (i24 > i10) {
                break;
            }
            int i27 = i22 + 1;
            int i28 = 0;
            while (i28 < childCount2) {
                View childAt2 = getChildAt(i28);
                C0470c c0470c4 = (C0470c) childAt2.getLayoutParams();
                int i29 = i14;
                long j3 = 1 << i28;
                if ((j2 & j3) == 0) {
                    if (c0470c4.f2840b == i27) {
                        j |= j3;
                    }
                    z2 = z7;
                } else {
                    if (z7 && c0470c4.f2843e && i10 == 1) {
                        int i30 = this.f2827A;
                        z2 = z7;
                        childAt2.setPadding(i30 + i12, 0, i30, 0);
                    } else {
                        z2 = z7;
                    }
                    c0470c4.f2840b++;
                    c0470c4.f2844f = true;
                    i10--;
                }
                i28++;
                i14 = i29;
                z7 = z2;
            }
            iMax = i3;
            z8 = true;
        }
        i3 = iMax;
        z = z8;
        boolean z10 = !z5 && i13 == 1;
        if (i10 > 0 && j != 0 && (i10 < i13 - 1 || z10 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((C0470c) getChildAt(0).getLayoutParams()).f2843e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & (1 << i31)) != 0 && !((C0470c) getChildAt(i31).getLayoutParams()).f2843e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i10 * i12) / fBitCount) : 0;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & (1 << i33)) != 0) {
                    View childAt3 = getChildAt(i33);
                    C0470c c0470c5 = (C0470c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0470c5.f2841c = i32;
                        c0470c5.f2844f = true;
                        if (i33 == 0 && !c0470c5.f2843e) {
                            ((LinearLayout.LayoutParams) c0470c5).leftMargin = (-i32) / 2;
                        }
                        z = true;
                    } else if (c0470c5.f2839a) {
                        c0470c5.f2841c = i32;
                        c0470c5.f2844f = true;
                        ((LinearLayout.LayoutParams) c0470c5).rightMargin = (-i32) / 2;
                        z = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) c0470c5).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c0470c5).rightMargin = i32 / 2;
                        }
                    }
                }
            }
        }
        if (z) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                C0470c c0470c6 = (C0470c) childAt4.getLayoutParams();
                if (c0470c6.f2844f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0470c6.f2840b * i12) + c0470c6.f2841c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i5 = i20;
            i4 = i3;
        } else {
            i4 = i21;
            i5 = i20;
        }
        setMeasuredDimension(i5, i4);
    }

    @Override // p000a.p005b.p014h.C0080f0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C0470c generateDefaultLayoutParams() {
        C0470c c0470c = new C0470c(-2, -2);
        ((LinearLayout.LayoutParams) c0470c).gravity = 16;
        return c0470c;
    }

    @Override // p000a.p005b.p014h.C0080f0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C0470c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0470c c0470c = layoutParams instanceof C0470c ? new C0470c((C0470c) layoutParams) : new C0470c(layoutParams);
        if (((LinearLayout.LayoutParams) c0470c).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0470c).gravity = 16;
        }
        return c0470c;
    }

    /* renamed from: s */
    public boolean m1581s(int i) {
        boolean zMo292b = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0468a)) {
            zMo292b = false | ((InterfaceC0468a) childAt).mo292b();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0468a)) ? zMo292b : zMo292b | ((InterfaceC0468a) childAt2).mo291a();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f2833u.f564r = z;
    }

    public void setOnMenuItemClickListener(InterfaceC0472e interfaceC0472e) {
        this.f2828B = interfaceC0472e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0073c c0073c = this.f2833u;
        C0073c.d dVar = c0073c.f556j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            c0073c.f558l = true;
            c0073c.f557k = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f2832t = z;
    }

    public void setPopupTheme(int i) {
        if (this.f2831s != i) {
            this.f2831s = i;
            if (i == 0) {
                this.f2830r = getContext();
            } else {
                this.f2830r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0073c c0073c) {
        this.f2833u = c0073c;
        c0073c.f378i = this;
        this.f2829q = c0073c.f373d;
    }
}
