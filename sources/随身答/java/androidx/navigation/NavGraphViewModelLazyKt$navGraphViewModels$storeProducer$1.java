package androidx.navigation;

import androidx.lifecycle.ViewModelStore;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(m13414k = 3, m13415mv = {2, 0, 0}, m13417xi = 176)
/* loaded from: classes3.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 implements Function0<ViewModelStore> {
    final /* synthetic */ Lazy<NavBackStackEntry> $backStackEntry$delegate;

    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(Lazy<NavBackStackEntry> lazy) {
        this.$backStackEntry$delegate = lazy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStore invoke() {
        return NavGraphViewModelLazyKt.m24499navGraphViewModels$lambda0(this.$backStackEntry$delegate).getViewModelStore();
    }
}
