package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.internal.Utils_jvmCommonKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p113g8.AbstractC8667f0;
import p123h7.C8729i;

/* loaded from: classes3.dex */
public final class NavControllerViewModel extends ViewModel implements NavViewModelStoreProvider {
    public static final Companion Companion = new Companion(null);
    private final Map<String, ViewModelStore> viewModelStores = new LinkedHashMap();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final NavControllerViewModel getInstance(ViewModelStore viewModelStore) {
            AbstractC9133u.m16133g(viewModelStore, "viewModelStore");
            return (NavControllerViewModel) ViewModelProvider.Companion.create$default(ViewModelProvider.Companion, viewModelStore, NavControllerViewModelKt.FACTORY, (CreationExtras) null, 4, (Object) null).get(AbstractC9137y.m16154b(NavControllerViewModel.class));
        }

        private Companion() {
        }
    }

    public final void clear(String backStackEntryId) {
        AbstractC9133u.m16133g(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStoreRemove = this.viewModelStores.remove(backStackEntryId);
        if (viewModelStoreRemove != null) {
            viewModelStoreRemove.clear();
        }
    }

    @Override // androidx.navigation.NavViewModelStoreProvider
    public ViewModelStore getViewModelStore(String backStackEntryId) {
        AbstractC9133u.m16133g(backStackEntryId, "backStackEntryId");
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
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(AbstractC8667f0.m14048a(C8729i.m14255b(Utils_jvmCommonKt.identityHashCode(this)), 16));
        sb.append("} ViewModelStores (");
        Iterator<String> it = this.viewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }
}
