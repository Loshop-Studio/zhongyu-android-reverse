package com.xuexiang.xui.widget.imageview.photoview.scrollerproxy;

import android.content.Context;
import android.widget.Scroller;

/* loaded from: classes.dex */
public class PreGingerScroller extends ScrollerProxy {
    private final Scroller mScroller;

    public PreGingerScroller(Context context) {
        this.mScroller = new Scroller(context);
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.scrollerproxy.ScrollerProxy
    public boolean computeScrollOffset() {
        return this.mScroller.computeScrollOffset();
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.scrollerproxy.ScrollerProxy
    public void fling(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.mScroller.fling(i4, i5, i6, i7, i8, i9, i10, i11);
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.scrollerproxy.ScrollerProxy
    public void forceFinished(boolean z3) {
        this.mScroller.forceFinished(z3);
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.scrollerproxy.ScrollerProxy
    public int getCurrX() {
        return this.mScroller.getCurrX();
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.scrollerproxy.ScrollerProxy
    public int getCurrY() {
        return this.mScroller.getCurrY();
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.scrollerproxy.ScrollerProxy
    public boolean isFinished() {
        return this.mScroller.isFinished();
    }
}
