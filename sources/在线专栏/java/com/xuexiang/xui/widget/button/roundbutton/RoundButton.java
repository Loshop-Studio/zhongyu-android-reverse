package com.xuexiang.xui.widget.button.roundbutton;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes.dex */
public class RoundButton extends AppCompatButton {
    public RoundButton(Context context) {
        super(context);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        setBackgroundDrawable(RoundDrawable.fromAttributeSet(context, attributeSet));
    }

    public RoundButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public RoundButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init(context, attributeSet);
    }
}
