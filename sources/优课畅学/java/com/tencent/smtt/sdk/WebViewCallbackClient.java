package com.tencent.smtt.sdk;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public interface WebViewCallbackClient {
    void computeScroll(View view);

    boolean dispatchTouchEvent(MotionEvent motionEvent, View view);

    void invalidate();

    boolean onInterceptTouchEvent(MotionEvent motionEvent, View view);

    void onOverScrolled(int i10, int i11, boolean z10, boolean z11, View view);

    void onScrollChanged(int i10, int i11, int i12, int i13, View view);

    boolean onTouchEvent(MotionEvent motionEvent, View view);

    boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, View view);
}
