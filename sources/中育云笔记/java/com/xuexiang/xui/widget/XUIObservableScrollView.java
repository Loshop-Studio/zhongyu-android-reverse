package com.xuexiang.xui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import java.util.Iterator;
import java.util.List;
import p212k.AbstractC9764r;

/* loaded from: classes5.dex */
public class XUIObservableScrollView extends ScrollView {

    /* renamed from: c */
    public int f15323c;

    /* renamed from: d */
    public List f15324d;

    public XUIObservableScrollView(Context context) {
        super(context);
        this.f15323c = 0;
    }

    public int getScrollOffset() {
        return this.f15323c;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        this.f15323c = i11;
        List list = this.f15324d;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = this.f15324d.iterator();
        if (it.hasNext()) {
            AbstractC9764r.m19682a(it.next());
            throw null;
        }
    }

    public XUIObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15323c = 0;
    }

    public XUIObservableScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15323c = 0;
    }
}
