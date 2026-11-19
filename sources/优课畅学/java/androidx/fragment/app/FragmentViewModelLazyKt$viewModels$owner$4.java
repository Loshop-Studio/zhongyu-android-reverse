package androidx.fragment.app;

import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.Lambda;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt$viewModels$owner$4 extends Lambda implements InterfaceC10559a {
    final /* synthetic */ InterfaceC10559a $ownerProducer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$owner$4(InterfaceC10559a interfaceC10559a) {
        super(0);
        this.$ownerProducer = interfaceC10559a;
    }

    @Override // p300x7.InterfaceC10559a
    public final ViewModelStoreOwner invoke() {
        return (ViewModelStoreOwner) this.$ownerProducer.invoke();
    }
}
