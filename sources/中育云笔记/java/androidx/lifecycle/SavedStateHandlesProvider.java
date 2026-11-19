package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.AbstractC9923a;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.AbstractC10776g;
import p309qc.InterfaceC10773d;

/* loaded from: classes2.dex */
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {
    private boolean restored;
    private Bundle restoredState;
    private final SavedStateRegistry savedStateRegistry;
    private final InterfaceC10773d viewModel$delegate;

    public SavedStateHandlesProvider(SavedStateRegistry savedStateRegistry, final ViewModelStoreOwner viewModelStoreOwner) {
        AbstractC9979u.m20294g(savedStateRegistry, "savedStateRegistry");
        AbstractC9979u.m20294g(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.lifecycle.m
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return SavedStateHandleSupport.getSavedStateHandlesVM(viewModelStoreOwner);
            }
        });
    }

    private final SavedStateHandlesVM getViewModel() {
        return (SavedStateHandlesVM) this.viewModel$delegate.getValue();
    }

    public final Bundle consumeRestoredStateForKey(String key) {
        Pair[] pairArr;
        AbstractC9979u.m20294g(key, "key");
        performRestore();
        Bundle bundle = this.restoredState;
        if (bundle == null || !SavedStateReader.m33825containsimpl(SavedStateReader.m33824constructorimpl(bundle), key)) {
            return null;
        }
        Bundle bundleM33886getSavedStateOrNullimpl = SavedStateReader.m33886getSavedStateOrNullimpl(SavedStateReader.m33824constructorimpl(bundle), key);
        if (bundleM33886getSavedStateOrNullimpl == null) {
            Map mapM20088h = AbstractC9925a.m20088h();
            if (mapM20088h.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapM20088h.size());
                for (Map.Entry entry : mapM20088h.entrySet()) {
                    arrayList.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleM33886getSavedStateOrNullimpl = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            SavedStateWriter.m33910constructorimpl(bundleM33886getSavedStateOrNullimpl);
        }
        SavedStateWriter.m33946removeimpl(SavedStateWriter.m33910constructorimpl(bundle), key);
        if (SavedStateReader.m33902isEmptyimpl(SavedStateReader.m33824constructorimpl(bundle))) {
            this.restoredState = null;
        }
        return bundleM33886getSavedStateOrNullimpl;
    }

    public final void performRestore() {
        Pair[] pairArr;
        if (this.restored) {
            return;
        }
        Bundle bundleConsumeRestoredStateForKey = this.savedStateRegistry.consumeRestoredStateForKey(SavedStateHandleSupport.SAVED_STATE_KEY);
        Map mapM20088h = AbstractC9925a.m20088h();
        if (mapM20088h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM20088h.size());
            for (Map.Entry entry : mapM20088h.entrySet()) {
                arrayList.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundleBundleOf);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            SavedStateWriter.m33914putAllimpl(bundleM33910constructorimpl, bundle);
        }
        if (bundleConsumeRestoredStateForKey != null) {
            SavedStateWriter.m33914putAllimpl(bundleM33910constructorimpl, bundleConsumeRestoredStateForKey);
        }
        this.restoredState = bundleBundleOf;
        this.restored = true;
        getViewModel();
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public Bundle saveState() {
        Pair[] pairArr;
        Map mapM20088h = AbstractC9925a.m20088h();
        if (mapM20088h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM20088h.size());
            for (Map.Entry entry : mapM20088h.entrySet()) {
                arrayList.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundleBundleOf);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            SavedStateWriter.m33914putAllimpl(bundleM33910constructorimpl, bundle);
        }
        for (Map.Entry<String, SavedStateHandle> entry2 : getViewModel().getHandles().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleSaveState = entry2.getValue().savedStateProvider().saveState();
            if (!SavedStateReader.m33902isEmptyimpl(SavedStateReader.m33824constructorimpl(bundleSaveState))) {
                SavedStateWriter.m33937putSavedStateimpl(bundleM33910constructorimpl, key, bundleSaveState);
            }
        }
        this.restored = false;
        return bundleBundleOf;
    }
}
