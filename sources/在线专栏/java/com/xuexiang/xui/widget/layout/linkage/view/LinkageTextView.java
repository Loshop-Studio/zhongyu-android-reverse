package com.xuexiang.xui.widget.layout.linkage.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.xuexiang.xui.widget.layout.linkage.ChildLinkageEvent;
import com.xuexiang.xui.widget.layout.linkage.ILinkageScroll;
import com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler;
import com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandlerAdapter;

/* loaded from: classes.dex */
public class LinkageTextView extends AppCompatTextView implements ILinkageScroll {
    public LinkageTextView(Context context) {
        this(context, null);
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.ILinkageScroll
    public LinkageScrollHandler provideScrollHandler() {
        return new LinkageScrollHandlerAdapter() { // from class: com.xuexiang.xui.widget.layout.linkage.view.LinkageTextView.1
            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandlerAdapter, com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public int getVerticalScrollExtent() {
                return LinkageTextView.this.getHeight();
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandlerAdapter, com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public int getVerticalScrollOffset() {
                return 0;
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandlerAdapter, com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public int getVerticalScrollRange() {
                return LinkageTextView.this.getHeight();
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

    public LinkageTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LinkageTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
