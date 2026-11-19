package p382w1;

import android.app.Application;
import com.friday.cloudsnote.App;
import ec.C9116a;
import p120dc.C9018d;
import p120dc.InterfaceC9020f;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9220c;

/* renamed from: w1.i */
/* loaded from: classes3.dex */
public abstract class AbstractApplicationC11668i extends Application implements InterfaceC9220c {
    private boolean injected = false;
    private final C9018d componentManager = new C9018d(new a());

    /* renamed from: w1.i$a */
    public class a implements InterfaceC9020f {
        public a() {
        }

        @Override // p120dc.InterfaceC9020f
        public Object get() {
            return AbstractC11666g.m25801a().m25817a(new C9116a(AbstractApplicationC11668i.this)).m25818b();
        }
    }

    @Override // p151fc.InterfaceC9219b
    public final Object generatedComponent() {
        return m34188componentManager().generatedComponent();
    }

    public void hiltInternalInject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((InterfaceC11660a) generatedComponent()).mo25800c((App) AbstractC9222e.m18141a(this));
    }

    @Override // android.app.Application
    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final C9018d m34188componentManager() {
        return this.componentManager;
    }
}
