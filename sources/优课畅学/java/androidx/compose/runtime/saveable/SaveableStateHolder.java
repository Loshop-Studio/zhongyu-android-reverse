package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface SaveableStateHolder {
    @Composable
    void SaveableStateProvider(Object obj, InterfaceC10574p interfaceC10574p, Composer composer, int i10);

    void removeState(Object obj);
}
