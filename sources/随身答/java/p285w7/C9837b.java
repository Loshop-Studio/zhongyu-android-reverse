package p285w7;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import p215p7.AbstractC9337a;
import p225q7.C9376b;
import p225q7.InterfaceC9375a;
import p235r7.InterfaceC9436b;
import p265u7.InterfaceC9722b;
import p275v7.C9772d;
import p305y7.InterfaceC9966b;

/* renamed from: w7.b */
/* loaded from: classes5.dex */
public final class C9837b implements InterfaceC9966b {

    /* renamed from: a */
    public final ViewModelStoreOwner f17553a;

    /* renamed from: b */
    public final Context f17554b;

    /* renamed from: c */
    public volatile InterfaceC9436b f17555c;

    /* renamed from: d */
    public final Object f17556d = new Object();

    /* renamed from: w7.b$a */
    public class a implements ViewModelProvider.Factory {

        /* renamed from: a */
        public final /* synthetic */ Context f17557a;

        public a(Context context) {
            this.f17557a = context;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls, CreationExtras creationExtras) {
            C9842g c9842g = new C9842g(creationExtras);
            return new c(((b) C9376b.m15358a(this.f17557a, b.class)).mo12851c().mo12818a(c9842g).build(), c9842g);
        }
    }

    /* renamed from: w7.b$b */
    public interface b {
        /* renamed from: c */
        InterfaceC9722b mo12851c();
    }

    /* renamed from: w7.b$c */
    public static final class c extends ViewModel {

        /* renamed from: a */
        public final InterfaceC9436b f17559a;

        /* renamed from: b */
        public final C9842g f17560b;

        public c(InterfaceC9436b interfaceC9436b, C9842g c9842g) {
            this.f17559a = interfaceC9436b;
            this.f17560b = c9842g;
        }

        /* renamed from: a */
        public InterfaceC9436b m16768a() {
            return this.f17559a;
        }

        /* renamed from: b */
        public C9842g m16769b() {
            return this.f17560b;
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            super.onCleared();
            ((C9772d) ((d) AbstractC9337a.m15247a(this.f17559a, d.class)).mo12822b()).m16556a();
        }
    }

    /* renamed from: w7.b$d */
    public interface d {
        /* renamed from: b */
        InterfaceC9375a mo12822b();
    }

    /* renamed from: w7.b$e */
    public static abstract class e {
        /* renamed from: a */
        public static InterfaceC9375a m16770a() {
            return new C9772d();
        }
    }

    public C9837b(ComponentActivity componentActivity) {
        this.f17553a = componentActivity;
        this.f17554b = componentActivity;
    }

    /* renamed from: a */
    public final InterfaceC9436b m16764a() {
        return ((c) m16767d(this.f17553a, this.f17554b).get(c.class)).m16768a();
    }

    @Override // p305y7.InterfaceC9966b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC9436b generatedComponent() {
        if (this.f17555c == null) {
            synchronized (this.f17556d) {
                try {
                    if (this.f17555c == null) {
                        this.f17555c = m16764a();
                    }
                } finally {
                }
            }
        }
        return this.f17555c;
    }

    /* renamed from: c */
    public C9842g m16766c() {
        return ((c) m16767d(this.f17553a, this.f17554b).get(c.class)).m16769b();
    }

    /* renamed from: d */
    public final ViewModelProvider m16767d(ViewModelStoreOwner viewModelStoreOwner, Context context) {
        return new ViewModelProvider(viewModelStoreOwner, new a(context));
    }
}
