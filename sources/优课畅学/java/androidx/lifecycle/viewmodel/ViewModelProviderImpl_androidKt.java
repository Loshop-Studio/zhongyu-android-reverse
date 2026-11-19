package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p289w7.AbstractC10360a;

/* loaded from: classes3.dex */
public final class ViewModelProviderImpl_androidKt {
    public static final <VM extends ViewModel> VM createViewModel(ViewModelProvider.Factory factory, InterfaceC8375c modelClass, CreationExtras extras) {
        AbstractC9133u.m16133g(factory, "factory");
        AbstractC9133u.m16133g(modelClass, "modelClass");
        AbstractC9133u.m16133g(extras, "extras");
        try {
            try {
                return (VM) factory.create(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.create(AbstractC10360a.m19298a(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.create(AbstractC10360a.m19298a(modelClass), extras);
        }
    }
}
