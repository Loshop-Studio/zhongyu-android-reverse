package android.view.viewmodel.compose;

import android.os.Bundle;
import android.support.v4.media.AbstractC0037f;
import android.view.SavedStateHandle;
import android.view.SavedStateRegistry;
import androidx.camera.core.impl.C0362d;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p177u6.InterfaceC6622a;
import p177u6.InterfaceC6623b;
import p177u6.InterfaceC6624c;
import p207y6.InterfaceC6792p;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aK\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001aQ\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0007H\u0007¢\u0006\u0004\b\t\u0010\r\u001a_\u0010\t\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\t\u0010\u0010\u001ak\u0010\t\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\u00120\u000e\"\u0004\b\u0000\u0010\u0001\"\u000e\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\f*\u00020\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0010\u001aE\u0010\u0015\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\f0\u0005\"\u0004\b\u0000\u0010\u00012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m5110d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/SavedStateHandle;", "", "key", "Landroidx/compose/runtime/saveable/Saver;", "saver", "Lkotlin/Function0;", "init", "saveable", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Landroidx/compose/runtime/saveable/Saver;Lr6/a;)Ljava/lang/Object;", "stateSaver", "Landroidx/compose/runtime/MutableState;", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Landroidx/compose/runtime/saveable/Saver;Lr6/a;)Landroidx/compose/runtime/MutableState;", "Lu6/a;", "Lu6/b;", "(Landroidx/lifecycle/SavedStateHandle;Landroidx/compose/runtime/saveable/Saver;Lr6/a;)Lu6/a;", "M", "Lu6/c;", "saveableMutableState", "inner", "mutableStateSaver", "(Landroidx/compose/runtime/saveable/Saver;)Landroidx/compose/runtime/saveable/Saver;", "lifecycle-viewmodel-compose_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "SavedStateHandleSaverKt")
@SourceDebugExtension({"SMAP\nSavedStateHandleSaver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSaver.android.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateHandleSaverKt {
    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        AbstractC5830k.m5328e(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new C2779a(saver, 0), new InterfaceC6471c() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p152r6.InterfaceC6471c
            public final MutableState<T> invoke(MutableState<Object> mutableState) {
                Object objRestore;
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
                if (snapshotMutableState.getValue() != 0) {
                    Saver<T, Object> saver2 = saver;
                    Object value = snapshotMutableState.getValue();
                    AbstractC5830k.m5327d(value);
                    objRestore = saver2.restore(value);
                } else {
                    objRestore = null;
                }
                SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
                AbstractC5830k.m5328e(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver?>");
                MutableState<T> mutableStateMutableStateOf = SnapshotStateKt.mutableStateOf(objRestore, policy);
                AbstractC5830k.m5328e(mutableStateMutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver>");
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
        AbstractC5830k.m5328e(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
        return SnapshotStateKt.mutableStateOf(objSave, policy);
    }

    @SavedStateHandleSaveableApi
    @NotNull
    /* renamed from: saveable, reason: collision with other method in class */
    public static final <T> T m13590saveable(@NotNull SavedStateHandle savedStateHandle, @NotNull String str, @NotNull final Saver<T, ? extends Object> saver, @NotNull InterfaceC6469a interfaceC6469a) {
        T tRestore;
        Object obj;
        AbstractC5830k.m5328e(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.saveable, kotlin.Any>");
        Bundle bundle = (Bundle) savedStateHandle.get(str);
        if (bundle == null || (obj = bundle.get("value")) == null || (tRestore = saver.restore(obj)) == null) {
            tRestore = (T) interfaceC6469a.invoke();
        }
        final T t8 = tRestore;
        savedStateHandle.setSavedStateProvider(str, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.viewmodel.compose.b
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandleSaverKt.saveable$lambda$1(saver, t8);
            }
        });
        return tRestore;
    }

    public static /* synthetic */ Object saveable$default(SavedStateHandle savedStateHandle, String str, Saver saver, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        return m13590saveable(savedStateHandle, str, saver, interfaceC6469a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle saveable$lambda$1(Saver saver, Object obj) {
        return BundleKt.bundleOf(new Pair("value", saver.save(new SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.INSTANCE), obj)));
    }

    private static final InterfaceC6623b saveable$lambda$3(SavedStateHandle savedStateHandle, Saver saver, InterfaceC6469a interfaceC6469a, Object obj, InterfaceC6792p interfaceC6792p) {
        String str;
        if (obj != null) {
            str = AbstractC5832m.m5340a(obj.getClass()).m5319d() + '.';
        } else {
            str = "";
        }
        StringBuilder sbM97v = AbstractC0037f.m97v(str);
        sbM97v.append(interfaceC6792p.getName());
        return new C0362d(m13590saveable(savedStateHandle, sbM97v.toString(), saver, interfaceC6469a), 5);
    }

    private static final InterfaceC6624c saveable$lambda$4(SavedStateHandle savedStateHandle, Saver saver, InterfaceC6469a interfaceC6469a, Object obj, InterfaceC6792p interfaceC6792p) {
        String str;
        if (obj != null) {
            str = AbstractC5832m.m5340a(obj.getClass()).m5319d() + '.';
        } else {
            str = "";
        }
        StringBuilder sbM97v = AbstractC0037f.m97v(str);
        sbM97v.append(interfaceC6792p.getName());
        final MutableState mutableStateSaveable = saveable(savedStateHandle, sbM97v.toString(), saver, interfaceC6469a);
        return new InterfaceC6624c() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$saveable$3$1
            /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
            public T getValue(Object thisRef, InterfaceC6792p property) {
                return mutableStateSaveable.getValue();
            }

            public void setValue(Object thisRef, InterfaceC6792p property, T value) {
                mutableStateSaveable.setValue(value);
            }
        };
    }

    @SavedStateHandleSaveableApi
    @JvmName(name = "saveableMutableState")
    @NotNull
    public static final <T, M extends MutableState<T>> InterfaceC6622a saveableMutableState(@NotNull SavedStateHandle savedStateHandle, @NotNull Saver<T, ? extends Object> saver, @NotNull InterfaceC6469a interfaceC6469a) {
        return new C0362d(saver, 4);
    }

    public static /* synthetic */ InterfaceC6622a saveableMutableState$default(SavedStateHandle savedStateHandle, Saver saver, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveableMutableState(savedStateHandle, saver, interfaceC6469a);
    }

    public static /* synthetic */ InterfaceC6622a saveable$default(SavedStateHandle savedStateHandle, Saver saver, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveable(savedStateHandle, saver, interfaceC6469a);
    }

    @SavedStateHandleSaveableApi
    @NotNull
    public static final <T> MutableState<T> saveable(@NotNull SavedStateHandle savedStateHandle, @NotNull String str, @NotNull Saver<T, ? extends Object> saver, @NotNull InterfaceC6469a interfaceC6469a) {
        return (MutableState) m13590saveable(savedStateHandle, str, mutableStateSaver(saver), interfaceC6469a);
    }

    @SavedStateHandleSaveableApi
    @NotNull
    public static final <T> InterfaceC6622a saveable(@NotNull SavedStateHandle savedStateHandle, @NotNull Saver<T, ? extends Object> saver, @NotNull InterfaceC6469a interfaceC6469a) {
        return new C0362d(saver, 4);
    }

    private static final Object saveable$lambda$3$lambda$2(Object obj, Object obj2, InterfaceC6792p interfaceC6792p) {
        return obj;
    }
}
