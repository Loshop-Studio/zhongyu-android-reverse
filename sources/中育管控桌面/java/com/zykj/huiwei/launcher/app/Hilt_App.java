package com.zykj.huiwei.launcher.app;

import androidx.annotation.CallSuper;
import com.zykj.base.BaseApplication;
import p142r3.InterfaceC7640b;
import p185x4.C7859d;
import p185x4.InterfaceC7861f;
import p192y4.C7912a;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_App extends BaseApplication implements InterfaceC7949c {
    private boolean injected = false;
    private final C7859d componentManager = new C7859d(new C6044a());

    /* renamed from: com.zykj.huiwei.launcher.app.Hilt_App$a */
    public class C6044a implements InterfaceC7861f {
        public C6044a() {
        }

        @Override // p185x4.InterfaceC7861f
        public Object get() {
            return AbstractC6045a.m5208a().m5226a(new C7912a(Hilt_App.this)).m5227b();
        }
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m17178componentManager().generatedComponent();
    }

    public void hiltInternalInject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((InterfaceC7640b) generatedComponent()).mo5254c((App) AbstractC7951e.m9749a(this));
    }

    @Override // com.zykj.base.BaseApplication, android.app.Application
    @CallSuper
    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final C7859d m17178componentManager() {
        return this.componentManager;
    }
}
