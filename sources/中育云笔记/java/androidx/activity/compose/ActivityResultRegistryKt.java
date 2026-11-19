package androidx.activity.compose;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.UUID;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class ActivityResultRegistryKt {
    @Composable
    public static final <I, O> ManagedActivityResultLauncher<I, O> rememberLauncherForActivityResult(ActivityResultContract<I, O> activityResultContract, InterfaceC9540l interfaceC9540l, Composer composer, int i10) {
        ActivityResultRegistry activityResultRegistry;
        String str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1408504823, i10, -1, "androidx.activity.compose.rememberLauncherForActivityResult (ActivityResultRegistry.kt:82)");
        }
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(activityResultContract, composer, i10 & 14);
        State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(interfaceC9540l, composer, (i10 >> 3) & 14);
        String str2 = (String) RememberSaveableKt.m30420rememberSaveable(new Object[0], (Saver) null, (String) null, (InterfaceC9529a) new InterfaceC9529a() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1
            @Override // p181hd.InterfaceC9529a
            public final String invoke() {
                return UUID.randomUUID().toString();
            }
        }, composer, 3072, 6);
        ActivityResultRegistryOwner current = LocalActivityResultRegistryOwner.INSTANCE.getCurrent(composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        ActivityResultRegistry activityResultRegistry2 = current.getActivityResultRegistry();
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new ActivityResultLauncherHolder();
            composer.updateRememberedValue(objRememberedValue);
        }
        ActivityResultLauncherHolder activityResultLauncherHolder = (ActivityResultLauncherHolder) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new ManagedActivityResultLauncher(activityResultLauncherHolder, stateRememberUpdatedState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        ManagedActivityResultLauncher<I, O> managedActivityResultLauncher = (ManagedActivityResultLauncher) objRememberedValue2;
        boolean zChangedInstance = composer.changedInstance(activityResultLauncherHolder) | composer.changedInstance(activityResultRegistry2) | composer.changed(str2) | composer.changedInstance(activityResultContract) | composer.changed(stateRememberUpdatedState2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
            activityResultRegistry = activityResultRegistry2;
            Object activityResultRegistryKt$rememberLauncherForActivityResult$1$1 = new ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1(activityResultLauncherHolder, activityResultRegistry, str2, activityResultContract, stateRememberUpdatedState2);
            str = str2;
            composer.updateRememberedValue(activityResultRegistryKt$rememberLauncherForActivityResult$1$1);
            objRememberedValue3 = activityResultRegistryKt$rememberLauncherForActivityResult$1$1;
        } else {
            str = str2;
            activityResultRegistry = activityResultRegistry2;
        }
        ActivityResultRegistry activityResultRegistry3 = activityResultRegistry;
        EffectsKt.DisposableEffect(activityResultRegistry3, str, activityResultContract, (InterfaceC9540l) objRememberedValue3, composer, (i10 << 6) & 896);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return managedActivityResultLauncher;
    }
}
