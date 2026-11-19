package com.xuexiang.xui.widget.slideback;

import android.app.Activity;
import com.xuexiang.xui.widget.slideback.callback.SlideBackCallBack;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SlideBack {
    public static final int EDGE_BOTH = 2;
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_RIGHT = 1;
    private static WeakHashMap<Activity, SlideBackManager> sSideMap = new WeakHashMap<>();

    public static void register(Activity activity, SlideBackCallBack slideBackCallBack) {
        register(activity, false, slideBackCallBack);
    }

    public static void unregister(Activity activity) {
        SlideBackManager slideBackManager = sSideMap.get(activity);
        if (slideBackManager != null) {
            slideBackManager.unregister();
        }
        sSideMap.remove(activity);
    }

    public static SlideBackManager with(Activity activity) {
        SlideBackManager slideBackManager = new SlideBackManager(activity, false);
        sSideMap.put(activity, slideBackManager);
        return slideBackManager;
    }

    public static SlideBackManager withFixSize(Activity activity) {
        SlideBackManager slideBackManager = new SlideBackManager(activity, true);
        sSideMap.put(activity, slideBackManager);
        return slideBackManager;
    }

    public static void register(Activity activity, boolean z3, SlideBackCallBack slideBackCallBack) {
        with(activity).haveScroll(z3).callBack(slideBackCallBack).register();
    }

    public static SlideBackManager with(Activity activity, boolean z3) {
        SlideBackManager slideBackManager = new SlideBackManager(activity, z3);
        sSideMap.put(activity, slideBackManager);
        return slideBackManager;
    }

    public static SlideBackManager with(Activity activity, SlideInfo slideInfo) {
        SlideBackManager slideBackManager = new SlideBackManager(activity, slideInfo);
        sSideMap.put(activity, slideBackManager);
        return slideBackManager;
    }
}
