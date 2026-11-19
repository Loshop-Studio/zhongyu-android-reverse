package p160u0;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p016b1.AbstractC4409k;
import p181x0.InterfaceC7824b;

/* renamed from: u0.q */
/* loaded from: classes3.dex */
public class C7764q {

    /* renamed from: a */
    public final Set f10265a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final Set f10266b = new HashSet();

    /* renamed from: c */
    public boolean f10267c;

    /* renamed from: a */
    public boolean m9279a(InterfaceC7824b interfaceC7824b) {
        boolean z6 = true;
        if (interfaceC7824b == null) {
            return true;
        }
        boolean zRemove = this.f10265a.remove(interfaceC7824b);
        if (!this.f10266b.remove(interfaceC7824b) && !zRemove) {
            z6 = false;
        }
        if (z6) {
            interfaceC7824b.clear();
        }
        return z6;
    }

    /* renamed from: b */
    public void m9280b() {
        Iterator it = AbstractC4409k.m1449j(this.f10265a).iterator();
        while (it.hasNext()) {
            m9279a((InterfaceC7824b) it.next());
        }
        this.f10266b.clear();
    }

    /* renamed from: c */
    public void m9281c() {
        this.f10267c = true;
        for (InterfaceC7824b interfaceC7824b : AbstractC4409k.m1449j(this.f10265a)) {
            if (interfaceC7824b.isRunning() || interfaceC7824b.isComplete()) {
                interfaceC7824b.clear();
                this.f10266b.add(interfaceC7824b);
            }
        }
    }

    /* renamed from: d */
    public void m9282d() {
        this.f10267c = true;
        for (InterfaceC7824b interfaceC7824b : AbstractC4409k.m1449j(this.f10265a)) {
            if (interfaceC7824b.isRunning()) {
                interfaceC7824b.pause();
                this.f10266b.add(interfaceC7824b);
            }
        }
    }

    /* renamed from: e */
    public void m9283e() {
        for (InterfaceC7824b interfaceC7824b : AbstractC4409k.m1449j(this.f10265a)) {
            if (!interfaceC7824b.isComplete() && !interfaceC7824b.mo2900e()) {
                interfaceC7824b.clear();
                if (this.f10267c) {
                    this.f10266b.add(interfaceC7824b);
                } else {
                    interfaceC7824b.mo2904i();
                }
            }
        }
    }

    /* renamed from: f */
    public void m9284f() {
        this.f10267c = false;
        for (InterfaceC7824b interfaceC7824b : AbstractC4409k.m1449j(this.f10265a)) {
            if (!interfaceC7824b.isComplete() && !interfaceC7824b.isRunning()) {
                interfaceC7824b.mo2904i();
            }
        }
        this.f10266b.clear();
    }

    /* renamed from: g */
    public void m9285g(InterfaceC7824b interfaceC7824b) {
        this.f10265a.add(interfaceC7824b);
        if (!this.f10267c) {
            interfaceC7824b.mo2904i();
            return;
        }
        interfaceC7824b.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f10266b.add(interfaceC7824b);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f10265a.size() + ", isPaused=" + this.f10267c + "}";
    }
}
