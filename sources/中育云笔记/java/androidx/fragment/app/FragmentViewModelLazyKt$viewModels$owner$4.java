package androidx.fragment.app;

import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class FragmentViewModelLazyKt$viewModels$owner$4 extends Lambda implements InterfaceC9529a {
    final /* synthetic */ InterfaceC9529a $ownerProducer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$owner$4(InterfaceC9529a interfaceC9529a) {
        super(0);
        this.$ownerProducer = interfaceC9529a;
    }

    @Override // p181hd.InterfaceC9529a
    public final ViewModelStoreOwner invoke() {
        return (ViewModelStoreOwner) this.$ownerProducer.invoke();
    }
}
