package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Density;
import java.util.List;

/* loaded from: classes.dex */
final class AndroidConfig implements ScrollConfig {
    private final ViewConfiguration viewConfiguration;

    public AndroidConfig(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo20519calculateMouseWheelScroll8xgXZGE(Density density, PointerEvent pointerEvent, long j10) {
        int i10 = Build.VERSION.SDK_INT;
        float f10 = -(i10 > 26 ? ViewConfigurationApi26Impl.INSTANCE.getVerticalScrollFactor(this.viewConfiguration) : density.mo20497toPx0680j_4(C3156Dp.m26899constructorimpl(64)));
        float f11 = -(i10 > 26 ? ViewConfigurationApi26Impl.INSTANCE.getHorizontalScrollFactor(this.viewConfiguration) : density.mo20497toPx0680j_4(C3156Dp.m26899constructorimpl(64)));
        List<PointerInputChange> changes = pointerEvent.getChanges();
        Offset offsetM24024boximpl = Offset.m24024boximpl(Offset.Companion.m24051getZeroF1C5BW0());
        int size = changes.size();
        for (int i11 = 0; i11 < size; i11++) {
            offsetM24024boximpl = Offset.m24024boximpl(Offset.m24040plusMKHz9U(offsetM24024boximpl.m24045unboximpl(), changes.get(i11).m25504getScrollDeltaF1C5BW0()));
        }
        long jM24045unboximpl = offsetM24024boximpl.m24045unboximpl();
        return Offset.m24027constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM24045unboximpl >> 32)) * f11) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM24045unboximpl & 4294967295L)) * f10) & 4294967295L));
    }

    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }
}
