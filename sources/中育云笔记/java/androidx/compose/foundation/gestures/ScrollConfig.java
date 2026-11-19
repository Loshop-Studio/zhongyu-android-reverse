package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.unit.Density;

/* loaded from: classes.dex */
public interface ScrollConfig {
    /* renamed from: calculateMouseWheelScroll-8xgXZGE */
    long mo27121calculateMouseWheelScroll8xgXZGE(Density density, PointerEvent pointerEvent, long j10);

    default boolean isPreciseWheelScroll(PointerEvent pointerEvent) {
        return false;
    }

    default boolean isSmoothScrollingEnabled() {
        return true;
    }
}
