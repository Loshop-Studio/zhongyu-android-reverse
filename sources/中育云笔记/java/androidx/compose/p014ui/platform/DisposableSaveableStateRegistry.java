package androidx.compose.p014ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.List;
import java.util.Map;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {
    public static final int $stable = 8;
    private final /* synthetic */ SaveableStateRegistry $$delegate_0;
    private final InterfaceC9529a onDispose;

    public DisposableSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry, InterfaceC9529a interfaceC9529a) {
        this.onDispose = interfaceC9529a;
        this.$$delegate_0 = saveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return this.$$delegate_0.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        return this.$$delegate_0.consumeRestored(str);
    }

    public final void dispose() {
        this.onDispose.invoke();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        return this.$$delegate_0.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String str, InterfaceC9529a interfaceC9529a) {
        return this.$$delegate_0.registerProvider(str, interfaceC9529a);
    }
}
