package com.trello.rxlifecycle.components;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import p147rx.subjects.BehaviorSubject;
import p158u1.EnumC3412b;

/* loaded from: classes.dex */
public abstract class RxDialogFragment extends DialogFragment {

    /* renamed from: a */
    private final BehaviorSubject<EnumC3412b> f7889a = BehaviorSubject.create();

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f7889a.onNext(EnumC3412b.ATTACH);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7889a.onNext(EnumC3412b.CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.f7889a.onNext(EnumC3412b.DESTROY);
        super.onDestroy();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        this.f7889a.onNext(EnumC3412b.DESTROY_VIEW);
        super.onDestroyView();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDetach() {
        this.f7889a.onNext(EnumC3412b.DETACH);
        super.onDetach();
    }

    @Override // android.app.Fragment
    public void onPause() {
        this.f7889a.onNext(EnumC3412b.PAUSE);
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f7889a.onNext(EnumC3412b.RESUME);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f7889a.onNext(EnumC3412b.START);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStop() {
        this.f7889a.onNext(EnumC3412b.STOP);
        super.onStop();
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f7889a.onNext(EnumC3412b.CREATE_VIEW);
    }
}
