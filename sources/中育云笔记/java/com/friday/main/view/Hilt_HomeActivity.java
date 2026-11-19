package com.friday.main.view;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import cc.AbstractC5418a;
import com.friday.common.base.BaseActivity;
import p120dc.C9015a;
import p120dc.C9022h;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9219b;
import p151fc.InterfaceC9220c;
import p371v3.InterfaceC11522t1;

/* loaded from: classes4.dex */
public abstract class Hilt_HomeActivity<Binding extends ViewDataBinding> extends BaseActivity<Binding> implements InterfaceC9220c {

    /* renamed from: c */
    public C9022h f9341c;

    /* renamed from: d */
    public volatile C9015a f9342d;

    /* renamed from: e */
    public final Object f9343e = new Object();

    /* renamed from: f */
    public boolean f9344f = false;

    /* renamed from: com.friday.main.view.Hilt_HomeActivity$a */
    public class C6208a implements OnContextAvailableListener {
        public C6208a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_HomeActivity.this.inject();
        }
    }

    public Hilt_HomeActivity() {
        m7080L();
    }

    /* renamed from: L */
    private void m7080L() {
        addOnContextAvailableListener(new C6208a());
    }

    /* renamed from: M */
    private void m7081M() {
        if (getApplication() instanceof InterfaceC9219b) {
            C9022h c9022hM17606b = componentManager().m17606b();
            this.f9341c = c9022hM17606b;
            if (c9022hM17606b.m17626b()) {
                this.f9341c.m17627c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public final C9015a componentManager() {
        if (this.f9342d == null) {
            synchronized (this.f9343e) {
                try {
                    if (this.f9342d == null) {
                        this.f9342d = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f9342d;
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
        if (this.f9344f) {
            return;
        }
        this.f9344f = true;
        ((InterfaceC11522t1) generatedComponent()).mo25383n((HomeActivity) AbstractC9222e.m18141a(this));
    }

    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m7081M();
    }

    @Override // com.friday.common.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9022h c9022h = this.f9341c;
        if (c9022h != null) {
            c9022h.m17625a();
        }
    }
}
