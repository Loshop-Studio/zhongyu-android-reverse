package com.xuexiang.xui.widget.layout.linkage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.layout.linkage.ChildLinkageEvent;
import com.xuexiang.xui.widget.layout.linkage.ILinkageScroll;
import com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler;

/* loaded from: classes.dex */
public class LinkageRecyclerView extends RecyclerView implements ILinkageScroll {
    private ChildLinkageEvent mLinkageEvent;

    public LinkageRecyclerView(Context context) {
        this(context, null);
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.ILinkageScroll
    public LinkageScrollHandler provideScrollHandler() {
        return new LinkageScrollHandler() { // from class: com.xuexiang.xui.widget.layout.linkage.view.LinkageRecyclerView.2
            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public boolean canScrollVertically(int i4) {
                return LinkageRecyclerView.this.canScrollVertically(i4);
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public void flingContent(View view, int i4) {
                LinkageRecyclerView.this.fling(0, i4);
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public int getVerticalScrollExtent() {
                return LinkageRecyclerView.this.computeVerticalScrollExtent();
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public int getVerticalScrollOffset() {
                return LinkageRecyclerView.this.computeVerticalScrollOffset();
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public int getVerticalScrollRange() {
                return LinkageRecyclerView.this.computeVerticalScrollRange();
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public boolean isScrollable() {
                return true;
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public void scrollContentToBottom() {
                RecyclerView.AbstractC0562g adapter = LinkageRecyclerView.this.getAdapter();
                if (adapter == null || adapter.getItemCount() <= 0) {
                    return;
                }
                LinkageRecyclerView.this.scrollToPosition(adapter.getItemCount() - 1);
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public void scrollContentToTop() {
                LinkageRecyclerView.this.scrollToPosition(0);
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public void stopContentScroll(View view) {
                LinkageRecyclerView.this.stopScroll();
            }
        };
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.ILinkageScroll
    public void setChildLinkageEvent(ChildLinkageEvent childLinkageEvent) {
        this.mLinkageEvent = childLinkageEvent;
    }

    public LinkageRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LinkageRecyclerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        addOnScrollListener(new RecyclerView.AbstractC0574s() { // from class: com.xuexiang.xui.widget.layout.linkage.view.LinkageRecyclerView.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574s
            public void onScrollStateChanged(RecyclerView recyclerView, int i5) {
                super.onScrollStateChanged(recyclerView, i5);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574s
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                super.onScrolled(recyclerView, i5, i6);
                if (!LinkageRecyclerView.this.canScrollVertically(-1) && LinkageRecyclerView.this.mLinkageEvent != null) {
                    LinkageRecyclerView.this.mLinkageEvent.onContentScrollToTop(LinkageRecyclerView.this);
                }
                if (!LinkageRecyclerView.this.canScrollVertically(1) && LinkageRecyclerView.this.mLinkageEvent != null) {
                    LinkageRecyclerView.this.mLinkageEvent.onContentScrollToBottom(LinkageRecyclerView.this);
                }
                if (LinkageRecyclerView.this.mLinkageEvent != null) {
                    LinkageRecyclerView.this.mLinkageEvent.onContentScroll(LinkageRecyclerView.this);
                }
            }
        });
    }
}
