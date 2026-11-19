package p120dc;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import cc.C5421d;
import p036bc.InterfaceC5185b;
import p151fc.InterfaceC9219b;
import p392wb.AbstractC11724a;
import p408xb.C11824b;
import p408xb.InterfaceC11823a;
import p424yb.InterfaceC11940b;

/* renamed from: dc.b */
/* loaded from: classes6.dex */
public final class C9016b implements InterfaceC9219b {

    /* renamed from: c */
    public final ViewModelStoreOwner f20995c;

    /* renamed from: d */
    public final Context f20996d;

    /* renamed from: e */
    public volatile InterfaceC11940b f20997e;

    /* renamed from: f */
    public final Object f20998f = new Object();

    /* renamed from: dc.b$a */
    public class a implements ViewModelProvider.Factory {

        /* renamed from: a */
        public final /* synthetic */ Context f20999a;

        public a(Context context) {
            this.f20999a = context;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls, CreationExtras creationExtras) {
            C9022h c9022h = new C9022h(creationExtras);
            return new c(((b) C11824b.m26205a(this.f20999a, b.class)).mo17612d().mo2735a(c9022h).build(), c9022h);
        }
    }

    /* renamed from: dc.b$b */
    public interface b {
        /* renamed from: d */
        InterfaceC5185b mo17612d();
    }

    /* renamed from: dc.b$c */
    public static final class c extends ViewModel {

        /* renamed from: a */
        public final InterfaceC11940b f21001a;

        /* renamed from: b */
        public final C9022h f21002b;

        public c(InterfaceC11940b interfaceC11940b, C9022h c9022h) {
            this.f21001a = interfaceC11940b;
            this.f21002b = c9022h;
        }

        /* renamed from: a */
        public InterfaceC11940b m17613a() {
            return this.f21001a;
        }

        /* renamed from: b */
        public C9022h m17614b() {
            return this.f21002b;
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            super.onCleared();
            ((C5421d) ((d) AbstractC11724a.m25951a(this.f21001a, d.class)).mo17615b()).m2899a();
        }
    }

    /* renamed from: dc.b$d */
    public interface d {
        /* renamed from: b */
        InterfaceC11823a mo17615b();
    }

    /* renamed from: dc.b$e */
    public static abstract class e {
        /* renamed from: a */
        public static InterfaceC11823a m17616a() {
            return new C5421d();
        }
    }

    public C9016b(ComponentActivity componentActivity) {
        this.f20995c = componentActivity;
        this.f20996d = componentActivity;
    }

    /* renamed from: a */
    public final InterfaceC11940b m17608a() {
        return ((c) m17611d(this.f20995c, this.f20996d).get(c.class)).m17613a();
    }

    @Override // p151fc.InterfaceC9219b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC11940b generatedComponent() {
        if (this.f20997e == null) {
            synchronized (this.f20998f) {
                try {
                    if (this.f20997e == null) {
                        this.f20997e = m17608a();
                    }
                } finally {
                }
            }
        }
        return this.f20997e;
    }

    /* renamed from: c */
    public C9022h m17610c() {
        return ((c) m17611d(this.f20995c, this.f20996d).get(c.class)).m17614b();
    }

    /* renamed from: d */
    public final ViewModelProvider m17611d(ViewModelStoreOwner viewModelStoreOwner, Context context) {
        return new ViewModelProvider(viewModelStoreOwner, new a(context));
    }
}
