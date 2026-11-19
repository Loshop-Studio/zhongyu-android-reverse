package p184x3;

import com.zykj.huiwei.launcher.server.MyService;
import p108m4.AbstractServiceC7404c;
import p185x4.C7864i;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7949c;

/* renamed from: x3.a */
/* loaded from: classes4.dex */
public abstract class AbstractServiceC7833a extends AbstractServiceC7404c implements InterfaceC7949c {

    /* renamed from: b */
    public volatile C7864i f10439b;

    /* renamed from: c */
    public final Object f10440c = new Object();

    /* renamed from: d */
    public boolean f10441d = false;

    /* renamed from: f */
    public final C7864i m9509f() {
        if (this.f10439b == null) {
            synchronized (this.f10440c) {
                try {
                    if (this.f10439b == null) {
                        this.f10439b = m9510g();
                    }
                } finally {
                }
            }
        }
        return this.f10439b;
    }

    /* renamed from: g */
    public C7864i m9510g() {
        return new C7864i(this);
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m9509f().generatedComponent();
    }

    /* renamed from: h */
    public void m9511h() {
        if (this.f10441d) {
            return;
        }
        this.f10441d = true;
        ((InterfaceC7852t) generatedComponent()).mo5246a((MyService) AbstractC7951e.m9749a(this));
    }

    @Override // p108m4.AbstractServiceC7404c, android.app.Service
    public void onCreate() {
        m9511h();
        super.onCreate();
    }
}
