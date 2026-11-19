package androidx.navigation.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.navigation.compose.internal.NavComposeUtils_androidKt;
import androidx.navigation.compose.internal.WeakReference;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BackStackEntryIdViewModel extends ViewModel {
    public static final int $stable = 8;
    private final String IdKey = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: id */
    private final String f1637id;
    public WeakReference<SaveableStateHolder> saveableStateHolderRef;

    public BackStackEntryIdViewModel(SavedStateHandle savedStateHandle) {
        String strRandomUUID = (String) savedStateHandle.get("SaveableStateHolder_BackStackEntryKey");
        if (strRandomUUID == null) {
            strRandomUUID = NavComposeUtils_androidKt.randomUUID();
            savedStateHandle.set("SaveableStateHolder_BackStackEntryKey", strRandomUUID);
        }
        this.f1637id = strRandomUUID;
    }

    public final String getId() {
        return this.f1637id;
    }

    public final WeakReference<SaveableStateHolder> getSaveableStateHolderRef() {
        WeakReference<SaveableStateHolder> weakReference = this.saveableStateHolderRef;
        if (weakReference != null) {
            return weakReference;
        }
        AbstractC9979u.m20312y("saveableStateHolderRef");
        return null;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        SaveableStateHolder saveableStateHolder = getSaveableStateHolderRef().get();
        if (saveableStateHolder != null) {
            saveableStateHolder.removeState(this.f1637id);
        }
        getSaveableStateHolderRef().clear();
    }

    public final void setSaveableStateHolderRef(WeakReference<SaveableStateHolder> weakReference) {
        this.saveableStateHolderRef = weakReference;
    }
}
