package com.xuexiang.xui.widget.tabbar.vertical;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.xuexiang.xui.widget.textview.badge.BadgeView;

/* loaded from: classes3.dex */
public class TabBadgeView extends BadgeView {
    @Override // com.xuexiang.xui.widget.textview.badge.BadgeView
    /* renamed from: c */
    public final void mo3605c(boolean z8) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (z8) {
            this.f5050z.addView(this, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        View view = this.f5043s;
        if (view instanceof TabView) {
            ((TabView) view).addView(this, new FrameLayout.LayoutParams(-1, -1));
        } else {
            m3615a(view);
        }
    }
}
