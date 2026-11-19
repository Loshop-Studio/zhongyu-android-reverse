package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.WeakHashMap;
import p000a.p005b.C0014b;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p005b.p012g.AbstractC0040a;
import p000a.p005b.p014h.AbstractC0067a;
import p000a.p005b.p014h.C0069a1;
import p000a.p005b.p014h.C0073c;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0067a {

    /* renamed from: j */
    public CharSequence f2779j;

    /* renamed from: k */
    public CharSequence f2780k;

    /* renamed from: l */
    public View f2781l;

    /* renamed from: m */
    public View f2782m;

    /* renamed from: n */
    public View f2783n;

    /* renamed from: o */
    public LinearLayout f2784o;

    /* renamed from: p */
    public TextView f2785p;

    /* renamed from: q */
    public TextView f2786q;

    /* renamed from: r */
    public int f2787r;

    /* renamed from: s */
    public int f2788s;

    /* renamed from: t */
    public boolean f2789t;

    /* renamed from: u */
    public int f2790u;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class ViewOnClickListenerC0462a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ AbstractC0040a f2791b;

        public ViewOnClickListenerC0462a(ActionBarContextView actionBarContextView, AbstractC0040a abstractC0040a) {
            this.f2791b = abstractC0040a;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f2791b.mo115c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, C1088R.attr.actionModeStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0014b.f29d, C1088R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : C0034a.m129a(context, resourceId);
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        setBackground(drawable);
        this.f2787r = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f2788s = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f545f = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f2790u = typedArrayObtainStyledAttributes.getResourceId(2, C1088R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1571f(p000a.p005b.p012g.AbstractC0040a r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f2781l
            r1 = 0
            if (r0 != 0) goto L16
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.f2790u
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.f2781l = r0
            goto L1e
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L21
            android.view.View r0 = r6.f2781l
        L1e:
            r6.addView(r0)
        L21:
            android.view.View r0 = r6.f2781l
            r2 = 2131296346(0x7f09005a, float:1.8210606E38)
            android.view.View r0 = r0.findViewById(r2)
            r6.f2782m = r0
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            android.view.Menu r7 = r7.mo117e()
            a.b.g.i.g r7 = (p000a.p005b.p012g.p013i.C0054g) r7
            a.b.h.c r0 = r6.f544e
            if (r0 == 0) goto L41
            r0.m285a()
        L41:
            a.b.h.c r0 = new a.b.h.c
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.f544e = r0
            r2 = 1
            r0.f559m = r2
            r0.f560n = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            a.b.h.c r3 = r6.f544e
            android.content.Context r4 = r6.f542c
            r7.m197b(r3, r4)
            a.b.h.c r7 = r6.f544e
            a.b.g.i.n r3 = r7.f378i
            if (r3 != 0) goto L79
            android.view.LayoutInflater r4 = r7.f374e
            int r5 = r7.f376g
            android.view.View r1 = r4.inflate(r5, r6, r1)
            a.b.g.i.n r1 = (p000a.p005b.p012g.p013i.InterfaceC0061n) r1
            r7.f378i = r1
            a.b.g.i.g r4 = r7.f373d
            r1.mo250c(r4)
            r7.mo177i(r2)
        L79:
            a.b.g.i.n r1 = r7.f378i
            if (r3 == r1) goto L83
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L83:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.f543d = r1
            r7 = 0
            java.util.WeakHashMap<android.view.View, a.h.j.v> r2 = p000a.p031h.p043j.C0266o.f1616a
            r1.setBackground(r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.f543d
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.m1571f(a.b.g.a):void");
    }

    /* renamed from: g */
    public final void m1572g() {
        if (this.f2784o == null) {
            LayoutInflater.from(getContext()).inflate(C1088R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2784o = linearLayout;
            this.f2785p = (TextView) linearLayout.findViewById(C1088R.id.action_bar_title);
            this.f2786q = (TextView) this.f2784o.findViewById(C1088R.id.action_bar_subtitle);
            if (this.f2787r != 0) {
                this.f2785p.setTextAppearance(getContext(), this.f2787r);
            }
            if (this.f2788s != 0) {
                this.f2786q.setTextAppearance(getContext(), this.f2788s);
            }
        }
        this.f2785p.setText(this.f2779j);
        this.f2786q.setText(this.f2780k);
        boolean z = !TextUtils.isEmpty(this.f2779j);
        boolean z2 = !TextUtils.isEmpty(this.f2780k);
        int i = 0;
        this.f2786q.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f2784o;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f2784o.getParent() == null) {
            addView(this.f2784o);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // p000a.p005b.p014h.AbstractC0067a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // p000a.p005b.p014h.AbstractC0067a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f2780k;
    }

    public CharSequence getTitle() {
        return this.f2779j;
    }

    /* renamed from: h */
    public void m1573h() {
        removeAllViews();
        this.f2783n = null;
        this.f543d = null;
        this.f544e = null;
        View view = this.f2782m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0073c c0073c = this.f544e;
        if (c0073c != null) {
            c0073c.m287f();
            this.f544e.m288l();
        }
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
        accessibilityEvent.setContentDescription(this.f2779j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zM281b = C0069a1.m281b(this);
        int paddingRight = zM281b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2781l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2781l.getLayoutParams();
            int i5 = zM281b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zM281b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = zM281b ? paddingRight - i5 : paddingRight + i5;
            int iM255d = i7 + m255d(this.f2781l, i7, paddingTop, paddingTop2, zM281b);
            paddingRight = zM281b ? iM255d - i6 : iM255d + i6;
        }
        int iM255d2 = paddingRight;
        LinearLayout linearLayout = this.f2784o;
        if (linearLayout != null && this.f2783n == null && linearLayout.getVisibility() != 8) {
            iM255d2 += m255d(this.f2784o, iM255d2, paddingTop, paddingTop2, zM281b);
        }
        int i8 = iM255d2;
        View view2 = this.f2783n;
        if (view2 != null) {
            m255d(view2, i8, paddingTop, paddingTop2, zM281b);
        }
        int paddingLeft = zM281b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f543d;
        if (actionMenuView != null) {
            m255d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM281b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f545f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f2781l;
        if (view != null) {
            int iM254c = m254c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2781l.getLayoutParams();
            paddingLeft = iM254c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f543d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m254c(this.f543d, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f2784o;
        if (linearLayout != null && this.f2783n == null) {
            if (this.f2789t) {
                this.f2784o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f2784o.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f2784o.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m254c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f2783n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f2783n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f545f <= 0) {
            int childCount = getChildCount();
            size2 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > size2) {
                    size2 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // p000a.p005b.p014h.AbstractC0067a
    public void setContentHeight(int i) {
        this.f545f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2783n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2783n = view;
        if (view != null && (linearLayout = this.f2784o) != null) {
            removeView(linearLayout);
            this.f2784o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2780k = charSequence;
        m1572g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2779j = charSequence;
        m1572g();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f2789t) {
            requestLayout();
        }
        this.f2789t = z;
    }

    @Override // p000a.p005b.p014h.AbstractC0067a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
