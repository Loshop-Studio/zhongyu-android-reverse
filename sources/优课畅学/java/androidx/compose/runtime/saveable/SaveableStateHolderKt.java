package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class SaveableStateHolderKt {
    @Composable
    public static final SaveableStateHolder rememberSaveableStateHolder(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(15454635, i10, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:56)");
        }
        composer.startReplaceGroup(-796079677);
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) RememberSaveableKt.m23818rememberSaveable(new Object[0], (Saver) SaveableStateHolderImpl.Companion.getSaver(), (String) null, (InterfaceC10559a) new InterfaceC10559a() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder.1
            @Override // p300x7.InterfaceC10559a
            public final SaveableStateHolderImpl invoke() {
                return new SaveableStateHolderImpl(null, 1, null);
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
