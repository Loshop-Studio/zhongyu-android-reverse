package p146k8;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import java.util.Map;
import p080e8.AbstractC7415a;
import p135j8.InterfaceC7818d;
import p181n8.AbstractC8672c;

/* renamed from: k8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC7899a {

    /* renamed from: k8.a$a */
    public interface a {
        /* renamed from: a */
        c mo13472a();
    }

    /* renamed from: k8.a$b */
    public interface b {
        /* renamed from: a */
        c mo13484a();
    }

    /* renamed from: k8.a$c */
    public static final class c {

        /* renamed from: a */
        public final Map f13772a;

        /* renamed from: b */
        public final InterfaceC7818d f13773b;

        public c(Map map, InterfaceC7818d interfaceC7818d) {
            this.f13772a = map;
            this.f13773b = interfaceC7818d;
        }

        /* renamed from: a */
        public ViewModelProvider.Factory m13519a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
            return m13521c(factory);
        }

        /* renamed from: b */
        public ViewModelProvider.Factory m13520b(Fragment fragment, ViewModelProvider.Factory factory) {
            return m13521c(factory);
        }

        /* renamed from: c */
        public final ViewModelProvider.Factory m13521c(ViewModelProvider.Factory factory) {
            return new HiltViewModelFactory(this.f13772a, (ViewModelProvider.Factory) AbstractC8672c.m14275a(factory), this.f13773b);
        }
    }

    /* renamed from: a */
    public static ViewModelProvider.Factory m13517a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
        return ((a) AbstractC7415a.m11910a(componentActivity, a.class)).mo13472a().m13519a(componentActivity, factory);
    }

    /* renamed from: b */
    public static ViewModelProvider.Factory m13518b(Fragment fragment, ViewModelProvider.Factory factory) {
        return ((b) AbstractC7415a.m11910a(fragment, b.class)).mo13484a().m13520b(fragment, factory);
    }
}
