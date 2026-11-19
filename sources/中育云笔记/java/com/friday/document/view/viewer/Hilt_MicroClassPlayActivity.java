package com.friday.document.view.viewer;

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
import p415y2.InterfaceC11898i;

/* loaded from: classes3.dex */
public abstract class Hilt_MicroClassPlayActivity<Binding extends ViewDataBinding> extends BaseActivity<Binding> implements InterfaceC9220c {

    /* renamed from: c */
    public C9022h f7719c;

    /* renamed from: d */
    public volatile C9015a f7720d;

    /* renamed from: e */
    public final Object f7721e = new Object();

    /* renamed from: f */
    public boolean f7722f = false;

    /* renamed from: com.friday.document.view.viewer.Hilt_MicroClassPlayActivity$a */
    public class C6091a implements OnContextAvailableListener {
        public C6091a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_MicroClassPlayActivity.this.inject();
        }
    }

    public Hilt_MicroClassPlayActivity() {
        m6141L();
    }

    /* renamed from: L */
    private void m6141L() {
        addOnContextAvailableListener(new C6091a());
    }

    /* renamed from: M */
    private void m6142M() {
        if (getApplication() instanceof InterfaceC9219b) {
            C9022h c9022hM17606b = componentManager().m17606b();
            this.f7719c = c9022hM17606b;
            if (c9022hM17606b.m17626b()) {
                this.f7719c.m17627c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public final C9015a componentManager() {
        if (this.f7720d == null) {
            synchronized (this.f7721e) {
                try {
                    if (this.f7720d == null) {
                        this.f7720d = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f7720d;
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
        if (this.f7722f) {
            return;
        }
        this.f7722f = true;
        ((InterfaceC11898i) generatedComponent()).mo25807j((MicroClassPlayActivity) AbstractC9222e.m18141a(this));
    }

    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m6142M();
    }

    @Override // com.friday.common.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9022h c9022h = this.f7719c;
        if (c9022h != null) {
            c9022h.m17625a();
        }
    }
}
