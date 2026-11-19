package android.view.compose;

import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import androidx.compose.runtime.State;
import coil3.C3333r;
import com.zykj.mistake.utils.C5100e;
import kotlin.jvm.internal.AbstractC5830k;
import p140q.C6401e;
import p167t4.C6595h;
import p175u4.C6620g;

/* renamed from: androidx.lifecycle.compose.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2755f implements LifecycleEventObserver {

    /* renamed from: a */
    public final /* synthetic */ int f1147a;

    /* renamed from: b */
    public final /* synthetic */ Object f1148b;

    /* renamed from: c */
    public final /* synthetic */ Object f1149c;

    public /* synthetic */ C2755f(int i, Object obj, Object obj2) {
        this.f1147a = i;
        this.f1148b = obj;
        this.f1149c = obj2;
    }

    @Override // android.view.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C6401e c6401eM2277d;
        switch (this.f1147a) {
            case 0:
                LifecycleEffectKt.LifecycleEventEffect$lambda$4$lambda$3$lambda$1((Lifecycle.Event) this.f1148b, (State) this.f1149c, lifecycleOwner, event);
                return;
            default:
                String ownerId = (String) this.f1148b;
                C6620g c6620g = (C6620g) this.f1149c;
                AbstractC5830k.m5330g(lifecycleOwner, "<unused var>");
                AbstractC5830k.m5330g(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    synchronized (C5100e.f8035a) {
                        try {
                            AbstractC5830k.m5330g(ownerId, "ownerId");
                            if (AbstractC5830k.m5325b(C5100e.f8036b, ownerId)) {
                                C3333r c3333r = C5100e.f8037c;
                                if (c3333r != null && (c6401eM2277d = c3333r.m2277d()) != null) {
                                    c6401eM2277d.m6067a();
                                }
                                C5100e.f8037c = null;
                                C5100e.f8036b = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    C6595h.f11010a.m6229a(c6620g.f11083l);
                    return;
                }
                return;
        }
    }
}
