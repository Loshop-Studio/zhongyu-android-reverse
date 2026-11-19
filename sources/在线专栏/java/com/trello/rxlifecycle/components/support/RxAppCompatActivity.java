package com.trello.rxlifecycle.components.support;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import p147rx.subjects.BehaviorSubject;
import p158u1.EnumC3411a;

/* loaded from: classes.dex */
public abstract class RxAppCompatActivity extends AppCompatActivity {

    /* renamed from: a */
    private final BehaviorSubject<EnumC3411a> f7890a = BehaviorSubject.create();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7890a.onNext(EnumC3411a.CREATE);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        this.f7890a.onNext(EnumC3411a.DESTROY);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        this.f7890a.onNext(EnumC3411a.PAUSE);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f7890a.onNext(EnumC3411a.RESUME);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f7890a.onNext(EnumC3411a.START);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        this.f7890a.onNext(EnumC3411a.STOP);
        super.onStop();
    }
}
