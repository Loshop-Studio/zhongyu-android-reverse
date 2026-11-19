package p275v7;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import java.util.Map;
import p215p7.AbstractC9337a;
import p265u7.InterfaceC9724d;
import p305y7.AbstractC9967c;

/* renamed from: v7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9769a {

    /* renamed from: v7.a$a */
    public interface a {
        /* renamed from: a */
        c mo12815a();
    }

    /* renamed from: v7.a$b */
    public interface b {
        /* renamed from: a */
        c mo12829a();
    }

    /* renamed from: v7.a$c */
    public static final class c {

        /* renamed from: a */
        public final Map f17379a;

        /* renamed from: b */
        public final InterfaceC9724d f17380b;

        public c(Map map, InterfaceC9724d interfaceC9724d) {
            this.f17379a = map;
            this.f17380b = interfaceC9724d;
        }

        /* renamed from: a */
        public ViewModelProvider.Factory m16552a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
            return m16554c(factory);
        }

        /* renamed from: b */
        public ViewModelProvider.Factory m16553b(Fragment fragment, ViewModelProvider.Factory factory) {
            return m16554c(factory);
        }

        /* renamed from: c */
        public final ViewModelProvider.Factory m16554c(ViewModelProvider.Factory factory) {
            return new HiltViewModelFactory(this.f17379a, (ViewModelProvider.Factory) AbstractC9967c.m17237a(factory), this.f17380b);
        }
    }

    /* renamed from: a */
    public static ViewModelProvider.Factory m16550a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
        return ((a) AbstractC9337a.m15247a(componentActivity, a.class)).mo12815a().m16552a(componentActivity, factory);
    }

    /* renamed from: b */
    public static ViewModelProvider.Factory m16551b(Fragment fragment, ViewModelProvider.Factory factory) {
        return ((b) AbstractC9337a.m15247a(fragment, b.class)).mo12829a().m16553b(fragment, factory);
    }
}
