package com.xuexiang.xui;

import android.graphics.drawable.Drawable;
import com.xuexiang.xui.utils.Utils;
import com.xuexiang.xui.widget.statelayout.StateLayoutConfig;

/* loaded from: classes.dex */
public class UIConfig {
    private static volatile UIConfig sInstance;
    private StateLayoutConfig mStateLayoutConfig = new StateLayoutConfig();
    private Drawable mAppIcon = Utils.getAppIcon(XUI.getContext());

    private UIConfig() {
    }

    public static UIConfig getInstance() {
        if (sInstance == null) {
            synchronized (UIConfig.class) {
                if (sInstance == null) {
                    sInstance = new UIConfig();
                }
            }
        }
        return sInstance;
    }

    public Drawable getAppIcon() {
        return this.mAppIcon;
    }

    public StateLayoutConfig getStateLayoutConfig() {
        return this.mStateLayoutConfig;
    }

    public UIConfig setAppIcon(Drawable drawable) {
        this.mAppIcon = drawable;
        return this;
    }

    public UIConfig setStatefulLayoutConfig(StateLayoutConfig stateLayoutConfig) {
        this.mStateLayoutConfig = stateLayoutConfig;
        return this;
    }
}
