package com.friday.main.view;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import cc.AbstractC5418a;
import p120dc.C9015a;
import p120dc.C9022h;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9219b;
import p151fc.InterfaceC9220c;
import p371v3.InterfaceC11494k0;

/* loaded from: classes4.dex */
public abstract class Hilt_DBActivity extends AppCompatActivity implements InterfaceC9220c {

    /* renamed from: c */
    public C9022h f9326c;

    /* renamed from: d */
    public volatile C9015a f9327d;

    /* renamed from: e */
    public final Object f9328e = new Object();

    /* renamed from: f */
    public boolean f9329f = false;

    /* renamed from: com.friday.main.view.Hilt_DBActivity$a */
    public class C6205a implements OnContextAvailableListener {
        public C6205a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_DBActivity.this.inject();
        }
    }

    public Hilt_DBActivity() {
        m7074J();
    }

    /* renamed from: J */
    private void m7074J() {
        addOnContextAvailableListener(new C6205a());
    }

    /* renamed from: K */
    private void m7075K() {
        if (getApplication() instanceof InterfaceC9219b) {
            C9022h c9022hM17606b = componentManager().m17606b();
            this.f9326c = c9022hM17606b;
            if (c9022hM17606b.m17626b()) {
                this.f9326c.m17627c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public final C9015a componentManager() {
        if (this.f9327d == null) {
            synchronized (this.f9328e) {
                try {
                    if (this.f9327d == null) {
                        this.f9327d = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f9327d;
    }

    public C9015a createComponentManager() {
        return new C9015a(this);
    }

    @Override // p151fc.InterfaceC9219b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2891a(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f9329f) {
            return;
        }
        this.f9329f = true;
        ((InterfaceC11494k0) generatedComponent()).mo25381u((DBActivity) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m7075K();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9022h c9022h = this.f9326c;
        if (c9022h != null) {
            c9022h.m17625a();
        }
    }
}
