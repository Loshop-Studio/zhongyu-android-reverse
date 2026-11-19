package com.zykj.cloudhelper.activity;

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
import qa.InterfaceC10766a;

/* loaded from: classes6.dex */
public abstract class Hilt_NoteManagerActivity<Binding extends ViewDataBinding> extends BaseActivity<Binding> implements InterfaceC9220c {

    /* renamed from: c */
    public C9022h f19451c;

    /* renamed from: d */
    public volatile C9015a f19452d;

    /* renamed from: e */
    public final Object f19453e = new Object();

    /* renamed from: f */
    public boolean f19454f = false;

    /* renamed from: com.zykj.cloudhelper.activity.Hilt_NoteManagerActivity$a */
    public class C8546a implements OnContextAvailableListener {
        public C8546a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_NoteManagerActivity.this.inject();
        }
    }

    public Hilt_NoteManagerActivity() {
        m16422L();
    }

    /* renamed from: L */
    private void m16422L() {
        addOnContextAvailableListener(new C8546a());
    }

    /* renamed from: M */
    private void m16423M() {
        if (getApplication() instanceof InterfaceC9219b) {
            C9022h c9022hM17606b = componentManager().m17606b();
            this.f19451c = c9022hM17606b;
            if (c9022hM17606b.m17626b()) {
                this.f19451c.m17627c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public final C9015a componentManager() {
        if (this.f19452d == null) {
            synchronized (this.f19453e) {
                try {
                    if (this.f19452d == null) {
                        this.f19452d = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f19452d;
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
        if (this.f19454f) {
            return;
        }
        this.f19454f = true;
        ((InterfaceC10766a) generatedComponent()).mo22939g((NoteManagerActivity) AbstractC9222e.m18141a(this));
    }

    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m16423M();
    }

    @Override // com.friday.common.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9022h c9022h = this.f19451c;
        if (c9022h != null) {
            c9022h.m17625a();
        }
    }
}
