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
import p415y2.InterfaceC11909t;

/* loaded from: classes3.dex */
public abstract class Hilt_VideoPlayerActivity<Binding extends ViewDataBinding> extends BaseActivity<Binding> implements InterfaceC9220c {

    /* renamed from: c */
    public C9022h f7734c;

    /* renamed from: d */
    public volatile C9015a f7735d;

    /* renamed from: e */
    public final Object f7736e = new Object();

    /* renamed from: f */
    public boolean f7737f = false;

    /* renamed from: com.friday.document.view.viewer.Hilt_VideoPlayerActivity$a */
    public class C6094a implements OnContextAvailableListener {
        public C6094a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_VideoPlayerActivity.this.inject();
        }
    }

    public Hilt_VideoPlayerActivity() {
        m6147L();
    }

    /* renamed from: L */
    private void m6147L() {
        addOnContextAvailableListener(new C6094a());
    }

    /* renamed from: M */
    private void m6148M() {
        if (getApplication() instanceof InterfaceC9219b) {
            C9022h c9022hM17606b = componentManager().m17606b();
            this.f7734c = c9022hM17606b;
            if (c9022hM17606b.m17626b()) {
                this.f7734c.m17627c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public final C9015a componentManager() {
        if (this.f7735d == null) {
            synchronized (this.f7736e) {
                try {
                    if (this.f7735d == null) {
                        this.f7735d = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f7735d;
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
        if (this.f7737f) {
            return;
        }
        this.f7737f = true;
        ((InterfaceC11909t) generatedComponent()).mo25804b((VideoPlayerActivity) AbstractC9222e.m18141a(this));
    }

    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m6148M();
    }

    @Override // com.friday.common.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9022h c9022h = this.f7734c;
        if (c9022h != null) {
            c9022h.m17625a();
        }
    }
}
