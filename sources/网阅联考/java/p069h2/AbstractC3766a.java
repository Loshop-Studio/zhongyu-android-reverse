package p069h2;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.savedstate.SavedStateRegistryOwner;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import java.util.Set;
import p018c2.AbstractC2756a;
import p064g2.InterfaceC3756c;
import p079j2.AbstractC3803c;

/* renamed from: h2.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3766a {

    /* renamed from: h2.a$a */
    public interface a {
        /* renamed from: a */
        b mo4867a();
    }

    /* renamed from: h2.a$b */
    public static final class b {

        /* renamed from: a */
        public final Set f4452a;

        /* renamed from: b */
        public final InterfaceC3756c f4453b;

        public b(Set set, InterfaceC3756c interfaceC3756c) {
            this.f4452a = set;
            this.f4453b = interfaceC3756c;
        }

        /* renamed from: a */
        public ViewModelProvider.Factory m4868a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
            return m4869b(componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null, factory);
        }

        /* renamed from: b */
        public final ViewModelProvider.Factory m4869b(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, ViewModelProvider.Factory factory) {
            return new HiltViewModelFactory(savedStateRegistryOwner, bundle, this.f4452a, (ViewModelProvider.Factory) AbstractC3803c.m4963a(factory), this.f4453b);
        }
    }

    /* renamed from: a */
    public static ViewModelProvider.Factory m4866a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
        return ((a) AbstractC2756a.m1625a(componentActivity, a.class)).mo4867a().m4868a(componentActivity, factory);
    }
}
