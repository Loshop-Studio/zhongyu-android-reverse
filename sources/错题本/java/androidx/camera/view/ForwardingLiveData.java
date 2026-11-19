package androidx.camera.view;

import android.view.LiveData;
import android.view.MediatorLiveData;
import android.view.Observer;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
final class ForwardingLiveData<T> extends MediatorLiveData<T> {
    private LiveData<T> mLiveDataSource;

    @Override // android.view.LiveData
    public T getValue() {
        LiveData<T> liveData = this.mLiveDataSource;
        if (liveData == null) {
            return null;
        }
        return liveData.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSource(@NonNull LiveData<T> liveData) {
        LiveData<T> liveData2 = this.mLiveDataSource;
        if (liveData2 != null) {
            super.removeSource(liveData2);
        }
        this.mLiveDataSource = liveData;
        super.addSource(liveData, new Observer() { // from class: androidx.camera.view.d
            @Override // android.view.Observer
            public final void onChanged(Object obj) {
                this.f685a.setValue(obj);
            }
        });
    }
}
