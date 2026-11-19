package com.xuexiang.xui.widget.button.roundbutton;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import p176h8.C9500a;

/* loaded from: classes5.dex */
public class RoundButton extends AppCompatButton {
    public RoundButton(Context context) {
        super(context);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        setBackgroundDrawable(C9500a.m18717a(context, attributeSet));
    }

    public RoundButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public RoundButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context, attributeSet);
    }
}
