package com.trello.rxlifecycle.components;

import android.app.Activity;
import android.os.Bundle;
import p147rx.subjects.BehaviorSubject;
import p158u1.EnumC3411a;

/* loaded from: classes.dex */
public abstract class RxActivity extends Activity {

    /* renamed from: a */
    private final BehaviorSubject<EnumC3411a> f7888a = BehaviorSubject.create();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7888a.onNext(EnumC3411a.CREATE);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.f7888a.onNext(EnumC3411a.DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        this.f7888a.onNext(EnumC3411a.PAUSE);
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f7888a.onNext(EnumC3411a.RESUME);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f7888a.onNext(EnumC3411a.START);
    }

    @Override // android.app.Activity
    protected void onStop() {
        this.f7888a.onNext(EnumC3411a.STOP);
        super.onStop();
    }
}
