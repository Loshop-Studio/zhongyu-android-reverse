package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public interface SaveableStateHolder {
    @Composable
    void SaveableStateProvider(Object obj, InterfaceC9544p interfaceC9544p, Composer composer, int i10);

    void removeState(Object obj);
}
