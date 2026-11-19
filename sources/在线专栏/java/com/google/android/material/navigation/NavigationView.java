package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0125g;
import androidx.appcompat.view.menu.C0127i;
import androidx.appcompat.widget.C0214g0;
import androidx.core.content.C0332a;
import androidx.core.view.C0340c0;
import androidx.core.view.C0358u;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C1371R;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import p015c.C1038a;
import p073d.C2443a;
import p088g.C2625g;

/* loaded from: classes.dex */
public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final int[] tmpLocation;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int DEF_STYLE_RES = C1371R.style.Widget_Design_NavigationView;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    private ColorStateList createDefaultColorStateList(int i4) throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i4, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM8168c = C2443a.m8168c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C1038a.f5760x, typedValue, true)) {
            return null;
        }
        int i5 = typedValue.data;
        int defaultColor = colorStateListM8168c.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListM8168c.getColorForState(iArr, defaultColor), i5, defaultColor});
    }

    private final Drawable createDefaultItemBackground(C0214g0 c0214g0) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), c0214g0.m829n(C1371R.styleable.NavigationView_itemShapeAppearance, 0), c0214g0.m829n(C1371R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(MaterialResources.getColorStateList(getContext(), c0214g0, C1371R.styleable.NavigationView_itemShapeFillColor));
        return new InsetDrawable((Drawable) materialShapeDrawable, c0214g0.m821f(C1371R.styleable.NavigationView_itemShapeInsetStart, 0), c0214g0.m821f(C1371R.styleable.NavigationView_itemShapeInsetTop, 0), c0214g0.m821f(C1371R.styleable.NavigationView_itemShapeInsetEnd, 0), c0214g0.m821f(C1371R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new C2625g(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(C0214g0 c0214g0) {
        return c0214g0.m834s(C1371R.styleable.NavigationView_itemShapeAppearance) || c0214g0.m834s(C1371R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z3 = NavigationView.this.tmpLocation[1] == 0;
                NavigationView.this.presenter.setBehindStatusBar(z3);
                NavigationView.this.setDrawTopInsetForeground(z3);
                Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
                if (activity != null) {
                    NavigationView.this.setDrawBottomInsetForeground((activity.findViewById(R.id.content).getHeight() == NavigationView.this.getHeight()) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0));
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(View view) {
        this.presenter.addHeaderView(view);
    }

    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i4) {
        return this.presenter.getHeaderView(i4);
    }

    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    public Menu getMenu() {
        return this.menu;
    }

    public View inflateHeaderView(int i4) {
        return this.presenter.inflateHeaderView(i4);
    }

    public void inflateMenu(int i4) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i4, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    protected void onInsetsChanged(C0340c0 c0340c0) {
        this.presenter.dispatchApplyWindowInsets(c0340c0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        if (mode == Integer.MIN_VALUE) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i4), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    public void removeHeaderView(View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setCheckedItem(int i4) {
        MenuItem menuItemFindItem = this.menu.findItem(i4);
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((C0127i) menuItemFindItem);
        }
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        MaterialShapeUtils.setElevation(this, f4);
    }

    public void setItemBackground(Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i4) {
        setItemBackground(C0332a.m1806d(getContext(), i4));
    }

    public void setItemHorizontalPadding(int i4) {
        this.presenter.setItemHorizontalPadding(i4);
    }

    public void setItemHorizontalPaddingResource(int i4) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i4));
    }

    public void setItemIconPadding(int i4) {
        this.presenter.setItemIconPadding(i4);
    }

    public void setItemIconPaddingResource(int i4) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i4));
    }

    public void setItemIconSize(int i4) {
        this.presenter.setItemIconSize(i4);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i4) {
        this.presenter.setItemMaxLines(i4);
    }

    public void setItemTextAppearance(int i4) {
        this.presenter.setItemTextAppearance(i4);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i4) {
        super.setOverScrollMode(i4);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i4);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
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
        public Bundle menuState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1371R.attr.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i4) throws Resources.NotFoundException {
        ColorStateList colorStateListCreateDefaultColorStateList;
        int iM829n;
        boolean z3;
        int i5 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i4, i5), attributeSet, i4);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.presenter = navigationMenuPresenter;
        this.tmpLocation = new int[2];
        Context context2 = getContext();
        NavigationMenu navigationMenu = new NavigationMenu(context2);
        this.menu = navigationMenu;
        C0214g0 c0214g0ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C1371R.styleable.NavigationView, i4, i5, new int[0]);
        int i6 = C1371R.styleable.NavigationView_android_background;
        if (c0214g0ObtainTintedStyledAttributes.m834s(i6)) {
            C0358u.m2057t0(this, c0214g0ObtainTintedStyledAttributes.m822g(i6));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            Drawable background = getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            if (background instanceof ColorDrawable) {
                materialShapeDrawable.setFillColor(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            C0358u.m2057t0(this, materialShapeDrawable);
        }
        if (c0214g0ObtainTintedStyledAttributes.m834s(C1371R.styleable.NavigationView_elevation)) {
            setElevation(c0214g0ObtainTintedStyledAttributes.m821f(r13, 0));
        }
        setFitsSystemWindows(c0214g0ObtainTintedStyledAttributes.m816a(C1371R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.maxWidth = c0214g0ObtainTintedStyledAttributes.m821f(C1371R.styleable.NavigationView_android_maxWidth, 0);
        int i7 = C1371R.styleable.NavigationView_itemIconTint;
        if (c0214g0ObtainTintedStyledAttributes.m834s(i7)) {
            colorStateListCreateDefaultColorStateList = c0214g0ObtainTintedStyledAttributes.m818c(i7);
        } else {
            colorStateListCreateDefaultColorStateList = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        int i8 = C1371R.styleable.NavigationView_itemTextAppearance;
        if (c0214g0ObtainTintedStyledAttributes.m834s(i8)) {
            iM829n = c0214g0ObtainTintedStyledAttributes.m829n(i8, 0);
            z3 = true;
        } else {
            iM829n = 0;
            z3 = false;
        }
        int i9 = C1371R.styleable.NavigationView_itemIconSize;
        if (c0214g0ObtainTintedStyledAttributes.m834s(i9)) {
            setItemIconSize(c0214g0ObtainTintedStyledAttributes.m821f(i9, 0));
        }
        int i10 = C1371R.styleable.NavigationView_itemTextColor;
        ColorStateList colorStateListM818c = c0214g0ObtainTintedStyledAttributes.m834s(i10) ? c0214g0ObtainTintedStyledAttributes.m818c(i10) : null;
        if (!z3 && colorStateListM818c == null) {
            colorStateListM818c = createDefaultColorStateList(R.attr.textColorPrimary);
        }
        Drawable drawableM822g = c0214g0ObtainTintedStyledAttributes.m822g(C1371R.styleable.NavigationView_itemBackground);
        if (drawableM822g == null && hasShapeAppearance(c0214g0ObtainTintedStyledAttributes)) {
            drawableM822g = createDefaultItemBackground(c0214g0ObtainTintedStyledAttributes);
        }
        int i11 = C1371R.styleable.NavigationView_itemHorizontalPadding;
        if (c0214g0ObtainTintedStyledAttributes.m834s(i11)) {
            navigationMenuPresenter.setItemHorizontalPadding(c0214g0ObtainTintedStyledAttributes.m821f(i11, 0));
        }
        int iM821f = c0214g0ObtainTintedStyledAttributes.m821f(C1371R.styleable.NavigationView_itemIconPadding, 0);
        setItemMaxLines(c0214g0ObtainTintedStyledAttributes.m826k(C1371R.styleable.NavigationView_itemMaxLines, 1));
        navigationMenu.setCallback(new C0125g.a() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // androidx.appcompat.view.menu.C0125g.a
            public boolean onMenuItemSelected(C0125g c0125g, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            }

            @Override // androidx.appcompat.view.menu.C0125g.a
            public void onMenuModeChange(C0125g c0125g) {
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        navigationMenuPresenter.setItemIconTintList(colorStateListCreateDefaultColorStateList);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (z3) {
            navigationMenuPresenter.setItemTextAppearance(iM829n);
        }
        navigationMenuPresenter.setItemTextColor(colorStateListM818c);
        navigationMenuPresenter.setItemBackground(drawableM822g);
        navigationMenuPresenter.setItemIconPadding(iM821f);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        int i12 = C1371R.styleable.NavigationView_menu;
        if (c0214g0ObtainTintedStyledAttributes.m834s(i12)) {
            inflateMenu(c0214g0ObtainTintedStyledAttributes.m829n(i12, 0));
        }
        int i13 = C1371R.styleable.NavigationView_headerLayout;
        if (c0214g0ObtainTintedStyledAttributes.m834s(i13)) {
            inflateHeaderView(c0214g0ObtainTintedStyledAttributes.m829n(i13, 0));
        }
        c0214g0ObtainTintedStyledAttributes.m835w();
        setupInsetScrimsListener();
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.menu.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((C0127i) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
