package androidx.lifecycle.internal;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.core.os.BundleKt;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8726f;
import p134i7.AbstractC8814x0;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9280q;

/* loaded from: classes3.dex */
public final class SavedStateHandleImpl {
    private final Map<String, InterfaceC9271h> flows;
    private final Map<String, InterfaceC9271h> mutableFlows;
    private final Map<String, SavedStateRegistry.SavedStateProvider> providers;
    private final Map<String, Object> regular;
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandleImpl savedStateHandleImpl) {
        Pair[] pairArr;
        for (Map.Entry entry : AbstractC9080a.m15956u(savedStateHandleImpl.mutableFlows).entrySet()) {
            savedStateHandleImpl.set((String) entry.getKey(), ((InterfaceC9271h) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : AbstractC9080a.m15956u(savedStateHandleImpl.providers).entrySet()) {
            savedStateHandleImpl.set((String) entry2.getKey(), ((SavedStateRegistry.SavedStateProvider) entry2.getValue()).saveState());
        }
        Map<String, Object> map = savedStateHandleImpl.regular;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(AbstractC8726f.m14230a(entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m27315constructorimpl(bundleBundleOf);
        return bundleBundleOf;
    }

    @MainThread
    public final void clearSavedStateProvider(String key) {
        AbstractC9133u.m16133g(key, "key");
        this.providers.remove(key);
    }

    @MainThread
    public final boolean contains(String key) {
        AbstractC9133u.m16133g(key, "key");
        return this.regular.containsKey(key);
    }

    @MainThread
    public final <T> T get(String key) {
        T t10;
        AbstractC9133u.m16133g(key, "key");
        try {
            InterfaceC9271h interfaceC9271h = this.mutableFlows.get(key);
            if (interfaceC9271h != null && (t10 = (T) interfaceC9271h.getValue()) != null) {
                return t10;
            }
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    public final Map<String, InterfaceC9271h> getMutableFlows() {
        return this.mutableFlows;
    }

    @MainThread
    public final <T> InterfaceC9271h getMutableStateFlow(String key, T t10) {
        AbstractC9133u.m16133g(key, "key");
        Map<String, InterfaceC9271h> map = this.mutableFlows;
        InterfaceC9271h interfaceC9271hM17054a = map.get(key);
        if (interfaceC9271hM17054a == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, t10);
            }
            interfaceC9271hM17054a = AbstractC9281r.m17054a(this.regular.get(key));
            map.put(key, interfaceC9271hM17054a);
        }
        InterfaceC9271h interfaceC9271h = interfaceC9271hM17054a;
        AbstractC9133u.m16131e(interfaceC9271h, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getMutableStateFlow>");
        return interfaceC9271h;
    }

    public final Map<String, Object> getRegular() {
        return this.regular;
    }

    public final SavedStateRegistry.SavedStateProvider getSavedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    public final <T> InterfaceC9280q getStateFlow(String key, T t10) {
        AbstractC9133u.m16133g(key, "key");
        Map<String, InterfaceC9271h> map = this.flows;
        InterfaceC9271h interfaceC9271hM17054a = map.get(key);
        if (interfaceC9271hM17054a == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, t10);
            }
            interfaceC9271hM17054a = AbstractC9281r.m17054a(this.regular.get(key));
            map.put(key, interfaceC9271hM17054a);
        }
        InterfaceC9280q interfaceC9280qM17012b = AbstractC9268e.m17012b(interfaceC9271hM17054a);
        AbstractC9133u.m16131e(interfaceC9280qM17012b, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getStateFlow>");
        return interfaceC9280qM17012b;
    }

    @MainThread
    public final Set<String> keys() {
        return AbstractC8814x0.m14793k(this.regular.keySet(), this.providers.keySet());
    }

    @MainThread
    public final <T> T remove(String key) {
        AbstractC9133u.m16133g(key, "key");
        T t10 = (T) this.regular.remove(key);
        this.flows.remove(key);
        this.mutableFlows.remove(key);
        return t10;
    }

    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    public final <T> void set(String key, T t10) {
        AbstractC9133u.m16133g(key, "key");
        this.regular.put(key, t10);
        InterfaceC9271h interfaceC9271h = this.flows.get(key);
        if (interfaceC9271h != null) {
            interfaceC9271h.setValue(t10);
        }
        InterfaceC9271h interfaceC9271h2 = this.mutableFlows.get(key);
        if (interfaceC9271h2 != null) {
            interfaceC9271h2.setValue(t10);
        }
    }

    @MainThread
    public final void setSavedStateProvider(String key, SavedStateRegistry.SavedStateProvider provider) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(provider, "provider");
        this.providers.put(key, provider);
    }

    public SavedStateHandleImpl(Map<String, ? extends Object> initialState) {
        AbstractC9133u.m16133g(initialState, "initialState");
        this.regular = AbstractC9080a.m15959x(initialState);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: i.a
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandleImpl.savedStateProvider$lambda$0(this.f16381a);
            }
        };
    }

    public /* synthetic */ SavedStateHandleImpl(Map map, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? AbstractC9080a.m15943h() : map);
    }
}
