package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.internal.CanonicalName_jvmKt;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p009a8.InterfaceC0049e;
import p089e8.InterfaceC8383k;
import p123h7.C8736p;
import p246s8.InterfaceC10052b;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
final class SavedStateRegistryOwnerDelegate<T> implements InterfaceC0049e {
    private final SavedStateConfiguration configuration;
    private final InterfaceC10559a init;
    private final String key;
    private final SavedStateRegistry registry;
    private final InterfaceC10052b serializer;
    private T value;

    public SavedStateRegistryOwnerDelegate(SavedStateRegistry registry, InterfaceC10052b serializer, String str, SavedStateConfiguration configuration, InterfaceC10559a init) {
        AbstractC9133u.m16133g(registry, "registry");
        AbstractC9133u.m16133g(serializer, "serializer");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC9133u.m16133g(init, "init");
        this.registry = registry;
        this.serializer = serializer;
        this.key = str;
        this.configuration = configuration;
        this.init = init;
    }

    private final String createDefaultKey(Object obj, InterfaceC8383k interfaceC8383k) {
        String str;
        if (obj != null) {
            str = CanonicalName_jvmKt.getCanonicalName(AbstractC9137y.m16154b(obj.getClass())) + '.';
        } else {
            str = "";
        }
        return str + interfaceC8383k.getName();
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
                return SavedStateRegistryOwnerDelegate.registerSave$lambda$1(this.f1955a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle registerSave$lambda$1(SavedStateRegistryOwnerDelegate savedStateRegistryOwnerDelegate) {
        InterfaceC10052b interfaceC10052b = savedStateRegistryOwnerDelegate.serializer;
        Object obj = savedStateRegistryOwnerDelegate.value;
        if (obj == null) {
            AbstractC9133u.m16151y("value");
            obj = C8736p.f16368a;
        }
        return SavedStateEncoderKt.encodeToSavedState(interfaceC10052b, obj, savedStateRegistryOwnerDelegate.configuration);
    }

    @Override // p009a8.InterfaceC0049e, p009a8.InterfaceC0048d
    public T getValue(Object obj, InterfaceC8383k property) {
        AbstractC9133u.m16133g(property, "property");
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
        AbstractC9133u.m16151y("value");
        return (T) C8736p.f16368a;
    }

    @Override // p009a8.InterfaceC0049e
    public void setValue(Object obj, InterfaceC8383k property, T value) {
        AbstractC9133u.m16133g(property, "property");
        AbstractC9133u.m16133g(value, "value");
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
