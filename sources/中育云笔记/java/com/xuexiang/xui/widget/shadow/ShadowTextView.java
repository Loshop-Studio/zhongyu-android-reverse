package com.xuexiang.xui.widget.shadow;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import p165g9.C9280a;

/* loaded from: classes5.dex */
public class ShadowTextView extends AppCompatTextView {
    public ShadowTextView(Context context) {
        super(context);
        m13224c(context, null);
    }

    /* renamed from: c */
    private void m13224c(Context context, AttributeSet attributeSet) {
        C9280a c9280aM18279a = C9280a.m18279a(context, attributeSet);
        setLayerType(1, null);
        ViewCompat.setBackground(this, c9280aM18279a);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13224c(context, attributeSet);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m13224c(context, attributeSet);
    }
}
