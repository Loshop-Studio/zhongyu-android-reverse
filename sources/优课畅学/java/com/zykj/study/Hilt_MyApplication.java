package com.zykj.study;

import android.app.Application;
import androidx.annotation.CallSuper;
import p133i6.C8762d;
import p133i6.InterfaceC8763e;
import p144j6.C9022a;
import p155k6.AbstractC9062d;
import p155k6.InterfaceC9060b;
import p176m4.InterfaceC9302c;

/* loaded from: classes4.dex */
public abstract class Hilt_MyApplication extends Application implements InterfaceC9060b {
    private boolean injected = false;
    private final C8762d componentManager = new C8762d(new C7596a());

    /* renamed from: com.zykj.study.Hilt_MyApplication$a */
    public class C7596a implements InterfaceC8763e {
        public C7596a() {
        }

        @Override // p133i6.InterfaceC8763e
        public Object get() {
            return AbstractC7598a.m9801a().m9817a(new C9022a(Hilt_MyApplication.this)).m9818b();
        }
    }

    @Override // p155k6.InterfaceC9060b
    public final Object generatedComponent() {
        return m27614componentManager().generatedComponent();
    }

    public void hiltInternalInject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((InterfaceC9302c) generatedComponent()).mo9877b((MyApplication) AbstractC9062d.m15864a(this));
    }

    @Override // android.app.Application
    @CallSuper
    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final C8762d m27614componentManager() {
        return this.componentManager;
    }
}
