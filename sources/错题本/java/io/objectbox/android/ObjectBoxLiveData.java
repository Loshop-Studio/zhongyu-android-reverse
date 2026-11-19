package io.objectbox.android;

import android.view.LiveData;
import java.util.List;

/* loaded from: classes3.dex */
public class ObjectBoxLiveData<T> extends LiveData<List<T>> {
    @Override // android.view.LiveData
    public final void onActive() {
        throw null;
    }

    @Override // android.view.LiveData
    public final void onInactive() {
        if (!hasObservers()) {
            throw null;
        }
    }
}
