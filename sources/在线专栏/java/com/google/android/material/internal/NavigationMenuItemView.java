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
import androidx.appcompat.view.menu.C0127i;
import androidx.appcompat.view.menu.InterfaceC0132n;
import androidx.appcompat.widget.C0218i0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.C0335a;
import androidx.core.view.C0358u;
import androidx.core.widget.C0377k;
import com.google.android.material.C1371R;
import p015c.C1038a;
import p016c0.C1050c;
import p148s.C3368f;
import p156u.C3403a;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements InterfaceC0132n.a {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private final C0335a accessibilityDelegate;
    private FrameLayout actionArea;
    boolean checkable;
    private Drawable emptyDrawable;
    private boolean hasIconTintList;
    private int iconSize;
    private ColorStateList iconTintList;
    private C0127i itemData;
    private boolean needsEmptyIcon;
    private final CheckedTextView textView;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    private void adjustAppearance() {
        if (shouldExpandActionArea()) {
            this.textView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.actionArea.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.textView.setVisibility(0);
        FrameLayout frameLayout2 = this.actionArea;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.actionArea.setLayoutParams(layoutParams2);
        }
    }

    private StateListDrawable createDefaultBackground() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C1038a.f5758v, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.actionArea == null) {
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(C1371R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.actionArea.removeAllViews();
            this.actionArea.addView(view);
        }
    }

    private boolean shouldExpandActionArea() {
        return this.itemData.getTitle() == null && this.itemData.getIcon() == null && this.itemData.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0132n.a
    public C0127i getItemData() {
        return this.itemData;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0132n.a
    public void initialize(C0127i c0127i, int i4) throws Resources.NotFoundException {
        this.itemData = c0127i;
        if (c0127i.getItemId() > 0) {
            setId(c0127i.getItemId());
        }
        setVisibility(c0127i.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0358u.m2057t0(this, createDefaultBackground());
        }
        setCheckable(c0127i.isCheckable());
        setChecked(c0127i.isChecked());
        setEnabled(c0127i.isEnabled());
        setTitle(c0127i.getTitle());
        setIcon(c0127i.getIcon());
        setActionView(c0127i.getActionView());
        setContentDescription(c0127i.getContentDescription());
        C0218i0.m886a(this, c0127i.getTooltipText());
        adjustAppearance();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        C0127i c0127i = this.itemData;
        if (c0127i != null && c0127i.isCheckable() && this.itemData.isChecked()) {
            ViewGroup.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0132n.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout = this.actionArea;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.textView.setCompoundDrawables(null, null, null, null);
    }

    public void setCheckable(boolean z3) {
        refreshDrawableState();
        if (this.checkable != z3) {
            this.checkable = z3;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, 2048);
        }
    }

    public void setChecked(boolean z3) {
        refreshDrawableState();
        this.textView.setChecked(z3);
    }

    public void setHorizontalPadding(int i4) {
        setPadding(i4, 0, i4, 0);
    }

    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.hasIconTintList) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C3403a.m10401r(drawable).mutate();
                C3403a.m10398o(drawable, this.iconTintList);
            }
            int i4 = this.iconSize;
            drawable.setBounds(0, 0, i4, i4);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Drawable drawableM10233d = C3368f.m10233d(getResources(), C1371R.drawable.navigation_empty_icon, getContext().getTheme());
                this.emptyDrawable = drawableM10233d;
                if (drawableM10233d != null) {
                    int i5 = this.iconSize;
                    drawableM10233d.setBounds(0, 0, i5, i5);
                }
            }
            drawable = this.emptyDrawable;
        }
        C0377k.m2196j(this.textView, drawable, null, null, null);
    }

    public void setIconPadding(int i4) {
        this.textView.setCompoundDrawablePadding(i4);
    }

    public void setIconSize(int i4) {
        this.iconSize = i4;
    }

    void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.iconTintList = colorStateList;
        this.hasIconTintList = colorStateList != null;
        C0127i c0127i = this.itemData;
        if (c0127i != null) {
            setIcon(c0127i.getIcon());
        }
    }

    public void setMaxLines(int i4) {
        this.textView.setMaxLines(i4);
    }

    public void setNeedsEmptyIcon(boolean z3) {
        this.needsEmptyIcon = z3;
    }

    public void setShortcut(boolean z3, char c4) {
    }

    public void setTextAppearance(int i4) {
        C0377k.m2201o(this.textView, i4);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        C0335a c0335a = new C0335a() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // androidx.core.view.C0335a
            public void onInitializeAccessibilityNodeInfo(View view, C1050c c1050c) {
                super.onInitializeAccessibilityNodeInfo(view, c1050c);
                c1050c.m4875a0(NavigationMenuItemView.this.checkable);
            }
        };
        this.accessibilityDelegate = c0335a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C1371R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C1371R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C1371R.id.design_menu_item_text);
        this.textView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0358u.m2051q0(checkedTextView, c0335a);
    }
}
