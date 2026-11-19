package p185x4;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import p136q4.AbstractC7625a;
import p143r4.C7649b;
import p143r4.InterfaceC7648a;
import p150s4.InterfaceC7700b;
import p171v4.InterfaceC7796b;
import p178w4.C7818d;
import p199z4.InterfaceC7948b;

/* renamed from: x4.b */
/* loaded from: classes4.dex */
public final class C7857b implements InterfaceC7948b {

    /* renamed from: a */
    public final ViewModelStoreOwner f10463a;

    /* renamed from: b */
    public final Context f10464b;

    /* renamed from: c */
    public volatile InterfaceC7700b f10465c;

    /* renamed from: d */
    public final Object f10466d = new Object();

    /* renamed from: x4.b$a */
    public class a implements ViewModelProvider.Factory {

        /* renamed from: a */
        public final /* synthetic */ Context f10467a;

        public a(Context context) {
            this.f10467a = context;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls, CreationExtras creationExtras) {
            C7863h c7863h = new C7863h(creationExtras);
            return new c(((b) C7649b.m9076a(this.f10467a, b.class)).mo5256e().mo5220a(c7863h).build(), c7863h);
        }
    }

    /* renamed from: x4.b$b */
    public interface b {
        /* renamed from: e */
        InterfaceC7796b mo5256e();
    }

    /* renamed from: x4.b$c */
    public static final class c extends ViewModel {

        /* renamed from: a */
        public final InterfaceC7700b f10469a;

        /* renamed from: b */
        public final C7863h f10470b;

        public c(InterfaceC7700b interfaceC7700b, C7863h c7863h) {
            this.f10469a = interfaceC7700b;
            this.f10470b = c7863h;
        }

        /* renamed from: a */
        public InterfaceC7700b m9531a() {
            return this.f10469a;
        }

        /* renamed from: b */
        public C7863h m9532b() {
            return this.f10470b;
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            super.onCleared();
            ((C7818d) ((d) AbstractC7625a.m9065a(this.f10469a, d.class)).mo5224b()).m9408a();
        }
    }

    /* renamed from: x4.b$d */
    public interface d {
        /* renamed from: b */
        InterfaceC7648a mo5224b();
    }

    /* renamed from: x4.b$e */
    public static abstract class e {
        /* renamed from: a */
        public static InterfaceC7648a m9533a() {
            return new C7818d();
        }
    }

    public C7857b(ComponentActivity componentActivity) {
        this.f10463a = componentActivity;
        this.f10464b = componentActivity;
    }

    /* renamed from: a */
    public final InterfaceC7700b m9527a() {
        return ((c) m9530d(this.f10463a, this.f10464b).get(c.class)).m9531a();
    }

    @Override // p199z4.InterfaceC7948b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC7700b generatedComponent() {
        if (this.f10465c == null) {
            synchronized (this.f10466d) {
                try {
                    if (this.f10465c == null) {
                        this.f10465c = m9527a();
                    }
                } finally {
                }
            }
        }
        return this.f10465c;
    }

    /* renamed from: c */
    public C7863h m9529c() {
        return ((c) m9530d(this.f10463a, this.f10464b).get(c.class)).m9532b();
    }

    /* renamed from: d */
    public final ViewModelProvider m9530d(ViewModelStoreOwner viewModelStoreOwner, Context context) {
        return new ViewModelProvider(viewModelStoreOwner, new a(context));
    }
}
