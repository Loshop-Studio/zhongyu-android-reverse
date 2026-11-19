package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import gd.AbstractC9293a;
import kotlin.jvm.internal.AbstractC9979u;
import p280od.InterfaceC10469c;

/* loaded from: classes2.dex */
public final class ViewModelProviderImpl_androidKt {
    public static final <VM extends ViewModel> VM createViewModel(ViewModelProvider.Factory factory, InterfaceC10469c modelClass, CreationExtras extras) {
        AbstractC9979u.m20294g(factory, "factory");
        AbstractC9979u.m20294g(modelClass, "modelClass");
        AbstractC9979u.m20294g(extras, "extras");
        try {
            try {
                return (VM) factory.create(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.create(AbstractC9293a.m18324a(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.create(AbstractC9293a.m18324a(modelClass), extras);
        }
    }
}
