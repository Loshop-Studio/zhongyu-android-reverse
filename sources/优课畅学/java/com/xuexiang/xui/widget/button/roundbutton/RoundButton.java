package com.xuexiang.xui.widget.button.roundbutton;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import p272v1.C10239a;

/* loaded from: classes4.dex */
public class RoundButton extends AppCompatButton {
    public RoundButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public final void init(Context context, AttributeSet attributeSet) {
        setBackgroundDrawable(C10239a.m19153a(context, attributeSet));
    }
}
