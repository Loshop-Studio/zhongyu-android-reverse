package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.internal.Utils_jvmCommonKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p309qc.C10779j;
import p310qd.AbstractC10799f0;

/* loaded from: classes.dex */
public final class NavControllerViewModel extends ViewModel implements NavViewModelStoreProvider {
    public static final Companion Companion = new Companion(null);
    private final Map<String, ViewModelStore> viewModelStores = new LinkedHashMap();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final NavControllerViewModel getInstance(ViewModelStore viewModelStore) {
            AbstractC9979u.m20294g(viewModelStore, "viewModelStore");
            return (NavControllerViewModel) ViewModelProvider.Companion.create$default(ViewModelProvider.Companion, viewModelStore, NavControllerViewModelKt.FACTORY, (CreationExtras) null, 4, (Object) null).get(AbstractC9983y.m20315b(NavControllerViewModel.class));
        }

        private Companion() {
        }
    }

    public final void clear(String backStackEntryId) {
        AbstractC9979u.m20294g(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStoreRemove = this.viewModelStores.remove(backStackEntryId);
        if (viewModelStoreRemove != null) {
            viewModelStoreRemove.clear();
        }
    }

    @Override // androidx.navigation.NavViewModelStoreProvider
    public ViewModelStore getViewModelStore(String backStackEntryId) {
        AbstractC9979u.m20294g(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStore = this.viewModelStores.get(backStackEntryId);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.viewModelStores.put(backStackEntryId, viewModelStore2);
        return viewModelStore2;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        Iterator<ViewModelStore> it = this.viewModelStores.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.viewModelStores.clear();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(AbstractC10799f0.m23187a(C10779j.m23000b(Utils_jvmCommonKt.identityHashCode(this)), 16));
        sb2.append("} ViewModelStores (");
        Iterator<String> it = this.viewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }
}
