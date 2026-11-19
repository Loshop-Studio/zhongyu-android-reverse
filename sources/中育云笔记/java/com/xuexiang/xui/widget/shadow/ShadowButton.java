package com.xuexiang.xui.widget.shadow;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.ViewCompat;
import p165g9.C9280a;

/* loaded from: classes5.dex */
public class ShadowButton extends AppCompatButton {
    public ShadowButton(Context context) {
        super(context);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        C9280a c9280aM18279a = C9280a.m18279a(context, attributeSet);
        setLayerType(1, null);
        ViewCompat.setBackground(this, c9280aM18279a);
    }

    public ShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public ShadowButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context, attributeSet);
    }
}
