package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;

/* loaded from: classes2.dex */
public final class ViewModelProviderGetKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> VM get(ViewModelProvider viewModelProvider) {
        AbstractC9979u.m20294g(viewModelProvider, "<this>");
        AbstractC9979u.m20300m(4, "VM");
        return (VM) viewModelProvider.get(AbstractC9983y.m20315b(ViewModel.class));
    }
}
