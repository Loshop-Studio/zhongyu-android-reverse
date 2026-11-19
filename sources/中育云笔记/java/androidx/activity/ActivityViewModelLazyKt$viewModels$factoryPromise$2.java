package androidx.activity;

import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt$viewModels$factoryPromise$2 extends Lambda implements InterfaceC9529a {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityViewModelLazyKt$viewModels$factoryPromise$2(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    @Override // p181hd.InterfaceC9529a
    public final ViewModelProvider.Factory invoke() {
        return this.$this_viewModels.getDefaultViewModelProviderFactory();
    }
}
