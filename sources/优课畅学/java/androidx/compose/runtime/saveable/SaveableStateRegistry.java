package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public interface SaveableStateRegistry {

    public interface Entry {
        void unregister();
    }

    boolean canBeSaved(Object obj);

    Object consumeRestored(String str);

    Map<String, List<Object>> performSave();

    Entry registerProvider(String str, InterfaceC10559a interfaceC10559a);
}
