package com.xuexiang.xui.widget.alpha;

import android.view.View;

/* loaded from: classes.dex */
public interface IAlphaViewHelper {
    void onEnabledChanged(View view, boolean z3);

    void onPressedChanged(View view, boolean z3);

    void setChangeAlphaWhenDisable(boolean z3);

    void setChangeAlphaWhenPress(boolean z3);
}
