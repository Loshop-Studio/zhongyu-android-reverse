package com.xuexiang.xui.widget.layout.linkage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.xuexiang.xui.widget.layout.linkage.ChildLinkageEvent;
import com.xuexiang.xui.widget.layout.linkage.ILinkageScroll;
import com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler;
import com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandlerAdapter;

/* loaded from: classes.dex */
public class LinkageLinearLayout extends LinearLayout implements ILinkageScroll {
    public LinkageLinearLayout(Context context) {
        this(context, null);
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.ILinkageScroll
    public LinkageScrollHandler provideScrollHandler() {
        return new LinkageScrollHandlerAdapter() { // from class: com.xuexiang.xui.widget.layout.linkage.view.LinkageLinearLayout.1
            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandlerAdapter, com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public int getVerticalScrollExtent() {
                return LinkageLinearLayout.this.getHeight();
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandlerAdapter, com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public int getVerticalScrollOffset() {
                return 0;
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandlerAdapter, com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public int getVerticalScrollRange() {
                return LinkageLinearLayout.this.getHeight();
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandlerAdapter, com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public boolean isScrollable() {
                return false;
            }
        };
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.ILinkageScroll
    public void setChildLinkageEvent(ChildLinkageEvent childLinkageEvent) {
    }

    public LinkageLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LinkageLinearLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
