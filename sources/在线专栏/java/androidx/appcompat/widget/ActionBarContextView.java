package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0125g;
import androidx.core.view.C0358u;
import androidx.core.view.C0362y;
import p015c.C1038a;
import p015c.C1043f;
import p015c.C1044g;
import p015c.C1047j;
import p088g.AbstractC2620b;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0201a {

    /* renamed from: i */
    private CharSequence f707i;

    /* renamed from: j */
    private CharSequence f708j;

    /* renamed from: k */
    private View f709k;

    /* renamed from: l */
    private View f710l;

    /* renamed from: m */
    private View f711m;

    /* renamed from: n */
    private LinearLayout f712n;

    /* renamed from: o */
    private TextView f713o;

    /* renamed from: p */
    private TextView f714p;

    /* renamed from: q */
    private int f715q;

    /* renamed from: r */
    private int f716r;

    /* renamed from: s */
    private boolean f717s;

    /* renamed from: t */
    private int f718t;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class ViewOnClickListenerC0138a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC2620b f719a;

        ViewOnClickListenerC0138a(AbstractC2620b abstractC2620b) {
            this.f719a = abstractC2620b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f719a.mo327a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    private void m536i() {
        if (this.f712n == null) {
            LayoutInflater.from(getContext()).inflate(C1044g.f5880a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f712n = linearLayout;
            this.f713o = (TextView) linearLayout.findViewById(C1043f.f5858e);
            this.f714p = (TextView) this.f712n.findViewById(C1043f.f5857d);
            if (this.f715q != 0) {
                this.f713o.setTextAppearance(getContext(), this.f715q);
            }
            if (this.f716r != 0) {
                this.f714p.setTextAppearance(getContext(), this.f716r);
            }
        }
        this.f713o.setText(this.f707i);
        this.f714p.setText(this.f708j);
        boolean z3 = !TextUtils.isEmpty(this.f707i);
        boolean z4 = !TextUtils.isEmpty(this.f708j);
        int i4 = 0;
        this.f714p.setVisibility(z4 ? 0 : 8);
        LinearLayout linearLayout2 = this.f712n;
        if (!z3 && !z4) {
            i4 = 8;
        }
        linearLayout2.setVisibility(i4);
        if (this.f712n.getParent() == null) {
            addView(this.f712n);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0201a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ C0362y mo537f(int i4, long j4) {
        return super.mo537f(i4, j4);
    }

    /* renamed from: g */
    public void m538g() {
        if (this.f709k == null) {
            m541k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0201a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0201a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f708j;
    }

    public CharSequence getTitle() {
        return this.f707i;
    }

    /* renamed from: h */
    public void m539h(AbstractC2620b abstractC2620b) {
        View view = this.f709k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f718t, (ViewGroup) this, false);
            this.f709k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f709k);
        }
        View viewFindViewById = this.f709k.findViewById(C1043f.f5862i);
        this.f710l = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0138a(abstractC2620b));
        C0125g c0125g = (C0125g) abstractC2620b.mo329c();
        ActionMenuPresenter actionMenuPresenter = this.f1023d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m578r();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f1023d = actionMenuPresenter2;
        actionMenuPresenter2.m575C(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0125g.addMenuPresenter(this.f1023d, this.f1021b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1023d.mo435h(this);
        this.f1022c = actionMenuView;
        C0358u.m2057t0(actionMenuView, null);
        addView(this.f1022c, layoutParams);
    }

    /* renamed from: j */
    public boolean m540j() {
        return this.f717s;
    }

    /* renamed from: k */
    public void m541k() {
        removeAllViews();
        this.f711m = null;
        this.f1022c = null;
        this.f1023d = null;
        View view = this.f710l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: l */
    public boolean m542l() {
        ActionMenuPresenter actionMenuPresenter = this.f1023d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.m576D();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1023d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m580u();
            this.f1023d.m581v();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0201a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f707i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        boolean zM947b = C0226m0.m947b(this);
        int paddingRight = zM947b ? (i6 - i4) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.f709k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f709k.getLayoutParams();
            int i8 = zM947b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i9 = zM947b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iM735d = AbstractC0201a.m735d(paddingRight, i8, zM947b);
            paddingRight = AbstractC0201a.m735d(iM735d + m737e(this.f709k, iM735d, paddingTop, paddingTop2, zM947b), i9, zM947b);
        }
        int iM737e = paddingRight;
        LinearLayout linearLayout = this.f712n;
        if (linearLayout != null && this.f711m == null && linearLayout.getVisibility() != 8) {
            iM737e += m737e(this.f712n, iM737e, paddingTop, paddingTop2, zM947b);
        }
        int i10 = iM737e;
        View view2 = this.f711m;
        if (view2 != null) {
            m737e(view2, i10, paddingTop, paddingTop2, zM947b);
        }
        int paddingLeft = zM947b ? getPaddingLeft() : (i6 - i4) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1022c;
        if (actionMenuView != null) {
            m737e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM947b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i5) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i4);
        int size2 = this.f1024e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i5);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f709k;
        if (view != null) {
            int iM736c = m736c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f709k.getLayoutParams();
            paddingLeft = iM736c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1022c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m736c(this.f1022c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f712n;
        if (linearLayout != null && this.f711m == null) {
            if (this.f717s) {
                this.f712n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f712n.getMeasuredWidth();
                boolean z3 = measuredWidth <= paddingLeft;
                if (z3) {
                    paddingLeft -= measuredWidth;
                }
                this.f712n.setVisibility(z3 ? 0 : 8);
            } else {
                paddingLeft = m736c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f711m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i8 >= 0) {
                iMin = Math.min(i8, iMin);
            }
            this.f711m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(iMin, i9));
        }
        if (this.f1024e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // androidx.appcompat.widget.AbstractC0201a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0201a
    public void setContentHeight(int i4) {
        this.f1024e = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f711m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f711m = view;
        if (view != null && (linearLayout = this.f712n) != null) {
            removeView(linearLayout);
            this.f712n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f708j = charSequence;
        m536i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f707i = charSequence;
        m536i();
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f717s) {
            requestLayout();
        }
        this.f717s = z3;
    }

    @Override // androidx.appcompat.widget.AbstractC0201a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i4) {
        super.setVisibility(i4);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1038a.f5746j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        C0214g0 c0214g0M815v = C0214g0.m815v(context, attributeSet, C1047j.f6173y, i4, 0);
        C0358u.m2057t0(this, c0214g0M815v.m822g(C1047j.f6178z));
        this.f715q = c0214g0M815v.m829n(C1047j.f5937D, 0);
        this.f716r = c0214g0M815v.m829n(C1047j.f5932C, 0);
        this.f1024e = c0214g0M815v.m828m(C1047j.f5927B, 0);
        this.f718t = c0214g0M815v.m829n(C1047j.f5922A, C1044g.f5883d);
        c0214g0M815v.m835w();
    }
}
