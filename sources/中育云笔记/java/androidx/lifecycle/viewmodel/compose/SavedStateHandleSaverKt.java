package androidx.lifecycle.viewmodel.compose;

import android.os.Bundle;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p226kd.InterfaceC9914a;
import p226kd.InterfaceC9915b;
import p226kd.InterfaceC9916c;
import p280od.InterfaceC10478l;
import p309qc.AbstractC10776g;

/* loaded from: classes2.dex */
public final class SavedStateHandleSaverKt {
    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        AbstractC9979u.m20292e(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.lifecycle.viewmodel.compose.b
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return SavedStateHandleSaverKt.mutableStateSaver$lambda$7$lambda$6(saver, (SaverScope) obj, (MutableState) obj2);
            }
        }, new InterfaceC9540l() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p181hd.InterfaceC9540l
            public final MutableState<T> invoke(MutableState<Object> mutableState) {
                Object objRestore;
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
                if (snapshotMutableState.getValue() != 0) {
                    Saver<T, Object> saver2 = saver;
                    Object value = snapshotMutableState.getValue();
                    AbstractC9979u.m20291d(value);
                    objRestore = saver2.restore(value);
                } else {
                    objRestore = null;
                }
                SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
                AbstractC9979u.m20292e(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver?>");
                MutableState<T> mutableStateMutableStateOf = SnapshotStateKt.mutableStateOf(objRestore, policy);
                AbstractC9979u.m20292e(mutableStateMutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver>");
                return mutableStateMutableStateOf;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState mutableStateSaver$lambda$7$lambda$6(Saver saver, SaverScope saverScope, MutableState mutableState) {
        if (!(mutableState instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
        }
        SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
        Object objSave = saver.save(saverScope, snapshotMutableState.getValue());
        SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
        AbstractC9979u.m20292e(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
        return SnapshotStateKt.mutableStateOf(objSave, policy);
    }

    @SavedStateHandleSaveableApi
    /* renamed from: saveable, reason: collision with other method in class */
    public static final <T> T m33790saveable(SavedStateHandle savedStateHandle, String str, final Saver<T, ? extends Object> saver, InterfaceC9529a interfaceC9529a) {
        T tRestore;
        Object obj;
        AbstractC9979u.m20292e(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.saveable, kotlin.Any>");
        Bundle bundle = (Bundle) savedStateHandle.get(str);
        if (bundle == null || (obj = bundle.get("value")) == null || (tRestore = saver.restore(obj)) == null) {
            tRestore = (T) interfaceC9529a.invoke();
        }
        final T t10 = tRestore;
        savedStateHandle.setSavedStateProvider(str, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.viewmodel.compose.d
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandleSaverKt.saveable$lambda$1(saver, t10);
            }
        });
        return tRestore;
    }

    public static /* synthetic */ Object saveable$default(SavedStateHandle savedStateHandle, String str, Saver saver, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        return m33790saveable(savedStateHandle, str, saver, interfaceC9529a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle saveable$lambda$1(Saver saver, Object obj) {
        return BundleKt.bundleOf(AbstractC10776g.m22975a("value", saver.save(new SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.Companion), obj)));
    }

    private static final InterfaceC9915b saveable$lambda$3(SavedStateHandle savedStateHandle, Saver saver, InterfaceC9529a interfaceC9529a, Object obj, InterfaceC10478l interfaceC10478l) {
        String str;
        if (obj != null) {
            str = AbstractC9983y.m20315b(obj.getClass()).mo20276e() + '.';
        } else {
            str = "";
        }
        final Object objM33790saveable = m33790saveable(savedStateHandle, str + interfaceC10478l.getName(), (Saver<Object, ? extends Object>) saver, interfaceC9529a);
        return new InterfaceC9915b() { // from class: androidx.lifecycle.viewmodel.compose.e
        };
    }

    private static final InterfaceC9916c saveable$lambda$4(SavedStateHandle savedStateHandle, Saver saver, InterfaceC9529a interfaceC9529a, Object obj, InterfaceC10478l interfaceC10478l) {
        String str;
        if (obj != null) {
            str = AbstractC9983y.m20315b(obj.getClass()).mo20276e() + '.';
        } else {
            str = "";
        }
        final MutableState mutableStateSaveable = saveable(savedStateHandle, str + interfaceC10478l.getName(), saver, interfaceC9529a);
        return new InterfaceC9916c() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$saveable$3$1
            /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
            public T getValue(Object obj2, InterfaceC10478l interfaceC10478l2) {
                return mutableStateSaveable.getValue();
            }

            public void setValue(Object obj2, InterfaceC10478l interfaceC10478l2, T t10) {
                mutableStateSaveable.setValue(t10);
            }
        };
    }

    @SavedStateHandleSaveableApi
    public static final <T, M extends MutableState<T>> InterfaceC9914a saveableMutableState(SavedStateHandle savedStateHandle, Saver<T, ? extends Object> saver, InterfaceC9529a interfaceC9529a) {
        return new C3993c(savedStateHandle, saver, interfaceC9529a);
    }

    public static /* synthetic */ InterfaceC9914a saveableMutableState$default(SavedStateHandle savedStateHandle, Saver saver, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveableMutableState(savedStateHandle, saver, interfaceC9529a);
    }

    public static /* synthetic */ InterfaceC9914a saveable$default(SavedStateHandle savedStateHandle, Saver saver, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveable(savedStateHandle, saver, interfaceC9529a);
    }

    @SavedStateHandleSaveableApi
    public static final <T> MutableState<T> saveable(SavedStateHandle savedStateHandle, String str, Saver<T, ? extends Object> saver, InterfaceC9529a interfaceC9529a) {
        return (MutableState) m33790saveable(savedStateHandle, str, mutableStateSaver(saver), interfaceC9529a);
    }

    @SavedStateHandleSaveableApi
    public static final <T> InterfaceC9914a saveable(SavedStateHandle savedStateHandle, Saver<T, ? extends Object> saver, InterfaceC9529a interfaceC9529a) {
        return new C3993c(savedStateHandle, saver, interfaceC9529a);
    }

    private static final Object saveable$lambda$3$lambda$2(Object obj, Object obj2, InterfaceC10478l interfaceC10478l) {
        return obj;
    }
}
