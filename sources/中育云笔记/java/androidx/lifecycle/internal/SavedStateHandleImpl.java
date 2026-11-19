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
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.AbstractC10776g;
import p325rc.AbstractC10985z0;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;

/* loaded from: classes2.dex */
public final class SavedStateHandleImpl {
    private final Map<String, InterfaceC11603l> flows;
    private final Map<String, InterfaceC11603l> mutableFlows;
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
        for (Map.Entry entry : AbstractC9925a.m20101u(savedStateHandleImpl.mutableFlows).entrySet()) {
            savedStateHandleImpl.set((String) entry.getKey(), ((InterfaceC11603l) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : AbstractC9925a.m20101u(savedStateHandleImpl.providers).entrySet()) {
            savedStateHandleImpl.set((String) entry2.getKey(), ((SavedStateRegistry.SavedStateProvider) entry2.getValue()).saveState());
        }
        Map<String, Object> map = savedStateHandleImpl.regular;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(AbstractC10776g.m22975a(entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m33910constructorimpl(bundleBundleOf);
        return bundleBundleOf;
    }

    @MainThread
    public final void clearSavedStateProvider(String key) {
        AbstractC9979u.m20294g(key, "key");
        this.providers.remove(key);
    }

    @MainThread
    public final boolean contains(String key) {
        AbstractC9979u.m20294g(key, "key");
        return this.regular.containsKey(key);
    }

    @MainThread
    public final <T> T get(String key) {
        T t10;
        AbstractC9979u.m20294g(key, "key");
        try {
            InterfaceC11603l interfaceC11603l = this.mutableFlows.get(key);
            if (interfaceC11603l != null && (t10 = (T) interfaceC11603l.getValue()) != null) {
                return t10;
            }
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    public final Map<String, InterfaceC11603l> getMutableFlows() {
        return this.mutableFlows;
    }

    @MainThread
    public final <T> InterfaceC11603l getMutableStateFlow(String key, T t10) {
        AbstractC9979u.m20294g(key, "key");
        Map<String, InterfaceC11603l> map = this.mutableFlows;
        InterfaceC11603l interfaceC11603lM25602a = map.get(key);
        if (interfaceC11603lM25602a == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, t10);
            }
            interfaceC11603lM25602a = AbstractC11613v.m25602a(this.regular.get(key));
            map.put(key, interfaceC11603lM25602a);
        }
        InterfaceC11603l interfaceC11603l = interfaceC11603lM25602a;
        AbstractC9979u.m20292e(interfaceC11603l, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getMutableStateFlow>");
        return interfaceC11603l;
    }

    public final Map<String, Object> getRegular() {
        return this.regular;
    }

    public final SavedStateRegistry.SavedStateProvider getSavedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    public final <T> InterfaceC11612u getStateFlow(String key, T t10) {
        AbstractC9979u.m20294g(key, "key");
        Map<String, InterfaceC11603l> map = this.flows;
        InterfaceC11603l interfaceC11603lM25602a = map.get(key);
        if (interfaceC11603lM25602a == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, t10);
            }
            interfaceC11603lM25602a = AbstractC11613v.m25602a(this.regular.get(key));
            map.put(key, interfaceC11603lM25602a);
        }
        InterfaceC11612u interfaceC11612uM25552b = AbstractC11596e.m25552b(interfaceC11603lM25602a);
        AbstractC9979u.m20292e(interfaceC11612uM25552b, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getStateFlow>");
        return interfaceC11612uM25552b;
    }

    @MainThread
    public final Set<String> keys() {
        return AbstractC10985z0.m24167m(this.regular.keySet(), this.providers.keySet());
    }

    @MainThread
    public final <T> T remove(String key) {
        AbstractC9979u.m20294g(key, "key");
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
        AbstractC9979u.m20294g(key, "key");
        this.regular.put(key, t10);
        InterfaceC11603l interfaceC11603l = this.flows.get(key);
        if (interfaceC11603l != null) {
            interfaceC11603l.setValue(t10);
        }
        InterfaceC11603l interfaceC11603l2 = this.mutableFlows.get(key);
        if (interfaceC11603l2 != null) {
            interfaceC11603l2.setValue(t10);
        }
    }

    @MainThread
    public final void setSavedStateProvider(String key, SavedStateRegistry.SavedStateProvider provider) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(provider, "provider");
        this.providers.put(key, provider);
    }

    public SavedStateHandleImpl(Map<String, ? extends Object> initialState) {
        AbstractC9979u.m20294g(initialState, "initialState");
        this.regular = AbstractC9925a.m20104x(initialState);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: h.a
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandleImpl.savedStateProvider$lambda$0(this.f21836a);
            }
        };
    }

    public /* synthetic */ SavedStateHandleImpl(Map map, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? AbstractC9925a.m20088h() : map);
    }
}
