package androidx.compose.p014ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.p014ui.C2638R;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;

/* loaded from: classes2.dex */
public final class DisposableSaveableStateRegistry_androidKt {
    private static final Class<? extends Object>[] AcceptableClasses = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        Object parent = view.getParent();
        AbstractC9979u.m20292e(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(C2638R.id.compose_view_saveable_id_tag);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return DisposableSaveableStateRegistry(strValueOf, savedStateRegistryOwner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle DisposableSaveableStateRegistry$lambda$0(SaveableStateRegistry saveableStateRegistry) {
        return toBundle(saveableStateRegistry.performSave());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canBeSavedToBundle(Object obj) {
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() != SnapshotStateKt.neverEqualPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) {
                return false;
            }
            T value = snapshotMutableState.getValue();
            if (value == 0) {
                return true;
            }
            return canBeSavedToBundle(value);
        }
        if ((obj instanceof InterfaceC10772c) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class<? extends Object> cls : AcceptableClasses) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle toBundle(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> toMap(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            AbstractC9979u.m20292e(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }

    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(String str, SavedStateRegistryOwner savedStateRegistryOwner) {
        final boolean z10;
        final String str2 = SaveableStateRegistry.class.getSimpleName() + ':' + str;
        final SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        Bundle bundleConsumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(str2);
        final SaveableStateRegistry SaveableStateRegistry = SaveableStateRegistryKt.SaveableStateRegistry(bundleConsumeRestoredStateForKey != null ? toMap(bundleConsumeRestoredStateForKey) : null, new InterfaceC9540l() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(DisposableSaveableStateRegistry_androidKt.canBeSavedToBundle(obj));
            }
        });
        try {
            savedStateRegistry.registerSavedStateProvider(str2, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.compose.ui.platform.y
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final Bundle saveState() {
                    return DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry$lambda$0(SaveableStateRegistry);
                }
            });
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new DisposableSaveableStateRegistry(SaveableStateRegistry, new InterfaceC9529a() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m32657invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m32657invoke() {
                if (z10) {
                    savedStateRegistry.unregisterSavedStateProvider(str2);
                }
            }
        });
    }
}
