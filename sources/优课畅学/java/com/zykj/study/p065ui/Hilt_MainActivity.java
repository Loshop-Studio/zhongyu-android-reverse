package com.zykj.study.p065ui;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.base.BaseActivity;
import p122h6.AbstractC8717a;
import p133i6.C8759a;
import p133i6.C8765g;
import p155k6.AbstractC9062d;
import p155k6.InterfaceC9060b;
import p264u4.InterfaceC10177h;

/* loaded from: classes5.dex */
public abstract class Hilt_MainActivity<T extends ViewDataBinding> extends BaseActivity<T> implements InterfaceC9060b {

    /* renamed from: a */
    public C8765g f11569a;

    /* renamed from: b */
    public volatile C8759a f11570b;

    /* renamed from: c */
    public final Object f11571c = new Object();

    /* renamed from: d */
    public boolean f11572d = false;

    /* renamed from: com.zykj.study.ui.Hilt_MainActivity$a */
    public class C7754a implements OnContextAvailableListener {
        public C7754a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_MainActivity.this.m10425q();
        }
    }

    public Hilt_MainActivity() {
        m10421m();
    }

    @Override // p155k6.InterfaceC9060b
    public final Object generatedComponent() {
        return m10422n().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC8717a.m14221a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: m */
    public final void m10421m() {
        addOnContextAvailableListener(new C7754a());
    }

    /* renamed from: n */
    public final C8759a m10422n() {
        if (this.f11570b == null) {
            synchronized (this.f11571c) {
                try {
                    if (this.f11570b == null) {
                        this.f11570b = m10423o();
                    }
                } finally {
                }
            }
        }
        return this.f11570b;
    }

    /* renamed from: o */
    public C8759a m10423o() {
        return new C8759a(this);
    }

    @Override // com.zykj.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10424p();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C8765g c8765g = this.f11569a;
        if (c8765g != null) {
            c8765g.m14474a();
        }
    }

    /* renamed from: p */
    public final void m10424p() {
        if (getApplication() instanceof InterfaceC9060b) {
            C8765g c8765gM14460b = m10422n().m14460b();
            this.f11569a = c8765gM14460b;
            if (c8765gM14460b.m14475b()) {
                this.f11569a.m14476c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* renamed from: q */
    public void m10425q() {
        if (this.f11572d) {
            return;
        }
        this.f11572d = true;
        ((InterfaceC10177h) generatedComponent()).mo9806b((MainActivity) AbstractC9062d.m15864a(this));
    }
}
