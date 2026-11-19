package androidx.navigation;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public class NavHostController extends NavController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostController(Context context) {
        super(context);
        AbstractC9979u.m20294g(context, "context");
    }

    @Override // androidx.navigation.NavController
    public final void enableOnBackPressed(boolean z10) {
        super.enableOnBackPressed(z10);
    }

    @Override // androidx.navigation.NavController
    public final void setLifecycleOwner(LifecycleOwner owner) {
        AbstractC9979u.m20294g(owner, "owner");
        super.setLifecycleOwner(owner);
    }

    @Override // androidx.navigation.NavController
    public final void setOnBackPressedDispatcher(OnBackPressedDispatcher dispatcher) {
        AbstractC9979u.m20294g(dispatcher, "dispatcher");
        super.setOnBackPressedDispatcher(dispatcher);
    }

    @Override // androidx.navigation.NavController
    public final void setViewModelStore(ViewModelStore viewModelStore) {
        AbstractC9979u.m20294g(viewModelStore, "viewModelStore");
        super.setViewModelStore(viewModelStore);
    }
}
