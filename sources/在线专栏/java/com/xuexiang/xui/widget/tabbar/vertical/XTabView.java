package com.xuexiang.xui.widget.tabbar.vertical;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import com.xuexiang.xui.widget.tabbar.vertical.ITabView;
import com.xuexiang.xui.widget.textview.badge.Badge;

/* loaded from: classes.dex */
public class XTabView extends TabView {
    private Badge mBadgeView;
    private boolean mChecked;
    private Context mContext;
    private Drawable mDefaultBackground;
    private ITabView.TabBadge mTabBadge;
    private ITabView.TabIcon mTabIcon;
    private ITabView.TabTitle mTabTitle;
    private TextView mTitle;

    public XTabView(Context context) throws Resources.NotFoundException {
        super(context);
        this.mContext = context;
        this.mTabIcon = new ITabView.TabIcon.Builder().build();
        this.mTabTitle = new ITabView.TabTitle.Builder().build();
        this.mTabBadge = new ITabView.TabBadge.Builder().build();
        initView();
        TypedArray typedArrayObtainStyledAttributes = this.mContext.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackgroundBorderless});
        this.mDefaultBackground = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        setDefaultBackground();
    }

    private void initBadge() {
        this.mBadgeView = TabBadgeView.bindTab(this);
        if (this.mTabBadge.getBackgroundColor() != -1552832) {
            this.mBadgeView.setBadgeBackgroundColor(this.mTabBadge.getBackgroundColor());
        }
        if (this.mTabBadge.getBadgeTextColor() != -1) {
            this.mBadgeView.setBadgeTextColor(this.mTabBadge.getBadgeTextColor());
        }
        if (this.mTabBadge.getStrokeColor() != 0 || this.mTabBadge.getStrokeWidth() != IGoodView.DEFAULT_TO_ALPHA) {
            this.mBadgeView.stroke(this.mTabBadge.getStrokeColor(), this.mTabBadge.getStrokeWidth(), true);
        }
        if (this.mTabBadge.getDrawableBackground() != null || this.mTabBadge.isDrawableBackgroundClip()) {
            this.mBadgeView.setBadgeBackground(this.mTabBadge.getDrawableBackground(), this.mTabBadge.isDrawableBackgroundClip());
        }
        if (this.mTabBadge.getBadgeTextSize() != 11.0f) {
            this.mBadgeView.setBadgeTextSize(this.mTabBadge.getBadgeTextSize(), true);
        }
        if (this.mTabBadge.getBadgePadding() != 5.0f) {
            this.mBadgeView.setBadgePadding(this.mTabBadge.getBadgePadding(), true);
        }
        if (this.mTabBadge.getBadgeNumber() != 0) {
            this.mBadgeView.setBadgeNumber(this.mTabBadge.getBadgeNumber());
        }
        if (this.mTabBadge.getBadgeText() != null) {
            this.mBadgeView.setBadgeText(this.mTabBadge.getBadgeText());
        }
        if (this.mTabBadge.getBadgeGravity() != 8388661) {
            this.mBadgeView.setBadgeGravity(this.mTabBadge.getBadgeGravity());
        }
        if (this.mTabBadge.getGravityOffsetX() != 1 || this.mTabBadge.getGravityOffsetY() != 1) {
            this.mBadgeView.setGravityOffset(this.mTabBadge.getGravityOffsetX(), this.mTabBadge.getGravityOffsetY(), true);
        }
        if (this.mTabBadge.isExactMode()) {
            this.mBadgeView.setExactMode(this.mTabBadge.isExactMode());
        }
        if (!this.mTabBadge.isShowShadow()) {
            this.mBadgeView.setShowShadow(this.mTabBadge.isShowShadow());
        }
        if (this.mTabBadge.getOnDragStateChangedListener() != null) {
            this.mBadgeView.setOnDragStateChangedListener(this.mTabBadge.getOnDragStateChangedListener());
        }
    }

    private void initIconView() throws Resources.NotFoundException {
        Drawable drawable;
        int selectedIcon = this.mChecked ? this.mTabIcon.getSelectedIcon() : this.mTabIcon.getNormalIcon();
        if (selectedIcon != 0) {
            drawable = this.mContext.getResources().getDrawable(selectedIcon);
            drawable.setBounds(0, 0, this.mTabIcon.getIconWidth() != -1 ? this.mTabIcon.getIconWidth() : drawable.getIntrinsicWidth(), this.mTabIcon.getIconHeight() != -1 ? this.mTabIcon.getIconHeight() : drawable.getIntrinsicHeight());
        } else {
            drawable = null;
        }
        int iconGravity = this.mTabIcon.getIconGravity();
        if (iconGravity == 48) {
            this.mTitle.setCompoundDrawables(null, drawable, null, null);
        } else if (iconGravity == 80) {
            this.mTitle.setCompoundDrawables(null, null, null, drawable);
        } else if (iconGravity == 8388611) {
            this.mTitle.setCompoundDrawables(drawable, null, null, null);
        } else if (iconGravity == 8388613) {
            this.mTitle.setCompoundDrawables(null, null, drawable, null);
        }
        refreshDrawablePadding();
    }

    private void initTitleView() {
        this.mTitle.setTextColor(isChecked() ? this.mTabTitle.getColorSelected() : this.mTabTitle.getColorNormal());
        this.mTitle.setTextSize(this.mTabTitle.getTitleTextSize());
        this.mTitle.setText(this.mTabTitle.getContent());
        this.mTitle.setGravity(17);
        this.mTitle.setEllipsize(TextUtils.TruncateAt.END);
        this.mTitle.setTypeface(XUI.getDefaultTypeface());
        refreshDrawablePadding();
    }

    private void initView() throws Resources.NotFoundException {
        setMinimumHeight(DensityUtils.dp2px(this.mContext, 25.0f));
        if (this.mTitle == null) {
            this.mTitle = new TextView(this.mContext);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.gravity = 17;
            this.mTitle.setLayoutParams(layoutParams);
            addView(this.mTitle);
        }
        initTitleView();
        initIconView();
        initBadge();
    }

    private void refreshDrawablePadding() {
        if ((this.mChecked ? this.mTabIcon.getSelectedIcon() : this.mTabIcon.getNormalIcon()) == 0) {
            this.mTitle.setCompoundDrawablePadding(0);
            return;
        }
        if (!TextUtils.isEmpty(this.mTabTitle.getContent()) && this.mTitle.getCompoundDrawablePadding() != this.mTabIcon.getMargin()) {
            this.mTitle.setCompoundDrawablePadding(this.mTabIcon.getMargin());
        } else if (TextUtils.isEmpty(this.mTabTitle.getContent())) {
            this.mTitle.setCompoundDrawablePadding(0);
        }
    }

    private void setDefaultBackground() {
        Drawable background = getBackground();
        Drawable drawable = this.mDefaultBackground;
        if (background != drawable) {
            setBackground(drawable);
        }
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.ITabView
    public ITabView.TabBadge getBadge() {
        return this.mTabBadge;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.TabView
    public Badge getBadgeView() {
        return this.mBadgeView;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.ITabView
    public ITabView.TabIcon getIcon() {
        return this.mTabIcon;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.TabView
    @Deprecated
    public ImageView getIconView() {
        return null;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.ITabView
    public ITabView.TabTitle getTitle() {
        return this.mTabTitle;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.TabView
    public TextView getTitleView() {
        return this.mTitle;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.mChecked;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        setBackground(i4);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) throws Resources.NotFoundException {
        this.mChecked = z3;
        setSelected(z3);
        refreshDrawableState();
        this.mTitle.setTextColor(z3 ? this.mTabTitle.getColorSelected() : this.mTabTitle.getColorNormal());
        initIconView();
    }

    @Override // android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
        this.mTitle.setPadding(i4, i5, i6, i7);
    }

    @Override // android.view.View
    public void setPaddingRelative(int i4, int i5, int i6, int i7) {
        this.mTitle.setPaddingRelative(i4, i5, i6, i7);
    }

    @Override // android.widget.Checkable
    public void toggle() throws Resources.NotFoundException {
        setChecked(!this.mChecked);
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.ITabView
    public XTabView setBackground(int i4) {
        if (i4 == 0) {
            setDefaultBackground();
        } else if (i4 <= 0) {
            setBackground((Drawable) null);
        } else {
            super.setBackgroundResource(i4);
        }
        return this;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.ITabView
    public XTabView setBadge(ITabView.TabBadge tabBadge) {
        if (tabBadge != null) {
            this.mTabBadge = tabBadge;
        }
        initBadge();
        return this;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.ITabView
    public XTabView setIcon(ITabView.TabIcon tabIcon) throws Resources.NotFoundException {
        if (tabIcon != null) {
            this.mTabIcon = tabIcon;
        }
        initIconView();
        return this;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.ITabView
    public XTabView setTitle(ITabView.TabTitle tabTitle) {
        if (tabTitle != null) {
            this.mTabTitle = tabTitle;
        }
        initTitleView();
        return this;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
    }
}
