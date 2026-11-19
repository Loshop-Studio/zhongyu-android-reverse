package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.lifecycle.internal.SavedStateHandleImpl_androidKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8814x0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9280q;

/* loaded from: classes3.dex */
public final class SavedStateHandle {
    public static final Companion Companion = new Companion(null);
    private SavedStateHandleImpl impl;
    private final Map<String, SavingStateLiveData<?>> liveDatas;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new SavedStateHandle();
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            AbstractC9133u.m16130d(classLoader);
            bundle.setClassLoader(classLoader);
            return new SavedStateHandle(SavedStateReader.m27310toMapimpl(SavedStateReader.m27229constructorimpl(bundle)));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean validateValue(Object obj) {
            return SavedStateHandleImpl_androidKt.isAcceptableType(obj);
        }

        private Companion() {
        }
    }

    public SavedStateHandle(Map<String, ? extends Object> initialState) {
        AbstractC9133u.m16133g(initialState, "initialState");
        this.liveDatas = new LinkedHashMap();
        this.impl = new SavedStateHandleImpl(initialState);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z10, T t10) {
        SavingStateLiveData<?> savingStateLiveData;
        if (this.impl.getMutableFlows().containsKey(str)) {
            throw new IllegalArgumentException(SavedStateHandle_androidKt.createMutuallyExclusiveErrorMessage(str).toString());
        }
        Map<String, SavingStateLiveData<?>> map = this.liveDatas;
        SavingStateLiveData<?> savingStateLiveData2 = map.get(str);
        if (savingStateLiveData2 == null) {
            if (this.impl.getRegular().containsKey(str)) {
                savingStateLiveData = new SavingStateLiveData<>(this, str, this.impl.getRegular().get(str));
            } else if (z10) {
                this.impl.getRegular().put(str, t10);
                savingStateLiveData = new SavingStateLiveData<>(this, str, t10);
            } else {
                savingStateLiveData = new SavingStateLiveData<>(this, str);
            }
            savingStateLiveData2 = savingStateLiveData;
            map.put(str, savingStateLiveData2);
        }
        return savingStateLiveData2;
    }

    @MainThread
    public final void clearSavedStateProvider(String key) {
        AbstractC9133u.m16133g(key, "key");
        this.impl.clearSavedStateProvider(key);
    }

    @MainThread
    public final boolean contains(String key) {
        AbstractC9133u.m16133g(key, "key");
        return this.impl.contains(key);
    }

    @MainThread
    public final <T> T get(String key) {
        AbstractC9133u.m16133g(key, "key");
        return (T) this.impl.get(key);
    }

    @MainThread
    public final <T> MutableLiveData<T> getLiveData(String key) {
        AbstractC9133u.m16133g(key, "key");
        MutableLiveData<T> liveDataInternal = getLiveDataInternal(key, false, null);
        AbstractC9133u.m16131e(liveDataInternal, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return liveDataInternal;
    }

    @MainThread
    public final <T> InterfaceC9271h getMutableStateFlow(String key, T t10) {
        AbstractC9133u.m16133g(key, "key");
        if (this.liveDatas.containsKey(key)) {
            throw new IllegalArgumentException(SavedStateHandle_androidKt.createMutuallyExclusiveErrorMessage(key).toString());
        }
        return this.impl.getMutableStateFlow(key, t10);
    }

    @MainThread
    public final <T> InterfaceC9280q getStateFlow(String key, T t10) {
        AbstractC9133u.m16133g(key, "key");
        return this.impl.getMutableFlows().containsKey(key) ? AbstractC9268e.m17012b(this.impl.getMutableStateFlow(key, t10)) : this.impl.getStateFlow(key, t10);
    }

    @MainThread
    public final Set<String> keys() {
        return AbstractC8814x0.m14793k(this.impl.keys(), this.liveDatas.keySet());
    }

    @MainThread
    public final <T> T remove(String key) {
        AbstractC9133u.m16133g(key, "key");
        T t10 = (T) this.impl.remove(key);
        SavingStateLiveData<?> savingStateLiveDataRemove = this.liveDatas.remove(key);
        if (savingStateLiveDataRemove != null) {
            savingStateLiveDataRemove.detach();
        }
        return t10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.impl.getSavedStateProvider();
    }

    @MainThread
    public final <T> void set(String key, T t10) {
        AbstractC9133u.m16133g(key, "key");
        if (Companion.validateValue(t10)) {
            SavingStateLiveData<?> savingStateLiveData = this.liveDatas.get(key);
            SavingStateLiveData<?> savingStateLiveData2 = savingStateLiveData instanceof MutableLiveData ? savingStateLiveData : null;
            if (savingStateLiveData2 != null) {
                savingStateLiveData2.setValue(t10);
            }
            this.impl.set(key, t10);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        AbstractC9133u.m16130d(t10);
        sb.append(t10.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @MainThread
    public final void setSavedStateProvider(String key, SavedStateRegistry.SavedStateProvider provider) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(provider, "provider");
        this.impl.setSavedStateProvider(key, provider);
    }

    @MainThread
    public final <T> MutableLiveData<T> getLiveData(String key, T t10) {
        AbstractC9133u.m16133g(key, "key");
        return getLiveDataInternal(key, true, t10);
    }

    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        private SavedStateHandle handle;
        private String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(SavedStateHandle savedStateHandle, String key, T t10) {
            super(t10);
            AbstractC9133u.m16133g(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }

        public final void detach() {
            this.handle = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t10) {
            SavedStateHandleImpl savedStateHandleImpl;
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null && (savedStateHandleImpl = savedStateHandle.impl) != null) {
                savedStateHandleImpl.set(this.key, t10);
            }
            super.setValue(t10);
        }

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String key) {
            AbstractC9133u.m16133g(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandle() {
        this.liveDatas = new LinkedHashMap();
        this.impl = new SavedStateHandleImpl(null, 1, 0 == true ? 1 : 0);
    }
}
