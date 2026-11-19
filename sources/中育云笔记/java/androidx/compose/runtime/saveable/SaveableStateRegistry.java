package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public interface SaveableStateRegistry {

    public interface Entry {
        void unregister();
    }

    boolean canBeSaved(Object obj);

    Object consumeRestored(String str);

    Map<String, List<Object>> performSave();

    Entry registerProvider(String str, InterfaceC9529a interfaceC9529a);
}
