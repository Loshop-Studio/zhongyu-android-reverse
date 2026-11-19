package com.google.android.material.bottomnavigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0127i;
import androidx.appcompat.view.menu.InterfaceC0132n;
import androidx.appcompat.widget.C0218i0;
import androidx.core.content.C0332a;
import androidx.core.view.C0357t;
import androidx.core.view.C0358u;
import androidx.core.widget.C0377k;
import com.google.android.material.C1371R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.p071ut.device.AidConstants;
import p016c0.C1050c;
import p156u.C3403a;

/* loaded from: classes.dex */
public class BottomNavigationItemView extends FrameLayout implements InterfaceC0132n.a {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public static final int INVALID_ITEM_POSITION = -1;
    private BadgeDrawable badgeDrawable;
    private final int defaultMargin;
    private ImageView icon;
    private ColorStateList iconTint;
    private boolean isShifting;
    private C0127i itemData;
    private int itemPosition;
    private int labelVisibilityMode;
    private final TextView largeLabel;
    private Drawable originalIconDrawable;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final TextView smallLabel;
    private Drawable wrappedIconDrawable;

    public BottomNavigationItemView(Context context) {
        this(context, null);
    }

    private void calculateTextScaleFactors(float f4, float f5) {
        this.shiftAmount = f4 - f5;
        this.scaleUpFactor = (f5 * 1.0f) / f4;
        this.scaleDownFactor = (f4 * 1.0f) / f5;
    }

    private FrameLayout getCustomParentForBadge(View view) {
        ImageView imageView = this.icon;
        if (view == imageView && BadgeUtils.USE_COMPAT_PARENT) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private boolean hasBadge() {
        return this.badgeDrawable != null;
    }

    private void setViewLayoutParams(View view, int i4, int i5) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i4;
        layoutParams.gravity = i5;
        view.setLayoutParams(layoutParams);
    }

    private void setViewValues(View view, float f4, float f5, int i4) {
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setVisibility(i4);
    }

