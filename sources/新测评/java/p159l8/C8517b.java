package p159l8;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import p080e8.AbstractC7415a;
import p091f8.C7495b;
import p091f8.InterfaceC7494a;
import p102g8.InterfaceC7597b;
import p135j8.InterfaceC7816b;
import p146k8.C7902d;
import p181n8.InterfaceC8671b;

/* renamed from: l8.b */
/* loaded from: classes5.dex */
public final class C8517b implements InterfaceC8671b {

    /* renamed from: a */
    public final ViewModelStoreOwner f14133a;

    /* renamed from: b */
    public final Context f14134b;

    /* renamed from: c */
    public volatile InterfaceC7597b f14135c;

    /* renamed from: d */
    public final Object f14136d = new Object();

    /* renamed from: l8.b$a */
    public class a implements ViewModelProvider.Factory {

        /* renamed from: a */
        public final /* synthetic */ Context f14137a;

        public a(Context context) {
            this.f14137a = context;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls, CreationExtras creationExtras) {
            C8522g c8522g = new C8522g(creationExtras);
            return new c(((b) C7495b.m12126a(this.f14137a, b.class)).mo13489c().mo13241a(c8522g).build(), c8522g);
        }
    }

    /* renamed from: l8.b$b */
    public interface b {
        /* renamed from: c */
        InterfaceC7816b mo13489c();
    }

    /* renamed from: l8.b$c */
    public static final class c extends ViewModel {

        /* renamed from: a */
        public final InterfaceC7597b f14139a;

        /* renamed from: b */
        public final C8522g f14140b;

        public c(InterfaceC7597b interfaceC7597b, C8522g c8522g) {
            this.f14139a = interfaceC7597b;
            this.f14140b = c8522g;
        }

        /* renamed from: a */
        public InterfaceC7597b m14001a() {
            return this.f14139a;
        }

        /* renamed from: b */
        public C8522g m14002b() {
            return this.f14140b;
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            super.onCleared();
            ((C7902d) ((d) AbstractC7415a.m11910a(this.f14139a, d.class)).mo13478b()).m13523a();
        }
    }

    /* renamed from: l8.b$d */
    public interface d {
        /* renamed from: b */
        InterfaceC7494a mo13478b();
    }

    /* renamed from: l8.b$e */
    public static abstract class e {
        /* renamed from: a */
        public static InterfaceC7494a m14003a() {
            return new C7902d();
        }
    }

    public C8517b(ComponentActivity componentActivity) {
        this.f14133a = componentActivity;
        this.f14134b = componentActivity;
    }

    /* renamed from: a */
    public final InterfaceC7597b m13997a() {
        return ((c) m14000d(this.f14133a, this.f14134b).get(c.class)).m14001a();
    }

    @Override // p181n8.InterfaceC8671b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC7597b generatedComponent() {
        if (this.f14135c == null) {
            synchronized (this.f14136d) {
                try {
                    if (this.f14135c == null) {
                        this.f14135c = m13997a();
                    }
                } finally {
                }
            }
        }
        return this.f14135c;
    }

    /* renamed from: c */
    public C8522g m13999c() {
        return ((c) m14000d(this.f14133a, this.f14134b).get(c.class)).m14002b();
    }

    /* renamed from: d */
    public final ViewModelProvider m14000d(ViewModelStoreOwner viewModelStoreOwner, Context context) {
        return new ViewModelProvider(viewModelStoreOwner, new a(context));
    }
}
