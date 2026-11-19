package com.xuexiang.xui.widget.shadow;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C0358u;

/* loaded from: classes.dex */
public class ShadowTextView extends AppCompatTextView {
    public ShadowTextView(Context context) {
        super(context);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        ShadowDrawable shadowDrawableFromAttributeSet = ShadowDrawable.fromAttributeSet(context, attributeSet);
        setLayerType(1, null);
        C0358u.m2057t0(this, shadowDrawableFromAttributeSet);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init(context, attributeSet);
    }
}
