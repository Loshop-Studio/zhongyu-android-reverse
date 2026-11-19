package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, InterfaceC10570l initializer) {
        AbstractC9133u.m16133g(initializerViewModelFactoryBuilder, "<this>");
        AbstractC9133u.m16133g(initializer, "initializer");
        AbstractC9133u.m16139m(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(AbstractC9137y.m16154b(ViewModel.class), initializer);
    }

    public static final ViewModelProvider.Factory viewModelFactory(InterfaceC10570l builder) {
        AbstractC9133u.m16133g(builder, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        builder.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
