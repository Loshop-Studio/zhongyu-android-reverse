package androidx.lifecycle;

import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScopeKt;
import androidx.lifecycle.viewmodel.internal.SynchronizedObject;
import kotlin.jvm.internal.AbstractC9979u;
import sd.InterfaceC11122i0;

/* loaded from: classes2.dex */
public final class ViewModelKt {
    private static final SynchronizedObject VIEW_MODEL_SCOPE_LOCK = new SynchronizedObject();

    public static final InterfaceC11122i0 getViewModelScope(ViewModel viewModel) {
        CloseableCoroutineScope closeableCoroutineScopeCreateViewModelScope;
        AbstractC9979u.m20294g(viewModel, "<this>");
        synchronized (VIEW_MODEL_SCOPE_LOCK) {
            closeableCoroutineScopeCreateViewModelScope = (CloseableCoroutineScope) viewModel.getCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY);
            if (closeableCoroutineScopeCreateViewModelScope == null) {
                closeableCoroutineScopeCreateViewModelScope = CloseableCoroutineScopeKt.createViewModelScope();
                viewModel.addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, closeableCoroutineScopeCreateViewModelScope);
            }
        }
        return closeableCoroutineScopeCreateViewModelScope;
    }
}
