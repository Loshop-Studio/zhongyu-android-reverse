package com.xuexiang.xui.widget.tabbar.vertical;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.badge.BadgeDrawable;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import com.xuexiang.xui.widget.textview.badge.Badge;
import com.xuexiang.xui.widget.textview.badge.BadgeView;

/* loaded from: classes.dex */
public interface ITabView {

    public static class TabBadge {
        private Builder mBuilder;

        public static class Builder {
            private Badge.OnDragStateChangedListener dragStateChangedListener;
            private int colorBackground = BadgeView.DEFAULT_COLOR_BACKGROUND;
            private int colorBadgeText = -1;
            private int colorStroke = 0;
            private Drawable drawableBackground = null;
            private boolean drawableBackgroundClip = false;
            private float strokeWidth = IGoodView.DEFAULT_TO_ALPHA;
            private float badgeTextSize = 11.0f;
            private float badgePadding = 5.0f;
            private int badgeNumber = 0;
            private String badgeText = null;
            private int badgeGravity = BadgeDrawable.TOP_END;
            private int gravityOffsetX = 1;
            private int gravityOffsetY = 1;
            private boolean exactMode = false;
            private boolean showShadow = true;

            public TabBadge build() {
                return new TabBadge(this);
            }

            public Builder setBackgroundColor(int i4) {
                this.colorBackground = i4;
                return this;
            }

            public Builder setBadgeGravity(int i4) {
                this.badgeGravity = i4;
                return this;
            }

            public Builder setBadgeNumber(int i4) {
                this.badgeNumber = i4;
                this.badgeText = null;
                return this;
            }

            public Builder setBadgePadding(float f4) {
                this.badgePadding = f4;
                return this;
            }

            public Builder setBadgeText(String str) {
                this.badgeText = str;
                this.badgeNumber = 0;
                return this;
            }

            public Builder setBadgeTextColor(int i4) {
                this.colorBadgeText = i4;
                return this;
            }

            public Builder setBadgeTextSize(float f4) {
                this.badgeTextSize = f4;
                return this;
            }

            public Builder setDrawableBackground(Drawable drawable, boolean z3) {
                this.drawableBackground = drawable;
                this.drawableBackgroundClip = z3;
                return this;
            }

            public Builder setExactMode(boolean z3) {
                this.exactMode = z3;
                return this;
            }

            public Builder setGravityOffset(int i4, int i5) {
                this.gravityOffsetX = i4;
                this.gravityOffsetY = i5;
                return this;
            }

            public Builder setOnDragStateChangedListener(Badge.OnDragStateChangedListener onDragStateChangedListener) {
                this.dragStateChangedListener = onDragStateChangedListener;
                return this;
            }

            public Builder setShowShadow(boolean z3) {
                this.showShadow = z3;
                return this;
            }

            public Builder stroke(int i4, int i5) {
                this.colorStroke = i4;
                this.strokeWidth = i5;
                return this;
            }
        }

        public int getBackgroundColor() {
            return this.mBuilder.colorBackground;
        }

        public int getBadgeGravity() {
            return this.mBuilder.badgeGravity;
        }

        public int getBadgeNumber() {
            return this.mBuilder.badgeNumber;
        }

        public float getBadgePadding() {
            return this.mBuilder.badgePadding;
        }

        public String getBadgeText() {
            return this.mBuilder.badgeText;
        }

        public int getBadgeTextColor() {
            return this.mBuilder.colorBadgeText;
        }

        public float getBadgeTextSize() {
            return this.mBuilder.badgeTextSize;
        }

        public Drawable getDrawableBackground() {
            return this.mBuilder.drawableBackground;
        }

        public int getGravityOffsetX() {
            return this.mBuilder.gravityOffsetX;
        }

        public int getGravityOffsetY() {
            return this.mBuilder.gravityOffsetY;
        }

        public Badge.OnDragStateChangedListener getOnDragStateChangedListener() {
            return this.mBuilder.dragStateChangedListener;
        }

        public int getStrokeColor() {
            return this.mBuilder.colorStroke;
        }

        public float getStrokeWidth() {
            return this.mBuilder.strokeWidth;
        }

        public boolean isDrawableBackgroundClip() {
            return this.mBuilder.drawableBackgroundClip;
        }

        public boolean isExactMode() {
            return this.mBuilder.exactMode;
        }

        public boolean isShowShadow() {
            return this.mBuilder.showShadow;
        }

        private TabBadge(Builder builder) {
            this.mBuilder = builder;
        }
    }

    public static class TabIcon {
        private Builder mBuilder;

        public static class Builder {
            private int mSelectedIcon = 0;
            private int mNormalIcon = 0;
            private int mIconWidth = -1;
            private int mIconHeight = -1;
            private int mIconGravity = 8388611;
            private int mMargin = 0;

            public TabIcon build() {
                return new TabIcon(this);
            }

            public Builder setIcon(int i4, int i5) {
                this.mSelectedIcon = i4;
                this.mNormalIcon = i5;
                return this;
            }

            public Builder setIconGravity(int i4) {
                if (i4 != 8388611) {
                    if ((i4 != 8388613) & (i4 != 48) & (i4 != 80)) {
                        throw new IllegalStateException("iconGravity only support Gravity.START or Gravity.END or Gravity.TOP or Gravity.BOTTOM");
                    }
                }
                this.mIconGravity = i4;
                return this;
            }

            public Builder setIconMargin(int i4) {
                this.mMargin = i4;
                return this;
            }

            public Builder setIconSize(int i4, int i5) {
                this.mIconWidth = i4;
                this.mIconHeight = i5;
                return this;
            }
        }

        public int getIconGravity() {
            return this.mBuilder.mIconGravity;
        }

        public int getIconHeight() {
            return this.mBuilder.mIconHeight;
        }

        public int getIconWidth() {
            return this.mBuilder.mIconWidth;
        }

        public int getMargin() {
            return this.mBuilder.mMargin;
        }

        public int getNormalIcon() {
            return this.mBuilder.mNormalIcon;
        }

        public int getSelectedIcon() {
            return this.mBuilder.mSelectedIcon;
        }

        private TabIcon(Builder builder) {
            this.mBuilder = builder;
        }
    }

    public static class TabTitle {
        private Builder mBuilder;

        public static class Builder {
            private int mColorSelected = -49023;
            private int mColorNormal = -9079435;
            private int mTitleTextSize = 16;
            private String mContent = "";

            public TabTitle build() {
                return new TabTitle(this);
            }

            public Builder setContent(String str) {
                this.mContent = str;
                return this;
            }

            public Builder setTextColor(int i4, int i5) {
                this.mColorSelected = i4;
                this.mColorNormal = i5;
                return this;
            }

            public Builder setTextSize(int i4) {
                this.mTitleTextSize = i4;
                return this;
            }
        }

        public int getColorNormal() {
            return this.mBuilder.mColorNormal;
        }

        public int getColorSelected() {
            return this.mBuilder.mColorSelected;
        }

        public String getContent() {
            return this.mBuilder.mContent;
        }

        public int getTitleTextSize() {
            return this.mBuilder.mTitleTextSize;
        }

        private TabTitle(Builder builder) {
            this.mBuilder = builder;
        }
    }

    TabBadge getBadge();

    TabIcon getIcon();

    View getTabView();

    TabTitle getTitle();

    ITabView setBackground(int i4);

    ITabView setBadge(TabBadge tabBadge);

    ITabView setIcon(TabIcon tabIcon);

    ITabView setTitle(TabTitle tabTitle);
}
