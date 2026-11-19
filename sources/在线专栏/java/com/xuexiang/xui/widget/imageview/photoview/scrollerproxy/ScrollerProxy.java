package com.xuexiang.xui.widget.imageview.photoview.scrollerproxy;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class ScrollerProxy {
    public static ScrollerProxy getScroller(Context context) {
        return new IcsScroller(context);
    }

    public abstract boolean computeScrollOffset();

    public abstract void fling(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13);

    public abstract void forceFinished(boolean z3);

    public abstract int getCurrX();

    public abstract int getCurrY();

    public abstract boolean isFinished();
}
