package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;
import sd.InterfaceC11122i0;

/* loaded from: classes2.dex */
public abstract class ViewModel {
    private final ViewModelImpl impl;

    public ViewModel() {
        this.impl = new ViewModelImpl();
    }

    public final void addCloseable(String key, AutoCloseable closeable) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(closeable, "closeable");
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
        AbstractC9979u.m20294g(key, "key");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            return (T) viewModelImpl.getCloseable(key);
        }
        return null;
    }

    public void onCleared() {
    }

    public void addCloseable(AutoCloseable closeable) {
        AbstractC9979u.m20294g(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(closeable);
        }
    }

    public ViewModel(InterfaceC11122i0 viewModelScope) {
        AbstractC9979u.m20294g(viewModelScope, "viewModelScope");
        this.impl = new ViewModelImpl(viewModelScope);
    }

    @InterfaceC10770a
    public /* synthetic */ void addCloseable(Closeable closeable) {
        AbstractC9979u.m20294g(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(closeable);
        }
    }

    public ViewModel(AutoCloseable... closeables) {
        AbstractC9979u.m20294g(closeables, "closeables");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public ViewModel(InterfaceC11122i0 viewModelScope, AutoCloseable... closeables) {
        AbstractC9979u.m20294g(viewModelScope, "viewModelScope");
        AbstractC9979u.m20294g(closeables, "closeables");
        this.impl = new ViewModelImpl(viewModelScope, (AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    @InterfaceC10770a
    public /* synthetic */ ViewModel(Closeable... closeables) {
        AbstractC9979u.m20294g(closeables, "closeables");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }
}
