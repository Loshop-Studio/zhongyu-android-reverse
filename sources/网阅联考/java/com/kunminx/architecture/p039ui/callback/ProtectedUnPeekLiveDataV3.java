package com.kunminx.architecture.p039ui.callback;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.util.Timer;
import java.util.TimerTask;

@Deprecated
/* loaded from: classes2.dex */
public class ProtectedUnPeekLiveDataV3<T> extends LiveData<T> {

    /* renamed from: a */
    public boolean f1283a;

    /* renamed from: c */
    public boolean f1285c;

    /* renamed from: f */
    public TimerTask f1288f;

    /* renamed from: g */
    public boolean f1289g;

    /* renamed from: b */
    public boolean f1284b = true;

    /* renamed from: d */
    public int f1286d = 1000;

    /* renamed from: e */
    public Timer f1287e = new Timer();

    /* renamed from: h */
    public boolean f1290h = true;

    /* renamed from: com.kunminx.architecture.ui.callback.ProtectedUnPeekLiveDataV3$a */
    public class C3296a extends TimerTask {
        public C3296a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ProtectedUnPeekLiveDataV3.this.m2257c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m2256d(Observer observer, Object obj) {
        if (this.f1283a) {
            this.f1284b = true;
            this.f1285c = false;
            this.f1283a = false;
        } else if (this.f1284b) {
            if (this.f1285c) {
                observer.onChanged(obj);
            }
        } else {
            this.f1284b = true;
            this.f1285c = true;
            observer.onChanged(obj);
        }
    }

    /* renamed from: c */
    public final void m2257c() {
        if (this.f1290h) {
            this.f1283a = true;
            super.postValue(null);
        } else {
            this.f1284b = true;
            this.f1285c = false;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, final Observer observer) {
        super.observe(lifecycleOwner, new Observer() { // from class: i0.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f4512a.m2256d(observer, obj);
            }
        });
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(Observer observer) {
        throw new IllegalArgumentException("Do not use observeForever for communication between pages to avoid lifecycle security issues");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void setValue(Object obj) {
        if (this.f1283a || this.f1289g || obj != 0) {
            this.f1284b = false;
            this.f1285c = false;
            super.setValue(obj);
            TimerTask timerTask = this.f1288f;
            if (timerTask != null) {
                timerTask.cancel();
                this.f1287e.purge();
            }
            if (obj != 0) {
                C3296a c3296a = new C3296a();
                this.f1288f = c3296a;
                this.f1287e.schedule(c3296a, this.f1286d);
            }
        }
    }
}
