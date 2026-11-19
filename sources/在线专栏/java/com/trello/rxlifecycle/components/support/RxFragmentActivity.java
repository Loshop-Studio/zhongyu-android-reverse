package com.trello.rxlifecycle.components.support;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import p147rx.subjects.BehaviorSubject;
import p158u1.EnumC3411a;

/* loaded from: classes.dex */
public abstract class RxFragmentActivity extends FragmentActivity {

    /* renamed from: a */
    private final BehaviorSubject<EnumC3411a> f7891a = BehaviorSubject.create();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7891a.onNext(EnumC3411a.CREATE);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        this.f7891a.onNext(EnumC3411a.DESTROY);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        this.f7891a.onNext(EnumC3411a.PAUSE);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f7891a.onNext(EnumC3411a.RESUME);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f7891a.onNext(EnumC3411a.START);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        this.f7891a.onNext(EnumC3411a.STOP);
        super.onStop();
    }
}
