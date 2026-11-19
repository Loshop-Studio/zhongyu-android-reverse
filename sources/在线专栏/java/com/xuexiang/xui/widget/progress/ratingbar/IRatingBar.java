package com.xuexiang.xui.widget.progress.ratingbar;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
interface IRatingBar {
    int getNumStars();

    float getRating();

    int getStarHeight();

    int getStarPadding();

    int getStarWidth();

    float getStepSize();

    boolean isClearRatingEnabled();

    boolean isClickable();

    boolean isIndicator();

    boolean isScrollable();

    void setClearRatingEnabled(boolean z3);

    void setClickable(boolean z3);

    void setEmptyDrawable(Drawable drawable);

    void setEmptyDrawableRes(int i4);

    void setFilledDrawable(Drawable drawable);

    void setFilledDrawableRes(int i4);

    void setIsIndicator(boolean z3);

    void setMinimumStars(float f4);

    void setNumStars(int i4);

    void setRating(float f4);

    void setScrollable(boolean z3);

    void setStarHeight(int i4);

    void setStarPadding(int i4);

    void setStarWidth(int i4);

    void setStepSize(float f4);
}
