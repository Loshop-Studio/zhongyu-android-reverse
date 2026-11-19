package androidx.compose.material3;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class InteractiveComponentSizeKt {
    private static final ProvidableCompositionLocal<Boolean> LocalMinimumInteractiveComponentEnforcement = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC9529a() { // from class: androidx.compose.material3.InteractiveComponentSizeKt$LocalMinimumInteractiveComponentEnforcement$1
        @Override // p181hd.InterfaceC9529a
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    });
    private static final ProvidableCompositionLocal<C3186Dp> LocalMinimumInteractiveComponentSize = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC9529a() { // from class: androidx.compose.material3.InteractiveComponentSizeKt$LocalMinimumInteractiveComponentSize$1
        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C3186Dp.m33499boximpl(m28773invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m28773invokeD9Ej5fM() {
            return C3186Dp.m33501constructorimpl(48);
        }
    });

    @ExperimentalMaterial3Api
    public static final ProvidableCompositionLocal<Boolean> getLocalMinimumInteractiveComponentEnforcement() {
        return LocalMinimumInteractiveComponentEnforcement;
    }

    @InterfaceC10770a
    @ExperimentalMaterial3Api
    public static /* synthetic */ void getLocalMinimumInteractiveComponentEnforcement$annotations() {
    }

    public static final ProvidableCompositionLocal<C3186Dp> getLocalMinimumInteractiveComponentSize() {
        return LocalMinimumInteractiveComponentSize;
    }

    @Stable
    public static final Modifier minimumInteractiveComponentSize(Modifier modifier) {
        return modifier.then(MinimumInteractiveModifier.INSTANCE);
    }
}
