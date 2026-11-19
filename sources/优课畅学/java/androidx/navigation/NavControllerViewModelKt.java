package androidx.navigation;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class NavControllerViewModelKt {
    private static final ViewModelProvider.Factory FACTORY;

    static {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(AbstractC9137y.m16154b(NavControllerViewModel.class), new InterfaceC10570l() { // from class: androidx.navigation.k
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return NavControllerViewModelKt.FACTORY$lambda$1$lambda$0((CreationExtras) obj);
            }
        });
        FACTORY = initializerViewModelFactoryBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavControllerViewModel FACTORY$lambda$1$lambda$0(CreationExtras initializer) {
        AbstractC9133u.m16133g(initializer, "$this$initializer");
        return new NavControllerViewModel();
    }
}
