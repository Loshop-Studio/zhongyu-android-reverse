package androidx.lifecycle.viewmodel.internal;

import androidx.annotation.MainThread;
import androidx.documentfile.provider.AbstractC3754a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p325rc.AbstractC10937b0;
import sd.InterfaceC11122i0;

/* loaded from: classes2.dex */
public final class ViewModelImpl {
    private final Set<AutoCloseable> closeables;
    private volatile boolean isCleared;
    private final Map<String, AutoCloseable> keyToCloseables;
    private final SynchronizedObject lock;

    public ViewModelImpl() {
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeWithRuntimeException(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC3754a.m1748a(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void addCloseable(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(closeable, "closeable");
        if (this.isCleared) {
            closeWithRuntimeException(closeable);
            return;
        }
        synchronized (this.lock) {
            autoCloseable = (AutoCloseable) this.keyToCloseables.put(key, closeable);
        }
        closeWithRuntimeException(autoCloseable);
    }

    @MainThread
    public final void clear() {
        if (this.isCleared) {
            return;
        }
        this.isCleared = true;
        synchronized (this.lock) {
            try {
                Iterator it = this.keyToCloseables.values().iterator();
                while (it.hasNext()) {
                    closeWithRuntimeException((AutoCloseable) it.next());
                }
                Iterator it2 = this.closeables.iterator();
                while (it2.hasNext()) {
                    closeWithRuntimeException((AutoCloseable) it2.next());
                }
                this.closeables.clear();
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        T t10;
        AbstractC9979u.m20294g(key, "key");
        synchronized (this.lock) {
            t10 = (T) this.keyToCloseables.get(key);
        }
        return t10;
    }

    public ViewModelImpl(InterfaceC11122i0 viewModelScope) {
        AbstractC9979u.m20294g(viewModelScope, "viewModelScope");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(viewModelScope));
    }

    public final void addCloseable(AutoCloseable closeable) {
        AbstractC9979u.m20294g(closeable, "closeable");
        if (this.isCleared) {
            closeWithRuntimeException(closeable);
            return;
        }
        synchronized (this.lock) {
            this.closeables.add(closeable);
            C10786q c10786q = C10786q.f26013a;
        }
    }

    public ViewModelImpl(AutoCloseable... closeables) {
        AbstractC9979u.m20294g(closeables, "closeables");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        AbstractC10937b0.m23859D(linkedHashSet, closeables);
    }

    public ViewModelImpl(InterfaceC11122i0 viewModelScope, AutoCloseable... closeables) {
        AbstractC9979u.m20294g(viewModelScope, "viewModelScope");
        AbstractC9979u.m20294g(closeables, "closeables");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(viewModelScope));
        AbstractC10937b0.m23859D(linkedHashSet, closeables);
    }
}
