package p185x4;

import android.app.Application;
import android.app.Service;
import p136q4.AbstractC7625a;
import p171v4.InterfaceC7798d;
import p199z4.AbstractC7950d;
import p199z4.InterfaceC7948b;

/* renamed from: x4.i */
/* loaded from: classes4.dex */
public final class C7864i implements InterfaceC7948b {

    /* renamed from: a */
    public final Service f10480a;

    /* renamed from: b */
    public Object f10481b;

    /* renamed from: x4.i$a */
    public interface a {
        /* renamed from: a */
        InterfaceC7798d mo5252a();
    }

    public C7864i(Service service) {
        this.f10480a = service;
    }

    /* renamed from: a */
    private Object m9544a() {
        Application application = this.f10480a.getApplication();
        AbstractC7950d.m9748d(application instanceof InterfaceC7948b, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((a) AbstractC7625a.m9065a(application, a.class)).mo5252a().mo5243a(this.f10480a).build();
    }

    @Override // p199z4.InterfaceC7948b
    public Object generatedComponent() {
        if (this.f10481b == null) {
            this.f10481b = m9544a();
        }
        return this.f10481b;
    }
}
