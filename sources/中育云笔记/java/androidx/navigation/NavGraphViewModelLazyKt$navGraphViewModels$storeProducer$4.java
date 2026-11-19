package androidx.navigation;

import androidx.lifecycle.ViewModelStore;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 implements InterfaceC9529a {
    final /* synthetic */ InterfaceC10773d $backStackEntry$delegate;

    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(InterfaceC10773d interfaceC10773d) {
        this.$backStackEntry$delegate = interfaceC10773d;
    }

    @Override // p181hd.InterfaceC9529a
    public final ViewModelStore invoke() {
        return NavGraphViewModelLazyKt.m33799navGraphViewModels$lambda3(this.$backStackEntry$delegate).getViewModelStore();
    }
}
