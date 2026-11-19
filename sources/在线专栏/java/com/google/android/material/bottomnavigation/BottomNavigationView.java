package com.google.android.material.bottomnavigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0125g;
import androidx.appcompat.widget.C0214g0;
import androidx.core.content.C0332a;
import androidx.core.view.C0340c0;
import androidx.core.view.C0358u;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C1371R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import p088g.C2625g;
import p156u.C3403a;

/* loaded from: classes.dex */
public class BottomNavigationView extends FrameLayout {
    private static final int DEF_STYLE_RES = C1371R.style.Widget_Design_BottomNavigationView;
    private static final int MENU_PRESENTER_ID = 1;
    private ColorStateList itemRippleColor;
    private final C0125g menu;
    private MenuInflater menuInflater;
    final BottomNavigationMenuView menuView;
    private final BottomNavigationPresenter presenter;
    private OnNavigationItemReselectedListener reselectedListener;
    private OnNavigationItemSelectedListener selectedListener;

    public interface OnNavigationItemReselectedListener {
        void onNavigationItemReselected(MenuItem menuItem);
    }

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        Bundle menuPresenterState;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void readFromParcel(Parcel parcel, ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeBundle(this.menuPresenterState);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    private void addCompatibilityTopDivider(Context context) {
        View view = new View(context);
        view.setBackgroundColor(C0332a.m1804b(context, C1371R.color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C1371R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.2
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public C0340c0 onApplyWindowInsets(View view, C0340c0 c0340c0, ViewUtils.RelativePadding relativePadding) {
                relativePadding.bottom += c0340c0.m1871i();
                relativePadding.applyToView(view);
                return c0340c0;
            }
        });
    }

    private MaterialShapeDrawable createMaterialShapeDrawableBackground(Context context) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        materialShapeDrawable.initializeElevationOverlay(context);
        return materialShapeDrawable;
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new C2625g(getContext());
        }
        return this.menuInflater;
    }

    public BadgeDrawable getBadge(int i4) {
        return this.menuView.getBadge(i4);
    }

    public Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.itemRippleColor;
    }

    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.menu;
    }

    public BadgeDrawable getOrCreateBadge(int i4) {
        return this.menuView.getOrCreateBadge(i4);
    }

    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void inflateMenu(int i4) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i4, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(true);
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.menuView.isItemHorizontalTranslationEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuPresenterState);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuPresenterState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    public void removeBadge(int i4) {
        this.menuView.removeBadge(i4);
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        MaterialShapeUtils.setElevation(this, f4);
    }

    public void setItemBackground(Drawable drawable) {
        this.menuView.setItemBackground(drawable);
        this.itemRippleColor = null;
    }

    public void setItemBackgroundResource(int i4) {
        this.menuView.setItemBackgroundRes(i4);
        this.itemRippleColor = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z3) {
        if (this.menuView.isItemHorizontalTranslationEnabled() != z3) {
            this.menuView.setItemHorizontalTranslationEnabled(z3);
            this.presenter.updateMenuView(false);
        }
    }

    public void setItemIconSize(int i4) {
        this.menuView.setItemIconSize(i4);
    }

    public void setItemIconSizeRes(int i4) {
        setItemIconSize(getResources().getDimensionPixelSize(i4));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.itemRippleColor == colorStateList) {
            if (colorStateList != null || this.menuView.getItemBackground() == null) {
                return;
            }
            this.menuView.setItemBackground(null);
            return;
        }
        this.itemRippleColor = colorStateList;
        if (colorStateList == null) {
            this.menuView.setItemBackground(null);
        } else {
            this.menuView.setItemBackground(new RippleDrawable(RippleUtils.convertToRippleDrawableColor(colorStateList), null, null));
        }
    }

    public void setItemTextAppearanceActive(int i4) {
        this.menuView.setItemTextAppearanceActive(i4);
    }

    public void setItemTextAppearanceInactive(int i4) {
        this.menuView.setItemTextAppearanceInactive(i4);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i4) {
        if (this.menuView.getLabelVisibilityMode() != i4) {
            this.menuView.setLabelVisibilityMode(i4);
            this.presenter.updateMenuView(false);
        }
    }

    public void setOnNavigationItemReselectedListener(OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        this.reselectedListener = onNavigationItemReselectedListener;
    }

    public void setOnNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.selectedListener = onNavigationItemSelectedListener;
    }

    public void setSelectedItemId(int i4) {
        MenuItem menuItemFindItem = this.menu.findItem(i4);
        if (menuItemFindItem == null || this.menu.performItemAction(menuItemFindItem, this.presenter, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1371R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i4) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i4, DEF_STYLE_RES), attributeSet, i4);
        BottomNavigationPresenter bottomNavigationPresenter = new BottomNavigationPresenter();
        this.presenter = bottomNavigationPresenter;
        Context context2 = getContext();
        C0125g bottomNavigationMenu = new BottomNavigationMenu(context2);
        this.menu = bottomNavigationMenu;
        BottomNavigationMenuView bottomNavigationMenuView = new BottomNavigationMenuView(context2);
        this.menuView = bottomNavigationMenuView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        bottomNavigationMenuView.setLayoutParams(layoutParams);
        bottomNavigationPresenter.setBottomNavigationMenuView(bottomNavigationMenuView);
        bottomNavigationPresenter.setId(1);
        bottomNavigationMenuView.setPresenter(bottomNavigationPresenter);
        bottomNavigationMenu.addMenuPresenter(bottomNavigationPresenter);
        bottomNavigationPresenter.initForMenu(getContext(), bottomNavigationMenu);
        int[] iArr = C1371R.styleable.BottomNavigationView;
        int i5 = C1371R.style.Widget_Design_BottomNavigationView;
        int i6 = C1371R.styleable.BottomNavigationView_itemTextAppearanceInactive;
        int i7 = C1371R.styleable.BottomNavigationView_itemTextAppearanceActive;
        C0214g0 c0214g0ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, iArr, i4, i5, i6, i7);
        int i8 = C1371R.styleable.BottomNavigationView_itemIconTint;
        if (c0214g0ObtainTintedStyledAttributes.m834s(i8)) {
            bottomNavigationMenuView.setIconTintList(c0214g0ObtainTintedStyledAttributes.m818c(i8));
        } else {
            bottomNavigationMenuView.setIconTintList(bottomNavigationMenuView.createDefaultColorStateList(R.attr.textColorSecondary));
        }
        setItemIconSize(c0214g0ObtainTintedStyledAttributes.m821f(C1371R.styleable.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(C1371R.dimen.design_bottom_navigation_icon_size)));
        if (c0214g0ObtainTintedStyledAttributes.m834s(i6)) {
            setItemTextAppearanceInactive(c0214g0ObtainTintedStyledAttributes.m829n(i6, 0));
        }
        if (c0214g0ObtainTintedStyledAttributes.m834s(i7)) {
            setItemTextAppearanceActive(c0214g0ObtainTintedStyledAttributes.m829n(i7, 0));
        }
        int i9 = C1371R.styleable.BottomNavigationView_itemTextColor;
        if (c0214g0ObtainTintedStyledAttributes.m834s(i9)) {
            setItemTextColor(c0214g0ObtainTintedStyledAttributes.m818c(i9));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C0358u.m2057t0(this, createMaterialShapeDrawableBackground(context2));
        }
        if (c0214g0ObtainTintedStyledAttributes.m834s(C1371R.styleable.BottomNavigationView_elevation)) {
            C0358u.m2065x0(this, c0214g0ObtainTintedStyledAttributes.m821f(r2, 0));
        }
        C3403a.m10398o(getBackground().mutate(), MaterialResources.getColorStateList(context2, c0214g0ObtainTintedStyledAttributes, C1371R.styleable.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(c0214g0ObtainTintedStyledAttributes.m827l(C1371R.styleable.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(c0214g0ObtainTintedStyledAttributes.m816a(C1371R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int iM829n = c0214g0ObtainTintedStyledAttributes.m829n(C1371R.styleable.BottomNavigationView_itemBackground, 0);
        if (iM829n != 0) {
            bottomNavigationMenuView.setItemBackgroundRes(iM829n);
        } else {
            setItemRippleColor(MaterialResources.getColorStateList(context2, c0214g0ObtainTintedStyledAttributes, C1371R.styleable.BottomNavigationView_itemRippleColor));
        }
        int i10 = C1371R.styleable.BottomNavigationView_menu;
        if (c0214g0ObtainTintedStyledAttributes.m834s(i10)) {
            inflateMenu(c0214g0ObtainTintedStyledAttributes.m829n(i10, 0));
        }
        c0214g0ObtainTintedStyledAttributes.m835w();
        addView(bottomNavigationMenuView, layoutParams);
        bottomNavigationMenu.setCallback(new C0125g.a() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.1
            @Override // androidx.appcompat.view.menu.C0125g.a
            public boolean onMenuItemSelected(C0125g c0125g, MenuItem menuItem) {
                if (BottomNavigationView.this.reselectedListener == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                    return (BottomNavigationView.this.selectedListener == null || BottomNavigationView.this.selectedListener.onNavigationItemSelected(menuItem)) ? false : true;
                }
                BottomNavigationView.this.reselectedListener.onNavigationItemReselected(menuItem);
                return true;
            }

            @Override // androidx.appcompat.view.menu.C0125g.a
            public void onMenuModeChange(C0125g c0125g) {
            }
        });
        applyWindowInsets();
    }
}
