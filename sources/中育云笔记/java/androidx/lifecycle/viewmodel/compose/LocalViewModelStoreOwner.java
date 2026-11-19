package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelStoreOwner;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LocalViewModelStoreOwner {
    public static final int $stable = 0;
    public static final LocalViewModelStoreOwner INSTANCE = new LocalViewModelStoreOwner();
    private static final ProvidableCompositionLocal<ViewModelStoreOwner> LocalViewModelStoreOwner = CompositionLocalKt.compositionLocalOf$default(null, new InterfaceC9529a() { // from class: androidx.lifecycle.viewmodel.compose.a
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return LocalViewModelStoreOwner.LocalViewModelStoreOwner$lambda$0();
        }
    }, 1, null);

    private LocalViewModelStoreOwner() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelStoreOwner LocalViewModelStoreOwner$lambda$0() {
        return null;
    }

    @Composable
    public final ViewModelStoreOwner getCurrent(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584162872, i10, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:34)");
        }
        ViewModelStoreOwner viewModelStoreOwnerFindViewTreeViewModelStoreOwner = (ViewModelStoreOwner) composer.consume(LocalViewModelStoreOwner);
        if (viewModelStoreOwnerFindViewTreeViewModelStoreOwner == null) {
            composer.startReplaceGroup(1260197609);
            viewModelStoreOwnerFindViewTreeViewModelStoreOwner = LocalViewModelStoreOwner_androidKt.findViewTreeViewModelStoreOwner(composer, 0);
        } else {
            composer.startReplaceGroup(1260196493);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return viewModelStoreOwnerFindViewTreeViewModelStoreOwner;
    }

    public final ProvidedValue<ViewModelStoreOwner> provides(ViewModelStoreOwner viewModelStoreOwner) {
        return LocalViewModelStoreOwner.provides(viewModelStoreOwner);
    }
}
