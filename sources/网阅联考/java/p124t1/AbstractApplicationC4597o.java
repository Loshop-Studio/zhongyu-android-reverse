package p124t1;

import android.app.Application;
import com.zykj.insight.App;
import dagger.hilt.android.internal.managers.C3718d;
import dagger.hilt.android.internal.managers.InterfaceC3719e;
import p074i2.C3781a;
import p079j2.AbstractC3804d;
import p079j2.InterfaceC3802b;

/* renamed from: t1.o */
/* loaded from: classes2.dex */
public abstract class AbstractApplicationC4597o extends Application implements InterfaceC3802b {

    /* renamed from: a */
    public boolean f5798a = false;

    /* renamed from: b */
    public final C3718d f5799b = new C3718d(new a());

    /* renamed from: t1.o$a */
    public class a implements InterfaceC3719e {
        public a() {
        }

        @Override // dagger.hilt.android.internal.managers.InterfaceC3719e
        public Object get() {
            return AbstractC4589g.m6311a().m6318a(new C3781a(AbstractApplicationC4597o.this)).m6319b();
        }
    }

    @Override // p079j2.InterfaceC3802b
    /* renamed from: a */
    public final Object mo4607a() {
        return m6338b().mo4607a();
    }

    /* renamed from: b */
    public final C3718d m6338b() {
        return this.f5799b;
    }

    /* renamed from: c */
    public void m6339c() {
        if (this.f5798a) {
            return;
        }
        this.f5798a = true;
        ((InterfaceC4583a) mo4607a()).mo6310b((App) AbstractC3804d.m4964a(this));
    }

    @Override // android.app.Application
    public void onCreate() {
        m6339c();
        super.onCreate();
    }
}
