package com.kunminx.architecture.p058ui.callback;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.kunminx.architecture.p058ui.callback.ProtectedUnPeekLiveDataV3;
import java.util.Timer;
import java.util.TimerTask;

@Deprecated
/* loaded from: classes4.dex */
public class ProtectedUnPeekLiveDataV3<T> extends LiveData<T> {

    /* renamed from: a */
    public boolean f5247a;

    /* renamed from: c */
    public boolean f5249c;

    /* renamed from: f */
    public TimerTask f5252f;

    /* renamed from: g */
    public boolean f5253g;

    /* renamed from: b */
    public boolean f5248b = true;

    /* renamed from: d */
    public int f5250d = 1000;

    /* renamed from: e */
    public Timer f5251e = new Timer();

    /* renamed from: h */
    public boolean f5254h = true;

    /* renamed from: com.kunminx.architecture.ui.callback.ProtectedUnPeekLiveDataV3$a */
    public class C6592a extends TimerTask {
        public C6592a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ProtectedUnPeekLiveDataV3.this.m4568c();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m4566a(ProtectedUnPeekLiveDataV3 protectedUnPeekLiveDataV3, Observer observer, Object obj) {
        if (protectedUnPeekLiveDataV3.f5247a) {
            protectedUnPeekLiveDataV3.f5248b = true;
            protectedUnPeekLiveDataV3.f5249c = false;
            protectedUnPeekLiveDataV3.f5247a = false;
        } else if (protectedUnPeekLiveDataV3.f5248b) {
            if (protectedUnPeekLiveDataV3.f5249c) {
                observer.onChanged(obj);
            }
        } else {
            protectedUnPeekLiveDataV3.f5248b = true;
            protectedUnPeekLiveDataV3.f5249c = true;
            observer.onChanged(obj);
        }
    }

    /* renamed from: c */
    public final void m4568c() {
        if (this.f5254h) {
            this.f5247a = true;
            super.postValue(null);
        } else {
            this.f5248b = true;
            this.f5249c = false;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, final Observer observer) {
        super.observe(lifecycleOwner, new Observer() { // from class: o1.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ProtectedUnPeekLiveDataV3.m4566a(this.f15467a, observer, obj);
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
        if (this.f5247a || this.f5253g || obj != 0) {
            this.f5248b = false;
            this.f5249c = false;
            super.setValue(obj);
            TimerTask timerTask = this.f5252f;
            if (timerTask != null) {
                timerTask.cancel();
                this.f5251e.purge();
            }
            if (obj != 0) {
                C6592a c6592a = new C6592a();
                this.f5252f = c6592a;
                this.f5251e.schedule(c6592a, this.f5250d);
            }
        }
    }
}
