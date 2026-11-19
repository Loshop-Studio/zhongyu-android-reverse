package com.xuexiang.xui.widget.behavior;

/* loaded from: classes.dex */
public interface AnimateHelper {
    public static final int STATE_HIDE = 0;
    public static final int STATE_SHOW = 1;

    int getState();

    void hide();

    void setMode(int i4);

    void setStartY(float f4);

    void show();
}
