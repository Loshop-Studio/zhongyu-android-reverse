package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;

/* loaded from: classes3.dex */
public final class ViewModelProviderGetKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> VM get(ViewModelProvider viewModelProvider) {
        AbstractC9133u.m16133g(viewModelProvider, "<this>");
        AbstractC9133u.m16139m(4, "VM");
        return (VM) viewModelProvider.get(AbstractC9137y.m16154b(ViewModel.class));
    }
}
