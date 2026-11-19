package com.kunminx.architecture.domain.message;

/* loaded from: classes3.dex */
public class MutableResult<T> extends Result<T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void postValue(Object obj) {
        super.postValue(obj);
    }

    @Override // com.kunminx.architecture.p031ui.callback.ProtectedUnPeekLiveData, androidx.lifecycle.LiveData
    public void setValue(Object obj) {
        super.setValue(obj);
    }
}
