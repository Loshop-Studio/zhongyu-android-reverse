package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class ViewModelLazy<VM extends ViewModel> implements InterfaceC8724d {
    private VM cached;
    private final InterfaceC10559a extrasProducer;
    private final InterfaceC10559a factoryProducer;
    private final InterfaceC10559a storeProducer;
    private final InterfaceC8375c viewModelClass;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(InterfaceC8375c viewModelClass, InterfaceC10559a storeProducer, InterfaceC10559a factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        AbstractC9133u.m16133g(viewModelClass, "viewModelClass");
        AbstractC9133u.m16133g(storeProducer, "storeProducer");
        AbstractC9133u.m16133g(factoryProducer, "factoryProducer");
    }

    @Override // p123h7.InterfaceC8724d
    public boolean isInitialized() {
        return this.cached != null;
    }

    public ViewModelLazy(InterfaceC8375c viewModelClass, InterfaceC10559a storeProducer, InterfaceC10559a factoryProducer, InterfaceC10559a extrasProducer) {
        AbstractC9133u.m16133g(viewModelClass, "viewModelClass");
        AbstractC9133u.m16133g(storeProducer, "storeProducer");
        AbstractC9133u.m16133g(factoryProducer, "factoryProducer");
        AbstractC9133u.m16133g(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    @Override // p123h7.InterfaceC8724d
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) ViewModelProvider.Companion.create((ViewModelStore) this.storeProducer.invoke(), (ViewModelProvider.Factory) this.factoryProducer.invoke(), (CreationExtras) this.extrasProducer.invoke()).get(this.viewModelClass);
        this.cached = vm2;
        return vm2;
    }

    public /* synthetic */ ViewModelLazy(InterfaceC8375c interfaceC8375c, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, int i10, AbstractC9126n abstractC9126n) {
        this(interfaceC8375c, interfaceC10559a, interfaceC10559a2, (i10 & 8) != 0 ? new InterfaceC10559a() { // from class: androidx.lifecycle.t
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return CreationExtras.Empty.INSTANCE;
            }
        } : interfaceC10559a3);
    }
}
