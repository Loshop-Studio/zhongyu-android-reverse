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
import androidx.appcompat.view.menu.C0125g;
import androidx.appcompat.view.menu.C0127i;
import androidx.appcompat.view.menu.InterfaceC0131m;
import androidx.appcompat.view.menu.InterfaceC0132n;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements C0125g.b, InterfaceC0132n {

    /* renamed from: a */
    private C0125g f786a;

    /* renamed from: b */
    private Context f787b;

    /* renamed from: c */
    private int f788c;

    /* renamed from: d */
    private boolean f789d;

    /* renamed from: e */
    private ActionMenuPresenter f790e;

    /* renamed from: f */
    private InterfaceC0131m.a f791f;

    /* renamed from: g */
    C0125g.a f792g;

    /* renamed from: h */
    private boolean f793h;

    /* renamed from: i */
    private int f794i;

    /* renamed from: j */
    private int f795j;

    /* renamed from: k */
    private int f796k;

    /* renamed from: l */
    InterfaceC0153d f797l;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* renamed from: a */
        @ViewDebug.ExportedProperty
        public boolean f798a;

        /* renamed from: b */
        @ViewDebug.ExportedProperty
        public int f799b;

        /* renamed from: c */
        @ViewDebug.ExportedProperty
        public int f800c;

        /* renamed from: d */
        @ViewDebug.ExportedProperty
        public boolean f801d;

        /* renamed from: e */
        @ViewDebug.ExportedProperty
        public boolean f802e;

        /* renamed from: f */
        boolean f803f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f798a = layoutParams.f798a;
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f798a = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface InterfaceC0150a {
        /* renamed from: a */
        boolean mo410a();

        /* renamed from: b */
        boolean mo411b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0151b implements InterfaceC0131m.a {
        C0151b() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0131m.a
        /* renamed from: a */
        public boolean mo252a(C0125g c0125g) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0131m.a
        public void onCloseMenu(C0125g c0125g, boolean z3) {
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    private class C0152c implements C0125g.a {
        C0152c() {
        }

        @Override // androidx.appcompat.view.menu.C0125g.a
        public boolean onMenuItemSelected(C0125g c0125g, MenuItem menuItem) {
            InterfaceC0153d interfaceC0153d = ActionMenuView.this.f797l;
            return interfaceC0153d != null && interfaceC0153d.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0125g.a
        public void onMenuModeChange(C0125g c0125g) {
            C0125g.a aVar = ActionMenuView.this.f792g;
            if (aVar != null) {
                aVar.onMenuModeChange(c0125g);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public interface InterfaceC0153d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* renamed from: n */
    static int m589n(View view, int i4, int i5, int i6, int i7) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i6) - i7, View.MeasureSpec.getMode(i6));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z3 = actionMenuItemView != null && actionMenuItemView.m412c();
        int i8 = 2;
        if (i5 <= 0 || (z3 && i5 < 2)) {
            i8 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i4, Integer.MIN_VALUE), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i9 = measuredWidth / i4;
            if (measuredWidth % i4 != 0) {
                i9++;
            }
            if (!z3 || i9 >= 2) {
                i8 = i9;
            }
        }
        layoutParams.f801d = !layoutParams.f798a && z3;
        layoutParams.f799b = i8;
        view.measure(View.MeasureSpec.makeMeasureSpec(i4 * i8, 1073741824), iMakeMeasureSpec);
        return i8;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /* renamed from: o */
    private void m590o(int i4, int i5) {
        int i6;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        boolean z5;
        int i9;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingTop, -2);
        int i10 = size - paddingLeft;
        int i11 = this.f795j;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (i12 == 0) {
            setMeasuredDimension(i10, 0);
            return;
        }
        int i14 = i11 + (i13 / i12);
        int childCount = getChildCount();
        int iMax = 0;
        int i15 = 0;
        boolean z6 = false;
        int i16 = 0;
        int iMax2 = 0;
        int i17 = 0;
        long j4 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            int i18 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i19 = i16 + 1;
                if (z7) {
                    int i20 = this.f796k;
                    i9 = i19;
                    r14 = 0;
                    childAt.setPadding(i20, 0, i20, 0);
                } else {
                    i9 = i19;
                    r14 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f803f = r14;
                layoutParams.f800c = r14;
                layoutParams.f799b = r14;
                layoutParams.f801d = r14;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r14;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r14;
                layoutParams.f802e = z7 && ((ActionMenuItemView) childAt).m412c();
                int iM589n = m589n(childAt, i14, layoutParams.f798a ? 1 : i12, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iM589n);
                if (layoutParams.f801d) {
                    i17++;
                }
                if (layoutParams.f798a) {
                    z6 = true;
                }
                i12 -= iM589n;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iM589n == 1) {
                    j4 |= 1 << i15;
                    iMax = iMax;
                }
                i16 = i9;
            }
            i15++;
            size2 = i18;
        }
        int i21 = size2;
        boolean z8 = z6 && i16 == 2;
        boolean z9 = false;
        while (i17 > 0 && i12 > 0) {
            int i22 = 0;
            int i23 = 0;
            int i24 = Integer.MAX_VALUE;
            long j5 = 0;
            while (i23 < childCount) {
                boolean z10 = z9;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i23).getLayoutParams();
                int i25 = iMax;
                if (layoutParams2.f801d) {
                    int i26 = layoutParams2.f799b;
                    if (i26 < i24) {
                        j5 = 1 << i23;
                        i24 = i26;
                        i22 = 1;
                    } else if (i26 == i24) {
                        i22++;
                        j5 |= 1 << i23;
                    }
                }
                i23++;
                iMax = i25;
                z9 = z10;
            }
            z3 = z9;
            i8 = iMax;
            j4 |= j5;
            if (i22 > i12) {
                i6 = mode;
                i7 = i10;
                break;
            }
            int i27 = i24 + 1;
            int i28 = 0;
            while (i28 < childCount) {
                View childAt2 = getChildAt(i28);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i29 = i10;
                int i30 = mode;
                long j6 = 1 << i28;
                if ((j5 & j6) == 0) {
                    if (layoutParams3.f799b == i27) {
                        j4 |= j6;
                    }
                    z5 = z8;
                } else {
                    if (z8 && layoutParams3.f802e && i12 == 1) {
                        int i31 = this.f796k;
                        z5 = z8;
                        childAt2.setPadding(i31 + i14, 0, i31, 0);
                    } else {
                        z5 = z8;
                    }
                    layoutParams3.f799b++;
                    layoutParams3.f803f = true;
                    i12--;
                }
                i28++;
                mode = i30;
                i10 = i29;
                z8 = z5;
            }
            iMax = i8;
            z9 = true;
        }
        i6 = mode;
        i7 = i10;
        z3 = z9;
        i8 = iMax;
        boolean z11 = !z6 && i16 == 1;
        if (i12 <= 0 || j4 == 0 || (i12 >= i16 - 1 && !z11 && iMax2 <= 1)) {
            z4 = z3;
        } else {
            float fBitCount = Long.bitCount(j4);
            if (!z11) {
                if ((j4 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f802e) {
                    fBitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j4 & (1 << i32)) != 0 && !((LayoutParams) getChildAt(i32).getLayoutParams()).f802e) {
                    fBitCount -= 0.5f;
                }
            }
            int i33 = fBitCount > IGoodView.DEFAULT_TO_ALPHA ? (int) ((i12 * i14) / fBitCount) : 0;
            z4 = z3;
            for (int i34 = 0; i34 < childCount; i34++) {
                if ((j4 & (1 << i34)) != 0) {
                    View childAt3 = getChildAt(i34);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f800c = i33;
                        layoutParams4.f803f = true;
                        if (i34 == 0 && !layoutParams4.f802e) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i33) / 2;
                        }
                    } else if (layoutParams4.f798a) {
                        layoutParams4.f800c = i33;
                        layoutParams4.f803f = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i33) / 2;
                    } else {
                        if (i34 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i33 / 2;
                        }
                    }
                    z4 = true;
                }
            }
        }
        if (z4) {
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f803f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.f799b * i14) + layoutParams5.f800c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i7, i6 != 1073741824 ? i8 : i21);
    }

    @Override // androidx.appcompat.view.menu.C0125g.b
    /* renamed from: a */
    public boolean mo416a(C0127i c0127i) {
        return this.f786a.performItemAction(c0127i, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public void m591d() {
        ActionMenuPresenter actionMenuPresenter = this.f790e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m578r();
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    public Menu getMenu() {
        if (this.f786a == null) {
            Context context = getContext();
            C0125g c0125g = new C0125g(context);
            this.f786a = c0125g;
            c0125g.setCallback(new C0152c());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f790e = actionMenuPresenter;
            actionMenuPresenter.m575C(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f790e;
            InterfaceC0131m.a c0151b = this.f791f;
            if (c0151b == null) {
                c0151b = new C0151b();
            }
            actionMenuPresenter2.setCallback(c0151b);
            this.f786a.addMenuPresenter(this.f790e, this.f787b);
            this.f790e.m573A(this);
        }
        return this.f786a;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f790e.m579t();
    }

    public int getPopupTheme() {
        return this.f788c;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public LayoutParams m595h() {
        LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.f798a = true;
        return layoutParamsGenerateDefaultLayoutParams;
    }

    /* renamed from: i */
    protected boolean m596i(int i4) {
        boolean zMo410a = false;
        if (i4 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i4 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof InterfaceC0150a)) {
            zMo410a = false | ((InterfaceC0150a) childAt).mo410a();
        }
        return (i4 <= 0 || !(childAt2 instanceof InterfaceC0150a)) ? zMo410a : zMo410a | ((InterfaceC0150a) childAt2).mo411b();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0132n
    public void initialize(C0125g c0125g) {
        this.f786a = c0125g;
    }

    /* renamed from: j */
    public boolean m597j() {
        ActionMenuPresenter actionMenuPresenter = this.f790e;
        return actionMenuPresenter != null && actionMenuPresenter.m580u();
    }

    /* renamed from: k */
    public boolean m598k() {
        ActionMenuPresenter actionMenuPresenter = this.f790e;
        return actionMenuPresenter != null && actionMenuPresenter.m582w();
    }

    /* renamed from: l */
    public boolean m599l() {
        ActionMenuPresenter actionMenuPresenter = this.f790e;
        return actionMenuPresenter != null && actionMenuPresenter.m583x();
    }

    /* renamed from: m */
    public boolean m600m() {
        return this.f789d;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f790e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.f790e.m583x()) {
                this.f790e.m580u();
                this.f790e.m576D();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m591d();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int width;
        int paddingLeft;
        if (!this.f793h) {
            super.onLayout(z3, i4, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i6 - i4;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean zM947b = C0226m0.m947b(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f798a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m596i(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM947b) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    m596i(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int iMax = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (zM947b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f798a) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f798a) {
                int i21 = paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft2 = i21 + measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i4, int i5) {
        C0125g c0125g;
        boolean z3 = this.f793h;
        boolean z4 = View.MeasureSpec.getMode(i4) == 1073741824;
        this.f793h = z4;
        if (z3 != z4) {
            this.f794i = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (this.f793h && (c0125g = this.f786a) != null && size != this.f794i) {
            this.f794i = size;
            c0125g.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.f793h && childCount > 0) {
            m590o(i4, i5);
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i4, i5);
    }

    /* renamed from: p */
    public C0125g m601p() {
        return this.f786a;
    }

    /* renamed from: q */
    public void m602q(InterfaceC0131m.a aVar, C0125g.a aVar2) {
        this.f791f = aVar;
        this.f792g = aVar2;
    }

    /* renamed from: r */
    public boolean m603r() {
        ActionMenuPresenter actionMenuPresenter = this.f790e;
        return actionMenuPresenter != null && actionMenuPresenter.m576D();
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f790e.m585z(z3);
    }

    public void setOnMenuItemClickListener(InterfaceC0153d interfaceC0153d) {
        this.f797l = interfaceC0153d;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f790e.m574B(drawable);
    }

    public void setOverflowReserved(boolean z3) {
        this.f789d = z3;
    }

    public void setPopupTheme(int i4) {
        if (this.f788c != i4) {
            this.f788c = i4;
            if (i4 == 0) {
                this.f787b = getContext();
            } else {
                this.f787b = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f790e = actionMenuPresenter;
        actionMenuPresenter.m573A(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f795j = (int) (56.0f * f4);
        this.f796k = (int) (f4 * 4.0f);
        this.f787b = context;
        this.f788c = 0;
    }
}
