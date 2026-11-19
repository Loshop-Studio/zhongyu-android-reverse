package p143k5;

import android.app.Application;
import com.zykj.evaluation.App;
import p159l8.C8519d;
import p159l8.InterfaceC8520e;
import p170m8.C8569a;
import p181n8.AbstractC8673d;
import p181n8.InterfaceC8671b;

/* renamed from: k5.j */
/* loaded from: classes4.dex */
public abstract class AbstractApplicationC7890j extends Application implements InterfaceC8671b {
    private boolean injected = false;
    private final C8519d componentManager = new C8519d(new a());

    /* renamed from: k5.j$a */
    public class a implements InterfaceC8520e {
        public a() {
        }

        @Override // p159l8.InterfaceC8520e
        public Object get() {
            return AbstractC7888h.m13469a().m13480a(new C8569a(AbstractApplicationC7890j.this)).m13481b();
        }
    }

    @Override // p181n8.InterfaceC8671b
    public final Object generatedComponent() {
        return m24294componentManager().generatedComponent();
    }

    public void hiltInternalInject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((InterfaceC7881a) generatedComponent()).mo13466a((App) AbstractC8673d.m14278a(this));
    }

    @Override // android.app.Application
    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final C8519d m24294componentManager() {
        return this.componentManager;
    }
}
