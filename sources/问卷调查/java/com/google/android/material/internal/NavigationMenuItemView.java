package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.WeakHashMap;
import p000a.p005b.C0013a;
import p000a.p005b.p012g.p013i.C0056i;
import p000a.p005b.p012g.p013i.InterfaceC0061n;
import p000a.p005b.p014h.C0080f0;
import p000a.p031h.p033c.p034b.C0200h;
import p000a.p031h.p043j.C0243a;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.p044a0.C0245b;
import p070b.p074b.p075a.p076a.p096r.C0651f;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends C0651f implements InterfaceC0061n.a {

    /* renamed from: G */
    public static final int[] f4961G = {R.attr.state_checked};

    /* renamed from: A */
    public FrameLayout f4962A;

    /* renamed from: B */
    public C0056i f4963B;

    /* renamed from: C */
    public ColorStateList f4964C;

    /* renamed from: D */
    public boolean f4965D;

    /* renamed from: E */
    public Drawable f4966E;

    /* renamed from: F */
    public final C0243a f4967F;

    /* renamed from: w */
    public int f4968w;

    /* renamed from: x */
    public boolean f4969x;

    /* renamed from: y */
    public boolean f4970y;

    /* renamed from: z */
    public final CheckedTextView f4971z;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C0940a extends C0243a {
        public C0940a() {
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: d */
        public void mo810d(View view, C0245b c0245b) {
            this.f1556a.onInitializeAccessibilityNodeInfo(view, c0245b.f1563a);
            c0245b.f1563a.setCheckable(NavigationMenuItemView.this.f4970y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C0940a c0940a = new C0940a();
        this.f4967F = c0940a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C1088R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C1088R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C1088R.id.design_menu_item_text);
        this.f4971z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0266o.m875n(checkedTextView, c0940a);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f4962A == null) {
                this.f4962A = (FrameLayout) ((ViewStub) findViewById(C1088R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f4962A.removeAllViews();
            this.f4962A.addView(view);
        }
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0061n.a
    /* renamed from: d */
    public void mo251d(C0056i c0056i, int i) throws Resources.NotFoundException {
        C0080f0.a aVar;
        int i2;
        StateListDrawable stateListDrawable;
        this.f4963B = c0056i;
        int i3 = c0056i.f464a;
        if (i3 > 0) {
            setId(i3);
        }
        setVisibility(c0056i.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C1088R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f4961G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0056i.isCheckable());
        setChecked(c0056i.isChecked());
        setEnabled(c0056i.isEnabled());
        setTitle(c0056i.f468e);
        setIcon(c0056i.getIcon());
        setActionView(c0056i.getActionView());
        setContentDescription(c0056i.f480q);
        C0013a.m13d(this, c0056i.f481r);
        C0056i c0056i2 = this.f4963B;
        if (c0056i2.f468e == null && c0056i2.getIcon() == null && this.f4963B.getActionView() != null) {
            this.f4971z.setVisibility(8);
            FrameLayout frameLayout = this.f4962A;
            if (frameLayout == null) {
                return;
            }
            aVar = (C0080f0.a) frameLayout.getLayoutParams();
            i2 = -1;
        } else {
            this.f4971z.setVisibility(0);
            FrameLayout frameLayout2 = this.f4962A;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (C0080f0.a) frameLayout2.getLayoutParams();
            i2 = -2;
        }
        ((LinearLayout.LayoutParams) aVar).width = i2;
        this.f4962A.setLayoutParams(aVar);
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0061n.a
    public C0056i getItemData() {
        return this.f4963B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0056i c0056i = this.f4963B;
        if (c0056i != null && c0056i.isCheckable() && this.f4963B.isChecked()) {
            ViewGroup.mergeDrawableStates(iArrOnCreateDrawableState, f4961G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f4970y != z) {
            this.f4970y = z;
            this.f4967F.mo814h(this.f4971z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f4971z.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.f4965D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f4964C);
            }
            int i = this.f4968w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f4969x) {
            if (this.f4966E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = C0200h.f1443a;
                Drawable drawable2 = resources.getDrawable(C1088R.drawable.navigation_empty_icon, theme);
                this.f4966E = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f4968w;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f4966E;
        }
        this.f4971z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f4971z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f4968w = i;
    }

    public void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.f4964C = colorStateList;
        this.f4965D = colorStateList != null;
        C0056i c0056i = this.f4963B;
        if (c0056i != null) {
            setIcon(c0056i.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f4971z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f4969x = z;
    }

    public void setTextAppearance(int i) {
        this.f4971z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f4971z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f4971z.setText(charSequence);
    }
}
