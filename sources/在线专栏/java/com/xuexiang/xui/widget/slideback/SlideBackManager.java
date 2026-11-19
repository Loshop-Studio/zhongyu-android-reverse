package com.xuexiang.xui.widget.slideback;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.xuexiang.xui.widget.slideback.callback.SlideBackCallBack;
import com.xuexiang.xui.widget.slideback.callback.SlideCallBack;
import com.xuexiang.xui.widget.slideback.dispatcher.ISlideTouchEventDispatcher;
import com.xuexiang.xui.widget.slideback.dispatcher.OnSlideUpdateListener;
import com.xuexiang.xui.widget.slideback.dispatcher.impl.DefaultSlideTouchDispatcher;
import com.xuexiang.xui.widget.slideback.widget.SlideBackIconView;
import com.xuexiang.xui.widget.slideback.widget.SlideBackInterceptLayout;

/* loaded from: classes.dex */
public class SlideBackManager implements OnSlideUpdateListener {
    private Activity mActivity;
    private SlideCallBack mCallBack;
    private boolean mHaveScroll = false;
    private SlideBackIconView mSlideBackIconViewLeft;
    private SlideBackIconView mSlideBackIconViewRight;
    private SlideInfo mSlideInfo;

    SlideBackManager(Activity activity, boolean z3) {
        this.mActivity = activity;
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        SlideInfo allowEdgeRight = new SlideInfo().setArrowSize(dp2px(5.0f)).setScreenWidth(displayMetrics.widthPixels).setDragRate(3.0f).setAllowEdgeLeft(true).setAllowEdgeRight(false);
        this.mSlideInfo = allowEdgeRight;
        if (z3) {
            allowEdgeRight.setBackViewHeight(displayMetrics.heightPixels / 5.0f).setMaxSlideLength(dp2px(24.0f)).setSideSlideLength(dp2px(12.0f));
        } else {
            allowEdgeRight.setBackViewHeight(displayMetrics.heightPixels / 4.0f).setMaxSlideLength(displayMetrics.widthPixels / 12.0f).setSideSlideLength(displayMetrics.widthPixels / 24.0f);
        }
    }

    private void addInterceptLayout(ViewGroup viewGroup, SlideBackInterceptLayout slideBackInterceptLayout) {
        View childAt = viewGroup.getChildAt(0);
        viewGroup.removeView(childAt);
        slideBackInterceptLayout.addView(childAt, -1, -1);
        viewGroup.addView(slideBackInterceptLayout);
    }

    private float dp2px(float f4) {
        return (f4 * this.mActivity.getResources().getDisplayMetrics().density) + 0.5f;
    }

    private void removeInterceptLayout(ViewGroup viewGroup) {
        FrameLayout frameLayout = (FrameLayout) viewGroup.getChildAt(0);
        viewGroup.removeView(frameLayout);
        View childAt = frameLayout.getChildAt(0);
        frameLayout.removeView(childAt);
        viewGroup.addView(childAt);
    }

