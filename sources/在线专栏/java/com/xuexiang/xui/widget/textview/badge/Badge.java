package com.xuexiang.xui.widget.textview.badge;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes.dex */
public interface Badge {

    public interface OnDragStateChangedListener {
        public static final int STATE_CANCELED = 4;
        public static final int STATE_DRAGGING = 2;
        public static final int STATE_DRAGGING_OUT_OF_RANGE = 3;
        public static final int STATE_START = 1;
        public static final int STATE_SUCCEED = 5;

        void onDragStateChanged(int i4, Badge badge, View view);
    }

    Badge bindTarget(View view);

    Drawable getBadgeBackground();

    int getBadgeBackgroundColor();

    int getBadgeGravity();

    int getBadgeNumber();

    float getBadgePadding(boolean z3);

    String getBadgeText();

    int getBadgeTextColor();

    float getBadgeTextSize(boolean z3);

    PointF getDragCenter();

    float getGravityOffsetX(boolean z3);

    float getGravityOffsetY(boolean z3);

    View getTargetView();

    void hide(boolean z3);

    boolean isDraggable();

    boolean isExactMode();

    boolean isShowShadow();

    Badge setBadgeBackground(Drawable drawable);

    Badge setBadgeBackground(Drawable drawable, boolean z3);

    Badge setBadgeBackgroundColor(int i4);

    Badge setBadgeGravity(int i4);

    Badge setBadgeNumber(int i4);

    Badge setBadgePadding(float f4, boolean z3);

    Badge setBadgeText(String str);

    Badge setBadgeTextColor(int i4);

    Badge setBadgeTextSize(float f4, boolean z3);

    Badge setExactMode(boolean z3);

    Badge setGravityOffset(float f4, float f5, boolean z3);

    Badge setGravityOffset(float f4, boolean z3);

    Badge setOnDragStateChangedListener(OnDragStateChangedListener onDragStateChangedListener);

    Badge setShowShadow(boolean z3);

    Badge stroke(int i4, float f4, boolean z3);
}
