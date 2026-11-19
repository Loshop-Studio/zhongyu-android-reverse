package p133i6;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import p026b6.AbstractC5208a;
import p037c6.C5271b;
import p037c6.InterfaceC5270a;
import p075d6.InterfaceC8307b;
import p111g6.InterfaceC8652b;
import p122h6.C8720d;
import p155k6.InterfaceC9060b;

/* renamed from: i6.b */
/* loaded from: classes5.dex */
public final class C8760b implements InterfaceC9060b {

    /* renamed from: a */
    public final ViewModelStoreOwner f16426a;

    /* renamed from: b */
    public final Context f16427b;

    /* renamed from: c */
    public volatile InterfaceC8307b f16428c;

    /* renamed from: d */
    public final Object f16429d = new Object();

    /* renamed from: i6.b$a */
    public class a implements ViewModelProvider.Factory {

        /* renamed from: a */
        public final /* synthetic */ Context f16430a;

        public a(Context context) {
            this.f16430a = context;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls, CreationExtras creationExtras) {
            C8765g c8765g = new C8765g(creationExtras);
            return new c(((b) C5271b.m2181a(this.f16430a, b.class)).mo9878c().mo9811a(c8765g).build(), c8765g);
        }
    }

    /* renamed from: i6.b$b */
    public interface b {
        /* renamed from: c */
        InterfaceC8652b mo9878c();
    }

    /* renamed from: i6.b$c */
    public static final class c extends ViewModel {

        /* renamed from: a */
        public final InterfaceC8307b f16432a;

        /* renamed from: b */
        public final C8765g f16433b;

        public c(InterfaceC8307b interfaceC8307b, C8765g c8765g) {
            this.f16432a = interfaceC8307b;
            this.f16433b = c8765g;
        }

        /* renamed from: a */
        public InterfaceC8307b m14465a() {
            return this.f16432a;
        }

        /* renamed from: b */
        public C8765g m14466b() {
            return this.f16433b;
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            super.onCleared();
            ((C8720d) ((d) AbstractC5208a.m2103a(this.f16432a, d.class)).mo9815b()).m14227a();
        }
    }

    /* renamed from: i6.b$d */
    public interface d {
        /* renamed from: b */
        InterfaceC5270a mo9815b();
    }

    /* renamed from: i6.b$e */
    public static abstract class e {
        /* renamed from: a */
        public static InterfaceC5270a m14467a() {
            return new C8720d();
        }
    }

    public C8760b(ComponentActivity componentActivity) {
        this.f16426a = componentActivity;
        this.f16427b = componentActivity;
    }

    /* renamed from: a */
    public final InterfaceC8307b m14461a() {
        return ((c) m14464d(this.f16426a, this.f16427b).get(c.class)).m14465a();
    }

    @Override // p155k6.InterfaceC9060b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC8307b generatedComponent() {
        if (this.f16428c == null) {
            synchronized (this.f16429d) {
                try {
                    if (this.f16428c == null) {
                        this.f16428c = m14461a();
                    }
                } finally {
                }
            }
        }
        return this.f16428c;
    }

    /* renamed from: c */
    public C8765g m14463c() {
        return ((c) m14464d(this.f16426a, this.f16427b).get(c.class)).m14466b();
    }

    /* renamed from: d */
    public final ViewModelProvider m14464d(ViewModelStoreOwner viewModelStoreOwner, Context context) {
        return new ViewModelProvider(viewModelStoreOwner, new a(context));
    }
}