    private void setSlideBackPosition(SlideBackIconView slideBackIconView, int i4) {
        int backViewHeight = (int) (i4 - (slideBackIconView.getBackViewHeight() / 2.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(slideBackIconView.getLayoutParams());
        layoutParams.topMargin = backViewHeight;
        slideBackIconView.setLayoutParams(layoutParams);
    }

    public SlideBackManager arrowSize(float f4) {
        this.mSlideInfo.setArrowSize(dp2px(f4));
        return this;
    }

    public SlideBackManager callBack(SlideBackCallBack slideBackCallBack) {
        this.mCallBack = new SlideCallBack(slideBackCallBack) { // from class: com.xuexiang.xui.widget.slideback.SlideBackManager.1
            @Override // com.xuexiang.xui.widget.slideback.callback.SlideCallBack
            public void onSlide(int i4) {
                onSlideBack();
            }
        };
        return this;
    }

    public SlideBackManager dragRate(float f4) {
        this.mSlideInfo.setDragRate(f4);
        return this;
    }

    public SlideBackManager edgeMode(int i4) {
        if (i4 == 0) {
            this.mSlideInfo.setEdgeMode(true, false);
        } else if (i4 == 1) {
            this.mSlideInfo.setEdgeMode(false, true);
        } else {
            if (i4 != 2) {
                throw new RuntimeException("未定义的边缘侧滑模式值：EdgeMode = " + i4);
            }
            this.mSlideInfo.setEdgeMode(true, true);
        }
        return this;
    }

    public SlideBackManager haveScroll(boolean z3) {
        this.mHaveScroll = z3;
        return this;
    }

    public SlideBackManager maxSlideLength(float f4) {
        this.mSlideInfo.setMaxSlideLength(dp2px(f4));
        return this;
    }

    public void register() {
        register(new DefaultSlideTouchDispatcher().init(this.mSlideInfo, this.mCallBack, this));
    }

    public SlideBackManager setSlideInfo(SlideInfo slideInfo) {
        this.mSlideInfo = slideInfo;
        return this;
    }

    public SlideBackManager sideSlideLength(float f4) {
        this.mSlideInfo.setSideSlideLength(dp2px(f4));
        return this;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    void unregister() {
        this.mActivity = null;
        this.mCallBack = null;
        this.mSlideBackIconViewLeft = null;
        this.mSlideBackIconViewRight = null;
    }

    @Override // com.xuexiang.xui.widget.slideback.dispatcher.OnSlideUpdateListener
    public void updateSlideLength(boolean z3, float f4) {
        if (z3) {
            this.mSlideBackIconViewLeft.updateSlideLength(f4);
        } else {
            this.mSlideBackIconViewRight.updateSlideLength(f4);
        }
    }

    @Override // com.xuexiang.xui.widget.slideback.dispatcher.OnSlideUpdateListener
    public void updateSlidePosition(boolean z3, int i4) {
        if (z3) {
            setSlideBackPosition(this.mSlideBackIconViewLeft, i4);
        } else {
            setSlideBackPosition(this.mSlideBackIconViewRight, i4);
        }
    }

    public SlideBackManager viewHeight(float f4) {
        this.mSlideInfo.setBackViewHeight(dp2px(f4));
        return this;
    }

    public SlideBackManager callBack(SlideCallBack slideCallBack) {
        this.mCallBack = slideCallBack;
        return this;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void register(ISlideTouchEventDispatcher iSlideTouchEventDispatcher) {
        if (this.mSlideInfo.isAllowEdgeLeft()) {
            SlideBackIconView slideBackIconView = new SlideBackIconView(this.mActivity);
            this.mSlideBackIconViewLeft = slideBackIconView;
            slideBackIconView.setBackViewHeight(this.mSlideInfo.getBackViewHeight());
            this.mSlideBackIconViewLeft.setArrowSize(this.mSlideInfo.getArrowSize());
            this.mSlideBackIconViewLeft.setMaxSlideLength(this.mSlideInfo.getMaxSlideLength());
        }
        if (this.mSlideInfo.isAllowEdgeRight()) {
            SlideBackIconView slideBackIconView2 = new SlideBackIconView(this.mActivity);
            this.mSlideBackIconViewRight = slideBackIconView2;
            slideBackIconView2.setBackViewHeight(this.mSlideInfo.getBackViewHeight());
            this.mSlideBackIconViewRight.setArrowSize(this.mSlideInfo.getArrowSize());
            this.mSlideBackIconViewRight.setMaxSlideLength(this.mSlideInfo.getMaxSlideLength());
            this.mSlideBackIconViewRight.setRotationY(180.0f);
        }
        FrameLayout frameLayout = (FrameLayout) this.mActivity.getWindow().getDecorView();
        if (this.mHaveScroll) {
            SlideBackInterceptLayout slideBackInterceptLayout = new SlideBackInterceptLayout(this.mActivity);
            slideBackInterceptLayout.setSideSlideLength(this.mSlideInfo.getSideSlideLength());
            addInterceptLayout(frameLayout, slideBackInterceptLayout);
        }
        if (this.mSlideInfo.isAllowEdgeLeft()) {
            frameLayout.addView(this.mSlideBackIconViewLeft);
        }
        if (this.mSlideInfo.isAllowEdgeRight()) {
            frameLayout.addView(this.mSlideBackIconViewRight);
        }
        frameLayout.setOnTouchListener(iSlideTouchEventDispatcher);
    }

    SlideBackManager(Activity activity, SlideInfo slideInfo) {
        this.mActivity = activity;
        this.mSlideInfo = slideInfo;
    }
}
