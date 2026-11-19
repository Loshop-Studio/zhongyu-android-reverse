package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(34)
/* loaded from: classes.dex */
public final class Api34Impl {
    public static final Api34Impl INSTANCE = new Api34Impl();

    private Api34Impl() {
    }

    public final BackEvent createOnBackEvent(float f10, float f11, float f12, int i10) {
        return new BackEvent(f10, f11, f12, i10);
    }

    public final float progress(BackEvent backEvent) {
        AbstractC9979u.m20294g(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int swipeEdge(BackEvent backEvent) {
        AbstractC9979u.m20294g(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float touchX(BackEvent backEvent) {
        AbstractC9979u.m20294g(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float touchY(BackEvent backEvent) {
        AbstractC9979u.m20294g(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
