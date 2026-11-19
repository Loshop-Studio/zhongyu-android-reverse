package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.AbstractC2479k;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import p018c2.AbstractC2756a;
import p049d2.C3705b;
import p049d2.InterfaceC3704a;
import p054e2.InterfaceC3726b;
import p064g2.InterfaceC3755b;
import p069h2.C3769d;
import p079j2.InterfaceC3802b;

/* renamed from: dagger.hilt.android.internal.managers.b */
/* loaded from: classes2.dex */
public final class C3716b implements InterfaceC3802b {

    /* renamed from: a */
    public final ViewModelProvider f4344a;

    /* renamed from: b */
    public volatile InterfaceC3726b f4345b;

    /* renamed from: c */
    public final Object f4346c = new Object();

    /* renamed from: dagger.hilt.android.internal.managers.b$a */
    public class a implements ViewModelProvider.Factory {

        /* renamed from: a */
        public final /* synthetic */ Context f4347a;

        public a(Context context) {
            this.f4347a = context;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return AbstractC2479k.m1442b(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls) {
            return new c(((b) C3705b.m4696a(this.f4347a, b.class)).mo4714a().build());
        }
    }

    /* renamed from: dagger.hilt.android.internal.managers.b$b */
    public interface b {
        /* renamed from: a */
        InterfaceC3755b mo4714a();
    }

    /* renamed from: dagger.hilt.android.internal.managers.b$c */
    public static final class c extends ViewModel {

        /* renamed from: a */
        public final InterfaceC3726b f4349a;

        public c(InterfaceC3726b interfaceC3726b) {
            this.f4349a = interfaceC3726b;
        }

        /* renamed from: a */
        public InterfaceC3726b m4715a() {
            return this.f4349a;
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            super.onCleared();
            ((C3769d) ((d) AbstractC2756a.m1625a(this.f4349a, d.class)).mo4716a()).m4871a();
        }
    }

    /* renamed from: dagger.hilt.android.internal.managers.b$d */
    public interface d {
        /* renamed from: a */
        InterfaceC3704a mo4716a();
    }

    /* renamed from: dagger.hilt.android.internal.managers.b$e */
    public static abstract class e {
        /* renamed from: a */
        public static InterfaceC3704a m4717a() {
            return new C3769d();
        }
    }

    public C3716b(ComponentActivity componentActivity) {
        this.f4344a = m4713d(componentActivity, componentActivity);
    }

    /* renamed from: b */
    public final InterfaceC3726b m4711b() {
        return ((c) this.f4344a.get(c.class)).m4715a();
    }

    @Override // p079j2.InterfaceC3802b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC3726b mo4607a() {
        if (this.f4345b == null) {
            synchronized (this.f4346c) {
                if (this.f4345b == null) {
                    this.f4345b = m4711b();
                }
            }
        }
        return this.f4345b;
    }

    /* renamed from: d */
    public final ViewModelProvider m4713d(ViewModelStoreOwner viewModelStoreOwner, Context context) {
        return new ViewModelProvider(viewModelStoreOwner, new a(context));
    }
}
