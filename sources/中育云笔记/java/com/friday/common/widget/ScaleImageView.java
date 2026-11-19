package com.friday.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ScaleImageView extends AppCompatImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9979u.m20294g(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (getDrawable() == null) {
            super.onMeasure(i10, i11);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, (int) (r0.getIntrinsicHeight() * (size / r0.getIntrinsicWidth())));
    }
}
