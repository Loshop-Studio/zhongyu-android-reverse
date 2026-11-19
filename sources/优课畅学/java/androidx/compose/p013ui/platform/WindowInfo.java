package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes2.dex */
public interface WindowInfo {
    /* renamed from: getKeyboardModifiers-k7X9c1A$annotations, reason: not valid java name */
    static /* synthetic */ void m26107getKeyboardModifiersk7X9c1A$annotations() {
    }

    /* renamed from: getContainerSize-YbymL2g */
    default long mo26071getContainerSizeYbymL2g() {
        long j10 = Integer.MIN_VALUE;
        return IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A */
    default int mo26072getKeyboardModifiersk7X9c1A() {
        return WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui_release().getValue().m25569unboximpl();
    }

    boolean isWindowFocused();
}
