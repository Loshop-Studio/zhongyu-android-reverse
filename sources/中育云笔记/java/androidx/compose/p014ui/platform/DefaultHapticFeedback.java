package androidx.compose.p014ui.platform;

import android.view.View;
import androidx.compose.p014ui.hapticfeedback.HapticFeedback;
import androidx.compose.p014ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DefaultHapticFeedback implements HapticFeedback {
    public static final int $stable = 8;
    private final View view;

    public DefaultHapticFeedback(View view) {
        this.view = view;
    }

    @Override // androidx.compose.p014ui.hapticfeedback.HapticFeedback
    /* renamed from: performHapticFeedback-CdsT49E */
    public void mo31602performHapticFeedbackCdsT49E(int i10) {
        HapticFeedbackType.Companion companion = HapticFeedbackType.Companion;
        if (HapticFeedbackType.m31606equalsimpl0(i10, companion.m31610getConfirm5zf0vsI())) {
            this.view.performHapticFeedback(16);
            return;
        }
        if (HapticFeedbackType.m31606equalsimpl0(i10, companion.m31611getContextClick5zf0vsI())) {
            this.view.performHapticFeedback(6);
            return;
        }
        if (HapticFeedbackType.m31606equalsimpl0(i10, companion.m31612getGestureEnd5zf0vsI())) {
            this.view.performHapticFeedback(13);
            return;
        }
        if (HapticFeedbackType.m31606equalsimpl0(i10, companion.m31613getGestureThresholdActivate5zf0vsI())) {
            this.view.performHapticFeedback(23);
            return;
        }
        if (HapticFeedbackType.m31606equalsimpl0(i10, companion.m31614getLongPress5zf0vsI())) {
            this.view.performHapticFeedback(0);
            return;
        }
        if (HapticFeedbackType.m31606equalsimpl0(i10, companion.m31615getReject5zf0vsI())) {
            this.view.performHapticFeedback(17);
            return;
        }
        if (HapticFeedbackType.m31606equalsimpl0(i10, companion.m31616getSegmentFrequentTick5zf0vsI())) {
            this.view.performHapticFeedback(27);
            return;
        }
        if (HapticFeedbackType.m31606equalsimpl0(i10, companion.m31617getSegmentTick5zf0vsI())) {
            this.view.performHapticFeedback(26);
            return;
        }
        if (HapticFeedbackType.m31606equalsimpl0(i10, companion.m31618getTextHandleMove5zf0vsI())) {
            this.view.performHapticFeedback(9);
            return;
        }
        if (HapticFeedbackType.m31606equalsimpl0(i10, companion.m31619getToggleOff5zf0vsI())) {
            this.view.performHapticFeedback(22);
        } else if (HapticFeedbackType.m31606equalsimpl0(i10, companion.m31620getToggleOn5zf0vsI())) {
            this.view.performHapticFeedback(21);
        } else if (HapticFeedbackType.m31606equalsimpl0(i10, companion.m31621getVirtualKey5zf0vsI())) {
            this.view.performHapticFeedback(1);
        }
    }
}
