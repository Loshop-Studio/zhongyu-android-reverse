package io.objectbox.android;

import androidx.lifecycle.LiveData;
import io.objectbox.query.Query;
import java.util.List;
import p258u8.InterfaceC9589a;
import p258u8.InterfaceC9592d;

/* loaded from: classes5.dex */
public class ObjectBoxLiveData<T> extends LiveData<List<T>> {

    /* renamed from: a */
    public final Query f13212a;

    /* renamed from: b */
    public InterfaceC9592d f13213b;

    /* renamed from: c */
    public final InterfaceC9589a f13214c;

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        if (this.f13213b == null) {
            this.f13213b = this.f13212a.m13038u().m15987a(this.f13214c);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        if (hasObservers()) {
            return;
        }
        this.f13213b.cancel();
        this.f13213b = null;
    }
}
