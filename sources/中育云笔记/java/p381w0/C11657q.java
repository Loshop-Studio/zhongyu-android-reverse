package p381w0;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p109d1.AbstractC8910k;
import p428z0.InterfaceC11953b;

/* renamed from: w0.q */
/* loaded from: classes3.dex */
public class C11657q {

    /* renamed from: a */
    public final Set f27667a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final Set f27668b = new HashSet();

    /* renamed from: c */
    public boolean f27669c;

    /* renamed from: a */
    public boolean m25781a(InterfaceC11953b interfaceC11953b) {
        boolean z10 = true;
        if (interfaceC11953b == null) {
            return true;
        }
        boolean zRemove = this.f27667a.remove(interfaceC11953b);
        if (!this.f27668b.remove(interfaceC11953b) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            interfaceC11953b.clear();
        }
        return z10;
    }

    /* renamed from: b */
    public void m25782b() {
        Iterator it = AbstractC8910k.m17479j(this.f27667a).iterator();
        while (it.hasNext()) {
            m25781a((InterfaceC11953b) it.next());
        }
        this.f27668b.clear();
    }

    /* renamed from: c */
    public void m25783c() {
        this.f27669c = true;
        for (InterfaceC11953b interfaceC11953b : AbstractC8910k.m17479j(this.f27667a)) {
            if (interfaceC11953b.isRunning() || interfaceC11953b.isComplete()) {
                interfaceC11953b.clear();
                this.f27668b.add(interfaceC11953b);
            }
        }
    }

    /* renamed from: d */
    public void m25784d() {
        this.f27669c = true;
        for (InterfaceC11953b interfaceC11953b : AbstractC8910k.m17479j(this.f27667a)) {
            if (interfaceC11953b.isRunning()) {
                interfaceC11953b.pause();
                this.f27668b.add(interfaceC11953b);
            }
        }
    }

    /* renamed from: e */
    public void m25785e() {
        for (InterfaceC11953b interfaceC11953b : AbstractC8910k.m17479j(this.f27667a)) {
            if (!interfaceC11953b.isComplete() && !interfaceC11953b.mo4366e()) {
                interfaceC11953b.clear();
                if (this.f27669c) {
                    this.f27668b.add(interfaceC11953b);
                } else {
                    interfaceC11953b.mo4369h();
                }
            }
        }
    }

    /* renamed from: f */
    public void m25786f() {
        this.f27669c = false;
        for (InterfaceC11953b interfaceC11953b : AbstractC8910k.m17479j(this.f27667a)) {
            if (!interfaceC11953b.isComplete() && !interfaceC11953b.isRunning()) {
                interfaceC11953b.mo4369h();
            }
        }
        this.f27668b.clear();
    }

    /* renamed from: g */
    public void m25787g(InterfaceC11953b interfaceC11953b) {
        this.f27667a.add(interfaceC11953b);
        if (!this.f27669c) {
            interfaceC11953b.mo4369h();
            return;
        }
        interfaceC11953b.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f27668b.add(interfaceC11953b);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f27667a.size() + ", isPaused=" + this.f27669c + "}";
    }
}
