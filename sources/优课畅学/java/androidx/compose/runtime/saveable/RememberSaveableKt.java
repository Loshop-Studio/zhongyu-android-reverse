package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8656a;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    public static final String generateCannotBeSavedErrorMessage(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        AbstractC9133u.m16131e(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new InterfaceC10574p() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public final MutableState<Object> invoke(SaverScope saverScope, MutableState<T> mutableState) {
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                Object objSave = saver.save(saverScope, mutableState.getValue());
                if (objSave == null) {
                    return null;
                }
                SnapshotMutationPolicy policy = ((SnapshotMutableState) mutableState).getPolicy();
                AbstractC9133u.m16131e(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return SnapshotStateKt.mutableStateOf(objSave, policy);
            }
        }, new InterfaceC10570l() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final MutableState<T> invoke(MutableState<Object> mutableState) {
                Object objRestore;
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (mutableState.getValue() != null) {
                    Saver<T, Object> saver2 = saver;
                    Object value = mutableState.getValue();
                    AbstractC9133u.m16130d(value);
                    objRestore = saver2.restore(value);
                } else {
                    objRestore = null;
                }
                SnapshotMutationPolicy policy = ((SnapshotMutableState) mutableState).getPolicy();
                AbstractC9133u.m16131e(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
                MutableState<T> mutableStateMutableStateOf = SnapshotStateKt.mutableStateOf(objRestore, policy);
                AbstractC9133u.m16131e(mutableStateMutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver>");
                return mutableStateMutableStateOf;
            }
        });
    }

    @Composable
    /* renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m23818rememberSaveable(Object[] objArr, Saver<T, ? extends Object> saver, String str, InterfaceC10559a interfaceC10559a, Composer composer, int i10, int i11) {
        Object[] objArr2;
        final T t10;
        Object objConsumeRestored;
        if ((i11 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        final Saver<T, ? extends Object> saver2 = saver;
        int i12 = i11 & 4;
        Object objInvoke = null;
        if (i12 != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441892779, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        if (str == null || str.length() == 0) {
            str = Integer.toString(currentCompositeKeyHash, AbstractC8656a.m13939a(MaxSupportedRadix));
            AbstractC9133u.m16132f(str, "toString(...)");
        }
        final String str2 = str;
        AbstractC9133u.m16131e(saver2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
            if (saveableStateRegistry != null && (objConsumeRestored = saveableStateRegistry.consumeRestored(str2)) != null) {
                objInvoke = saver2.restore(objConsumeRestored);
            }
            if (objInvoke == null) {
                objInvoke = interfaceC10559a.invoke();
            }
            objArr2 = objArr;
            Object saveableHolder = new SaveableHolder(saver2, saveableStateRegistry, str2, objInvoke, objArr2);
            composer.updateRememberedValue(saveableHolder);
            objRememberedValue = saveableHolder;
        } else {
            objArr2 = objArr;
        }
        final SaveableHolder saveableHolder2 = (SaveableHolder) objRememberedValue;
        Object valueIfInputsDidntChange = saveableHolder2.getValueIfInputsDidntChange(objArr2);
        if (valueIfInputsDidntChange == null) {
            valueIfInputsDidntChange = interfaceC10559a.invoke();
        }
        boolean zChangedInstance = composer.changedInstance(saveableHolder2) | ((((i10 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) ^ 48) > 32 && composer.changedInstance(saver2)) || (i10 & 48) == 32) | composer.changedInstance(saveableStateRegistry) | composer.changed(str2) | composer.changedInstance(valueIfInputsDidntChange) | composer.changedInstance(objArr2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            final Object[] objArr3 = objArr2;
            t10 = (T) valueIfInputsDidntChange;
            Object obj = new InterfaceC10559a() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m23819invoke();
                    return C8736p.f16368a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m23819invoke() {
                    saveableHolder2.update(saver2, saveableStateRegistry, str2, t10, objArr3);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue2 = obj;
        } else {
            t10 = (T) valueIfInputsDidntChange;
        }
        EffectsKt.SideEffect((InterfaceC10559a) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String strGenerateCannotBeSavedErrorMessage;
        if (obj == null || saveableStateRegistry.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() == SnapshotStateKt.neverEqualPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.structuralEqualityPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.referentialEqualityPolicy()) {
                strGenerateCannotBeSavedErrorMessage = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strGenerateCannotBeSavedErrorMessage = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strGenerateCannotBeSavedErrorMessage = generateCannotBeSavedErrorMessage(obj);
        }
        throw new IllegalArgumentException(strGenerateCannotBeSavedErrorMessage);
    }

    @Composable
    public static final <T> MutableState<T> rememberSaveable(Object[] objArr, Saver<T, ? extends Object> saver, String str, InterfaceC10559a interfaceC10559a, Composer composer, int i10, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-202053668, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:124)");
        }
        MutableState<T> mutableState = (MutableState) m23818rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(saver), str2, interfaceC10559a, composer, i10 & 8064, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
