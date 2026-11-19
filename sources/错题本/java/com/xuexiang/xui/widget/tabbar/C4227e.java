package com.xuexiang.xui.widget.tabbar;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.xuexiang.xui.widget.tabbar.TabSegment;
import java.util.ArrayList;
import p136p3.C6370h;
import p136p3.C6372j;

/* renamed from: com.xuexiang.xui.widget.tabbar.e */
/* loaded from: classes3.dex */
public final class C4227e extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ TabSegment.TabItemView f4989a;

    public C4227e(TabSegment.TabItemView tabItemView) {
        this.f4989a = tabItemView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        TabSegment.TabItemView tabItemView = this.f4989a;
        TabSegment tabSegment = TabSegment.this;
        if (tabSegment.f4929a.isEmpty()) {
            return false;
        }
        if (((C6370h) tabSegment.getAdapter().m6032b(((Integer) tabItemView.getTag()).intValue())) == null) {
            return false;
        }
        ArrayList arrayList = tabSegment.f4929a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C6372j) arrayList.get(size)).getClass();
        }
        return true;
    }
}
