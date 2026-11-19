package cc;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import java.util.Map;
import p036bc.InterfaceC5187d;
import p151fc.AbstractC9221d;
import p392wb.AbstractC11724a;

/* renamed from: cc.a */
/* loaded from: classes6.dex */
public abstract class AbstractC5418a {

    /* renamed from: cc.a$a */
    public interface a {
        /* renamed from: a */
        c mo2893a();
    }

    /* renamed from: cc.a$b */
    public interface b {
        /* renamed from: a */
        c mo2894a();
    }

    /* renamed from: cc.a$c */
    public static final class c {

        /* renamed from: a */
        public final Map f3501a;

        /* renamed from: b */
        public final InterfaceC5187d f3502b;

        public c(Map map, InterfaceC5187d interfaceC5187d) {
            this.f3501a = map;
            this.f3502b = interfaceC5187d;
        }

        /* renamed from: a */
        public ViewModelProvider.Factory m2895a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
            return m2897c(factory);
        }

        /* renamed from: b */
        public ViewModelProvider.Factory m2896b(Fragment fragment, ViewModelProvider.Factory factory) {
            return m2897c(factory);
        }

        /* renamed from: c */
        public final ViewModelProvider.Factory m2897c(ViewModelProvider.Factory factory) {
            return new HiltViewModelFactory(this.f3501a, (ViewModelProvider.Factory) AbstractC9221d.m18138b(factory), this.f3502b);
        }
    }

    /* renamed from: a */
    public static ViewModelProvider.Factory m2891a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
        return ((a) AbstractC11724a.m25951a(componentActivity, a.class)).mo2893a().m2895a(componentActivity, factory);
    }

    /* renamed from: b */
    public static ViewModelProvider.Factory m2892b(Fragment fragment, ViewModelProvider.Factory factory) {
        return ((b) AbstractC11724a.m25951a(fragment, b.class)).mo2894a().m2896b(fragment, factory);
    }
}
