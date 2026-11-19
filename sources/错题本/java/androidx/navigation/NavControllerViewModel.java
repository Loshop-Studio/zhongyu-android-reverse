package androidx.navigation;

import android.support.v4.media.AbstractC0037f;
import android.view.ViewModel;
import android.view.ViewModelProvider;
import android.view.ViewModelStore;
import android.view.viewmodel.CreationExtras;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.internal.Utils_jvmCommonKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p169t6.AbstractC6600a;
import p204y1.AbstractC6768a;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m5110d2 = {"Landroidx/navigation/NavControllerViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/navigation/NavViewModelStoreProvider;", "<init>", "()V", "", "backStackEntryId", "Ld6/s;", "clear", "(Ljava/lang/String;)V", "onCleared", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "(Ljava/lang/String;)Landroidx/lifecycle/ViewModelStore;", "toString", "()Ljava/lang/String;", "", "viewModelStores", "Ljava/util/Map;", "Companion", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NavControllerViewModel extends ViewModel implements NavViewModelStoreProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Map<String, ViewModelStore> viewModelStores = new LinkedHashMap();

    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m5110d2 = {"Landroidx/navigation/NavControllerViewModel$Companion;", "", "<init>", "()V", "getInstance", "Landroidx/navigation/NavControllerViewModel;", "viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nNavControllerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModel$Companion\n+ 2 ViewModelProviderGet.kt\nandroidx/lifecycle/ViewModelProviderGetKt\n*L\n1#1,81:1\n29#2:82\n*S KotlinDebug\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModel$Companion\n*L\n73#1:82\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final NavControllerViewModel getInstance(@NotNull ViewModelStore viewModelStore) {
            AbstractC5830k.m5330g(viewModelStore, "viewModelStore");
            return (NavControllerViewModel) ViewModelProvider.Companion.create$default(ViewModelProvider.INSTANCE, viewModelStore, NavControllerViewModelKt.FACTORY, (CreationExtras) null, 4, (Object) null).get(AbstractC5832m.m5340a(NavControllerViewModel.class));
        }

        private Companion() {
        }
    }

    public final void clear(@NotNull String backStackEntryId) {
        AbstractC5830k.m5330g(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStoreRemove = this.viewModelStores.remove(backStackEntryId);
        if (viewModelStoreRemove != null) {
            viewModelStoreRemove.clear();
        }
    }

    @Override // androidx.navigation.NavViewModelStoreProvider
    @NotNull
    public ViewModelStore getViewModelStore(@NotNull String backStackEntryId) {
        AbstractC5830k.m5330g(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStore = this.viewModelStores.get(backStackEntryId);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.viewModelStores.put(backStackEntryId, viewModelStore2);
        return viewModelStore2;
    }

    @Override // android.view.ViewModel
    public void onCleared() {
        Iterator<ViewModelStore> it = this.viewModelStores.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.viewModelStores.clear();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = Utils_jvmCommonKt.identityHashCode(this);
        AbstractC6768a.m6440d(16);
        sb.append(AbstractC6600a.m6248z(16, iIdentityHashCode & 4294967295L));
        sb.append("} ViewModelStores (");
        Iterator<String> it = this.viewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        return AbstractC0037f.m80e(')', "toString(...)", sb);
    }
}
