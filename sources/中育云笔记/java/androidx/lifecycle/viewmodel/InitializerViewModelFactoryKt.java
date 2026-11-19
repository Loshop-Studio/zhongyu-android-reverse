package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, InterfaceC9540l initializer) {
        AbstractC9979u.m20294g(initializerViewModelFactoryBuilder, "<this>");
        AbstractC9979u.m20294g(initializer, "initializer");
        AbstractC9979u.m20300m(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(AbstractC9983y.m20315b(ViewModel.class), initializer);
    }

    public static final ViewModelProvider.Factory viewModelFactory(InterfaceC9540l builder) {
        AbstractC9979u.m20294g(builder, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        builder.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
