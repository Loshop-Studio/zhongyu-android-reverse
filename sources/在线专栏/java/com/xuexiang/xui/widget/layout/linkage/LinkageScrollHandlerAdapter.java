package com.xuexiang.xui.widget.layout.linkage;

import android.view.View;

/* loaded from: classes.dex */
public class LinkageScrollHandlerAdapter implements LinkageScrollHandler {
    @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
    public boolean canScrollVertically(int i4) {
        return false;
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
    public void flingContent(View view, int i4) {
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
    public int getVerticalScrollExtent() {
        return 0;
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
    public int getVerticalScrollOffset() {
        return 0;
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
    public int getVerticalScrollRange() {
        return 0;
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
    public boolean isScrollable() {
        return false;
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
    public void scrollContentToBottom() {
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
    public void scrollContentToTop() {
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
    public void stopContentScroll(View view) {
    }
}
