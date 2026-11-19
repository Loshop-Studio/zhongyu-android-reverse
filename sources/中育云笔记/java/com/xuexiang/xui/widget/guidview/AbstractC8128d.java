package com.xuexiang.xui.widget.guidview;

import android.content.Context;
import anet.channel.strategy.dispatch.DispatchConstants;

/* renamed from: com.xuexiang.xui.widget.guidview.d */
/* loaded from: classes5.dex */
public abstract class AbstractC8128d {
    /* renamed from: a */
    public static int m12695a(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", DispatchConstants.ANDROID);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m12696b() {
        return true;
    }
}
