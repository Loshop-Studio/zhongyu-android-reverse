package androidx.compose.p013ui.input.pointer;

import android.view.MotionEvent;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.geometry.Offset;

@RequiresApi(29)
/* loaded from: classes2.dex */
final class MotionEventHelper {
    public static final MotionEventHelper INSTANCE = new MotionEventHelper();

    private MotionEventHelper() {
    }

    /* renamed from: toRawOffset-dBAh8RU, reason: not valid java name */
    public final long m25433toRawOffsetdBAh8RU(MotionEvent motionEvent, int i10) {
        float rawX = motionEvent.getRawX(i10);
        float rawY = motionEvent.getRawY(i10);
        return Offset.m24027constructorimpl((Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
    }
}
