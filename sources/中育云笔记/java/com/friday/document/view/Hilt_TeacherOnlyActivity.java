package com.friday.document.view;

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
import p355u2.InterfaceC11352o0;

/* loaded from: classes3.dex */
public abstract class Hilt_TeacherOnlyActivity<Binding extends ViewDataBinding> extends BaseActivity<Binding> implements InterfaceC9220c {

    /* renamed from: c */
    public C9022h f7157c;

    /* renamed from: d */
    public volatile C9015a f7158d;

    /* renamed from: e */
    public final Object f7159e = new Object();

    /* renamed from: f */
    public boolean f7160f = false;

    /* renamed from: com.friday.document.view.Hilt_TeacherOnlyActivity$a */
    public class C6007a implements OnContextAvailableListener {
        public C6007a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_TeacherOnlyActivity.this.inject();
        }
    }

    public Hilt_TeacherOnlyActivity() {
        m5699L();
    }

    /* renamed from: L */
    private void m5699L() {
        addOnContextAvailableListener(new C6007a());
    }

    /* renamed from: M */
    private void m5700M() {
        if (getApplication() instanceof InterfaceC9219b) {
            C9022h c9022hM17606b = componentManager().m17606b();
            this.f7157c = c9022hM17606b;
            if (c9022hM17606b.m17626b()) {
                this.f7157c.m17627c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public final C9015a componentManager() {
        if (this.f7158d == null) {
            synchronized (this.f7159e) {
                try {
                    if (this.f7158d == null) {
                        this.f7158d = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f7158d;
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
        if (this.f7160f) {
            return;
        }
        this.f7160f = true;
        ((InterfaceC11352o0) generatedComponent()).mo25276o((TeacherOnlyActivity) AbstractC9222e.m18141a(this));
    }

    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m5700M();
    }

    @Override // com.friday.common.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9022h c9022h = this.f7157c;
        if (c9022h != null) {
            c9022h.m17625a();
        }
    }
}
