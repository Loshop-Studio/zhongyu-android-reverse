package com.friday.common.camera;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import cc.AbstractC5418a;
import com.friday.common.base.BaseActivity;
import p028b2.InterfaceC5145b;
import p120dc.C9015a;
import p120dc.C9022h;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9219b;
import p151fc.InterfaceC9220c;

/* loaded from: classes3.dex */
public abstract class Hilt_CameraActivity<Binding extends ViewDataBinding> extends BaseActivity<Binding> implements InterfaceC9220c {

    /* renamed from: c */
    public C9022h f5663c;

    /* renamed from: d */
    public volatile C9015a f5664d;

    /* renamed from: e */
    public final Object f5665e = new Object();

    /* renamed from: f */
    public boolean f5666f = false;

    /* renamed from: com.friday.common.camera.Hilt_CameraActivity$a */
    public class C5933a implements OnContextAvailableListener {
        public C5933a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_CameraActivity.this.inject();
        }
    }

    public Hilt_CameraActivity() {
        m4831L();
    }

    /* renamed from: L */
    private void m4831L() {
        addOnContextAvailableListener(new C5933a());
    }

    /* renamed from: M */
    private void m4832M() {
        if (getApplication() instanceof InterfaceC9219b) {
            C9022h c9022hM17606b = componentManager().m17606b();
            this.f5663c = c9022hM17606b;
            if (c9022hM17606b.m17626b()) {
                this.f5663c.m17627c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public final C9015a componentManager() {
        if (this.f5664d == null) {
            synchronized (this.f5665e) {
                try {
                    if (this.f5664d == null) {
                        this.f5664d = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f5664d;
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
        if (this.f5666f) {
            return;
        }
        this.f5666f = true;
        ((InterfaceC5145b) generatedComponent()).mo2664q((CameraActivity) AbstractC9222e.m18141a(this));
    }

    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m4832M();
    }

    @Override // com.friday.common.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9022h c9022h = this.f5663c;
        if (c9022h != null) {
            c9022h.m17625a();
        }
    }
}
