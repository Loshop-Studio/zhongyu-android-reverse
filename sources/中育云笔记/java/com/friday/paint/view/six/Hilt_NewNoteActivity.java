package com.friday.paint.view.six;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import cc.AbstractC5418a;
import com.friday.common.base.BaseActivity;
import p112d4.InterfaceC8929a;
import p120dc.C9015a;
import p120dc.C9022h;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9219b;
import p151fc.InterfaceC9220c;

/* loaded from: classes4.dex */
public abstract class Hilt_NewNoteActivity<Binding extends ViewDataBinding> extends BaseActivity<Binding> implements InterfaceC9220c {
    private volatile C9015a componentManager;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;
    private C9022h savedStateHandleHolder;

    /* renamed from: com.friday.paint.view.six.Hilt_NewNoteActivity$a */
    public class C6278a implements OnContextAvailableListener {
        public C6278a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_NewNoteActivity.this.inject();
        }
    }

    public Hilt_NewNoteActivity() {
        m7536L();
    }

    /* renamed from: L */
    private void m7536L() {
        addOnContextAvailableListener(new C6278a());
    }

    /* renamed from: M */
    private void m7537M() {
        if (getApplication() instanceof InterfaceC9219b) {
            C9022h c9022hM17606b = m33976componentManager().m17606b();
            this.savedStateHandleHolder = c9022hM17606b;
            if (c9022hM17606b.m17626b()) {
                this.savedStateHandleHolder.m17627c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public C9015a createComponentManager() {
        return new C9015a(this);
    }

    @Override // p151fc.InterfaceC9219b
    public final Object generatedComponent() {
        return m33976componentManager().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2891a(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((InterfaceC8929a) generatedComponent()).mo17529c((NewNoteActivity) AbstractC9222e.m18141a(this));
    }

    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m7537M();
    }

    @Override // com.friday.common.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9022h c9022h = this.savedStateHandleHolder;
        if (c9022h != null) {
            c9022h.m17625a();
        }
    }

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final C9015a m33976componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.componentManager;
    }
}
