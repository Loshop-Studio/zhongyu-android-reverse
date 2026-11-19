package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.input.pointer.PointerEvent;

/* loaded from: classes.dex */
public final class TapGestureDetector_androidKt {
    public static final boolean firstDownRefersToPrimaryMouseButtonOnly() {
        return false;
    }

    public static final boolean isDeepPress(PointerEvent pointerEvent) {
        return pointerEvent.getClassification() == 2;
    }
}
