package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.AbstractC9078a;
import kotlin.Pair;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8726f;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {
    private boolean restored;
    private Bundle restoredState;
    private final SavedStateRegistry savedStateRegistry;
    private final InterfaceC8724d viewModel$delegate;

    public SavedStateHandlesProvider(SavedStateRegistry savedStateRegistry, final ViewModelStoreOwner viewModelStoreOwner) {
        AbstractC9133u.m16133g(savedStateRegistry, "savedStateRegistry");
        AbstractC9133u.m16133g(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.lifecycle.m
            @Override // p300x7.InterfaceC10559a
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
        AbstractC9133u.m16133g(key, "key");
        performRestore();
        Bundle bundle = this.restoredState;
        if (bundle == null || !SavedStateReader.m27230containsimpl(SavedStateReader.m27229constructorimpl(bundle), key)) {
            return null;
        }
        Bundle bundleM27291getSavedStateOrNullimpl = SavedStateReader.m27291getSavedStateOrNullimpl(SavedStateReader.m27229constructorimpl(bundle), key);
        if (bundleM27291getSavedStateOrNullimpl == null) {
            Map mapM15943h = AbstractC9080a.m15943h();
            if (mapM15943h.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapM15943h.size());
                for (Map.Entry entry : mapM15943h.entrySet()) {
                    arrayList.add(AbstractC8726f.m14230a((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleM27291getSavedStateOrNullimpl = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            SavedStateWriter.m27315constructorimpl(bundleM27291getSavedStateOrNullimpl);
        }
        SavedStateWriter.m27351removeimpl(SavedStateWriter.m27315constructorimpl(bundle), key);
        if (SavedStateReader.m27307isEmptyimpl(SavedStateReader.m27229constructorimpl(bundle))) {
            this.restoredState = null;
        }
        return bundleM27291getSavedStateOrNullimpl;
    }

    public final void performRestore() {
        Pair[] pairArr;
        if (this.restored) {
            return;
        }
        Bundle bundleConsumeRestoredStateForKey = this.savedStateRegistry.consumeRestoredStateForKey(SavedStateHandleSupport.SAVED_STATE_KEY);
        Map mapM15943h = AbstractC9080a.m15943h();
        if (mapM15943h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM15943h.size());
            for (Map.Entry entry : mapM15943h.entrySet()) {
                arrayList.add(AbstractC8726f.m14230a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM27315constructorimpl = SavedStateWriter.m27315constructorimpl(bundleBundleOf);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            SavedStateWriter.m27319putAllimpl(bundleM27315constructorimpl, bundle);
        }
        if (bundleConsumeRestoredStateForKey != null) {
            SavedStateWriter.m27319putAllimpl(bundleM27315constructorimpl, bundleConsumeRestoredStateForKey);
        }
        this.restoredState = bundleBundleOf;
        this.restored = true;
        getViewModel();
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public Bundle saveState() {
        Pair[] pairArr;
        Map mapM15943h = AbstractC9080a.m15943h();
        if (mapM15943h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM15943h.size());
            for (Map.Entry entry : mapM15943h.entrySet()) {
                arrayList.add(AbstractC8726f.m14230a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM27315constructorimpl = SavedStateWriter.m27315constructorimpl(bundleBundleOf);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            SavedStateWriter.m27319putAllimpl(bundleM27315constructorimpl, bundle);
        }
        for (Map.Entry<String, SavedStateHandle> entry2 : getViewModel().getHandles().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleSaveState = entry2.getValue().savedStateProvider().saveState();
            if (!SavedStateReader.m27307isEmptyimpl(SavedStateReader.m27229constructorimpl(bundleSaveState))) {
                SavedStateWriter.m27342putSavedStateimpl(bundleM27315constructorimpl, key, bundleSaveState);
            }
        }
        this.restored = false;
        return bundleBundleOf;
    }
}
