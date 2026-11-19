package com.zykj.evaluation.p057ui;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import p146k8.AbstractC7899a;
import p159l8.C8516a;
import p159l8.C8522g;
import p181n8.AbstractC8673d;
import p181n8.InterfaceC8671b;
import p233s5.InterfaceC9172h;

/* loaded from: classes4.dex */
public abstract class Hilt_MainActivity extends AppCompatActivity implements InterfaceC8671b {

    /* renamed from: a */
    public C8522g f8976a;

    /* renamed from: b */
    public volatile C8516a f8977b;

    /* renamed from: c */
    public final Object f8978c = new Object();

    /* renamed from: d */
    public boolean f8979d = false;

    /* renamed from: com.zykj.evaluation.ui.Hilt_MainActivity$a */
    public class C6878a implements OnContextAvailableListener {
        public C6878a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_MainActivity.this.m8831q();
        }
    }

    public Hilt_MainActivity() {
        m8827m();
    }

    @Override // p181n8.InterfaceC8671b
    public final Object generatedComponent() {
        return m8828n().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7899a.m13517a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: m */
    public final void m8827m() {
        addOnContextAvailableListener(new C6878a());
    }

    /* renamed from: n */
    public final C8516a m8828n() {
        if (this.f8977b == null) {
            synchronized (this.f8978c) {
                try {
                    if (this.f8977b == null) {
                        this.f8977b = m8829o();
                    }
                } finally {
                }
            }
        }
        return this.f8977b;
    }

    /* renamed from: o */
    public C8516a m8829o() {
        return new C8516a(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m8830p();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C8522g c8522g = this.f8976a;
        if (c8522g != null) {
            c8522g.m14010a();
        }
    }

    /* renamed from: p */
    public final void m8830p() {
        if (getApplication() instanceof InterfaceC8671b) {
            C8522g c8522gM13996b = m8828n().m13996b();
            this.f8976a = c8522gM13996b;
            if (c8522gM13996b.m14011b()) {
                this.f8976a.m14012c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* renamed from: q */
    public void m8831q() {
        if (this.f8979d) {
            return;
        }
        this.f8979d = true;
        ((InterfaceC9172h) generatedComponent()).mo13473c((MainActivity) AbstractC8673d.m14278a(this));
    }
}
