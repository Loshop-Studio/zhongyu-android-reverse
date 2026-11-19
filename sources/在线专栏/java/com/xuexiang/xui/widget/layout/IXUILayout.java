package com.xuexiang.xui.widget.layout;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface IXUILayout {
    public static final int HIDE_RADIUS_SIDE_BOTTOM = 3;
    public static final int HIDE_RADIUS_SIDE_LEFT = 4;
    public static final int HIDE_RADIUS_SIDE_NONE = 0;
    public static final int HIDE_RADIUS_SIDE_RIGHT = 2;
    public static final int HIDE_RADIUS_SIDE_TOP = 1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HideRadiusSide {
    }

    int getHideRadiusSide();

    int getRadius();

    float getShadowAlpha();

    int getShadowColor();

    int getShadowElevation();

    void onlyShowBottomDivider(int i4, int i5, int i6, int i7);

    void onlyShowLeftDivider(int i4, int i5, int i6, int i7);

    void onlyShowRightDivider(int i4, int i5, int i6, int i7);

    void onlyShowTopDivider(int i4, int i5, int i6, int i7);

    void setBorderColor(int i4);

    void setBorderWidth(int i4);

    void setBottomDividerAlpha(int i4);

    boolean setHeightLimit(int i4);

    void setHideRadiusSide(int i4);

    void setLeftDividerAlpha(int i4);

    void setOuterNormalColor(int i4);

    void setOutlineExcludePadding(boolean z3);

    void setOutlineInset(int i4, int i5, int i6, int i7);

    void setRadius(int i4);

    void setRadius(int i4, int i5);

    void setRadiusAndShadow(int i4, int i5, float f4);

    void setRadiusAndShadow(int i4, int i5, int i6, float f4);

    void setRadiusAndShadow(int i4, int i5, int i6, int i7, float f4);

    void setRightDividerAlpha(int i4);

    void setShadowAlpha(float f4);

    void setShadowColor(int i4);

    void setShadowElevation(int i4);

    void setShowBorderOnlyBeforeL(boolean z3);

    void setTopDividerAlpha(int i4);

    void setUseThemeGeneralShadowElevation();

    boolean setWidthLimit(int i4);

    void updateBottomDivider(int i4, int i5, int i6, int i7);

    void updateLeftDivider(int i4, int i5, int i6, int i7);

    void updateRightDivider(int i4, int i5, int i6, int i7);

    void updateTopDivider(int i4, int i5, int i6, int i7);
}
