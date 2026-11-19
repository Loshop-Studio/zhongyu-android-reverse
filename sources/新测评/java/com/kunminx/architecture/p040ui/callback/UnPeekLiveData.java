package com.kunminx.architecture.p040ui.callback;

/* loaded from: classes.dex */
public class UnPeekLiveData<T> extends ProtectedUnPeekLiveData<T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void postValue(Object obj) {
        super.postValue(obj);
    }

    @Override // com.kunminx.architecture.p040ui.callback.ProtectedUnPeekLiveData, androidx.lifecycle.LiveData
    public void setValue(Object obj) {
        super.setValue(obj);
    }
}
