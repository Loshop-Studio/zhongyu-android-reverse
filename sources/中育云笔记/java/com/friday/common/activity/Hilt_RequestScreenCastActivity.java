package com.friday.common.activity;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import cc.AbstractC5418a;
import p003a2.InterfaceC0045g;
import p120dc.C9015a;
import p120dc.C9022h;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9219b;
import p151fc.InterfaceC9220c;

/* loaded from: classes3.dex */
public abstract class Hilt_RequestScreenCastActivity extends AppCompatActivity implements InterfaceC9220c {

    /* renamed from: c */
    public C9022h f5588c;

    /* renamed from: d */
    public volatile C9015a f5589d;

    /* renamed from: e */
    public final Object f5590e = new Object();

    /* renamed from: f */
    public boolean f5591f = false;

    /* renamed from: com.friday.common.activity.Hilt_RequestScreenCastActivity$a */
    public class C5923a implements OnContextAvailableListener {
        public C5923a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_RequestScreenCastActivity.this.inject();
        }
    }

    public Hilt_RequestScreenCastActivity() {
        m4771J();
    }

    /* renamed from: J */
    private void m4771J() {
        addOnContextAvailableListener(new C5923a());
    }

    /* renamed from: K */
    private void m4772K() {
        if (getApplication() instanceof InterfaceC9219b) {
            C9022h c9022hM17606b = componentManager().m17606b();
            this.f5588c = c9022hM17606b;
            if (c9022hM17606b.m17626b()) {
                this.f5588c.m17627c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public final C9015a componentManager() {
        if (this.f5589d == null) {
            synchronized (this.f5590e) {
                try {
                    if (this.f5589d == null) {
                        this.f5589d = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f5589d;
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
        if (this.f5591f) {
            return;
        }
        this.f5591f = true;
        ((InterfaceC0045g) generatedComponent()).mo91i((RequestScreenCastActivity) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m4772K();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9022h c9022h = this.f5588c;
        if (c9022h != null) {
            c9022h.m17625a();
        }
    }
}
