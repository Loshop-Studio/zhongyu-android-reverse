package io.objectbox.android;

import androidx.lifecycle.LiveData;
import io.objectbox.query.Query;
import java.util.List;
import p109f8.InterfaceC7948a;
import p109f8.InterfaceC7951d;

/* loaded from: classes5.dex */
public class ObjectBoxLiveData<T> extends LiveData<List<T>> {

    /* renamed from: a */
    public final Query f14026a;

    /* renamed from: b */
    public InterfaceC7951d f14027b;

    /* renamed from: c */
    public final InterfaceC7948a f14028c;

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        if (this.f14027b == null) {
            this.f14027b = this.f14026a.m13157u().m12498a(this.f14028c);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        if (hasObservers()) {
            return;
        }
        this.f14027b.cancel();
        this.f14027b = null;
    }
}
