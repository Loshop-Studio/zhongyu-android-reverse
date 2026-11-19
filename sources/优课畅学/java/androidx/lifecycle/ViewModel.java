package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p135i8.InterfaceC8822b0;

/* loaded from: classes3.dex */
public abstract class ViewModel {
    private final ViewModelImpl impl;

    public ViewModel() {
        this.impl = new ViewModelImpl();
    }

    public final void addCloseable(String key, AutoCloseable closeable) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(key, closeable);
        }
    }

    @MainThread
    public final void clear$lifecycle_viewmodel_release() {
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.clear();
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        AbstractC9133u.m16133g(key, "key");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            return (T) viewModelImpl.getCloseable(key);
        }
        return null;
    }

    public void onCleared() {
    }

    public void addCloseable(AutoCloseable closeable) {
        AbstractC9133u.m16133g(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(closeable);
        }
    }

    public ViewModel(InterfaceC8822b0 viewModelScope) {
        AbstractC9133u.m16133g(viewModelScope, "viewModelScope");
        this.impl = new ViewModelImpl(viewModelScope);
    }

    @InterfaceC8721a
    public /* synthetic */ void addCloseable(Closeable closeable) {
        AbstractC9133u.m16133g(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(closeable);
        }
    }

    public ViewModel(AutoCloseable... closeables) {
        AbstractC9133u.m16133g(closeables, "closeables");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public ViewModel(InterfaceC8822b0 viewModelScope, AutoCloseable... closeables) {
        AbstractC9133u.m16133g(viewModelScope, "viewModelScope");
        AbstractC9133u.m16133g(closeables, "closeables");
        this.impl = new ViewModelImpl(viewModelScope, (AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    @InterfaceC8721a
    public /* synthetic */ ViewModel(Closeable... closeables) {
        AbstractC9133u.m16133g(closeables, "closeables");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }
}
