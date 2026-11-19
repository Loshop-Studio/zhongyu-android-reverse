package p118g6;

import android.app.Application;
import com.zykj.student.dialogue.App;
import p285w7.C9839d;
import p285w7.InterfaceC9840e;
import p295x7.C9912a;
import p305y7.AbstractC9968d;
import p305y7.InterfaceC9966b;

/* renamed from: g6.j */
/* loaded from: classes5.dex */
public abstract class AbstractApplicationC8066j extends Application implements InterfaceC9966b {
    private boolean injected = false;
    private final C9839d componentManager = new C9839d(new a());

    /* renamed from: g6.j$a */
    public class a implements InterfaceC9840e {
        public a() {
        }

        @Override // p285w7.InterfaceC9840e
        public Object get() {
            return AbstractC8064h.m12811a().m12824a(new C9912a(AbstractApplicationC8066j.this)).m12825b();
        }
    }

    @Override // p305y7.InterfaceC9966b
    public final Object generatedComponent() {
        return m24753componentManager().generatedComponent();
    }

    public void hiltInternalInject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((InterfaceC8057a) generatedComponent()).mo12808b((App) AbstractC9968d.m17240a(this));
    }

    @Override // android.app.Application
    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final C9839d m24753componentManager() {
        return this.componentManager;
    }
}
