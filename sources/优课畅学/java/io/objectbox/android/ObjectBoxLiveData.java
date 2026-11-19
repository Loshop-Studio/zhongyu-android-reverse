package io.objectbox.android;

import androidx.lifecycle.LiveData;
import io.objectbox.query.Query;
import java.util.List;
import p222q6.InterfaceC9834a;
import p222q6.InterfaceC9837d;

/* loaded from: classes5.dex */
public class ObjectBoxLiveData<T> extends LiveData<List<T>> {

    /* renamed from: a */
    public final Query f16897a;

    /* renamed from: b */
    public InterfaceC9837d f16898b;

    /* renamed from: c */
    public final InterfaceC9834a f16899c;

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        if (this.f16898b == null) {
            this.f16898b = this.f16897a.m15485q().m18360a(this.f16899c);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        if (hasObservers()) {
            return;
        }
        this.f16898b.cancel();
        this.f16898b = null;
    }
}
