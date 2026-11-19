package com.friday.cloudsnote.view;

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
import p398x1.InterfaceC11759a;

/* loaded from: classes3.dex */
public abstract class Hilt_MainActivity<Binding extends ViewDataBinding> extends BaseActivity<Binding> implements InterfaceC9220c {

    /* renamed from: c */
    public C9022h f5496c;

    /* renamed from: d */
    public volatile C9015a f5497d;

    /* renamed from: e */
    public final Object f5498e = new Object();

    /* renamed from: f */
    public boolean f5499f = false;

    /* renamed from: com.friday.cloudsnote.view.Hilt_MainActivity$a */
    public class C5915a implements OnContextAvailableListener {
        public C5915a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_MainActivity.this.inject();
        }
    }

    public Hilt_MainActivity() {
        m4724L();
    }

    /* renamed from: L */
    public final void m4724L() {
        addOnContextAvailableListener(new C5915a());
    }

    /* renamed from: M */
    public final void m4725M() {
        if (getApplication() instanceof InterfaceC9219b) {
            C9022h c9022hM17606b = componentManager().m17606b();
            this.f5496c = c9022hM17606b;
            if (c9022hM17606b.m17626b()) {
                this.f5496c.m17627c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public final C9015a componentManager() {
        if (this.f5497d == null) {
            synchronized (this.f5498e) {
                try {
                    if (this.f5497d == null) {
                        this.f5497d = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f5497d;
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
        if (this.f5499f) {
            return;
        }
        this.f5499f = true;
        ((InterfaceC11759a) generatedComponent()).mo25808k((MainActivity) AbstractC9222e.m18141a(this));
    }

    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m4725M();
    }

    @Override // com.friday.common.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9022h c9022h = this.f5496c;
        if (c9022h != null) {
            c9022h.m17625a();
        }
    }
}
