package com.xuexiang.xui.widget.slideback.dispatcher;

import android.view.View;
import com.xuexiang.xui.widget.slideback.SlideInfo;
import com.xuexiang.xui.widget.slideback.callback.SlideCallBack;

/* loaded from: classes.dex */
public interface ISlideTouchEventDispatcher extends View.OnTouchListener {
    ISlideTouchEventDispatcher init(SlideInfo slideInfo, SlideCallBack slideCallBack, OnSlideUpdateListener onSlideUpdateListener);

    void updateSlideLength(boolean z3, float f4);

    void updateSlidePosition(boolean z3, int i4);
}
