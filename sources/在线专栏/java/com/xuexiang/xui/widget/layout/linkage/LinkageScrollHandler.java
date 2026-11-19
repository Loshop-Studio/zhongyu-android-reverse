package com.xuexiang.xui.widget.layout.linkage;

import android.view.View;

/* loaded from: classes.dex */
public interface LinkageScrollHandler {
    boolean canScrollVertically(int i4);

    void flingContent(View view, int i4);

    int getVerticalScrollExtent();

    int getVerticalScrollOffset();

    int getVerticalScrollRange();

    boolean isScrollable();

    void scrollContentToBottom();

    void scrollContentToTop();

    void stopContentScroll(View view);
}
