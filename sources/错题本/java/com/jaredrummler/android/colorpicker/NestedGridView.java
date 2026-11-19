package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class NestedGridView extends GridView {
    public NestedGridView(Context context) {
        super(context);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public NestedGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NestedGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
