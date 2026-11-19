package io.objectbox.android;

import androidx.lifecycle.LiveData;
import io.objectbox.query.Query;
import java.util.List;
import nc.InterfaceC10388a;
import nc.InterfaceC10391d;

/* loaded from: classes6.dex */
public class ObjectBoxLiveData<T> extends LiveData<List<T>> {

    /* renamed from: a */
    public final Query f22285a;

    /* renamed from: b */
    public InterfaceC10391d f22286b;

    /* renamed from: c */
    public final InterfaceC10388a f22287c;

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        if (this.f22286b == null) {
            this.f22286b = this.f22285a.m19010u().m21716a(this.f22287c);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        if (hasObservers()) {
            return;
        }
        this.f22286b.cancel();
        this.f22286b = null;
    }
}
