package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes2.dex */
public interface WindowInfo {
    /* renamed from: getKeyboardModifiers-k7X9c1A$annotations, reason: not valid java name */
    static /* synthetic */ void m32709getKeyboardModifiersk7X9c1A$annotations() {
    }

    /* renamed from: getContainerSize-YbymL2g */
    default long mo32673getContainerSizeYbymL2g() {
        long j10 = Integer.MIN_VALUE;
        return IntSize.m33667constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A */
    default int mo32674getKeyboardModifiersk7X9c1A() {
        return WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui_release().getValue().m32171unboximpl();
    }

    boolean isWindowFocused();
}