    private void tryAttachBadgeToAnchor(View view) {
        if (hasBadge() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    private void tryRemoveBadgeFromAnchor(View view) {
        if (hasBadge()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
            }
            this.badgeDrawable = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryUpdateBadgeBounds(View view) {
        if (hasBadge()) {
            BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0132n.a
    public C0127i getItemData() {
        return this.itemData;
    }

    public int getItemPosition() {
        return this.itemPosition;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0132n.a
    public void initialize(C0127i c0127i, int i4) {
        this.itemData = c0127i;
        setCheckable(c0127i.isCheckable());
        setChecked(c0127i.isChecked());
        setEnabled(c0127i.isEnabled());
        setIcon(c0127i.getIcon());
        setTitle(c0127i.getTitle());
        setId(c0127i.getItemId());
        if (!TextUtils.isEmpty(c0127i.getContentDescription())) {
            setContentDescription(c0127i.getContentDescription());
        }
        C0218i0.m886a(this, !TextUtils.isEmpty(c0127i.getTooltipText()) ? c0127i.getTooltipText() : c0127i.getTitle());
        setVisibility(c0127i.isVisible() ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i4) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        C0127i c0127i = this.itemData;
        if (c0127i != null && c0127i.isCheckable() && this.itemData.isChecked()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.itemData.getTitle();
            if (!TextUtils.isEmpty(this.itemData.getContentDescription())) {
                title = this.itemData.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.badgeDrawable.getContentDescription()));
        }
        C1050c c1050cM4832H0 = C1050c.m4832H0(accessibilityNodeInfo);
        c1050cM4832H0.m4884f0(C1050c.c.m4923a(0, 1, getItemPosition(), 1, false, isSelected()));
        if (isSelected()) {
            c1050cM4832H0.m4881d0(false);
            c1050cM4832H0.m4869T(C1050c.a.f6211i);
        }
        c1050cM4832H0.m4911w0(getResources().getString(C1371R.string.item_view_role_description));
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0132n.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    void removeBadge() {
        tryRemoveBadgeFromAnchor(this.icon);
    }

    void setBadge(BadgeDrawable badgeDrawable) {
        this.badgeDrawable = badgeDrawable;
        ImageView imageView = this.icon;
        if (imageView != null) {
            tryAttachBadgeToAnchor(imageView);
        }
    }

    public void setCheckable(boolean z3) {
        refreshDrawableState();
    }

    public void setChecked(boolean z3) {
        this.largeLabel.setPivotX(r0.getWidth() / 2);
        this.largeLabel.setPivotY(r0.getBaseline());
        this.smallLabel.setPivotX(r0.getWidth() / 2);
        this.smallLabel.setPivotY(r0.getBaseline());
        int i4 = this.labelVisibilityMode;
        if (i4 != -1) {
            if (i4 == 0) {
                if (z3) {
                    setViewLayoutParams(this.icon, this.defaultMargin, 49);
                    setViewValues(this.largeLabel, 1.0f, 1.0f, 0);
                } else {
                    setViewLayoutParams(this.icon, this.defaultMargin, 17);
                    setViewValues(this.largeLabel, 0.5f, 0.5f, 4);
                }
                this.smallLabel.setVisibility(4);
            } else if (i4 != 1) {
                if (i4 == 2) {
                    setViewLayoutParams(this.icon, this.defaultMargin, 17);
                    this.largeLabel.setVisibility(8);
                    this.smallLabel.setVisibility(8);
                }
            } else if (z3) {
                setViewLayoutParams(this.icon, (int) (this.defaultMargin + this.shiftAmount), 49);
                setViewValues(this.largeLabel, 1.0f, 1.0f, 0);
                TextView textView = this.smallLabel;
                float f4 = this.scaleUpFactor;
                setViewValues(textView, f4, f4, 4);
            } else {
                setViewLayoutParams(this.icon, this.defaultMargin, 49);
                TextView textView2 = this.largeLabel;
                float f5 = this.scaleDownFactor;
                setViewValues(textView2, f5, f5, 4);
                setViewValues(this.smallLabel, 1.0f, 1.0f, 0);
            }
        } else if (this.isShifting) {
            if (z3) {
                setViewLayoutParams(this.icon, this.defaultMargin, 49);
                setViewValues(this.largeLabel, 1.0f, 1.0f, 0);
            } else {
                setViewLayoutParams(this.icon, this.defaultMargin, 17);
                setViewValues(this.largeLabel, 0.5f, 0.5f, 4);
            }
            this.smallLabel.setVisibility(4);
        } else if (z3) {
            setViewLayoutParams(this.icon, (int) (this.defaultMargin + this.shiftAmount), 49);
            setViewValues(this.largeLabel, 1.0f, 1.0f, 0);
            TextView textView3 = this.smallLabel;
            float f6 = this.scaleUpFactor;
            setViewValues(textView3, f6, f6, 4);
        } else {
            setViewLayoutParams(this.icon, this.defaultMargin, 49);
            TextView textView4 = this.largeLabel;
            float f7 = this.scaleDownFactor;
            setViewValues(textView4, f7, f7, 4);
            setViewValues(this.smallLabel, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z3);
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        this.smallLabel.setEnabled(z3);
        this.largeLabel.setEnabled(z3);
        this.icon.setEnabled(z3);
        if (z3) {
            C0358u.m1989F0(this, C0357t.m1976b(getContext(), AidConstants.EVENT_REQUEST_FAILED));
        } else {
            C0358u.m1989F0(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.originalIconDrawable) {
            return;
        }
        this.originalIconDrawable = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C3403a.m10401r(drawable).mutate();
            this.wrappedIconDrawable = drawable;
            ColorStateList colorStateList = this.iconTint;
            if (colorStateList != null) {
                C3403a.m10398o(drawable, colorStateList);
            }
        }
        this.icon.setImageDrawable(drawable);
    }

    public void setIconSize(int i4) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.icon.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i4;
        this.icon.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.iconTint = colorStateList;
        if (this.itemData == null || (drawable = this.wrappedIconDrawable) == null) {
            return;
        }
        C3403a.m10398o(drawable, colorStateList);
        this.wrappedIconDrawable.invalidateSelf();
    }

    public void setItemBackground(int i4) {
        setItemBackground(i4 == 0 ? null : C0332a.m1806d(getContext(), i4));
    }

    public void setItemPosition(int i4) {
        this.itemPosition = i4;
    }

    public void setLabelVisibilityMode(int i4) {
        if (this.labelVisibilityMode != i4) {
            this.labelVisibilityMode = i4;
            C0127i c0127i = this.itemData;
            if (c0127i != null) {
                setChecked(c0127i.isChecked());
            }
        }
    }

    public void setShifting(boolean z3) {
        if (this.isShifting != z3) {
            this.isShifting = z3;
            C0127i c0127i = this.itemData;
            if (c0127i != null) {
                setChecked(c0127i.isChecked());
            }
        }
    }

    public void setShortcut(boolean z3, char c4) {
    }

    public void setTextAppearanceActive(int i4) {
        C0377k.m2201o(this.largeLabel, i4);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextAppearanceInactive(int i4) {
        C0377k.m2201o(this.smallLabel, i4);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.smallLabel.setTextColor(colorStateList);
            this.largeLabel.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.smallLabel.setText(charSequence);
        this.largeLabel.setText(charSequence);
        C0127i c0127i = this.itemData;
        if (c0127i == null || TextUtils.isEmpty(c0127i.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C0127i c0127i2 = this.itemData;
        if (c0127i2 != null && !TextUtils.isEmpty(c0127i2.getTooltipText())) {
            charSequence = this.itemData.getTooltipText();
        }
        C0218i0.m886a(this, charSequence);
    }

    public boolean showsIcon() {
        return true;
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.itemPosition = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(C1371R.layout.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(C1371R.drawable.design_bottom_navigation_item_background);
        this.defaultMargin = resources.getDimensionPixelSize(C1371R.dimen.design_bottom_navigation_margin);
        this.icon = (ImageView) findViewById(C1371R.id.icon);
        TextView textView = (TextView) findViewById(C1371R.id.smallLabel);
        this.smallLabel = textView;
        TextView textView2 = (TextView) findViewById(C1371R.id.largeLabel);
        this.largeLabel = textView2;
        C0358u.m1979A0(textView, 2);
        C0358u.m1979A0(textView2, 2);
        setFocusable(true);
        calculateTextScaleFactors(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.icon;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationItemView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                    if (BottomNavigationItemView.this.icon.getVisibility() == 0) {
                        BottomNavigationItemView bottomNavigationItemView = BottomNavigationItemView.this;
                        bottomNavigationItemView.tryUpdateBadgeBounds(bottomNavigationItemView.icon);
                    }
                }
            });
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C0358u.m2057t0(this, drawable);
    }
}
