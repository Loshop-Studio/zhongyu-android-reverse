package com.xuexiang.xui.widget.layout.linkage.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.xuexiang.xui.widget.layout.linkage.ChildLinkageEvent;
import com.xuexiang.xui.widget.layout.linkage.ILinkageScroll;
import com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler;

/* loaded from: classes.dex */
public class LinkageScrollView extends NestedScrollView implements ILinkageScroll {
    private ChildLinkageEvent mLinkageChildrenEvent;

    public LinkageScrollView(Context context) {
        this(context, null);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        ChildLinkageEvent childLinkageEvent;
        ChildLinkageEvent childLinkageEvent2;
        super.onScrollChanged(i4, i5, i6, i7);
        setVerticalScrollBarEnabled(false);
        if (!canScrollVertically(-1) && (childLinkageEvent2 = this.mLinkageChildrenEvent) != null) {
            childLinkageEvent2.onContentScrollToTop(this);
        }
        if (!canScrollVertically(1) && (childLinkageEvent = this.mLinkageChildrenEvent) != null) {
            childLinkageEvent.onContentScrollToBottom(this);
        }
        ChildLinkageEvent childLinkageEvent3 = this.mLinkageChildrenEvent;
        if (childLinkageEvent3 != null) {
            childLinkageEvent3.onContentScroll(this);
        }
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.ILinkageScroll
    public LinkageScrollHandler provideScrollHandler() {
        return new LinkageScrollHandler() { // from class: com.xuexiang.xui.widget.layout.linkage.view.LinkageScrollView.1
            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public boolean canScrollVertically(int i4) {
                return LinkageScrollView.this.canScrollVertically(i4);
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public void flingContent(View view, int i4) {
                LinkageScrollView.this.fling(i4);
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            @SuppressLint({"RestrictedApi"})
            public int getVerticalScrollExtent() {
                return LinkageScrollView.this.computeVerticalScrollExtent();
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            @SuppressLint({"RestrictedApi"})
            public int getVerticalScrollOffset() {
                return LinkageScrollView.this.computeVerticalScrollOffset();
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            @SuppressLint({"RestrictedApi"})
            public int getVerticalScrollRange() {
                return LinkageScrollView.this.computeVerticalScrollRange();
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public boolean isScrollable() {
                return true;
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public void scrollContentToBottom() {
                LinkageScrollView.this.scrollTo(0, getVerticalScrollRange());
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public void scrollContentToTop() {
                LinkageScrollView.this.scrollTo(0, 0);
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public void stopContentScroll(View view) {
                LinkageScrollView.this.fling(0);
            }
        };
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.ILinkageScroll
    public void setChildLinkageEvent(ChildLinkageEvent childLinkageEvent) {
        this.mLinkageChildrenEvent = childLinkageEvent;
        if (childLinkageEvent != null) {
            childLinkageEvent.onContentScroll(this);
        }
    }

    public LinkageScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinkageScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
