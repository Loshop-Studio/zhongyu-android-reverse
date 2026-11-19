package com.xuexiang.xui.widget.imageview.photoview;

import android.annotation.TargetApi;
import android.view.View;

/* loaded from: classes.dex */
public class Compat {
    private static final int SIXTY_FPS_INTERVAL = 16;

    public static int getPointerIndex(int i4) {
        return getPointerIndexHoneyComb(i4);
    }

    @TargetApi(5)
    private static int getPointerIndexEclair(int i4) {
        return (i4 & 65280) >> 8;
    }

    @TargetApi(11)
    private static int getPointerIndexHoneyComb(int i4) {
        return (i4 & 65280) >> 8;
    }

    public static void postOnAnimation(View view, Runnable runnable) {
        postOnAnimationJellyBean(view, runnable);
    }

    @TargetApi(16)
    private static void postOnAnimationJellyBean(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
