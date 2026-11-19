package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p280od.InterfaceC10469c;
import p309qc.InterfaceC10773d;

/* loaded from: classes2.dex */
public final class ViewModelLazy<VM extends ViewModel> implements InterfaceC10773d {
    private VM cached;
    private final InterfaceC9529a extrasProducer;
    private final InterfaceC9529a factoryProducer;
    private final InterfaceC9529a storeProducer;
    private final InterfaceC10469c viewModelClass;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(InterfaceC10469c viewModelClass, InterfaceC9529a storeProducer, InterfaceC9529a factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        AbstractC9979u.m20294g(viewModelClass, "viewModelClass");
        AbstractC9979u.m20294g(storeProducer, "storeProducer");
        AbstractC9979u.m20294g(factoryProducer, "factoryProducer");
    }

    @Override // p309qc.InterfaceC10773d
    public boolean isInitialized() {
        return this.cached != null;
    }

    public ViewModelLazy(InterfaceC10469c viewModelClass, InterfaceC9529a storeProducer, InterfaceC9529a factoryProducer, InterfaceC9529a extrasProducer) {
        AbstractC9979u.m20294g(viewModelClass, "viewModelClass");
        AbstractC9979u.m20294g(storeProducer, "storeProducer");
        AbstractC9979u.m20294g(factoryProducer, "factoryProducer");
        AbstractC9979u.m20294g(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    @Override // p309qc.InterfaceC10773d
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) ViewModelProvider.Companion.create((ViewModelStore) this.storeProducer.invoke(), (ViewModelProvider.Factory) this.factoryProducer.invoke(), (CreationExtras) this.extrasProducer.invoke()).get(this.viewModelClass);
        this.cached = vm2;
        return vm2;
    }

    public /* synthetic */ ViewModelLazy(InterfaceC10469c interfaceC10469c, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, int i10, AbstractC9972n abstractC9972n) {
        this(interfaceC10469c, interfaceC9529a, interfaceC9529a2, (i10 & 8) != 0 ? new InterfaceC9529a() { // from class: androidx.lifecycle.t
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return CreationExtras.Empty.INSTANCE;
            }
        } : interfaceC9529a3);
    }
}
