package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class SaveableStateHolderKt {
    @Composable
    public static final SaveableStateHolder rememberSaveableStateHolder(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(15454635, i10, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:56)");
        }
        composer.startReplaceGroup(-796079677);
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) RememberSaveableKt.m30420rememberSaveable(new Object[0], (Saver) SaveableStateHolderImpl.Companion.getSaver(), (String) null, (InterfaceC9529a) new InterfaceC9529a() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p181hd.InterfaceC9529a
            public final SaveableStateHolderImpl invoke() {
                return new SaveableStateHolderImpl(null, 1, 0 == true ? 1 : 0);
            }
        }, composer, 3072, 4);
        saveableStateHolderImpl.setParentSaveableStateRegistry((SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry()));
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return saveableStateHolderImpl;
    }
}
