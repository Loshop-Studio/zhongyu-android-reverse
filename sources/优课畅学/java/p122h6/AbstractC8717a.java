package p122h6;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import java.util.Map;
import p026b6.AbstractC5208a;
import p111g6.InterfaceC8654d;
import p155k6.AbstractC9061c;

/* renamed from: h6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8717a {

    /* renamed from: h6.a$a */
    public interface a {
        /* renamed from: a */
        c mo9805a();
    }

    /* renamed from: h6.a$b */
    public interface b {
        /* renamed from: a */
        c mo9841a();
    }

    /* renamed from: h6.a$c */
    public static final class c {

        /* renamed from: a */
        public final Map f16342a;

        /* renamed from: b */
        public final InterfaceC8654d f16343b;

        public c(Map map, InterfaceC8654d interfaceC8654d) {
            this.f16342a = map;
            this.f16343b = interfaceC8654d;
        }

        /* renamed from: a */
        public ViewModelProvider.Factory m14223a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
            return m14225c(factory);
        }

        /* renamed from: b */
        public ViewModelProvider.Factory m14224b(Fragment fragment, ViewModelProvider.Factory factory) {
            return m14225c(factory);
        }

        /* renamed from: c */
        public final ViewModelProvider.Factory m14225c(ViewModelProvider.Factory factory) {
            return new HiltViewModelFactory(this.f16342a, (ViewModelProvider.Factory) AbstractC9061c.m15861a(factory), this.f16343b);
        }
    }

    /* renamed from: a */
    public static ViewModelProvider.Factory m14221a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
        return ((a) AbstractC5208a.m2103a(componentActivity, a.class)).mo9805a().m14223a(componentActivity, factory);
    }

    /* renamed from: b */
    public static ViewModelProvider.Factory m14222b(Fragment fragment, ViewModelProvider.Factory factory) {
        return ((b) AbstractC5208a.m2103a(fragment, b.class)).mo9841a().m14224b(fragment, factory);
    }
}
