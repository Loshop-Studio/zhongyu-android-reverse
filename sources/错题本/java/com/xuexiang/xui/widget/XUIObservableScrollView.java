package com.xuexiang.xui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* loaded from: classes3.dex */
public class XUIObservableScrollView extends ScrollView {

    /* renamed from: a */
    public int f3980a;

    public XUIObservableScrollView(Context context) {
        super(context);
        this.f3980a = 0;
    }

    public int getScrollOffset() {
        return this.f3980a;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i8, int i9, int i10) {
        super.onScrollChanged(i, i8, i9, i10);
        this.f3980a = i8;
    }

    public XUIObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3980a = 0;
    }

    public XUIObservableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3980a = 0;
    }
}
