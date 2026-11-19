package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.internal.CanonicalName_jvmKt;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p049ce.InterfaceC5432b;
import p181hd.InterfaceC9529a;
import p226kd.InterfaceC9916c;
import p280od.InterfaceC10478l;
import p309qc.C10786q;

/* loaded from: classes3.dex */
final class SavedStateRegistryOwnerDelegate<T> implements InterfaceC9916c {
    private final SavedStateConfiguration configuration;
    private final InterfaceC9529a init;
    private final String key;
    private final SavedStateRegistry registry;
    private final InterfaceC5432b serializer;
    private T value;

    public SavedStateRegistryOwnerDelegate(SavedStateRegistry registry, InterfaceC5432b serializer, String str, SavedStateConfiguration configuration, InterfaceC9529a init) {
        AbstractC9979u.m20294g(registry, "registry");
        AbstractC9979u.m20294g(serializer, "serializer");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(init, "init");
        this.registry = registry;
        this.serializer = serializer;
        this.key = str;
        this.configuration = configuration;
        this.init = init;
    }

    private final String createDefaultKey(Object obj, InterfaceC10478l interfaceC10478l) {
        String str;
        if (obj != null) {
            str = CanonicalName_jvmKt.getCanonicalName(AbstractC9983y.m20315b(obj.getClass())) + '.';
        } else {
            str = "";
        }
        return str + interfaceC10478l.getName();
    }

    private final T loadValue(String str) {
        Bundle bundleConsumeRestoredStateForKey = this.registry.consumeRestoredStateForKey(str);
        if (bundleConsumeRestoredStateForKey != null) {
            return (T) SavedStateDecoderKt.decodeFromSavedState(this.serializer, bundleConsumeRestoredStateForKey, this.configuration);
        }
        return null;
    }

    private final void registerSave(String str) {
        this.registry.registerSavedStateProvider(str, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.savedstate.serialization.b
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateRegistryOwnerDelegate.registerSave$lambda$1(this.f2069a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle registerSave$lambda$1(SavedStateRegistryOwnerDelegate savedStateRegistryOwnerDelegate) {
        InterfaceC5432b interfaceC5432b = savedStateRegistryOwnerDelegate.serializer;
        Object obj = savedStateRegistryOwnerDelegate.value;
        if (obj == null) {
            AbstractC9979u.m20312y("value");
            obj = C10786q.f26013a;
        }
        return SavedStateEncoderKt.encodeToSavedState(interfaceC5432b, obj, savedStateRegistryOwnerDelegate.configuration);
    }

    public T getValue(Object obj, InterfaceC10478l property) {
        AbstractC9979u.m20294g(property, "property");
        if (this.value == null) {
            String strCreateDefaultKey = this.key;
            if (strCreateDefaultKey == null) {
                strCreateDefaultKey = createDefaultKey(obj, property);
            }
            registerSave(strCreateDefaultKey);
            T tLoadValue = loadValue(strCreateDefaultKey);
            if (tLoadValue == null) {
                tLoadValue = (T) this.init.invoke();
            }
            this.value = tLoadValue;
        }
        T t10 = this.value;
        if (t10 != null) {
            return t10;
        }
        AbstractC9979u.m20312y("value");
        return (T) C10786q.f26013a;
    }

    public void setValue(Object obj, InterfaceC10478l property, T value) {
        AbstractC9979u.m20294g(property, "property");
        AbstractC9979u.m20294g(value, "value");
        if (this.value == null) {
            String strCreateDefaultKey = this.key;
            if (strCreateDefaultKey == null) {
                strCreateDefaultKey = createDefaultKey(obj, property);
            }
            registerSave(strCreateDefaultKey);
        }
        this.value = value;
    }
}
