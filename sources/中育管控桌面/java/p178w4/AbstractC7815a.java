package p178w4;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import java.util.Map;
import p136q4.AbstractC7625a;
import p171v4.InterfaceC7799e;
import p199z4.AbstractC7950d;

/* renamed from: w4.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7815a {

    /* renamed from: w4.a$a */
    public interface a {
        /* renamed from: a */
        c mo5212a();
    }

    /* renamed from: w4.a$b */
    public interface b {
        /* renamed from: a */
        c mo5231a();
    }

    /* renamed from: w4.a$c */
    public static final class c {

        /* renamed from: a */
        public final Map f10377a;

        /* renamed from: b */
        public final InterfaceC7799e f10378b;

        public c(Map map, InterfaceC7799e interfaceC7799e) {
            this.f10377a = map;
            this.f10378b = interfaceC7799e;
        }

        /* renamed from: a */
        public ViewModelProvider.Factory m9404a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
            return m9406c(factory);
        }

        /* renamed from: b */
        public ViewModelProvider.Factory m9405b(Fragment fragment, ViewModelProvider.Factory factory) {
            return m9406c(factory);
        }

        /* renamed from: c */
        public final ViewModelProvider.Factory m9406c(ViewModelProvider.Factory factory) {
            return new HiltViewModelFactory(this.f10377a, (ViewModelProvider.Factory) AbstractC7950d.m9746b(factory), this.f10378b);
        }
    }

    /* renamed from: a */
    public static ViewModelProvider.Factory m9402a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
        return ((a) AbstractC7625a.m9065a(componentActivity, a.class)).mo5212a().m9404a(componentActivity, factory);
    }

    /* renamed from: b */
    public static ViewModelProvider.Factory m9403b(Fragment fragment, ViewModelProvider.Factory factory) {
        return ((b) AbstractC7625a.m9065a(fragment, b.class)).mo5231a().m9405b(fragment, factory);
    }
}
