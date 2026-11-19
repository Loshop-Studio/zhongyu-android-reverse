package androidx.compose.foundation;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class OverscrollConfiguration_androidKt {
    private static final ProvidableCompositionLocal<OverscrollConfiguration> LocalOverscrollConfiguration = CompositionLocalKt.compositionLocalOf$default(null, new InterfaceC9529a() { // from class: androidx.compose.foundation.OverscrollConfiguration_androidKt$LocalOverscrollConfiguration$1
        @Override // p181hd.InterfaceC9529a
        public final OverscrollConfiguration invoke() {
            return new OverscrollConfiguration(0L, null, 3, null);
        }
    }, 1, null);

    @ExperimentalFoundationApi
    public static final ProvidableCompositionLocal<OverscrollConfiguration> getLocalOverscrollConfiguration() {
        return LocalOverscrollConfiguration;
    }

    @InterfaceC10770a
    @ExperimentalFoundationApi
    public static /* synthetic */ void getLocalOverscrollConfiguration$annotations() {
    }
}
