package androidx.navigation;

import androidx.lifecycle.ViewModelStore;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 implements InterfaceC10559a {
    final /* synthetic */ InterfaceC8724d $backStackEntry$delegate;

    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(InterfaceC8724d interfaceC8724d) {
        this.$backStackEntry$delegate = interfaceC8724d;
    }

    @Override // p300x7.InterfaceC10559a
    public final ViewModelStore invoke() {
        return NavGraphViewModelLazyKt.m27199navGraphViewModels$lambda0(this.$backStackEntry$delegate).getViewModelStore();
    }
}
