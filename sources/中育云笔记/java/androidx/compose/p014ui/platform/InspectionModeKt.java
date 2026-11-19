package androidx.compose.p014ui.platform;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class InspectionModeKt {
    private static final ProvidableCompositionLocal<Boolean> LocalInspectionMode = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC9529a() { // from class: androidx.compose.ui.platform.InspectionModeKt$LocalInspectionMode$1
        @Override // p181hd.InterfaceC9529a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });

    public static final ProvidableCompositionLocal<Boolean> getLocalInspectionMode() {
        return LocalInspectionMode;
    }
}
