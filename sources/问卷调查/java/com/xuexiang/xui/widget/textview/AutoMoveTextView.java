package com.xuexiang.xui.widget.textview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import p000a.p005b.p014h.C0113w;

/* loaded from: classes.dex */
public class AutoMoveTextView extends C0113w {
    public AutoMoveTextView(Context context) {
        super(context, null);
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
    }

    public AutoMoveTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }
}
