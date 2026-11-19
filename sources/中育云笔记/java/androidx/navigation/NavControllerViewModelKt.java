package androidx.navigation;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class NavControllerViewModelKt {
    private static final ViewModelProvider.Factory FACTORY;

    static {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(AbstractC9983y.m20315b(NavControllerViewModel.class), new InterfaceC9540l() { // from class: androidx.navigation.k
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NavControllerViewModelKt.FACTORY$lambda$1$lambda$0((CreationExtras) obj);
            }
        });
        FACTORY = initializerViewModelFactoryBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavControllerViewModel FACTORY$lambda$1$lambda$0(CreationExtras initializer) {
        AbstractC9979u.m20294g(initializer, "$this$initializer");
        return new NavControllerViewModel();
    }
}
