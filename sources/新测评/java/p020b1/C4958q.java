package p020b1;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p073e1.InterfaceC7325b;
import p117i1.AbstractC7652k;

/* renamed from: b1.q */
/* loaded from: classes3.dex */
public class C4958q {

    /* renamed from: a */
    public final Set f2375a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final Set f2376b = new HashSet();

    /* renamed from: c */
    public boolean f2377c;

    /* renamed from: a */
    public boolean m2352a(InterfaceC7325b interfaceC7325b) {
        boolean z9 = true;
        if (interfaceC7325b == null) {
            return true;
        }
        boolean zRemove = this.f2375a.remove(interfaceC7325b);
        if (!this.f2376b.remove(interfaceC7325b) && !zRemove) {
            z9 = false;
        }
        if (z9) {
            interfaceC7325b.clear();
        }
        return z9;
    }

    /* renamed from: b */
    public void m2353b() {
        Iterator it = AbstractC7652k.m12694j(this.f2375a).iterator();
        while (it.hasNext()) {
            m2352a((InterfaceC7325b) it.next());
        }
        this.f2376b.clear();
    }

    /* renamed from: c */
    public void m2354c() {
        this.f2377c = true;
        for (InterfaceC7325b interfaceC7325b : AbstractC7652k.m12694j(this.f2375a)) {
            if (interfaceC7325b.isRunning() || interfaceC7325b.isComplete()) {
                interfaceC7325b.clear();
                this.f2376b.add(interfaceC7325b);
            }
        }
    }

    /* renamed from: d */
    public void m2355d() {
        this.f2377c = true;
        for (InterfaceC7325b interfaceC7325b : AbstractC7652k.m12694j(this.f2375a)) {
            if (interfaceC7325b.isRunning()) {
                interfaceC7325b.pause();
                this.f2376b.add(interfaceC7325b);
            }
        }
    }

    /* renamed from: e */
    public void m2356e() {
        for (InterfaceC7325b interfaceC7325b : AbstractC7652k.m12694j(this.f2375a)) {
            if (!interfaceC7325b.isComplete() && !interfaceC7325b.mo3721f()) {
                interfaceC7325b.clear();
                if (this.f2377c) {
                    this.f2376b.add(interfaceC7325b);
                } else {
                    interfaceC7325b.mo3725j();
                }
            }
        }
    }

    /* renamed from: f */
    public void m2357f() {
        this.f2377c = false;
        for (InterfaceC7325b interfaceC7325b : AbstractC7652k.m12694j(this.f2375a)) {
            if (!interfaceC7325b.isComplete() && !interfaceC7325b.isRunning()) {
                interfaceC7325b.mo3725j();
            }
        }
        this.f2376b.clear();
    }

    /* renamed from: g */
    public void m2358g(InterfaceC7325b interfaceC7325b) {
        this.f2375a.add(interfaceC7325b);
        if (!this.f2377c) {
            interfaceC7325b.mo3725j();
            return;
        }
        interfaceC7325b.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f2376b.add(interfaceC7325b);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f2375a.size() + ", isPaused=" + this.f2377c + "}";
    }
}
