package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import java.util.List;

/* loaded from: classes.dex */
final class AndroidConfig implements ScrollConfig {
    private final ViewConfiguration viewConfiguration;

    public AndroidConfig(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo27121calculateMouseWheelScroll8xgXZGE(Density density, PointerEvent pointerEvent, long j10) {
        int i10 = Build.VERSION.SDK_INT;
        float f10 = -(i10 > 26 ? ViewConfigurationApi26Impl.INSTANCE.getVerticalScrollFactor(this.viewConfiguration) : density.mo27099toPx0680j_4(C3186Dp.m33501constructorimpl(64)));
        float f11 = -(i10 > 26 ? ViewConfigurationApi26Impl.INSTANCE.getHorizontalScrollFactor(this.viewConfiguration) : density.mo27099toPx0680j_4(C3186Dp.m33501constructorimpl(64)));
        List<PointerInputChange> changes = pointerEvent.getChanges();
        Offset offsetM30626boximpl = Offset.m30626boximpl(Offset.Companion.m30653getZeroF1C5BW0());
        int size = changes.size();
        for (int i11 = 0; i11 < size; i11++) {
            offsetM30626boximpl = Offset.m30626boximpl(Offset.m30642plusMKHz9U(offsetM30626boximpl.m30647unboximpl(), changes.get(i11).m32106getScrollDeltaF1C5BW0()));
        }
        long jM30647unboximpl = offsetM30626boximpl.m30647unboximpl();
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM30647unboximpl >> 32)) * f11) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM30647unboximpl & 4294967295L)) * f10) & 4294967295L));
    }

    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }
}
