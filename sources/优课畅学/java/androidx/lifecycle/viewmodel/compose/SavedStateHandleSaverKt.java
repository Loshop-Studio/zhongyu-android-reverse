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
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p009a8.InterfaceC0047c;
import p009a8.InterfaceC0048d;
import p009a8.InterfaceC0049e;
import p089e8.InterfaceC8383k;
import p123h7.AbstractC8726f;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class SavedStateHandleSaverKt {
    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        AbstractC9133u.m16131e(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new InterfaceC10574p() { // from class: androidx.lifecycle.viewmodel.compose.b
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return SavedStateHandleSaverKt.mutableStateSaver$lambda$7$lambda$6(saver, (SaverScope) obj, (MutableState) obj2);
            }
        }, new InterfaceC10570l() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p300x7.InterfaceC10570l
            public final MutableState<T> invoke(MutableState<Object> mutableState) {
                Object objRestore;
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
                if (snapshotMutableState.getValue() != 0) {
                    Saver<T, Object> saver2 = saver;
                    Object value = snapshotMutableState.getValue();
                    AbstractC9133u.m16130d(value);
                    objRestore = saver2.restore(value);
                } else {
                    objRestore = null;
                }
                SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
                AbstractC9133u.m16131e(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver?>");
                MutableState<T> mutableStateMutableStateOf = SnapshotStateKt.mutableStateOf(objRestore, policy);
                AbstractC9133u.m16131e(mutableStateMutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver>");
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
        AbstractC9133u.m16131e(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
        return SnapshotStateKt.mutableStateOf(objSave, policy);
    }

    @SavedStateHandleSaveableApi
    /* renamed from: saveable, reason: collision with other method in class */
    public static final <T> T m27193saveable(SavedStateHandle savedStateHandle, String str, final Saver<T, ? extends Object> saver, InterfaceC10559a interfaceC10559a) {
        T tRestore;
        Object obj;
        AbstractC9133u.m16131e(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.saveable, kotlin.Any>");
        Bundle bundle = (Bundle) savedStateHandle.get(str);
        if (bundle == null || (obj = bundle.get("value")) == null || (tRestore = saver.restore(obj)) == null) {
            tRestore = (T) interfaceC10559a.invoke();
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

    public static /* synthetic */ Object saveable$default(SavedStateHandle savedStateHandle, String str, Saver saver, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        return m27193saveable(savedStateHandle, str, saver, interfaceC10559a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle saveable$lambda$1(Saver saver, Object obj) {
        return BundleKt.bundleOf(AbstractC8726f.m14230a("value", saver.save(new SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.Companion), obj)));
    }

    private static final InterfaceC0048d saveable$lambda$3(SavedStateHandle savedStateHandle, Saver saver, InterfaceC10559a interfaceC10559a, Object obj, InterfaceC8383k interfaceC8383k) {
        String str;
        if (obj != null) {
            str = AbstractC9137y.m16154b(obj.getClass()).mo13671e() + '.';
        } else {
            str = "";
        }
        final Object objM27193saveable = m27193saveable(savedStateHandle, str + interfaceC8383k.getName(), (Saver<Object, ? extends Object>) saver, interfaceC10559a);
        return new InterfaceC0048d() { // from class: androidx.lifecycle.viewmodel.compose.e
            @Override // p009a8.InterfaceC0048d
            public final Object getValue(Object obj2, InterfaceC8383k interfaceC8383k2) {
                return SavedStateHandleSaverKt.saveable$lambda$3$lambda$2(objM27193saveable, obj2, interfaceC8383k2);
            }
        };
    }

    private static final InterfaceC0049e saveable$lambda$4(SavedStateHandle savedStateHandle, Saver saver, InterfaceC10559a interfaceC10559a, Object obj, InterfaceC8383k interfaceC8383k) {
        String str;
        if (obj != null) {
            str = AbstractC9137y.m16154b(obj.getClass()).mo13671e() + '.';
        } else {
            str = "";
        }
        final MutableState mutableStateSaveable = saveable(savedStateHandle, str + interfaceC8383k.getName(), saver, interfaceC10559a);
        return new InterfaceC0049e() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$saveable$3$1
            /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
            @Override // p009a8.InterfaceC0049e, p009a8.InterfaceC0048d
            public T getValue(Object obj2, InterfaceC8383k interfaceC8383k2) {
                return mutableStateSaveable.getValue();
            }

            @Override // p009a8.InterfaceC0049e
            public void setValue(Object obj2, InterfaceC8383k interfaceC8383k2, T t10) {
                mutableStateSaveable.setValue(t10);
            }
        };
    }

    @SavedStateHandleSaveableApi
    public static final <T, M extends MutableState<T>> InterfaceC0047c saveableMutableState(SavedStateHandle savedStateHandle, Saver<T, ? extends Object> saver, InterfaceC10559a interfaceC10559a) {
        return new C4117c(savedStateHandle, saver, interfaceC10559a);
    }

    public static /* synthetic */ InterfaceC0047c saveableMutableState$default(SavedStateHandle savedStateHandle, Saver saver, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveableMutableState(savedStateHandle, saver, interfaceC10559a);
    }

    public static /* synthetic */ InterfaceC0047c saveable$default(SavedStateHandle savedStateHandle, Saver saver, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveable(savedStateHandle, saver, interfaceC10559a);
    }

    @SavedStateHandleSaveableApi
    public static final <T> MutableState<T> saveable(SavedStateHandle savedStateHandle, String str, Saver<T, ? extends Object> saver, InterfaceC10559a interfaceC10559a) {
        return (MutableState) m27193saveable(savedStateHandle, str, mutableStateSaver(saver), interfaceC10559a);
    }

    @SavedStateHandleSaveableApi
    public static final <T> InterfaceC0047c saveable(SavedStateHandle savedStateHandle, Saver<T, ? extends Object> saver, InterfaceC10559a interfaceC10559a) {
        return new C4117c(savedStateHandle, saver, interfaceC10559a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object saveable$lambda$3$lambda$2(Object obj, Object obj2, InterfaceC8383k interfaceC8383k) {
        return obj;
    }
}
