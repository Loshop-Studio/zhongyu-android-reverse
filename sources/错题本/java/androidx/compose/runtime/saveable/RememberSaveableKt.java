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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p204y1.AbstractC6768a;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001ac\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001ai\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\bH\u0007¢\u0006\u0004\b\n\u0010\u000e\u001aE\u0010\u0010\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\r0\u0004\"\u0004\b\u0000\u0010\u00012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0015\u001a\u00020\u0014*\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m5110d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "inputs", "Landroidx/compose/runtime/saveable/Saver;", "saver", "", "key", "Lkotlin/Function0;", "init", "rememberSaveable", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lr6/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "stateSaver", "Landroidx/compose/runtime/MutableState;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lr6/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "inner", "mutableStateSaver", "(Landroidx/compose/runtime/saveable/Saver;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "value", "Ld6/s;", "requireCanBeSaved", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/lang/Object;)V", "generateCannotBeSavedErrorMessage", "(Ljava/lang/Object;)Ljava/lang/String;", "", "MaxSupportedRadix", "I", "runtime-saveable_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n75#2:265\n1247#3,3:266\n1250#3,3:270\n1247#3,6:273\n1#4:269\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n*L\n82#1:265\n84#1:266,3\n84#1:270,3\n92#1:273,6\n*E\n"})
/* loaded from: classes.dex */
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    @NotNull
    public static final String generateCannotBeSavedErrorMessage(@NotNull Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        AbstractC5830k.m5328e(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public final MutableState<Object> invoke(SaverScope saverScope, MutableState<T> mutableState) {
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                Object objSave = saver.save(saverScope, mutableState.getValue());
                if (objSave == null) {
                    return null;
                }
                SnapshotMutationPolicy policy = ((SnapshotMutableState) mutableState).getPolicy();
                AbstractC5830k.m5328e(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return SnapshotStateKt.mutableStateOf(objSave, policy);
            }
        }, new InterfaceC6471c() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final MutableState<T> invoke(MutableState<Object> mutableState) {
                Object objRestore;
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (mutableState.getValue() != null) {
                    Saver<T, Object> saver2 = saver;
                    Object value = mutableState.getValue();
                    AbstractC5830k.m5327d(value);
                    objRestore = saver2.restore(value);
                } else {
                    objRestore = null;
                }
                SnapshotMutationPolicy policy = ((SnapshotMutableState) mutableState).getPolicy();
                AbstractC5830k.m5328e(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
                MutableState<T> mutableStateMutableStateOf = SnapshotStateKt.mutableStateOf(objRestore, policy);
                AbstractC5830k.m5328e(mutableStateMutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver>");
                return mutableStateMutableStateOf;
            }
        });
    }

    @Composable
    @NotNull
    /* renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m10224rememberSaveable(@NotNull Object[] objArr, @Nullable Saver<T, ? extends Object> saver, @Nullable String str, @NotNull InterfaceC6469a interfaceC6469a, @Nullable Composer composer, int i, int i8) {
        Object[] objArr2;
        final T t8;
        Object objConsumeRestored;
        if ((i8 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        final Saver<T, ? extends Object> saver2 = saver;
        int i9 = i8 & 4;
        Object objInvoke = null;
        if (i9 != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441892779, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        if (str == null || str.length() == 0) {
            int i10 = MaxSupportedRadix;
            AbstractC6768a.m6440d(i10);
            str = Integer.toString(currentCompositeKeyHash, i10);
            AbstractC5830k.m5329f(str, "toString(...)");
        }
        final String str2 = str;
        AbstractC5830k.m5328e(saver2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            if (saveableStateRegistry != null && (objConsumeRestored = saveableStateRegistry.consumeRestored(str2)) != null) {
                objInvoke = saver2.restore(objConsumeRestored);
            }
            if (objInvoke == null) {
                objInvoke = interfaceC6469a.invoke();
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
            valueIfInputsDidntChange = interfaceC6469a.invoke();
        }
        boolean zChangedInstance = composer.changedInstance(saveableHolder2) | ((((i & 112) ^ 48) > 32 && composer.changedInstance(saver2)) || (i & 48) == 32) | composer.changedInstance(saveableStateRegistry) | composer.changed(str2) | composer.changedInstance(valueIfInputsDidntChange) | composer.changedInstance(objArr2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            final Object[] objArr3 = objArr2;
            t8 = (T) valueIfInputsDidntChange;
            Object obj = new InterfaceC6469a() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m10225invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m10225invoke() {
                    saveableHolder2.update(saver2, saveableStateRegistry, str2, t8, objArr3);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue2 = obj;
        } else {
            t8 = (T) valueIfInputsDidntChange;
        }
        EffectsKt.SideEffect((InterfaceC6469a) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t8;
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
    @NotNull
    public static final <T> MutableState<T> rememberSaveable(@NotNull Object[] objArr, @NotNull Saver<T, ? extends Object> saver, @Nullable String str, @NotNull InterfaceC6469a interfaceC6469a, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-202053668, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:124)");
        }
        MutableState<T> mutableState = (MutableState) m10224rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(saver), str2, interfaceC6469a, composer, i & 8064, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
