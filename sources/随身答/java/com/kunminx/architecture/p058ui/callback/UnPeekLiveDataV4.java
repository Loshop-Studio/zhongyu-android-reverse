package com.kunminx.architecture.p058ui.callback;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

@Deprecated
/* loaded from: classes4.dex */
public class UnPeekLiveDataV4<T> extends ProtectedUnPeekLiveDataV5<T> {
    @Override // com.kunminx.architecture.p058ui.callback.ProtectedUnPeekLiveDataV5, androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer observer) {
        throw new IllegalArgumentException("请不要在 UnPeekLiveData 中使用 observe 方法。取而代之的是在 Activity 和 Fragment 中分别使用 observeInActivity 和 observeInFragment 来观察。\n\nTaking into account the normal permission of preventing backflow logic,  do not use observeForever to communicate between pages.Instead, you can use ObserveInActivity and ObserveInFragment methods to observe in Activity and Fragment respectively.");
    }

    @Override // com.kunminx.architecture.p058ui.callback.ProtectedUnPeekLiveDataV5, androidx.lifecycle.LiveData
    public void observeForever(Observer observer) {
        throw new IllegalArgumentException("出于生命周期安全的考虑，请不要在 UnPeekLiveData 中使用 observeForever 方法。\n\nConsidering avoid lifecycle security issues, do not use observeForever for communication between pages.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void postValue(Object obj) {
        super.postValue(obj);
    }

    @Override // com.kunminx.architecture.p058ui.callback.ProtectedUnPeekLiveDataV5, androidx.lifecycle.LiveData
    public void setValue(Object obj) {
        super.setValue(obj);
    }
}
