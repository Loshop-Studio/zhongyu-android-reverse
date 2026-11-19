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
import p371v3.InterfaceC11515r0;

/* loaded from: classes4.dex */
public abstract class Hilt_FolderMoveActivity<Binding extends ViewDataBinding> extends BaseActivity<Binding> implements InterfaceC9220c {

    /* renamed from: c */
    public C9022h f9331c;

    /* renamed from: d */
    public volatile C9015a f9332d;

    /* renamed from: e */
    public final Object f9333e = new Object();

    /* renamed from: f */
    public boolean f9334f = false;

    /* renamed from: com.friday.main.view.Hilt_FolderMoveActivity$a */
    public class C6206a implements OnContextAvailableListener {
        public C6206a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_FolderMoveActivity.this.inject();
        }
    }

    public Hilt_FolderMoveActivity() {
        m7076L();
    }

    /* renamed from: L */
    private void m7076L() {
        addOnContextAvailableListener(new C6206a());
    }

    /* renamed from: M */
    private void m7077M() {
        if (getApplication() instanceof InterfaceC9219b) {
            C9022h c9022hM17606b = componentManager().m17606b();
            this.f9331c = c9022hM17606b;
            if (c9022hM17606b.m17626b()) {
                this.f9331c.m17627c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public final C9015a componentManager() {
        if (this.f9332d == null) {
            synchronized (this.f9333e) {
                try {
                    if (this.f9332d == null) {
                        this.f9332d = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f9332d;
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
        if (this.f9334f) {
            return;
        }
        this.f9334f = true;
        ((InterfaceC11515r0) generatedComponent()).mo25382r((FolderMoveActivity) AbstractC9222e.m18141a(this));
    }

    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m7077M();
    }

    @Override // com.friday.common.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9022h c9022h = this.f9331c;
        if (c9022h != null) {
            c9022h.m17625a();
        }
    }
}
