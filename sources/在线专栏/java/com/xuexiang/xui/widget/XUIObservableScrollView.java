package com.xuexiang.xui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class XUIObservableScrollView extends ScrollView {
    private List<OnScrollChangedListener> mOnScrollChangedListeners;
    private int mScrollOffset;

    public interface OnScrollChangedListener {
        void onScrollChanged(XUIObservableScrollView xUIObservableScrollView, int i4, int i5, int i6, int i7);
    }

    public XUIObservableScrollView(Context context) {
        super(context);
        this.mScrollOffset = 0;
    }

    public void addOnScrollChangedListener(OnScrollChangedListener onScrollChangedListener) {
        if (this.mOnScrollChangedListeners == null) {
            this.mOnScrollChangedListeners = new ArrayList();
        }
        if (this.mOnScrollChangedListeners.contains(onScrollChangedListener)) {
            return;
        }
        this.mOnScrollChangedListeners.add(onScrollChangedListener);
    }

    public int getScrollOffset() {
        return this.mScrollOffset;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        this.mScrollOffset = i5;
        List<OnScrollChangedListener> list = this.mOnScrollChangedListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<OnScrollChangedListener> it = this.mOnScrollChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onScrollChanged(this, i4, i5, i6, i7);
        }
    }

    public void removeOnScrollChangedListener(OnScrollChangedListener onScrollChangedListener) {
        List<OnScrollChangedListener> list = this.mOnScrollChangedListeners;
        if (list == null) {
            return;
        }
        list.remove(onScrollChangedListener);
    }

    public XUIObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScrollOffset = 0;
    }

    public XUIObservableScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mScrollOffset = 0;
    }
}
